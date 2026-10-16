package String;

import java.util.Locale;

public class Basics {
    static void main() {
        String name = "Shreya";
        //covert to upper case
        name = name.toUpperCase();
        String course = "Java DSA";
        String college = new String("BBDU");
        //convert to lower case
        college = college.toLowerCase();
        System.out.println("Enter your name: " + name);
        System.out.println("Enter the name of your course: " + course);
        System.out.println("Enter the name of your college: " + college);
        //ignore case
        System.out.println(course.equalsIgnoreCase(college));

        //length
        System.out.println("Length of name: "+name.length());

        //accessing string
        System.out.println("Course String at index 5: "+course.charAt(5));

        //String is immutable
        String str = "Hello";
//        str.concat("World");       Wrong way
        //join the string
        str = str.concat(" World");
        System.out.println(str);

        //Comparing Strings
        if (name.equals(course)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");

            String abc = "  ";
            //Empty -> if length = 0
            System.out.println("Empty? "+abc.isEmpty());
            //Blank -> either empty or only spaces
            System.out.println("Blank? "+abc.isBlank());

            //Trim
            String xyz = "  Siya     ";
            System.out.println("Before Trim: "+xyz.length());
            xyz = xyz.trim();
            System.out.println("After Trim: "+xyz.length());

            //Substring
            String str1 = "My name is Siya";
            //beginIndex -> 3 -> it is included
            //endIndex -> 13 -> it is not included
            System.out.println("Substring: "+str1.substring(3,13));

            //.startWith & .endWith
            System.out.println("Starts With: "+str1.startsWith("My name"));
            System.out.println("Ends With: "+str1.endsWith("Siya"));

            //Contains
            System.out.println(str.contains("Love"));

            //valueOf -> to convert any type of data into String
            int num = 1602;
            String str2 = String.valueOf(num);
            System.out.println(num + 1);
            System.out.println(str2 + 1);

            //print char array
            char crr[] = name.toCharArray();
            for(char  c : crr){
                System.out.println("Value of char: "+c);
            }

            //Split method
            String input = "My, course, is , Computer, Science";
            String words[] = input.split(",");
            for(String word : words){
                System.out.println(word);
            }

            //replace
            name = name.replace('Y','A');
            System.out.println("Replaced: "+name);
        }
    }
}
