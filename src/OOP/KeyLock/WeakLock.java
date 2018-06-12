package OOP.KeyLock;

public class WeakLock extends LockImpl implements Lock {

    WeakLock(String secret) {
        super(secret);
    }

    @Override
    public void unlock(Key key) {
        if (key.getCode().contains("bang")) {
            opened = true;
        } else {
            super.unlock(key);
        }
    }
}
