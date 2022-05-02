package na;

import java.io.Closeable;
import p107ha.C5040a;

public final class C7315a {
    public static final void m17061a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C5040a.m24202a(th, th2);
            }
        }
    }
}
