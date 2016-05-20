package io.dimitrivaughn;


/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class RandomNumbers {
    public String randomLoop() {
        String response ="*** Output ***";
        int j;
        for(int i=1; i < 5; i++){
            j = (int) (Math.random()*10);
            response += "\n" + j;
        }
        return response;
    }
}
