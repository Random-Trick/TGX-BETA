package n9;

import android.os.Handler;
import android.os.Looper;
import da.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class c {
    public ba.a f17779a;
    public List<ca.b> f17780b;
    public List<ca.b> f17781c;
    public f f17782d;
    public f f17783e;
    public ga.b f17784f;
    public int f17785g;
    public fa.b f17786h;
    public ea.a f17787i;
    public z9.a f17788j;
    public n9.b f17789k;
    public Handler f17790l;

    public static class b {
        public final ba.a f17791a;
        public final List<ca.b> f17792b = new ArrayList();
        public final List<ca.b> f17793c = new ArrayList();
        public n9.b f17794d;
        public Handler f17795e;
        public f f17796f;
        public f f17797g;
        public ga.b f17798h;
        public int f17799i;
        public fa.b f17800j;
        public ea.a f17801k;
        public z9.a f17802l;

        public b(String str) {
            this.f17791a = new ba.b(str);
        }

        public b a(ca.b bVar) {
            this.f17792b.add(bVar);
            this.f17793c.add(bVar);
            return this;
        }

        public c b() {
            if (this.f17794d == null) {
                throw new IllegalStateException("listener can't be null");
            } else if (!this.f17792b.isEmpty() || !this.f17793c.isEmpty()) {
                int i10 = this.f17799i;
                if (i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270) {
                    if (this.f17795e == null) {
                        Looper myLooper = Looper.myLooper();
                        if (myLooper == null) {
                            myLooper = Looper.getMainLooper();
                        }
                        this.f17795e = new Handler(myLooper);
                    }
                    if (this.f17796f == null) {
                        this.f17796f = da.a.b().b();
                    }
                    if (this.f17797g == null) {
                        this.f17797g = da.b.a();
                    }
                    if (this.f17798h == null) {
                        this.f17798h = new ga.a();
                    }
                    if (this.f17800j == null) {
                        this.f17800j = new fa.a();
                    }
                    if (this.f17801k == null) {
                        this.f17801k = new ea.c();
                    }
                    if (this.f17802l == null) {
                        this.f17802l = new z9.b();
                    }
                    c cVar = new c();
                    cVar.f17789k = this.f17794d;
                    cVar.f17781c = this.f17792b;
                    cVar.f17780b = this.f17793c;
                    cVar.f17779a = this.f17791a;
                    cVar.f17790l = this.f17795e;
                    cVar.f17782d = this.f17796f;
                    cVar.f17783e = this.f17797g;
                    cVar.f17784f = this.f17798h;
                    cVar.f17785g = this.f17799i;
                    cVar.f17786h = this.f17800j;
                    cVar.f17787i = this.f17801k;
                    cVar.f17788j = this.f17802l;
                    return cVar;
                }
                throw new IllegalArgumentException("Accepted values for rotation are 0, 90, 180, 270");
            } else {
                throw new IllegalStateException("we need at least one data source");
            }
        }

        public b c(f fVar) {
            this.f17796f = fVar;
            return this;
        }

        public b d(n9.b bVar) {
            this.f17794d = bVar;
            return this;
        }

        public b e(int i10) {
            this.f17799i = i10;
            return this;
        }

        public b f(f fVar) {
            this.f17797g = fVar;
            return this;
        }

        public Future<Void> g() {
            return n9.a.a().c(b());
        }
    }

    public c() {
    }

    public List<ca.b> m() {
        return this.f17781c;
    }

    public z9.a n() {
        return this.f17788j;
    }

    public ea.a o() {
        return this.f17787i;
    }

    public f p() {
        return this.f17782d;
    }

    public ba.a q() {
        return this.f17779a;
    }

    public n9.b r() {
        return this.f17789k;
    }

    public Handler s() {
        return this.f17790l;
    }

    public fa.b t() {
        return this.f17786h;
    }

    public ga.b u() {
        return this.f17784f;
    }

    public List<ca.b> v() {
        return this.f17780b;
    }

    public int w() {
        return this.f17785g;
    }

    public f x() {
        return this.f17783e;
    }
}
