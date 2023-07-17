package com.wei.learncode.huawei;

import java.util.*;

public class Test2 {


    public static String longJoker(String myCards,String usedCards){
        String res = "";
        String[] myCardSplit = myCards.split("-");
        String[] usedCardSplit = usedCards.split("-");
        int[] myCardInt = convertToIntArray(myCardSplit);
        int[] usedCardInt = convertToIntArray(usedCardSplit);

        List<Integer> myList = new ArrayList();
        for (int i : usedCardInt) {
            myList.add(i);
        }
        for (int i : myCardInt) {
            myList.add(i);
        }
        //计算未出的牌
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                list.add(j);
            }
        }
        //取最长连续子串

        return res;
    }

    public static int[] convertToIntArray(String[] myCardSplit) {
        int[] cards = new int[myCardSplit.length];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = convertToInt(myCardSplit[i]);
        }
        return cards;
    }

    public static int convertToInt(String str){
        if("A".equals(str)){
            return 1;
        }else if("J".equals(str)){
            return 11;
        }else if("Q".equals(str)){
            return 12;
        }else if("K".equals(str)){
            return 13;
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String myCards = in.nextLine();
            String userCards = in.nextLine();
            System.out.println(longJoker(myCards,userCards));
        }
    }
}
