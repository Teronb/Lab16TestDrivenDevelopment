import java.util.Scanner;

/**
 * Created by teronb1005 on 2/23/2017.
 */
public class TDDMain {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String answer;
        do {
        System.out.println("Enter a digit between 1 and 20? ");
        int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 41, 47, 53, 59, 61, 67, 71};
        int UserInput = scan.nextInt();

        System.out.println("The number " + UserInput + " prime is " + primeNumbers(UserInput));

        //String answer = "";

        // this is the loop to keep translating if the user enters "yes"..

            System.out.println("Do you want to find another prime number? Please enter Yes or No ");
            answer = scan.next();
            answer = answer.toLowerCase();

        } while (answer.equals("yes"));
        System.out.println();

        scan.close();
        System.out.println("Thank you, Have a wonderful day");
    }





    public static int primeNumbers (int n) {

        int[] primeArray =  {2,3,5,7,11,13,17,19,23,29,31,37,41,41,47,53,59,61,67,71};

        return primeArray[n-1];

    }
}
