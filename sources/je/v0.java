package je;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.y;
import gd.w;
import ib.c;
import ib.d;
import id.i;
import ld.b;
import ld.v;
import org.drinkless.td.libcore.telegram.TdApi;
import ud.x2;

public class v0 {
    public g f15494a;
    public String f15495b;
    public l0 f15496c;
    public int f15497d;
    public int f15498e;
    public int f15499f;
    public int f15500g;
    public int f15501h;
    public float f15502i;
    public int f15503j = -1;
    public final int f15504k;
    public final int f15505l;
    public String f15506m;
    public float f15507n;
    public float f15508o;
    public i f15509p;
    public int f15510q;
    public s0 f15511r;

    public v0(g gVar, String str, int i10, int i11, int i12, int i13) {
        this.f15494a = gVar;
        this.f15495b = str;
        this.f15500g = i10;
        this.f15501h = i11;
        this.f15504k = i12;
        this.f15505l = i13;
    }

    public static boolean B(char c10) {
        return c10 == ' ';
    }

    public void C(View view, Rect rect) {
        this.f15494a.H0(rect, this, 0);
    }

    public boolean A() {
        if (this.f15496c == null) {
            int i10 = this.f15501h;
            int i11 = this.f15500g;
            if (i10 - i11 == c0.s(this.f15495b, i11, i10, t0.f15490a)) {
                return true;
            }
        }
        return false;
    }

    public int D(int i10, int i11, int i12) {
        int i13;
        int b02 = this.f15494a.b0(this.f15504k, this.f15499f);
        int h02 = this.f15494a.h0();
        int e02 = this.f15494a.e0(this.f15504k, this.f15499f);
        boolean z10 = false;
        int i14 = b02 == h02 ? 0 : (h02 - b02) + e02;
        if (w.G2()) {
            e02 = i14;
            i14 = e02;
        }
        if ((this.f15497d & 1) != 0) {
            z10 = true;
        }
        if ((!z10 && !this.f15494a.n()) || i11 == i10) {
            return i10 + this.f15498e + e02;
        }
        if (!z10 || (this.f15497d & 4) != 0) {
            i13 = (i11 - this.f15494a.f0(this.f15504k)) + this.f15498e;
        } else {
            i13 = (i11 - this.f15498e) - ((int) this.f15502i);
        }
        int i15 = i13 - i14;
        return this.f15504k + 1 == this.f15494a.X() ? i15 - i12 : i15;
    }

    public x2.h E(View view) {
        return j0.r(view.getContext()).I3().h(view, this.f15494a.p0()).u(new x2.f() {
            @Override
            public final void d1(View view2, Rect rect) {
                v0.this.C(view2, rect);
            }
        });
    }

    public void F(b bVar, int i10) {
        this.f15511r.e(i10 + this.f15510q, bVar);
    }

    public void G(boolean z10) {
        this.f15497d = c.h(this.f15497d, 8, z10);
    }

    public void H(i iVar) {
        this.f15509p = iVar;
    }

    public void I(int i10) {
        if (i10 < this.f15500g) {
            throw new RuntimeException("invalid");
        } else if (this.f15501h != i10) {
            this.f15501h = i10;
            if (this.f15506m != null) {
                Q(this.f15508o);
            }
        }
    }

    public void J(l0 l0Var) {
        this.f15496c = l0Var;
    }

    public void K(int i10) {
        this.f15503j = i10;
    }

    public void L(int i10, s0 s0Var) {
        this.f15511r = s0Var;
        this.f15510q = i10;
    }

    public void M(String str, int i10, int i11) {
        this.f15495b = str;
        this.f15500g = i10;
        this.f15501h = i11;
    }

    public void N(boolean z10, boolean z11) {
        this.f15497d = c.h(c.h(this.f15497d, 1, z10), 4, z11);
    }

    public void O(float f10) {
        this.f15502i = f10;
    }

    public void P(int i10, int i11) {
        this.f15498e = i10;
        this.f15499f = i11;
    }

    public void Q(float f10) {
        this.f15508o = f10;
        TextPaint o02 = this.f15494a.o0(this.f15496c);
        int T1 = (int) oc.v0.T1("…", o02);
        int i10 = (((int) f10) - T1) - this.f15498e;
        String substring = this.f15495b.substring(this.f15500g, this.f15501h);
        this.f15506m = substring;
        String charSequence = TextUtils.ellipsize(substring, o02, i10, TextUtils.TruncateAt.END).toString();
        this.f15506m = charSequence;
        this.f15507n = oc.v0.T1(charSequence, o02);
        if (!this.f15506m.endsWith("…")) {
            this.f15506m += "…";
            this.f15507n += T1;
        }
    }

    public boolean R(v0 v0Var) {
        return v0Var != null && v0Var != this && this.f15509p == null && v0Var.f15509p == null && this.f15511r == null && v0Var.f15511r == null && this.f15506m == null && v0Var.f15506m == null && this.f15499f == v0Var.f15499f && this.f15495b == v0Var.f15495b && this.f15501h == v0Var.f15500g && x(v0Var.f15496c);
    }

