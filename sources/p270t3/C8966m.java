package p270t3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p174m3.C6556a2;

public final class C8966m {

    public static final class C8967a {
        public long f28851a;
    }

    public static boolean m10824a(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i) {
        int j = m10815j(b0Var, i);
        return j != -1 && j <= flacStreamMetadata.maxBlockSizeSamples;
    }

    public static boolean m10823b(C1189b0 b0Var, int i) {
        return b0Var.m38156D() == C1216l0.m37950s(b0Var.m38139d(), i, b0Var.m38138e() - 1, 0);
    }

    public static boolean m10822c(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, boolean z, C8967a aVar) {
        try {
            long K = b0Var.m38149K();
            if (!z) {
                K *= flacStreamMetadata.maxBlockSizeSamples;
            }
            aVar.f28851a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean m10821d(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i, C8967a aVar) {
        int e = b0Var.m38138e();
        long F = b0Var.m38154F();
        long j = F >>> 16;
        if (j != i) {
            return false;
        }
        return m10818g((int) (15 & (F >> 4)), flacStreamMetadata) && m10819f((int) ((F >> 1) & 7), flacStreamMetadata) && !(((F & 1) > 1L ? 1 : ((F & 1) == 1L ? 0 : -1)) == 0) && m10822c(b0Var, flacStreamMetadata, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && m10824a(b0Var, flacStreamMetadata, (int) ((F >> 12) & 15)) && m10820e(b0Var, flacStreamMetadata, (int) ((F >> 8) & 15)) && m10823b(b0Var, e);
    }

    public static boolean m10820e(C1189b0 b0Var, FlacStreamMetadata flacStreamMetadata, int i) {
        int i2 = flacStreamMetadata.sampleRate;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i == 12) {
            return b0Var.m38156D() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int J = b0Var.m38150J();
        if (i == 14) {
            J *= 10;
        }
        return J == i2;
    }

    public static boolean m10819f(int i, FlacStreamMetadata flacStreamMetadata) {
        return i == 0 || i == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    public static boolean m10818g(int i, FlacStreamMetadata flacStreamMetadata) {
        return i <= 7 ? i == flacStreamMetadata.channels - 1 : i <= 10 && flacStreamMetadata.channels == 2;
    }

    public static boolean m10817h(AbstractC8959g gVar, FlacStreamMetadata flacStreamMetadata, int i, C8967a aVar) {
        long f = gVar.mo6045f();
        byte[] bArr = new byte[2];
        gVar.mo10806q(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            gVar.mo10809m();
            gVar.mo10812h((int) (f - gVar.mo6043r()));
            return false;
        }
        C1189b0 b0Var = new C1189b0(16);
        System.arraycopy(bArr, 0, b0Var.m38139d(), 0, 2);
        b0Var.m38145O(C8962i.m10830c(gVar, b0Var.m38139d(), 2, 14));
        gVar.mo10809m();
        gVar.mo10812h((int) (f - gVar.mo6043r()));
        return m10821d(b0Var, flacStreamMetadata, i, aVar);
    }

    public static long m10816i(AbstractC8959g gVar, FlacStreamMetadata flacStreamMetadata) {
        gVar.mo10809m();
        boolean z = true;
        gVar.mo10812h(1);
        byte[] bArr = new byte[1];
        gVar.mo10806q(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        gVar.mo10812h(2);
        int i = z ? 7 : 6;
        C1189b0 b0Var = new C1189b0(i);
        b0Var.m38145O(C8962i.m10830c(gVar, b0Var.m38139d(), 0, i));
        gVar.mo10809m();
        C8967a aVar = new C8967a();
        if (m10822c(b0Var, flacStreamMetadata, z, aVar)) {
            return aVar.f28851a;
        }
        throw C6556a2.m20112a(null, null);
    }

    public static int m10815j(C1189b0 b0Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return b0Var.m38156D() + 1;
            case 7:
                return b0Var.m38150J() + 1;
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
