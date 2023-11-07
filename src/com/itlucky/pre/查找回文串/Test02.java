package com.itlucky.pre.查找回文串;

/**
 *
 */

public class Test02 {

    public static void main(String[] args) {

        String str = "214fgwttdaghh44144";
        String result = str.substring(0, 1);

        for (int i = 0; i<str.length(); i++) {
            result = search(str, i, i, result);
            result = search(str, i, i+1, result);
        }

        System.out.println(result);
    }

    public static String search(String str, Integer left, Integer right, String result) {

        while (left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)) {
            left--;
            right++;
        }
        if (right-left>result.length()) {
            result = str.substring(left+1, right);
        }
        return result;



    }


}
