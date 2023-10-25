package qsh.learning.javaBeginner.primeNumber;

public class PrimeNumber {

    public static void main(String[] args) {
        byte nbOfPrimeNumberToFind = 100;
        byte counter = 0;

        short number = 2; //0, 1 are not prime number by definition.

        while (counter < nbOfPrimeNumberToFind) {
            boolean isPrimeNumber = true;

            for (short i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                }
            }

            if (isPrimeNumber) {
                counter++;
                System.out.println(number);
            }

            number++;
        }
    }
}
