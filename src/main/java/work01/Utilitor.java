/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work01;

/**
 *
 * @author User
 */
public class Utilitor {

    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static double testPositive(double value) {
        if (value > 0) {
            return value;
        }
        throw new IllegalArgumentException();
    }

    public static long computeIsbn10(long isbn10) {
        String stringIsbn10 = Long.toString(isbn10);
        if(stringIsbn10.length() >= 10) throw new IllegalArgumentException();
        int sum = 0;
        int n = 2;
        while( isbn10 > 0){
            long digit = isbn10 % 10; 
            if(digit != 0)sum += digit * n;
            ++n;
            isbn10 /= 10;
        }
//        for (int i = stringIsbn10.length() - 1; i >= 0; i--) {
//            String s = String.valueOf(stringIsbn10.charAt(i));
//            int digits = Integer.parseInt(s);
//            sum += digits * n;
//            ++n;
//        }
        int modsum = sum % 11;
        if (modsum == 0) {
            return 0;
//            sisbn10 = isbn10 + "0";
//            long correctIsbn10 = Long.parseLong(sisbn10);
//            return correctIsbn10;
        } else {
            long checkDigit = 11 - modsum;
            return checkDigit;
        }
    }

}
