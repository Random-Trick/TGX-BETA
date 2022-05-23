package org.drinkmore;

public abstract class a extends RuntimeException {

    public static class C0171a extends a {
        public C0171a(String str) {
            super(Tracer.c(str));
        }
    }

    public static final class b extends C0171a {
        public b(String str) {
            super(str + ", versionCode: 1519020");
        }
    }

    public static final class c extends C0171a {
        public c(String str) {
            super(str);
        }
    }

    public static final class d extends C0171a {
        public d(String str) {
            super(str);
        }
    }

    public a(String str) {
        super(str);
    }

    public static void a(Throwable th) {
        throw new C0171a(th.getMessage());
    }

    public static void b(Throwable th) {
        throw new C0171a(th.getMessage());
    }
}
