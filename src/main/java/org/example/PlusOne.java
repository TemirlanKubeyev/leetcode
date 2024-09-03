package org.example;
import java.math.BigInteger;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            number.append(digits[i]);
        }
        BigInteger bigNumber = new BigInteger(number.toString());
        BigInteger one = BigInteger.ONE;
        bigNumber = bigNumber.add(one);
        String numberStr = bigNumber.toString();
        int[] numberInt = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            numberInt[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return numberInt;
    }
}
