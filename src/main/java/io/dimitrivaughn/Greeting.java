package io.dimitrivaughn;

import java.util.Scanner;

/**
 * Created by dimitrivaughn on 5/19/16.
 */
public class Greeting {

    public static String greetAliceBob(String name){
        String greet;
        if(name.toLowerCase().equals("alice")||name.toLowerCase().equals("bob")){
            greet = "Hello "+ name;
            System.out.println(greet);
            return greet;
        }
        greet = "Have we met?";
        System.out.println(greet);
        return greet;
    }

    public static void main(String[] args) {
        String response;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What's your name?");
        response = scanner.nextLine();
        greetAliceBob(response);
    }
}
