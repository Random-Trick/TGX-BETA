package j;

import android.view.View;
import android.view.animation.Interpolator;
import c1.a0;
import c1.b0;
import c1.c0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
    public Interpolator f14970c;
    public b0 f14971d;
    public boolean f14972e;
    public long f14969b = -1;
    public final c0 f14973f = new a();
    public final ArrayList<a0> f14968a = new ArrayList<>();

    public class a extends c0 {
        public boolean f14974a = false;
        public int f14975b = 0;

        public a() {
        }

        @Override
        public void b(View view) {
            int i10 = this.f14975b + 1;
            this.f14975b = i10;
            if (i10 == h.this.f14968a.size()) {
                b0 b0Var = h.this.f14971d;
                if (b0Var != null) {
                    b0Var.b(null);
                }
                d();
            }
        }

        @Override
        public void c(View view) {
            if (!this.f14974a) {
                this.f14974a = true;
                b0 b0Var = h.this.f14971d;
                if (b0Var != null) {
                    b0Var.c(null);
                }
            }
        }

        public void d() {
            this.f14975b = 0;
            this.f14974a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f14972e) {
            Iterator<a0> it = this.f14968a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f14972e = false;
        }
    }

    public void b() {
        this.f14972e = false;
    }

    public h c(a0 a0Var) {
        if (!this.f14972e) {
            this.f14968a.add(a0Var);
        }
        return this;
    }

    public h d(a0 a0Var, a0 a0Var2) {
        this.f14968a.add(a0Var);
        a0Var2.h(a0Var.c());
        this.f14968a.add(a0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f14972e) {
            this.f14969b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f14972e) {
            this.f14970c = interpolator;
        }
        return this;
    }

    public h g(b0 b0Var) {
        if (!this.f14972e) {
            this.f14971d = b0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f14972e) {
            Iterator<a0> it = this.f14968a.iterator();
            while (it.hasNext()) {
                a0 next = it.next();
                long j10 = this.f14969b;
                if (j10 >= 0) {
                    next.d(j10);
                }
                Interpolator interpolator = this.f14970c;
                if (interpolator != null) {
                    next.e(interpolator);
                }
                if (this.f14971d != null) {
                    next.f(this.f14973f);
                }
                next.j();
            }
            this.f14972e = true;
        }
    }
}
