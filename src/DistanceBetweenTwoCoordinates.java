//Muhammad Umer Sheikh
//CS 49J

import java.awt.*; //Library to use Point

public class DistanceBetweenTwoCoordinates {

    public static void main(String[] args) {

        Point firstCoordinates = new Point(3,4);
        Point secondCoordinates = new Point(-3, -4);

        System.out.println("Distance between (3,4) & (-3,-4): " +firstCoordinates.distance(secondCoordinates));
    }
}

/* How to write a test program described in slides 43-44 in Lecture4.

Look at the API of the Point class and find out how to construct a Point object.
In a PointTester program, construct two points with coordinates (3, 4) and (–3, –4).
Find the distance between them, using the distance method. Print the distance, as well as the expected value.
(Draw a sketch on graph paper to find the value you will expect.)
API: https://docs.oracle.com/javase/8/docs/api/index.html

ANSWER IS 10

Wrong way of doing it:
public class DistanceBetweenTwoPoints
{
    public static void main(String[] args)
    {
        int x= 3;
        int y= 4;
        int a= -3;
        int b= -4;
        double distance;
        distance = Math.sqrt(((x-a)*(x-a))+((y-b)*(y-b)));
        System.out.println("Distance between (3,4) & (-3,-4): " + distance);
    }
 */