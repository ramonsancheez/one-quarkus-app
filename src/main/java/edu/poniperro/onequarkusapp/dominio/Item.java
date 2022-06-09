package edu.poniperro.onequarkusapp.dominio;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_items")
public class Item extends PanacheEntityBase {
    @Id
    @Column(name = "item_nom")
    private String nombre;
    @Column(name = "item_prop")
    private Integer quality;
    @Column(name = "item_tipo")
    private String tipo;

    public Item() {
    }

    public Item(String nombre, Integer quality, String tipo) {
        this.nombre = nombre;
        this.quality = quality;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
