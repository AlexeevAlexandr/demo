package OOP.KeyLock;

import java.util.Arrays;

public class ClassicIronBilletKey extends IronBilletKey {

    private int[] notch;

    public ClassicIronBilletKey(int... notch) {
        this.notch = notch;
    }

    @Override
    int[] getNotch() {
        return notch;
    }

    @Override
    public String toString() {
        return "I am ClassicIronBilletQwe with notch " + Arrays.toString(notch);
    }
}
