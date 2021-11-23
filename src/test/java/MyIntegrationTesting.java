import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runners.Suite;


@Suite.SuiteClasses({MyJunitTest.class})
public class MyIntegrationTesting {
    public static Test suite(){
        TestSuite suite = new TestSuite("ALL JUnit test");
        suite.addTest(new JUnit4TestAdapter(MyJunitTest.class));
        return suite;
    }
}
