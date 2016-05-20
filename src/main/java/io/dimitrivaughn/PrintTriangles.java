package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/3/16.
 */
public class PrintTriangles {
    public String star = "*";
    String response = "*** Output ***";
    int j=0;
    public String Triangle() {

        for (int i = 1; i < 6; i++) {
            response += "\n";
            j=0;
            for (j=0; j < i; j++)
                response += star;
        }

        return response;

    }
}

