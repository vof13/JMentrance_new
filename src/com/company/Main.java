package com.company;

import java.io.*;

import static com.company.Roman.toRoman;


public class Main {

    static final String[] ROMANNUMS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static int firstNum;
    static int secondNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input: ");
        String reader = br.readLine();
        firstNum = 0;
        secondNum = 0;
        String[] readerWords = reader.split(" ", 3);

        try {
            if (checkRomanSymbol(readerWords)) {
                String romanResult = toRoman(Calculator.calc(firstNum, secondNum, readerWords[1]));
                System.out.println("RES ROMAN: " + romanResult);
            } else if (checkArabianSymbol(readerWords)) {
                System.out.println("RES ARABIAN: " + Calculator.calc(firstNum, secondNum, readerWords[1]));
            }
            else throw new Exception();
        }
        catch (Exception e) {
            System.out.println("throws Exception");
        }
    }


    private static boolean checkRomanSymbol(String[] readerWords) {
        for (int i = 0; i < ROMANNUMS.length; i++) {
            if (readerWords[0].equals(ROMANNUMS[i])) firstNum = i + 1;
            if (readerWords[2].equals(ROMANNUMS[i])) secondNum = i + 1;
        }
        return ((firstNum != 0) && (secondNum != 0));
    }

    private static boolean checkArabianSymbol(String[] readerWords) {
            if ((Integer.parseInt(readerWords[0]) > 1) & (Integer.parseInt(readerWords[0]) < 11) &
                    (Integer.parseInt(readerWords[2]) > 1) & (Integer.parseInt(readerWords[2]) < 11)) {
                firstNum = Integer.parseInt(readerWords[0]);
                secondNum = Integer.parseInt(readerWords[2]);
                return true;
            } else return false;
    }
}
