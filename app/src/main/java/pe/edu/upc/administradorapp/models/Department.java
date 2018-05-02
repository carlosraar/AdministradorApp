package pe.edu.upc.administradorapp.models;

/**
 * Created by RAMOS on 01/05/2018.
 */

public class Department {


    private int id_departament;
    private String description;

    public Department(int id_departament, String description) {
        this.id_departament = id_departament;
        this.description = description;
    }


    public Department() {
    }

    public int getId_departament() {
        return id_departament;
    }

    public Department setId_departament(int id_departament) {
        this.id_departament = id_departament;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Department setDescription(String description) {
        this.description = description;
        return this;
    }


}
