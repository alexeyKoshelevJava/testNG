import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                {"+", "2", "2", "4.0"},
                {"-", "8", "3", "5.0"},
                {"-", "-1", "100", "-101.0"},
                {"+", "-1", "1", "0.0"},
                {"*", "6", "4", "24.0"},
                {"*", "1", "0", "0.0"},
                {"/", "10", "2", "5.0"},

        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String[] params) {

        String actual = Calculator.execute(params);
        Assert.assertEquals(actual, params[3]);
    }
}
