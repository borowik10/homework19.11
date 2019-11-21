package Pawel_HM;

import java.lang.String;
import java.util.Scanner;

public class User {
    private String name;
    private String lastName;
    private String fullName;
    private String job;
    private String salary;
    private String genderName;
    private String pesel1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz imię: ");
        String name = in.nextLine();
        System.out.println("Wpisz nazwisko: ");
        String lastName = in.nextLine();
        System.out.println("Wpisz Stanowisko: ");
        String job = in.nextLine();
        System.out.println("Wpisz pensje: ");
        String salary = in.nextLine();
        System.out.println("Wpisz płeć: K/M");
        char gender = in.nextLine().toUpperCase().charAt(0);
        while (!(gender == 'K' || gender == 'M')) {
            System.out.println("Zły wybór");
            System.out.println("Spróbuj jeszcze raz, wybierz K-kobieta lub M-mężczyzna");
            gender = in.nextLine().toUpperCase().charAt(0);
        }
        if (gender == 'M') {
            String genderName = "Mężczyzna";
        } else {
            String genderName = "Kobieta";
        }
        System.out.println("Pesel: ");
        String pesel1 = in.nextLine();
        while (pesel1.length() != 11);{
            System.out.println("Błąd niepoprawne dane");
            System.out.println("Wprowadź jeszcze raz: ");
            pesel1 = in.nextLine();}
        System.out.printf("Dane: \n Imię: %s\n Nazwisko: $s\n Stanowisko: %s\n Pensja: %s\n Płeć: %s\n Pesel: %s",
                name, lastName, job, salary, gender, pesel1);


    }

        }











