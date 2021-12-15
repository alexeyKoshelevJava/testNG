import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {

    @DataProvider
    public Object[][] negativeData() {
        return new Object[][]{
                {"+", "f", "2"},
                {"-", "8", "!"},
                {"1", "8", "5"},
                {"*", "-", "4"},
                {"/", "8", "0"},
                {"", "8", "5"}
        };
    }


    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void executeTest(String[] params) {
        try {
            Calculator.execute(params);
        } catch (CalculatorException e) {
            throw new CalculatorException();
        }

    }


}
