import org.apache.commons.math3.analysis.function.Abs;
import org.apache.commons.math3.util.MathArrays;

import java.util.Arrays;

import static org.junit.Assert.*;

@SuppressWarnings({"all"})
public class MyJunitTest {

    @org.junit.Test
    public void testcheckPositive() {
        double[] a = {-1, 2, 3, 4};
        if (MathArrays.checkPositive(a)) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    fail("函数错误");
                }
            }
        }
    }

    @org.junit.Test
    public void testMathArrays1() {
        float[] a = {1.000000000000001f, 2.0f, 3.0f, 4.0f, 5.0f};
        float[] b = {1.000000000000000999999f, 2.0f, 3.0f, 4.0f, 5.0f};
        if (MathArrays.equals(a, b)) {
            fail("函数错误...");
        }
    }

    @org.junit.Test
    public void testMathArrays2() {
        double[] a = {1.000000000000001, 2.0, 3.0, 4.0, 5.0};
        double[] b = {1.000000000000000999999, 2.0, 3.0, 4.0, 5.0};
        if (MathArrays.equals(a, b)) {
            fail("函数错误...");
        }
    }
}