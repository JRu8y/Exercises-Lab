package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class SquareNumbers {
    public String squareLoop() {
        String response ="*** Output ***";
        int j;
        for(int i=1; i < 11; i++){
            j = i*i;
            response += "\n" + j;
        }
        return response;
    }

}
