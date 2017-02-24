import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by teronb1005 on 2/23/2017.
 */
public class TDDMainTest {
    @Test
        public void primeNumbers1() throws Exception {
            Assert.assertEquals(2,TDDMain.primeNumbers(1));
    }
    @Test
    public void primeNumbers2() throws Exception {
        Assert.assertEquals(3, TDDMain.primeNumbers(2));
    }
    @Test
    public void primeNumbers3() throws Exception {
        Assert.assertEquals(5, TDDMain.primeNumbers(3));
    }
    @Test
    public void primeNumbers4() throws Exception {
        Assert.assertEquals(67, TDDMain.primeNumbers(19));
    }

}