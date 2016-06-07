package io.dimitrivaughn;
import java.io.*;
import java.util.*;

/**
 * Created by dimitrivaughn on 6/7/16.
 */
public class ConversionLab {

    // declaring scanner to read input

    Scanner scan = new Scanner(System.in);

    // HashMap to store conversions
    static HashMap<String, String> directory = new HashMap<String, String>();

    static {
        directory.put("0", "zero");
        directory.put("1", "one");
        directory.put("2", "two");
        directory.put("3", "three");
        directory.put("4", "four");
        directory.put("5", "five");
        directory.put("6", "six");
        directory.put("7", "seven");
        directory.put("8", "eight");
        directory.put("9", "nine");
    }

    // declaring variables
    public String phoneNumberString;
    public String answer;
    public String[] phoneNumberArray;

    public String[] storeArray(String userInput){
        return userInput.split("");
    }

    public String convertArray(String[] splitArray){
        String result = "";

        for(int i=0; i<splitArray.length; i++){
            if(directory.containsKey(splitArray[i])){
                result+=directory.get(splitArray[i]);
            }
            else{
                result+=" ";
            }
        }
        return result;
    }


    public void conversionEngine(){
        System.out.println("Please type your phone number:");
        phoneNumberString = scan.nextLine();
        phoneNumberArray=storeArray(phoneNumberString);
        answer=convertArray(phoneNumberArray);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        ConversionLab lab = new ConversionLab();
        lab.conversionEngine();
    }



}
