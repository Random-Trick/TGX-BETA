package o3;

import b7.d;
import c5.l0;
import o3.b0;

public class d0 implements b0.d {
    public final int f18752b;
    public final int f18753c;
    public final int f18754d;
    public final int f18755e;
    public final int f18756f;
    public final int f18757g;

    public static class a {
        public int f18758a = 250000;
        public int f18759b = 750000;
        public int f18760c = 4;
        public int f18761d = 250000;
        public int f18762e = 50000000;
        public int f18763f = 2;

        public d0 g() {
            return new d0(this);
        }
    }

    public d0(a aVar) {
        this.f18752b = aVar.f18758a;
        this.f18753c = aVar.f18759b;
        this.f18754d = aVar.f18760c;
        this.f18755e = aVar.f18761d;
        this.f18756f = aVar.f18762e;
        this.f18757g = aVar.f18763f;
    }

    public static int b(int i10, int i11, int i12) {
        return d.d(((i10 * i11) * i12) / 1000000);
    }

    public static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override
    public int a(int i10, int i11, int i12, int i13, int i14, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14) * d10)) + i13) - 1) / i13) * i13;
    }

    public int c(int i10, int i11, int i12, int i13, int i14) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11);
        }
        throw new IllegalArgumentException();
    }

    public int e(int i10) {
        return d.d((this.f18756f * d(i10)) / 1000000);
    }

    public int f(int i10) {
        int i11 = this.f18755e;
        if (i10 == 5) {
            i11 *= this.f18757g;
        }
        return d.d((i11 * d(i10)) / 1000000);
    }

    public int g(int i10, int i11, int i12) {
        return l0.p(i10 * this.f18754d, b(this.f18752b, i11, i12), b(this.f18753c, i11, i12));
    }
}
