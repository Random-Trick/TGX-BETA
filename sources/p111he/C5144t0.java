package p111he;

import android.media.SoundPool;
import android.util.SparseIntArray;
import be.C1379j0;
import p082fd.C4384m;

public class C5144t0 {
    public SoundPool f17226b;
    public final int f17228d;
    public int f17229e;
    public int f17230f;
    public int f17231g;
    public final SparseIntArray f17225a = new SparseIntArray(8);
    public final C4384m f17227c = new C4384m("SoundPoolMap");

    public C5144t0(int i) {
        this.f17228d = i;
    }

    public void m23828f(int i, int i2, float f, float f2, int i3, float f3) {
        int i4 = this.f17229e;
        if (i4 == 0 || this.f17230f != i || this.f17231g != i2) {
            if (!(i4 == 0 || this.f17231g == 0)) {
                m23821m(i4);
            }
            m23825i(i, f, f2, i3, i2, f3);
        }
    }

    public void m23827g() {
        if (this.f17226b != null) {
            this.f17225a.clear();
            this.f17226b.release();
            this.f17226b = null;
        }
    }

    public void m23826h() {
        int i = this.f17229e;
        if (i != 0 && this.f17231g != 0) {
            m23821m(i);
            this.f17229e = 0;
        }
    }

    public int m23830d(int i) {
        if (this.f17226b == null) {
            this.f17226b = new SoundPool(1, this.f17228d, 0);
        }
        int i2 = this.f17225a.get(i);
        if (i2 != 0) {
            return i2;
        }
        int load = this.f17226b.load(C1379j0.m37318n(), i, 1);
        this.f17225a.put(i, load);
        return load;
    }

    public boolean m23829e() {
        return this.f17229e != 0;
    }

    public final int m23825i(int i, float f, float f2, int i2, int i3, float f3) {
        int d = m23830d(i);
        this.f17230f = i;
        SoundPool soundPool = this.f17226b;
        this.f17231g = i3;
        int play = soundPool.play(d, f, f2, i2, i3, f3);
        this.f17229e = play;
        return play;
    }

    public void m23824j(final int i, final float f, final float f2, final int i2, final int i3, final float f3) {
        this.f17227c.m28054e(new Runnable() {
            @Override
            public final void run() {
                C5144t0.this.m23828f(i, i3, f, f2, i2, f3);
            }
        }, 0L);
    }

    public void m23823k(int... iArr) {
        for (int i : iArr) {
            m23830d(i);
        }
    }

    public void m23822l() {
        this.f17227c.m28054e(new Runnable() {
            @Override
            public final void run() {
                C5144t0.this.m23827g();
            }
        }, 0L);
    }

    public void m23821m(int i) {
        this.f17226b.stop(i);
    }

    public void m23820n() {
        this.f17227c.m28054e(new Runnable() {
            @Override
            public final void run() {
                C5144t0.this.m23826h();
            }
        }, 0L);
    }
}
