package ie;

import android.text.style.ClickableSpan;
import android.view.View;
import be.C1379j0;
import be.C1405v;
import gd.C4779t2;
import ie.C5428t;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public class C5417o0 extends AbstractC5411l0 {
    public final AbstractC9323v4<?> f17809g;
    public final int f17810h;
    public int f17811i;
    public int[] f17812j;
    public int f17813k;
    public String f17814l;
    public boolean f17815m;
    public AbstractC5408k f17816n;
    public ClickableSpan f17817o;
    public String f17818p;
    public String f17819q;
    public C5427s0 f17820r;
    public String f17821s;
    public C5410l f17822t;

    public class C5418a extends C5410l {
        public C5418a(AbstractC5408k kVar) {
            super(kVar);
        }

        @Override
        public int mo7854e(boolean z) {
            return super.mo7854e(true);
        }

        @Override
        public int mo7851p0(boolean z) {
            return super.mo7851p0(true);
        }
    }

    public C5417o0(AbstractC9323v4<?> v4Var, C10930q6 q6Var, String str, int i, int i2, int i3, HandlerC10770jj.C10788q qVar) {
        super(q6Var, i, i2, (i3 & 1) != 0 && RunnableC5390g.m22983M0(str), qVar);
        this.f17811i = -1;
        this.f17809g = v4Var;
        this.f17810h = i3;
    }

    public static boolean m22765I(String str, View view, int i) {
        if (i != R.id.btn_copyText) {
            return true;
        }
        C1379j0.m37325i(str, R.string.CopiedText);
        return true;
    }

    public boolean m22764J(String str, int[] iArr, AbstractC9323v4 v4Var, View view, RunnableC5390g gVar, C5455v0 v0Var, RunnableC5390g.AbstractC5393c cVar, View view2, int i) {
        if (i == R.id.btn_copyLink) {
            C1379j0.m37325i(str, R.string.CopiedLink);
        } else if (i == R.id.btn_openLink) {
            mo22729z(view, gVar, v0Var, cVar);
        } else if (i == R.id.btn_shareLink && iArr[0] == 0) {
            iArr[0] = 1;
            C4779t2.m25490j5(new C10534a9(v4Var.mo4347s(), this.f17793a), str);
        }
        return true;
    }

    @Override
    public boolean mo22755A(final View view, final RunnableC5390g gVar, final C5455v0 v0Var, boolean z, final RunnableC5390g.AbstractC5393c cVar) {
        int i;
        HandlerC10770jj.C10788q qVar;
        final AbstractC9323v4<?> c = m22787c(view);
        if (c == null) {
            Log.m14714v("performLongPress ignored, because ancestor not found", new Object[0]);
            return false;
        } else if (!C5070i.m24061i(this.f17821s) || (this.f17813k != 0 && !C5070i.m24061i(this.f17814l) && (!((i = this.f17813k) == 4 || i == 5) || ((qVar = this.f17794b) != null && !C5070i.m24061i(qVar.f34539e))))) {
            C5320c cVar2 = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            C5320c cVar3 = new C5320c(3);
            cVar2.m23284a(R.id.btn_openLink);
            u0Var.m23816a(R.string.Open);
            int i2 = this.f17813k;
            if (i2 == 1) {
                cVar3.m23284a(R.drawable.baseline_perm_contact_calendar_24);
            } else if (i2 != 3) {
                cVar3.m23284a(R.drawable.baseline_open_in_browser_24);
            } else {
                cVar3.m23284a(R.drawable.baseline_call_24);
            }
            cVar2.m23284a(R.id.btn_copyLink);
            u0Var.m23816a(R.string.Copy);
            cVar3.m23284a(R.drawable.baseline_content_copy_24);
            if (z) {
                cVar2.m23284a(R.id.btn_shareLink);
                u0Var.m23816a(R.string.Share);
                cVar3.m23284a(R.drawable.baseline_forward_24);
            }
            final String str = !C5070i.m24061i(this.f17821s) ? this.f17821s : this.f17814l;
            final int[] iArr = {0};
            c.m9254fe(str, cVar2.m23280e(), u0Var.m23813d(), null, cVar3.m23280e(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i3) {
                    boolean J;
                    J = C5417o0.this.m22764J(str, iArr, c, view, gVar, v0Var, cVar, view2, i3);
                    return J;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i3) {
                    return C5115g0.m23934b(this, i3);
                }
            }, cVar != null ? cVar.mo18237W4(view, gVar) : null);
            return true;
        } else if (!mo22733t()) {
            return false;
        } else {
            final String substring = gVar.mo22956a().substring(m22785i(), m22786e());
            c.m9261ee(substring, new int[]{R.id.btn_copyText}, new String[]{C4403w.m27869i1(R.string.Copy)}, null, new int[]{R.drawable.baseline_content_copy_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i3) {
                    boolean I;
                    I = C5417o0.m22765I(substring, view2, i3);
                    return I;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i3) {
                    return C5115g0.m23934b(this, i3);
                }
            });
            return true;
        }
    }

    public C5417o0 m22763K(String str) {
        this.f17818p = str;
        return this;
    }

    public C5417o0 m22762L(String str) {
        this.f17821s = str;
        return this;
    }

    public C5417o0 m22761M(AbstractC5408k kVar) {
        this.f17816n = kVar;
        return this;
    }

    public ie.C5417o0 m22760N(org.drinkless.p210td.libcore.telegram.TdApi.RichTextIcon r11) {
        throw new UnsupportedOperationException("Method not decompiled: ie.C5417o0.m22760N(org.drinkless.td.libcore.telegram.TdApi$RichTextIcon):ie.o0");
    }

    public void m22759O(int i, int[] iArr, int i2, String str, boolean z) {
        this.f17811i = i;
        this.f17812j = iArr;
        this.f17813k = i2;
        this.f17814l = str;
        this.f17815m = z;
    }

    public C5417o0 m22758P(String str) {
        this.f17819q = str;
        return this;
    }

    @Override
    public boolean mo22744a(AbstractC5411l0 l0Var, int i, String str) {
        C5417o0 o0Var = (C5417o0) l0Var;
        if (o0Var.mo22738o() == mo22738o() && (!mo22738o() || (o0Var.f17813k == this.f17813k && o0Var.f17812j == this.f17812j && o0Var.f17811i == this.f17811i && C5070i.m24067c(o0Var.f17814l, this.f17814l)))) {
            if (i == 1) {
                return true;
            }
            if (this.f17810h == o0Var.f17810h && this.f17816n == o0Var.f17816n) {
                return true;
            }
        }
        return false;
    }

    @Override
    public float mo22757d() {
        if (C5063c.m24144b(this.f17810h, 64) && C5063c.m24144b(this.f17810h, 32)) {
            return 0.0f;
        }
        if (C5063c.m24144b(this.f17810h, 64)) {
            return 0.4f;
        }
        return C5063c.m24144b(this.f17810h, 32) ? -0.4f : 0.0f;
    }

    @Override
    public C5427s0 mo22756f() {
        return this.f17820r;
    }

    @Override
    public AbstractC5408k mo22743g(AbstractC5408k kVar) {
        AbstractC5408k kVar2 = this.f17816n;
        if (kVar2 == null) {
            if (this.f17813k == 5) {
                kVar2 = C5428t.AbstractC5435c.f17862s;
            } else if (C5063c.m24144b(this.f17810h, Log.TAG_YOUTUBE)) {
                kVar2 = C5428t.AbstractC5435c.AbstractC5437b.f17870o;
            } else {
                kVar2 = C5063c.m24144b(this.f17810h, 8) ? C5428t.AbstractC5435c.AbstractC5439c.f17871p : null;
            }
        }
        if (this.f17815m) {
            if ((kVar2 != null ? kVar2 : kVar).mo7854e(false) == 0) {
                C5410l lVar = this.f17822t;
                if (lVar == null || lVar.m22794a() != kVar) {
                    this.f17822t = new C5418a(kVar);
                }
                return this.f17822t;
            }
        }
        return kVar2;
    }

    @Override
    public TdApi.TextEntity mo22742h() {
        return null;
    }

    @Override
    public int mo22741l() {
        return 1;
    }

    @Override
    public boolean mo22740m(String str) {
        return !C5070i.m24061i(this.f17818p) && this.f17818p.equals(str);
    }

    @Override
    public boolean mo22739n() {
        return C5063c.m24144b(this.f17810h, 1);
    }

    @Override
    public boolean mo22738o() {
        return (this.f17810h & Log.TAG_CAMERA) != 0 || mo22733t();
    }

    @Override
    public boolean mo22737p() {
        return true;
    }

    @Override
    public boolean mo22736q() {
        return false;
    }

    @Override
    public boolean mo22735r() {
        return this.f17820r != null;
    }

    @Override
    public boolean mo22734s() {
        return C5063c.m24144b(this.f17810h, 2);
    }

    @Override
    public boolean mo22733t() {
        return (this.f17810h & 8) != 0;
    }

    @Override
    public boolean mo22732u() {
        return C5063c.m24144b(this.f17810h, 64) || C5063c.m24144b(this.f17810h, 32);
    }

    @Override
    public boolean mo22731v() {
        return C5063c.m24144b(this.f17810h, 16);
    }

    @Override
    public boolean mo22730w() {
        return C5063c.m24144b(this.f17810h, 4);
    }

    @Override
    public void mo22729z(View view, RunnableC5390g gVar, C5455v0 v0Var, RunnableC5390g.AbstractC5393c cVar) {
        AbstractC9323v4<?> v4Var;
        int i = this.f17813k;
        if (i == 0) {
            ClickableSpan clickableSpan = this.f17817o;
            if (clickableSpan != null) {
                clickableSpan.onClick(view);
            }
        } else if (i != 1) {
            if (i == 2) {
                HandlerC10770jj.C10788q y = m22781y(view, gVar, v0Var);
                if ((cVar == null || !cVar.mo18235g0(view, this.f17814l, !C5070i.m24067c(gVar.mo22956a(), this.f17814l), y)) && (v4Var = this.f17809g) != null) {
                    String str = this.f17814l;
                    v4Var.m9357Qc(str, m22782x(y, cVar, str));
                }
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 5 && cVar != null && cVar.mo18234i0(view, this.f17814l, this.f17819q, m22781y(view, gVar, v0Var))) {
                        cVar.mo18240S6(view, this.f17814l);
                    }
                } else if (cVar != null) {
                    cVar.mo18240S6(view, this.f17814l);
                }
            } else if (cVar == null || !cVar.mo18245A(this.f17814l)) {
                C1405v.m37141B(this.f17814l);
            }
        } else if (cVar == null || !cVar.mo18238V4(this.f17814l)) {
            C1405v.m37132K(this.f17814l);
        }
    }
}
