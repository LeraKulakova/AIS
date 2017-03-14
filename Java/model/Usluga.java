package model;

public class Usluga {

    private Integer id;
    private String naimenovanie;
    private String opisanie;
    private Float stoimost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaimenovanie() {
        return naimenovanie;
    }

    public void setNaimenovanie(String naimenovanie) {
        this.naimenovanie = naimenovanie;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Float getStoimost() {
        return stoimost;
    }

    public void setStoimost(Float stoimost) {
        this.stoimost = stoimost;
    }

    @Override
    public String toString() {
        return id + " " + naimenovanie + " " + opisanie + " " + stoimost;
    }

}
