package Model;

import java.time.Period;
import java.io.*;
import java.time.LocalDate;

public class Animal implements Serializable {
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String orders;
    private String status;

    public Animal(String name, Gender gender, LocalDate dateOfBirth, String orders, String status) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.orders = orders;
        this.status = status;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Имя - " + name +
                ", пол - " + gender +
                ", дата рождения - " + dateOfBirth.toString() +
                ", команды - " + orders.toString() +
                ", тип животного - " + status.toString();
    }

    public String getDob() {
        return dateOfBirth.toString();
    }

    public int getAge() {
            return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(LocalDate date) {
        this.dateOfBirth = date;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
