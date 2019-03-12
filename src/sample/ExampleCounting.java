package sample;

import java.util.StringTokenizer;

public class ExampleCounting {
    public static void main(String[] args) {

        String text = "3.3+4-5*4/8";

        StringTokenizer tokenizer = new StringTokenizer(text, "+-*/", true);
        String[] tokens = new String[tokenizer.countTokens()];
        for (int i = 0; i < tokens.length ; i++) {
            tokens[i] = tokenizer.nextToken();
        }

        int j = 1;
        String result = tokens[0];

        try{
        while(j < tokens.length){
            String sign = tokens[j];
            if (sign.equals("+")){
                result = (String.valueOf(Double.parseDouble(result) + Double.parseDouble(tokens[j + 1])));
            }else if (sign.equals("-")){
                result = (String.valueOf(Double.parseDouble(result) - Double.parseDouble(tokens[j + 1])));
            }else if (sign.equals("/")){
                result = (String.valueOf(Double.parseDouble(result) / Double.parseDouble(tokens[j + 1])));
            }else if (sign.equals("*")){
                result = (String.valueOf(Double.parseDouble(result) * Double.parseDouble(tokens[j + 1])));
            }
            j = j + 2;
        }} catch (Exception e){
            result = "Something went wrong";
        }

        System.out.println(result);
    }
}
