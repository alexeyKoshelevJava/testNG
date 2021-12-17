import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public Object[][] negativeData() {
        return new Object[][]{
                new String[]{"+", "f", "2"},
                new String[]{"-", "8", "!"},
                new String[]{"1", "8", "5"},
                new String[]{"*", "-", "4"},
                new String[]{"/", "8", "0"},
                new String[]{"", "8", "5"},
                new String[]{"-", "-2147483648", "1"},
                new String[]{"+", "2147483647", "1"}

        };
    }


    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String[] arr) {

        try {
            Calculator.execute(arr);
        } catch (CalculatorException e) {
            throw new CalculatorException();
        }

    }


}
