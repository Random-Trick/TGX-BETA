package p180m9;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p180m9.C6806c;
import p303v9.AbstractC9897d;
import p316w9.C10010k;

public class C6803a {

    public class CallableC6804a implements Callable<Void> {
        public final C6806c f21302a;

        public CallableC6804a(C6806c cVar) {
            this.f21302a = cVar;
        }

        public Void call() {
            AbstractC9897d.m6675c(this.f21302a);
            return null;
        }
    }

    public static C6803a m18992a() {
        return new C6803a();
    }

    public static C6806c.C6808b m18991b(String str) {
        return new C6806c.C6808b(str);
    }

    public Future<Void> m18990c(C6806c cVar) {
        return C10010k.m6242a().submit(new CallableC6804a(cVar));
    }
}
