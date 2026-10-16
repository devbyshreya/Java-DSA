package String;

import java.util.Scanner;

public class CountVowel {
    static int countVowels(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                count++;
            }
        }
        return count;
    }
    static void main(String args[]) {
        int str = countVowels("Armaan");
        System.out.println("Vowels: "+str);
    }
}
