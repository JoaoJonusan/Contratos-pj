package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contratos;
import entities.Trabalhador;
import services.TrabalhadorServices;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.now();
        TrabalhadorServices serviceTrab	= new TrabalhadorServices();
        
        
        System.out.print("Enter worker data [dd/MM/yyyy]: ");
        String dataContrato = sc.nextLine();
        date = LocalDate.parse(dataContrato, sdf);

        Trabalhador trabalhador = new Trabalhador("Maria", entities.Cargo.JUNIOR, 1200.00);
        
        serviceTrab.addContratos(trabalhador, new Contratos(1, date, 1500.0, 7));
        serviceTrab.addContratos(trabalhador, new Contratos(2, date, 256.0, 7));
        serviceTrab.addContratos(trabalhador, new Contratos(47, date, 845.0, 7));
     
        serviceTrab.getContratos(trabalhador);

        System.out.println("------------------------------------------");
     
        serviceTrab.removeContratos(trabalhador, 2);
        
        serviceTrab.getContratos(trabalhador);
        sc.close();
    }
}
