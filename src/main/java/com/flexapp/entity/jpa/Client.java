package com.flexapp.entity.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Client")
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "CLIENT_ID")
    private int clientId;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "HASHTAGS")
    private String hashtags;

    @Column(name = "BIRTHDATE")
    private Date birthdate;

    @Column(name = "GENDER")
    private String gender;

    public Client() {
        super();
    }

    public Client(String login, String password, String firstName, String lastName, String hashtags, Date birthdate) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hashtags = hashtags;
        this.birthdate = birthdate;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
