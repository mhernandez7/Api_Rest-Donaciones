package com.donaciones.domain;

public class PersonDto {

    private int idPerson;
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String addresDto;

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
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

    public String getAddresDto() {
        return addresDto;
    }

    public void setAddresDto(String addresDto) {
        this.addresDto = addresDto;
    }
}
