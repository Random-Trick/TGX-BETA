package p174m3;

public final class C6590e1 extends RuntimeException {
    public final int f20521a;

    public C6590e1(int i) {
        super(m19933a(i));
        this.f20521a = i;
    }

    public static String m19933a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
