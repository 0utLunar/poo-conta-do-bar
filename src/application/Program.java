package application;


import entities.Bill;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.print("Sexo: ");
        char genero = Character.toUpperCase(sc.nextLine().charAt(0));
        while (genero != 'F' && genero != 'M') {
            System.out.print("Insira uma opção válida (F ou M): ");
            genero = Character.toUpperCase(sc.nextLine().charAt(0));
        }
        bill.gender = genero;
        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();

        System.out.println("");
        System.out.println("RELATÓRIO");
        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
        System.out.printf("Couvert = R$ %.2f%n", bill.cover());
        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());

        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f", bill.total());

        sc.close();

    }

}