    public void c(int i10, Canvas canvas, int i11, int i12, int i13, int i14, float f10, k kVar, b bVar, int i15) {
        v vVar;
        int i16 = i14 + this.f15499f;
        int D = D(i11, i12, i13);
        TextPaint k10 = k(i10, f10, kVar);
        s0 s0Var = this.f15511r;
        if (s0Var != null) {
            int i17 = i16 + k10.baselineShift;
            if (bVar != null) {
                int i18 = i15 + this.f15510q;
                if (s0Var.d()) {
                    vVar = bVar.k(i18);
                    vVar.K0(D, i17, (int) (D + this.f15502i), this.f15503j + i17);
                    vVar.V(vVar.R0() * f10);
                } else if (this.f15511r.c()) {
                    vVar = bVar.j(i18);
                    vVar.K0(D, i17, (int) (D + this.f15502i), this.f15503j + i17);
                    vVar.setAlpha(f10);
                } else {
                    vVar = null;
                }
                if (vVar == null || vVar.e0()) {
                    ld.c l10 = bVar.l(i18);
                    l10.K0(D, i17, (int) (D + this.f15502i), this.f15503j + i17);
                    l10.V(f10);
                    l10.draw(canvas);
                    l10.Q();
                }
                if (vVar != null) {
                    vVar.draw(canvas);
                    if (this.f15511r.d()) {
                        vVar.Q();
                        return;
                    }
                    return;
                }
                return;
            }
            float f11 = D;
            canvas.drawRect(f11, i17, this.f15502i + f11, i17 + this.f15503j, y.g(d.b((int) (f10 * 255.0f), 16711680)));
        } else if (this.f15509p != null) {
            Rect Z = y.Z();
            int v10 = id.d.z().v();
            int i19 = (i16 - a0.i(1.5f)) + k10.baselineShift;
            int i20 = v10 / 2;
            float f12 = this.f15502i;
            int i21 = v10 % 2;
            Z.set(D + i20, i19 + i20, ((D + ((int) f12)) - i20) - i21, ((i19 + ((int) f12)) - i20) - i21);
            id.d.z().l(canvas, this.f15509p, Z, k10.getAlpha());
        } else {
            int L = i16 + this.f15494a.L();
            String str = this.f15506m;
            if (str != null) {
                canvas.drawText(str, D, L + k10.baselineShift, k10);
            } else {
                canvas.drawText(this.f15495b, this.f15500g, this.f15501h, D, L + k10.baselineShift, (Paint) k10);
            }
        }
    }

    public void d(int i10, Canvas canvas, int i11, int i12, int i13, int i14, int i15, float f10, k kVar) {
        int i16 = i15 + this.f15499f;
        int D = D(i12, i13, i14);
        if (this.f15511r != null) {
            throw new IllegalStateException("icon != null");
        } else if (this.f15509p != null) {
            throw new IllegalStateException("emojiInfo != null");
        } else if (this.f15506m == null) {
            TextPaint k10 = k(i10, f10, kVar);
            canvas.drawText(this.f15495b, this.f15500g, i11, D, i16 + this.f15494a.L() + k10.baselineShift, (Paint) k10);
        } else {
            throw new IllegalStateException("trimmedLine != null");
        }
    }

    public l0 e() {
        if (s()) {
            return this.f15496c;
        }
        return null;
    }

    public int f() {
        return this.f15501h;
    }

    public l0 g() {
        return this.f15496c;
    }

    public int h() {
        return this.f15503j;
    }

    public String i() {
        return this.f15495b;
    }

    public int j() {
        return this.f15504k;
    }

    public final TextPaint k(int i10, float f10, k kVar) {
        TextPaint o02 = this.f15494a.o0(this.f15496c);
        g gVar = this.f15494a;
        l0 l0Var = this.f15496c;
        o02.setColor(d.a(f10, gVar.n0(kVar, l0Var, gVar.w0(l0Var), this.f15494a.A0(i10))));
        return this.f15494a.K0(o02);
    }

    public int l() {
        return this.f15505l;
    }

    public TdApi.TextEntity m() {
        l0 l0Var = this.f15496c;
        if (l0Var != null) {
            return l0Var.h();
        }
        return null;
    }

    public l0 n() {
        if (m() != null) {
            return this.f15496c;
        }
        return null;
    }

    public int o() {
        return this.f15500g;
    }

    public float p() {
        return this.f15506m != null ? this.f15507n : this.f15502i;
    }

    public int q() {
        return this.f15498e;
    }

    public int r() {
        return this.f15499f;
    }

    public boolean s() {
        l0 l0Var = this.f15496c;
        return l0Var != null && l0Var.o();
    }

    public boolean t() {
        return this.f15509p != null;
    }

    public boolean u() {
        l0 l0Var;
        return this.f15509p == null && ((l0Var = this.f15496c) == null || l0Var.p());
    }

    public boolean v() {
        return this.f15511r != null;
    }

    public boolean w() {
        int i10 = this.f15497d;
        return ((i10 & 1) == 0 && (i10 & 4) == 0) ? false : true;
    }

    public boolean x(l0 l0Var) {
        return l0.b(this.f15496c, l0Var, 0, null);
    }

    public boolean y(l0 l0Var) {
        return l0.b(this.f15496c, l0Var, 1, null);
    }

    public boolean z(l0 l0Var) {
        return l0.b(this.f15496c, l0Var, 2, this.f15494a.a());
    }
}
