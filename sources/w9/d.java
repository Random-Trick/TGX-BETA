package w9;

import ga.b;
import ia.q;
import n9.c;
import ra.g;
import ra.k;
import ra.l;
import x9.i;
import x9.m;

public abstract class d {
    public static final a f25844b = new a(null);
    public static final i f25843a = new i("TranscodeEngine");

    public static final class a {

        public static final class C0239a extends l implements qa.l<Double, q> {
            public final c f25845b;

            public C0239a(c cVar) {
                super(1);
                this.f25845b = cVar;
            }

            @Override
            public q a(Double d10) {
                f(d10.doubleValue());
                return q.f14159a;
            }

            public final void f(double d10) {
                this.f25845b.d(d10);
            }
        }

        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final boolean a(Throwable th) {
            Throwable cause;
            if (th instanceof InterruptedException) {
                return true;
            }
            if (!k.b(th, th.getCause()) && (cause = th.getCause()) != null) {
                return a(cause);
            }
            return false;
        }

        public final void b(c cVar) {
            Throwable th;
            Exception e10;
            w9.a aVar;
            k.e(cVar, "options");
            d.f25843a.c("transcode(): called...");
            c cVar2 = new c(cVar);
            w9.a aVar2 = null;
            try {
                try {
                    p9.d dVar = new p9.d(cVar);
                    ba.a q10 = cVar.q();
                    k.d(q10, "options.dataSink");
                    x9.l c10 = m.c(cVar.x(), cVar.p());
                    b u10 = cVar.u();
                    k.d(u10, "options.validator");
                    int w10 = cVar.w();
                    fa.b t10 = cVar.t();
                    k.d(t10, "options.timeInterpolator");
                    ea.a o10 = cVar.o();
                    k.d(o10, "options.audioStretcher");
                    z9.a n10 = cVar.n();
                    k.d(n10, "options.audioResampler");
                    aVar = new w9.a(dVar, q10, c10, u10, w10, o10, n10, t10);
                } catch (Exception e11) {
                    e10 = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (!aVar.e()) {
                    cVar2.e(1);
                } else {
                    aVar.d(new C0239a(cVar2));
                    cVar2.e(0);
                }
                aVar.b();
            } catch (Exception e12) {
                e10 = e12;
                aVar2 = aVar;
                if (a(e10)) {
                    d.f25843a.d("Transcode canceled.", e10);
                    cVar2.b();
                    if (aVar2 != null) {
                        aVar2.b();
                        return;
                    }
                    return;
                }
                d.f25843a.b("Unexpected error while transcoding.", e10);
                cVar2.c(e10);
                throw e10;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
                throw th;
            }
        }
    }

    public static final void c(c cVar) {
        f25844b.b(cVar);
    }

    public abstract void b();

    public abstract void d(qa.l<? super Double, q> lVar);

    public abstract boolean e();
}
