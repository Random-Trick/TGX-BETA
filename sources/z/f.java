package z;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class f {
    public static final Charset f26721e = StandardCharsets.US_ASCII;
    public static final String[] f26722f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f26723g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] f26724h = {65, 83, 67, 73, 73, 0, 0, 0};
    public final int f26725a;
    public final int f26726b;
    public final long f26727c;
    public final byte[] f26728d;

    public f(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static f a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new f(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f26721e);
        return new f(1, bytes.length, bytes);
    }

    public static f b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f26723g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d10 : dArr) {
            wrap.putDouble(d10);
        }
        return new f(12, dArr.length, wrap.array());
    }

    public static f c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f26723g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putInt(i10);
        }
        return new f(9, iArr.length, wrap.array());
    }

    public static f d(j[] jVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f26723g[10] * jVarArr.length]);
        wrap.order(byteOrder);
        for (j jVar : jVarArr) {
            wrap.putInt((int) jVar.b());
            wrap.putInt((int) jVar.a());
        }
        return new f(10, jVarArr.length, wrap.array());
    }

    public static f e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f26721e);
        return new f(2, bytes.length, bytes);
    }

    public static f f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static f g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f26723g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new f(4, jArr.length, wrap.array());
    }

    public static f h(j[] jVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f26723g[5] * jVarArr.length]);
        wrap.order(byteOrder);
        for (j jVar : jVarArr) {
            wrap.putInt((int) jVar.b());
            wrap.putInt((int) jVar.a());
        }
        return new f(5, jVarArr.length, wrap.array());
    }

    public static f i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f26723g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new f(3, iArr.length, wrap.array());
    }

    public int j() {
        return f26723g[this.f26725a] * this.f26726b;
    }

    public String toString() {
        return "(" + f26722f[this.f26725a] + ", data length:" + this.f26728d.length + ")";
    }

    public f(int i10, int i11, long j10, byte[] bArr) {
        this.f26725a = i10;
        this.f26726b = i11;
        this.f26727c = j10;
        this.f26728d = bArr;
    }
}
