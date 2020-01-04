package mock;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class AddTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addAsZero() {
        Add add = new Add();
        assertThat(add.add(0, 5), equalTo(null));

    }
//
//    @Test
//    public void AddAGreaterB() {
//        mock.Add add = new mock.Add();
//        assertThat(add.add(0, 5), equalTo(null));
//
//    }


    @Test
    public void addNormal(){
        Add add = new Add();
        assertThat(add.add(4, 5), equalTo(20));
    }



}
