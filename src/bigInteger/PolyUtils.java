package bigInteger;

import java.math.BigInteger;
import java.util.Arrays;

public class PolyUtils {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger result = BigInteger.valueOf(0);
        BigInteger [] array = new BigInteger[poly.length];
//        if (poly.length == 1){return poly[0];}
//        if (poly.length == 2){return (poly[0].multiply(arg)).add(poly[1]);}
//        if (poly.length == 3){return ((poly[0].multiply(arg)).multiply(arg)).add((poly[1]).multiply(arg)).add(poly[2]);}
//        if (poly.length == 4){return ((poly[0].multiply(arg)).multiply(arg).multiply(arg)).add((poly[1]).multiply(arg).multiply(arg)).add((poly[2]).multiply(arg)).add(poly[3]);}
        if (poly.length == 1){result = poly[0];}
        else {
            for (int i = 0; i < poly.length; i++) {
                BigInteger x = BigInteger.valueOf(1);
                for (int j = poly.length-1; j > i; j--) {

                    x = x.multiply(poly[i]).multiply(arg);
                }
                array[i] = x;
            }
            System.out.println(Arrays.toString(array));
            for (BigInteger anArray : array) {
                result = result.add(anArray);
            }
        }
        System.out.println(result);
        return result;
    }
}
