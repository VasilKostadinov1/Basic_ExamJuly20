package BASIC.Additional_Problems_MIX.ExamPrepJuly20;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String avioCompany = scanner.nextLine();
        int adult = Integer.parseInt(scanner.nextLine());
        int kid = Integer.parseInt(scanner.nextLine());
        double netPriceAdult = Double.parseDouble(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());

        double netPriceKid= netPriceAdult*0.30;
        double grossPriceAdult = netPriceAdult+fee;
        double grossPriceKid = netPriceKid+fee;
        double total =adult*grossPriceAdult+kid*grossPriceKid;
        double profit = total*0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",avioCompany,profit);

    }
}
