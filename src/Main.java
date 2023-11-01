import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 = getInput(" Enter a numeric value: ");
        String s2 = getInput(" Enter a numeric value: ");
        String otp = getInput(" Choose an operation ( + - * / ): ");

        double result = 0;

        try {
            switch (otp) {
                case "+" -> result = addValues(s1, s2);
                case "-" -> result = subtractValues(s1, s2);
                case "*" -> result = multiplyValues(s1, s2);
                case "/" -> result = divideValues(s1, s2);
                default -> System.out.println("Unrecognized operation!");
            }

            System.out.println(" The answer is : " + result);

        } catch (Exception e) {
            System.out.println(" Number formatting exception " + e.getMessage());
        }

    }

    private static double divideValues(String s1, String s2) {
        double st1 = Double.parseDouble(s1);
        double sr2 = Double.parseDouble(s2);
        return st1 / sr2 ;
    }

    private static double multiplyValues(String s1, String s2) {
        double st1 = Double.parseDouble(s1);
        double sr2 = Double.parseDouble(s2);
        return st1 * sr2 ;
    }

    private static double subtractValues(String s1, String s2) {
        double st1 = Double.parseDouble(s1);
        double sr2 = Double.parseDouble(s2);
        return st1 - sr2 ;
    }

    private static double addValues(String s1, String s2) {
        double st1 = Double.parseDouble(s1);
        double sr2 = Double.parseDouble(s2);
        return st1 + sr2 ;
    }


    private static String getInput (String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}