package org.thunderdog.challegram;

import ad.AbstractView$OnClickListenerC0259c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1405v;
import be.C1406w;
import be.C1408x;
import cd.C2088d;
import cd.C2099j;
import cd.C2104l;
import cd.View$OnClickListenerC2096i;
import de.View$OnClickListenerC4045k;
import gd.AbstractC4718o;
import ge.C4858a;
import ge.C4862d;
import ge.C4868i;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6864e;
import me.C6924j2;
import me.C6957m1;
import me.C7020s0;
import me.RunnableC7091z1;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import nc.View$OnClickListenerC7354e;
import nl.dionsegijn.konfetti.KonfettiView;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p037cb.C2057b;
import p038ce.C2536ii;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.View$OnClickListenerC3147u9;
import p038ce.s30;
import p051db.C3950k;
import p067ed.C4183a;
import p067ed.C4184b;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5064d;
import p111he.AbstractC5096a;
import p111he.C5120j;
import p139jb.AbstractC5915g;
import p139jb.AbstractC5917i;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6038h;
import p154kb.C6227d;
import p154kb.C6235i;
import p194nd.View$OnClickListenerC7430j1;
import p252rb.AbstractC8418b;
import p252rb.C8422c;
import p291uc.View$OnClickListenerC9694y;
import p292ud.C9746h0;
import p292ud.C9773p0;
import p292ud.C9781q0;
import p292ud.C9789y;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p363zc.C11477a0;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11537v;
import p364zd.C11541z;
import sc.View$OnClickListenerC8851y1;
import tc.C9135a;
import td.AbstractC9142a;
import td.AbstractC9323v4;
import td.C9145a2;
import td.C9179e1;
import td.C9207i1;
import td.C9270q1;
import td.C9319v1;
import td.C9356x1;
import td.C9357x2;
import td.GestureDetector$OnGestureListenerC9285r1;
import td.View$OnClickListenerC9170d1;
import td.View$OnClickListenerC9218k0;

public abstract class AbstractView$OnTouchListenerC7889a extends ComponentActivity implements View.OnTouchListener, C3950k.AbstractC3952b, C1408x.AbstractC1409a, AbstractC11526l, SensorEventListener, C9773p0.AbstractC9777d, C11052v1.AbstractC11053a, C4403w.AbstractC4404a, Handler.Callback {
    public IntentFilter f25484A0;
    public boolean f25485A1;
    public boolean f25487B1;
    public SensorManager f25489C1;
    public boolean f25490D0;
    public Sensor f25491D1;
    public boolean f25492E0;
    public boolean f25493E1;
    public boolean f25494F0;
    public boolean f25496G0;
    public float f25497G1;
    public int f25498H0;
    public boolean f25499H1;
    public boolean f25500I0;
    public Handler f25501I1;
    public C2536ii f25502J0;
    public boolean f25503J1;
    public C2536ii f25504K0;
    public boolean f25505K1;
    public int f25507L1;
    public AbstractRunnableC5910b f25508M0;
    public int f25509M1;
    public C9357x2 f25510N0;
    public List<AbstractC9323v4<?>> f25511N1;
    public boolean f25512O0;
    public C7020s0 f25513O1;
    public boolean f25514P0;
    public KonfettiView f25515P1;
    public AbstractC7901l f25516Q0;
    public C9135a f25517R0;
    public ValueAnimator f25518S0;
    public float f25519T0;
    public Handler f25520U;
    public AbstractRunnableC5910b f25521U0;
    public C6864e f25522V;
    public C9179e1 f25524W;
    public C6924j2 f25525W0;
    public C9270q1 f25526X;
    public C2088d f25527X0;
    public GestureDetector$OnGestureListenerC9285r1 f25528Y;
    public C2099j f25529Y0;
    public View$OnClickListenerC9218k0 f25530Z;
    public C6924j2 f25531Z0;
    public C9356x1 f25532a0;
    public C6957m1 f25533a1;
    public C1406w f25534b0;
    public View$OnClickListenerC9694y f25535b1;
    public int f25538d0;
    public C9145a2 f25539d1;
    public boolean f25540e0;
    public View f25542f0;
    public AbstractC5096a f25543f1;
    public AbstractC5096a f25545g1;
    public C9746h0 f25546h0;
    public C9789y f25548i0;
    public C5120j f25550j0;
    public float f25551j1;
    public C10930q6 f25552k0;
    public boolean f25553k1;
    public View f25554l0;
    public AbstractC9323v4.C9334k f25555l1;
    public AbstractRunnableC5910b f25556m0;
    public C3950k f25557m1;
    public List<Reference<View>> f25558n0;
    public View$OnClickListenerC4045k f25559n1;
    public boolean f25561o1;
    public RunnableC7091z1 f25562p0;
    public boolean f25563p1;
    public int f25564q0;
    public boolean f25565q1;
    public int f25567r1;
    public boolean f25568s0;
    public float f25570t0;
    public boolean f25571t1;
    public int f25572u0;
    public boolean f25573u1;
    public List<AbstractC9323v4<?>> f25574v0;
    public boolean f25575v1;
    public List<AbstractC9323v4<?>> f25576w0;
    public boolean f25578x0;
    public boolean f25580y0;
    public AbstractC5915g f25581y1;
    public float f25583z1;
    public final C6227d<AbstractC7897h> f25536c0 = new C6227d<>();
    public int f25544g0 = -1;
    public final C6227d<AbstractC7898i> f25560o0 = new C6227d<>();
    public int f25566r0 = 0;
    public final C6227d<AbstractC7902m> f25582z0 = new C6227d<>(true);
    public BroadcastReceiver f25486B0 = new C7891b();
    public int f25488C0 = 0;
    public final ArrayList<AbstractC7900k> f25506L0 = new ArrayList<>();
    public final ArrayList<C9356x1> f25523V0 = new ArrayList<>();
    public final ArrayList<C6924j2> f25537c1 = new ArrayList<>();
    public final C6038h<C6924j2> f25541e1 = new C6038h<>();
    public final C6038h<AbstractC9142a> f25547h1 = new C6038h<>();
    public final C6038h<AbstractC5096a> f25549i1 = new C6038h<>();
    public final DisplayMetrics f25569s1 = new DisplayMetrics();
    public final C11537v f25577w1 = new C11537v();
    public final ArrayList<C11537v> f25579x1 = new ArrayList<>();
    public final C6227d<AbstractC7899j> f25495F1 = new C6227d<>();

    public class C7890a extends AbstractRunnableC5910b {
        public C7890a() {
        }

        @Override
        public void mo1364b() {
            if (AbstractView$OnTouchListenerC7889a.this.f25542f0 != null) {
                AbstractView$OnTouchListenerC7889a.this.f25542f0.setEnabled(true);
            }
        }
    }

