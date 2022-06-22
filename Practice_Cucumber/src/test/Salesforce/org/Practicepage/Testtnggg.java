package org.Practicepage;

import org.testng.annotations.Test;

public class Testtnggg {

    public static class Class1
    {
        @Test
        public void Testcase1()
        {
            System.out.println("Student login through web");
        }
        @Test
        public void Testcase2()
        {
            System.out.println("Student login through mobile");
        }
        @Test(dependsOnMethods= {"WebStudentLogin"})
        public void Testcase3()
        {
            System.out.println("Student login through API");
        }
    }
}
