package ie;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1410y;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5064d;
import p110hd.C5078d;
import p110hd.C5088i;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import td.C9357x2;

public class C5455v0 {
    public RunnableC5390g f17885a;
    public String f17886b;
    public AbstractC5411l0 f17887c;
    public int f17888d;
    public int f17889e;
    public int f17890f;
    public int f17891g;
    public int f17892h;
    public float f17893i;
    public int f17894j = -1;
    public final int f17895k;
    public final int f17896l;
    public String f17897m;
    public float f17898n;
    public float f17899o;
    public C5088i f17900p;
    public int f17901q;
    public C5427s0 f17902r;

    public C5455v0(RunnableC5390g gVar, String str, int i, int i2, int i3, int i4) {
        this.f17885a = gVar;
        this.f17886b = str;
        this.f17891g = i;
        this.f17892h = i2;
        this.f17895k = i3;
        this.f17896l = i4;
    }

    public static boolean m22710B(char c) {
        return c == ' ';
    }

    public void m22709C(View view, Rect rect) {
        this.f17885a.m22993H0(rect, this, 0);
    }

    public boolean m22711A() {
        if (this.f17887c == null) {
            int i = this.f17892h;
            int i2 = this.f17891g;
            if (i - i2 == C1363c0.m37414s(this.f17886b, i2, i, C5451t0.f17881a)) {
                return true;
            }
        }
        return false;
    }

    public int m22708D(int i, int i2, int i3) {
        int i4;
        int b0 = this.f17885a.m22952b0(this.f17895k, this.f17890f);
        int h0 = this.f17885a.m22936h0();
        int e0 = this.f17885a.m22944e0(this.f17895k, this.f17890f);
        boolean z = false;
        int i5 = b0 == h0 ? 0 : (h0 - b0) + e0;
        if (C4403w.m27984G2()) {
            e0 = i5;
            i5 = e0;
        }
        if ((this.f17888d & 1) != 0) {
            z = true;
        }
        if ((!z && !this.f17885a.m22919n()) || i2 == i) {
            return i + this.f17889e + e0;
        }
        if (!z || (this.f17888d & 4) != 0) {
            i4 = (i2 - this.f17885a.m22941f0(this.f17895k)) + this.f17889e;
        } else {
            i4 = (i2 - this.f17889e) - ((int) this.f17893i);
        }
        int i6 = i4 - i5;
        return this.f17895k + 1 == this.f17885a.m22962X() ? i6 - i3 : i6;
    }

    public C9357x2.C9365h m22707E(View view) {
        return C1379j0.m37307r(view.getContext()).m14584H3().m8984h(view, this.f17885a.m22912p0()).m8948u(new C9357x2.AbstractC9363f() {
            @Override
            public final void mo8098f1(View view2, Rect rect) {
                C5455v0.this.m22709C(view2, rect);
            }
        });
    }

    public void m22706F(C6238b bVar, int i) {
        this.f17902r.m22715e(i + this.f17901q, bVar);
    }

    public void m22705G(boolean z) {
        this.f17888d = C5063c.m24138h(this.f17888d, 8, z);
    }

    public void m22704H(C5088i iVar) {
        this.f17900p = iVar;
    }

    public void m22703I(int i) {
        if (i < this.f17891g) {
            throw new RuntimeException("invalid");
        } else if (this.f17892h != i) {
            this.f17892h = i;
            if (this.f17897m != null) {
                m22695Q(this.f17899o);
            }
        }
    }

    public void m22702J(AbstractC5411l0 l0Var) {
        this.f17887c = l0Var;
    }

    public void m22701K(int i) {
        this.f17894j = i;
    }

    public void m22700L(int i, C5427s0 s0Var) {
        this.f17902r = s0Var;
        this.f17901q = i;
    }

    public void m22699M(String str, int i, int i2) {
        this.f17886b = str;
        this.f17891g = i;
        this.f17892h = i2;
    }

