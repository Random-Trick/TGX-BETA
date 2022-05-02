package p351z;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class C11189f {
    public static final Charset f35843e = StandardCharsets.US_ASCII;
    public static final String[] f35844f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f35845g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] f35846h = {65, 83, 67, 73, 73, 0, 0, 0};
    public final int f35847a;
    public final int f35848b;
    public final long f35849c;
    public final byte[] f35850d;

    public C11189f(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public static C11189f m1272a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C11189f(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f35843e);
        return new C11189f(1, bytes.length, bytes);
    }

    public static C11189f m1271b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f35845g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new C11189f(12, dArr.length, wrap.array());
    }

    public static C11189f m1270c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f35845g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new C11189f(9, iArr.length, wrap.array());
    }

    public static C11189f m1269d(C11200j[] jVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f35845g[10] * jVarArr.length]);
        wrap.order(byteOrder);
        for (C11200j jVar : jVarArr) {
            wrap.putInt((int) jVar.m1238b());
            wrap.putInt((int) jVar.m1239a());
        }
        return new C11189f(10, jVarArr.length, wrap.array());
    }

    public static C11189f m1268e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f35843e);
        return new C11189f(2, bytes.length, bytes);
    }

    public static C11189f m1267f(long j, ByteOrder byteOrder) {
        return m1266g(new long[]{j}, byteOrder);
    }

    public static C11189f m1266g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f35845g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C11189f(4, jArr.length, wrap.array());
    }

    public static C11189f m1265h(C11200j[] jVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f35845g[5] * jVarArr.length]);
        wrap.order(byteOrder);
        for (C11200j jVar : jVarArr) {
            wrap.putInt((int) jVar.m1238b());
            wrap.putInt((int) jVar.m1239a());
        }
        return new C11189f(5, jVarArr.length, wrap.array());
    }

    public static C11189f m1264i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f35845g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C11189f(3, iArr.length, wrap.array());
    }

    public int m1263j() {
        return f35845g[this.f35847a] * this.f35848b;
    }

    public String toString() {
        return "(" + f35844f[this.f35847a] + ", data length:" + this.f35850d.length + ")";
    }

    public C11189f(int i, int i2, long j, byte[] bArr) {
        this.f35847a = i;
        this.f35848b = i2;
        this.f35849c = j;
        this.f35850d = bArr;
    }
}
