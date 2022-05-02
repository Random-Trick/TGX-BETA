package me;

import android.view.View;
import android.view.ViewGroup;
import p057e2.AbstractC4117a;
import p139jb.AbstractC5911c;
import p143k0.C6038h;
import td.AbstractC9323v4;

public class C6919i4 extends AbstractC4117a implements AbstractC5911c {
    public final C6038h<AbstractC9323v4<?>> f21867M = new C6038h<>();
    public final AbstractC6920a f21868c;

    public interface AbstractC6920a {
        void mo18452X3(int i, AbstractC9323v4<?> v4Var);

        AbstractC9323v4<?> mo18451e3(int i);

        int mo18450s7();

        void mo18449w(int i, AbstractC9323v4<?> v4Var);
    }

    public C6919i4(AbstractC6920a aVar) {
        this.f21868c = aVar;
    }

    @Override
    public void mo4501a3() {
        int n = this.f21867M.m21463n();
        for (int i = 0; i < n; i++) {
            AbstractC9323v4<?> o = this.f21867M.m21462o(i);
            if (!o.m9347Sa()) {
                o.mo417Z8();
            }
        }
        this.f21867M.m21474b();
    }

    @Override
    public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
        AbstractC9323v4<?> v4Var = (AbstractC9323v4) obj;
        viewGroup.removeView(v4Var.get());
        this.f21868c.mo18452X3(i, v4Var);
        v4Var.mo9216lc();
    }

    @Override
    public int mo8825e() {
        return this.f21868c.mo18450s7();
    }

    @Override
    public int mo8824f(Object obj) {
        for (int i = 0; i < this.f21867M.m21463n(); i++) {
            if (this.f21867M.m21462o(i) == obj) {
                return this.f21867M.m21467i(i);
            }
        }
        return -2;
    }

    @Override
    public Object mo8823j(ViewGroup viewGroup, int i) {
        AbstractC9323v4<?> e = this.f21867M.m21471e(i);
        if (e == null) {
            e = this.f21868c.mo18451e3(i);
            this.f21867M.m21466j(i, e);
        }
        View v9 = e.get();
        if (v9.getParent() != null) {
            ((ViewGroup) v9.getParent()).removeView(v9);
        }
        this.f21868c.mo18449w(i, e);
        e.mo9477Ac();
        viewGroup.addView(v9);
        return e;
    }

    @Override
    public boolean mo8822k(View view, Object obj) {
        return (obj instanceof AbstractC9323v4) && ((AbstractC9323v4) obj).m9427Ha() == view;
    }

    public AbstractC9323v4<?> m18455v(int i) {
        return this.f21867M.m21471e(i);
    }

    public void m18454w(int i) {
        for (int n = this.f21867M.m21463n() - 1; n >= 0; n--) {
            int i2 = this.f21867M.m21467i(n);
            if (i2 >= i) {
                this.f21867M.m21464l(n);
                this.f21867M.m21466j(i2 + 1, this.f21867M.m21462o(n));
            } else {
                return;
            }
        }
    }

    public void m18453x(int i) {
        int g = this.f21867M.m21469g(i);
        if (g >= 0) {
            this.f21867M.m21464l(g);
            this.f21867M.m21462o(g).mo417Z8();
            int n = this.f21867M.m21463n();
            while (g < n) {
                int i2 = this.f21867M.m21467i(g);
                this.f21867M.m21464l(g);
                this.f21867M.m21466j(i2 - 1, this.f21867M.m21462o(g));
                g++;
            }
        }
    }
}
