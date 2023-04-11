package com.donaciones.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ropa")
public class Clothes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_ropa")
    private Integer idClothes;
    @Column(name="id_usuario")
    private Integer idPerson;
    @Column(name="nombre_prenda")
    private String  clothesName;
    @Column(name ="descripcion")
    private String description;
    @Column(name = "cantidad")
    private Integer quantity;
    @Column(name = "fecha_donacion")
    private LocalDateTime dateDonation;

    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Person personC;

    public Integer getIdClothes() {
        return idClothes;
    }

    public void setIdClothes(Integer idClothes) {
        this.idClothes = idClothes;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(LocalDateTime dateDonation) {
        this.dateDonation = dateDonation;
    }

    public Person getPersonC() {
        return personC;
    }

    public void setPersonC(Person personC) {
        this.personC = personC;
    }
}
