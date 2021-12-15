package model;

public class Calculator {
    public static String execute(String[] params) throws CalculatorException {
        Double one;
        Double two;
        Double result;
        try {
            one = Double.parseDouble(params[1]);
            two = Double.parseDouble(params[2]);
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
                    result = one / two;
                }
                if (checkBorderValue(result)) {
                    throw new CalculatorException();
                } else
                    return String.valueOf(result);

            default:
                throw new CalculatorException();


        }


    }

    private static boolean checkBorderValue(Double d) {
        if (d < -2147483648 || d > 2147483647) {
            return true;
        } else {
            return false;
        }
    }


}
