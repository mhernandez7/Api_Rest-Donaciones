package com.donaciones.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "juguetes")
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_juguete")
    private Integer idToy;
    @Column(name = "id_usuario")
    private Integer idPerson;
    @Column(name = "nombre_juguete")
    private String toyName;
    @Column(name="descripcion")
    private String description;
    @Column(name ="cantidad")
    private Integer quantity;
    @Column(name ="fecha_donacion")
    private LocalDateTime dateDonation;
    @ManyToOne
    @JoinColumn(name ="id_usuario", insertable = false, updatable = false)
    private Person person;

    public Integer getIdToy() {
        return idToy;
    }

    public void setIdToy(Integer idToy) {
        this.idToy = idToy;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
