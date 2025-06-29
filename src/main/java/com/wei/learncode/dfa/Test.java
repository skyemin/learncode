package com.wei.learncode.dfa;

import java.util.*;

public class Test {

    /**
     * 构建敏感词库
     *
     * @param keyWordSet
     * @return 返回构建好的词库
     */
    public static Map initKeyWord(Set<String> keyWordSet) {
        // 初始化HashMap对象并控制容器的大小
        Map sensitiveWordMap = new HashMap(keyWordSet.size());
        // 敏感词
        String key = null;
        // 用来按照相应的格式保存敏感词库数据
        Map nowMap = null;
        // 用来辅助构建敏感词库
        Map newWordMap = null;
        // 使用一个迭代器来循环敏感词集合
        Iterator<String> iterator = keyWordSet.iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            // 重新赋值，nowMap在接下来可能会改变
            nowMap = sensitiveWordMap;
            for (int i = 0; i < key.length(); i++) {
                char keyChar = key.charAt(i);

                // 判断这个字是否存在于敏感词库中
                Map wordMap = (Map) nowMap.get(keyChar);
                if (wordMap != null) {
                    nowMap = wordMap;
                } else {
                    newWordMap = new HashMap();
                    newWordMap.put("isEnd", Boolean.FALSE);
                    nowMap.put(keyChar, newWordMap);
                    nowMap = newWordMap;
                }

                // 如果该字是当前敏感词的最后一个字，则标识为结尾字
                if (i == key.length() - 1) {
                    nowMap.put("isEnd", Boolean.TRUE);
                }
            }
        }
        return sensitiveWordMap;
    }

    /**
     * 判断是否存在敏感词
     * @param content
     * @param sensitiveWordMap
     * @return
     */
    public static boolean isContaintSensitiveWord(String content, Map sensitiveWordMap) {
        // 一个一个字遍历
        for (int i = 0; i < content.length(); i++) {
            if (checkSensitiveWord(content, i, sensitiveWordMap)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断content的index下标开头的字及其接下来的字是否组成敏感词
     * @param content
     * @param index
     * @param sensitiveWordMap
     * @return
     */
    private static boolean checkSensitiveWord(String content, int index, Map sensitiveWordMap) {
        Map nowMap = sensitiveWordMap;
        for (int i = index; i < content.length(); i++) {
            char c = content.charAt(i);
            // 判断该字是否存在于敏感词库中
            nowMap = (Map) nowMap.get(c);
            // nowMap为空，不是敏感词
            if (nowMap == null) {
                return false;
            } else {
                // isEnd为true，找到敏感词，否则，接下去寻找
                if ((Boolean) nowMap.get("isEnd")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Map map = initKeyWord(new HashSet<>(Arrays.asList("日本人", "日本鬼子", "毛泽东")));
        System.out.println(isContaintSensitiveWord("毛泽东啊", map));
    }
}
