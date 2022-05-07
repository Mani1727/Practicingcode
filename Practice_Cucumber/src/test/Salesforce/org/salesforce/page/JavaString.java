package org.salesforce.page;
import java.lang.*;
import java.util.Arrays;
import java.util.Locale;

import static javax.xml.bind.DatatypeConverter.printString;

public class JavaString {



    public static void main(String[] args) {
        String Str33=new String("Hello");

        String Str="Welcome";

      System.out.println(Str);
        System.out.println(Str.length());
        System.out.println(Str.toLowerCase());
        System.out.println(Str.toUpperCase());

        System.out.println(Str.split("ll"));
        System.out.println(Str.indexOf("e"));
        System.out.println(Str.compareTo("Hello"));
       StringBuffer Str1=new StringBuffer("Welcome");
        System.out.println(Str1.append("Logic"));
        System.out.println(Str1.insert(2,"Dummy"));
        System.out.println(Str.concat("Helloww"));


      //  System.out.println(Str3.reverse());
        System.out.println(Str.equals(Str1));
        System.out.println(Str.equalsIgnoreCase(Str));

        String re="ww.html";
        String s[]= re.split("\\."); // S[0]- WW , S[1]html
        String x=s[0];
       printString(s,"spliting the string");
        System.out.println(x);

        //collections








    }

    private static void printString(String s[], String approach) {
        for(String w:s)
        {
            System.out.println(w);
        }
    }


}

