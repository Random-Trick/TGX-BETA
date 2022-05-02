package p053dd;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.C0962g;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1362c;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3950k;
import p082fd.C4403w;

public class C4007j implements C3950k.AbstractC3952b {
    public C3950k f13438M;
    public boolean f13439N;
    public boolean f13440O = false;
    public float f13441P;
    public View f13442a;
    public Drawable f13443b;
    public float f13444c;

    public class C4008a extends C0962g.AbstractC0968f {
        public int f13445d = -1;
        public int f13446e = -1;
        public final AbstractC4009b f13447f;
        public final C0962g[] f13448g;

        public C4008a(AbstractC4009b bVar, C0962g[] gVarArr) {
            this.f13447f = bVar;
            this.f13448g = gVarArr;
        }

        @Override
        public void mo9883B(RecyclerView.AbstractC0886d0 d0Var, int i) {
            this.f13448g[0].mo8197b(d0Var.f3479a);
            if (i == (C4403w.m27986G2() ? 8 : 4)) {
                ((AbstractC4011d) d0Var.f3479a).mo5812V0();
                this.f13447f.mo9527a(d0Var);
            }
        }

        public final void m29338C(int i, int i2) {
            AbstractC4009b bVar = this.f13447f;
            if (bVar instanceof AbstractC4010c) {
                ((AbstractC4010c) bVar).mo29333f(i, i2);
            }
        }

        @Override
        public void mo9880c(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int i;
            super.mo9880c(recyclerView, d0Var);
            int i2 = this.f13445d;
            if (!(i2 == -1 || (i = this.f13446e) == -1 || i2 == i)) {
                m29338C(i2, i);
            }
            this.f13446e = -1;
            this.f13445d = -1;
        }

        @Override
        public int mo9879k(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            AbstractC4009b bVar = this.f13447f;
            int g = bVar instanceof AbstractC4010c ? ((AbstractC4010c) bVar).mo29332g(recyclerView, d0Var) : 0;
            int i = (recyclerView.getLayoutManager() == null || recyclerView.getAdapter() == null || recyclerView.getAdapter().mo6153D() <= 0 || !this.f13447f.mo9526b(recyclerView, d0Var, d0Var.m39338k())) ? 0 : C4403w.m27986G2() ? 8 : 4;
            if (g == 0 && i == 0) {
                return 0;
            }
            return C0962g.AbstractC0968f.m38784t(g, i);
        }

        @Override
        public float mo29337m(RecyclerView.AbstractC0886d0 d0Var) {
            return C1357a0.m37544i(this.f13447f.mo9525e()) / d0Var.f3479a.getMeasuredWidth();
        }

        @Override
        public boolean mo29336q() {
            return true;
        }

        @Override
        public boolean mo9878r() {
            AbstractC4009b bVar = this.f13447f;
            return (bVar instanceof AbstractC4010c) && ((AbstractC4010c) bVar).mo29335c();
        }

        @Override
        public void mo9877u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z) {
            if (i != 1) {
                super.mo9877u(canvas, recyclerView, d0Var, f, f2, i, z);
            }
            ((AbstractC4011d) d0Var.f3479a).setRemoveDx(f);
        }

        @Override
        public boolean mo9876y(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int k = d0Var.m39338k();
            int k2 = d0Var2.m39338k();
            AbstractC4009b bVar = this.f13447f;
            if (!(bVar instanceof AbstractC4010c) || !((AbstractC4010c) bVar).mo29334d(recyclerView, d0Var, d0Var2)) {
                return false;
            }
            if (this.f13445d == -1) {
                this.f13445d = k;
            }
            this.f13446e = k2;
            return true;
        }

        @Override
        public void mo9875z(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            super.mo9875z(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
            d0Var.f3479a.invalidate();
            d0Var2.f3479a.invalidate();
        }
    }

    public interface AbstractC4009b {
        void mo9527a(RecyclerView.AbstractC0886d0 d0Var);

        boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i);

        float mo9525e();
    }

    public interface AbstractC4010c extends AbstractC4009b {
        boolean mo29335c();

        boolean mo29334d(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2);

        void mo29333f(int i, int i2);

        int mo29332g(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var);
    }

    public interface AbstractC4011d {
        void mo5812V0();

        void setRemoveDx(float f);
    }

    public C4007j(View view, int i) {
        this.f13442a = view;
        this.f13443b = C1362c.m37485g(view.getResources(), i);
    }

    public static C0962g m29344a(RecyclerView recyclerView, AbstractC4009b bVar) {
        C0962g[] gVarArr = {new C0962g(new C4008a(bVar, gVarArr))};
        gVarArr[0].m38812m(recyclerView);
        return gVarArr[0];
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f13441P != f) {
            this.f13441P = f;
            this.f13442a.invalidate();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        this.f13438M.m29543l(0.0f);
        this.f13439N = false;
        this.f13441P = 0.0f;
    }

    public void m29343b(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: p053dd.C4007j.m29343b(android.graphics.Canvas):void");
    }

    public void m29342c() {
        C2065g.m35722c(this.f13442a);
        C3950k kVar = this.f13438M;
        if (kVar == null) {
            this.f13438M = new C3950k(0, this, C2057b.f7280b, 180L);
        } else {
            kVar.m29543l(0.0f);
        }
        this.f13439N = true;
        this.f13444c = 0.0f;
        this.f13438M.m29546i(1.0f);
    }

    public void m29341d(Canvas canvas) {
        if (this.f13440O) {
            this.f13440O = false;
            canvas.restore();
        }
    }

    public void m29340e(Canvas canvas) {
        boolean z = this.f13444c != 0.0f && this.f13441P == 0.0f;
        this.f13440O = z;
        if (z) {
            canvas.save();
            canvas.translate(this.f13444c, 0.0f);
        }
    }

    public void m29339f(float f) {
        if (this.f13444c != f) {
            this.f13444c = f;
            this.f13442a.invalidate();
        }
    }
}
