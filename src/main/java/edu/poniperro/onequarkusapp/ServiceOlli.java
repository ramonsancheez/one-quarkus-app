package edu.poniperro.onequarkusapp;

import edu.poniperro.onequarkusapp.dominio.Usuaria;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class ServiceOlli {
    public Usuaria cargaUsuaria(String nombre) {
        Optional<Usuaria> usuaria = Usuaria.findByIdOptional(nombre);
        return usuaria.isPresent() ? usuaria.get(): new Usuaria();
    }
}
