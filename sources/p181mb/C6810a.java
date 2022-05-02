package p181mb;

import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;

public final class C6810a {
    public int f21328a;
    public byte[] f21329b;

    public C6810a() {
    }

    public static void m18948E(byte[] bArr, int i, double d) {
        m18942K(bArr, i, Double.doubleToLongBits(d));
    }

    public static void m18946G(byte[] bArr, int i, float f) {
        m18944I(bArr, i, Float.floatToIntBits(f));
    }

    public static void m18944I(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 24) & 255);
        int i3 = i + 1;
        bArr[i3] = (byte) ((i2 >> 16) & 255);
        int i4 = i3 + 1;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        bArr[i4 + 1] = (byte) (i2 & 255);
    }

    public static void m18942K(byte[] bArr, int i, long j) {
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i2 = i + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i3 = i2 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i4 = i3 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i5 = i4 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i6 = i5 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i7 = i6 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i7 + 1] = (byte) (j & 255);
    }

    public static void m18939N(RandomAccessFile randomAccessFile, int i) {
        while ((i & (-128)) != 0) {
            randomAccessFile.write((i & 127) | Log.TAG_YOUTUBE);
            i >>>= 7;
        }
        randomAccessFile.write(i & 127);
    }

    public static byte m18933f(RandomAccessFile randomAccessFile) {
        return (byte) randomAccessFile.read();
    }

    public static byte[] m18931h(RandomAccessFile randomAccessFile) {
        int t = m18919t(randomAccessFile);
        byte[] bArr = new byte[t];
        randomAccessFile.read(bArr, 0, t);
        return bArr;
    }

    public static double m18929j(byte[] bArr, int i) {
        return Double.longBitsToDouble(m18923p(bArr, i));
    }

    public static float m18927l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m18925n(bArr, i));
    }

    public static int m18925n(byte[] bArr, int i) {
        if (bArr.length - i >= 4) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
            return (bArr[i3 + 1] & 255) | i4 | ((bArr[i3] & 255) << 8);
        }
        throw new IllegalArgumentException();
    }

    public static long m18923p(byte[] bArr, int i) {
        if (bArr.length - i >= 8) {
            long j = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                i++;
                j = (j << 8) + (bArr[i] & 255);
            }
            return j;
        }
        throw new IllegalArgumentException();
    }

    public static String m18921r(RandomAccessFile randomAccessFile) {
        try {
            return new String(m18931h(randomAccessFile), C5070i.f17083a);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public static int m18919t(RandomAccessFile randomAccessFile) {
        int i = 0;
        int i2 = 0;
        do {
            int read = randomAccessFile.read();
            if ((read & Log.TAG_YOUTUBE) == 0) {
                return (read << i2) | i;
            }
            i |= (read & 127) << i2;
            i2 += 7;
        } while (i2 <= 35);
        throw new RuntimeException("varint read failed");
    }

    public static int m18916w(int i) {
        int i2 = 1;
        while ((i & (-128)) != 0) {
            i2++;
            i >>>= 7;
        }
        return i2;
    }

    public static int m18915x(String str, boolean z) {
        if (!C5070i.m24061i(str)) {
            return m18916w(str.length()) + str.length();
        }
        if (z) {
            return m18916w(0);
        }
        return 0;
    }

    public boolean m18952A(boolean z) {
        m18951B(z ? (byte) 1 : (byte) 0);
        return z;
    }

    public void m18951B(byte b) {
        m18938a(1);
        byte[] bArr = this.f21329b;
        int i = this.f21328a;
        bArr[i] = b;
        this.f21328a = i + 1;
    }

    public void m18950C(byte[] bArr) {
        m18938a(m18916w(bArr.length) + bArr.length);
        m18940M(bArr.length);
        for (byte b : bArr) {
            byte[] bArr2 = this.f21329b;
            int i = this.f21328a;
            bArr2[i] = b;
            this.f21328a = i + 1;
        }
    }

    public void m18949D(double d) {
        m18943J(Double.doubleToLongBits(d));
    }

    public void m18947F(float f) {
        m18945H(Float.floatToIntBits(f));
    }

    public void m18945H(int i) {
        m18938a(4);
        m18944I(this.f21329b, this.f21328a, i);
        this.f21328a += 4;
    }

    public void m18943J(long j) {
        m18938a(8);
        m18942K(this.f21329b, this.f21328a, j);
        this.f21328a += 8;
    }

    public void m18941L(String str) {
        m18950C(str.getBytes(C5070i.f17083a));
    }

    public void m18940M(int i) {
        m18938a(m18916w(i));
        while ((i & (-128)) != 0) {
            byte[] bArr = this.f21329b;
            int i2 = this.f21328a;
            bArr[i2] = (byte) ((i & 127) | Log.TAG_YOUTUBE);
            this.f21328a = i2 + 1;
            i >>>= 7;
        }
        byte[] bArr2 = this.f21329b;
        int i3 = this.f21328a;
        bArr2[i3] = (byte) (i & 127);
        this.f21328a = i3 + 1;
    }

    public final void m18938a(int i) {
        byte[] bArr = this.f21329b;
        if (bArr == null) {
            this.f21329b = new byte[i];
            return;
        }
        int i2 = this.f21328a;
        if (i2 + i > bArr.length) {
            this.f21329b = Arrays.copyOf(bArr, i2 + i);
        }
    }

    public void m18937b(int i) {
        byte[] bArr = this.f21329b;
        if (bArr == null) {
            throw new RuntimeException("Blob.data == null");
        } else if (this.f21328a + i > bArr.length) {
            throw new RuntimeException("Blob.data.length < index + more");
        }
    }

    public void m18936c(int i) {
        byte[] bArr = this.f21329b;
        if (bArr == null) {
            this.f21329b = new byte[i];
            return;
        }
        int i2 = this.f21328a;
        if (i2 + i > bArr.length) {
            this.f21329b = Arrays.copyOf(bArr, i2 + i);
        }
    }

    public boolean m18935d() {
        return m18934e() == 1;
    }

    public byte m18934e() {
        m18937b(1);
        byte[] bArr = this.f21329b;
        int i = this.f21328a;
        this.f21328a = i + 1;
        return bArr[i];
    }

    public byte[] m18932g() {
        int s = m18920s();
        m18937b(s);
        byte[] bArr = new byte[s];
        for (int i = 0; i < s; i++) {
            byte[] bArr2 = this.f21329b;
            int i2 = this.f21328a;
            this.f21328a = i2 + 1;
            bArr[i] = bArr2[i2];
        }
        return bArr;
    }

    public double m18930i() {
        return Double.longBitsToDouble(m18924o());
    }

    public float m18928k() {
        return Float.intBitsToFloat(m18926m());
    }

    public int m18926m() {
        m18937b(4);
        byte[] bArr = this.f21329b;
        int i = this.f21328a;
        int i2 = i + 1;
        this.f21328a = i2;
        int i3 = i2 + 1;
        this.f21328a = i3;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        this.f21328a = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f21328a = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public long m18924o() {
        m18937b(8);
        long j = 0;
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.f21329b;
            int i2 = this.f21328a;
            this.f21328a = i2 + 1;
            j = (j << 8) + (bArr[i2] & 255);
        }
        return j;
    }

    public String m18922q() {
        return new String(m18932g(), C5070i.f17083a);
    }

    public int m18920s() {
        int i = 0;
        int i2 = 0;
        do {
            byte[] bArr = this.f21329b;
            int i3 = this.f21328a;
            this.f21328a = i3 + 1;
            byte b = bArr[i3];
            if ((b & 128) == 0) {
                return i | (b << i2);
            }
            i |= (b & Byte.MAX_VALUE) << i2;
            i2 += 7;
        } while (i2 <= 35);
        throw new RuntimeException("varint read failed");
    }

    public void m18918u(byte[] bArr) {
        this.f21328a = 0;
        this.f21329b = bArr;
    }

    public void m18917v() {
        this.f21328a = 0;
    }

    public byte[] m18914y() {
        m18913z();
        return this.f21329b;
    }

    public void m18913z() {
        int i = this.f21328a;
        byte[] bArr = this.f21329b;
        if (i != bArr.length) {
            this.f21329b = Arrays.copyOf(bArr, i);
        }
    }

    public C6810a(int i) {
        this.f21329b = new byte[i];
    }

    public C6810a(byte[] bArr) {
        this.f21329b = bArr;
    }
}
