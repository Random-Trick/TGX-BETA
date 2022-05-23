package b5;

import b5.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface y extends k {

    public static final class a extends c {
        public a(IOException iOException, o oVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, oVar, 2007, 1);
        }
    }

    public interface b extends k.a {
        @Override
        y a();
    }

    public static final class d extends c {
        public final String M;

        public d(java.lang.String r4, b5.o r5) {
            throw new UnsupportedOperationException("Method not decompiled: b5.y.d.<init>(java.lang.String, b5.o):void");
        }
    }

    public static final class e extends c {
        public final int M;
        public final String N;
        public final Map<String, List<String>> O;
        public final byte[] P;

        public e(int r9, java.lang.String r10, java.io.IOException r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12, b5.o r13, byte[] r14) {
            throw new UnsupportedOperationException("Method not decompiled: b5.y.e.<init>(int, java.lang.String, java.io.IOException, java.util.Map, b5.o, byte[]):void");
        }
    }

    public static final class f {
        public final Map<String, String> f4008a = new HashMap();
        public Map<String, String> f4009b;

        public synchronized Map<String, String> a() {
            if (this.f4009b == null) {
                this.f4009b = Collections.unmodifiableMap(new HashMap(this.f4008a));
            }
            return this.f4009b;
        }
    }

    public static class c extends l {
        public final o f4006b;
        public final int f4007c;

        public c(o oVar, int i10, int i11) {
            super(b(i10, i11));
            this.f4006b = oVar;
            this.f4007c = i11;
        }

        public static int b(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static c c(IOException iOException, o oVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !z6.b.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i11 == 2007) {
                return new a(iOException, oVar);
            }
            return new c(iOException, oVar, i11, i10);
        }

        public c(String str, o oVar, int i10, int i11) {
            super(str, b(i10, i11));
            this.f4006b = oVar;
            this.f4007c = i11;
        }

        public c(IOException iOException, o oVar, int i10, int i11) {
            super(iOException, b(i10, i11));
            this.f4006b = oVar;
            this.f4007c = i11;
        }

        public c(String str, IOException iOException, o oVar, int i10, int i11) {
            super(str, iOException, b(i10, i11));
            this.f4006b = oVar;
            this.f4007c = i11;
        }
    }
}
