package pe.edu.upc.administradorapp.models;

/**
 * Created by RAMOS on 01/05/2018.
 */

public class Service {

    private  int id_service;
    private  String  description;

    public Service() {
    }

    public Service(int id_service, String description) {
        this.id_service = id_service;
        this.description = description;
    }


    public int getId_service() {
        return id_service;
    }

    public Service setId_service(int id_service) {
        this.id_service = id_service;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Service setDescription(String description) {
        this.description = description;
        return this;
    }


}
