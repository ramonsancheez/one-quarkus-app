package edu.poniperro.onequarkusapp;

import edu.poniperro.onequarkusapp.dominio.Item;
import edu.poniperro.onequarkusapp.dominio.Usuaria;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class ServiceOlli {
    public Usuaria cargaUsuaria(String nombre) {
        Optional<Usuaria> usuaria = Usuaria.findByIdOptional(nombre);
        return usuaria.isPresent() ? usuaria.get(): new Usuaria("", 0);
    }
    public Item cargaItem(String nombre) {
        Optional<Item> item = Item.findByIdOptional(nombre);
        return item.isPresent() ? item.get(): new Item("", 0, "");

    }
}
