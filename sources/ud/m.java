package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.p;
import ce.y;
import db.e;
import de.f20;
import eb.f;
import eb.k;
import eb.l;
import gd.w;
import hd.t2;
import he.n;
import ib.d;
import je.g;
import je.l0;
import ld.h;
import ld.v;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.i;
import oc.v0;
import od.j1;
import od.k1;
import od.l1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.d1;
import zd.ic;
import zd.o6;
import zd.s1;
import zd.t1;

public class m extends i implements c2, i2, v2, kb.c, d, sc.a, i.d, ic.e, t1.a, d1.c {
    public float A0;
    public float B0;
    public f C0;
    public int D0;
    public Drawable E0;
    public Drawable F0;
    public Drawable G0;
    public int H0;
    public b I0;
    public int J0;
    public int K0;
    public int L0 = -1;
    public float M0 = 1.3f;
    public int N0 = -1;
    public int O0 = d.a(j.f0(), -1);
    public float P0;
    public c Q0;
    public final ic.d R0;
    public float f24278k0;
    public hd.b f24279l0;
    public Drawable f24280m0;
    public h f24281n0;
    public h f24282o0;
    public final ld.c f24283p0;
    public TdApi.ProfilePhoto f24284q0;
    public TdApi.ChatPhotoInfo f24285r0;
    public String f24286s0;
    public String f24287t0;
    public String f24288u0;
    public l0[] f24289v0;
    public g f24290w0;
    public g f24291x0;
    public g f24292y0;
    public g f24293z0;

    public class a implements k1 {
        public a() {
        }

        @Override
        public void Z1(int i10, qd.b bVar, boolean z10) {
        }

        @Override
        public l1 s1(int i10, qd.b bVar) {
            if (i10 == 0) {
                return m.this.getThumbLocation();
            }
            return null;
        }
    }

    public interface b {
        void a(m mVar, float f10, boolean z10, float f11, float f12);
    }

    public interface c {
        void L5();
    }

    public m(Context context, o6 o6Var, v4<?> v4Var) {
        super(context, o6Var);
        setLayoutParams(FrameLayoutFix.q1(-1, -2));
        this.R0 = new ic.d(j0.r(context), o6Var, this, v4Var);
        setUseDefaultClickListener(false);
        ld.c cVar = new ld.c(this, 1);
        this.f24283p0 = cVar;
        cVar.E0(0);
        setCustomControllerProvider(this);
        t1.b().a(this);
    }

