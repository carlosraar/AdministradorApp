package pe.edu.upc.administradorapp.models;

/**
 * Created by RAMOS on 01/05/2018.
 */

public class Permission {


    private int id_permission;
    private String phone;
    private int type;
    private String numberDepartament;

    public Permission() {
    }

    public Permission(int id_permission, String phone, int type, String numberDepartament) {
        this.id_permission = id_permission;
        this.phone = phone;
        this.type = type;
        this.numberDepartament = numberDepartament;
    }


    public int getId_permission() {
        return id_permission;
    }

    public Permission setId_permission(int id_permission) {
        this.id_permission = id_permission;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Permission setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public int getType() {
        return type;
    }

    public Permission setType(int type) {
        this.type = type;
        return this;
    }

    public String getNumberDepartament() {
        return numberDepartament;
    }

    public Permission setNumberDepartament(String numberDepartament) {
        this.numberDepartament = numberDepartament;
        return this;
    }
}
