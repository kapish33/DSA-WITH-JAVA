package com.company;

public class power_logarthimic {
    public static void main(String[] args) {
        System.out.println(power_log(2,2));
    }
    public static int power_log(int x,int n){
        if (n==0) return 1;
        int xpnb = power_log(x,n/2);
        int xpn = xpnb * xpnb;
        if (n%2==1) xpn = xpn * x;

        return  xpn;
    }
}
