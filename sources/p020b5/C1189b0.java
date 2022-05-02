package p020b5;

import java.nio.charset.Charset;
import java.util.Arrays;
import p343y6.C10428d;

public final class C1189b0 {
    public byte[] f4474a;
    public int f4475b;
    public int f4476c;

    public C1189b0() {
        this.f4474a = C1216l0.f4531f;
    }

    public String m38159A(int i) {
        return m38158B(i, C10428d.f33498c);
    }

    public String m38158B(int i, Charset charset) {
        String str = new String(this.f4474a, this.f4475b, i, charset);
        this.f4475b += i;
        return str;
    }

    public int m38157C() {
        return (m38156D() << 21) | (m38156D() << 14) | (m38156D() << 7) | m38156D();
    }

    public int m38156D() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        this.f4475b = i + 1;
        return bArr[i] & 255;
    }

    public int m38155E() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f4475b = i3 + 2;
        return i4;
    }

    public long m38154F() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = i3 + 1;
        this.f4475b = i4;
        this.f4475b = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    public int m38153G() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f4475b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public int m38152H() {
        int n = m38129n();
        if (n >= 0) {
            return n;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(n);
        throw new IllegalStateException(sb2.toString());
    }

    public long m38151I() {
        long w = m38120w();
        if (w >= 0) {
            return w;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(w);
        throw new IllegalStateException(sb2.toString());
    }

    public int m38150J() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        this.f4475b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public long m38149K() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f4474a[this.f4475b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.f4474a[this.f4475b + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    StringBuilder sb2 = new StringBuilder(62);
                    sb2.append("Invalid UTF-8 sequence continuation byte: ");
                    sb2.append(j);
                    throw new NumberFormatException(sb2.toString());
                }
            }
            this.f4475b += i2;
            return j;
        }
        StringBuilder sb3 = new StringBuilder(55);
        sb3.append("Invalid UTF-8 sequence first byte: ");
        sb3.append(j);
        throw new NumberFormatException(sb3.toString());
    }

    public void m38148L(int i) {
        m38146N(m38141b() < i ? new byte[i] : this.f4474a, i);
    }

    public void m38147M(byte[] bArr) {
        m38146N(bArr, bArr.length);
    }

    public void m38146N(byte[] bArr, int i) {
        this.f4474a = bArr;
        this.f4476c = i;
        this.f4475b = 0;
    }

    public void m38145O(int i) {
        C1186a.m38189a(i >= 0 && i <= this.f4474a.length);
        this.f4476c = i;
    }

    public void m38144P(int i) {
        C1186a.m38189a(i >= 0 && i <= this.f4476c);
        this.f4475b = i;
    }

    public void m38143Q(int i) {
        m38144P(this.f4475b + i);
    }

    public int m38142a() {
        return this.f4476c - this.f4475b;
    }

    public int m38141b() {
        return this.f4474a.length;
    }

    public void m38140c(int i) {
        if (i > m38141b()) {
            this.f4474a = Arrays.copyOf(this.f4474a, i);
        }
    }

    public byte[] m38139d() {
        return this.f4474a;
    }

    public int m38138e() {
        return this.f4475b;
    }

    public int m38137f() {
        return this.f4476c;
    }

    public char m38136g() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int m38135h() {
        return this.f4474a[this.f4475b] & 255;
    }

    public void m38134i(C1187a0 a0Var, int i) {
        m38133j(a0Var.f4469a, 0, i);
        a0Var.m38165p(0);
    }

    public void m38133j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f4474a, this.f4475b, bArr, i, i2);
        this.f4475b += i2;
    }

    public String m38132k(char c) {
        if (m38142a() == 0) {
            return null;
        }
        int i = this.f4475b;
        while (i < this.f4476c && this.f4474a[i] != c) {
            i++;
        }
        byte[] bArr = this.f4474a;
        int i2 = this.f4475b;
        String B = C1216l0.m38019B(bArr, i2, i - i2);
        this.f4475b = i;
        if (i < this.f4476c) {
            this.f4475b = i + 1;
        }
        return B;
    }

    public double m38131l() {
        return Double.longBitsToDouble(m38120w());
    }

    public float m38130m() {
        return Float.intBitsToFloat(m38129n());
    }

    public int m38129n() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        this.f4475b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f4475b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public int m38128o() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f4475b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public String m38127p() {
        if (m38142a() == 0) {
            return null;
        }
        int i = this.f4475b;
        while (i < this.f4476c && !C1216l0.m37967j0(this.f4474a[i])) {
            i++;
        }
        int i2 = this.f4475b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f4474a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f4475b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f4474a;
        int i3 = this.f4475b;
        String B = C1216l0.m38019B(bArr2, i3, i - i3);
        this.f4475b = i;
        int i4 = this.f4476c;
        if (i == i4) {
            return B;
        }
        byte[] bArr3 = this.f4474a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f4475b = i5;
            if (i5 == i4) {
                return B;
            }
        }
        int i6 = this.f4475b;
        if (bArr3[i6] == 10) {
            this.f4475b = i6 + 1;
        }
        return B;
    }

    public int m38126q() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        this.f4475b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f4475b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    public long m38125r() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = i3 + 1;
        this.f4475b = i4;
        int i5 = i4 + 1;
        this.f4475b = i5;
        int i6 = i5 + 1;
        this.f4475b = i6;
        int i7 = i6 + 1;
        this.f4475b = i7;
        int i8 = i7 + 1;
        this.f4475b = i8;
        this.f4475b = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((bArr[i8] & 255) << 56);
    }

    public short m38124s() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        this.f4475b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public long m38123t() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = i3 + 1;
        this.f4475b = i4;
        this.f4475b = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public int m38122u() {
        int q = m38126q();
        if (q >= 0) {
            return q;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(q);
        throw new IllegalStateException(sb2.toString());
    }

    public int m38121v() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        this.f4475b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public long m38120w() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        int i3 = i2 + 1;
        this.f4475b = i3;
        int i4 = i3 + 1;
        this.f4475b = i4;
        int i5 = i4 + 1;
        this.f4475b = i5;
        int i6 = i5 + 1;
        this.f4475b = i6;
        int i7 = i6 + 1;
        this.f4475b = i7;
        int i8 = i7 + 1;
        this.f4475b = i8;
        this.f4475b = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
    }

    public String m38119x() {
        return m38132k((char) 0);
    }

    public String m38118y(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f4475b;
        int i3 = (i2 + i) - 1;
        String B = C1216l0.m38019B(this.f4474a, i2, (i3 >= this.f4476c || this.f4474a[i3] != 0) ? i : i - 1);
        this.f4475b += i;
        return B;
    }

    public short m38117z() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        this.f4475b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public C1189b0(int i) {
        this.f4474a = new byte[i];
        this.f4476c = i;
    }

    public C1189b0(byte[] bArr) {
        this.f4474a = bArr;
        this.f4476c = bArr.length;
    }

    public C1189b0(byte[] bArr, int i) {
        this.f4474a = bArr;
        this.f4476c = i;
    }
}
