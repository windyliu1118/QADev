package mock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.*;

public class MockTest {

    @Test
    public void testMockDemo(){
        //ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list = mock(ArrayList.class);
        list.add(4);
        list.add(5);

        when(list.size()).thenReturn(50);
        assertThat(list.size(), equalTo(50));

    }

    @Test
    public void testSpy() {
        ArrayList<Integer> list = mock(ArrayList.class);
        list.add(1);
        list.add(2);
        verify(list).add(3);

    }
}
