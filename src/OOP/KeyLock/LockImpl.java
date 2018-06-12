package OOP.KeyLock;

public class LockImpl implements Lock {

    boolean opened = true;
    private String secret;

    LockImpl(String secret) {
        this.secret = secret;
    }

    @Override
    public void unlock(Key key) {
        if (key.getCode().equals(secret)) {
            opened = !opened;
        }
    }

    @Override
    public boolean isOpened() {
        return opened;
    }
}
