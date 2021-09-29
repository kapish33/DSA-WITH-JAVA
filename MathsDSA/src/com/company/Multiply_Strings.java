package com.company;

public class Multiply_Strings {
    public static void main(String[] args) {
        String num1 = "12345678", num2 = "987654321";
        System.out.println(multiply(num1,num2));
        
    }
    public static String multiply(String num1, String num2) {
        if(num1.charAt(0) == '0' || num2.charAt(0) == '0')
            return "0";

        int len1 = num1.length();
        int len2 = num2.length();
        int[] arr = new int[len1+len2-1];
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                int x1 = num1.charAt(i) - '0';
                int x2 = num2.charAt(j) - '0';
                arr[i+j] += x1*x2;
            }
        }

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for(int k = arr.length - 1; k >= 0; k--){
            int x = carry+arr[k];
            sb.append(x%10);
            carry = x/10;
        }
        if(carry > 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
