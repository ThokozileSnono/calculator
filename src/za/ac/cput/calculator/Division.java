package za.ac.cput.calculator;

/**
 * Name and Surname: Thokozile Snono
 * Student number: 216032121
 * Application returns result of integer division
 */

public class Division {
    public static int intergerDivision(int numerator, int denominator){
        if (denominator < 1) return 0;
        return numerator / denominator;
    }
}
