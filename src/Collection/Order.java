package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Order{

    public static int calculate(Collection<Integer> numbers){
        int summ = 0;
        for (Integer number : numbers) {
            summ += number;
        }
        return  summ;
    }
    public static void main(String[] args) {
        Collection<Box<String>> shipping = new ArrayList<>();
        Box<String> box = new Box<>();
        shipping.add(box);


    }
}
class Box <Alexei>{

    void add(Alexei item){
    }

    Alexei get(){
        throw new UnsupportedOperationException("not implemented");
    }

}
