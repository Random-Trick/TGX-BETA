package p078f9;

import java.nio.FloatBuffer;
import p064e9.AbstractC4175g;
import p064e9.C4172d;
import p106h9.C5039g;

public abstract class AbstractC4329b extends AbstractC4175g {
    public final float[] f14399d = C5039g.m24204c(C4172d.f14075a);
    public int f14400e;

    public abstract void mo28266a();

    public abstract int mo28271b();

    public final float[] m28270c() {
        return this.f14399d;
    }

    public abstract FloatBuffer mo28265d();

    public final int m28269e() {
        return this.f14400e;
    }

    public int m28268f() {
        return mo28265d().limit() / mo28271b();
    }

    public int m28267g() {
        return mo28271b() * 4;
    }
}
