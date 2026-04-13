package com.example;
public class Prime{
    public String check(int n) {
        int flag = 0;

        if (n <= 1) {
            flag = 1;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0) {
            return "Prime";
        } else {
            return "Not Prime";
        }
    }
}