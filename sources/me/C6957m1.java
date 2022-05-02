package me;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import gd.C4587b;
import gd.C4779t2;
import ge.C4868i;
import ie.RunnableC5390g;
import java.util.Objects;
import me.C6924j2;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3950k;
import p067ed.C4184b;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p111he.AbstractC5131n0;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p193nb.C7316a;
import p335xd.C10192g;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10817l1;
import p350yd.C10721i0;
import p350yd.C10791k1;
import p350yd.C10802kc;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11525k;
import p364zd.C11537v;
import p364zd.C11541z;
import td.AbstractC9323v4;
import td.C9239m;
import td.C9289s;
import td.View$OnClickListenerC9170d1;

public class C6957m1 extends FrameLayoutFix implements C6924j2.AbstractC6928d, C3950k.AbstractC3952b, AbstractC10747j0, AbstractC10817l1, C11059v7.AbstractC11068i, C11059v7.AbstractC11067h, C11059v7.AbstractC11061b, AbstractC11526l, C11059v7.AbstractC11069j, AbstractC5131n0 {
    public static final OvershootInterpolator f21972o0 = new OvershootInterpolator(1.24f);
    public C6963f f21973M;
    public RelativeLayout f21974N;
    public View f21975O;
    public final C11537v f21976P;
    public AbstractC6968k f21977Q;
    public C9239m f21978R;
    public LinearLayout f21979S;
    public C10930q6 f21980T;
    public int f21981U = -1;
    public int f21982V = -1;
    public boolean f21983W;
    public ImageView f21984a0;
    public int f21985b0;
    public float f21986c0;
    public boolean f21987d0;
    public C3950k f21988e0;
    public C6924j2 f21989f0;
    public C6924j2 f21990g0;
    public boolean f21991h0;
    public float f21992i0;
    public boolean f21993j0;
    public int f21994k0;
    public TdApi.User f21995l0;
    public TdApi.Chat f21996m0;
    public long f21997n0;

    public class C6958a extends RelativeLayout {
        public final RectF f21998M;
        public final Path f22000a;
        public int f22001b;
        public int f22002c;

        public C6958a(Context context, RectF rectF) {
            super(context);
            C6957m1.this = r1;
            this.f21998M = rectF;
            this.f22000a = Build.VERSION.SDK_INT >= 19 ? new Path() : null;
        }

