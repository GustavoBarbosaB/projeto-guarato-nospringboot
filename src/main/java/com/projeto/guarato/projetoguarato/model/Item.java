package com.projeto.guarato.projetoguarato.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_item")
    private int id;

    private String description;
    private float val;

    public Item() {

    }

    public Item(String desc, float val, int id) {
        this.description = description;
        this.val = val;
        this.id = id;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getVal() {
        return val;
    }

    public void setVal(float val) {
        this.val = val;
    }
}
