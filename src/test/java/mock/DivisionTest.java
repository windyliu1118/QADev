package mock;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DivisionTest {

    Division2 division2 = new Division2();
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
////        mock.Division division = new mock.Division();
////        assertThat(division.divid(101, 20), equalTo(null));
////    }

    @Test
    public void divid2(){
        Division division = new Division();
        assertThat(division2.divid2(100, 10, 5, division), equalTo(2));
        Division mockDivision = mock(Division.class);
        when(mockDivision.divid(0, 0)).thenReturn(11);
        System.out.println(mockDivision.divid(2, 1));
        //division2.divid2(10, 2, 5, division);

        assertThat(division2.divid2(0, 0, 5, mockDivision), equalTo(0));
    }

}