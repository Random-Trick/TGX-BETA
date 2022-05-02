package p025bc;

import org.thunderdog.challegram.Log;
import qa.C8294g;
import qa.C8298k;

public final class C1352m {
    public static final C1353a f4932c = new C1353a(null);
    public int f4933a;
    public final int[] f4934b = new int[10];

    public static final class C1353a {
        public C1353a() {
        }

        public C1353a(C8294g gVar) {
            this();
        }
    }

    public final int m37572a(int i) {
        return this.f4934b[i];
    }

    public final int m37571b() {
        if ((this.f4933a & 2) != 0) {
            return this.f4934b[1];
        }
        return -1;
    }

    public final int m37570c() {
        if ((this.f4933a & Log.TAG_YOUTUBE) != 0) {
            return this.f4934b[7];
        }
        return 65535;
    }

    public final int m37569d() {
        if ((this.f4933a & 16) != 0) {
            return this.f4934b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int m37568e(int i) {
        return (this.f4933a & 32) != 0 ? this.f4934b[5] : i;
    }

    public final boolean m37567f(int i) {
        return ((1 << i) & this.f4933a) != 0;
    }

    public final void m37566g(C1352m mVar) {
        C8298k.m12934e(mVar, "other");
        for (int i = 0; i < 10; i++) {
            if (mVar.m37567f(i)) {
                m37565h(i, mVar.m37572a(i));
            }
        }
    }

    public final C1352m m37565h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f4934b;
            if (i < iArr.length) {
                this.f4933a = (1 << i) | this.f4933a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int m37564i() {
        return Integer.bitCount(this.f4933a);
    }
}
