interface NumericTest {
        boolean test(int n);
}
interface NumericTest2{
        boolean test2(int t, int d);
}
class lambda {
        public static void main(String args[]) {
                NumericTest isEven = (n) -> (n % 2) == 0;
                if (isEven.test(10)) System.out.println("Number 10 is even");
                if (!isEven.test(9)) System.out.println("Number 9 is no even");

                NumericTest isNonNeg = (n) -> n >= 0;
                if (isNonNeg.test(1)) System.out.println("Number 1 is no negative");
                if (!isNonNeg.test(-1)) System.out.println("Number -1 is negative");

                NumericTest2 isFactor = ( t, d) -> (t % d) == 0;
                if (isFactor.test2(10,2)) System.out.println("Чиcлo 2 является множителем числа 10");
                if (!isFactor.test2(10,3)) System.out.println("Чиcлo З неявляется множителем числа 10");
        }
}

