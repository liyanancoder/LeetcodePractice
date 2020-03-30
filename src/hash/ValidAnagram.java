package hash;

/**
 * leetcode 242. 有效的字母异位词
 * https://leetcode-cn.com/problems/valid-anagram/description/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // //方法一：排序 时间复杂度O(nlogn) 空间复杂度O(1)
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // char[] str1 = s.toCharArray();
        // char[] str2 = t.toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);
        // return Arrays.equals(str1, str2);

        //方法二：哈希表 时间复杂度O(n) 空间复杂度O(1)
        if (s.length() != t.length()) {
            return false;
        }

        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
