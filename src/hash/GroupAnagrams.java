package hash;

import java.util.*;

/**
 * leetcode 49. 字母异位词分组
 * https://leetcode-cn.com/problems/group-anagrams/
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //方法一：排序
        //先判断原数组是否为null
        if (strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List> result = new HashMap<>();//创建要输出对象的实例
        for (String s : strs){
            //转换成char并进行排序
            char[] ca = s.toCharArray();
            Arrays.sort(ca);

            // 将排序后的char再转回string类型
            String key = String.valueOf(ca);

            if (!result.containsKey(key)){
                result.put(key,new ArrayList());
            }

            result.get(key).add(s);

        }

        return new ArrayList(result.values());
    }
}
