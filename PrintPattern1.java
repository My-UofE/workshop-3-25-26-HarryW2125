import java.util.Scanner;

public class PrintPattern1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = in.nextInt();

        for (int count = 1; count<= size; count++) {
            for (int count2 = 1; count2<= count; count2++) {
                System.out.print(count2);
            }
            System.out.println();
        }

    }
}