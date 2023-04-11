package com.donaciones.domain;

import java.time.LocalDateTime;

public class ClothesDto {

    private int idClothes;
    private int idPerson;
    private String clothesName;
    private String description;
    private String quantity;
    private LocalDateTime dateDonation;
    private PersonDto personDto;

    public int getIdClothes() {
        return idClothes;
    }

    public void setIdClothes(int idClothes) {
        this.idClothes = idClothes;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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
