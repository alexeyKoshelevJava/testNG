import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("For input string: введи оператор\n" +
                "введи первое число\n" +
                "введи второе число\n");
        String operator = in.nextLine();
        String first = in.nextLine();
        String two = in.nextLine();
        String []arr = new String[]{operator,first,two};
        String str = Calculator.execute(arr);
        System.out.println(str);


    }

}
