package t3;

import java.io.EOFException;
import m3.k2;
import org.checkerframework.dataflow.qual.Pure;

public final class i {
    @Pure
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw k2.a(str, null);
        }
    }

    public static boolean b(g gVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return gVar.e(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(g gVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int k10 = gVar.k(bArr, i10 + i12, i11 - i12);
            if (k10 == -1) {
                break;
            }
            i12 += k10;
        }
        return i12;
    }

    public static boolean d(g gVar, byte[] bArr, int i10, int i11) {
        try {
            gVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(g gVar, int i10) {
        try {
            gVar.n(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
