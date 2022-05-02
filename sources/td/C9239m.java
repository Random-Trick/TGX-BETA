package td;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1392p;
import be.C1410y;
import gd.C4587b;
import gd.C4779t2;
import ge.C4896n;
import ie.AbstractC5408k;
import ie.AbstractC5411l0;
import ie.C5406j;
import ie.RunnableC5390g;
import me.View$OnClickListenerC6902i;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2061e;
import p037cb.C2065g;
import p038ce.e20;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6246h;
import p194nd.AbstractC7459k1;
import p194nd.C7462l1;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8112b;
import p225pd.C8113c;
import p253rc.AbstractC8424a;
import p291uc.C9534f;
import p350yd.C10802kc;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;
import td.View$OnClickListenerC9170d1;

public class C9239m extends View$OnClickListenerC6902i implements AbstractC9165c2, AbstractC9208i2, AbstractC9321v2, AbstractC5911c, AbstractC9168d, AbstractC8424a, View$OnClickListenerC6902i.AbstractC6906d, C10802kc.AbstractC10807e, C11052v1.AbstractC11053a, View$OnClickListenerC9170d1.AbstractC9173c {
    public float f29823A0;
    public float f29824B0;
    public C3940f f29825C0;
    public int f29826D0;
    public Drawable f29827E0;
    public Drawable f29828F0;
    public Drawable f29829G0;
    public int f29830H0;
    public AbstractC9241b f29831I0;
    public int f29832J0;
    public int f29833K0;
    public int f29834L0 = -1;
    public float f29835M0 = 1.3f;
    public int f29836N0 = -1;
    public int f29837O0 = C5064d.m24132a(C11524j.m180h0(), -1);
    public float f29838P0;
    public AbstractC9242c f29839Q0;
    public final C10802kc.C10806d f29840R0;
    public float f29841k0;
    public C4587b f29842l0;
    public Drawable f29843m0;
    public C6246h f29844n0;
    public C6246h f29845o0;
    public final C6240c f29846p0;
    public TdApi.ProfilePhoto f29847q0;
    public TdApi.ChatPhotoInfo f29848r0;
    public String f29849s0;
    public String f29850t0;
    public String f29851u0;
    public AbstractC5411l0[] f29852v0;
    public RunnableC5390g f29853w0;
    public RunnableC5390g f29854x0;
    public RunnableC5390g f29855y0;
    public RunnableC5390g f29856z0;

    public class C9240a implements AbstractC7459k1 {
        public C9240a() {
        }

        @Override
        public void mo9807F2(int i, C8112b bVar, boolean z) {
        }

        @Override
        public C7462l1 mo9806v(int i, C8112b bVar) {
            if (i == 0) {
                return C9239m.this.getThumbLocation();
            }
            return null;
        }
    }

    public interface AbstractC9241b {
        void mo9805a(C9239m mVar, float f, boolean z, float f2, float f3);
    }

    public interface AbstractC9242c {
        void mo9804Q5();
    }

    public C9239m(Context context, C10930q6 q6Var, AbstractC9323v4<?> v4Var) {
        super(context, q6Var);
        setLayoutParams(FrameLayoutFix.m18008s1(-1, -2));
        this.f29840R0 = new C10802kc.C10806d(C1379j0.m37310r(context), q6Var, this, v4Var);
        setUseDefaultClickListener(false);
        C6240c cVar = new C6240c(this, 1);
        this.f29846p0 = cVar;
        cVar.mo20260D0(0);
        setCustomControllerProvider(this);
        C11052v1.m1768b().m1769a(this);
    }