    public int A1(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return getTextOffsetLeft();
        }
        return 0;
    }

    public void B1(int i10, float f10, float f11, k kVar) {
        if (this.B0 != f10) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.B0 = f10;
            b bVar = this.I0;
            if (bVar != null) {
                bVar.a(this, getAvatarExpandFactor(), true, this.A0, this.B0);
            }
            F1(checkTextMaxWidth);
            invalidate();
        }
    }

    public static int V1(int i10) {
        return d.a(j.f0(), i10);
    }

    public static float getBaseAvatarRadiusDp() {
        return 20.5f;
    }

    private int getBaseTextMaxWidth() {
        return Math.max(0, (((getMeasuredWidth() - (this.J0 + getInnerRightMargin())) - a0.i(4.0f)) - (a0.i(getBaseAvatarRadiusDp()) * 2)) - a0.i(9.0f));
    }

    private Drawable getBottomShadow() {
        if (this.G0 == null) {
            this.G0 = e.a(1711276032, 2, 80, false);
            Y1();
        }
        return this.G0;
    }

    private int getBottomShadowSize() {
        return (int) ((a0.i(28.0f) + a0.i(5.0f) + getTitleHeight() + a0.i(8.0f) + a0.i(14.0f)) * 1.1111112f);
    }

    private int getCheckTextMaxWidth() {
        return getCurrentScaledTextMaxWidth();
    }

    private int getCurrentScaledTextMaxWidth() {
        return Math.min(getBaseTextMaxWidth(), getScaledTextMaxWidth());
    }

    private int getExpandedMaxTextWidth() {
        return ((int) ((getMeasuredWidth() - (a0.i(11.0f) * 2)) / this.M0)) - (ib.c.b(this.D0, 4) ? a0.i(20.0f) : 0);
    }

    private int getInnerRightMargin() {
        int i10;
        return (ib.c.b(this.D0, Log.TAG_YOUTUBE) || (i10 = this.L0) == -1) ? this.K0 : i10;
    }

    private float getMultiLineAddition() {
        g gVar = this.f24291x0;
        if (gVar == null || this.f24290w0 == null) {
            return 0.0f;
        }
        return (gVar.getHeight() - this.f24290w0.getHeight()) * this.M0;
    }

    private static int getMutePadding() {
        return a0.i(1.0f);
    }

    private int getScaledTextMaxWidth() {
        return (int) (((getBaseTextMaxWidth() + a0.i(11.0f)) + getInnerRightMargin()) / 1.1f);
    }

    public int getSubtitleColor() {
        return d.d(this.O0, d.a(j.f0(), -1), getAvatarExpandFactor());
    }

    private int getTextOffsetLeft() {
        if ((this.D0 & 1) != 0) {
            return a0.i(16.0f);
        }
        return 0;
    }

    private int getTextOffsetRight() {
        int i10 = 0;
        if ((this.D0 & 4) != 0) {
            i10 = 0 + a0.i(20.0f);
        }
        int i11 = this.D0;
        return ((i11 & 2) == 0 || (i11 & Log.TAG_COMPRESS) != 0) ? i10 : i10 + getMutePadding() + p.b();
    }

    public int getTitleColor() {
        return d.d(this.N0, -1, getAvatarExpandFactor());
    }

    private je.k getTitleColorSet() {
        return new je.k() {
            @Override
            public int R() {
                return je.j.d(this);
            }

            @Override
            public long W0(boolean z10) {
                return je.j.c(this, z10);
            }

            @Override
            public int a1() {
                return je.j.f(this);
            }

            @Override
            public final int c() {
                int titleColor;
                titleColor = m.this.getTitleColor();
                return titleColor;
            }

            @Override
            public int d(boolean z10) {
                return je.j.b(this, z10);
            }

            @Override
            public int g(boolean z10) {
                return je.j.h(this, z10);
            }

            @Override
            public int o0(boolean z10) {
                return je.j.e(this, z10);
            }

            @Override
            public int r0(boolean z10) {
                return je.j.a(this, z10);
            }

            @Override
            public int t0(boolean z10) {
                return je.j.g(this, z10);
            }
        };
    }

    private int getTitleHeight() {
        g gVar = this.f24291x0;
        return (int) (((gVar == null && (gVar = this.f24290w0) == null) ? 0 : gVar.getHeight()) * this.M0);
    }

    private Drawable getTopShadow() {
        if (this.F0 == null) {
            this.F0 = e.a(1996488704, 2, 48, false);
            Z1();
        }
        return this.F0;
    }

    public int getTypingColor() {
        float Q = j.Q();
        if (Q == 0.0f) {
            if (this instanceof vc.f) {
                return j.n0();
            }
            return d.b(255, this.O0 & 16777215);
        } else if (Q == 1.0f) {
            return j.f();
        } else {
            return d.d(this instanceof vc.f ? j.n0() : d.b(255, 16777215 & this.O0), j.f(), Q);
        }
    }

    private void setAvatarAllowanceFactor(float f10) {
        if (this.A0 != f10) {
            this.A0 = f10;
            b bVar = this.I0;
            if (bVar != null) {
                bVar.a(this, getAvatarExpandFactor(), false, this.A0, this.B0);
            }
            invalidate();
        }
    }

    public static int u1(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 0) {
            return i10;
        }
        return 0;
    }

    public int v1(int i10, int i11, int i12, int i13) {
        return (i12 - getTextOffsetLeft()) - getTextOffsetRight();
    }

    public int z1(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return getTextOffsetLeft();
        }
        return 0;
    }

    @Override
    public void C(View view, float f10, float f11) {
        if ((this.D0 & 16) == 0) {
            n1(f10, f11, true);
            if ((this.D0 & Log.TAG_EMOJI) != 0) {
                H1();
                this.D0 &= -4097;
                return;
            }
        }
        super.C(view, f10, f11);
    }

    public final void C1() {
        float i10 = a0.i(getBaseAvatarRadiusDp());
        float i11 = this.J0 + a0.i(4.0f) + i10;
        float a32 = this.H0 + (d1.a3(false) / 2);
        float m12 = m1();
        if (m12 != 0.0f) {
            i11 += (-a0.i(33.0f)) * m12;
            a32 += a0.i(64.0f) * m12;
            i10 += a0.i(10.0f) * m12;
        }
        float avatarExpandFactor = getAvatarExpandFactor();
        int f12 = this.H0 + ((f1() - this.H0) / 2);
        this.f24283p0.E0(Math.round((1.0f - avatarExpandFactor) * i10));
        float measuredWidth = getMeasuredWidth() / 2;
        float f10 = i10 + ((measuredWidth - i10) * avatarExpandFactor);
        float f11 = i11 + ((measuredWidth - i11) * avatarExpandFactor);
        float f13 = a32 + ((f12 - a32) * avatarExpandFactor);
        this.f24283p0.K0(Math.round(f11 - f10), Math.round(f13 - f10), Math.round(f11 + f10), Math.round(f13 + f10));
    }

    public final void D1() {
        String str;
        l0[] l0VarArr = null;
        if (ib.i.i(this.f24287t0)) {
            this.f24293z0 = null;
            this.f24292y0 = null;
            return;
        }
        je.k lVar = new je.k() {
            @Override
            public int R() {
                return je.j.d(this);
            }

            @Override
            public long W0(boolean z10) {
                return je.j.c(this, z10);
            }

            @Override
            public int a1() {
                return je.j.f(this);
            }

            @Override
            public final int c() {
                int subtitleColor;
                subtitleColor = m.this.getSubtitleColor();
                return subtitleColor;
            }

            @Override
            public int d(boolean z10) {
                return je.j.b(this, z10);
            }

            @Override
            public int g(boolean z10) {
                return je.j.h(this, z10);
            }

            @Override
            public int o0(boolean z10) {
                return je.j.e(this, z10);
            }

            @Override
            public int r0(boolean z10) {
                return je.j.a(this, z10);
            }

            @Override
            public int t0(boolean z10) {
                return je.j.g(this, z10);
            }
        };
        g f10 = new g.b(this.f24287t0, getCurrentScaledTextMaxWidth(), y.A0(14.0f), lVar).v().i(this.f24289v0).f();
        this.f24292y0 = f10;
        if (f10.x0() || ((str = this.f24288u0) != null && !str.equals(this.f24287t0))) {
            String str2 = this.f24288u0;
            if (str2 == null) {
                str2 = this.f24287t0;
            }
            g.b v10 = new g.b(str2, getExpandedMaxTextWidth(), y.A0(14.0f), lVar).v();
            if (this.f24288u0 == null) {
                l0VarArr = this.f24289v0;
            }
            this.f24293z0 = v10.i(l0VarArr).f();
            return;
        }
        this.f24293z0 = null;
    }

    public final void E1() {
        G1();
        D1();
        q();
    }

    public final boolean F1(int i10) {
        int checkTextMaxWidth = getCheckTextMaxWidth();
        if (checkTextMaxWidth >= i10 && (checkTextMaxWidth <= i10 || !r1())) {
            return false;
        }
        E1();
        return true;
    }

    public final void G1() {
        if (ib.i.i(this.f24286s0)) {
            this.f24291x0 = null;
            this.f24290w0 = null;
            return;
        }
        int i10 = this.D0;
        boolean z10 = true;
        int i11 = 0;
        boolean z11 = (524288 & i10) != 0;
        if ((i10 & Log.TAG_NDK) == 0) {
            z10 = false;
        }
        if (z10 || z11) {
            i11 = p1(w.i1(z10 ? R.string.FakeMark : R.string.ScamMark));
        }
        this.M0 = 1.3f;
        g f10 = new g.b(this.f24286s0, getCurrentScaledTextMaxWidth() - i11, y.A0(18.0f), getTitleColorSet()).o(new g.AbstractC0133g() {
            @Override
            public final int a(int i12, int i13, int i14, int i15) {
                int v12;
                v12 = m.this.v1(i12, i13, i14, i15);
                return v12;
            }
        }).n(new g.f() {
            @Override
            public final int a(int i12, int i13, int i14, int i15) {
                int z12;
                z12 = m.this.z1(i12, i13, i14, i15);
                return z12;
            }
        }).v().g().b().f();
        this.f24290w0 = f10;
        this.f24291x0 = null;
        if (f10.x0()) {
            int i12 = 2;
            while (true) {
                g f11 = new g.b(this.f24286s0, getExpandedMaxTextWidth() - i11, y.A0(18.0f), getTitleColorSet()).n(new g.f() {
                    @Override
                    public final int a(int i13, int i14, int i15, int i16) {
                        int A1;
                        A1 = m.this.A1(i13, i14, i15, i16);
                        return A1;
                    }
                }).p(i12).g().b().f();
                this.f24291x0 = f11;
                if (!f11.x0()) {
                    break;
                }
                if (i12 == 2) {
                    i12++;
                }
                this.M0 -= 0.05f;
            }
        }
        Y1();
    }

    public final void H1() {
        if (!B0()) {
            db.g.c(this);
        }
        c cVar = this.Q0;
        if (cVar != null) {
            cVar.L5();
        }
    }

    @Override
    public final void I0(int i10, int i11) {
    }

    public void I1() {
        ic.d dVar = this.R0;
        if (dVar != null) {
            dVar.g();
        }
        ld.c cVar = this.f24283p0;
        if (cVar != null) {
            cVar.clear();
        }
    }

    public void J1() {
        this.R0.g();
    }

    @Override
    public qd.c J4(long j10, TdApi.SearchMessagesFilter searchMessagesFilter) {
        return null;
    }

    public void K1() {
        this.D0 |= Log.TAG_VOICE;
    }

    public final void L1(boolean z10, boolean z11) {
        f fVar = this.C0;
        boolean z12 = true;
        if ((fVar != null && fVar.h()) != z10) {
            if (this.C0 == null) {
                this.C0 = new f(0, new k.b() {
                    @Override
                    public final void n4(int i10, float f10, float f11, k kVar) {
                        m.this.B1(i10, f10, f11, kVar);
                    }

                    @Override
                    public void o4(int i10, float f10, k kVar) {
                        l.a(this, i10, f10, kVar);
                    }
                }, db.b.f7287b, 220L, false);
            }
            f fVar2 = this.C0;
            if (!z11 || this.A0 == 0.0f) {
                z12 = false;
            }
            fVar2.p(z10, z12);
        }
    }

    public final boolean O1(int i10) {
        if (this.D0 == i10) {
            return false;
        }
        this.D0 = i10;
        return true;
    }

    public final void P1() {
        int checkTextMaxWidth = getCheckTextMaxWidth();
        if (O1(ib.c.h(this.D0, Log.TAG_YOUTUBE, true)) && F1(checkTextMaxWidth)) {
            invalidate();
        }
    }

    public void Q1() {
        this.D0 |= Log.TAG_CAMERA;
    }

    @Override
    public void Q2() {
        I1();
        t1.b().d(this);
    }

    public void R1(int i10, int i11) {
        if (this.J0 != i10) {
            this.J0 = i10;
            this.K0 = i11;
            e1();
        } else if (this.K0 != i11) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.K0 = i11;
            if (F1(checkTextMaxWidth)) {
                invalidate();
            }
        }
    }

    public void T1(String str, CharSequence charSequence) {
        this.f24286s0 = str;
        l0[] l0VarArr = null;
        String charSequence2 = ib.i.i(charSequence) ? null : charSequence.toString();
        this.f24287t0 = charSequence2;
        TdApi.TextEntity[] x52 = charSequence2 != null ? t2.x5(charSequence, false) : null;
        if (x52 != null) {
            l0VarArr = l0.E(this.f18085b, this.f24287t0, x52, null);
        }
        this.f24289v0 = l0VarArr;
        e1();
        invalidate();
    }

    public void U1(int i10, int i11) {
        this.N0 = i10;
        this.O0 = i11;
        invalidate();
    }

    public void W1() {
        this.f24283p0.j(this.f24281n0, this.f24282o0);
    }

    public final void Y1() {
        Drawable drawable = this.G0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getBottomShadowSize());
        }
    }

    public final void Z1() {
        Drawable drawable = this.F0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), this.H0 + d1.a3(false) + n.d());
        }
    }

    public final boolean a2(float f10) {
        int l12 = l1(f10);
        return l12 <= (this.H0 + n.e()) + n.c() || ((float) ((l12 - a0.i(58.0f)) - ((int) getMultiLineAddition()))) < ((float) this.H0) + (((float) d1.a3(false)) * 0.7f);
    }

    public void b1(long j10, long j11) {
        this.R0.f(j10, j11);
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public v4<?> c7(i iVar, float f10, float f11) {
        f20.a aVar;
        TdApi.ChatPhotoInfo chatPhotoInfo = this.f24285r0;
        if (chatPhotoInfo != null) {
            aVar = new f20.a(chatPhotoInfo);
        } else {
            TdApi.ProfilePhoto profilePhoto = this.f24284q0;
            aVar = profilePhoto != null ? new f20.a(profilePhoto) : null;
        }
        if (aVar == null) {
            return null;
        }
        f20 f20Var = new f20(getContext(), this.f18085b);
        f20Var.Ad(aVar);
        return f20Var;
    }

    public final void e1() {
        Z1();
        Y1();
        W1();
        E1();
        invalidate();
    }

    @Override
    public void e2() {
        invalidate();
    }

    @Override
    public boolean f(i iVar, float f10, float f11, v4<?> v4Var) {
        return false;
    }

    public final int f1() {
        return l1(this.f24278k0);
    }

    public h getAvatar() {
        return this.f24281n0;
    }

    public float getAvatarExpandFactor() {
        return this.A0 * (1.0f - this.B0);
    }

    public v getAvatarReceiver() {
        return this.f24283p0;
    }

    public boolean getShowMute() {
        return (this.D0 & 2) != 0;
    }

    public l1 getThumbLocation() {
        l1 l1Var = new l1();
        l1Var.i(this.f24283p0.getLeft(), this.f24283p0.getTop(), this.f24283p0.getRight(), this.f24283p0.getBottom());
        l1Var.l(0, Math.max(-this.f24283p0.getTop(), 0), 0, Math.max(0, this.f24283p0.getBottom() - f1()));
        int g10 = this.f24283p0.g();
        l1Var.m(R.id.theme_color_headerBackground);
        l1Var.q(g10, g10, g10, g10);
        return l1Var;
    }

    @Override
    public boolean i0(i iVar, float f10, float f11) {
        int i10 = a0.i(6.0f);
        ld.c cVar = this.f24283p0;
        return cVar != null && !(this.f24284q0 == null && this.f24285r0 == null) && f10 >= ((float) (cVar.getLeft() - i10)) && f10 < ((float) (this.f24283p0.getRight() + i10)) && f11 >= ((float) (this.f24283p0.getTop() - i10)) && f11 < ((float) (this.f24283p0.getBottom() + i10));
    }

    @Override
    public void j4(Object obj, j1.r rVar) {
        rVar.f19674c = new a();
    }

    @Override
    public void k0(float f10, float f11, float f12, boolean z10) {
        if (f10 == 1.0f) {
            P1();
        }
        if (this.f24278k0 != f10) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.f24278k0 = f10;
            if (!ib.c.b(this.D0, Log.TAG_PAINT)) {
                if (z10) {
                    L1(a2(f10), true);
                } else if (a2(f11) == a2(f12)) {
                    setAvatarAllowanceFactor(1.0f);
                    L1(a2(f10), false);
                } else if (f10 == f12 || f11 == f12) {
                    setAvatarAllowanceFactor(1.0f);
                    L1(a2(f10), false);
                } else if (f11 < f12) {
                    setAvatarAllowanceFactor((f10 - f11) / (f12 - f11));
                    L1(a2(f12), false);
                } else {
                    setAvatarAllowanceFactor((f10 - f12) / (f11 - f12));
                    L1(a2(f11), false);
                }
            }
            F1(checkTextMaxWidth);
            invalidate();
        }
    }

    public final int l1(float f10) {
        return this.H0 + d1.a3(false) + ((int) ((d1.R2(false) - d1.a3(false)) * f10));
    }

    @Override
    public void m(d1 d1Var, int i10) {
        if (this.H0 != i10) {
            this.H0 = i10;
            Z1();
            C1();
            invalidate();
        }
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return (super.m0(view, f10, f11) && f11 < ((float) f1())) || n1(f10, f11, false);
    }

    public final float m1() {
        int i10 = a0.i(144.0f) - d1.a3(false);
        int f12 = (f1() - this.H0) - d1.a3(false);
        if (i10 < f12) {
            return 1.0f;
        }
        return f12 / i10;
    }

    @Override
    public void n(boolean z10) {
        invalidate();
    }

    public final boolean n1(float f10, float f11, boolean z10) {
        boolean z11 = false;
        if ((this.f24281n0 == null && (this.D0 & Log.TAG_VOICE) == 0) || this.Q0 == null) {
            if (z10) {
                this.D0 &= -4097;
            }
            return false;
        }
        if (f11 < f1() && this.f24283p0.i(f10, f11)) {
            z11 = true;
        }
        if (z10) {
            this.D0 = ib.c.h(this.D0, Log.TAG_EMOJI, z11);
        }
        return z11;
    }

    public final void o1(Canvas canvas, String str, int i10, int i11, int i12) {
        int i13 = a0.i(2.0f);
        int i14 = a0.i(4.0f);
        TextPaint O = y.O(12.0f, getSubtitleColor(), false);
        float T1 = v0.T1(str, O);
        RectF a02 = y.a0();
        float f10 = i10;
        a02.set(i10 - i14, i11 + i13, T1 + f10 + i14, (i12 + i11) - i13);
        canvas.drawRoundRect(a02, a0.i(2.0f), a0.i(2.0f), y.Y(getSubtitleColor(), a0.i(1.5f)));
        canvas.drawText(str, f10, i11 + a0.i(16.0f), O);
    }

    @Override
    public void onDraw(android.graphics.Canvas r37) {
        throw new UnsupportedOperationException("Method not decompiled: ud.m.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            e1();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e1();
    }

    @Override
    public boolean p() {
        return true;
    }

    public final int p1(String str) {
        return (int) (a0.i(12.0f) + (a0.i(4.0f) * 2) + v0.T1(str, y.O(12.0f, getSubtitleColor(), false)));
    }

    @Override
    public void q() {
        int currentScaledTextMaxWidth;
        String j10 = this.R0.j();
        g gVar = null;
        g.f fVar = null;
        gVar = null;
        if (!ib.i.i(j10) && (currentScaledTextMaxWidth = getCurrentScaledTextMaxWidth()) > 0) {
            final int e10 = this.R0.e();
            g.b bVar = new g.b(j10, currentScaledTextMaxWidth, y.A0(14.0f), new je.k() {
                @Override
                public int R() {
                    return je.j.d(this);
                }

                @Override
                public long W0(boolean z10) {
                    return je.j.c(this, z10);
                }

                @Override
                public int a1() {
                    return je.j.f(this);
                }

                @Override
                public final int c() {
                    int typingColor;
                    typingColor = m.this.getTypingColor();
                    return typingColor;
                }

                @Override
                public int d(boolean z10) {
                    return je.j.b(this, z10);
                }

                @Override
                public int g(boolean z10) {
                    return je.j.h(this, z10);
                }

                @Override
                public int o0(boolean z10) {
                    return je.j.e(this, z10);
                }

                @Override
                public int r0(boolean z10) {
                    return je.j.a(this, z10);
                }

                @Override
                public int t0(boolean z10) {
                    return je.j.g(this, z10);
                }
            });
            if (e10 > 0) {
                fVar = new g.f() {
                    @Override
                    public final int a(int i10, int i11, int i12, int i13) {
                        int u12;
                        u12 = m.u1(e10, i10, i11, i12, i13);
                        return u12;
                    }
                };
            }
            gVar = bVar.n(fVar).v().f();
        }
        this.R0.l(gVar);
    }

    public final boolean q1() {
        return this.f24287t0 != null;
    }

    public final boolean r1() {
        g gVar;
        g gVar2 = this.f24290w0;
        return (gVar2 != null && gVar2.x0()) || ((gVar = this.f24292y0) != null && gVar.x0());
    }

    @Override
    public void s() {
        invalidate();
    }

    public void s1(v4<?> v4Var, boolean z10) {
        int Q9 = v4Var.Q9();
        setTextColor(j.L(Q9));
        if (z10) {
            v4Var.z8(this, Q9);
        }
    }

    public void setAvatar(TdApi.ProfilePhoto profilePhoto) {
        this.f24284q0 = profilePhoto;
        this.f24285r0 = null;
        this.f24279l0 = null;
        if (profilePhoto != null) {
            this.f24281n0 = t2.F0(this.f18085b, profilePhoto);
            this.f24282o0 = new h(this.f18085b, profilePhoto.big);
            return;
        }
        this.f24281n0 = null;
        this.f24282o0 = null;
    }

    public void setAvatarExpandListener(b bVar) {
        this.I0 = bVar;
    }

    public void setAvatarPlaceholder(hd.b bVar) {
        int i10;
        Drawable drawable = null;
        this.f24281n0 = null;
        this.f24284q0 = null;
        this.f24285r0 = null;
        this.f24279l0 = bVar;
        if (!(bVar == null || (i10 = bVar.f12763d.f12767d) == 0)) {
            drawable = Z(i10, 0);
        }
        this.f24280m0 = drawable;
    }

    public void setExpandedSubtitle(CharSequence charSequence) {
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        String str = this.f24288u0;
        boolean z10 = true;
        boolean z11 = str == null;
        if (charSequence2 != null) {
            z10 = false;
        }
        if (z11 != z10 || (charSequence2 != null && !charSequence2.equals(str))) {
            this.f24288u0 = charSequence2;
            D1();
            invalidate();
        }
    }

    public void setIgnoreMute(boolean z10) {
        if (O1(ib.c.h(this.D0, Log.TAG_COMPRESS, z10)) && ib.c.b(this.D0, 2)) {
            G1();
            invalidate();
        }
    }

    public void setInnerRightMargin(int i10) {
        R1(this.J0, i10);
    }

    public void setInnerRightMarginStart(int i10) {
        if (this.L0 != i10) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.L0 = i10;
            if (F1(checkTextMaxWidth)) {
                invalidate();
            }
        }
    }

    public void setMuteFadeFactor(float f10) {
        if (this.P0 != f10) {
            this.P0 = f10;
            if (ib.c.b(this.D0, 2) && !ib.c.b(this.D0, Log.TAG_COMPRESS)) {
                invalidate();
            }
        }
    }

    public void setNeedArrow(boolean z10) {
        if (((this.D0 & Log.TAG_VIDEO) != 0) != z10) {
            if (z10 && this.E0 == null) {
                this.E0 = ce.c.g(getResources(), R.drawable.round_keyboard_arrow_right_24);
            }
            this.D0 = ib.c.h(this.D0, Log.TAG_VIDEO, z10);
            E1();
            invalidate();
        }
    }

    public void setNoExpand(boolean z10) {
        if (O1(ib.c.h(this.D0, Log.TAG_PAINT, z10)) && z10) {
            setAvatarAllowanceFactor(0.0f);
        }
    }

    public void setNoStatus(boolean z10) {
        this.D0 = ib.c.h(this.D0, Log.TAG_ROUND, z10);
    }

    public void setPhotoOpenCallback(c cVar) {
        this.Q0 = cVar;
    }

    public void setPhotoOpenDisabled(boolean z10) {
        this.D0 = ib.c.h(this.D0, 16, z10);
    }

    public void setShowFake(boolean z10) {
        if (O1(ib.c.h(this.D0, Log.TAG_NDK, z10))) {
            G1();
            invalidate();
        }
    }

    public void setShowLock(boolean z10) {
        if (O1(ib.c.h(this.D0, 1, z10))) {
            G1();
            invalidate();
        }
    }

    public void setShowMute(boolean z10) {
        if (O1(ib.c.h(this.D0, 2, z10))) {
            G1();
            invalidate();
        }
    }

    public void setShowScam(boolean z10) {
        if (O1(ib.c.h(this.D0, Log.TAG_PLAYER, z10))) {
            G1();
            invalidate();
        }
    }

    public void setShowVerify(boolean z10) {
        if (O1(ib.c.h(this.D0, 4, z10))) {
            G1();
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        T1(this.f24286s0, charSequence);
    }

    @Override
    public final void setTextColor(int i10) {
        this.N0 = i10;
        this.O0 = V1(i10);
        invalidate();
    }

    public void setTitle(String str) {
        T1(str, this.f24287t0);
    }

    public void setUseRedHighlight(boolean z10) {
        if (O1(ib.c.h(this.D0, Log.TAG_CONTACT, z10))) {
            G1();
            invalidate();
        }
    }

    public boolean t1() {
        f fVar = this.C0;
        return fVar != null && fVar.h();
    }

    @Override
    public boolean u() {
        return true;
    }

    public void setAvatar(TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.f24285r0 = chatPhotoInfo;
        this.f24284q0 = null;
        this.f24279l0 = null;
        if (chatPhotoInfo != null) {
            this.f24281n0 = t2.E0(this.f18085b, chatPhotoInfo);
            this.f24282o0 = new h(this.f18085b, chatPhotoInfo.big);
            return;
        }
        this.f24281n0 = null;
        this.f24282o0 = null;
    }

    public void setAvatar(h hVar) {
        this.f24281n0 = hVar;
        this.f24284q0 = null;
        this.f24285r0 = null;
        this.f24279l0 = null;
    }
}
