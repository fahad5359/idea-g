package com.example.idea.g.logic;

import javax.persistence.*;

@Entity
@Table
public class Ischema {
    @Id
    @SequenceGenerator(name = "ideea", sequenceName = "ideea", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "ideea")
    private long id;
    private String nem;
    private String message;
    private String email;

    public Ischema(long id, String nem, String message, String email) {
        this.id = id;
        this.nem = nem;
        this.message = message;
        this.email = email;
    }

    public Ischema() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Ischema{" +
                "id=" + id +
                ", nem='" + nem + '\'' +
                ", message='" + message + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

