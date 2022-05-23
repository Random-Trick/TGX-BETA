package n9;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import n9.c;
import w9.d;
import x9.k;

public class a {

    public class CallableC0161a implements Callable<Void> {
        public final c f17777a;

        public CallableC0161a(c cVar) {
            this.f17777a = cVar;
        }

        public Void call() {
            d.c(this.f17777a);
            return null;
        }
    }

    public static a a() {
        return new a();
    }

    public static c.b b(String str) {
        return new c.b(str);
    }

    public Future<Void> c(c cVar) {
        return k.a().submit(new CallableC0161a(cVar));
    }
}
