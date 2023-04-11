package com.donaciones.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "alimentos")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alimento")
    private Integer idFood;
    @Column(name = "id_usuario")
    private Integer idPerson;
    @Column(name = "nombre_alimento")
    private String  nameFood;
    @Column(name = "descripcion")
    private String  description;
    @Column(name = "cantidad")
    private Integer quantity;
    @Column(name = "fecha_donacion")
    private LocalDateTime donationDate;
    @Column(name = "fecha_vencimiento")
    private LocalDateTime expirationDate;
    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Person personF;

    public Integer getIdFood() {
        return idFood;
    }

    public void setIdFood(Integer idFood) {
        this.idFood = idFood;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
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

    public LocalDateTime getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(LocalDateTime donationDate) {
        this.donationDate = donationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Person getPersonF() {
        return personF;
    }

    public void setPersonF(Person personF) {
        this.personF = personF;
    }
}
