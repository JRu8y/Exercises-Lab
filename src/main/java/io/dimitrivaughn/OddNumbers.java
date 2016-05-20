package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class OddNumbers {

    public String oddLoop() {
        String response ="*** Output ***";
        for(int i=1; i < 20; i+=2){
            response += "\n" + i;
        }

        return response;

    }
}
