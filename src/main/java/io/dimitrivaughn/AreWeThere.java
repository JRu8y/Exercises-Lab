package io.dimitrivaughn;

import java.util.Scanner;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class AreWeThere {
    public String areWeThere() {
        String answer = "No";
        Scanner read = new Scanner(System.in);

        while (answer.equals("No")) {

            answer = read.nextLine();
            if (answer.equals("Yes")) {
                answer = "Good!";
            } else {
                answer = "No";
            }
        }
        return answer;

    }
}