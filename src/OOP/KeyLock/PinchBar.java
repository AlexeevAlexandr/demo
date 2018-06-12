package OOP.KeyLock;

public class PinchBar implements Key {

    @Override
    public String getCode() {
        System.out.println("bang!!!");
        return "bang!!!";
    }
}

