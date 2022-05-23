package n8;

import h8.m;

public final class d extends m {
    public final float f17766c;
    public final int f17767d;

    public d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f17766c);
        return abs <= 1.0f || abs <= this.f17766c;
    }

    public d g(float f10, float f11, float f12) {
        int i10 = this.f17767d;
        int i11 = i10 + 1;
        float c10 = (i10 * c()) + f11;
        float f13 = i11;
        return new d(c10 / f13, ((this.f17767d * d()) + f10) / f13, ((this.f17767d * this.f17766c) + f12) / f13, i11);
    }

    public int h() {
        return this.f17767d;
    }

    public float i() {
        return this.f17766c;
    }

    public d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f17766c = f12;
        this.f17767d = i10;
    }
}
