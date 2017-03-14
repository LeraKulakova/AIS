package model;

import java.util.Date;

class Passport {
    private Integer seriya;
    private Integer nomer;
    private Date vidachi;
    private String podrazdeleniya;

    public Integer getSeriya() {
        return seriya;
    }

    public void setSeriya(Integer seriya) {
        this.seriya = seriya;
    }

    public Integer getNomer() {
        return nomer;
    }

    public void setNomer(Integer nomer) {
        this.nomer = nomer;
    }

    public Date getVidachi() {
        return vidachi;
    }

    public void setVidachi(Date vidachi) {
        this.vidachi = vidachi;
    }

    public String getPodrazdeleniya() {
        return podrazdeleniya;
    }

    public void setPodrazdeleniya(String podrazdeleniya) {
        this.podrazdeleniya = podrazdeleniya;
    }

    @Override
    public String toString() {
        return seriya +" "+ nomer +" "+ vidachi;
    }

    
}
