package c5;

import java.nio.charset.Charset;
import java.util.Arrays;
import z6.d;

public final class b0 {
    public byte[] f4797a;
    public int f4798b;
    public int f4799c;

    public b0() {
        this.f4797a = l0.f4846f;
    }

    public String A(int i10) {
        return B(i10, d.f27014c);
    }

    public String B(int i10, Charset charset) {
        String str = new String(this.f4797a, this.f4798b, i10, charset);
        this.f4798b += i10;
        return str;
    }

    public int C() {
        return (D() << 21) | (D() << 14) | (D() << 7) | D();
    }

    public int D() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        this.f4798b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int E() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f4798b = i12 + 2;
        return i13;
    }

    public long F() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = i12 + 1;
        this.f4798b = i13;
        this.f4798b = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
    }

    public int G() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f4798b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int H() {
        int n10 = n();
        if (n10 >= 0) {
            return n10;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(n10);
        throw new IllegalStateException(sb2.toString());
    }

    public long I() {
        long w10 = w();
        if (w10 >= 0) {
            return w10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(w10);
        throw new IllegalStateException(sb2.toString());
    }

    public int J() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        this.f4798b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long K() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.f4797a[this.f4798b];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.f4797a[this.f4798b + i10] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & 63);
                } else {
                    StringBuilder sb2 = new StringBuilder(62);
                    sb2.append("Invalid UTF-8 sequence continuation byte: ");
                    sb2.append(j10);
                    throw new NumberFormatException(sb2.toString());
                }
            }
            this.f4798b += i11;
            return j10;
        }
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append("Invalid UTF-8 sequence first byte: ");
        sb3.append(j10);
        throw new NumberFormatException(sb3.toString());
    }

    public void L(int i10) {
        N(b() < i10 ? new byte[i10] : this.f4797a, i10);
    }

    public void M(byte[] bArr) {
        N(bArr, bArr.length);
    }

    public void N(byte[] bArr, int i10) {
        this.f4797a = bArr;
        this.f4799c = i10;
        this.f4798b = 0;
    }

    public void O(int i10) {
        a.a(i10 >= 0 && i10 <= this.f4797a.length);
        this.f4799c = i10;
    }

    public void P(int i10) {
        a.a(i10 >= 0 && i10 <= this.f4799c);
        this.f4798b = i10;
    }

    public void Q(int i10) {
        P(this.f4798b + i10);
    }

    public int a() {
        return this.f4799c - this.f4798b;
    }

    public int b() {
        return this.f4797a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f4797a = Arrays.copyOf(this.f4797a, i10);
        }
    }

    public byte[] d() {
        return this.f4797a;
    }

    public int e() {
        return this.f4798b;
    }

    public int f() {
        return this.f4799c;
    }

    public char g() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int h() {
        return this.f4797a[this.f4798b] & 255;
    }

    public void i(a0 a0Var, int i10) {
        j(a0Var.f4792a, 0, i10);
        a0Var.p(0);
    }

    public void j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f4797a, this.f4798b, bArr, i10, i11);
        this.f4798b += i11;
    }

    public String k(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f4798b;
        while (i10 < this.f4799c && this.f4797a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f4797a;
        int i11 = this.f4798b;
        String B = l0.B(bArr, i11, i10 - i11);
        this.f4798b = i10;
        if (i10 < this.f4799c) {
            this.f4798b = i10 + 1;
        }
        return B;
    }

    public double l() {
        return Double.longBitsToDouble(w());
    }

    public float m() {
        return Float.intBitsToFloat(n());
    }

    public int n() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        this.f4798b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f4798b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int o() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f4798b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f4798b;
        while (i10 < this.f4799c && !l0.k0(this.f4797a[i10])) {
            i10++;
        }
        int i11 = this.f4798b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f4797a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f4798b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f4797a;
        int i12 = this.f4798b;
        String B = l0.B(bArr2, i12, i10 - i12);
        this.f4798b = i10;
        int i13 = this.f4799c;
        if (i10 == i13) {
            return B;
        }
        byte[] bArr3 = this.f4797a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f4798b = i14;
            if (i14 == i13) {
                return B;
            }
        }
        int i15 = this.f4798b;
        if (bArr3[i15] == 10) {
            this.f4798b = i15 + 1;
        }
        return B;
    }

    public int q() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        this.f4798b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f4798b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long r() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = i12 + 1;
        this.f4798b = i13;
        int i14 = i13 + 1;
        this.f4798b = i14;
        int i15 = i14 + 1;
        this.f4798b = i15;
        int i16 = i15 + 1;
        this.f4798b = i16;
        int i17 = i16 + 1;
        this.f4798b = i17;
        this.f4798b = i17 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48) | ((bArr[i17] & 255) << 56);
    }

    public short s() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        this.f4798b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long t() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = i12 + 1;
        this.f4798b = i13;
        this.f4798b = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public int u() {
        int q10 = q();
        if (q10 >= 0) {
            return q10;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(q10);
        throw new IllegalStateException(sb2.toString());
    }

    public int v() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        this.f4798b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long w() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        int i12 = i11 + 1;
        this.f4798b = i12;
        int i13 = i12 + 1;
        this.f4798b = i13;
        int i14 = i13 + 1;
        this.f4798b = i14;
        int i15 = i14 + 1;
        this.f4798b = i15;
        int i16 = i15 + 1;
        this.f4798b = i16;
        int i17 = i16 + 1;
        this.f4798b = i17;
        this.f4798b = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (bArr[i17] & 255);
    }

    public String x() {
        return k((char) 0);
    }

    public String y(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f4798b;
        int i12 = (i11 + i10) - 1;
        String B = l0.B(this.f4797a, i11, (i12 >= this.f4799c || this.f4797a[i12] != 0) ? i10 : i10 - 1);
        this.f4798b += i10;
        return B;
    }

    public short z() {
        byte[] bArr = this.f4797a;
        int i10 = this.f4798b;
        int i11 = i10 + 1;
        this.f4798b = i11;
        this.f4798b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public b0(int i10) {
        this.f4797a = new byte[i10];
        this.f4799c = i10;
    }

    public b0(byte[] bArr) {
        this.f4797a = bArr;
        this.f4799c = bArr.length;
    }

    public b0(byte[] bArr, int i10) {
        this.f4797a = bArr;
        this.f4799c = i10;
    }
}
