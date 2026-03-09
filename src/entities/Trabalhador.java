package entities;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador{
    private String name;
    private double salarioBase;
    private Cargo cargo;
    private List<Contratos> contratos = new ArrayList<>();

    //Construtores
    public Trabalhador() {
    }

    public Trabalhador(String name, Cargo cargo, double salarioBase) {
        this.name = name;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public Trabalhador(String name, Cargo cargo, double salarioBase, Contratos contratos) {
        this.name = name;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.contratos.add(contratos);
    }

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    //Métodos
    public void addContratos(Contratos contratos) {
        this.contratos.add(contratos);
    }

    public void removeContratos(int id) {
        this.contratos.removeIf(contratos -> contratos.getId() == id);
    }

    public void getContratos() {
        for (Contratos contratos2 : this.contratos) {
            System.out.println(contratos2);
        }
    }

    public double salarioMes(int mes){
        double soma = 0;
        for (Contratos contratos2 : this.contratos) {
            if (contratos2.getDate().getMonthValue() + 1 == mes) {
                soma += contratos2.totalValor();
            }
        }
        return soma;
    }

}
