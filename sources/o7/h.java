package o7;

public class h extends d7.h {
    public final a f19297a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public h(a aVar) {
        this.f19297a = aVar;
    }

    public h(String str, a aVar) {
        super(str);
        this.f19297a = aVar;
    }
}
