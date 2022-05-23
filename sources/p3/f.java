package p3;

public class f extends Exception {
    public f(String str) {
        super(str);
    }

    public f(Throwable th) {
        super(th);
    }

    public f(String str, Throwable th) {
        super(str, th);
    }
}