    public class C7891b extends BroadcastReceiver {
        public C7891b() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.TIMEZONE_CHANGED".equals(action) || "android.intent.action.TIME_SET".equals(action)) {
                    C4868i.m24727c2().m24900E(true);
                }
            }
        }
    }

    public class C7892c extends AbstractRunnableC5910b {
        public C7892c() {
        }

        @Override
        public void mo1364b() {
            if (AbstractView$OnTouchListenerC7889a.this.f25508M0 == this) {
                AbstractView$OnTouchListenerC7889a.this.f25508M0 = null;
                AbstractView$OnTouchListenerC7889a.this.f25526X.m9708m0();
            }
        }
    }

    public class C7893d implements C3950k.AbstractC3952b {
        public final C2536ii f25587a;

        public C7893d(C2536ii iiVar) {
            this.f25587a = iiVar;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            this.f25587a.get().setAlpha(1.0f - f);
            AbstractView$OnTouchListenerC7889a.this.m14574J3();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            AbstractView$OnTouchListenerC7889a.this.f25522V.removeView(this.f25587a.get());
            this.f25587a.mo417Z8();
            if (AbstractView$OnTouchListenerC7889a.this.f25504K0 == this.f25587a) {
                AbstractView$OnTouchListenerC7889a.this.f25504K0 = null;
            }
            AbstractView$OnTouchListenerC7889a.this.m14574J3();
        }
    }

    public class C7894e extends AnimatorListenerAdapter {
        public final boolean f25589a;

        public C7894e(boolean z) {
            this.f25589a = z;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractView$OnTouchListenerC7889a.this.f25514P0 = false;
            AbstractView$OnTouchListenerC7889a.this.f25518S0 = null;
            if (Build.VERSION.SDK_INT >= 21 && this.f25589a && AbstractView$OnTouchListenerC7889a.this.f25517R0 != null && AbstractView$OnTouchListenerC7889a.this.f25517R0.getProgress() != null) {
                AbstractView$OnTouchListenerC7889a.this.f25517R0.getProgress().setVisibility(8);
                AbstractView$OnTouchListenerC7889a.this.f25517R0.getProgress().setVisibility(0);
            }
        }
    }

    public class C7895f extends AnimatorListenerAdapter {
        public C7895f() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AbstractView$OnTouchListenerC7889a.this.f25514P0 = false;
            AbstractView$OnTouchListenerC7889a.this.m14417x2();
            AbstractView$OnTouchListenerC7889a aVar = AbstractView$OnTouchListenerC7889a.this;
            aVar.f25524W.removeView(aVar.f25517R0);
        }
    }

    public class C7896g extends AbstractRunnableC5910b {
        public final String f25592M;
        public final AbstractC7901l f25593N;

        public C7896g(String str, AbstractC7901l lVar) {
            this.f25592M = str;
            this.f25593N = lVar;
        }

        @Override
        public void mo1364b() {
            AbstractView$OnTouchListenerC7889a.this.m14608C3(this.f25592M, this.f25593N);
        }
    }

    public interface AbstractC7897h {
        void mo6938O0(int i, boolean z);

        void mo6929S4();

        void mo6904d6();

        void mo6871o6();
    }

    public interface AbstractC7898i {
        boolean onKeyDown(int i, KeyEvent keyEvent);

        boolean onKeyUp(int i, KeyEvent keyEvent);
    }

    public interface AbstractC7899j {
        void mo14405a(float f);
    }

    public interface AbstractC7900k {
        void mo7703f(AbstractView$OnTouchListenerC7889a aVar, boolean z);
    }

    public interface AbstractC7901l {
        void mo14404a();
    }

    public interface AbstractC7902m {
        void mo14403U(AbstractView$OnTouchListenerC7889a aVar, int i, int i2);
    }

    public static void m14615B1(View view) {
        C4868i.m24727c2().m24716d5(C4403w.m27862k2(), !C4403w.m27986G2());
    }

    public void m14610C1(ValueAnimator valueAnimator) {
        m14455o3(1.0f - C2057b.m35738a(valueAnimator));
    }

    public void m14605D1(AbstractC9323v4.C9334k kVar, boolean z) {
        if (z) {
            m14504c2(kVar);
        }
    }

    public void m14600E1() {
        this.f25524W.m10016D1(this.f25557m1, 0.0f);
        this.f25522V.addView(this.f25524W, 1);
    }

    public void m14595F1() {
        this.f25557m1.m29546i(1.0f);
    }

    public static String m14593F3(int i) {
        if (i == 0) {
            return "unspecified";
        }
        if (i == 1) {
            return "no";
        }
        if (i == 2) {
            return "yes";
        }
        throw new IllegalArgumentException("mode == " + i);
    }

    public boolean m14581I1(Message message) {
        if (m14513a0()) {
            boolean z = message.what == 1;
            this.f25505K1 = z;
            C11541z.m7t().m30b0(z, true);
        } else {
            m14462n0();
        }
        return true;
    }

    public static int m14577J0() {
        return Build.VERSION.SDK_INT >= 18 ? 12 : 1;
    }

    public void m14576J1(ValueAnimator valueAnimator) {
        m14455o3(C2057b.m35738a(valueAnimator));
    }

    public void m14571K1(C9357x2 x2Var, boolean z) {
        if (!z) {
            removeFromRoot(this.f25510N0);
        } else if (this.f25510N0.getParent() == null) {
            m14517Z(this.f25510N0, true);
        }
    }

    public static AlertDialog m14555O1(Context context, AlertDialog alertDialog, AbstractC11531p pVar) {
        Drawable background;
        if (pVar == null) {
            pVar = C11541z.m7t().m19j(false);
        }
        int e = pVar.mo92e(R.id.theme_color_text);
        View findViewById = alertDialog.findViewById(16908310);
        C1399s0.m37213K(findViewById);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(e);
        }
        View findViewById2 = alertDialog.findViewById(16908299);
        if (findViewById2 instanceof TextView) {
            ((TextView) findViewById2).setTextColor(e);
        }
        View x0 = C1399s0.m37150x0(context, alertDialog, "alertTitle");
        C1399s0.m37213K(x0);
        if (x0 instanceof TextView) {
            ((TextView) x0).setTextColor(e);
        }
        if (!m14481i2(alertDialog.getButton(-1), pVar, R.id.theme_color_textNeutral)) {
            m14481i2(alertDialog.findViewById(16908313), pVar, R.id.theme_color_textNeutral);
        }
        if (!m14481i2(alertDialog.getButton(-3), pVar, R.id.theme_color_textNeutral)) {
            m14481i2(alertDialog.findViewById(16908314), pVar, R.id.theme_color_textNeutral);
        }
        if (!m14481i2(alertDialog.getButton(-2), pVar, R.id.theme_color_textNeutral)) {
            m14481i2(alertDialog.findViewById(16908315), pVar, R.id.theme_color_textNeutral);
        }
        if (Build.VERSION.SDK_INT >= 21 && (background = alertDialog.getWindow().getDecorView().getBackground()) != null) {
            background.setColorFilter(new PorterDuffColorFilter(pVar.mo92e(R.id.theme_color_overlayFilling), PorterDuff.Mode.SRC_IN));
        }
        return alertDialog;
    }

    public static int m14542R2(int i) {
        if (i == 1) {
            return 90;
        }
        if (i != 2) {
            return i != 3 ? 0 : 270;
        }
        return 180;
    }

    public static boolean m14481i2(View view, AbstractC11531p pVar, int i) {
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            C1399s0.m37213K(view);
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(pVar.mo92e(i));
                return true;
            }
        }
        return false;
    }

    public static boolean m14446r1(int i) {
        if (i == 1) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 18 && i == 12;
    }

    public static boolean m14438t1(View view) {
        return (view instanceof C9319v1) || (view instanceof C9207i1);
    }

    public static boolean m14433u1(AbstractC9323v4<?> v4Var) {
        return (v4Var instanceof View$OnClickListenerC3147u9) || ((v4Var instanceof View$OnClickListenerC7430j1) && ((View$OnClickListenerC7430j1) v4Var).m16118ti() != 3);
    }

    public boolean m14621A0(boolean z, boolean z2, boolean z3) {
        for (int size = this.f25537c1.size() - 1; size >= 0; size--) {
            C6924j2 j2Var = this.f25537c1.get(size);
            if (j2Var.m18407z2()) {
                if (z && j2Var.m18414p2()) {
                    return j2Var.m18410v2();
                } else {
                    if (z2 && j2Var.m18421g0(z3)) {
                        return true;
                    }
                    j2Var.m18408y2(true);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m14620A1() {
        ArrayList<C6924j2> arrayList = this.f25537c1;
        return arrayList != null && !arrayList.isEmpty();
    }

    public void m14619A2(C6924j2 j2Var) {
        if (!this.f25537c1.remove(j2Var)) {
            m14414y0(j2Var);
        }
        m14470l0();
    }

    public void m14618A3(boolean z) {
        if (!this.f25500I0) {
            this.f25498H0 = C1379j0.m37371D();
            m14484h3(true);
            m14574J3();
            C2536ii iiVar = new C2536ii(this, null);
            this.f25502J0 = iiVar;
            iiVar.m34310Kf(0);
            this.f25502J0.mo9477Ac();
            this.f25522V.removeView(this.f25524W);
            this.f25522V.addView(this.f25502J0.get());
            this.f25502J0.mo6871o6();
            this.f25502J0.mo9166sc();
            int y2 = View$OnClickListenerC9170d1.m10021y2();
            int i = this.f25498H0;
            if (i != 0 && i != y2) {
                C1379j0.m37319m0(y2);
            }
        }
    }

    public boolean m14616B0(View view, int i, int i2, int i3, int i4) {
        View$OnClickListenerC4045k kVar;
        if (view == null || (kVar = this.f25559n1) == null || kVar.m9427Ha() != view) {
            return false;
        }
        this.f25559n1.m29206Xf(i, i2, i3, i4);
        return true;
    }

    public final void m14614B2(boolean z) {
        if (this.f25524W.getParent() == null) {
            if (this.f25559n1.m9339Ta()) {
                if (z) {
                    Runnable iVar = new Runnable() {
                        @Override
                        public final void run() {
                            AbstractView$OnTouchListenerC7889a.this.m14600E1();
                        }
                    };
                    if (this.f25559n1.m29157wf()) {
                        this.f25559n1.m9114zd(iVar, -1L);
                    } else {
                        iVar.run();
                    }
                } else {
                    this.f25522V.addView(this.f25524W, 1);
                }
                this.f25559n1.m29200ag();
                this.f25559n1.mo9222kc();
            }
        } else if (z) {
            this.f25557m1.m29546i(0.0f);
        }
    }

    public void m14613B3(me.C6924j2 r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a.m14613B3(me.j2):void");
    }

    public void m14611C0(MotionEvent motionEvent) {
        C2088d dVar = this.f25527X0;
        if (dVar != null) {
            dVar.m35652a2(motionEvent);
        }
    }

    public final void m14609C2(boolean z) {
        m14457o1(this.f25555l1);
        if (this.f25559n1.get().getParent() == null) {
            if (z) {
                this.f25559n1.m9114zd(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractView$OnTouchListenerC7889a.this.m14595F1();
                    }
                }, -1L);
            }
            this.f25559n1.m29200ag();
            this.f25559n1.m29190fg(this.f25526X.m9762F());
            this.f25559n1.mo9477Ac();
            m14495e3(true);
            this.f25522V.addView(this.f25559n1.get(), 0);
            AbstractC9323v4<?> F = this.f25526X.m9762F();
            if (F != null) {
                F.mo9222kc();
            }
        } else if (z) {
            this.f25557m1.m29546i(1.0f);
        }
    }

    public void m14608C3(String str, AbstractC7901l lVar) {
        boolean z;
        if (this.f25512O0) {
            this.f25517R0.setMessage(str);
            return;
        }
        this.f25512O0 = true;
        if (this.f25517R0 == null) {
            C9135a aVar = new C9135a(this);
            this.f25517R0 = aVar;
            aVar.m10226C1(this.f25577w1);
            z = true;
        } else {
            z = false;
        }
        this.f25517R0.setMessage(str);
        this.f25516Q0 = lVar;
        if (!this.f25514P0) {
            this.f25514P0 = true;
            m14406z3(-16777216, 3);
            this.f25532a0.setTranslationX(0.0f);
            this.f25532a0.setTranslationY(0.0f);
            this.f25532a0.setUnlockable(null);
            if (this.f25517R0.getParent() != null) {
                this.f25524W.removeView(this.f25517R0);
            }
            this.f25517R0.setAlpha(0.0f);
            this.f25517R0.setScaleX(0.85f);
            this.f25517R0.setScaleY(0.85f);
            this.f25524W.addView(this.f25517R0);
            ValueAnimator b = C2057b.m35737b();
            this.f25518S0 = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractView$OnTouchListenerC7889a.this.m14576J1(valueAnimator);
                }
            });
            this.f25518S0.setInterpolator(C2057b.f7280b);
            this.f25518S0.setDuration(220L);
            this.f25518S0.addListener(new C7894e(z));
            if (this.f25517R0.getProgress() != null) {
                this.f25517R0.getProgress().setVisibility(8);
                this.f25517R0.getProgress().setVisibility(0);
            }
            C2057b.m35736c(this.f25517R0, this.f25518S0);
        }
    }

    public void m14606D0() {
        m14601E0(this.f25551j1 >= 0.8f, false);
    }

    public void m14604D2(C2104l lVar, int i, int i2) {
        C2088d dVar = this.f25527X0;
        if (dVar != null) {
            dVar.m35643n2(lVar, i, i2);
        }
    }

    public void m14603D3(String str, AbstractC7901l lVar, long j) {
        AbstractRunnableC5910b bVar = this.f25521U0;
        if (bVar != null) {
            bVar.m21858c();
        }
        C7896g gVar = new C7896g(str, lVar);
        this.f25521U0 = gVar;
        C1379j0.m37335e0(gVar, j);
    }

    public void m14601E0(boolean z, boolean z2) {
        if (this.f25561o1) {
            m14526V2(false);
            boolean z3 = z || this.f25563p1;
            if (!z3) {
                this.f25559n1.m29178lg(false);
            }
            m14520X2(this.f25555l1, z3, true);
            float f = 1.0f;
            if ((!z3 || this.f25551j1 != 1.0f) && (z3 || this.f25551j1 != 0.0f)) {
                this.f25557m1.m29530y((!z2 || !z3) ? 200L : 140L);
                C3950k kVar = this.f25557m1;
                if (!z3) {
                    f = 0.0f;
                }
                kVar.m29546i(f);
                return;
            }
            m14464m2(this.f25551j1);
        }
    }

    public final void m14599E2(int i) {
        try {
            setRequestedOrientation(i);
        } catch (Throwable th) {
            Log.m14725e("Cannot request orientation", th, new Object[0]);
        }
    }

    public boolean m14598E3(AbstractC9323v4.C9334k kVar, boolean z) {
        View$OnClickListenerC4045k kVar2;
        if (this.f25553k1 == z || !m14494f0() || m14428v1()) {
            return false;
        }
        if (z) {
            if (m14508b2(kVar)) {
                return false;
            }
            if (!m14446r1(this.f25538d0) && (kVar2 = this.f25559n1) != null && !kVar2.m29174ng()) {
                return false;
            }
        }
        m14526V2(true);
        if (!z) {
            this.f25559n1.m29200ag();
        }
        m14520X2(kVar, z, true);
        this.f25559n1.m29178lg(true);
        return true;
    }

    public final void m14596F0() {
        AbstractRunnableC5910b bVar = this.f25556m0;
        if (bVar != null) {
            bVar.m21858c();
        }
        C7890a aVar = new C7890a();
        this.f25556m0 = aVar;
        C1379j0.m37335e0(aVar, 1000L);
    }

    public final void m14594F2() {
        if (Build.VERSION.SDK_INT >= 18) {
            m14599E2(12);
        } else {
            m14599E2(1);
        }
    }

    public void m14591G0() {
        if (this.f25553k1) {
            m14526V2(true);
            m14523W2(0.0f, true);
            m14601E0(false, false);
        }
    }

    public View$OnClickListenerC4045k m14589G3(AbstractC9323v4.C9334k kVar) {
        if (this.f25553k1 || !m14494f0()) {
            return null;
        }
        m14457o1(kVar);
        this.f25575v1 = true;
        return this.f25559n1;
    }

    public void m14587H0(boolean z) {
        if (this.f25505K1 != z) {
            this.f25505K1 = z;
            m14462n0();
        }
    }

    public void m14585H2() {
        View view = this.f25542f0;
        if (view != null) {
            view.requestFocus();
        }
    }

    public C9357x2 m14584H3() {
        if (this.f25510N0 == null) {
            C9357x2 x2Var = new C9357x2(this);
            this.f25510N0 = x2Var;
            x2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f25510N0.setAvailabilityListener(new C9357x2.AbstractC9361d() {
                @Override
                public final void mo8976a(C9357x2 x2Var2, boolean z) {
                    AbstractView$OnTouchListenerC7889a.this.m14571K1(x2Var2, z);
                }
            });
        }
        return this.f25510N0;
    }

    public int m14582I0() {
        return this.f25544g0;
    }

    public void m14580I2() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 2);
        }
    }

    public void m14579I3() {
        View$OnClickListenerC9694y yVar = this.f25535b1;
        if (!(yVar == null || yVar.getParent() == null)) {
            this.f25535b1.m7575B2(true);
        }
        this.f25546h0.m7247h0();
        C9357x2 x2Var = this.f25510N0;
        if (x2Var != null) {
            x2Var.m8977o();
        }
    }

    public void m14575J2(String[] strArr, AbstractC5096a aVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f25545g1 = aVar;
            try {
                requestPermissions(strArr, 9);
            } catch (Throwable unused) {
                Log.m14724e("Cannot check permissions: %s", TextUtils.join(", ", strArr));
                aVar.mo4252o1(9, false);
                this.f25545g1 = null;
            }
        }
    }

    public final void m14574J3() {
        boolean z;
        int i;
        float f;
        if (C4183a.f14106x) {
            boolean z2 = true;
            if ((this.f25566r0 & 4) != 0) {
                i = C1379j0.f5017k;
                z = false;
            } else {
                i = C11524j.m199b();
                z = !C11524j.m141z0();
            }
            if (this.f25583z1 != 0.0f) {
                AbstractC5915g gVar = this.f25581y1;
                i = C5064d.m24129d(i, C5064d.m24130c(gVar != null ? gVar.get() : 0, 503316480), this.f25583z1);
                z = z && this.f25485A1;
            }
            float f2 = this.f25570t0;
            if (f2 != 0.0f) {
                i = C5064d.m24129d(i, C1379j0.f5017k, f2);
                z = false;
            }
            if (this.f25500I0) {
                f = 1.0f;
            } else {
                C2536ii iiVar = this.f25504K0;
                f = iiVar != null ? iiVar.get().getAlpha() : 0.0f;
            }
            if (f != 0.0f) {
                i = C5064d.m24129d(i, C11524j.m228N(R.id.theme_color_passcode), f);
                if (!z || f >= 0.5f) {
                    z2 = false;
                }
                z = z2;
            }
            getWindow().setNavigationBarColor(i);
            if (this.f25568s0 != z) {
                this.f25568s0 = z;
                int i2 = this.f25566r0;
                if (z) {
                    i2 |= 16;
                }
                if (C11524j.m249C0()) {
                    i2 |= Log.TAG_LUX;
                }
                getWindow().getDecorView().setSystemUiVisibility(i2);
            }
        }
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        if (i2 == R.id.theme_property_dark || i2 == R.id.theme_property_lightStatusBar) {
            m14564L3();
        }
    }

    public View m14572K0() {
        return this.f25524W;
    }

    public void m14570K2(boolean z, boolean z2, final AbstractC5096a aVar) {
        m14565L2(z, z2, new Runnable() {
            @Override
            public final void run() {
                AbstractC5096a.this.mo4252o1(6, false);
            }
        }, aVar);
    }

    public void m14569K3() {
        getWindow().getContext().getTheme().applyStyle(C11524j.m141z0() ? 2131689478 : R.style.AppTheme, true);
    }

    public int m14567L0(View view) {
        int measuredWidth = view.getMeasuredWidth();
        return measuredWidth != 0 ? measuredWidth : this.f25526X.get().getMeasuredWidth();
    }

    public void m14566L1(C6924j2 j2Var) {
        int n1 = m14461n1(j2Var);
        if (n1 != -1) {
            int min = Math.min(n1, this.f25537c1.size());
            if (min == this.f25537c1.size()) {
                this.f25537c1.add(j2Var);
            } else {
                this.f25537c1.add(min, j2Var);
            }
            this.f25541e1.m21466k(n1);
            m14470l0();
        }
    }

    public void m14565L2(final boolean z, boolean z2, Runnable runnable, final AbstractC5096a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (z2) {
            m14586H1(z, aVar);
        } else {
            C11477a0.m494h(this, z, runnable, new Runnable() {
                @Override
                public final void run() {
                    AbstractView$OnTouchListenerC7889a.this.m14586H1(z, aVar);
                }
            });
        }
    }

    public void m14564L3() {
        m14431u3(this.f25566r0, false);
    }

    public int m14562M0() {
        return this.f25538d0;
    }

    public void m14561M1(int i) {
        if (this.f25538d0 != i) {
            this.f25538d0 = i;
            if (this.f25494F0) {
                m14599E2(i);
            } else {
                m14488g3(true);
            }
        }
    }

    public final void m14586H1(boolean z, AbstractC5096a aVar) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (i < 29 || !C4183a.f14101s || !z) {
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            } else {
                strArr = new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            }
            if (aVar != null) {
                this.f25549i1.m21467j(6, aVar);
                requestPermissions(strArr, 7);
                return;
            }
            requestPermissions(strArr, 6);
        }
    }

    public C6924j2 m14558N0() {
        if (this.f25537c1.isEmpty()) {
            return null;
        }
        ArrayList<C6924j2> arrayList = this.f25537c1;
        return arrayList.get(arrayList.size() - 1);
    }

    public AlertDialog m14557N1(AlertDialog alertDialog, AbstractC11531p pVar) {
        return m14555O1(this, alertDialog, pVar);
    }

    @Override
    public void mo6985N2(int i) {
        C9781q0.m6970b(this, i);
    }

    public AbstractC9323v4<?> m14556O0() {
        C6924j2 N0 = m14558N0();
        if (N0 != null) {
            return N0.getBoundController();
        }
        return null;
    }

    public void m14554O2(AbstractC5096a aVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f25543f1 = aVar;
            requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 8);
        }
    }

    public void m14553P(AbstractC7897h hVar) {
        this.f25536c0.add(hVar);
    }

    public View$OnClickListenerC9218k0 m14552P0() {
        return this.f25530Z;
    }

    public C9270q1 m14551P1() {
        return this.f25526X;
    }

    public void m14550P2() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m14523W2(f, false);
        }
    }

    public void m14549Q(AbstractC9323v4<?> v4Var, boolean z) {
        List<AbstractC9323v4<?>> list;
        if (z) {
            if (this.f25576w0 == null) {
                this.f25576w0 = new ArrayList();
            }
            list = this.f25576w0;
        } else {
            if (this.f25574v0 == null) {
                this.f25574v0 = new ArrayList();
            }
            list = this.f25574v0;
        }
        if (!list.contains(v4Var)) {
            list.add(v4Var);
            m14507b3(z ? 8 : 4, true);
        }
    }

    public final C6038h<C6924j2> m14548Q0() {
        return this.f25541e1;
    }

    public abstract boolean mo14547Q1();

    public final void m14546Q2() {
        Iterator<C6924j2> it = this.f25537c1.iterator();
        while (it.hasNext()) {
            it.next().m18437L2();
        }
    }

    public final void m14545R(C11537v vVar) {
        if (!this.f25579x1.contains(vVar)) {
            this.f25579x1.add(vVar);
        }
    }

    public GestureDetector$OnGestureListenerC9285r1 m14544R0() {
        return this.f25528Y;
    }

    public boolean m14543R1() {
        return true;
    }

    public void m14541S(AbstractC9323v4<?> v4Var, ArrayList<AbstractC4718o<?>> arrayList, View$OnClickListenerC9694y.AbstractC9702h hVar) {
        View$OnClickListenerC9694y yVar = this.f25535b1;
        if (yVar != null) {
            yVar.m7554W1(v4Var, arrayList, hVar);
        }
    }

    public float m14540S0() {
        return this.f25497G1;
    }

    public final boolean m14539S1() {
        return this.f25487B1 && this.f25491D1 != null && this.f25544g0 == 0 && C4868i.m24727c2().m24648m1() == 1;
    }

    public final void m14538S2(int i) {
        int i2 = this.f25544g0;
        if (i2 != i) {
            boolean z = i2 == 0;
            this.f25544g0 = i;
            if (i != 0) {
                if (z) {
                    this.f25520U.removeMessages(2);
                }
                C1379j0.m37315o0(this, i);
            } else {
                Handler handler = this.f25520U;
                handler.sendMessageDelayed(Message.obtain(handler, 2), 200L);
            }
            Iterator<AbstractC7902m> it = this.f25582z0.iterator();
            while (it.hasNext()) {
                it.next().mo14403U(this, i, i2);
            }
        }
    }

    public void m14537T(AbstractC7898i iVar) {
        this.f25560o0.add(iVar);
    }

    public C9356x1 m14536T0() {
        if (this.f25523V0.isEmpty()) {
            return this.f25532a0;
        }
        ArrayList<C9356x1> arrayList = this.f25523V0;
        return arrayList.get(arrayList.size() - 1);
    }

    public final void m14535T1() {
        Iterator<AbstractC7897h> it = this.f25536c0.iterator();
        while (it.hasNext()) {
            it.next().mo6929S4();
        }
    }

    public void m14534T2(boolean z) {
        if (this.f25563p1 != z) {
            this.f25563p1 = z;
            if (z) {
                m14606D0();
            }
        }
    }

    @Override
    public final void mo9343T5(int i, int i2) {
        RunnableC7091z1 z1Var;
        RunnableC7091z1 z1Var2;
        if (C4403w.m27983H1(i, i2) && (z1Var2 = this.f25562p0) != null) {
            z1Var2.m17770I1();
        }
        if (i == 0) {
            RunnableC7091z1 z1Var3 = this.f25562p0;
            if (z1Var3 != null) {
                z1Var3.m17769J1(0);
            }
        } else if (i == 2 && (z1Var = this.f25562p0) != null) {
            z1Var.m17769J1(i2);
        }
    }

    public void m14533U(AbstractC7899j jVar) {
        this.f25495F1.add(jVar);
        m14475j3(!this.f25495F1.isEmpty());
    }

    public C9356x1 m14532U0() {
        return this.f25532a0;
    }

    public final void m14531U1() {
        Iterator<AbstractC7897h> it = this.f25536c0.iterator();
        while (it.hasNext()) {
            it.next().mo6904d6();
        }
    }

    public void m14530U2(float f) {
        if (this.f25561o1) {
            C3950k kVar = this.f25557m1;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            m14523W2(f, true);
        }
    }

    public void m14529V(AbstractC7900k kVar) {
        this.f25506L0.add(kVar);
    }

    public C9789y m14528V0() {
        return this.f25548i0;
    }

    public final void m14527V1() {
        Iterator<AbstractC7897h> it = this.f25536c0.iterator();
        while (it.hasNext()) {
            it.next().mo6871o6();
        }
    }

    public final void m14526V2(boolean z) {
        if (this.f25561o1 != z) {
            this.f25561o1 = z;
            m14474k0();
        }
    }

    public void m14525W() {
        View view = this.f25554l0;
        if (view != null) {
            this.f25522V.removeView(view);
            this.f25554l0 = null;
            return;
        }
        View view2 = new View(this);
        view2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(32.0f), C1357a0.m37544i(32.0f), 49));
        view2.setBackgroundColor(1895759872);
        view2.setOnClickListener(View$OnClickListenerC7354e.f23263a);
        C6864e eVar = this.f25522V;
        this.f25554l0 = view2;
        eVar.addView(view2);
    }

    @Override
    public boolean mo136W0() {
        View$OnClickListenerC9694y yVar;
        return this.f25512O0 || ((yVar = this.f25535b1) != null && yVar.m7552Y1()) || !this.f25579x1.isEmpty() || C4183a.f14106x;
    }

    public void m14524W1(boolean z) {
        if (!this.f25512O0) {
            C9357x2 x2Var = this.f25510N0;
            if ((x2Var != null && x2Var.m8980l()) || m14621A0(false, true, z)) {
                return;
            }
            if (this.f25553k1) {
                m14447r0();
            } else if (this.f25548i0.m6909c0()) {
                this.f25548i0.m6963C0();
            } else if (m14442s1(false)) {
            } else {
                if (this.f25526X.m9697s0(z)) {
                    super.onBackPressed();
                } else if (!this.f25526X.m9714j0(z)) {
                    View$OnClickListenerC9218k0 k0Var = this.f25530Z;
                    if (k0Var == null || !k0Var.m9957Ff()) {
                        AbstractC9323v4<?> F = this.f25526X.m9762F();
                        if (F == null) {
                            super.onBackPressed();
                        } else if (F.m9374Oa() || F.m9382Na() || F.m9390Ma()) {
                            this.f25526X.m9714j0(z);
                        } else {
                            super.onBackPressed();
                        }
                    } else {
                        this.f25530Z.m9895pf(0.0f, null);
                    }
                }
            }
        } else if (this.f25516Q0 != null) {
            m14469l1(true);
        }
    }

    public final void m14523W2(float f, boolean z) {
        C3950k kVar;
        if (f < 0.0f) {
            f = -f;
        }
        float f2 = this.f25551j1;
        if (f2 != f) {
            boolean z2 = f > f2;
            this.f25551j1 = f;
            m14474k0();
            m14506c0(this.f25524W);
            this.f25559n1.m29210Vf(f, z, z2);
            if (z && (kVar = this.f25557m1) != null) {
                kVar.m29543l(f);
            }
        }
    }

    @Override
    public void mo6984X(C10930q6 q6Var, TdApi.Message message) {
        C9781q0.m6971a(this, q6Var, message);
    }

    public C9746h0 m14522X0() {
        return this.f25546h0;
    }

    public final void m14521X1() {
        this.f25559n1.mo9216lc();
        this.f25522V.removeView(this.f25559n1.get());
        m14495e3(false);
        AbstractC9323v4<?> F = this.f25526X.m9762F();
        if (F != null) {
            F.mo9166sc();
        }
    }

    public final void m14520X2(AbstractC9323v4.C9334k kVar, boolean z, boolean z2) {
        if (this.f25553k1 != z) {
            this.f25553k1 = z;
            if (z) {
                this.f25555l1 = kVar;
            }
            if (this.f25557m1 == null) {
                this.f25557m1 = new C3950k(0, this, C2057b.f7280b, 240L, this.f25551j1);
            }
            float f = z ? 1.0f : 0.0f;
            if (!z2) {
                this.f25557m1.m29530y(240L);
            }
            if (this.f25557m1.m29533v()) {
                if (z2) {
                    this.f25557m1.m29544k();
                } else {
                    this.f25557m1.m29546i(f);
                }
            } else if (z) {
                m14609C2(!z2);
            } else {
                m14614B2(!z2);
            }
        }
    }

    public final void m14519Y(AbstractC7902m mVar) {
        this.f25582z0.add(mVar);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            m14464m2(f);
        }
    }

    @Override
    public final void mo6983Y1(C10930q6 q6Var, TdApi.Message message, int i, int i2, float f, boolean z) {
        m14444r3(1, message != null && i2 == 3);
    }

    public void m14518Y2(AbstractC5915g gVar, float f, boolean z) {
        if (!C4183a.f14106x) {
            return;
        }
        if (this.f25581y1 != gVar || this.f25583z1 != f || this.f25485A1 != z) {
            this.f25581y1 = gVar;
            this.f25583z1 = f;
            this.f25485A1 = z;
            m14574J3();
        } else if (gVar != null && f > 0.0f) {
            m14574J3();
        }
    }

    public void m14517Z(View view, boolean z) {
        FrameLayoutFix z0;
        C2536ii iiVar = this.f25502J0;
        int indexOfChild = (iiVar == null || !this.f25500I0) ? -1 : this.f25522V.indexOfChild(iiVar.get());
        if (indexOfChild == -1 && (z0 = this.f25546h0.m7217z0()) != null) {
            indexOfChild = this.f25522V.indexOfChild(z0);
        }
        if (indexOfChild == -1 && !z) {
            RunnableC7091z1 z1Var = this.f25562p0;
            indexOfChild = z1Var != null ? this.f25522V.indexOfChild(z1Var) : -1;
        }
        C9357x2 x2Var = this.f25510N0;
        int indexOfChild2 = x2Var != null ? this.f25522V.indexOfChild(x2Var) : -1;
        if (indexOfChild2 != -1) {
            if (indexOfChild != -1) {
                indexOfChild2 = Math.min(indexOfChild2, indexOfChild);
            }
            indexOfChild = indexOfChild2;
        }
        if (indexOfChild != -1) {
            this.f25522V.addView(view, indexOfChild);
        } else {
            this.f25522V.addView(view);
        }
    }

    public int m14516Z0() {
        if (m14486h1()) {
            C10930q6 z0 = m14409z0();
            boolean X0 = z0.m2440ga().m3160X0();
            TdApi.SuggestedAction wc = z0.m2182wc();
            if ((wc != null ? 1 : wc != null || z0.m2204v6() ? 2 : 0) + (X0 ? 1 : 0) > 1) {
                return C10930q6.f34960B2;
            }
            if (X0) {
                return R.drawable.baseline_notification_important_14;
            }
            if (wc != null) {
                int constructor = wc.getConstructor();
                if (constructor == 648771563) {
                    return R.drawable.baseline_sim_card_alert_14;
                }
                if (constructor == 1910534839) {
                    return R.drawable.baseline_gpp_maybe_14;
                }
                throw new UnsupportedOperationException(wc.toString());
            }
        }
        return 0;
    }

    public final void m14515Z1() {
        this.f25522V.removeView(this.f25524W);
        this.f25559n1.mo9166sc();
        this.f25559n1.m29178lg(false);
        m14465m1();
    }

    public final void m14514Z2(boolean z) {
        m14426v3(z ? Log.TAG_LUX : 0, Log.TAG_LUX);
    }

    public final boolean m14513a0() {
        AbstractC9323v4<?> F = this.f25526X.m9762F();
        return (F == null || F.mo9450E8()) && (this.f25509M1 & Log.TAG_YOUTUBE) == 0;
    }

    public int m14512a1() {
        return m14542R2(getWindowManager().getDefaultDisplay().getRotation());
    }

    public void mo14511a2() {
    }

    public final void m14510a3(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && this.f25578x0 != z) {
            this.f25578x0 = z;
            if (i >= 28 && z) {
                this.f25580y0 = true;
                Window window = getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = z ? 1 : 0;
                window.setAttributes(attributes);
            }
            m14426v3(z ? Log.TAG_CAMERA : 0, Log.TAG_CAMERA);
            if (z) {
                m14431u3(1, true);
            } else {
                m14431u3(0, true);
            }
            if (i >= 28 && !z) {
                Window window2 = getWindow();
                WindowManager.LayoutParams attributes2 = window2.getAttributes();
                attributes2.layoutInDisplayCutoutMode = 0;
                window2.setAttributes(attributes2);
            }
        }
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        if (C4183a.f14106x && pVar.mo94c() != pVar2.mo94c()) {
            m14574J3();
        }
        m14419x0(s30.class);
        if (pVar.mo91f() != pVar2.mo91f()) {
            m14564L3();
        }
        if (pVar.mo94c() != pVar2.mo94c()) {
            m14569K3();
        }
    }

    public void addToNavigation(View view) {
        this.f25526X.m9711l(view);
    }

    public C5120j m14509b0() {
        return this.f25550j0;
    }

    public final boolean m14508b2(final AbstractC9323v4.C9334k kVar) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (!C7389v0.m16662Y1(kVar.f30204d ? View$OnClickListenerC4045k.f13575t1 : View$OnClickListenerC4045k.f13574s1)) {
            return false;
        }
        C7389v0.m16563x2(kVar.f30204d ? View$OnClickListenerC4045k.f13575t1 : View$OnClickListenerC4045k.f13574s1, new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                AbstractView$OnTouchListenerC7889a.this.m14605D1(kVar, z);
            }
        });
        return true;
    }

    public void m14507b3(int i, boolean z) {
        int h = C5063c.m24139h(this.f25572u0, i, z);
        if (this.f25572u0 != h) {
            this.f25572u0 = h;
            m14510a3(h != 0 && !C5063c.m24145b(h, 2) && !C5063c.m24145b(h, 4));
        }
    }

    public void m14506c0(C9179e1 e1Var) {
        if (this.f25559n1 != null) {
            int measuredHeight = e1Var.getMeasuredHeight();
            float f = (-measuredHeight) * this.f25551j1;
            e1Var.setTranslationY(f);
            RunnableC7091z1 z1Var = this.f25562p0;
            if (z1Var != null) {
                z1Var.setTranslationY(f);
            }
            this.f25559n1.m29208Wf(f + measuredHeight);
            m14579I3();
        }
    }

    public boolean m14505c1() {
        return this.f25540e0;
    }

    public boolean m14504c2(AbstractC9323v4.C9334k kVar) {
        if (this.f25553k1) {
            return true;
        }
        if (!m14494f0()) {
            return false;
        }
        if (m14428v1()) {
            m14465m1();
            Handler handler = this.f25520U;
            handler.sendMessageDelayed(Message.obtain(handler, 1, kVar), 100L);
            return false;
        }
        m14465m1();
        if (m14508b2(kVar)) {
            return false;
        }
        m14520X2(kVar, true, false);
        return true;
    }

    public final void m14503c3(boolean z) {
        if (this.f25503J1) {
            if (this.f25501I1 == null) {
                this.f25501I1 = new Handler(Looper.getMainLooper(), new Handler.Callback() {
                    @Override
                    public final boolean handleMessage(Message message) {
                        boolean I1;
                        I1 = AbstractView$OnTouchListenerC7889a.this.m14581I1(message);
                        return I1;
                    }
                });
            }
            if (!this.f25501I1.hasMessages(z ? 1 : 0)) {
                this.f25501I1.removeMessages(!z ? 1 : 0);
                if (this.f25505K1 != z) {
                    Handler handler = this.f25501I1;
                    handler.sendMessageDelayed(Message.obtain(handler, (int) z), 1500L);
                }
            }
        } else if (m14513a0()) {
            Handler handler2 = this.f25501I1;
            if (handler2 != null) {
                handler2.removeMessages(0);
                this.f25501I1.removeMessages(1);
            }
            if (this.f25505K1 != z) {
                this.f25505K1 = z;
                C11541z.m7t().m30b0(z, true);
                this.f25503J1 = true;
            }
        }
    }

    public boolean m14502d0() {
        View$OnClickListenerC9694y yVar = this.f25535b1;
        return yVar != null && yVar.m7544i2();
    }

    public boolean m14501d1() {
        Iterator<C6924j2> it = this.f25537c1.iterator();
        while (it.hasNext()) {
            if (!it.next().m18412t2()) {
                return true;
            }
        }
        return false;
    }

    public boolean m14500d2(C6957m1.C6963f fVar) {
        if (this.f25531Z0 != null) {
            return false;
        }
        C6957m1 m1Var = new C6957m1(this);
        this.f25533a1 = m1Var;
        try {
            m1Var.m18360N1(fVar);
            C6924j2 j2Var = new C6924j2(this);
            this.f25531Z0 = j2Var;
            j2Var.setOverlayStatusBar(true);
            boolean z = C4184b.f14115h;
            this.f25531Z0.m18045Q1(true);
            if (!fVar.m18307v()) {
                this.f25531Z0.m18435N2();
            }
            if (fVar.m18342D()) {
                this.f25531Z0.m18436M2();
            }
            C6924j2 j2Var2 = this.f25531Z0;
            C6957m1 m1Var2 = this.f25533a1;
            j2Var2.m18433P2(m1Var2, m1Var2);
            return true;
        } catch (Throwable th) {
            Log.m14725e("Unable to open force touch preview", th, new Object[0]);
            return false;
        }
    }

    public void m14499d3(View$OnClickListenerC2971rh rhVar, boolean z) {
        View$OnClickListenerC9694y yVar = this.f25535b1;
        if (yVar != null && yVar.getTdlibDelegate() == rhVar) {
            this.f25535b1.m7575B2(false);
            this.f25535b1.setHidden(z);
        }
    }

    public final void m14498e0() {
        AbstractRunnableC5910b bVar = this.f25556m0;
        if (bVar != null) {
            bVar.m21858c();
            this.f25556m0 = null;
        }
        View view = this.f25542f0;
        if (view != null) {
            view.setEnabled(false);
        }
    }

    public boolean m14497e1() {
        Iterator<C6924j2> it = this.f25537c1.iterator();
        while (it.hasNext()) {
            if (it.next().getBoundView() instanceof C9207i1) {
                return true;
            }
        }
        return false;
    }

    public void m14496e2(C2099j jVar, C2104l lVar) {
        C2088d dVar = this.f25527X0;
        if (dVar != null && this.f25529Y0 == jVar) {
            dVar.m35644m2(lVar);
        }
    }

    public final void m14495e3(boolean z) {
        if (this.f25573u1 != z) {
            this.f25573u1 = z;
            m14474k0();
        }
    }

    public final boolean m14494f0() {
        C3950k kVar;
        return m14558N0() == null && ((kVar = this.f25557m1) == null || !kVar.m29533v()) && this.f25544g0 == 0 && !this.f25548i0.m6909c0() && !this.f25575v1 && !m14423w1();
    }

    public boolean m14493f1() {
        if (Build.VERSION.SDK_INT >= 17) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            defaultDisplay.getRealMetrics(this.f25569s1);
            DisplayMetrics displayMetrics = this.f25569s1;
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            defaultDisplay.getMetrics(displayMetrics);
            DisplayMetrics displayMetrics2 = this.f25569s1;
            int i3 = displayMetrics2.heightPixels;
            int i4 = displayMetrics2.widthPixels;
            int n = C1357a0.m37539n();
            return n > 0 && (i2 - i4 >= n || i - i3 >= n);
        }
        return !ViewConfiguration.get(this).hasPermanentMenuKey() && !KeyCharacterMap.deviceHasKey(4);
    }

    public void m14492f2(C10930q6 q6Var, C2099j jVar, C2104l lVar, int i, int i2, int i3, int i4, boolean z) {
        if (this.f25527X0 == null) {
            this.f25529Y0 = jVar;
            C2088d dVar = new C2088d(this);
            this.f25527X0 = dVar;
            dVar.setControllerView(this.f25529Y0);
            this.f25527X0.m35639u2(q6Var, lVar, i, i2, i3, i4, z);
            C6924j2 j2Var = new C6924j2(this);
            this.f25525W0 = j2Var;
            j2Var.setBackListener(this.f25527X0);
            this.f25525W0.setOverlayStatusBar(true);
            this.f25525W0.m18045Q1(true);
            this.f25525W0.m18435N2();
            C6924j2 j2Var2 = this.f25525W0;
            C2088d dVar2 = this.f25527X0;
            j2Var2.m18433P2(dVar2, dVar2);
        }
    }

    public void m14491f3(boolean z) {
        if (this.f25492E0 != z) {
            this.f25492E0 = z;
        }
    }

    public final void m14490g0() {
        boolean z = true;
        if (!(this.f25544g0 == 0 && C4868i.m24727c2().m24648m1() == 1)) {
            z = false;
        }
        m14451p3(z);
        m14440s3(getResources().getConfiguration().uiMode & 48);
    }

    public boolean m14489g1() {
        int i = this.f25488C0;
        return i == 2 || i == 1;
    }

    @Override
    public final void mo452g2() {
        List<Reference<View>> list = this.f25558n0;
        if (list != null) {
            try {
                for (int size = list.size() - 1; size >= 0; size--) {
                    View view = this.f25558n0.get(size).get();
                    if (view != null) {
                        view.invalidate();
                    } else {
                        this.f25558n0.remove(size);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void m14488g3(boolean z) {
        if (this.f25494F0 != z && !this.f25496G0) {
            this.f25494F0 = z;
            if (z) {
                int rotation = getWindowManager().getDefaultDisplay().getRotation();
                int i = this.f25538d0;
                if (i == 2 && (rotation == 0 || rotation == 1)) {
                    m14599E2(0);
                } else if (i == 1 && (rotation == 0 || rotation == 1)) {
                    m14594F2();
                } else if (i == 2 && (rotation == 2 || rotation == 3)) {
                    m14599E2(8);
                } else if (i != 1) {
                } else {
                    if (rotation == 2 || rotation == 3) {
                        m14594F2();
                    }
                }
            } else {
                m14599E2(-1);
            }
        }
    }

    public void m14487h0() {
        View$OnClickListenerC4045k kVar = this.f25559n1;
        if (kVar != null) {
            kVar.m29181kf();
        }
    }

    public final boolean m14486h1() {
        return this.f25552k0 != null;
    }

    public final void m14485h2(AbstractC9323v4<?> v4Var) {
        List<AbstractC9323v4<?>> list = this.f25511N1;
        if (list == null || !list.contains(v4Var)) {
            if (this.f25511N1 == null) {
                this.f25511N1 = new ArrayList();
            }
            if (this.f25513O1 == null) {
                C7020s0 s0Var = new C7020s0(this);
                this.f25513O1 = s0Var;
                s0Var.setPadding(0, View$OnClickListenerC9170d1.getTopOffset(), 0, 0);
                this.f25513O1.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            }
            if (this.f25513O1.getParent() == null) {
                m14517Z(this.f25513O1, false);
            }
            this.f25511N1.add(v4Var);
            this.f25513O1.m18089D1(v4Var.m9463Ca());
        }
    }

    public final void m14484h3(boolean z) {
        if (this.f25500I0 != z) {
            this.f25500I0 = z;
            if (z) {
                m14441s2();
            } else {
                m14546Q2();
            }
            m14507b3(2, z);
            if (z) {
                AbstractRunnableC5910b bVar = this.f25508M0;
                if (bVar != null) {
                    bVar.m21858c();
                    this.f25508M0 = null;
                } else {
                    this.f25526X.m9712k0();
                }
            } else {
                C7892c cVar = new C7892c();
                this.f25508M0 = cVar;
                cVar.m21856e(C1379j0.m37316o());
                C1379j0.m37335e0(this.f25508M0, 100L);
            }
            for (int size = this.f25506L0.size() - 1; size >= 0; size--) {
                this.f25506L0.get(size).mo7703f(this, z);
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            m14504c2((AbstractC9323v4.C9334k) message.obj);
        } else if (i == 2 && this.f25544g0 == 0 && !C1379j0.m37315o0(this, 0)) {
            C10536ab.m4667o1().m4694g3().m28152c();
        }
        return true;
    }

    public final void m14483i0() {
        View$OnClickListenerC4045k kVar;
        View$OnClickListenerC4045k kVar2;
        float f = this.f25551j1;
        boolean z = false;
        boolean z2 = ((f < 1.0f && this.f25553k1) || (!(f == 0.0f || f == 1.0f) || this.f25561o1 || (f == 1.0f && (kVar2 = this.f25559n1) != null && kVar2.m29174ng()))) && ((kVar = this.f25559n1) == null || !kVar.m29159vf());
        if (this.f25565q1 != z2) {
            this.f25565q1 = z2;
            m14488g3(z2);
        }
        if (Build.VERSION.SDK_INT >= 18) {
            if (this.f25551j1 == 1.0f) {
                z = true;
            }
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = 2;
            if (z) {
                int i2 = attributes.rotationAnimation;
                if (i2 != 2) {
                    this.f25567r1 = i2;
                }
            } else {
                i = this.f25567r1;
            }
            if (attributes.rotationAnimation != i) {
                attributes.rotationAnimation = i;
                window.setAttributes(attributes);
            }
        }
    }

    public void m14482i1() {
        View view = this.f25542f0;
        if (view != null) {
            C1408x.m37091c(view);
        }
    }

    public final void m14480i3(boolean z) {
        Window window;
        if (Build.VERSION.SDK_INT >= 19 && this.f25571t1 != z && (window = getWindow()) != null) {
            if (z) {
                window.addFlags(134217728);
            } else {
                window.clearFlags(134217728);
            }
            this.f25571t1 = z;
        }
    }

    @Override
    public void mo14479j(boolean z) {
        this.f25526X.m9706n0(z);
        this.f25490D0 = z;
        RunnableC7091z1 z1Var = this.f25562p0;
        if (z1Var != null) {
            z1Var.m17768L1();
        }
    }

    @Override
    public void mo14478j0() {
    }

    public void m14477j1(boolean z) {
        if (!this.f25537c1.isEmpty()) {
            for (int size = this.f25537c1.size() - 1; size >= 0; size--) {
                C6924j2 j2Var = this.f25537c1.get(size);
                View boundView = j2Var.getBoundView();
                AbstractC9323v4<?> boundController = j2Var.getBoundController();
                if (m14438t1(boundView) || ((z && (boundView instanceof View$OnClickListenerC2096i)) || (((boundView instanceof View$OnClickListenerC8851y1) && !(this.f25526X.m9762F() instanceof View$OnClickListenerC2971rh)) || (z && m14433u1(boundController))))) {
                    j2Var.m18408y2(true);
                }
            }
        }
    }

    public void m14476j2(View view, int i, int i2) {
        if (this.f25515P1 == null) {
            KonfettiView konfettiView = new KonfettiView(this);
            this.f25515P1 = konfettiView;
            konfettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            m14517Z(this.f25515P1, true);
        }
        int[] u = C1399s0.m37157u(this.f25522V);
        int i3 = u[0];
        int i4 = u[1];
        int[] u2 = C1399s0.m37157u(view);
        this.f25515P1.m15741a().m14976a(C11524j.m228N(R.id.theme_color_confettiRed), C11524j.m228N(R.id.theme_color_confettiGreen), C11524j.m228N(R.id.theme_color_confettiBlue), C11524j.m228N(R.id.theme_color_confettiCyan), C11524j.m228N(R.id.theme_color_confettiPurple), C11524j.m228N(R.id.theme_color_confettiYellow)).m14969h(0.0d, 359.0d).m14966k(1.0f, 12.0f).m14968i(true).m14965l(600L).m14975b(AbstractC8418b.C8419a.f27328b, AbstractC8418b.C8421c.f27332a).m14974c(new C8422c(12, 2.0f)).m14967j(i + (u2[0] - i3), i2 + (u2[1] - i4)).m14973d(150);
    }

    public final void m14475j3(boolean z) {
        if (Build.VERSION.SDK_INT >= 19 && this.f25493E1 != z) {
            this.f25493E1 = z;
            if (this.f25487B1) {
                try {
                    this.f25489C1.unregisterListener(this, this.f25491D1);
                    this.f25489C1.registerListener(this, this.f25491D1, 3, this.f25493E1 ? 90000 : 700000);
                } catch (Throwable th) {
                    Log.m14710w("Cannot re-register sensor event listener", th, new Object[0]);
                }
            }
        }
    }

    public void m14474k0() {
        View$OnClickListenerC4045k kVar;
        View$OnClickListenerC4045k kVar2 = this.f25559n1;
        boolean z = false;
        boolean z2 = kVar2 != null && kVar2.m29159vf();
        m14444r3(8, this.f25551j1 > 0.0f || this.f25561o1);
        m14507b3(1, (this.f25551j1 > 0.0f || this.f25561o1) && !z2);
        m14483i0();
        if (this.f25573u1 || ((kVar = this.f25559n1) != null && kVar.m29159vf())) {
            z = true;
        }
        m14480i3(z);
    }

    public void m14473k1() {
        if (this.f25500I0) {
            this.f25526X.m9704o0();
            this.f25522V.addView(this.f25524W, m14418x1() ? 1 : 0);
            this.f25524W.invalidate();
            m14484h3(false);
            C2536ii iiVar = this.f25502J0;
            if (iiVar != null) {
                this.f25504K0 = iiVar;
                this.f25502J0 = null;
                new C3950k(0, new C7893d(iiVar), C2057b.f7280b, 100L).m29546i(1.0f);
            }
            int y2 = View$OnClickListenerC9170d1.m10021y2();
            int i = this.f25498H0;
            if (i != 0 && i != y2) {
                C1379j0.m37319m0(i);
            }
        }
    }

    public void m14472k2(AbstractC9323v4.C9334k kVar, boolean z) {
        if (this.f25553k1 != z && m14494f0()) {
            this.f25522V.m18733Y1(kVar, z);
        }
    }

    public void m14471k3(boolean z) {
        C10930q6 q6Var = this.f25552k0;
        if (q6Var != null) {
            q6Var.m2422hc(z);
        }
    }

    public final void m14470l0() {
        boolean z = false;
        if (C1379j0.f5013g != 1) {
            boolean z2 = this.f25526X.m9753J0() || C4862d.m24935w().m24964R();
            if (!z2) {
                Iterator<C6924j2> it = this.f25537c1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().m18424c1()) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z2) {
                for (int i = 0; i < this.f25541e1.m21464n(); i++) {
                    C6924j2 o = this.f25541e1.m21463o(i);
                    if (o != null && o.m18424c1()) {
                        z = true;
                        break;
                    }
                }
            }
            z = z2;
        }
        m14514Z2(z);
    }

    public void m14469l1(boolean z) {
        ValueAnimator valueAnimator = this.f25518S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25518S0 = null;
            this.f25514P0 = false;
        }
        AbstractRunnableC5910b bVar = this.f25521U0;
        if (bVar != null) {
            bVar.m21858c();
        }
        if (this.f25512O0) {
            AbstractC7901l lVar = this.f25516Q0;
            if (lVar != null) {
                if (z) {
                    lVar.mo14404a();
                }
                this.f25516Q0 = null;
            }
            this.f25512O0 = false;
            this.f25514P0 = true;
            ValueAnimator b = C2057b.m35737b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AbstractView$OnTouchListenerC7889a.this.m14610C1(valueAnimator2);
                }
            });
            b.setInterpolator(C2057b.f7280b);
            b.setDuration(220L);
            b.addListener(new C7895f());
            b.start();
        }
    }

    public void m14468l2(C6924j2 j2Var) {
        int indexOf = this.f25537c1.indexOf(j2Var);
        if (indexOf != -1) {
            this.f25537c1.remove(indexOf);
            while (this.f25541e1.m21472e(indexOf) != null) {
                indexOf++;
            }
            this.f25541e1.m21467j(indexOf, j2Var);
        }
    }

    public void m14467l3(int i) {
        this.f25496G0 = i != -1;
        m14599E2(i);
    }

    public int m14466m0(boolean z) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (i < 29 || !C4183a.f14101s || !z) {
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            } else {
                strArr = new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            }
            for (String str : strArr) {
                int checkSelfPermission = checkSelfPermission(str);
                if (checkSelfPermission != 0) {
                    return checkSelfPermission;
                }
            }
        }
        return 0;
    }

    public final void m14465m1() {
        AbstractC9323v4<?> F = this.f25526X.m9762F();
        if (F != null) {
            F.mo9397La();
        }
        C6924j2 N0 = m14558N0();
        if (N0 != null) {
            N0.m18410v2();
        }
    }

    public final void m14464m2(float f) {
        if (f == 1.0f && this.f25553k1) {
            m14515Z1();
        } else if (f == 0.0f && !this.f25553k1) {
            m14521X1();
        }
    }

    public void m14463m3(int i, boolean z) {
        int i2 = this.f25509M1;
        boolean z2 = true;
        boolean z3 = i2 != 0;
        int h = C5063c.m24139h(i2, i, z);
        this.f25509M1 = h;
        if (h == 0) {
            z2 = false;
        }
        if (z3 != z2) {
            m14488g3(z2);
        }
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        this.f25577w1.m66n(z);
        View$OnClickListenerC9694y yVar = this.f25535b1;
        if (yVar != null) {
            yVar.getThemeProvider().m66n(z);
        }
        if (this.f25562p0 != null && (!z || C11541z.m7t().m9r(C4183a.f14084b))) {
            this.f25562p0.invalidate();
        }
        C9357x2 x2Var = this.f25510N0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
        Iterator<C11537v> it = this.f25579x1.iterator();
        while (it.hasNext()) {
            it.next().m66n(z);
        }
        if (C4183a.f14106x) {
            m14574J3();
        }
    }

    public void m14462n0() {
        if (m14539S1()) {
            boolean z = false;
            this.f25503J1 = false;
            if (this.f25497G1 <= C4868i.m24727c2().m24680i1()) {
                z = true;
            }
            m14503c3(z);
        }
    }

    public final int m14461n1(C6924j2 j2Var) {
        for (int n = this.f25541e1.m21464n() - 1; n >= 0; n--) {
            if (this.f25541e1.m21463o(n) == j2Var) {
                return this.f25541e1.m21468i(n);
            }
        }
        return -1;
    }

    public void m14460n2(float f, float f2, float f3, float f4) {
        if (this.f25531Z0 != null) {
            this.f25533a1.m18357S1(f, f2, f3, f4);
        }
    }

    public void m14459n3(float f) {
        if (C4183a.f14106x && this.f25570t0 != f) {
            this.f25570t0 = f;
            m14574J3();
        }
    }

    public final void m14458o0(boolean z) {
        if (!z) {
            if (C4862d.m24935w().m24933y()) {
                try {
                    m14618A3(z);
                } catch (Throwable th) {
                    Log.m14725e("TODO", th, new Object[0]);
                }
            } else {
                C4862d.m24935w().m24962T(false);
            }
        }
    }

    public final void m14457o1(AbstractC9323v4.C9334k kVar) {
        View$OnClickListenerC4045k kVar2 = this.f25559n1;
        if (kVar2 == null) {
            View$OnClickListenerC4045k kVar3 = new View$OnClickListenerC4045k(this);
            this.f25559n1 = kVar3;
            kVar3.m29194dg(kVar.f30205e, kVar.f30207g);
            this.f25559n1.m29188gg(kVar.f30208h, kVar.f30209i, kVar.f30210j);
            this.f25559n1.get();
            m14553P(this.f25559n1);
        } else {
            kVar2.m29194dg(kVar.f30205e, kVar.f30207g);
            this.f25559n1.m29188gg(kVar.f30208h, kVar.f30209i, kVar.f30210j);
        }
        m14477j1(false);
        m14454p0(true);
    }

    public boolean m14456o2(MotionEvent motionEvent) {
        return !this.f25512O0 && this.f25528Y.m9635g(motionEvent);
    }

    public void m14455o3(float f) {
        if (this.f25519T0 != f) {
            this.f25519T0 = f;
            float f2 = (0.14999998f * f) + 0.85f;
            this.f25517R0.setScaleX(f2);
            this.f25517R0.setScaleY(f2);
            this.f25517R0.setAlpha(f);
            this.f25532a0.setAlpha(f * 0.6f);
        }
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001) {
            this.f25550j0.m23926B(i2, intent);
            return;
        }
        int g = this.f25547h1.m21470g(i);
        if (g >= 0) {
            this.f25547h1.m21465l(g);
            this.f25547h1.m21463o(g).mo10181t(i, i2, intent);
            return;
        }
        AbstractC9323v4<?> l = this.f25526X.m9748M().m9501l();
        if (l instanceof AbstractC9142a) {
            ((AbstractC9142a) l).mo10181t(i, i2, intent);
        }
        if (!this.f25537c1.isEmpty()) {
            for (int size = this.f25537c1.size() - 1; size >= 0; size--) {
                this.f25537c1.get(size).mo10181t(i, i2, intent);
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (this.f25500I0) {
            super.onBackPressed();
        } else {
            m14524W1(false);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        C2536ii iiVar;
        super.onConfigurationChanged(configuration);
        boolean d = C1357a0.m37549d();
        this.f25526X.m9686y(configuration);
        if (this.f25500I0 && (iiVar = this.f25502J0) != null) {
            iiVar.mo9208mc(configuration);
        }
        View$OnClickListenerC4045k kVar = this.f25559n1;
        if (kVar != null) {
            kVar.mo9208mc(configuration);
        }
        this.f25538d0 = configuration.orientation;
        C4403w.m27829t();
        m14440s3(configuration.uiMode & 48);
        if (d) {
            recreate();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        C1379j0.m37329h0(this);
        C4858a.m24994b();
        C4858a.m24995a();
        this.f25550j0 = new C5120j(this);
        this.f25546h0 = new C9746h0(this);
        this.f25548i0 = new C9789y(this);
        this.f25534b0 = new C1406w(this);
        this.f25520U = new Handler(this);
        C1379j0.m37332g(this);
        m14569K3();
        if (C4183a.f14106x) {
            this.f25568s0 = !C11524j.m141z0();
        }
        m14538S2(0);
        C10536ab.m4667o1().m4694g3().m28138q(this);
        C4862d.m24935w().m24953d();
        try {
            super.onCreate(bundle);
            C1357a0.m37549d();
            this.f25540e0 = m14493f1();
            this.f25538d0 = C1379j0.m37294z();
            if (mo14547Q1()) {
                View$OnClickListenerC9218k0 k0Var = new View$OnClickListenerC9218k0(this);
                this.f25530Z = k0Var;
                k0Var.get();
            }
            C9270q1 q1Var = new C9270q1(this);
            this.f25526X = q1Var;
            this.f25528Y = new GestureDetector$OnGestureListenerC9285r1(this, q1Var, this.f25530Z);
            C6864e eVar = new C6864e(this);
            this.f25522V = eVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 17) {
                eVar.setLayoutDirection(0);
            }
            this.f25522V.setKeyboardListener(this);
            this.f25522V.m18045Q1(false);
            this.f25522V.setId(R.id.app_root);
            C9179e1 e1Var = new C9179e1(this);
            this.f25524W = e1Var;
            e1Var.setId(R.id.app_container);
            View view = new View(this);
            this.f25542f0 = view;
            view.setFocusable(true);
            this.f25542f0.setFocusableInTouchMode(true);
            this.f25542f0.setLayoutParams(FrameLayoutFix.m18007t1(1, 1, 17));
            this.f25524W.addView(this.f25542f0);
            this.f25524W.addView(this.f25526X.get());
            this.f25524W.addView(this.f25548i0.m6950I0());
            View$OnClickListenerC9218k0 k0Var2 = this.f25530Z;
            if (k0Var2 != null) {
                this.f25524W.addView(k0Var2.get());
            }
            this.f25522V.addView(this.f25524W);
            m14458o0(false);
            if (i >= 21) {
                RunnableC7091z1 z1Var = new RunnableC7091z1(this);
                this.f25562p0 = z1Var;
                z1Var.m17775C1(this.f25577w1);
                this.f25522V.addView(this.f25562p0);
            }
            setContentView(this.f25522V);
            C11541z.m7t().m23f(this);
            m14490g0();
            m14553P(this.f25546h0);
            Log.initLibraries(this);
            if (m14543R1()) {
                C10536ab.m4667o1().m4636w2().m7030p(this);
                C10536ab.m4667o1().m4802F2();
            }
            C4403w.m27877h(this);
        } catch (Throwable th) {
            Tracer.m14768l(th);
            throw th;
        }
    }

    @Override
    public void onDestroy() {
        C2536ii iiVar;
        try {
            super.onDestroy();
            C9270q1 q1Var = this.f25526X;
            if (q1Var != null) {
                q1Var.m9684z();
            }
            C4403w.m27990F2(this);
            RunnableC7091z1 z1Var = this.f25562p0;
            if (z1Var != null) {
                z1Var.mo4501a3();
            }
            C11052v1.m1768b().m1766d(this);
            C10536ab.m4667o1().m4694g3().m28137r(this);
            C1405v.m37137I();
            m14538S2(2);
            if (this.f25500I0 && (iiVar = this.f25502J0) != null) {
                iiVar.mo6929S4();
            }
            m14535T1();
            if (!this.f25537c1.isEmpty()) {
                for (int size = this.f25537c1.size() - 1; size >= 0; size--) {
                    this.f25537c1.get(size).mo6929S4();
                }
            }
            if (this.f25541e1.m21464n() > 0) {
                for (int i = 0; i < this.f25541e1.m21464n(); i++) {
                    this.f25541e1.m21463o(i).mo6929S4();
                }
            }
            m14490g0();
            C1379j0.m37330h(this);
            C10536ab.m4667o1().m4636w2().m7087Q0(this);
        } catch (Throwable th) {
            Tracer.m14768l(th);
            throw th;
        }
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<AbstractC7898i> it = this.f25560o0.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC7898i next = it.next();
            if (!z && next.onKeyDown(i, keyEvent)) {
                z = true;
            }
        }
        return z || super.onKeyDown(i, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator<AbstractC7898i> it = this.f25560o0.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AbstractC7898i next = it.next();
            if (!z && next.onKeyUp(i, keyEvent)) {
                z = true;
            }
        }
        return z || super.onKeyUp(i, keyEvent);
    }

    @Override
    public void onPause() {
        C2536ii iiVar;
        m14498e0();
        m14538S2(1);
        View$OnClickListenerC4045k kVar = this.f25559n1;
        if (kVar != null) {
            kVar.mo6904d6();
        }
        if (this.f25500I0 && (iiVar = this.f25502J0) != null) {
            iiVar.mo6904d6();
        }
        m14531U1();
        if (!this.f25537c1.isEmpty()) {
            Iterator<C6924j2> it = this.f25537c1.iterator();
            while (it.hasNext()) {
                it.next().mo6904d6();
            }
        }
        if (this.f25541e1.m21464n() > 0) {
            for (int i = 0; i < this.f25541e1.m21464n(); i++) {
                this.f25541e1.m21463o(i).mo6904d6();
            }
        }
        m14471k3(false);
        try {
            super.onPause();
            m14490g0();
            try {
                unregisterReceiver(this.f25486B0);
            } catch (Throwable th) {
                Log.m14708w(th);
            }
        } catch (Throwable th2) {
            Tracer.m14768l(th2);
            throw th2;
        }
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        AbstractC5096a e;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length != 0) {
            boolean z = false;
            if (i != 2) {
                if (i == 7) {
                    for (String str : strArr) {
                        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                            i2 = 6;
                            break;
                        }
                    }
                    i2 = 0;
                    if (!(i2 == 0 || (e = this.f25549i1.m21472e(i2)) == null)) {
                        if (iArr[0] == 0) {
                            z = true;
                        }
                        e.mo4252o1(i2, z);
                        return;
                    }
                } else if (i == 8) {
                    AbstractC5096a aVar = this.f25543f1;
                    if (aVar != null) {
                        if (iArr[0] == 0) {
                            z = true;
                        }
                        aVar.mo4252o1(i, z);
                        this.f25543f1 = null;
                        return;
                    }
                    return;
                } else if (i == 9) {
                    AbstractC5096a aVar2 = this.f25545g1;
                    if (aVar2 != null) {
                        if (iArr[0] == 0) {
                            z = true;
                        }
                        aVar2.mo4252o1(i, z);
                        this.f25545g1 = null;
                        return;
                    }
                    return;
                }
                C6924j2 N0 = m14558N0();
                if (N0 != null) {
                    if (iArr[0] == 0) {
                        z = true;
                    }
                    N0.mo6938O0(i, z);
                    return;
                }
                AbstractC9323v4<?> F = this.f25526X.m9762F();
                if (F != null) {
                    if (iArr[0] == 0) {
                        z = true;
                    }
                    F.mo9469Bc(i, z);
                }
            } else if (iArr[0] == 0) {
                C1379j0.m37346Y(this);
            } else {
                C1379j0.m37295y0(R.string.cam_hint, 0);
            }
        }
    }

    @Override
    public void onResume() {
        C2536ii iiVar;
        boolean z = this.f25500I0;
        C1379j0.m37329h0(this);
        m14538S2(0);
        C4862d.m24935w().m24953d();
        m14458o0(false);
        if (this.f25500I0 && z && (iiVar = this.f25502J0) != null) {
            iiVar.mo6871o6();
        }
        m14527V1();
        if (!this.f25537c1.isEmpty()) {
            Iterator<C6924j2> it = this.f25537c1.iterator();
            while (it.hasNext()) {
                it.next().mo6871o6();
            }
        }
        if (this.f25541e1.m21464n() > 0) {
            for (int i = 0; i < this.f25541e1.m21464n(); i++) {
                this.f25541e1.m21463o(i).mo6871o6();
            }
        }
        m14471k3(true);
        try {
            super.onResume();
            m14490g0();
            C1405v.m37137I();
            m14596F0();
            if (this.f25484A0 == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f25484A0 = intentFilter;
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f25484A0.addAction("android.intent.action.TIME_SET");
            }
            try {
                registerReceiver(this.f25486B0, this.f25484A0);
            } catch (Throwable th) {
                Log.m14708w(th);
            }
            C4868i.m24727c2().m24900E(true);
            this.f25550j0.m23902m();
        } catch (Throwable th2) {
            Tracer.m14768l(th2);
            throw th2;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        this.f25528Y.m9637e();
        try {
            super.onSaveInstanceState(bundle);
        } catch (Throwable th) {
            Tracer.m14768l(th);
            throw th;
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 5) {
            boolean z = false;
            float f = sensorEvent.values[0];
            if (!m14539S1()) {
                return;
            }
            if (this.f25497G1 != f || this.f25499H1) {
                this.f25497G1 = f;
                this.f25499H1 = false;
                Iterator<AbstractC7899j> it = this.f25495F1.iterator();
                while (it.hasNext()) {
                    it.next().mo14405a(f);
                }
                if (f <= C4868i.m24727c2().m24680i1()) {
                    z = true;
                }
                m14503c3(z);
            }
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector$OnGestureListenerC9285r1 r1Var = this.f25528Y;
        return r1Var != null && !this.f25512O0 && r1Var.m9635g(motionEvent);
    }

    public void m14454p0(boolean z) {
        if (z) {
            Iterator<C6924j2> it = this.f25537c1.iterator();
            while (it.hasNext()) {
                C6924j2 next = it.next();
                if (next.getBoundController() instanceof View$OnClickListenerC7430j1) {
                    ((View$OnClickListenerC7430j1) next.getBoundController()).m16124sk();
                }
            }
            for (int i = 0; i < this.f25541e1.m21464n(); i++) {
                C6924j2 o = this.f25541e1.m21463o(i);
                if (o != null && (o.getBoundController() instanceof View$OnClickListenerC7430j1)) {
                    ((View$OnClickListenerC7430j1) o.getBoundController()).m16124sk();
                }
            }
            return;
        }
        m14434u0();
    }

    public C1406w m14453p1() {
        return this.f25534b0;
    }

    public void m14452p2(int i, AbstractC9142a aVar) {
        if (aVar != null) {
            this.f25547h1.m21467j(i, aVar);
        } else {
            this.f25547h1.m21466k(i);
        }
    }

    public final void m14451p3(boolean z) {
        SensorManager sensorManager;
        if (this.f25487B1 != z) {
            try {
                if (this.f25489C1 == null) {
                    this.f25489C1 = (SensorManager) getSystemService("sensor");
                }
                if (this.f25491D1 == null && (sensorManager = this.f25489C1) != null) {
                    this.f25491D1 = sensorManager.getDefaultSensor(5);
                }
                boolean z2 = z && this.f25491D1 != null;
                if (this.f25487B1 == z2) {
                    Log.m14721i((int) Log.TAG_LUX, "Cannot register light sensor, because it's unavailable", new Object[0]);
                    return;
                }
                if (z2) {
                    this.f25505K1 = C11524j.m141z0();
                    this.f25499H1 = true;
                    if (Build.VERSION.SDK_INT >= 19) {
                        this.f25489C1.registerListener(this, this.f25491D1, 3, this.f25493E1 ? 90000 : 700000);
                    } else {
                        this.f25489C1.registerListener(this, this.f25491D1, 3);
                    }
                } else {
                    this.f25489C1.unregisterListener(this, this.f25491D1);
                }
                this.f25487B1 = z2;
            } catch (Throwable th) {
                Object[] objArr = new Object[1];
                objArr[0] = z ? "register" : "unregister";
                Log.m14712w(Log.TAG_LUX, "Cannot %s light sensor", th, objArr);
            }
        }
    }

    @Override
    public void mo133q0(int i) {
        this.f25503J1 = false;
        this.f25520U.post(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnTouchListenerC7889a.this.m14490g0();
            }
        });
    }

    public boolean m14450q1() {
        return this.f25553k1 || this.f25561o1 || m14423w1();
    }

    public void m14449q2() {
        if (this.f25575v1) {
            this.f25559n1.m29194dg(0, null);
            this.f25575v1 = false;
        }
    }

    public void m14448q3(C9145a2 a2Var) {
        this.f25539d1 = a2Var;
    }

    public void m14447r0() {
        if (!this.f25559n1.m29239Af() && !this.f25563p1) {
            m14526V2(false);
            m14520X2(null, false, false);
        }
    }

    public void m14445r2(AbstractC7897h hVar) {
        this.f25536c0.remove(hVar);
    }

    public void m14444r3(int i, boolean z) {
        int i2 = this.f25507L1;
        boolean z2 = true;
        boolean z3 = i2 != 0;
        int h = C5063c.m24139h(i2, i, z);
        this.f25507L1 = h;
        if (h == 0) {
            z2 = false;
        }
        if (z3 == z2) {
            return;
        }
        if (z2) {
            getWindow().addFlags(Log.TAG_YOUTUBE);
        } else {
            getWindow().clearFlags(Log.TAG_YOUTUBE);
        }
    }

    public void removeFromNavigation(View view) {
        ((ViewGroup) this.f25526X.get()).removeView(view);
    }

    public void removeFromRoot(View view) {
        try {
            this.f25522V.removeView(view);
        } catch (NullPointerException e) {
            Log.m14718i(e);
        }
    }

    public void m14443s0(TdApi.File[] fileArr) {
        View$OnClickListenerC7430j1 j1Var;
        TdApi.File ni;
        int n = this.f25541e1.m21464n();
        for (int i = 0; i < n; i++) {
            C6924j2 o = this.f25541e1.m21463o(i);
            if (o != null && (o.getBoundController() instanceof View$OnClickListenerC7430j1) && (ni = (j1Var = (View$OnClickListenerC7430j1) o.getBoundController()).m16167ni()) != null) {
                int length = fileArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (ni.f25376id == fileArr[i2].f25376id) {
                            j1Var.m16427Hh();
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public boolean m14442s1(boolean z) {
        View$OnClickListenerC9218k0 k0Var;
        C3950k kVar;
        C9270q1 q1Var = this.f25526X;
        return (q1Var != null && (!z ? q1Var.m9741S() : q1Var.m9739U())) || ((k0Var = this.f25530Z) != null && k0Var.m9959Df()) || this.f25512O0 || ((kVar = this.f25557m1) != null && kVar.m29533v());
    }

    public final void m14441s2() {
        for (int size = this.f25537c1.size() - 1; size >= 0; size--) {
            this.f25537c1.get(size).m18409x2();
        }
    }

    public final void m14440s3(int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a.m14440s3(int):void");
    }

    public void m14439t0() {
        C6924j2 j2Var = this.f25531Z0;
        if (j2Var != null) {
            j2Var.m18408y2(true);
            this.f25531Z0 = null;
            this.f25533a1 = null;
        }
    }

    public void m14437t2(AbstractC9323v4<?> v4Var, boolean z) {
        List<AbstractC9323v4<?>> list = z ? this.f25576w0 : this.f25574v0;
        if (list != null && list.remove(v4Var)) {
            m14507b3(z ? 8 : 4, !list.isEmpty());
        }
    }

    public final void m14436t3(C10930q6 q6Var) {
        C10930q6 q6Var2 = this.f25552k0;
        if (q6Var2 != q6Var) {
            boolean z = false;
            if (q6Var2 != null) {
                boolean Z6 = q6Var2.m2553Z6();
                this.f25552k0.m2422hc(false);
                z = Z6;
            }
            this.f25552k0 = q6Var;
            this.f25548i0.m6895g1(q6Var);
            q6Var.m2422hc(z);
            View$OnClickListenerC9218k0 k0Var = this.f25530Z;
            if (k0Var != null) {
                k0Var.m9930Xf(q6Var);
            }
            mo14511a2();
        }
    }

    public void m14434u0() {
        int n = this.f25541e1.m21464n();
        for (int i = 0; i < n; i++) {
            C6924j2 o = this.f25541e1.m21463o(i);
            if (o != null) {
                if (o.getBoundController() instanceof View$OnClickListenerC7430j1) {
                    ((View$OnClickListenerC7430j1) o.getBoundController()).m16427Hh();
                } else if (o.getBoundView() instanceof AbstractView$OnClickListenerC0259c) {
                    ((AbstractView$OnClickListenerC0259c) o.getBoundView()).mo41915G1(true);
                }
            }
        }
    }

    public final void m14432u2(C11537v vVar) {
        this.f25579x1.remove(vVar);
    }

    public void m14431u3(int i, boolean z) {
        boolean z2;
        int i2;
        View decorView = getWindow().getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26 || !C4183a.f14106x || C11524j.m141z0() || (i & 4) != 0) {
            z2 = false;
            i2 = i;
        } else {
            i2 = i | 16;
            z2 = true;
        }
        if (i3 >= 23 && C11524j.m249C0()) {
            i2 |= Log.TAG_LUX;
        }
        decorView.setSystemUiVisibility(i2);
        if (this.f25568s0 != z2) {
            this.f25568s0 = z2;
            m14574J3();
        }
        this.f25566r0 = i;
        if (z) {
            this.f25564q0 = i;
        }
    }

    public void m14429v0() {
        C6924j2 j2Var = this.f25525W0;
        if (j2Var != null) {
            j2Var.m18408y2(true);
            this.f25525W0 = null;
            this.f25527X0 = null;
        }
    }

    public boolean m14428v1() {
        return this.f25490D0;
    }

    public void m14427v2(AbstractC7898i iVar) {
        this.f25560o0.remove(iVar);
    }

    public final void m14426v3(int i, int i2) {
        getWindow().setFlags(i, i2);
    }

    public final void m14424w0(AbstractC9323v4<?> v4Var) {
        List<AbstractC9323v4<?>> list = this.f25511N1;
        int indexOf = list != null ? list.indexOf(v4Var) : -1;
        if (indexOf != -1) {
            this.f25511N1.remove(indexOf);
            this.f25513O1.m18084J1(v4Var.m9463Ca(), true);
        }
    }

    public boolean m14423w1() {
        return this.f25548i0.m6909c0() || m14501d1() || this.f25526X.m9741S() || this.f25526X.m9756I().m10039o3();
    }

    public void m14422w2(AbstractC7899j jVar) {
        this.f25495F1.remove(jVar);
        m14475j3(!this.f25495F1.isEmpty());
    }

    public final AlertDialog m14421w3(AlertDialog.Builder builder) {
        return m14416x3(builder, null);
    }

    public final void m14419x0(Class<? extends AbstractC9323v4<?>> cls) {
        List<AbstractC9323v4<?>> list = this.f25511N1;
        if (list != null) {
            for (AbstractC9323v4<?> v4Var : list) {
                if (v4Var.getClass() == cls) {
                    m14424w0(v4Var);
                    return;
                }
            }
        }
    }

    public final boolean m14418x1() {
        View$OnClickListenerC4045k kVar = this.f25559n1;
        return (kVar == null || this.f25575v1 || kVar.get().getParent() == null) ? false : true;
    }

    public void m14417x2() {
        C9356x1 x1Var = this.f25532a0;
        if (x1Var != null) {
            x1Var.setVisibility(8);
            C1399s0.m37184g0(this.f25532a0, 0);
            this.f25524W.removeView(this.f25532a0);
        }
    }

    public final AlertDialog m14416x3(AlertDialog.Builder builder, AbstractC11531p pVar) {
        if (isFinishing()) {
            return null;
        }
        try {
            AlertDialog show = builder.show();
            View findViewById = show.findViewById(16908299);
            if (findViewById != null) {
                if (this.f25558n0 == null) {
                    this.f25558n0 = new ArrayList();
                    C11052v1.m1768b().m1769a(this);
                }
                C6235i.m21016a(this.f25558n0, findViewById);
            }
            return m14557N1(show, pVar);
        } catch (Throwable th) {
            if (C1379j0.m37367F() == 0) {
                C1379j0.m37293z0("Failed to display system pop-up, see application log for details", 0);
            }
            Log.m14725e("Cannot show dialog", th, new Object[0]);
            return null;
        }
    }

    public boolean m14414y0(C6924j2 j2Var) {
        for (int n = this.f25541e1.m21464n() - 1; n >= 0; n--) {
            if (this.f25541e1.m21463o(n) == j2Var) {
                this.f25541e1.m21465l(n);
                return true;
            }
        }
        return false;
    }

    public boolean m14413y1() {
        return this.f25500I0;
    }

    public void m14412y2(AbstractC7900k kVar) {
        this.f25506L0.remove(kVar);
    }

    public void m14411y3(AbstractC9323v4<?> v4Var, C10930q6 q6Var, ArrayList<AbstractC4718o<?>> arrayList, boolean z, View$OnClickListenerC9694y.AbstractC9702h hVar) {
        if (this.f25535b1 == null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f25535b1 = new View$OnClickListenerC9694y(this);
            } else {
                return;
            }
        }
        if (arrayList != null && !arrayList.isEmpty() && this.f25535b1.getParent() == null) {
            m14517Z(this.f25535b1, false);
        }
        this.f25535b1.m7533v2(v4Var, arrayList, z, hVar, !v4Var.m9339Ta());
    }

    public final C10930q6 m14409z0() {
        C10930q6 q6Var = this.f25552k0;
        if (q6Var != null) {
            return q6Var;
        }
        throw new AssertionError();
    }

    public boolean m14408z1() {
        return this.f25564q0 != 0;
    }

    public final void m14407z2(AbstractC7902m mVar) {
        this.f25582z0.remove(mVar);
    }

    public void m14406z3(int i, int i2) {
        if (this.f25532a0 == null) {
            C9356x1 x1Var = new C9356x1(this);
            this.f25532a0 = x1Var;
            x1Var.setVisibility(8);
            this.f25532a0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        }
        if (this.f25532a0.getParent() != null) {
            this.f25524W.removeView(this.f25532a0);
        }
        this.f25532a0.m8993a(i, i2);
        if (i2 != 2) {
            this.f25532a0.setAlpha(0.0f);
        }
        this.f25532a0.setVisibility(0);
        C1399s0.m37184g0(this.f25532a0, 2);
        View$OnClickListenerC9218k0 k0Var = this.f25530Z;
        int indexOfChild = k0Var != null ? this.f25524W.indexOfChild(k0Var.get()) : -1;
        if (indexOfChild == -1) {
            this.f25524W.addView(this.f25532a0);
        } else {
            this.f25524W.addView(this.f25532a0, indexOfChild);
        }
    }
}
