package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class OneTen {

    public String createLoop() {
        String response ="*** Output ***" + "\n";
        for(int i=1; i < 11; i++){
           response += i + "\n";
        }

        return response;

    }
}


