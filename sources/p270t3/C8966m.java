package p270t3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p174m3.C6556a2;

public final class C8966m {

    public static final class C8967a {
        public long f28854a;
    }

    public static boolean m10823a(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i) {
        int j = m10814j(b0Var, i);
        return j != -1 && j <= flacStreamMetadata.maxBlockSizeSamples;
    }

    public static boolean m10822b(C1189b0 b0Var, int i) {
        return b0Var.m38159D() == C1216l0.m37953s(b0Var.m38142d(), i, b0Var.m38141e() - 1, 0);
    }

    public static boolean m10821c(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, boolean z, C8967a aVar) {
        try {
            long K = b0Var.m38152K();
            if (!z) {
                K *= flacStreamMetadata.maxBlockSizeSamples;
            }
            aVar.f28854a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean m10820d(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i, C8967a aVar) {
        int e = b0Var.m38141e();
        long F = b0Var.m38157F();
        long j = F >>> 16;
        if (j != i) {
            return false;
        }
        return m10817g((int) (15 & (F >> 4)), flacStreamMetadata) && m10818f((int) ((F >> 1) & 7), flacStreamMetadata) && !(((F & 1) > 1L ? 1 : ((F & 1) == 1L ? 0 : -1)) == 0) && m10821c(b0Var, flacStreamMetadata, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && m10823a(b0Var, flacStreamMetadata, (int) ((F >> 12) & 15)) && m10819e(b0Var, flacStreamMetadata, (int) ((F >> 8) & 15)) && m10822b(b0Var, e);
    }

    public static boolean m10819e(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i) {
        int i2 = flacStreamMetadata.sampleRate;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i == 12) {
            return b0Var.m38159D() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int J = b0Var.m38153J();
        if (i == 14) {
            J *= 10;
        }
        return J == i2;
    }

    public static boolean m10818f(int i, FlacStreamMetadata flacStreamMetadata) {
        return i == 0 || i == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    public static boolean m10817g(int i, FlacStreamMetadata flacStreamMetadata) {
        return i <= 7 ? i == flacStreamMetadata.channels - 1 : i <= 10 && flacStreamMetadata.channels == 2;
    }

    public static boolean m10816h(AbstractC8959g gVar, FlacStreamMetadata flacStreamMetadata, int i, C8967a aVar) {
        long f = gVar.mo6045f();
        byte[] bArr = new byte[2];
        gVar.mo10805q(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            gVar.mo10808m();
            gVar.mo10811h((int) (f - gVar.mo6043r()));
            return false;
        }
        C1189b0 b0Var = new C1189b0(16);
        System.arraycopy(bArr, 0, b0Var.m38142d(), 0, 2);
        b0Var.m38148O(C8962i.m10829c(gVar, b0Var.m38142d(), 2, 14));
        gVar.mo10808m();
        gVar.mo10811h((int) (f - gVar.mo6043r()));
        return m10820d(b0Var, flacStreamMetadata, i, aVar);
    }

    public static long m10815i(AbstractC8959g gVar, FlacStreamMetadata flacStreamMetadata) {
        gVar.mo10808m();
        boolean z = true;
        gVar.mo10811h(1);
        byte[] bArr = new byte[1];
        gVar.mo10805q(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        gVar.mo10811h(2);
        int i = z ? 7 : 6;
        C1189b0 b0Var = new C1189b0(i);
        b0Var.m38148O(C8962i.m10829c(gVar, b0Var.m38142d(), 0, i));
        gVar.mo10808m();
        C8967a aVar = new C8967a();
        if (m10821c(b0Var, flacStreamMetadata, z, aVar)) {
            return aVar.f28854a;
        }
        throw C6556a2.m20113a(null, null);
    }

    public static int m10814j(C1189b0 b0Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return b0Var.m38159D() + 1;
            case 7:
                return b0Var.m38153J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return Log.TAG_CRASH << (i - 8);
            default:
                return -1;
        }
    }
}
