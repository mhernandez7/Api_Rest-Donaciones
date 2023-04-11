package com.donaciones.persistence.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "usuario_donante")
public class Person {

    @Id
    @Column(name = "id")
    private Integer idPerson;
    @Column(name = "nombre")
    private String firstName;
    @Column(name = "apellido")
    private String lastName;
    @Column(name = "contacto")
    private Long phoneNumber;
    @Column(name = "correo")
    private String addres;

    @OneToMany(mappedBy = "person")
    private List<Toy> toys;

    @OneToMany(mappedBy = "personF")
    private List<Food> foods;

    @OneToMany(mappedBy = "personB")
    private List<Book> books;

    @OneToMany(mappedBy = "personC")
    private List<Clothes> clothess;

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }
    public List<Food> getFoods (){
        return foods;
    }
    public void setFoods (List<Food> foods){
        this.foods = foods;
    }

    public List<Book> getBooks() {return books;}

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Clothes> getClothess() {return clothess;}

    public void setClothess(List<Clothes> clothess) {this.clothess = clothess;}
}
