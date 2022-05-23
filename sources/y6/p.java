package y6;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.b;
import y6.g;
import y6.h;

public final class p implements com.google.android.youtube.player.b {
    public d f26624a;
    public f f26625b;

    public class a extends h.a {
        public final b.d f26626a;

        public a(b.d dVar) {
            this.f26626a = dVar;
        }

        @Override
        public final void a() {
            this.f26626a.l();
        }

        @Override
        public final void b() {
            this.f26626a.c();
        }

        @Override
        public final void e() {
            this.f26626a.g();
        }

        @Override
        public final void l() {
            this.f26626a.k();
        }

        @Override
        public final void o(String str) {
            this.f26626a.f(str);
        }

        @Override
        public final void z0(String str) {
            b.a aVar;
            try {
                aVar = b.a.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                aVar = b.a.UNKNOWN;
            }
            this.f26626a.m(aVar);
        }
    }

    public class b extends g.a {
        public final b.c f26628a;

        public b(b.c cVar) {
            this.f26628a = cVar;
        }

        @Override
        public final void a() {
            this.f26628a.j();
        }

        @Override
        public final void b() {
            this.f26628a.e();
        }

        @Override
        public final void d(boolean z10) {
            this.f26628a.b(z10);
        }

        @Override
        public final void e() {
            this.f26628a.a();
        }

        @Override
        public final void m(int i10) {
            this.f26628a.h(i10);
        }
    }

    public p(d dVar, f fVar) {
        this.f26624a = (d) y6.b.b(dVar, "connectionClient cannot be null");
        this.f26625b = (f) y6.b.b(fVar, "embeddedPlayer cannot be null");
    }

    public final Bundle A() {
        try {
            return this.f26625b.z();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final View a() {
        try {
            return (View) s.r(this.f26625b.P());
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void b() {
        try {
            this.f26625b.b();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void c(Configuration configuration) {
        try {
            this.f26625b.R(configuration);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void d(boolean z10) {
        try {
            this.f26625b.d(z10);
            this.f26624a.d(z10);
            this.f26624a.l();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final boolean e(int i10, KeyEvent keyEvent) {
        try {
            return this.f26625b.i0(i10, keyEvent);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final boolean f(Bundle bundle) {
        try {
            return this.f26625b.K(bundle);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void g() {
        try {
            this.f26625b.a();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void h(String str) {
        p(str, 0);
    }

    @Override
    public final void i(boolean z10) {
        try {
            this.f26625b.K0(z10);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void j(b.d dVar) {
        try {
            this.f26625b.e0(new a(dVar));
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void k(int i10) {
        try {
            this.f26625b.m(i10);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final boolean l() {
        try {
            return this.f26625b.e();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void m(b.e eVar) {
        try {
            this.f26625b.o(eVar.name());
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void n(int i10) {
        try {
            this.f26625b.P0(i10);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void o(b.c cVar) {
        try {
            this.f26625b.t0(new b(cVar));
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final void p(String str, int i10) {
        try {
            this.f26625b.O0(str, i10);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final int q() {
        try {
            return this.f26625b.j1();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    @Override
    public final int r() {
        try {
            return this.f26625b.z1();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void s() {
        try {
            this.f26625b.w0();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void t(boolean z10) {
        try {
            this.f26625b.y1(z10);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final boolean u(int i10, KeyEvent keyEvent) {
        try {
            return this.f26625b.Y0(i10, keyEvent);
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void v() {
        try {
            this.f26625b.F0();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void w() {
        try {
            this.f26625b.T0();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void x() {
        try {
            this.f26625b.c1();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void y() {
        try {
            this.f26625b.s1();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }

    public final void z() {
        try {
            this.f26625b.n0();
        } catch (RemoteException e10) {
            throw new n(e10);
        }
    }
}
