package BASIC.Additional_Problems_MIX.ExamPrepJuly20;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();   //символ ('m' за мъж и 'f' за жена)
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double cardPrice = 0;   // !! double

        switch (gender) {
            case "m":
                switch (sport) {
                    case "Gym":
                        cardPrice = 42;
                        break;
                    case "Boxing":
                        cardPrice = 41;
                        break;
                    case "Yoga":
                        cardPrice = 45;
                        break;
                    case "Zumba":
                        cardPrice = 34;
                        break;
                    case "Dances":
                        cardPrice = 51;
                        break;
                    case "Pilates":
                        cardPrice = 39;
                        break;
                }
                break;
            case "f":
                switch (sport) {
                    case "Gym":
                        cardPrice = 35;
                        break;
                    case "Boxing":
                    case "Pilates":
                        cardPrice = 37;
                        break;
                    case "Yoga":
                        cardPrice = 42;
                        break;
                    case "Zumba":
                        cardPrice = 31;
                        break;
                    case "Dances":
                        cardPrice = 53;
                        break;
                }
                break;
        }
        if (age<=19){
            cardPrice*=0.80;
        }
        if (sum>=cardPrice){
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }
        else {
            System.out.printf("You don't have enough money! You need $%.2f more.",Math.abs(sum-cardPrice));
        }

    }
}
