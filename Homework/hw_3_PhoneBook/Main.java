package Homework.hw_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;



public class Main {
    private static final int fields_number = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println();
        System.out.println("Введите данные в следующем формате: Фамилия Имя Отчество датарождения номертелефона пол (через пробел)");
        System.out.println();
        String input = scanner.nextLine();
        scanner.close();
        

        String[] fields = input.split(" ");
        if(fields.length != fields_number) {
            System.err.println("Неверное количество полей, вы ввели " + fields.length +". Введите 6 полей!");
            System.out.println();
        }
        String lastName = fields[0];
        String firstName = fields[1];
        String middleName = fields[2];

        LocalDate birthDate;
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(fields[3], formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты. Введите строку формата dd.MM.yyyy!");
            System.out.println();
            return;
        }

        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(fields[4]);
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Неверный формат телефона. Введите целое число без знаков!");
            System.out.println();
            return;
        }

        String gender = fields[5];
        if ((!"m".equals(gender)) && !"f".equals(gender)) {
            System.err.println("Неверный формат пола, введите f или m!");
            System.out.println();
            return;
        }

        String fileName = lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + phoneNumber + " " + gender);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи!");

        }
        }
      
 }


        
      


