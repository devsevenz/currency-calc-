import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String input1;
        double output = 0.0;
        boolean choice = true;

        System.out.println("PHP TO USD CONVERTER! ");

        do {
            //input
            System.out.print("Select the currency you want to convert: (PHP,USD): ");
            input1 = sc.nextLine().toLowerCase();

            if (!input1.matches("php|usd")) {
                System.out.println("Please enter a valid input!");
                continue;
            }


            System.out.print("Enter Amount: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid input!");
                sc.next();
            }
            int amount = sc.nextInt();

            // Process
            if (input1.equals("php")) {
                output = amount * 45.25;
            } else {
                output = amount * 0.017;
            }

           //output
            System.out.println("Converted amount: " + output);

            //loop
            System.out.print("Do you want to convert again? (y/n): ");
            choice = sc.next().toLowerCase().equals("y");
            sc.nextLine();

        } while (choice);

    }
}