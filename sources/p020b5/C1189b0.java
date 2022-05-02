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

    public String m38162A(int i) {
        return m38161B(i, C10428d.f33501c);
    }

    public String m38161B(int i, Charset charset) {
        String str = new String(this.f4474a, this.f4475b, i, charset);
        this.f4475b += i;
        return str;
    }

    public int m38160C() {
        return (m38159D() << 21) | (m38159D() << 14) | (m38159D() << 7) | m38159D();
    }

    public int m38159D() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        this.f4475b = i + 1;
        return bArr[i] & 255;
    }

    public int m38158E() {
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

    public long m38157F() {
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

    public int m38156G() {
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

    public int m38155H() {
        int n = m38132n();
        if (n >= 0) {
            return n;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(n);
        throw new IllegalStateException(sb2.toString());
    }

    public long m38154I() {
        long w = m38123w();
        if (w >= 0) {
            return w;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(w);
        throw new IllegalStateException(sb2.toString());
    }

    public int m38153J() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        this.f4475b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public long m38152K() {
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

    public void m38151L(int i) {
        m38149N(m38144b() < i ? new byte[i] : this.f4474a, i);
    }

    public void m38150M(byte[] bArr) {
        m38149N(bArr, bArr.length);
    }

    public void m38149N(byte[] bArr, int i) {
        this.f4474a = bArr;
        this.f4476c = i;
        this.f4475b = 0;
    }

    public void m38148O(int i) {
        C1186a.m38192a(i >= 0 && i <= this.f4474a.length);
        this.f4476c = i;
    }

    public void m38147P(int i) {
        C1186a.m38192a(i >= 0 && i <= this.f4476c);
        this.f4475b = i;
    }

    public void m38146Q(int i) {
        m38147P(this.f4475b + i);
    }

    public int m38145a() {
        return this.f4476c - this.f4475b;
    }

    public int m38144b() {
        return this.f4474a.length;
    }

    public void m38143c(int i) {
        if (i > m38144b()) {
            this.f4474a = Arrays.copyOf(this.f4474a, i);
        }
    }

    public byte[] m38142d() {
        return this.f4474a;
    }

    public int m38141e() {
        return this.f4475b;
    }

    public int m38140f() {
        return this.f4476c;
    }

    public char m38139g() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int m38138h() {
        return this.f4474a[this.f4475b] & 255;
    }

    public void m38137i(C1187a0 a0Var, int i) {
        m38136j(a0Var.f4469a, 0, i);
        a0Var.m38168p(0);
    }

    public void m38136j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f4474a, this.f4475b, bArr, i, i2);
        this.f4475b += i2;
    }

    public String m38135k(char c) {
        if (m38145a() == 0) {
            return null;
        }
        int i = this.f4475b;
        while (i < this.f4476c && this.f4474a[i] != c) {
            i++;
        }
        byte[] bArr = this.f4474a;
        int i2 = this.f4475b;
        String B = C1216l0.m38022B(bArr, i2, i - i2);
        this.f4475b = i;
        if (i < this.f4476c) {
            this.f4475b = i + 1;
        }
        return B;
    }

    public double m38134l() {
        return Double.longBitsToDouble(m38123w());
    }

    public float m38133m() {
        return Float.intBitsToFloat(m38132n());
    }

    public int m38132n() {
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

    public int m38131o() {
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

    public String m38130p() {
        if (m38145a() == 0) {
            return null;
        }
        int i = this.f4475b;
        while (i < this.f4476c && !C1216l0.m37970j0(this.f4474a[i])) {
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
        String B = C1216l0.m38022B(bArr2, i3, i - i3);
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

    public int m38129q() {
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

    public long m38128r() {
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

    public short m38127s() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        this.f4475b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public long m38126t() {
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

    public int m38125u() {
        int q = m38129q();
        if (q >= 0) {
            return q;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Top bit not zero: ");
        sb2.append(q);
        throw new IllegalStateException(sb2.toString());
    }

    public int m38124v() {
        byte[] bArr = this.f4474a;
        int i = this.f4475b;
        int i2 = i + 1;
        this.f4475b = i2;
        this.f4475b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public long m38123w() {
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

    public String m38122x() {
        return m38135k((char) 0);
    }

    public String m38121y(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f4475b;
        int i3 = (i2 + i) - 1;
        String B = C1216l0.m38022B(this.f4474a, i2, (i3 >= this.f4476c || this.f4474a[i3] != 0) ? i : i - 1);
        this.f4475b += i;
        return B;
    }

    public short m38120z() {
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
