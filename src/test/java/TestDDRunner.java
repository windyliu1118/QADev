import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


@RunWith(JUnitParamsRunner.class)

public class TestDDRunner {

    @Test
    @Parameters({
            "17, false",
            "18, true"
    })

    public void testDemo(int age, boolean valid){

        //assertThat("demo", actual, equalTo(expection));
    }
}
