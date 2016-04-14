package com.springapp.mvc.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by dulik on 12.04.2016.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "city")
    private String city;
    @Column(name = "age")
    private int age;
    @Column(name = "user", nullable = false)
    private String user;
    @Column(name = "pass", nullable = false)
    private String pass;
//    @OneToMany(orphanRemoval = true, mappedBy = "user", cascade = {CascadeType.REMOVE}, fetch = FetchType.EAGER)
//    private Set<UserRole> userRoles;

    public User(String firstName, String lastName, String city, int age, String user, String pass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
        this.user = user;
        this.pass = pass;
//        this.userRoles.add(new UserRole());
    }

//    public Set<UserRole> getUserRoles() {
//        return userRoles;
//    }
//
//    public void setUserRoles(Set<UserRole> userRoles) {
//        this.userRoles = userRoles;
//    }

    public User(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
