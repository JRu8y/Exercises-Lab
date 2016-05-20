package io.dimitrivaughn;
import java.util.*;


/**
 * Created by dimitrivaughn on 5/19/16.
 */
public class SumNumbers {

    public static int sumofNumbers(int number){
        int result =0;
        for(int i=0; i<= number;i++){
            result+=i;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int result;



        System.out.println("This program will sum all numbers up to your chosen number. So, what number would you like to add up to?");
        n = scanner.nextInt();

        result = sumofNumbers(n);

        System.out.println("Your result is: "+result);

    }




}
