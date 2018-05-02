package pe.edu.upc.administradorapp.models;

/**
 * Created by RAMOS on 01/05/2018.
 */

public class Period {

    private   int  id_period;
    private  String   description;


    public Period(int id_period, String description) {
        this.id_period = id_period;
        this.description = description;
    }


    public int getId_period() {
        return id_period;
    }

    public Period setId_period(int id_period) {
        this.id_period = id_period;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Period setDescription(String description) {
        this.description = description;
        return this;
    }




}
