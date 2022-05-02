package p202o6;

import p219p6.C8053a;
import p300v6.AbstractC9866q;

public class C7657a extends AbstractC9866q {
    public final int f24545a;

    public C7657a(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i), C8053a.m13691a(i)));
        if (i != 0) {
            this.f24545a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @Override
    public int mo6730a() {
        return this.f24545a;
    }
}