        public final void m18346a() {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f22001b != measuredWidth || this.f22002c != measuredHeight) {
                this.f22001b = measuredWidth;
                this.f22002c = measuredHeight;
                this.f21998M.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = this.f22000a;
                if (path != null) {
                    path.reset();
                    this.f22000a.addRoundRect(this.f21998M, C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f), Path.Direction.CW);
                }
            }
        }

        @Override
        public void draw(Canvas canvas) {
            boolean z = !C6957m1.this.f21973M.f22010d;
            int b = z ? C10192g.m5789b(canvas, this.f22000a) : Integer.MIN_VALUE;
            super.draw(canvas);
            if (z) {
                C10192g.m5785f(canvas, b);
            }
            if (this.f22000a == null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), C1410y.m37077D0(C5064d.m24131a(0.2f, C11524j.m217S0())));
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            m18346a();
        }
    }

    public class C6959b extends ViewOutlineProvider {
        public C6959b() {
            C6957m1.this = r1;
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), C1357a0.m37541i(4.0f));
        }
    }

    public class C6960c extends Drawable {
        public final RectF f22004a;

        public C6960c(RectF rectF) {
            C6957m1.this = r1;
            this.f22004a = rectF;
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRoundRect(this.f22004a, C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f), C1410y.m37039g(C11524j.m148w()));
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public class C6961d extends ImageView {
        public C6961d(Context context) {
            super(context);
            C6957m1.this = r1;
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    public interface AbstractC6962e {
        void mo3385B6(C6963f fVar, int i, Object obj);

        void mo3384E3(C6963f fVar, int i, Object obj);
    }

    public static class C6963f {
        public final View f22007a;
        public final View f22008b;
        public boolean f22009c;
        public boolean f22010d;
        public boolean f22011e;
        public boolean f22012f;
        public int f22013g;
        public C4587b f22014h;
        public C6246h f22015i;
        public String f22016j;
        public String f22017k;
        public int f22018l;
        public long f22019m;
        public long f22020n;
        public AbstractC6968k f22021o;
        public C10930q6 f22022p;
        public AbstractC6962e f22023q;
        public AbstractC6964g f22024r;
        public Object f22025s;
        public int[] f22026t;
        public int[] f22027u;
        public String[] f22028v;
        public boolean f22029w;
        public AbstractC9323v4<?> f22030x;

        public C6963f(C10930q6 q6Var, View view, View view2, AbstractC9323v4<?> v4Var) {
            this.f22022p = q6Var;
            this.f22007a = view;
            this.f22008b = view2;
            this.f22021o = view2 instanceof AbstractC6968k ? (AbstractC6968k) view2 : null;
            this.f22030x = v4Var;
        }

        public View m18345A() {
            return this.f22007a;
        }

        public boolean m18344B() {
            int[] iArr = this.f22026t;
            return iArr != null && iArr.length > 0;
        }

        public boolean m18343C() {
            return this.f22010d;
        }

        public boolean m18342D() {
            AbstractC9323v4<?> v4Var;
            return !this.f22009c && ((v4Var = this.f22030x) == null || v4Var.mo9378Ne());
        }

        public C6963f m18341E(boolean z) {
            AbstractC9323v4<?> v4Var;
            this.f22009c = (!C4184b.f14119l || ((v4Var = this.f22030x) != null && v4Var.mo4347s().m14429v1())) && z;
            return this;
        }

        public C6963f m18340F(int i) {
            this.f22013g = i;
            return this;
        }

        public void m18339G(long j, long j2) {
            this.f22010d = true;
            this.f22011e = true;
            this.f22018l = 1;
            this.f22019m = j;
            this.f22020n = j2;
        }

        public void m18338H(long j) {
            this.f22010d = j != 0;
            this.f22011e = true;
            this.f22018l = 2;
            this.f22019m = j;
            this.f22020n = 0L;
        }

        public void m18337I(AbstractC6962e eVar, Object obj, int[] iArr, int[] iArr2, String[] strArr) {
            this.f22023q = eVar;
            if (this.f22025s == null) {
                this.f22025s = obj;
            }
            this.f22026t = iArr;
            this.f22027u = iArr2;
            this.f22028v = strArr;
        }

        public C6963f m18336J(boolean z) {
            this.f22029w = z;
            return this;
        }

        public void m18335K(String str, String str2) {
            this.f22010d = true;
            this.f22016j = str;
            this.f22017k = str2;
        }

        public void m18334L(C6246h hVar, C4587b bVar) {
            this.f22011e = true;
            this.f22015i = hVar;
            this.f22014h = bVar;
        }

        public C6963f m18333M(boolean z) {
            this.f22012f = z;
            return this;
        }

        public C6963f m18332N(AbstractC6964g gVar) {
            this.f22024r = gVar;
            return this;
        }

        public C6963f m18331O(AbstractC6968k kVar) {
            this.f22021o = kVar;
            return this;
        }

        public C6963f m18330P(Object obj) {
            this.f22025s = obj;
            return this;
        }

        public void m18329Q(C10930q6 q6Var) {
            this.f22022p = q6Var;
        }

        public boolean m18307v() {
            return this.f22009c;
        }

        public float m18306w(C6957m1 m1Var) {
            return C1399s0.m37152v(this.f22007a)[0] - C1399s0.m37152v(m1Var)[0];
        }

        public float m18305x(C6957m1 m1Var) {
            return C1399s0.m37152v(this.f22007a)[1] - C1399s0.m37152v(m1Var)[1];
        }

        public AbstractC6964g m18304y() {
            return this.f22024r;
        }

        public int m18303z() {
            if (!m18344B()) {
                return 0;
            }
            int[] iArr = this.f22026t;
            int length = iArr.length;
            int length2 = iArr.length;
            if (length > 1) {
                length2++;
            }
            return length2 * C1357a0.m37541i(48.0f);
        }
    }

    public interface AbstractC6964g {
        boolean mo18302a(C3950k kVar, float f, Object obj);
    }

    public static class C6965h implements C3950k.AbstractC3952b {
        public static final Interpolator f22031R = new OvershootInterpolator(1.28f);
        public final boolean f22032M;
        public final int f22033N;
        public float f22034O;
        public boolean f22035P;
        public C3950k f22036Q;
        public final C6966i f22037a;
        public final View f22038b;
        public final String f22039c;

        public C6965h(C6966i iVar, View view, String str) {
            this.f22037a = iVar;
            this.f22038b = view;
            this.f22039c = str;
            boolean M0 = RunnableC5390g.m22983M0(str);
            this.f22032M = M0;
            this.f22033N = (int) C7389v0.m16680T1(str, C1410y.m37062P(12.0f, M0));
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            m18299c(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public final void m18301a(float f) {
            if (this.f22036Q == null) {
                this.f22036Q = new C3950k(0, this, f22031R, 230L, this.f22034O);
            }
            this.f22036Q.m29544i(f);
        }

        public void m18300b(Canvas canvas) {
            if (this.f22034O != 0.0f) {
                int left = (this.f22038b.getLeft() + this.f22038b.getRight()) >> 1;
                int measuredHeight = this.f22037a.getMeasuredHeight();
                int i = C1357a0.m37541i(8.0f);
                int i2 = C1357a0.m37541i(8.0f);
                int i3 = C1357a0.m37541i(28.0f);
                int i4 = measuredHeight - ((int) ((i2 + i3) * this.f22034O));
                RectF a0 = C1410y.m37050a0();
                int i5 = this.f22033N;
                a0.set((left - (i5 / 2)) - i, i4, (i5 / 2) + left + i, i4 + i3);
                float d = C5069h.m24089d(this.f22034O);
                canvas.drawRoundRect(a0, C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f), C1410y.m37039g(C5064d.m24131a(d, 2080374784)));
                canvas.drawText(this.f22039c, left - (this.f22033N / 2), a0.top + C1357a0.m37541i(18.0f), C1410y.m37063O(12.0f, C5064d.m24131a(d, -1), this.f22032M));
            }
        }

        public final void m18299c(float f) {
            if (this.f22034O != f) {
                this.f22034O = f;
                this.f22037a.invalidate();
            }
        }

        public void m18298d(boolean z) {
            if (this.f22035P != z) {
                this.f22035P = z;
                m18301a(z ? 1.0f : 0.0f);
                if (z) {
                    C1379j0.m37321k(this.f22038b, false);
                }
            }
        }
    }

    public static class C6966i extends View {
        public C6965h[] f22040a;

        public C6966i(Context context) {
            super(context);
        }

        public void m18297a(C6965h[] hVarArr) {
            this.f22040a = hVarArr;
        }

        @Override
        public void onDraw(Canvas canvas) {
            C6965h[] hVarArr = this.f22040a;
            if (hVarArr != null) {
                for (C6965h hVar : hVarArr) {
                    hVar.m18300b(canvas);
                }
            }
        }
    }

    public interface AbstractC6967j {
        void mo18296v2(C6963f fVar);
    }

    public interface AbstractC6968k {
        void mo9253g4(C6963f fVar);

        void mo9213m6(C6963f fVar);

        void mo9198o1(C6963f fVar);

        void mo9171s6(C6963f fVar);
    }

    public C6957m1(Context context) {
        super(context);
        C11537v vVar = new C11537v();
        this.f21976P = vVar;
        setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        View view = new View(context);
        this.f21975O = view;
        addView(view);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 17);
        RectF rectF = new RectF();
        C6958a aVar = new C6958a(context, rectF);
        this.f21974N = aVar;
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setOutlineProvider(new C6959b());
            this.f21974N.setElevation(C1357a0.m37541i(1.0f));
            this.f21974N.setTranslationZ(C1357a0.m37541i(1.0f));
        }
        C2065g.m35718d(this.f21974N, new C6960c(rectF));
        this.f21974N.setLayoutParams(t1);
        addView(this.f21974N);
        vVar.m74f(this.f21974N);
    }

    private void setActionView(ImageView imageView) {
        ImageView imageView2 = this.f21984a0;
        if (imageView2 != imageView) {
            int i = 0;
            if (imageView2 != null) {
                ((C6965h) imageView2.getTag()).m18298d(false);
            }
            this.f21984a0 = imageView;
            if (imageView != null) {
                i = imageView.getId();
            }
            this.f21985b0 = i;
            if (imageView != null) {
                ((C6965h) imageView.getTag()).m18298d(true);
            }
        }
    }

    private void setHeaderUser(TdApi.User user) {
        this.f21978R.setShowVerify(user.isVerified);
        this.f21978R.m9831S1(C4779t2.m25437r2(user), this.f21980T.m2166xc().m3291r(user.f25439id, user, false));
        m18355U1();
    }

    private void setRevealFactor(float f) {
        if (this.f21986c0 != f) {
            this.f21986c0 = f;
            float f2 = (0.3f * f) + 0.7f;
            this.f21974N.setScaleX(f2);
            this.f21974N.setScaleY(f2);
            if (this.f21991h0) {
                float f3 = this.f21992i0;
                float d = C5069h.m24089d(this.f21992i0 * (1.0f - C5069h.m24089d((f - f3) / (1.3f - f3))));
                this.f21974N.setAlpha(d);
                this.f21975O.setAlpha(d);
                return;
            }
            float d2 = C5069h.m24089d(f);
            this.f21974N.setAlpha(d2);
            this.f21975O.setAlpha(d2);
        }
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public void mo3249D2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        m18354V1();
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    @Override
    public void mo3248E5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        C10791k1.m3309b(this, notificationSettingsScope);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    public final void m18364I1(TdApi.Chat chat, long j, boolean z) {
        if (z) {
            this.f21980T.m2781K9().m1870d0(chat.f25367id, this);
            this.f21980T.m2781K9().m1846j0(chat.f25367id, this);
            this.f21978R.m9827W0(chat.f25367id, j);
        } else {
            this.f21980T.m2781K9().m1818q0(chat.f25367id, this);
            this.f21980T.m2781K9().m1794w0(chat.f25367id, this);
            this.f21978R.m9842J1();
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (z) {
                    this.f21980T.m2480e2().m1654d2(C7316a.m17045p(chat.f25367id), this);
                    return;
                } else {
                    this.f21980T.m2480e2().m1603q2(C7316a.m17045p(chat.f25367id), this);
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                if (z) {
                    this.f21980T.m2480e2().m1646f2(C4779t2.m25458o2(chat.type), this);
                    return;
                } else {
                    this.f21980T.m2480e2().m1595s2(C4779t2.m25458o2(chat.type), this);
                    return;
                }
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                if (z) {
                    this.f21980T.m2480e2().m1662b2(C7316a.m17048m(chat.f25367id), this);
                    return;
                } else {
                    this.f21980T.m2480e2().m1611o2(C7316a.m17048m(chat.f25367id), this);
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void mo11176I2(C6924j2 j2Var) {
        this.f21989f0 = j2Var;
        AbstractC6968k kVar = this.f21977Q;
        if (kVar != null) {
            kVar.mo9253g4(this.f21973M);
        }
        if (Build.VERSION.SDK_INT >= 21 && this.f21973M.f22012f) {
            this.f21988e0.m29553F(68L);
        }
        this.f21988e0.m29544i(1.0f);
    }

    public final void m18363J1(TdApi.User user, boolean z) {
        if (z) {
            this.f21980T.m2480e2().m1646f2(user.f25439id, this);
        } else {
            this.f21980T.m2480e2().m1595s2(user.f25439id, this);
        }
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        int i = this.f21994k0;
        if (i == 1 || i == 2) {
            m18353W1();
        }
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        C11525k.m138c(this, i, i2, f, z);
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo4071L0(long j, int i) {
        this.f21980T.m2485dd().post(new RunnableC6949l1(this));
    }

    public final ImageView m18362L1(int i, int i2) {
        int bottom = this.f21974N.getBottom();
        if (i2 <= bottom && i2 >= bottom - C1357a0.m37541i(48.0f) && this.f21979S != null) {
            int left = i - this.f21974N.getLeft();
            if (this.f21973M.m18344B()) {
                left -= this.f21979S.getLeft();
            }
            int childCount = this.f21979S.getChildCount();
            int i3 = 1;
            if (this.f21973M.f22026t.length == 1) {
                i3 = 0;
            }
            for (int i4 = i3; i4 < childCount - i3; i4++) {
                View childAt = this.f21979S.getChildAt(i4);
                if (childAt != null && left >= childAt.getLeft() && left <= childAt.getRight()) {
                    return (ImageView) childAt;
                }
            }
        }
        return null;
    }

    public int m18361M1(float f) {
        C6963f fVar = this.f21973M;
        if (fVar == null || !fVar.m18344B() || this.f21979S == null) {
            return 0;
        }
        float x = f + this.f21973M.m18305x(this);
        float bottom = (this.f21974N.getBottom() - C1357a0.m37541i(48.0f)) - C1357a0.m37541i(48.0f);
        if (x > bottom) {
            return (int) (x - bottom);
        }
        return 0;
    }

    public void m18360N1(C6963f fVar) {
        ?? r2;
        ImageView imageView;
        View view;
        RelativeLayout.LayoutParams layoutParams;
        this.f21980T = fVar.f22022p;
        this.f21973M = fVar;
        this.f21977Q = fVar.f22021o;
        if (fVar.f22013g != 0) {
            this.f21975O.setBackgroundColor(fVar.f22013g);
        } else {
            C10192g.m5781j(this.f21975O, R.id.theme_color_previewBackground);
            this.f21976P.m74f(this.f21975O);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f21974N.getLayoutParams();
        if (!fVar.f22012f) {
            int i = C1357a0.m37541i(16.0f);
            layoutParams2.rightMargin = i;
            layoutParams2.leftMargin = i;
            int topOffset = View$OnClickListenerC9170d1.getTopOffset() + C1357a0.m37541i(12.0f);
            layoutParams2.bottomMargin = topOffset;
            layoutParams2.topMargin = topOffset;
        } else if (C4184b.f14118k) {
            int i2 = C1357a0.m37541i(16.0f);
            layoutParams2.rightMargin = i2;
            layoutParams2.leftMargin = i2;
            layoutParams2.topMargin = View$OnClickListenerC9170d1.getTopOffset() + C1357a0.m37541i(20.0f);
            layoutParams2.bottomMargin = View$OnClickListenerC9170d1.getTopOffset() + C1357a0.m37541i(16.0f);
        } else {
            int i3 = C1357a0.m37541i(26.0f);
            layoutParams2.rightMargin = i3;
            layoutParams2.leftMargin = i3;
            int topOffset2 = View$OnClickListenerC9170d1.getTopOffset() + C1357a0.m37541i(20.0f);
            layoutParams2.bottomMargin = topOffset2;
            layoutParams2.topMargin = topOffset2;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        fVar.f22008b.setId(R.id.forceTouch_content);
        fVar.f22008b.setLayoutParams(layoutParams3);
        this.f21974N.addView(fVar.f22008b);
        if (fVar.m18343C()) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, C1357a0.m37541i(56.0f));
            layoutParams4.addRule(5, R.id.forceTouch_content);
            layoutParams4.addRule(7, R.id.forceTouch_content);
            layoutParams3.addRule(3, R.id.forceTouch_header);
            if (fVar.f22011e) {
                C9239m mVar = new C9239m(getContext(), this.f21980T, null);
                this.f21978R = mVar;
                mVar.setId(R.id.forceTouch_header);
                this.f21978R.m9835O1();
                this.f21978R.m9833Q1(C1357a0.m37541i(8.0f), C1357a0.m37541i(8.0f));
                this.f21978R.m9830T1(C11524j.m217S0(), C11524j.m213U0());
                if (fVar.f22018l != 1 || fVar.f22019m == 0) {
                    layoutParams = layoutParams4;
                    if (fVar.f22018l != 2 || fVar.f22019m == 0) {
                        if (fVar.f22015i != null) {
                            this.f21978R.setAvatar(fVar.f22015i);
                        } else {
                            this.f21978R.setAvatarPlaceholder(fVar.f22014h);
                        }
                        this.f21978R.m9831S1(fVar.f22016j, fVar.f22017k);
                    } else {
                        m18348a2((int) fVar.f22019m, this.f21978R);
                    }
                } else {
                    layoutParams = layoutParams4;
                    m18349Z1(fVar.f22019m, fVar.f22020n, this.f21978R);
                }
                this.f21978R.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.f21974N;
                View view2 = this.f21978R;
                relativeLayout.addView(view2);
                view = view2;
            } else {
                C9289s sVar = new C9289s(getContext());
                sVar.setId(R.id.forceTouch_header);
                sVar.setTitle(fVar.f22016j);
                sVar.setSubtitle(fVar.f22017k);
                sVar.m9631E1(C11524j.m217S0(), C11524j.m213U0());
                sVar.setLayoutParams(layoutParams4);
                this.f21974N.addView(sVar);
                view = sVar;
            }
            this.f21976P.m76d(view, R.id.theme_color_text, R.id.theme_color_textLight);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, C1357a0.m37541i(7.0f));
            layoutParams5.addRule(5, R.id.forceTouch_content);
            layoutParams5.addRule(7, R.id.forceTouch_content);
            layoutParams5.addRule(6, R.id.forceTouch_content);
            C6879f3 f3Var = new C6879f3(getContext());
            r2 = 1;
            f3Var.setSimpleBottomTransparentShadow(true);
            f3Var.setLayoutParams(layoutParams5);
            this.f21974N.addView(f3Var);
            this.f21976P.m74f(f3Var);
        } else {
            r2 = 1;
        }
        if (fVar.m18344B()) {
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(0, C1357a0.m37541i(48.0f));
            layoutParams6.addRule(5, R.id.forceTouch_content);
            layoutParams6.addRule(7, R.id.forceTouch_content);
            layoutParams6.addRule(3, R.id.forceTouch_content);
            layoutParams6.addRule(14);
            if (fVar.f22012f) {
                int i4 = layoutParams6.height;
                layoutParams3.bottomMargin = i4;
                layoutParams6.topMargin = -i4;
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f21979S = linearLayout;
            linearLayout.setId(R.id.forceTouch_footer);
            this.f21979S.setOrientation(0);
            LinearLayout linearLayout2 = this.f21979S;
            int i5 = r2 == true ? 1 : 0;
            int i6 = r2 == true ? 1 : 0;
            linearLayout2.setGravity(i5);
            this.f21979S.setLayoutParams(layoutParams6);
            if (fVar.f22026t.length > r2) {
                View view3 = new View(getContext());
                view3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                this.f21979S.addView(view3);
            }
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, C1357a0.m37541i(48.0f));
            layoutParams7.addRule(2, R.id.forceTouch_footer);
            layoutParams7.addRule(5, R.id.forceTouch_footer);
            layoutParams7.addRule(7, R.id.forceTouch_footer);
            if (fVar.f22012f) {
                layoutParams7.bottomMargin = layoutParams3.bottomMargin;
            }
            C6966i iVar = new C6966i(getContext());
            iVar.setLayoutParams(layoutParams7);
            C6965h[] hVarArr = new C6965h[fVar.f22026t.length];
            boolean G2 = C4403w.m27984G2();
            for (int length = fVar.f22026t.length; length > 0; length--) {
                int length2 = G2 ? length - 1 : fVar.f22026t.length - length;
                int i7 = fVar.f22026t[length2];
                if (C1362c.m37477l(fVar.f22027u[length2])) {
                    imageView = new C6961d(getContext());
                } else {
                    imageView = new ImageView(getContext());
                }
                imageView.setId(i7);
                C6965h hVar = new C6965h(iVar, imageView, fVar.f22028v[length2]);
                hVarArr[length2] = hVar;
                imageView.setTag(hVar);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(C11524j.m159q0());
                this.f21976P.m75e(imageView, R.id.theme_color_icon);
                imageView.setImageResource(fVar.f22027u[length2]);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
                this.f21979S.addView(imageView);
            }
            iVar.m18297a(hVarArr);
            if (fVar.f22028v.length > r2) {
                View view4 = new View(getContext());
                view4.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                this.f21979S.addView(view4);
            }
            this.f21974N.addView(this.f21979S);
            this.f21974N.addView(iVar);
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, C1357a0.m37541i(6.0f));
            layoutParams8.addRule(5, R.id.forceTouch_content);
            layoutParams8.addRule(7, R.id.forceTouch_content);
            layoutParams8.addRule(8, R.id.forceTouch_content);
            C6879f3 f3Var2 = new C6879f3(getContext());
            f3Var2.setSimpleTopShadow(r2);
            f3Var2.setLayoutParams(layoutParams8);
            this.f21974N.addView(f3Var2);
            this.f21976P.m74f(f3Var2);
        }
        this.f21986c0 = 1.0f;
        setRevealFactor(0.0f);
        if (fVar.f22030x != null) {
            fVar.f22030x.m9468Bd(this);
        }
        C11541z.m7t().m23f(this);
    }

    public boolean m18359O1() {
        C3950k kVar = this.f21988e0;
        return kVar == null || kVar.m29531v();
    }

    @Override
    public void mo1348P1(TdApi.User user) {
        if (this.f21994k0 == 2) {
            setHeaderUser(user);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setRevealFactor(f);
        }
    }

    public final void m18358Q1(boolean z) {
        if (this.f21985b0 != 0 && this.f21973M.f22023q != null) {
            if (z) {
                AbstractC6962e eVar = this.f21973M.f22023q;
                C6963f fVar = this.f21973M;
                eVar.mo3385B6(fVar, this.f21985b0, fVar.f22025s);
                return;
            }
            AbstractC6962e eVar2 = this.f21973M.f22023q;
            C6963f fVar2 = this.f21973M;
            eVar2.mo3384E3(fVar2, this.f21985b0, fVar2.f22025s);
        }
    }

    @Override
    public void mo4070R1(long j, boolean z) {
    }

    public void m18357S1(float f, float f2, float f3, float f4) {
        C6963f fVar = this.f21973M;
        if (fVar != null) {
            if (!(fVar.f22024r == null || this.f21973M.f22030x == null)) {
                this.f21973M.f22030x.m9318Wb(f2, f4);
            }
            if (this.f21973M.m18344B()) {
                m18351Y1((int) (f + this.f21973M.m18306w(this)), (int) (f2 + this.f21973M.m18305x(this)));
            }
        }
    }

    public final void m18356T1() {
        TdApi.Chat chat = this.f21996m0;
        if (chat != null) {
            m18364I1(chat, this.f21997n0, false);
            this.f21996m0 = null;
        }
        TdApi.User user = this.f21995l0;
        if (user != null) {
            m18363J1(user, false);
            this.f21995l0 = null;
        }
    }

    public final void m18355U1() {
        TdApi.User user;
        if (!this.f21987d0) {
            int i = this.f21994k0;
            if (i == 1) {
                TdApi.Chat chat = this.f21996m0;
                if (chat != null) {
                    if (!this.f21980T.m2443g7(chat.f25367id)) {
                        TdApi.Chat chat2 = this.f21996m0;
                        if (chat2.photo != null) {
                            this.f21978R.setAvatar(C4779t2.m25709D0(this.f21980T, chat2));
                            return;
                        }
                    }
                    this.f21978R.setAvatarPlaceholder(this.f21980T.m2947A3(this.f21996m0, true, C9239m.getBaseAvatarRadiusDp(), null));
                }
            } else if (i != 2 || (user = this.f21995l0) == null) {
            } else {
                if (user.profilePhoto != null) {
                    this.f21978R.setAvatar(C4779t2.m25688G0(this.f21980T, user));
                } else {
                    this.f21978R.setAvatarPlaceholder(this.f21980T.m2480e2().m1709N2(this.f21995l0, false, C9239m.getBaseAvatarRadiusDp(), null));
                }
            }
        }
    }

    public final void m18354V1() {
        TdApi.Chat chat;
        if (!C1379j0.m37357K()) {
            this.f21980T.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C6957m1.this.m18354V1();
                }
            });
        } else if (!this.f21987d0 && (chat = this.f21996m0) != null) {
            this.f21978R.setShowMute(this.f21980T.m2255s3(chat.f25367id));
        }
    }

    @Override
    public void mo4069V5(long j, long j2, int i, boolean z) {
        C10721i0.m4180q(this, j, j2, i, z);
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public boolean mo136W0() {
        return true;
    }

    public final void m18353W1() {
        if (!this.f21987d0) {
            if (this.f21996m0 != null) {
                this.f21978R.setSubtitle(this.f21980T.m2166xc().m3295n(this.f21996m0));
            }
            if (this.f21995l0 != null) {
                C9239m mVar = this.f21978R;
                C10802kc xc = this.f21980T.m2166xc();
                TdApi.User user = this.f21995l0;
                mVar.setSubtitle(xc.m3291r(user.f25439id, user, false));
            }
        }
    }

    @Override
    public void mo1566W2(TdApi.BasicGroup basicGroup, boolean z) {
        this.f21980T.m2485dd().post(new RunnableC6949l1(this));
    }

    public final void m18352X1() {
        TdApi.Chat chat;
        if (!this.f21987d0 && (chat = this.f21996m0) != null) {
            this.f21978R.setTitle(this.f21980T.m2661S3(chat));
        }
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            if (f == 0.0f || f == 1.3f) {
                m18350Z();
                C6924j2 j2Var = this.f21990g0;
                if (j2Var != null) {
                    j2Var.m18441G2();
                }
                m18358Q1(true);
            } else if (f == 1.0f) {
                AbstractC6968k kVar2 = this.f21977Q;
                if (kVar2 != null) {
                    kVar2.mo9198o1(this.f21973M);
                }
                C6924j2 j2Var2 = this.f21989f0;
                if (j2Var2 != null) {
                    j2Var2.mo18440H2();
                }
            }
        }
    }

    public final void m18351Y1(int i, int i2) {
        int i3 = this.f21981U;
        if (i3 == -1 && this.f21982V == -1) {
            this.f21981U = i;
            this.f21982V = i2;
        } else if (this.f21983W || Math.max(Math.abs(i - i3), Math.abs(i2 - this.f21982V)) >= C1357a0.m37534p()) {
            this.f21983W = true;
            this.f21981U = i;
            this.f21982V = i2;
            setActionView(m18362L1(i, i2));
        }
    }

    public final void m18350Z() {
        this.f21987d0 = true;
        if (this.f21973M.f22008b instanceof AbstractC5911c) {
            ((AbstractC5911c) this.f21973M.f22008b).mo4501a3();
        }
        C9239m mVar = this.f21978R;
        if (mVar != null) {
            mVar.mo4501a3();
        }
        AbstractC6968k kVar = this.f21977Q;
        if (kVar != null) {
            kVar.mo9213m6(this.f21973M);
        }
        m18356T1();
        C11541z.m7t().m42S(this);
    }

    public final void m18349Z1(long j, long j2, C9239m mVar) {
        TdApi.Chat U2 = this.f21980T.m2632U2(j);
        Objects.requireNonNull(U2);
        this.f21994k0 = 1;
        this.f21996m0 = U2;
        this.f21997n0 = j2;
        m18364I1(U2, j2, true);
        mVar.setShowLock(C7316a.m17051j(j));
        mVar.setShowVerify(this.f21980T.m2430h4(U2));
        mVar.setShowMute(this.f21980T.m2255s3(U2.f25367id));
        mVar.m9831S1(this.f21980T.m2661S3(U2), this.f21980T.m2166xc().m3295n(U2));
        m18355U1();
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    public final void m18348a2(int i, C9239m mVar) {
        TdApi.User v2 = this.f21980T.m2480e2().m1583v2(i);
        Objects.requireNonNull(v2);
        this.f21994k0 = 2;
        this.f21995l0 = v2;
        m18363J1(v2, true);
        setHeaderUser(v2);
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        C11525k.m139b(this, pVar, pVar2);
    }

    @Override
    public boolean mo18347c1() {
        C6963f fVar = this.f21973M;
        if (fVar == null) {
            return false;
        }
        if (fVar.f22030x != null) {
            return this.f21973M.f22030x.mo9350Rd();
        }
        if (this.f21973M.f22008b instanceof AbstractC5131n0) {
            return ((AbstractC5131n0) this.f21973M.f22008b).mo18347c1();
        }
        return false;
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.f21980T.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C6957m1.this.m18355U1();
            }
        });
    }

    @Override
    public void mo11142d0() {
        if (C4184b.f14117j || C4868i.m24726c2().m24826O2()) {
            this.f21988e0 = new C3950k(0, this, new DecelerateInterpolator(1.46f), 140L);
        } else {
            this.f21988e0 = new C3950k(0, this, f21972o0, 260L);
        }
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    @Override
    public void mo1556h0(long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f21980T.m2485dd().post(new RunnableC6949l1(this));
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    @Override
    public void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f21980T.m2485dd().post(new RunnableC6949l1(this));
    }

    @Override
    public void mo4061i5(long j, String str) {
        this.f21980T.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C6957m1.this.m18352X1();
            }
        });
    }

    @Override
    public void mo3247l4(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        m18354V1();
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        this.f21976P.m66n(z);
    }

    @Override
    public void mo133q0(int i) {
        C11525k.m140a(this, i);
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public void mo4058s2(long j, boolean z) {
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    public void setBeforeMaximizeFactor(float f) {
        if (this.f21986c0 >= 1.0f) {
            setRevealFactor((f * 0.1f) + 1.0f);
            C3950k kVar = this.f21988e0;
            if (kVar != null) {
                kVar.m29541l(this.f21986c0);
            }
        }
    }

    @Override
    public void mo1555t0(TdApi.Supergroup supergroup) {
        this.f21980T.m2485dd().post(new RunnableC6949l1(this));
    }

    @Override
    public void mo4056t7(long j, TdApi.ChatPermissions chatPermissions) {
        C10721i0.m4183n(this, j, chatPermissions);
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public boolean mo11108w2(C6924j2 j2Var, C3950k kVar) {
        C6963f fVar = this.f21973M;
        if (!(fVar == null || fVar.f22030x == null || !this.f21973M.f22030x.m9370Oe())) {
            this.f21993j0 = true;
        }
        AbstractC6968k kVar2 = this.f21977Q;
        if (kVar2 != null) {
            kVar2.mo9171s6(this.f21973M);
        }
        this.f21990g0 = j2Var;
        if (this.f21993j0 || (this.f21985b0 == R.id.maximize && this.f21986c0 >= 0.8f)) {
            this.f21988e0.m29553F(40L);
            this.f21988e0.m29528y(140L);
            this.f21992i0 = this.f21986c0;
            this.f21991h0 = true;
            this.f21988e0.m29557B(C2057b.f7280b);
            if (this.f21973M.f22024r != null && this.f21973M.f22024r.mo18302a(this.f21988e0, 1.3f, this.f21973M.f22025s)) {
                return true;
            }
            this.f21988e0.m29544i(1.3f);
        } else {
            this.f21988e0.m29553F(0L);
            this.f21988e0.m29544i(0.0f);
            m18358Q1(false);
        }
        return true;
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    @Override
    public void mo3246x1(long j) {
        C10791k1.m3310a(this, j);
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }

    @Override
    public void mo3245z0() {
        C10791k1.m3308c(this);
    }
}
