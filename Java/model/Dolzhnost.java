package model;

public class Dolzhnost {

    private Integer id;
    private String nazvanie;
    private Float oclad;
    private String obayzannosti;
    private String trebovaniay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public Float getOclad() {
        return oclad;
    }

    public void setOclad(Float oclad) {
        this.oclad = oclad;
    }

    public String getObayzannosti() {
        return obayzannosti;
    }

    public void setObayzannosti(String obayzannosti) {
        this.obayzannosti = obayzannosti;
    }

    public String getTrebovaniay() {
        return trebovaniay;
    }

    public void setTrebovaniay(String trebovaniay) {
        this.trebovaniay = trebovaniay;
    }

    @Override
    public String toString() {
        return nazvanie + " " + oclad + " " + obayzannosti + " " + trebovaniay;
    }

    public void getTrebovaniay(String gerString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
