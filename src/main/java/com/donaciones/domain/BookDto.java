package com.donaciones.domain;

import java.time.LocalDateTime;

public class BookDto {

    private int idBook;
    private int idPerson;
    private String nameBook;
    private String description;
    private LocalDateTime dateDonation;
    private PersonDto personDto;

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateDonation() {
        return dateDonation;
    }

    public void setDateDonation(LocalDateTime timeDonation) {
        this.dateDonation = timeDonation;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
}
