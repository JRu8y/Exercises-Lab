package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/4/16.
 */
public class Table1 {



    public String tableLoop(int num) {
        String table="  1|  2|  3|  4|";
        for (int i = 1; i <= num; i++) {
            table+="\n";
            for(int j=1; j<=num; j++){
                table +=String.format("%3d", i*j)+"|";
            }



        }
        return table;
    }

    public static void main(String[] args) {
        Table1 first = new Table1();
        System.out.println(first.tableLoop(4));
    }
}

