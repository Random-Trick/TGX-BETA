package p362zb;

import qa.C8298k;

public final class C11465f {
    public static final C11465f f36431a = new C11465f();

    public static final boolean m543a(String str) {
        C8298k.m12933e(str, "method");
        return !C8298k.m12936b(str, "GET") && !C8298k.m12936b(str, "HEAD");
    }

    public static final boolean m540d(String str) {
        C8298k.m12933e(str, "method");
        return C8298k.m12936b(str, "POST") || C8298k.m12936b(str, "PUT") || C8298k.m12936b(str, "PATCH") || C8298k.m12936b(str, "PROPPATCH") || C8298k.m12936b(str, "REPORT");
    }

    public final boolean m542b(String str) {
        C8298k.m12933e(str, "method");
        return !C8298k.m12936b(str, "PROPFIND");
    }

    public final boolean m541c(String str) {
        C8298k.m12933e(str, "method");
        return C8298k.m12936b(str, "PROPFIND");
    }
}
