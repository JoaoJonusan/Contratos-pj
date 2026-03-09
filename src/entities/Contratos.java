package entities;

import java.time.LocalDate;


public class Contratos {
    private Integer id;
    private LocalDate date;
    private Double valorHora;
    private Integer horas;

    public Contratos(Integer id, LocalDate date, Double valorHora, Integer horas) {
        this.id = id;
        this.date = date;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public double totalValor() {
        return valorHora * horas;
    }

    public String toString() {
        return "Contratos [id=" + id + ", date=" + date + ", valorHora=" + valorHora + ", horas=" + horas + "]";
    }
}
