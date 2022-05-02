package p136j8;

import org.thunderdog.challegram.Log;

public final class C5897a {
    public static final C5897a f18785j;
    public static final C5897a f18788m;
    public static final C5897a f18789n;
    public static final C5897a f18790o;
    public final int[] f18791a;
    public final int[] f18792b;
    public final C5898b f18793c;
    public final C5898b f18794d;
    public final int f18795e;
    public final int f18796f;
    public final int f18797g;
    public static final C5897a f18783h = new C5897a(4201, Log.TAG_EMOJI, 1);
    public static final C5897a f18784i = new C5897a(1033, Log.TAG_CAMERA, 1);
    public static final C5897a f18786k = new C5897a(19, 16, 1);
    public static final C5897a f18787l = new C5897a(285, Log.TAG_CRASH, 0);

    static {
        C5897a aVar = new C5897a(67, 64, 1);
        f18785j = aVar;
        C5897a aVar2 = new C5897a(301, Log.TAG_CRASH, 1);
        f18788m = aVar2;
        f18789n = aVar2;
        f18790o = aVar;
    }

    public C5897a(int i, int i2, int i3) {
        this.f18796f = i;
        this.f18795e = i2;
        this.f18797g = i3;
        this.f18791a = new int[i2];
        this.f18792b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f18791a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f18792b[this.f18791a[i6]] = i6;
        }
        this.f18793c = new C5898b(this, new int[]{0});
        this.f18794d = new C5898b(this, new int[]{1});
    }

    public static int m21890a(int i, int i2) {
        return i ^ i2;
    }

    public C5898b m21889b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f18793c;
        } else {
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C5898b(this, iArr);
        }
    }

    public int m21888c(int i) {
        return this.f18791a[i];
    }

    public int m21887d() {
        return this.f18797g;
    }

    public C5898b m21886e() {
        return this.f18794d;
    }

    public int m21885f() {
        return this.f18795e;
    }

    public C5898b m21884g() {
        return this.f18793c;
    }

    public int m21883h(int i) {
        if (i != 0) {
            return this.f18791a[(this.f18795e - this.f18792b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int m21882i(int i) {
        if (i != 0) {
            return this.f18792b[i];
        }
        throw new IllegalArgumentException();
    }

    public int m21881j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f18791a;
        int[] iArr2 = this.f18792b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f18795e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f18796f) + ',' + this.f18795e + ')';
    }
}
