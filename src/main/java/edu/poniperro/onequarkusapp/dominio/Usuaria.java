package edu.poniperro.onequarkusapp.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_users")
public class Usuaria {
    @Id
    @Column(name = "user_nom")
    private String nombre;
    @Column(name = "user_prop")
    private Integer destreza;

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
