//Ask user for a number N and then print N asterisks (*). E.g. if N is 5, then print * * * * *.

package intro;

import java.util.Scanner;

public class ex1_12_2 {
    public static void main(String[] args) {
        int N;
        int i;
        String x;

        Scanner in =new Scanner(System.in);
        i=0;


        System.out.print("Enter a number:");
        N = in.nextInt();
        while (i<N){
            System.out.print("*");
            i++;}
//The command System.out.print was used instead of println in order to show the * in the same line.








    }



}
