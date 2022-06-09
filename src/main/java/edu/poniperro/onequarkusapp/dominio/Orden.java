package edu.poniperro.onequarkusapp.dominio;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "t_ordenes")
public class Orden extends PanacheEntityBase {
    @Id
    @Column(name = "ord_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "ord_user")
    private Usuaria user;
    @OneToOne
    @JoinColumn(name = "ord_item")
    private Item item;

    public Usuaria getUser() {
        return user;
    }

    public void setUser(Usuaria user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
