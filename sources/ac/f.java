package ac;

import ra.k;

public final class f {
    public static final f f724a = new f();

    public static final boolean a(String str) {
        k.e(str, "method");
        return !k.b(str, "GET") && !k.b(str, "HEAD");
    }

    public static final boolean d(String str) {
        k.e(str, "method");
        return k.b(str, "POST") || k.b(str, "PUT") || k.b(str, "PATCH") || k.b(str, "PROPPATCH") || k.b(str, "REPORT");
    }

    public final boolean b(String str) {
        k.e(str, "method");
        return !k.b(str, "PROPFIND");
    }

    public final boolean c(String str) {
        k.e(str, "method");
        return k.b(str, "PROPFIND");
    }
}
