package edu.poniperro.onequarkusapp.dominio;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_users")
public class Usuaria extends PanacheEntityBase {
    @Id
    @Column(name = "user_nom")
    private String nombre;
    @Column(name = "user_prop")
    private Integer destreza;

    public Usuaria() {
    }

    public Usuaria(String nombre, Integer destreza) {
        this.nombre = nombre;
        this.destreza = destreza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setdestreza(Integer prop) {
        this.destreza = destreza;
    }

}
