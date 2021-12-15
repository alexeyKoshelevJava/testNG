package model;

public class Calculator {
    public static String execute(String[] params) throws CalculatorException {
        Double one;
        Double two;
        try {
            one = Double.parseDouble(params[1]);
            two = Double.parseDouble(params[2]);
        } catch (RuntimeException e) {
            throw new CalculatorException();
        }
        switch (params[0]) {
            case "+":
                return String.valueOf(one + two);

            case "-":
                return String.valueOf(one - two);

            case "*":
                return String.valueOf(one * two);


            case "/":

                if (two == 0) {
                    throw new CalculatorException();
                }

                return String.valueOf(one / two);

            default:
                throw new CalculatorException();


        }

    }

}
