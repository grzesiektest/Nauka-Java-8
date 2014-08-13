package com.nauka.java_8;

/**
 *
 * @author Grzegorz
 */
class Employee {

    private String imie;
    private String nazwisko;
    private Integer wyplata;

    public Employee(String imie, String nazwisko, Integer wyplata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getWyplata() {
        return wyplata;
    }

    public void setWyplata(Integer wyplata) {
        this.wyplata = wyplata;
    }

    @Override
    public String toString() {
        return "Employee{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wyplata=" + wyplata + '}';
    }
}
