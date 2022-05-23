package k8;

import org.thunderdog.challegram.Log;

public final class a {
    public static final a f15721j;
    public static final a f15724m;
    public static final a f15725n;
    public static final a f15726o;
    public final int[] f15727a;
    public final int[] f15728b;
    public final b f15729c;
    public final b f15730d;
    public final int f15731e;
    public final int f15732f;
    public final int f15733g;
    public static final a f15719h = new a(4201, Log.TAG_EMOJI, 1);
    public static final a f15720i = new a(1033, Log.TAG_CAMERA, 1);
    public static final a f15722k = new a(19, 16, 1);
    public static final a f15723l = new a(285, Log.TAG_CRASH, 0);

    static {
        a aVar = new a(67, 64, 1);
        f15721j = aVar;
        a aVar2 = new a(301, Log.TAG_CRASH, 1);
        f15724m = aVar2;
        f15725n = aVar2;
        f15726o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f15732f = i10;
        this.f15731e = i11;
        this.f15733g = i12;
        this.f15727a = new int[i11];
        this.f15728b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f15727a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f15728b[this.f15727a[i15]] = i15;
        }
        this.f15729c = new b(this, new int[]{0});
        this.f15730d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f15729c;
        } else {
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    public int c(int i10) {
        return this.f15727a[i10];
    }

    public int d() {
        return this.f15733g;
    }

    public b e() {
        return this.f15730d;
    }

    public int f() {
        return this.f15731e;
    }

    public b g() {
        return this.f15729c;
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f15727a[(this.f15731e - this.f15728b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i10) {
        if (i10 != 0) {
            return this.f15728b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f15727a;
        int[] iArr2 = this.f15728b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f15731e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f15732f) + ',' + this.f15731e + ')';
    }
}
