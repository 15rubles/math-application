public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //q1
        double bobSalary = 12334.38, garySalary = 1234.38;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //q2
        double carPrice = 12334.38, truckPrice = 1234.38;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        //q3
        double circleRadius = 7.25;
        double circleArea = Math.PI * circleRadius * circleRadius;
        System.out.println("Circle area: " + circleArea);

        //q4
        double var = 5.0;
        System.out.printf("Square root of %.1f is %f%n", var, Math.sqrt(var));

        //q5
        double x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);

        //q6
        double value = -3.8;
        double abs = Math.abs(value);
        System.out.println("Absolute value: " + abs);

        //q7
        double randomNum = Math.random();
        System.out.println("Random number: " + randomNum);

        //q8
        int days = 24;
        int numOfHoursInDay = 24;
        int numOfMinInHour = 60;
        int numOfSecondsInMin = 60;
        int numOfMillInSeconds = 1000;
        int numOfMin = days * numOfHoursInDay * numOfMinInHour;
        int numOfMilliseconds = numOfMin * numOfSecondsInMin * numOfMillInSeconds;
        System.out.println("Number of minutes: " + numOfMin + ", number of milliseconds: " + numOfMilliseconds);
    }
}
