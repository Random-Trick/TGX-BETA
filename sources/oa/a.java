package oa;

import java.io.Closeable;

public final class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            ia.a.a(th, th2);
        }
    }
}
