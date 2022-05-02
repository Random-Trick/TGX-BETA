package p199o3;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.thunderdog.challegram.Log;
import p020b5.C1187a0;
import p174m3.C6600g1;
import p230q3.C8201m;

public final class C7601d0 {
    public static final int[] f24326a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f24327b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f24328c = {64, 112, Log.TAG_YOUTUBE, 192, 224, Log.TAG_CRASH, 384, 448, Log.TAG_GIF_LOADER, 640, 768, 896, Log.TAG_CAMERA, 1152, 1280, 1536, 1920, Log.TAG_VOICE, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, Log.TAG_EMOJI, 6144, 7680};

    public static int m15543a(byte[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: p199o3.C7601d0.m15543a(byte[]):int");
    }

    public static C1187a0 m15542b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C1187a0(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m15541c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C1187a0 a0Var = new C1187a0(copyOf);
        if (copyOf[0] == 31) {
            C1187a0 a0Var2 = new C1187a0(copyOf);
            while (a0Var2.m38182b() >= 16) {
                a0Var2.m38166r(2);
                a0Var.m38178f(a0Var2.m38176h(14), 14);
            }
        }
        a0Var.m38170n(copyOf);
        return a0Var;
    }

    public static boolean m15541c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    public static boolean m15540d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int m15539e(ByteBuffer byteBuffer) {
        int i;
        int i2;
        byte b;
        byte b2;
        int position = byteBuffer.position();
        byte b3 = byteBuffer.get(position);
        if (b3 != -2) {
            if (b3 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b2 = byteBuffer.get(position + 7);
            } else if (b3 != 31) {
                i2 = (byteBuffer.get(position + 4) & 1) << 6;
                b = byteBuffer.get(position + 5);
            } else {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b2 = byteBuffer.get(position + 6);
            }
            i = b2 & 60;
            return (((i >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(position + 5) & 1) << 6;
        b = byteBuffer.get(position + 4);
        i = b & 252;
        return (((i >> 2) | i2) + 1) * 32;
    }

    public static int m15538f(byte[] bArr) {
        int i;
        int i2;
        byte b;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i = b2 & 60;
            return (((i >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b = bArr[4];
        i = b & 252;
        return (((i >> 2) | i2) + 1) * 32;
    }

    public static C6600g1 m15537g(byte[] bArr, String str, String str2, C8201m mVar) {
        C1187a0 b = m15542b(bArr);
        b.m38166r(60);
        int i = f24326a[b.m38176h(6)];
        int i2 = f24327b[b.m38176h(4)];
        int h = b.m38176h(5);
        int[] iArr = f24328c;
        int i3 = h >= iArr.length ? -1 : (iArr[h] * 1000) / 2;
        b.m38166r(10);
        return new C6600g1.C6602b().m19876S(str).m19859e0("audio/vnd.dts").m19888G(i3).m19887H(i + (b.m38176h(2) > 0 ? 1 : 0)).m19857f0(i2).m19882M(mVar).m19873V(str2).m19890E();
    }
}
