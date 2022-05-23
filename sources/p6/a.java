package p6;

import w6.q;

public class a extends q {
    public final int f20519a;

    public a(int i10) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i10), q6.a.a(i10)));
        if (i10 != 0) {
            this.f20519a = i10;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @Override
    public int a() {
        return this.f20519a;
    }
}
