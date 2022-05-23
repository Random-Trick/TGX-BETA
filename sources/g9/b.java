package g9;

import f9.d;
import f9.g;
import java.nio.FloatBuffer;

public abstract class b extends g {
    public final float[] f12168d = i9.g.c(d.f11871a);
    public int f12169e;

    public abstract void a();

    public abstract int b();

    public final float[] c() {
        return this.f12168d;
    }

    public abstract FloatBuffer d();

    public final int e() {
        return this.f12169e;
    }

    public int f() {
        return d().limit() / b();
    }

    public int g() {
        return b() * 4;
    }
}
