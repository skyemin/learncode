package com.wei.learncode.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.cn/problems/making-file-names-unique/description/?languageTags=java
/*输入：names = ["wano","wano","wano","wano"]
        输出：["wano","wano(1)","wano(2)","wano(3)"]
        解释：每次创建文件夹 "wano" 时，只需增加后缀中 k 的值即可。

        输入：names = ["kaido","kaido(1)","kaido","kaido(1)"]
        输出：["kaido","kaido(1)","kaido(2)","kaido(1)(1)"]
        解释：注意，如果含后缀文件名被占用，那么系统也会按规则在名称后添加新的后缀 (k) 。


 */
public class GetFolderNames {

    public String[] getFolderNames(String[] names) {

        //key为文件名,value为编号(即第几次出现)
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            if(map.containsKey(names[i])){
                Integer k = map.get(names[i]);
                while (map.containsKey((names[i])+"("+k+")")){
                    k++;
                }
                map.put(names[i],k);
                names[i] += "("+k+")";
            }
            map.put(names[i],1);
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"kaido","kaido","kaido","kaido(1)"};
        GetFolderNames getFolderNames = new GetFolderNames();
        String[] folderNames = getFolderNames.getFolderNames(names);
        for (String folderName : folderNames) {
            System.out.println(folderName);
        }
    }
}
