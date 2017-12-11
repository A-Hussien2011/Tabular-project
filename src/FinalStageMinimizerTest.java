import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Bassam on 5/13/2017.
 */
public class FinalStageMinimizerTest {

    String mintermsString, dontCaresString;
    FinalStageMinimizer finalStageMinimizer;

    @Before
    public void setUp() throws Exception {
mintermsString = "2,1,3,0,12,22,12,4,6,,11,20";
dontCaresString = "5,4,6";
finalStageMinimizer = new FinalStageMinimizer(mintermsString, dontCaresString);
    }

    @Test
    public void getMinimizedResult() throws Exception {
        Assert.assertEquals("SA", finalStageMinimizer.getMinimizedResult());
    }

}