package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        int bobSalary = 42069;
        int garySalary = 69420;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        int carPrice = 12;
        int truckPrice = 13;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is $" + lowestPrice);

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("the area of the circle is" + area);

        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + " is " + sqrtNum1);

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(num1);
        System.out.println("The area of the circle is " + distance);

        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("The absolute value of " + num2 + " is " + absNum2);

        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);
    }
}
