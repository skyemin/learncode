package com.wei.learncode.ali;

public class BetweenAS {


    public String betweenAS(String input){
        StringBuilder sb = new StringBuilder();
        boolean isInside = false;
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if(curr == 'a'){
                isInside = true;
            }else if(curr == 's'){
                isInside = false;
            }else if(!isInside){
                sb.append(curr);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BetweenAS betweenAS = new BetweenAS();
        String s = betweenAS.betweenAS("helloak2sworlda123s!");
        System.out.println(s);
    }
}
