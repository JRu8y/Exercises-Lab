package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class EvenNumbers {
    public String EvenLoop(int n) {
        String response ="*** Output ***";
        for(int i=2; i < n; i+=2){
            response += "\n" + i;
        }
        return response;
    }
}
