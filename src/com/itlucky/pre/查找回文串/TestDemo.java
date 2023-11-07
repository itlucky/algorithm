package com.itlucky.pre.查找回文串;

/**
 *  给定字符串str,找到当中最长的回文串。(回文串就是正读和反读都一样的字符串)
 *
 *  实例1 输入 ：str = "ababds"  输出aba 或 bab均可
 *  实例2 输入 ：str = "cbbd"    输出bb
 *
 */
public class TestDemo {

    public static void main(String[] args) {

        String str = "jkf4lrbbts8stg35";

        // 防止字符串只有一个的情况
        String result = str.substring(0, 1);
        for (int i = 0; i<str.length(); i++) {
            // 奇数个字符回文
            result = findFromCenter(str, i, i, result);
            // 偶数个字符回文
            result = findFromCenter(str, i, i+1, result);
        }

        System.out.println(result);
    }

    /**
     * 中心扩散法
     */
    public static String findFromCenter(String str, Integer left, Integer right, String result) {

        // 注意这里是while，要一直循环处理
        while (left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)) {
            // 向两边扩散
            left--;

            right++;

        }
        // 长度大于前面获取到的回文串长度
        if (right-left-1>result.length()) {
            result = str.substring(left+1, right);
        }
        return result;
    }

}
