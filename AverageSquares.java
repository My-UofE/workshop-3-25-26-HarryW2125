import java.util.Scanner;

public class AverageSquares {
    public static void main(String[] args) {
         // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        //System.out.print("Enter your name: ");

        // Read in line from standard input
       // String name = in.nextLine();

        //System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        double startNum = in.nextInt(); // Reads in an int from standard input
        in.nextLine();
        
        System.out.print("Please enter the end value: ");
        double endNum = in.nextInt();

        System.out.println("Sum of squares from  " + startNum + " to " + endNum +":");

        double squareSum = 0;
        double count = 0;
        do {
            squareSum += startNum*startNum;
            startNum++;
            count++;
        } while (startNum <= endNum);
        System.out.println(squareSum/count);
        System.out.println();


    }
}