package p078f9;

import java.nio.FloatBuffer;
import p064e9.AbstractC4175g;
import p064e9.C4172d;
import p106h9.C5039g;

public abstract class AbstractC4329b extends AbstractC4175g {
    public final float[] f14399d = C5039g.m24203c(C4172d.f14075a);
    public int f14400e;

    public abstract void mo28264a();

    public abstract int mo28269b();

    public final float[] m28268c() {
        return this.f14399d;
    }

    public abstract FloatBuffer mo28263d();

    public final int m28267e() {
        return this.f14400e;
    }

    public int m28266f() {
        return mo28263d().limit() / mo28269b();
    }

    public int m28265g() {
        return mo28269b() * 4;
    }
}
