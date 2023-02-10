package com.cybertek.tests.Activities;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(stringEditor("aaabbc"));
    }

    public static String stringEditor(String str) {
        String[] arr = str.split("");
        String result = "";

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int num = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    num++;
                    max++;
                }
            }
            if (num >= max) {
                result += arr[i];
            }
        }
        return result;
    }
}


