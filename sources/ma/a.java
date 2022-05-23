package ma;

import ra.k;

public class a extends la.a {

    public static final class C0158a {
        public static final C0158a f17333a = new C0158a();
        public static final Integer f17334b;

        static {
            throw new UnsupportedOperationException("Method not decompiled: ma.a.C0158a.<clinit>():void");
        }
    }

    @Override
    public void a(Throwable th, Throwable th2) {
        k.e(th, "cause");
        k.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    public final boolean c(int i10) {
        Integer num = C0158a.f17334b;
        return num == null || num.intValue() >= i10;
    }
}
