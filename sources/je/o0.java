package je;

import android.text.style.ClickableSpan;
import android.view.View;
import ce.j0;
import ce.v;
import gd.w;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import jb.c;
import je.g;
import je.t;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.y8;

public class o0 extends l0 {
    public final v4<?> f15434g;
    public final int f15435h;
    public int f15436i;
    public int[] f15437j;
    public int f15438k;
    public String f15439l;
    public boolean f15440m;
    public k f15441n;
    public ClickableSpan f15442o;
    public String f15443p;
    public String f15444q;
    public s0 f15445r;
    public String f15446s;
    public l f15447t;

    public class a extends l {
        public a(k kVar) {
            super(kVar);
        }

        @Override
        public int d(boolean z10) {
            return super.d(true);
        }

        @Override
        public int r0(boolean z10) {
            return super.r0(true);
        }
    }

    public o0(v4<?> v4Var, o6 o6Var, String str, int i10, int i11, int i12, hj.q qVar) {
        super(o6Var, i10, i11, (i12 & 1) != 0 && g.M0(str), qVar);
        this.f15436i = -1;
        this.f15434g = v4Var;
        this.f15435h = i12;
    }

    public static boolean I(String str, View view, int i10) {
        if (i10 != R.id.btn_copyText) {
            return true;
        }
        j0.i(str, R.string.CopiedText);
        return true;
    }

    public boolean J(String str, int[] iArr, v4 v4Var, View view, g gVar, v0 v0Var, g.c cVar, View view2, int i10) {
        if (i10 == R.id.btn_copyLink) {
            j0.i(str, R.string.CopiedLink);
        } else if (i10 == R.id.btn_openLink) {
            z(view, gVar, v0Var, cVar);
        } else if (i10 == R.id.btn_shareLink && iArr[0] == 0) {
            iArr[0] = 1;
            t2.j5(new y8(v4Var.t(), this.f15423a), str);
        }
        return true;
    }

