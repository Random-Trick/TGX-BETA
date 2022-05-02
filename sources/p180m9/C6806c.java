package p180m9;

import android.os.Handler;
import android.os.Looper;
import ba.AbstractC1296b;
import ca.AbstractC2055f;
import ca.C2044a;
import ca.C2048b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import p011aa.AbstractC0237a;
import p011aa.C0238b;
import p050da.AbstractC3930a;
import p050da.C3932c;
import p065ea.AbstractC4177b;
import p065ea.C4176a;
import p079fa.AbstractC4333b;
import p079fa.C4332a;
import p346y9.AbstractC10456a;
import p346y9.C10457b;

public class C6806c {
    public AbstractC0237a f21304a;
    public List<AbstractC1296b> f21305b;
    public List<AbstractC1296b> f21306c;
    public AbstractC2055f f21307d;
    public AbstractC2055f f21308e;
    public AbstractC4333b f21309f;
    public int f21310g;
    public AbstractC4177b f21311h;
    public AbstractC3930a f21312i;
    public AbstractC10456a f21313j;
    public AbstractC6805b f21314k;
    public Handler f21315l;

    public static class C6808b {
        public final AbstractC0237a f21316a;
        public final List<AbstractC1296b> f21317b = new ArrayList();
        public final List<AbstractC1296b> f21318c = new ArrayList();
        public AbstractC6805b f21319d;
        public Handler f21320e;
        public AbstractC2055f f21321f;
        public AbstractC2055f f21322g;
        public AbstractC4333b f21323h;
        public int f21324i;
        public AbstractC4177b f21325j;
        public AbstractC3930a f21326k;
        public AbstractC10456a f21327l;

        public C6808b(String str) {
            this.f21316a = new C0238b(str);
        }

        public C6808b m18961a(AbstractC1296b bVar) {
            this.f21317b.add(bVar);
            this.f21318c.add(bVar);
            return this;
        }

        public C6806c m18960b() {
            if (this.f21319d == null) {
                throw new IllegalStateException("listener can't be null");
            } else if (!this.f21317b.isEmpty() || !this.f21318c.isEmpty()) {
                int i = this.f21324i;
                if (i == 0 || i == 90 || i == 180 || i == 270) {
                    if (this.f21320e == null) {
                        Looper myLooper = Looper.myLooper();
                        if (myLooper == null) {
                            myLooper = Looper.getMainLooper();
                        }
                        this.f21320e = new Handler(myLooper);
                    }
                    if (this.f21321f == null) {
                        this.f21321f = C2044a.m35777b().m35773b();
                    }
                    if (this.f21322g == null) {
                        this.f21322g = C2048b.m35761a();
                    }
                    if (this.f21323h == null) {
                        this.f21323h = new C4332a();
                    }
                    if (this.f21325j == null) {
                        this.f21325j = new C4176a();
                    }
                    if (this.f21326k == null) {
                        this.f21326k = new C3932c();
                    }
                    if (this.f21327l == null) {
                        this.f21327l = new C10457b();
                    }
                    C6806c cVar = new C6806c();
                    cVar.f21314k = this.f21319d;
                    cVar.f21306c = this.f21317b;
                    cVar.f21305b = this.f21318c;
                    cVar.f21304a = this.f21316a;
                    cVar.f21315l = this.f21320e;
                    cVar.f21307d = this.f21321f;
                    cVar.f21308e = this.f21322g;
                    cVar.f21309f = this.f21323h;
                    cVar.f21310g = this.f21324i;
                    cVar.f21311h = this.f21325j;
                    cVar.f21312i = this.f21326k;
                    cVar.f21313j = this.f21327l;
                    return cVar;
                }
                throw new IllegalArgumentException("Accepted values for rotation are 0, 90, 180, 270");
            } else {
                throw new IllegalStateException("we need at least one data source");
            }
        }

        public C6808b m18959c(AbstractC2055f fVar) {
            this.f21321f = fVar;
            return this;
        }

        public C6808b m18958d(AbstractC6805b bVar) {
            this.f21319d = bVar;
            return this;
        }

        public C6808b m18957e(int i) {
            this.f21324i = i;
            return this;
        }

        public C6808b m18956f(AbstractC2055f fVar) {
            this.f21322g = fVar;
            return this;
        }

        public Future<Void> m18955g() {
            return C6803a.m18993a().m18991c(m18960b());
        }
    }

    public List<AbstractC1296b> m18973m() {
        return this.f21306c;
    }

    public AbstractC10456a m18972n() {
        return this.f21313j;
    }

    public AbstractC3930a m18971o() {
        return this.f21312i;
    }

    public AbstractC2055f m18970p() {
        return this.f21307d;
    }

    public AbstractC0237a m18969q() {
        return this.f21304a;
    }

    public AbstractC6805b m18968r() {
        return this.f21314k;
    }

    public Handler m18967s() {
        return this.f21315l;
    }

    public AbstractC4177b m18966t() {
        return this.f21311h;
    }

    public AbstractC4333b m18965u() {
        return this.f21309f;
    }

    public List<AbstractC1296b> m18964v() {
        return this.f21305b;
    }

    public int m18963w() {
        return this.f21310g;
    }

    public AbstractC2055f m18962x() {
        return this.f21308e;
    }

    public C6806c() {
    }
}
