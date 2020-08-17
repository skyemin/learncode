package com.wei.learncode;

/**
 * @Author: skye
 * @Date: 2020/8/11 20:15
 * @Description:
 * @Version:1.0
 */

/*两个有序char数组A和B，A比B数组多一个元素，除了这个元素之外其他的元素顺序和值都完全相等，找出这个元素。（A、B两个数组必不为NULL，A数组至少有一个元素）
        如 输入: A = [a, c, d, f, g] B = [a, c, d, g]
        输出: f （a c d g 这4个元素在两个数组中顺序完全一样，只有f为多余的那个元素）
        输入: A = [a] B = []
        输出: a*/
public class Test {

    public static void main(String[] args) {

        char[] a = {'a','c','f','d','g'};
        char[] b = {'a','c','d','g'};


        int start = 0;
        int end = a.length-1;
        while (start <= end){
            int middle = (start + end)/2;
            if(a[middle] != b[middle]){
                end = middle;
            }else {
                start = middle;
            }
            System.out.println(1);
        }



        /*if(b.length == 0){
            System.out.println(a[0]);
        }else{
            for (int i = 0; i < a.length; i++) {
                if(i == a.length-1){
                    System.out.println(a[i]);
                    break;
                }
                if(a[i] != b[i]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }*/
       /* Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < b.length; i++) {
           map.put(b[i],1);
        }
        for (int i = 0; i < a.length; i++) {
            if(map.get(a[i]) == null){
                System.out.println(a[i]);
                break;
            }
        }*/

    }
}
