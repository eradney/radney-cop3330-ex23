/**
 * UCF COP3330 Fall 2021 Assignment 23 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        String ans1,ans2,ans3,ans4,ans5,ans6;

        System.out.println("Use Y or N to answer questions.");
        System.out.print("Is the car silent when you turn the key? ");
        ans1 = scnr.next();

        if (ans1.equalsIgnoreCase("y")) {
            System.out.print("Are the battery terminals corroded? ");
            ans2 = scnr.next();

            if (ans2.equalsIgnoreCase("y")) {
                System.out.println("Clean terminals and try again.");
                System.exit(0);
            }
            else {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            ans3 = scnr.next();

            if(ans3.equalsIgnoreCase("y")) {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                ans4 = scnr.next();

                if (ans4.equalsIgnoreCase("y")) {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    ans5 = scnr.next();

                    if (ans5.equalsIgnoreCase("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        ans6 = scnr.next();

                        if (ans6.equalsIgnoreCase("y")) {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
