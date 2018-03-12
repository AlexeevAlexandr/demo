import java.util.Stack;

class stack {
    public static void main(String args[]) {
        Stack mystackl = new Stack();
        Stack mystack2 = new Stack();

        // push() inputting data
        for (int i = 0; i < 10; i++) mystackl.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // pop() outputting data
        System.out.print("Content Stack mystackl: ");
        for (int i = 0; i < 10; i++) System.out.print(mystackl.pop()+" ");
        System.out.println("\n");
        System.out.print("Content Stack mystack2: ");
        for (int i = 0; i < 10; i++) System.out.print(mystack2.pop()+" ");
    }
}