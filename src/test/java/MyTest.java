import org.apache.commons.math3.util.MathArrays;

import static org.junit.Assert.fail;

public class MyTest {
    public static void main(String[] args) {
        MyTest mt = new MyTest();
        mt.testcheckPositive(1, -1);
        System.out.println("---------------- --");
        mt.testMathArrays1();
        System.out.println("--------------- ---");
        mt.testMathArrays2();

    }

    public void testcheckPositive(int x, int y) {
        double[] a = {-1, 2, 3, 4};
        if (MathArrays.checkPositive(a)) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 0) {
                    System.out.println("函数错误 ");
                    return;
                }
            }
        }
    }

    public void testMathArrays1() {
        float[] a = {1.000000000000001f, 2.0f, 3.0f, 4.0f, 5.0f};
        float[] b = {1.000000000000000999999f, 2.0f, 3.0f, 4.0f, 5.0f};
        if (MathArrays.equals(a,b)) {
            System.out.println("数组相等函数错误");
        } else {
            System.out.println("数组相等函数实现");
        }
    }

    public void testMathArrays2() {
        double[] a = {1.000000000000001, 2.0, 3.0, 4.0, 5.0};
        double[] b = {1.000000000000000999999, 2.0, 3.0, 4.0, 5.0};
        if (MathArrays.equals(a,b)) {
            System.out.println("数组相等函数错误");
        } else {
            System.out.println("数组相等函数实现");
        }
    }
}
