package p179m8;

import p093g8.C4530m;

public final class C6795a extends C4530m {
    public final float f21279c;

    public C6795a(float f, float f2, float f3) {
        super(f, f2);
        this.f21279c = f3;
    }

    public boolean m19033f(float f, float f2, float f3) {
        if (Math.abs(f2 - m27488d()) > f || Math.abs(f3 - m27489c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f21279c);
        return abs <= 1.0f || abs <= this.f21279c;
    }

    public C6795a m19032g(float f, float f2, float f3) {
        return new C6795a((m27489c() + f2) / 2.0f, (m27488d() + f) / 2.0f, (this.f21279c + f3) / 2.0f);
    }
}
