package p303v9;

import p011aa.AbstractC0237a;
import p050da.AbstractC3930a;
import p065ea.AbstractC4177b;
import p079fa.AbstractC4333b;
import p107ha.C5060q;
import p180m9.C6806c;
import p205o9.C7802d;
import p316w9.AbstractC10012l;
import p316w9.C10007i;
import p316w9.C10014m;
import p346y9.AbstractC10456a;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC9897d {
    public static final C9898a f32199b = new C9898a(null);
    public static final C10007i f32198a = new C10007i("TranscodeEngine");

    public static final class C9898a {

        public static final class C9899a extends AbstractC8299l implements AbstractC8088l<Double, C5060q> {
            public final C9892c f32200b;

            public C9899a(C9892c cVar) {
                super(1);
                this.f32200b = cVar;
            }

            @Override
            public C5060q mo568a(Double d) {
                m6670f(d.doubleValue());
                return C5060q.f17066a;
            }

            public final void m6670f(double d) {
                this.f32200b.m6679d(d);
            }
        }

        public C9898a() {
        }

        public final boolean m6672a(Throwable th) {
            Throwable cause;
            if (th instanceof InterruptedException) {
                return true;
            }
            if (!C8298k.m12936b(th, th.getCause()) && (cause = th.getCause()) != null) {
                return m6672a(cause);
            }
            return false;
        }

        public final void m6671b(C6806c cVar) {
            Throwable th;
            Exception e;
            C9885a aVar;
            C8298k.m12933e(cVar, "options");
            AbstractC9897d.f32198a.m6267c("transcode(): called...");
            C9892c cVar2 = new C9892c(cVar);
            C9885a aVar2 = null;
            try {
                try {
                    C7802d dVar = new C7802d(cVar);
                    AbstractC0237a q = cVar.m18969q();
                    C8298k.m12934d(q, "options.dataSink");
                    AbstractC10012l c = C10014m.m6221c(cVar.m18962x(), cVar.m18970p());
                    AbstractC4333b u = cVar.m18965u();
                    C8298k.m12934d(u, "options.validator");
                    int w = cVar.m18963w();
                    AbstractC4177b t = cVar.m18966t();
                    C8298k.m12934d(t, "options.timeInterpolator");
                    AbstractC3930a o = cVar.m18971o();
                    C8298k.m12934d(o, "options.audioStretcher");
                    AbstractC10456a n = cVar.m18972n();
                    C8298k.m12934d(n, "options.audioResampler");
                    aVar = new C9885a(dVar, q, c, u, w, o, n, t);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (!aVar.mo6673e()) {
                    cVar2.m6678e(1);
                } else {
                    aVar.mo6674d(new C9899a(cVar2));
                    cVar2.m6678e(0);
                }
                aVar.mo6676b();
            } catch (Exception e3) {
                e = e3;
                aVar2 = aVar;
                if (m6672a(e)) {
                    AbstractC9897d.f32198a.m6266d("Transcode canceled.", e);
                    cVar2.m6681b();
                    if (aVar2 != null) {
                        aVar2.mo6676b();
                        return;
                    }
                    return;
                }
                AbstractC9897d.f32198a.m6268b("Unexpected error while transcoding.", e);
                cVar2.m6680c(e);
                throw e;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo6676b();
                }
                throw th;
            }
        }

        public C9898a(C8294g gVar) {
            this();
        }
    }

    public static final void m6675c(C6806c cVar) {
        f32199b.m6671b(cVar);
    }

    public abstract void mo6676b();

    public abstract void mo6674d(AbstractC8088l<? super Double, C5060q> lVar);

    public abstract boolean mo6673e();
}
