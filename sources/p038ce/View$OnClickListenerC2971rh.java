package p038ce;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import be.C1357a0;
import be.C1362c;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1405v;
import be.C1408x;
import be.C1410y;
import cd.C2104l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import de.C4023a;
import gb.C4534a;
import gd.AbstractC4761s4;
import gd.C4609c7;
import gd.C4640g;
import gd.C4695l6;
import gd.C4729p;
import gd.C4737p7;
import gd.C4747r;
import gd.C4779t2;
import gd.C4822w2;
import gd.C4837y0;
import ge.C4859b;
import ge.C4868i;
import id.C5335c;
import id.C5349g0;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.C6847b2;
import me.C6851c0;
import me.C6855c3;
import me.C6862d3;
import me.C6910i0;
import me.C6922j0;
import me.C6924j2;
import me.C6957m1;
import me.C6971m4;
import me.C6973n0;
import me.C6977n2;
import me.C6979n4;
import me.C7008q2;
import me.C7040u3;
import me.C7045v2;
import me.C7057w;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.C7907b;
import org.thunderdog.challegram.p211v.HeaderEditText;
import org.thunderdog.challegram.p211v.MessagesLayoutManager;
import org.thunderdog.challegram.p211v.MessagesRecyclerView;
import p037cb.C2057b;
import p038ce.C2869p9;
import p038ce.C2912q9;
import p038ce.RunnableC2374f5;
import p038ce.View$OnClickListenerC2280d6;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.View$OnClickListenerC3062so;
import p038ce.i10;
import p038ce.x00;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p057e2.AbstractC4117a;
import p067ed.C4183a;
import p075f6.AbstractC4280e;
import p075f6.C4282f;
import p075f6.C4284g;
import p075f6.C4289i;
import p082fd.C4356b0;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.AbstractC5117h0;
import p111he.AbstractC5123k;
import p111he.AbstractC5129m0;
import p111he.AbstractC5155y0;
import p111he.C5115g0;
import p111he.C5127l0;
import p111he.C5146u0;
import p111he.View$OnTouchListenerC5103c0;
import p124ib.C5320c;
import p124ib.C5322e;
import p124ib.C5323f;
import p133j5.AbstractC5867f;
import p133j5.AbstractC5876k;
import p133j5.AbstractC5877l;
import p139jb.AbstractC5913e;
import p139jb.AbstractC5916h;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5920l;
import p139jb.AbstractRunnableC5910b;
import p141jd.C5974t0;
import p141jd.RunnableC5938f;
import p141jd.RunnableC5952j1;
import p143k0.C6035e;
import p143k0.C6038h;
import p156kd.C6253l;
import p156kd.C6259q;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p194nd.AbstractC7459k1;
import p194nd.AbstractC7513y;
import p194nd.C7462l1;
import p194nd.C7484p1;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8112b;
import p225pd.C8113c;
import p253rc.AbstractC8424a;
import p291uc.C9492a;
import p291uc.C9501b;
import p291uc.C9513d;
import p291uc.C9534f;
import p291uc.C9540f4;
import p291uc.C9549h;
import p291uc.C9552h1;
import p291uc.C9565i1;
import p291uc.C9580j1;
import p291uc.C9585k0;
import p291uc.C9586k1;
import p291uc.C9597l1;
import p291uc.C9606l4;
import p291uc.C9615n0;
import p291uc.C9620n4;
import p291uc.C9639r;
import p291uc.C9678w2;
import p291uc.C9686w3;
import p291uc.C9691x3;
import p291uc.C9717z3;
import p291uc.RunnableC9558i0;
import p291uc.View$OnClickListenerC9530e4;
import p291uc.View$OnClickListenerC9592k4;
import p291uc.View$OnClickListenerC9599l3;
import p291uc.View$OnClickListenerC9659t3;
import p291uc.View$OnClickListenerC9694y;
import p291uc.ViewTreeObserver$OnPreDrawListenerC9542g;
import p292ud.C9746h0;
import p292ud.C9789y;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10817l1;
import p350yd.AbstractC11030u0;
import p350yd.C10536ab;
import p350yd.C10721i0;
import p350yd.C10733ic;
import p350yd.C10791k1;
import p350yd.C10930q6;
import p350yd.C11008t0;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.C11059v7;
import p350yd.C11131y6;
import p350yd.HandlerC10770jj;
import p363zc.C11504x;
import p363zc.View$OnClickListenerC11498s;
import p364zd.C11520h;
import p364zd.C11524j;
import p364zd.C11541z;
import sc.C8731d;
import sc.View$OnClickListenerC8750f0;
import sc.View$OnClickListenerC8851y1;
import tc.C9137c;
import td.AbstractC9142a;
import td.AbstractC9174d2;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.AbstractC9376x4;
import td.C9180e2;
import td.C9188f2;
import td.C9202h2;
import td.C9239m;
import td.C9270q1;
import td.C9289s;
import td.C9310u0;
import td.C9312u1;
import td.C9319v1;
import td.C9357x2;
import td.C9391z4;
import td.View$OnClickListenerC9156b5;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2971rh extends AbstractC9323v4<C2977c0> implements AbstractC9201h1, AbstractC5155y0, View.OnClickListener, AbstractC9142a, AbstractC9213j1, AbstractC5117h0, ViewTreeObserver$OnPreDrawListenerC9542g.AbstractC9543a, AbstractC8424a, AbstractC9174d2, View$OnClickListenerC9659t3.AbstractC9660a, View$OnClickListenerC9530e4.AbstractC9533c, C11052v1.AbstractC11053a, C9534f.AbstractC9535a, AbstractC10747j0, AbstractC10817l1, ViewTreeObserver$OnPreDrawListenerC7081z0.AbstractC7087f, C11059v7.AbstractC11067h, C11059v7.AbstractC11061b, C11059v7.AbstractC11066g, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j, C3950k.AbstractC3952b, C9691x3.AbstractC9692a, AbstractC7459k1, C6957m1.AbstractC6967j, C4868i.AbstractC4890u, C9789y.AbstractC9804o, ViewPager.AbstractC1054i, View$OnClickListenerC9156b5.AbstractC9159c, AbstractC4761s4.AbstractC4771j, AbstractC11030u0, C9639r.AbstractC9641b, C9239m.AbstractC9242c, C5974t0.AbstractC5975a, View$OnClickListenerC2280d6.AbstractC2286e, View$OnTouchListenerC5103c0.AbstractC5106c, View$OnTouchListenerC5103c0.AbstractC5105b, C10733ic.AbstractC10735b {
    public static HashSet<String> f9871B3;
    public C6862d3 f9872A0;
    public TdApi.ChatMember f9873A1;
    public C6910i0.AbstractC6913c f9874A2;
    public boolean f9875A3;
    public boolean f9876B0;
    public Object f9877B1;
    public C5974t0 f9878B2;
    public ViewTreeObserver$OnPreDrawListenerC7081z0 f9879C0;
    public C6035e<AbstractC4761s4> f9880C1;
    public C4729p f9881C2;
    public C9492a f9882D0;
    public C3950k f9883D1;
    public AbstractRunnableC5910b f9884D2;
    public ImageView f9885E0;
    public float f9886E1;
    public C4534a f9887E2;
    public C9540f4 f9888F0;
    public C9513d f9889F1;
    public RecyclerView f9890F2;
    public C6855c3 f9891G0;
    public int f9892G1;
    public C9691x3 f9893G2;
    public View$OnTouchListenerC5103c0 f9894H0;
    public boolean f9895H1;
    public boolean f9896H2;
    public C9585k0 f9897I0;
    public final C3940f f9898I1;
    public C3950k f9899I2;
    public C9585k0 f9900J0;
    public FrameLayoutFix f9901J1;
    public float f9902J2;
    public C9585k0 f9903K0;
    public TextView f9904K1;
    public String f9905K2;
    public C9686w3 f9906L0;
    public boolean f9907L1;
    public TdApi.WebPage f9908L2;
    public C9620n4 f9909M0;
    public int f9910M1;
    public String f9911M2;
    public C6979n4 f9912N0;
    public String f9913N1;
    public boolean f9914N2;
    public FrameLayoutFix f9915O0;
    public final C3940f f9916O1;
    public boolean f9917O2;
    public FrameLayoutFix f9918P0;
    public final C3940f f9919P1;
    public long f9920P2;
    public C6851c0 f9921Q0;
    public C3950k f9922Q1;
    public TdApi.ChatAdministrators f9923Q2;
    public C6851c0 f9924R0;
    public boolean f9925R1;
    public AbstractC5918j<TdApi.ChatAdministrators> f9926R2;
    public C9549h f9927S0;
    public float f9929S2;
    public C9549h f9930T0;
    public int f9931T1;
    public final C3940f f9932T2;
    public TdApi.Message f9934U1;
    public boolean f9935U2;
    public C9620n4 f9936V0;
    public View$OnClickListenerC9659t3 f9937V1;
    public boolean f9938V2;
    public RecyclerView f9939W0;
    public C6910i0 f9940W1;
    public boolean f9941W2;
    public C7484p1 f9942X0;
    public C9717z3 f9943X1;
    public AbstractRunnableC5910b f9944X2;
    public C2979d0 f9945Y0;
    public C6910i0.AbstractC6913c f9946Y1;
    public int f9947Y2;
    public C7045v2 f9948Z0;
    public C6973n0 f9949Z1;
    public SparseIntArray f9950Z2;
    public C9391z4 f9951a1;
    public C6910i0.AbstractC6913c f9952a2;
    public boolean f9953a3;
    public float f9954b1;
    public View$OnClickListenerC9599l3 f9955b2;
    public boolean f9956b3;
    public int f9957c1;
    public C6910i0.AbstractC6913c f9958c2;
    public boolean f9959c3;
    public boolean f9960d1;
    public C9615n0 f9961d2;
    public boolean f9962d3;
    public C6910i0.AbstractC6913c f9964e2;
    public boolean f9965e3;
    public boolean f9966f1;
    public boolean f9967f2;
    public View$OnClickListenerC9530e4 f9968f3;
    public boolean f9969g1;
    public int f9970g2;
    public FrameLayoutFix f9971g3;
    public boolean f9972h1;
    public int f9973h2;
    public C7008q2 f9974h3;
    public int f9975i1;
    public int f9976i2;
    public ImageView f9977i3;
    public String f9978j1;
    public float f9979j2;
    public ImageView f9980j3;
    public TdApi.MessageSender f9981k1;
    public TdApi.Message f9982k2;
    public ImageView f9983k3;
    public TdApi.SearchMessagesFilter f9984l1;
    public int f9985l2;
    public ImageView f9986l3;
    public C4737p7 f9987m1;
    public int f9988m2;
    public TextView f9989m3;
    public boolean f9990n0;
    public boolean f9991n1;
    public boolean f9992n2;
    public C6977n2 f9993n3;
    public boolean f9994o0;
    public C2981e0 f9995o1;
    public boolean f9996o2;
    public boolean f9997o3;
    public int f9998p0;
    public TdApi.InternalLinkTypeVideoChat f9999p1;
    public long f10000p2;
    public float f10001p3;
    public TdApi.Chat f10002q0;
    public boolean f10003q1;
    public TdApi.ReplyMarkupShowKeyboard f10004q2;
    public C3950k f10005q3;
    public TdApi.ChatList f10006r0;
    public long f10007r1;
    public ScrollView f10008r2;
    public TdApi.Function f10009r3;
    public C9534f f10010s0;
    public boolean f10011s1;
    public ViewTreeObserver$OnPreDrawListenerC9542g f10012s2;
    public boolean f10013s3;
    public C9289s f10014t0;
    public Object f10015t1;
    public float f10016t2;
    public boolean f10017t3;
    public C9597l1 f10018u0;
    public AbstractC5123k f10019u1;
    public long f10020u2;
    public C3950k f10021u3;
    public LinearLayout f10022v0;
    public C9357x2.C9370l f10023v1;
    public TdApi.ReplyMarkupShowKeyboard f10024v2;
    public MessagesRecyclerView f10026w0;
    public boolean f10027w1;
    public AbstractC5867f f10028w2;
    public boolean f10031x1;
    public boolean f10032x2;
    public RunnableC5938f f10034y0;
    public boolean f10035y1;
    public long f10036y2;
    public RunnableC9558i0 f10038z0;
    public AbstractC4761s4 f10039z1;
    public View f10040z2;
    public String f10041z3;
    public boolean f9933U0 = false;
    public int f9963e1 = 0;
    public float f9928S1 = 1.0f;
    public float f10025v3 = -1.0f;
    public float f10029w3 = -1.0f;
    public int f10033x3 = -1;
    public int f10037y3 = -1;
    public final C9678w2 f10030x0 = new C9678w2(this);

    public class C2972a implements C7484p1.AbstractC7485a {
        public C2972a() {
        }

        @Override
        public void mo15839U0(C7484p1 p1Var, float f) {
            float[] fArr = C4868i.f16615S;
            if (C4868i.m24726c2().m24644m4(fArr[Math.round(f * (fArr.length - 1))])) {
                View$OnClickListenerC2971rh.this.f10030x0.m7638s2();
            }
        }

        @Override
        public void mo15838q2(C7484p1 p1Var, boolean z) {
            if (!z) {
                float value = p1Var.getValue();
                float[] fArr = C4868i.f16615S;
                p1Var.m15847b(Math.round(value * (fArr.length - 1)) / (fArr.length - 1));
            }
        }

        @Override
        public boolean mo15837s0(C7484p1 p1Var) {
            return true;
        }
    }

    public class C2973a0 extends C9492a {
        public C2973a0(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View$OnClickListenerC2971rh.this.f10038z0 != null && getMeasuredWidth() > 0) {
                View$OnClickListenerC2971rh.this.f10038z0.m8291W();
            }
        }
    }

    public class C2974b implements C6979n4.AbstractC6980a {
        public C2974b() {
        }

        @Override
        public void mo18212a(float f) {
            View$OnClickListenerC2971rh.this.f9909M0.setAlpha(C5069h.m24089d(f));
        }

        @Override
        public void mo18211b(boolean z) {
            C6971m4.m18263a(this, z);
        }

        @Override
        public void mo18210c(float f) {
            C6971m4.m18262b(this, f);
        }
    }

    public class C2975b0 extends RecyclerView.AbstractC0901o {
        public C2975b0() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int i = C1357a0.m37541i(3.0f);
            rect.bottom = i;
            rect.top = i;
            RecyclerView.AbstractC0886d0 l0 = recyclerView.m39418l0(view);
            int k = l0 != null ? l0.m39335k() : -1;
            if (l0 == null || l0.m39332n() != 0 || k == -1) {
                rect.right = 0;
                rect.left = 0;
            } else if (C4403w.m27984G2()) {
                rect.right = i;
                if (k != recyclerView.getAdapter().mo6153D() - 1) {
                    i = 0;
                }
                rect.left = i;
            } else {
                rect.left = i;
                if (k != recyclerView.getAdapter().mo6153D() - 1) {
                    i = 0;
                }
                rect.right = i;
            }
        }
    }

    public class C2976c implements C6979n4.AbstractC6980a {
        public final int f10046a;

        public C2976c(int i) {
            this.f10046a = i;
        }

        @Override
        public void mo18212a(float f) {
            View$OnClickListenerC2971rh.this.f9909M0.setAlpha(C5069h.m24089d(f));
        }

        @Override
        public void mo18211b(boolean z) {
            C6971m4.m18263a(this, z);
        }

        @Override
        public void mo18210c(float f) {
            float d = C5069h.m24089d(f);
            View$OnClickListenerC2971rh.this.f9912N0.setTranslationY(this.f10046a * (1.0f - d));
            View$OnClickListenerC2971rh.this.f10026w0.setTranslationY(-(this.f10046a * d));
        }
    }

    public class C2978d extends C9513d {
        public C2978d(Context context, C10930q6 q6Var) {
            super(context, q6Var);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC2971rh.this.m32233sr();
        }
    }

    public static class C2979d0 extends AbstractC4117a {
        public boolean f10066M;
        public final List<i10<?>> f10067N;
        public final C6038h<i10<?>> f10068O = new C6038h<>();
        public final View$OnClickListenerC2971rh f10069c;

        public C2979d0(View$OnClickListenerC2971rh rhVar, List<i10<?>> list) {
            this.f10069c = rhVar;
            this.f10067N = list;
        }

        @Override
        public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof View$OnClickListenerC2971rh) {
                viewGroup.removeView(((View$OnClickListenerC2971rh) obj).f10018u0);
            } else {
                viewGroup.removeView(((AbstractC9323v4) obj).get());
            }
        }

        @Override
        public int mo8825e() {
            if (this.f10066M) {
                return 1;
            }
            return 1 + this.f10067N.size();
        }

        @Override
        public Object mo8823j(ViewGroup viewGroup, int i) {
            if (i == 0) {
                viewGroup.addView(this.f10069c.f10018u0);
                return this.f10069c;
            }
            i10<?> e = this.f10068O.m21471e(i);
            if (e == null) {
                e = this.f10067N.get(i - 1);
                e.m34408Bg(new i10.C2519d(this.f10069c.mo9464C9(), this.f10069c.m32266qk()));
                e.m34402Fg(this.f10069c);
                this.f10068O.m21466j(i, e);
                e.m9354R8(this.f10069c);
                String str = this.f10069c.f10041z3;
                if (!C5070i.m24061i(str)) {
                    e.get();
                    e.m34410Ag(str);
                }
            }
            viewGroup.addView(e.get());
            return e;
        }

        @Override
        public boolean mo8822k(View view, Object obj) {
            return obj instanceof View$OnClickListenerC2971rh ? ((View$OnClickListenerC2971rh) obj).f10018u0 == view : (obj instanceof AbstractC9323v4) && ((AbstractC9323v4) obj).get() == view;
        }

        public void m32133w() {
            int n = this.f10068O.m21463n();
            for (int i = 0; i < n; i++) {
                if (!this.f10068O.m21462o(i).m9347Sa()) {
                    this.f10068O.m21462o(i).mo417Z8();
                }
            }
            this.f10068O.m21474b();
        }
    }

    public class C2980e extends C7045v2 {
        public boolean f10070c1;

        public C2980e(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f10070c1 = false;
            }
            if (!this.f10070c1) {
                this.f10070c1 = getCurrentItem() == 0 && (C1379j0.m37307r(View$OnClickListenerC2971rh.this.mo4347s()).m14529V0().m6909c0() || (View$OnClickListenerC2971rh.this.f10038z0 != null && View$OnClickListenerC2971rh.this.f10038z0.getInlineSearchContext().m21679b0()));
            }
            return !this.f10070c1 && super.onInterceptTouchEvent(motionEvent);
        }
    }

    public static class C2981e0 {
        public final String f10072a;

        public C2981e0(String str) {
            this.f10072a = str;
        }
    }

    public class C2982f extends AbstractC5123k {
        public final long f10073b;

        public C2982f(long j) {
            this.f10073b = j;
        }

        public void m32131e(long j, TdApi.Object object) {
            if (!m23881b() && View$OnClickListenerC2971rh.this.mo9464C9() == j) {
                View$OnClickListenerC2971rh.this.f10030x0.m7776M2((TdApi.ChatAdministrators) object);
            }
        }

        @Override
        public void mo7438c(final TdApi.Object object) {
            if (object.getConstructor() == -2126186435) {
                HandlerC10770jj dd = View$OnClickListenerC2971rh.this.f30167b.m2485dd();
                final long j = this.f10073b;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2971rh.C2982f.this.m32131e(j, object);
                    }
                });
            }
        }
    }

    public class C2983g implements C3950k.AbstractC3952b {
        public C2983g() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            View$OnClickListenerC2971rh.this.f9921Q0.setRotation(f * 180.0f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3953l.m29526a(this, i, f, kVar);
        }
    }

    public class C2984h extends AnimatorListenerAdapter {
        public C2984h() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC2971rh.this.m32588Rp(false);
            View$OnClickListenerC2971rh.this.f9998p0 &= -2;
        }
    }

    public class C2985i extends AnimatorListenerAdapter {
        public C2985i() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC2971rh.this.m32588Rp(false);
            View$OnClickListenerC2971rh.this.f9937V1.m7842Z();
            View$OnClickListenerC2971rh.this.f9998p0 &= -2;
        }
    }

    public class C2986j extends AbstractRunnableC5910b {
        public final boolean[] f10078M;
        public final AbstractC4280e f10079N;
        public final AbstractC5867f f10080O;
        public final boolean f10081P;

        public C2986j(boolean[] zArr, AbstractC4280e eVar, AbstractC5867f fVar, boolean z) {
            this.f10078M = zArr;
            this.f10079N = eVar;
            this.f10080O = fVar;
            this.f10081P = z;
        }

        @Override
        public void mo1364b() {
            boolean[] zArr = this.f10078M;
            if (!zArr[0]) {
                zArr[0] = true;
                try {
                    C4282f.f14331b.mo921c(View$OnClickListenerC2971rh.this.f10028w2, this.f10079N);
                } catch (Throwable th) {
                    Log.m14710w("Error removeLocationUpdates", th, new Object[0]);
                }
                Location location = null;
                try {
                    location = C4282f.f14331b.mo922b(this.f10080O);
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    Log.m14710w("getLastLocation error", th2, new Object[0]);
                }
                if (location != null) {
                    View$OnClickListenerC2971rh.this.m32195vq(this.f10081P, location);
                } else {
                    View$OnClickListenerC2971rh.this.m32436dk(this.f10081P, false, true);
                }
            }
        }
    }

    public class C2987k extends LinearLayout {
        public C2987k(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            View$OnClickListenerC2971rh.this.m32220tr();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC2971rh.this.m32220tr();
        }
    }

    public class C2988l implements LocationListener {
        public final AbstractRunnableC5910b[] f10084a;
        public final LocationManager f10085b;
        public final boolean[] f10086c;
        public final boolean f10087d;

        public C2988l(AbstractRunnableC5910b[] bVarArr, LocationManager locationManager, boolean[] zArr, boolean z) {
            this.f10084a = bVarArr;
            this.f10085b = locationManager;
            this.f10086c = zArr;
            this.f10087d = z;
        }

        @Override
        public void onLocationChanged(Location location) {
            this.f10084a[0].m21857c();
            try {
                this.f10085b.removeUpdates(this);
            } catch (SecurityException unused) {
            } catch (Throwable th) {
                Log.m14710w("removeUpdates failed. Probable resource leak", th, new Object[0]);
            }
            boolean[] zArr = this.f10086c;
            if (!zArr[0]) {
                zArr[0] = true;
                View$OnClickListenerC2971rh.this.m32195vq(this.f10087d, location);
            }
        }

        @Override
        public void onProviderDisabled(String str) {
        }

        @Override
        public void onProviderEnabled(String str) {
        }

        @Override
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    public class C2989m extends AbstractRunnableC5910b {
        public final boolean[] f10089M;
        public final boolean f10090N;

        public C2989m(boolean[] zArr, boolean z) {
            this.f10089M = zArr;
            this.f10090N = z;
        }

        @Override
        public void mo1364b() {
            boolean[] zArr = this.f10089M;
            if (!zArr[0]) {
                zArr[0] = true;
                View$OnClickListenerC2971rh.this.m32436dk(this.f10090N, false, true);
            }
        }
    }

    public class C2990n implements AbstractC5129m0 {
        public final TdApi.Chat f10092a;

        public C2990n(TdApi.Chat chat) {
            this.f10092a = chat;
        }

        public void m32128c(boolean z, TdApi.Error error, RunnableC2374f5 f5Var, View view) {
            if (z || error == null) {
                f5Var.m9298Zb();
            } else {
                f5Var.mo4347s().m14584H3().m8985g(view).m8969F(f5Var, View$OnClickListenerC2971rh.this.f30167b, R.drawable.baseline_error_24, C4779t2.m25378z5(error));
            }
        }

        public void m32127d(final RunnableC2374f5 f5Var, final View view, final boolean z, final TdApi.Error error) {
            View$OnClickListenerC2971rh.this.m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.C2990n.this.m32128c(z, error, f5Var, view);
                }
            });
        }

        @Override
        public boolean mo23866A6() {
            return C5127l0.m23869a(this);
        }

        @Override
        public String mo23865D6() {
            return C5127l0.m23868b(this);
        }

        @Override
        public boolean mo23864X5(final RunnableC2374f5 f5Var, final View view, TdApi.MessageSender messageSender) {
            if (View$OnClickListenerC2971rh.this.f30167b.m2395j7(messageSender)) {
                return false;
            }
            View$OnClickListenerC2971rh.this.f30167b.m2811Ib(this.f10092a.f25367id, messageSender, new TdApi.ChatMemberStatusMember(), null, new C10930q6.AbstractC10939i() {
                @Override
                public final void mo1765a(boolean z, TdApi.Error error) {
                    View$OnClickListenerC2971rh.C2990n.this.m32127d(f5Var, view, z, error);
                }
            });
            return true;
        }

        @Override
        public void mo23863j(RunnableC2374f5 f5Var, TdApi.MessageSender messageSender, int i) {
            C5127l0.m23867c(this, f5Var, messageSender, i);
        }
    }

    public class C2991o extends AbstractRunnableC5910b {
        public C2991o() {
        }

        @Override
        public void mo1364b() {
            View$OnClickListenerC2971rh.this.f9940W1.m18474Q1(View$OnClickListenerC2971rh.this.f9952a2, false, true);
        }
    }

    public class C2992p extends RecyclerView {
        public C2992p(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return View$OnClickListenerC2971rh.this.f9896H2 && getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
        }
    }

    public class C2993q implements Client.AbstractC7865g {
        public final TdApi.MessageSchedulingState f10096M;
        public final AbstractC5917i f10097N;
        public final List f10099a;
        public final int f10100b;
        public final List f10101c;

        public C2993q(List list, int i, List list2, TdApi.MessageSchedulingState messageSchedulingState, AbstractC5917i iVar) {
            this.f10099a = list;
            this.f10100b = i;
            this.f10101c = list2;
            this.f10096M = messageSchedulingState;
            this.f10097N = iVar;
        }

        public void m32123d(TdApi.Object object) {
            if (View$OnClickListenerC2971rh.this.m9339Ta()) {
                View$OnClickListenerC2971rh.this.m32626Oq(C4779t2.m25378z5(object), true);
            } else {
                C1379j0.m37302t0(object);
            }
        }

        public void m32122e(TdApi.MessageSchedulingState messageSchedulingState, List list, AbstractC5917i iVar, int i, int i2) {
            boolean z = false;
            if ((messageSchedulingState != null) == View$OnClickListenerC2971rh.this.f9991n1) {
                View$OnClickListenerC2971rh.this.f10030x0.m7738X(list);
            }
            if (i == i2) {
                z = true;
            }
            iVar.mo1322a(z);
            if (!View$OnClickListenerC2971rh.this.f9991n1 && messageSchedulingState != null && View$OnClickListenerC2971rh.this.m9339Ta()) {
                View$OnClickListenerC2971rh.this.m32675Kr(true);
            }
        }

        @Override
        public void mo255t2(final TdApi.Object object) {
            int constructor = object.getConstructor();
            boolean z = true;
            if (constructor == -1679978726) {
                View$OnClickListenerC2971rh.this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2971rh.C2993q.this.m32123d(object);
                    }
                });
            } else if (constructor == 1435961258) {
                TdApi.Message message = (TdApi.Message) object;
                this.f10099a.add(message);
                int size = this.f10099a.size();
                if (size < this.f10100b) {
                    View$OnClickListenerC2971rh.this.f30167b.m2781K9().m1834m0(message);
                    View$OnClickListenerC2971rh.this.f30167b.m2270r4().m14783o((TdApi.Function) this.f10101c.get(size), this);
                    z = false;
                }
                View$OnClickListenerC2971rh.this.f30167b.m2610V9().mo255t2(object);
            } else {
                throw new UnsupportedOperationException(object.toString());
            }
            if (z) {
                final int size2 = this.f10099a.size();
                if (size2 > 0) {
                    for (int i = size2 - 1; i >= 0; i--) {
                        View$OnClickListenerC2971rh.this.f30167b.m2781K9().m1782z0((TdApi.Message) this.f10099a.get(i));
                    }
                    final List<AbstractC4761s4> p2 = View$OnClickListenerC2971rh.this.f10030x0.m7653p2(this.f10099a);
                    HandlerC10770jj dd = View$OnClickListenerC2971rh.this.f30167b.m2485dd();
                    final TdApi.MessageSchedulingState messageSchedulingState = this.f10096M;
                    final AbstractC5917i iVar = this.f10097N;
                    final int i2 = this.f10100b;
                    dd.post(new Runnable() {
                        @Override
                        public final void run() {
                            View$OnClickListenerC2971rh.C2993q.this.m32122e(messageSchedulingState, p2, iVar, size2, i2);
                        }
                    });
                    return;
                }
                HandlerC10770jj dd2 = View$OnClickListenerC2971rh.this.f30167b.m2485dd();
                final AbstractC5917i iVar2 = this.f10097N;
                dd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC5917i.this.mo1322a(false);
                    }
                });
            }
        }
    }

    public class C2994r extends AbstractRunnableC5910b {
        public C2994r() {
        }

        @Override
        public void mo1364b() {
            if (View$OnClickListenerC2971rh.this.f9944X2 == this && View$OnClickListenerC2971rh.this.f9947Y2 != 0) {
                View$OnClickListenerC2971rh rhVar = View$OnClickListenerC2971rh.this;
                rhVar.m32627Op(rhVar.f9947Y2, true, false);
                View$OnClickListenerC2971rh.this.f30167b.m2485dd().postDelayed(this, 4500L);
            }
        }
    }

    public class C2995s extends FrameLayoutFix {
        public C2995s(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return View$OnClickListenerC2971rh.this.m9182qa() == 0.0f || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return View$OnClickListenerC2971rh.this.m9182qa() > 0.0f;
        }
    }

    public class C2996t extends C6847b2 {
        public final int f10104a;

        public C2996t(Context context, int i) {
            super(context);
            this.f10104a = i;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setPivotX(getMeasuredWidth() - this.f10104a);
            setPivotY(getMeasuredHeight() / 2);
        }
    }

    public class C2997u extends RunnableC9558i0 {
        public C2997u(Context context, C10930q6 q6Var) {
            super(context, q6Var);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            View$OnClickListenerC2971rh.this.m32220tr();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC2971rh.this.m32220tr();
        }
    }

    public class C2998v extends View {
        public C2998v(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), C1357a0.m37541i(36.0f), C1410y.m37039g(C11524j.m148w()));
            if (View$OnClickListenerC2971rh.this.f9878B2 != null) {
                View$OnClickListenerC2971rh.this.f9878B2.m21738q(canvas, 0);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return View$OnClickListenerC2971rh.this.f9878B2 != null && View$OnClickListenerC2971rh.this.f9878B2.m21766P(motionEvent);
        }
    }

    public class C2999w implements C6910i0.AbstractC6913c {
        public C2999w() {
        }

        @Override
        public boolean mo18471M0() {
            return false;
        }

        public View get() {
            return View$OnClickListenerC2971rh.this.f9949Z1;
        }

        @Override
        public int mo18469b6() {
            return View$OnClickListenerC2971rh.this.f9949Z1.m18254n(View$OnClickListenerC2971rh.this.f9949Z1.getMeasuredWidth());
        }

        @Override
        public void mo18468p7() {
            C6922j0.m18447b(this);
        }
    }

    public class C3000x extends View$OnClickListenerC9599l3 {
        public C3000x(Context context) {
            super(context);
        }

        @Override
        public void mo8060A() {
            super.mo8060A();
            View$OnClickListenerC2971rh.this.f9940W1.m18477M1(View$OnClickListenerC2971rh.this.f9958c2);
        }
    }

    public class C3001y implements View$OnClickListenerC9599l3.AbstractC9605f {
        public final Context f10110a;

        public C3001y(Context context) {
            this.f10110a = context;
        }

        @Override
        public void mo8028a(View$OnClickListenerC9599l3 l3Var) {
            View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this.f10110a, View$OnClickListenerC2971rh.this.f30167b);
            rhVar.m32664Lp(new C2977c0((TdApi.ChatList) null, View$OnClickListenerC2971rh.this.f10002q0, (String) null, (TdApi.MessageSender) null, new TdApi.SearchMessagesFilterPinned()));
            View$OnClickListenerC2971rh.this.m9291ac(rhVar);
        }

        @Override
        public void mo8027b(View$OnClickListenerC9599l3 l3Var, TdApi.Message message) {
            View$OnClickListenerC2971rh.this.m32632Ok(new C7319d(message.chatId, message.f25406id));
        }

        @Override
        public void mo8026c(View$OnClickListenerC9599l3 l3Var) {
            View$OnClickListenerC2971rh.this.m32722Hj();
        }
    }

    public class C3002z implements C6910i0.AbstractC6913c {
        public C3002z() {
        }

        @Override
        public boolean mo18471M0() {
            return C6922j0.m18448a(this);
        }

        public View get() {
            return View$OnClickListenerC2971rh.this.f9955b2;
        }

        @Override
        public int mo18469b6() {
            return View$OnClickListenerC2971rh.this.f9955b2.getTotalHeight();
        }

        @Override
        public void mo18468p7() {
            View$OnClickListenerC2971rh.this.f9955b2.m8041q(false);
        }
    }

    public View$OnClickListenerC2971rh(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f9898I1 = new C3940f(12, this, decelerateInterpolator, 180L);
        this.f9916O1 = new C3940f(6, this, decelerateInterpolator, 180L);
        this.f9919P1 = new C3940f(0, new C2983g(), decelerateInterpolator, 120L);
        this.f9932T2 = new C3940f(9, this, decelerateInterpolator, 150L);
    }

    public void m32811Am(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        if (!m32743Fp(z, messageSchedulingState)) {
            m32677Kp(true, z, messageSchedulingState);
        }
    }

    public void m32810An(boolean z, TdApi.User user, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z4;
        C10930q6 q6Var = this.f30167b;
        long j = this.f10002q0.f25367id;
        long qk = m32266qk();
        long ko = z ? m32341ko() : 0L;
        if (z2 || m32328lo()) {
            z4 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z4 = false;
        }
        q6Var.m2247sb(j, qk, ko, new TdApi.MessageSendOptions(z4, false, false, messageSchedulingState2), new TdApi.InputMessageContact(new TdApi.Contact(user.phoneNumber, user.firstName, user.lastName, null, user.f25439id)), null);
    }

    public static int m32800Bk() {
        return AbstractC4761s4.m26005Y2();
    }

    public void m32799Bl(boolean z, DialogInterface dialogInterface, int i) {
        m32678Ko(z);
    }

    public void m32798Bm(long j) {
        TdApi.Chat chat;
        if (mo9464C9() == j && (chat = this.f10002q0) != null) {
            m32529Wi(chat.pendingJoinRequests);
        }
    }

    public void m32797Bn(AbstractC5916h hVar, AbstractC5913e eVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        this.f30167b.m2247sb(this.f10002q0.f25367id, m32266qk(), hVar != null ? hVar.get() : 0L, new TdApi.MessageSendOptions(z || m32328lo(), false, false, messageSchedulingState), (TdApi.InputMessageContent) eVar.get(), null);
    }

    public void m32786Cl(View view) {
        switch (view.getId()) {
            case R.id.btn_search_jump:
                m32331ll();
                return;
            case R.id.btn_search_next:
                this.f10030x0.m7740W1(true);
                return;
            case R.id.btn_search_prev:
                this.f10030x0.m7740W1(false);
                return;
            default:
                return;
        }
    }

    public void m32785Cm(long j) {
        TdApi.Chat chat;
        if (mo9464C9() == j && (chat = this.f10002q0) != null) {
            m32529Wi(chat.pendingJoinRequests);
        }
    }

    public static long m32784Cn(long j) {
        return j;
    }

    public void m32773Dl(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            this.f30167b.m2270r4().m14783o(new TdApi.AddChatMember(this.f10002q0.f25367id, this.f30167b.m2519ba(), 0), this.f30167b.m2392ja());
        }
    }

    public boolean m32772Dm(View view, int i) {
        return this.f10038z0.m8243z0(i);
    }

    public static TdApi.InputMessageContent m32771Dn(String str) {
        return new TdApi.InputMessageDice(str, false);
    }

    public static boolean m32768Dq(Object obj) {
        return obj instanceof C4609c7;
    }

    public void m32760El(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        m32318ml((int) (calendar.getTimeInMillis() / 1000));
    }

    public void m32759Em() {
        mo8837u5(-1);
    }

    public void m32758En(List list, boolean z, long j, long j2, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C4779t2.C4788g gVar = new C4779t2.C4788g();
            arrayList.add(this.f30167b.m2429h5().m23151B(C4779t2.m25683G5(str, C4779t2.m25523f0(str, null, gVar), gVar, null), z));
        }
        for (TdApi.Function function : C4779t2.m25718B5(j, m32266qk(), j2, new TdApi.MessageSendOptions(z2, false, false, messageSchedulingState), (TdApi.InputMessageContent[]) arrayList.toArray(new TdApi.InputMessageContent[0]), z3)) {
            this.f30167b.m2270r4().m14783o(function, this.f30167b.m2610V9());
        }
    }

    public void m32747Fl(DialogInterface dialogInterface, int i) {
        m32318ml(0);
    }

    public boolean m32746Fm(View view, int i) {
        C6035e<AbstractC4761s4> eVar;
        if (i == R.id.btn_send && (eVar = this.f9880C1) != null) {
            for (int p = eVar.m21496p() - 1; p >= 0; p--) {
                this.f30167b.m2270r4().m14783o(new TdApi.EditMessageSchedulingState(this.f9880C1.m21495q(p).m26145K2(), this.f9880C1.m21501j(p), null), this.f30167b.m2392ja());
            }
            mo8837u5(-1);
        }
        return true;
    }

    public void m32745Fn(boolean z, long j, String str, boolean z2, boolean z3, TdApi.MessageSchedulingState messageSchedulingState, boolean z4) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z5;
        C10930q6 q6Var = this.f30167b;
        long j2 = this.f10002q0.f25367id;
        long qk = m32266qk();
        long ko = z ? m32341ko() : 0L;
        if (z3 || m32328lo()) {
            z5 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z5 = false;
        }
        q6Var.m2263rb(j2, qk, ko, new TdApi.MessageSendOptions(z5, false, false, messageSchedulingState2), j, str);
        if (z2) {
            this.f10038z0.m8249v0("", false);
            this.f10038z0.getInlineSearchContext().m21637w0();
        }
    }

    public void m32734Gl(TdApi.GetChatMessageByDate getChatMessageByDate, C7319d dVar) {
        if (this.f10009r3 == getChatMessageByDate) {
            this.f10009r3 = null;
            m32313mq(false, true);
            this.f10030x0.m7730Z0(dVar, dVar.m17023g() ? 1 : 5, null, true);
        }
    }

    public void m32733Gm() {
        mo8837u5(-1);
    }

    public void m32732Gn(String str, int i, boolean z, long j, long j2, boolean z2) {
        int i2;
        int i3;
        BitmapFactory.Options h = C7907b.m14365h(str);
        int t0 = C7389v0.m16581t0(str);
        int b = C7907b.m14371b(h, 1280, 1280);
        int i4 = h.outWidth / b;
        int i5 = h.outHeight / b;
        if (C7389v0.m16624i1(t0)) {
            i3 = i5;
            i2 = i4;
        } else {
            i2 = i5;
            i3 = i4;
        }
        TdApi.InputFileGenerated w = C5335c.m23206w(str, C7389v0.m16685S0(t0));
        this.f30167b.m2231tb(j, m32266qk(), j2, z2, false, (TdApi.InputMessagePhoto) this.f30167b.m2429h5().m23151B(new TdApi.InputMessagePhoto(w, null, null, i3, i2, null, i), z));
    }

    public void m32720Hl(final TdApi.GetChatMessageByDate getChatMessageByDate, TdApi.Object object) {
        final C7319d dVar;
        if (object.getConstructor() == 1435961258) {
            TdApi.Message message = (TdApi.Message) object;
            dVar = new C7319d(message.chatId, message.f25406id);
        } else {
            dVar = new C7319d(mo9464C9(), 9L);
        }
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32734Gl(getChatMessageByDate, dVar);
            }
        });
    }

    public boolean m32719Hm(View view, int i) {
        if (i == R.id.btn_unpinAll) {
            int p = this.f9880C1.m21496p();
            for (int i2 = 0; i2 < p; i2++) {
                this.f30167b.m2270r4().m14783o(new TdApi.UnpinChatMessage(this.f10002q0.f25367id, this.f9880C1.m21501j(i2)), this.f30167b.m2392ja());
            }
            this.f9956b3 = true;
            mo8837u5(-1);
        }
        return true;
    }

    public void m32718Hn(C6253l[] lVarArr, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, TdApi.MessageSendOptions messageSendOptions) {
        TdApi.InputMessageContent inputMessageContent;
        TdApi.InputFile inputFile;
        MediaMetadataRetriever mediaMetadataRetriever;
        TdApi.InputMessageContent[] inputMessageContentArr = new TdApi.InputMessageContent[lVarArr.length];
        int i = 0;
        for (C6253l lVar : lVarArr) {
            if (lVar.m20955A() <= 0 || !z) {
                if (lVar.m20843e1()) {
                    boolean p1 = lVar.m20832p1();
                    if (Build.VERSION.SDK_INT >= 17) {
                        try {
                            mediaMetadataRetriever = C7389v0.m16595p2(lVar.mo20875q());
                            if (!p1) {
                                try {
                                    String extractMetadata = mediaMetadataRetriever.extractMetadata(16);
                                    if (C5070i.m24061i(extractMetadata) || !C5070i.m24067c(extractMetadata.toLowerCase(), "yes")) {
                                        p1 = true;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                            if (C5070i.m24057m(extractMetadata2)) {
                                lVar.mo20874q0(C5070i.m24051s(extractMetadata2));
                            }
                        } catch (Throwable unused2) {
                            mediaMetadataRetriever = null;
                        }
                        C7389v0.m16730H(mediaMetadataRetriever);
                    }
                    int[] iArr = new int[2];
                    lVar.m20860N0(iArr);
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    C4779t2.C4788g gVar = new C4779t2.C4788g();
                    boolean z5 = C4183a.f14089g && (!z || !C5349g0.m23162q(lVar));
                    String q = lVar.mo20875q();
                    TdApi.InputFile x = z5 ? C5349g0.m23155x(q, lVar, z) : C4779t2.m25523f0(q, null, gVar);
                    TdApi.FormattedText H0 = lVar.m20867H0(true, !z2);
                    if (z && !z5) {
                        inputMessageContent = this.f30167b.m2429h5().m23151B(C4779t2.m25683G5(lVar.mo20875q(), x, gVar, H0), z3);
                    } else if (!p1 || lVar.m20955A() != 0 || (lVarArr.length != 1 && z4)) {
                        inputMessageContent = this.f30167b.m2429h5().m23151B(new TdApi.InputMessageVideo(x, null, null, lVar.m20855S0(true), i2, i3, C7389v0.m16746D(x), H0, lVar.m20955A()), z3);
                    } else {
                        inputMessageContent = this.f30167b.m2429h5().m23151B(new TdApi.InputMessageAnimation(x, null, null, lVar.m20855S0(true), i2, i3, H0), z3);
                    }
                } else {
                    int[] iArr2 = new int[2];
                    lVar.m20860N0(iArr2);
                    int i4 = iArr2[0];
                    int i5 = iArr2[1];
                    if (!z || !C5335c.m23212q(lVar)) {
                        inputFile = C5335c.m23204y(lVar);
                    } else {
                        inputFile = C4779t2.m25537d0(lVar.mo20875q());
                    }
                    TdApi.FormattedText H02 = lVar.m20867H0(true, !z2);
                    if (z) {
                        inputMessageContent = this.f30167b.m2429h5().m23151B(new TdApi.InputMessageDocument(inputFile, null, false, H02), z3);
                    } else {
                        inputMessageContent = this.f30167b.m2429h5().m23151B(new TdApi.InputMessagePhoto(inputFile, null, null, i4, i5, H02, lVar.m20955A()), z3);
                    }
                }
                inputMessageContentArr[i] = inputMessageContent;
                i++;
            } else {
                throw new IllegalArgumentException();
            }
        }
        for (TdApi.Function function : C4779t2.m25718B5(j, m32266qk(), j2, messageSendOptions, inputMessageContentArr, z4)) {
            this.f30167b.m2270r4().m14783o(function, this.f30167b.m2610V9());
        }
    }

    public void m32707Il(TdApi.Object object) {
        if (!m9347Sa()) {
            TdApi.ChatAdministrators chatAdministrators = (TdApi.ChatAdministrators) object;
            this.f9923Q2 = chatAdministrators;
            this.f9926R2.mo1330a(chatAdministrators);
        }
    }

    public void m32706Im() {
        mo8837u5(-1);
    }

    public void m32705In(C4695l6 l6Var, long j, long j2, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        this.f30167b.m2247sb(j, m32266qk(), j2, new TdApi.MessageSendOptions(z, false, false, messageSchedulingState), new TdApi.InputMessageVoiceNote(l6Var.m26466i(), l6Var.m26472c(), C7888N.getWaveform(l6Var.m26469f()), null), null);
    }

    public void m32694Jl(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2126186435) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32707Il(object);
                }
            });
        } else if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    public boolean m32693Jm(View view, int i) {
        if (i != R.id.btn_messageResend) {
            return true;
        }
        m32497Yo();
        mo8837u5(-1);
        return true;
    }

    public static TdApi.InputMessageContent m32692Jn(TdApi.Sticker sticker, String str) {
        return new TdApi.InputMessageSticker(new TdApi.InputFileId(sticker.sticker.f25373id), null, 0, 0, str);
    }

    public void m32680Km(int i, TdApi.HttpUrl httpUrl) {
        if (i == R.id.btn_copyLink) {
            C1379j0.m37325i(httpUrl.url, R.string.CopiedLink);
            return;
        }
        x00 x00Var = new x00(mo4347s(), mo4348c());
        x00Var.m30994Vi(new x00.C3281m(httpUrl.url));
        x00Var.m30960ej();
    }

    public static TdApi.InputMessageContent m32679Kn(String str) {
        return new TdApi.InputMessageSticker(C4779t2.m25537d0(str), null, 0, 0, null);
    }

    public void m32668Ll(long j, View view) {
        this.f30167b.m2485dd().m3893B2(this, this.f30167b.m2541a4(j));
    }

    public void m32667Lm(final int i, TdApi.Object object) {
        if (object.getConstructor() == -2018019930) {
            final TdApi.HttpUrl httpUrl = (TdApi.HttpUrl) object;
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32680Km(i, httpUrl);
                }
            });
        }
    }

    public void m32666Ln(boolean z, long j, boolean z2, boolean z3) {
        if (!m9347Sa()) {
            this.f10030x0.m7719b3(null);
            if (z3) {
                if (z && j != 0 && m32449ck() == j) {
                    m32341ko();
                }
                if (z2) {
                    m32354jo(true);
                }
                this.f10038z0.m8249v0("", false);
            }
            m32482Zp(false);
        }
    }

    public void m32655Ml(long j, int i, SparseIntArray sparseIntArray) {
        if (i == R.id.btn_reportSpam && j == mo9464C9() && m9339Ta()) {
            boolean z = false;
            boolean z2 = sparseIntArray.get(R.id.btn_reportSpam) != 0;
            boolean z3 = sparseIntArray.get(R.id.btn_removeChatFromList) != 0;
            if (sparseIntArray.get(R.id.btn_blockSender) != 0) {
                z = true;
            }
            if (z2 || z3 || z) {
                if (z) {
                    C10930q6 q6Var = this.f30167b;
                    q6Var.m2496d2(q6Var.m2183wb(this.f10002q0.f25367id), true, this.f30167b.m2392ja());
                }
                if (z2) {
                    this.f30167b.m2270r4().m14783o(new TdApi.ReportChat(mo9464C9(), null, new TdApi.ChatReportReasonSpam(), null), this.f30167b.m2392ja());
                }
                if (z3) {
                    m32762Ej();
                }
            }
        }
    }

    public boolean m32654Mm(View view, int i) {
        if (i == R.id.btn_shareMyContact) {
            m32209up(this.f30167b.m2550Z9(), true, C4779t2.m25502i0());
        }
        return true;
    }

    public void m32653Mn(TdApi.Object object) {
        if (object instanceof TdApi.Error) {
            TdApi.Error error = (TdApi.Error) object;
            if (error.code != 400 || !"Have no rights to send a message".equals(error.message)) {
                this.f30167b.m2392ja().mo255t2(object);
            }
        }
    }

    public void m32643Nl(final long j, View view) {
        m9206me(new C9188f2(R.id.btn_reportSpam).m10004i(new C2964ra(28, 0, 0, C4403w.m27853m1(R.string.ReportChatSpam, this.f10002q0.title), false)).m9997p(m32515Xj() != 0 ? new C2964ra[]{new C2964ra(12, (int) R.id.btn_reportSpam, 0, (int) R.string.ReportSpam, true), new C2964ra(12, (int) R.id.btn_removeChatFromList, 0, (int) R.string.DeleteChat, true), new C2964ra(12, (int) R.id.btn_blockSender, 0, (int) R.string.BlockUser, true)} : new C2964ra[]{new C2964ra(12, (int) R.id.btn_reportSpam, 0, (int) R.string.ReportSpam, true), new C2964ra(12, (int) R.id.btn_removeChatFromList, 0, (int) R.string.DeleteChat, true)}).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                View$OnClickListenerC2971rh.this.m32655Ml(j, i, sparseIntArray);
            }
        }).m9995r(R.string.Done).m9996q(R.id.theme_color_textNegative));
    }

    public void m32642Nm(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (C7321e.m16938j1(this.f30167b.m2556Z3(mo9464C9()), notificationSettingsScope)) {
            m32181wr(true);
        }
    }

    public void m32641Nn(boolean z, C4289i iVar) {
        Status a = iVar.mo952a();
        int c = a.m30396c();
        if (c == 0) {
            m32475ak(z, this.f10028w2);
        } else if (c != 6) {
            m32475ak(z, this.f10028w2);
        } else {
            try {
                a.m30392g(mo4347s(), 103);
            } catch (Throwable unused) {
                m32436dk(z, true, false);
            }
        }
    }

    public void m32631Ol(long j, View view) {
        this.f30167b.m2270r4().m14783o(new TdApi.AddChatToList(j, new TdApi.ChatListMain()), this.f30167b.m2392ja());
        TdApi.ChatNotificationSettings I3 = this.f30167b.m2819I3(j);
        if (I3 != null) {
            this.f30167b.m2270r4().m14783o(new TdApi.SetChatNotificationSettings(j, new TdApi.ChatNotificationSettings(true, 0, I3.useDefaultSound, I3.sound, I3.useDefaultShowPreview, I3.showPreview, I3.useDefaultDisablePinnedMessageNotifications, I3.disablePinnedMessageNotifications, I3.useDefaultDisableMentionNotifications, I3.disableMentionNotifications)), this.f30167b.m2392ja());
        }
    }

    public void m32630Om(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        if (mo9464C9() == j) {
            this.f10010s0.m8399k2(j, chatNotificationSettings);
            m32181wr(true);
        }
    }

    public static void m32629On(TdApi.Object object) {
        if (object.getConstructor() != -722616727) {
            C1379j0.m37290z0("Bot is already in chat", 0);
        }
    }

    public void m32618Pl(C6253l lVar, ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z, boolean z2) {
        m32782Cp(new C6253l[]{lVar}, false, messageSendOptions, z, z2);
    }

    public void m32617Pm(HandlerC10770jj.C10781k kVar) {
        this.f30167b.m2485dd().m3877C8(this, kVar, this.f10039z1.m25993Z3());
    }

    public static void m32616Pn(C4640g gVar) {
        C4859b.m24988d().m24984h(gVar.m26660b());
    }

    public void m32605Ql(int i, final C6253l lVar) {
        if (m9347Sa()) {
            C6259q.m20786c().m20788a(lVar);
            return;
        }
        boolean z = false;
        if (lVar == null) {
            C1379j0.m37292y0(i == 109 ? R.string.TakeVideoError : R.string.TakePhotoError, 0);
            return;
        }
        C8113c cVar = new C8113c(this.f30165a, this.f30167b);
        cVar.m13446v(new C8112b(this.f30165a, this.f30167b, lVar));
        View$OnClickListenerC7430j1 j1Var = new View$OnClickListenerC7430j1(this.f30165a, this.f30167b);
        View$OnClickListenerC7430j1.C7448r s = View$OnClickListenerC7430j1.C7448r.m16049o(this, null, null, new AbstractC7513y() {
            @Override
            public final void mo11247L6(ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z2, boolean z3) {
                View$OnClickListenerC2971rh.this.m32618Pl(lVar, arrayList, messageSendOptions, z2, z3);
            }
        }, cVar, m32216ui()).m16045s(mo9464C9());
        if (m32396gl() || !C4868i.m24726c2().m24663k1(2048L)) {
            z = true;
        }
        j1Var.m16296Xk(s.m16048p(z));
        j1Var.m16247dk();
    }

    public static void m32604Qm(C10930q6.C10943m mVar) {
        C1379j0.m37325i(mVar.f35164a, mVar.f35165b ? R.string.CopiedLink : R.string.CopiedLinkPrivate);
    }

    public void m32603Qn() {
        mo8837u5(-1);
    }

    public void m32592Rl(String str, long j, long j2, boolean z) {
        C9501b bVar = new C9501b(str);
        bVar.m8461d();
        this.f30167b.m2231tb(j, m32266qk(), j2, z, false, new TdApi.InputMessageAudio(C4779t2.m25537d0(str), null, bVar.m8464a(), bVar.m8462c(), bVar.m8463b(), null));
    }

    public boolean m32591Rm(TdApi.Message message, View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.StopPoll(message.chatId, message.f25406id, message.replyMarkup), this.f30167b.m2392ja());
        return true;
    }

    public void m32590Rn(long j, TdApi.User user, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z3;
        C10930q6 q6Var = this.f30167b;
        long j2 = this.f10002q0.f25367id;
        long qk = m32266qk();
        if (z || m32328lo()) {
            z3 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z3 = false;
        }
        q6Var.m2247sb(j2, qk, j, new TdApi.MessageSendOptions(z3, false, false, messageSchedulingState2), new TdApi.InputMessageContact(new TdApi.Contact(user.phoneNumber, user.firstName, user.lastName, null, user.f25439id)), null);
    }

    public void m32579Sl(long j) {
        if (this.f10002q0 != null && C7316a.m17048m(mo9464C9()) == j) {
            this.f10010s0.m8398l2(this.f10002q0);
        }
    }

    public void m32578Sm(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        if (this.f10039z1 != null && messageSchedulingState != null) {
            this.f30167b.m2270r4().m14783o(new TdApi.EditMessageSchedulingState(mo9464C9(), this.f10039z1.m26115N3(), messageSchedulingState), this.f30167b.m2392ja());
            m32346kj();
        }
    }

    public void m32577Sn(View view, Rect rect) {
        this.f9891G0.mo8098f1(view, rect);
    }

    public void m32565Tl(long j) {
        C9678w2 w2Var = this.f10030x0;
        if (w2Var != null) {
            w2Var.m7636t0(this);
        }
        C10930q6 q6Var = this.f30167b;
        m32664Lp(new C2977c0(q6Var, this.f10006r0, q6Var.m2771L3(j), (C4737p7) null, (TdApi.SearchMessagesFilter) null));
    }

    public void m32564Tm(AbstractC4761s4 s4Var, TdApi.ChatMember chatMember, C5320c cVar, C5320c cVar2, C5146u0 u0Var) {
        if (!s4Var.m26030V5()) {
            Object M = C9552h1.m8351M(this, s4Var, chatMember, cVar, cVar2, u0Var, true);
            if (!cVar.m23279f()) {
                m32481Zq(s4Var, cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), M, chatMember, true);
            }
        }
    }

    public void m32563Tn(long j, TdApi.DraftMessage draftMessage, TdApi.Object object) {
        if (mo9464C9() == j && C7321e.m17001J(m32423ek(), draftMessage)) {
            if (object.getConstructor() == 1435961258) {
                m32442cr((TdApi.Message) object, false, false);
            } else {
                m32215uj(false);
            }
        }
    }

    public static boolean m32555Ui(int i, TdApi.ChatEventLogFilters chatEventLogFilters) {
        if (chatEventLogFilters == null) {
            return true;
        }
        switch (i) {
            case R.id.btn_filterAdmins:
                return chatEventLogFilters.memberPromotions;
            case R.id.btn_filterAll:
                return C4779t2.m25672I2(chatEventLogFilters);
            case R.id.btn_filterDeletedMessages:
                return chatEventLogFilters.messageDeletions;
            case R.id.btn_filterEditedMessages:
                return chatEventLogFilters.messageEdits;
            case R.id.btn_filterInfo:
                return chatEventLogFilters.infoChanges;
            case R.id.btn_filterInviteLinks:
                return chatEventLogFilters.inviteLinkChanges;
            case R.id.btn_filterLeavingMembers:
                return chatEventLogFilters.memberLeaves;
            case R.id.btn_filterMembers:
                return chatEventLogFilters.memberJoins || chatEventLogFilters.memberInvites;
            case R.id.btn_filterPinnedMessages:
                return chatEventLogFilters.messagePins;
            case R.id.btn_filterRestrictions:
                return chatEventLogFilters.memberRestrictions;
            case R.id.btn_filterSettings:
                return chatEventLogFilters.settingChanges;
            case R.id.btn_filterVideoChats:
                return chatEventLogFilters.videoChatChanges;
            default:
                return false;
        }
    }

    public void m32552Ul(final long j, TdApi.Chat chat) {
        this.f30167b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32565Tl(j);
            }
        });
    }

    public void m32551Um(final AbstractC4761s4 s4Var, final C5320c cVar, final C5320c cVar2, final C5146u0 u0Var, TdApi.Object object) {
        final TdApi.ChatMember chatMember = object.getConstructor() == 1829953909 ? (TdApi.ChatMember) object : null;
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32564Tm(s4Var, chatMember, cVar, cVar2, u0Var);
            }
        });
    }

    public void m32550Un(final long j, final TdApi.DraftMessage draftMessage, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32563Tn(j, draftMessage, object);
            }
        });
    }

    public void m32539Vl(TdApi.BasicGroup basicGroup, boolean z) {
        if (C7316a.m17048m(mo9464C9()) != basicGroup.f25363id) {
            return;
        }
        if (z) {
            final long b = C7316a.m17059b(basicGroup.upgradedToSupergroupId);
            this.f30167b.m2602W2(b, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC2971rh.this.m32552Ul(b, (TdApi.Chat) obj);
                }
            });
            return;
        }
        m32246rr(true);
    }

    public void m32538Vm(TdApi.Message message, TdApi.MessageThreadInfo messageThreadInfo) {
        if (mo9464C9() == message.chatId) {
            TdApi.Message[] messageArr = messageThreadInfo.messages;
            if (messageArr.length > 0) {
                int i = 1;
                long[] jArr = messageArr.length > 1 ? new long[messageArr.length - 1] : null;
                while (true) {
                    TdApi.Message[] messageArr2 = messageThreadInfo.messages;
                    if (i < messageArr2.length) {
                        jArr[i - 1] = messageArr2[i].f25406id;
                        i++;
                    } else {
                        this.f30167b.m2485dd().m3469r7(this, messageThreadInfo.chatId, new C7319d(messageThreadInfo.chatId, messageThreadInfo.messages[0].f25406id, jArr), new HandlerC10770jj.C10788q().m3314q(new C7319d(message.chatId, message.f25406id)).m3328c(this).m3316o(message.chatId));
                        return;
                    }
                }
            }
        }
    }

    public void m32526Wl(long j) {
        if (mo9464C9() == j) {
            m32608Qi();
        }
    }

    public void m32525Wm(final TdApi.Message message, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -248536056) {
            final TdApi.MessageThreadInfo messageThreadInfo = (TdApi.MessageThreadInfo) object;
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32538Vm(message, messageThreadInfo);
                }
            });
        }
    }

    public void m32513Xl(long j, boolean z) {
    }

    public void m32512Xm(boolean z, DialogInterface dialogInterface, int i) {
        m32781Cq(true);
        if (z) {
            mo8377l1();
        }
    }

    public void m32500Yl(long j) {
        if (mo9464C9() == j) {
            m32142zr();
        }
    }

    public void m32486Zl(long j, TdApi.DraftMessage draftMessage) {
        RunnableC9558i0 i0Var;
        if (mo9464C9() == j && (i0Var = this.f10038z0) != null && !i0Var.m8312C0() && !m32396gl() && this.f9987m1 == null) {
            m32168xr(j, draftMessage);
        }
    }

    public void m32485Zm(boolean z, DialogInterface dialogInterface, int i) {
        m32208uq(z);
    }

    public static boolean m32484Zn(C10930q6 q6Var, Context context, final C3950k kVar, final float f, Object obj) {
        View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(context, q6Var);
        rhVar.m32664Lp(((View$OnClickListenerC2971rh) obj).m9131x9());
        rhVar.m9162t9();
        rhVar.m9248gd(new Runnable() {
            @Override
            public final void run() {
                C3950k.this.m29544i(f);
            }
        });
        C1379j0.m37307r(context).m14552P1().m9719h0(rhVar);
        return true;
    }

    public void m32473am(long j, boolean z) {
        if (mo9464C9() == j) {
            C9585k0 k0Var = this.f9900J0;
            if (k0Var != null && k0Var.m8099c(this.f30167b.m2415i3(j))) {
                this.f9903K0.setTranslationX(this.f9900J0.m8100a() ? 0.0f : this.f9900J0.getLayoutParams().width);
                this.f9882D0.m8496a();
            }
            if (this.f9991n1 && !z) {
                m9162t9();
                if (m9366Pa()) {
                    this.f9956b3 = true;
                } else {
                    m9298Zb();
                }
            }
        }
    }

    public void m32460bm(long j) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null && chat.f25367id == j) {
            this.f30167b.m2485dd().m3657Y8(R.id.menu_secretChat, this.f30156R, this.f10002q0, false);
        }
    }

    public void m32459bn(TdApi.SecretChat secretChat) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null && C4779t2.m25549b2(chat) == secretChat.f25419id) {
            m32246rr(true);
            if (secretChat.state.getConstructor() == -1945106707) {
                m32608Qi();
            }
        }
    }

    public void m32447cm(long j) {
        if (this.f10002q0 != null && mo9464C9() == j) {
            this.f10010s0.m8398l2(this.f10002q0);
        }
    }

    public void m32446cn(View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        if (m32716Hp(view, lVar.m35574j(), lVar.m35581c(), true, z, messageSchedulingState)) {
            this.f9920P2 = SystemClock.uptimeMillis();
            this.f10038z0.m8249v0("", false);
        }
    }

    public void m32434dm(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (mo9464C9() == j) {
            m32529Wi(chatJoinRequestsInfo);
        }
    }

    public void m32433dn(long j) {
        if (C7316a.m17045p(mo9464C9()) == j) {
            this.f10010s0.m8398l2(this.f10002q0);
            m32516Xi();
        }
    }

    public void m32421em(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        if (mo9464C9() == j) {
            this.f10010s0.m8401i2(this.f10002q0, chatPhotoInfo);
        }
    }

    public void m32420en(TdApi.Supergroup supergroup) {
        if (C7316a.m17045p(mo9464C9()) == supergroup.f25425id) {
            m32246rr(true);
        }
    }

    public void m32408fm(long j) {
        if (mo9464C9() == j) {
            m32181wr(true);
        }
    }

    public void m32407fn(long j) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null && C4779t2.m25465n2(chat) == j) {
            m32246rr(true);
        }
    }

    public void m32395gm(long j, long j2) {
        if (mo9464C9() == j) {
            this.f10030x0.m7675k3(j2);
        }
    }

    public boolean m32394gn(C9180e2 e2Var, View view, boolean z) {
        C5322e eVar;
        if (z) {
            return false;
        }
        TdApi.ChatEventLogFilters chatEventLogFilters = new TdApi.ChatEventLogFilters(true, true, true, true, true, true, true, true, true, true, true, true);
        int N0 = e2Var.f29637a.m34224N0(R.id.btn_members);
        long[] jArr = null;
        if (N0 == -1 || !e2Var.f29637a.m34240F0().get(N0).m32873D()) {
            TdApi.ChatAdministrators chatAdministrators = this.f9923Q2;
            eVar = new C5322e(chatAdministrators != null ? chatAdministrators.administrators.length : 10);
        } else {
            eVar = null;
        }
        List<C2964ra> F0 = e2Var.f29637a.m34240F0();
        int size = F0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C2964ra raVar = F0.get(i2);
            int j = raVar.m32835j();
            if (j == R.id.btn_filter) {
                boolean D = raVar.m32873D();
                if (D) {
                    i++;
                }
                switch (raVar.m32846c()) {
                    case R.id.btn_filterAdmins:
                        chatEventLogFilters.memberPromotions = D;
                        continue;
                    case R.id.btn_filterDeletedMessages:
                        chatEventLogFilters.messageDeletions = D;
                        continue;
                    case R.id.btn_filterEditedMessages:
                        chatEventLogFilters.messageEdits = D;
                        continue;
                    case R.id.btn_filterInfo:
                        chatEventLogFilters.infoChanges = D;
                        continue;
                    case R.id.btn_filterInviteLinks:
                        chatEventLogFilters.inviteLinkChanges = D;
                        continue;
                    case R.id.btn_filterLeavingMembers:
                        chatEventLogFilters.memberLeaves = D;
                        continue;
                    case R.id.btn_filterMembers:
                        chatEventLogFilters.memberInvites = D;
                        chatEventLogFilters.memberJoins = D;
                        continue;
                    case R.id.btn_filterPinnedMessages:
                        chatEventLogFilters.messagePins = D;
                        continue;
                    case R.id.btn_filterRestrictions:
                        chatEventLogFilters.memberRestrictions = D;
                        continue;
                    case R.id.btn_filterSettings:
                        chatEventLogFilters.settingChanges = D;
                        continue;
                    case R.id.btn_filterVideoChats:
                        chatEventLogFilters.videoChatChanges = D;
                        continue;
                }
            } else if (j == R.id.user && raVar.m32873D() && eVar != null) {
                eVar.m23275a(raVar.m32831n());
            }
        }
        if (i == 0 || (eVar != null && eVar.m23264l() == 0)) {
            this.f30165a.m14584H3().m8985g(view).m8969F(null, this.f30167b, R.drawable.baseline_warning_24, C4403w.m27869i1(R.string.EventLogEmptyFilter));
            return true;
        }
        C9678w2 w2Var = this.f10030x0;
        if (eVar != null) {
            jArr = eVar.m23269g();
        }
        w2Var.m7731Z(chatEventLogFilters, jArr);
        return false;
    }

    public void m32382hm(long j, long j2) {
        RunnableC5938f fVar;
        if (mo9464C9() == j && (fVar = this.f10034y0) != null) {
            fVar.m21849E(j, j2);
        }
    }

    public static void m32381hn(C2964ra raVar, C9137c cVar, boolean z) {
        int A = raVar.m32876A();
        if (A == 12 || A == 69) {
            ((C7057w) cVar.getChildAt(0)).m17933e(raVar.m32873D(), z);
        }
    }

    public static int m32371ik() {
        return ((C1357a0.m37544f() - ((View$OnClickListenerC9170d1.getTopOffset() + C1357a0.m37541i(20.0f)) * 2)) - C1357a0.m37541i(48.0f)) - C1357a0.m37541i(56.0f);
    }

    public void m32369im(long j, String str) {
        if (mo9464C9() == j) {
            this.f10010s0.m8400j2(j, str);
        }
    }

    public static void m32368in(int[] iArr, View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
        int A = raVar.m32876A();
        if (A == 12 || A == 69) {
            boolean z = false;
            boolean h = ((C7057w) ((C9137c) view).getChildAt(0)).m17930h();
            raVar.m32858S(h);
            List<C2964ra> F0 = iqVar.m34240F0();
            int size = F0.size();
            switch (raVar.m32835j()) {
                case R.id.btn_filter:
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        C2964ra raVar2 = F0.get(i3);
                        if (raVar2.m32835j() == R.id.btn_filter && raVar2.m32873D()) {
                            i2++;
                        }
                    }
                    if (i2 == iArr.length - 1) {
                        z = true;
                    }
                    int N0 = iqVar.m34224N0(R.id.btn_filterAll);
                    if (N0 != -1) {
                        C2964ra raVar3 = F0.get(N0);
                        if (raVar3.m32873D() != z) {
                            raVar3.m32858S(z);
                            iqVar.m34124u3(N0);
                            return;
                        }
                        return;
                    }
                    return;
                case R.id.btn_filterAll:
                    for (int i4 = 0; i4 < size; i4++) {
                        C2964ra raVar4 = F0.get(i4);
                        if (raVar4.m32835j() == R.id.btn_filter && raVar4.m32873D() != h) {
                            raVar4.m32858S(h);
                            iqVar.m34124u3(i4);
                        }
                    }
                    return;
                case R.id.btn_members:
                    for (int i5 = 0; i5 < size; i5++) {
                        C2964ra raVar5 = F0.get(i5);
                        if (raVar5.m32835j() == R.id.user && raVar5.m32873D() != h) {
                            raVar5.m32858S(h);
                            iqVar.m34124u3(i5);
                        }
                    }
                    return;
                case R.id.user:
                    int N02 = iqVar.m34224N0(R.id.btn_members);
                    if (N02 != -1) {
                        C2964ra raVar6 = F0.get(N02);
                        if (raVar6.m32873D()) {
                            raVar6.m32858S(false);
                            iqVar.m34124u3(N02);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void m32356jm(long j, TdApi.Message message) {
        if (mo9464C9() == j && message == null) {
            this.f10030x0.m7691h2();
        }
    }

    public void m32355jn(TdApi.ChatAdministrators chatAdministrators) {
        String[] strArr;
        final int[] iArr;
        TdApi.ChatAdministrator[] chatAdministratorArr;
        if (m9339Ta()) {
            TdApi.ChatEventLogFilters J0 = this.f10030x0.m7790J0();
            long[] L0 = this.f10030x0.m7782L0();
            ArrayList arrayList = new ArrayList();
            int i = 11;
            if (this.f30167b.m2784K6(this.f10002q0.f25367id)) {
                iArr = new int[]{R.id.btn_filterAll, R.id.btn_filterAdmins, R.id.btn_filterMembers, R.id.btn_filterInviteLinks, R.id.btn_filterInfo, R.id.btn_filterSettings, R.id.btn_filterDeletedMessages, R.id.btn_filterEditedMessages, R.id.btn_filterPinnedMessages, R.id.btn_filterLeavingMembers, R.id.btn_filterVideoChats};
                strArr = new String[]{C4403w.m27869i1(R.string.EventLogFilterAll), C4403w.m27869i1(R.string.EventLogFilterNewAdmins), C4403w.m27869i1(R.string.EventLogFilterNewMembers), C4403w.m27869i1(R.string.EventLogFilterInviteLinks), C4403w.m27869i1(R.string.EventLogFilterChannelInfo), C4403w.m27869i1(R.string.EventLogFilterChannelSettings), C4403w.m27869i1(R.string.EventLogFilterDeletedMessages), C4403w.m27869i1(R.string.EventLogFilterEditedMessages), C4403w.m27869i1(R.string.EventLogFilterPinnedMessages), C4403w.m27869i1(R.string.EventLogFilterLeavingMembers), C4403w.m27869i1(R.string.EventLogFilterLiveStreams)};
            } else {
                int[] iArr2 = {R.id.btn_filterAll, R.id.btn_filterRestrictions, R.id.btn_filterAdmins, R.id.btn_filterMembers, R.id.btn_filterInviteLinks, R.id.btn_filterInfo, R.id.btn_filterSettings, R.id.btn_filterDeletedMessages, R.id.btn_filterEditedMessages, R.id.btn_filterPinnedMessages, R.id.btn_filterLeavingMembers, R.id.btn_filterVideoChats};
                strArr = new String[]{C4403w.m27869i1(R.string.EventLogFilterAll), C4403w.m27869i1(R.string.EventLogFilterNewRestrictions), C4403w.m27869i1(R.string.EventLogFilterNewAdmins), C4403w.m27869i1(R.string.EventLogFilterNewMembers), C4403w.m27869i1(R.string.EventLogFilterInviteLinks), C4403w.m27869i1(R.string.EventLogFilterGroupInfo), C4403w.m27869i1(R.string.EventLogFilterGroupSettings), C4403w.m27869i1(R.string.EventLogFilterDeletedMessages), C4403w.m27869i1(R.string.EventLogFilterEditedMessages), C4403w.m27869i1(R.string.EventLogFilterPinnedMessages), C4403w.m27869i1(R.string.EventLogFilterLeavingMembers), C4403w.m27869i1(R.string.EventLogFilterVoiceChats)};
                iArr = iArr2;
            }
            int length = iArr.length;
            int i2 = 0;
            boolean z = true;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new C2964ra(i));
                }
                arrayList.add(new C2964ra(12, i4 == R.id.btn_filterAll ? i4 : R.id.btn_filter, 0, strArr[i3], i4, m32555Ui(i4, J0)).m32870G(J0));
                i3++;
                i2++;
                i = 11;
            }
            arrayList.add(new C2964ra(3).m32843d0(R.id.theme_color_background));
            arrayList.add(new C2964ra(2).m32843d0(R.id.theme_color_background));
            arrayList.add(new C2964ra(12, (int) R.id.btn_members, 0, (int) R.string.EventLogAllAdmins, L0 == null));
            for (TdApi.ChatAdministrator chatAdministrator : this.f9923Q2.administrators) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(69, (int) R.id.user, 0, this.f30167b.m2480e2().m1721K2(chatAdministrator.userId), L0 == null || C5062b.m24153s(L0, chatAdministrator.userId) != -1).m32863N(chatAdministrator.userId).m32862O(chatAdministrator.userId));
            }
            C2964ra[] raVarArr = new C2964ra[arrayList.size()];
            arrayList.toArray(raVarArr);
            m9206me(new C9188f2(R.id.btn_filter).m10001l(false).m10002k(true).m9997p(raVarArr).m9995r(R.string.Apply).m10010c(true).m10007f(true).m10000m(new C9180e2.AbstractC9181a() {
                @Override
                public final boolean mo10016a(C9180e2 e2Var, View view, boolean z2) {
                    boolean gn;
                    gn = View$OnClickListenerC2971rh.this.m32394gn(e2Var, view, z2);
                    return gn;
                }
            }).m9993t(C2244cd.f7818a).m9999n(new AbstractC9323v4.AbstractC9337n() {
                @Override
                public final void mo3907a(View view, int i5, C2964ra raVar, TextView textView, C2546iq iqVar) {
                    View$OnClickListenerC2971rh.m32368in(iArr, view, i5, raVar, textView, iqVar);
                }
            }));
        }
    }

    public void m32343km(long j) {
        if (mo9464C9() == j) {
            m32181wr(true);
        }
    }

    public void m32342kn(View$OnClickListenerC8851y1 y1Var) {
        if (m9339Ta() && !m9347Sa()) {
            y1Var.m11113t3();
        }
        this.f9938V2 = false;
    }

    public void m32330lm(TdApi.Object object) {
        C11520h hVar = new C11520h(mo4348c(), (TdApi.Background) object);
        this.f30167b.m2712Oe().m2018f(hVar, C11524j.m141z0());
        this.f30167b.m2294pc().m4096s0(hVar, true, C11524j.m177i0());
        m9298Zb();
    }

    public void m32329ln(float f, float f2, ValueAnimator valueAnimator) {
        m32430dq(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m32317mm(final TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            m9151ud(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32330lm(object);
                }
            });
        }
    }

    public void m32316mn(C6924j2 j2Var, TdApi.Users users, AbstractC4761s4 s4Var, View view) {
        j2Var.m18408y2(true);
        long[] jArr = users.userIds;
        if (jArr.length > 1) {
            C11504x.m385I3(this, s4Var, jArr);
        } else if (jArr.length == 1) {
            this.f30167b.m2485dd().m3429v7(this, users.userIds[0], new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view)));
        }
    }

    public static Object m32304nl(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27889d2(z);
        }
        return null;
    }

    public void m32303nm(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        m32287op(messageSchedulingState);
    }

    public void m32302nn(TdApi.Object object, TextView textView, final AbstractC4761s4 s4Var, C7040u3 u3Var, LinearLayout linearLayout, final C6924j2 j2Var) {
        final TdApi.Users users = (TdApi.Users) object;
        long[] jArr = users.userIds;
        if (jArr.length > 1) {
            textView.setText(View$OnClickListenerC11498s.m396xg(s4Var, users.totalCount).toString());
        } else if (jArr.length == 1) {
            textView.setText(C5078d.m23986z().m24024I(this.f30167b.m2151yb(new TdApi.MessageSenderUser(users.userIds[0]))));
        } else {
            textView.setText(View$OnClickListenerC11498s.m397wg(s4Var));
        }
        u3Var.m18033f(this.f30167b, users);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                View$OnClickListenerC2971rh.this.m32316mn(j2Var, users, s4Var, view);
            }
        });
    }

    public boolean m32291ol(long j, View view, int i) {
        if (i != R.id.btn_reportChat) {
            return true;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.ReportChat(j, null, new TdApi.ChatReportReasonUnrelatedLocation(), null), this.f30167b.m2392ja());
        m32736Gj();
        this.f30167b.m2485dd().m3703U2(this, j);
        return true;
    }

    public void m32290om(String str, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        m32703Ip(str, false, true, false, z, messageSchedulingState);
    }

    public void m32289on(final TextView textView, final AbstractC4761s4 s4Var, final C7040u3 u3Var, final LinearLayout linearLayout, final C6924j2 j2Var, final TdApi.Object object) {
        if (object.getConstructor() == 171203420) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32302nn(object, textView, s4Var, u3Var, linearLayout, j2Var);
                }
            });
        }
    }

    public void m32278pl(final long j, View view) {
        TdApi.ChatLocation o3 = this.f30167b.m2319o3(j);
        if (o3 != null) {
            m9261ee(C4403w.m27935T("%1$s\n\n%2$s", C2622ke.f8889a, C4403w.m27869i1(R.string.ReportLocationTitle), C4403w.m27853m1(R.string.ReportLocationDesc, o3.address)), new int[]{R.id.btn_reportChat, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ReportLocationAction), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_report_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean ol;
                    ol = View$OnClickListenerC2971rh.this.m32291ol(j, view2, i);
                    return ol;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    public boolean m32277pm(View view) {
        this.f10030x0.m7784K2(true);
        return true;
    }

    public void m32276pn(HandlerC10770jj.AbstractC10786o oVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        if (!m9347Sa()) {
            oVar.mo3333a(z2 || z, messageSchedulingState, z3);
        }
    }

    public void m32265ql(TdApi.Chat chat, View view) {
        RunnableC2374f5 f5Var = new RunnableC2374f5(this.f30165a, this.f30167b);
        f5Var.m34725zg(10);
        f5Var.m34766Vg(true);
        f5Var.m34764Xg(new RunnableC2374f5.C2376b(new C2990n(chat)));
        f5Var.m34760Zg(R.string.AddMember, chat.title);
        m9291ac(f5Var);
    }

    public void m32264qm(C6910i0 i0Var) {
        m32197vo();
    }

    public void m32263qn(boolean z, TdApi.Message message) {
        TdApi.Function function;
        if (message.isPinned != z) {
            if (z) {
                function = new TdApi.PinChatMessage(mo9464C9(), message.f25406id, false, false);
            } else {
                function = new TdApi.UnpinChatMessage(mo9464C9(), message.f25406id);
            }
            this.f30167b.m2270r4().m14783o(function, this.f30167b.m2392ja());
        }
    }

    public boolean m32252rl(long j, View view, int i) {
        if (i != R.id.btn_shareMyContact) {
            return true;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.SharePhoneNumber(this.f30167b.m2494d4(j)), this.f30167b.m2392ja());
        return true;
    }

    public void m32251rm(C9717z3 z3Var) {
        m32736Gj();
    }

    public void m32250rn(long j, AbstractC4761s4 s4Var, int i, SparseIntArray sparseIntArray) {
        boolean z = sparseIntArray.get(R.id.btn_notifyMembers) != 0;
        boolean l = C7316a.m17049l(j);
        this.f30167b.m2270r4().m14783o(new TdApi.PinChatMessage(j, s4Var.m26205E4(), !l && !z, l && !z), this.f30167b.m2392ja());
    }

    public void m32239sl(final long j, View view) {
        TdApi.User Z9 = this.f30167b.m2550Z9();
        if (Z9 != null) {
            m9261ee(C4779t2.m25437r2(Z9) + ", " + C1363c0.m37410w(Z9.phoneNumber), new int[]{R.id.btn_shareMyContact, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.SharePhoneNumberAction), C4403w.m27869i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_contact_phone_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean rl;
                    rl = View$OnClickListenerC2971rh.this.m32252rl(j, view2, i);
                    return rl;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    public void m32238sm(View view) {
        C11504x.m387G3(this, this.f10002q0.f25367id, this.f9961d2.getInfo());
    }

    public void m32237sn(long j) {
        if (!m9347Sa() && mo9464C9() == j) {
            C10930q6 q6Var = this.f30167b;
            q6Var.m2295pb(q6Var.m2494d4(j), this.f10002q0.f25367id, this.f9913N1);
            m32748Fk();
        }
    }

    public void m32226tl(View view) {
        if (this.f10030x0.m7649q1()) {
            m32762Ej();
        } else {
            this.f30167b.m2485dd().m3448t8(this, mo9464C9());
        }
    }

    public void m32225tm() {
        this.f30167b.m2294pc().m4105o(this.f10002q0.f25367id, this.f9961d2.getInfo());
    }

    public void m32224tn(Runnable runnable, TdApi.Object object) {
        if (C4779t2.m25450p3(object)) {
            this.f30167b.m2485dd().post(runnable);
        } else {
            this.f30167b.m2392ja().mo255t2(object);
        }
    }

    public void m32213ul(boolean z) {
        if (this.f9934U1 != null && (this.f9998p0 & 1) == 0) {
            this.f9934U1 = null;
            if (this.f9982k2 == null) {
                m32202vj();
            }
            if (z) {
                this.f10038z0.setTextChangedSinceChatOpened(true);
                m32431dp();
            }
        }
    }

    public void m32212um(C6973n0 n0Var, int i) {
        this.f9940W1.m18477M1(this.f9952a2);
    }

    public void m32200vl(float f, ValueAnimator valueAnimator) {
        m32430dq(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public boolean m32199vm(View view) {
        long C9 = mo9464C9();
        if (C9 == 0 || m9347Sa()) {
            return false;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.ReadAllChatMentions(C9), this.f30167b.m2392ja());
        return true;
    }

    public void m32198vn(boolean z, TdApi.InputMessageContent inputMessageContent, AbstractC5918j jVar, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z4;
        C10930q6 q6Var = this.f30167b;
        long j = this.f10002q0.f25367id;
        long qk = m32266qk();
        long ko = z ? m32341ko() : 0L;
        if (z2 || m32328lo()) {
            z4 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z4 = false;
        }
        q6Var.m2247sb(j, qk, ko, new TdApi.MessageSendOptions(z4, false, false, messageSchedulingState2), inputMessageContent, jVar);
    }

    public boolean m32187wl(View view, int i) {
        if (i == R.id.btn_dismissForSelf) {
            this.f10030x0.m7632u0();
            return true;
        } else if (i != R.id.btn_unpinMessage) {
            return true;
        } else {
            this.f30167b.m2270r4().m14783o(new TdApi.UnpinAllChatMessages(mo9464C9()), this.f30167b.m2392ja());
            return true;
        }
    }

    public static void m32186wm(TdApi.ChatSource chatSource, long j) {
        if (j >= TimeUnit.SECONDS.toMillis(5L)) {
            C4868i.m24726c2().m24574v2(chatSource);
        }
    }

    public void m32174xl(TdApi.Object object, long j, long j2) {
        TdApi.Chat chat;
        TdApi.DraftMessage ek;
        if (object.getConstructor() == 1435961258 && (chat = this.f10002q0) != null && chat.f25367id == j && (ek = m32423ek()) != null && ek.replyToMessageId == j2) {
            m32607Qj((TdApi.Message) object);
        }
    }

    public void m32173xm(boolean z) {
        if (z && m9339Ta()) {
            this.f10031x1 = true;
            m32470ap();
        }
    }

    public void m32172xn(boolean z, TdApi.Audio audio, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        this.f30167b.m2247sb(this.f10002q0.f25367id, m32266qk(), z ? m32341ko() : 0L, new TdApi.MessageSendOptions(z2 || m32328lo(), false, false, messageSchedulingState), C4779t2.m25690F5(audio), null);
    }

    public void m32161yl(final long j, final long j2, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32174xl(object, j, j2);
            }
        });
    }

    public void m32160ym(TdApi.MessageSchedulingState messageSchedulingState) {
        if (!m32743Fp(false, messageSchedulingState)) {
            m32677Kp(true, false, messageSchedulingState);
        }
    }

    public void m32159yn(C4747r rVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        if (C7316a.m17049l(mo9464C9()) || rVar.m26272b0() == null) {
            m32703Ip(rVar.m26273a0(), true, true, false, z, messageSchedulingState);
            return;
        }
        m32703Ip(rVar.m26273a0() + '@' + rVar.m26272b0(), true, true, false, z, messageSchedulingState);
    }

    public static void m32155yr(C7484p1 p1Var) {
        float[] fArr = C4868i.f16615S;
        int length = fArr.length;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (fArr[i] == C4868i.m24726c2().m24592t0()) {
                z = true;
                break;
            } else {
                i2++;
                i++;
            }
        }
        if (z) {
            p1Var.setValue(i2 / (C4868i.f16615S.length - 1));
        }
    }

    public void m32148zl(AbstractRunnableC5910b[] bVarArr, boolean[] zArr, boolean z, Location location) {
        bVarArr[0].m21857c();
        if (!zArr[0]) {
            zArr[0] = true;
            m32195vq(z, location);
        }
    }

    public void m32147zm(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        m32677Kp(false, z, messageSchedulingState);
    }

    public void m32146zn(String str, String str2, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        if (C7316a.m17052i(mo9464C9()) || str == null || str2.contains("@")) {
            if (this.f9907L1 && this.f9910M1 == 2) {
                m32748Fk();
            }
            m32703Ip(str2, false, false, false, z, messageSchedulingState);
            return;
        }
        m32703Ip(str2 + '@' + str, false, false, false, z, messageSchedulingState);
    }

    @Override
    public boolean mo493A3(android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2971rh.mo493A3(android.view.View, int):boolean");
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        this.f9875A3 = false;
        C9534f fVar = this.f10010s0;
        if (fVar != null) {
            fVar.setTranslationX(0.0f);
        }
        this.f30167b.m2485dd().m3657Y8(R.id.menu_secretChat, this.f30156R, this.f10002q0, true);
        m32169xq();
    }

    public final boolean m32815Ai() {
        return this.f9957c1 == 0 && C4779t2.m25619Q(m32813Ak()) && m32671Li();
    }

    public boolean m32814Aj(long j, C4737p7 p7Var) {
        C4737p7 p7Var2;
        return mo9464C9() == j && (((p7Var2 = this.f9987m1) == null && p7Var == null) || (p7Var2 != null && p7Var2.equals(p7Var)));
    }

    public final TdApi.Message m32813Ak() {
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (eVar == null || eVar.m21496p() != 1) {
            return null;
        }
        return this.f9880C1.m21495q(0).m25984a4(this.f9880C1.m21501j(0));
    }

    public final void m32809Ao(boolean z) {
        m32145zo(this.f10000p2, this.f10004q2, true, z);
    }

    public void m32808Ap(List<View$OnClickListenerC8750f0.C8759h> list, boolean z, boolean z2, boolean z3, TdApi.MessageSchedulingState messageSchedulingState) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z4;
        if (m32761Ek()) {
            int size = list.size();
            TdApi.InputMessageContent[] inputMessageContentArr = new TdApi.InputMessageContent[size];
            for (int i = 0; i < size; i++) {
                View$OnClickListenerC8750f0.C8759h hVar = list.get(i);
                inputMessageContentArr[i] = this.f30167b.m2429h5().m23151B(new TdApi.InputMessageAudio(C4779t2.m25530e0(hVar.m11493i(), hVar.m11494h()), null, (int) (hVar.m11496f() / 1000), hVar.m11492j(), hVar.m11498d(), null), m32396gl());
            }
            long j = this.f10002q0.f25367id;
            long qk = m32266qk();
            long ko = z2 ? m32341ko() : 0L;
            if (z3 || m32328lo()) {
                z4 = true;
                messageSchedulingState2 = messageSchedulingState;
            } else {
                messageSchedulingState2 = messageSchedulingState;
                z4 = false;
            }
            for (TdApi.Function function : C4779t2.m25718B5(j, qk, ko, new TdApi.MessageSendOptions(z4, false, false, messageSchedulingState2), inputMessageContentArr, z)) {
                this.f30167b.m2270r4().m14783o(function, this.f30167b.m2610V9());
            }
        }
    }

    public void m32807Aq(long j, TdApi.Message[] messageArr) {
        if (messageArr != null && messageArr.length != 0) {
            m32735Gk();
            x00 x00Var = new x00(this.f30165a, this.f30167b);
            x00Var.m30994Vi(new x00.C3281m(messageArr).m30858z(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32603Qn();
                }
            }));
            x00Var.m30960ej();
        }
    }

    public final void m32806Ar() {
        mo4347s().m14529V0().m6842y1();
    }

    @Override
    public void mo1557B0(final TdApi.SecretChat secretChat) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32459bn(secretChat);
            }
        });
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo9469Bc(int i, boolean z) {
        if (i == 4) {
            m32744Fo(true);
        } else if (i == 6 && !z) {
            m9330Uc(false);
        }
    }

    public final boolean m32802Bi(int i) {
        int p;
        TdApi.Chat chat = this.f10002q0;
        if (chat == null || !chat.canBeReported || this.f9880C1 == null || i > 3 || m32435dl() || (p = this.f9880C1.m21496p()) <= 1) {
            return false;
        }
        for (int i2 = 0; i2 < p; i2++) {
            if (!this.f9880C1.m21495q(i2).m25876m0()) {
                return false;
            }
        }
        return true;
    }

    public boolean m32801Bj(long j, C4737p7 p7Var, boolean z) {
        C4737p7 p7Var2;
        return mo9464C9() == j && (((p7Var2 = this.f9987m1) == null && p7Var == null) || (p7Var2 != null && p7Var2.equals(p7Var))) && z == m32216ui();
    }

    public final void m32796Bo() {
        if (!this.f9914N2) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
            if (z0Var == null) {
                ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var2 = new ViewTreeObserver$OnPreDrawListenerC7081z0(mo4347s());
                this.f9879C0 = z0Var2;
                z0Var2.m17847a2(this, true, this, this, false);
                this.f10022v0.addView(this.f9879C0);
                this.f10018u0.getViewTreeObserver().addOnPreDrawListener(this.f9879C0);
            } else {
                z0Var.setVisibility(0);
            }
            if (this.f9992n2) {
                this.f9917O2 = this.f9996o2;
                m32657Mj();
            } else {
                this.f9917O2 = m9348S9();
            }
            m32601Qp(true, true);
            if (this.f9917O2) {
                this.f9885E0.setImageResource(R.drawable.baseline_keyboard_24);
                this.f9879C0.m17848Z1(this.f10038z0);
                return;
            }
            this.f9885E0.setImageResource(R.drawable.baseline_direction_arrow_down_24);
        }
    }

    public void m32795Bp(final String str, final int i, boolean z) {
        if (str != null && m32761Ek()) {
            final long j = this.f10002q0.f25367id;
            final long ko = z ? m32341ko() : 0L;
            final boolean lo = m32328lo();
            final boolean gl = m32396gl();
            C4356b0.m28201k().m28195q(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32732Gn(str, i, gl, j, ko, lo);
                }
            });
        }
    }

    public void m32794Bq(final long j) {
        final TdApi.User Z9;
        if (m32761Ek() && (Z9 = this.f30167b.m2550Z9()) != null) {
            m32665Lo(false, null, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                    View$OnClickListenerC2971rh.this.m32590Rn(j, Z9, z, messageSchedulingState, z2);
                }
            });
        }
    }

    public final void m32793Br() {
        float f = -m32201vk();
        this.f10026w0.setTranslationY(f);
        this.f9872A0.setTranslationY(f);
        this.f9937V1.setTranslationY(f);
        m32450cj();
        m32197vo();
    }

    @Override
    public void mo8378C1(int i) {
    }

    @Override
    public void mo61C4(C11131y6 y6Var, int i, int i2) {
        C11008t0.m1997e(this, y6Var, i, i2);
    }

    @Override
    public void mo4075C5(final long j, final long j2) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32382hm(j, j2);
            }
        });
    }

    @Override
    public boolean mo9465C8() {
        return this.f9875A3;
    }

    @Override
    public long mo9464C9() {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null) {
            return chat.f25367id;
        }
        return 0L;
    }

    @Override
    public void mo420Cc(String str) {
        m32392gp(str);
    }

    public final boolean m32789Ci() {
        int p;
        TdApi.Chat chat = this.f10002q0;
        if (chat == null || !chat.canBeReported || this.f9880C1 == null || m32435dl() || (p = this.f9880C1.m21496p()) <= 1) {
            return false;
        }
        for (int i = 0; i < p; i++) {
            if (!this.f9880C1.m21495q(i).m25796u0()) {
                return false;
            }
        }
        return true;
    }

    public boolean m32788Cj(long j) {
        return j != 0 && C7316a.m17044q(mo9464C9()) == j;
    }

    public int m32787Ck() {
        return (int) (this.f9940W1.getTotalVisualHeight() * (1.0f - m9182qa()));
    }

    public final void m32783Co() {
        m32524Wn(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC2971rh.this.m32355jn((TdApi.ChatAdministrators) obj);
            }
        });
    }

    public void m32782Cp(final C6253l[] lVarArr, final boolean z, final TdApi.MessageSendOptions messageSendOptions, final boolean z2, final boolean z3) {
        if (lVarArr != null && lVarArr.length != 0 && m32761Ek()) {
            final long j = this.f10002q0.f25367id;
            final long ko = m32341ko();
            final boolean gl = m32396gl();
            C4356b0.m28201k().m28195q(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32718Hn(lVarArr, z3, z2, gl, z, j, ko, messageSendOptions);
                }
            });
        }
    }

    public void m32781Cq(boolean z) {
        m32794Bq(z ? m32341ko() : 0L);
    }

    public final void m32780Cr() {
        if (this.f9971g3 != null) {
            float f = this.f10029w3;
            float f2 = ((1.0f - this.f10025v3) * 0.39999998f) + 0.6f;
            ImageView imageView = this.f9983k3;
            imageView.setAlpha((imageView.isEnabled() ? f2 : 0.6f) * f);
            ImageView imageView2 = this.f9986l3;
            if (!imageView2.isEnabled()) {
                f2 = 0.6f;
            }
            imageView2.setAlpha(f2 * f);
            float f3 = this.f10025v3;
            float f4 = (1.0f - f3) * f;
            float f5 = ((1.0f - f3) * 0.4f) + 0.6f;
            float f6 = f * f3;
            float f7 = (f3 * 0.4f) + 0.6f;
            this.f9989m3.setAlpha(f4);
            this.f9989m3.setScaleX(f5);
            this.f9989m3.setScaleY(f5);
            this.f9993n3.setAlpha(f6);
            this.f9993n3.setScaleX(f7);
            this.f9993n3.setScaleY(f7);
        }
    }

    @Override
    public void mo3249D2(final TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32642Nm(notificationSettingsScope);
            }
        });
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    public boolean m32776Di() {
        return m32671Li() && mo9464C9() != 0 && !m32566Tk() && !m9332Ua();
    }

    public final void m32775Dj() {
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (!(eVar == null || eVar.m21496p() == 0)) {
            if (this.f9880C1.m21496p() == 1) {
                TdApi.Message Ak = m32813Ak();
                TdApi.FormattedText w1 = Ak != null ? C7321e.m16899w1(Ak.content) : null;
                if (w1 != null) {
                    C1379j0.m37325i(C4779t2.m25441q5(w1), R.string.CopiedText);
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int p = this.f9880C1.m21496p();
            boolean z = true;
            for (int i = 0; i < p; i++) {
                long j = this.f9880C1.m21501j(i);
                AbstractC4761s4 q = this.f9880C1.m21495q(i);
                TdApi.Message a4 = q.m25984a4(j);
                if (a4 != null) {
                    if (z) {
                        z = false;
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                    }
                    String R9 = this.f30167b.m2670R9(a4);
                    if (a4.viaBotUserId != 0) {
                        spannableStringBuilder.append((CharSequence) C4403w.m27865j1(R.string.message_nameViaBot, R9, "@" + this.f30167b.m2480e2().m1694R2(a4.viaBotUserId)));
                    } else {
                        spannableStringBuilder.append((CharSequence) R9);
                    }
                    spannableStringBuilder.append((CharSequence) ", [");
                    spannableStringBuilder.append((CharSequence) C4403w.m27805y1(a4.date, TimeUnit.SECONDS));
                    spannableStringBuilder.append((CharSequence) "]");
                    if (a4.isChannelPost && !C5070i.m24061i(a4.authorSignature)) {
                        spannableStringBuilder.append((CharSequence) "\n[");
                        spannableStringBuilder.append((CharSequence) C4403w.m27865j1(R.string.PostedBy, a4.authorSignature));
                        spannableStringBuilder.append((CharSequence) "]");
                    }
                    if (a4.replyToMessageId != 0) {
                        String S3 = q.m26063S3();
                        if (!C5070i.m24061i(S3)) {
                            spannableStringBuilder.append((CharSequence) "\n[");
                            spannableStringBuilder.append((CharSequence) C4403w.m27865j1(R.string.InReplyToX, S3));
                            spannableStringBuilder.append((CharSequence) "]");
                        }
                    }
                    if (a4.forwardInfo != null) {
                        spannableStringBuilder.append((CharSequence) "\n[ ");
                        spannableStringBuilder.append((CharSequence) C4403w.m27865j1(R.string.ForwardedFromX, q.m26173H4()));
                        spannableStringBuilder.append((CharSequence) " ]");
                    }
                    TdApi.FormattedText w12 = C7321e.m16899w1(a4.content);
                    if (a4.content.getConstructor() != 1989037971) {
                        spannableStringBuilder.append((CharSequence) "\n[");
                        spannableStringBuilder.append((CharSequence) C4779t2.m25717C(this.f30167b, a4, false));
                        spannableStringBuilder.append((CharSequence) "]");
                    }
                    if (!C7321e.m16965a1(w12)) {
                        spannableStringBuilder.append('\n');
                        spannableStringBuilder.append(C4779t2.m25441q5(w12));
                    }
                }
            }
            C1379j0.m37325i(SpannableString.valueOf(spannableStringBuilder), R.string.CopiedMessages);
        }
    }

    public boolean m32774Dk() {
        boolean z;
        if (m32448cl()) {
            RunnableC9558i0 i0Var = this.f10038z0;
            TdApi.FormattedText f = i0Var != null ? i0Var.mo8279f(true) : null;
            switch (this.f9982k2.content.getConstructor()) {
                case TdApi.MessagePhoto.CONSTRUCTOR:
                case TdApi.MessageAudio.CONSTRUCTOR:
                case TdApi.MessageVoiceNote.CONSTRUCTOR:
                case TdApi.MessageDocument.CONSTRUCTOR:
                case TdApi.MessageAnimation.CONSTRUCTOR:
                case TdApi.MessageVideo.CONSTRUCTOR:
                    return !C7321e.m16995M(C7321e.m16899w1(this.f9982k2.content), f);
                case TdApi.MessageText.CONSTRUCTOR:
                    TdApi.MessageText messageText = (TdApi.MessageText) this.f9982k2.content;
                    TdApi.InputMessageText inputMessageText = new TdApi.InputMessageText(f, m32488Zj(), false);
                    if (!C7321e.m16995M(inputMessageText.text, messageText.text) || (((z = inputMessageText.disableWebPagePreview) && messageText.webPage != null) || (!z && messageText.webPage == null && this.f9908L2 != null))) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public void m32770Do(long j, TdApi.Game game, String str, TdApi.Message message) {
        String str2;
        TdApi.User v2 = this.f30167b.m2480e2().m1583v2(j);
        C2869p9 p9Var = new C2869p9(this.f30165a, this.f30167b);
        long j2 = v2 != null ? v2.f25439id : 0L;
        if (v2 != null) {
            str2 = "@" + v2.username;
        } else {
            str2 = "Game";
        }
        p9Var.m9476Ad(new C2869p9.C2870a(j2, game, str2, str, message, this));
        m9291ac(p9Var);
    }

    public void m32769Dp(TdApi.Location location, int i, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        if (mo9464C9() == this.f10036y2) {
            m32300np(new TdApi.InputMessageLocation(location, 0, i, 0), true, z, messageSchedulingState, null);
            if (this.f10032x2) {
                mo8377l1();
            }
        }
    }

    public final void m32767Dr() {
        C9678w2 w2Var = this.f10030x0;
        int M0 = w2Var != null ? w2Var.m7778M0() : -1;
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f9984l1;
        if (searchMessagesFilter != null) {
            if (searchMessagesFilter.getConstructor() == 371805512) {
                if (M0 > 0) {
                    this.f10010s0.setForcedSubtitle(C4403w.m27836q2(R.string.XPinnedMessages, M0));
                } else {
                    this.f10010s0.setForcedSubtitle(C4403w.m27869i1(R.string.PinnedMessages));
                }
            }
        } else if (M0 > 0) {
            if (this.f30167b.m2395j7(this.f9981k1)) {
                this.f10010s0.setForcedSubtitle(C4403w.m27836q2(R.string.XFoundMessagesFromSelf, M0));
            } else {
                this.f10010s0.setForcedSubtitle(C4403w.m27832r2(this.f9981k1.getConstructor() == -336109341 ? R.string.XFoundMessagesFromUser : R.string.XFoundMessagesFromChat, M0, this.f30167b.m2135zb(this.f9981k1, true)));
            }
        } else if (this.f30167b.m2395j7(this.f9981k1)) {
            this.f10010s0.setForcedSubtitle(C4403w.m27869i1(R.string.FoundMessagesFromSelf));
        } else {
            this.f10010s0.setForcedSubtitle(C4403w.m27853m1(this.f9981k1.getConstructor() == -336109341 ? R.string.FoundMessagesFromUser : R.string.FoundMessagesFromChat, this.f30167b.m2135zb(this.f9981k1, true)));
        }
    }

    @Override
    public boolean mo16455E(View view, TdApi.Animation animation) {
        if ((this.f9920P2 != 0 && SystemClock.uptimeMillis() - this.f9920P2 < 200) || !m32274pp(view, animation, true)) {
            return false;
        }
        this.f9920P2 = SystemClock.uptimeMillis();
        return true;
    }

    @Override
    public void mo3248E5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        C10791k1.m3309b(this, notificationSettingsScope);
    }

    @Override
    public boolean mo9450E8() {
        return !m32527Wk();
    }

    public final boolean m32763Ei() {
        return false;
    }

    public void m32762Ej() {
        if (m9339Ta() && this.f10002q0 != null) {
            this.f30167b.m2786K4(mo9464C9(), false, null);
            this.f30167b.m2485dd().m3703U2(this, mo9464C9());
        }
    }

    public boolean m32761Ek() {
        TdApi.Chat chat = this.f10002q0;
        return chat != null && this.f30167b.m2220u6(chat) && !m32435dl();
    }

    public final void m32757Eo() {
        this.f30167b.m2485dd().m3489p7(this, C7316a.m17045p(mo9464C9()), new HandlerC10770jj.C10780j().m3368h().m3362n());
    }

    public void m32756Ep(final C4695l6 l6Var, boolean z, boolean z2, final TdApi.MessageSchedulingState messageSchedulingState) {
        if (m32761Ek()) {
            final long j = this.f10002q0.f25367id;
            final long ko = z ? m32341ko() : 0L;
            final boolean z3 = z2 || m32328lo();
            if (l6Var.m26468g() == null) {
                C4383l.m28059a().m28058b(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2971rh.this.m32705In(l6Var, j, ko, z3, messageSchedulingState);
                    }
                });
            } else {
                this.f30167b.m2247sb(j, m32266qk(), ko, new TdApi.MessageSendOptions(z3, false, false, messageSchedulingState), new TdApi.InputMessageVoiceNote(l6Var.m26466i(), l6Var.m26472c(), l6Var.m26468g(), null), null);
            }
        }
    }

    public boolean m32755Eq() {
        return m32742Fq(this.f9913N1);
    }

    public final void m32754Er() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            ?? Fi = m32750Fi();
            int i = 8;
            d1Var.m10097P3(R.id.menu_messageActions, R.id.menu_btn_selectInBetween, Fi != 0 ? 0 : 8, 0);
            View$OnClickListenerC9170d1 d1Var2 = this.f30156R;
            boolean Ai = m32815Ai();
            d1Var2.m10097P3(R.id.menu_messageActions, R.id.menu_btn_reply, Ai ? 0 : 8, 0);
            int i2 = Fi;
            if (Ai) {
                i2 = Fi + 1;
            }
            View$OnClickListenerC9170d1 d1Var3 = this.f30156R;
            boolean Ii = m32710Ii();
            d1Var3.m10097P3(R.id.menu_messageActions, R.id.menu_btn_forward, Ii ? 0 : 8, 0);
            int i3 = i2;
            if (Ii) {
                i3 = i2 + 1;
            }
            View$OnClickListenerC9170d1 d1Var4 = this.f30156R;
            boolean yi = m32164yi();
            d1Var4.m10097P3(R.id.menu_messageActions, R.id.menu_btn_edit, yi ? 0 : 8, 0);
            int i4 = i3;
            if (yi) {
                i4 = i3 + 1;
            }
            View$OnClickListenerC9170d1 d1Var5 = this.f30156R;
            boolean wi = m32190wi();
            d1Var5.m10097P3(R.id.menu_messageActions, R.id.menu_btn_copy, wi ? 0 : 8, 0);
            int i5 = i4;
            if (wi) {
                i5 = i4 + 1;
            }
            View$OnClickListenerC9170d1 d1Var6 = this.f30156R;
            boolean Ci = m32789Ci();
            d1Var6.m10097P3(R.id.menu_messageActions, R.id.menu_btn_retry, Ci ? 0 : 8, 0);
            int i6 = i5;
            if (Ci) {
                i6 = i5 + 1;
            }
            View$OnClickListenerC9170d1 d1Var7 = this.f30156R;
            boolean xi = m32177xi();
            d1Var7.m10097P3(R.id.menu_messageActions, R.id.menu_btn_delete, xi ? 0 : 8, 0);
            int i7 = i6;
            if (xi) {
                i7 = i6 + 1;
            }
            View$OnClickListenerC9170d1 d1Var8 = this.f30156R;
            boolean Ki = m32684Ki();
            d1Var8.m10097P3(R.id.menu_messageActions, R.id.menu_btn_view, Ki ? 0 : 8, 0);
            int i8 = i7;
            if (Ki) {
                i8 = i7 + 1;
            }
            View$OnClickListenerC9170d1 d1Var9 = this.f30156R;
            boolean Hi = m32723Hi();
            d1Var9.m10097P3(R.id.menu_messageActions, R.id.menu_btn_send, Hi ? 0 : 8, 0);
            int i9 = i8;
            if (Hi) {
                i9 = i8 + 1;
            }
            View$OnClickListenerC9170d1 d1Var10 = this.f30156R;
            boolean vi = m32203vi();
            d1Var10.m10097P3(R.id.menu_messageActions, R.id.menu_btn_clearCache, vi ? 0 : 8, 0);
            int i10 = i9;
            if (vi) {
                i10 = i9 + 1;
            }
            View$OnClickListenerC9170d1 d1Var11 = this.f30156R;
            boolean Ji = m32697Ji();
            d1Var11.m10097P3(R.id.menu_messageActions, R.id.btn_unpinAll, Ji ? 0 : 8, 0);
            int i11 = i10;
            if (Ji) {
                i11 = i10 + 1;
            }
            View$OnClickListenerC9170d1 d1Var12 = this.f30156R;
            if (m32802Bi(i11)) {
                i = 0;
            }
            d1Var12.m10097P3(R.id.menu_messageActions, R.id.menu_btn_report, i, 0);
        }
    }

    @Override
    public void mo9808F2(int i, C8112b bVar, boolean z) {
        int f0 = this.f10030x0.m7808E0().m8120f0(bVar);
        if (f0 != -1) {
            this.f10030x0.m7808E0().m8116j0(f0).m25935f9(bVar, z);
        }
    }

    @Override
    public boolean mo16446F4(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        if ((this.f9920P2 != 0 && SystemClock.uptimeMillis() - this.f9920P2 < 200) || !m32716Hp(view, lVar.m35574j(), lVar.m35581c(), true, z, messageSchedulingState)) {
            return false;
        }
        this.f9920P2 = SystemClock.uptimeMillis();
        return true;
    }

    public final boolean m32750Fi() {
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (eVar == null || eVar.m21496p() != 2) {
            return false;
        }
        long j = this.f9880C1.m21501j(0);
        long j2 = this.f9880C1.m21501j(1);
        int n0 = this.f10030x0.m7808E0().m8112n0(j);
        int n02 = this.f10030x0.m7808E0().m8112n0(j2);
        if (n0 == -1 || n02 == -1) {
            return false;
        }
        return n0 - n02 > 1 || this.f9880C1.m21495q(0).m25948e4(j, j2) + this.f9880C1.m21495q(1).m25948e4(j, j2) > 0;
    }

    public final void m32749Fj(long j) {
        synchronized (this) {
            C6035e<AbstractC4761s4> eVar = this.f9880C1;
            if (eVar != null) {
                eVar.m21499l(j);
            }
        }
    }

    public void m32748Fk() {
        if (this.f9907L1) {
            this.f9901J1.setVisibility(8);
            RunnableC9558i0 i0Var = this.f10038z0;
            if (i0Var != null) {
                i0Var.setVisibility(0);
                m32424ej(false);
            }
            m32696Jj();
            this.f9907L1 = false;
        }
    }

    public final void m32744Fo(boolean z) {
        if (!this.f9938V2) {
            boolean z2 = false;
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractView$OnTouchListenerC7889a s = mo4347s();
                if (z) {
                    if (s.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        z2 = true;
                    }
                } else if (s.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    s.m14551P2();
                    return;
                }
            }
            final View$OnClickListenerC8851y1 y1Var = new View$OnClickListenerC8851y1(this);
            y1Var.m11190A2(this);
            if (z2) {
                y1Var.m11115s3();
            }
            this.f9938V2 = true;
            y1Var.m11143c3(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32342kn(y1Var);
                }
            }, 300L);
        }
    }

    public final boolean m32743Fp(boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        if (!this.f9959c3) {
            return false;
        }
        C4695l6 record = this.f9968f3.getRecord();
        if (record != null) {
            this.f9968f3.m8417O1();
            m32756Ep(record, true, z, messageSchedulingState);
            m32189wj(false);
        }
        return true;
    }

    public boolean m32742Fq(String str) {
        if (!this.f30167b.m2816I6(this.f10002q0)) {
            return false;
        }
        this.f9913N1 = str;
        m32729Gq(R.string.BotStart, 2);
        return true;
    }

    public void m32741Fr(CharSequence charSequence, boolean z) {
        this.f9891G0.setIsActive(charSequence.length() > 0 || m32461bl());
        m32424ej(z);
    }

    @Override
    public boolean mo21728G(C5974t0 t0Var, boolean z, boolean z2) {
        return m9339Ta();
    }

    @Override
    public void mo56G2(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        C11008t0.m1995g(this, y6Var, authorizationState, i);
    }

    @Override
    public void mo6954G4(boolean z) {
        if (!this.f9932T2.m29583h()) {
            m32638Nq(z ? R.string.HoldToVideo : R.string.HoldToAudio);
        }
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public View mo8869G9() {
        if (m32514Xk()) {
            return this.f10014t0;
        }
        if (m32406fo()) {
            return this.f9951a1;
        }
        if (mo9464C9() != 0) {
            return this.f10010s0;
        }
        return null;
    }

    @Override
    public View mo8868Ga() {
        return this.f9940W1;
    }

    public boolean m32737Gi() {
        return this.f30167b.m2820I2(this.f10002q0);
    }

    public final void m32736Gj() {
        this.f30167b.m2270r4().m14783o(new TdApi.RemoveChatActionBar(mo9464C9()), this.f30167b.m2392ja());
    }

    public void m32735Gk() {
        mo9397La();
        m32306nj(false);
        m32267qj();
    }

    public void m32731Go(AbstractC4761s4 s4Var) {
        if (m32229ti()) {
            AbstractC9323v4<?> kd = m9221kd();
            if ((kd instanceof View$OnClickListenerC2971rh) && kd.mo9464C9() == mo9464C9()) {
                ((View$OnClickListenerC2971rh) kd).m32632Ok(s4Var.m26179G9());
                m9298Zb();
                return;
            }
        }
        mo4348c().m2485dd().m3469r7(this, s4Var.m26145K2(), s4Var.m26179G9(), null);
    }

    public final void m32730Gp(final String str, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        m32183wp(null, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil, z, z2, messageSchedulingState, new AbstractC5913e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent Kn;
                Kn = View$OnClickListenerC2971rh.m32679Kn(str);
                return Kn;
            }
        });
    }

    public void m32729Gq(int i, int i2) {
        m32715Hq(C4403w.m27869i1(i).toUpperCase(), i2, true);
    }

    public void m32728Gr() {
        C6862d3 d3Var = this.f9872A0;
        if (d3Var != null) {
            d3Var.setColorId(this.f10030x0.m7615x3() ? R.id.theme_color_bubble_chatSeparator : R.id.theme_color_chatSeparator);
        }
    }

    public void m32727H(long j, long[] jArr) {
        TdApi.Message message = this.f9982k2;
        if (message != null && message.chatId == j && C5062b.m24153s(jArr, message.f25406id) != -1) {
            m32280pj();
        }
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    public final boolean m32723Hi() {
        C6035e<AbstractC4761s4> eVar;
        if (this.f9957c1 != 0 || (eVar = this.f9880C1) == null || eVar.m21496p() <= 0) {
            return false;
        }
        for (int i = 0; i < this.f9880C1.m21496p(); i++) {
            TdApi.Message a4 = this.f9880C1.m21495q(i).m25984a4(this.f9880C1.m21501j(i));
            if (a4 == null || a4.schedulingState == null) {
                return false;
            }
        }
        return true;
    }

    public final void m32722Hj() {
        AbstractC9323v4.C9338o oVar;
        if (!m32151zi(false)) {
            this.f10030x0.m7632u0();
            return;
        }
        int Q0 = this.f10030x0.m7762Q0();
        if (Q0 != -1) {
            AbstractC9323v4.C9338o oVar2 = null;
            AbstractC9323v4.C9340p.C9341a c = new AbstractC9323v4.C9340p.C9341a().m9092c(Q0 > 1 ? C4403w.m27836q2(R.string.UnpinXMessages, Q0) : null);
            if (m32151zi(false)) {
                oVar = new AbstractC9323v4.C9338o.C9339a().m9097d(R.id.btn_unpinMessage).m9095f(C4403w.m27869i1(Q0 == 1 ? R.string.UnpinMessage : R.string.UnpinMessagesConfirm)).m9099b(2).m9098c(R.drawable.deproko_baseline_pin_undo_24).m9100a();
            } else {
                oVar = null;
            }
            AbstractC9323v4.C9340p.C9341a d = c.m9091d(oVar);
            if (!m32383hl()) {
                oVar2 = new AbstractC9323v4.C9338o.C9339a().m9097d(R.id.btn_dismissForSelf).m9096e(R.string.HideForYourself).m9098c(R.drawable.baseline_close_24).m9100a();
            }
            m9247ge(d.m9091d(oVar2).m9093b().m9094a(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean wl;
                    wl = View$OnClickListenerC2971rh.this.m32187wl(view, i);
                    return wl;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    public final void m32721Hk() {
        this.f9882D0.setVisibility(4);
    }

    public final void m32717Ho() {
        this.f9998p0 |= 1;
        m32588Rp(true);
        final float uk = m32214uk();
        final float f = 1.0f - uk;
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View$OnClickListenerC2971rh.this.m32329ln(uk, f, valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7280b);
        b.setDuration(200L);
        b.addListener(new C2984h());
        b.start();
    }

    public final boolean m32716Hp(View view, final TdApi.Sticker sticker, final String str, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        return sticker != null && m32183wp(view, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil, z, z2, messageSchedulingState, new AbstractC5913e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent Jn;
                Jn = View$OnClickListenerC2971rh.m32692Jn(TdApi.Sticker.this, str);
                return Jn;
            }
        });
    }

    public void m32715Hq(CharSequence charSequence, int i, boolean z) {
        boolean z2;
        if (this.f9907L1) {
            mo9397La();
            m32259qr(charSequence, i, z);
            return;
        }
        if (this.f9901J1 == null) {
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(mo4347s());
            this.f9901J1 = frameLayoutFix;
            frameLayoutFix.setLayoutParams(new LinearLayout.LayoutParams(-1, C1357a0.m37541i(49.0f)));
            C6847b2 b2Var = new C6847b2(mo4347s());
            this.f9904K1 = b2Var;
            b2Var.setId(R.id.btn_chatAction);
            this.f9904K1.setOnClickListener(this);
            this.f9904K1.setTextSize(1, 16.0f);
            this.f9904K1.setTypeface(C1389o.m37260i());
            this.f9904K1.setPadding(C1357a0.m37541i(12.0f), 0, C1357a0.m37541i(12.0f), 0);
            C10189d.m5796h(this.f9904K1, this);
            this.f9904K1.setEllipsize(TextUtils.TruncateAt.END);
            this.f9904K1.setGravity(17);
            this.f9904K1.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f9901J1.addView(this.f9904K1);
            if (i == 7) {
                ImageView imageView = new ImageView(mo4347s());
                imageView.setOnClickListener(this);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.baseline_help_outline_24);
                imageView.setColorFilter(C11524j.m228N(R.id.theme_color_textNeutral));
                m9184q8(imageView, R.id.theme_color_textNeutral);
                imageView.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(49.0f), C1357a0.m37541i(49.0f), 21));
                imageView.setId(R.id.btn_help);
                this.f9901J1.addView(imageView);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.f9907L1 = true;
        m32259qr(charSequence, i, z);
        m32306nj(false);
        m32267qj();
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            i0Var.setVisibility(8);
            this.f10038z0.setTextSilently("");
        }
        m32721Hk();
        m32656Mk();
        m32682Kk();
        if (z2) {
            LinearLayout linearLayout = this.f10022v0;
            linearLayout.addView(this.f9901J1, Math.min(linearLayout.getChildCount(), 1));
        } else {
            this.f9901J1.setVisibility(0);
        }
        mo9397La();
    }

    public final void m32714Hr(boolean z) {
    }

    @Override
    public void mo4198I0(View view, View view2) {
        int id2 = view.getId();
        if (id2 != R.id.btn_sendToast) {
            switch (id2) {
                case R.id.btn_sendNoMarkdown:
                    if (m32448cl()) {
                        m32418ep(false);
                        return;
                    } else {
                        m32665Lo(false, null, new HandlerC10770jj.AbstractC10786o() {
                            @Override
                            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                                View$OnClickListenerC2971rh.this.m32147zm(z, messageSchedulingState, z2);
                            }
                        });
                        return;
                    }
                case R.id.btn_sendNoSound:
                    m32665Lo(true, null, new HandlerC10770jj.AbstractC10786o() {
                        @Override
                        public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                            View$OnClickListenerC2971rh.this.m32811Am(z, messageSchedulingState, z2);
                        }
                    });
                    return;
                case R.id.btn_sendOnceOnline:
                    if (!m32743Fp(false, new TdApi.MessageSchedulingStateSendWhenOnline())) {
                        m32677Kp(true, false, new TdApi.MessageSchedulingStateSendWhenOnline());
                        return;
                    }
                    return;
                case R.id.btn_sendScheduled:
                    this.f30167b.m2485dd().m3808J7(this, new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            View$OnClickListenerC2971rh.this.m32160ym((TdApi.MessageSchedulingState) obj);
                        }
                    }, mo9464C9(), false, false, null);
                    return;
                default:
                    return;
            }
        } else {
            m32613Pq(C4779t2.m25441q5(this.f10038z0.mo8279f(true)));
        }
    }

    @Override
    public boolean mo9421I8(float f, float f2) {
        if (!super.mo9421I8(f, f2)) {
            return false;
        }
        MessagesRecyclerView messagesRecyclerView = this.f10026w0;
        if (messagesRecyclerView == null) {
            return true;
        }
        messagesRecyclerView.m14141L1();
        return true;
    }

    @Override
    public void mo8867Ia() {
        C7045v2 v2Var;
        super.mo8867Ia();
        if (m32406fo() && (v2Var = this.f9948Z0) != null) {
            v2Var.mo8255s();
        }
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            i0Var.mo8255s();
        }
        C1399s0.m37171l0(this.f10026w0);
        RecyclerView recyclerView = this.f9939W0;
        if (recyclerView != null) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).m39572B2(C4403w.m27984G2());
            this.f9939W0.m39504A0();
            ((View$OnClickListenerC9592k4) this.f9939W0.getAdapter()).m8085g0(false);
        }
    }

    public final boolean m32710Ii() {
        C2979d0 d0Var;
        if (this.f9957c1 == 0 || (d0Var = this.f9945Y0) == null) {
            C6035e<AbstractC4761s4> eVar = this.f9880C1;
            if (eVar == null) {
                return false;
            }
            int p = eVar.m21496p();
            for (int i = 0; i < p; i++) {
                TdApi.Message a4 = this.f9880C1.m21495q(i).m25984a4(this.f9880C1.m21501j(i));
                if (a4 == null || !a4.canBeForwarded) {
                    return false;
                }
            }
            return p > 0;
        }
        i10 i10Var = (i10) d0Var.f10068O.m21471e(this.f9957c1);
        return i10Var != null && i10Var.m34341sf();
    }

    public final void m32709Ij() {
        this.f9882D0.setVisibility(0);
    }

    public final void m32708Ik(boolean z) {
        this.f9898I1.m29575p(false, z);
        m32568Ti();
    }

    public void m32704Io(TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat) {
    }

    public final void m32703Ip(String str, boolean z, boolean z2, boolean z3, boolean z4, TdApi.MessageSchedulingState messageSchedulingState) {
        m32690Jp(new TdApi.FormattedText(str, null), z, true, z2, z3, z4, messageSchedulingState);
    }

    public void m32702Iq(String str, int i) {
        m32715Hq(str, i, true);
    }

    public final void m32701Ir() {
        TdApi.Message[] h;
        this.f9953a3 = true;
        if (this.f9880C1 != null) {
            m32333lj();
        }
        m32320mj();
        m32385hj();
        m32483Zo();
        m32620Pj();
        this.f9940W1.m18482F1(false);
        m32457bp();
        this.f30167b.m2485dd().m3657Y8(R.id.menu_secretChat, this.f30156R, this.f10002q0, true);
        this.f10026w0.setMessageAnimatorEnabled(false);
        RunnableC5938f fVar = this.f10034y0;
        if (fVar != null) {
            fVar.m21843g();
            this.f10034y0 = null;
        }
        C5974t0 t0Var = this.f9878B2;
        if (t0Var != null) {
            t0Var.m21739o();
            this.f9878B2 = null;
        }
        this.f10010s0.m8404f2(this.f30167b, this.f10002q0, this.f9987m1);
        if (this.f9972h1) {
            int i = this.f9975i1;
            if (i == 3) {
                m32729Gq(R.string.Settings, 7);
                this.f10030x0.m7662n2(this.f10002q0);
                this.f10026w0.setItemAnimator(new C8731d(C2057b.f7280b, 120L));
                if (!(m9131x9().f10063p == 0 || this.f10010s0 == null)) {
                    this.f10030x0.m7731Z(new TdApi.ChatEventLogFilters(true, true, true, true, true, true, true, true, true, true, true, true), new long[]{m9131x9().f10063p});
                }
            } else if (i != 4) {
                this.f10030x0.m7757R1();
            } else {
                this.f10030x0.m7657o2(this.f10002q0, this.f9978j1, this.f9981k1, this.f9984l1);
                m32246rr(false);
            }
        } else {
            TdApi.Chat chat = this.f10002q0;
            mo9438Fd((chat == null || !this.f30167b.m2220u6(chat)) ? null : this.f10038z0, false);
            if (this.f10002q0 != null) {
                if (this.f10038z0 != null) {
                    boolean z = !m32422el();
                    if (this.f10038z0.isEnabled() != z) {
                        this.f10038z0.setEnabled(z);
                    }
                    if (z) {
                        this.f10038z0.setIsSecret(C4868i.m24726c2().m24741a3(this.f10002q0));
                    }
                }
                if (this.f30167b.m2220u6(this.f10002q0)) {
                    TdApi.DraftMessage ek = m32423ek();
                    if (ek != null) {
                        long j = ek.replyToMessageId;
                        if (j != 0 && !this.f10011s1) {
                            m32633Oj(j);
                        }
                    }
                    m32714Hr(this.f30167b.m2784K6(this.f10002q0.f25367id));
                }
                if (!this.f9972h1 && !m9332Ua()) {
                    m32608Qi();
                    m32529Wi(this.f10002q0.pendingJoinRequests);
                }
                RunnableC9558i0 i0Var = this.f10038z0;
                if (i0Var != null) {
                    TdApi.Chat chat2 = this.f10002q0;
                    C4737p7 p7Var = this.f9987m1;
                    C9686w3 w3Var = this.f9906L0;
                    i0Var.m8253t0(chat2, p7Var, w3Var != null && w3Var.getIsSilent());
                }
                this.f10011s1 = false;
                m32246rr(false);
                m32306nj(false);
                this.f10030x0.m7667m2(this.f10002q0, this.f9987m1, this.f9984l1, this, this.f9991n1, !this.f9972h1 && !m9332Ua());
                m32728Gr();
                C9585k0 k0Var = this.f9900J0;
                if (k0Var != null && k0Var.m8099c(this.f30167b.m2415i3(this.f10002q0.f25367id))) {
                    this.f9903K0.setTranslationX(this.f9900J0.m8100a() ? 0.0f : this.f9900J0.getLayoutParams().width);
                    this.f9882D0.m8496a();
                }
                switch (this.f10002q0.type.getConstructor()) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                        this.f30167b.m2480e2().m1634i2(C7316a.m17045p(this.f10002q0.f25367id));
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        this.f30167b.m2480e2().m1745E2(C4779t2.m25465n2(this.f10002q0));
                        break;
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        this.f30167b.m2480e2().m1708O(C7316a.m17048m(this.f10002q0.f25367id));
                        break;
                }
                if (this.f30167b.m2583X6(this.f10002q0.f25367id) || this.f30167b.m2816I6(this.f10002q0)) {
                    m32207ur(R.drawable.deproko_baseline_bots_command_26);
                    m32194vr(false);
                    this.f10034y0 = new RunnableC5938f(this, this.f10002q0);
                } else {
                    m32207ur(0);
                    this.f10034y0 = null;
                }
                C5974t0 t0Var2 = new C5974t0(this.f30165a, this.f30167b, this.f10002q0.f25367id, m32266qk(), this.f10040z2, false, this);
                this.f9878B2 = t0Var2;
                t0Var2.m21733v();
                RunnableC9558i0 i0Var2 = this.f10038z0;
                if (i0Var2 != null) {
                    i0Var2.setCommandListProvider(this.f10034y0);
                }
                C4737p7 p7Var2 = this.f9987m1;
                if (p7Var2 != null) {
                    AbstractC4761s4 s4Var = null;
                    for (TdApi.Message message : p7Var2.m26293h()) {
                        if (s4Var == null) {
                            s4Var = AbstractC4761s4.m25998Y9(this.f10030x0, message, this.f10002q0, null);
                        } else {
                            s4Var.m26199F0(message, true);
                        }
                    }
                    if (s4Var != null) {
                        s4Var.m25943e9(true);
                        this.f10030x0.m7756R2(s4Var);
                    }
                }
                long C9 = mo9464C9();
                Client r4 = this.f30167b.m2270r4();
                TdApi.GetChatAdministrators getChatAdministrators = new TdApi.GetChatAdministrators(C9);
                C2982f fVar2 = new C2982f(C9);
                this.f10019u1 = fVar2;
                r4.m14783o(getChatAdministrators, fVar2);
                m32181wr(false);
                m32489Zi();
                m32516Xi();
            }
        }
    }

    @Override
    public void mo419J(int i, View view) {
        C2979d0 d0Var;
        C2979d0 d0Var2;
        C2979d0 d0Var3;
        TdApi.Message[] mp;
        C2979d0 d0Var4;
        i10 i10Var;
        C7319d Lf;
        int i2 = 0;
        switch (i) {
            case R.id.menu_btn_clear:
                if (m32435dl()) {
                    m9341T8();
                    return;
                } else {
                    m32398gj();
                    return;
                }
            case R.id.menu_btn_clearCache:
                if (this.f9957c1 == 0 || (d0Var = this.f9945Y0) == null) {
                    C6035e<AbstractC4761s4> eVar = this.f9880C1;
                    if (eVar != null && eVar.m21496p() > 0) {
                        int p = this.f9880C1.m21496p();
                        C6038h hVar = new C6038h(p);
                        while (i2 < p) {
                            TdApi.Message a4 = this.f9880C1.m21495q(i2).m25984a4(this.f9880C1.m21501j(i2));
                            TdApi.File j1 = C4779t2.m25494j1(a4);
                            if (C4779t2.m25640N(a4, j1)) {
                                hVar.m21466j(j1.f25373id, j1);
                            }
                            i2++;
                        }
                        C4779t2.m25488k0(this, (TdApi.File[]) C5062b.m24166f(hVar, new TdApi.File[hVar.m21463n()]), new Runnable() {
                            @Override
                            public final void run() {
                                View$OnClickListenerC2971rh.this.m32733Gm();
                            }
                        });
                        return;
                    }
                    return;
                }
                i10 i10Var2 = (i10) d0Var.f10068O.m21471e(this.f9957c1);
                if (i10Var2 != null) {
                    i10Var2.m34339tf();
                    return;
                }
                return;
            case R.id.menu_btn_copy:
                if (this.f9880C1 != null) {
                    m32775Dj();
                    mo8837u5(-1);
                    return;
                }
                return;
            case R.id.menu_btn_delete:
                if (this.f9957c1 == 0 || (d0Var2 = this.f9945Y0) == null) {
                    C6035e<AbstractC4761s4> eVar2 = this.f9880C1;
                    if (eVar2 != null && eVar2.m21496p() > 0) {
                        int p2 = this.f9880C1.m21496p();
                        TdApi.Message[] messageArr = new TdApi.Message[p2];
                        while (i2 < p2) {
                            messageArr[i2] = this.f9880C1.m21495q(i2).m25984a4(this.f9880C1.m21501j(i2));
                            i2++;
                        }
                        this.f30167b.m2485dd();
                        HandlerC10770jj.m3418w8(this, messageArr, new Runnable() {
                            @Override
                            public final void run() {
                                View$OnClickListenerC2971rh.this.m32706Im();
                            }
                        });
                        return;
                    }
                    return;
                }
                i10 i10Var3 = (i10) d0Var2.f10068O.m21471e(this.f9957c1);
                if (i10Var3 != null) {
                    i10Var3.m34336vf();
                    return;
                }
                return;
            case R.id.menu_btn_done:
            case R.id.menu_btn_help:
            case R.id.menu_btn_lock:
            case R.id.menu_btn_manage:
            case R.id.menu_btn_masks:
            case R.id.menu_btn_muteUnmute:
            case R.id.menu_btn_pictureInPicture:
            case R.id.menu_btn_pinUnpin:
            case R.id.menu_btn_share:
            case R.id.menu_btn_toggle:
            default:
                return;
            case R.id.menu_btn_down:
                m32471ao(false);
                return;
            case R.id.menu_btn_edit:
                TdApi.Message Ak = m32813Ak();
                if (Ak != null) {
                    m32670Lj(Ak);
                    return;
                }
                return;
            case R.id.menu_btn_forward:
                if (this.f9957c1 == 0 || (d0Var3 = this.f9945Y0) == null) {
                    C6035e<AbstractC4761s4> eVar3 = this.f9880C1;
                    if (eVar3 != null) {
                        int p3 = eVar3.m21496p();
                        TdApi.Message Ak2 = m32813Ak();
                        if (Ak2 != null) {
                            m32143zq(Ak2);
                            return;
                        } else if (p3 > 1) {
                            TdApi.Message[] messageArr2 = new TdApi.Message[p3];
                            while (i2 < p3) {
                                messageArr2[i2] = this.f9880C1.m21495q(i2).m25984a4(this.f9880C1.m21501j(i2));
                                i2++;
                            }
                            m32807Aq(this.f10002q0.f25367id, messageArr2);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    i10 i10Var4 = (i10) d0Var3.f10068O.m21471e(this.f9957c1);
                    if (i10Var4 != null) {
                        i10Var4.m34398Ig();
                        return;
                    }
                    return;
                }
            case R.id.menu_btn_gallery:
                C1405v.m37101t(false);
                return;
            case R.id.menu_btn_more:
                if (this.f9972h1) {
                    int i3 = this.f9975i1;
                    if (i3 == 2) {
                        C5320c cVar = new C5320c(2);
                        C5146u0 u0Var = new C5146u0(2);
                        cVar.m23284a(R.id.btn_chatFontSizeScale);
                        u0Var.m23816a(C4868i.m24726c2().m24924A2() ? R.string.TextSizeScaleDisable : R.string.TextSizeScaleEnable);
                        if (C4868i.m24726c2().m24927A()) {
                            cVar.m23284a(R.id.btn_chatFontSizeReset);
                            u0Var.m23816a(R.string.TextSizeReset);
                        }
                        m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
                        return;
                    } else if (i3 == 5) {
                        C5320c cVar2 = new C5320c(2);
                        C5146u0 u0Var2 = new C5146u0(2);
                        cVar2.m23284a(R.id.btn_share);
                        u0Var2.m23816a(R.string.Share);
                        cVar2.m23284a(R.id.btn_copyLink);
                        u0Var2.m23816a(R.string.CopyLink);
                        m9302Yd(cVar2.m23280e(), u0Var2.m23813d(), 0);
                        return;
                    } else {
                        return;
                    }
                } else {
                    RunnableC9558i0 i0Var = this.f10038z0;
                    if (i0Var == null || !i0Var.m8292V()) {
                        m32455br();
                        return;
                    }
                    C5320c cVar3 = new C5320c(6);
                    C5146u0 u0Var3 = new C5146u0(6);
                    C5320c cVar4 = new C5320c(6);
                    cVar3.m23284a(R.id.btn_bold);
                    u0Var3.m23816a(R.string.TextFormatBold);
                    cVar4.m23284a(R.drawable.baseline_format_bold_24);
                    cVar3.m23284a(R.id.btn_italic);
                    u0Var3.m23816a(R.string.TextFormatItalic);
                    cVar4.m23284a(R.drawable.baseline_format_italic_24);
                    cVar3.m23284a(R.id.btn_underline);
                    u0Var3.m23816a(R.string.TextFormatUnderline);
                    cVar4.m23284a(R.drawable.baseline_format_underlined_24);
                    cVar3.m23284a(R.id.btn_strikethrough);
                    u0Var3.m23816a(R.string.TextFormatStrikethrough);
                    cVar4.m23284a(R.drawable.baseline_strikethrough_s_24);
                    cVar3.m23284a(R.id.btn_monospace);
                    u0Var3.m23816a(R.string.TextFormatMonospace);
                    cVar4.m23284a(R.drawable.baseline_code_24);
                    cVar3.m23284a(R.id.btn_spoiler);
                    u0Var3.m23816a(R.string.TextFormatSpoiler);
                    cVar4.m23284a(R.drawable.baseline_eye_off_24);
                    cVar3.m23284a(R.id.btn_link);
                    u0Var3.m23816a(R.string.TextFormatLink);
                    cVar4.m23284a(R.drawable.baseline_link_24);
                    m9261ee(null, cVar3.m23280e(), u0Var3.m23813d(), null, cVar4.m23280e(), new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i4) {
                            boolean Dm;
                            Dm = View$OnClickListenerC2971rh.this.m32772Dm(view2, i4);
                            return Dm;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23935a(this);
                        }

                        @Override
                        public Object mo491b2(int i4) {
                            return C5115g0.m23934b(this, i4);
                        }
                    });
                    return;
                }
            case R.id.menu_btn_reply:
                TdApi.Message Ak3 = m32813Ak();
                if (Ak3 != null) {
                    m32442cr(Ak3, true, true);
                    mo8837u5(-1);
                    RunnableC9558i0 i0Var2 = this.f10038z0;
                    if (i0Var2 != null && i0Var2.m8281d0()) {
                        C1408x.m37085f(this.f10038z0);
                        return;
                    }
                    return;
                }
                return;
            case R.id.menu_btn_report:
                if (!(this.f9880C1 == null || (mp = m32314mp()) == null)) {
                    m32510Xo(mp, new Runnable() {
                        @Override
                        public final void run() {
                            View$OnClickListenerC2971rh.this.m32759Em();
                        }
                    });
                    return;
                }
                return;
            case R.id.menu_btn_retry:
                C6035e<AbstractC4761s4> eVar4 = this.f9880C1;
                if (eVar4 != null && eVar4.m21496p() > 0) {
                    long j = 0;
                    long j2 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f9880C1.m21496p(); i5++) {
                        TdApi.Message a42 = this.f9880C1.m21495q(i5).m25984a4(this.f9880C1.m21501j(i5));
                        long j3 = a42.chatId;
                        if (j != j3 || j2 != a42.mediaAlbumId || j2 == 0) {
                            j2 = a42.mediaAlbumId;
                            i4++;
                            j = j3;
                        }
                    }
                    if (i4 > 0) {
                        m9220ke(new int[]{R.id.btn_messageResend, R.id.btn_cancel}, new String[]{C4403w.m27844o2(R.string.ResendXMessages, i4), C4403w.m27869i1(R.string.Cancel)}, new int[]{3, 1}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i6) {
                                boolean Jm;
                                Jm = View$OnClickListenerC2971rh.this.m32693Jm(view2, i6);
                                return Jm;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i6) {
                                return C5115g0.m23934b(this, i6);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            case R.id.menu_btn_search:
                if (this.f10030x0.m7673l1()) {
                    m32695Jk();
                    m9303Yc();
                    return;
                }
                return;
            case R.id.menu_btn_selectInBetween:
                m32327lp();
                return;
            case R.id.menu_btn_send:
                C6035e<AbstractC4761s4> eVar5 = this.f9880C1;
                if (eVar5 != null && eVar5.m21496p() > 0) {
                    m9261ee(C4403w.m27836q2(R.string.SendXMessagesNow, this.f9880C1.m21496p()), new int[]{R.id.btn_send, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.SendNow), C4403w.m27869i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_send_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i6) {
                            boolean Fm;
                            Fm = View$OnClickListenerC2971rh.this.m32746Fm(view2, i6);
                            return Fm;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23935a(this);
                        }

                        @Override
                        public Object mo491b2(int i6) {
                            return C5115g0.m23934b(this, i6);
                        }
                    });
                    return;
                }
                return;
            case R.id.menu_btn_stopwatch:
                if (m32396gl()) {
                    this.f30167b.m2485dd().m3747P8(mo4347s(), this.f10002q0);
                    return;
                }
                return;
            case R.id.menu_btn_unpinAll:
                C6035e<AbstractC4761s4> eVar6 = this.f9880C1;
                if (eVar6 != null && eVar6.m21496p() > 0) {
                    m9261ee(C4403w.m27836q2(R.string.UnpinXMessages, this.f9880C1.m21496p()), new int[]{R.id.btn_unpinAll, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Unpin), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.deproko_baseline_pin_undo_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i6) {
                            boolean Hm;
                            Hm = View$OnClickListenerC2971rh.this.m32719Hm(view2, i6);
                            return Hm;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23935a(this);
                        }

                        @Override
                        public Object mo491b2(int i6) {
                            return C5115g0.m23934b(this, i6);
                        }
                    });
                    return;
                }
                return;
            case R.id.menu_btn_up:
                m32471ao(true);
                return;
            case R.id.menu_btn_view:
                if (!(this.f9957c1 == 0 || (d0Var4 = this.f9945Y0) == null || (i10Var = (i10) d0Var4.f10068O.m21471e(this.f9957c1)) == null || (Lf = i10Var.m34394Lf()) == null)) {
                    m32632Ok(Lf);
                    i10Var.m34404Eg(false);
                    return;
                }
                return;
            case R.id.menu_btn_viewScheduled:
                m32675Kr(false);
                return;
        }
    }

    @Override
    public int[] mo7925J2(C9639r rVar, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        return C9639r.m7947e(rVar, view, view2, i, i2, i3, i4, i5, this.f10018u0, this.f10022v0, this.f9879C0);
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null && this.f10010s0 != null && C4779t2.m25465n2(chat) == j) {
            this.f10010s0.m8398l2(this.f10002q0);
        }
    }

    @Override
    public void mo9414J8(float f, boolean z) {
        super.mo9414J8(f, z);
        this.f9940W1.m18475O1(1.0f - f, false);
        m32793Br();
        m32339kq(f);
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
        if (z0Var != null) {
            z0Var.mo9343T5(i, i2);
        }
        if (m9339Ta() && !m32566Tk()) {
            this.f10030x0.m7638s2();
            C9534f fVar = this.f10010s0;
            if (fVar != null) {
                fVar.m8404f2(this.f30167b, this.f10002q0, this.f9987m1);
            }
        }
    }

    @Override
    public boolean mo9409Je() {
        return true;
    }

    public final boolean m32697Ji() {
        return m32229ti() && m32151zi(false);
    }

    public final void m32696Jj() {
        this.f9885E0.setVisibility(0);
        this.f9885E0.setOnClickListener(this);
    }

    public void m32695Jk() {
        C9357x2.C9370l lVar = this.f10023v1;
        if (lVar != null) {
            lVar.m8920E(true);
        }
    }

    public final void m32691Jo(final C6924j2 j2Var, final AbstractC4761s4 s4Var, boolean z) {
        if (s4Var.m25825r0() && !z && ((!s4Var.m25801t6() || s4Var.m25741z7()) && (j2Var.getChildAt(1) instanceof C9319v1))) {
            final LinearLayout linearLayout = new LinearLayout(j2Var.getContext());
            final TextView a = C9319v1.m9485a(j2Var.getContext(), R.id.more_btn_openReadReceipts, C4403w.m27869i1(R.string.LoadingMessageSeen), 1, R.drawable.baseline_visibility_24, null, null, null);
            final C7040u3 u3Var = new C7040u3(j2Var.getContext());
            a.setLayoutParams(new LinearLayout.LayoutParams(0, C1357a0.m37541i(54.0f), 1.0f));
            a.setClickable(false);
            u3Var.setLayoutParams(new LinearLayout.LayoutParams(C1357a0.m37541i(C1357a0.m37541i(6.0f) + 72), C1357a0.m37541i(54.0f)));
            linearLayout.addView(a);
            linearLayout.addView(u3Var);
            C1399s0.m37193a0(linearLayout);
            C10189d.m5797g(linearLayout);
            ((C9319v1) j2Var.getChildAt(1)).addView(linearLayout, 2);
            this.f30167b.m2270r4().m14783o(new TdApi.GetMessageViewers(s4Var.m26145K2(), s4Var.m26115N3()), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2971rh.this.m32289on(a, s4Var, u3Var, linearLayout, j2Var, object);
                }
            });
        }
    }

    public final void m32690Jp(TdApi.FormattedText formattedText, boolean z, boolean z2, final boolean z3, final boolean z4, boolean z5, TdApi.MessageSchedulingState messageSchedulingState) {
        long j;
        TdApi.InputMessageContent inputMessageContent;
        int i;
        int i2;
        int i3;
        RunnableC9558i0 i0Var;
        if ((C7321e.m16965a1(formattedText) && (!z || (i0Var = this.f10038z0) == null || i0Var.getText().length() <= 0)) || !m32761Ek()) {
            return;
        }
        if (!this.f9935U2 || !z) {
            long C9 = mo9464C9();
            long qk = m32266qk();
            if (z3) {
                j = z ? m32449ck() : m32341ko();
            } else {
                j = 0;
            }
            final long j2 = j;
            boolean z6 = z5 || m32328lo();
            if (!z2 || !this.f30167b.m2262rc(formattedText)) {
                inputMessageContent = new TdApi.InputMessageText(formattedText, !z4, z);
            } else {
                if (C4779t2.f16221F.f16283a.equals(formattedText.text)) {
                    i3 = R.string.ChatDisabledDart;
                    i2 = R.string.ChatRestrictedDart;
                    i = R.string.ChatRestrictedDartUntil;
                } else if (C4779t2.f16222G.f16283a.equals(formattedText.text)) {
                    i3 = R.string.ChatDisabledDice;
                    i2 = R.string.ChatRestrictedDice;
                    i = R.string.ChatRestrictedDiceUntil;
                } else {
                    i3 = R.string.ChatDisabledStickers;
                    i2 = R.string.ChatRestrictedStickers;
                    i = R.string.ChatRestrictedStickersUntil;
                }
                if (!m32429dr(this.f9891G0, R.id.right_sendStickersAndGifs, i3, i2, i)) {
                    inputMessageContent = new TdApi.InputMessageDice(formattedText.text.trim(), z);
                } else {
                    return;
                }
            }
            List<TdApi.SendMessage> h5 = C4779t2.m25504h5(C9, qk, j2, new TdApi.MessageSendOptions(z6, false, false, messageSchedulingState), inputMessageContent, this.f30167b.m2685Q9());
            if (z) {
                int size = h5.size();
                ArrayList arrayList = new ArrayList(size);
                m32482Zp(true);
                this.f10030x0.m7719b3(arrayList);
                this.f30167b.m2270r4().m14783o(h5.get(0), new C2993q(arrayList, size, h5, messageSchedulingState, new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z7) {
                        View$OnClickListenerC2971rh.this.m32666Ln(z3, j2, z4, z7);
                    }
                }));
                return;
            }
            for (TdApi.SendMessage sendMessage : h5) {
                this.f30167b.m2270r4().m14783o(sendMessage, this.f30167b.m2610V9());
            }
        }
    }

    public void m32689Jq() {
        TdApi.Message message;
        if (!C7316a.m17054g(mo9464C9()) || (message = this.f10002q0.lastMessage) == null || message.content.getConstructor() != 104813723) {
            m32729Gq(R.string.DeleteChat, 1);
        } else {
            m32702Iq(C4403w.m27869i1(R.string.OpenSupergroup).toUpperCase(), 4);
        }
    }

    public void m32688Jr(TdApi.MessageSender messageSender, boolean z) {
        C2912q9 q9Var = new C2912q9(mo4347s(), this.f30167b);
        q9Var.m9476Ad(new C2912q9.C2914b(this.f10006r0, mo9464C9(), null, messageSender, z));
        m9291ac(q9Var);
    }

    @Override
    public void mo4072K3(final long j, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32473am(j, z);
            }
        });
    }

    public final boolean m32684Ki() {
        C2979d0 d0Var;
        i10 i10Var;
        return (this.f9957c1 == 0 || (d0Var = this.f9945Y0) == null || (i10Var = (i10) d0Var.f10068O.m21471e(this.f9957c1)) == null || i10Var.m34387P0() != 1) ? false : true;
    }

    public final void m32683Kj() {
        this.f9891G0.setVisibility(0);
    }

    public final void m32682Kk() {
        this.f9885E0.setVisibility(4);
        this.f9885E0.setOnClickListener(null);
    }

    public final void m32678Ko(boolean z) {
        View$OnClickListenerC8851y1 y1Var = new View$OnClickListenerC8851y1(this);
        y1Var.m11105y2(1, this);
        y1Var.m11113t3();
    }

    public void m32677Kp(boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            m32690Jp(i0Var.mo8279f(z), true, z, true, m32354jo(false), z2, messageSchedulingState);
        }
    }

    public void m32676Kq() {
        m32729Gq(R.string.JoinChat, 3);
    }

    public void m32675Kr(boolean z) {
        View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this.f30165a, this.f30167b);
        boolean S9 = m9348S9();
        rhVar.m32664Lp(new C2977c0(this.f10006r0, this.f10002q0, this.f9987m1, null, 0, null).m32137e(true).m32138d(S9));
        if (z) {
            rhVar.m9162t9();
        }
        if (S9) {
            m9241hd();
            this.f9969g1 = true;
        }
        m9291ac(rhVar);
    }

    @Override
    public void mo4071L0(final long j, int i) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32447cm(j);
            }
        });
    }

    @Override
    public void mo21727L4(C5974t0 t0Var, boolean z, float f, boolean z2) {
        this.f9940W1.m18483E1(this.f9874A2, z, f);
    }

    @Override
    public void mo9397La() {
        super.mo9397La();
        C1408x.m37088c(this.f10038z0);
    }

    public boolean m32671Li() {
        return this.f10038z0 != null && this.f10022v0.getVisibility() == 0 && this.f10038z0.getVisibility() == 0;
    }

    public final void m32670Lj(TdApi.Message message) {
        if (this.f9982k2 == null && (this.f9998p0 & 1) == 0) {
            m32431dp();
            if (m9374Oa()) {
                mo8837u5(-1);
            } else if (m9382Na()) {
                m9320W8(null);
            }
            this.f9982k2 = message;
            TdApi.FormattedText w1 = C7321e.m16899w1(message.content);
            m32561Tp(true, w1.text);
            this.f9891G0.setIsActive(!C5070i.m24061i(w1.text) || m32461bl());
            this.f9937V1.m7844F1(message, C4403w.m27869i1(R.string.EditMessage));
            if (!m32390gr() && this.f9934U1 == null) {
                m32717Ho();
            }
            if (this.f10038z0 != null) {
                TdApi.FormattedText K5 = this.f30167b.m2785K5(message.chatId, message.f25406id);
                if (K5 != null) {
                    w1 = K5;
                }
                this.f10038z0.m8249v0(C4868i.m24726c2().m24663k1(4L) ? C4779t2.m25676H5(w1) : C4779t2.m25441q5(w1), true);
            }
            C1408x.m37085f(this.f10038z0);
        }
    }

    public void m32669Lk(boolean z) {
        if (z && this.f9992n2) {
            this.f9996o2 = false;
        }
        m32293oj(true, false);
    }

    public void m32665Lo(final boolean z, TdApi.MessageSchedulingState messageSchedulingState, final HandlerC10770jj.AbstractC10786o oVar) {
        if (messageSchedulingState != null || !m32216ui()) {
            oVar.mo3333a(z, messageSchedulingState, false);
        } else {
            mo4348c().m2485dd().m3787L8(this, mo9464C9(), false, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState2, boolean z3) {
                    View$OnClickListenerC2971rh.this.m32276pn(oVar, z, z2, messageSchedulingState2, z3);
                }
            }, null);
        }
    }

    public void m32664Lp(C2977c0 c0Var) {
        super.m9476Ad(c0Var);
        this.f10002q0 = c0Var.f10049b;
        this.f9987m1 = c0Var.f10060m;
        this.f10006r0 = c0Var.f10050c;
        this.f10007r1 = 0L;
        this.f9991n1 = c0Var.f10058k;
        this.f9995o1 = c0Var.f10061n;
        this.f9999p1 = c0Var.f10062o;
        this.f9978j1 = c0Var.f10055h;
        this.f9981k1 = c0Var.f10056i;
        this.f9984l1 = c0Var.f10057j;
        this.f10030x0.m7749T2(c0Var.f10051d, c0Var.f10052e);
        this.f9972h1 = c0Var.f10053f;
        this.f9975i1 = c0Var.f10054g;
        this.f10003q1 = c0Var.f10059l;
        if (this.f10018u0 != null) {
            m32701Ir();
        }
    }

    public void m32663Lq() {
        this.f30167b.m2478e4(this.f10002q0);
        if (this.f30167b.m2475e7(this.f10002q0.f25367id) || !this.f30167b.m2816I6(this.f10002q0)) {
            m32729Gq(R.string.Unblock, 5);
        } else {
            m32729Gq(R.string.RestartBot, 2);
        }
    }

    public C9620n4 m32662Lr() {
        return this.f9936V0;
    }

    @Override
    public void mo16389M2(ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, boolean z) {
        m32522Wp(0L, "@" + this.f30167b.m2221u5());
    }

    @Override
    public void mo8407M6() {
        if (this.f9959c3) {
            if (!this.f9962d3) {
                this.f9965e3 = true;
            }
            this.f9968f3.m8417O1();
            this.f9968f3.m8418N1();
            m32189wj(false);
        }
    }

    public final void m32658Mi() {
        AbstractC5123k kVar = this.f10019u1;
        if (kVar != null) {
            kVar.m23882a();
            this.f10019u1 = null;
        }
    }

    public final void m32657Mj() {
        if (this.f9992n2) {
            ScrollView scrollView = this.f10008r2;
            if (scrollView != null) {
                scrollView.setVisibility(8);
            }
            this.f9992n2 = false;
            m32207ur(R.drawable.deproko_baseline_bots_keyboard_26);
        }
    }

    public final void m32656Mk() {
        this.f9891G0.setVisibility(4);
    }

    public final void m32652Mo(final AbstractC4761s4 s4Var, final boolean z) {
        int i;
        C2964ra raVar;
        final long j = s4Var.m25993Z3().chatId;
        if (j != 0) {
            if (!z) {
                s4Var.m25790u6(new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC2971rh.this.m32263qn(z, (TdApi.Message) obj);
                    }
                }, false);
            } else if (this.f30167b.m2443g7(mo9464C9())) {
                this.f30167b.m2270r4().m14783o(new TdApi.PinChatMessage(j, s4Var.m26205E4(), false, false), this.f30167b.m2392ja());
            } else {
                switch (C7316a.m17057d(j)) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        boolean K6 = this.f30167b.m2784K6(mo9464C9());
                        int i2 = K6 ? R.string.PinMessageInThisChannel : R.string.PinMessageInThisGroup;
                        int i3 = K6 ? R.string.PinNotify2 : R.string.PinNotify;
                        i = i2;
                        raVar = new C2964ra(12, (int) R.id.btn_notifyMembers, 0, i3, true);
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        i = R.string.PinMessageInChat;
                        raVar = new C2964ra(12, (int) R.id.btn_notifyMembers, 0, C4403w.m27853m1(R.string.PinMessageOther, this.f30167b.m2676R3(j, false, true)), true);
                        break;
                    default:
                        throw new RuntimeException();
                }
                m9206me(new C9188f2(R.id.btn_messagePin).m10012a(new C2964ra(28, 0, 0, i)).m10003j(new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                        View$OnClickListenerC2971rh.this.m32250rn(j, s4Var, i4, sparseIntArray);
                    }
                }).m9997p(new C2964ra[]{raVar}).m9995r(R.string.Pin));
            }
        }
    }

    public void m32651Mp(int i) {
        if (i == 1160523958) {
            i = 0;
        }
        int i2 = this.f9947Y2;
        boolean z = i2 != 0;
        boolean z2 = i != 0;
        if (z != z2) {
            if (z2) {
                m32627Op(i, true, true);
            } else {
                m32627Op(i2, false, false);
            }
            this.f9947Y2 = i;
            m32595Ri();
        } else if (i2 != i) {
            SparseIntArray sparseIntArray = this.f9950Z2;
            if (sparseIntArray != null) {
                sparseIntArray.delete(i2);
            }
            m32627Op(i, true, true);
            this.f9947Y2 = i;
        }
    }

    public final void m32650Mq(int i, long j, boolean z) {
        this.f9892G1 = i;
        boolean z2 = z && this.f9898I1.m29584g() > 0.0f;
        if (i == 1) {
            this.f9889F1.m8451U0(R.id.btn_follow, C4403w.m27869i1(R.string.Follow), R.drawable.baseline_group_add_24, z2);
            this.f9889F1.m18511K();
        } else if (i == 2) {
            boolean u3 = this.f30167b.m2223u3(mo9464C9());
            this.f9889F1.m8451U0(R.id.btn_mute, C4403w.m27869i1(u3 ? R.string.Mute : R.string.Unmute), u3 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_active_24, z2);
            this.f9889F1.m18511K();
        } else if (i == 3) {
            this.f9889F1.m8451U0(R.id.btn_unpinAll, C4403w.m27869i1(m32151zi(false) ? R.string.UnpinAll : R.string.DismissAllPinned), R.drawable.deproko_baseline_pin_undo_24, z);
            this.f9889F1.m18511K();
        } else if (i == 4) {
            this.f9889F1.m8451U0(R.id.btn_openLinkedChat, C4403w.m27869i1(R.string.Discuss), R.drawable.baseline_chat_bubble_24, z2);
            this.f9889F1.m18494v0(null, j, null);
        } else if (i == 5) {
            this.f9889F1.m8451U0(R.id.btn_applyWallpaper, C4403w.m27869i1(R.string.ChatBackgroundApply), R.drawable.baseline_warning_24, z2);
            this.f9889F1.m18511K();
        } else if (i == 100) {
            this.f9889F1.m8451U0(R.id.btn_test, "test", R.drawable.baseline_warning_24, z2);
            this.f9889F1.m18511K();
        }
        this.f9898I1.m29575p(true, z);
        m32568Ti();
    }

    @Override
    public void mo8864N0(final int i) {
        if (!this.f30167b.m2485dd().m3788L7(this, null, mo9464C9(), i, null)) {
            switch (i) {
                case R.id.btn_botHelp:
                case R.id.btn_botSettings:
                    TdApi.Chat chat = this.f10002q0;
                    if (chat != null) {
                        if (this.f30167b.m2463f3(chat.f25367id)) {
                            C10930q6 q6Var = this.f30167b;
                            q6Var.m2496d2(q6Var.m2183wb(this.f10002q0.f25367id), false, this.f30167b.m2392ja());
                        }
                        if (this.f9910M1 == 2) {
                            m32748Fk();
                        }
                        m32703Ip(i == R.id.btn_botHelp ? "/help" : "/settings", false, false, false, false, null);
                        return;
                    }
                    return;
                case R.id.btn_chatFontSizeReset:
                    C4868i.m24726c2().m24797S3();
                    m32155yr(this.f9942X0);
                    this.f10030x0.m7638s2();
                    return;
                case R.id.btn_chatFontSizeScale:
                    C4868i.m24726c2().m24706e6();
                    this.f10030x0.m7638s2();
                    return;
                case R.id.btn_copyLink:
                case R.id.btn_share:
                    this.f30167b.m2270r4().m14783o(new TdApi.GetBackgroundUrl(m9131x9().f10064q.name, C11520h.m303d0(m9131x9().f10064q.type, this.f9912N0.m18216g())), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            View$OnClickListenerC2971rh.this.m32667Lm(i, object);
                        }
                    });
                    return;
                case R.id.btn_debugShowHideBottomBar:
                    if (this.f9892G1 == 0) {
                        m32650Mq(100, 0L, true);
                        return;
                    } else {
                        m32708Ik(true);
                        return;
                    }
                case R.id.btn_mute:
                    if (this.f10002q0 != null) {
                        this.f30167b.m2485dd().m3677W8(this, this.f10002q0.f25367id, false, null);
                        return;
                    }
                    return;
                case R.id.btn_openLinkedChat:
                    m32757Eo();
                    return;
                case R.id.btn_reportChat:
                    m32510Xo(null, null);
                    return;
                case R.id.btn_search:
                    if (this.f10030x0.m7673l1()) {
                        m9303Yc();
                        return;
                    }
                    return;
                case R.id.btn_sendScreenshotNotification:
                    C1379j0.m37290z0("Sent screenshot notification", 0);
                    this.f30167b.m2232ta((int) (System.currentTimeMillis() / 1000));
                    return;
                case R.id.btn_shareMyContact:
                    TdApi.User Z9 = this.f30167b.m2550Z9();
                    if (Z9 != null) {
                        m9261ee(C4779t2.m25437r2(Z9) + ", " + C1363c0.m37410w(Z9.phoneNumber), new int[]{R.id.btn_shareMyContact, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ShareMyContactInfo), C4403w.m27869i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_contact_phone_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view, int i2) {
                                boolean Mm;
                                Mm = View$OnClickListenerC2971rh.this.m32654Mm(view, i2);
                                return Mm;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i2) {
                                return C5115g0.m23934b(this, i2);
                            }
                        });
                        return;
                    }
                    return;
                case R.id.btn_showPinnedMessage:
                    this.f10030x0.m7818B2();
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public List<View$OnTouchListenerC5103c0.C5104a> mo2024N3(View view) {
        TdApi.FormattedText formattedText;
        RunnableC9558i0 i0Var = this.f10038z0;
        boolean z = false;
        if (i0Var != null) {
            TdApi.FormattedText f = i0Var.mo8279f(true);
            formattedText = this.f10038z0.mo8279f(false);
            if (!C7321e.m16993N(f, formattedText, true)) {
                z = true;
            }
        } else {
            formattedText = null;
        }
        List<View$OnTouchListenerC5103c0.C5104a> X2 = this.f30167b.m2485dd().m3673X2(mo9464C9(), m32448cl(), z, true);
        if (!z && this.f30167b.m2262rc(formattedText) && !m32448cl()) {
            if (X2 == null) {
                X2 = new ArrayList<>();
            }
            if (C4779t2.f16221F.f16283a.equals(formattedText.text)) {
                X2.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendNoMarkdown, C4403w.m27869i1(R.string.SendDiceAsEmoji), (int) R.drawable.baseline_gps_fixed_24));
            } else if (C4779t2.f16222G.f16283a.equals(formattedText.text)) {
                X2.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendNoMarkdown, C4403w.m27869i1(R.string.SendDiceAsEmoji), (int) R.drawable.baseline_casino_24));
            } else {
                X2.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendNoMarkdown, C4403w.m27869i1(R.string.SendDiceAsEmoji), C1362c.m37484e(formattedText.text)));
            }
        }
        return X2;
    }

    public final void m32646Ni() {
        this.f10009r3 = null;
    }

    public final void m32645Nj() {
        if (this.f9914N2) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            m32601Qp(false, false);
            this.f9885E0.setImageResource(ViewTreeObserver$OnPreDrawListenerC7081z0.m17853W1(true));
        }
    }

    public void m32644Nk() {
        m32247rq(false);
    }

    public void m32640No(int i) {
        View$OnClickListenerC9530e4 e4Var = this.f9968f3;
        if (e4Var == null) {
            View$OnClickListenerC9530e4 e4Var2 = new View$OnClickListenerC9530e4(mo4347s());
            this.f9968f3 = e4Var2;
            e4Var2.m8423G1(this);
            this.f9968f3.setCallback(this);
            this.f10018u0.addView(this.f9968f3);
        } else {
            e4Var.m8419M1();
            this.f9968f3.m8420L1();
            this.f9968f3.setVisibility(0);
            this.f9968f3.setAlpha(1.0f);
        }
        mo9397La();
        m32306nj(false);
        m32267qj();
        this.f9968f3.setDuration(i);
        this.f9962d3 = false;
        this.f9959c3 = true;
        m32424ej(false);
    }

    public final boolean m32639Np(boolean z) {
        return false;
    }

    public final void m32638Nq(int i) {
        m32626Oq(C4403w.m27869i1(i), false);
    }

    @Override
    public void mo48O(C11131y6 y6Var, boolean z, boolean z2) {
        C11008t0.m2000b(this, y6Var, z, z2);
    }

    @Override
    public void mo23795O4() {
        if (this.f9876B0) {
            this.f9876B0 = false;
        }
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null && !i0Var.isEnabled() && !m32422el()) {
            this.f10038z0.setEnabled(true);
            this.f10038z0.requestFocus();
        }
    }

    @Override
    public void mo47O6(C10930q6 q6Var, boolean z) {
        C11008t0.m1994h(this, q6Var, z);
    }

    public final void m32634Oi() {
        AbstractRunnableC5910b bVar = this.f9884D2;
        if (bVar != null) {
            bVar.m21857c();
            m9207md(this.f9884D2);
            this.f9884D2 = null;
        }
    }

    public final void m32633Oj(final long j) {
        final long j2 = this.f10002q0.f25367id;
        AbstractC4761s4 e0 = this.f10030x0.m7808E0().m8121e0(j);
        if (e0 != null) {
            m32607Qj(e0.m25993Z3());
        } else {
            this.f30167b.m2270r4().m14783o(new TdApi.GetMessage(j2, j), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2971rh.this.m32161yl(j2, j, object);
                }
            });
        }
    }

    public void m32632Ok(C7319d dVar) {
        if (m32553Uk()) {
            this.f30167b.m2485dd().m3469r7(this, mo9464C9(), dVar, null);
            return;
        }
        this.f10030x0.m7730Z0(dVar, 1, null, this.f9957c1 == 0);
        m32468ar();
    }

    public final void m32628Oo() {
        TdApi.Message message;
        int i = this.f9910M1;
        if (i == 1) {
            mo9397La();
            this.f30167b.m2485dd().m3448t8(this, mo9464C9());
        } else if (i == 2) {
            final long C9 = mo9464C9();
            final Runnable jfVar = new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32237sn(C9);
                }
            };
            if (this.f30167b.m2463f3(this.f10002q0.f25367id)) {
                C10930q6 q6Var = this.f30167b;
                q6Var.m2496d2(q6Var.m2183wb(this.f10002q0.f25367id), false, new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC2971rh.this.m32224tn(jfVar, object);
                    }
                });
                return;
            }
            jfVar.run();
        } else if (i == 3) {
            this.f30167b.m2270r4().m14783o(new TdApi.AddChatMember(this.f10002q0.f25367id, this.f30167b.m2519ba(), 0), this.f30167b.m2392ja());
        } else if (i == 4) {
            TdApi.Chat chat = this.f10002q0;
            if (chat != null && (message = chat.lastMessage) != null && message.content.getConstructor() == 104813723) {
                this.f30167b.m2485dd().m3888B7(this, ((TdApi.MessageChatUpgradeTo) this.f10002q0.lastMessage.content).supergroupId, null);
            }
        } else if (i == 5) {
            C10930q6 q6Var2 = this.f30167b;
            q6Var2.m2496d2(q6Var2.m2183wb(this.f10002q0.f25367id), false, this.f30167b.m2392ja());
        } else if (i == 7) {
            m32783Co();
        }
    }

    public void m32627Op(int i, boolean z, boolean z2) {
        TdApi.Message message;
        if (this.f10002q0 != null) {
            if (this.f9950Z2 == null) {
                this.f9950Z2 = new SparseIntArray(5);
            }
            Client.AbstractC7865g ncVar = new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2971rh.this.m32653Mn(object);
                }
            };
            long qk = m32266qk();
            if (qk == 0 && (message = this.f9934U1) != null) {
                qk = message.messageThreadId;
                if (qk == 0) {
                    qk = message.f25406id;
                }
            }
            long j = qk;
            if (z) {
                int uptimeMillis = (int) (SystemClock.uptimeMillis() / 1000);
                if (uptimeMillis - this.f9950Z2.get(i) >= 4 || z2) {
                    this.f9950Z2.put(i, uptimeMillis);
                    this.f30167b.m2270r4().m14783o(new TdApi.SendChatAction(this.f10002q0.f25367id, j, C7321e.m16949g(i)), ncVar);
                }
            } else if (this.f9950Z2.get(i, 0) != 0) {
                this.f9950Z2.delete(i);
                this.f30167b.m2270r4().m14783o(new TdApi.SendChatAction(this.f10002q0.f25367id, j, new TdApi.ChatActionCancel()), ncVar);
            }
        }
    }

    public final void m32626Oq(CharSequence charSequence, boolean z) {
        if (m9353Ra()) {
            C9357x2.C9370l lVar = this.f10023v1;
            int i = R.drawable.baseline_warning_24;
            if (lVar == null) {
                C9357x2.C9365h u = mo4347s().m14584H3().m8985g(this.f9891G0).m8948u(new C9357x2.AbstractC9363f() {
                    @Override
                    public final void mo8098f1(View view, Rect rect) {
                        View$OnClickListenerC2971rh.this.m32577Sn(view, rect);
                    }
                });
                if (!z) {
                    i = 0;
                }
                this.f10023v1 = u.m8951q(i).m8950r(true).m8958i(this).m8971D(this.f30167b, charSequence);
            } else {
                C9357x2.AbstractC9367i k = mo4347s().m14584H3().m8981k(this.f30167b, charSequence, 0);
                if (!z) {
                    i = 0;
                }
                lVar.m8903V(k, i);
                this.f10023v1.m8900Y();
            }
            this.f10023v1.m8917H(false);
        }
    }

    @Override
    public void mo1348P1(TdApi.User user) {
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            m32260qq(f);
        } else if (i == 6) {
            this.f9915O0.setAlpha(C5069h.m24089d(f));
            m32450cj();
        } else if (i != 7) {
            switch (i) {
                case 9:
                    m32299nq(f);
                    return;
                case 10:
                    m32365iq(f);
                    return;
                case 11:
                    m32326lq(f);
                    return;
                case 12:
                    m32233sr();
                    return;
                default:
                    return;
            }
        } else {
            m32469aq(f);
        }
    }

    public boolean m32621Pi(long j, long j2, boolean z, boolean z2) {
        if (mo9464C9() != j || j == 0) {
            return false;
        }
        return this.f10030x0.m7702f0(j, j2, z, z2);
    }

    public final void m32620Pj() {
        m32634Oi();
        this.f9940W1.m18474Q1(this.f9952a2, false, false);
    }

    public void m32619Pk(C7319d dVar, C7319d dVar2) {
        m32593Rk(dVar, this.f10030x0.m7618x0(dVar2));
    }

    public void m32615Po(C4695l6 l6Var) {
        if (this.f9965e3) {
            RunnableC5952j1.m21779y().m21786r(l6Var);
            this.f9965e3 = false;
        } else if (this.f9959c3) {
            this.f9962d3 = true;
            this.f9968f3.m8410X1(l6Var);
        } else {
            m32756Ep(l6Var, true, false, null);
        }
    }

    public void m32614Pp() {
        this.f9994o0 = true;
    }

    public void m32613Pq(CharSequence charSequence) {
        this.f9949Z1.m18246y(charSequence, null, this.f9940W1.m18479J1(this.f9952a2));
        m32634Oi();
        this.f9884D2 = new C2991o();
        this.f9940W1.m18474Q1(this.f9952a2, true, true);
        m9143vd(this.f9884D2, 3000L);
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23935a(this);
    }

    @Override
    public void mo4081Q4(final long j) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32798Bm(j);
            }
        });
    }

    @Override
    public void mo9805Q5() {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        TdApi.Chat chat = this.f10002q0;
        if (chat != null && (chatPhotoInfo = chat.photo) != null && !C4779t2.m25604S2(chatPhotoInfo.small)) {
            View$OnClickListenerC7430j1.m16213hk(this, this.f10002q0, this.f10010s0);
        }
    }

    @Override
    public boolean mo9356Qd() {
        return false;
    }

    public final void m32608Qi() {
        TdApi.SecretChat X3;
        if (m32458bo()) {
            ArrayList arrayList = new ArrayList();
            final long C9 = mo9464C9();
            final TdApi.Chat U2 = this.f30167b.m2632U2(C9);
            TdApi.ChatActionBar chatActionBar = U2 != null ? U2.actionBar : null;
            if (chatActionBar != null) {
                switch (chatActionBar.getConstructor()) {
                    case TdApi.ChatActionBarReportSpam.CONSTRUCTOR:
                        arrayList.add(m32380ho(C9, false));
                        if (((TdApi.ChatActionBarReportSpam) chatActionBar).canUnarchive) {
                            arrayList.add(m32367io(C9));
                            break;
                        }
                        break;
                    case TdApi.ChatActionBarReportAddBlock.CONSTRUCTOR:
                        arrayList.add(m32380ho(C9, true));
                        arrayList.add(m32393go(C9));
                        if (((TdApi.ChatActionBarReportAddBlock) chatActionBar).canUnarchive) {
                            arrayList.add(m32367io(C9));
                            break;
                        }
                        break;
                    case TdApi.ChatActionBarAddContact.CONSTRUCTOR:
                        arrayList.add(m32393go(C9));
                        break;
                    case TdApi.ChatActionBarSharePhoneNumber.CONSTRUCTOR:
                        arrayList.add(new C9717z3.C9720c(R.id.btn_shareMyContact, R.string.SharePhoneNumber, new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                View$OnClickListenerC2971rh.this.m32239sl(C9, view);
                            }
                        }));
                        break;
                    case TdApi.ChatActionBarReportUnrelatedLocation.CONSTRUCTOR:
                        arrayList.add(new C9717z3.C9720c(R.id.btn_reportLocation, R.string.ReportLocation, new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                View$OnClickListenerC2971rh.this.m32278pl(C9, view);
                            }
                        }));
                        break;
                    case TdApi.ChatActionBarInviteMembers.CONSTRUCTOR:
                        arrayList.add(new C9717z3.C9720c(R.id.btn_invite, R.string.AddMember, new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                View$OnClickListenerC2971rh.this.m32265ql(U2, view);
                            }
                        }));
                        break;
                }
            }
            if (C7316a.m17051j(C9) && (X3 = this.f30167b.m2586X3(C9)) != null && X3.state.getConstructor() == -1945106707) {
                arrayList.add(new C9717z3.C9720c(R.id.btn_delete, R.string.DeleteAndLeave, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View$OnClickListenerC2971rh.this.m32226tl(view);
                    }
                }).m7430b().m7431a());
            }
            if (!arrayList.isEmpty()) {
                this.f9943X1.setItems((C9717z3.C9720c[]) arrayList.toArray(new C9717z3.C9720c[0]));
            }
            this.f9940W1.m18474Q1(this.f9946Y1, !arrayList.isEmpty(), m9339Ta());
        }
    }

    public void m32607Qj(TdApi.Message message) {
        if (message == null || this.f10002q0 == null || this.f9972h1 || m9332Ua()) {
            m32385hj();
            return;
        }
        if (!m32390gr()) {
            this.f9937V1.m7844F1(message, this.f30167b.m2784K6(this.f10002q0.f25367id) ? this.f10002q0.title : null);
        }
        if (this.f9934U1 != null || m32390gr()) {
            this.f9934U1 = message;
            return;
        }
        this.f9934U1 = message;
        m32430dq(1.0f);
    }

    public void m32606Qk(C7319d dVar, HandlerC10770jj.C10788q qVar) {
        C7319d dVar2;
        if (qVar == null || (dVar2 = qVar.f34538d) == null || dVar2.m17027c() != dVar.m17027c()) {
            m32632Ok(dVar);
        } else {
            m32619Pk(dVar, qVar.f34538d);
        }
    }

    public final void m32602Qo(C4729p pVar) {
        this.f9881C2 = pVar;
        this.f30167b.m2295pb(pVar.m26311b0(), mo9464C9(), pVar.m26340h());
    }

    public final void m32601Qp(boolean z, boolean z2) {
        if (this.f9914N2 != z) {
            this.f9914N2 = z;
            if (z) {
                mo9397La();
            }
        }
    }

    public final void m32600Qq() {
        this.f9937V1.m7844F1(this.f9982k2, C4403w.m27869i1(R.string.EditMessage));
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    @Override
    public C8113c mo9832R4(long j, TdApi.SearchMessagesFilter searchMessagesFilter) {
        int i = this.f9957c1;
        if (i == 0) {
            return this.f10030x0.m7654p0(j, searchMessagesFilter);
        }
        if (i == 1) {
            C2979d0 d0Var = this.f9945Y0;
            i10 i10Var = d0Var != null ? (i10) d0Var.f10068O.m21471e(1) : null;
            if (i10Var != null && (i10Var instanceof q10)) {
                return ((q10) i10Var).mo9832R4(j, searchMessagesFilter);
            }
        }
        return null;
    }

    @Override
    public void mo25738R5(boolean z, C3950k kVar) {
        this.f9883D1 = kVar;
    }

    @Override
    public int mo407R9() {
        if (!this.f9972h1) {
            return R.id.controller_messages;
        }
        int i = this.f9975i1;
        if (i == 1) {
            return R.id.controller_wallpaper;
        }
        if (i == 2) {
            return R.id.controller_fontSize;
        }
        if (i == 3) {
            return R.id.controller_eventLog;
        }
        if (i == 4) {
            return R.id.controller_searchPreview;
        }
        if (i != 5) {
            return 0;
        }
        return R.id.controller_wallpaper_preview;
    }

    @Override
    public final boolean mo9350Rd() {
        return this.f10002q0 != null && (m32396gl() || this.f10002q0.hasProtectedContent || this.f10030x0.m7734Y0());
    }

    public final void m32595Ri() {
        boolean z = this.f9947Y2 != 0 && this.f30165a.m14582I0() == 0 && !m9347Sa();
        if (this.f9941W2 != z) {
            if (z) {
                this.f9944X2 = new C2994r();
                this.f30167b.m2485dd().postDelayed(this.f9944X2, 4500L);
            } else {
                this.f9944X2.m21857c();
                this.f9944X2 = null;
            }
            this.f9941W2 = z;
        }
    }

    public void m32594Rj(TdApi.Message message) {
        if (m32761Ek()) {
            C10930q6 q6Var = this.f30167b;
            q6Var.m2301p5(this.f10002q0.f25367id, message.chatId, message.f25406id, q6Var.m2431h3(mo9464C9()), false);
        }
    }

    public void m32593Rk(C7319d dVar, long[] jArr) {
        if (m32553Uk()) {
            this.f30167b.m2485dd().m3469r7(this, mo9464C9(), dVar, null);
            return;
        }
        this.f10030x0.m7730Z0(dVar, 1, jArr, this.f9957c1 == 0);
        m32468ar();
    }

    public final void m32589Ro(long j, AbstractC4761s4 s4Var) {
        synchronized (this) {
            if (this.f9880C1 == null) {
                this.f9880C1 = new C6035e<>();
            }
            this.f9880C1.m21500k(j, s4Var);
        }
    }

    public final void m32588Rp(boolean z) {
        if (this.f9967f2 != z) {
            this.f9967f2 = z;
            if (z) {
                int layerType = this.f10026w0.getLayerType();
                this.f9970g2 = layerType;
                if (layerType != 2) {
                    C1399s0.m37183f0(this.f10026w0, 2);
                }
                int layerType2 = this.f9937V1.getLayerType();
                this.f9973h2 = layerType2;
                if (layerType2 != 2) {
                    C1399s0.m37183f0(this.f9937V1, 2);
                }
                int layerType3 = this.f9872A0.getLayerType();
                this.f9976i2 = layerType3;
                if (layerType3 != 2) {
                    C1399s0.m37183f0(this.f9872A0, 2);
                    return;
                }
                return;
            }
            int i = this.f9970g2;
            if (i != 2) {
                C1399s0.m37183f0(this.f10026w0, i);
            }
            int i2 = this.f9973h2;
            if (i2 != 2) {
                C1399s0.m37183f0(this.f9937V1, i2);
            }
            int i3 = this.f9976i2;
            if (i3 != 2) {
                C1399s0.m37183f0(this.f9872A0, i3);
            }
        }
    }

    public final void m32587Rq() {
        this.f9937V1.m7843G1(this.f9905K2, this.f9908L2);
    }

    @Override
    public void mo21726S1(C5974t0 t0Var, boolean z, boolean z2) {
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        if (mo4347s().m14529V0().m6909c0() || this.f9954b1 > 0.0f || m32774Dk()) {
            return false;
        }
        if (mo9464C9() == 0 || this.f9972h1) {
            return this.f9975i1 == 0 || f2 <= ((float) ((this.f10018u0.getMeasuredHeight() - this.f10022v0.getMeasuredHeight()) + View$OnClickListenerC9170d1.m10066c3(true)));
        }
        int i = C1399s0.m37154u(q1Var.get())[1];
        if (this.f9896H2) {
            int i2 = C1399s0.m37154u(this.f9887E2)[1] - i;
            if (f2 >= i2 && f2 < i2 + this.f9887E2.getMeasuredHeight()) {
                if (((LinearLayoutManager) this.f9890F2.getLayoutManager()).m39549X1() != 0) {
                    return false;
                }
                View C = this.f9890F2.getLayoutManager().mo39262C(0);
                return C == null || C.getLeft() >= 0;
            }
        }
        int Bk = m32800Bk();
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
        if (z0Var != null && z0Var.getVisibility() == 0 && f2 >= C1399s0.m37154u(this.f9879C0)[1] - i) {
            return this.f9879C0.m17863Q1() && f <= ((float) Bk);
        }
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null && i0Var.getVisibility() == 0) {
            int i3 = C1399s0.m37154u(this.f10038z0)[1] - i;
            if (f2 >= i3 && f2 < i3 + this.f10038z0.getMeasuredHeight()) {
                return f < ((float) this.f9885E0.getMeasuredWidth()) || this.f10038z0.m8281d0();
            }
        }
        if (m32406fo() && f2 < View$OnClickListenerC9170d1.m10066c3(true)) {
            return false;
        }
        if (!C4868i.m24726c2().m24910C2()) {
            return true;
        }
        if (!C4403w.m27984G2()) {
            return f <= ((float) Bk);
        }
        int measuredWidth = this.f10018u0.getMeasuredWidth();
        return measuredWidth != 0 && f >= ((float) (measuredWidth - Bk));
    }

    public void m32582Si(boolean z) {
        String Z1 = C4403w.m27909Z1(C4403w.m27869i1(z ? R.string.EventLogSelectedEvents : R.string.EventLogAllEvents));
        this.f10010s0.setForcedSubtitle(Z1);
        this.f10010s0.setSubtitle(Z1);
    }

    public long m32581Sj() {
        if (!m9339Ta() || m9312Xa() || !this.f10030x0.m7687i1()) {
            return 0L;
        }
        return mo9464C9();
    }

    public void m32580Sk(String str, TdApi.WebPage webPage) {
        this.f9911M2 = str;
        this.f9905K2 = str;
        this.f9908L2 = webPage;
    }

    public final void m32576So() {
        m32671Li();
    }

    public final void m32575Sp(boolean z) {
        if (this.f10035y1 != z) {
            this.f10035y1 = z;
            this.f10030x0.m7736X2(z);
            if (z) {
                m32391gq(false, m9339Ta());
            }
        }
    }

    public final void m32574Sq() {
        this.f9937V1.m7844F1(this.f9934U1, this.f30167b.m2784K6(this.f10002q0.f25367id) ? this.f10002q0.title : null);
    }

    @Override
    public boolean mo32573T4(View$OnClickListenerC2280d6 d6Var, long j, long j2, TdApi.InputMessagePoll inputMessagePoll, boolean z, TdApi.MessageSchedulingState messageSchedulingState, AbstractC5918j<TdApi.Message> jVar) {
        if (mo9464C9() != j || m32266qk() != j2) {
            return false;
        }
        m32300np(inputMessagePoll, true, z, messageSchedulingState, jVar);
        return true;
    }

    public final void m32568Ti() {
        boolean h = this.f9898I1.m29583h();
        if (this.f9895H1 != h) {
            this.f9895H1 = h;
            this.f10030x0.m7643r2();
        }
    }

    public int m32567Tj() {
        return (int) m32201vk();
    }

    public boolean m32566Tk() {
        return this.f9972h1;
    }

    public void m32562To() {
        this.f10030x0.m7765P1();
    }

    public final void m32561Tp(boolean z, String str) {
        this.f9891G0.setInEditMode(z);
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            i0Var.m8246x0(z, str);
        }
    }

    public final boolean m32560Tq(View view) {
        return m32429dr(view, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil);
    }

    public LinearLayout m32554Uj() {
        return this.f10022v0;
    }

    public boolean m32553Uk() {
        return this.f9972h1 && this.f9975i1 == 4;
    }

    public void m32549Uo(long j) {
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            i0Var.getInlineSearchContext().m21643t0(j);
        }
    }

    public final void m32548Up(int i, boolean z) {
        RunnableC9558i0 i0Var;
        if (m32535Vp(C5063c.m24138h(this.f9985l2, i, z)) && i == 2 && (i0Var = this.f10038z0) != null) {
            i0Var.setEnabled(!z);
        }
    }

    public void m32547Uq(boolean z, C4837y0 y0Var) {
        if (!m32229ti()) {
            if (z) {
                this.f9955b2.setMessageList(y0Var);
            }
            this.f9940W1.m18474Q1(this.f9958c2, z, m9339Ta());
        } else if (!z) {
            m9298Zb();
        }
    }

    @Override
    public void mo4069V5(final long j, long j2, int i, boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32408fm(j);
            }
        });
    }

    public final void m32542Vi() {
        mo4347s().m14500d3(this, !m9339Ta() || this.f9954b1 >= 1.0f);
    }

    public final float m32541Vj() {
        return m32201vk() + m32188wk();
    }

    public boolean m32540Vk() {
        return this.f9891G0.m18761e();
    }

    public final boolean m32537Vn() {
        String X;
        if (!this.f9891G0.m18762d()) {
            return false;
        }
        if (this.f10038z0.getInlineSearchContext().m21684X() != null) {
            String str = "@" + ((Object) X) + " ";
            if (this.f10038z0.getText().toString().equals(str.toString())) {
                this.f10038z0.m8249v0("", false);
            } else {
                this.f10038z0.m8249v0(str, true);
            }
        }
        return true;
    }

    public void m32536Vo(long[] jArr) {
        if (this.f9934U1 != null) {
            for (long j : jArr) {
                if (j == this.f9934U1.f25406id) {
                    if (m32390gr() || m32448cl()) {
                        this.f9934U1 = null;
                        return;
                    } else {
                        m32215uj(true);
                        return;
                    }
                }
            }
        }
    }

    public final boolean m32535Vp(int i) {
        RunnableC9558i0 i0Var;
        int i2 = this.f9985l2;
        boolean z = false;
        if (i2 == i) {
            return false;
        }
        boolean z2 = i2 != 0;
        this.f9985l2 = i;
        if (i != 0) {
            z = true;
        }
        if (!(z2 == z || (i0Var = this.f10038z0) == null)) {
            i0Var.setInputBlocked(z);
        }
        return true;
    }

    public void m32534Vq() {
        if (m9339Ta()) {
            C1408x.m37085f(this.f10038z0);
        }
    }

    @Override
    public void mo4068W(final long j, TdApi.ChatActionBar chatActionBar) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32526Wl(j);
            }
        });
    }

    @Override
    public void mo1566W2(final TdApi.BasicGroup basicGroup, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32539Vl(basicGroup, z);
            }
        });
    }

    @Override
    public int mo418W9() {
        if (this.f9991n1) {
            return 0;
        }
        int i = this.f9975i1;
        if (i == 1) {
            return R.id.menu_gallery;
        }
        if (i != 2) {
            if (i == 3) {
                return R.id.menu_search;
            }
            if (i == 4) {
                return 0;
            }
            if (i != 5) {
                if (mo9464C9() != 0) {
                    return (m32383hl() || m32266qk() != 0) ? R.id.menu_search : m32396gl() ? R.id.menu_secretChat : R.id.menu_more;
                }
                return 0;
            }
        }
        return R.id.menu_more;
    }

    public final void m32529Wi(TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (m32458bo()) {
            if (chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount == 0 || (this.f10002q0 != null && this.f30167b.m2294pc().m4139R(this.f10002q0.f25367id, chatJoinRequestsInfo))) {
                this.f9940W1.m18474Q1(this.f9964e2, false, m9339Ta());
                return;
            }
            if (chatJoinRequestsInfo.totalCount > 0) {
                this.f30167b.m2294pc().m4114j0(this.f10002q0.f25367id, true);
            }
            this.f9961d2.m8018O0(chatJoinRequestsInfo, m9339Ta());
            this.f9940W1.m18474Q1(this.f9964e2, true, m9339Ta());
        }
    }

    public TdApi.Chat m32528Wj() {
        return this.f10002q0;
    }

    public boolean m32527Wk() {
        int i;
        return this.f9972h1 && ((i = this.f9975i1) == 1 || i == 5);
    }

    public final void m32524Wn(AbstractC5918j<TdApi.ChatAdministrators> jVar) {
        TdApi.ChatAdministrators chatAdministrators = this.f9923Q2;
        if (chatAdministrators != null) {
            jVar.mo1330a(chatAdministrators);
        } else if (this.f9926R2 != null) {
            this.f9926R2 = jVar;
        } else {
            this.f9926R2 = jVar;
            this.f30167b.m2270r4().m14783o(new TdApi.GetChatAdministrators(this.f10002q0.f25367id), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2971rh.this.m32694Jl(object);
                }
            });
        }
    }

    public void m32523Wo() {
        C4868i.m24726c2().m24811Q3(this);
        mo4347s().m14529V0().m6948J0(this);
    }

    public void m32522Wp(long j, String str) {
        if (m32671Li()) {
            RunnableC9558i0 i0Var = this.f10038z0;
            i0Var.m8249v0(str + " ", true);
            C1408x.m37085f(this.f10038z0);
            return;
        }
        this.f30167b.m2485dd().m3439u7(this, j, new HandlerC10770jj.C10780j().m3368h());
    }

    public void m32521Wq(long j, TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard) {
        m32145zo(j, replyMarkupShowKeyboard, false, false);
    }

    @Override
    public CharSequence mo9313X9() {
        int i = this.f9975i1;
        if (i == 1) {
            return C4403w.m27869i1(R.string.Wallpaper);
        }
        if (i == 2) {
            return C4403w.m27869i1(R.string.TextSize);
        }
        if (i == 5) {
            return C4403w.m27869i1(R.string.ChatBackgroundPreview);
        }
        return C4403w.m27869i1(m32383hl() ? R.string.SavedMessages : R.string.ChatPreview);
    }

    public final void m32516Xi() {
        long p = C7316a.m17045p(mo9464C9());
        long j = 0;
        TdApi.SupergroupFullInfo i2 = p != 0 ? this.f30167b.m2480e2().m1634i2(p) : null;
        if (i2 != null) {
            j = i2.linkedChatId;
        }
        if (this.f10007r1 != j) {
            this.f10007r1 = j;
            m32246rr(true);
        }
    }

    public long m32515Xj() {
        return C4779t2.m25465n2(this.f10002q0);
    }

    public boolean m32514Xk() {
        return this.f9972h1 && this.f9975i1 == 5;
    }

    public int m32511Xn() {
        if (m9332Ua()) {
            return m32371ik();
        }
        int f = C1357a0.m37544f() - View$OnClickListenerC9170d1.m10066c3(true);
        return (m32671Li() || this.f9907L1) ? f - C1357a0.m37541i(49.0f) : f;
    }

    public final void m32510Xo(TdApi.Message[] messageArr, Runnable runnable) {
        HandlerC10770jj.m3708T7(this, mo9464C9(), messageArr, runnable, null);
    }

    public void m32509Xp(boolean z, boolean z2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9915O0.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9918P0.getLayoutParams();
        if (z) {
            layoutParams.addRule(2, R.id.msg_bottom);
            layoutParams.addRule(12, 0);
            layoutParams2.addRule(2, R.id.msg_bottom);
            layoutParams2.addRule(12, 0);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(2, 0);
            layoutParams2.addRule(12);
            layoutParams2.addRule(2, 0);
        }
        if (z) {
            this.f10022v0.setVisibility(0);
            this.f9872A0.setVisibility(0);
            this.f9937V1.setVisibility(0);
            this.f9885E0.setVisibility(0);
            if (z2) {
                this.f9882D0.setVisibility(4);
                this.f9891G0.setVisibility(0);
                return;
            }
            this.f9882D0.setVisibility(0);
            this.f9891G0.setVisibility(4);
            return;
        }
        m32748Fk();
        this.f10022v0.setVisibility(8);
        this.f9937V1.setVisibility(8);
        this.f9872A0.setVisibility(8);
        this.f9885E0.setVisibility(8);
        this.f9882D0.setVisibility(8);
        this.f9891G0.setVisibility(8);
    }

    public void m32508Xq(String str, TdApi.WebPage webPage) {
        if (!this.f9972h1 && !m9332Ua()) {
            String str2 = this.f9905K2;
            this.f9905K2 = str;
            this.f9908L2 = webPage;
            this.f9911M2 = null;
            if (str != null) {
                this.f9937V1.m7843G1(str, webPage);
                if (str2 == null) {
                    m32717Ho();
                }
            } else if (this.f9982k2 != null) {
                m32600Qq();
            } else if (this.f9934U1 != null) {
                m32574Sq();
            } else {
                m32202vj();
            }
        }
    }

    @Override
    public void mo4067Y(final long j, final TdApi.Message message) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32356jm(j, message);
            }
        });
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i != 1) {
            if (i == 12 && f == 0.0f) {
                this.f9892G1 = 0;
            }
        } else if (f == 0.0f) {
            m32184wo();
        }
    }

    @Override
    public void mo9304Yb(HeaderEditText headerEditText) {
        headerEditText.setInputType(524289);
        int i = C1357a0.m37541i(112.0f);
        if (C4403w.m27984G2()) {
            headerEditText.setPadding(i, headerEditText.getPaddingTop(), headerEditText.getPaddingRight(), headerEditText.getPaddingBottom());
        } else {
            headerEditText.setPadding(headerEditText.getPaddingLeft(), headerEditText.getPaddingTop(), i, headerEditText.getPaddingBottom());
        }
    }

    public final void m32503Yi() {
        boolean z = this.f9954b1 > 0.0f || this.f9957c1 != 0;
        if (this.f9960d1 != z) {
            this.f9960d1 = z;
            if (z) {
                C1408x.m37088c(this.f10038z0);
            }
            m32548Up(2, z);
        }
    }

    public boolean m32502Yj() {
        return this.f9996o2;
    }

    public final void m32501Yk() {
        if (this.f9971g3 == null) {
            View.OnClickListener odVar = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC2971rh.this.m32786Cl(view);
                }
            };
            AbstractView$OnTouchListenerC7889a s = mo4347s();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(6, R.id.msg_bottom);
            layoutParams.addRule(8, R.id.msg_bottom);
            C2995s sVar = new C2995s(s);
            this.f9971g3 = sVar;
            sVar.setMinimumHeight(C1357a0.m37541i(49.0f));
            this.f9971g3.setLayoutParams(layoutParams);
            C7008q2 q2Var = new C7008q2(s);
            this.f9974h3 = q2Var;
            q2Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f9971g3.addView(this.f9974h3);
            m9163t8(this.f9974h3);
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37541i(52.0f), C1357a0.m37541i(49.0f), 19);
            t1.leftMargin = C1357a0.m37541i(52.0f);
            ImageView M = C1399s0.m37208M(s, R.drawable.baseline_person_24, R.id.theme_color_icon, this);
            this.f9977i3 = M;
            M.setId(R.id.btn_search_by);
            this.f9977i3.setOnClickListener(odVar);
            this.f9977i3.setLayoutParams(t1);
            this.f9971g3.addView(this.f9977i3);
            FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(C1357a0.m37541i(52.0f), C1357a0.m37541i(49.0f), 19);
            ImageView M2 = C1399s0.m37208M(s, R.drawable.baseline_date_range_24, R.id.theme_color_icon, this);
            this.f9980j3 = M2;
            M2.setId(R.id.btn_search_jump);
            this.f9980j3.setOnClickListener(odVar);
            this.f9980j3.setLayoutParams(t12);
            this.f9971g3.addView(this.f9980j3);
            FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(C1357a0.m37541i(52.0f), C1357a0.m37541i(49.0f), 21);
            t13.rightMargin = C1357a0.m37541i(52.0f);
            ImageView M3 = C1399s0.m37208M(s, R.drawable.baseline_keyboard_arrow_up_24, R.id.theme_color_icon, this);
            this.f9983k3 = M3;
            M3.setId(R.id.btn_search_next);
            this.f9983k3.setOnClickListener(odVar);
            this.f9983k3.setLayoutParams(t13);
            this.f9983k3.setEnabled(false);
            this.f9971g3.addView(this.f9983k3);
            FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(C1357a0.m37541i(52.0f), C1357a0.m37541i(49.0f), 21);
            ImageView M4 = C1399s0.m37208M(s, R.drawable.baseline_keyboard_arrow_down_24, R.id.theme_color_icon, this);
            this.f9986l3 = M4;
            M4.setId(R.id.btn_search_prev);
            this.f9986l3.setOnClickListener(odVar);
            this.f9986l3.setPadding(0, 0, C1357a0.m37541i(12.0f), 0);
            this.f9986l3.setLayoutParams(t14);
            this.f9986l3.setEnabled(false);
            this.f9971g3.addView(this.f9986l3);
            int i = C1357a0.m37541i(22.0f);
            FrameLayout.LayoutParams t15 = FrameLayoutFix.m18007t1(-2, -2, 21);
            t15.rightMargin = (C1357a0.m37541i(52.0f) * 2) + i;
            t15.leftMargin = C1357a0.m37541i(5.0f) + i;
            C2996t tVar = new C2996t(s, i);
            this.f9989m3 = tVar;
            tVar.setId(R.id.btn_search_counter);
            this.f9989m3.setSingleLine(true);
            this.f9989m3.setTextSize(1, 15.0f);
            this.f9989m3.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f9989m3.setTypeface(C1389o.m37260i());
            this.f9989m3.setTextColor(C11524j.m217S0());
            m9126y8(this.f9989m3);
            this.f9989m3.setLayoutParams(t15);
            this.f9971g3.addView(this.f9989m3);
            FrameLayout.LayoutParams t16 = FrameLayoutFix.m18007t1(C1357a0.m37541i(49.0f), C1357a0.m37541i(49.0f), 21);
            t16.rightMargin = (C1357a0.m37541i(52.0f) * 2) + i;
            C6977n2 n2Var = new C6977n2(s);
            this.f9993n3 = n2Var;
            n2Var.m18227g(4.5f, 0.0f, 10.0f);
            this.f9993n3.setLayoutParams(t16);
            this.f9993n3.m18229d(1.0f);
            this.f9971g3.addView(this.f9993n3);
            m9163t8(this.f9993n3);
            m32326lq(0.0f);
            m32339kq(0.0f);
        }
    }

    public int m32498Yn() {
        if (m9332Ua()) {
            return C1357a0.m37543g() - (C1357a0.m37541i(26.0f) * 2);
        }
        return C1357a0.m37543g();
    }

    public final void m32497Yo() {
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (eVar != null && eVar.m21496p() > 0) {
            int p = this.f9880C1.m21496p();
            long[] jArr = new long[p];
            for (int i = 0; i < p; i++) {
                jArr[i] = this.f9880C1.m21501j(i);
            }
            this.f30167b.m2684Qa(mo9464C9(), jArr);
        }
    }

    public void m32496Yp(boolean z) {
        this.f9953a3 = z;
    }

    public final void m32495Yq() {
        if (this.f9932T2.m29583h() && !m32216ui() && !m32422el() && m32671Li() && m32761Ek() && !m32448cl() && !m32396gl() && m9339Ta() && !m32370il() && !this.f9891G0.m18762d()) {
            long j = m32383hl() ? 1024L : 512L;
            if (C4868i.m24726c2().m24763X2(j)) {
                long d4 = this.f30167b.m2494d4(mo9464C9());
                boolean z = !m32383hl() && this.f30167b.m2480e2().m1729I2(d4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j);
                sb2.append(m32383hl() ? "_self" : z ? "_online" : m32474al() ? "_channel" : "");
                String sb3 = sb2.toString();
                HashSet<String> hashSet = f9871B3;
                if (hashSet == null || !hashSet.contains(sb3)) {
                    if (f9871B3 == null) {
                        f9871B3 = new HashSet<>();
                    }
                    f9871B3.add(sb3);
                    if (m32383hl()) {
                        m32638Nq(R.string.HoldToRemind);
                    } else if (z) {
                        m32626Oq(C4403w.m27853m1(R.string.HoldToSchedule2, this.f30167b.m2480e2().m1749D2(d4)), false);
                    } else if (m32474al()) {
                        m32638Nq(R.string.HoldToSilentBroadcast);
                    } else {
                        m32638Nq(R.string.HoldToSchedule);
                    }
                }
            }
        }
    }

    @Override
    public boolean mo32494Z0(View$OnClickListenerC2280d6 d6Var) {
        return m32216ui();
    }

    @Override
    public void mo417Z8() {
        C11520h I;
        m32496Yp(false);
        m32444cp();
        m32391gq(false, false);
        mo9421I8(0.0f, 0.0f);
        m32748Fk();
        m32651Mp(TdApi.ChatActionCancel.CONSTRUCTOR);
        m32646Ni();
        m32658Mi();
        m32457bp();
        this.f9875A3 = true;
        C9678w2 w2Var = this.f10030x0;
        if (w2Var != null) {
            w2Var.m7636t0(this);
        }
        C9357x2.C9370l lVar = this.f10023v1;
        if (lVar != null) {
            lVar.m8874y();
            this.f10023v1 = null;
        }
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
        if (z0Var != null) {
            z0Var.m17888A2();
        }
        C9620n4 n4Var = this.f9909M0;
        if (n4Var != null) {
            n4Var.mo4501a3();
        }
        C6979n4 n4Var2 = this.f9912N0;
        if (n4Var2 != null) {
            n4Var2.mo4501a3();
            if (m32527Wk() && !m32514Xk() && (I = this.f30167b.m2294pc().m4148I(C11524j.m177i0())) != null && I.m309a0()) {
                this.f30167b.m2294pc().m4096s0(C11520h.m299f0(this.f30167b, I, this.f9912N0.m18216g()), true, C11524j.m177i0());
            }
        }
        this.f9913N1 = null;
        this.f9933U0 = false;
        m32320mj();
        m32483Zo();
        m32535Vp(0);
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            if (i0Var.getInput().isEmpty()) {
                m32741Fr("", false);
            } else {
                this.f10038z0.setText("");
            }
        }
        C2979d0 d0Var = this.f9945Y0;
        if (d0Var != null) {
            d0Var.m32133w();
        }
        m32620Pj();
        this.f9955b2.mo4501a3();
        C9615n0 n0Var = this.f9961d2;
        if (n0Var != null) {
            n0Var.mo4501a3();
        }
        m32189wj(true);
        m32267qj();
        m32359jj();
        m9410Jd(0.0f, false);
        C9534f fVar = this.f10010s0;
        if (fVar != null) {
            fVar.m9844I1();
        }
        if (this.f9994o0 || !this.f9990n0) {
            super.mo417Z8();
            C5974t0 t0Var = this.f9878B2;
            if (t0Var != null) {
                t0Var.m21739o();
                this.f9878B2 = null;
            }
            C6910i0 i0Var2 = this.f9940W1;
            if (i0Var2 != null) {
                i0Var2.mo4501a3();
            }
            View$OnClickListenerC9659t3 t3Var = this.f9937V1;
            if (t3Var != null) {
                t3Var.mo4501a3();
            }
            this.f9888F0.mo4501a3();
            RunnableC9558i0 i0Var3 = this.f10038z0;
            if (i0Var3 != null) {
                i0Var3.mo4501a3();
            }
            C9620n4 n4Var3 = this.f9936V0;
            if (n4Var3 != null) {
                n4Var3.mo4501a3();
            }
            if (this.f10028w2 != null) {
                m32241sj();
            }
            RunnableC5938f fVar2 = this.f10034y0;
            if (fVar2 != null) {
                fVar2.m21843g();
            }
            m32523Wo();
            C1399s0.m37162q(this.f10026w0);
            C1399s0.m37162q(this.f9939W0);
            RecyclerView recyclerView = this.f9939W0;
            if (recyclerView != null) {
                ((View$OnClickListenerC9592k4) recyclerView.getAdapter()).m8083i0();
            }
            this.f30167b.m2294pc().m4129b0(this);
            C11052v1.m1768b().m1766d(this);
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var2 = this.f9879C0;
            if (z0Var2 != null) {
                z0Var2.m17849Z();
            }
            this.f10030x0.m7626v2();
        }
        m32595Ri();
        C7389v0.m16637f0();
    }

    public final void m32489Zi() {
        if (!m32566Tk() && !m32435dl()) {
            m32575Sp(this.f30167b.m2867F3(this.f10002q0));
        }
    }

    public final boolean m32488Zj() {
        String str;
        return m32255ri() && (str = this.f9911M2) != null && str.equals(this.f9905K2);
    }

    public void m32487Zk(boolean z) {
        if (!m9319Wa() || z) {
            View$OnClickListenerC9659t3 t3Var = this.f9937V1;
            if (t3Var != null) {
                t3Var.invalidate();
            }
            MessagesRecyclerView messagesRecyclerView = this.f10026w0;
            if (messagesRecyclerView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) messagesRecyclerView.getLayoutManager();
                for (int i = 0; i < linearLayoutManager.m39248J(); i++) {
                    View I = linearLayoutManager.m39251I(i);
                    if (I != null) {
                        I.invalidate();
                    }
                }
            }
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
            if (z0Var != null) {
                z0Var.m17846b2();
            }
            if (this.f10012s2 != null) {
                for (int i2 = 0; i2 < this.f10012s2.getChildCount(); i2++) {
                    View childAt = this.f10012s2.getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        childAt.invalidate();
                    }
                }
                return;
            }
            return;
        }
        this.f10027w1 = true;
    }

    public final void m32483Zo() {
        this.f9982k2 = null;
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            i0Var.m8254s0();
            m32548Up(1, false);
        }
        this.f9891G0.m18763c(false, false);
    }

    public final void m32482Zp(boolean z) {
        if (this.f9935U2 != z) {
            this.f9935U2 = z;
            m9387Md(z);
            this.f10038z0.setInputBlocked(z);
        }
    }

    @Deprecated
    public void m32481Zq(AbstractC4761s4 s4Var, int[] iArr, String[] strArr, int[] iArr2, Object obj, TdApi.ChatMember chatMember, boolean z) {
        int i;
        String[] w3;
        this.f10039z1 = s4Var;
        this.f9877B1 = obj;
        this.f9873A1 = chatMember;
        StringBuilder sb2 = new StringBuilder();
        TdApi.Chat chat = this.f10002q0;
        if (chat != null) {
            boolean K6 = this.f30167b.m2784K6(chat.f25367id);
            if (s4Var.m25993Z3().content != null) {
                int constructor = s4Var.m25993Z3().content.getConstructor();
                if (constructor == 1115779641) {
                    String str = ((TdApi.MessageDice) s4Var.m25993Z3().content).emoji;
                    sb2.append(C4403w.m27865j1(C4779t2.f16221F.f16283a.equals(str) ? R.string.SendDartHint : C4779t2.f16222G.f16283a.equals(str) ? R.string.SendDiceHint : R.string.SendUnknownDiceHint, str));
                } else if (constructor == 1779022878) {
                    String S9 = this.f30167b.m2655S9(s4Var.m25993Z3(), true, true);
                    if (!C5070i.m24061i(S9)) {
                        sb2.append(S9);
                        sb2.append(": ");
                    }
                    sb2.append(C4779t2.m25717C(this.f30167b, s4Var.m25993Z3(), true));
                }
            }
            if (K6 && s4Var.m26013X4() > 0 && !s4Var.m25881l6()) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(C4403w.m27844o2(R.string.xViews, s4Var.m26013X4()));
            }
        }
        if (s4Var.m25992Z5() && (w3 = s4Var.m25772w3()) != null) {
            if (sb2.length() > 0) {
                sb2.append("\n");
            }
            sb2.append(C4403w.m27865j1(R.string.SendFailureInfo, C1363c0.m37453U(", ", w3)));
        }
        if (!s4Var.m25856o0()) {
            if (sb2.length() > 0) {
                sb2.append("\n\n");
            }
            TdApi.MessageSender messageSender = s4Var.m25993Z3().senderId;
            if (this.f30167b.m2480e2().m1680V1(messageSender)) {
                i = R.string.RestrictSavingBotInfo;
            } else if (this.f30167b.m2768L6(messageSender)) {
                i = R.string.RestrictSavingChannelInfo;
            } else {
                i = this.f30167b.m2203v7(messageSender) ? R.string.RestrictSavingUserInfo : R.string.RestrictSavingGroupInfo;
            }
            sb2.append(C4403w.m27869i1(i));
        }
        String trim = sb2.toString().trim();
        if (C5070i.m24061i(trim)) {
            trim = null;
        }
        m32691Jo(m9268de(trim, iArr, strArr, null, iArr2), s4Var, z);
    }

    @Override
    public void mo4066a0(final long j, TdApi.MessageSender messageSender) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32500Yl(j);
            }
        });
    }

    @Override
    public void mo7841a4(View$OnClickListenerC9659t3 t3Var) {
        if (m32390gr()) {
            m32228tj();
        } else if (m32448cl()) {
            m32280pj();
        } else {
            m32215uj(true);
        }
    }

    public void m32476aj() {
        m32463bj(-1, -1, false);
    }

    public final void m32475ak(boolean z, AbstractC5867f fVar) {
        if (fVar != null) {
            m32462bk(z, fVar);
        } else {
            m32182wq(z);
        }
    }

    public boolean m32474al() {
        return this.f30167b.m2784K6(mo9464C9());
    }

    public final void m32471ao(boolean z) {
        this.f10030x0.m7740W1(z);
    }

    public final void m32470ap() {
        if (this.f10031x1 && m9284bc() != null) {
            m32372ij();
            C9312u1 M = m9284bc().m9749M();
            M.m9509d(1);
            C2760nb nbVar = new C2760nb(this.f30165a, this.f30167b);
            nbVar.get();
            M.m9498o(nbVar, 0);
        }
    }

    public final void m32469aq(float f) {
        if (this.f9928S1 != f) {
            this.f9928S1 = f;
            this.f9918P0.setAlpha(C5069h.m24089d(f));
            m32233sr();
        }
    }

    public final void m32468ar() {
        C7045v2 v2Var;
        if (this.f9957c1 != 0 && (v2Var = this.f9948Z0) != null) {
            v2Var.mo18027N(0, true);
        }
    }

    @Override
    public long mo16269b() {
        return mo9464C9();
    }

    @Override
    public void mo29b1(C11131y6 y6Var, int i) {
        C11008t0.m1996f(this, y6Var, i);
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23934b(this, i);
    }

    @Override
    public void mo7924b5(C9639r rVar, View view) {
        this.f10018u0.removeView(view);
    }

    public void m32463bj(int i, int i2, boolean z) {
        C9565i1 i1Var;
        C9580j1 E0;
        int k0;
        if (!m9332Ua()) {
            C9746h0 X0 = mo4347s().m14523X0();
            boolean z2 = mo9464C9() == X0.m7337v();
            View$OnClickListenerC2971rh rhVar = null;
            if (z2) {
                long x = X0.m7336x();
                LinearLayoutManager N0 = this.f10030x0.m7774N0();
                if (i == -1) {
                    i = N0.m39549X1();
                }
                if (i2 == -1) {
                    i2 = N0.m39546a2();
                }
                if (i != -1 && i2 != -1 && !this.f10026w0.m39500C0() && (k0 = (E0 = this.f10030x0.m7808E0()).m8115k0()) > 0) {
                    while (i <= i2) {
                        if (i >= 0 && i < k0 && C9586k1.m8092T(E0.mo6150F(i)) && E0.m8118h0(i).m26115N3() == x) {
                            View C = N0.mo39262C(i);
                            if (C instanceof C9565i1) {
                                i1Var = (C9565i1) C;
                                AbstractC4761s4 message = i1Var.getMessageView().getMessage();
                                if (message != null && message.m26115N3() == x) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    }
                }
            }
            i1Var = null;
            if (m9332Ua()) {
                rhVar = this;
            }
            X0.m7268S0(i1Var, rhVar);
            if (z2 && z) {
                X0.m7278K0();
            }
        }
    }

    public final void m32462bk(final boolean z, AbstractC5867f fVar) {
        final boolean[] zArr = new boolean[1];
        AbstractC4280e jeVar = new AbstractC4280e() {
            @Override
            public final void onLocationChanged(Location location) {
                View$OnClickListenerC2971rh.this.m32148zl(r2, zArr, z, location);
            }
        };
        final AbstractRunnableC5910b[] bVarArr = {new C2986j(zArr, jeVar, fVar, z)};
        C1379j0.m37332e0(bVarArr[0], 3000L);
        try {
            C4282f.f14331b.mo923a(this.f10028w2, LocationRequest.m30353b().m30348g(100).m30351d(3000L).m30349f(1).m30350e(5000L), jeVar);
        } catch (SecurityException unused) {
            zArr[0] = true;
            m32182wq(z);
        } catch (Throwable th) {
            Log.m14710w("requestLocationUpdates error", th, new Object[0]);
            zArr[0] = true;
            m32182wq(z);
        }
    }

    public boolean m32461bl() {
        TdApi.Message message = this.f9982k2;
        return (message == null || message.content.getConstructor() == 1989037971) ? false : true;
    }

    public final boolean m32458bo() {
        return !this.f9972h1 && !m9332Ua() && !m32216ui();
    }

    public final void m32457bp() {
        if (this.f9971g3 != null) {
            this.f9989m3.setText("");
            this.f9986l3.setEnabled(false);
            this.f9983k3.setEnabled(false);
            m32313mq(false, false);
            m32437dj();
            m32339kq(0.0f);
            m32780Cr();
            boolean M6 = this.f30167b.m2752M6(this.f10002q0);
            if (this.f10013s3 != M6) {
                this.f10013s3 = M6;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9971g3.getLayoutParams();
                if (M6) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(8, 0);
                    layoutParams.addRule(6, 0);
                    layoutParams.height = C1357a0.m37541i(48.0f);
                } else {
                    layoutParams.addRule(12, 0);
                    layoutParams.addRule(8, R.id.msg_bottom);
                    layoutParams.addRule(6, R.id.msg_bottom);
                    layoutParams.height = -1;
                }
                this.f9971g3.setLayoutParams(layoutParams);
            }
        }
    }

    public final void m32456bq(boolean z, boolean z2) {
        if (this.f9925R1 != z) {
            this.f9925R1 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f9922Q1 == null) {
                    this.f9922Q1 = new C3950k(7, this, C2057b.f7280b, 180L, this.f9928S1);
                }
                this.f9922Q1.m29544i(f);
                return;
            }
            C3950k kVar = this.f9922Q1;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m32469aq(f);
        }
    }

    public void m32455br() {
        RunnableC5938f fVar;
        if (this.f10002q0 != null) {
            C5320c cVar = new C5320c(4);
            C5146u0 u0Var = new C5146u0(4);
            if (!this.f10030x0.m7649q1() && !this.f10035y1) {
                cVar.m23284a(R.id.btn_search);
                u0Var.m23816a(R.string.Search);
            }
            TdApi.ChatMemberStatus K3 = this.f30167b.m2787K3(this.f10002q0.f25367id);
            if ((!this.f30167b.m2784K6(this.f10002q0.f25367id) || (K3 != null && !C4779t2.m25520f3(K3))) && !this.f30167b.m2443g7(this.f10002q0.f25367id)) {
                cVar.m23284a(R.id.btn_mute);
                u0Var.m23816a(this.f30167b.m2223u3(this.f10002q0.f25367id) ? R.string.Mute : R.string.Unmute);
            }
            if (this.f30167b.m2900D2(this.f10002q0.f25367id)) {
                cVar.m23284a(R.id.btn_reportChat);
                u0Var.m23816a(R.string.Report);
            }
            if (this.f30167b.m2772L2(this.f10002q0)) {
                cVar.m23284a(R.id.btn_setPasscode);
                u0Var.m23816a(R.string.PasscodeTitle);
            }
            this.f30167b.m2485dd().m3873D2(mo9464C9(), cVar, u0Var, true, false);
            if (!this.f10035y1) {
                if (C7316a.m17049l(this.f10002q0.f25367id) && C4779t2.m25448p5(this.f30167b.m2525b4(this.f10002q0))) {
                    cVar.m23284a(R.id.btn_shareMyContact);
                    u0Var.m23816a(R.string.ShareMyContactInfo);
                }
                if (this.f10030x0.m7712d0()) {
                    cVar.m23284a(R.id.btn_showPinnedMessage);
                    u0Var.m23816a(R.string.PinnedMessage);
                }
                if (this.f30167b.m2816I6(this.f10002q0) && (fVar = this.f10034y0) != null) {
                    if (fVar.m21841i() != null) {
                        cVar.m23284a(R.id.btn_botHelp);
                        u0Var.m23816a(R.string.BotHelp);
                    }
                    if (this.f10034y0.m21840j() != null) {
                        cVar.m23284a(R.id.btn_botSettings);
                        u0Var.m23816a(R.string.BotSettings);
                    }
                }
            }
            if (!(this.f10007r1 == 0 || this.f9892G1 == 4)) {
                cVar.m23284a(R.id.btn_openLinkedChat);
                u0Var.m23816a(this.f30167b.m2784K6(mo9464C9()) ? R.string.LinkedGroup : R.string.LinkedChannel);
            }
            m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
        }
    }

    @Override
    public void mo4065c2(final long j, final TdApi.DraftMessage draftMessage) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32486Zl(j, draftMessage);
            }
        });
    }

    @Override
    public void mo4064c4(final long j, final TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32421em(j, chatPhotoInfo);
            }
        });
    }

    public final void m32450cj() {
        if (!m9332Ua()) {
            float f = -m32541Vj();
            FrameLayoutFix frameLayoutFix = this.f9915O0;
            if (frameLayoutFix != null) {
                frameLayoutFix.setTranslationY(f);
            }
            FrameLayoutFix frameLayoutFix2 = this.f9918P0;
            if (frameLayoutFix2 != null) {
                frameLayoutFix2.setTranslationY(m32292ok());
            }
            m32233sr();
        }
    }

    public long m32449ck() {
        TdApi.Message message = this.f9934U1;
        if (message != null) {
            return message.f25406id;
        }
        return 0L;
    }

    public boolean m32448cl() {
        return this.f9982k2 != null;
    }

    public boolean m32445co() {
        return this.f9895H1 && !m32514Xk();
    }

    public final void m32444cp() {
        this.f9883D1 = null;
        this.f9886E1 = 0.0f;
    }

    public final void m32443cq(int i) {
        if ((i <= 0 || (!this.f9972h1 && !m9332Ua() && !m32216ui())) && this.f9931T1 != i) {
            this.f9931T1 = i;
            boolean z = true;
            boolean z2 = i > 0;
            boolean Ta = m9339Ta();
            C9549h hVar = this.f9930T0;
            if (!Ta || this.f9928S1 <= 0.0f) {
                z = false;
            }
            hVar.m8364a(i, false, z);
            m32456bq(z2, Ta);
        }
    }

    public void m32442cr(TdApi.Message message, boolean z, boolean z2) {
        TdApi.Message message2;
        if (!this.f9972h1 && !m9332Ua()) {
            if (message != null && message.f25406id != 0) {
                String str = null;
                if (m9382Na()) {
                    m9320W8(null);
                } else if (m9374Oa()) {
                    mo8837u5(-1);
                }
                if ((this.f9998p0 & 1) == 0 && ((message2 = this.f9934U1) == null || message2.f25406id != message.f25406id)) {
                    if (!m32390gr()) {
                        View$OnClickListenerC9659t3 t3Var = this.f9937V1;
                        if (this.f30167b.m2784K6(this.f10002q0.f25367id)) {
                            str = this.f10002q0.title;
                        }
                        t3Var.m7844F1(message, str);
                    }
                    if (this.f9934U1 != null || m32390gr() || m32448cl()) {
                        this.f9934U1 = message;
                    } else {
                        this.f9934U1 = message;
                        m32717Ho();
                    }
                    if (z) {
                        this.f10038z0.setTextChangedSinceChatOpened(true);
                        m32431dp();
                    }
                }
                if (z2) {
                    C1408x.m37085f(this.f10038z0);
                }
            } else if (m32390gr()) {
                m32587Rq();
            } else {
                m32215uj(z);
            }
        }
    }

    @Override
    public int mo7583d2() {
        return View$OnClickListenerC9170d1.m10066c3(true) + this.f10026w0.getMeasuredHeight();
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        m32595Ri();
        m32298nr();
        this.f10030x0.m7732Y2(true);
        m32431dp();
        if (!m9348S9() && !m32422el()) {
            this.f9876B0 = true;
            RunnableC9558i0 i0Var = this.f10038z0;
            if (i0Var != null) {
                i0Var.setEnabled(false);
            }
        }
    }

    @Override
    public boolean mo9270dc() {
        C9678w2 w2Var = this.f10030x0;
        return w2Var != null && !w2Var.m7649q1() && this.f10030x0.m7808E0().m8115k0() == 0;
    }

    public final void m32437dj() {
        boolean z = true;
        boolean z2 = m32763Ei() && C5070i.m24061i(m9340T9());
        if (!m9339Ta() || m9182qa() <= 0.0f) {
            z = false;
        }
        m32352jq(z2, z);
    }

    public final void m32436dk(final boolean z, boolean z2, boolean z3) {
        if (mo9464C9() == this.f10036y2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo4347s(), C11524j.m150v());
            builder.setTitle(C4403w.m27869i1(R.string.AppName));
            builder.setMessage(C4403w.m27869i1(R.string.DetectLocationError));
            builder.setPositiveButton(C4403w.m27950P0(), DialogInterface$OnClickListenerC3156ug.f10573a);
            builder.setNegativeButton(C4403w.m27869i1(R.string.ShareYouLocationUnableManually), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    View$OnClickListenerC2971rh.this.m32799Bl(z, dialogInterface, i);
                }
            });
            m9344Sd(builder);
        }
    }

    public final boolean m32435dl() {
        return this.f9972h1 && this.f9975i1 == 3;
    }

    public boolean m32432do() {
        return false;
    }

    public final void m32431dp() {
        RunnableC9558i0 i0Var;
        if (m32776Di() && !m32448cl() && (i0Var = this.f10038z0) != null && i0Var.m8312C0() && m9339Ta()) {
            TdApi.DraftMessage draftMessage = new TdApi.DraftMessage(m32449ck(), (int) (System.currentTimeMillis() / 1000), new TdApi.InputMessageText(this.f10038z0.mo8279f(false), m32488Zj(), false));
            Client r4 = this.f30167b.m2270r4();
            C4737p7 p7Var = this.f9987m1;
            long b = p7Var != null ? p7Var.m26299b() : this.f10002q0.f25367id;
            C4737p7 p7Var2 = this.f9987m1;
            r4.m14783o(new TdApi.SetChatDraftMessage(b, p7Var2 != null ? p7Var2.m26294g() : 0L, draftMessage), this.f30167b.m2392ja());
            for (int i = 0; i < m9157te() - 1; i++) {
                AbstractC9323v4<?> se = m9164se(i);
                if (se instanceof View$OnClickListenerC2971rh) {
                    View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) se;
                    if (rhVar.m32801Bj(mo9464C9(), this.f9987m1, m32216ui()) && rhVar.m32776Di() && rhVar.f10038z0 != null && !rhVar.m32448cl()) {
                        rhVar.m32168xr(mo9464C9(), !C7321e.m16968Z0(draftMessage) ? draftMessage : null);
                    }
                }
            }
        }
    }

    public void m32430dq(float f) {
        if (this.f9979j2 != f) {
            this.f9979j2 = f;
            m32793Br();
        }
    }

    public final boolean m32429dr(View view, int i, int i2, int i3, int i4) {
        if (view == null) {
            return this.f30167b.m2246sc(this.f10002q0, i, i2, i3, i4);
        }
        CharSequence V5 = this.f30167b.m2614V5(this.f10002q0, i, i2, i3, i4);
        if (V5 == null) {
            return false;
        }
        if (view == this.f9891G0 || view == this.f9888F0) {
            m32626Oq(V5, true);
        } else {
            mo4347s().m14584H3().m8985g(view).m8951q(R.drawable.baseline_warning_24).m8958i(this).m8971D(this.f30167b, V5).m8919F();
        }
        return true;
    }

    @Override
    public void mo4063e7(final long j, int i) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32460bm(j);
            }
        });
    }

    public final void m32424ej(boolean z) {
        m32286oq(this.f10038z0.getText().length() > 0 || m32448cl() || this.f9959c3, z);
    }

    public TdApi.DraftMessage m32423ek() {
        C4737p7 p7Var = this.f9987m1;
        return p7Var != null ? p7Var.m26298c() : this.f10002q0.draftMessage;
    }

    public final boolean m32422el() {
        return this.f30167b.m2784K6(mo9464C9()) && !this.f30167b.m2220u6(this.f10002q0);
    }

    public final boolean m32419eo() {
        return this.f30167b.m2752M6(this.f10002q0) && !m32761Ek();
    }

    public final void m32418ep(boolean z) {
        RunnableC9558i0 i0Var;
        TdApi.MessageText messageText;
        boolean z2;
        if (this.f9982k2 != null && (i0Var = this.f10038z0) != null) {
            TdApi.FormattedText f = i0Var.mo8279f(z);
            if (!C7321e.m16965a1(f) || m32448cl()) {
                switch (this.f9982k2.content.getConstructor()) {
                    case TdApi.MessagePhoto.CONSTRUCTOR:
                    case TdApi.MessageAudio.CONSTRUCTOR:
                    case TdApi.MessageVoiceNote.CONSTRUCTOR:
                    case TdApi.MessageDocument.CONSTRUCTOR:
                    case TdApi.MessageAnimation.CONSTRUCTOR:
                    case TdApi.MessageVideo.CONSTRUCTOR:
                        if (!C7321e.m16995M(C7321e.m16899w1(this.f9982k2.content), f)) {
                            C10930q6 q6Var = this.f30167b;
                            TdApi.Message message = this.f9982k2;
                            q6Var.m2570Y4(message.chatId, message.f25406id, f);
                            break;
                        }
                        break;
                    case TdApi.MessageAnimatedEmoji.CONSTRUCTOR:
                    case TdApi.MessageText.CONSTRUCTOR:
                        if (this.f9982k2.content.getConstructor() == 908195298) {
                            messageText = new TdApi.MessageText(C7321e.m16899w1(this.f9982k2.content), null);
                        } else {
                            messageText = (TdApi.MessageText) this.f9982k2.content;
                        }
                        TdApi.InputMessageText inputMessageText = new TdApi.InputMessageText(f, m32488Zj(), false);
                        if (!C7321e.m16995M(inputMessageText.text, messageText.text) || (((z2 = inputMessageText.disableWebPagePreview) && messageText.webPage != null) || (!z2 && messageText.webPage == null && this.f9908L2 != null))) {
                            String trim = f.text.trim();
                            if (trim.length() != 0) {
                                C10930q6 q6Var2 = this.f30167b;
                                TdApi.Message message2 = this.f9982k2;
                                q6Var2.m2555Z4(message2.chatId, message2.f25406id, inputMessageText, this.f9908L2, C5078d.m23986z().m24032A(trim));
                                break;
                            } else {
                                return;
                            }
                        }
                        break;
                    default:
                        throw new UnsupportedOperationException(Integer.toString(this.f9982k2.content.getConstructor()));
                }
                m32280pj();
            }
        }
    }

    public void m32417eq() {
        if (!this.f10031x1) {
            this.f10031x1 = true;
            this.f30167b.m2930B4().m4716b1().m1554a(this);
        }
    }

    public void m32416er(TdApi.SecretChat secretChat) {
        int constructor = secretChat.state.getConstructor();
        if (constructor == -1945106707) {
            m32715Hq(C4403w.m27869i1(R.string.SecretChatCancelled), 6, false);
        } else if (constructor == -1637050756) {
            m32715Hq(C4403w.m27865j1(R.string.AwaitingEncryption, this.f30167b.m2480e2().m1749D2(secretChat.userId)), 6, false);
        }
    }

    public void m32411fj(TdApi.Message message) {
        TdApi.ReplyMarkup replyMarkup;
        TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr;
        if (!(this.f9881C2 == null || (replyMarkup = message.replyMarkup) == null || replyMarkup.getConstructor() != -619317658)) {
            for (TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 : ((TdApi.ReplyMarkupInlineKeyboard) message.replyMarkup).rows) {
                int length = inlineKeyboardButtonArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i];
                        if (inlineKeyboardButton.type.getConstructor() == -2035563307) {
                            m32351jr((TdApi.InlineKeyboardButtonTypeSwitchInline) inlineKeyboardButton.type);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public TdApi.WebPage m32410fk(TdApi.FormattedText formattedText) {
        TdApi.Message message = this.f9982k2;
        if (message == null || message.content.getConstructor() != 1989037971) {
            return null;
        }
        TdApi.MessageText messageText = (TdApi.MessageText) this.f9982k2.content;
        if (C7321e.m16993N(formattedText, messageText.text, true)) {
            return messageText.webPage;
        }
        return null;
    }

    public boolean m32409fl(long j, long j2, AbstractC4761s4 s4Var) {
        int h;
        AbstractC4761s4 q;
        synchronized (this) {
            C6035e<AbstractC4761s4> eVar = this.f9880C1;
            if (eVar == null || eVar.m21496p() <= 0 || (h = this.f9880C1.m21503h(j2)) < 0 || (q = this.f9880C1.m21495q(h)) == null || q.m26145K2() != j) {
                return false;
            }
            this.f9880C1.m21497o(h, s4Var);
            return true;
        }
    }

    public final boolean m32406fo() {
        return m32383hl() && !m9332Ua() && !m32566Tk() && !m32216ui();
    }

    public final void m32405fp() {
        int F0 = C9678w2.m7805F0(this.f30167b.m2188w6(), this.f10002q0, this.f9987m1);
        if (!this.f10030x0.m7737X0()) {
            if (this.f9972h1 || m9332Ua() || F0 != 2) {
                TdApi.Chat chat = this.f10002q0;
                if (chat != null && C9678w2.m7717c0(chat, this.f9987m1)) {
                    C7319d G0 = C9678w2.m7801G0(this.f30167b.m2188w6(), this.f10002q0, this.f9987m1, 2);
                    int b1 = this.f10030x0.m7721b1();
                    AbstractC4761s4 z0 = this.f10030x0.m7608z0();
                    C7319d G9 = z0 != null ? z0.m26179G9() : null;
                    int o0 = this.f10030x0.m7808E0().m8111o0(G0);
                    if (G9 == null || G9.m17027c() != G0.m17027c()) {
                        if (o0 != -1) {
                            this.f10030x0.m7730Z0(G0, 4, null, true);
                            return;
                        } else {
                            this.f10030x0.m7606z2(G0, 2);
                            return;
                        }
                    } else if (G9.m17026d() < G0.m17026d()) {
                        int o02 = this.f10030x0.m7808E0().m8111o0(G9);
                        if (b1 == -1 || o02 > b1) {
                            if (o0 != -1 && (o02 - o0 > 1 || (b1 != -1 && o02 > b1))) {
                                this.f10030x0.m7730Z0(G0, 4, null, true);
                                return;
                            } else if (o0 == -1) {
                                this.f10030x0.m7606z2(G0, 2);
                                return;
                            }
                        }
                    }
                }
            } else {
                this.f10030x0.m7730Z0(C9678w2.m7801G0(this.f30167b.m2188w6(), this.f10002q0, this.f9987m1, F0), 4, null, true);
                return;
            }
        }
        this.f10030x0.m7784K2(false);
    }

    public void m32404fq(boolean z) {
        this.f9990n0 = z;
    }

    public void m32403fr(ArrayList<C2104l> arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f9887E2 == null) {
                int i = C1357a0.m37541i(72.0f) + C1357a0.m37541i(2.5f);
                int i2 = C1357a0.m37541i(6.5f) + i;
                int i3 = C1357a0.m37541i(12.0f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i2 + i3);
                layoutParams.addRule(2, R.id.msg_bottom);
                layoutParams.bottomMargin = -(C1357a0.m37541i(8.0f) + i3);
                C4534a aVar = new C4534a(mo4347s());
                this.f9887E2 = aVar;
                aVar.setLayoutParams(layoutParams);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo4347s(), 0, false);
                C9691x3 x3Var = new C9691x3(this, this, linearLayoutManager, this);
                this.f9893G2 = x3Var;
                x3Var.m7584i0(arrayList);
                C2992p pVar = new C2992p(mo4347s());
                this.f9890F2 = pVar;
                pVar.setItemAnimator(null);
                this.f9890F2.setOverScrollMode(C4183a.f14083a ? 1 : 2);
                this.f9890F2.setAdapter(this.f9893G2);
                this.f9890F2.setLayoutManager(linearLayoutManager);
                this.f9890F2.setLayoutParams(FrameLayoutFix.m18008s1(-2, i2));
                this.f9887E2.addView(this.f9890F2);
                FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37541i(27.0f), i3);
                s1.topMargin = i;
                int i4 = C1357a0.m37541i(55.0f) + C1357a0.m37541i(2.5f);
                s1.leftMargin = i4;
                this.f9887E2.setPivotX(i4 + (C1357a0.m37541i(27.0f) / 2));
                this.f9887E2.setPivotY(i + i3);
                ImageView imageView = new ImageView(mo4347s());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_back_arrow);
                imageView.setColorFilter(new PorterDuffColorFilter(C11524j.m165n0(), PorterDuff.Mode.MULTIPLY));
                m9132x8(imageView, R.id.theme_color_overlayFilling);
                imageView.setLayoutParams(s1);
                this.f9887E2.addView(imageView);
            } else if (!z || !this.f9893G2.m7590c0()) {
                this.f9893G2.m7584i0(arrayList);
            } else {
                this.f9893G2.m7591a0(arrayList);
            }
            m32247rq(true);
        } else if (!z) {
            m32247rq(false);
        }
    }

    @Override
    public void mo452g2() {
        m32487Zk(false);
    }

    @Override
    public boolean mo16228g5() {
        RunnableC9558i0 i0Var = this.f10038z0;
        return i0Var == null || i0Var.getText().length() == 0;
    }

    public final void m32398gj() {
        m9341T8();
    }

    public ViewTreeObserver$OnPreDrawListenerC7081z0 m32397gk() {
        return this.f9879C0;
    }

    public boolean m32396gl() {
        TdApi.Chat chat = this.f10002q0;
        return chat != null && C7316a.m17051j(chat.f25367id);
    }

    public final C9717z3.C9720c m32393go(final long j) {
        return new C9717z3.C9720c(R.id.btn_addContact, R.string.AddContact, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                View$OnClickListenerC2971rh.this.m32668Ll(j, view);
            }
        });
    }

    public final void m32392gp(String str) {
        m32437dj();
        C9678w2 w2Var = this.f10030x0;
        TdApi.Chat chat = this.f10002q0;
        w2Var.m7780L2(chat.f25367id, this.f9987m1, null, chat.type.getConstructor() == 862366513, str);
        m32379hp(str);
    }

    public void m32391gq(boolean z, boolean z2) {
        m32378hq(z, z2, m9339Ta() || m9300Z9().m9339Ta());
    }

    public final boolean m32390gr() {
        String str;
        String str2 = this.f9905K2;
        return str2 != null && ((str = this.f9911M2) == null || !str.equals(str2));
    }

    @Override
    public void mo1556h0(final long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32433dn(j);
            }
        });
    }

    @Override
    public void mo4062h1(final long j, final TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32434dm(j, chatJoinRequestsInfo);
            }
        });
    }

    @Override
    public void mo8853h4(int i) {
        int i2 = this.f9963e1;
        if (i2 != i) {
            boolean z = true;
            boolean z2 = i2 != 0;
            boolean z3 = i != 0;
            this.f9963e1 = i;
            if (z2 != z3 && z3) {
                if (this.f9954b1 % 1.0f != 0.0f) {
                    z = false;
                }
                this.f9966f1 = z;
                if (!z) {
                    mo9397La();
                }
            }
        }
    }

    public void m32385hj() {
        this.f9934U1 = null;
        this.f9911M2 = null;
        this.f9905K2 = null;
        this.f9908L2 = null;
        this.f9998p0 &= -2;
        m32430dq(0.0f);
        this.f9937V1.m7842Z();
    }

    public boolean m32384hk() {
        return this.f9917O2;
    }

    public boolean m32383hl() {
        TdApi.Chat chat = this.f10002q0;
        return chat != null && this.f30167b.m2443g7(chat.f25367id);
    }

    public final C9717z3.C9720c m32380ho(final long j, boolean z) {
        return new C9717z3.C9720c(R.id.btn_reportChat, z ? R.string.BlockContact : R.string.ReportSpam, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                View$OnClickListenerC2971rh.this.m32643Nl(j, view);
            }
        }).m7431a();
    }

    public final void m32379hp(String str) {
        if (!(this.f9945Y0 == null || C5070i.m24067c(this.f10041z3, str))) {
            this.f10041z3 = str;
            int n = this.f9945Y0.f10068O.m21463n();
            for (int i = 0; i < n; i++) {
                i10 i10Var = (i10) this.f9945Y0.f10068O.m21462o(i);
                if (i10Var != null) {
                    i10Var.m34410Ag(str);
                }
            }
        }
    }

    public void m32378hq(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (this.f10035y1) {
            z = false;
        }
        this.f9916O1.m29575p(z, z3);
        C3940f fVar = this.f9919P1;
        if (z3 && this.f9916O1.m29584g() > 0.0f) {
            z4 = true;
        }
        fVar.m29575p(z2, z4);
        m32568Ti();
    }

    public void m32377hr(View view) {
        this.f10026w0.m14137P1(view);
    }

    @Override
    public void mo6831i1(boolean z) {
        m32548Up(4, z);
    }

    @Override
    public void mo1565i4(final long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32579Sl(j);
            }
        });
    }

    @Override
    public void mo4061i5(final long j, final String str) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32369im(j, str);
            }
        });
    }

    public final void m32372ij() {
        if (this.f10031x1) {
            this.f10031x1 = false;
            this.f30167b.m2930B4().m4716b1().m1531x(this);
        }
    }

    public boolean m32370il() {
        return this.f9959c3;
    }

    public final C9717z3.C9720c m32367io(final long j) {
        return new C9717z3.C9720c(R.id.btn_unarchiveChat, R.string.UnarchiveUnmute, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                View$OnClickListenerC2971rh.this.m32631Ol(j, view);
            }
        });
    }

    public void m32366ip(AbstractC4761s4 s4Var, float f, float f2) {
        C6035e<AbstractC4761s4> eVar;
        C6035e<AbstractC4761s4> eVar2;
        C5323f fVar = new C5323f(s4Var.m25958d4());
        s4Var.m26094P3(fVar);
        int size = fVar.size();
        boolean O5 = s4Var.m26102O5();
        Iterator<Long> it = fVar.iterator();
        boolean z = false;
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if ((!O5 ? (eVar = this.f9880C1) == null || eVar.m21505f(longValue) == null : !((eVar2 = this.f9880C1) == null || eVar2.m21505f(longValue) == null)) && m32211un(longValue, s4Var, f, f2, false, size)) {
                z = true;
            }
        }
        if (!z) {
            int yk = m32162yk();
            if (yk == 0) {
                m9307Y8();
                return;
            }
            m9402Kd(yk);
        }
        m32754Er();
    }

    public final void m32365iq(float f) {
        if (this.f10001p3 != f) {
            this.f10001p3 = f;
            this.f9977i3.setAlpha(this.f10029w3 * f);
            float f2 = (f * 0.4f) + 0.6f;
            this.f9977i3.setScaleX(f2);
            this.f9977i3.setScaleY(f2);
        }
    }

    public void m32364ir(long j) {
        this.f30167b.m2781K9().m1870d0(j, this);
        this.f30167b.m2781K9().m1842k0(this);
        if (mo9464C9() == j) {
            switch (this.f10002q0.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1654d2(((TdApi.ChatTypeSupergroup) this.f10002q0.type).supergroupId, this);
                    return;
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1646f2(C4779t2.m25465n2(this.f10002q0), this);
                    this.f30167b.m2480e2().m1658c2(C4779t2.m25549b2(this.f10002q0), this);
                    return;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1662b2(((TdApi.ChatTypeBasicGroup) this.f10002q0.type).basicGroupId, this);
                    return;
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1646f2(C4779t2.m25465n2(this.f10002q0), this);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        AbstractView$OnTouchListenerC7889a s = mo4347s();
        if (s.m14529V0().m6909c0()) {
            s.m14529V0().m6926U(true);
            return true;
        } else if (this.f9959c3) {
            mo8407M6();
            return true;
        } else if (m32774Dk()) {
            if (m32461bl()) {
                m9185pe(C4403w.m27869i1(R.string.DiscardEditCaptionHint), C4403w.m27869i1(R.string.DiscardEditCaption), null);
            } else {
                m9185pe(C4403w.m27869i1(R.string.DiscardEditMsgHint), C4403w.m27869i1(R.string.DiscardEditMsg), null);
            }
            return true;
        } else if (z) {
            return false;
        } else {
            if (this.f9914N2) {
                this.f9917O2 = false;
                m32267qj();
                return true;
            } else if (!this.f9992n2) {
                return false;
            } else {
                this.f9996o2 = false;
                m32306nj(true);
                return true;
            }
        }
    }

    public final void m32359jj() {
        this.f10020u2 = 0L;
        this.f10024v2 = null;
    }

    public int m32358jk() {
        return this.f9882D0.getVisibleChildrenWidth();
    }

    public final void m32357jl() {
        if (this.f9995o1 != null) {
            this.f30167b.m2270r4().m14783o(new TdApi.JoinChatByInviteLink(this.f9995o1.f10072a), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2971rh.this.m32773Dl(object);
                }
            });
        } else {
            this.f30167b.m2270r4().m14783o(new TdApi.AddChatMember(this.f10002q0.f25367id, this.f30167b.m2519ba(), 0), this.f30167b.m2392ja());
        }
    }

    public final boolean m32354jo(boolean z) {
        if (!m32255ri()) {
            return false;
        }
        String str = this.f9911M2;
        if (str != null) {
            boolean equals = str.equals(this.f9905K2);
            this.f9911M2 = null;
            return !equals;
        }
        if (z) {
            this.f9905K2 = null;
            this.f9911M2 = null;
            if (this.f9982k2 == null && this.f9934U1 == null) {
                m32202vj();
            }
        }
        return true;
    }

    public void m32353jp(long j, AbstractC4761s4 s4Var, float f, float f2) {
        m32211un(j, s4Var, f, f2, true, -1);
    }

    public final void m32352jq(boolean z, boolean z2) {
        if (this.f9997o3 != z || !z2) {
            this.f9997o3 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f10005q3 == null) {
                    this.f10005q3 = new C3950k(10, this, C2057b.f7280b, 90L, this.f10001p3);
                }
                this.f10005q3.m29544i(f);
                return;
            }
            C3950k kVar = this.f10005q3;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m32365iq(f);
        }
    }

    public void m32351jr(TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline) {
        C4729p pVar = this.f9881C2;
        if (pVar != null) {
            TdApi.Chat U2 = this.f30167b.m2632U2(pVar.m26313Z());
            TdApi.User v2 = this.f30167b.m2480e2().m1583v2(this.f9881C2.m26311b0());
            if (U2 != null && v2 != null) {
                this.f30167b.m2485dd().m3881C4(this, U2, new HandlerC10770jj.C10780j().m3358r(new C4609c7(v2.username, inlineKeyboardButtonTypeSwitchInline.query)));
            }
        }
    }

    @Override
    public void mo8849k2(int i) {
        if ((this.f9948Z0.getCurrentItem() != 0 || !C1379j0.m37307r(mo4347s()).m14529V0().m6909c0()) && this.f9948Z0.getCurrentItem() != i) {
            this.f9951a1.getTopView().m10156W1(this.f9948Z0.getCurrentItem(), i);
            this.f9948Z0.mo18027N(i, true);
        }
    }

    @Override
    public void mo9222kc() {
        if (!m32432do()) {
            m32431dp();
        }
        super.mo9222kc();
        this.f10026w0.m39496D1();
        if (this.f9969g1) {
            this.f9969g1 = false;
        } else {
            mo9397La();
        }
        m32298nr();
        this.f10030x0.m7739W2(false);
    }

    public final void m32346kj() {
        this.f10039z1 = null;
        this.f9877B1 = null;
    }

    public View$OnClickListenerC9694y.AbstractC9704j m32345kk() {
        if (m32671Li()) {
            return this.f10038z0;
        }
        return null;
    }

    public void m32344kl(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(i * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        m32318ml((int) (calendar.getTimeInMillis() / 1000));
    }

    public long m32341ko() {
        TdApi.Message message = this.f9934U1;
        if (message != null) {
            long j = message.f25406id;
            if (j != 0 && (this.f9998p0 & 1) == 0) {
                m32215uj(true);
                return j;
            }
        }
        return 0L;
    }

    public final boolean m32211un(final long r15, final gd.AbstractC4761s4 r17, final float r18, final float r19, final boolean r20, final int r21) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2971rh.m32211un(long, gd.s4, float, float, boolean, int):boolean");
    }

    public final void m32339kq(float f) {
        if (this.f9971g3 != null) {
            if (this.f10029w3 != f) {
                this.f10029w3 = f;
                this.f9980j3.setAlpha(f);
                this.f9977i3.setAlpha(this.f10001p3 * f);
                m32780Cr();
            }
            boolean eo = m32419eo();
            this.f9974h3.setRevealFactor(eo ? 1.0f : f);
            this.f9971g3.setTranslationY(eo ? C1357a0.m37541i(49.0f) * (1.0f - f) : 0.0f);
            if (eo) {
                m32450cj();
            }
        }
    }

    public void m32338kr(long j, TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null) {
            TdApi.User v2 = j != 0 ? this.f30167b.m2480e2().m1583v2(j) : this.f30167b.m2525b4(chat);
            if (v2 != null && !C5070i.m24061i(v2.username)) {
                String str = v2.username;
                if (!inlineKeyboardButtonTypeSwitchInline.inCurrentChat || !m32671Li() || !m32761Ek()) {
                    this.f30167b.m2485dd().m3697U8(this, str, inlineKeyboardButtonTypeSwitchInline.query, false);
                    return;
                }
                RunnableC9558i0 i0Var = this.f10038z0;
                if (i0Var != null) {
                    i0Var.m8249v0("@" + v2.username + " " + inlineKeyboardButtonTypeSwitchInline.query, true);
                }
            }
        }
    }

    @Override
    public void mo8377l1() {
        m32359jj();
        m32293oj(true, false);
        m32207ur(R.drawable.deproko_baseline_bots_command_26);
        long j = this.f10000p2;
        if (j != 0) {
            this.f10034y0.m21831s(j);
        }
    }

    @Override
    public long mo7582l3() {
        return mo9464C9();
    }

    @Override
    public void mo3247l4(final long j, final TdApi.ChatNotificationSettings chatNotificationSettings) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32630Om(j, chatNotificationSettings);
            }
        });
    }

    @Override
    public void mo4080l7(final long j) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32785Cm(j);
            }
        });
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    @Override
    public void mo9216lc() {
        super.mo9216lc();
        m32176xj(false);
    }

    public final void m32333lj() {
        synchronized (this) {
            C6035e<AbstractC4761s4> eVar = this.f9880C1;
            if (eVar != null) {
                eVar.m21509b();
            }
        }
    }

    public int m32332lk(boolean z) {
        if (this.f10022v0.getVisibility() == 8) {
            return 0;
        }
        int measuredHeight = this.f10022v0.getMeasuredHeight();
        return !z ? (int) (measuredHeight + m32201vk()) : measuredHeight;
    }

    public final void m32331ll() {
        AbstractC4761s4 z0;
        long i3 = this.f10030x0.m7608z0() != null ? z0.m25911i3() * 1000 : System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 2013);
        calendar.set(2, 7);
        calendar.set(5, 14);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long O0 = this.f10030x0.m7770O0();
        long currentTimeMillis = System.currentTimeMillis();
        long j = O0 == -1 ? timeInMillis : O0 * 1000;
        calendar.setTimeInMillis(Math.max(j, Math.min(currentTimeMillis, i3)));
        DatePickerDialog datePickerDialog = new DatePickerDialog(mo4347s(), C11524j.m150v(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i4) {
                View$OnClickListenerC2971rh.this.m32760El(datePicker, i, i2, i4);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.setButton(-3, C4403w.m27869i1(R.string.Beginning), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC2971rh.this.m32747Fl(dialogInterface, i);
            }
        });
        datePickerDialog.getDatePicker().setMaxDate(currentTimeMillis);
        try {
            datePickerDialog.getDatePicker().setMinDate(j);
        } catch (Throwable unused) {
            if (j != timeInMillis) {
                try {
                    datePickerDialog.getDatePicker().setMinDate(timeInMillis);
                } catch (Throwable unused2) {
                }
            }
        }
        C10192g.m5780k(datePickerDialog);
    }

    public boolean m32328lo() {
        return this.f30167b.m2431h3(mo9464C9());
    }

    public final void m32327lp() {
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (eVar != null && eVar.m21496p() == 2) {
            long j = this.f9880C1.m21501j(0);
            long j2 = this.f9880C1.m21501j(1);
            int n0 = this.f10030x0.m7808E0().m8112n0(j);
            int n02 = this.f10030x0.m7808E0().m8112n0(j2);
            if (!(n0 == -1 || n02 == -1)) {
                C5322e eVar2 = new C5322e(10);
                int i = 0;
                for (int i2 = n02; i2 <= n0; i2++) {
                    AbstractC4761s4 j0 = this.f10030x0.m7808E0().m8116j0(i2);
                    if (j0.m25847p0()) {
                        j0.m26104O3(eVar2, j, j2);
                        int l = eVar2.m23264l();
                        for (int i3 = 0; i3 < l; i3++) {
                            long f = eVar2.m23270f(i3);
                            j0.m25838p9(f, true, true, -1.0f, -1.0f, null);
                            m32589Ro(f, j0);
                        }
                        i += l;
                        eVar2.m23273c();
                    }
                }
                if (i > 0) {
                    m32754Er();
                    m9402Kd(this.f9880C1.m21496p());
                }
            }
        }
    }

    public final void m32326lq(float f) {
        if (this.f10025v3 != f) {
            this.f10025v3 = f;
            m32780Cr();
        }
    }

    public final void m32325lr() {
        if (this.f9992n2) {
            m32306nj(true);
        } else {
            m32809Ao(true);
        }
    }

    @Override
    public void mo4060m0(final long j, int i, boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32343km(j);
            }
        });
    }

    @Override
    public void mo9208mc(Configuration configuration) {
        super.mo9208mc(configuration);
        this.f10030x0.m7638s2();
        if (this.f9879C0 != null) {
            this.f9917O2 = false;
            if (this.f9914N2) {
                m32267qj();
            }
            this.f9879C0.m17831x2();
        }
        if (this.f10012s2 != null) {
            this.f9996o2 = false;
            if (this.f9992n2) {
                m32306nj(false);
            }
        }
    }

    public final void m32320mj() {
        this.f9881C2 = null;
    }

    public ViewTreeObserver$OnPreDrawListenerC9542g m32319mk() {
        return this.f10012s2;
    }

    public void m32318ml(int i) {
        if (i == 0) {
            this.f10009r3 = null;
            m32313mq(false, true);
            this.f10030x0.m7730Z0(new C7319d(mo9464C9(), 9L), 1, null, true);
            return;
        }
        final TdApi.GetChatMessageByDate getChatMessageByDate = new TdApi.GetChatMessageByDate(mo9464C9(), 0);
        this.f10009r3 = getChatMessageByDate;
        getChatMessageByDate.date = i;
        m32313mq(true, true);
        this.f30167b.m2270r4().m14783o(getChatMessageByDate, new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2971rh.this.m32720Hl(getChatMessageByDate, object);
            }
        });
    }

    public void m32315mo(String str, int i, int i2) {
        this.f10033x3 = i;
        this.f10037y3 = i2;
        this.f9983k3.setEnabled(i < i2);
        this.f9986l3.setEnabled(i > 0);
        this.f9989m3.setText(str);
        m32313mq(false, true);
        m32780Cr();
    }

    public final TdApi.Message[] m32314mp() {
        int p;
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (eVar == null || (p = eVar.m21496p()) == 0) {
            return null;
        }
        TdApi.Message[] messageArr = new TdApi.Message[p];
        for (int i = 0; i < p; i++) {
            messageArr[i] = this.f9880C1.m21495q(i).m25984a4(this.f9880C1.m21501j(i));
        }
        return messageArr;
    }

    public final boolean m32313mq(boolean z, boolean z2) {
        boolean z3 = this.f10017t3;
        if (z3 == z && z2) {
            return false;
        }
        this.f10017t3 = z;
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            if (this.f10021u3 == null) {
                this.f10021u3 = new C3950k(11, this, C2057b.f7280b, 90L, this.f10025v3);
            }
            this.f10021u3.m29544i(f);
        } else {
            C3950k kVar = this.f10021u3;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m32326lq(f);
        }
        return z3 != z;
    }

    public final void m32312mr() {
        if (this.f9914N2) {
            m32267qj();
        } else {
            m32796Bo();
        }
    }

    @Override
    public TdApi.ChatList mo32311n3(View$OnClickListenerC2280d6 d6Var) {
        return this.f10006r0;
    }

    public final void m32306nj(boolean z) {
        m32293oj(false, z);
    }

    public C9678w2 m32305nk() {
        return this.f10030x0;
    }

    public void m32301no() {
        if (m32313mq(true, true)) {
            this.f10037y3 = -1;
            this.f10033x3 = -1;
        }
    }

    public void m32300np(final TdApi.InputMessageContent inputMessageContent, final boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, final AbstractC5918j<TdApi.Message> jVar) {
        if (m32761Ek()) {
            m32665Lo(z2, messageSchedulingState, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z3, TdApi.MessageSchedulingState messageSchedulingState2, boolean z4) {
                    View$OnClickListenerC2971rh.this.m32198vn(z, inputMessageContent, jVar, z3, messageSchedulingState2, z4);
                }
            });
        }
    }

    public final void m32299nq(float f) {
        if (this.f9929S2 != f) {
            this.f9929S2 = f;
            float f2 = f * 0.5f;
            float f3 = 0.5f + f2;
            this.f9891G0.setAlpha(f);
            this.f9891G0.setScaleX(f3);
            this.f9891G0.setScaleY(f3);
            float f4 = 1.0f - f2;
            this.f9882D0.setAlpha(1.0f - f);
            this.f9882D0.setScaleX(f4);
            this.f9882D0.setScaleY(f4);
            C9357x2.C9370l lVar = this.f10023v1;
            if (lVar != null && lVar.m8913L()) {
                this.f10023v1.m8904U();
            }
        }
    }

    public final void m32298nr() {
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public boolean mo7581o5(final View view, final C2104l lVar, final boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        if ((this.f9920P2 != 0 && SystemClock.uptimeMillis() - this.f9920P2 < 200) || m32560Tq(view)) {
            return false;
        }
        m32665Lo(z, messageSchedulingState, new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState2, boolean z3) {
                View$OnClickListenerC2971rh.this.m32446cn(view, lVar, z, z2, messageSchedulingState2, z3);
            }
        });
        return true;
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        m32595Ri();
        m32576So();
        this.f10030x0.m7732Y2(false);
        if (this.f9876B0) {
            C1379j0.m37363F0(this, 200L);
        }
    }

    @Override
    public View mo403oc(Context context) {
        int i = 1;
        this.f9953a3 = true;
        if (!m9332Ua()) {
            C1379j0.m37318l0(C1379j0.m37307r(context), 18);
        }
        C9597l1 l1Var = new C9597l1(context);
        this.f10018u0 = l1Var;
        l1Var.setController(this);
        this.f10018u0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C9534f fVar = new C9534f(context, this.f30167b, this);
        this.f10010s0 = fVar;
        fVar.setPhotoOpenCallback(this);
        int i2 = this.f9975i1;
        if (i2 == 3) {
            this.f10010s0.setForcedSubtitle(C4403w.m27909Z1(C4403w.m27869i1(R.string.EventLogAllEvents)));
        } else if (i2 != 4) {
            if (i2 == 5) {
                C9289s sVar = new C9289s(context);
                this.f10014t0 = sVar;
                sVar.setThemedTextColor(this);
                this.f10014t0.m9632D1(C1357a0.m37541i(12.0f), true);
                this.f10014t0.setTitle(mo9313X9());
                if (((C2977c0) m9139w9()).f10064q.document != null) {
                    this.f10014t0.setSubtitle(C1363c0.m37423m(((C2977c0) m9139w9()).f10064q.document.document.size));
                } else if (((C2977c0) m9139w9()).f10064q.type.getConstructor() == 1290213117) {
                    this.f10014t0.setSubtitle(C4403w.m27869i1(R.string.ChatBackgroundTypePattern));
                } else if (((C2977c0) m9139w9()).f10064q.type.getConstructor() == 993008684) {
                    TdApi.BackgroundTypeFill backgroundTypeFill = (TdApi.BackgroundTypeFill) ((C2977c0) m9139w9()).f10064q.type;
                    int constructor = backgroundTypeFill.fill.getConstructor();
                    if (constructor == -1839206017) {
                        this.f10014t0.setSubtitle(C4403w.m27869i1(R.string.ChatBackgroundTypeGradient));
                    } else if (constructor == -1145469255) {
                        this.f10014t0.setSubtitle(C4403w.m27869i1(R.string.ChatBackgroundTypeMulticolor));
                    } else if (constructor == 1010678813) {
                        this.f10014t0.setSubtitle(C4403w.m27869i1(R.string.ChatBackgroundTypeSolid));
                    } else {
                        throw new UnsupportedOperationException(backgroundTypeFill.fill.toString());
                    }
                }
            }
            if (this.f9991n1) {
                this.f10010s0.setForcedSubtitle(C4403w.m27909Z1(C4403w.m27869i1(m32383hl() ? R.string.Reminders : R.string.ScheduledMessages)));
            } else {
                this.f10010s0.setCallback(this);
            }
        } else if (this.f9981k1 == null && this.f9984l1 == null) {
            this.f10010s0.setForcedSubtitle(C4403w.m27865j1(R.string.FoundMessagesQuery, this.f9978j1));
            this.f10010s0.setCallback(this);
        } else {
            m32767Dr();
        }
        this.f10010s0.m9815q1(this, true);
        C9620n4 n4Var = new C9620n4(context, this.f10030x0, this.f30167b);
        this.f9936V0 = n4Var;
        int i3 = this.f9975i1;
        if (i3 == 5) {
            n4Var.m8003i(new C11520h(this.f30167b, ((C2977c0) m9139w9()).f10064q));
        } else {
            n4Var.m8002j(i3 == 1);
        }
        this.f9936V0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        m9163t8(this.f9936V0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, R.id.msg_bottom);
        MessagesLayoutManager messagesLayoutManager = new MessagesLayoutManager(context, 1, true);
        messagesLayoutManager.m14147L2(this.f10030x0);
        this.f10026w0 = (MessagesRecyclerView) C1399s0.m37146y(mo4347s(), R.layout.recycler_messages, this.f10018u0);
        if (m9332Ua()) {
            this.f10026w0.setVerticalScrollBarEnabled(false);
        }
        m9163t8(this.f10026w0);
        this.f10026w0.setId(R.id.msg_list);
        this.f10026w0.setManager(this.f10030x0);
        this.f10026w0.setController(this);
        this.f10026w0.setHasFixedSize(true);
        this.f10026w0.setLayoutManager(messagesLayoutManager);
        this.f10026w0.setLayoutParams(layoutParams);
        C1399s0.m37171l0(this.f10026w0);
        this.f10030x0.m7746U1(context, this.f10026w0, messagesLayoutManager);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        C2987k kVar = new C2987k(context);
        this.f10022v0 = kVar;
        kVar.setId(R.id.msg_bottom);
        this.f10022v0.setOrientation(1);
        this.f10022v0.setMinimumHeight(C1357a0.m37541i(49.0f));
        this.f10022v0.setLayoutParams(layoutParams2);
        if (this.f9975i1 == 0 && !m9332Ua()) {
            C2997u uVar = new C2997u(context, this.f30167b);
            this.f10038z0 = uVar;
            uVar.setIsSecret(C4868i.m24726c2().m24741a3(this.f10002q0));
            this.f10038z0.setId(R.id.msg_input);
            this.f10038z0.setTextColor(C11524j.m217S0());
            m9140w8(this.f10038z0.getPlaceholderPaint(), R.id.theme_color_textPlaceholder);
            m9119z8(this.f10038z0, R.id.theme_color_text);
            this.f10038z0.setHintTextColor(C11524j.m207X0());
            m9170s8(this.f10038z0, R.id.theme_color_textPlaceholder);
            this.f10038z0.setLinkTextColor(C11524j.m211V0());
            m9156u8(this.f10038z0, R.id.theme_color_textLink);
            C10192g.m5782i(this.f10038z0, R.id.theme_color_filling, this);
            this.f10038z0.setHighlightColor(C11524j.m252B());
            m9178r8(this.f10038z0, R.id.theme_color_textSelectionHighlight);
            m9361Q8(this.f10038z0.m8251u0(this));
            if (this.f9972h1) {
                this.f10038z0.setEnabled(false);
                this.f10038z0.m8247w0(R.string.Message, new Object[0]);
            }
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, C1357a0.m37541i(48.0f));
        layoutParams3.addRule(6, R.id.msg_bottom);
        View$OnClickListenerC9659t3 t3Var = new View$OnClickListenerC9659t3(mo4347s(), this.f30167b);
        this.f9937V1 = t3Var;
        C10192g.m5782i(t3Var, R.id.theme_color_filling, this);
        this.f9937V1.setId(R.id.msg_bottomReply);
        this.f9937V1.m7847C1(this, this);
        this.f9937V1.setOnClickListener(this);
        this.f9937V1.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams4.addRule(10);
        layoutParams4.addRule(6, R.id.msg_bottom);
        C6910i0 i0Var = new C6910i0(context);
        this.f9940W1 = i0Var;
        i0Var.setLayoutParams(layoutParams4);
        this.f9940W1.setTotalHeightChangeListener(new C6910i0.AbstractC6914d() {
            @Override
            public final void mo18472a(C6910i0 i0Var2) {
                View$OnClickListenerC2971rh.this.m32264qm(i0Var2);
            }
        });
        int i4 = C1357a0.m37541i(36.0f);
        C2998v vVar = new C2998v(context);
        this.f10040z2 = vVar;
        vVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, i4));
        m9163t8(this.f10040z2);
        int i5 = C1357a0.m37541i(36.0f);
        C9717z3 z3Var = new C9717z3(context);
        this.f9943X1 = z3Var;
        z3Var.setDismissListener(new C9717z3.AbstractC9719b() {
            @Override
            public final void mo7432a(C9717z3 z3Var2) {
                View$OnClickListenerC2971rh.this.m32251rm(z3Var2);
            }
        });
        this.f9943X1.setLayoutParams(new FrameLayout.LayoutParams(-1, i5));
        this.f9943X1.m7434D1(this);
        int i6 = C1357a0.m37541i(48.0f);
        C9615n0 n0Var = new C9615n0(context, this.f30167b);
        this.f9961d2 = n0Var;
        n0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, i6));
        this.f9961d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                View$OnClickListenerC2971rh.this.m32238sm(view);
            }
        });
        this.f9961d2.setOnDismissRunnable(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32225tm();
            }
        });
        this.f30167b.m2294pc().m4127d(this);
        C10189d.m5796h(this.f9961d2, this);
        C1399s0.m37193a0(this.f9961d2);
        this.f9949Z1 = new C6973n0(context, this.f30167b);
        this.f9952a2 = new C2999w();
        this.f9949Z1.setTextSize(15.0f);
        m9126y8(this.f9949Z1);
        C10192g.m5782i(this.f9949Z1, R.id.theme_color_filling, this);
        this.f9949Z1.setTextColorId(R.id.theme_color_text);
        this.f9949Z1.setPadding(C1357a0.m37541i(16.0f), C1357a0.m37541i(8.0f), C1357a0.m37541i(16.0f), C1357a0.m37541i(8.0f));
        this.f9949Z1.setHeightChangeListener(new C6973n0.AbstractC6975b() {
            @Override
            public final void mo18232a(C6973n0 n0Var2, int i7) {
                View$OnClickListenerC2971rh.this.m32212um(n0Var2, i7);
            }
        });
        C3000x xVar = new C3000x(context);
        this.f9955b2 = xVar;
        xVar.setAnimationsDisabled(true);
        this.f9955b2.m8040r(this);
        this.f9955b2.setMessageListener(new C3001y(context));
        C3002z zVar = new C3002z();
        this.f9958c2 = zVar;
        C6910i0 i0Var2 = this.f9940W1;
        C6910i0.C6915e eVar = new C6910i0.C6915e(this.f9961d2, i6);
        this.f9964e2 = eVar;
        C6910i0.C6915e eVar2 = new C6910i0.C6915e(this.f10040z2, i4);
        this.f9874A2 = eVar2;
        C6910i0.C6915e eVar3 = new C6910i0.C6915e(this.f9943X1, i5);
        this.f9946Y1 = eVar3;
        i0Var2.m18480I1(new C6910i0.AbstractC6913c[]{zVar, eVar, eVar2, eVar3, this.f9952a2}, this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(C1357a0.m37541i(118.0f), C1357a0.m37541i(74.0f));
        layoutParams5.addRule(11);
        layoutParams5.addRule(2, R.id.msg_bottom);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f9918P0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(layoutParams5);
        m32469aq(0.0f);
        int i7 = C1357a0.m37541i(4.0f);
        int i8 = i7 * 2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1((C1357a0.m37541i(24.0f) * 2) + i8, (C1357a0.m37541i(24.0f) * 2) + i8, 85);
        int i9 = C1357a0.m37541i(16.0f) - i7;
        layoutParams5.bottomMargin = i9;
        layoutParams5.rightMargin = i9;
        C6851c0 c0Var = new C6851c0(context);
        this.f9924R0 = c0Var;
        c0Var.setId(R.id.btn_mention);
        this.f9924R0.setOnClickListener(this);
        this.f9924R0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean vm;
                vm = View$OnClickListenerC2971rh.this.m32199vm(view);
                return vm;
            }
        });
        m9163t8(this.f9924R0);
        this.f9924R0.m18789d(R.drawable.baseline_alternate_email_24, 48.0f, 4.0f, R.id.theme_color_circleButtonChat, R.id.theme_color_circleButtonChatIcon);
        this.f9924R0.setLayoutParams(t1);
        this.f9918P0.addView(this.f9924R0);
        int i10 = C1357a0.m37541i(24.0f);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(t1.width + i10, -2, 85);
        t12.bottomMargin = (C1357a0.m37541i(24.0f) * 2) - (C1357a0.m37541i(28.0f) / 2);
        C9549h hVar = new C9549h(context);
        this.f9930T0 = hVar;
        hVar.setLayoutParams(t12);
        this.f9930T0.setPadding(i10, 0, 0, 0);
        m9163t8(this.f9930T0);
        this.f9918P0.addView(this.f9930T0);
        this.f9924R0.setTag(this.f9930T0);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(C1357a0.m37541i(118.0f), C1357a0.m37541i(74.0f));
        layoutParams6.addRule(11);
        layoutParams6.addRule(2, R.id.msg_bottom);
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        this.f9915O0 = frameLayoutFix2;
        frameLayoutFix2.setLayoutParams(layoutParams6);
        this.f9915O0.setAlpha(0.0f);
        if (m9332Ua()) {
            this.f9915O0.setTranslationY((-C1357a0.m37541i(16.0f)) + C1357a0.m37541i(4.0f));
        }
        FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1((C1357a0.m37541i(24.0f) * 2) + i8, (C1357a0.m37541i(24.0f) * 2) + i8, 85);
        int i11 = C1357a0.m37541i(16.0f) - i7;
        layoutParams6.bottomMargin = i11;
        layoutParams6.rightMargin = i11;
        C6851c0 c0Var2 = new C6851c0(mo4347s());
        this.f9921Q0 = c0Var2;
        c0Var2.setId(R.id.btn_scroll);
        this.f9921Q0.setOnClickListener(this);
        this.f9921Q0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean pm;
                pm = View$OnClickListenerC2971rh.this.m32277pm(view);
                return pm;
            }
        });
        m9163t8(this.f9921Q0);
        this.f9921Q0.m18789d(R.drawable.baseline_arrow_downward_24, 48.0f, 4.0f, R.id.theme_color_circleButtonChat, R.id.theme_color_circleButtonChatIcon);
        this.f9921Q0.setLayoutParams(t13);
        this.f9915O0.addView(this.f9921Q0);
        FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(t13.width + i10, -2, 85);
        t14.bottomMargin = (C1357a0.m37541i(24.0f) * 2) - (C1357a0.m37541i(28.0f) / 2);
        C9549h hVar2 = new C9549h(context);
        this.f9927S0 = hVar2;
        hVar2.setPadding(i10, 0, 0, 0);
        this.f9927S0.setLayoutParams(t14);
        m9163t8(this.f9927S0);
        this.f9915O0.addView(this.f9927S0);
        this.f9921Q0.setTag(this.f9927S0);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, C1357a0.m37541i(1.0f));
        layoutParams7.addRule(2, R.id.msg_bottom);
        C6862d3 e = C6862d3.m18733e(context, layoutParams7, false);
        this.f9872A0 = e;
        e.m18737a();
        m9163t8(this.f9872A0);
        this.f9872A0.setId(R.id.msg_bottomShadow);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(C1357a0.m37541i(55.0f), C1357a0.m37541i(49.0f));
        layoutParams8.addRule(10);
        if (C4403w.m27984G2()) {
            layoutParams8.addRule(11);
        } else {
            layoutParams8.addRule(9);
        }
        ImageView imageView = new ImageView(context);
        this.f9885E0 = imageView;
        imageView.setId(R.id.msg_emoji);
        this.f9885E0.setScaleType(ImageView.ScaleType.CENTER);
        this.f9885E0.setImageResource(ViewTreeObserver$OnPreDrawListenerC7081z0.m17853W1(true));
        this.f9885E0.setColorFilter(C11524j.m159q0());
        m9184q8(this.f9885E0, R.id.theme_color_icon);
        this.f9885E0.setOnClickListener(this);
        this.f9885E0.setLayoutParams(layoutParams8);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, C1357a0.m37541i(49.0f));
        layoutParams9.addRule(10);
        if (C4403w.m27984G2()) {
            layoutParams9.addRule(9);
        } else {
            layoutParams9.addRule(11);
        }
        C2973a0 a0Var = new C2973a0(context);
        this.f9882D0 = a0Var;
        a0Var.setOrientation(0);
        this.f9882D0.setLayoutParams(layoutParams9);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(C1357a0.m37541i(47.0f), C1357a0.m37541i(49.0f));
        C4023a aVar = new C4023a(context, this);
        aVar.setId(R.id.msg_attach);
        aVar.setScaleType(ImageView.ScaleType.CENTER);
        aVar.setImageResource(R.drawable.deproko_baseline_attach_26);
        aVar.setColorFilter(C11524j.m159q0());
        m9184q8(aVar, R.id.theme_color_icon);
        aVar.setOnClickListener(this);
        aVar.setLayoutParams(layoutParams10);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(C1357a0.m37541i(47.0f), C1357a0.m37541i(49.0f));
        C4023a aVar2 = new C4023a(context, this);
        this.f9897I0 = aVar2;
        aVar2.setId(R.id.btn_camera);
        this.f9897I0.setScaleType(ImageView.ScaleType.CENTER);
        this.f9897I0.setImageResource(R.drawable.deproko_baseline_camera_26);
        this.f9897I0.setColorFilter(C11524j.m159q0());
        m9184q8(this.f9897I0, R.id.theme_color_icon);
        this.f9897I0.setOnClickListener(this);
        this.f9897I0.setLayoutParams(layoutParams11);
        if (!this.f9991n1) {
            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(C1357a0.m37541i(47.0f), C1357a0.m37541i(49.0f));
            C4023a aVar3 = new C4023a(context, this);
            this.f9900J0 = aVar3;
            aVar3.setId(R.id.btn_viewScheduled);
            this.f9900J0.setScaleType(ImageView.ScaleType.CENTER);
            this.f9900J0.setImageResource(R.drawable.baseline_date_range_24);
            this.f9900J0.setColorFilter(C11524j.m159q0());
            m9184q8(this.f9900J0, R.id.theme_color_icon);
            this.f9900J0.setOnClickListener(this);
            this.f9900J0.setLayoutParams(layoutParams12);
        }
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(C1357a0.m37541i(47.0f), C1357a0.m37541i(49.0f));
        C9585k0 k0Var = new C9585k0(context);
        this.f9903K0 = k0Var;
        k0Var.setId(R.id.msg_command);
        this.f9903K0.setColorFilter(C11524j.m159q0());
        m9184q8(this.f9903K0, R.id.theme_color_icon);
        this.f9903K0.setScaleType(ImageView.ScaleType.CENTER);
        this.f9903K0.setOnClickListener(this);
        this.f9903K0.setVisibility(4);
        this.f9903K0.setLayoutParams(layoutParams13);
        C1399s0.m37193a0(this.f9903K0);
        m32207ur(0);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(C1357a0.m37541i(47.0f), C1357a0.m37541i(49.0f));
        layoutParams14.rightMargin = C1357a0.m37541i(2.0f);
        C9540f4 f4Var = new C9540f4(context);
        this.f9888F0 = f4Var;
        f4Var.setPadding(0, 0, C1357a0.m37541i(2.0f), 0);
        this.f9888F0.setHasTouchControls(true);
        m9163t8(this.f9888F0);
        this.f9888F0.setLayoutParams(layoutParams14);
        this.f9882D0.addView(this.f9903K0);
        C9686w3 w3Var = this.f9906L0;
        if (w3Var != null) {
            this.f9882D0.addView(w3Var);
        }
        C9585k0 k0Var2 = this.f9900J0;
        if (k0Var2 != null) {
            this.f9882D0.addView(k0Var2);
        }
        C9585k0 k0Var3 = this.f9897I0;
        if (k0Var3 != null) {
            this.f9882D0.addView(k0Var3);
        }
        this.f9882D0.addView(aVar);
        this.f9882D0.addView(this.f9888F0);
        this.f9882D0.m8496a();
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(C1357a0.m37541i(55.0f), C1357a0.m37541i(49.0f));
        layoutParams15.addRule(10);
        if (C4403w.m27984G2()) {
            layoutParams15.addRule(9);
        } else {
            layoutParams15.addRule(11);
        }
        C6855c3 c3Var = new C6855c3(context, this.f9991n1 ? R.drawable.baseline_schedule_24 : R.drawable.deproko_baseline_send_24);
        this.f9891G0 = c3Var;
        c3Var.setOnClickListener(this);
        m9163t8(this.f9891G0);
        this.f9891G0.setId(R.id.msg_send);
        this.f9891G0.setVisibility(4);
        this.f9891G0.setAlpha(0.0f);
        this.f9891G0.setLayoutParams(layoutParams15);
        this.f9894H0 = new View$OnTouchListenerC5103c0(this, this, m9471Ba(), null).m23956d(this.f9891G0);
        if (this.f9972h1) {
            int i12 = this.f9975i1;
            if (i12 == 0) {
                this.f10022v0.addView(this.f10038z0);
            } else if (i12 == 1) {
                C9606l4 l4Var = new C9606l4(context);
                this.f9939W0 = l4Var;
                l4Var.setLayoutManager(new LinearLayoutManager(context, 0, C4403w.m27984G2()));
                this.f9939W0.setAdapter(new View$OnClickListenerC9592k4(this, C11541z.m7t().m19j(false).mo96a()));
                this.f9939W0.m39434g(new C2975b0());
                this.f9939W0.setLayoutParams(new LinearLayout.LayoutParams(-1, C1357a0.m37541i(105.0f) + (C1357a0.m37541i(3.0f) * 2)));
                C10192g.m5782i(this.f9939W0, R.id.theme_color_filling, this);
                this.f10022v0.addView(this.f9939W0);
            } else if (i12 == 2) {
                FrameLayoutFix frameLayoutFix3 = new FrameLayoutFix(context);
                frameLayoutFix3.setLayoutParams(new LinearLayout.LayoutParams(-1, C1357a0.m37541i(49.0f)));
                C10192g.m5782i(frameLayoutFix3, R.id.theme_color_filling, this);
                C6847b2 b2Var = new C6847b2(context);
                b2Var.setTextSize(1, 12.0f);
                b2Var.setText("T");
                b2Var.setTypeface(C1389o.m37262g());
                b2Var.setTextColor(C11524j.m213U0());
                m9480A8(b2Var);
                b2Var.setGravity(17);
                b2Var.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(46.0f), -1, 3));
                frameLayoutFix3.addView(b2Var);
                C6847b2 b2Var2 = new C6847b2(context);
                b2Var2.setTextSize(1, 18.0f);
                b2Var2.setText("T");
                b2Var2.setGravity(17);
                b2Var2.setPadding(0, 0, 0, C1357a0.m37541i(1.0f));
                b2Var2.setTypeface(C1389o.m37262g());
                b2Var2.setTextColor(C11524j.m213U0());
                m9480A8(b2Var2);
                b2Var2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(46.0f), -1, 5));
                frameLayoutFix3.addView(b2Var2);
                C7484p1 p1Var = new C7484p1(context);
                this.f9942X0 = p1Var;
                m9163t8(p1Var);
                this.f9942X0.m15841h(true, false);
                this.f9942X0.setValueCount(C4868i.f16615S.length);
                m32155yr(this.f9942X0);
                this.f9942X0.setListener(new C2972a());
                this.f9942X0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                this.f9942X0.setForceBackgroundColorId(R.id.theme_color_sliderInactive);
                this.f9942X0.setPadding(b2Var2.getLayoutParams().width, 0, b2Var2.getLayoutParams().width, 0);
                this.f9942X0.m15842g(R.id.theme_color_sliderActive, false);
                frameLayoutFix3.addView(this.f9942X0);
                this.f10022v0.addView(frameLayoutFix3);
            } else if (i12 == 5) {
                C10192g.m5782i(this.f9939W0, R.id.theme_color_filling, this);
            }
        } else {
            RunnableC9558i0 i0Var3 = this.f10038z0;
            if (i0Var3 != null) {
                this.f10022v0.addView(i0Var3);
            }
        }
        if (m32527Wk()) {
            TdApi.Background background = ((C2977c0) m9131x9()).f10064q;
            C11520h I = this.f30167b.m2294pc().m4148I(C11524j.m177i0());
            if (!m32514Xk() || (background != null && background.type.getConstructor() == 1972128891)) {
                int i13 = C1357a0.m37541i(49.0f);
                this.f9912N0 = new C6979n4(context);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, i13);
                layoutParams16.addRule(2, R.id.msg_bottom);
                this.f9912N0.setLayoutParams(layoutParams16);
                C9620n4 n4Var2 = new C9620n4(context, this.f10030x0, this.f30167b);
                this.f9909M0 = n4Var2;
                n4Var2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f9909M0.setAlpha(0.0f);
                if (!m32514Xk() || background == null) {
                    this.f9912N0.m18217f(I, new C2976c(i13));
                    boolean z = !this.f9912N0.m18216g();
                    this.f9909M0.m8003i(C11520h.m299f0(this.f30167b, I, z));
                    this.f9909M0.setSelfBlur(z);
                    this.f9936V0.setSelfBlur(!z);
                    this.f9912N0.m18213j(I != null && I.m309a0(), false);
                    if (I != null && I.m309a0()) {
                        this.f10026w0.setTranslationY(-i13);
                    }
                } else {
                    this.f9912N0.m18218e(background, new C2974b());
                    this.f9909M0.m8003i(new C11520h(this.f30167b, background, !this.f9912N0.m18216g()));
                    this.f10026w0.setTranslationY(-i13);
                }
            }
        }
        RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, C1357a0.m37541i(48.0f));
        layoutParams17.addRule(12);
        C2978d dVar = new C2978d(context, this.f30167b);
        this.f9889F1 = dVar;
        dVar.setOnClickListener(this);
        this.f9889F1.setLayoutParams(layoutParams17);
        m9163t8(this.f9889F1);
        m32233sr();
        if (this.f9975i1 == 5) {
            m32650Mq(5, 0L, false);
            this.f9872A0.setVisibility(8);
        }
        this.f10018u0.addView(this.f9936V0);
        C9620n4 n4Var3 = this.f9909M0;
        if (n4Var3 != null) {
            this.f10018u0.addView(n4Var3);
        }
        if (!this.f9972h1) {
            this.f10018u0.addView(this.f9937V1);
        }
        this.f10018u0.addView(this.f10022v0);
        this.f10018u0.addView(this.f10026w0);
        this.f10018u0.addView(this.f9872A0);
        this.f10018u0.addView(this.f9940W1);
        this.f10018u0.addView(this.f9889F1);
        this.f10018u0.addView(this.f9915O0);
        this.f10018u0.addView(this.f9918P0);
        if (this.f9975i1 == 0) {
            this.f10018u0.addView(this.f9885E0);
            this.f10018u0.addView(this.f9882D0);
            this.f10018u0.addView(this.f9891G0);
            m32501Yk();
            this.f10018u0.addView(this.f9971g3);
            m32268qi();
        }
        C6979n4 n4Var4 = this.f9912N0;
        if (n4Var4 != null) {
            this.f10018u0.addView(n4Var4, 2);
        }
        m32701Ir();
        C11052v1.m1768b().m1769a(this);
        if (!m32406fo()) {
            return this.f10018u0;
        }
        C9391z4 z4Var = new C9391z4(context);
        this.f9951a1 = z4Var;
        m9163t8(z4Var.getTopView());
        FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) this.f9951a1.getRecyclerView().getLayoutParams();
        layoutParams18.leftMargin = C1357a0.m37541i(56.0f);
        layoutParams18.rightMargin = C1357a0.m37541i(56.0f);
        this.f9951a1.getTopView().setOnItemClickListener(this);
        m9163t8(this.f9951a1.getTopView());
        ArrayList<i10> arrayList = new ArrayList(8);
        View$OnClickListenerC3062so.m31583mj(arrayList, mo4347s(), mo4348c());
        String[] strArr = new String[arrayList.size() + 1];
        strArr[0] = C4403w.m27869i1(R.string.TabMessages).toUpperCase();
        int i14 = 1;
        for (i10 i10Var : arrayList) {
            strArr[i14] = i10Var.mo9313X9().toString().toUpperCase();
            i14++;
        }
        this.f9951a1.getTopView().setItems(strArr);
        this.f9945Y0 = new C2979d0(this, arrayList);
        C2980e eVar4 = new C2980e(context);
        this.f9948Z0 = eVar4;
        eVar4.setOffscreenPageLimit(1);
        C7045v2 v2Var = this.f9948Z0;
        if (!C4183a.f14083a) {
            i = 2;
        }
        v2Var.setOverScrollMode(i);
        this.f9948Z0.mo18020c(this);
        this.f9948Z0.setAdapter(this.f9945Y0);
        this.f9948Z0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        FrameLayoutFix frameLayoutFix4 = new FrameLayoutFix(context);
        frameLayoutFix4.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        frameLayoutFix4.addView(this.f9948Z0);
        return frameLayoutFix4;
    }

    public final void m32293oj(boolean z, boolean z2) {
        if (this.f9992n2) {
            ScrollView scrollView = this.f10008r2;
            if (scrollView != null) {
                scrollView.setVisibility(8);
            }
            if (this.f9996o2 && m9339Ta()) {
                this.f10012s2.m8379i(this.f10038z0);
            }
            this.f9992n2 = false;
            if (z) {
                m32207ur(R.drawable.deproko_baseline_bots_command_26);
                return;
            }
            m32207ur(R.drawable.deproko_baseline_bots_keyboard_26);
            if (z2) {
                C4868i c2 = C4868i.m24726c2();
                int w6 = this.f30167b.m2188w6();
                TdApi.Chat chat = this.f10002q0;
                c2.m24685h3(w6, chat.f25367id, chat.replyMarkupMessageId, true);
            }
        } else if (z) {
            m32207ur(R.drawable.deproko_baseline_bots_command_26);
        }
    }

    public final float m32292ok() {
        float i = (-m32541Vj()) - ((C1357a0.m37541i(74.0f) - C1357a0.m37541i(16.0f)) * this.f9916O1.m29584g());
        return m9332Ua() ? i + (-C1357a0.m37541i(16.0f)) + C1357a0.m37541i(4.0f) : i;
    }

    @Override
    public void onClick(View view) {
        C6979n4 n4Var;
        if (this.f9972h1) {
            int id2 = view.getId();
            if (id2 != R.id.btn_chatAction) {
                if (id2 == R.id.btn_help) {
                    C9357x2.C9365h d = mo4347s().m14584H3().m8985g(view).m8951q(R.drawable.baseline_info_24).m8958i(this).m8947v(true).m8963d();
                    C10930q6 q6Var = this.f30167b;
                    d.m8972C(q6Var, q6Var.m2784K6(this.f10002q0.f25367id) ? R.string.EventLogInfoDetailChannel : R.string.EventLogInfoDetail);
                } else if (id2 == R.id.btn_scroll) {
                    m32405fp();
                }
            } else if (this.f9975i1 == 3) {
                m32628Oo();
            }
        }
        switch (view.getId()) {
            case R.id.btn_applyWallpaper:
                TdApi.BackgroundType backgroundType = m9131x9().f10064q.type;
                if (backgroundType.getConstructor() == 1972128891 && (n4Var = this.f9912N0) != null) {
                    ((TdApi.BackgroundTypeWallpaper) backgroundType).isBlurred = n4Var.m18216g();
                }
                mo4348c().m2270r4().m14783o(new TdApi.SetBackground(new TdApi.InputBackgroundRemote(m9131x9().f10064q.f25362id), backgroundType, C11524j.m141z0()), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC2971rh.this.m32317mm(object);
                    }
                });
                return;
            case R.id.btn_camera:
                if (!m32429dr(view, R.id.right_sendMedia, R.string.ChatDisabledMedia, R.string.ChatRestrictedMedia, R.string.ChatRestrictedMediaUntil)) {
                    m9380Nc(new AbstractC9323v4.C9334k().m9109b(view).m9106e(m32396gl()));
                    return;
                }
                return;
            case R.id.btn_chatAction:
                m32628Oo();
                return;
            case R.id.btn_follow:
                m32357jl();
                return;
            case R.id.btn_mention:
                this.f10030x0.m7792I2();
                return;
            case R.id.btn_mute:
                if (this.f10002q0 != null) {
                    this.f30167b.m2485dd().m3677W8(this, this.f10002q0.f25367id, false, null);
                    return;
                }
                return;
            case R.id.btn_openLinkedChat:
                m32757Eo();
                return;
            case R.id.btn_scroll:
                m32405fp();
                return;
            case R.id.btn_silent:
                if (this.f30167b.m2784K6(this.f10002q0.f25367id)) {
                    this.f30167b.m2270r4().m14783o(new TdApi.ToggleChatDefaultDisableNotification(this.f10002q0.f25367id, this.f9906L0.m7592e()), this.f30167b.m2392ja());
                    int[] iArr = new int[2];
                    C1399s0.m37148x(this.f10022v0, iArr);
                    C1379j0.m37306r0(this.f9906L0.getIsSilent() ? R.string.ChannelNotifyMembersInfoOff : R.string.ChannelNotifyMembersInfoOn, 0, iArr[1] <= (C1357a0.m37544f() / 2) + C1357a0.m37541i(60.0f) ? -((this.f10018u0.getMeasuredHeight() - this.f10022v0.getTop()) + C1357a0.m37541i(14.0f)) : 0);
                    if (this.f10038z0 != null) {
                        m32142zr();
                        return;
                    }
                    return;
                }
                return;
            case R.id.btn_test:
                this.f9889F1.m8451U0(R.id.btn_test_crash1, "try again", R.drawable.baseline_remove_circle_24, true);
                return;
            case R.id.btn_test_crash1:
                this.f9889F1.m8451U0(R.id.btn_test, "test", R.drawable.baseline_warning_24, true);
                return;
            case R.id.btn_unpinAll:
                m32722Hj();
                return;
            case R.id.btn_viewScheduled:
                m32675Kr(false);
                return;
            case R.id.msg_attach:
                m32695Jk();
                m32744Fo(false);
                return;
            case R.id.msg_bottomReply:
                if (this.f9934U1 != null) {
                    TdApi.Message message = this.f9934U1;
                    m32632Ok(new C7319d(message.chatId, message.f25406id));
                    return;
                }
                return;
            case R.id.msg_command:
                switch (this.f9988m2) {
                    case R.drawable.baseline_direction_arrow_down_24:
                    case R.drawable.baseline_keyboard_24:
                    case R.drawable.deproko_baseline_bots_keyboard_26:
                        m32325lr();
                        return;
                    case R.drawable.deproko_baseline_bots_command_26:
                        m32288oo();
                        return;
                    default:
                        return;
                }
            case R.id.msg_emoji:
                m32312mr();
                return;
            case R.id.msg_send:
                if (m32537Vn()) {
                    return;
                }
                if (m32448cl()) {
                    m32418ep(true);
                    return;
                } else if (this.f9991n1) {
                    this.f30167b.m2485dd().m3787L8(this, mo9464C9(), false, new HandlerC10770jj.AbstractC10786o() {
                        @Override
                        public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                            View$OnClickListenerC2971rh.this.m32303nm(z, messageSchedulingState, z2);
                        }
                    }, null);
                    return;
                } else {
                    m32287op(null);
                    return;
                }
            default:
                return;
        }
    }

    public final void m32288oo() {
        this.f10038z0.m8249v0("/", true);
        C1408x.m37085f(this.f10038z0);
    }

    public final void m32287op(TdApi.MessageSchedulingState messageSchedulingState) {
        if (m32743Fp(false, messageSchedulingState)) {
            return;
        }
        if (m32448cl()) {
            m32418ep(true);
        } else {
            m32677Kp(true, false, messageSchedulingState);
        }
    }

    public final void m32286oq(boolean z, boolean z2) {
        if (this.f9932T2.m29583h() != z || !z2) {
            m32695Jk();
            if (!this.f9932T2.m29582i()) {
                if (z) {
                    m32683Kj();
                } else {
                    m32709Ij();
                }
            }
            this.f9932T2.m29575p(z, z2 && m9339Ta());
            m32495Yq();
        }
    }

    public boolean m32285or(long j, AbstractC4761s4 s4Var) {
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (eVar == null || s4Var == null || eVar.m21505f(j) == null) {
            return false;
        }
        m32211un(j, s4Var, -1.0f, -1.0f, false, 0);
        m32754Er();
        return true;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        int i2 = 0;
        r1 = false;
        boolean z = false;
        int i3 = 0;
        switch (i) {
            case R.id.menu_chat:
                C9310u0 N1 = d1Var.m10104N1(linearLayout, R.id.menu_btn_viewScheduled, R.drawable.baseline_date_range_24, mo9375O9(), this, C1357a0.m37541i(52.0f));
                if (!this.f30167b.m2415i3(mo9464C9())) {
                    i2 = 8;
                }
                N1.setVisibility(i2);
                d1Var.m10069b2(linearLayout, this);
                return;
            case R.id.menu_clear:
                d1Var.m10091S1(linearLayout, this).setColorId(R.id.theme_color_headerLightIcon);
                return;
            case R.id.menu_gallery:
                d1Var.m10104N1(linearLayout, R.id.menu_btn_gallery, R.drawable.baseline_image_24, mo9375O9(), this, C1357a0.m37541i(52.0f));
                return;
            case R.id.menu_messageActions:
                int wa = m9138wa();
                C9310u0 N12 = d1Var.m10104N1(linearLayout, R.id.menu_btn_selectInBetween, R.drawable.baseline_toc_24, wa, this, C1357a0.m37541i(49.0f));
                N12.m9518g(m9138wa());
                N12.setTag(C4403w.m27869i1(R.string.SelectMessagesInBetween));
                N12.setVisibility(8);
                C9310u0 N13 = d1Var.m10104N1(linearLayout, R.id.menu_btn_send, R.drawable.baseline_send_24, wa, this, C1357a0.m37541i(52.0f));
                ?? Hi = m32723Hi();
                N13.setVisibility(Hi != 0 ? 0 : 8);
                C9310u0 m2 = d1Var.m10046m2(linearLayout, this, wa);
                boolean Ki = m32684Ki();
                m2.setVisibility(Ki ? 0 : 8);
                int i4 = Hi;
                if (Ki) {
                    i4 = Hi + 1;
                }
                C9310u0 f2 = d1Var.m10060f2(linearLayout, this, wa);
                boolean Ai = m32815Ai();
                f2.setVisibility(Ai ? 0 : 8);
                int i5 = i4;
                if (Ai) {
                    i5 = i4 + 1;
                }
                C9310u0 X1 = d1Var.m10079X1(linearLayout, this, wa);
                boolean yi = m32164yi();
                X1.setVisibility(yi ? 0 : 8);
                int i6 = i5;
                if (yi) {
                    i6 = i5 + 1;
                }
                int i7 = i6;
                C9310u0 N14 = d1Var.m10104N1(linearLayout, R.id.menu_btn_clearCache, R.drawable.templarian_baseline_broom_24, wa, this, C1357a0.m37541i(52.0f));
                boolean vi = m32203vi();
                N14.setVisibility(vi ? 0 : 8);
                if (vi) {
                    i7++;
                }
                C9310u0 N15 = d1Var.m10104N1(linearLayout, R.id.menu_btn_unpinAll, R.drawable.deproko_baseline_pin_undo_24, wa, this, C1357a0.m37541i(52.0f));
                boolean Ji = m32697Ji();
                N15.setVisibility(Ji ? 0 : 8);
                if (Ji) {
                    i7++;
                }
                C9310u0 h2 = d1Var.m10056h2(linearLayout, this, wa);
                boolean Ci = m32789Ci();
                h2.setVisibility(Ci ? 0 : 8);
                if (Ci) {
                    i7++;
                }
                C9310u0 U1 = d1Var.m10087U1(linearLayout, this, wa);
                boolean xi = m32177xi();
                U1.setVisibility(xi ? 0 : 8);
                if (xi) {
                    i7++;
                }
                C9310u0 N16 = d1Var.m10104N1(linearLayout, R.id.menu_btn_report, R.drawable.baseline_report_24, wa, this, C1357a0.m37541i(52.0f));
                C9310u0 T1 = d1Var.m10090T1(linearLayout, this, wa);
                boolean wi = m32190wi();
                T1.setVisibility(wi ? 0 : 8);
                if (wi) {
                    i7++;
                }
                C9310u0 Z1 = d1Var.m10073Z1(linearLayout, this, wa);
                boolean Ii = m32710Ii();
                Z1.setVisibility(Ii ? 0 : 8);
                if (Ii) {
                    i7++;
                }
                if (!m32802Bi(i7)) {
                    i3 = 8;
                }
                N16.setVisibility(i3);
                return;
            case R.id.menu_more:
                d1Var.m10069b2(linearLayout, this);
                return;
            case R.id.menu_search:
                d1Var.m10054i2(linearLayout, this);
                return;
            case R.id.menu_secretChat:
                C9202h2 l2 = d1Var.m10048l2(linearLayout, this);
                String m3 = this.f30167b.m2485dd().m3523m3(mo9464C9());
                if (m32396gl() && this.f30167b.m2220u6(this.f10002q0)) {
                    z = true;
                }
                l2.m9979l(m3, z);
                d1Var.m10069b2(linearLayout, this);
                return;
            case R.id.menu_share:
                d1Var.m10104N1(linearLayout, R.id.menu_btn_share, R.drawable.baseline_share_arrow_24, mo9375O9(), this, C1357a0.m37541i(52.0f));
                return;
            default:
                return;
        }
    }

    @Override
    public void mo12p4(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        C11008t0.m2001a(this, y6Var, user, z, z2);
    }

    @Override
    public void mo16154p5() {
        if (this.f10038z0.length() > 0) {
            this.f10038z0.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    @Override
    public void mo11p6(C11131y6 y6Var, int i) {
        C11008t0.m1998d(this, y6Var, i);
    }

    @Override
    public void mo9187pc() {
        super.mo9187pc();
        this.f10030x0.m7681j2();
    }

    public final void m32280pj() {
        TdApi.DraftMessage draftMessage;
        if (this.f9982k2 != null && (this.f9998p0 & 1) == 0) {
            RunnableC9558i0 i0Var = this.f10038z0;
            if (i0Var != null) {
                TdApi.Chat chat = this.f10002q0;
                i0Var.setDraft((chat == null || (draftMessage = chat.draftMessage) == null) ? null : draftMessage.inputMessageText);
                m32548Up(1, false);
            }
            m32561Tp(false, "");
            this.f9982k2 = null;
            RunnableC9558i0 i0Var2 = this.f10038z0;
            if (i0Var2 != null) {
                m32741Fr(i0Var2.getInput(), true);
            }
            if (m32390gr()) {
                m32587Rq();
            } else if (this.f9934U1 != null) {
                m32574Sq();
            } else {
                m32202vj();
            }
        }
    }

    public C4737p7 m32279pk() {
        return this.f9987m1;
    }

    public boolean m32275po(C4747r rVar) {
        String str;
        if (!m32671Li() || this.f9907L1) {
            return false;
        }
        if (C7316a.m17052i(mo9464C9())) {
            str = rVar.m26273a0() + " ";
        } else {
            str = rVar.m26273a0() + "@" + rVar.m26272b0() + " ";
        }
        this.f10038z0.m8249v0(str, true);
        C1408x.m37085f(this.f10038z0);
        return true;
    }

    public final boolean m32274pp(View view, final TdApi.Animation animation, boolean z) {
        return m32183wp(view, R.id.right_sendStickersAndGifs, R.string.ChatDisabledGifs, R.string.ChatRestrictedGifs, R.string.ChatRestrictedGifsUntil, z, false, null, new AbstractC5913e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent E5;
                E5 = C4779t2.m25697E5(TdApi.Animation.this);
                return E5;
            }
        });
    }

    public void m32273pq(Object obj) {
        this.f10015t1 = obj;
        this.f10011s1 = obj != null && m32768Dq(obj);
    }

    public void m32272pr(long j) {
        this.f30167b.m2781K9().m1818q0(j, this);
        this.f30167b.m2781K9().m1790x0(this);
        if (mo9464C9() == j) {
            switch (this.f10002q0.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1603q2(((TdApi.ChatTypeSupergroup) this.f10002q0.type).supergroupId, this);
                    return;
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1595s2(C4779t2.m25465n2(this.f10002q0), this);
                    this.f30167b.m2480e2().m1607p2(C4779t2.m25549b2(this.f10002q0), this);
                    return;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1611o2(((TdApi.ChatTypeBasicGroup) this.f10002q0.type).basicGroupId, this);
                    return;
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    this.f30167b.m2480e2().m1595s2(C4779t2.m25465n2(this.f10002q0), this);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public void mo8842qc() {
        C7045v2 v2Var = this.f9948Z0;
        if (v2Var != null) {
            v2Var.setPagingEnabled(false);
        }
    }

    public final void m32268qi() {
        C4868i.m24726c2().m24593t(this);
        mo4347s().m14529V0().m6951I(this);
    }

    public final void m32267qj() {
        m32254rj(false);
    }

    public long m32266qk() {
        C4737p7 p7Var = this.f9987m1;
        if (p7Var != null) {
            return p7Var.m26294g();
        }
        return 0L;
    }

    public boolean m32262qo(AbstractC4761s4 s4Var, String str) {
        String str2;
        if (!m32671Li()) {
            return false;
        }
        if (!this.f30167b.m2583X6(mo9464C9()) || !s4Var.m26247A4().m4204l()) {
            str2 = str + ' ';
        } else {
            str2 = str + '@' + s4Var.m26247A4().m4206j() + ' ';
        }
        this.f10038z0.m8249v0(str2, true);
        C1408x.m37085f(this.f10038z0);
        return true;
    }

    public void m32261qp(final TdApi.Audio audio, final boolean z) {
        if (m32761Ek()) {
            m32665Lo(false, null, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
                    View$OnClickListenerC2971rh.this.m32172xn(z, audio, z2, messageSchedulingState, z3);
                }
            });
        }
    }

    public final void m32260qq(float f) {
        if (this.f9902J2 != f) {
            this.f9902J2 = f;
            float f2 = (0.2f * f) + 0.8f;
            this.f9887E2.setScaleX(f2);
            this.f9887E2.setScaleY(f2);
            this.f9887E2.setAlpha(Math.min(1.0f, Math.max(0.0f, f)));
        }
    }

    public final void m32259qr(CharSequence charSequence, int i, boolean z) {
        this.f9910M1 = i;
        this.f9904K1.setEnabled(z);
        this.f9904K1.setTextColor(z ? C11524j.m211V0() : C11524j.m217S0());
        m9180qd(this.f9904K1);
        m9119z8(this.f9904K1, z ? R.id.theme_color_textLink : R.id.theme_color_text);
        C1399s0.m37175j0(this.f9904K1, charSequence);
    }

    @Override
    public void mo6863r1(boolean z) {
        if (!this.f9932T2.m29583h()) {
            m32638Nq(z ? R.string.HoldToVideo : R.string.HoldToAudio);
        }
    }

    @Override
    public void mo8376r2(boolean z, boolean z2, boolean z3) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null && this.f30167b.m2788K2(chat.f25367id)) {
            View$OnClickListenerC2280d6 d6Var = new View$OnClickListenerC2280d6(this.f30165a, this.f30167b);
            d6Var.m35111kh(new View$OnClickListenerC2280d6.C2285d(this.f10002q0.f25367id, this.f9987m1, this, z2, z3));
            m9291ac(d6Var);
        }
    }

    @Override
    public void mo8375r6(final boolean z) {
        if (this.f10002q0 != null && C7316a.m17052i(mo9464C9())) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo4347s(), C11524j.m150v());
            builder.setTitle(C4403w.m27869i1(R.string.ShareYourPhoneNumberTitle));
            builder.setMessage(C4403w.m27865j1(R.string.ShareYourPhoneNumberDesc, this.f30167b.m2661S3(this.f10002q0)));
            builder.setPositiveButton(C4403w.m27950P0(), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    View$OnClickListenerC2971rh.this.m32512Xm(z, dialogInterface, i);
                }
            });
            builder.setNegativeButton(C4403w.m27869i1(R.string.Cancel), DialogInterface$OnClickListenerC2926qh.f9745a);
            m9344Sd(builder);
        }
    }

    public final boolean m32255ri() {
        return !m32396gl() || C4868i.m24726c2().m24763X2(2L) || C4868i.m24726c2().m24798S2();
    }

    public final void m32254rj(boolean z) {
        if (this.f9914N2) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            if (this.f9917O2 && m9339Ta() && !z) {
                this.f9879C0.m17861R2(this.f10038z0);
            }
            m32601Qp(false, true);
            this.f9885E0.setImageResource(ViewTreeObserver$OnPreDrawListenerC7081z0.m17853W1(true));
        }
    }

    public MessagesRecyclerView m32253rk() {
        return this.f10026w0;
    }

    public void m32249ro() {
    }

    public void m32248rp(final C4747r rVar) {
        m32665Lo(false, null, new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC2971rh.this.m32159yn(rVar, z, messageSchedulingState, z2);
            }
        });
    }

    public final void m32247rq(boolean z) {
        if (this.f9896H2 != z) {
            this.f9896H2 = z;
            boolean z2 = this.f9887E2.getParent() == null && z;
            if (z2) {
                this.f10018u0.addView(this.f9887E2);
            }
            m32242si(z ? 1.0f : 0.0f, z2);
        }
    }

    public final void m32246rr(boolean z) {
        if (z) {
            m32142zr();
        }
        if (m9332Ua()) {
            m32509Xp(false, false);
        } else if (m32553Uk()) {
            m32509Xp(false, false);
            if (m32229ti()) {
                m32650Mq(3, 0L, z);
            }
        } else {
            TdApi.ChatMemberStatus K3 = this.f30167b.m2787K3(this.f10002q0.f25367id);
            if (this.f30167b.m2784K6(this.f10002q0.f25367id) && K3 != null && !C4779t2.m25679H2(K3)) {
                m32509Xp(false, false);
                if (C4779t2.m25520f3(K3)) {
                    m32650Mq(1, 0L, z);
                    return;
                }
                TdApi.SupergroupFullInfo i2 = this.f30167b.m2480e2().m1634i2(C7316a.m17045p(this.f10002q0.f25367id));
                if (i2 != null) {
                    long j = i2.linkedChatId;
                    if (j != 0) {
                        m32650Mq(4, j, z);
                        return;
                    }
                }
                m32650Mq(2, 0L, z);
            } else if (this.f30167b.m2475e7(this.f10002q0.f25367id)) {
                m32509Xp(false, false);
                m32650Mq(2, 0L, z);
            } else {
                m32708Ik(z);
                TdApi.SecretChat X3 = this.f30167b.m2586X3(this.f10002q0.f25367id);
                if (X3 != null && !C4779t2.m25706D3(X3)) {
                    m32416er(X3);
                } else if (this.f30167b.m2447g3(this.f10002q0) && this.f30167b.m2171x7(this.f10002q0)) {
                    m32663Lq();
                } else if (this.f30167b.m2510c4(this.f10002q0) || ((C7316a.m17054g(this.f10002q0.f25367id) && (!this.f30167b.m2479e3(this.f10002q0.f25367id) || C4779t2.m25457o3(K3))) || (this.f30167b.m2283q7(this.f10002q0) && C4779t2.m25457o3(K3) && this.f9987m1 == null))) {
                    if (!this.f30167b.m2283q7(this.f10002q0) || K3 == null || !C4779t2.m25601T(K3)) {
                        m32689Jq();
                    } else {
                        m32676Kq();
                    }
                } else if (!this.f30167b.m2816I6(this.f10002q0) || this.f10002q0.lastMessage != null) {
                    CharSequence I5 = this.f30167b.m2817I5(this.f10002q0);
                    if (I5 != null) {
                        m32715Hq(I5, 6, false);
                    } else {
                        m32748Fk();
                    }
                } else {
                    m32755Eq();
                }
            }
        }
    }

    @Override
    public void mo4058s2(final long j, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32513Xl(j, z);
            }
        });
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    @Override
    public void mo9166sc() {
        RunnableC9558i0 i0Var;
        C10930q6 q6Var;
        super.mo9166sc();
        if (this.f10002q0 != null && !m9332Ua()) {
            final TdApi.ChatSource J3 = this.f30167b.m2803J3(this.f10006r0, this.f10002q0.f25367id);
            if (J3 != null && C4868i.m24726c2().m24756Y2(J3)) {
                mo4347s().m14584H3().m8985g(this.f10010s0).m8958i(this).m8943z(true).m8957j(true).m8946w(true).m8947v(true).m8951q(R.drawable.baseline_info_24).m8963d().m8971D(this.f30167b, C4403w.m28009A1(this, J3)).m8880s(new AbstractC5920l() {
                    @Override
                    public final void mo3050a(long j) {
                        View$OnClickListenerC2971rh.m32186wm(TdApi.ChatSource.this, j);
                    }
                }).m8918G(10L, TimeUnit.SECONDS);
            }
            TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat = this.f9999p1;
            if (internalLinkTypeVideoChat != null) {
                m32704Io(internalLinkTypeVideoChat);
                this.f9999p1 = null;
            }
        }
        m32495Yq();
        if (!this.f10031x1 && !this.f9972h1 && !m9332Ua()) {
            C10536ab.m4667o1().m4705e0(this.f30167b.m2188w6(), 4, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z) {
                    View$OnClickListenerC2971rh.this.m32173xm(z);
                }
            });
        }
        C1379j0.m37318l0(this.f30165a, 18);
        if (!m32566Tk() && (q6Var = this.f30167b) != null) {
            ((MainActivity) this.f30165a).m14634q4(q6Var.m2188w6());
        }
        C2979d0 d0Var = this.f9945Y0;
        if (d0Var != null && d0Var.f10066M) {
            d0Var.f10066M = false;
            d0Var.m28888l();
        }
        if (this.f10038z0 != null && m32432do()) {
            this.f10038z0.setTextChangedSinceChatOpened(false);
        }
        this.f10026w0.setMessageAnimatorEnabled(true);
        m32576So();
        this.f10030x0.m7739W2(true);
        long j = this.f10020u2;
        if (j != 0) {
            m32145zo(j, this.f10024v2, false, false);
            this.f10020u2 = 0L;
            this.f10024v2 = null;
        }
        if (this.f10022v0.getVisibility() == 0 && (i0Var = this.f10038z0) != null && i0Var.isEnabled() && !m32422el()) {
            this.f10038z0.setEnabled(false);
            this.f10038z0.setEnabled(true);
        }
        RunnableC9558i0 i0Var2 = this.f10038z0;
        if (i0Var2 != null && i0Var2.isEnabled()) {
            this.f10038z0.requestFocus();
        }
        if (this.f10027w1) {
            m32487Zk(true);
            this.f10027w1 = false;
        }
        m32181wr(true);
        if (!this.f9972h1) {
            int te = m9157te();
            if (te == 4 && (m9164se(2) instanceof C3034s5)) {
                m9287b9(2);
                m9287b9(1);
            } else if (te == 3 && (m9164se(1) instanceof C3034s5)) {
                m9287b9(1);
            }
            m9280c9(R.id.controller_call);
            AbstractC9323v4<?> kd = m9221kd();
            if ((kd instanceof View$OnClickListenerC2805o4) && ((View$OnClickListenerC2805o4) kd).m33302si()) {
                m9287b9(m9157te() - 2);
            }
        }
        m32470ap();
        if (this.f10003q1) {
            this.f10003q1 = false;
            C1408x.m37085f(this.f10038z0);
        }
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        int i = bundle.getInt(str + "type", 0);
        long j = bundle.getLong(str + "chat_id", 0L);
        TdApi.Chat N3 = this.f30167b.m2739N3(j);
        if (j != 0 && N3 == null) {
            return false;
        }
        C2977c0 c0Var = null;
        TdApi.ChatList W = C4779t2.m25583W(bundle.getString(str + "chat_list", null));
        C4737p7 l = C4737p7.m26289l(bundle, str + "thread");
        TdApi.SearchMessagesFilter V4 = C4779t2.m25584V4(bundle, str + "filter_");
        if (i == 0) {
            c0Var = new C2977c0(this.f30167b, W, N3, l, V4);
        } else if (i == 1) {
            C7319d dVar = null;
            int i2 = bundle.getInt(str + "mode", 0);
            long j2 = bundle.getLong(str + "message_id", 0L);
            long j3 = bundle.getLong(str + "message_chat_id", 0L);
            if (j2 != 0) {
                dVar = new C7319d(j3, j2);
            }
            c0Var = new C2977c0(W, N3, l, dVar, i2, V4);
        } else if (i == 2) {
            c0Var = new C2977c0(bundle.getInt(str + "mode", 0), W, N3);
        } else if (i == 3) {
            c0Var = new C2977c0(W, N3, bundle.getString(str + "query", null), C4779t2.m25572X4(bundle, str + "sender_"), V4);
        } else if (i == 4) {
            String string = bundle.getString(str + "query", null);
            TdApi.MessageSender X4 = C4779t2.m25572X4(bundle, str + "sender_");
            int i3 = bundle.getInt(str + "mode", 0);
            long j4 = bundle.getLong(str + "message_id", 0L);
            c0Var = new C2977c0(W, N3, string, X4, V4, j4 != 0 ? new C7319d(bundle.getLong(str + "message_chat_id", 0L), j4) : null, i3);
        }
        if (c0Var == null) {
            return false;
        }
        super.mo9165sd(bundle, str);
        c0Var.f10058k = bundle.getBoolean(str + "scheduled", false);
        m32664Lp(c0Var);
        return true;
    }

    public final void m32242si(float f, boolean z) {
        if (this.f9899I2 == null) {
            this.f9899I2 = new C3950k(1, this, C2057b.f7280b, 180L, this.f9902J2);
        }
        if (f == 1.0f && this.f9902J2 == 0.0f) {
            this.f9899I2.m29557B(C2057b.f7284f);
            this.f9899I2.m29528y(210L);
        } else {
            this.f9899I2.m29557B(C2057b.f7280b);
            this.f9899I2.m29528y(100L);
        }
        this.f9899I2.m29543j(f, z ? this.f9887E2 : null);
    }

    public final void m32241sj() {
        AbstractC5867f fVar = this.f10028w2;
        if (fVar != null) {
            try {
                fVar.mo21088e();
            } catch (Throwable th) {
                Log.m14710w("GoogleApiClient throws", th, new Object[0]);
            }
            this.f10028w2 = null;
        }
    }

    public float m32240sk() {
        return this.f9954b1;
    }

    public void m32236so(CharSequence charSequence) {
        View$OnTouchListenerC5103c0 c0Var = this.f9894H0;
        if (c0Var != null) {
            c0Var.m23953g();
        }
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f9879C0;
        if (z0Var != null) {
            z0Var.m17832v2(charSequence);
        }
        if (m32432do() && m9339Ta()) {
            m32431dp();
        }
    }

    public void m32235sp(final String str, final String str2) {
        m32665Lo(false, null, new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC2971rh.this.m32146zn(str2, str, z, messageSchedulingState, z2);
            }
        });
    }

    public void m32234sq(boolean z) {
        if (this.f10002q0 != null) {
            m32627Op(TdApi.ChatActionTyping.CONSTRUCTOR, z, false);
        }
    }

    public final void m32233sr() {
        if (this.f9889F1 != null) {
            float g = this.f9898I1.m29584g();
            float g2 = this.f9916O1.m29584g();
            int i = C1357a0.m37541i(48.0f);
            int i2 = 0;
            int d = m32419eo() ? (int) (i * C5069h.m24089d(this.f10029w3)) : 0;
            int i3 = (g > 1.0f ? 1 : (g == 1.0f ? 0 : -1));
            if (i3 != 0) {
                d += (int) (i * (1.0f - g));
            }
            float f = d;
            float i4 = C1357a0.m37541i(74.0f) - C1357a0.m37541i(16.0f);
            float i5 = (((-m32541Vj()) - C1357a0.m37541i(16.0f)) - i4) - (i4 * this.f9928S1);
            this.f9889F1.setCollapseFactor(g2);
            this.f9889F1.setAlpha(1.0f - ((g2 * 1.0f) * (1.0f - g)));
            int measuredWidth = (int) ((((this.f9889F1.getMeasuredWidth() / 2.0f) - C1357a0.m37541i(16.0f)) - (i / 2)) * g2);
            C9513d dVar = this.f9889F1;
            if (!(i3 == 0 && g2 == 0.0f)) {
                f += (i5 - f) * g2;
            }
            dVar.setTranslationY(f);
            this.f9889F1.setTranslationX(measuredWidth);
            if (g <= 0.0f) {
                i2 = 8;
            }
            if (this.f9889F1.getVisibility() != i2) {
                this.f9889F1.setVisibility(i2);
            }
        }
    }

    @Override
    public void mo10182t(final int i, int i2, Intent intent) {
        final String U2;
        if (i2 == -1) {
            boolean z = false;
            if (i != 109) {
                switch (i) {
                    case 100:
                        break;
                    case 101:
                    case 104:
                        Uri data = intent != null ? intent.getData() : null;
                        if (data != null) {
                            String U22 = C7389v0.m16675U2(data);
                            if (this.f9972h1) {
                                if (this.f9975i1 == 1) {
                                    this.f30167b.m2294pc().m4096s0(new C11520h(this.f30167b, U22), true, C11524j.m177i0());
                                    return;
                                }
                                return;
                            } else if (U22 != null && U22.endsWith(".webp")) {
                                m32730Gp(U22, true, false, null);
                                return;
                            } else if (i == 104) {
                                m32157yp(Collections.singletonList(U22), false, true, false, null);
                                return;
                            } else {
                                m32795Bp(U22, 0, true);
                                return;
                            }
                        } else {
                            return;
                        }
                    case 102:
                        Uri data2 = intent.getData();
                        if (data2 != null && (U2 = C7389v0.m16675U2(data2)) != null) {
                            final long j = this.f10002q0.f25367id;
                            final boolean lo = m32328lo();
                            final long ko = m32341ko();
                            C4383l.m28059a().m28058b(new Runnable() {
                                @Override
                                public final void run() {
                                    View$OnClickListenerC2971rh.this.m32592Rl(U2, j, ko, lo);
                                }
                            });
                            return;
                        }
                        return;
                    case 103:
                        m32475ak(this.f10032x2, this.f10028w2);
                        return;
                    default:
                        return;
                }
            }
            File P = C1405v.m37127P();
            if (P != null) {
                if (!m32396gl()) {
                    C7389v0.m16610m(P);
                }
                if (i == 109) {
                    z = true;
                }
                C7389v0.m16687R2(P, z, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC2971rh.this.m32605Ql(i, (C6253l) obj);
                    }
                });
            }
        }
    }

    @Override
    public void mo1555t0(final TdApi.Supergroup supergroup) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32420en(supergroup);
            }
        });
    }

    @Override
    public void mo9812t1(Object obj, View$OnClickListenerC7430j1.C7448r rVar) {
        int i = this.f9957c1;
        if (i == 0) {
            rVar.f23722c = this;
        } else if (i == 1) {
            C2979d0 d0Var = this.f9945Y0;
            i10 i10Var = d0Var != null ? (i10) d0Var.f10068O.m21471e(1) : null;
            if (i10Var != null && (i10Var instanceof q10)) {
                ((q10) i10Var).mo9812t1(obj, rVar);
            }
        }
    }

    @Override
    public void mo4056t7(long j, TdApi.ChatPermissions chatPermissions) {
        C10721i0.m4183n(this, j, chatPermissions);
    }

    @Override
    public void mo9159tc() {
        m32476aj();
        m32542Vi();
        m32595Ri();
        View$OnClickListenerC9599l3 l3Var = this.f9955b2;
        if (l3Var != null) {
            l3Var.setAnimationsDisabled(!m9339Ta());
        }
    }

    public boolean m32229ti() {
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f9984l1;
        return searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512;
    }

    public final void m32228tj() {
        if ((this.f9998p0 & 1) == 0) {
            this.f9911M2 = this.f9905K2;
            if (this.f9982k2 != null) {
                m32600Qq();
            } else if (this.f9934U1 != null) {
                m32574Sq();
            } else {
                m32202vj();
            }
            this.f10038z0.setTextChangedSinceChatOpened(true);
        }
    }

    public float m32227tk() {
        return get().getMeasuredWidth() * this.f9954b1;
    }

    public void m32223to(long j, int i) {
        if (mo9464C9() != j || this.f9975i1 != 4) {
            return;
        }
        if (this.f9981k1 != null || this.f9984l1 != null) {
            m32767Dr();
        }
    }

    public void m32222tp(C6253l lVar, TdApi.MessageSendOptions messageSendOptions, boolean z, boolean z2) {
        m32782Cp(new C6253l[]{lVar}, false, messageSendOptions, z, z2);
    }

    public final void m32221tq(int i, boolean z) {
        if (i == 0 || (!this.f9972h1 && !m9332Ua())) {
            this.f9927S0.m8364a(i, true ^ this.f30167b.m2223u3(mo9464C9()), z && this.f9916O1.m29584g() > 0.0f && m9339Ta());
        }
    }

    public final void m32220tr() {
        int top = this.f10022v0.getTop();
        RunnableC9558i0 i0Var = this.f10038z0;
        float bottom = (top + (i0Var != null ? i0Var.getBottom() : C1357a0.m37541i(49.0f))) - C1357a0.m37541i(49.0f);
        this.f9891G0.setTranslationY(bottom);
        this.f9885E0.setTranslationY(bottom);
        this.f9882D0.setTranslationY(bottom);
        if (this.f10016t2 != bottom) {
            this.f10016t2 = bottom;
            m32197vo();
            m32806Ar();
        }
    }

    @Override
    public void mo25737u0(float f, C3950k kVar) {
        if (this.f9883D1 == kVar && this.f9886E1 != f) {
            this.f9886E1 = f;
            C9580j1 E0 = this.f10030x0.m7808E0();
            int k0 = E0.m8115k0();
            for (int i = 0; i < k0; i++) {
                AbstractC4761s4 j0 = E0.m8116j0(i);
                if (j0 != null) {
                    j0.m25944e8();
                }
            }
        }
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo8837u5(int i) {
        if (i == -2 || i == -1) {
            C6035e<AbstractC4761s4> eVar = this.f9880C1;
            if (eVar != null) {
                int p = eVar.m21496p();
                int i2 = 0;
                while (i2 < p) {
                    this.f9880C1.m21495q(i2).m25838p9(this.f9880C1.m21501j(i2), false, i == -1, -1.0f, -1.0f, i2 == p + (-1) ? this : null);
                    i2++;
                }
                m32333lj();
            }
            C2979d0 d0Var = this.f9945Y0;
            if (d0Var != null) {
                int n = d0Var.f10068O.m21463n();
                for (int i3 = 0; i3 < n; i3++) {
                    i10 i10Var = (i10) this.f9945Y0.f10068O.m21462o(i3);
                    if (i10Var != null) {
                        i10Var.m34404Eg(false);
                    }
                }
            }
            if (i == -1) {
                m9307Y8();
            }
        }
        if (i == -2) {
            m9331Ub();
        }
    }

    @Override
    public void mo1335u7(final long j, TdApi.UserFullInfo userFullInfo) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32407fn(j);
            }
        });
    }

    public boolean m32216ui() {
        return this.f9991n1;
    }

    public void m32215uj(final boolean z) {
        this.f30167b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32213ul(z);
            }
        });
    }

    public float m32214uk() {
        return this.f9979j2;
    }

    public void m32210uo(long j, long j2, TdApi.MessageContent messageContent) {
        TdApi.Message message = this.f9982k2;
        if (message == null || message.chatId != j || message.f25406id != j2) {
            return;
        }
        if (!message.canBeEdited) {
            m32280pj();
            return;
        }
        TdApi.MessageContent messageContent2 = message.content;
        message.content = messageContent;
        this.f9937V1.m7844F1(message, C4403w.m27869i1(R.string.EditMessage));
        this.f9982k2.content = messageContent2;
    }

    public void m32209up(final TdApi.User user, final boolean z, TdApi.MessageSendOptions messageSendOptions) {
        if (m32761Ek()) {
            m32665Lo(messageSendOptions.disableNotification, messageSendOptions.schedulingState, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
                    View$OnClickListenerC2971rh.this.m32810An(z, user, z2, messageSchedulingState, z3);
                }
            });
        }
    }

    public final void m32208uq(final boolean z) {
        this.f10032x2 = z;
        this.f10036y2 = mo9464C9();
        if (mo4347s().m14467m0(false) != 0) {
            mo4347s().m14570K2(false, false, null);
            return;
        }
        try {
            if (this.f10028w2 == null) {
                AbstractC5867f.C5868a aVar = new AbstractC5867f.C5868a(mo4347s());
                aVar.m21905a(C4282f.f14330a);
                AbstractC5867f c = aVar.m21903c();
                this.f10028w2 = c;
                c.mo21089d();
            }
            C4282f.f14333d.mo951a(this.f10028w2, new C4284g.C4285a().m28299a(LocationRequest.m30353b()).m28297c(true).m28298b()).mo21900c(new AbstractC5877l() {
                @Override
                public final void mo11472a(AbstractC5876k kVar) {
                    View$OnClickListenerC2971rh.this.m32641Nn(z, (C4289i) kVar);
                }
            });
        } catch (Throwable unused) {
            m32195vq(z, null);
        }
    }

    public final void m32207ur(int i) {
        if (i != 0) {
            if (this.f9903K0.m8099c(true)) {
                this.f9882D0.m8496a();
            }
            if (this.f9988m2 != i) {
                this.f9988m2 = i;
                this.f9903K0.setImageResource(i);
            }
        } else if (this.f9903K0.m8099c(false)) {
            this.f9882D0.m8496a();
        }
    }

    @Override
    public C7462l1 mo9807v(int i, C8112b bVar) {
        C2979d0 d0Var;
        i10 i10Var;
        int f0;
        View C;
        boolean fo = m32406fo();
        if (!((fo && this.f9957c1 != 0) || (f0 = this.f10030x0.m7808E0().m8120f0(bVar)) == -1 || (C = this.f10030x0.m7774N0().mo39262C(f0)) == null)) {
            RecyclerView.AbstractC0886d0 l0 = this.f10026w0.m39418l0(C);
            if ((l0 instanceof C9586k1) && C9586k1.m8092T(l0.m39332n())) {
                return this.f10030x0.m7808E0().m8116j0(f0).mo26022W3(bVar.mo13513d(), C, C.getTop(), this.f10026w0.getBottom() - C.getBottom(), C.getTop() + View$OnClickListenerC9170d1.m10066c3(true) + ((int) this.f10026w0.getTranslationY()));
            }
        }
        if (!fo || this.f9957c1 != 1 || (d0Var = this.f9945Y0) == null || (i10Var = (i10) d0Var.f10068O.m21471e(this.f9957c1)) == null || !(i10Var instanceof q10)) {
            return null;
        }
        ((q10) i10Var).mo9807v(i, bVar);
        return null;
    }

    @Override
    public void mo18296v2(C6957m1.C6963f fVar) {
        fVar.m18333M(true);
        fVar.m18339G(mo9464C9(), m32266qk());
        fVar.m18341E(true);
    }

    @Override
    public int mo7580v3() {
        return C1399s0.m37154u(this.f9887E2)[1];
    }

    @Override
    public void mo4v4(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        if (this.f30167b.m2188w6() != y6Var.f35705b) {
            m32372ij();
        }
    }

    public final boolean m32203vi() {
        C2979d0 d0Var;
        if (this.f9957c1 != 0 && (d0Var = this.f9945Y0) != null) {
            i10 i10Var = (i10) d0Var.f10068O.m21471e(this.f9957c1);
            return i10Var != null && i10Var.m34347nf();
        } else if (this.f9880C1 == null) {
            return false;
        } else {
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < this.f9880C1.m21496p(); i2++) {
                AbstractC4761s4 q = this.f9880C1.m21495q(i2);
                if (C4779t2.m25647M(q.m25984a4(this.f9880C1.m21501j(i2)))) {
                    i++;
                    z = z || q.m26086Q2() > 0;
                }
            }
            return i > 1 || z;
        }
    }

    public final void m32202vj() {
        this.f9998p0 |= 1;
        if (this.f9935U2) {
            m32430dq(0.0f);
            this.f9937V1.m7842Z();
            this.f9998p0 &= -2;
            return;
        }
        m32588Rp(true);
        final float uk = m32214uk();
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View$OnClickListenerC2971rh.this.m32200vl(uk, valueAnimator);
            }
        });
        b.setInterpolator(C2057b.f7280b);
        b.setDuration(200L);
        b.addListener(new C2985i());
        b.start();
    }

    public final float m32201vk() {
        return this.f9979j2 * (1.0f - m9182qa()) * this.f9937V1.getLayoutParams().height;
    }

    public final void m32197vo() {
        mo4347s().m14579I3();
        this.f10030x0.m7672l2();
    }

    public final boolean m32196vp(View view, int i, int i2, int i3, int i4, final AbstractC5916h hVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState, final AbstractC5913e<TdApi.InputMessageContent> eVar) {
        if (m32429dr(view, i, i2, i3, i4) || !m32761Ek()) {
            return false;
        }
        m32665Lo(z, messageSchedulingState, new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState2, boolean z3) {
                View$OnClickListenerC2971rh.this.m32797Bn(hVar, eVar, z2, messageSchedulingState2, z3);
            }
        });
        return true;
    }

    public final void m32195vq(boolean z, Location location) {
        if (mo9464C9() == this.f10036y2) {
            m32300np(new TdApi.InputMessageLocation(new TdApi.Location(location.getLatitude(), location.getLongitude(), location.getAccuracy()), 0, C7389v0.m16757A0(location), 0), true, false, null, null);
            if (z) {
                mo8377l1();
            }
        }
    }

    public void m32194vr(boolean z) {
        boolean Np = m32639Np(!z || !C7316a.m17049l(mo9464C9()));
        if (this.f9903K0.m8099c(z) || Np) {
            this.f9882D0.m8496a();
        }
    }

    @Override
    public void mo16097w0(String str) {
        this.f10038z0.m8260p0(str);
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public void mo8374w3(final boolean z) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null && C7316a.m17052i(chat.f25367id)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo4347s(), C11524j.m150v());
            builder.setTitle(C4403w.m27869i1(R.string.ShareYourLocation));
            builder.setMessage(C4403w.m27869i1(R.string.ShareYouLocationInfo));
            builder.setPositiveButton(C4403w.m27950P0(), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    View$OnClickListenerC2971rh.this.m32485Zm(z, dialogInterface, i);
                }
            });
            builder.setNegativeButton(C4403w.m27869i1(R.string.Cancel), DialogInterface$OnClickListenerC2390fh.f8208a);
            m9344Sd(builder);
        }
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    @Override
    public boolean mo9136wc(boolean z) {
        ViewTreeObserver$OnPreDrawListenerC9542g gVar;
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var;
        if (m32435dl()) {
            int i = 4;
            int i2 = 0;
            this.f10022v0.setVisibility(z ? 4 : 0);
            C6862d3 d3Var = this.f9872A0;
            if (!z) {
                i = 0;
            }
            d3Var.setVisibility(i);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10026w0.getLayoutParams();
            int i3 = R.id.msg_bottom;
            layoutParams.addRule(2, z ? 0 : R.id.msg_bottom);
            this.f10026w0.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f9915O0.getLayoutParams();
            if (z) {
                i3 = 0;
            }
            layoutParams2.addRule(2, i3);
            if (z) {
                i2 = -1;
            }
            layoutParams2.addRule(12, i2);
            this.f9915O0.setLayoutParams(layoutParams2);
        }
        if (!m9339Ta()) {
            return super.mo9136wc(z);
        }
        if (z && !m9348S9()) {
            if (this.f9914N2) {
                m32254rj(true);
            }
            if (this.f9992n2) {
                m32306nj(true);
            }
        }
        boolean wc = super.mo9136wc(z);
        if (this.f9914N2 && (z0Var = this.f9879C0) != null) {
            z0Var.m17841j(z);
        }
        if (this.f9992n2 && (gVar = this.f10012s2) != null) {
            gVar.m8382f(z);
        }
        return wc;
    }

    public final boolean m32190wi() {
        C2979d0 d0Var;
        if (this.f9957c1 == 0 || (d0Var = this.f9945Y0) == null) {
            C6035e<AbstractC4761s4> eVar = this.f9880C1;
            if (eVar == null || eVar.m21496p() == 0) {
                return false;
            }
            if (this.f9880C1.m21496p() == 1) {
                TdApi.Message Ak = m32813Ak();
                return Ak.canBeSaved && C4779t2.m25654L(Ak);
            }
            for (int i = 0; i < this.f9880C1.m21496p(); i++) {
                if (!this.f9880C1.m21495q(i).m25984a4(this.f9880C1.m21501j(i)).canBeSaved) {
                    return false;
                }
            }
            return !m32396gl();
        }
        i10 i10Var = (i10) d0Var.f10068O.m21471e(this.f9957c1);
        return i10Var != null && i10Var.m34346of();
    }

    public final void m32189wj(boolean z) {
        if (this.f9959c3) {
            this.f9959c3 = false;
            m32424ej(!z);
            if (z) {
                this.f9968f3.m8418N1();
                this.f9968f3.setAlpha(0.0f);
                this.f9968f3.setVisibility(8);
                return;
            }
            this.f9968f3.m8422I1();
        }
    }

    public final float m32188wk() {
        if (!m32419eo() || this.f10029w3 == -1.0f) {
            return 0.0f;
        }
        return C1357a0.m37541i(49.0f) * this.f10029w3;
    }

    public final void m32184wo() {
        this.f9893G2.m7584i0(null);
        this.f10018u0.removeView(this.f9887E2);
    }

    public final boolean m32183wp(View view, int i, int i2, int i3, int i4, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, AbstractC5913e<TdApi.InputMessageContent> eVar) {
        return m32196vp(view, i, i2, i3, i4, z ? new AbstractC5916h() {
            @Override
            public final long get() {
                return View$OnClickListenerC2971rh.this.m32341ko();
            }
        } : null, z2, messageSchedulingState, eVar);
    }

    public final void m32182wq(boolean z) {
        try {
            LocationManager locationManager = (LocationManager) mo4347s().getSystemService("location");
            boolean[] zArr = new boolean[1];
            C2988l lVar = new C2988l(r9, locationManager, zArr, z);
            AbstractRunnableC5910b[] bVarArr = {new C2989m(zArr, z)};
            C1379j0.m37332e0(bVarArr[0], 3000L);
            locationManager.requestLocationUpdates("gps", 1L, 0.0f, lVar);
            locationManager.requestLocationUpdates("network", 1L, 0.0f, lVar);
        } catch (SecurityException unused) {
            m32436dk(z, true, false);
        } catch (Throwable th) {
            Log.m14710w("Error occured", th, new Object[0]);
            m32436dk(z, true, false);
        }
    }

    public final void m32181wr(boolean z) {
        TdApi.Chat chat = this.f10002q0;
        if (chat != null) {
            C4737p7 p7Var = this.f9987m1;
            if (p7Var != null) {
                m32221tq(p7Var.m26290k() ? C10930q6.f34956A2 : 0, z);
            } else {
                m32221tq(chat.unreadCount, true);
                m32443cq(this.f10002q0.unreadMentionCount);
            }
            int i = this.f9892G1;
            if (i == 2) {
                m32650Mq(i, 0L, z);
            }
        }
    }

    @Override
    public void mo8833x(int i, float f, int i2) {
        float f2 = i + f;
        this.f9951a1.getTopView().setSelectionFactor(f2);
        if (this.f9954b1 != f2) {
            this.f9954b1 = f2;
            if (this.f9966f1) {
                this.f9966f1 = false;
                mo9397La();
            }
            m32503Yi();
            m32476aj();
            m32542Vi();
        }
    }

    @Override
    public void mo3246x1(long j) {
        C10791k1.m3310a(this, j);
    }

    @Override
    public void mo8397x3() {
        if (this.f10002q0 != null) {
            int i = 0;
            if (m32553Uk()) {
                AbstractC9323v4<?> Z9 = m9300Z9();
                if (Z9 instanceof AbstractC9376x4) {
                    AbstractC9376x4 x4Var = (AbstractC9376x4) Z9;
                    if (x4Var.m8857dg() != 1) {
                        i = 1;
                    }
                    x4Var.mo8849k2(i);
                    return;
                }
                return;
            }
            View$OnClickListenerC3062so soVar = new View$OnClickListenerC3062so(this.f30165a, this.f30167b);
            soVar.m9394Ld(true);
            soVar.m31851Hm(new View$OnClickListenerC3062so.C3075m(this.f10002q0, this.f9987m1, false));
            m9291ac(soVar);
        }
    }

    @Override
    public void mo8832x4(int i) {
        if (this.f9957c1 != i) {
            this.f9957c1 = i;
            m32503Yi();
        }
    }

    @Override
    public int mo8831xa() {
        return R.id.menu_messageActions;
    }

    @Override
    public void mo409xc() {
        this.f10030x0.m7700f2();
        m32379hp(null);
    }

    public final boolean m32177xi() {
        C2979d0 d0Var;
        if (this.f9957c1 == 0 || (d0Var = this.f9945Y0) == null) {
            C6035e<AbstractC4761s4> eVar = this.f9880C1;
            if (eVar == null) {
                return false;
            }
            int p = eVar.m21496p();
            for (int i = 0; i < p; i++) {
                TdApi.Message a4 = this.f9880C1.m21495q(i).m25984a4(this.f9880C1.m21501j(i));
                if (a4 == null || (!a4.canBeDeletedForAllUsers && !a4.canBeDeletedOnlyForSelf)) {
                    return false;
                }
            }
            return p > 0;
        }
        i10 i10Var = (i10) d0Var.f10068O.m21471e(this.f9957c1);
        return i10Var != null && i10Var.m34344pf();
    }

    public void m32176xj(boolean z) {
        View$OnClickListenerC9599l3 l3Var = this.f9955b2;
        if (l3Var != null) {
            l3Var.m8041q(z);
        }
    }

    public float m32175xk() {
        return this.f9886E1;
    }

    public void m32171xo(C4729p pVar) {
        this.f30167b.m2295pb(pVar.m26311b0(), mo9464C9(), pVar.m26340h());
        this.f10038z0.setText("");
    }

    public final void m32170xp(View view, final String str, final long j) {
        int i;
        int i2;
        int i3;
        if (C4779t2.f16221F.f16283a.equals(str)) {
            i3 = R.string.ChatDisabledDart;
            i2 = R.string.ChatRestrictedDart;
            i = R.string.ChatRestrictedDartUntil;
        } else if (C4779t2.f16222G.f16283a.equals(str)) {
            i3 = R.string.ChatDisabledDice;
            i2 = R.string.ChatRestrictedDice;
            i = R.string.ChatRestrictedDiceUntil;
        } else {
            i3 = R.string.ChatDisabledStickers;
            i2 = R.string.ChatRestrictedStickers;
            i = R.string.ChatRestrictedStickersUntil;
        }
        m32196vp(view, R.id.right_sendStickersAndGifs, i3, i2, i, new AbstractC5916h() {
            @Override
            public final long get() {
                long Cn;
                Cn = View$OnClickListenerC2971rh.m32784Cn(j);
                return Cn;
            }
        }, false, null, new AbstractC5913e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent Dn;
                Dn = View$OnClickListenerC2971rh.m32771Dn(str);
                return Dn;
            }
        });
    }

    public final void m32169xq() {
        Object obj = this.f10015t1;
        if (obj != null) {
            m32156yq(obj);
            this.f10015t1 = null;
        }
    }

    public final void m32168xr(final long j, final TdApi.DraftMessage draftMessage) {
        if (!m32448cl()) {
            if (draftMessage == null || draftMessage.replyToMessageId == 0) {
                m32215uj(false);
            } else {
                AbstractC4761s4 e0 = this.f10030x0.m7808E0().m8121e0(draftMessage.replyToMessageId);
                if (e0 != null) {
                    m32442cr(e0.m25993Z3(), false, false);
                } else {
                    this.f30167b.m2270r4().m14783o(new TdApi.GetMessage(j, draftMessage.replyToMessageId), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            View$OnClickListenerC2971rh.this.m32550Un(j, draftMessage, object);
                        }
                    });
                }
            }
            this.f10038z0.setDraft(draftMessage != null ? draftMessage.inputMessageText : null);
        }
    }

    @Override
    public void mo4052y1(final long j, final long j2) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2971rh.this.m32395gm(j, j2);
            }
        });
    }

    @Override
    public void mo8373y5(final String str) {
        m32665Lo(false, null, new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC2971rh.this.m32290om(str, z, messageSchedulingState, z2);
            }
        });
    }

    @Override
    public void mo8830yc() {
        C7045v2 v2Var = this.f9948Z0;
        if (v2Var != null) {
            v2Var.setPagingEnabled(true);
        }
        if (this.f9956b3) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m9298Zb();
                }
            });
        }
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        C2977c0 w9 = m9139w9();
        if (w9 == null) {
            return false;
        }
        super.mo9122yd(bundle, str);
        bundle.putInt(str + "type", w9.f10048a);
        String str2 = str + "chat_id";
        TdApi.Chat chat = w9.f10049b;
        bundle.putLong(str2, chat != null ? chat.f25367id : 0L);
        String str3 = str + "chat_list";
        TdApi.ChatList chatList = w9.f10050c;
        bundle.putString(str3, chatList != null ? C4779t2.m25456o4(chatList) : "");
        C4779t2.m25553a5(bundle, str + "filter_", w9.f10057j);
        if (w9.f10048a == 1 || w9.f10048a == 4) {
            bundle.putInt(str + "mode", w9.f10052e);
            if (w9.f10051d != null) {
                bundle.putLong(str + "message_id", w9.f10051d.m17026d());
                bundle.putLong(str + "message_chat_id", w9.f10051d.m17027c());
            }
        }
        if (w9.f10048a == 2) {
            bundle.putInt(str + "mode", w9.f10054g);
        }
        if (w9.f10048a == 3 || w9.f10048a == 4) {
            bundle.putString(str + "query", w9.f10055h);
            C4779t2.m25539c5(bundle, str + "sender_", w9.f10056i);
        }
        bundle.putBoolean(str + "scheduled", w9.f10058k);
        return true;
    }

    public final boolean m32164yi() {
        TdApi.Message Ak = m32813Ak();
        return !m32229ti() && this.f9957c1 == 0 && Ak != null && Ak.canBeEdited && C4779t2.m25633O(Ak.content);
    }

    public boolean m32163yj(long j) {
        return mo9464C9() == j;
    }

    public int m32162yk() {
        C6035e<AbstractC4761s4> eVar = this.f9880C1;
        if (eVar != null) {
            return eVar.m21496p();
        }
        return 0;
    }

    public void m32158yo(String str) {
        RunnableC9558i0 i0Var = this.f10038z0;
        i0Var.m8249v0("@" + str + " ", true);
    }

    public void m32157yp(final List<String> list, final boolean z, boolean z2, boolean z3, final TdApi.MessageSchedulingState messageSchedulingState) {
        if (m32761Ek()) {
            final long j = this.f10002q0.f25367id;
            final boolean gl = m32396gl();
            final boolean z4 = z3 || m32328lo();
            final long ko = z2 ? m32341ko() : 0L;
            C4356b0.m28201k().m28195q(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2971rh.this.m32758En(list, gl, j, ko, z4, messageSchedulingState, z);
                }
            });
        }
    }

    public void m32156yq(Object obj) {
        if (m32761Ek()) {
            if (obj instanceof C4729p) {
                m32602Qo((C4729p) obj);
            } else if (obj instanceof C4609c7) {
                RunnableC9558i0 i0Var = this.f10038z0;
                if (i0Var != null) {
                    i0Var.m8249v0(obj.toString(), true);
                }
            } else if (obj instanceof String) {
                m32703Ip((String) obj, false, false, false, false, null);
            } else if (obj instanceof TdApi.User) {
                m32209up((TdApi.User) obj, true, C4779t2.m25502i0());
            } else if (obj instanceof C4695l6) {
                m32615Po((C4695l6) obj);
            } else if (obj instanceof C4822w2) {
                C4822w2 w2Var = (C4822w2) obj;
                if (w2Var.m25155c()) {
                    this.f30167b.m2231tb(this.f10002q0.f25367id, m32266qk(), 0L, false, false, new TdApi.InputMessageGame(w2Var.m25156b(), w2Var.m25157a()));
                } else if (w2Var.m25154d()) {
                    if (C7316a.m17049l(this.f10002q0.f25367id)) {
                        m32742Fq(w2Var.m25157a());
                        return;
                    } else {
                        this.f30167b.m2295pb(w2Var.m25156b(), this.f10002q0.f25367id, w2Var.m25157a());
                        return;
                    }
                } else if (C7316a.m17052i(this.f10002q0.f25367id)) {
                    return;
                }
                this.f30167b.m2270r4().m14783o(new TdApi.AddChatMember(this.f10002q0.f25367id, w2Var.m25156b(), 0), C2127ad.f7510a);
            } else if (obj instanceof TdApi.Message) {
                m32594Rj((TdApi.Message) obj);
            } else if (obj instanceof TdApi.Audio) {
                m32261qp((TdApi.Audio) obj, false);
            } else if (obj instanceof C4640g) {
                final C4640g gVar = (C4640g) obj;
                m32157yp(Collections.singletonList(gVar.m26661a()), false, false, false, null);
                C4383l.m28059a().m28058b(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2971rh.m32616Pn(C4640g.this);
                    }
                });
            }
        }
    }

    @Override
    public void mo3245z0() {
        C10791k1.m3308c(this);
    }

    public boolean m32151zi(boolean z) {
        if (!z ? m32761Ek() : m32671Li()) {
            TdApi.Chat chat = this.f10002q0;
            if (chat != null && this.f30167b.m2916C2(chat) && !this.f9991n1) {
                return true;
            }
        }
        return false;
    }

    public boolean m32150zj(long j, long j2) {
        int i;
        C4737p7 p7Var;
        return mo9464C9() == j && (!(j2 == 0 || (p7Var = this.f9987m1) == null || p7Var.m26294g() != j2) || (i == 0 && this.f9987m1 == null));
    }

    public C6855c3 m32149zk() {
        return this.f9891G0;
    }

    public final void m32145zo(long j, TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard, boolean z, boolean z2) {
        if (this.f10012s2 == null) {
            ScrollView scrollView = new ScrollView(mo4347s());
            this.f10008r2 = scrollView;
            C10192g.m5782i(scrollView, R.id.theme_color_chatKeyboard, this);
            ViewTreeObserver$OnPreDrawListenerC9542g gVar = new ViewTreeObserver$OnPreDrawListenerC9542g(mo4347s());
            this.f10012s2 = gVar;
            gVar.setThemeProvider(this);
            this.f10012s2.setCallback(this);
            this.f10008r2.addView(this.f10012s2);
            this.f10008r2.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f10012s2.getSize()));
            this.f10022v0.addView(this.f10008r2);
            this.f10018u0.getViewTreeObserver().addOnPreDrawListener(this.f10012s2);
            this.f10008r2.setVisibility(8);
        }
        if (this.f10000p2 != j) {
            this.f10000p2 = j;
            this.f10004q2 = replyMarkupShowKeyboard;
            this.f10012s2.setKeyboard(replyMarkupShowKeyboard);
        }
        if (z2) {
            C4868i.m24726c2().m24685h3(this.f30167b.m2188w6(), mo9464C9(), j, false);
        }
        if (z || (replyMarkupShowKeyboard.isPersonal && !C4868i.m24726c2().m24795S5(this.f30167b.m2188w6(), mo9464C9(), j))) {
            if (this.f9914N2) {
                this.f9996o2 = this.f9917O2;
                m32645Nj();
            } else {
                this.f9996o2 = m9348S9();
            }
            this.f10008r2.setVisibility(0);
            this.f9992n2 = true;
            if (this.f9996o2) {
                m32207ur(R.drawable.baseline_keyboard_24);
                this.f10012s2.m8385c(this.f10038z0);
                return;
            }
            m32207ur(R.drawable.baseline_direction_arrow_down_24);
            return;
        }
        this.f10008r2.setVisibility(8);
        m32207ur(R.drawable.deproko_baseline_bots_keyboard_26);
    }

    public void m32144zp(final long j, final String str, final boolean z, final boolean z2, boolean z3, TdApi.MessageSchedulingState messageSchedulingState) {
        if (m32761Ek()) {
            m32665Lo(z3, messageSchedulingState, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z4, TdApi.MessageSchedulingState messageSchedulingState2, boolean z5) {
                    View$OnClickListenerC2971rh.this.m32745Fn(z, j, str, z2, z4, messageSchedulingState2, z5);
                }
            });
        }
    }

    public void m32143zq(TdApi.Message message) {
        m32807Aq(message.chatId, new TdApi.Message[]{message});
    }

    public void m32142zr() {
        RunnableC9558i0 i0Var = this.f10038z0;
        if (i0Var != null) {
            i0Var.m8310D0(this.f10002q0, this.f9987m1, this.f30167b.m2431h3(mo9464C9()));
        }
    }

    public static class C2977c0 {
        public final int f10048a;
        public final TdApi.Chat f10049b;
        public final TdApi.ChatList f10050c;
        public final C7319d f10051d;
        public final int f10052e;
        public final boolean f10053f;
        public final int f10054g;
        public String f10055h;
        public TdApi.MessageSender f10056i;
        public TdApi.SearchMessagesFilter f10057j;
        public boolean f10058k;
        public boolean f10059l;
        public C4737p7 f10060m;
        public C2981e0 f10061n;
        public TdApi.InternalLinkTypeVideoChat f10062o;
        public long f10063p;
        public TdApi.Background f10064q;

        public C2977c0(C10930q6 q6Var, TdApi.ChatList chatList, TdApi.Chat chat, C4737p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f10048a = 0;
            this.f10050c = chatList;
            this.f10049b = chat;
            this.f10060m = p7Var;
            int F0 = C9678w2.m7805F0(q6Var.m2188w6(), chat, p7Var);
            this.f10052e = F0;
            this.f10051d = C9678w2.m7801G0(q6Var.m2188w6(), chat, p7Var, F0);
            this.f10057j = searchMessagesFilter;
            this.f10053f = false;
            this.f10054g = 0;
        }

        public C2977c0 m32140b(long j) {
            this.f10063p = j;
            return this;
        }

        public C2977c0 m32139c(C2981e0 e0Var) {
            this.f10061n = e0Var;
            return this;
        }

        public C2977c0 m32138d(boolean z) {
            this.f10059l = z;
            return this;
        }

        public C2977c0 m32137e(boolean z) {
            this.f10058k = z;
            return this;
        }

        public C2977c0 m32136f(TdApi.Background background) {
            this.f10064q = background;
            return this;
        }

        public C2977c0 m32135g(TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat) {
            this.f10062o = internalLinkTypeVideoChat;
            return this;
        }

        public C2977c0(TdApi.ChatList chatList, TdApi.Chat chat, C4737p7 p7Var, C7319d dVar, int i, TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f10048a = 1;
            this.f10050c = chatList;
            this.f10049b = chat;
            this.f10060m = p7Var;
            this.f10051d = dVar;
            this.f10052e = i;
            this.f10057j = searchMessagesFilter;
            this.f10053f = false;
            this.f10054g = 0;
        }

        public C2977c0(int i, TdApi.ChatList chatList, TdApi.Chat chat) {
            this.f10048a = 2;
            this.f10054g = i;
            this.f10049b = chat;
            this.f10050c = chatList;
            this.f10053f = true;
            this.f10052e = 0;
            this.f10051d = null;
        }

        public C2977c0(TdApi.ChatList chatList, TdApi.Chat chat, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f10048a = 3;
            this.f10049b = chat;
            this.f10050c = chatList;
            this.f10055h = str;
            this.f10056i = messageSender;
            this.f10057j = searchMessagesFilter;
            this.f10053f = true;
            this.f10054g = 4;
            this.f10052e = 0;
            this.f10051d = null;
        }

        public C2977c0(TdApi.ChatList chatList, TdApi.Chat chat, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter, C7319d dVar, int i) {
            this.f10048a = 4;
            this.f10049b = chat;
            this.f10050c = chatList;
            this.f10055h = str;
            this.f10056i = messageSender;
            this.f10057j = searchMessagesFilter;
            this.f10053f = true;
            this.f10054g = 4;
            this.f10051d = dVar;
            this.f10052e = i;
        }
    }
}
