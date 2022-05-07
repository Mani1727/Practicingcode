package org.salesforce.page;

import java.util.regex.Pattern;
import java.lang.*;

class String1 {

    public static void main(String[] args) {

        /*boolean b = Pattern.matches(".m","am");
        System.out.println(b);*/

        System.out.println(Pattern.matches("[M][a-z]{12}","manikandanbc"));


       /* [abc]
        [^abc]
        [a-z]
        [A-Z]
        [a-z A-Z]
        []?   -  Regex Quantifier
        []+
        []*
        []{n}
        []{y,z}
        metacharacter \d
                \D
                \w
                \W*/

        System.out.println();




    }
}
