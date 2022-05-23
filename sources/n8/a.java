package n8;

import h8.m;

public final class a extends m {
    public final float f17754c;

    public a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f17754c = f12;
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f17754c);
        return abs <= 1.0f || abs <= this.f17754c;
    }

    public a g(float f10, float f11, float f12) {
        return new a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f17754c + f12) / 2.0f);
    }
}
