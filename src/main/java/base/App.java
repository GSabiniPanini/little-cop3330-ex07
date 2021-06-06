package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;
/**
 Exercise 7 - Area of a Rectangular Room
 When working in a global environment, you’ll have to present information in both metric and Imperial units. And you’ll need to know when to do the conversion to ensure the most accurate results.

 Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.

 Example Output
 What is the length of the room in feet? 15
 What is the width of the room in feet? 20
 You entered dimensions of 15 feet by 20 feet.
 The area is
 300 square feet
 27.871 square meters
 The formula for this conversion is m2 = f2 × 0.09290304

 Constraints
 Keep the calculations separate from the output.
 Use a constant to hold the conversion factor.

 Challenges
 Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 Create a new version of the program that allows you to choose feet or meters for your inputs.
 Implement this program as a GUI program that automatically updates the values when any value changes.
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    static final double CONVERSION_VAL = 0.09290304;

    public static void main( String[] args )
    {
        App myApp = new App();

        Integer length = myApp.getlength();
        Integer width = myApp.getwidth();
        myApp.dims(length, width);
        myApp.area(length, width);
    }

    public void area(Integer length, Integer width)
    {
        int sqfeet = length * width;
        double sqmeters = sqfeet * CONVERSION_VAL;
        System.out.printf("The area is%n%d square feet%n%.3f square meters", sqfeet, sqmeters);
    }

    public void dims(Integer length, Integer width)
    {
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
    }

    public Integer getwidth()
    {
        System.out.print("What is the width of the room in feet? ");
        Integer width = in.nextInt();
        return width;
    }

    public Integer getlength()
    {
        System.out.print("What is the length of the room in feet? ");
        Integer length = in.nextInt();
        return length;
    }
}
