package com.donaciones.domain;

import java.time.LocalDateTime;

public class ToyDto {

    private int idToy;
    private int idPerson;
    private String toyName;
    private String description;
    private int quantityDto;

    private LocalDateTime dateDonation;
    private PersonDto personDto;

    public int getIdToy() {
        return idToy;
    }

    public void setIdToy(int idToy) {
        this.idToy = idToy;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
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

    public int getQuantityDto() {
        return quantityDto;
    }

    public void setQuantityDto(int quantityDto) {
        this.quantityDto = quantityDto;
    }

    public LocalDateTime getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(LocalDateTime dateDonation) {
        this.dateDonation = dateDonation;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
}
