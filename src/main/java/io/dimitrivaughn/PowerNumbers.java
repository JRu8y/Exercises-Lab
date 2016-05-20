package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class PowerNumbers {
    public String PowerLoop(int n) {
        String response ="*** Output ***";
        int j;
        for(int i=1; i <= n; i++){
            j = (int) Math.pow(2,i);
            response += "\n" + j;
        }
        return response;
    }
}
