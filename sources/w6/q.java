package w6;

public abstract class q extends RuntimeException {
    public q(String str) {
        super(str);
    }

    public abstract int a();

    public q(Throwable th) {
        super(th);
    }
}
