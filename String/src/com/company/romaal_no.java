package com.company;

public class romaal_no {
    public int romanToInt(String s) {
        int num = 0;            //stores the integer value of roman
        int len = s.length();   //length of string
        int last = 0;           //roman 'digit/character' just before/right to current(n)
        int n = 0;              //current roman 'digit/character'
        for (int i = len - 1; i >= 0; i--){  //going for the smallest value first
            char c = s.charAt(i);
            switch(c){          //comparetively switch takes lesser time than ladder if-else
                case 'I':
                    n = 1;
                    break;
                case 'V':
                    n = 5;
                    break;
                case 'X':
                    n = 10;
                    break;
                case 'L':
                    n = 50;
                    break;
                case 'C':
                    n = 100;
                    break;
                case 'D':
                    n = 500;
                    break;
                case 'M':
                    n = 1000;
                    break;
                default:
                    n = 0;
            }
            //taking out condition from switch cases,
            //it increase understandability, and makes code clean
            if(last > n)        //if the last/right character have greater value
                num = num - n; //then we decrease the value of num by 'n'

            else                //if the last/right character have smaller value
                num = num + n;  //then we increase the value of num by 'n'

            last = n;       //stores "last" roman 'digit/character'
        }
        return num;
    }
}
