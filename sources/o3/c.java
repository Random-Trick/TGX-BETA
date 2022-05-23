package o3;

import c5.a0;
import c5.b0;
import java.nio.ByteBuffer;
import m3.q1;
import org.thunderdog.challegram.Log;
import q3.m;

public final class c {
    public static final int[] f18744a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, Log.TAG_VOICE};

    public static final class b {
        public final int f18745a;
        public final int f18746b;
        public final int f18747c;
        public final int f18748d;
        public final int f18749e;

        public b(int i10, int i11, int i12, int i13, int i14) {
            this.f18745a = i10;
            this.f18747c = i11;
            this.f18746b = i12;
            this.f18748d = i13;
            this.f18749e = i14;
        }
    }

    public static void a(int i10, b0 b0Var) {
        b0Var.L(7);
        byte[] d10 = b0Var.d();
        d10[0] = -84;
        d10[1] = 64;
        d10[2] = -1;
        d10[3] = -1;
        d10[4] = (byte) ((i10 >> 16) & 255);
        d10[5] = (byte) ((i10 >> 8) & 255);
        d10[6] = (byte) (i10 & 255);
    }

    public static q1 b(b0 b0Var, String str, String str2, m mVar) {
        b0Var.Q(1);
        return new q1.b().S(str).e0("audio/ac4").H(2).f0(((b0Var.D() & 32) >> 5) == 1 ? 48000 : 44100).M(mVar).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new a0(bArr)).f18749e;
    }

    public static o3.c.b d(c5.a0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: o3.c.d(c5.a0):o3.c$b");
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    public static int f(a0 a0Var, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + a0Var.h(i10);
            if (!a0Var.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }
}
