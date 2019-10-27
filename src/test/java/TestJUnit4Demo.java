import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJUnit4Demo {

    @BeforeClass
    public static void beforeAllTestCase(){
        System.out.println("beforeAllTestCase");
    }

    @AfterClass
    public static void afterAllTestCase(){
        System.out.println("afterAllTestCase");
    }

    @Before
    public void beforeTestCase(){
        System.out.println("i am @before");
    }

    @Test
    public void testDemo3(){
        System.out.println("testDemo3");
        assertTrue( false);
    }

    @Test
    public void testDemo(){
        System.out.println("testDemo1");
        assertTrue( true);
    }

    @Test
    public void testDemo2(){
        System.out.println("testDemo2");
        assertTrue( false);
    }

    @After
    public void afterTestCase(){
        System.out.println("i am @after");
    }
}
