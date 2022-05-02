package p095gc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import qa.C8298k;
import za.C11452o;

public final class C4561p {
    public static final Logger f14991a = Logger.getLogger("okio.Okio");

    public static final boolean m27367b(AssertionError assertionError) {
        C8298k.m12934e(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C11452o.m618C(message, "getsockname failed", false, 2, null) : false;
    }

    public static final AbstractC4572y m27366c(File file, boolean z) {
        C8298k.m12934e(file, "$this$sink");
        return C4560o.m27374f(new FileOutputStream(file, z));
    }

    public static final AbstractC4572y m27365d(OutputStream outputStream) {
        C8298k.m12934e(outputStream, "$this$sink");
        return new C4565s(outputStream, new C4539b0());
    }

    public static final AbstractC4572y m27364e(Socket socket) {
        C8298k.m12934e(socket, "$this$sink");
        C4573z zVar = new C4573z(socket);
        OutputStream outputStream = socket.getOutputStream();
        C8298k.m12935d(outputStream, "getOutputStream()");
        return zVar.m27456v(new C4565s(outputStream, zVar));
    }

    public static AbstractC4572y m27363f(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return C4560o.m27375e(file, z);
    }

    public static final AbstractC4537a0 m27362g(File file) {
        C8298k.m12934e(file, "$this$source");
        return C4560o.m27370j(new FileInputStream(file));
    }

    public static final AbstractC4537a0 m27361h(InputStream inputStream) {
        C8298k.m12934e(inputStream, "$this$source");
        return new C4559n(inputStream, new C4539b0());
    }

    public static final AbstractC4537a0 m27360i(Socket socket) {
        C8298k.m12934e(socket, "$this$source");
        C4573z zVar = new C4573z(socket);
        InputStream inputStream = socket.getInputStream();
        C8298k.m12935d(inputStream, "getInputStream()");
        return zVar.m27455w(new C4559n(inputStream, zVar));
    }
}
