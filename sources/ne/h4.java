package ne;

import android.view.View;
import android.view.ViewGroup;
import k0.h;
import kb.c;
import ud.v4;

public class h4 extends e2.a implements c {
    public final h<v4<?>> M = new h<>();
    public final a f18083c;

    public interface a {
        void E1(int i10, v4<?> v4Var);

        void I6(int i10, v4<?> v4Var);

        v4<?> S2(int i10);

        int s7();
    }

    public h4(a aVar) {
        this.f18083c = aVar;
    }

    @Override
    public void Q2() {
        int n10 = this.M.n();
        for (int i10 = 0; i10 < n10; i10++) {
            v4<?> o10 = this.M.o(i10);
            if (!o10.Sa()) {
                o10.Z8();
            }
        }
        this.M.b();
    }

    @Override
    public void b(ViewGroup viewGroup, int i10, Object obj) {
        v4<?> v4Var = (v4) obj;
        viewGroup.removeView(v4Var.get());
        this.f18083c.E1(i10, v4Var);
        v4Var.lc();
    }

    @Override
    public int e() {
        return this.f18083c.s7();
    }

    @Override
    public int f(Object obj) {
        for (int i10 = 0; i10 < this.M.n(); i10++) {
            if (this.M.o(i10) == obj) {
                return this.M.i(i10);
            }
        }
        return -2;
    }

    @Override
    public Object j(ViewGroup viewGroup, int i10) {
        v4<?> e10 = this.M.e(i10);
        if (e10 == null) {
            e10 = this.f18083c.S2(i10);
            this.M.j(i10, e10);
        }
        View v92 = e10.get();
        if (v92.getParent() != null) {
            ((ViewGroup) v92.getParent()).removeView(v92);
        }
        this.f18083c.I6(i10, e10);
        e10.Ac();
        viewGroup.addView(v92);
        return e10;
    }

    @Override
    public boolean k(View view, Object obj) {
        return (obj instanceof v4) && ((v4) obj).Ha() == view;
    }

    public v4<?> v(int i10) {
        return this.M.e(i10);
    }

    public void w(int i10) {
        for (int n10 = this.M.n() - 1; n10 >= 0; n10--) {
            int i11 = this.M.i(n10);
            if (i11 >= i10) {
                this.M.l(n10);
                this.M.j(i11 + 1, this.M.o(n10));
            } else {
                return;
            }
        }
    }

    public void x(int i10) {
        int g10 = this.M.g(i10);
        if (g10 >= 0) {
            this.M.l(g10);
            this.M.o(g10).Z8();
            int n10 = this.M.n();
            while (g10 < n10) {
                int i11 = this.M.i(g10);
                this.M.l(g10);
                this.M.j(i11 - 1, this.M.o(g10));
                g10++;
            }
        }
    }
}
