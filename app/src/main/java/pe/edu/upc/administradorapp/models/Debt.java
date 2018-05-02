package pe.edu.upc.administradorapp.models;

/**
 * Created by RAMOS on 01/05/2018.
 */

public class Debt {

    private int id_debt;
    private Period period;
    private Department department;

    public Debt(int id_debt, Period period, Department department) {
        this.id_debt = id_debt;
        this.period = period;
        this.department = department;
    }

    public Debt() {
    }

    public int getId_debt() {
        return id_debt;
    }

    public Debt setId_debt(int id_debt) {
        this.id_debt = id_debt;
        return this;
    }

    public Period getPeriod() {
        return period;
    }

    public Debt setPeriod(Period period) {
        this.period = period;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Debt setDepartment(Department department) {
        this.department = department;
        return this;
    }



}
