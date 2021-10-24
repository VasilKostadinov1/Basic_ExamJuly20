package BASIC.Additional_Problems_MIX.ExamPrepJuly20;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     // 90/100

        double priceOver20kg = Double.parseDouble(scanner.nextLine());
        double luggageKG = Double.parseDouble(scanner.nextLine());
        int daysTillTrip = Integer.parseInt(scanner.nextLine());
        int countLuggage = Integer.parseInt(scanner.nextLine());
        //double price = 0;

        if (luggageKG <= 10) {
            priceOver20kg = priceOver20kg * 0.20;
        } else if (luggageKG <= 20) {
            priceOver20kg=priceOver20kg*0.50;
        }
        if (daysTillTrip>30){
            priceOver20kg*=1.10;
        } else if (daysTillTrip>=7 && daysTillTrip<=30){
            priceOver20kg*=1.15;
        } else if (daysTillTrip<7){
            priceOver20kg*=1.40;
        }
        System.out.printf("The total price of bags is: %.2f lv.", countLuggage*priceOver20kg);


    }
}