    public void m22698N(boolean z, boolean z2) {
        this.f17888d = C5063c.m24138h(C5063c.m24138h(this.f17888d, 1, z), 4, z2);
    }

    public void m22697O(float f) {
        this.f17893i = f;
    }

    public void m22696P(int i, int i2) {
        this.f17889e = i;
        this.f17890f = i2;
    }

    public void m22695Q(float f) {
        this.f17899o = f;
        TextPaint o0 = this.f17885a.m22915o0(this.f17887c);
        int T1 = (int) C7389v0.m16680T1("…", o0);
        int i = (((int) f) - T1) - this.f17889e;
        String substring = this.f17886b.substring(this.f17891g, this.f17892h);
        this.f17897m = substring;
        String charSequence = TextUtils.ellipsize(substring, o0, i, TextUtils.TruncateAt.END).toString();
        this.f17897m = charSequence;
        this.f17898n = C7389v0.m16680T1(charSequence, o0);
        if (!this.f17897m.endsWith("…")) {
            this.f17897m += "…";
            this.f17898n += T1;
        }
    }

    public boolean m22694R(C5455v0 v0Var) {
        return v0Var != null && v0Var != this && this.f17900p == null && v0Var.f17900p == null && this.f17902r == null && v0Var.f17902r == null && this.f17897m == null && v0Var.f17897m == null && this.f17890f == v0Var.f17890f && this.f17886b == v0Var.f17886b && this.f17892h == v0Var.f17891g && m22670x(v0Var.f17887c);
    }

    public void m22691c(int i, Canvas canvas, int i2, int i3, int i4, int i5, float f, AbstractC5408k kVar, C6238b bVar, int i6) {
        AbstractC6264v vVar;
        int i7 = i5 + this.f17890f;
        int D = m22708D(i2, i3, i4);
        TextPaint k = m22683k(i, f, kVar);
        C5427s0 s0Var = this.f17902r;
        if (s0Var != null) {
            int i8 = i7 + k.baselineShift;
            if (bVar != null) {
                int i9 = i6 + this.f17901q;
                if (s0Var.m22716d()) {
                    vVar = bVar.m20992k(i9);
                    vVar.mo20256K0(D, i8, (int) (D + this.f17893i), this.f17894j + i8);
                    vVar.mo20250U(vVar.mo20252R0() * f);
                } else if (this.f17902r.m22717c()) {
                    vVar = bVar.m20993j(i9);
                    vVar.mo20256K0(D, i8, (int) (D + this.f17893i), this.f17894j + i8);
                    vVar.setAlpha(f);
                } else {
                    vVar = null;
                }
                if (vVar == null || vVar.mo20246c0()) {
                    C6240c l = bVar.m20991l(i9);
                    l.mo20256K0(D, i8, (int) (D + this.f17893i), this.f17894j + i8);
                    l.mo20250U(f);
                    l.draw(canvas);
                    l.mo20253P();
                }
                if (vVar != null) {
                    vVar.draw(canvas);
                    if (this.f17902r.m22716d()) {
                        vVar.mo20253P();
                        return;
                    }
                    return;
                }
                return;
            }
            float f2 = D;
            canvas.drawRect(f2, i8, this.f17893i + f2, i8 + this.f17894j, C1410y.m37039g(C5064d.m24130b((int) (f * 255.0f), 16711680)));
        } else if (this.f17900p != null) {
            Rect Z = C1410y.m37052Z();
            int v = C5078d.m23986z().m23990v();
            int i10 = (i7 - C1357a0.m37541i(1.5f)) + k.baselineShift;
            int i11 = v / 2;
            float f3 = this.f17893i;
            int i12 = v % 2;
            Z.set(D + i11, i10 + i11, ((D + ((int) f3)) - i11) - i12, ((i10 + ((int) f3)) - i11) - i12);
            C5078d.m23986z().m24000l(canvas, this.f17900p, Z, k.getAlpha());
        } else {
            int L = i7 + this.f17885a.m22986L();
            String str = this.f17897m;
            if (str != null) {
                canvas.drawText(str, D, L + k.baselineShift, k);
            } else {
                canvas.drawText(this.f17886b, this.f17891g, this.f17892h, D, L + k.baselineShift, (Paint) k);
            }
        }
    }

