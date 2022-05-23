package o3;

import c5.a0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import m3.q1;
import org.thunderdog.challegram.Log;
import q3.m;

public final class e0 {
    public static final int[] f18772a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f18773b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] f18774c = {64, 112, Log.TAG_YOUTUBE, 192, 224, Log.TAG_CRASH, 384, 448, Log.TAG_GIF_LOADER, 640, 768, 896, Log.TAG_CAMERA, 1152, 1280, 1536, 1920, Log.TAG_VOICE, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, Log.TAG_EMOJI, 6144, 7680};

    public static int a(byte[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: o3.e0.a(byte[]):int");
    }

    public static a0 b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new a0(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        a0 a0Var = new a0(copyOf);
        if (copyOf[0] == 31) {
            a0 a0Var2 = new a0(copyOf);
            while (a0Var2.b() >= 16) {
                a0Var2.r(2);
                a0Var.f(a0Var2.h(14), 14);
            }
        }
        a0Var.n(copyOf);
        return a0Var;
    }

    public static boolean c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    public static boolean d(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        byte b10;
        byte b11;
        int position = byteBuffer.position();
        byte b12 = byteBuffer.get(position);
        if (b12 != -2) {
            if (b12 == -1) {
                i11 = (byteBuffer.get(position + 4) & 7) << 4;
                b11 = byteBuffer.get(position + 7);
            } else if (b12 != 31) {
                i11 = (byteBuffer.get(position + 4) & 1) << 6;
                b10 = byteBuffer.get(position + 5);
            } else {
                i11 = (byteBuffer.get(position + 5) & 7) << 4;
                b11 = byteBuffer.get(position + 6);
            }
            i10 = b11 & 60;
            return (((i10 >> 2) | i11) + 1) * 32;
        }
        i11 = (byteBuffer.get(position + 5) & 1) << 6;
        b10 = byteBuffer.get(position + 4);
        i10 = b10 & 252;
        return (((i10 >> 2) | i11) + 1) * 32;
    }

    public static int f(byte[] bArr) {
        int i10;
        int i11;
        byte b10;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i11 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i11 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i11 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i10 = b11 & 60;
            return (((i10 >> 2) | i11) + 1) * 32;
        }
        i11 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i10 = b10 & 252;
        return (((i10 >> 2) | i11) + 1) * 32;
    }

    public static q1 g(byte[] bArr, String str, String str2, m mVar) {
        a0 b10 = b(bArr);
        b10.r(60);
        int i10 = f18772a[b10.h(6)];
        int i11 = f18773b[b10.h(4)];
        int h10 = b10.h(5);
        int[] iArr = f18774c;
        int i12 = h10 >= iArr.length ? -1 : (iArr[h10] * 1000) / 2;
        b10.r(10);
        return new q1.b().S(str).e0("audio/vnd.dts").G(i12).H(i10 + (b10.h(2) > 0 ? 1 : 0)).f0(i11).M(mVar).V(str2).E();
    }
}
