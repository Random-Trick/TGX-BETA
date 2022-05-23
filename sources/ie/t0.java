package ie;

import android.media.SoundPool;
import android.util.SparseIntArray;
import ce.j0;
import gd.m;

public class t0 {
    public SoundPool f14284b;
    public final int f14286d;
    public int f14287e;
    public int f14288f;
    public int f14289g;
    public final SparseIntArray f14283a = new SparseIntArray(8);
    public final m f14285c = new m("SoundPoolMap");

    public t0(int i10) {
        this.f14286d = i10;
    }

    public void f(int i10, int i11, float f10, float f11, int i12, float f12) {
        int i13 = this.f14287e;
        if (i13 == 0 || this.f14288f != i10 || this.f14289g != i11) {
            if (!(i13 == 0 || this.f14289g == 0)) {
                m(i13);
            }
            i(i10, f10, f11, i12, i11, f12);
        }
    }

    public void g() {
        if (this.f14284b != null) {
            this.f14283a.clear();
            this.f14284b.release();
            this.f14284b = null;
        }
    }

    public void h() {
        int i10 = this.f14287e;
        if (i10 != 0 && this.f14289g != 0) {
            m(i10);
            this.f14287e = 0;
        }
    }

    public int d(int i10) {
        if (this.f14284b == null) {
            this.f14284b = new SoundPool(1, this.f14286d, 0);
        }
        int i11 = this.f14283a.get(i10);
        if (i11 != 0) {
            return i11;
        }
        int load = this.f14284b.load(j0.n(), i10, 1);
        this.f14283a.put(i10, load);
        return load;
    }

    public boolean e() {
        return this.f14287e != 0;
    }

    public final int i(int i10, float f10, float f11, int i11, int i12, float f12) {
        int d10 = d(i10);
        this.f14288f = i10;
        SoundPool soundPool = this.f14284b;
        this.f14289g = i12;
        int play = soundPool.play(d10, f10, f11, i11, i12, f12);
        this.f14287e = play;
        return play;
    }

    public void j(final int i10, final float f10, final float f11, final int i11, final int i12, final float f12) {
        this.f14285c.e(new Runnable() {
            @Override
            public final void run() {
                t0.this.f(i10, i12, f10, f11, i11, f12);
            }
        }, 0L);
    }

    public void k(int... iArr) {
        for (int i10 : iArr) {
            d(i10);
        }
    }

    public void l() {
        this.f14285c.e(new Runnable() {
            @Override
            public final void run() {
                t0.this.g();
            }
        }, 0L);
    }

    public void m(int i10) {
        this.f14284b.stop(i10);
    }

    public void n() {
        this.f14285c.e(new Runnable() {
            @Override
            public final void run() {
                t0.this.h();
            }
        }, 0L);
    }
}
