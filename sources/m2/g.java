package m2;

import android.content.Context;
import r2.a;

public class g {
    public static g f16477e;
    public a f16478a;
    public b f16479b;
    public e f16480c;
    public f f16481d;

    public g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16478a = new a(applicationContext, aVar);
        this.f16479b = new b(applicationContext, aVar);
        this.f16480c = new e(applicationContext, aVar);
        this.f16481d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f16477e == null) {
                f16477e = new g(context, aVar);
            }
            gVar = f16477e;
        }
        return gVar;
    }

    public a a() {
        return this.f16478a;
    }

    public b b() {
        return this.f16479b;
    }

    public e d() {
        return this.f16480c;
    }

    public f e() {
        return this.f16481d;
    }
}