    public void m9853B1(int i, float f, float f2, C3950k kVar) {
        if (this.f29824B0 != f) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.f29824B0 = f;
            AbstractC9241b bVar = this.f29831I0;
            if (bVar != null) {
                bVar.mo9805a(this, getAvatarExpandFactor(), true, this.f29823A0, this.f29824B0);
            }
            m9847F1(checkTextMaxWidth);
            invalidate();
        }
    }

    public static int m9827U1(int i) {
        return C5064d.m24132a(C11524j.m180h0(), i);
    }

    public static float getBaseAvatarRadiusDp() {
        return 20.5f;
    }

    private int getBaseTextMaxWidth() {
        return Math.max(0, (((getMeasuredWidth() - (this.f29832J0 + getInnerRightMargin())) - C1357a0.m37544i(4.0f)) - (C1357a0.m37544i(getBaseAvatarRadiusDp()) * 2)) - C1357a0.m37544i(9.0f));
    }

    private Drawable getBottomShadow() {
        if (this.f29829G0 == null) {
            this.f29829G0 = C2061e.m35730a(1711276032, 2, 80, false);
            m9824Y1();
        }
        return this.f29829G0;
    }

    private int getBottomShadowSize() {
        return (int) ((C1357a0.m37544i(28.0f) + C1357a0.m37544i(5.0f) + getTitleHeight() + C1357a0.m37544i(8.0f) + C1357a0.m37544i(14.0f)) * 1.1111112f);
    }

    private int getCheckTextMaxWidth() {
        return getCurrentScaledTextMaxWidth();
    }

    private int getCurrentScaledTextMaxWidth() {
        return Math.min(getBaseTextMaxWidth(), getScaledTextMaxWidth());
    }

    private int getExpandedMaxTextWidth() {
        return ((int) ((getMeasuredWidth() - (C1357a0.m37544i(11.0f) * 2)) / this.f29835M0)) - (C5063c.m24145b(this.f29826D0, 4) ? C1357a0.m37544i(20.0f) : 0);
    }

    private int getInnerRightMargin() {
        int i;
        return (C5063c.m24145b(this.f29826D0, Log.TAG_YOUTUBE) || (i = this.f29834L0) == -1) ? this.f29833K0 : i;
    }

    private float getMultiLineAddition() {
        RunnableC5390g gVar = this.f29854x0;
        if (gVar == null || this.f29853w0 == null) {
            return 0.0f;
        }
        return (gVar.getHeight() - this.f29853w0.getHeight()) * this.f29835M0;
    }

    private static int getMutePadding() {
        return C1357a0.m37544i(1.0f);
    }

    private int getScaledTextMaxWidth() {
        return (int) (((getBaseTextMaxWidth() + C1357a0.m37544i(11.0f)) + getInnerRightMargin()) / 1.1f);
    }

    public int getSubtitleColor() {
        return C5064d.m24129d(this.f29837O0, C5064d.m24132a(C11524j.m180h0(), -1), getAvatarExpandFactor());
    }

    private int getTextOffsetLeft() {
        if ((this.f29826D0 & 1) != 0) {
            return C1357a0.m37544i(16.0f);
        }
        return 0;
    }

    private int getTextOffsetRight() {
        int i = 0;
        if ((this.f29826D0 & 4) != 0) {
            i = 0 + C1357a0.m37544i(20.0f);
        }
        int i2 = this.f29826D0;
        return ((i2 & 2) == 0 || (i2 & Log.TAG_COMPRESS) != 0) ? i : i + getMutePadding() + C1392p.m37237b();
    }

    public int getTitleColor() {
        return C5064d.m24129d(this.f29836N0, -1, getAvatarExpandFactor());
    }

    private AbstractC5408k getTitleColorSet() {
        return new AbstractC5408k() {
            @Override
            public int mo7858Q() {
                return C5406j.m22808d(this);
            }

            @Override
            public long mo7857X0(boolean z) {
                return C5406j.m22809c(this, z);
            }

            @Override
            public int mo7856b1() {
                return C5406j.m22806f(this);
            }

            @Override
            public final int mo7855c() {
                int titleColor;
                titleColor = C9239m.this.getTitleColor();
                return titleColor;
            }

            @Override
            public int mo7854e(boolean z) {
                return C5406j.m22810b(this, z);
            }

            @Override
            public int mo7853g(boolean z) {
                return C5406j.m22804h(this, z);
            }

            @Override
            public int mo7852o0(boolean z) {
                return C5406j.m22807e(this, z);
            }

            @Override
            public int mo7851p0(boolean z) {
                return C5406j.m22811a(this, z);
            }

            @Override
            public int mo7850r0(boolean z) {
                return C5406j.m22805g(this, z);
            }
        };
    }

    private int getTitleHeight() {
        RunnableC5390g gVar = this.f29854x0;
        return (int) (((gVar == null && (gVar = this.f29853w0) == null) ? 0 : gVar.getHeight()) * this.f29835M0);
    }

    private Drawable getTopShadow() {
        if (this.f29828F0 == null) {
            this.f29828F0 = C2061e.m35730a(1996488704, 2, 48, false);
            m9823Z1();
        }
        return this.f29828F0;
    }

    public int getTypingColor() {
        float S = C11524j.m218S();
        if (S == 0.0f) {
            if (this instanceof C9534f) {
                return C11524j.m161p0();
            }
            return C5064d.m24131b(255, this.f29837O0 & 16777215);
        } else if (S == 1.0f) {
            return C11524j.m187f();
        } else {
            return C5064d.m24129d(this instanceof C9534f ? C11524j.m161p0() : C5064d.m24131b(255, 16777215 & this.f29837O0), C11524j.m187f(), S);
        }
    }

    public static int m9812s1(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i;
        }
        return 0;
    }

    private void setAvatarAllowanceFactor(float f) {
        if (this.f29823A0 != f) {
            this.f29823A0 = f;
            AbstractC9241b bVar = this.f29831I0;
            if (bVar != null) {
                bVar.mo9805a(this, getAvatarExpandFactor(), false, this.f29823A0, this.f29824B0);
            }
            invalidate();
        }
    }

    public int m9810u1(int i, int i2, int i3, int i4) {
        return (i3 - getTextOffsetLeft()) - getTextOffsetRight();
    }

    public int m9809v1(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return getTextOffsetLeft();
        }
        return 0;
    }

    public int m9808z1(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return getTextOffsetLeft();
        }
        return 0;
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if ((this.f29826D0 & 16) == 0) {
            m9817i1(f, f2, true);
            if ((this.f29826D0 & Log.TAG_EMOJI) != 0) {
                m9844H1();
                this.f29826D0 &= -4097;
                return;
            }
        }
        super.mo7428C(view, f, f2);
    }

    public final void m9851C1() {
        float i = C1357a0.m37544i(getBaseAvatarRadiusDp());
        float i2 = this.f29832J0 + C1357a0.m37544i(4.0f) + i;
        float c3 = this.f29830H0 + (View$OnClickListenerC9170d1.m10065c3(false) / 2);
        float g1 = m9818g1();
        if (g1 != 0.0f) {
            i2 += (-C1357a0.m37544i(33.0f)) * g1;
            c3 += C1357a0.m37544i(64.0f) * g1;
            i += C1357a0.m37544i(10.0f) * g1;
        }
        float avatarExpandFactor = getAvatarExpandFactor();
        int d1 = this.f29830H0 + ((m9820d1() - this.f29830H0) / 2);
        this.f29846p0.mo20260D0(Math.round((1.0f - avatarExpandFactor) * i));
        float measuredWidth = getMeasuredWidth() / 2;
        float f = i + ((measuredWidth - i) * avatarExpandFactor);
        float f2 = i2 + ((measuredWidth - i2) * avatarExpandFactor);
        float f3 = c3 + ((d1 - c3) * avatarExpandFactor);
        this.f29846p0.mo20257K0(Math.round(f2 - f), Math.round(f3 - f), Math.round(f2 + f), Math.round(f3 + f));
    }

    public final void m9850D1() {
        String str;
        AbstractC5411l0[] l0VarArr = null;
        if (C5070i.m24062i(this.f29850t0)) {
            this.f29856z0 = null;
            this.f29855y0 = null;
            return;
        }
        AbstractC5408k lVar = new AbstractC5408k() {
            @Override
            public int mo7858Q() {
                return C5406j.m22808d(this);
            }

            @Override
            public long mo7857X0(boolean z) {
                return C5406j.m22809c(this, z);
            }

            @Override
            public int mo7856b1() {
                return C5406j.m22806f(this);
            }

            @Override
            public final int mo7855c() {
                int subtitleColor;
                subtitleColor = C9239m.this.getSubtitleColor();
                return subtitleColor;
            }

            @Override
            public int mo7854e(boolean z) {
                return C5406j.m22810b(this, z);
            }

            @Override
            public int mo7853g(boolean z) {
                return C5406j.m22804h(this, z);
            }

            @Override
            public int mo7852o0(boolean z) {
                return C5406j.m22807e(this, z);
            }

            @Override
            public int mo7851p0(boolean z) {
                return C5406j.m22811a(this, z);
            }

            @Override
            public int mo7850r0(boolean z) {
                return C5406j.m22805g(this, z);
            }
        };
        RunnableC5390g f = new RunnableC5390g.C5392b(this.f29850t0, getCurrentScaledTextMaxWidth(), C1410y.m37086A0(14.0f), lVar).m22869v().m22882i(this.f29852v0).m22885f();
        this.f29855y0 = f;
        if (f.m22895x0() || ((str = this.f29851u0) != null && !str.equals(this.f29850t0))) {
            String str2 = this.f29851u0;
            if (str2 == null) {
                str2 = this.f29850t0;
            }
            RunnableC5390g.C5392b v = new RunnableC5390g.C5392b(str2, getExpandedMaxTextWidth(), C1410y.m37086A0(14.0f), lVar).m22869v();
            if (this.f29851u0 == null) {
                l0VarArr = this.f29852v0;
            }
            this.f29856z0 = v.m22882i(l0VarArr).m22885f();
            return;
        }
        this.f29856z0 = null;
    }

    public final void m9849E1() {
        m9845G1();
        m9850D1();
        mo3252o();
    }

    public final boolean m9847F1(int i) {
        int checkTextMaxWidth = getCheckTextMaxWidth();
        if (checkTextMaxWidth >= i && (checkTextMaxWidth <= i || !m9815o1())) {
            return false;
        }
        m9849E1();
        return true;
    }

    @Override
    public final void mo9846G0(int i, int i2) {
    }

    public final void m9845G1() {
        if (C5070i.m24062i(this.f29849s0)) {
            this.f29854x0 = null;
            this.f29853w0 = null;
            return;
        }
        this.f29835M0 = 1.3f;
        RunnableC5390g f = new RunnableC5390g.C5392b(this.f29849s0, getCurrentScaledTextMaxWidth(), C1410y.m37086A0(18.0f), getTitleColorSet()).m22876o(new RunnableC5390g.AbstractC5397g() {
            @Override
            public final int mo9970a(int i, int i2, int i3, int i4) {
                int u1;
                u1 = C9239m.this.m9810u1(i, i2, i3, i4);
                return u1;
            }
        }).m22877n(new RunnableC5390g.AbstractC5396f() {
            @Override
            public final int mo7827a(int i, int i2, int i3, int i4) {
                int v1;
                v1 = C9239m.this.m9809v1(i, i2, i3, i4);
                return v1;
            }
        }).m22869v().m22884g().m22889b().m22885f();
        this.f29853w0 = f;
        this.f29854x0 = null;
        if (f.m22895x0()) {
            int i = 2;
            while (true) {
                RunnableC5390g f2 = new RunnableC5390g.C5392b(this.f29849s0, getExpandedMaxTextWidth(), C1410y.m37086A0(18.0f), getTitleColorSet()).m22877n(new RunnableC5390g.AbstractC5396f() {
                    @Override
                    public final int mo7827a(int i2, int i3, int i4, int i5) {
                        int z1;
                        z1 = C9239m.this.m9808z1(i2, i3, i4, i5);
                        return z1;
                    }
                }).m22875p(i).m22884g().m22889b().m22885f();
                this.f29854x0 = f2;
                if (!f2.m22895x0()) {
                    break;
                }
                if (i == 2) {
                    i++;
                }
                this.f29835M0 -= 0.05f;
            }
        }
        m9824Y1();
    }

    public final void m9844H1() {
        if (!m18491x0()) {
            C2065g.m35722c(this);
        }
        AbstractC9242c cVar = this.f29839Q0;
        if (cVar != null) {
            cVar.mo9804Q5();
        }
    }

    public void m9843I1() {
        C10802kc.C10806d dVar = this.f29840R0;
        if (dVar != null) {
            dVar.m3262g();
        }
        C6240c cVar = this.f29846p0;
        if (cVar != null) {
            cVar.clear();
        }
    }

    public void m9841J1() {
        this.f29840R0.m3262g();
    }

    public void m9840K1() {
        this.f29826D0 |= Log.TAG_VOICE;
    }

    public final void m9839L1(boolean z, boolean z2) {
        C3940f fVar = this.f29825C0;
        boolean z3 = true;
        if ((fVar != null && fVar.m29585h()) != z) {
            if (this.f29825C0 == null) {
                this.f29825C0 = new C3940f(0, new C3950k.AbstractC3952b() {
                    @Override
                    public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                        C9239m.this.m9853B1(i, f, f2, kVar);
                    }

                    @Override
                    public void mo35Y0(int i, float f, C3950k kVar) {
                        C3953l.m29528a(this, i, f, kVar);
                    }
                }, C2057b.f7280b, 220L, false);
            }
            C3940f fVar2 = this.f29825C0;
            if (!z2 || this.f29823A0 == 0.0f) {
                z3 = false;
            }
            fVar2.m29577p(z, z3);
        }
    }

    public final boolean m9837M1(int i) {
        if (this.f29826D0 == i) {
            return false;
        }
        this.f29826D0 = i;
        return true;
    }

    public final void m9836N1() {
        int checkTextMaxWidth = getCheckTextMaxWidth();
        if (m9837M1(C5063c.m24139h(this.f29826D0, Log.TAG_YOUTUBE, true)) && m9847F1(checkTextMaxWidth)) {
            invalidate();
        }
    }

    public void m9834O1() {
        this.f29826D0 |= Log.TAG_CAMERA;
    }

    public void m9832Q1(int i, int i2) {
        if (this.f29832J0 != i) {
            this.f29832J0 = i;
            this.f29833K0 = i2;
            m9821c1();
        } else if (this.f29833K0 != i2) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.f29833K0 = i2;
            if (m9847F1(checkTextMaxWidth)) {
                invalidate();
            }
        }
    }

    @Override
    public C8113c mo9831R4(long j, TdApi.SearchMessagesFilter searchMessagesFilter) {
        return null;
    }

    public void m9830S1(String str, CharSequence charSequence) {
        this.f29849s0 = str;
        AbstractC5411l0[] l0VarArr = null;
        String charSequence2 = C5070i.m24062i(charSequence) ? null : charSequence.toString();
        this.f29850t0 = charSequence2;
        TdApi.TextEntity[] x5 = charSequence2 != null ? C4779t2.m25393x5(charSequence, false) : null;
        if (x5 != null) {
            l0VarArr = AbstractC5411l0.m22791E(this.f21823b, this.f29850t0, x5, null);
        }
        this.f29852v0 = l0VarArr;
        m9821c1();
        invalidate();
    }

    public void m9829T1(int i, int i2) {
        this.f29836N0 = i;
        this.f29837O0 = i2;
        invalidate();
    }

    public void m9826W0(long j, long j2) {
        this.f29840R0.m3263f(j, j2);
    }

    public void m9825W1() {
        this.f29846p0.m20978j(this.f29844n0, this.f29845o0);
    }

    public final void m9824Y1() {
        Drawable drawable = this.f29829G0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getBottomShadowSize());
        }
    }

    public final void m9823Z1() {
        Drawable drawable = this.f29828F0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), this.f29830H0 + View$OnClickListenerC9170d1.m10065c3(false) + C4896n.m24480d());
        }
    }

    @Override
    public AbstractC9323v4<?> mo6637Z3(View$OnClickListenerC6902i iVar, float f, float f2) {
        e20.C2320a aVar;
        TdApi.ChatPhotoInfo chatPhotoInfo = this.f29848r0;
        if (chatPhotoInfo != null) {
            aVar = new e20.C2320a(chatPhotoInfo);
        } else {
            TdApi.ProfilePhoto profilePhoto = this.f29847q0;
            aVar = profilePhoto != null ? new e20.C2320a(profilePhoto) : null;
        }
        if (aVar == null) {
            return null;
        }
        e20 e20Var = new e20(getContext(), this.f21823b);
        e20Var.m9476Ad(aVar);
        return e20Var;
    }

    public final boolean m9822a2(float f) {
        int e1 = m9819e1(f);
        return e1 <= (this.f29830H0 + C4896n.m24479e()) + C4896n.m24481c() || ((float) ((e1 - C1357a0.m37544i(58.0f)) - ((int) getMultiLineAddition()))) < ((float) this.f29830H0) + (((float) View$OnClickListenerC9170d1.m10065c3(false)) * 0.7f);
    }

    @Override
    public void mo4501a3() {
        m9843I1();
        C11052v1.m1768b().m1766d(this);
    }

    public final void m9821c1() {
        m9823Z1();
        m9824Y1();
        m9825W1();
        m9849E1();
        invalidate();
    }

    @Override
    public boolean mo6636d(View$OnClickListenerC6902i iVar, float f, float f2, AbstractC9323v4<?> v4Var) {
        return false;
    }

    public final int m9820d1() {
        return m9819e1(this.f29841k0);
    }

    public final int m9819e1(float f) {
        return this.f29830H0 + View$OnClickListenerC9170d1.m10065c3(false) + ((int) ((View$OnClickListenerC9170d1.m10088T2(false) - View$OnClickListenerC9170d1.m10065c3(false)) * f));
    }

    @Override
    public boolean mo6635e2(View$OnClickListenerC6902i iVar, float f, float f2) {
        int i = C1357a0.m37544i(6.0f);
        C6240c cVar = this.f29846p0;
        return cVar != null && !(this.f29847q0 == null && this.f29848r0 == null) && f >= ((float) (cVar.getLeft() - i)) && f < ((float) (this.f29846p0.getRight() + i)) && f2 >= ((float) (this.f29846p0.getTop() - i)) && f2 < ((float) (this.f29846p0.getBottom() + i));
    }

    public final float m9818g1() {
        int i = C1357a0.m37544i(144.0f) - View$OnClickListenerC9170d1.m10065c3(false);
        int d1 = (m9820d1() - this.f29830H0) - View$OnClickListenerC9170d1.m10065c3(false);
        if (i < d1) {
            return 1.0f;
        }
        return d1 / i;
    }

    @Override
    public void mo452g2() {
        invalidate();
    }

    public C6246h getAvatar() {
        return this.f29844n0;
    }

    public float getAvatarExpandFactor() {
        return this.f29823A0 * (1.0f - this.f29824B0);
    }

    public AbstractC6264v getAvatarReceiver() {
        return this.f29846p0;
    }

    public boolean getShowMute() {
        return (this.f29826D0 & 2) != 0;
    }

    public C7462l1 getThumbLocation() {
        C7462l1 l1Var = new C7462l1();
        l1Var.m15991i(this.f29846p0.getLeft(), this.f29846p0.getTop(), this.f29846p0.getRight(), this.f29846p0.getBottom());
        l1Var.m15988l(0, Math.max(-this.f29846p0.getTop(), 0), 0, Math.max(0, this.f29846p0.getBottom() - m9820d1()));
        int g = this.f29846p0.m20981g();
        l1Var.m15987m(R.id.theme_color_headerBackground);
        l1Var.m15983q(g, g, g, g);
        return l1Var;
    }

    @Override
    public void mo8402i0(float f, float f2, float f3, boolean z) {
        if (f == 1.0f) {
            m9836N1();
        }
        if (this.f29841k0 != f) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.f29841k0 = f;
            if (!C5063c.m24145b(this.f29826D0, Log.TAG_PAINT)) {
                if (z) {
                    m9839L1(m9822a2(f), true);
                } else if (m9822a2(f2) == m9822a2(f3)) {
                    setAvatarAllowanceFactor(1.0f);
                    m9839L1(m9822a2(f), false);
                } else if (f == f3 || f2 == f3) {
                    setAvatarAllowanceFactor(1.0f);
                    m9839L1(m9822a2(f), false);
                } else if (f2 < f3) {
                    setAvatarAllowanceFactor((f - f2) / (f3 - f2));
                    m9839L1(m9822a2(f3), false);
                } else {
                    setAvatarAllowanceFactor((f - f3) / (f2 - f3));
                    m9839L1(m9822a2(f2), false);
                }
            }
            m9847F1(checkTextMaxWidth);
            invalidate();
        }
    }

    public final boolean m9817i1(float f, float f2, boolean z) {
        boolean z2 = false;
        if ((this.f29844n0 == null && (this.f29826D0 & Log.TAG_VOICE) == 0) || this.f29839Q0 == null) {
            if (z) {
                this.f29826D0 &= -4097;
            }
            return false;
        }
        if (f2 < m9820d1() && this.f29846p0.m20979i(f, f2)) {
            z2 = true;
        }
        if (z) {
            this.f29826D0 = C5063c.m24139h(this.f29826D0, Log.TAG_EMOJI, z2);
        }
        return z2;
    }

    @Override
    public void mo9774k0(View$OnClickListenerC9170d1 d1Var, int i) {
        if (this.f29830H0 != i) {
            this.f29830H0 = i;
            m9823Z1();
            m9851C1();
            invalidate();
        }
    }

    @Override
    public void mo3254m(boolean z) {
        invalidate();
    }

    @Override
    public boolean mo3253n() {
        return true;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return (super.mo7418n0(view, f, f2) && f2 < ((float) m9820d1())) || m9817i1(f, f2, false);
    }

    public final boolean m9816n1() {
        return this.f29850t0 != null;
    }

    @Override
    public void mo3252o() {
        int currentScaledTextMaxWidth;
        String j = this.f29840R0.m3259j();
        RunnableC5390g gVar = null;
        RunnableC5390g.AbstractC5396f fVar = null;
        gVar = null;
        if (!C5070i.m24062i(j) && (currentScaledTextMaxWidth = getCurrentScaledTextMaxWidth()) > 0) {
            final int e = this.f29840R0.m3264e();
            RunnableC5390g.C5392b bVar = new RunnableC5390g.C5392b(j, currentScaledTextMaxWidth, C1410y.m37086A0(14.0f), new AbstractC5408k() {
                @Override
                public int mo7858Q() {
                    return C5406j.m22808d(this);
                }

                @Override
                public long mo7857X0(boolean z) {
                    return C5406j.m22809c(this, z);
                }

                @Override
                public int mo7856b1() {
                    return C5406j.m22806f(this);
                }

                @Override
                public final int mo7855c() {
                    int typingColor;
                    typingColor = C9239m.this.getTypingColor();
                    return typingColor;
                }

                @Override
                public int mo7854e(boolean z) {
                    return C5406j.m22810b(this, z);
                }

                @Override
                public int mo7853g(boolean z) {
                    return C5406j.m22804h(this, z);
                }

                @Override
                public int mo7852o0(boolean z) {
                    return C5406j.m22807e(this, z);
                }

                @Override
                public int mo7851p0(boolean z) {
                    return C5406j.m22811a(this, z);
                }

                @Override
                public int mo7850r0(boolean z) {
                    return C5406j.m22805g(this, z);
                }
            });
            if (e > 0) {
                fVar = new RunnableC5390g.AbstractC5396f() {
                    @Override
                    public final int mo7827a(int i, int i2, int i3, int i4) {
                        int s1;
                        s1 = C9239m.m9812s1(e, i, i2, i3, i4);
                        return s1;
                    }
                };
            }
            gVar = bVar.m22877n(fVar).m22869v().m22885f();
        }
        this.f29840R0.m3257l(gVar);
    }

    public final boolean m9815o1() {
        RunnableC5390g gVar;
        RunnableC5390g gVar2 = this.f29853w0;
        return (gVar2 != null && gVar2.m22895x0()) || ((gVar = this.f29855y0) != null && gVar.m22895x0());
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: td.C9239m.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m9821c1();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9821c1();
    }

    @Override
    public boolean mo3251q() {
        return true;
    }

    public void m9814q1(AbstractC9323v4<?> v4Var, boolean z) {
        int Q9 = v4Var.mo9360Q9();
        setTextColor(C11524j.m228N(Q9));
        if (z) {
            v4Var.m9119z8(this, Q9);
        }
    }

    public boolean m9813r1() {
        C3940f fVar = this.f29825C0;
        return fVar != null && fVar.m29585h();
    }

    @Override
    public void mo8255s() {
        invalidate();
    }

    public void setAvatar(TdApi.ProfilePhoto profilePhoto) {
        this.f29847q0 = profilePhoto;
        this.f29848r0 = null;
        this.f29842l0 = null;
        if (profilePhoto != null) {
            this.f29844n0 = C4779t2.m25696F0(this.f21823b, profilePhoto);
            this.f29845o0 = new C6246h(this.f21823b, profilePhoto.big);
            return;
        }
        this.f29844n0 = null;
        this.f29845o0 = null;
    }

    public void setAvatarExpandListener(AbstractC9241b bVar) {
        this.f29831I0 = bVar;
    }

    public void setAvatarPlaceholder(C4587b bVar) {
        int i;
        Drawable drawable = null;
        this.f29844n0 = null;
        this.f29847q0 = null;
        this.f29848r0 = null;
        this.f29842l0 = bVar;
        if (!(bVar == null || (i = bVar.f15119d.f15123d) == 0)) {
            drawable = mo14041X(i, 0);
        }
        this.f29843m0 = drawable;
    }

    public void setExpandedSubtitle(CharSequence charSequence) {
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        String str = this.f29851u0;
        boolean z = true;
        boolean z2 = str == null;
        if (charSequence2 != null) {
            z = false;
        }
        if (z2 != z || (charSequence2 != null && !charSequence2.equals(str))) {
            this.f29851u0 = charSequence2;
            m9850D1();
            invalidate();
        }
    }

    public void setIgnoreMute(boolean z) {
        if (m9837M1(C5063c.m24139h(this.f29826D0, Log.TAG_COMPRESS, z)) && C5063c.m24145b(this.f29826D0, 2)) {
            m9845G1();
            invalidate();
        }
    }

    public void setInnerRightMargin(int i) {
        m9832Q1(this.f29832J0, i);
    }

    public void setInnerRightMarginStart(int i) {
        if (this.f29834L0 != i) {
            int checkTextMaxWidth = getCheckTextMaxWidth();
            this.f29834L0 = i;
            if (m9847F1(checkTextMaxWidth)) {
                invalidate();
            }
        }
    }

    public void setMuteFadeFactor(float f) {
        if (this.f29838P0 != f) {
            this.f29838P0 = f;
            if (C5063c.m24145b(this.f29826D0, 2) && !C5063c.m24145b(this.f29826D0, Log.TAG_COMPRESS)) {
                invalidate();
            }
        }
    }

    public void setNeedArrow(boolean z) {
        if (((this.f29826D0 & Log.TAG_VIDEO) != 0) != z) {
            if (z && this.f29827E0 == null) {
                this.f29827E0 = C1362c.m37485g(getResources(), R.drawable.round_keyboard_arrow_right_24);
            }
            this.f29826D0 = C5063c.m24139h(this.f29826D0, Log.TAG_VIDEO, z);
            m9849E1();
            invalidate();
        }
    }

    public void setNoExpand(boolean z) {
        if (m9837M1(C5063c.m24139h(this.f29826D0, Log.TAG_PAINT, z)) && z) {
            setAvatarAllowanceFactor(0.0f);
        }
    }

    public void setNoStatus(boolean z) {
        this.f29826D0 = C5063c.m24139h(this.f29826D0, Log.TAG_ROUND, z);
    }

    public void setPhotoOpenCallback(AbstractC9242c cVar) {
        this.f29839Q0 = cVar;
    }

    public void setPhotoOpenDisabled(boolean z) {
        this.f29826D0 = C5063c.m24139h(this.f29826D0, 16, z);
    }

    public void setShowLock(boolean z) {
        if (m9837M1(C5063c.m24139h(this.f29826D0, 1, z))) {
            m9845G1();
            invalidate();
        }
    }

    public void setShowMute(boolean z) {
        if (m9837M1(C5063c.m24139h(this.f29826D0, 2, z))) {
            m9845G1();
            invalidate();
        }
    }

    public void setShowVerify(boolean z) {
        if (m9837M1(C5063c.m24139h(this.f29826D0, 4, z))) {
            m9845G1();
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        m9830S1(this.f29849s0, charSequence);
    }

    @Override
    public final void setTextColor(int i) {
        this.f29836N0 = i;
        this.f29837O0 = m9827U1(i);
        invalidate();
    }

    public void setTitle(String str) {
        m9830S1(str, this.f29850t0);
    }

    public void setUseRedHighlight(boolean z) {
        if (m9837M1(C5063c.m24139h(this.f29826D0, Log.TAG_CONTACT, z))) {
            m9845G1();
            invalidate();
        }
    }

    @Override
    public void mo9811t1(Object obj, View$OnClickListenerC7430j1.C7448r rVar) {
        rVar.f23725c = new C9240a();
    }

    public void setAvatar(TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.f29848r0 = chatPhotoInfo;
        this.f29847q0 = null;
        this.f29842l0 = null;
        if (chatPhotoInfo != null) {
            this.f29844n0 = C4779t2.m25703E0(this.f21823b, chatPhotoInfo);
            this.f29845o0 = new C6246h(this.f21823b, chatPhotoInfo.big);
            return;
        }
        this.f29844n0 = null;
        this.f29845o0 = null;
    }

    public void setAvatar(C6246h hVar) {
        this.f29844n0 = hVar;
        this.f29847q0 = null;
        this.f29848r0 = null;
        this.f29842l0 = null;
    }
}
