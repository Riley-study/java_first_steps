package lesson1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class seminar5 {
//    public static void main(String[] args) {
//        ex();
//
//    }
//// Написть конвертер римского формата чисел в арабский формат
////    I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.
////    если меньшая цифра стоит перед большей (в этом случае она не может повторяться), то меньшая вычитается из большей;
////    вычитаться могут только цифры, обозначающие 1 или степени 10; уменьшаемым может быть только цифра, ближайшая в
////    числовом ряду к вычитаемой: IV = 5 - 1 = 4; IX = 10 - 1 = 9; XL = 50 - 10 = 40; XC = 100 - 10 = 90;
////    MMXXII
//    private static void ex() {
//        Map<Character,Integer> charMap = new HashMap<>(7);
//        charMap.put('I', 1);
//        charMap.put('V', 5);
//        charMap.put('X', 10);
//        charMap.put('L', 50);
//        charMap.put('C', 100);
//        charMap.put('D', 500);
//        charMap.put('M', 1000);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите число в римском формате: ");
//        String romanNumber = scanner.nextLine();
//        int result = 0;
//
//        for (int i = 0; i < romanNumber.length(); i++) {
//            int currentRomanValue = charMap.get(romanNumber.charAt(i));
//            int prevRomanValue = i == 0 ? 0 : charMap.get(romanNumber.charAt(i-1));
//            if (i > 0 && currentRomanValue > prevRomanValue) {
//                result += currentRomanValue - 2*prevRomanValue;
//            } else {
//                result += currentRomanValue;
//            }
//        }
//        System.out.println(result);
//
//    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите римское число: ");
            String romanNumber = scanner.nextLine();
            int arabicNumber = convertRomanToArabic(romanNumber);
            System.out.println("Арабское число: " + arabicNumber);
        }

    public static int convertRomanToArabic(String romanNumber) {
        Map<Character, Integer> romanToArabicMap = new HashMap<>();
        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);

        int arabicNumber = 0;
        int previousValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int currentValue = romanToArabicMap.get(romanNumber.charAt(i));

            if (currentValue < previousValue) {
                arabicNumber -= currentValue;
            } else {
                arabicNumber += currentValue;
            }

            previousValue = currentValue;
        }

        return arabicNumber;
    }
}