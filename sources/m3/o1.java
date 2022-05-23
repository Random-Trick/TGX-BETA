package m3;

public final class o1 extends RuntimeException {
    public final int f16854a;

    public o1(int i10) {
        super(a(i10));
        this.f16854a = i10;
    }

    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
