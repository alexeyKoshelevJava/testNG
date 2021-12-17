package model;

public class Calculator {
    public static String execute(String[] params)  {
        double one;
        double two;
        double result;

        try {
            one = Double.parseDouble(params[1]);
            two =  Double.parseDouble(params[2]);
        } catch (RuntimeException e) {
            throw new CalculatorException();
        }
        switch (params[0]) {
            case "+":
                result = one + two;
                if (checkBorderValue(result)) {
                    throw new CalculatorException();
                } else {
                    return String.valueOf(result);
                }

            case "-":
                result = one - two;
                if (checkBorderValue(result)) {
                    throw new CalculatorException();
                } else {

                    return String.valueOf(result);
                }

            case "*":
                result = one * two;

                if (checkBorderValue(result)) {
                    throw new CalculatorException();
                } else {

                    return String.valueOf(result);
                }


            case "/":

                if (two == 0) {
                    throw new CalculatorException();
                } else {
                    result = (one / two);
                }
                if (checkBorderValue(result)) {
                    throw new CalculatorException();
                } else
                    return String.valueOf(result);

            default:
                throw new CalculatorException();


        }


    }

    private static boolean checkBorderValue(Double x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return true;
        } else {
            return false;
        }
    }


}


