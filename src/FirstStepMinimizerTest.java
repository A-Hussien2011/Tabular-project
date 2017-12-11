import org.junit.Before;

import org.junit.Assert;

import org.junit.Test;

/**
 * Created by Bassam on 5/7/2017.
 */
public class FirstStepMinimizerTest {

    FirstStepMinimizer firstStepMinimizer = new FirstStepMinimizer();

    String minterm = "2, 3, 7, 9, 11, 13";
    String dontCare = "1, 10, 15)";

    @Before
    public void setUp() throws Exception {



    }

    @Test
    public void getPrimeImplicants() throws Exception {

        Assert.assertEquals(0, firstStepMinimizer.getPrimeImplicants(minterm, dontCare).get(0).getValue());
        Assert.assertEquals(0, firstStepMinimizer.getSortedMintermsFromString(minterm).get(0).getValue());

    }

}