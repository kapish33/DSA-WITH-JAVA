package com.company;

public class Add_Binary {
    public String addBinary(String a, String b) {
        char[] aArray = a.toCharArray(), bArray = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = aArray.length - 1, j = bArray.length - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = (i >= 0 ? aArray[i] - '0' : 0) + (j >= 0 ? bArray[j] - '0' : 0) + carry;

            sb.append(sum % 2);
            carry = sum / 2;

            if (i >= 0) i--;
            if (j >= 0) j--;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