    @Override
    public boolean A(final View view, final g gVar, final v0 v0Var, boolean z10, final g.c cVar) {
        int i10;
        hj.q qVar;
        final v4<?> c10 = c(view);
        if (c10 == null) {
            Log.v("performLongPress ignored, because ancestor not found", new Object[0]);
            return false;
        } else if (!i.i(this.f15446s) || (this.f15438k != 0 && !i.i(this.f15439l) && (!((i10 = this.f15438k) == 4 || i10 == 5) || ((qVar = this.f15424b) != null && !i.i(qVar.f27705e))))) {
            c cVar2 = new c(3);
            u0 u0Var = new u0(3);
            c cVar3 = new c(3);
            cVar2.a(R.id.btn_openLink);
            u0Var.a(R.string.Open);
            int i11 = this.f15438k;
            if (i11 == 1) {
                cVar3.a(R.drawable.baseline_perm_contact_calendar_24);
            } else if (i11 != 3) {
                cVar3.a(R.drawable.baseline_open_in_browser_24);
            } else {
                cVar3.a(R.drawable.baseline_call_24);
            }
            cVar2.a(R.id.btn_copyLink);
            u0Var.a(R.string.Copy);
            cVar3.a(R.drawable.baseline_content_copy_24);
            if (z10) {
                cVar2.a(R.id.btn_shareLink);
                u0Var.a(R.string.Share);
                cVar3.a(R.drawable.baseline_forward_24);
            }
            final String str = !i.i(this.f15446s) ? this.f15446s : this.f15439l;
            final int[] iArr = {0};
            c10.fe(str, cVar2.e(), u0Var.d(), null, cVar3.e(), new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i12) {
                    return g0.b(this, i12);
                }

                @Override
                public final boolean r3(View view2, int i12) {
                    boolean J;
                    J = o0.this.J(str, iArr, c10, view, gVar, v0Var, cVar, view2, i12);
                    return J;
                }
            }, cVar != null ? cVar.O1(view, gVar) : null);
            return true;
        } else if (!t()) {
            return false;
        } else {
            final String substring = gVar.a().substring(i(), e());
            c10.ee(substring, new int[]{R.id.btn_copyText}, new String[]{w.i1(R.string.Copy)}, null, new int[]{R.drawable.baseline_content_copy_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i12) {
                    return g0.b(this, i12);
                }

                @Override
                public final boolean r3(View view2, int i12) {
                    boolean I;
                    I = o0.I(substring, view2, i12);
                    return I;
                }
            });
            return true;
        }
    }

    public o0 K(String str) {
        this.f15443p = str;
        return this;
    }

    public o0 L(String str) {
        this.f15446s = str;
        return this;
    }

    public o0 M(k kVar) {
        this.f15441n = kVar;
        return this;
    }

    public je.o0 N(org.drinkless.td.libcore.telegram.TdApi.RichTextIcon r11) {
        throw new UnsupportedOperationException("Method not decompiled: je.o0.N(org.drinkless.td.libcore.telegram.TdApi$RichTextIcon):je.o0");
    }

    public void O(int i10, int[] iArr, int i11, String str, boolean z10) {
        this.f15436i = i10;
        this.f15437j = iArr;
        this.f15438k = i11;
        this.f15439l = str;
        this.f15440m = z10;
    }

    public o0 P(String str) {
        this.f15444q = str;
        return this;
    }

    @Override
    public boolean a(l0 l0Var, int i10, String str) {
        o0 o0Var = (o0) l0Var;
        if (o0Var.o() == o() && (!o() || (o0Var.f15438k == this.f15438k && o0Var.f15437j == this.f15437j && o0Var.f15436i == this.f15436i && i.c(o0Var.f15439l, this.f15439l)))) {
            if (i10 == 1) {
                return true;
            }
            if (this.f15435h == o0Var.f15435h && this.f15441n == o0Var.f15441n) {
                return true;
            }
        }
        return false;
    }

    @Override
    public float d() {
        if (ib.c.b(this.f15435h, 64) && ib.c.b(this.f15435h, 32)) {
            return 0.0f;
        }
        if (ib.c.b(this.f15435h, 64)) {
            return 0.4f;
        }
        return ib.c.b(this.f15435h, 32) ? -0.4f : 0.0f;
    }

    @Override
    public s0 f() {
        return this.f15445r;
    }

    @Override
    public k g(k kVar) {
        k kVar2 = this.f15441n;
        if (kVar2 == null) {
            if (this.f15438k == 5) {
                kVar2 = t.c.f15480s;
            } else if (ib.c.b(this.f15435h, Log.TAG_YOUTUBE)) {
                kVar2 = t.c.b.f15488o;
            } else {
                kVar2 = ib.c.b(this.f15435h, 8) ? t.c.AbstractC0136c.f15489p : null;
            }
        }
        if (this.f15440m) {
            if ((kVar2 != null ? kVar2 : kVar).d(false) == 0) {
                l lVar = this.f15447t;
                if (lVar == null || lVar.a() != kVar) {
                    this.f15447t = new a(kVar);
                }
                return this.f15447t;
            }
        }
        return kVar2;
    }

    @Override
    public TdApi.TextEntity h() {
        return null;
    }

    @Override
    public int l() {
        return 1;
    }

    @Override
    public boolean m(String str) {
        return !i.i(this.f15443p) && this.f15443p.equals(str);
    }

    @Override
    public boolean n() {
        return ib.c.b(this.f15435h, 1);
    }

    @Override
    public boolean o() {
        return (this.f15435h & Log.TAG_CAMERA) != 0 || t();
    }

    @Override
    public boolean p() {
        return true;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public boolean r() {
        return this.f15445r != null;
    }

    @Override
    public boolean s() {
        return ib.c.b(this.f15435h, 2);
    }

    @Override
    public boolean t() {
        return (this.f15435h & 8) != 0;
    }

    @Override
    public boolean u() {
        return ib.c.b(this.f15435h, 64) || ib.c.b(this.f15435h, 32);
    }

    @Override
    public boolean v() {
        return ib.c.b(this.f15435h, 16);
    }

    @Override
    public boolean w() {
        return ib.c.b(this.f15435h, 4);
    }

    @Override
    public void z(View view, g gVar, v0 v0Var, g.c cVar) {
        v4<?> v4Var;
        int i10 = this.f15438k;
        if (i10 == 0) {
            ClickableSpan clickableSpan = this.f15442o;
            if (clickableSpan != null) {
                clickableSpan.onClick(view);
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                hj.q y10 = y(view, gVar, v0Var);
                if ((cVar == null || !cVar.d5(view, this.f15439l, !i.c(gVar.a(), this.f15439l), y10)) && (v4Var = this.f15434g) != null) {
                    String str = this.f15439l;
                    v4Var.Qc(str, x(y10, cVar, str));
                }
            } else if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 == 5 && cVar != null && cVar.l7(view, this.f15439l, this.f15444q, y(view, gVar, v0Var))) {
                        cVar.R6(view, this.f15439l);
                    }
                } else if (cVar != null) {
                    cVar.R6(view, this.f15439l);
                }
            } else if (cVar == null || !cVar.A(this.f15439l)) {
                v.B(this.f15439l);
            }
        } else if (cVar == null || !cVar.O4(this.f15439l)) {
            v.J(this.f15439l);
        }
    }
}
