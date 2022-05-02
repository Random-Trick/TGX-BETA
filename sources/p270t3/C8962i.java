package p270t3;

import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;
import p174m3.C6556a2;

public final class C8962i {
    @Pure
    public static void m10831a(boolean z, String str) {
        if (!z) {
            throw C6556a2.m20113a(str, null);
        }
    }

    public static boolean m10830b(AbstractC8959g gVar, byte[] bArr, int i, int i2, boolean z) {
        try {
            return gVar.mo10812e(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int m10829c(AbstractC8959g gVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int k = gVar.mo10809k(bArr, i + i3, i2 - i3);
            if (k == -1) {
                break;
            }
            i3 += k;
        }
        return i3;
    }

    public static boolean m10828d(AbstractC8959g gVar, byte[] bArr, int i, int i2) {
        try {
            gVar.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean m10827e(AbstractC8959g gVar, int i) {
        try {
            gVar.mo10807n(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
