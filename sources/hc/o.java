package hc;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class o {
    public static final f a(y yVar) {
        return q.a(yVar);
    }

    public static final g b(a0 a0Var) {
        return q.b(a0Var);
    }

    public static final boolean c(AssertionError assertionError) {
        return p.b(assertionError);
    }

    public static final y d(File file) {
        return p.f(file, false, 1, null);
    }

    public static final y e(File file, boolean z10) {
        return p.c(file, z10);
    }

    public static final y f(OutputStream outputStream) {
        return p.d(outputStream);
    }

    public static final y g(Socket socket) {
        return p.e(socket);
    }

    public static final a0 i(File file) {
        return p.g(file);
    }

    public static final a0 j(InputStream inputStream) {
        return p.h(inputStream);
    }

    public static final a0 k(Socket socket) {
        return p.i(socket);
    }
}
