package p179m8;

import p093g8.C4530m;

public final class C6798d extends C4530m {
    public final float f21291c;
    public final int f21292d;

    public C6798d(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    public boolean m19016f(float f, float f2, float f3) {
        if (Math.abs(f2 - m27488d()) > f || Math.abs(f3 - m27489c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f21291c);
        return abs <= 1.0f || abs <= this.f21291c;
    }

    public C6798d m19015g(float f, float f2, float f3) {
        int i = this.f21292d;
        int i2 = i + 1;
        float c = (i * m27489c()) + f2;
        float f4 = i2;
        return new C6798d(c / f4, ((this.f21292d * m27488d()) + f) / f4, ((this.f21292d * this.f21291c) + f3) / f4, i2);
    }

    public int m19014h() {
        return this.f21292d;
    }

    public float m19013i() {
        return this.f21291c;
    }

    public C6798d(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f21291c = f3;
        this.f21292d = i;
    }
}
