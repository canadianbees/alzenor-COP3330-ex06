/*
 *  UCF COP3330 Fall 2021 Retirement Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Calendar;
import java.util.Scanner;

public class Retirement
{
    private String age;
    private String retireAge;

    //asks user for their age and their ideal retirement age
    public Retirement()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your current age? ");
        this.age = scan.nextLine();

        System.out.print("At what age would you like to retire? ");
        this.retireAge = scan.nextLine();
    }

    public void retireCalc()
    {
        //converts string into integer
        int currAge = Integer.parseInt(this.age);
        int retAge = Integer.parseInt(this.retireAge);

        int diffAge = retAge - currAge;

        //if the difference age is negative they can retire now
        if(diffAge <= 0)
        {
            System.out.print("You can retire right now!");

        }

        //if its not, tell user how many years they have left and what year they can retire in
        else
        {
            System.out.println("You have "+diffAge+" years left until you can retire.");
            int year = Calendar.getInstance().get(Calendar.YEAR);
            System.out.print("It's "+year+", so you can retire in "+(year+diffAge)+".");
        }
    }

}
