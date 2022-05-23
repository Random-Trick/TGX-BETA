package p6;

public final class g1 extends RuntimeException {
    public final int f20611a;

    public g1(String str) {
        super(str);
        this.f20611a = -1;
    }

    public g1(String str, int i10) {
        super(str);
        this.f20611a = i10;
    }

    public g1(String str, Exception exc) {
        super(str, exc);
        this.f20611a = -1;
    }

    public g1(String str, Exception exc, int i10) {
        super(str, exc);
        this.f20611a = i10;
    }
}
