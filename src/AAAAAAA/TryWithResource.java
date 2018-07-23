package AAAAAAA;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
        Throwable throwable = new Throwable();
        boolean isCloseA = false;
        AutoCloseable a;
        AutoCloseable b;

        try {
            a = factoryA.create();
            try {
                b = factoryB.create();
                try {
                    body.runBody();
                }catch (Throwable bodyEx) {
                    try {
                        b.close();
                    }catch (Throwable closeExB) {
                        bodyEx.addSuppressed(closeExB);
                    }
                    try {
                        isCloseA = true;
                        a.close();
                    }catch (Throwable closeExA) {bodyEx.addSuppressed(closeExA);}
                    throw bodyEx;
                }
                try {
                    b.close();
                }catch (Throwable closeExB) { throwable.addSuppressed(closeExB);}
                try {
                    isCloseA = true;
                    a.close();
                }catch (Throwable closeExA) { throwable.addSuppressed(closeExA);}
            }catch (Throwable closeExB) {
                try{
                    if( !isCloseA ) { a.close(); }
                }catch (Throwable closeExA) { throwable.addSuppressed(closeExA);}
                throwable.addSuppressed(closeExB);
            }
        }catch (Throwable closeExA) {
            if ( !isCloseA ) { throwable.addSuppressed(closeExA);}
        }
    }
}
interface AutoCloseableFactory {
    AutoCloseable create() throws Throwable;
}

interface TryBody {
    void runBody() throws Throwable;
}