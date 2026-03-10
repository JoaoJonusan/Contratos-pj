package entities;

import java.util.ArrayList;
import java.util.List;

import services.TrabalhadorServices;

public class Trabalhador{
    private String name;
    private double salarioBase;
    private Cargo cargo;
    private List<Contratos> contratos = new ArrayList<>();

    //Construtor
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

	public List<Contratos> getContratos() {
		return contratos;
	}
}
