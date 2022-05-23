package o3;

import c5.a;
import java.nio.ShortBuffer;
import java.util.Arrays;

public final class l0 {
    public final int f18834a;
    public final int f18835b;
    public final float f18836c;
    public final float f18837d;
    public final float f18838e;
    public final int f18839f;
    public final int f18840g;
    public final int f18841h;
    public final short[] f18842i;
    public short[] f18843j;
    public int f18844k;
    public short[] f18845l;
    public int f18846m;
    public short[] f18847n;
    public int f18848o;
    public int f18849p;
    public int f18850q;
    public int f18851r;
    public int f18852s;
    public int f18853t;
    public int f18854u;
    public int f18855v;

    public l0(int i10, int i11, float f10, float f11, int i12) {
        this.f18834a = i10;
        this.f18835b = i11;
        this.f18836c = f10;
        this.f18837d = f11;
        this.f18838e = i10 / i12;
        this.f18839f = i10 / 400;
        int i13 = i10 / 65;
        this.f18840g = i13;
        int i14 = i13 * 2;
        this.f18841h = i14;
        this.f18842i = new short[i14];
        this.f18843j = new short[i14 * i11];
        this.f18845l = new short[i14 * i11];
        this.f18847n = new short[i14 * i11];
    }

    public static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f18846m != i10) {
            int i13 = this.f18834a;
            int i14 = (int) (i13 / f10);
            while (true) {
                if (i14 <= 16384 && i13 <= 16384) {
                    break;
                }
                i14 /= 2;
                i13 /= 2;
            }
            o(i10);
            int i15 = 0;
            while (true) {
                int i16 = this.f18848o;
                boolean z10 = true;
                if (i15 < i16 - 1) {
                    while (true) {
                        i11 = this.f18849p;
                        int i17 = (i11 + 1) * i14;
                        i12 = this.f18850q;
                        if (i17 <= i12 * i13) {
                            break;
                        }
                        this.f18845l = f(this.f18845l, this.f18846m, 1);
                        int i18 = 0;
                        while (true) {
                            int i19 = this.f18835b;
                            if (i18 < i19) {
                                this.f18845l[(this.f18846m * i19) + i18] = n(this.f18847n, (i19 * i15) + i18, i13, i14);
                                i18++;
                            }
                        }
                        this.f18850q++;
                        this.f18846m++;
                    }
                    int i20 = i11 + 1;
                    this.f18849p = i20;
                    if (i20 == i13) {
                        this.f18849p = 0;
                        if (i12 != i14) {
                            z10 = false;
                        }
                        a.f(z10);
                        this.f18850q = 0;
                    }
                    i15++;
                } else {
                    u(i16 - 1);
                    return;
                }
            }
        }
    }

    public final void b(float f10) {
        int m10;
        int i10 = this.f18844k;
        if (i10 >= this.f18841h) {
            int i11 = 0;
            do {
                if (this.f18851r > 0) {
                    m10 = c(i11);
                } else {
                    int g10 = g(this.f18843j, i11);
                    if (f10 > 1.0d) {
                        m10 = g10 + w(this.f18843j, i11, f10, g10);
                    } else {
                        m10 = m(this.f18843j, i11, f10, g10);
                    }
                }
                i11 += m10;
            } while (this.f18841h + i11 <= i10);
            v(i11);
        }
    }

    public final int c(int i10) {
        int min = Math.min(this.f18841h, this.f18851r);
        d(this.f18843j, i10, min);
        this.f18851r -= min;
        return min;
    }

    public final void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f18845l, this.f18846m, i11);
        this.f18845l = f10;
        int i12 = this.f18835b;
        System.arraycopy(sArr, i10 * i12, f10, this.f18846m * i12, i12 * i11);
        this.f18846m += i11;
    }

    public final void e(short[] sArr, int i10, int i11) {
        int i12 = this.f18841h / i11;
        int i13 = this.f18835b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f18842i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f18835b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f18834a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f18835b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f18839f, this.f18840g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f18842i, 0, this.f18839f / i13, this.f18840g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f18839f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f18840g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f18835b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f18842i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f18854u, this.f18855v) ? this.f18852s : i11;
        this.f18853t = this.f18854u;
        this.f18852s = i11;
        return i20;
    }

    public final int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f18835b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f18854u = i14 / i16;
        this.f18855v = i17 / i15;
        return i16;
    }

    public void i() {
        this.f18844k = 0;
        this.f18846m = 0;
        this.f18848o = 0;
        this.f18849p = 0;
        this.f18850q = 0;
        this.f18851r = 0;
        this.f18852s = 0;
        this.f18853t = 0;
        this.f18854u = 0;
        this.f18855v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f18835b, this.f18846m);
        shortBuffer.put(this.f18845l, 0, this.f18835b * min);
        int i10 = this.f18846m - min;
        this.f18846m = i10;
        short[] sArr = this.f18845l;
        int i11 = this.f18835b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f18846m * this.f18835b * 2;
    }

    public int l() {
        return this.f18844k * this.f18835b * 2;
    }

    public final int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f18851r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f18845l, this.f18846m, i13);
        this.f18845l = f11;
        int i14 = this.f18835b;
        System.arraycopy(sArr, i10 * i14, f11, this.f18846m * i14, i14 * i11);
        p(i12, this.f18835b, this.f18845l, this.f18846m + i11, sArr, i10 + i11, sArr, i10);
        this.f18846m += i13;
        return i12;
    }

    public final short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f18835b];
        int i13 = this.f18850q * i11;
        int i14 = this.f18849p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    public final void o(int i10) {
        int i11 = this.f18846m - i10;
        short[] f10 = f(this.f18847n, this.f18848o, i11);
        this.f18847n = f10;
        short[] sArr = this.f18845l;
        int i12 = this.f18835b;
        System.arraycopy(sArr, i10 * i12, f10, this.f18848o * i12, i12 * i11);
        this.f18846m = i10;
        this.f18848o += i11;
    }

    public final boolean q(int i10, int i11) {
        return i10 != 0 && this.f18852s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f18853t * 3;
    }

    public final void r() {
        int i10 = this.f18846m;
        float f10 = this.f18836c;
        float f11 = this.f18837d;
        float f12 = f10 / f11;
        float f13 = this.f18838e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f18843j, 0, this.f18844k);
            this.f18844k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public void s() {
        int i10;
        int i11 = this.f18844k;
        float f10 = this.f18836c;
        float f11 = this.f18837d;
        int i12 = this.f18846m + ((int) ((((i11 / (f10 / f11)) + this.f18848o) / (this.f18838e * f11)) + 0.5f));
        this.f18843j = f(this.f18843j, i11, (this.f18841h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f18841h;
            int i14 = this.f18835b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f18843j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f18844k += i10 * 2;
        r();
        if (this.f18846m > i12) {
            this.f18846m = i12;
        }
        this.f18844k = 0;
        this.f18851r = 0;
        this.f18848o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f18835b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f18843j, this.f18844k, i11);
        this.f18843j = f10;
        shortBuffer.get(f10, this.f18844k * this.f18835b, ((i10 * i11) * 2) / 2);
        this.f18844k += i11;
        r();
    }

    public final void u(int i10) {
        if (i10 != 0) {
            short[] sArr = this.f18847n;
            int i11 = this.f18835b;
            System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f18848o - i10) * i11);
            this.f18848o -= i10;
        }
    }

    public final void v(int i10) {
        int i11 = this.f18844k - i10;
        short[] sArr = this.f18843j;
        int i12 = this.f18835b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f18844k = i11;
    }

    public final int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f18851r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f18845l, this.f18846m, i12);
        this.f18845l = f11;
        p(i12, this.f18835b, f11, this.f18846m, sArr, i10, sArr, i10 + i11);
        this.f18846m += i12;
        return i12;
    }
}
