package com.company;

public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch = 'a'; ch<= 'z'; ch++){
            if(sentence.indexOf(ch)<0) return false;
        }
        return true;
    }
}