    public void m22690d(int i, Canvas canvas, int i2, int i3, int i4, int i5, int i6, float f, AbstractC5408k kVar) {
        int i7 = i6 + this.f17890f;
        int D = m22708D(i3, i4, i5);
        if (this.f17902r != null) {
            throw new IllegalStateException("icon != null");
        } else if (this.f17900p != null) {
            throw new IllegalStateException("emojiInfo != null");
        } else if (this.f17897m == null) {
            TextPaint k = m22683k(i, f, kVar);
            canvas.drawText(this.f17886b, this.f17891g, i2, D, i7 + this.f17885a.m22986L() + k.baselineShift, (Paint) k);
        } else {
            throw new IllegalStateException("trimmedLine != null");
        }
    }

    public AbstractC5411l0 m22689e() {
        if (m22675s()) {
            return this.f17887c;
        }
        return null;
    }

    public int m22688f() {
        return this.f17892h;
    }

    public AbstractC5411l0 m22687g() {
        return this.f17887c;
    }

    public int m22686h() {
        return this.f17894j;
    }

    public String m22685i() {
        return this.f17886b;
    }

    public int m22684j() {
        return this.f17895k;
    }

    public final TextPaint m22683k(int i, float f, AbstractC5408k kVar) {
        TextPaint o0 = this.f17885a.m22915o0(this.f17887c);
        RunnableC5390g gVar = this.f17885a;
        AbstractC5411l0 l0Var = this.f17887c;
        o0.setColor(C5064d.m24131a(f, gVar.m22918n0(kVar, l0Var, gVar.m22896w0(l0Var), this.f17885a.m23007A0(i))));
        return this.f17885a.m22987K0(o0);
    }

    public int m22682l() {
        return this.f17896l;
    }

    public TdApi.TextEntity m22681m() {
        AbstractC5411l0 l0Var = this.f17887c;
        if (l0Var != null) {
            return l0Var.mo22742h();
        }
        return null;
    }

    public AbstractC5411l0 m22680n() {
        if (m22681m() != null) {
            return this.f17887c;
        }
        return null;
    }

    public int m22679o() {
        return this.f17891g;
    }

    public float m22678p() {
        return this.f17897m != null ? this.f17898n : this.f17893i;
    }

    public int m22677q() {
        return this.f17889e;
    }

    public int m22676r() {
        return this.f17890f;
    }

    public boolean m22675s() {
        AbstractC5411l0 l0Var = this.f17887c;
        return l0Var != null && l0Var.mo22738o();
    }

    public boolean m22674t() {
        return this.f17900p != null;
    }

    public boolean m22673u() {
        AbstractC5411l0 l0Var;
        return this.f17900p == null && ((l0Var = this.f17887c) == null || l0Var.mo22737p());
    }

    public boolean m22672v() {
        return this.f17902r != null;
    }

    public boolean m22671w() {
        int i = this.f17888d;
        return ((i & 1) == 0 && (i & 4) == 0) ? false : true;
    }

    public boolean m22670x(AbstractC5411l0 l0Var) {
        return AbstractC5411l0.m22788b(this.f17887c, l0Var, 0, null);
    }

    public boolean m22669y(AbstractC5411l0 l0Var) {
        return AbstractC5411l0.m22788b(this.f17887c, l0Var, 1, null);
    }

    public boolean m22668z(AbstractC5411l0 l0Var) {
        return AbstractC5411l0.m22788b(this.f17887c, l0Var, 2, this.f17885a.mo22956a());
    }
}
