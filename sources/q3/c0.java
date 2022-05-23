package q3;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import c5.l0;
import q3.h;

public final class c0 {

    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return l0.O(l0.P(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    public static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i10) {
        int i11 = l0.f4841a;
        if (i11 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i11 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i11 >= 18 && a.b(exc)) {
            return 6002;
        }
        if (i11 >= 18 && a.a(exc)) {
            return 6007;
        }
        if (exc instanceof p0) {
            return 6001;
        }
        if (exc instanceof h.e) {
            return 6003;
        }
        if (exc instanceof m0) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }
}
