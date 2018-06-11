import java.util.Arrays;

public class MyArray{
    private  Object [] data;//create array of objects

    public MyArray(int length){ data = new Object [length];}//allow to set size of array
    private MyArray(MyArray source){
        data = new Object [source.data.length];
        System.arraycopy(source.data, 0, data, 0, source.data.length);
    }

    MyArray() {data = new Object[0];}
    public Object get (int index){return data[index];}//allow get object
    public void change (int index, int newValue){data [index] = newValue;}//allow change object in the specified index
    public void add(Object newValue){add(data.length, newValue);}//allow add object to array
    public MyArray copy(){return new MyArray(this);}//allow copy array
    public void remove (int index) {//allow remove object
        Object[] array2 = new Object[data.length - 1];
        System.arraycopy(data, 0, array2, 0, index);
        System.arraycopy(data, index + 1, array2, index + 1 - 1, data.length - (index + 1));
        data = array2;
    }
    public void add(int index, Object newValue){//allow add object to the array in the specified index
        Object[] array2 = new Object[data.length + 1];
        System.arraycopy(data, 0, array2, 0, index);
        array2[index] = newValue;
        System.arraycopy(data, index, array2, index + 1, data.length - index);
        data = array2;
    }

    public int size (){return data.length;}//allow get size of array
    @Override
    public String toString() {return Arrays.toString(data);}//allow print array use only "toString()"
}
class Commit{
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(null);
        array.add(true);
        array.add("rt");
        System.out.println(array.toString());
        array.remove(3);
        System.out.println(array.toString());
        array.add(2, 10);
        System.out.println(array.toString());
        array.change(3, 0);
        System.out.println(array.toString());
        System.out.println(array.size());
        System.out.println(array.copy());
        System.out.println(array.get(2));

    }
}