public class PrimeNumberChallenge {

    public static void main(String[] args) {
        //int parameter in numOfPrimes() sets max range for which to check
        //for prime numbers (min is 2).

        numOfPrimes(100);
    }

    //isPrime() checks if the int parameter is a prime number
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    //numOfPrimes() uses a for loop to print every prime number in the
    //range and prints the total number of prime numbers in the range
    public static void numOfPrimes(int range) {
        int counter = 0;
        for (int count = 1; count <= range; count++) {
            if (isPrime(count)) {
                counter++;
                System.out.println(count + " is a prime number in the range.");
            }
            }
        System.out.println("There are a total of " + counter + " prime numbers in the given range.");
        }
    }
