package nb;

import ib.i;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.thunderdog.challegram.Log;

public final class a {
    public int f17805a;
    public byte[] f17806b;

    public a() {
    }

    public a(int i10) {
        this.f17806b = new byte[i10];
    }

    public static void E(byte[] bArr, int i10, double d10) {
        K(bArr, i10, Double.doubleToLongBits(d10));
    }

    public static void G(byte[] bArr, int i10, float f10) {
        I(bArr, i10, Float.floatToIntBits(f10));
    }

    public static void I(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) ((i11 >> 24) & 255);
        int i12 = i10 + 1;
        bArr[i12] = (byte) ((i11 >> 16) & 255);
        int i13 = i12 + 1;
        bArr[i13] = (byte) ((i11 >> 8) & 255);
        bArr[i13 + 1] = (byte) (i11 & 255);
    }

    public static void K(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i11 = i10 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i12 = i11 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i13 = i12 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i14 = i13 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i15 = i14 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i16 = i15 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i16 + 1] = (byte) (j10 & 255);
    }

    public static void N(RandomAccessFile randomAccessFile, int i10) {
        while ((i10 & (-128)) != 0) {
            randomAccessFile.write((i10 & 127) | Log.TAG_YOUTUBE);
            i10 >>>= 7;
        }
        randomAccessFile.write(i10 & 127);
    }

    public static byte f(RandomAccessFile randomAccessFile) {
        return (byte) randomAccessFile.read();
    }

    public static byte[] h(RandomAccessFile randomAccessFile) {
        int t10 = t(randomAccessFile);
        byte[] bArr = new byte[t10];
        randomAccessFile.read(bArr, 0, t10);
        return bArr;
    }

    public static double j(byte[] bArr, int i10) {
        return Double.longBitsToDouble(p(bArr, i10));
    }

    public static float l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(n(bArr, i10));
    }

    public static int n(byte[] bArr, int i10) {
        if (bArr.length - i10 >= 4) {
            int i11 = i10 + 1;
            int i12 = i11 + 1;
            int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
            return (bArr[i12 + 1] & 255) | i13 | ((bArr[i12] & 255) << 8);
        }
        throw new IllegalArgumentException();
    }

    public static long p(byte[] bArr, int i10) {
        if (bArr.length - i10 >= 8) {
            long j10 = 0;
            for (int i11 = 0; i11 < 8; i11++) {
                i10++;
                j10 = (j10 << 8) + (bArr[i10] & 255);
            }
            return j10;
        }
        throw new IllegalArgumentException();
    }

    public static String r(RandomAccessFile randomAccessFile) {
        try {
            return new String(h(randomAccessFile), i.f14176a);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public static int t(RandomAccessFile randomAccessFile) {
        int i10 = 0;
        int i11 = 0;
        do {
            int read = randomAccessFile.read();
            if ((read & Log.TAG_YOUTUBE) == 0) {
                return (read << i11) | i10;
            }
            i10 |= (read & 127) << i11;
            i11 += 7;
        } while (i11 <= 35);
        throw new RuntimeException("varint read failed");
    }

    public static int w(int i10) {
        int i11 = 1;
        while ((i10 & (-128)) != 0) {
            i11++;
            i10 >>>= 7;
        }
        return i11;
    }

    public static int x(String str, boolean z10) {
        if (!i.i(str)) {
            return w(str.length()) + str.length();
        }
        if (z10) {
            return w(0);
        }
        return 0;
    }

    public boolean A(boolean z10) {
        B(z10 ? (byte) 1 : (byte) 0);
        return z10;
    }

    public void B(byte b10) {
        a(1);
        byte[] bArr = this.f17806b;
        int i10 = this.f17805a;
        bArr[i10] = b10;
        this.f17805a = i10 + 1;
    }

    public void C(byte[] bArr) {
        a(w(bArr.length) + bArr.length);
        M(bArr.length);
        for (byte b10 : bArr) {
            byte[] bArr2 = this.f17806b;
            int i10 = this.f17805a;
            bArr2[i10] = b10;
            this.f17805a = i10 + 1;
        }
    }

    public void D(double d10) {
        J(Double.doubleToLongBits(d10));
    }

    public void F(float f10) {
        H(Float.floatToIntBits(f10));
    }

    public void H(int i10) {
        a(4);
        I(this.f17806b, this.f17805a, i10);
        this.f17805a += 4;
    }

    public void J(long j10) {
        a(8);
        K(this.f17806b, this.f17805a, j10);
        this.f17805a += 8;
    }

    public void L(String str) {
        C(str.getBytes(i.f14176a));
    }

    public void M(int i10) {
        a(w(i10));
        while ((i10 & (-128)) != 0) {
            byte[] bArr = this.f17806b;
            int i11 = this.f17805a;
            bArr[i11] = (byte) ((i10 & 127) | Log.TAG_YOUTUBE);
            this.f17805a = i11 + 1;
            i10 >>>= 7;
        }
        byte[] bArr2 = this.f17806b;
        int i12 = this.f17805a;
        bArr2[i12] = (byte) (i10 & 127);
        this.f17805a = i12 + 1;
    }

    public final void a(int i10) {
        byte[] bArr = this.f17806b;
        if (bArr == null) {
            this.f17806b = new byte[i10];
            return;
        }
        int i11 = this.f17805a;
        if (i11 + i10 > bArr.length) {
            this.f17806b = Arrays.copyOf(bArr, i11 + i10);
        }
    }

    public void b(int i10) {
        byte[] bArr = this.f17806b;
        if (bArr == null) {
            throw new RuntimeException("Blob.data == null");
        } else if (this.f17805a + i10 > bArr.length) {
            throw new RuntimeException("Blob.data.length < index + more");
        }
    }

    public void c(int i10) {
        byte[] bArr = this.f17806b;
        if (bArr == null) {
            this.f17806b = new byte[i10];
            return;
        }
        int i11 = this.f17805a;
        if (i11 + i10 > bArr.length) {
            this.f17806b = Arrays.copyOf(bArr, i11 + i10);
        }
    }

    public boolean d() {
        return e() == 1;
    }

    public byte e() {
        b(1);
        byte[] bArr = this.f17806b;
        int i10 = this.f17805a;
        this.f17805a = i10 + 1;
        return bArr[i10];
    }

    public byte[] g() {
        int s10 = s();
        b(s10);
        byte[] bArr = new byte[s10];
        for (int i10 = 0; i10 < s10; i10++) {
            byte[] bArr2 = this.f17806b;
            int i11 = this.f17805a;
            this.f17805a = i11 + 1;
            bArr[i10] = bArr2[i11];
        }
        return bArr;
    }

    public double i() {
        return Double.longBitsToDouble(o());
    }

    public float k() {
        return Float.intBitsToFloat(m());
    }

    public int m() {
        b(4);
        byte[] bArr = this.f17806b;
        int i10 = this.f17805a;
        int i11 = i10 + 1;
        this.f17805a = i11;
        int i12 = i11 + 1;
        this.f17805a = i12;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        this.f17805a = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f17805a = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public long o() {
        b(8);
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            byte[] bArr = this.f17806b;
            int i11 = this.f17805a;
            this.f17805a = i11 + 1;
            j10 = (j10 << 8) + (bArr[i11] & 255);
        }
        return j10;
    }

    public String q() {
        return new String(g(), i.f14176a);
    }

    public int s() {
        int i10 = 0;
        int i11 = 0;
        do {
            byte[] bArr = this.f17806b;
            int i12 = this.f17805a;
            this.f17805a = i12 + 1;
            byte b10 = bArr[i12];
            if ((b10 & 128) == 0) {
                return i10 | (b10 << i11);
            }
            i10 |= (b10 & Byte.MAX_VALUE) << i11;
            i11 += 7;
        } while (i11 <= 35);
        throw new RuntimeException("varint read failed");
    }

    public void u(byte[] bArr) {
        this.f17805a = 0;
        this.f17806b = bArr;
    }

    public void v() {
        this.f17805a = 0;
    }

    public byte[] y() {
        z();
        return this.f17806b;
    }

    public void z() {
        int i10 = this.f17805a;
        byte[] bArr = this.f17806b;
        if (i10 != bArr.length) {
            this.f17806b = Arrays.copyOf(bArr, i10);
        }
    }

    public a(byte[] bArr) {
        this.f17806b = bArr;
    }
}
