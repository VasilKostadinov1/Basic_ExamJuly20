package BASIC.Additional_Problems_MIX.ExamPrepJuly20;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //int counter = 0;
        String maxName = "";
        int max = Integer.MIN_VALUE;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            //counter++;
            if (goals > max) {
                max = goals;       // max = ....
                maxName = name;    // maxName = ....
            }
            if (goals >= 10) {
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", maxName);   // maxName
        if (max >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        } else {
            System.out.printf("He has scored %d goals.", max);
        }
    }
}
