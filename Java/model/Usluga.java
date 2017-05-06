package model;
 
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Usluga { 

    private Integer id;
    private String naimenovanie;
    private String opisanie;
    private Float stoimost;
    
    private PropertyChangeSupport support  = new PropertyChangeSupport(this);
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer old = this.id;
         this.id = id;
        support.firePropertyChange("id", old, id);
    }

    public String getNaimenovanie() {
        return naimenovanie;   
    }

    public void setNaimenovanie(String naimenovanie) {
        String old = this.naimenovanie;
        this.naimenovanie = naimenovanie;
        support.firePropertyChange("naimenovanie", old, naimenovanie); 
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        String old = this.opisanie;
        this.opisanie = opisanie;
        support.firePropertyChange("opisanie", old, opisanie); 
    }

    public Float getStoimost() {
        return stoimost;
    }

    public void setStoimost(Float stoimost) {
        Float old = this.stoimost;
        this.stoimost = stoimost;
        support.firePropertyChange("stoimost",  old, stoimost); 
    }

    @Override
    public String toString() {
        return id + " " + naimenovanie + " " + opisanie + " " + stoimost;
    }


    public  void addPropertyChangeListener (PropertyChangeListener listener){
    support.addPropertyChangeListener(listener);
}
    public  void removePropertyChangeListener (PropertyChangeListener listener){
    support.removePropertyChangeListener(listener);
    }

    public String getNazvanie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}