package p006a5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p006a5.AbstractC0154k;
import p343y6.C10422b;

public interface AbstractC0180y extends AbstractC0154k {

    public static final class C0181a extends C0183c {
        public C0181a(IOException iOException, C0159o oVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, oVar, 2007, 1);
        }
    }

    public interface AbstractC0182b extends AbstractC0154k.AbstractC0155a {
        @Override
        AbstractC0180y mo4407a();
    }

    public static final class C0184d extends C0183c {
        public final String f658M;

        public C0184d(java.lang.String r4, p006a5.C0159o r5) {
            throw new UnsupportedOperationException("Method not decompiled: p006a5.AbstractC0180y.C0184d.<init>(java.lang.String, a5.o):void");
        }
    }

    public static final class C0185e extends C0183c {
        public final int f659M;
        public final String f660N;
        public final Map<String, List<String>> f661O;
        public final byte[] f662P;

        public C0185e(int r9, java.lang.String r10, java.io.IOException r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12, p006a5.C0159o r13, byte[] r14) {
            throw new UnsupportedOperationException("Method not decompiled: p006a5.AbstractC0180y.C0185e.<init>(int, java.lang.String, java.io.IOException, java.util.Map, a5.o, byte[]):void");
        }
    }

    public static final class C0186f {
        public final Map<String, String> f663a = new HashMap();
        public Map<String, String> f664b;

        public synchronized Map<String, String> m42131a() {
            if (this.f664b == null) {
                this.f664b = Collections.unmodifiableMap(new HashMap(this.f663a));
            }
            return this.f664b;
        }
    }

    public static class C0183c extends C0156l {
        public final C0159o f656b;
        public final int f657c;

        public C0183c(C0159o oVar, int i, int i2) {
            super(m42133b(i, i2));
            this.f656b = oVar;
            this.f657c = i2;
        }

        public static int m42133b(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static C0183c m42132c(IOException iOException, C0159o oVar, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !C10422b.m5149c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new C0181a(iOException, oVar);
            }
            return new C0183c(iOException, oVar, i2, i);
        }

        public C0183c(String str, C0159o oVar, int i, int i2) {
            super(str, m42133b(i, i2));
            this.f656b = oVar;
            this.f657c = i2;
        }

        public C0183c(IOException iOException, C0159o oVar, int i, int i2) {
            super(iOException, m42133b(i, i2));
            this.f656b = oVar;
            this.f657c = i2;
        }

        public C0183c(String str, IOException iOException, C0159o oVar, int i, int i2) {
            super(str, iOException, m42133b(i, i2));
            this.f656b = oVar;
            this.f657c = i2;
        }
    }
}
