import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJUnit4DemoChildren extends TestJUnit4Demo{

    @BeforeClass
    public static void beforeAllTestCaseChildren(){
        System.out.println("TestJUnit4DemoChildren beforeAllTestCase");
    }

    @AfterClass
    public static void afterAllTestCaseChildren(){
        System.out.println("TestJUnit4DemoChildren afterAllTestCase");
    }

    @Before
    public void beforeTestCaseChildren(){
        System.out.println("TestJUnit4DemoChildren i am @before");
    }

    @Test
    public void testDemo3Children(){
        System.out.println("TestJUnit4DemoChildren testDemo3");
        assertTrue( false);
    }

    @Test
    public void testDemoChildren(){
        System.out.println("TestJUnit4DemoChildren testDemo1");
        assertTrue( true);
    }

    @Test
    public void testDemo2Children(){
        System.out.println("TestJUnit4DemoChildren testDemo2");
        assertTrue( false);
    }

    @After
    public void afterTestCaseChildren(){
        System.out.println("TestJUnit4DemoChildren i am @after");
    }
}
