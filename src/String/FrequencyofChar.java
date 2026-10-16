package String;

import java.util.Scanner;

public class FrequencyofChar {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "Programming";

//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            int count = 1;
//            if(ch == '0'){
//                continue;
//            }
//            for(int j=i+1; j<str.length(); j++){
//                if(ch == str.charAt(j)){
//                    count++;
//                }
//            }
//            System.out.println(ch+" = "+count);
//        }

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == '0')
                continue;

                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j] = '0';
                    }
                }
                System.out.println(arr[i]+" = "+count);
            }
        }
    }