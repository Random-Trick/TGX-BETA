package t3;

import c5.b0;
import c5.l0;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import m3.k2;
import org.thunderdog.challegram.Log;

public final class m {

    public static final class a {
        public long f22893a;
    }

    public static boolean a(b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i10) {
        int j10 = j(b0Var, i10);
        return j10 != -1 && j10 <= flacStreamMetadata.maxBlockSizeSamples;
    }

    public static boolean b(b0 b0Var, int i10) {
        return b0Var.D() == l0.s(b0Var.d(), i10, b0Var.e() - 1, 0);
    }

    public static boolean c(b0 b0Var, FlacStreamMetadata flacStreamMetadata, boolean z10, a aVar) {
        try {
            long K = b0Var.K();
            if (!z10) {
                K *= flacStreamMetadata.maxBlockSizeSamples;
            }
            aVar.f22893a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i10, a aVar) {
        int e10 = b0Var.e();
        long F = b0Var.F();
        long j10 = F >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) (15 & (F >> 4)), flacStreamMetadata) && f((int) ((F >> 1) & 7), flacStreamMetadata) && !(((F & 1) > 1L ? 1 : ((F & 1) == 1L ? 0 : -1)) == 0) && c(b0Var, flacStreamMetadata, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(b0Var, flacStreamMetadata, (int) ((F >> 12) & 15)) && e(b0Var, flacStreamMetadata, (int) ((F >> 8) & 15)) && b(b0Var, e10);
    }

    public static boolean e(b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i10) {
        int i11 = flacStreamMetadata.sampleRate;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i10 == 12) {
            return b0Var.D() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int J = b0Var.J();
        if (i10 == 14) {
            J *= 10;
        }
        return J == i11;
    }

    public static boolean f(int i10, FlacStreamMetadata flacStreamMetadata) {
        return i10 == 0 || i10 == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    public static boolean g(int i10, FlacStreamMetadata flacStreamMetadata) {
        return i10 <= 7 ? i10 == flacStreamMetadata.channels - 1 : i10 <= 10 && flacStreamMetadata.channels == 2;
    }

    public static boolean h(g gVar, FlacStreamMetadata flacStreamMetadata, int i10, a aVar) {
        long f10 = gVar.f();
        byte[] bArr = new byte[2];
        gVar.q(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            gVar.m();
            gVar.g((int) (f10 - gVar.r()));
            return false;
        }
        b0 b0Var = new b0(16);
        System.arraycopy(bArr, 0, b0Var.d(), 0, 2);
        b0Var.O(i.c(gVar, b0Var.d(), 2, 14));
        gVar.m();
        gVar.g((int) (f10 - gVar.r()));
        return d(b0Var, flacStreamMetadata, i10, aVar);
    }

    public static long i(g gVar, FlacStreamMetadata flacStreamMetadata) {
        gVar.m();
        boolean z10 = true;
        gVar.g(1);
        byte[] bArr = new byte[1];
        gVar.q(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        gVar.g(2);
        int i10 = z10 ? 7 : 6;
        b0 b0Var = new b0(i10);
        b0Var.O(i.c(gVar, b0Var.d(), 0, i10));
        gVar.m();
        a aVar = new a();
        if (c(b0Var, flacStreamMetadata, z10, aVar)) {
            return aVar.f22893a;
        }
        throw k2.a(null, null);
    }

    public static int j(b0 b0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return b0Var.D() + 1;
            case 7:
                return b0Var.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return Log.TAG_CRASH << (i10 - 8);
            default:
                return -1;
        }
    }
}
