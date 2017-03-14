package model;

import java.util.Date;

public class Sotrudnik {
    private Integer id;
    private String fio;
    private Date rozhdenie;
    private Integer pol;
    private String telefon;
    private Passport passport;
    private Dolzhnost dolzhnost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getRozhdenie() {
        return rozhdenie;
    }

    public void setRozhdenie(Date rozhdenie) {
        this.rozhdenie = rozhdenie;
    }

    public Integer getPol() {
        return pol;
    }

    public void setPol(Integer pol) {
        this.pol = pol;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Dolzhnost getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(Dolzhnost dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    @Override
    public String toString() {
        return fio;
    }
}
