import java.util.Scanner;

//returns the length of longest binary gap of nulls

class Solution{
    public static int solution(final int n) {
        String string = Integer.toBinaryString(n);
        int one = 0;
        int two = 0;
        for (int index = 0; index <string.length(); index ++) {
            if (string.charAt(index) == '0') {
                ++one;
            } else {
                two = Math.max(two, one);
                one = 0;
            }
        }
        if (one!=0) {
            if (one > two) {
                return one;
            }
        }
        return Math.max(two, one);
    }
}
class binary_count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();

        int w = Solution.solution(e);

        System.out.println(w);
    }
}