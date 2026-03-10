package services;

import entities.Contratos;
import entities.Trabalhador;

public class TrabalhadorServices{
	
	public void addContratos(Trabalhador trabalhador, Contratos contratos) {
        trabalhador.getContratos().add(contratos);
    }

    public void removeContratos(Trabalhador trabalhador, int id) {
        trabalhador.getContratos().removeIf(contratos -> contratos.getId() == id);
    }

    public void getContratos(Trabalhador trabalhador) {
        for (Contratos contratos2 : trabalhador.getContratos()) {
            System.out.println(contratos2);
        }
    }

    public double salarioMes(Trabalhador trabalhador, int mes){
        double soma = 0;
        for (Contratos contratos2 : trabalhador.getContratos()) {
            if (contratos2.getDate().getMonthValue() + 1 == mes) {
                soma += contratos2.totalValor();
            }
        }
        return soma;
    }
}
