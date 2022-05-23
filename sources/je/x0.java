package je;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.j0;
import eb.n;
import eb.o;
import gb.j;
import ib.c;
import je.g;
import ld.b;
import org.drinkless.td.libcore.telegram.TdApi;
import ud.v4;
import zd.hj;
import zd.o6;

public class x0 implements n.d {
    public final String M;
    public final w0 N;
    public final k O;
    public l0[] P;
    public boolean Q;
    public int R;
    public int S;
    public g.AbstractC0133g T;
    public gb.g U;
    public j V;
    public g.c W;
    public final int[] f15518a;
    public final int[] f15519b;
    public final g[] f15520c;

    public x0(String str, w0 w0Var, k kVar) {
        this.f15518a = new int[2];
        this.f15520c = new g[2];
        this.f15519b = new int[2];
        this.M = str;
        this.N = w0Var;
        this.O = kVar;
        this.R = -1;
    }

    public static x0 z(v4<?> v4Var, g.c cVar, TdApi.RichText richText, w0 w0Var, k kVar, hj.q qVar) {
        d a10 = d.a(v4Var, richText, qVar);
        return new x0(a10.f15360a, w0Var, kVar, a10.f15361b).a(8).D(cVar);
    }

    public boolean A(View view) {
        g l10 = l();
        return l10 != null && l10.W0(view);
    }

    public g B(int i10) {
        this.Q = j0.Q();
        return k(i10);
    }

    public void C(b bVar) {
        g l10 = l();
        if (l10 != null) {
            l10.f1(bVar, -1);
        } else {
            d.c(this.P, bVar, -1);
        }
    }

    public x0 D(g.c cVar) {
        this.W = cVar;
        return this;
    }

    public x0 E(int i10) {
        this.R = i10;
        return this;
    }

    public x0 F(int i10, boolean z10) {
        return G(c.h(this.S, i10, z10));
    }

    public final x0 G(int i10) {
        g[] gVarArr;
        if (this.S != i10) {
            this.S = i10;
            for (g gVar : this.f15520c) {
                if (gVar != null) {
                    gVar.n1(i10);
                }
            }
        }
        return this;
    }

    public x0 H(j jVar) {
        this.V = jVar;
        g[] gVarArr = this.f15520c;
        if (gVarArr[0] != null) {
            gVarArr[0].o1(jVar);
        }
        g[] gVarArr2 = this.f15520c;
        if (gVarArr2[1] != null) {
            gVarArr2[1].o1(jVar);
        }
        return this;
    }

    public x0 a(int i10) {
        return G(i10 | this.S);
    }

    public void b(View view) {
        if (this.U == null) {
            this.U = new gb.g();
        }
        this.U.j(view);
        H(this.U);
    }

    public void c(View view) {
        gb.g gVar = this.U;
        if (gVar != null) {
            gVar.l(view);
        }
    }

    @Override
    public int d(boolean z10) {
        return o.a(this, z10);
    }

    public final void e(Canvas canvas, int i10, int i11) {
        j(canvas, i10, i11, null, 1.0f);
    }

    public final void f(Canvas canvas, int i10, int i11, int i12, int i13) {
        h(canvas, i10, i11, i12, i13, null, 1.0f);
    }

    @Override
    public int g(boolean z10) {
        return o.b(this, z10);
    }

    @Override
    public int getHeight() {
        g l10 = l();
        if (l10 == null) {
            return 0;
        }
        return l10.getHeight();
    }

    @Override
    public int getWidth() {
        g l10 = l();
        if (l10 == null) {
            return 0;
        }
        return l10.getWidth();
    }

    public final void h(Canvas canvas, int i10, int i11, int i12, int i13, k kVar, float f10) {
        i(canvas, i10, i11, i12, i13, kVar, f10, null);
    }

    public final void i(Canvas canvas, int i10, int i11, int i12, int i13, k kVar, float f10, b bVar) {
        g l10 = l();
        if (l10 != null) {
            l10.w(canvas, i10, i11, i12, i13, kVar, f10, bVar);
        }
    }

    public final void j(Canvas canvas, int i10, int i11, k kVar, float f10) {
        g l10 = l();
        if (l10 != null) {
            l10.v(canvas, i10, i10, 0, i11, kVar, f10);
        }
    }

    public g k(int i10) {
        return n(!this.Q ? 1 : 0, i10);
    }

    public g l() {
        g[] gVarArr = this.f15520c;
        boolean z10 = this.Q;
        g gVar = gVarArr[!z10 ? 1 : 0];
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = gVarArr[z10 ? 1 : 0];
        if (gVar2 == null || gVar2.X() != 1 || gVar2.y0()) {
            return null;
        }
        return gVar2;
    }

    public l0[] m() {
        return this.P;
    }

    public final je.g n(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: je.x0.n(int, int):je.g");
    }

    public boolean o() {
        g l10 = l();
        return l10 != null && l10.U();
    }

    public int p() {
        g l10 = l();
        if (l10 == null) {
            return -1;
        }
        return l10.V();
    }

    public int q() {
        g l10 = l();
        if (l10 == null) {
            return 0;
        }
        return l10.W();
    }

    public int r() {
        g l10 = l();
        if (l10 == null) {
            return 0;
        }
        return l10.X();
    }

    public int s() {
        g l10 = l();
        if (l10 == null) {
            return 0;
        }
        return l10.Y();
    }

    public int t(int i10) {
        g l10 = l();
        if (l10 == null) {
            return -1;
        }
        return l10.f0(i10);
    }

    public int u() {
        return this.R;
    }

    public String v() {
        return this.M;
    }

    public k w() {
        return this.O;
    }

    public boolean x(View view, MotionEvent motionEvent) {
        return y(view, motionEvent, null);
    }

    public boolean y(View view, MotionEvent motionEvent, g.c cVar) {
        g l10 = l();
        if (l10 != null) {
            if (cVar == null) {
                cVar = this.W;
            }
            if (l10.V0(view, motionEvent, cVar)) {
                return true;
            }
        }
        return false;
    }

    public x0(String str, w0 w0Var, k kVar, l0[] l0VarArr) {
        this(str, w0Var, kVar);
        this.P = l0VarArr;
    }

    public x0(o6 o6Var, String str, w0 w0Var, k kVar, int i10, hj.q qVar) {
        this(str, w0Var, kVar);
        this.P = g.I0(str, i10, this.P, o6Var, qVar);
    }

    public x0(o6 o6Var, String str, w0 w0Var, k kVar, int i10, hj.q qVar, int i11) {
        this(str, w0Var, kVar);
        this.P = g.I0(str, i10, null, o6Var, qVar);
        this.R = i11;
    }
}
