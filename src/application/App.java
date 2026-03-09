package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contratos;
import entities.Trabalhador;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.now();

        System.out.print("Enter worker data [dd/MM/yyyy]: ");
        String dataContrato = sc.nextLine();
        date = LocalDate.parse(dataContrato, sdf);

        Trabalhador trabalhador = new Trabalhador("Maria", entities.Cargo.JUNIOR, 1200.00,
                new Contratos(1, date, 1500.0, 7));

        trabalhador.getContratos();

        trabalhador.removeContratos(1);

        trabalhador.getContratos();

        System.out.println("s");
        sc.close();
    }
}
