package ed;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import ce.a0;
import eb.k;
import gd.w;

public class j implements k.b {
    public k M;
    public boolean N;
    public boolean O = false;
    public float P;
    public View f11573a;
    public Drawable f11574b;
    public float f11575c;

    public class a extends g.e {
        public int f11576d = -1;
        public int f11577e = -1;
        public final b f11578f;
        public final g[] f11579g;

        public a(b bVar, g[] gVarArr) {
            this.f11578f = bVar;
            this.f11579g = gVarArr;
        }

        @Override
        public void B(RecyclerView.c0 c0Var, int i10) {
            this.f11579g[0].b(c0Var.f2982a);
            if (i10 == (w.G2() ? 8 : 4)) {
                ((d) c0Var.f2982a).U0();
                this.f11578f.a(c0Var);
            }
        }

        public final void C(int i10, int i11) {
            b bVar = this.f11578f;
            if (bVar instanceof c) {
                ((c) bVar).f(i10, i11);
            }
        }

        @Override
        public void c(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int i10;
            super.c(recyclerView, c0Var);
            int i11 = this.f11576d;
            if (!(i11 == -1 || (i10 = this.f11577e) == -1 || i11 == i10)) {
                C(i11, i10);
            }
            this.f11577e = -1;
            this.f11576d = -1;
        }

        @Override
        public int k(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            b bVar = this.f11578f;
            int g10 = bVar instanceof c ? ((c) bVar).g(recyclerView, c0Var) : 0;
            int i10 = (recyclerView.getLayoutManager() == null || recyclerView.getAdapter() == null || recyclerView.getAdapter().D() <= 0 || !this.f11578f.b(recyclerView, c0Var, c0Var.k())) ? 0 : w.G2() ? 8 : 4;
            if (g10 == 0 && i10 == 0) {
                return 0;
            }
            return g.e.t(g10, i10);
        }

        @Override
        public float m(RecyclerView.c0 c0Var) {
            return a0.i(this.f11578f.e()) / c0Var.f2982a.getMeasuredWidth();
        }

        @Override
        public boolean q() {
            return true;
        }

        @Override
        public boolean r() {
            b bVar = this.f11578f;
            return (bVar instanceof c) && ((c) bVar).c();
        }

        @Override
        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f10, float f11, int i10, boolean z10) {
            if (i10 != 1) {
                super.u(canvas, recyclerView, c0Var, f10, f11, i10, z10);
            }
            ((d) c0Var.f2982a).setRemoveDx(f10);
        }

        @Override
        public boolean y(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            int k10 = c0Var.k();
            int k11 = c0Var2.k();
            b bVar = this.f11578f;
            if (!(bVar instanceof c) || !((c) bVar).d(recyclerView, c0Var, c0Var2)) {
                return false;
            }
            if (this.f11576d == -1) {
                this.f11576d = k10;
            }
            this.f11577e = k11;
            return true;
        }

        @Override
        public void z(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10, RecyclerView.c0 c0Var2, int i11, int i12, int i13) {
            super.z(recyclerView, c0Var, i10, c0Var2, i11, i12, i13);
            c0Var.f2982a.invalidate();
            c0Var2.f2982a.invalidate();
        }
    }

    public interface b {
        void a(RecyclerView.c0 c0Var);

        boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10);

        float e();
    }

    public interface c extends b {
        boolean c();

        boolean d(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2);

        void f(int i10, int i11);

        int g(RecyclerView recyclerView, RecyclerView.c0 c0Var);
    }

    public interface d {
        void U0();

        void setRemoveDx(float f10);
    }

    public j(View view, int i10) {
        this.f11573a = view;
        this.f11574b = ce.c.g(view.getResources(), i10);
    }

    public static g a(RecyclerView recyclerView, b bVar) {
        g[] gVarArr = {new g(new a(bVar, gVarArr))};
        gVarArr[0].m(recyclerView);
        return gVarArr[0];
    }

    public void b(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: ed.j.b(android.graphics.Canvas):void");
    }

    public void c() {
        db.g.c(this.f11573a);
        k kVar = this.M;
        if (kVar == null) {
            this.M = new k(0, this, db.b.f7287b, 180L);
        } else {
            kVar.l(0.0f);
        }
        this.N = true;
        this.f11575c = 0.0f;
        this.M.i(1.0f);
    }

    public void d(Canvas canvas) {
        if (this.O) {
            this.O = false;
            canvas.restore();
        }
    }

    public void e(Canvas canvas) {
        boolean z10 = this.f11575c != 0.0f && this.P == 0.0f;
        this.O = z10;
        if (z10) {
            canvas.save();
            canvas.translate(this.f11575c, 0.0f);
        }
    }

    public void f(float f10) {
        if (this.f11575c != f10) {
            this.f11575c = f10;
            this.f11573a.invalidate();
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (this.P != f10) {
            this.P = f10;
            this.f11573a.invalidate();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        this.M.l(0.0f);
        this.N = false;
        this.P = 0.0f;
    }
}
