package com.aca.disqo.calculateexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static final String regex = "[-+*/0-9]";
    private static final String regexD = "[0-9]+";

    public static boolean validate(final String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if (Pattern.compile(regex).matcher(expression).find()) {
                return true;
            } else if (Pattern.compile(regex).matcher(expression).find()) {
                return false;
            }
        }
        return false;
    }

    public static boolean checkIfNumber(String expression){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(expression);
        return m.matches();
    }

    public static String[] parse(String regex) {
        String right = "";
        String left = "";
        for (int i = 0; i < regex.length(); i++) {
            if (regex.charAt(i) == '+') {
                left = regex.substring(0, i);
                right = regex.substring(i + 1);
                break;
            } else if (regex.charAt(i) == '-') {
                if (i == 0) {
                    left = regex.substring(0, i + 2);
                    right = regex.substring(i + 2);
                    if(right.startsWith("+")){
                       right = right.substring(1);
                    }
                    break;
                } else {
                    left = regex.substring(0, i);
                    right = regex.substring(i);
                    break;
                }
            }
        }
        return new String[]{left, right};
    }

    public static char findOperator(String expression) {
        for (int i = 0; i < regex.length(); i++) {
            if (regex.charAt(i) == '+' || regex.charAt(i) == '-') {
                return regex.charAt(i);
            }
        }
        return 'k';
    }

    public static boolean isOperatorCountOne(String expression) {
        int countOfOperators = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+') {
                countOfOperators++;
            }
            if (countOfOperators >= 2) {
                return false;
            }
        }
        return true;
    }
}
