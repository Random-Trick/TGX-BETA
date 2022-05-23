package yd;

import ae.j;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ib.d;
import ie.m;

public abstract class e extends Drawable implements m {
    public static final boolean O = false;
    public final float M;
    public final boolean N;
    public int f26705a;
    public float f26706b;
    public int f26707c;

    public e(int i10, float f10, boolean z10) {
        this.f26705a = i10;
        this.M = f10;
        this.N = z10;
    }

    @Override
    public void a(int i10, int i11, float f10) {
        if (this.f26705a != i10 || this.f26706b != f10 || (this.f26707c != i11 && f10 > 0.0f)) {
            this.f26705a = i10;
            this.f26706b = f10;
            this.f26707c = i11;
        }
    }

    @Override
    public final int b() {
        float f10 = this.f26706b;
        int i10 = 0;
        if (f10 == 0.0f) {
            int i11 = this.f26705a;
            if (i11 != 0) {
                i10 = j.L(i11);
            }
        } else if (f10 == 1.0f) {
            int i12 = this.f26707c;
            if (i12 != 0) {
                i10 = j.L(i12);
            }
        } else {
            int i13 = this.f26705a;
            int L = i13 != 0 ? j.L(i13) : 0;
            int i14 = this.f26707c;
            if (i14 != 0) {
                i10 = j.L(i14);
            }
            i10 = d.d(L, i10, this.f26706b);
        }
        return this.N ? d.c(i10, 1084268704) : i10;
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i10) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
