package model;

public class Nomer {

    private Integer id;
    private String naimenovanie;
    private Integer vmestimost;
    private String opisanie;
    private Float stoimist;
    private Sotrudnik sotrudnik;

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

    public Integer getVmestimost() {
        return vmestimost;
    }

    public void setVmestimost(Integer vmestimost) {
        this.vmestimost = vmestimost;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Float getStoimist() {
        return stoimist;
    }

    public void setStoimist(Float stoimist) {
        this.stoimist = stoimist;
    }

    public Sotrudnik getSotrudnik() {
        return sotrudnik;
    }

    public void setSotrudnik(Sotrudnik sotrudnik) {
        this.sotrudnik = sotrudnik;
    }

    @Override
    public String toString() {
        return vmestimost + " " + stoimist;
    }

}
