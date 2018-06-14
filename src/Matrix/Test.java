package Matrix;

import java.util.Arrays;

public class Test {
    public static void main1() {
        int[][][] oldArray = {
                {
                        {1, 2},
                        {3, 4},
                },
                {
                        {5, 6},
                        {7, 8},
                },
        };
        int[][][] newExpectedArray = {
                {
                        {1, 5},
                        {2, 6},
                },
                {
                        {3, 7},
                        {4, 8},
                },
        };
        int[][][] newActualArray = Matrix.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.println("OK");
    }

    public static void main2() {
        int[][][] oldArray = {{{1}}};
        int[][][] newExpectedArray = {{{1}}};
        int[][][] newActualArray = Matrix.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.println("OK");
    }

    public static void main3() {
        int[][][] matrix = new int[1][1][0];
        Object res = Matrix.rotateClockwise(matrix);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }

    public static void main4() {
        int[][][] matrix = null;
        Object res = Matrix.rotateClockwise(matrix);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }

    public static void main5() {
        int[][][] matrix = new int[0][][];
        Object res = Matrix.rotateClockwise(matrix);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }

    public static void main6() {
        int[][][] matrix = new int[10][10][11];
        Object res = Matrix.rotateClockwise(matrix);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }

    public static void main7() {
        int[][][] oldArray = {
                {
                        {10, 11, 12},
                        {20, 21, 22},
                        {30, 31, 32}},

                {
                        {40, 41, 42},
                        {50, 51, 52},
                        {60, 61, 62}
                },

                {
                        {70, 71, 72},
                        {80, 81, 82},
                        {90, 91, 92}
                }
        };
        int[][][] newExpectedArray = {
                {
                        {10, 40, 70},
                        {11, 41, 71},
                        {12, 42, 72}},

                {
                        {20, 50, 80},
                        {21, 51, 81},
                        {22, 52, 82}},

                {
                        {30, 60, 90},
                        {31, 61, 91},
                        {32, 62, 92}
                }
        };
        int[][][] newActualArray = Matrix.rotateClockwise(oldArray);

        if (!Arrays.deepEquals(newActualArray, newExpectedArray)) {
            throw new AssertionError();
        }

        System.out.println("OK");
    }

    public static void main8() {
        int[][][] matrix = new int[][][]{{{0, 0}, {0, 0}}, {{0, 0}, {0}}};
        Object res = Matrix.rotateClockwise(matrix);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }

    public static void main9() {
        int[][][] matrix = new int[][][]{{{0, 0}, {0, 0}}, {{0, 0}, {0, 0, 0}}};
        Object res = Matrix.rotateClockwise(matrix);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }
}
class run{
    public static void main(String[] args) {
        Test.main1();
        Test.main2();
        Test.main3();
        Test.main4();
        Test.main5();
        Test.main6();
        Test.main7();
        Test.main8();
        Test.main9();
    }
}