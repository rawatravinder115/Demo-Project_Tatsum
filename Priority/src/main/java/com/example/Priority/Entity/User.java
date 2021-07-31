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
    private int Conn;
    @Column(name = "Relationship")
    private int Rela;
    @Column(name = "Career")
    private int Carr;
    @Column(name = "Wealth")
    private int Wlt;


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
        return Conn;
    }

    public void setConn(int conn) {
        Conn = conn;
    }

    public int getRela() {
        return Rela;
    }

    public void setRela(int rela) {
        Rela = rela;
    }

    public int getCarr() {
        return Carr;
    }

    public void setCarr(int carr) {
        Carr = carr;
    }

    public int getWlt() {
        return Wlt;
    }

    public void setWlt(int wlt) {
        Wlt = wlt;
    }

    public User(String name, int conn, int rela, int carr, int wlt) {
        this.name = name;
        Conn = conn;
        Rela = rela;
        Carr = carr;
        Wlt = wlt;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", Conn=" + Conn +
                ", Rela=" + Rela +
                ", Carr=" + Carr +
                ", Wlt=" + Wlt +
                '}';
    }
}
