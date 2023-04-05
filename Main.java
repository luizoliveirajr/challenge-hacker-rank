import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int sum = 21;
        // minimum number of condition
        int firstDigit = 3;
        int secondDigit = 6;
        int thirdDigit = 6;
        int fourthDigit = 6;
        String sampleValue = "" + firstDigit + secondDigit + thirdDigit + fourthDigit;
        int initialValue = Integer.parseInt(sampleValue);
        Scanner scanner = new Scanner(System.in);
        int maxDigit = scanner.nextInt();
        //scape numbers 1/2/3/4/5 because your max sum is lower than 21
        if (maxDigit < 6) {
            System.out.print("null");
        } else {
            //max number what this algoritmn can reach
            int maxNumber = maxDigit * 1000 + maxDigit * 100 + maxDigit * 10 + maxDigit;
            while (initialValue <= maxNumber) {
                boolean maxSum = (firstDigit + secondDigit + thirdDigit + fourthDigit) == sum;
                boolean maxValuePerDigit = (firstDigit <= maxDigit && secondDigit <= maxDigit && thirdDigit <= maxDigit && fourthDigit <= maxDigit);
                if (maxSum && maxValuePerDigit) {
                    String magicValue = "" + firstDigit + secondDigit + thirdDigit + fourthDigit;
                    System.out.println(magicValue);
                }
                initialValue++;
                String currentValue = String.valueOf(initialValue);
                firstDigit = Integer.parseInt(currentValue.charAt(0) + "");
                secondDigit = Integer.parseInt(currentValue.charAt(1) + "");
                thirdDigit = Integer.parseInt(currentValue.charAt(2) + "");
                fourthDigit = Integer.parseInt(currentValue.charAt(3) + "");
            }
        }
    }
}
