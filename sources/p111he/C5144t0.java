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

    public void m23827f(int i, int i2, float f, float f2, int i3, float f3) {
        int i4 = this.f17229e;
        if (i4 == 0 || this.f17230f != i || this.f17231g != i2) {
            if (!(i4 == 0 || this.f17231g == 0)) {
                m23820m(i4);
            }
            m23824i(i, f, f2, i3, i2, f3);
        }
    }

    public void m23826g() {
        if (this.f17226b != null) {
            this.f17225a.clear();
            this.f17226b.release();
            this.f17226b = null;
        }
    }

    public void m23825h() {
        int i = this.f17229e;
        if (i != 0 && this.f17231g != 0) {
            m23820m(i);
            this.f17229e = 0;
        }
    }

    public int m23829d(int i) {
        if (this.f17226b == null) {
            this.f17226b = new SoundPool(1, this.f17228d, 0);
        }
        int i2 = this.f17225a.get(i);
        if (i2 != 0) {
            return i2;
        }
        int load = this.f17226b.load(C1379j0.m37315n(), i, 1);
        this.f17225a.put(i, load);
        return load;
    }

    public boolean m23828e() {
        return this.f17229e != 0;
    }

    public final int m23824i(int i, float f, float f2, int i2, int i3, float f3) {
        int d = m23829d(i);
        this.f17230f = i;
        SoundPool soundPool = this.f17226b;
        this.f17231g = i3;
        int play = soundPool.play(d, f, f2, i2, i3, f3);
        this.f17229e = play;
        return play;
    }

    public void m23823j(final int i, final float f, final float f2, final int i2, final int i3, final float f3) {
        this.f17227c.m28052e(new Runnable() {
            @Override
            public final void run() {
                C5144t0.this.m23827f(i, i3, f, f2, i2, f3);
            }
        }, 0L);
    }

    public void m23822k(int... iArr) {
        for (int i : iArr) {
            m23829d(i);
        }
    }

    public void m23821l() {
        this.f17227c.m28052e(new Runnable() {
            @Override
            public final void run() {
                C5144t0.this.m23826g();
            }
        }, 0L);
    }

    public void m23820m(int i) {
        this.f17226b.stop(i);
    }

    public void m23819n() {
        this.f17227c.m28052e(new Runnable() {
            @Override
            public final void run() {
                C5144t0.this.m23825h();
            }
        }, 0L);
    }
}
