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
        public void mo9884B(RecyclerView.AbstractC0886d0 d0Var, int i) {
            this.f13448g[0].mo8197b(d0Var.f3479a);
            if (i == (C4403w.m27984G2() ? 8 : 4)) {
                ((AbstractC4011d) d0Var.f3479a).mo5812V0();
                this.f13447f.mo9527a(d0Var);
            }
        }

        public final void m29336C(int i, int i2) {
            AbstractC4009b bVar = this.f13447f;
            if (bVar instanceof AbstractC4010c) {
                ((AbstractC4010c) bVar).mo29331f(i, i2);
            }
        }

        @Override
        public void mo9881c(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int i;
            super.mo9881c(recyclerView, d0Var);
            int i2 = this.f13445d;
            if (!(i2 == -1 || (i = this.f13446e) == -1 || i2 == i)) {
                m29336C(i2, i);
            }
            this.f13446e = -1;
            this.f13445d = -1;
        }

        @Override
        public int mo9880k(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            AbstractC4009b bVar = this.f13447f;
            int g = bVar instanceof AbstractC4010c ? ((AbstractC4010c) bVar).mo29330g(recyclerView, d0Var) : 0;
            int i = (recyclerView.getLayoutManager() == null || recyclerView.getAdapter() == null || recyclerView.getAdapter().mo6153D() <= 0 || !this.f13447f.mo9526b(recyclerView, d0Var, d0Var.m39335k())) ? 0 : C4403w.m27984G2() ? 8 : 4;
            if (g == 0 && i == 0) {
                return 0;
            }
            return C0962g.AbstractC0968f.m38781t(g, i);
        }

        @Override
        public float mo29335m(RecyclerView.AbstractC0886d0 d0Var) {
            return C1357a0.m37541i(this.f13447f.mo9525e()) / d0Var.f3479a.getMeasuredWidth();
        }

        @Override
        public boolean mo29334q() {
            return true;
        }

        @Override
        public boolean mo9879r() {
            AbstractC4009b bVar = this.f13447f;
            return (bVar instanceof AbstractC4010c) && ((AbstractC4010c) bVar).mo29333c();
        }

        @Override
        public void mo9878u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z) {
            if (i != 1) {
                super.mo9878u(canvas, recyclerView, d0Var, f, f2, i, z);
            }
            ((AbstractC4011d) d0Var.f3479a).setRemoveDx(f);
        }

        @Override
        public boolean mo9877y(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int k = d0Var.m39335k();
            int k2 = d0Var2.m39335k();
            AbstractC4009b bVar = this.f13447f;
            if (!(bVar instanceof AbstractC4010c) || !((AbstractC4010c) bVar).mo29332d(recyclerView, d0Var, d0Var2)) {
                return false;
            }
            if (this.f13445d == -1) {
                this.f13445d = k;
            }
            this.f13446e = k2;
            return true;
        }

        @Override
        public void mo9876z(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            super.mo9876z(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
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
        boolean mo29333c();

        boolean mo29332d(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2);

        void mo29331f(int i, int i2);

        int mo29330g(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var);
    }

    public interface AbstractC4011d {
        void mo5812V0();

        void setRemoveDx(float f);
    }

    public C4007j(View view, int i) {
        this.f13442a = view;
        this.f13443b = C1362c.m37482g(view.getResources(), i);
    }

    public static C0962g m29342a(RecyclerView recyclerView, AbstractC4009b bVar) {
        C0962g[] gVarArr = {new C0962g(new C4008a(bVar, gVarArr))};
        gVarArr[0].m38809m(recyclerView);
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
        this.f13438M.m29541l(0.0f);
        this.f13439N = false;
        this.f13441P = 0.0f;
    }

    public void m29341b(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: p053dd.C4007j.m29341b(android.graphics.Canvas):void");
    }

    public void m29340c() {
        C2065g.m35719c(this.f13442a);
        C3950k kVar = this.f13438M;
        if (kVar == null) {
            this.f13438M = new C3950k(0, this, C2057b.f7280b, 180L);
        } else {
            kVar.m29541l(0.0f);
        }
        this.f13439N = true;
        this.f13444c = 0.0f;
        this.f13438M.m29544i(1.0f);
    }

    public void m29339d(Canvas canvas) {
        if (this.f13440O) {
            this.f13440O = false;
            canvas.restore();
        }
    }

    public void m29338e(Canvas canvas) {
        boolean z = this.f13444c != 0.0f && this.f13441P == 0.0f;
        this.f13440O = z;
        if (z) {
            canvas.save();
            canvas.translate(this.f13444c, 0.0f);
        }
    }

    public void m29337f(float f) {
        if (this.f13444c != f) {
            this.f13444c = f;
            this.f13442a.invalidate();
        }
    }
}
