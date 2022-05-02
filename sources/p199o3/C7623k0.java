package p199o3;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p020b5.C1186a;

public final class C7623k0 {
    public final int f24399a;
    public final int f24400b;
    public final float f24401c;
    public final float f24402d;
    public final float f24403e;
    public final int f24404f;
    public final int f24405g;
    public final int f24406h;
    public final short[] f24407i;
    public short[] f24408j;
    public int f24409k;
    public short[] f24410l;
    public int f24411m;
    public short[] f24412n;
    public int f24413o;
    public int f24414p;
    public int f24415q;
    public int f24416r;
    public int f24417s;
    public int f24418t;
    public int f24419u;
    public int f24420v;

    public C7623k0(int i, int i2, float f, float f2, int i3) {
        this.f24399a = i;
        this.f24400b = i2;
        this.f24401c = f;
        this.f24402d = f2;
        this.f24403e = i / i3;
        this.f24404f = i / 400;
        int i4 = i / 65;
        this.f24405g = i4;
        int i5 = i4 * 2;
        this.f24406h = i5;
        this.f24407i = new short[i5];
        this.f24408j = new short[i5 * i2];
        this.f24410l = new short[i5 * i2];
        this.f24412n = new short[i5 * i2];
    }

    public static void m15440p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void m15455a(float f, int i) {
        int i2;
        int i3;
        if (this.f24411m != i) {
            int i4 = this.f24399a;
            int i5 = (int) (i4 / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            m15441o(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f24413o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f24414p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f24415q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f24410l = m15450f(this.f24410l, this.f24411m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f24400b;
                            if (i9 < i10) {
                                this.f24410l[(this.f24411m * i10) + i9] = m15442n(this.f24412n, (i10 * i6) + i9, i4, i5);
                                i9++;
                            }
                        }
                        this.f24415q++;
                        this.f24411m++;
                    }
                    int i11 = i2 + 1;
                    this.f24414p = i11;
                    if (i11 == i4) {
                        this.f24414p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C1186a.m38187f(z);
                        this.f24415q = 0;
                    }
                    i6++;
                } else {
                    m15435u(i7 - 1);
                    return;
                }
            }
        }
    }

    public final void m15454b(float f) {
        int m;
        int i = this.f24409k;
        if (i >= this.f24406h) {
            int i2 = 0;
            do {
                if (this.f24416r > 0) {
                    m = m15453c(i2);
                } else {
                    int g = m15449g(this.f24408j, i2);
                    if (f > 1.0d) {
                        m = g + m15433w(this.f24408j, i2, f, g);
                    } else {
                        m = m15443m(this.f24408j, i2, f, g);
                    }
                }
                i2 += m;
            } while (this.f24406h + i2 <= i);
            m15434v(i2);
        }
    }

    public final int m15453c(int i) {
        int min = Math.min(this.f24406h, this.f24416r);
        m15452d(this.f24408j, i, min);
        this.f24416r -= min;
        return min;
    }

    public final void m15452d(short[] sArr, int i, int i2) {
        short[] f = m15450f(this.f24410l, this.f24411m, i2);
        this.f24410l = f;
        int i3 = this.f24400b;
        System.arraycopy(sArr, i * i3, f, this.f24411m * i3, i3 * i2);
        this.f24411m += i2;
    }

    public final void m15451e(short[] sArr, int i, int i2) {
        int i3 = this.f24406h / i2;
        int i4 = this.f24400b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f24407i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] m15450f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f24400b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int m15449g(short[] sArr, int i) {
        int i2;
        int i3 = this.f24399a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f24400b == 1 && i4 == 1) {
            i2 = m15448h(sArr, i, this.f24404f, this.f24405g);
        } else {
            m15451e(sArr, i, i4);
            int h = m15448h(this.f24407i, 0, this.f24404f / i4, this.f24405g / i4);
            if (i4 != 1) {
                int i5 = h * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f24404f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f24405g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f24400b == 1) {
                    i2 = m15448h(sArr, i, i7, i8);
                } else {
                    m15451e(sArr, i, 1);
                    i2 = m15448h(this.f24407i, 0, i7, i8);
                }
            } else {
                i2 = h;
            }
        }
        int i11 = m15439q(this.f24419u, this.f24420v) ? this.f24417s : i2;
        this.f24418t = this.f24419u;
        this.f24417s = i2;
        return i11;
    }

    public final int m15448h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f24400b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f24419u = i5 / i7;
        this.f24420v = i8 / i6;
        return i7;
    }

    public void m15447i() {
        this.f24409k = 0;
        this.f24411m = 0;
        this.f24413o = 0;
        this.f24414p = 0;
        this.f24415q = 0;
        this.f24416r = 0;
        this.f24417s = 0;
        this.f24418t = 0;
        this.f24419u = 0;
        this.f24420v = 0;
    }

    public void m15446j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f24400b, this.f24411m);
        shortBuffer.put(this.f24410l, 0, this.f24400b * min);
        int i = this.f24411m - min;
        this.f24411m = i;
        short[] sArr = this.f24410l;
        int i2 = this.f24400b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public int m15445k() {
        return this.f24411m * this.f24400b * 2;
    }

    public int m15444l() {
        return this.f24409k * this.f24400b * 2;
    }

    public final int m15443m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f24416r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] f2 = m15450f(this.f24410l, this.f24411m, i4);
        this.f24410l = f2;
        int i5 = this.f24400b;
        System.arraycopy(sArr, i * i5, f2, this.f24411m * i5, i5 * i2);
        m15440p(i3, this.f24400b, this.f24410l, this.f24411m + i2, sArr, i + i2, sArr, i);
        this.f24411m += i4;
        return i3;
    }

    public final short m15442n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f24400b];
        int i4 = this.f24415q * i2;
        int i5 = this.f24414p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    public final void m15441o(int i) {
        int i2 = this.f24411m - i;
        short[] f = m15450f(this.f24412n, this.f24413o, i2);
        this.f24412n = f;
        short[] sArr = this.f24410l;
        int i3 = this.f24400b;
        System.arraycopy(sArr, i * i3, f, this.f24413o * i3, i3 * i2);
        this.f24411m = i;
        this.f24413o += i2;
    }

    public final boolean m15439q(int i, int i2) {
        return i != 0 && this.f24417s != 0 && i2 <= i * 3 && i * 2 > this.f24418t * 3;
    }

    public final void m15438r() {
        int i = this.f24411m;
        float f = this.f24401c;
        float f2 = this.f24402d;
        float f3 = f / f2;
        float f4 = this.f24403e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            m15454b(f3);
        } else {
            m15452d(this.f24408j, 0, this.f24409k);
            this.f24409k = 0;
        }
        if (f4 != 1.0f) {
            m15455a(f4, i);
        }
    }

    public void m15437s() {
        int i;
        int i2 = this.f24409k;
        float f = this.f24401c;
        float f2 = this.f24402d;
        int i3 = this.f24411m + ((int) ((((i2 / (f / f2)) + this.f24413o) / (this.f24403e * f2)) + 0.5f));
        this.f24408j = m15450f(this.f24408j, i2, (this.f24406h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f24406h;
            int i5 = this.f24400b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f24408j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f24409k += i * 2;
        m15438r();
        if (this.f24411m > i3) {
            this.f24411m = i3;
        }
        this.f24409k = 0;
        this.f24416r = 0;
        this.f24413o = 0;
    }

    public void m15436t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f24400b;
        int i2 = remaining / i;
        short[] f = m15450f(this.f24408j, this.f24409k, i2);
        this.f24408j = f;
        shortBuffer.get(f, this.f24409k * this.f24400b, ((i * i2) * 2) / 2);
        this.f24409k += i2;
        m15438r();
    }

    public final void m15435u(int i) {
        if (i != 0) {
            short[] sArr = this.f24412n;
            int i2 = this.f24400b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f24413o - i) * i2);
            this.f24413o -= i;
        }
    }

    public final void m15434v(int i) {
        int i2 = this.f24409k - i;
        short[] sArr = this.f24408j;
        int i3 = this.f24400b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f24409k = i2;
    }

    public final int m15433w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f24416r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] f2 = m15450f(this.f24410l, this.f24411m, i3);
        this.f24410l = f2;
        m15440p(i3, this.f24400b, f2, this.f24411m, sArr, i, sArr, i + i2);
        this.f24411m += i3;
        return i3;
    }
}
