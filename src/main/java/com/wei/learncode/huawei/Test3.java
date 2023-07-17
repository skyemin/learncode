package com.wei.learncode.huawei;

import java.util.*;

public class Test3 {


    private static String simplifyString(String input){

        List<Set<Character>> eqList = new ArrayList<>();
        Set<Character> remainChar = new HashSet<>();

        int i= 0;
        while(i < input.length()){

            if(input.charAt(i) == '('){
                int end = input.indexOf(')',i);
                if(end != -1){
                    Set<Character> eqChar = findEquChars(input.substring(i+1,end));
                    eqList.add(eqChar);
                    i = end+1;
                }else{
                    break;
                }
            }else{
                remainChar.add(input.charAt(i));
                i++;
            }
        }
        process(eqList);


        List<Character> res = new ArrayList<>();
        for (char character : remainChar) {
            //找到字符所在集合
            Set<Character> characters = eqList.stream().filter(set -> set.contains(character)).findFirst().orElse(Collections.singleton(character));
            char min = Collections.min(characters);
            res.add(min);
        }
        if(res.isEmpty()){
            return "0";
        }else{
            Collections.sort(res);
            StringBuilder sb = new StringBuilder();
            for (Character re : res) {
                sb.append(re);
            }
            return sb.toString();
        }
    }
    //处理小括号等效关系
    private static void process(List<Set<Character>> eqList) {

        List<Set<Character>> metrgeList = new ArrayList<>();

        for (Set<Character> eqSet : eqList) {
            boolean merged = false;
            for(Set<Character> mergeSet : metrgeList){
                if(!Collections.disjoint(eqSet,mergeSet)){
                    mergeSet.addAll(eqSet);
                    merged = true;
                    break;
                }

            }
            if(!merged){
                metrgeList.add(new HashSet<>(eqSet));
            }

        }

        /* boolean change;
        do {
            change  = false;
            for (int i = 0; i < eqList.size(); i++) {
                Set<Character> eqSet = eqList.get(i);
                for (char character : eqSet) {
                    for (int j = i+1; j < eqList.size(); j++) {
                        if(eqList.get(j).contains(character)){
                            eqSet.addAll(eqList.get(j));
                            eqList.remove(j);
                            j--;
                            change = true;
                        }
                    }
                }
            }
        }while (change);*/
    }

    private static Set<Character> findEquChars(String s) {

        Set<Character> chars = new HashSet<>();
        for (char aChar : s.toCharArray()) {
            if(Character.isLetter(aChar)){
                chars.add(Character.toLowerCase(aChar));
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String address = in.nextLine();
            System.out.println(simplifyString(address));
        }
    }
}
