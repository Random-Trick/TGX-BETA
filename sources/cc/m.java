package cc;

import org.thunderdog.challegram.Log;
import ra.g;
import ra.k;

public final class m {
    public static final a f5210c = new a(null);
    public int f5211a;
    public final int[] f5212b = new int[10];

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public final int a(int i10) {
        return this.f5212b[i10];
    }

    public final int b() {
        if ((this.f5211a & 2) != 0) {
            return this.f5212b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f5211a & Log.TAG_YOUTUBE) != 0) {
            return this.f5212b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f5211a & 16) != 0) {
            return this.f5212b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i10) {
        return (this.f5211a & 32) != 0 ? this.f5212b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f5211a) != 0;
    }

    public final void g(m mVar) {
        k.e(mVar, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.f(i10)) {
                h(i10, mVar.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f5212b;
            if (i10 < iArr.length) {
                this.f5211a = (1 << i10) | this.f5211a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f5211a);
    }
}
