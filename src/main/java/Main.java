import model.Calculator;

public class Main {
    public static void main(String[] args){
        String s = Calculator.execute(new String[]{"+","2","3"});
        System.out.println(s);
    }

}
