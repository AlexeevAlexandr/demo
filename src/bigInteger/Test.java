package bigInteger;

import java.math.BigInteger;

class Test {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("10")};
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("10");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test2 {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("1")};
        BigInteger arg = new BigInteger("10");
        BigInteger expected = new BigInteger("1");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test3 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("1")
        };
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("2");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test4 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("0")
        };
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("1");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test5 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("0")
        };
        BigInteger arg = new BigInteger("2");
        BigInteger expected = new BigInteger("2");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test6 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("1")
        };
        BigInteger arg = new BigInteger("2");
        BigInteger expected = new BigInteger("3");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError(actual);
        }

        System.out.print("OK");
    }
}
class Test7 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("1"), new BigInteger("1")
        };
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("3");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}class Test8 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("1")
        };
        BigInteger arg = new BigInteger("2");
        BigInteger expected = new BigInteger("7");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}

