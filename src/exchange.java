import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
        int a = 0;
        try(Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
        }catch(Exception e){System.out.println("You did enter incorrect number");}
        System.out.println(exchangeAmountOfCoinsBrutForce(a));
    }
    private static int exchangeAmountOfCoinsBrutForce(int a) {
        int stack;
        int count=0;
        if(a>0) {
            for (int i50 = 0; i50 <= a / 50; i50++) {
                for (int i25 = 0; i25 <= a / 25; i25++) {
                    for (int i10 = 0; i10 <= a / 10; i10++) {
                        for (int i5 = 0; i5 <= a / 5; i5++) {
                            for (int i2 = 0; i2 <= a / 2; i2++) {
                                for (int i1 = 0; i1 <= a; i1++) {
                                    stack = (i50 * 50 + i25 * 25 + i10 * 10 + i5 * 5 + i2 * 2 + i1);
                                    if (stack == a) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}