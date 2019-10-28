/**
 * Problem Set 4.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();
        
        // comment out or uncomment as needed
        
        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();
                
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     * 
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */
    
    public void sum() {
System.out.println();
    int lowerBound = 1;
    int upperBound = -1;
    int integerSum = 0;
    while ((lowerBound > upperBound) || (lowerBound % 1 != 0) || (upperBound % 1 != 0)){
      System.out.print("Lower bound: ");
      lowerBound = in.nextInt();
      System.out.print("Upper bound: ");
      upperBound = in.nextInt();
    }
    System.out.println();
    while (lowerBound <= upperBound) {
      if (lowerBound % 2 == 0) {
        integerSum = (integerSum + lowerBound);
      }
      lowerBound++;
    }
    System.out.printf("%,2d.\n\n", integerSum);
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */
    
    public void reverse() {
int positiveInteger = 0;
    String digitList = "";
    while (positiveInteger <= 0) {
      System.out.print("Positive integer: ");
      positiveInteger = in.nextInt();
    }
    String integer = String.valueOf(positiveInteger);
    int intLength = (integer.length()) - 1;
    int indexNumber = intLength;
    System.out.println();
    while (indexNumber > 0) {
      digitList = digitList + integer.charAt(indexNumber) + ", ";
      indexNumber--;
    }
    digitList += integer.charAt(0);
    System.out.println(digitList + ".\n");
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */
    
    public void digits() {
int positiveInt = 0;
    int oddDigitSum = 0;
    char digitToTest = 0;
    int numDigit = 0;
    while (positiveInt <= 0) {
      System.out.print("Positive integer: ");
      positiveInt = in.nextInt();
    }
    String intForOdds = String.valueOf(positiveInt);
    int intOddLength = (intForOdds.length()) ;
    int indexNumber = 0;
    System.out.println();
    while (indexNumber < intOddLength) {
      digitToTest = intForOdds.charAt(indexNumber);
      numDigit = Character.getNumericValue(digitToTest);
      oddDigitSum = oddDigitSum + (numDigit * (numDigit % 2));
      indexNumber++;
    }
    System.out.println(oddDigitSum + ".\n");
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */
    
    public void average() {
int nonNegInt = 0;
    double sumOfIntegers = 0;
    double integerCounter = 0;
    while (nonNegInt >= 0) {
      System.out.print("Non-negative integer: ");
      nonNegInt = in.nextInt();
      if (nonNegInt > 0) {
        sumOfIntegers += nonNegInt;
        integerCounter++;
      }
    }
    System.out.println();
    double nonNegAverage = sumOfIntegers / integerCounter;
    double averageWithDec = (Math.round(nonNegAverage * 100)) / 100;
    System.out.printf("%,.2f.\n\n", nonNegAverage);
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */
    
    public void prime() {
int intForPrime = 0;
    String primeOrNo = "Prime";
    while (intForPrime <= 0) {
      System.out.print("Non-negative integer: ");
      intForPrime = in.nextInt();
    }
    System.out.println();
    for (int i = 2; i < intForPrime; i++) {
      if (intForPrime % i == 0) {
        primeOrNo = "Not prime.";
      } else {
        primeOrNo = "Prime.";
      }
    }
    System.out.println(primeOrNo);
    System.out.println();
    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */
    
    public void fibonacci() {
double fibIndex = 0;
    double goldenRatio = 1.618034;
    while ((fibIndex <= 0) || (fibIndex > 92) || (fibIndex % 1 != 0)) {
      System.out.print("Positive integer: ");
      fibIndex = in.nextInt();
    }
    System.out.println();
    double calculationOne = Math.pow(goldenRatio, fibIndex);
    double calculationTwo = Math.pow(1 - goldenRatio, fibIndex);
    double calculationThree = Math.sqrt(5);
    double fibNumber = Math.round((calculationOne - calculationTwo) / calculationThree);
    int fibNoZero = (int) fibNumber;
    System.out.printf("%d.\n\n", fibNoZero);
    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a positive integer. What are its factors?
     */
    
    public void factors() {
int posInteger = 0;
    String factorList = "";
    while ((posInteger <= 0) || (posInteger % 1 != 0)) {
      System.out.print("Positive integer: ");
      posInteger = in.nextInt();
    }
    System.out.println();
    for (int i = 2; i <= Math.sqrt(posInteger); i++) {
      if (posInteger % i == 0) {
        if (posInteger / i == i){
          factorList = factorList + ", " + i;
        } else {
          factorList = factorList + ", " + i + ", " + (posInteger / i);
        }
      }
    }
    System.out.println("1, " + posInteger + factorList + ".\n");
    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */
    
    public void mario() {        
int marioHeight = 0;
    String halfPyramid = "";
    int marioRow = 0;
    while ((marioHeight <= 0) || (marioHeight > 24) || (marioHeight % 1 != 0)) {
      System.out.print("Height: ");
      marioHeight = in.nextInt();
    }
    System.out.println();
    for (int i = 1; i <= marioHeight; i++) {
      marioRow += 1;
      for (int j = 1; j <= (marioHeight - marioRow); j++) {
        halfPyramid = halfPyramid + " ";
      }
      for (int h = 1; h <= ((marioHeight + 1) - (marioHeight - marioRow)); h++) {
        halfPyramid = halfPyramid + "#";
      }
      halfPyramid = halfPyramid + "\n";
    }
    System.out.println(halfPyramid);
    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */
    
    public void luigi() {

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */
    
    public void credit() {
        
    }
}