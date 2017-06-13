package com.github.xenteros.dto;

/**
 * Created by agurgul on 13.06.2017.
 */
public class StudentDTO {

    private String uuid;

    private String firstName;

    private String lastName;

    public StudentDTO() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
}
