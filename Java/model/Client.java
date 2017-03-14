
package model;

import java.util.Date;

public class Client {
 private String fio;
 private Passport dannie;
 private Date zaselenie;
 private Date viezda;
 private Nomer   nomer;
 private Usluga usluga1;
 private Usluga usluga2;
 private Usluga usluga3;
 private Float stoimost;
 private Sotrudnik sotrudnik;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Passport getDannie() {
        return dannie;
    }

    public void setDannie(Passport dannie) {
        this.dannie = dannie;
    }

    public Date getZaselenie() {
        return zaselenie;
    }

    public void setZaselenie(Date zaselenie) {
        this.zaselenie = zaselenie;
    }

    public Date getViezda() {
        return viezda;
    }

    public void setViezda(Date viezda) {
        this.viezda = viezda;
    }

    public Nomer getNomer() {
        return nomer;
    }

    public void setNomer(Nomer nomer) {
        this.nomer = nomer;
    }

    public Usluga getUsluga1() {
        return usluga1;
    }

    public void setUsluga1(Usluga usluga1) {
        this.usluga1 = usluga1;
    }

    public Usluga getUsluga2() {
        return usluga2;
    }

    public void setUsluga2(Usluga usluga2) {
        this.usluga2 = usluga2;
    }

    public Usluga getUsluga3() {
        return usluga3;
    }

    public void setUsluga3(Usluga usluga3) {
        this.usluga3 = usluga3;
    }

    public Float getStoimost() {
        return stoimost;
    }

    public void setStoimost(Float stoimost) {
        this.stoimost = stoimost;
    }

    public Sotrudnik getSotrudnik() {
        return sotrudnik;
    }

    public void setSotrudnik(Sotrudnik sotrudnik) {
        this.sotrudnik = sotrudnik;
    }

    @Override
    public String toString() {
        return fio +" "+  dannie +" "+  nomer ;
    }

    
    }

