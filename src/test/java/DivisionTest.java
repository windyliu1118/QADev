import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class DivisionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divid() {
        Division division = new Division();
        assertThat(division.divid(10, 5), equalTo(2));
        assertThat(division.divid(1, 2), equalTo(0));

    }

    @Test
    public void dividReturnWithZero() {
        Division division = new Division();
        assertThat(division.divid(1, 2), equalTo(0));

    }


    @Test
    public void dividByException(){
        Division division = new Division();
        assertThat(division.divid(100, 0), equalTo(null));
    }

//    @Test
////    public void dividByDiviExceed100(){
////        Division division = new Division();
////        assertThat(division.divid(101, 20), equalTo(null));
////    }

}