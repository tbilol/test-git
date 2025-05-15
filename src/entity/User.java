package entity;

import java.util.UUID;

public class User {

    private final UUID userID = UUID.randomUUID();
    private String name;
    private String surname;
    private String email;
    private Integer password;

    public User() {
    }

    public User(String name, String surname, String email, Integer password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public UUID getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
               "userID=" + userID +
               ", name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", email='" + email + '\'' +
               ", password=" + password +
               '}';
    }
}
