package hc;

import ab.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import ra.k;

public final class p {
    public static final Logger f12660a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        k.e(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? o.C(message, "getsockname failed", false, 2, null) : false;
    }

    public static final y c(File file, boolean z10) {
        k.e(file, "$this$sink");
        return o.f(new FileOutputStream(file, z10));
    }

    public static final y d(OutputStream outputStream) {
        k.e(outputStream, "$this$sink");
        return new s(outputStream, new b0());
    }

    public static final y e(Socket socket) {
        k.e(socket, "$this$sink");
        z zVar = new z(socket);
        OutputStream outputStream = socket.getOutputStream();
        k.d(outputStream, "getOutputStream()");
        return zVar.v(new s(outputStream, zVar));
    }

    public static y f(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return o.e(file, z10);
    }

    public static final a0 g(File file) {
        k.e(file, "$this$source");
        return o.j(new FileInputStream(file));
    }

    public static final a0 h(InputStream inputStream) {
        k.e(inputStream, "$this$source");
        return new n(inputStream, new b0());
    }

    public static final a0 i(Socket socket) {
        k.e(socket, "$this$source");
        z zVar = new z(socket);
        InputStream inputStream = socket.getInputStream();
        k.d(inputStream, "getInputStream()");
        return zVar.w(new n(inputStream, zVar));
    }
}
