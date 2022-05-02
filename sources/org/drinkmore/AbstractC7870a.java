package org.drinkmore;

public abstract class AbstractC7870a extends RuntimeException {

    public static class C7871a extends AbstractC7870a {
        public C7871a(String str) {
            super(Tracer.m14777c(str));
        }
    }

    public static final class C7872b extends C7871a {
        public C7872b(String str) {
            super(str + ", versionCode: 1507020");
        }
    }

    public static final class C7873c extends C7871a {
        public C7873c(String str) {
            super(str);
        }
    }

    public static final class C7874d extends C7871a {
        public C7874d(String str) {
            super(str);
        }
    }

    public AbstractC7870a(String str) {
        super(str);
    }

    public static void m14757a(Throwable th) {
        throw new C7871a(th.getMessage());
    }

    public static void m14756b(Throwable th) {
        throw new C7871a(th.getMessage());
    }
}
