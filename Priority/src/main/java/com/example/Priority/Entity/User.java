package com.example.Priority.Entity;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Connection")
    private int conn;
    @Column(name = "Relationship")
    private int rela;
    @Column(name = "Career")
    private int carr;
    @Column(name = "Wealth")
    private int wlt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConn() {
        return conn;
    }

    public void setConn(int conn) {
        conn = conn;
    }

    public int getRela() {
        return rela;
    }

    public void setRela(int rela) {
        rela = rela;
    }

    public int getCarr() {
        return carr;
    }

    public void setCarr(int carr) {
        carr = carr;
    }

    public int getWlt() {
        return rela;
    }

    public void setWlt(int wlt) {
        rela = wlt;
    }

    public User(String name, int conn, int rela, int carr, int wlt) {
        this.name = name;
        conn = conn;
        rela = rela;
        carr = carr;
        wlt = wlt;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", Conn=" + conn +
                ", Rela=" + rela +
                ", Carr=" + carr +
                ", Wlt=" + wlt +
                '}';
    }
}
