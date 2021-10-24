package BASIC.Additional_Problems_MIX.ExamPrepJuly20;

import java.util.Scanner;

public class AluminiumJoinery_03 {
    public static void main(String[] args) {              // 72/100
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();     // текст "90X130" или "100X150" или "130X180" или "200X300";
        String delivery = scanner.nextLine();  //  "With delivery" or  "Without delivery"
        double price = 0;
        double total = 0;

        switch (type) {
            case "90X130":
                price = 110;
                total = price * count;
                if (count > 30 && count <= 60) {
                    total = total * 0.95;
                } else if (count > 60) {
                    total = total * 0.92;
                }
                break;
            case "100X150":
                price = 140;
                total = price * count;
                if (count > 40 && count <= 80) {
                    total = total * 0.94;
                } else if (count > 80) {
                    total = total * 0.90;
                }
                break;
            case "130X180":
                price = 190;
                total = price * count;
                if (count > 20 && count <= 50) {
                    total = total * 0.93;
                } else if (count > 50) {
                    total = total * 0.88;
                }
                break;
            case "200X300":
                price = 250;
                total = price * count;
                if (count > 25 && count <= 50) {
                    total = total * 0.91;
                } else if (count > 50) {
                    total = total * 0.86;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            total += 60;
        }
        if (count > 99) {
            total = total * 0.96;
        }
        if (count < 10) {
            System.out.println("Invalid order");
        }
        if (count >= 10) {
            System.out.printf("%.2f BGN", total);
        }


    }
}
