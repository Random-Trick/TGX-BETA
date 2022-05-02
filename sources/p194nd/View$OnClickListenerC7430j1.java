package p194nd;

import ad.GestureDetector$OnGestureListenerC0256a;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1362c;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1408x;
import be.C1410y;
import cd.C2104l;
import gd.AbstractC4718o;
import gd.AbstractC4761s4;
import gd.C4583a5;
import gd.C4656h6;
import gd.C4666i7;
import gd.C4714n5;
import gd.C4779t2;
import ge.C4868i;
import ie.AbstractC5411l0;
import ie.RunnableC5390g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.AbstractC6828a;
import me.C6840b0;
import me.C6846b1;
import me.C6879f3;
import me.C6883g1;
import me.C6890g4;
import me.C6924j2;
import me.C6973n0;
import me.C7029t0;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.ImageLoader;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.x00;
import p051db.C3940f;
import p051db.C3950k;
import p067ed.C4183a;
import p080fb.C4335b;
import p080fb.C4336c;
import p080fb.C4341g;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p111he.View$OnTouchListenerC5103c0;
import p124ib.C5320c;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5918j;
import p156kd.AbstractC6264v;
import p156kd.AbstractC6266x;
import p156kd.C6240c;
import p156kd.C6244g;
import p156kd.C6246h;
import p156kd.C6252k;
import p156kd.C6253l;
import p156kd.C6257p;
import p156kd.C6267y;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p194nd.C7401b0;
import p194nd.C7468n1;
import p194nd.C7484p1;
import p194nd.C7490r;
import p194nd.RunnableC7470o;
import p209od.C7851a;
import p209od.C7855b;
import p209od.C7856c;
import p209od.C7857d;
import p225pd.C8111a;
import p225pd.C8112b;
import p225pd.C8113c;
import p239qd.AbstractC8323a;
import p239qd.C8328e;
import p253rc.AbstractC8424a;
import p254rd.C8429d;
import p254rd.C8431f;
import p254rd.C8434g;
import p291uc.C9639r;
import p291uc.RunnableC9558i0;
import p291uc.View$OnClickListenerC9694y;
import p335xd.C10192g;
import p350yd.C10552b0;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import p364zd.C11514c0;
import p364zd.C11524j;
import sc.C8731d;
import sd.C8863a;
import sd.C8864b;
import sd.C8867c;
import sd.C8872e;
import td.AbstractC9165c2;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9202h2;
import td.C9289s;
import td.C9310u0;
import td.C9357x2;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC7430j1 extends AbstractC9323v4<C7448r> implements C6924j2.AbstractC6928d, C3950k.AbstractC3952b, View.OnClickListener, AbstractC7515z, C7490r.AbstractC7491a, AbstractC6266x, C7468n1.AbstractC7469a, C7401b0.AbstractC7403b, ViewTreeObserver$OnPreDrawListenerC7081z0.AbstractC7087f, RunnableC9558i0.AbstractC9563e, View$OnClickListenerC9694y.AbstractC9703i, RunnableC7470o.AbstractC7472b, C7484p1.AbstractC7485a, C11052v1.AbstractC11053a, AbstractC9201h1, Client.AbstractC7865g, AbstractC9213j1, C6924j2.AbstractC6934j, GestureDetector$OnGestureListenerC0256a.AbstractC0257a, C10552b0.AbstractC10553a, C8867c.AbstractC8868a, C8431f.AbstractC8433b, C7401b0.AbstractC7404c, C9639r.AbstractC9641b {
    public static final Interpolator f23458E4 = new OvershootInterpolator(0.97f);
    public static final Interpolator f23459F4 = new OvershootInterpolator(0.82f);
    public static final int[][] f23460G4 = {new int[]{1, 1, R.id.btn_proportion_square, R.drawable.baseline_crop_square_24}, new int[]{3, 2, R.id.btn_proportion_3_2, R.drawable.baseline_crop_5_4_24}, new int[]{4, 3, R.id.btn_proportion_4_3, R.drawable.baseline_crop_3_2_24}, new int[]{16, 9, R.id.btn_proportion_16_9, R.drawable.baseline_crop_16_9_24}};
    public View$OnClickListenerC9694y f23461A0;
    public boolean f23463A2;
    public int f23464A3;
    public C4868i.C4889t f23465A4;
    public float f23466B0;
    public C3950k f23467B1;
    public C6924j2 f23468B2;
    public int f23469B3;
    public C4868i.C4889t f23470B4;
    public boolean f23471C0;
    public FrameLayoutFix f23472C1;
    public boolean f23473C2;
    public int f23474C3;
    public List<C4868i.C4889t> f23475C4;
    public C3950k f23476D0;
    public C7401b0 f23477D1;
    public GestureDetector$OnGestureListenerC0256a f23478D2;
    public int f23479D3;
    public boolean f23480D4;
    public ViewTreeObserver$OnPreDrawListenerC7081z0 f23481E0;
    public FrameLayoutFix f23482E1;
    public boolean f23483E2;
    public int f23484E3;
    public boolean f23485F0;
    public C7425i f23486F1;
    public boolean f23487F2;
    public int f23488F3;
    public boolean f23489G0;
    public C7425i f23490G1;
    public C8112b f23491G2;
    public int f23492G3;
    public int f23493H0;
    public View f23494H1;
    public float f23495H2;
    public C3950k f23496H3;
    public C8112b f23497I0;
    public C7465m1 f23498I1;
    public float f23499I2;
    public C8328e f23500I3;
    public C7449s f23502J1;
    public float f23503J2;
    public C6253l f23504J3;
    public float f23505K0;
    public C7425i f23506K1;
    public float f23507K2;
    public Bitmap f23508K3;
    public C7425i f23510L1;
    public float f23511L2;
    public C6246h f23512L3;
    public float f23513M0;
    public FrameLayoutFix f23514M1;
    public float f23515M2;
    public C8111a f23516M3;
    public boolean f23517N0;
    public LinearLayout f23518N1;
    public float f23519N2;
    public C6257p f23520N3;
    public float f23521O0;
    public C7425i f23522O1;
    public float f23523O2;
    public int f23524O3;
    public C3950k f23525P0;
    public C7425i f23526P1;
    public float f23527P2;
    public int f23528P3;
    public C7425i f23530Q1;
    public float f23531Q2;
    public C6267y f23532Q3;
    public C9202h2 f23534R1;
    public float f23535R2;
    public C8111a f23536R3;
    public C3950k f23537S0;
    public FrameLayoutFix f23538S1;
    public C3950k f23539S2;
    public boolean f23540S3;
    public float f23541T0;
    public LinearLayout f23542T1;
    public boolean f23543T2;
    public boolean f23544T3;
    public boolean f23545U0;
    public View f23546U1;
    public float f23547U2;
    public C7855b f23548U3;
    public boolean f23549V0;
    public ImageView f23550V1;
    public C3940f f23551V2;
    public C7851a f23552V3;
    public float f23553W0;
    public ImageView f23554W1;
    public RunnableC7454x f23555W2;
    public C7857d f23556W3;
    public boolean f23557X0;
    public C7489q1 f23558X1;
    public C8731d f23559X2;
    public C3950k f23561Y0;
    public C7450t f23562Y1;
    public C7451u f23563Y2;
    public float f23565Z0;
    public C6840b0 f23566Z1;
    public LinearLayoutManager f23567Z2;
    public boolean f23568Z3;
    public C8112b f23569a1;
    public C7422h f23570a2;
    public C3940f f23571a3;
    public float f23572a4;
    public float f23573b1;
    public View f23574b2;
    public boolean f23575b3;
    public C3950k f23576b4;
    public float f23577c1;
    public LinearLayout f23578c2;
    public float f23579c3;
    public int f23580c4;
    public boolean f23581d1;
    public C9289s f23582d2;
    public int f23583d3;
    public C7856c f23584d4;
    public int f23585e1;
    public View$OnClickListenerC9170d1 f23586e2;
    public int f23587e3;
    public C7856c f23588e4;
    public int f23589f1;
    public RecyclerView f23590f2;
    public long f23591f3;
    public Bitmap f23592f4;
    public float f23593g1;
    public C7490r f23594g2;
    public boolean f23595g3;
    public int f23596g4;
    public float f23597h1;
    public FrameLayoutFix f23598h2;
    public float f23599h3;
    public float f23600h4;
    public boolean f23601i1;
    public C7484p1 f23602i2;
    public float f23604i4;
    public boolean f23605j1;
    public TextView f23606j2;
    public int f23607j3;
    public boolean f23608j4;
    public C3950k f23609k1;
    public FrameLayoutFix f23610k2;
    public C3950k f23611k3;
    public boolean f23612k4;
    public boolean f23613l1;
    public C7425i f23614l2;
    public int f23615l3;
    public boolean f23616l4;
    public C3950k f23617m1;
    public C7425i f23618m2;
    public int f23619m3;
    public C3950k f23620m4;
    public boolean f23621n0;
    public float f23622n1;
    public C7468n1 f23623n2;
    public C7453w f23624n3;
    public C8112b f23625n4;
    public int f23626o0;
    public float f23627o1;
    public FrameLayoutFix f23628o2;
    public float f23629o3;
    public int f23630o4;
    public AbstractC7459k1 f23631p0;
    public float f23632p1;
    public C8864b f23633p2;
    public int f23634p3;
    public int f23635p4;
    public AbstractC7511x f23636q0;
    public float f23637q1;
    public C8872e f23638q2;
    public int f23639q3;
    public C8431f f23640q4;
    public AbstractC7513y f23641r0;
    public float f23642r1;
    public C6879f3 f23643r2;
    public int f23644r3;
    public C8431f f23645r4;
    public C8113c f23646s0;
    public C3950k f23647s1;
    public ImageView f23648s2;
    public int f23649s3;
    public C8328e f23650s4;
    public TdApi.SearchMessagesFilter f23651t0;
    public float f23652t1;
    public C7425i f23653t2;
    public int f23654t3;
    public C9357x2.C9370l f23655t4;
    public long f23656u0;
    public float f23657u1;
    public C8867c f23658u2;
    public boolean f23659u3;
    public int f23660u4;
    public C3950k f23661v0;
    public float f23662v1;
    public float f23663v2;
    public C3950k f23664v3;
    public int f23666w0;
    public float f23667w1;
    public C3950k f23668w2;
    public float f23669w3;
    public boolean f23670w4;
    public C7462l1 f23671x0;
    public float f23672x1;
    public boolean f23673x2;
    public C7506v f23674x3;
    public int f23675x4;
    public boolean f23676y0;
    public float f23677y1;
    public float f23678y2;
    public C7503u f23679y3;
    public int f23680y4;
    public boolean f23681z0;
    public C3950k f23683z2;
    public int f23684z3;
    public float f23685z4;
    public int f23501J0 = -1;
    public Path f23509L0 = new Path();
    public boolean f23529Q0 = true;
    public float f23533R0 = 1.0f;
    public boolean f23682z1 = true;
    public float f23462A1 = 1.0f;
    public int f23603i3 = -1;
    public C3940f f23560X3 = new C3940f(18, this, C2057b.f7280b, 140);
    public int f23564Y3 = -1;
    public boolean f23665v4 = true;

    public class C7431a extends View {
        public C7431a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !View$OnClickListenerC7430j1.this.f23659u3) {
                return false;
            }
            View$OnClickListenerC7430j1.this.m16311Vl(false);
            return true;
        }
    }

    public class C7432b extends FrameLayoutFix {
        public float f23687M;
        public float f23688N;

        public C7432b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3 && View$OnClickListenerC7430j1.this.f23601i1) {
                        View$OnClickListenerC7430j1.this.f23601i1 = false;
                        return true;
                    }
                } else if (View$OnClickListenerC7430j1.this.f23601i1) {
                    if (Math.max(Math.abs(this.f23687M - motionEvent.getX()), Math.abs(this.f23688N - motionEvent.getY())) < C1357a0.m37534p()) {
                        View$OnClickListenerC7430j1.this.m16138qm();
                    }
                    View$OnClickListenerC7430j1.this.f23601i1 = false;
                    return true;
                }
            } else if (View$OnClickListenerC7430j1.this.f23565Z0 == 1.0f && (View$OnClickListenerC7430j1.this.f23647s1 == null || !View$OnClickListenerC7430j1.this.f23647s1.m29531v())) {
                View$OnClickListenerC7430j1.this.f23601i1 = true;
                this.f23687M = motionEvent.getX();
                this.f23688N = motionEvent.getY();
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public class C7433c extends C6973n0 {
        public C7433c(Context context, C10930q6 q6Var) {
            super(context, q6Var);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1399s0.m37205P(this, motionEvent) && super.onTouchEvent(motionEvent);
        }
    }

    public class C7434d extends RecyclerView.AbstractC0901o {
        public C7434d() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            rect.set(recyclerView.m39421k0(view) == View$OnClickListenerC7430j1.this.f23679y3.mo6153D() + (-1) ? C1357a0.m37541i(4.0f) : 0, C1357a0.m37541i(6.0f), C1357a0.m37541i(4.0f), C1357a0.m37541i(6.0f));
        }
    }

    public class C7435e extends RecyclerView.AbstractC0901o {
        public C7435e() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            rect.set(0, recyclerView.m39421k0(view) == 0 ? C1357a0.m37541i(16.0f) : 0, 0, 0);
        }
    }

    public class C7436f implements C7484p1.AbstractC7485a {
        public int f23693a = -1;

        public C7436f() {
        }

        @Override
        public void mo15839U0(C7484p1 p1Var, float f) {
            int round = Math.round(f * (View$OnClickListenerC7430j1.this.f23475C4.size() - 1));
            if (this.f23693a != round) {
                this.f23693a = round;
                View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                j1Var.f23470B4 = (C4868i.C4889t) j1Var.f23475C4.get(this.f23693a);
                if (this.f23693a == View$OnClickListenerC7430j1.this.f23475C4.size() - 1 && (View$OnClickListenerC7430j1.this.f23465A4.f16716a.m24484b() || (!View$OnClickListenerC7430j1.this.f23470B4.f16716a.m24484b() && View$OnClickListenerC7430j1.this.f23470B4.f16716a.f16719a < View$OnClickListenerC7430j1.this.f23465A4.f16716a.f16719a))) {
                    View$OnClickListenerC7430j1 j1Var2 = View$OnClickListenerC7430j1.this;
                    j1Var2.f23470B4 = new C4868i.C4889t(j1Var2.f23465A4);
                }
                View$OnClickListenerC7430j1.this.m16438Fm();
            }
        }

        @Override
        public void mo15838q2(C7484p1 p1Var, boolean z) {
            if (!z) {
                View$OnClickListenerC7430j1.this.f23602i2.m15847b(this.f23693a * (1.0f / (View$OnClickListenerC7430j1.this.f23475C4.size() - 1)));
            }
        }

        @Override
        public boolean mo15837s0(C7484p1 p1Var) {
            return true;
        }
    }

    public class C7437g implements C8864b.AbstractC8866b {
        public C7437g() {
        }

        @Override
        public void mo11069a(C8864b bVar, boolean z) {
            View$OnClickListenerC7430j1.this.m16211hm();
        }

        @Override
        public void mo11068b(C8864b bVar, boolean z) {
            if (z) {
                C4868i.m24726c2().m24582u2(131072L);
            }
        }
    }

    public class C7438h implements C7851a.AbstractC7852a {
        public C7438h() {
        }

        @Override
        public void mo14833a() {
            View$OnClickListenerC7430j1.this.m16288Yj();
        }

        @Override
        public void mo14832b(float f) {
            View$OnClickListenerC7430j1.this.m16172ml(f);
        }
    }

    public class C7439i extends View$OnClickListenerC9694y {
        public C7439i(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View$OnClickListenerC7430j1.this.f23468B2.getMeasuredHeight());
        }
    }

    public class C7440j extends RecyclerView.AbstractC0910t {
        public boolean f23698a;

        public C7440j() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            boolean z = true;
            boolean z2 = i != 0;
            if (!z2) {
                View$OnClickListenerC7430j1.this.f23595g3 = false;
                if (this.f23698a) {
                    View$OnClickListenerC7430j1.this.f23472C1.requestDisallowInterceptTouchEvent(false);
                }
            }
            this.f23698a = z2;
            View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
            if (!z2 || !j1Var.f23595g3) {
                z = false;
            }
            j1Var.m16253cm(z);
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (!View$OnClickListenerC7430j1.this.f23595g3) {
                boolean z = false;
                View$OnClickListenerC7430j1.this.f23595g3 = Math.abs(i) > 1 && this.f23698a;
                View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                if (this.f23698a && j1Var.f23595g3) {
                    z = true;
                }
                j1Var.m16253cm(z);
            }
            if (i != 0 && this.f23698a) {
                View$OnClickListenerC7430j1.this.m16372Oh();
            }
        }
    }

    public class C7441k implements AbstractView$OnTouchListenerC7889a.AbstractC7897h {
        public C7441k() {
        }

        @Override
        public void mo6938O0(int i, boolean z) {
        }

        @Override
        public void mo6929S4() {
        }

        @Override
        public void mo6904d6() {
            View$OnClickListenerC7430j1.this.f23477D1.m16519l2();
        }

        @Override
        public void mo6871o6() {
            View$OnClickListenerC7430j1.this.f23477D1.m16518m2();
        }
    }

    public class C7442l extends FrameLayoutFix {
        public int f23701M;
        public int f23702N;
        public float f23703O;
        public float f23704P;
        public float f23705Q;
        public float f23706R;
        public float f23707S;
        public float f23708T;
        public boolean f23709U;

        public C7442l(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (View$OnClickListenerC7430j1.this.f23513M0 != 0.0f) {
                float max = Math.max(0.0f, Math.min(1.0f, View$OnClickListenerC7430j1.this.f23513M0));
                boolean z = Build.VERSION.SDK_INT >= 19 && View$OnClickListenerC7430j1.this.f23509L0 != null && !View$OnClickListenerC7430j1.this.f23487F2 && View$OnClickListenerC7430j1.this.f23495H2 == 0.0f && View$OnClickListenerC7430j1.this.f23499I2 == 0.0f && View$OnClickListenerC7430j1.this.f23671x0 != null && View$OnClickListenerC7430j1.this.f23513M0 > 0.0f && View$OnClickListenerC7430j1.this.f23513M0 < 1.0f && !View$OnClickListenerC7430j1.this.f23671x0.m15994f();
                int b = z ? C10192g.m5789b(canvas, View$OnClickListenerC7430j1.this.f23509L0) : Integer.MIN_VALUE;
                if (View$OnClickListenerC7430j1.this.f23671x0 != null && View$OnClickListenerC7430j1.this.f23513M0 < 1.0f && !View$OnClickListenerC7430j1.this.f23487F2 && View$OnClickListenerC7430j1.this.f23495H2 == 0.0f && View$OnClickListenerC7430j1.this.f23499I2 == 0.0f) {
                    View$OnClickListenerC7430j1.this.f23671x0.m15997c(canvas);
                }
                float f = max * (1.0f - View$OnClickListenerC7430j1.this.f23565Z0);
                if (f > 0.0f) {
                    canvas.drawColor(((int) (f * 255.0f)) << 24);
                }
                if (z) {
                    C10192g.m5785f(canvas, b);
                }
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z = true;
            if (View$OnClickListenerC7430j1.this.f23539S2 != null && View$OnClickListenerC7430j1.this.f23539S2.m29531v()) {
                return true;
            }
            if (View$OnClickListenerC7430j1.this.f23626o0 == 4 || View$OnClickListenerC7430j1.this.f23471C0 || this.f23709U) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23703O = motionEvent.getX();
                this.f23704P = motionEvent.getY();
                View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                if (!j1Var.m16168nh() || View$OnClickListenerC7430j1.this.f23565Z0 != 0.0f || View$OnClickListenerC7430j1.this.f23477D1.getCurrentZoom() != 1.0f || !View$OnClickListenerC7430j1.this.f23477D1.m16526a2()) {
                    z = false;
                }
                j1Var.f23483E2 = z;
            } else if (action == 2) {
                if (View$OnClickListenerC7430j1.this.f23483E2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(this.f23704P - y) >= C1357a0.m37533q() && Math.abs(this.f23703O - x) < C1357a0.m37534p() * 1.65f) {
                        View$OnClickListenerC7430j1.this.f23477D1.m16533U1(0, 0.0f);
                        View$OnClickListenerC7430j1.this.f23483E2 = false;
                        this.f23708T = x;
                        this.f23707S = y;
                        View$OnClickListenerC7430j1.this.m16465Cl(x, y);
                        return true;
                    } else if (Math.abs(this.f23703O - x) >= C1357a0.m37532r()) {
                        View$OnClickListenerC7430j1.this.f23483E2 = false;
                    }
                } else if (View$OnClickListenerC7430j1.this.f23487F2) {
                    return true;
                } else {
                    if (View$OnClickListenerC7430j1.this.f23601i1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.max(Math.abs(this.f23703O - x2), Math.abs(this.f23704P - y2)) > C1357a0.m37533q()) {
                            View$OnClickListenerC7430j1.this.f23601i1 = false;
                            this.f23705Q = this.f23703O - x2;
                            this.f23706R = this.f23704P - y2;
                            this.f23703O = x2;
                            this.f23704P = y2;
                            View$OnClickListenerC7430j1.this.m16351Ql(true, 0.0f, 0.0f);
                            return true;
                        }
                    } else if (View$OnClickListenerC7430j1.this.f23605j1) {
                        return true;
                    }
                }
            }
            View$OnClickListenerC7430j1.this.f23478D2.m41994a(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3;
            View$OnClickListenerC7430j1.this.m16456Dm(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), true, true);
            super.onMeasure(i, i2);
            if (View$OnClickListenerC7430j1.this.f23626o0 == 3) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int i4 = this.f23701M;
                if (i4 == 0 || (i3 = this.f23702N) == 0) {
                    this.f23701M = measuredWidth;
                    this.f23702N = measuredHeight;
                } else if (i4 != measuredWidth || i3 != measuredHeight) {
                    this.f23701M = measuredWidth;
                    this.f23702N = measuredHeight;
                    View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                    j1Var.m16399Kk(j1Var.f23684z3);
                }
            }
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.C7442l.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            this.f23709U = z;
        }
    }

    public class C7443m extends ViewOutlineProvider {
        public final int[] f23711a = new int[2];

        public C7443m() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (View$OnClickListenerC7430j1.this.m16110ui(this.f23711a)) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i = measuredWidth / 2;
                int[] iArr = this.f23711a;
                int i2 = measuredHeight / 2;
                outline.setRect(i - (iArr[0] / 2), i2 - (iArr[1] / 2), i + (iArr[0] / 2), i2 + (iArr[1] / 2));
                return;
            }
            outline.setEmpty();
        }
    }

    public class C7444n extends RunnableC9558i0 {
        public boolean f23713y0;

        public C7444n(Context context, C10930q6 q6Var) {
            super(context, q6Var);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View$OnClickListenerC7430j1.this.f23461A0 != null) {
                View$OnClickListenerC7430j1.this.f23461A0.m7575B2(true);
            }
        }

        @Override
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            View$OnClickListenerC7430j1.this.f23472C1.requestDisallowInterceptTouchEvent(this.f23713y0);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z = C1399s0.m37205P(this, motionEvent) && super.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23713y0 = true;
            } else if (action == 1 || action == 3) {
                this.f23713y0 = false;
            }
            return z;
        }
    }

    public class C7445o implements TextWatcher {
        public final RunnableC9558i0 f23715a;

        public C7445o(RunnableC9558i0 i0Var) {
            this.f23715a = i0Var;
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (View$OnClickListenerC7430j1.this.f23473C2) {
                View$OnClickListenerC7430j1.this.f23473C2 = false;
            } else {
                View$OnClickListenerC7430j1.this.f23646s0.m13461g().m13474w0(this.f23715a.mo8279f(false));
            }
        }
    }

    public class C7446p extends LinearLayout {
        public C7446p(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return (getVisibility() == 0 && getAlpha() == 1.0f) ? false : true;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            View$OnClickListenerC7430j1.this.m16477Bh();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC7430j1.this.m16477Bh();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return getVisibility() == 0 && getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
        }
    }

    public class C7447q implements C6890g4.AbstractC6893c {
        public boolean f23718a;

        public C7447q() {
        }

        @Override
        public void mo6838a(C6890g4 g4Var, double d, double d2, double d3, int i, long j) {
            View$OnClickListenerC7430j1.this.f23646s0.m13461g().m13550K().m20833o1((long) (1000000.0d * d), d2, d3, i, j);
        }

        @Override
        public void mo6837b(C6890g4 g4Var, boolean z) {
            if (z) {
                boolean z2 = View$OnClickListenerC7430j1.this.f23581d1;
                this.f23718a = z2;
                if (z2) {
                    View$OnClickListenerC7430j1.this.m16124sk();
                }
            } else if (this.f23718a) {
                View$OnClickListenerC7430j1.this.f23646s0.m13461g().m13480t0(View$OnClickListenerC7430j1.this.f23498I1);
            }
        }

        @Override
        public boolean mo6836c(C6890g4 g4Var) {
            return true;
        }

        @Override
        public void mo6835d(C6890g4 g4Var, float f) {
            View$OnClickListenerC7430j1.this.f23477D1.setSeekProgress(f);
        }

        @Override
        public void mo6834e(C6890g4 g4Var, double d, double d2, double d3) {
            boolean z;
            C8112b g = View$OnClickListenerC7430j1.this.f23646s0.m13461g();
            if (d2 == 0.0d && d3 == d) {
                z = g.m13550K().m20834n1(-1L, -1L, (long) (1000000.0d * d));
            } else {
                z = g.m13550K().m20834n1((long) (d2 * 1000000.0d), (long) (d3 * 1000000.0d), (long) (1000000.0d * d));
            }
            if (z) {
                boolean j = g.m13501j();
                RunnableC7470o V1 = View$OnClickListenerC7430j1.this.f23477D1 != null ? View$OnClickListenerC7430j1.this.f23477D1.m16532V1(View$OnClickListenerC7430j1.this.f23646s0.m13461g()) : null;
                if (V1 != null) {
                    V1.m15922f0(j);
                    long timeNow = V1.getTimeNow();
                    long timeTotal = V1.getTimeTotal();
                    if (timeNow == -1 || timeTotal == -1) {
                        timeNow = 0;
                        timeTotal = (long) ((d3 - d2) * 1000.0d);
                    }
                    View$OnClickListenerC7430j1.this.f23558X1.m15830D1(timeTotal, timeNow, true, true);
                    return;
                }
                g.mo13519a();
            }
        }
    }

    public static class C7449s extends View {
        public Drawable f23737a = C1362c.m37482g(getResources(), R.drawable.baseline_keyboard_arrow_left_24);
        public boolean f23738b;

        public C7449s(Context context) {
            super(context);
        }

        public void m16044a(boolean z) {
            if (this.f23738b != z) {
                this.f23738b = z;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight = (getMeasuredHeight() / 2) - (this.f23737a.getMinimumHeight() / 2);
            if (this.f23738b) {
                canvas.save();
                canvas.rotate(180.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
                C1362c.m37487b(canvas, this.f23737a, 0.0f, measuredHeight, C1410y.m37055W(-1));
                canvas.restore();
                return;
            }
            C1362c.m37487b(canvas, this.f23737a, 0.0f, measuredHeight, C1410y.m37055W(-1));
        }
    }

    public static class C7450t extends View implements AbstractC4761s4.AbstractC4769h {
        public Paint f23739M;
        public C4714n5 f23740a;
        public String f23741b;
        public int f23742c;

        public C7450t(Context context) {
            super(context);
            Paint paint = new Paint(5);
            this.f23739M = paint;
            paint.setTypeface(C1389o.m37260i());
            this.f23739M.setTextSize(C1357a0.m37541i(19.0f));
            this.f23739M.setColor(-1);
        }

        @Override
        public void mo16043a(boolean z) {
            C4714n5 n5Var = this.f23740a;
            if (n5Var != null) {
                if (z) {
                    m16040d(n5Var.m26126M3());
                }
                invalidate();
            }
        }

        public void m16042b() {
            C4714n5 n5Var = this.f23740a;
            if (n5Var != null) {
                n5Var.m25979a9(null);
            }
        }

        public void m16041c(C4714n5 n5Var) {
            if (!n5Var.m25928g6()) {
                this.f23740a = n5Var;
                m16040d(n5Var.m26126M3());
                n5Var.m25979a9(this);
            }
        }

        public final void m16040d(String str) {
            String str2 = this.f23741b;
            if (str2 == null || !str2.equals(str)) {
                this.f23741b = str;
                this.f23742c = (int) C7389v0.m16680T1(str, this.f23739M);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            if (this.f23740a != null) {
                int i2 = C1357a0.m37541i(18.0f);
                int i3 = C1357a0.m37541i(10.0f);
                int i4 = i2 + i3;
                RectF a0 = C1410y.m37050a0();
                int i5 = C1357a0.m37541i(16.0f);
                C1357a0.m37541i(4.0f);
                float f = i4 - i3;
                float f2 = i4 + i3;
                a0.set(f, f, f2, f2);
                canvas.drawArc(a0, -90.0f, this.f23740a.m26144K3() * (-360.0f), true, C1410y.m37039g(-1));
                canvas.drawText(this.f23741b, i + i5, C1357a0.m37541i(35.5f), this.f23739M);
            }
        }
    }

    public static class C7451u extends RecyclerView.AbstractC0890h<C7456z> {
        public final Context f23743M;
        public final View$OnClickListenerC7430j1 f23744N;
        public C7453w f23745O;

        public C7451u(Context context, View$OnClickListenerC7430j1 j1Var) {
            this.f23743M = context;
            this.f23744N = j1Var;
        }

        @Override
        public int mo6153D() {
            C7453w wVar = this.f23745O;
            if (wVar != null) {
                return wVar.m16014s();
            }
            return 0;
        }

        public void mo6146Q(C7456z zVar, int i) {
            C7455y Q = C7456z.m16000Q(zVar.f3479a);
            C7453w wVar = this.f23745O;
            if (wVar != null) {
                Q.m16003i(wVar.m16028e(i), this.f23745O);
                int max = Math.max(4, this.f23744N.f23555W2.getChildCount());
                if (i >= this.f23745O.m16014s() - max) {
                    this.f23744N.m16409Jj(true, true);
                } else if (i - max <= 0) {
                    this.f23744N.m16409Jj(true, false);
                }
            } else {
                Q.m16003i(null, null);
            }
        }

        public C7456z mo6145S(ViewGroup viewGroup, int i) {
            return C7456z.m16001P(this.f23743M, this.f23744N);
        }

        public void mo6144V(C7456z zVar) {
            C1399s0.m37172l(C7456z.m16000Q(zVar.f3479a));
        }

        public void mo6143W(C7456z zVar) {
            C1399s0.m37160r(C7456z.m16000Q(zVar.f3479a));
        }

        public void m16033h0(C7453w wVar) {
            C7453w wVar2 = this.f23745O;
            if (wVar2 == null) {
                this.f23745O = wVar;
                if (wVar != null) {
                    m39308M(0, wVar.m16014s());
                }
            } else if (wVar == null) {
                int s = wVar2.m16014s();
                this.f23745O = null;
                if (s > 0) {
                    m39307N(0, s);
                }
            } else if (wVar2.m16014s() == wVar.m16014s()) {
                this.f23745O = wVar;
                m39309L(0, wVar.m16014s());
            } else {
                int s2 = this.f23745O.m16014s();
                this.f23745O = null;
                m39307N(0, s2);
                this.f23745O = wVar;
                m39308M(0, wVar.m16014s());
            }
        }
    }

    public static class C7452v extends RecyclerView.AbstractC0901o {
        public final C7451u f23746a;

        public C7452v(C7451u uVar) {
            this.f23746a = uVar;
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            C7455y Q = C7456z.m16000Q(view);
            C8112b e = Q.m16006e();
            C7453w g = Q.m16005g();
            int measuredWidth = (recyclerView.getMeasuredWidth() / 2) - (this.f23746a.f23744N.m16176mh() / 2);
            if (g == null || e == null) {
                int k0 = recyclerView.m39421k0(view);
                if (k0 != -1) {
                    int D = recyclerView.getAdapter().mo6153D();
                    if (C4403w.m27984G2()) {
                        rect.left = k0 == D + (-1) ? measuredWidth : 0;
                        if (k0 != 0) {
                            measuredWidth = 0;
                        }
                        rect.right = measuredWidth;
                        return;
                    }
                    rect.left = k0 == 0 ? measuredWidth : 0;
                    if (k0 != D - 1) {
                        measuredWidth = 0;
                    }
                    rect.right = measuredWidth;
                }
            } else if (C4403w.m27984G2()) {
                rect.left = g.m16022k() == e ? measuredWidth : 0;
                if (g.m16024i() != e) {
                    measuredWidth = 0;
                }
                rect.right = measuredWidth;
            } else {
                rect.left = g.m16024i() == e ? measuredWidth : 0;
                if (g.m16022k() != e) {
                    measuredWidth = 0;
                }
                rect.right = measuredWidth;
            }
        }

        @Override
        public void mo8191i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    C7455y Q = C7456z.m16000Q(childAt);
                    C7453w g = Q.m16005g();
                    C8112b e = Q.m16006e();
                    float f = 1.0f - this.f23746a.f23744N.f23599h3;
                    if (!(g == null || e == null)) {
                        float left = Q.getLeft() + (Q.getMeasuredWidth() / 2.0f);
                        int k0 = recyclerView.m39421k0(childAt);
                        if (k0 == -1) {
                            Integer num = (Integer) childAt.getTag();
                            if (num != null) {
                                k0 = num.intValue();
                            } else {
                                k0 = g.m16018o(e);
                                childAt.setTag(Integer.valueOf(k0));
                            }
                        } else {
                            childAt.setTag(null);
                        }
                        if (k0 != -1) {
                            float n = g.m16019n(e, k0, f);
                            left = C4403w.m27984G2() ? left - n : left + n;
                        }
                        Q.m16007d(canvas, (int) left, C1357a0.m37541i(9.0f), childAt.getAlpha(), f);
                    }
                }
            }
        }
    }

    public static class C7453w {
        public final C7451u f23747a;
        public final ArrayList<C8112b> f23748b;
        public int f23749c;
        public C8112b f23750d;
        public C8112b f23752f;
        public float f23754h;
        public int f23751e = -1;
        public int f23753g = -1;

        public C7453w(C7451u uVar, ArrayList<C8112b> arrayList, int i) {
            this.f23747a = uVar;
            this.f23748b = arrayList;
            this.f23749c = i;
        }

        public static int m16027f(C8112b bVar, int i, int i2) {
            int i3;
            if (bVar != null) {
                int Z = bVar.m13520Z();
                int A = bVar.m13570A();
                i3 = (int) (Z * (A != 0 ? i2 / A : 1.0f));
            } else {
                i3 = 0;
            }
            return Math.min(Math.max(i, i3), C1357a0.m37541i(86.0f));
        }

        public void m16029d(ArrayList<C8112b> arrayList, boolean z, boolean z2) {
            int i;
            int size = arrayList.size();
            int i2 = 0;
            if (z2) {
                ArrayList<C8112b> arrayList2 = null;
                long j = this.f23748b.get(0).getMessage().mediaAlbumId;
                int max = Math.max(1, 10 - this.f23748b.size());
                if (z) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        C8112b bVar = arrayList.get(size2);
                        if (bVar.getMessage().mediaAlbumId != j) {
                            break;
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>(max);
                        }
                        arrayList2.add(bVar);
                    }
                } else {
                    Iterator<C8112b> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C8112b next = it.next();
                        if (next.getMessage().mediaAlbumId != j) {
                            break;
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>(max);
                        }
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
                if (arrayList == null) {
                    if (z) {
                        this.f23749c += size;
                        return;
                    }
                    return;
                }
            }
            int size3 = arrayList.size();
            if (z) {
                this.f23749c += size - size3;
            }
            if (z) {
                arrayList.size();
                this.f23748b.addAll(0, arrayList);
                i = 0;
            } else {
                i = this.f23748b.size();
                this.f23748b.addAll(arrayList);
            }
            if (this.f23747a.f23745O == this) {
                if (z) {
                    m16015r(size3);
                }
                this.f23747a.f23744N.m16336Sk();
                this.f23747a.m39308M(i, size3);
                this.f23747a.m39312I(i);
                this.f23747a.f23744N.f23555W2.m39504A0();
                View$OnClickListenerC7430j1 j1Var = this.f23747a.f23744N;
                if (z) {
                    i2 = size3;
                }
                j1Var.m16369Ok(i2);
            }
        }

        public C8112b m16028e(int i) {
            ArrayList<C8112b> arrayList = this.f23748b;
            if (arrayList == null || i < 0 || i >= arrayList.size()) {
                return null;
            }
            return this.f23748b.get(i);
        }

        public float m16026g() {
            return this.f23754h;
        }

        public float m16025h(C8112b bVar) {
            if (bVar == null) {
                return 0.0f;
            }
            if (bVar == this.f23750d) {
                return this.f23754h;
            }
            if (bVar == this.f23752f) {
                return 1.0f - this.f23754h;
            }
            return 0.0f;
        }

        public C8112b m16024i() {
            return m16028e(0);
        }

        public int m16023j() {
            return this.f23751e;
        }

        public C8112b m16022k() {
            ArrayList<C8112b> arrayList = this.f23748b;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            ArrayList<C8112b> arrayList2 = this.f23748b;
            return arrayList2.get(arrayList2.size() - 1);
        }

        public long m16021l() {
            return this.f23748b.get(0).getMessage().mediaAlbumId;
        }

        public int m16020m() {
            return this.f23753g;
        }

        public float m16019n(C8112b bVar, int i, float f) {
            float i2 = C1357a0.m37541i(5.0f);
            float f2 = this.f23754h * f;
            int i3 = C1357a0.m37541i(43.0f);
            int mh = this.f23747a.f23744N.m16176mh();
            C8112b bVar2 = this.f23750d;
            float f3 = -1.0f;
            float f4 = 0.0f;
            if (!(bVar2 == null || bVar2 == bVar || f2 <= 0.0f)) {
                f4 = 0.0f + ((((m16027f(bVar2, mh, i3) - mh) / 2) + i2) * f2 * (i < this.f23751e ? -1.0f : 1.0f));
            }
            C8112b bVar3 = this.f23752f;
            if (bVar3 == null || bVar3 == bVar || f2 >= 1.0f) {
                return f4;
            }
            float f5 = (i2 + ((m16027f(bVar3, mh, i3) - mh) / 2)) * (1.0f - f2);
            if (i >= this.f23753g) {
                f3 = 1.0f;
            }
            return f4 + (f5 * f3);
        }

        public int m16018o(C8112b bVar) {
            return this.f23748b.indexOf(bVar);
        }

        public boolean m16017p(int i, int i2, float f) {
            if (this.f23751e == i && this.f23753g == i2 && this.f23754h == f) {
                return false;
            }
            this.f23751e = i;
            this.f23750d = m16028e(i);
            this.f23753g = i2;
            this.f23752f = m16028e(i2);
            this.f23754h = f;
            return true;
        }

        public void m16016q(C8112b bVar, int i, float f) {
            this.f23750d = bVar;
            this.f23751e = i;
            this.f23754h = f;
        }

        public final void m16015r(int i) {
            int i2 = this.f23751e;
            if (i2 != -1) {
                this.f23751e = i2 + i;
            }
            int i3 = this.f23753g;
            if (i3 != -1) {
                this.f23753g = i3 + i;
            }
        }

        public int m16014s() {
            ArrayList<C8112b> arrayList = this.f23748b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        public int m16013t(int i) {
            int i2;
            ArrayList<C8112b> arrayList = this.f23748b;
            if (arrayList == null || i < (i2 = this.f23749c) || i >= i2 + arrayList.size()) {
                return -1;
            }
            return i - this.f23749c;
        }

        public void m16012u() {
            int i = this.f23753g;
            C8112b bVar = this.f23752f;
            this.f23753g = this.f23751e;
            this.f23752f = this.f23750d;
            this.f23751e = i;
            this.f23750d = bVar;
            this.f23754h = 1.0f - this.f23754h;
        }
    }

    public static class RunnableC7454x extends RecyclerView implements Runnable, C4336c.AbstractC4337a {
        public final C4336c f23755u1;
        public boolean f23756v1;
        public View$OnClickListenerC7430j1 f23757w1;
        public int f23758x1;

        public RunnableC7454x(Context context) {
            super(context);
            C4336c cVar = new C4336c(this);
            this.f23755u1 = cVar;
            cVar.m28243h(true);
        }

        @Override
        public boolean mo7429B(float f, float f2) {
            return C4335b.m28258d(this, f, f2);
        }

        @Override
        public void mo7428C(View view, float f, float f2) {
            if (!(this.f23757w1.m16208ih() || f2 < 0.0f || f2 > getMeasuredHeight() || this.f23757w1.f23595g3 || this.f23757w1.m16330Ti())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null) {
                        C7455y Q = C7456z.m16000Q(childAt);
                        C8112b e = Q.m16006e();
                        C7453w g = Q.m16005g();
                        if (g != null && Q.f23763a.m20978i(f, f2) && this.f23757w1.m16315Vh(e, g, g.m16018o(e), true)) {
                            C2065g.m35719c(this);
                            return;
                        }
                    }
                }
            }
        }

        @Override
        public void mo7427F(View view, float f, float f2) {
            C4335b.m28254h(this, view, f, f2);
        }

        public final boolean m16011G1() {
            View$OnClickListenerC7430j1 j1Var = this.f23757w1;
            return j1Var != null && !j1Var.f23477D1.m16525b2() && this.f23757w1.f23547U2 == 1.0f && C1399s0.m37218C(this);
        }

        public void m16010H1() {
            this.f23756v1 = true;
        }

        public void m16009I1(View$OnClickListenerC7430j1 j1Var) {
            this.f23757w1 = j1Var;
        }

        @Override
        public boolean mo7426K4() {
            return C4335b.m28261a(this);
        }

        @Override
        public boolean mo7425W6(float f, float f2) {
            return C4335b.m28259c(this, f, f2);
        }

        @Override
        public void mo7424Z4(View view, float f, float f2) {
            C4335b.m28256f(this, view, f, f2);
        }

        @Override
        public void mo7419f3(View view, float f, float f2) {
            C4335b.m28257e(this, view, f, f2);
        }

        @Override
        public long getLongPressDuration() {
            return C4335b.m28260b(this);
        }

        @Override
        public boolean mo7418n0(View view, float f, float f2) {
            return true;
        }

        @Override
        public void mo7417o2(View view, float f, float f2) {
            C4335b.m28255g(this, view, f, f2);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent) || (motionEvent.getAction() == 0 && !m16011G1());
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            if (this.f23758x1 != measuredWidth) {
                this.f23758x1 = measuredWidth;
                post(this);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z = false;
            if (motionEvent.getAction() == 0 && !m16011G1()) {
                return false;
            }
            boolean z2 = motionEvent.getAction() == 0;
            if (z2 && this.f23757w1.m16330Ti() && !this.f23757w1.m16363Ph()) {
                return false;
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (!z2) {
                boolean z3 = this.f23756v1 || this.f23757w1.m16208ih();
                this.f23756v1 = z3;
                if (z3) {
                    return onTouchEvent;
                }
            }
            this.f23756v1 = false;
            if (this.f23755u1.m28246e(this, motionEvent) || onTouchEvent) {
                z = true;
            }
            return z;
        }

        @Override
        public void mo7416p(View view, float f, float f2) {
            C4335b.m28253i(this, view, f, f2);
        }

        @Override
        public void run() {
            this.f23757w1.m16391Lk();
        }

        @Override
        public boolean mo7415z4(View view, float f, float f2) {
            return C4335b.m28251k(this, view, f, f2);
        }

        @Override
        public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
            C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
        }
    }

    public static class C7455y extends View implements AbstractC6828a, AbstractC5911c, C4341g.AbstractC4342a {
        public boolean f23759M = true;
        public int f23760N;
        public int f23761O;
        public int f23762P;
        public C6240c f23763a;
        public C7453w f23764b;
        public C8112b f23765c;

        public C7455y(Context context, RecyclerView recyclerView) {
            super(context);
            this.f23763a = new C6240c(recyclerView, 0);
        }

        @Override
        public void mo13519a() {
            C8112b bVar = this.f23765c;
            if (bVar != null && bVar.m13560F() == null) {
                this.f23763a.m20982d().m20819G(this.f23765c.m13532T(C1357a0.m37541i(43.0f) + (C1357a0.m37541i(9.0f) * 2), false));
            }
        }

        @Override
        public void mo4501a3() {
            this.f23763a.mo20249Z();
        }

        @Override
        public void mo8229b() {
            this.f23763a.mo20247b();
            this.f23759M = false;
            C8112b bVar = this.f23765c;
            if (bVar != null) {
                bVar.m13491o(this);
            }
        }

        public void m16007d(Canvas canvas, int i, int i2, float f, float f2) {
            m16004h();
            if (this.f23760N != 0 && this.f23762P != 0) {
                C7453w wVar = this.f23764b;
                float h = wVar != null ? wVar.m16025h(this.f23765c) * f2 : 0.0f;
                int i3 = this.f23760N;
                int i4 = i3 + ((int) ((this.f23761O - i3) * h));
                int i5 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i5 != 0) {
                    this.f23763a.mo20250U(f);
                }
                int i6 = i - (i4 / 2);
                if (this.f23763a.mo20246c0()) {
                    canvas.drawRect(i6, i2, i6 + i4, this.f23762P + i2, C1410y.m37039g(285212671));
                }
                this.f23763a.mo20256K0(i6, i2, i4 + i6, this.f23762P + i2);
                this.f23763a.draw(canvas);
                if (i5 != 0) {
                    this.f23763a.mo20253P();
                }
            }
        }

        public C8112b m16006e() {
            return this.f23765c;
        }

        @Override
        public void mo8225f() {
            this.f23763a.mo20245f();
            this.f23759M = true;
            C8112b bVar = this.f23765c;
            if (bVar != null) {
                bVar.m13517b(this);
            }
        }

        public C7453w m16005g() {
            return this.f23764b;
        }

        public final boolean m16004h() {
            int i = C1357a0.m37541i(1.0f);
            int i2 = C1357a0.m37541i(9.0f);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return false;
            }
            int i3 = measuredHeight - (i2 * 2);
            int i4 = measuredWidth - i;
            int f = C7453w.m16027f(this.f23765c, i4, i3);
            if (this.f23760N == i4 && this.f23761O == f && this.f23762P == i3) {
                return false;
            }
            this.f23760N = i4;
            this.f23761O = f;
            this.f23762P = i3;
            return true;
        }

        public void m16003i(C8112b bVar, C7453w wVar) {
            C8112b bVar2 = this.f23765c;
            if (bVar2 != bVar) {
                if (bVar2 != null && this.f23759M) {
                    bVar2.m13491o(this);
                }
                this.f23765c = bVar;
                this.f23764b = wVar;
                this.f23763a.m20977j(bVar.m13530U(), bVar.m13532T(C1357a0.m37541i(43.0f) + (C1357a0.m37541i(9.0f) * 2), false));
                m16004h();
                if (this.f23759M) {
                    bVar.m13517b(this);
                }
                invalidate();
            } else if (this.f23764b != wVar) {
                this.f23764b = wVar;
                invalidate();
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            m16004h();
        }
    }

    public static class C7456z extends RecyclerView.AbstractC0886d0 {
        public C7456z(View view) {
            super(view);
        }

        public static C7456z m16001P(Context context, View$OnClickListenerC7430j1 j1Var) {
            C7455y yVar = new C7455y(context, j1Var.f23555W2);
            yVar.setLayoutParams(new RecyclerView.LayoutParams(j1Var.m16176mh(), -1));
            return new C7456z(yVar);
        }

        public static C7455y m16000Q(View view) {
            return (C7455y) view;
        }
    }

    public View$OnClickListenerC7430j1(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m16483Aj(boolean z, boolean z2, boolean z3, boolean z4, TdApi.MessageSchedulingState messageSchedulingState, boolean z5) {
        m16312Vk(z, messageSchedulingState, z2, z3);
    }

    public void m16475Bj(C6246h hVar, Bitmap bitmap) {
        C6246h hVar2 = this.f23512L3;
        if (hVar2 == hVar) {
            m16278Zl(hVar2, this.f23504J3, bitmap);
            this.f23500I3.m12815s(this.f23504J3, this.f23508K3.getWidth(), this.f23508K3.getHeight(), this.f23508K3, this.f23516M3, this.f23504J3.m20896t());
            this.f23500I3.setEditorVisible(true);
        }
    }

    public void m16467Cj() {
        if (!m9347Sa() && !this.f23471C0) {
            m16457Dl(true);
        }
    }

    public void m16459Dj(View view, int i) {
        m16211hm();
    }

    public boolean m16450Ej(View view, int i) {
        int i2 = 3;
        switch (i) {
            case R.id.paint_mode_arrow:
                i2 = 2;
                break;
            case R.id.paint_mode_fill:
                int brushColor = this.f23633p2.getPreview().getBrushColor();
                C8434g gVar = new C8434g(3);
                gVar.m12450y(brushColor, 0.0f);
                this.f23640q4.m12501b(gVar);
                this.f23640q4.m12479x(gVar);
                return true;
            case R.id.paint_mode_path:
                i2 = 1;
                break;
            case R.id.paint_mode_rect:
                break;
            case R.id.paint_mode_zoom:
                i2 = 100;
                break;
            default:
                return true;
        }
        m16415Il(i2, true);
        return true;
    }

    public void m16441Fj(C8112b bVar, HandlerC10770jj.C10787p pVar) {
        if (this.f23646s0.m13461g() == bVar) {
            int b = pVar.m3331b();
            bVar.m13535R0(b);
            this.f23534R1.setValue(b != 0 ? HandlerC10770jj.m3593f3(b, TimeUnit.SECONDS, false) : null);
            if (b != 0) {
                m16320Uk();
            }
        }
    }

    public boolean m16433Gj(View view, int i) {
        if (i != R.id.btn_discard) {
            return true;
        }
        m16094wh(0, 2);
        return true;
    }

    public void m16264bj(int i, Bitmap bitmap) {
        m16245dm(false);
        if (bitmap != null) {
            C6252k A0 = this.f23646s0.m13461g().m13569A0(this.f23516M3);
            this.f30167b.m2429h5().m23150B0(A0, bitmap);
            m16283Zg(A0, bitmap);
            m16085xh(i);
            return;
        }
        C1379j0.m37290z0("Error while saving changes, sorry", 0);
    }

    public boolean m16256cj(View view, int i) {
        if (i == R.id.btn_crop_reset) {
            m16424Hk(true);
        } else if (i == R.id.btn_proportion_free) {
            m16180ll(0, 0);
        } else if (i == R.id.btn_proportion_original) {
            int targetWidth = this.f23552V3.getTargetWidth();
            int targetHeight = this.f23552V3.getTargetHeight();
            m16180ll(Math.max(targetWidth, targetHeight), Math.min(targetWidth, targetHeight));
        } else {
            int[] iArr = null;
            int[][] iArr2 = f23460G4;
            int length = iArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int[] iArr3 = iArr2[i2];
                if (iArr3[2] == i) {
                    iArr = iArr3;
                    break;
                }
                i2++;
            }
            if (iArr != null) {
                m16180ll(iArr[0], iArr[1]);
            }
        }
        return true;
    }

    public boolean m16248dj() {
        return this.f23680y4 == 0;
    }

    public void m16240ej(View view) {
        if (view.getId() == R.id.btn_sendAsFile) {
            m16312Vk(false, null, false, true);
        }
    }

    public void m16232fj(List list) {
        String str;
        int qh = m16143qh();
        if (qh != 0) {
            boolean z = qh == 2;
            AbstractC7511x xVar = this.f23636q0;
            int P0 = xVar != null ? xVar.mo11242P0() : 1;
            if (P0 <= 1) {
                str = C4403w.m27869i1(z ? R.string.SendOriginal : R.string.SendAsFile);
            } else {
                str = C4403w.m27844o2(z ? R.string.SendXOriginals : R.string.SendAsXFiles, P0);
            }
            list.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendAsFile, str, (int) R.drawable.baseline_insert_drive_file_24).m23937j(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC7430j1.this.m16240ej(view);
                }
            }).m23940g(4096L));
        }
    }

    public void m16223gj(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        m16312Vk(z, messageSchedulingState, z2, false);
    }

    public void m16214hj(RunnableC9558i0 i0Var) {
        if (!this.f23473C2) {
            this.f23646s0.m13461g().m13474w0(i0Var.mo8279f(false));
        }
    }

    public static void m16213hk(AbstractC9323v4<?> v4Var, TdApi.Chat chat, AbstractC8424a aVar) {
        if (C7316a.m17049l(chat.f25367id)) {
            m16173mk(v4Var, v4Var.mo4348c().m2541a4(chat.f25367id), aVar);
        } else if (!v4Var.m9292ab()) {
            C8113c cVar = new C8113c(v4Var.mo4347s(), v4Var.mo4348c());
            cVar.m13446v(new C8112b(v4Var.mo4347s(), v4Var.mo4348c(), chat.f25367id, chat.photo));
            C7448r rVar = new C7448r(v4Var, 2, cVar);
            if (aVar != null) {
                aVar.mo9812t1(chat, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public void m16206ij(View view) {
        C6883g1 x = this.f23646s0.m13461g().m13473x();
        if (x != null) {
            x.m18647U(view);
        }
    }

    public static void m16205ik(AbstractC9323v4<?> v4Var, C8112b bVar) {
        if (!v4Var.m9292ab()) {
            boolean z = v4Var instanceof AbstractC8424a;
            C8113c cVar = null;
            if (z) {
                cVar = ((AbstractC8424a) v4Var).mo9832R4(bVar.mo13513d(), null);
            }
            if (cVar == null) {
                cVar = new C8113c(v4Var.mo4347s(), v4Var.mo4348c());
                cVar.m13446v(C8112b.m13499k(bVar));
            }
            C7448r rVar = new C7448r(v4Var, 0, cVar);
            rVar.f23731l = true;
            rVar.f23729j = true;
            if (bVar.m13510e0()) {
                rVar.f23736q = new TdApi.SearchMessagesFilterAnimation();
            }
            if (z) {
                ((AbstractC8424a) v4Var).mo9812t1(bVar, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public void m16198jj(View view) {
        C6883g1 x = this.f23646s0.m13461g().m13473x();
        if (x != null) {
            x.m18647U(view);
        }
    }

    public static void m16197jk(C4583a5 a5Var) {
        C8112b V0;
        AbstractC9323v4<?> P0 = a5Var.m26096P0();
        if (!P0.m9292ab() && (V0 = C8112b.m13527V0(P0.mo4347s(), P0.mo4348c(), a5Var.m25993Z3())) != null) {
            V0.m13543N0(a5Var);
            C8113c cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
            cVar.m13446v(V0);
            C7448r rVar = new C7448r(P0, 2, cVar);
            rVar.f23731l = true;
            if (P0 instanceof AbstractC8424a) {
                ((AbstractC8424a) P0).mo9812t1(a5Var, rVar);
            }
            rVar.f23727h = a5Var.m26002Y5();
            m16140qk(P0, rVar);
        }
    }

    public static float m16192kh(int i, int i2, float f, float f2) {
        return ((i * (-f2)) + (i2 * f2)) * f;
    }

    public static void m16189kk(C4714n5 n5Var, long j) {
        TdApi.SearchMessagesFilterAnimation searchMessagesFilterAnimation;
        AbstractC9323v4<?> P0 = n5Var.m26096P0();
        TdApi.Message a4 = n5Var.m25984a4(j);
        C8112b V0 = C8112b.m13527V0(P0.mo4347s(), P0.mo4348c(), a4);
        if (V0 != null) {
            int constructor = a4.content.getConstructor();
            C8113c cVar = null;
            if (constructor != 1306939396) {
                if (constructor == 2021281344 && Build.VERSION.SDK_INT < 14) {
                    C1379j0.m37342Z(n5Var.m26096P0(), null, new File(((TdApi.MessageVideo) a4.content).video.video.local.path), "video/mp4", C4779t2.m25423t2(a4.interactionInfo));
                }
                searchMessagesFilterAnimation = null;
            } else {
                searchMessagesFilterAnimation = new TdApi.SearchMessagesFilterAnimation();
            }
            if (!P0.m9292ab()) {
                boolean z = P0 instanceof AbstractC8424a;
                if (z) {
                    cVar = ((AbstractC8424a) P0).mo9832R4(a4.f25406id, searchMessagesFilterAnimation);
                }
                if (cVar == null) {
                    cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
                    cVar.m13446v(V0);
                }
                C7448r rVar = new C7448r(P0, 0, cVar);
                rVar.f23727h = n5Var.m26002Y5();
                if (z) {
                    ((AbstractC8424a) P0).mo9812t1(a4, rVar);
                }
                rVar.m16047q(searchMessagesFilterAnimation);
                m16140qk(P0, rVar);
            }
        }
    }

    public static void m16182lj(View view, Rect rect) {
        rect.top += C1357a0.m37541i(8.0f);
        rect.bottom -= C1357a0.m37541i(8.0f);
        rect.left -= C1357a0.m37541i(4.0f);
        rect.right -= C1357a0.m37541i(4.0f);
    }

    public static void m16181lk(C4656h6 h6Var) {
        C4666i7 ga2;
        AbstractC9323v4<?> P0 = h6Var.m26096P0();
        if (!P0.m9292ab() && (ga2 = h6Var.m26623ga()) != null) {
            TdApi.WebPage J = ga2.m26583J();
            C8113c cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
            String str = J.displayUrl;
            TdApi.Message Z3 = h6Var.m25993Z3();
            h6Var.m26617ma();
            ArrayList<C8112b> B = ga2.m26591B();
            if (B != null) {
                cVar.m13448t(ga2.m26590C(), B);
                if (!C5070i.m24061i(J.author)) {
                    str = J.author;
                }
            } else if (J.sticker != null) {
                cVar.m13446v(new C8112b(P0.mo4347s(), P0.mo4348c(), h6Var.m26145K2(), h6Var.m26115N3(), C4779t2.m25551b0(J.sticker), true).m13539P0(Z3.chatId, Z3.f25406id));
            } else if (J.video != null) {
                cVar.m13446v(new C8112b(P0.mo4347s(), P0.mo4348c(), J.video, new TdApi.FormattedText("", null), true).m13539P0(Z3.chatId, Z3.f25406id));
            } else if (J.animation != null) {
                cVar.m13446v(new C8112b(P0.mo4347s(), P0.mo4348c(), J.animation, (TdApi.FormattedText) null).m13539P0(Z3.chatId, Z3.f25406id));
            } else if (J.photo != null) {
                cVar.m13446v(new C8112b(P0.mo4347s(), P0.mo4348c(), h6Var.m26145K2(), h6Var.m26115N3(), J.photo).m13539P0(Z3.chatId, Z3.f25406id));
            } else {
                return;
            }
            C7448r rVar = new C7448r(P0, 0, cVar);
            rVar.f23727h = true;
            rVar.f23728i = str;
            rVar.f23730k = J.url;
            rVar.f23729j = true;
            if (P0 instanceof AbstractC8424a) {
                ((AbstractC8424a) P0).mo9812t1(h6Var, rVar);
            }
            m16140qk(P0, rVar);
        }
    }

    public void m16174mj(long j, TdApi.PhotoSize photoSize) {
        HandlerC10770jj.m3698U7(this, j, photoSize.photo.f25373id, null, m16142qi());
    }

    public static void m16173mk(AbstractC9323v4<?> v4Var, TdApi.User user, AbstractC8424a aVar) {
        if (!v4Var.m9292ab() && user.profilePhoto != null) {
            C8113c cVar = new C8113c(v4Var.mo4347s(), v4Var.mo4348c());
            cVar.m13446v(new C8112b(v4Var.mo4347s(), v4Var.mo4348c(), user.f25439id, user.profilePhoto));
            C7448r rVar = new C7448r(v4Var, 1, cVar);
            if (aVar != null) {
                aVar.mo9812t1(user, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public void m16166nj(final long j, final TdApi.PhotoSize photoSize) {
        if (photoSize != null) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC7430j1.this.m16174mj(j, photoSize);
                }
            });
        }
    }

    public static void m16158oj(AbstractC5918j jVar, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        TdApi.ChatPhoto chatPhoto;
        if (basicGroupFullInfo != null && (chatPhoto = basicGroupFullInfo.photo) != null) {
            jVar.mo1330a(C7321e.m17016B0(chatPhoto.sizes));
        }
    }

    public static void m16149pj(AbstractC5918j jVar, TdApi.UserFullInfo userFullInfo) {
        TdApi.ChatPhoto chatPhoto;
        if (userFullInfo != null && (chatPhoto = userFullInfo.photo) != null) {
            jVar.mo1330a(C7321e.m17016B0(chatPhoto.sizes));
        }
    }

    public static View$OnClickListenerC7430j1 m16148pk(C4714n5 n5Var) {
        AbstractC9323v4<?> P0 = n5Var.m26096P0();
        C8112b V0 = C8112b.m13527V0(P0.mo4347s(), P0.mo4348c(), n5Var.m25993Z3());
        if (V0 == null) {
            return null;
        }
        C8113c cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
        cVar.m13446v(V0);
        V0.m13551J0(n5Var);
        return m16140qk(P0, new C7448r(P0, 4, cVar));
    }

    public static void m16141qj(AbstractC5918j jVar, TdApi.SupergroupFullInfo supergroupFullInfo) {
        TdApi.ChatPhoto chatPhoto;
        if (supergroupFullInfo != null && (chatPhoto = supergroupFullInfo.photo) != null) {
            jVar.mo1330a(C7321e.m17016B0(chatPhoto.sizes));
        }
    }

    public static View$OnClickListenerC7430j1 m16140qk(AbstractC9323v4<?> v4Var, C7448r rVar) {
        View$OnClickListenerC7430j1 j1Var = new View$OnClickListenerC7430j1(v4Var.mo4347s(), v4Var.mo4348c());
        j1Var.m16296Xk(rVar);
        j1Var.m16247dk();
        return j1Var;
    }

    public static void m16133rj(C10930q6.C10943m mVar) {
        C1379j0.m37325i(mVar.f35164a, mVar.f35165b ? R.string.CopiedLink : R.string.CopiedLinkPrivate);
    }

    public static void m16132rk(AbstractC9323v4<?> v4Var, C8113c cVar, String str, AbstractC8424a aVar, boolean z) {
        if (!v4Var.m9292ab()) {
            C7448r rVar = new C7448r(v4Var, 5, cVar);
            rVar.f23726g = str;
            rVar.f23729j = z;
            if (aVar != null) {
                aVar.mo9812t1(cVar, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public static int m16126si(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 100 ? R.drawable.baseline_bubble_chart_24 : R.drawable.baseline_zoom_out_map_24 : R.drawable.baseline_crop_3_2_24 : R.drawable.baseline_arrow_upward_24 : R.drawable.baseline_adjust_24;
    }

    public void m16109uj(double d, double d2, double d3, double d4) {
        if (this.f23544T3) {
            this.f23584d4.m14812r(d, d2, d3, d4);
        }
    }

    public void m16101vj(boolean z) {
        this.f23556W3.setRotateInternally(z);
    }

    public static int m16093wi(int i) {
        if (i == 1) {
            return C1357a0.m37541i(164.0f);
        }
        if (i == 2) {
            return C1357a0.m37541i(72.0f);
        }
        if (i == 3) {
            return C1357a0.m37541i(64.0f);
        }
        if (i != 4) {
            return 0;
        }
        return C1357a0.m37541i(72.0f) + C1357a0.m37541i(24.0f);
    }

    public boolean m16092wj(View view, int i) {
        if (i != R.id.paint_clear) {
            return true;
        }
        m16130rm();
        return true;
    }

    public static int m16084xi(int i) {
        if (i != 2) {
            return 0;
        }
        return C1357a0.m37535o() * 2;
    }

    public boolean m16083xj(View view) {
        C8328e eVar = this.f23650s4;
        if (eVar == null || eVar.getContentWrap().m12805G1()) {
            return false;
        }
        m9254fe(null, new int[]{R.id.paint_clear, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ClearDrawing), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean wj;
                wj = View$OnClickListenerC7430j1.this.m16092wj(view2, i);
                return wj;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        }, m16142qi());
        return true;
    }

    public void m16075yj(C8867c cVar, int i) {
        m16211hm();
    }

    public void m16067zj() {
        C9357x2.C9370l lVar = this.f23655t4;
        if (lVar != null) {
            lVar.m8904U();
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public final void m16485Ah() {
        C8431f fVar = this.f23640q4;
        m16262bl(fVar != null && !fVar.m12494i());
    }

    public final void m16484Ai(boolean z) {
        int i = this.f23684z3;
        if (i != 0) {
            m16094wh(0, (z || i == 3) ? 0 : 2);
        }
    }

    public final boolean m16482Ak() {
        C4868i.C4889t z1 = C4868i.m24726c2().m24547z1();
        this.f23465A4 = z1;
        this.f23470B4 = new C4868i.C4889t(z1);
        return true;
    }

    public final void m16481Al(boolean z) {
        if (this.f23544T3 != z) {
            this.f23544T3 = z;
            if (!z) {
                m16474Bk(2);
                this.f23477D1.setVisibility(0);
            }
            this.f23560X3.m29579l(z ? this.f23584d4.m14818l() ? 160L : 198L : 120L);
            this.f23560X3.m29575p(z, true);
        }
    }

    public final void m16480Am() {
        m16230fl(m16224gi());
        m16204il(m16215hi());
    }

    @Override
    public int mo9472B9() {
        return R.drawable.bg_btn_header_light;
    }

    public final void m16477Bh() {
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23481E0;
        float f = -((z0Var == null || z0Var.getVisibility() != 0 || this.f23481E0.getParent() == null) ? 0 : this.f23481E0.getMeasuredHeight());
        this.f23550V1.setTranslationY(f);
        this.f23554W1.setTranslationY(f);
        this.f23542T1.setTranslationY(f);
        View$OnClickListenerC9694y yVar = this.f23461A0;
        if (yVar != null) {
            yVar.m7575B2(true);
        }
    }

    public final boolean m16476Bi() {
        C7856c v = this.f23646s0.m13461g().m13477v();
        return v != null && !v.m14818l();
    }

    public final void m16474Bk(int i) {
        if (i == 0) {
            this.f23477D1.setDisallowMove(true);
        } else if (i == 1) {
            m16393Li();
        } else if (i == 3) {
            m16385Mi();
        } else if (i == 4) {
            m16378Ni();
        }
    }

    public final void m16473Bl(boolean z) {
        if (this.f23557X0 != z) {
            this.f23557X0 = z;
            this.f23477D1.getBaseCell().getDetector().m15861v();
            this.f23569a1 = this.f23646s0.m13461g();
            if (z) {
                mo4347s().m14469l2(this.f23468B2);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f23477D1.invalidateOutline();
                }
            } else {
                m16164nl(true);
            }
            if (this.f23561Y0 == null) {
                this.f23561Y0 = new C3950k(8, this, C2057b.f7280b, 198L, this.f23565Z0);
            }
            this.f23561Y0.m29544i(z ? 1.0f : 0.0f);
        }
    }

    public final void m16472Bm() {
        this.f30165a.m14460n3(this.f23513M0 * (1.0f - this.f23565Z0));
    }

    public final void m16469Ch() {
        m16439Fl(m16353Qj());
    }

    public final boolean m16468Ci() {
        C8111a z = this.f23646s0.m13461g().m13469z();
        return z != null && !z.m13575k();
    }

    public final void m16466Ck(int i) {
        if (i == 1) {
            RecyclerView recyclerView = this.f23590f2;
            if (recyclerView == null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo4347s(), 1, false);
                C7490r rVar = new C7490r(mo4347s(), linearLayoutManager);
                this.f23594g2 = rVar;
                rVar.m15814f0(this.f23516M3);
                this.f23594g2.m15816e0(this);
                C7498s sVar = new C7498s(mo4347s());
                this.f23590f2 = sVar;
                sVar.setItemAnimator(null);
                this.f23590f2.setOverScrollMode(2);
                this.f23590f2.m39434g(new C7435e());
                this.f23590f2.setLayoutManager(linearLayoutManager);
                this.f23590f2.setAdapter(this.f23594g2);
                this.f23590f2.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                this.f23590f2.setLayoutParams(FrameLayoutFix.m18007t1(-1, m16093wi(1), 80));
                this.f23590f2.setTranslationY(m16093wi(1));
                this.f23590f2.setAlpha(0.0f);
            } else {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).m39522z2(0, 0);
                this.f23594g2.m15814f0(this.f23516M3);
            }
            this.f23538S1.addView(this.f23590f2);
        } else if (i == 2) {
            if (this.f23610k2 == null) {
                FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, m16093wi(2), 80);
                FrameLayoutFix frameLayoutFix = new FrameLayoutFix(mo4347s());
                this.f23610k2 = frameLayoutFix;
                frameLayoutFix.setPadding(0, C1357a0.m37541i(16.0f), 0, 0);
                this.f23610k2.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                this.f23610k2.setLayoutParams(t1);
                this.f23610k2.setAlpha(0.0f);
                C7425i iVar = new C7425i(mo4347s());
                this.f23618m2 = iVar;
                iVar.setId(R.id.btn_rotate);
                this.f23618m2.setOnClickListener(this);
                this.f23618m2.m16489k(R.drawable.baseline_rotate_90_degrees_ccw_24, false, false);
                this.f23618m2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), -1, 5));
                this.f23610k2.addView(this.f23618m2);
                C7425i iVar2 = new C7425i(mo4347s());
                this.f23614l2 = iVar2;
                iVar2.setId(R.id.btn_proportion);
                this.f23614l2.setOnClickListener(this);
                this.f23614l2.m16489k(R.drawable.baseline_image_aspect_ratio_24, false, false);
                this.f23614l2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), -1, 3));
                this.f23610k2.addView(this.f23614l2);
                FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
                s1.leftMargin = C1357a0.m37541i(56.0f);
                s1.rightMargin = C1357a0.m37541i(56.0f);
                C7468n1 n1Var = new C7468n1(mo4347s());
                this.f23623n2 = n1Var;
                n1Var.setCallback(this);
                this.f23623n2.setLayoutParams(s1);
                this.f23610k2.addView(this.f23623n2);
                m16100vk();
            }
            this.f23548U3.setAlpha(0.0f);
            m16091wk();
            this.f23538S1.addView(this.f23610k2);
            this.f23472C1.addView(this.f23548U3, m16362Pi());
        } else if (i == 3) {
            if (this.f23628o2 == null) {
                FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, -1, 80);
                FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(mo4347s());
                this.f23628o2 = frameLayoutFix2;
                frameLayoutFix2.setAlpha(0.0f);
                this.f23628o2.setLayoutParams(t12);
                int i2 = C1357a0.m37541i(56.0f);
                int i3 = C1357a0.m37541i(18.0f);
                int i4 = i3 * 2;
                FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(12.0f) + i4, 80);
                View view = new View(mo4347s());
                view.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                view.setLayoutParams(t13);
                this.f23628o2.addView(view);
                FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), C1357a0.m37541i(48.0f), 83);
                ImageView imageView = new ImageView(mo4347s());
                this.f23648s2 = imageView;
                imageView.setId(R.id.paint_undo);
                this.f23648s2.setOnClickListener(this);
                this.f23648s2.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view2) {
                        boolean xj;
                        xj = View$OnClickListenerC7430j1.this.m16083xj(view2);
                        return xj;
                    }
                });
                this.f23648s2.setScaleType(ImageView.ScaleType.CENTER);
                this.f23648s2.setImageResource(R.drawable.baseline_undo_24);
                this.f23648s2.setColorFilter(-1);
                C1399s0.m37193a0(this.f23648s2);
                this.f23648s2.setBackgroundResource(R.drawable.bg_btn_header_light);
                this.f23648s2.setLayoutParams(t14);
                this.f23628o2.addView(this.f23648s2);
                FrameLayout.LayoutParams t15 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), C1357a0.m37541i(48.0f), 85);
                C7425i iVar3 = new C7425i(mo4347s());
                this.f23653t2 = iVar3;
                iVar3.setId(R.id.btn_paintType);
                this.f23653t2.m16488l();
                this.f23653t2.setOnClickListener(this);
                this.f23653t2.m16489k(m16126si(1), false, false);
                this.f23653t2.setLayoutParams(t15);
                this.f23628o2.addView(this.f23653t2);
                FrameLayout.LayoutParams t16 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(12.0f) + i4, 81);
                int i5 = i2 - i3;
                t16.rightMargin = i5;
                t16.leftMargin = i5;
                C8864b bVar = new C8864b(mo4347s());
                this.f23633p2 = bVar;
                bVar.setToneEventListener(new C7437g());
                this.f23633p2.setPadding(i3, i3, i3, i3);
                this.f23633p2.setLayoutParams(t16);
                this.f23628o2.addView(this.f23633p2);
                FrameLayout.LayoutParams t17 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(220.0f), 80);
                t17.bottomMargin = C1357a0.m37541i(12.0f) + i4;
                C8872e eVar = new C8872e(mo4347s());
                this.f23638q2 = eVar;
                eVar.setAlpha(0.0f);
                this.f23638q2.setLayoutParams(t17);
                this.f23628o2.addView(this.f23638q2);
                C6879f3 f3Var = new C6879f3(mo4347s());
                this.f23643r2 = f3Var;
                f3Var.setSimpleTopShadow(true);
                this.f23643r2.setAlpha(0.0f);
                FrameLayout.LayoutParams t18 = FrameLayoutFix.m18007t1(-1, this.f23643r2.getLayoutParams().height, 80);
                t18.bottomMargin = C1357a0.m37541i(220.0f) + C1357a0.m37541i(12.0f) + i4;
                this.f23643r2.setLayoutParams(t18);
                this.f23628o2.addView(this.f23643r2);
                int i6 = C1357a0.m37541i(78.0f);
                FrameLayout.LayoutParams t19 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(220.0f) + i3 + i6, 80);
                t19.bottomMargin = C1357a0.m37541i(12.0f) + i3;
                C8863a aVar = new C8863a(mo4347s());
                aVar.setPadding(0, i6, 0, 0);
                aVar.setLayoutParams(t19);
                this.f23628o2.addView(aVar);
                FrameLayout.LayoutParams t110 = FrameLayoutFix.m18007t1(C1357a0.m37541i(48.0f), C1357a0.m37541i(48.0f), 83);
                t110.leftMargin = i2 - (C1357a0.m37541i(48.0f) / 2);
                t110.bottomMargin = ((C1357a0.m37541i(12.0f) + i4) / 2) - (C1357a0.m37541i(48.0f) / 2);
                C8867c cVar = new C8867c(mo4347s());
                this.f23658u2 = cVar;
                cVar.setColorChangeListener(new C8867c.AbstractC8869b() {
                    @Override
                    public final void mo11056a(C8867c cVar2, int i7) {
                        View$OnClickListenerC7430j1.this.m16075yj(cVar2, i7);
                    }
                });
                this.f23658u2.setPositionChangeListener(new C8867c.AbstractC8870c() {
                    @Override
                    public final void mo11055a() {
                        View$OnClickListenerC7430j1.this.m16067zj();
                    }
                });
                this.f23658u2.setBrushChangeListener(this);
                this.f23658u2.setTone(this.f23638q2);
                this.f23658u2.setDirection(aVar);
                this.f23658u2.setLayoutParams(t110);
                this.f23628o2.addView(this.f23658u2);
                this.f23638q2.setPreview(this.f23658u2);
                this.f23633p2.setPreview(this.f23658u2);
                this.f23633p2.m11071k(this.f23638q2, this.f23643r2);
                this.f23633p2.setDirection(aVar);
            }
            m16415Il(C8429d.m12504a(), false);
            m16485Ah();
            this.f23658u2.m11064d(true);
            this.f23538S1.addView(this.f23628o2);
        } else if (i == 4) {
            if (this.f23598h2 == null) {
                int wi = m16093wi(4);
                int i7 = C1357a0.m37541i(56.0f);
                C1357a0.m37541i(16.0f);
                int i8 = C1357a0.m37541i(18.0f);
                FrameLayoutFix frameLayoutFix3 = new FrameLayoutFix(mo4347s());
                this.f23598h2 = frameLayoutFix3;
                frameLayoutFix3.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                this.f23598h2.setAlpha(0.0f);
                this.f23598h2.setLayoutParams(FrameLayoutFix.m18007t1(-1, wi, 80));
                C7484p1 p1Var = new C7484p1(mo4347s());
                this.f23602i2 = p1Var;
                p1Var.setListener(new C7436f());
                this.f23602i2.setLayoutParams(FrameLayoutFix.m18006u1(-1, i7, 80, 0, 0, 0, i8));
                this.f23602i2.setAnchorMode(0);
                this.f23602i2.setAddPaddingLeft(C1357a0.m37541i(18.0f));
                this.f23602i2.setAddPaddingRight(C1357a0.m37541i(18.0f));
                this.f23602i2.m15842g(R.id.theme_color_white, false);
                this.f23598h2.addView(this.f23602i2);
                TextView O = C1399s0.m37206O(mo4347s(), 14.0f, C11524j.m228N(R.id.theme_color_white), 3, 2);
                O.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 51, C1357a0.m37541i(15.0f), C1357a0.m37541i(10.0f), C1357a0.m37541i(15.0f), 0));
                O.setText(R.string.QualityWorse);
                this.f23598h2.addView(O);
                TextView O2 = C1399s0.m37206O(mo4347s(), 14.0f, C11524j.m228N(R.id.theme_color_white), 5, 2);
                O2.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 53, C1357a0.m37541i(15.0f), C1357a0.m37541i(10.0f), C1357a0.m37541i(15.0f), 0));
                O2.setText(R.string.QualityBetter);
                this.f23598h2.addView(O2);
                TextView O3 = C1399s0.m37206O(mo4347s(), 15.0f, C11524j.m228N(R.id.theme_color_white), 17, 2);
                this.f23606j2 = O3;
                O3.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 81, 0, 0, 0, C1357a0.m37541i(8.0f)));
                this.f23598h2.addView(this.f23606j2);
            }
            this.f23538S1.addView(this.f23598h2);
            m16430Gm();
        }
    }

    public final void m16465Cl(float f, float f2) {
        this.f23491G2 = this.f23646s0.m13461g();
        this.f23487F2 = true;
    }

    public final void m16464Cm() {
        float f = this.f23462A1 * (1.0f - this.f23622n1);
        this.f23486F1.setAlpha(f);
        this.f23490G1.setAlpha(f);
        this.f23498I1.setAlpha(f);
        this.f23494H1.setAlpha(0.7f * f);
        boolean z = true;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        this.f23486F1.setEnabled(i == 0);
        this.f23490G1.setEnabled(i == 0);
        C7465m1 m1Var = this.f23498I1;
        if (i != 0) {
            z = false;
        }
        m1Var.setEnabled(z);
    }

    @Override
    public void mo8238D4(RunnableC9558i0 i0Var, String str) {
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23481E0;
        if (z0Var != null) {
            z0Var.m17832v2(str);
        }
    }

    @Override
    public long mo8237D5(RunnableC9558i0 i0Var) {
        return m9131x9().f23732m;
    }

    public final void m16461Dh() {
        RunnableC7454x xVar = this.f23555W2;
        if (xVar != null) {
            C8731d dVar = (this.f23513M0 != 1.0f || this.f23547U2 <= 0.0f) ? null : this.f23559X2;
            if (xVar.getItemAnimator() != dVar) {
                this.f23555W2.setItemAnimator(dVar);
            }
        }
    }

    public final boolean m16460Di() {
        C8431f C = this.f23646s0.m13461g().m13566C();
        return C != null && !C.m12494i();
    }

    public final void m16458Dk() {
        if (this.f23485F0) {
            m16073yl(this.f23489G0 || m9348S9());
            m16394Lh(false);
            return;
        }
        m16231fk();
        m16081xl();
    }

    public final void m16457Dl(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i < 14) {
            return;
        }
        if (!z) {
            mo4347s().m14432u3(0, true);
        } else if (this.f23626o0 != 4 || i < 19) {
            mo4347s().m14432u3(1, true);
        } else {
            mo4347s().m14432u3(7, true);
        }
    }

    public final void m16456Dm(int r23, int r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16456Dm(int, int, boolean, boolean):void");
    }

    @Override
    public boolean mo16455E(View view, TdApi.Animation animation) {
        return C6846b1.m18794b(this, view, animation);
    }

    public final void m16452Eh(C8112b bVar, int i) {
        if (bVar != null && bVar.m13469z() != null && !bVar.m13469z().m13575k()) {
            C8111a z = bVar.m13469z();
            bVar.m13569A0(null);
            this.f30167b.m2429h5().m23071y0(C6252k.m20878D0(z));
        }
    }

    public final boolean m16451Ei() {
        View view = this.f23546U1;
        if (view != null) {
            if (view instanceof TextView) {
                return ((TextView) view).getText().length() > 0;
            }
            if (view instanceof C6973n0) {
                return !C5070i.m24061i(((C6973n0) view).getText());
            }
        }
        return false;
    }

    public final void m16449Ek() {
    }

    public final void m16448El(boolean z, boolean z2) {
        if (this.f23636q0 != null) {
            int h = this.f23646s0.m13460h();
            C8112b g = this.f23646s0.m13461g();
            if (!z) {
                m16452Eh(g, h);
            }
            this.f23636q0.mo11240Q1(h, g, z);
            int P0 = this.f23636q0.mo11242P0();
            if (!z || P0 != 1) {
                if (P0 != 0 || z) {
                    this.f23570a2.m9679E(P0);
                } else if (z2) {
                    m16340Sg(0.0f);
                } else {
                    m16257ci(0.0f);
                }
            } else if (z2) {
                m16340Sg(1.0f);
            } else {
                m16257ci(1.0f);
            }
        }
    }

    public final void m16447Em(boolean z) {
        C7465m1 m1Var = this.f23498I1;
        if (m1Var != null) {
            m1Var.m15979a(z, this.f23565Z0 > 0.0f && m1Var.getAlpha() > 0.0f);
        }
    }

    @Override
    public boolean mo16446F4(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        return C6846b1.m18793c(this, view, lVar, z, messageSchedulingState);
    }

    public final void m16443Fh() {
        if (this.f23504J3 != null) {
            if (this.f23508K3 != null) {
                C6244g.m20960k().m20958m(this.f23512L3, this.f23508K3);
            }
            this.f23508K3 = null;
            this.f23504J3 = null;
        }
    }

    public final boolean m16442Fi() {
        int i = this.f23684z3;
        if (i == 1) {
            return m16426Hi();
        }
        if (i == 2) {
            return m16434Gi();
        }
        if (i == 3) {
            return m16418Ii();
        }
        if (i != 4) {
            return false;
        }
        return m16410Ji();
    }

    public final void m16440Fk() {
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23481E0;
        if (z0Var != null && z0Var.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) this.f23481E0.getParent();
            viewGroup.removeView(this.f23481E0);
            viewGroup.requestLayout();
        }
    }

    public final void m16439Fl(boolean z) {
        C3940f fVar = this.f23551V2;
        boolean z2 = true;
        if ((fVar != null && fVar.m29583h()) != z) {
            if (this.f23551V2 == null) {
                this.f23551V2 = new C3940f(21, this, C2057b.f7280b, 150L);
            }
            if (z) {
                m16338Si();
                m16299Xh();
            }
            C3940f fVar2 = this.f23551V2;
            if (this.f23513M0 <= 0.0f) {
                z2 = false;
            }
            fVar2.m29575p(z, z2);
        } else if (z && this.f23626o0 == 0 && !m9131x9().f23729j && this.f23563Y2.f23745O.m16021l() != this.f23646s0.m13461g().getMessage().mediaAlbumId) {
            m16299Xh();
        }
    }

    public final void m16438Fm() {
        int i;
        StringBuilder sb2;
        double d;
        if (this.f23606j2 != null) {
            C6253l K = this.f23646s0.m13461g().m13550K();
            int Y0 = K.m20849Y0();
            int L0 = K.m20862L0();
            int U0 = K.m20853U0();
            long R0 = K.m20856R0();
            double W0 = K.m20851W0();
            double V0 = K.m20852V0();
            double T0 = K.m20854T0(true, TimeUnit.MILLISECONDS) / 1000.0d;
            if (!(W0 == 0.0d || V0 == 0.0d)) {
                if (Y0 > L0) {
                    Y0 = (int) Math.max(W0, V0);
                    d = Math.min(W0, V0);
                } else {
                    Y0 = (int) Math.min(W0, V0);
                    d = Math.max(W0, V0);
                }
                L0 = (int) d;
            }
            int c = this.f23470B4.m24489c(U0);
            C4868i.C4891v d2 = this.f23470B4.m24488d(Y0, L0);
            if (d2 == null) {
                d2 = new C4868i.C4891v(Math.max(Y0, L0), Math.min(Y0, L0));
            }
            long b = this.f23470B4.m24490b(d2, c, R0);
            long j = (long) (0 + ((b * T0) / 8.0d));
            if (!K.m20832p1()) {
                j = (long) (j + ((T0 * 62000.0d) / 8.0d));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C1363c0.m37421n(j, true));
            sb3.append(" • ");
            if (Y0 > L0) {
                sb2 = new StringBuilder();
                sb2.append(d2.f16719a);
                sb2.append("x");
                i = d2.f16720b;
            } else {
                sb2 = new StringBuilder();
                sb2.append(d2.f16720b);
                sb2.append("x");
                i = d2.f16719a;
            }
            sb2.append(i);
            sb3.append(sb2.toString());
            sb3.append(" • ");
            sb3.append(c);
            sb3.append(" FPS");
            sb3.append(" • ");
            sb3.append((b + (K.m20832p1() ? 0 : 6200)) / 1000);
            sb3.append(" kbps");
            this.f23606j2.setText(sb3.toString());
        }
    }

    @Override
    public View mo8869G9() {
        return this.f23582d2;
    }

    public final void m16435Gh() {
        C7451u uVar = this.f23563Y2;
        if (uVar != null) {
            uVar.m16033h0(null);
            this.f23555W2.setItemAnimator(null);
        }
    }

    public final boolean m16434Gi() {
        return !this.f23588e4.m14829a(this.f23584d4);
    }

    public final void m16432Gk() {
        boolean z;
        int i = this.f23684z3;
        if (i == 1) {
            C8111a aVar = this.f23536R3;
            if (aVar != null && this.f23540S3) {
                this.f23516M3.m13573m(aVar);
            }
        } else if (i == 2) {
            C7856c cVar = this.f23588e4;
            if (cVar == null || cVar.m14818l()) {
                if (this.f23584d4.m14820j()) {
                    m16424Hk(false);
                }
                this.f23646s0.m13461g().m13470y0(null);
                return;
            }
            if (!this.f23588e4.m14829a(this.f23584d4)) {
                m16424Hk(false);
            }
            this.f23646s0.m13461g().m13470y0(this.f23588e4);
        } else if (i == 3) {
            C8431f fVar = this.f23645r4;
            if (fVar == null || fVar.m12494i()) {
                z = this.f23646s0.m13461g().m13561E0(null, true);
            } else {
                z = this.f23646s0.m13461g().m13561E0(this.f23645r4, true);
            }
            if (z) {
                this.f23477D1.getBaseReceiver().invalidate();
            }
        } else if (i == 4) {
            this.f23470B4 = new C4868i.C4889t(this.f23465A4);
        }
    }

    public final void m16431Gl(float f) {
        if (this.f23669w3 != f) {
            this.f23669w3 = f;
            float max = Math.max(0.0f, Math.min(1.0f, f));
            this.f23574b2.setAlpha(max);
            this.f23674x3.setAlpha(max);
            float f2 = 1.0f - max;
            m16230fl(f2);
            m16204il(f2 * Math.max(0.0f, Math.min(1.0f, this.f23663v2)));
        }
    }

    public final void m16430Gm() {
        C4868i.C4889t next;
        C4868i.C4891v d;
        double d2;
        if (this.f23602i2 != null) {
            List<C4868i.C4889t> list = this.f23475C4;
            if (list != null) {
                list.clear();
            } else {
                this.f23475C4 = new ArrayList();
            }
            C6253l K = this.f23646s0.m13461g().m13550K();
            int Y0 = K.m20849Y0();
            int L0 = K.m20862L0();
            double W0 = K.m20851W0();
            double V0 = K.m20852V0();
            if (!(W0 == 0.0d || V0 == 0.0d)) {
                if (Y0 > L0) {
                    Y0 = (int) Math.max(W0, V0);
                    d2 = Math.min(W0, V0);
                } else {
                    Y0 = (int) Math.min(W0, V0);
                    d2 = Math.max(W0, V0);
                }
                L0 = (int) d2;
            }
            Iterator<C4868i.C4889t> it = C4868i.m24726c2().m24586t6().iterator();
            int i = -1;
            int i2 = -1;
            while (it.hasNext() && (d = (next = it.next()).m24488d(Y0, L0)) != null) {
                int abs = Math.abs(this.f23470B4.f16716a.f16719a - d.f16719a);
                if (i == -1 || abs < i2) {
                    i = this.f23475C4.size();
                    i2 = abs;
                }
                this.f23475C4.add(next);
            }
            boolean z = true;
            if (this.f23470B4.f16716a.m24484b()) {
                i = this.f23475C4.size() - 1;
            }
            this.f23602i2.setValueCount(this.f23475C4.size());
            this.f23602i2.setValue(i / (this.f23475C4.size() - 1));
            C7484p1 p1Var = this.f23602i2;
            if (this.f23475C4.size() <= 1) {
                z = false;
            }
            p1Var.m15841h(z, false);
            m16438Fm();
        }
    }

    public void m16427Hh() {
        if (this.f23557X0) {
            m16386Mh();
        } else if (this.f23501J0 != -1 || !mo404jc(false)) {
            this.f23468B2.m18408y2(true);
        }
    }

    public final boolean m16426Hi() {
        return this.f23540S3 && !this.f23536R3.m13584b(this.f23516M3);
    }

    public final void m16425Hj() {
        if (Build.VERSION.SDK_INT >= 19 && this.f23509L0 != null && this.f23671x0 != null) {
            float f = this.f23513M0;
            if (f > 0.0f && f < 1.0f) {
                float max = Math.max(0.0f, Math.min(1.0f, f));
                this.f23671x0.m15999a();
                int measuredWidth = this.f23472C1.getMeasuredWidth();
                int measuredHeight = this.f23472C1.getMeasuredHeight();
                AbstractC6264v baseReceiver = this.f23477D1.getBaseReceiver();
                float min = Math.min(this.f23671x0.m15980t(), this.f23671x0.m15995e()) / 2;
                float sqrt = min + (((((float) Math.sqrt((measuredWidth * measuredWidth) + (measuredHeight * measuredHeight))) * 0.5f) - min) * max);
                RectF a0 = C1410y.m37050a0();
                a0.set(baseReceiver.mo20257I0() - sqrt, baseReceiver.mo20227y0() - sqrt, baseReceiver.mo20257I0() + sqrt, baseReceiver.mo20227y0() + sqrt);
                this.f23509L0.reset();
                this.f23509L0.addRoundRect(a0, sqrt, sqrt, Path.Direction.CCW);
            }
        }
    }

    public final void m16424Hk(boolean z) {
        C7856c cVar;
        C7856c cVar2;
        C7856c cVar3;
        if (!this.f23612k4) {
            m16111uh();
            this.f23600h4 = this.f23584d4.m14827c();
            float c = (z || (cVar3 = this.f23588e4) == null) ? 0.0f : cVar3.m14827c();
            this.f23604i4 = c;
            boolean z2 = false;
            this.f23608j4 = c - this.f23600h4 != 0.0f;
            int h = ((z || (cVar2 = this.f23588e4) == null) ? 0 : cVar2.m14822h()) - this.f23584d4.m14822h();
            this.f23580c4 = h;
            if (h < -180) {
                this.f23580c4 = h + 360;
            }
            this.f23584d4.m14815o(this.f23580c4);
            this.f23614l2.m16491i(false, true);
            this.f23612k4 = this.f23608j4 || this.f23580c4 != 0;
            this.f23616l4 = !z;
            if (z || (cVar = this.f23588e4) == null || cVar.m14818l()) {
                if (this.f23552V3.m14843n(this.f23612k4, !z)) {
                    this.f23612k4 = true;
                }
            } else if (this.f23552V3.m14855b(this.f23588e4.m14826d(), this.f23588e4.m14821i(), this.f23588e4.m14823g(), this.f23588e4.m14828b(), true, true)) {
                this.f23612k4 = true;
            }
            if (this.f23616l4 && this.f23612k4) {
                z2 = true;
            }
            this.f23616l4 = z2;
        }
    }

    public final void m16423Hl(float f) {
    }

    public final void m16422Hm() {
        C7489q1 q1Var = this.f23558X1;
        if (q1Var != null) {
            float f = 1.0f;
            float f2 = this.f23533R0 * (1.0f - this.f23565Z0);
            if (this.f23471C0) {
                f = 0.0f;
            }
            q1Var.setAlpha(f2 * f);
        }
    }

    @Override
    public void mo11176I2(C6924j2 j2Var) {
        if (this.f23666w0 == 1) {
            this.f23477D1.setPendingOpenAnimator(this.f23661v0);
        } else {
            this.f23661v0.m29544i(1.0f);
        }
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        m16406Jm();
        View view = this.f23546U1;
        if (view instanceof AbstractC9165c2) {
            ((AbstractC9165c2) view).mo8255s();
        }
        LinearLayoutManager linearLayoutManager = this.f23567Z2;
        if (linearLayoutManager != null) {
            linearLayoutManager.m39572B2(C4403w.m27984G2());
        }
        RunnableC7454x xVar = this.f23555W2;
        if (xVar != null) {
            xVar.m39504A0();
            m16339Sh(false, false);
        }
    }

    public void m16419Ih() {
        new C3950k(14, this, C2057b.f7280b, 180L).m29544i(1.0f);
        this.f23501J0 = 4;
        this.f23468B2.m18408y2(true);
    }

    public final boolean m16418Ii() {
        return !this.f23645r4.m12498e(this.f23640q4);
    }

    public final void m16417Ij() {
        m16409Jj(false, false);
    }

    public final void m16416Ik() {
        this.f23588e4 = null;
    }

    public final void m16415Il(int i, boolean z) {
        if (this.f23660u4 != i) {
            this.f23660u4 = i;
            if (z) {
                C8429d.m12503b(i);
            }
            this.f23653t2.m16489k(m16126si(i), z, false);
            m16250dh(i);
        }
    }

    public final void m16414Im() {
        RunnableC7454x xVar = this.f23555W2;
        if (xVar != null) {
            xVar.setAlpha(this.f23541T0 * this.f23533R0 * (1.0f - this.f23565Z0));
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            C5320c cVar = new C5320c(4);
            C5146u0 u0Var = new C5146u0(4);
            C8112b g = this.f23646s0.m13461g();
            TdApi.Chat U2 = this.f30167b.m2632U2(g.m13552J());
            if (g.m13492n0() && !g.m13510e0() && g.m13508f0()) {
                cVar.m23284a(R.id.btn_open);
                u0Var.m23816a(R.string.OpenInExternalApp);
            }
            if (g.m13508f0() && g.m13505h()) {
                cVar.m23284a(R.id.btn_saveToGallery);
                u0Var.m23816a(R.string.SaveToGallery);
            }
            int i2 = this.f23626o0;
            if (i2 != 4 && i2 != 3 && g.m13505h() && g.m13503i()) {
                cVar.m23284a(R.id.btn_share);
                u0Var.m23816a(R.string.Share);
            }
            if (g.m13510e0() && g.m13505h()) {
                cVar.m23284a(R.id.btn_saveGif);
                u0Var.m23816a(R.string.SaveGif);
            }
            if (!C5070i.m24061i(m9131x9().f23730k) || (U2 != null && this.f30167b.m2272r2(g.getMessage()))) {
                cVar.m23284a(R.id.btn_copyLink);
                u0Var.m23816a(R.string.CopyLink);
            }
            if (!(g.m13552J() == 0 || g.mo13513d() == 0 || this.f23626o0 != 0)) {
                cVar.m23284a(R.id.btn_showInChat);
                u0Var.m23816a(R.string.ShowInChat);
            }
            if (g.m13509f() && (g.getMessage() != null || this.f23646s0.m13460h() == 0)) {
                cVar.m23284a(R.id.btn_messageReport);
                u0Var.m23816a(R.string.Report);
            }
            boolean z = true;
            boolean z2 = this.f23626o0 == 1 && this.f30167b.m2395j7(g.m13546M());
            if (z2 || this.f23626o0 != 2) {
                z = z2;
            } else if (U2 == null || !this.f30167b.m2352m2(U2)) {
                z = false;
            }
            if (z2 && this.f23646s0.m13460h() != 0) {
                cVar.m23284a(R.id.btn_setProfilePhoto);
                u0Var.m23816a(R.string.SetAsCurrent);
            }
            if (z) {
                cVar.m23284a(R.id.btn_deleteProfilePhoto);
                u0Var.m23816a(R.string.Delete);
            }
            if (!cVar.m23279f()) {
                m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
            }
        } else if (i == R.id.menu_btn_pictureInPicture) {
            m16323Uh();
        }
    }

    @Override
    public int[] mo7925J2(C9639r rVar, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        return C9639r.m7947e(rVar, view, view2, i, i2, i3, i4, i5, this.f23472C1, this.f23538S1, this.f23481E0);
    }

    public final void m16411Jh() {
        if (!this.f23471C0) {
            return;
        }
        if (this.f23485F0) {
            m16265bi();
        } else {
            C1408x.m37088c(this.f23546U1);
        }
    }

    public final boolean m16410Ji() {
        return !this.f23470B4.equals(this.f23465A4);
    }

    public final void m16409Jj(boolean z, boolean z2) {
        if (!this.f23549V0 && !m9131x9().f23727h) {
            int i = this.f23626o0;
            if (i == 0) {
                long J = this.f23646s0.m13461g().m13552J();
                if (J != 0) {
                    if (this.f23545U0) {
                        if (this.f23621n0) {
                            if ((!z || !z2) && this.f23646s0.m13460h() < this.f23646s0.m13459i() - 4) {
                                return;
                            }
                        } else if ((!z || z2) && this.f23646s0.m13460h() > 4) {
                            return;
                        }
                    }
                    this.f23549V0 = true;
                    C8112b r = this.f23621n0 ? this.f23646s0.m13450r() : this.f23646s0.m13465c();
                    Client r4 = this.f30167b.m2270r4();
                    long d = r.mo13513d();
                    TdApi.SearchMessagesFilter searchMessagesFilter = this.f23651t0;
                    if (searchMessagesFilter == null) {
                        searchMessagesFilter = new TdApi.SearchMessagesFilterPhotoAndVideo();
                    }
                    r4.m14783o(new TdApi.SearchChatMessages(J, null, null, d, 0, 40, searchMessagesFilter, this.f23656u0), this);
                }
            } else if (i == 1) {
                long S0 = C7321e.m16982S0(this.f23646s0.m13461g().m13546M());
                if (!this.f23545U0 || ((z && z2) || this.f23646s0.m13460h() <= this.f23646s0.m13459i() - 4)) {
                    this.f23549V0 = true;
                    this.f30167b.m2270r4().m14783o(new TdApi.GetUserProfilePhotos(S0, this.f23545U0 ? this.f23646s0.m13459i() : 0, 100), this);
                }
            } else if (i == 2) {
                long J2 = this.f23646s0.m13461g().m13552J();
                if (!this.f23545U0 || ((z && z2) || this.f23646s0.m13460h() <= this.f23646s0.m13459i() - 4)) {
                    this.f23549V0 = true;
                    C8112b r2 = this.f23646s0.m13450r();
                    Client r42 = this.f30167b.m2270r4();
                    long d2 = r2.mo13513d();
                    TdApi.SearchMessagesFilter searchMessagesFilter2 = this.f23651t0;
                    if (searchMessagesFilter2 == null) {
                        searchMessagesFilter2 = new TdApi.SearchMessagesFilterChatPhoto();
                    }
                    r42.m14783o(new TdApi.SearchChatMessages(J2, null, null, d2, 0, 100, searchMessagesFilter2, this.f23656u0), this);
                }
            }
        }
    }

    public final void m16408Jk() {
        this.f23536R3 = null;
    }

    public final void m16407Jl(float f) {
        if (this.f23462A1 != f) {
            this.f23462A1 = f;
            m16464Cm();
        }
    }

    public final void m16406Jm() {
        if (this.f23582d2 != null) {
            int Mj = m16384Mj();
            int i = C1357a0.m37541i(68.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23582d2.getLayoutParams();
            int i2 = C4403w.m27984G2() ? Mj : i;
            int topOffset = this.f23586e2.m10025w3() ? View$OnClickListenerC9170d1.getTopOffset() : 0;
            if (C4403w.m27984G2()) {
                Mj = i;
            }
            if (C1399s0.m37177i0(layoutParams, i2, topOffset, Mj, 0)) {
                C1399s0.m37145y0(this.f23582d2);
            }
        }
    }

    @Override
    public boolean mo16405K1(float f, float f2) {
        return this.f23565Z0 != 0.0f;
    }

    public final void m16403Kg(java.util.List<org.drinkless.p210td.libcore.telegram.TdApi.Message> r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16403Kg(java.util.List, int):void");
    }

    public final boolean m16402Kh(int i) {
        if (this.f23568Z3) {
            this.f23568Z3 = false;
            return false;
        } else if (this.f23564Y3 != -1) {
            return true;
        } else {
            this.f23564Y3 = i;
            if (!this.f23612k4) {
                m16481Al(false);
            }
            return true;
        }
    }

    public final void m16401Ki() {
        AbstractC7459k1 k1Var;
        C8112b g = this.f23646s0.m13461g();
        C8112b bVar = this.f23497I0;
        if (bVar == null || bVar != g) {
            if (!(bVar == null || (k1Var = this.f23631p0) == null)) {
                k1Var.mo9808F2(this.f23493H0, bVar, true);
            }
            this.f23497I0 = g;
            int h = this.f23646s0.m13460h();
            this.f23493H0 = h;
            AbstractC7459k1 k1Var2 = this.f23631p0;
            if (k1Var2 != null) {
                k1Var2.mo9808F2(h, this.f23497I0, false);
            }
        }
    }

    public final void m16400Kj(C6246h hVar) {
        if (this.f23532Q3 == null) {
            this.f23532Q3 = new C6267y(this);
        }
        ImageLoader.m14392e().m14385l(hVar, this.f23532Q3);
    }

    public final void m16399Kk(int i) {
        this.f23477D1.m16513u2(m16134ri(i), m16084xi(i), m16102vi(i));
    }

    public final void m16398Kl(boolean z, boolean z2) {
        if (this.f23682z1 != z) {
            this.f23682z1 = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m16316Vg(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m16249di(f);
        }
    }

    public final void m16397Km(boolean z) {
        C8112b g = this.f23646s0.m13461g();
        boolean n0 = g.m13492n0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m16229fm(n0, true, g.m13522Y(true, timeUnit), timeUnit, z);
        if (this.f23626o0 != 3) {
            return;
        }
        if (g.m13492n0()) {
            this.f23530Q1.m16489k(R.drawable.baseline_settings_24, z, false);
            this.f23522O1.m16489k(R.drawable.baseline_rotate_90_degrees_ccw_24, z, false);
            this.f23526P1.m16489k(R.drawable.baseline_volume_up_24, z, g.m13488p0());
            return;
        }
        this.f23530Q1.m16489k(R.drawable.baseline_tune_24, z, false);
        this.f23522O1.m16489k(R.drawable.baseline_crop_rotate_24, z, false);
        this.f23526P1.m16489k(R.drawable.baseline_brush_24, z, false);
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_transparentEditor;
    }

    @Override
    public void mo9397La() {
        super.mo9397La();
        if (this.f23626o0 == 3) {
            m16411Jh();
        }
    }

    public final void m16117tj(org.drinkless.p210td.libcore.telegram.TdApi.ChatPhotos r20) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16117tj(org.drinkless.td.libcore.telegram.TdApi$ChatPhotos):void");
    }

    public final void m16394Lh(boolean z) {
        if (this.f23485F0) {
            if (this.f23481E0 != null) {
                m16440Fk();
                if (this.f23489G0) {
                    if (z) {
                        this.f23481E0.m17861R2((C7029t0) this.f23546U1);
                    } else {
                        this.f23481E0.m17861R2((C7029t0) this.f23546U1);
                    }
                }
            }
            this.f23485F0 = false;
            this.f23550V1.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
        }
    }

    public final void m16393Li() {
        m16103vh();
        this.f23500I3.setEditorVisible(false);
        this.f23500I3.m12817q();
        this.f23500I3.setScaleX(1.0f);
        this.f23500I3.setScaleY(1.0f);
    }

    public final int m16392Lj() {
        LinearLayout linearLayout;
        int i = (int) (C1357a0.m37541i(56.0f) * this.f23678y2);
        return (this.f23521O0 != 1.0f || (linearLayout = this.f23542T1) == null) ? i : i + linearLayout.getMeasuredHeight();
    }

    public final void m16391Lk() {
        C3940f fVar;
        if (this.f23555W2 != null && (fVar = this.f23551V2) != null && fVar.m29583h()) {
            m16119th();
            this.f23555W2.m39504A0();
            m16339Sh(false, false);
        }
    }

    public final void m16390Ll(float f) {
        float f2 = (0.4f * f) + 0.6f;
        float f3 = this.f23553W0 * f2;
        this.f23477D1.setScaleX(f3);
        this.f23477D1.setScaleY(f3);
        this.f23477D1.setAlpha(f);
        this.f23482E1.setScaleX(f2);
        this.f23482E1.setScaleY(f2);
        this.f23482E1.setAlpha(f);
    }

    @Override
    public void mo16389M2(ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, boolean z) {
    }

    @Override
    public void mo15892M5(C8112b bVar, boolean z) {
        C7489q1 q1Var;
        if (this.f23646s0.m13461g() == bVar && (q1Var = this.f23558X1) != null) {
            q1Var.setSlideEnabled(z);
        }
    }

    public final void m16125sj(TdApi.Messages messages) {
        TdApi.Message[] messageArr;
        ArrayList arrayList = new ArrayList(messages.messages.length);
        for (TdApi.Message message : messages.messages) {
            if (!C7321e.m16947g1(message.content)) {
                arrayList.add(message);
            }
        }
        m16403Kg(arrayList, messages.totalCount);
    }

    public final void m16386Mh() {
        this.f23553W0 = this.f23477D1.getScaleX();
        this.f23501J0 = 3;
        this.f23468B2.m18408y2(true);
    }

    public final void m16385Mi() {
        this.f23650s4.setEditorVisible(false);
        C8112b bVar = this.f23625n4;
        if (bVar.m13561E0(bVar.m13566C(), false)) {
            this.f23477D1.getBaseReceiver().invalidate();
        }
        this.f23650s4.m12817q();
        this.f23650s4.setScaleX(1.0f);
        this.f23650s4.setScaleY(1.0f);
        m16211hm();
    }

    public final int m16384Mj() {
        int i = C1357a0.m37541i(49.0f);
        if (m16135rh()) {
            i += C1357a0.m37541i(49.0f);
        }
        if (m16160oh()) {
            i += C1357a0.m37541i(49.0f);
        }
        return m16127sh() ? i + C1357a0.m37541i(49.0f) : i;
    }

    public final void m16383Mk() {
        this.f23465A4 = null;
    }

    public final void m16382Ml(float f, float f2) {
        if (this.f23565Z0 == f) {
            return;
        }
        if (!Float.isNaN(f)) {
            this.f23565Z0 = f;
            boolean z = false;
            m16456Dm(this.f23477D1.getMeasuredWidth(), this.f23477D1.getMeasuredHeight(), false, false);
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                this.f23477D1.setTranslationZ(C1357a0.m37541i(1.0f) * f);
            }
            this.f23569a1.m13472x0(1.0f - f);
            if (this.f23477D1.getBaseCell().getDetector().m15857z(f2) && i >= 21) {
                this.f23477D1.invalidateOutline();
            }
            C7401b0 b0Var = this.f23477D1;
            if (f != 0.0f) {
                z = true;
            }
            b0Var.setDisableTouch(z);
            this.f23472C1.invalidate();
            m16080xm();
            m16098vm();
            m16422Hm();
            m16414Im();
            m16472Bm();
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void mo8864N0(int i) {
        x00 x00Var;
        CharSequence charSequence;
        C8112b g = this.f23646s0.m13461g();
        CharSequence charSequence2 = null;
        int i2 = 2;
        boolean z = true;
        switch (i) {
            case R.id.btn_copyLink:
                if (!C5070i.m24061i(m9131x9().f23730k)) {
                    C1379j0.m37325i(m9131x9().f23730k, R.string.CopiedLink);
                    return;
                } else if (g.m13552J() != 0 && this.f30167b.m2272r2(g.getMessage())) {
                    C10930q6 q6Var = this.f30167b;
                    TdApi.Message message = g.getMessage();
                    if (this.f23656u0 == 0) {
                        z = false;
                    }
                    q6Var.m2849G5(message, false, z, C7488q0.f23962a);
                    return;
                } else {
                    return;
                }
            case R.id.btn_deleteProfilePhoto:
                int i3 = this.f23626o0;
                if (i3 == 1) {
                    this.f30167b.m2270r4().m14783o(new TdApi.DeleteProfilePhoto(g.m13564D()), this.f30167b.m2392ja());
                } else if (i3 == 2) {
                    this.f30167b.m2270r4().m14783o(new TdApi.SetChatPhoto(g.m13552J(), null), this.f30167b.m2392ja());
                }
                this.f23501J0 = 0;
                m16427Hh();
                return;
            case R.id.btn_messageReport:
                TdApi.Message message2 = g.getMessage();
                if (message2 != null) {
                    HandlerC10770jj.m3708T7(this, g.m13552J(), new TdApi.Message[]{message2}, null, m16142qi());
                    return;
                }
                final long Q0 = C7321e.m16986Q0(g.m13546M());
                final AbstractC5918j o0Var = new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC7430j1.this.m16166nj(Q0, (TdApi.PhotoSize) obj);
                    }
                };
                switch (C7316a.m17057d(Q0)) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                        this.f30167b.m2480e2().m1627k2(C7316a.m17045p(Q0), new AbstractC5918j() {
                            @Override
                            public final void mo1330a(Object obj) {
                                View$OnClickListenerC7430j1.m16141qj(AbstractC5918j.this, (TdApi.SupergroupFullInfo) obj);
                            }
                        });
                        return;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        this.f30167b.m2480e2().m1737G2(this.f30167b.m2494d4(Q0), new AbstractC5918j() {
                            @Override
                            public final void mo1330a(Object obj) {
                                View$OnClickListenerC7430j1.m16149pj(AbstractC5918j.this, (TdApi.UserFullInfo) obj);
                            }
                        });
                        return;
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        this.f30167b.m2480e2().m1700Q(C7316a.m17048m(Q0), new AbstractC5918j() {
                            @Override
                            public final void mo1330a(Object obj) {
                                View$OnClickListenerC7430j1.m16158oj(AbstractC5918j.this, (TdApi.BasicGroupFullInfo) obj);
                            }
                        });
                        return;
                    default:
                        return;
                }
            case R.id.btn_open:
                if (g.m13544N() != null) {
                    C7389v0.m16603n2(this, g.m13544N());
                    return;
                }
                return;
            case R.id.btn_saveGif:
                TdApi.File P = g.m13540P();
                if (P != null) {
                    this.f30167b.m2485dd().m3668X7(P.f25373id);
                    return;
                }
                return;
            case R.id.btn_saveToGallery:
                TdApi.File P2 = g.m13540P();
                if (C4779t2.m25586V2(P2)) {
                    String str = P2.local.path;
                    if (!g.m13510e0()) {
                        i2 = g.m13492n0() ? 1 : 0;
                    }
                    C7389v0.m16706N(str, i2);
                    return;
                }
                return;
            case R.id.btn_setProfilePhoto:
                this.f30167b.m2270r4().m14783o(new TdApi.SetProfilePhoto(new TdApi.InputChatPhotoPrevious(g.m13564D())), this.f30167b.m2392ja());
                m16427Hh();
                return;
            case R.id.btn_share:
                if (g.getMessage() != null) {
                    x00Var = new x00(this.f30165a, this.f30167b);
                    if (g.getMessage().content.getConstructor() != 1989037971) {
                        x00Var.m30994Vi(new x00.C3281m(g.getMessage()));
                    } else {
                        String str2 = ((TdApi.MessageText) g.getMessage().content).webPage.displayUrl;
                        x00Var.m30994Vi(new x00.C3281m(g, str2, str2));
                    }
                } else if (g.m13556H() != null) {
                    x00Var = new x00(this.f30165a, this.f30167b);
                    int i4 = this.f23626o0;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            long J = this.f23646s0.m13461g().m13552J();
                            String Q3 = this.f30167b.m2691Q3(J);
                            if (!C5070i.m24061i(Q3)) {
                                if (this.f30167b.m2784K6(J)) {
                                    charSequence = C4403w.m27865j1(R.string.ShareTextChannel, Q3);
                                } else {
                                    charSequence = C4403w.m27865j1(R.string.ShareTextChat, Q3);
                                }
                                String f4 = this.f30167b.m2462f4(J);
                                if (!C5070i.m24061i(f4)) {
                                    charSequence = C4403w.m27865j1(R.string.format_ShareTextSignature, charSequence, this.f30167b.m2637Tc(f4));
                                }
                            }
                        } else if (i4 == 5 && !C7321e.m16965a1(g.m13483s())) {
                            charSequence2 = C4779t2.m25441q5(g.m13483s());
                        }
                        charSequence = charSequence2;
                    } else {
                        long S0 = C7321e.m16982S0(this.f23646s0.m13461g().m13546M());
                        String K2 = this.f30167b.m2480e2().m1721K2(S0);
                        charSequence = !C5070i.m24061i(K2) ? C4403w.m27865j1(R.string.ShareTextProfile, K2) : null;
                        String R2 = this.f30167b.m2480e2().m1694R2(S0);
                        if (!C5070i.m24061i(R2)) {
                            charSequence = C4403w.m27865j1(R.string.format_ShareTextSignature, charSequence, this.f30167b.m2637Tc(R2));
                        }
                    }
                    x00Var.m30994Vi(new x00.C3281m(g, charSequence2, charSequence));
                } else {
                    return;
                }
                x00Var.m30960ej();
                this.f23501J0 = 0;
                m16427Hh();
                return;
            case R.id.btn_showInChat:
                this.f23501J0 = 0;
                AbstractC9323v4<?> F = this.f30165a.m14552P1().m9763F();
                if (!(F instanceof View$OnClickListenerC2971rh) || F.mo9464C9() != g.m13552J()) {
                    this.f30167b.m2485dd().m3469r7(this, g.m13552J(), new C7319d(g.m13552J(), g.mo13513d()), null);
                } else {
                    ((View$OnClickListenerC2971rh) F).m32632Ok(new C7319d(g.m13552J(), g.mo13513d()));
                }
                m16427Hh();
                return;
            default:
                return;
        }
    }

    public final void m16380Ng(ArrayList<C8112b> arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            C3940f fVar = this.f23551V2;
            if (fVar == null || !fVar.m29583h()) {
                m16469Ch();
            } else {
                this.f23563Y2.f23745O.m16029d(arrayList, z, this.f23626o0 == 0 && !m9131x9().f23729j);
            }
        }
    }

    public final void m16379Nh(int i) {
        C3950k kVar = this.f23576b4;
        if (kVar == null) {
            this.f23576b4 = new C3950k(19, this, C2057b.f7280b, 180L);
        } else if (!kVar.m29531v()) {
            this.f23576b4.m29541l(0.0f);
            this.f23572a4 = 0.0f;
        } else {
            return;
        }
        if (i != 0) {
            this.f23584d4.m14815o(i);
            this.f23580c4 = i;
            this.f23576b4.m29544i(1.0f);
        }
    }

    public final void m16378Ni() {
    }

    public void m16377Nj() {
        if (!this.f23557X0) {
            m16124sk();
            if (m16160oh()) {
                m16323Uh();
            } else {
                m16427Hh();
            }
        }
    }

    public final void m16376Nk() {
        long w1 = C4868i.m24726c2().m24568w1();
        this.f23573b1 = C5063c.m24133m(w1);
        this.f23577c1 = C5063c.m24132n(w1);
    }

    public final void m16375Nl(boolean z, boolean z2) {
        if (this.f23613l1 != z) {
            this.f23613l1 = z;
            if (this.f23617m1 == null) {
                this.f23617m1 = new C3950k(12, this, C2057b.f7280b, 180L);
            }
            if (z) {
                this.f23502J1.m16044a(z2);
            }
            this.f23617m1.m29544i(z ? 1.0f : 0.0f);
        }
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_white;
    }

    public final boolean m16373Og() {
        C3950k kVar = this.f23496H3;
        return (kVar == null || !kVar.m29531v()) && !this.f23670w4 && m16306Wi();
    }

    public final void m16372Oh() {
        m16339Sh(true, true);
        if (this.f23634p3 != -1 && this.f23563Y2.f23745O != null) {
            int round = Math.round(this.f23634p3 / m16176mh());
            if (m16315Vh(this.f23563Y2.f23745O.m16028e(round), this.f23563Y2.f23745O, round, false)) {
                this.f23591f3 = SystemClock.uptimeMillis();
            }
        }
    }

    public final void m16371Oi(int i) {
        if (i == 1) {
            m16408Jk();
            this.f23538S1.removeViewInLayout(this.f23590f2);
            this.f23477D1.getBaseCell().removeView(this.f23500I3);
        } else if (i == 2) {
            m16416Ik();
            this.f23538S1.removeView(this.f23610k2);
            this.f23472C1.removeView(this.f23548U3);
        } else if (i == 3) {
            C8431f fVar = this.f23640q4;
            if (fVar != null) {
                fVar.m12482u(this);
            }
            this.f23538S1.removeView(this.f23628o2);
            this.f23477D1.getBaseCell().removeView(this.f23650s4);
        } else if (i == 4) {
            m16383Mk();
            this.f23538S1.removeViewInLayout(this.f23598h2);
        }
    }

    public final void m16370Oj(float f, float f2, int i, int i2) {
        this.f23637q1 = this.f23627o1 + f;
        this.f23642r1 = this.f23632p1 + f2;
        m16456Dm(i, i2, false, true);
    }

    public final void m16369Ok(int i) {
        int i2 = this.f23603i3;
        if (i2 != -1) {
            this.f23603i3 = i2 + i;
            if (this.f23555W2.getMeasuredWidth() <= 0) {
                return;
            }
            if (m16208ih()) {
                this.f23567Z2.m39522z2(this.f23603i3, this.f23607j3);
            } else {
                m16339Sh(false, false);
            }
        }
    }

    public final void m16368Ol(float f) {
        if (this.f23622n1 != f) {
            this.f23622n1 = f;
            m16464Cm();
            this.f23502J1.setAlpha(f);
        }
    }

    public final int m16367P0() {
        AbstractC7511x xVar = this.f23636q0;
        if (xVar != null) {
            return xVar.mo11242P0();
        }
        return 0;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        switch (i) {
            case 0:
                int i2 = this.f23666w0;
                if (i2 == 0) {
                    m16139ql(f);
                } else if (i2 == 1) {
                    this.f23477D1.getBaseCell().getDetector().m15857z(f2);
                    this.f23477D1.setRevealFactor(f);
                } else if (i2 == 3) {
                    m16390Ll(f);
                } else if (i2 == 4) {
                    C7450t tVar = this.f23562Y1;
                    if (tVar != null) {
                        tVar.setAlpha(f);
                    }
                    this.f23477D1.setAlpha(f);
                }
                m16221gl(f);
                m16123sl(C5069h.m24089d(f));
                int i3 = this.f23626o0;
                if (i3 != 0) {
                    if (i3 == 3) {
                        m16147pl(Math.max(0.0f, Math.min(1.0f, f)));
                        return;
                    } else if (i3 != 5) {
                        return;
                    }
                }
                m16279Zk(C5069h.m24089d(f));
                return;
            case 1:
                m16196jl(f);
                return;
            case 2:
                m16431Gl(f);
                return;
            case 3:
            case 13:
            case 16:
            default:
                return;
            case 4:
                m16335Sl(f, f2);
                return;
            case 5:
                m16237em(f);
                return;
            case 6:
                m16246dl(f);
                return;
            case 7:
                m16107ul(f);
                return;
            case 8:
                m16382Ml(f, f2);
                return;
            case 9:
                m16343Rl(f);
                return;
            case 10:
                m16407Jl(f);
                return;
            case 11:
                m16359Pl(f);
                return;
            case 12:
                m16368Ol(f);
                return;
            case 14:
                this.f23477D1.getBaseReceiver().setAlpha(1.0f - f);
                return;
            case 15:
                m16286Yl(f);
                return;
            case 17:
                m16065zl(f);
                return;
            case 18:
                m16188kl(f);
                return;
            case 19:
                m16090wl(f);
                return;
            case 20:
                m16099vl(f);
                return;
            case 21:
                m16270am(f);
                return;
            case 22:
                m16261bm(f);
                return;
            case 23:
                m16287Yk(f);
                return;
        }
    }

    public boolean m16364Pg(boolean z) {
        C3940f fVar = this.f23571a3;
        if (fVar == null || !fVar.m29583h()) {
            return true;
        }
        if (z) {
            this.f23555W2.m39496D1();
            m16253cm(false);
        }
        return false;
    }

    public final boolean m16363Ph() {
        return false;
    }

    public final int m16362Pi() {
        return this.f23472C1.indexOfChild(this.f23477D1) + 1;
    }

    public final boolean m16361Pj() {
        int i = this.f23626o0;
        return i == 0 || i == 5 || i == 2 || i == 1;
    }

    public final void m16360Pk() {
        C8112b g;
        if (this.f23477D1.m16526a2() && this.f23477D1.m16523f2() && (g = this.f23646s0.m13461g()) != null) {
            if (!g.m13492n0()) {
                m16379Nh(-90);
            } else if (!C4183a.f14089g) {
                C1379j0.m37310p0(18);
            } else {
                C3950k kVar = this.f23620m4;
                if (kVar == null) {
                    this.f23620m4 = new C3950k(18, this, C2057b.f7280b, 180L);
                } else if (kVar.m29531v()) {
                    return;
                }
                RunnableC7470o baseCell = this.f23477D1.getBaseCell();
                g.m13476v0();
                baseCell.m15926d0(true);
                if (this.f23684z3 == 4) {
                    m16438Fm();
                }
            }
        }
    }

    public final void m16359Pl(float f) {
        float f2 = this.f23652t1;
        this.f23637q1 = f2 + ((this.f23662v1 - f2) * f);
        float f3 = this.f23657u1;
        this.f23642r1 = f3 + ((this.f23667w1 - f3) * f);
        m16456Dm(this.f23477D1.getMeasuredWidth(), this.f23477D1.getMeasuredHeight(), false, false);
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_white;
    }

    public boolean m16356Qg() {
        return (this.f23626o0 == 3 && this.f23684z3 == 3 && this.f23660u4 != 100) ? false : true;
    }

    public final void m16355Qh(float f, float f2) {
        m16351Ql(false, f, f2);
    }

    public final void m16354Qi() {
        View$OnClickListenerC9170d1 d1Var = this.f23586e2;
        if (d1Var != null) {
            if (this.f23666w0 == 1) {
                d1Var.setTranslationY(-View$OnClickListenerC9170d1.m10066c3(d1Var.m10025w3()));
            } else {
                d1Var.setAlpha(0.0f);
            }
            m16115tl(0.0f);
        }
    }

    public final boolean m16353Qj() {
        if (this.f23646s0.m13459i() <= 1) {
            return false;
        }
        int i = this.f23626o0;
        if (i == 1 || i == 2 || m9131x9().f23729j) {
            return true;
        }
        if (this.f23626o0 != 0) {
            return false;
        }
        C8112b g = this.f23646s0.m13461g();
        C8112b m = this.f23646s0.m13455m();
        C8112b l = this.f23646s0.m13456l();
        TdApi.Message message = g.getMessage();
        TdApi.Message message2 = null;
        TdApi.Message message3 = m != null ? m.getMessage() : null;
        if (l != null) {
            message2 = l.getMessage();
        }
        if (message == null) {
            return false;
        }
        long j = message.mediaAlbumId;
        if (j != 0) {
            return (message3 != null && message3.mediaAlbumId == j) || (message2 != null && message2.mediaAlbumId == j);
        }
        return false;
    }

    public final void m16352Qk() {
        C4868i.m24726c2().m24603r5(this.f23573b1, this.f23577c1);
    }

    public final void m16351Ql(boolean z, float f, float f2) {
        if (this.f23605j1 != z) {
            this.f23605j1 = z;
            if (z) {
                m16066zk();
            } else {
                m16337Sj(f, f2, true);
            }
            m16308Wg(z);
        }
    }

    @Override
    public int mo7523R6(View$OnClickListenerC9694y yVar) {
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23481E0;
        return this.f23546U1.getMeasuredHeight() + ((z0Var == null || z0Var.getVisibility() != 0 || this.f23481E0.getParent() == null) ? 0 : this.f23481E0.getMeasuredHeight());
    }

    @Override
    public int mo407R9() {
        return R.id.controller_mediaView;
    }

    @Override
    public boolean mo9350Rd() {
        return this.f23626o0 == 4 || !this.f23646s0.m13461g().m13505h();
    }

    public final void m16348Rg(float f) {
        if (this.f23525P0 == null) {
            this.f23525P0 = new C3950k(6, this, C2057b.f7280b, 150L, this.f23521O0);
        }
        this.f23525P0.m29544i(f);
    }

    public final void m16347Rh(float f, float f2, boolean z) {
        this.f23487F2 = false;
        this.f23511L2 = this.f23495H2;
        this.f23515M2 = this.f23499I2;
        this.f23519N2 = this.f23477D1.getRotation();
        this.f23523O2 = this.f23503J2;
        if (this.f23511L2 != 0.0f || this.f23515M2 != 0.0f) {
            C3950k kVar = this.f23539S2;
            if (kVar == null) {
                this.f23539S2 = new C3950k(15, this, C2057b.f7280b, 280L);
            } else {
                kVar.m29541l(0.0f);
            }
            if (z) {
                double atan2 = Math.atan2(f2, f);
                float measuredWidth = this.f23477D1.getMeasuredWidth();
                float measuredHeight = this.f23477D1.getMeasuredHeight();
                Math.min(measuredWidth / this.f23491G2.m13520Z(), measuredHeight / this.f23491G2.m13570A());
                double cos = Math.cos(atan2);
                double sin = Math.sin(atan2);
                double d = measuredWidth;
                this.f23527P2 = (float) (cos * d);
                double d2 = measuredHeight;
                this.f23531Q2 = (float) (sin * d2);
                float f3 = this.f23519N2 * 1.5f;
                this.f23535R2 = f3;
                this.f23527P2 += Math.abs(measuredWidth - ((float) (Math.abs(Math.sin(f3) * d) + Math.abs(Math.cos(this.f23535R2) * d2)))) * Math.signum(this.f23527P2);
                this.f23531Q2 += Math.abs(measuredHeight - ((float) (Math.abs(d * Math.cos(this.f23535R2)) + Math.abs(d2 * Math.sin(this.f23535R2))))) * Math.signum(this.f23531Q2);
            } else {
                this.f23535R2 = 0.0f;
                this.f23531Q2 = 0.0f;
                this.f23527P2 = 0.0f;
            }
            this.f23539S2.m29544i(1.0f);
        }
    }

    public final boolean m16346Ri(int i) {
        if (i == 1) {
            return m16306Wi() && m16082xk();
        }
        if (i == 2) {
            return m16306Wi() && m16108uk();
        }
        if (i == 3) {
            return m16306Wi() && m16074yk();
        }
        if (i != 4) {
            return true;
        }
        return m16306Wi() && m16482Ak();
    }

    public final boolean m16345Rj() {
        return Build.VERSION.SDK_INT >= 18 && this.f23626o0 == 3;
    }

    public final boolean m16344Rk(int i) {
        int i2 = this.f23684z3;
        if (i2 != 1) {
            if (i2 == 2) {
                if (!this.f23584d4.m14818l()) {
                    m16320Uk();
                }
                this.f23646s0.m13461g().m13470y0(this.f23584d4);
                return false;
            } else if (i2 == 3) {
                if (!this.f23640q4.m12494i()) {
                    m16320Uk();
                }
                if (!this.f23646s0.m13461g().m13561E0(this.f23640q4, true)) {
                    return false;
                }
                this.f23477D1.getBaseReceiver().invalidate();
                return false;
            } else if (i2 != 4) {
                return false;
            } else {
                C4868i.m24726c2().m24579u5(this.f23470B4);
                return false;
            }
        } else if (this.f23516M3.m13575k()) {
            C6252k y = this.f23646s0.m13461g().m13471y();
            if (y != null) {
                this.f30167b.m2429h5().m23071y0(y.mo20875q());
            }
            this.f23646s0.m13461g().m13569A0(null);
            m16283Zg(this.f23512L3, this.f23508K3);
            return false;
        } else {
            m16320Uk();
            m16245dm(true);
            m16275ah(i);
            return true;
        }
    }

    public final void m16343Rl(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f23477D1.setTranslationZ(C1357a0.m37541i(1.0f) + (C1357a0.m37541i(2.0f) * f));
        }
    }

    public final void m16340Sg(float f) {
        if (this.f23668w2 == null) {
            this.f23668w2 = new C3950k(1, this, new OvershootInterpolator(3.8f), 260L, this.f23663v2);
        }
        this.f23668w2.m29544i(f);
    }

    public final void m16339Sh(boolean z, boolean z2) {
        if (this.f23555W2.getMeasuredWidth() > 0) {
            m16331Th(z, z2, this.f23563Y2.f23745O.m16023j());
        }
    }

    public final void m16338Si() {
        if (this.f23555W2 == null) {
            this.f23559X2 = new C8731d(C2057b.f7280b, 140L);
            this.f23563Y2 = new C7451u(mo4347s(), this);
            this.f23567Z2 = new LinearLayoutManager(mo4347s(), 0, C4403w.m27984G2());
            RunnableC7454x xVar = new RunnableC7454x(mo4347s());
            this.f23555W2 = xVar;
            xVar.m39422k(new C7440j());
            this.f23555W2.setOverScrollMode(2);
            this.f23555W2.m16009I1(this);
            this.f23555W2.m39434g(new C7452v(this.f23563Y2));
            this.f23555W2.setItemAnimator(null);
            this.f23555W2.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
            this.f23555W2.setLayoutManager(this.f23567Z2);
            this.f23555W2.setAdapter(this.f23563Y2);
            this.f23555W2.setAlpha(0.0f);
            this.f23555W2.setLayoutParams(FrameLayoutFix.m18007t1(-1, (C1357a0.m37541i(9.0f) * 2) + C1357a0.m37541i(43.0f), 80));
            if (Build.VERSION.SDK_INT >= 21) {
                this.f23555W2.setElevation(C1357a0.m37541i(3.0f));
            }
            m16069zh();
            this.f23472C1.addView(this.f23555W2);
        }
    }

    public final void m16337Sj(float r29, float r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16337Sj(float, float, boolean):void");
    }

    public final void m16336Sk() {
        int X1 = this.f23567Z2.m39549X1();
        this.f23603i3 = X1;
        View C = this.f23567Z2.mo39262C(X1);
        this.f23607j3 = C != null ? this.f23567Z2.m39237Q(C) : 0;
    }

    public final void m16335Sl(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16335Sl(float, float):void");
    }

    @Override
    public void mo15973T3(boolean z) {
        this.f23552V3.m14836u(z ? 2 : 0, false);
    }

    public final void m16332Tg(float f) {
        if (this.f23537S0 == null) {
            this.f23537S0 = new C3950k(7, this, C2057b.f7280b, 150L, this.f23533R0);
        }
        this.f23537S0.m29544i(f);
    }

    public final void m16331Th(boolean z, boolean z2, int i) {
        int i2;
        int i3;
        int X1 = this.f23567Z2.m39549X1();
        int i4 = -1;
        View C = X1 != -1 ? this.f23567Z2.mo39262C(X1) : null;
        if (C != null) {
            i2 = C4403w.m27984G2() ? this.f23555W2.getMeasuredWidth() - this.f23567Z2.m39232T(C) : this.f23567Z2.m39237Q(C);
        } else {
            i2 = 0;
        }
        int mh = m16176mh();
        int measuredWidth = (this.f23555W2.getMeasuredWidth() / 2) - (mh / 2);
        if (X1 == -1 || C == null) {
            i3 = -1;
        } else {
            i3 = (-i2) + (mh * X1);
            if (X1 > 0) {
                i3 += measuredWidth;
            }
            if (i3 < 0) {
                i3 = 0;
            }
        }
        if (i != -1) {
            int i5 = i != 0 ? measuredWidth : 0;
            int m = this.f23563Y2.f23745O.m16020m();
            if (m != -1) {
                float g = this.f23563Y2.f23745O.m16026g();
                if (m < i) {
                    i5 += (int) ((i - m) * mh * (1.0f - g));
                } else if (m > i) {
                    i5 -= (int) (((m - i) * mh) * (1.0f - g));
                }
            }
            if (z && i3 != -1) {
                int i6 = (mh * i) - i5;
                if (i != 0) {
                    i6 += measuredWidth;
                }
                if (i6 == i3 || z2) {
                    this.f23644r3 = i6 - i3;
                } else {
                    RunnableC7454x xVar = this.f23555W2;
                    int i7 = i6 - i3;
                    if (!C4403w.m27984G2()) {
                        i4 = 1;
                    }
                    xVar.scrollBy(i7 * i4, 0);
                }
                i4 = i6;
            } else if (!z2) {
                this.f23567Z2.m39522z2(i, i5);
            } else {
                this.f23644r3 = 0;
            }
        }
        if (z2) {
            this.f23634p3 = i3;
            this.f23639q3 = i4;
        }
    }

    public final boolean m16330Ti() {
        C3950k kVar = this.f23611k3;
        return kVar != null && kVar.m29531v();
    }

    public final C7856c m16329Tj(boolean z) {
        C7856c v = this.f23646s0.m13461g().m13477v();
        return (v != null || !z) ? v : new C7856c();
    }

    public final boolean m16328Tk(int i, int i2) {
        if (i != 2) {
            return false;
        }
        return m16402Kh(i2);
    }

    public final void m16327Tl(int i, float f) {
        if (i == 0) {
            this.f23685z4 = 1.0f - f;
            m16480Am();
            this.f23542T1.setAlpha(f);
            C7489q1 q1Var = this.f23558X1;
            if (q1Var != null) {
                q1Var.setAlpha(f);
            }
        } else if (i == 1) {
            this.f23590f2.setAlpha(C5069h.m24089d(f));
            this.f23590f2.setTranslationY(m16093wi(1) * (1.0f - f));
        } else if (i == 2) {
            this.f23610k2.setAlpha(f);
            this.f23477D1.getBaseCell().getImageReceiver().m20814L(1.0f - f);
        } else if (i == 3) {
            this.f23628o2.setAlpha(f);
        } else if (i == 4) {
            this.f23598h2.setAlpha(C5069h.m24089d(f));
            this.f23598h2.setTranslationY(m16093wi(4) * (1.0f - f));
        }
    }

    @Override
    public void mo15839U0(C7484p1 p1Var, float f) {
    }

    @Override
    public void mo15891U4(C8112b bVar, float f) {
        C7489q1 q1Var;
        if (this.f23646s0.m13461g() == bVar && (q1Var = this.f23558X1) != null) {
            q1Var.m15825J1(f);
        }
    }

    public final void m16324Ug(float f) {
        if (this.f23664v3 == null) {
            this.f23664v3 = new C3950k(2, this, C2057b.f7280b, 180L, this.f23669w3);
        }
        this.f23664v3.m29544i(f);
    }

    public final void m16323Uh() {
        if (this.f23477D1.m16523f2()) {
            m16473Bl(true);
        }
    }

    public final boolean m16322Ui() {
        return this.f23676y0;
    }

    public final C8431f m16321Uj(boolean z) {
        C8431f C = this.f23646s0.m13461g().m13566C();
        return (C != null || !z) ? C : new C8431f();
    }

    public final void m16320Uk() {
        if (this.f23636q0 != null && !this.f23566Z1.m18807n()) {
            m16448El(this.f23566Z1.m18799v(), false);
        }
    }

    public final void m16319Ul(ArrayList<C6246h> arrayList) {
        if (this.f23674x3 == null) {
            C7503u uVar = new C7503u(mo4347s(), this);
            this.f23679y3 = uVar;
            uVar.m15761h0(arrayList);
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(112.0f) + View$OnClickListenerC9170d1.getTopOffset(), 48);
            C7506v vVar = new C7506v(mo4347s());
            this.f23674x3 = vVar;
            vVar.setPadding(C1357a0.m37541i(2.0f), View$OnClickListenerC9170d1.getTopOffset(), C1357a0.m37541i(2.0f), 0);
            this.f23674x3.setLayoutManager(new LinearLayoutManager(mo4347s(), 0, true));
            this.f23674x3.setHasFixedSize(true);
            this.f23674x3.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
            this.f23674x3.setClipToPadding(false);
            this.f23674x3.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
            this.f23674x3.setOverScrollMode(2);
            this.f23674x3.m39434g(new C7434d());
            this.f23674x3.setAlpha(0.0f);
            this.f23674x3.setAdapter(this.f23679y3);
            this.f23674x3.setLayoutParams(t1);
            this.f23472C1.addView(this.f23674x3);
            return;
        }
        this.f23679y3.m15761h0(arrayList);
    }

    public final void m16316Vg(float f) {
        if (this.f23467B1 == null) {
            this.f23467B1 = new C3950k(10, this, C2057b.f7280b, 180L, this.f23462A1);
        }
        this.f23467B1.m29544i(f);
    }

    public final boolean m16315Vh(C8112b bVar, C7453w wVar, int i, boolean z) {
        C7401b0 b0Var;
        if (bVar == null || wVar == null || i == -1 || (b0Var = this.f23477D1) == null || b0Var.m16525b2()) {
            return false;
        }
        boolean z2 = wVar.m16023j() != i;
        if (z2 && z) {
            wVar.m16012u();
            wVar.m16016q(bVar, i, wVar.f23754h);
        } else if (wVar.m16017p(i, -1, wVar.f23754h)) {
            this.f23555W2.invalidate();
        }
        if (z2) {
            this.f23477D1.getBaseCell().m15954H0(bVar, true, C1357a0.m37541i(43.0f) + (C1357a0.m37541i(9.0f) * 2), z ? 1.0f : m16076yi());
            this.f23646s0.m13464d(wVar.f23749c + i);
        }
        if (z) {
            float f = wVar.f23754h;
            wVar.f23754h = 1.0f;
            m16339Sh(true, true);
            wVar.f23754h = f;
            m16119th();
            this.f23555W2.m39496D1();
            if (this.f23644r3 == 0) {
                m16339Sh(true, false);
                this.f23555W2.invalidate();
            } else {
                this.f23624n3 = wVar;
                this.f23629o3 = wVar.f23754h;
                this.f23615l3 = this.f23644r3;
                this.f23619m3 = 0;
                if (this.f23611k3 == null) {
                    this.f23611k3 = new C3950k(23, this, C2057b.f7280b, 180L);
                }
                this.f23611k3.m29544i(1.0f);
            }
        }
        return z2;
    }

    public final boolean m16314Vi() {
        AbstractC7511x xVar = this.f23636q0;
        return xVar != null && xVar.mo11198v1(this.f23646s0.m13460h(), this.f23646s0.m13461g());
    }

    public final void m16313Vj() {
    }

    public void m16312Vk(final boolean z, TdApi.MessageSchedulingState messageSchedulingState, final boolean z2, final boolean z3) {
        if (this.f23641r0 != null) {
            if (messageSchedulingState != null || !m9131x9().f23734o) {
                this.f23501J0 = 0;
                this.f23480D4 = true;
                AbstractC7511x xVar = this.f23636q0;
                ArrayList<C6246h> J0 = xVar != null ? xVar.mo11250J0(true) : null;
                if (J0 == null) {
                    J0 = new ArrayList<>();
                    J0.add(this.f23646s0.m13461g().m13550K());
                } else if (J0.isEmpty()) {
                    J0.add(this.f23646s0.m13461g().m13550K());
                }
                this.f23641r0.mo11247L6(J0, new TdApi.MessageSendOptions(z, false, false, messageSchedulingState), z2, z3);
                m16245dm(true);
                this.f23468B2.m18408y2(true);
                return;
            }
            this.f30167b.m2485dd().m3787L8(this, mo16269b(), false, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z4, TdApi.MessageSchedulingState messageSchedulingState2, boolean z5) {
                    View$OnClickListenerC7430j1.this.m16483Aj(z, z2, z3, z4, messageSchedulingState2, z5);
                }
            }, m16142qi());
        }
    }

    public final void m16311Vl(boolean z) {
        AbstractC7511x xVar;
        if (this.f23659u3 != z) {
            this.f23659u3 = z;
            if (z && (xVar = this.f23636q0) != null) {
                ArrayList<C6246h> J0 = xVar.mo11250J0(true);
                m16319Ul(J0);
                if (J0 == null || J0.isEmpty()) {
                    return;
                }
            }
            m16324Ug(z ? 1.0f : 0.0f);
        }
    }

    @Override
    public void mo8236W5(RunnableC9558i0 i0Var, ArrayList<AbstractC4718o<?>> arrayList) {
        this.f23461A0.m7554W1(this, arrayList, null);
    }

    @Override
    public int mo418W9() {
        return R.id.menu_photo;
    }

    public final void m16308Wg(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.f23609k1 == null) {
                this.f23609k1 = new C3950k(9, this, C2057b.f7280b, 180L);
            }
            this.f23609k1.m29544i(z ? 1.0f : 0.0f);
        }
    }

    public final void m16307Wh(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16307Wh(int):void");
    }

    public final boolean m16306Wi() {
        C8112b g = this.f23646s0.m13461g();
        return g != null && (g.m13550K() == null || g.m13550K().m20845c1());
    }

    public final void m16305Wj() {
        m16411Jh();
    }

    public final void m16304Wk(int i, boolean z) {
        this.f23477D1.setDisableAnimations(z);
        this.f23666w0 = i;
        long j = 0;
        if (i == 0) {
            this.f23661v0.m29557B(C2057b.f7280b);
            C3950k kVar = this.f23661v0;
            if (this.f23626o0 != 4 && !this.f23543T2) {
                j = 180;
            }
            kVar.m29528y(j);
        } else if (i != 1) {
            if (i == 3) {
                this.f23661v0.m29557B(C2057b.f7280b);
                this.f23661v0.m29528y(190L);
            } else if (i == 4) {
                this.f23661v0.m29557B(C2057b.f7280b);
                this.f23661v0.m29528y(220L);
            } else if (i == 5) {
                this.f23661v0.m29557B(C2057b.f7283e);
                this.f23661v0.m29528y(0L);
            }
        } else if ((this.f23626o0 == 3 || z) && !this.f23676y0) {
            this.f23661v0.m29557B(C2057b.f7280b);
            this.f23661v0.m29528y(180L);
        } else {
            this.f23661v0.m29557B(C2057b.f7280b);
            this.f23661v0.m29528y(180L);
        }
    }

    public final void m16303Wl(float f, float f2, float f3, boolean z, boolean z2) {
        this.f23495H2 = f;
        this.f23499I2 = f2;
        this.f23503J2 = f3;
        float abs = Math.abs(Math.min(1.0f, f2 / C1357a0.m37541i(125.0f)));
        if (Float.isNaN(abs)) {
            abs = 0.0f;
        }
        if (z || abs > this.f23507K2 || z2) {
            m16295Xl(abs);
        }
        this.f23477D1.setTranslationX(f);
        this.f23477D1.setTranslationY(f2);
        if (!z) {
            if (f3 == 0.0f || f2 == 0.0f) {
                this.f23477D1.setRotation(0.0f);
            } else {
                this.f23477D1.setRotation(m16184lh(f, f2, f3));
            }
        }
    }

    public final void m16300Xg(float f) {
        if (this.f23683z2 == null) {
            this.f23683z2 = new C3950k(5, this, C2057b.f7280b, 150L, this.f23678y2);
        }
        this.f23683z2.m29544i(f);
    }

    public final void m16299Xh() {
        int i;
        int i2;
        ArrayList arrayList;
        if (this.f23646s0.m13459i() > 1) {
            C8112b g = this.f23646s0.m13461g();
            int i3 = this.f23626o0;
            if (i3 == 1 || i3 == 2 || m9131x9().f23729j) {
                arrayList = new ArrayList(this.f23646s0.m13459i());
                arrayList.addAll(this.f23646s0.m13462f());
                i = this.f23646s0.m13460h();
                i2 = 0;
            } else if (this.f23626o0 == 0) {
                arrayList = new ArrayList(10);
                long j = this.f23646s0.m13461g().getMessage().mediaAlbumId;
                if (j != 0) {
                    i2 = this.f23646s0.m13460h();
                    while (true) {
                        int i4 = i2 - 1;
                        if (i4 < 0 || this.f23646s0.m13463e(i4).getMessage().mediaAlbumId != j) {
                            break;
                        }
                        i2--;
                    }
                    int i5 = this.f23646s0.m13459i();
                    i = -1;
                    for (int i6 = i2; i6 < i5; i6++) {
                        C8112b e = this.f23646s0.m13463e(i6);
                        if (e.getMessage().mediaAlbumId != j) {
                            break;
                        }
                        if (e == g) {
                            i = arrayList.size();
                        }
                        arrayList.add(e);
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
            if (i2 == -1) {
                throw new IllegalArgumentException();
            } else if (arrayList.isEmpty()) {
                throw new IllegalArgumentException();
            } else if (i != -1) {
                C7453w wVar = new C7453w(this.f23563Y2, arrayList, i2);
                wVar.m16016q(g, i, 1.0f);
                this.f23563Y2.m16033h0(wVar);
                m16339Sh(false, false);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean m16298Xi() {
        return this.f23485F0;
    }

    public final void m16297Xj() {
        if (this.f23564Y3 != -1) {
            if (this.f23612k4) {
                m16288Yj();
            }
            this.f23568Z3 = true;
            m16085xh(this.f23564Y3);
            this.f23564Y3 = -1;
        }
    }

    public void m16296Xk(C7448r rVar) {
        super.m9476Ad(rVar);
        this.f23626o0 = rVar.f23721b;
        this.f23631p0 = rVar.f23722c;
        this.f23636q0 = rVar.f23723d;
        this.f23641r0 = rVar.f23724e;
        this.f23646s0 = rVar.f23725f;
        this.f23621n0 = rVar.f23731l;
        this.f23651t0 = rVar.f23736q;
        this.f23656u0 = rVar.f23733n;
    }

    public final void m16295Xl(float f) {
        if (this.f23507K2 != f) {
            this.f23507K2 = f;
            m16221gl(1.0f - f);
            View$OnClickListenerC9170d1 d1Var = this.f23586e2;
            if (d1Var != null) {
                d1Var.setTranslationY((-View$OnClickListenerC9170d1.m10066c3(d1Var.m10025w3())) * this.f23507K2);
            }
            if (this.f23626o0 == 3) {
                m16147pl(1.0f - this.f23507K2);
            } else {
                m16069zh();
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        boolean z = false;
        if (i != 0) {
            if (i != 2) {
                if (i == 4) {
                    m16225gh();
                } else if (i != 6) {
                    if (i == 8) {
                        m16242eh();
                    } else if (i == 11) {
                        m16234fh();
                    } else if (i != 15) {
                        if (i != 21) {
                            switch (i) {
                                case 17:
                                    if (f == 1.0f) {
                                        z = true;
                                    }
                                    m16258ch(z);
                                    return;
                                case 18:
                                    if (f == 1.0f) {
                                        z = true;
                                    }
                                    m16291Yg(z);
                                    return;
                                case 19:
                                    m16266bh();
                                    return;
                                default:
                                    return;
                            }
                        } else if (f == 0.0f) {
                            m16435Gh();
                        }
                    } else if (f != 1.0f) {
                    } else {
                        if (this.f23531Q2 != 0.0f || this.f23527P2 != 0.0f) {
                            m16216hh();
                        }
                    }
                } else if (f == 0.0f) {
                    m16254cl("", null);
                }
            } else if (f == 0.0f) {
                this.f23679y3.m15761h0(null);
            }
        } else if (f == 0.0f) {
            m16220gm();
            this.f23468B2.m18441G2();
            m16131rl(false);
            if (this.f23626o0 == 4 && this.f23666w0 == 4) {
                m16457Dl(false);
            }
            m16280Zj();
        } else if (f == 1.0f) {
            this.f23468B2.mo18440H2();
            this.f23477D1.setDisableAnimations(false);
            this.f23477D1.m16541J1(false);
            if (this.f23626o0 == 4) {
                final C8112b g = this.f23646s0.m13461g();
                C1379j0.m37332e0(new Runnable() {
                    @Override
                    public final void run() {
                        C8112b.this.m13521Y0();
                    }
                }, 20L);
            }
            if (m16143qh() != 0 && C4868i.m24726c2().m24763X2(4096L)) {
                C4868i.m24726c2().m24567w2(4096L);
                mo4347s().m14584H3().m8985g(this.f23510L1).m8960g(mo4347s().m14584H3().m8979m(m16142qi())).m8948u(C7512x0.f24028a).m8958i(this).m8972C(this.f30167b, R.string.HoldToSendAsFile).m8919F();
            }
        }
    }

    public final boolean m16294Y3() {
        AbstractC7511x xVar = this.f23636q0;
        if (xVar == null) {
            return false;
        }
        ArrayList<C6246h> J0 = xVar.mo11250J0(false);
        if (J0 != null) {
            Iterator<C6246h> it = J0.iterator();
            while (it.hasNext()) {
                C6246h next = it.next();
                if ((next instanceof C6253l) && ((C6253l) next).m20871D0()) {
                    return true;
                }
            }
            return false;
        } else if (this.f23646s0.m13461g().m13550K().m20871D0()) {
            return true;
        } else {
            return this.f23636q0.mo11227Y3();
        }
    }

    @Override
    public boolean mo15972Y4() {
        C3950k kVar = this.f23496H3;
        return (kVar == null || !kVar.m29531v()) && this.f23544T3 && this.f23552V3.m14853d();
    }

    @Override
    public void mo15971Y5(float f) {
        this.f23584d4.m14813q(f);
        this.f23556W3.setDegreesAroundCenter(f);
    }

    public final void m16291Yg(boolean z) {
        if (z) {
            this.f23477D1.setVisibility(4);
        } else {
            m16297Xj();
        }
    }

    public void m16290Yh(boolean z) {
        this.f23681z0 = z;
        this.f23501J0 = 5;
        this.f23676y0 = true;
    }

    public boolean m16289Yi() {
        return this.f23676y0;
    }

    public final void m16288Yj() {
        this.f23608j4 = false;
        this.f23612k4 = false;
        m16266bh();
        if (this.f23616l4) {
            this.f23616l4 = false;
            m16481Al(false);
        }
    }

    public final void m16287Yk(float f) {
        int i = (int) (this.f23615l3 * f);
        int i2 = i - this.f23619m3;
        if (i != 0) {
            this.f23619m3 = i;
            this.f23555W2.scrollBy(i2 * (C4403w.m27984G2() ? -1 : 1), 0);
        }
        float f2 = this.f23629o3;
        float f3 = f2 + ((1.0f - f2) * f);
        if (this.f23624n3.f23754h != f3) {
            this.f23624n3.f23754h = f3;
            this.f23555W2.invalidate();
        }
    }

    public final void m16286Yl(float f) {
        float f2 = this.f23511L2;
        float f3 = f2 + ((this.f23527P2 - f2) * f);
        float f4 = this.f23515M2;
        float f5 = f4 + ((this.f23531Q2 - f4) * f);
        boolean z = this.f23535R2 != -1.0f;
        m16303Wl(f3, f5, this.f23523O2, z, false);
        if (z) {
            C7401b0 b0Var = this.f23477D1;
            float f6 = this.f23519N2;
            b0Var.setRotation(f6 + ((this.f23535R2 - f6) * f));
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (!this.f23480D4 && m9139w9() != null && m9131x9().f23735p && this.f23646s0 != null) {
            for (int i = 0; i < this.f23646s0.m13459i(); i++) {
                C8112b e = this.f23646s0.m13463e(i);
                if (e.m13550K().m20846b1()) {
                    e.m13493n();
                }
            }
        }
        RunnableC7454x xVar = this.f23555W2;
        if (xVar != null) {
            C1399s0.m37162q(xVar);
        }
        C11052v1.m1768b().m1766d(this);
        C7401b0 b0Var = this.f23477D1;
        if (b0Var != null) {
            b0Var.m16528Z();
        }
        C7450t tVar = this.f23562Y1;
        if (tVar != null) {
            tVar.m16042b();
        }
        this.f30167b.m2930B4().m4713c0().m4614A0(this);
        this.f30165a.m14438t2(this, true);
    }

    public final void m16283Zg(C6246h hVar, Bitmap bitmap) {
        this.f23520N3.m20816J(hVar, bitmap, true);
    }

    public final void m16282Zh(float f) {
        C3950k kVar = this.f23525P0;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        m16246dl(f);
    }

    public boolean m16281Zi() {
        return this.f23513M0 == 1.0f;
    }

    public final void m16280Zj() {
    }

    public final void m16279Zk(float f) {
        if (m16451Ei() || this.f23626o0 == 3) {
            this.f23542T1.setAlpha(this.f23533R0 * f * (1.0f - this.f23565Z0));
        }
        C7489q1 q1Var = this.f23558X1;
        if (q1Var != null) {
            q1Var.setAlpha(this.f23533R0 * f * (1.0f - this.f23565Z0));
        }
        RunnableC7454x xVar = this.f23555W2;
        if (xVar != null) {
            xVar.setAlpha(f * this.f23533R0 * (1.0f - this.f23565Z0));
        }
    }

    public final void m16278Zl(C6246h hVar, C6253l lVar, Bitmap bitmap) {
        m16443Fh();
        this.f23504J3 = lVar;
        this.f23512L3 = hVar;
        this.f23508K3 = bitmap;
        if (lVar != null && bitmap != null) {
            C6244g.m20960k().m20969b(hVar, bitmap);
        }
    }

    @Override
    public void mo15757a6(int i, int i2, C8112b bVar, boolean z) {
        int i3 = this.f23626o0;
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                m16263bk(z);
                m16417Ij();
                return;
            } else if (i3 == 3) {
                C6840b0 b0Var = this.f23566Z1;
                AbstractC7511x xVar = this.f23636q0;
                b0Var.setChecked(xVar != null && xVar.mo11198v1(i, bVar));
                m16064zm(true);
                m16397Km(true);
                m16106um(true);
                return;
            } else if (i3 != 5) {
                return;
            }
        }
        if (!z) {
            m16397Km(true);
        }
        m16106um(true);
        m16072ym();
        m16263bk(z);
        m16417Ij();
    }

    public final void m16275ah(final int i) {
        this.f23500I3.m12821m(new AbstractC8323a() {
            @Override
            public final void mo12882a(Bitmap bitmap) {
                View$OnClickListenerC7430j1.this.m16264bj(i, bitmap);
            }
        });
    }

    public void m16274ai() {
        if (this.f23557X0) {
            m16386Mh();
        } else {
            this.f23468B2.m18408y2(true);
        }
    }

    public boolean m16273aj() {
        return this.f23480D4;
    }

    public void m16272ak(C7401b0 b0Var, float f, float f2) {
        boolean z = false;
        if (this.f23557X0) {
            m16473Bl(false);
            C2065g.m35719c(this.f23472C1);
        } else if (this.f23626o0 != 3 || this.f23684z3 == 0) {
            if (this.f23646s0.m13461g().m13484r0(b0Var, f, f2) || m16155om()) {
                z = true;
            }
            if (!z && this.f23626o0 == 3) {
                z = m16163nm();
            }
            if (z) {
                C2065g.m35719c(b0Var);
            }
        }
    }

    public final void m16271al(int i, boolean z) {
        if (i == R.id.btn_adjust) {
            this.f23530Q1.m16491i(z, true);
        } else if (i == R.id.btn_crop) {
            this.f23522O1.m16491i(z, true);
        } else if (i == R.id.btn_paint) {
            this.f23526P1.m16491i(z, true);
        }
    }

    public final void m16270am(float f) {
        if (this.f23547U2 != f) {
            this.f23547U2 = f;
            m16077yh();
            m16069zh();
            m16461Dh();
            m16414Im();
        }
    }

    @Override
    public long mo16269b() {
        AbstractC7511x xVar = this.f23636q0;
        if (xVar != null) {
            return xVar.mo11221b();
        }
        return 0L;
    }

    @Override
    public void mo7924b5(C9639r rVar, View view) {
        this.f23472C1.removeView(view);
    }

    public final void m16266bh() {
        if (this.f23580c4 != 0) {
            this.f23556W3.setBaseRotation(0.0f);
            this.f23556W3.m14808d(1.0f, 1.0f);
            this.f23556W3.m14809c(this.f23580c4);
            this.f23552V3.setRotation(0.0f);
            this.f23552V3.setScaleX(1.0f);
            this.f23552V3.setScaleY(1.0f);
            this.f23552V3.m14840q(this.f23580c4);
            m16399Kk(2);
            this.f23580c4 = 0;
        }
    }

    public final void m16265bi() {
        if (this.f23485F0) {
            m16440Fk();
            this.f23485F0 = false;
            this.f23550V1.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
            m16081xl();
        }
    }

    public final void m16263bk(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16263bk(boolean):void");
    }

    public final void m16262bl(boolean z) {
        if (this.f23665v4 != z) {
            this.f23665v4 = z;
            this.f23648s2.setAlpha(z ? 1.0f : 0.4f);
            this.f23648s2.setEnabled(z);
        }
    }

    public final void m16261bm(float f) {
        if (this.f23599h3 != f) {
            this.f23599h3 = f;
            if (this.f23575b3) {
                float f2 = this.f23579c3;
                int i = (int) (((f2 - f) / f2) * this.f23583d3);
                int i2 = i - this.f23587e3;
                if (i2 != 0) {
                    this.f23587e3 = i;
                    this.f23555W2.scrollBy(i2, 0);
                }
            }
            this.f23555W2.invalidate();
        }
    }

    public final void m16258ch(boolean z) {
    }

    public final void m16257ci(float f) {
        C3950k kVar = this.f23668w2;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        this.f23663v2 = -1.0f;
        m16196jl(f);
    }

    public void m16255ck() {
        if (this.f23626o0 == 3 && this.f23684z3 == 3) {
            this.f23650s4.getContentWrap().m12808D1();
        }
    }

    public final void m16254cl(String str, AbstractC5411l0[] l0VarArr) {
        View view = this.f23546U1;
        if (view instanceof TextView) {
            ((TextView) view).setText(C5078d.m23986z().m24024I(str));
        } else if (view instanceof C6973n0) {
            ((C6973n0) view).m18246y(str, l0VarArr, false);
        }
    }

    public final void m16253cm(boolean z) {
        int i;
        C3940f fVar = this.f23571a3;
        boolean z2 = fVar != null && fVar.m29583h();
        boolean z3 = z && !m16330Ti();
        if (z2 != z3) {
            if (this.f23571a3 == null) {
                this.f23571a3 = new C3940f(22, this, C2057b.f7280b, 140L);
            }
            this.f23575b3 = false;
            if (!z3) {
                this.f23591f3 = 0L;
                float g = this.f23571a3.m29584g();
                m16339Sh(true, true);
                if (g == 0.0f || (i = this.f23644r3) == 0) {
                    m16339Sh(true, false);
                } else if (i != 0) {
                    this.f23575b3 = true;
                    this.f23579c3 = g;
                    this.f23583d3 = i;
                    this.f23587e3 = 0;
                }
            } else {
                m16119th();
                this.f23555W2.m16010H1();
            }
            this.f23571a3.m29575p(z3, true);
        }
    }

    @Override
    public void mo11142d0() {
        this.f23661v0 = new C3950k(0, this, C2057b.f7280b, 180L);
        m16457Dl(true);
        m16313Vj();
        C7462l1 oi = m16159oi();
        if (oi == null || this.f23681z0) {
            this.f23671x0 = null;
            if (this.f23676y0 || this.f23681z0) {
                m16304Wk(5, true);
            } else {
                m16304Wk(0, true);
                this.f23477D1.setAlpha(0.0f);
            }
        } else {
            this.f23671x0 = oi;
            m16304Wk(1, true);
            this.f23477D1.m16512v2(oi, 0.0f);
            m16401Ki();
            if (this.f23626o0 == 3) {
                m16147pl(0.0f);
            }
        }
        m16354Qi();
    }

    public final void m16250dh(int i) {
        C8328e eVar = this.f23650s4;
        if (eVar != null) {
            eVar.setPaintingMode(i);
        }
    }

    public final void m16249di(float f) {
        C3950k kVar = this.f23467B1;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        m16407Jl(f);
    }

    public void m16247dk() {
        get();
        this.f23468B2.m18433P2(this.f23472C1, this);
    }

    public final void m16246dl(float f) {
        if (this.f23521O0 != f) {
            this.f23521O0 = f;
            this.f23542T1.setAlpha(f * this.f23533R0);
        }
    }

    public void m16245dm(boolean z) {
        this.f23670w4 = z;
    }

    public final void m16242eh() {
        float f = this.f23565Z0;
        if (f == 0.0f) {
            mo4347s().m14566L1(this.f23468B2);
            m16131rl(true);
            m16457Dl(true);
            this.f23569a1 = null;
        } else if (f == 1.0f) {
            m16131rl(false);
            m16457Dl(false);
            m16164nl(false);
        }
    }

    public final void m16241ei(float f) {
        C3950k kVar = this.f23683z2;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        m16237em(f);
    }

    public final void m16239ek() {
        if (this.f23684z3 != 2) {
            m16094wh(2, 1);
        }
    }

    public final void m16238el(boolean z, boolean z2) {
        if (this.f23517N0 != z) {
            this.f23517N0 = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m16348Rg(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m16282Zh(f);
        }
    }

    public final void m16237em(float f) {
        if (this.f23678y2 != f) {
            this.f23678y2 = f;
            m16077yh();
            C7489q1 q1Var = this.f23558X1;
            if (q1Var != null) {
                q1Var.setInnerAlpha(f);
            }
        }
    }

    @Override
    public void mo15890f1(C8112b bVar, boolean z) {
        if (this.f23558X1 != null && this.f23646s0.m13461g() == bVar) {
            this.f23558X1.m15829E1(z, true);
            m16447Em(z);
            this.f23558X1.m15827G1(true, true);
        }
    }

    public final void m16234fh() {
        this.f23573b1 = this.f23672x1;
        this.f23577c1 = this.f23677y1;
        this.f23642r1 = 0.0f;
        this.f23637q1 = 0.0f;
        m16352Qk();
    }

    public final CharSequence m16233fi() {
        int i;
        String str = m9131x9().f23728i;
        if (!C5070i.m24061i(str)) {
            return str;
        }
        C8112b g = this.f23646s0.m13461g();
        String J0 = g.mo13507g() != 0 ? C4403w.m27974J0(g.mo13507g(), TimeUnit.SECONDS) : null;
        int i2 = this.f23626o0;
        if (i2 == 0) {
            String ii = m16207ii(g);
            if (ii == null) {
                return J0 != null ? J0 : "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii);
            spannableStringBuilder.setSpan(C4403w.m27889d2(RunnableC5390g.m22983M0(ii)), 0, ii.length(), 33);
            if (J0 != null) {
                spannableStringBuilder.append(' ');
                spannableStringBuilder.append((CharSequence) J0);
            }
            return spannableStringBuilder;
        } else if (i2 != 1 && i2 != 2) {
            return i2 != 5 ? "" : C5070i.m24074D(m9131x9().f23726g);
        } else {
            if (J0 != null) {
                return this.f23646s0.m13457k() != 1 ? C4403w.m27865j1(R.string.format_mediaIndexAndTime, m16068zi(), J0) : J0;
            }
            if (i2 == 2) {
                i = this.f30167b.m2784K6(this.f23646s0.m13461g().m13552J()) ? R.string.ChannelPhoto : R.string.GroupPhoto;
            } else {
                i = R.string.ProfilePhoto;
            }
            return this.f23646s0.m13457k() != 1 ? m16068zi() : C4403w.m27869i1(i);
        }
    }

    public final void m16231fk() {
        if (!this.f23485F0) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23481E0;
            if (z0Var == null) {
                ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var2 = new ViewTreeObserver$OnPreDrawListenerC7081z0(mo4347s());
                this.f23481E0 = z0Var2;
                z0Var2.m17847a2(this, false, this, this, false);
                this.f23481E0.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 80));
                this.f23538S1.addView(this.f23481E0);
                this.f23468B2.getViewTreeObserver().addOnPreDrawListener(this.f23481E0);
            } else if (z0Var.getParent() == null) {
                this.f23538S1.addView(this.f23481E0);
            }
            boolean S9 = m9348S9();
            this.f23489G0 = S9;
            this.f23485F0 = true;
            if (S9) {
                this.f23550V1.setImageResource(R.drawable.baseline_keyboard_24);
                this.f23481E0.m17848Z1((C7029t0) this.f23546U1);
                return;
            }
            this.f23550V1.setImageResource(R.drawable.baseline_direction_arrow_down_24);
        }
    }

    public final void m16230fl(float f) {
        this.f23566Z1.setAlpha(f);
        this.f23566Z1.setEnabled(f == 1.0f);
        LinearLayout linearLayout = this.f23578c2;
        if (linearLayout != null) {
            linearLayout.setAlpha(f);
        }
    }

    public final void m16229fm(boolean z, boolean z2, long j, TimeUnit timeUnit, boolean z3) {
        long j2;
        long j3;
        long j4;
        long j5;
        if (this.f23558X1 != null) {
            C7401b0 b0Var = this.f23477D1;
            RunnableC7470o V1 = b0Var != null ? b0Var.m16532V1(this.f23646s0.m13461g()) : null;
            float f = 1.0f;
            boolean z4 = false;
            if (this.f23673x2 != z) {
                this.f23673x2 = z;
                if (z) {
                    if (!z2 || V1 == null) {
                        j5 = -1;
                        j4 = -1;
                    } else {
                        j4 = V1.getTimeNow();
                        j5 = V1.getTimeTotal();
                    }
                    if ((j4 == -1) || (j5 == -1)) {
                        this.f23558X1.m15830D1(timeUnit.toMillis(j), 0L, z2, z3 && this.f23678y2 != 0.0f);
                    } else {
                        this.f23558X1.m15830D1(j5, j4, z2, z3 && this.f23678y2 != 0.0f);
                    }
                    this.f23558X1.setFile(this.f23646s0.m13461g().m13550K());
                    boolean z5 = z2 && (this.f23646s0.m13461g().m13510e0() || (this.f23513M0 < 1.0f && !C8112b.m13514c0(this.f23646s0.m13461g().m13524X())));
                    this.f23558X1.m15827G1(z5, z3 && this.f23678y2 != 0.0f);
                    if (z5 && this.f23513M0 < 1.0f) {
                        C7489q1 q1Var = this.f23558X1;
                        if (z3 && this.f23678y2 != 0.0f) {
                            z4 = true;
                        }
                        q1Var.m15829E1(true, z4);
                        m16447Em(true);
                    }
                }
                if (z3) {
                    if (!z) {
                        f = 0.0f;
                    }
                    m16300Xg(f);
                    return;
                }
                if (!z) {
                    f = 0.0f;
                }
                m16241ei(f);
            } else if (z) {
                if (!z2 || V1 == null) {
                    j3 = -1;
                    j2 = -1;
                } else {
                    j2 = V1.getTimeNow();
                    j3 = V1.getTimeTotal();
                }
                if (j2 == -1 || j3 == -1) {
                    this.f23558X1.m15830D1(timeUnit.toMillis(j), 0L, z2, z3);
                } else {
                    this.f23558X1.m15830D1(j3, j2, z2, z3);
                }
                this.f23558X1.setFile(this.f23646s0.m13461g().m13550K());
                if (z2 && (this.f23646s0.m13461g().m13510e0() || this.f23513M0 < 1.0f)) {
                    z4 = true;
                }
                this.f23558X1.m15827G1(z4, z3);
                if (!z4) {
                    return;
                }
                if (this.f23513M0 < 1.0f || this.f23646s0.m13461g().m13518a0()) {
                    this.f23558X1.m15829E1(true, z3);
                    m16447Em(true);
                }
            }
        }
    }

    @Override
    public void mo452g2() {
        View view = this.f23546U1;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public boolean mo16228g5() {
        return C5070i.m24061i(((TextView) this.f23546U1).getText());
    }

    @Override
    public void mo9251g9(int i, int i2, int i3, int i4) {
        boolean z = this.f23654t3 != i4;
        this.f23654t3 = i4;
        if (this.f23626o0 == 3 && this.f23676y0) {
            if (i4 > C1357a0.m37536n()) {
                i4 = 0;
            }
            m16212hl(i4);
            int vi = m16102vi(2);
            C1399s0.m37195Z(this.f23556W3, vi);
            C7851a aVar = this.f23552V3;
            if (aVar != null) {
                aVar.setOffsetBottom(vi);
            }
        }
        C7401b0 b0Var = this.f23477D1;
        if (b0Var != null) {
            if (z) {
                b0Var.setOffsetBottom(m16102vi(this.f23684z3));
            }
            this.f23477D1.m16520k2();
        }
    }

    public final void m16225gh() {
        m16457Dl(true);
        m16371Oi(this.f23464A3);
        int i = this.f23684z3;
        if (i == 0) {
            this.f23477D1.setDisallowMove(false);
        } else if (i == 1) {
            m16203im();
        } else if (i == 2) {
            m16481Al(true);
        } else if (i == 3) {
            m16195jm();
        }
    }

    public final float m16224gi() {
        float f = 1.0f;
        float mi = (1.0f - this.f23669w3) * (1.0f - this.f23685z4) * (1.0f - this.f23466B0) * (1.0f - m16175mi());
        if (this.f23636q0 == null) {
            f = 0.0f;
        }
        return mi * f;
    }

    public final void m16222gk() {
        if (Build.VERSION.SDK_INT < 14) {
            C1379j0.m37290z0("Sorry, this feature is available only on Android 4.0+", 0);
        } else if (this.f23684z3 != 1) {
            m16094wh(1, 1);
        }
    }

    public final void m16221gl(float f) {
        if (this.f23513M0 == f) {
            return;
        }
        if (!Float.isNaN(f)) {
            this.f23513M0 = f;
            m16472Bm();
            if (!(Build.VERSION.SDK_INT < 19 || this.f23509L0 == null || this.f23671x0 == null)) {
                float f2 = this.f23513M0;
                if (f2 > 0.0f && f2 < 1.0f) {
                    m16425Hj();
                }
            }
            this.f23472C1.setWillNotDraw(f == 0.0f);
            this.f23472C1.invalidate();
            m16461Dh();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void m16220gm() {
        AbstractC7459k1 k1Var;
        C8112b bVar = this.f23497I0;
        if (!(bVar == null || (k1Var = this.f23631p0) == null)) {
            k1Var.mo9808F2(this.f23493H0, bVar, true);
        }
        this.f23497I0 = null;
    }

    @Override
    public void mo16219h(C7401b0 b0Var, float f) {
        float f2;
        int i;
        int i2;
        C3940f fVar = this.f23551V2;
        if (fVar != null && fVar.m29583h() && this.f23563Y2.f23745O != null) {
            int h = this.f23646s0.m13460h();
            float f3 = 1.0f;
            if (f < 0.0f && h > 0) {
                i = this.f23563Y2.f23745O.m16013t(h - 1);
                f2 = f + 1.0f;
            } else if (f <= 0.0f || (i2 = h + 1) >= this.f23646s0.m13459i()) {
                f2 = 1.0f;
                i = -1;
            } else {
                i = this.f23563Y2.f23745O.m16013t(i2);
                f2 = 1.0f - f;
            }
            if (i != -1) {
                f3 = f2;
            }
            int t = this.f23563Y2.f23745O.m16013t(h);
            if (t != -1 && this.f23563Y2.f23745O.m16017p(t, i, f3)) {
                m16339Sh(true, false);
                this.f23555W2.invalidate();
            }
        }
    }

    @Override
    public void mo12476h3(C8431f fVar, boolean z, int i) {
        m16262bl(z);
    }

    @Override
    public TdApi.Chat mo8235h7(RunnableC9558i0 i0Var) {
        long j = m9131x9().f23732m;
        if (j != 0) {
            return this.f30167b.m2632U2(j);
        }
        return null;
    }

    public final void m16216hh() {
        this.f23501J0 = 0;
        this.f23543T2 = true;
        m16427Hh();
    }

    public final float m16215hi() {
        return Math.max(0.0f, Math.min(1.0f, this.f23663v2)) * (1.0f - this.f23669w3) * (1.0f - this.f23685z4) * (1.0f - this.f23466B0) * (1.0f - m16175mi());
    }

    public final void m16212hl(int i) {
        if (this.f23649s3 != i) {
            this.f23649s3 = i;
            C1399s0.m37195Z(this.f23514M1, i);
            C1399s0.m37195Z(this.f23538S1, m16191ki());
        }
    }

    public void m16211hm() {
        String str;
        C8328e eVar = this.f23650s4;
        if (eVar != null && eVar.m12819o() && !this.f23650s4.getContentWrap().m12806F1()) {
            int i = 2;
            if (this.f23633p2.m11077e()) {
                float hue = this.f23658u2.getHue();
                float[] hsv = this.f23658u2.getHsv();
                int brushColor = this.f23658u2.getBrushColor();
                str = C1363c0.m37472B(0, hue, hsv[1], hsv[2], brushColor, true) + "\n" + C1363c0.m37472B(1, hue, hsv[1], hsv[2], brushColor, true) + "\n" + C1363c0.m37472B(2, hue, hsv[1], hsv[2], brushColor, true) + "\n" + ((Object) C4403w.m27853m1(R.string.BrushSize, C7389v0.m16641e0(this.f23658u2.m11067a(1.0f), false)));
            } else {
                str = C4868i.m24726c2().m24763X2(131072L) ? C4403w.m27869i1(R.string.HoldToTone) : null;
                i = 0;
            }
            if (!C5070i.m24061i(str)) {
                C9357x2.C9370l lVar = this.f23655t4;
                if (lVar != null) {
                    if (!str.equals(lVar.m8922C())) {
                        this.f23655t4.m8903V(mo4347s().m14584H3().m8981k(this.f30167b, str, i), 0);
                    }
                    this.f23655t4.m8900Y();
                    return;
                }
                this.f23655t4 = mo4347s().m14584H3().m8985g(this.f23658u2).m8943z(true).m8960g(mo4347s().m14584H3().m8979m(m16142qi())).m8973B(mo4347s().m14584H3().m8981k(this.f30167b, str, i));
                return;
            }
        }
        C9357x2.C9370l lVar2 = this.f23655t4;
        if (lVar2 != null) {
            lVar2.m8915J();
        }
    }

    public final boolean m16208ih() {
        C3940f fVar = this.f23571a3;
        return fVar != null && fVar.m29583h();
    }

    public final String m16207ii(C8112b bVar) {
        TdApi.Chat U2;
        if (bVar.m13546M() != null) {
            return this.f30167b.m2151yb(bVar.m13546M());
        }
        if (bVar.m13552J() == 0 || (U2 = this.f30167b.m2632U2(bVar.m13552J())) == null) {
            return null;
        }
        return U2.title;
    }

    public final void m16204il(float f) {
        this.f23570a2.setAlpha(f);
        this.f23570a2.setEnabled(f == 1.0f);
    }

    public final void m16203im() {
        if (this.f23500I3 == null) {
            C8328e eVar = new C8328e(mo4347s());
            this.f23500I3 = eVar;
            eVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, 17));
        }
        Bitmap bitmap = this.f23508K3;
        if (bitmap != null) {
            this.f23500I3.m12815s(this.f23504J3, bitmap.getWidth(), this.f23508K3.getHeight(), this.f23508K3, this.f23516M3, this.f23504J3.m20896t());
        } else {
            this.f23500I3.m12813u(this.f23524O3, this.f23528P3, this.f23504J3.m20850X0(), this.f23504J3.m20912j());
        }
        this.f23477D1.getBaseCell().addView(this.f23500I3);
        if (this.f23508K3 != null) {
            this.f23500I3.setEditorVisible(true);
        } else {
            m16400Kj(this.f23512L3);
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        C3950k kVar;
        if (this.f23487F2 || ((kVar = this.f23539S2) != null && kVar.m29531v())) {
            return true;
        }
        if (this.f23659u3) {
            m16311Vl(false);
            return true;
        } else if (this.f23684z3 != 0) {
            m16484Ai(true);
            return true;
        } else if (this.f23485F0) {
            m16265bi();
            return true;
        } else if (this.f23477D1.getCurrentZoom() <= 1.0f) {
            return false;
        } else {
            this.f23477D1.getBaseCell().getDetector().m15870m(true);
            return true;
        }
    }

    public final void m16200jh() {
        AbstractC9323v4<?> F = this.f30165a.m14552P1().m9763F();
        if (F != null) {
            F.mo9397La();
        }
        if (this.f23477D1.m16523f2()) {
            m16473Bl(false);
        }
    }

    public int m16199ji() {
        return this.f23654t3;
    }

    public final void m16196jl(float f) {
        if (this.f23663v2 != f) {
            this.f23663v2 = f;
            m16204il(m16215hi());
            float f2 = (f * 0.3f) + 0.7f;
            this.f23570a2.setScaleX(f2);
            this.f23570a2.setScaleY(f2);
        }
    }

    public final void m16195jm() {
        if (this.f23650s4 == null) {
            C8328e eVar = new C8328e(mo4347s());
            this.f23650s4 = eVar;
            eVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, 17));
            m16250dh(this.f23660u4);
        }
        this.f23650s4.getContentWrap().m12803J1(this.f23658u2.getBrushColor(), this.f23658u2.m11067a(m16183li()));
        this.f23650s4.m12815s(this.f23625n4.m13550K(), this.f23630o4, this.f23635p4, null, null, this.f23640q4);
        boolean E0 = this.f23625n4.m13561E0(null, false);
        this.f23477D1.getBaseCell().addView(this.f23650s4);
        this.f23650s4.setEditorVisible(true);
        this.f23650s4.getContentWrap().setDrawingListener(new C8328e.RunnableC8330b.AbstractC8331a() {
            @Override
            public final void mo12802a(View view, int i) {
                View$OnClickListenerC7430j1.this.m16459Dj(view, i);
            }
        });
        if (E0) {
            this.f23477D1.getBaseReceiver().invalidate();
        }
        m16211hm();
    }

    @Override
    public void mo14384k0(C6246h hVar, boolean z, Bitmap bitmap) {
        if (z) {
            m16156ol(hVar, bitmap);
        }
    }

    @Override
    public void mo11057k7(C8867c cVar) {
        C8328e eVar = this.f23650s4;
        if (eVar != null) {
            eVar.getContentWrap().m12803J1(cVar.getBrushColor(), cVar.m11067a(m16183li()));
        }
    }

    public final int m16191ki() {
        return (this.f23471C0 ? 0 : C1357a0.m37541i(56.0f)) + this.f23649s3;
    }

    public final void m16188kl(float f) {
        this.f23548U3.setAlpha(f);
    }

    public final void m16187km() {
        C8431f fVar = this.f23640q4;
        if (fVar != null) {
            fVar.m12494i();
        }
        C5320c cVar = new C5320c(5);
        C5320c cVar2 = new C5320c(5);
        C5146u0 u0Var = new C5146u0(5);
        cVar.m23284a(R.id.paint_mode_path);
        cVar2.m23284a(R.drawable.baseline_adjust_24);
        u0Var.m23816a(R.string.PaintModeDoodle);
        cVar.m23284a(R.id.paint_mode_arrow);
        cVar2.m23284a(R.drawable.baseline_arrow_upward_24);
        u0Var.m23816a(R.string.PaintModeArrow);
        cVar.m23284a(R.id.paint_mode_rect);
        cVar2.m23284a(R.drawable.baseline_crop_3_2_24);
        u0Var.m23816a(R.string.PaintModeRect);
        C8431f fVar2 = this.f23640q4;
        if (fVar2 != null && fVar2.m12494i()) {
            cVar.m23284a(R.id.paint_mode_fill);
            cVar2.m23284a(R.drawable.baseline_format_color_fill_24);
            u0Var.m23816a(R.string.PaintModeFill);
        }
        m9254fe(null, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Ej;
                Ej = View$OnClickListenerC7430j1.this.m16450Ej(view, i);
                return Ej;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        }, m16142qi());
    }

    public final float m16184lh(float f, float f2, float f3) {
        float f4;
        int measuredWidth = this.f23477D1.getMeasuredWidth();
        int measuredHeight = this.f23477D1.getMeasuredHeight();
        float f5 = measuredWidth;
        float Z = this.f23491G2.m13520Z();
        float f6 = (f3 - (measuredWidth / 2)) * (-1.0f);
        return (f6 / (f5 * 0.5f)) * (f2 / (measuredHeight * 0.5f)) * (-35.0f) * Math.min(1.0f, Math.max(-1.0f, f / (((int) (Z * Math.min(f5 / Z, f4 / this.f23491G2.m13570A()))) * 0.2f))) * Math.signum(f6);
    }

    public final float m16183li() {
        return 1.0f;
    }

    public final void m16180ll(int i, int i2) {
        this.f23552V3.m14837t(i, i2);
        this.f23614l2.m16491i((i == 0 || i2 == 0) ? false : true, true);
    }

    public final void m16179lm() {
        final C8112b g = this.f23646s0.m13461g();
        this.f30167b.m2485dd();
        HandlerC10770jj.m3757O8(mo4347s(), g.m13542O(), true, true, g.m13492n0() ? R.string.MessageLifetimeVideo : R.string.MessageLifetimePhoto, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC7430j1.this.m16441Fj(g, (HandlerC10770jj.C10787p) obj);
            }
        });
    }

    public final int m16176mh() {
        int i = this.f23626o0;
        return C1357a0.m37541i((i == 1 || i == 2) ? 26.0f : 22.0f) + C1357a0.m37541i(1.0f);
    }

    public final float m16175mi() {
        return m16322Ui() ? 1.0f : 0.0f;
    }

    public final void m16172ml(float f) {
        if (this.f23608j4) {
            C7468n1 n1Var = this.f23623n2;
            float f2 = this.f23600h4;
            n1Var.m15975d(f2 + ((this.f23604i4 - f2) * f), true);
        }
        if (this.f23580c4 != 0) {
            m16090wl(f);
        }
    }

    public final void m16171mm() {
        m9254fe(C4403w.m27869i1(R.string.DiscardCurrentChanges), new int[]{R.id.btn_discard, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Discard), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Gj;
                Gj = View$OnClickListenerC7430j1.this.m16433Gj(view, i);
                return Gj;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        }, m16142qi());
    }

    @Override
    public void mo15809n6(int i) {
        boolean z = true;
        this.f23540S3 = true;
        C8328e eVar = this.f23500I3;
        if (eVar != null) {
            if (i != 14) {
                z = false;
            }
            eVar.m12816r(z);
        }
    }

    public final boolean m16168nh() {
        int i = this.f23626o0;
        return i != 4 && (i != 3 || this.f23684z3 == 0) && this.f23477D1.getCurrentZoom() == 1.0f && !this.f23471C0;
    }

    public TdApi.File m16167ni() {
        return this.f23646s0.m13461g().m13540P();
    }

    public final void m16165nk() {
        if (!this.f23646s0.m13461g().m13492n0() && this.f23684z3 != 3) {
            m16094wh(3, 1);
        }
    }

    public final void m16164nl(boolean z) {
        View$OnClickListenerC9170d1 d1Var = this.f23586e2;
        int i = 0;
        if (d1Var != null) {
            d1Var.setVisibility(z ? 0 : 8);
        }
        FrameLayoutFix frameLayoutFix = this.f23538S1;
        if (frameLayoutFix != null) {
            if (!z) {
                i = 8;
            }
            frameLayoutFix.setVisibility(i);
        }
    }

    public final boolean m16163nm() {
        if (this.f23636q0 == null) {
            return false;
        }
        m16448El(this.f23566Z1.m18799v(), true);
        return true;
    }

    @Override
    public boolean mo8234o3(RunnableC9558i0 i0Var) {
        return true;
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public boolean mo7205o7(float f, float f2) {
        boolean z = true;
        if (this.f23605j1) {
            m16355Qh(f, f2);
            return true;
        }
        if (this.f23487F2) {
            if (Math.max(Math.abs(f), Math.abs(f2)) <= C1357a0.m37541i(50.0f)) {
                z = false;
            }
            m16347Rh(f, f2, z);
        }
        return false;
    }

    @Override
    public android.view.View mo403oc(android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.mo403oc(android.content.Context):android.view.View");
    }

    public final boolean m16160oh() {
        C8112b g = this.f23646s0.m13461g();
        return g != null && g.m13492n0() && !g.m13510e0();
    }

    public C7462l1 m16159oi() {
        if (this.f23631p0 == null || C1379j0.m37353O()) {
            return null;
        }
        return this.f23631p0.mo9807v(this.f23646s0.m13460h(), this.f23646s0.m13461g());
    }

    public final void m16157ok() {
        if (this.f23684z3 == 4) {
            return;
        }
        if (!C4183a.f14089g) {
            C1379j0.m37310p0(18);
        } else {
            m16094wh(4, 1);
        }
    }

    public final void m16156ol(final C6246h hVar, final Bitmap bitmap) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC7430j1.this.m16475Bj(hVar, bitmap);
            }
        });
    }

    public final boolean m16155om() {
        if (this.f23586e2 == null) {
            return false;
        }
        boolean z = !this.f23529Q0;
        this.f23529Q0 = z;
        m16332Tg(z ? 1.0f : 0.0f);
        return true;
    }

    @Override
    public void onClick(View view) {
        boolean z;
        float f;
        int[] iArr;
        int[][] iArr2;
        if (!this.f23670w4) {
            char c = 0;
            switch (view.getId()) {
                case R.id.btn_adjust:
                    int X = this.f23646s0.m13461g().m13524X();
                    if (X == 3) {
                        m16222gk();
                        return;
                    } else if (X == 4) {
                        m16157ok();
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_back:
                    if (this.f23684z3 != 0) {
                        m16484Ai(false);
                        return;
                    } else {
                        m16427Hh();
                        return;
                    }
                case R.id.btn_caption_done:
                    m16305Wj();
                    return;
                case R.id.btn_caption_emoji:
                    m16458Dk();
                    return;
                case R.id.btn_check:
                    m16163nm();
                    return;
                case R.id.btn_counter:
                    AbstractC7511x xVar = this.f23636q0;
                    if (xVar != null) {
                        if (xVar.mo11198v1(this.f23646s0.m13460h(), this.f23646s0.m13461g())) {
                            z = true;
                            if (this.f23636q0.mo11242P0() <= 1) {
                                return;
                            }
                        } else {
                            z = true;
                        }
                        m16311Vl(z);
                        return;
                    }
                    return;
                case R.id.btn_crop:
                    if (this.f23646s0.m13461g().m13492n0()) {
                        m16360Pk();
                        return;
                    } else {
                        m16239ek();
                        return;
                    }
                case R.id.btn_inlineClose:
                    m16386Mh();
                    return;
                case R.id.btn_inlineOpen:
                    m16200jh();
                    return;
                case R.id.btn_inlinePlayPause:
                    this.f23646s0.m13461g().m13480t0(view);
                    return;
                case R.id.btn_paint:
                    int X2 = this.f23646s0.m13461g().m13524X();
                    if (X2 == 3) {
                        m16165nk();
                        return;
                    } else if (X2 == 4) {
                        m16146pm();
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_paintType:
                    m16187km();
                    return;
                case R.id.btn_proportion:
                    if (m16373Og() && this.f23684z3 == 2) {
                        int[][] iArr3 = f23460G4;
                        C5320c cVar = new C5320c(iArr3.length + 2);
                        C5146u0 u0Var = new C5146u0(iArr3.length + 2);
                        C5320c cVar2 = new C5320c(iArr3.length + 2);
                        C5320c cVar3 = new C5320c(iArr3.length + 2);
                        C8112b g = this.f23646s0.m13461g();
                        g.m13520Z();
                        g.m13570A();
                        if (this.f23614l2.m16492h()) {
                            f = this.f23552V3.getFixedProportion();
                            cVar2.m23284a(R.drawable.baseline_crop_free_24);
                            cVar.m23284a(R.id.btn_proportion_free);
                            u0Var.m23816a(R.string.CropFree);
                            cVar3.m23284a(1);
                        } else {
                            f = 0.0f;
                        }
                        float originalProportion = this.f23552V3.getOriginalProportion();
                        int length = iArr3.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                int[] iArr4 = iArr3[i];
                                if (iArr4[0] / iArr4[1] == originalProportion) {
                                    iArr = iArr4;
                                } else {
                                    i++;
                                }
                            } else {
                                iArr = null;
                            }
                        }
                        if (originalProportion != 0.0f) {
                            cVar2.m23284a(R.drawable.baseline_crop_original_24);
                            cVar.m23284a(R.id.btn_proportion_original);
                            if (iArr == null) {
                                u0Var.m23816a(R.string.CropOriginal);
                            } else if (iArr[2] == R.id.btn_proportion_square) {
                                u0Var.m23815b(C4403w.m27869i1(R.string.CropOriginal) + " (" + C4403w.m27869i1(R.string.CropSquare) + ")");
                            } else {
                                u0Var.m23815b(C4403w.m27869i1(R.string.CropOriginal) + " (" + iArr[0] + ":" + iArr[1] + ")");
                            }
                            cVar3.m23284a(originalProportion == f ? 3 : 1);
                        }
                        int[][] iArr5 = f23460G4;
                        int length2 = iArr5.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            int[] iArr6 = iArr5[i2];
                            int i3 = iArr6[2];
                            int i4 = iArr6[c];
                            int i5 = iArr6[1];
                            int i6 = iArr6[3];
                            iArr = iArr;
                            if (iArr != null) {
                                iArr2 = iArr5;
                                if (i4 / i5 == originalProportion) {
                                    i2++;
                                    iArr5 = iArr2;
                                    c = 0;
                                }
                            } else {
                                iArr2 = iArr5;
                            }
                            cVar.m23284a(i3);
                            if (i3 == R.id.btn_proportion_square) {
                                u0Var.m23816a(R.string.CropSquare);
                            } else {
                                u0Var.m23815b(i4 + ":" + i5);
                            }
                            cVar2.m23284a(i6);
                            cVar3.m23284a(((float) i4) / ((float) i5) == f ? 3 : 1);
                            i2++;
                            iArr5 = iArr2;
                            c = 0;
                        }
                        if (!this.f23584d4.m14818l()) {
                            cVar3.m23284a(2);
                            cVar.m23284a(R.id.btn_crop_reset);
                            u0Var.m23816a(R.string.Reset);
                            cVar2.m23284a(R.drawable.baseline_cancel_24);
                        }
                        m9254fe(null, cVar.m23280e(), u0Var.m23813d(), cVar3.m23280e(), cVar2.m23280e(), new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i7) {
                                boolean cj;
                                cj = View$OnClickListenerC7430j1.this.m16256cj(view2, i7);
                                return cj;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i7) {
                                return C5115g0.m23934b(this, i7);
                            }
                        }, m16142qi());
                        return;
                    }
                    return;
                case R.id.btn_removePhoto:
                    m16114tm(((C7508w) view.getParent()).getImage());
                    return;
                case R.id.btn_rotate:
                    m16360Pk();
                    return;
                case R.id.btn_send:
                    if (this.f23684z3 != 0) {
                        m16094wh(0, 1);
                        return;
                    } else {
                        m16312Vk(false, null, false, false);
                        return;
                    }
                case R.id.menu_btn_stopwatch:
                    m16179lm();
                    return;
                case R.id.paint_undo:
                    m16122sm();
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        C9310u0 B2 = d1Var.m10132B2(R.id.menu_btn_pictureInPicture, R.drawable.deproko_baseline_outinline_24, R.id.theme_color_white, null, C1357a0.m37541i(49.0f), d1Var);
        B2.setBackgroundResource(R.drawable.bg_btn_header_light);
        int i2 = 0;
        B2.setVisibility(m16160oh() ? 0 : 8);
        linearLayout.addView(B2);
        C9310u0 Z1 = d1Var.m10073Z1(linearLayout, null, R.id.theme_color_white);
        Z1.setBackgroundResource(R.drawable.bg_btn_header_light);
        if (!m16135rh()) {
            i2 = 8;
        }
        Z1.setVisibility(i2);
        d1Var.m10065d2(linearLayout, null, R.id.theme_color_white).setBackgroundResource(R.drawable.bg_btn_header_light);
    }

    @Override
    public void mo16154p5() {
        if (((TextView) this.f23546U1).getText().length() > 0) {
            this.f23546U1.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public final boolean m16151ph() {
        return this.f23626o0 == 4 && Build.VERSION.SDK_INT < 26;
    }

    public final C8111a m16150pi(boolean z) {
        C8111a z2 = this.f23646s0.m13461g().m13469z();
        return (z2 != null || !z) ? z2 : new C8111a();
    }

    public final void m16147pl(float f) {
        this.f23514M1.setAlpha(f);
        this.f23574b2.setAlpha(this.f23669w3 * f);
        C7506v vVar = this.f23674x3;
        if (vVar != null) {
            vVar.setAlpha(this.f23669w3 * f);
        }
        int i = this.f23684z3;
        if (i == 0) {
            m16279Zk(f);
            m16230fl(m16224gi() * f);
            m16204il(f * m16215hi());
        } else if (i == 1) {
            this.f23590f2.setAlpha(f);
        } else if (i == 4) {
            this.f23598h2.setAlpha(f);
        }
    }

    public final void m16146pm() {
        if (C4183a.f14090h) {
            this.f23526P1.m16491i(this.f23646s0.m13461g().m13531T0(), true);
            this.f23477D1.getBaseCell().m15948K0();
            m16438Fm();
            return;
        }
        C1379j0.m37310p0(18);
    }

    @Override
    public void mo15838q2(C7484p1 p1Var, boolean z) {
        if (z) {
            this.f23477D1.m16516p2();
        } else {
            this.f23477D1.m16514t2(p1Var.getValue());
        }
    }

    @Override
    public void mo14383q5(C6246h hVar, float f) {
    }

    public final int m16143qh() {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16143qh():int");
    }

    public final AbstractC11531p m16142qi() {
        return C11514c0.m348a(2);
    }

    public final void m16139ql(float f) {
        if (this.f23505K0 != f) {
            this.f23505K0 = f;
            this.f23477D1.setAlpha(Math.max(0.0f, Math.min(1.0f, f)));
        }
    }

    public final void m16138qm() {
        if (Math.abs(this.f23573b1) == 2.0f) {
            m16337Sj(0.0f, 0.0f, false);
        } else {
            m16398Kl(!this.f23682z1, true);
        }
    }

    @Override
    public void mo8233r0(RunnableC9558i0 i0Var, ArrayList<AbstractC4718o<?>> arrayList, boolean z) {
        if (this.f23461A0 == null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 80);
                C7439i iVar = new C7439i(mo4347s());
                this.f23461A0 = iVar;
                iVar.setListener((View$OnClickListenerC9694y.AbstractC9704j) this.f23546U1);
                this.f23461A0.setAlpha(this.f23466B0);
                this.f23461A0.setOffsetProvider(this);
                this.f23461A0.setUseDarkMode(true);
                this.f23461A0.setLayoutParams(t1);
            } else {
                return;
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<AbstractC4718o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo25206P(true);
            }
            if (this.f23461A0.getParent() == null) {
                this.f23468B2.addView(this.f23461A0);
            }
        }
        this.f23461A0.m7533v2(this, arrayList, z, ((RunnableC9558i0) this.f23546U1).getInlineSearchContext(), false);
    }

    @Override
    public int mo7522r4(View$OnClickListenerC9694y yVar) {
        return this.f23468B2.getMeasuredHeight();
    }

    public final boolean m16135rh() {
        return false;
    }

    public final int m16134ri(int i) {
        int i2 = i != 2 ? 0 : C1357a0.m37541i(22.0f);
        C6253l K = this.f23646s0.m13461g().m13550K();
        float Z0 = K.m20848Z0();
        float M0 = K.m20861M0();
        return i2 + Math.max(0, ((((int) (Math.min(this.f23477D1.getActualImageWidth() / Z0, this.f23477D1.getActualImageHeight() / M0) * Z0)) - ((int) (Z0 * Math.min(((this.f23477D1.getMeasuredWidth() - i2) - i2) / Z0, ((this.f23477D1.getMeasuredHeight() - m16102vi(i)) - m16084xi(i)) / M0)))) / 2) - i2);
    }

    public final void m16131rl(boolean z) {
        int i;
        AbstractC9323v4<?> F;
        if (Build.VERSION.SDK_INT >= 21 && (i = this.f23626o0) != 3) {
            if (z && ((i == 0 || i == 5) && (F = this.f30165a.m14552P1().m9763F()) != null)) {
                F.mo9397La();
            }
            if (z) {
                mo4347s().m14550Q(this, true);
            } else {
                mo4347s().m14438t2(this, true);
            }
        }
    }

    public final boolean m16130rm() {
        C8328e eVar = this.f23650s4;
        if (eVar == null || eVar.getContentWrap().m12805G1()) {
            return false;
        }
        this.f23640q4.m12478y();
        return true;
    }

    @Override
    public boolean mo15837s0(C7484p1 p1Var) {
        return this.f23646s0.m13461g().m13492n0();
    }

    public final boolean m16127sh() {
        return false;
    }

    public void m16124sk() {
        if (this.f23581d1) {
            this.f23646s0.m13461g().m13480t0(this.f23498I1);
        }
    }

    public final void m16123sl(float f) {
        View$OnClickListenerC9170d1 d1Var;
        m16115tl(f);
        int i = this.f23666w0;
        if (i == 0) {
            View$OnClickListenerC9170d1 d1Var2 = this.f23586e2;
            if (d1Var2 != null) {
                d1Var2.setAlpha(f);
            }
        } else if (i == 1 && (d1Var = this.f23586e2) != null) {
            d1Var.setTranslationY((-View$OnClickListenerC9170d1.m10066c3(d1Var.m10025w3())) * (1.0f - f));
        }
    }

    public final void m16122sm() {
        C8328e eVar = this.f23650s4;
        if (eVar != null && !eVar.getContentWrap().m12805G1()) {
            this.f23640q4.m12477z();
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1510699180) {
            final TdApi.ChatPhotos chatPhotos = (TdApi.ChatPhotos) object;
            m9151ud(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC7430j1.this.m16117tj(chatPhotos);
                }
            });
        } else if (constructor == -16498159) {
            final TdApi.Messages messages = (TdApi.Messages) object;
            m9151ud(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC7430j1.this.m16125sj(messages);
                }
            });
        }
    }

    @Override
    public void mo15970t3(float f) {
        this.f23552V3.m14848i(f);
    }

    public final void m16119th() {
        C3950k kVar = this.f23611k3;
        if (kVar != null) {
            kVar.m29541l(0.0f);
            this.f23624n3 = null;
        }
    }

    public int m16118ti() {
        return this.f23626o0;
    }

    public final Bitmap m16116tk() {
        if (!(this.f23477D1.getBaseReceiver() instanceof C6257p)) {
            return null;
        }
        C6257p pVar = (C6257p) this.f23477D1.getBaseReceiver();
        this.f23520N3 = pVar;
        Bitmap q = pVar.m20799q();
        if (q == null || q.isRecycled()) {
            return null;
        }
        this.f23524O3 = q.getWidth();
        this.f23528P3 = q.getHeight();
        return q;
    }

    public final void m16115tl(float f) {
        if (this.f23541T0 != f) {
            this.f23541T0 = f;
            m16414Im();
        }
    }

    public final void m16114tm(C6246h hVar) {
        int p = this.f23646s0.m13452p(hVar);
        if (p != -1) {
            if (p == this.f23646s0.m13460h()) {
                this.f23566Z1.setChecked(false);
            }
            if (this.f23636q0 != null) {
                C8112b e = this.f23646s0.m13463e(p);
                m16452Eh(e, p);
                this.f23636q0.mo11240Q1(p, e, false);
                int P0 = this.f23636q0.mo11242P0();
                if (P0 == 0) {
                    m16257ci(0.0f);
                } else {
                    this.f23570a2.m9679E(P0);
                }
            }
            this.f23679y3.m15762g0(hVar);
            if (this.f23679y3.mo6153D() == 0) {
                m16311Vl(false);
            }
        }
    }

    @Override
    public boolean mo15808u4() {
        return !this.f23670w4;
    }

    public final void m16111uh() {
        C3950k kVar = this.f23576b4;
        if (kVar != null) {
            kVar.m29542k();
        }
        this.f23572a4 = 0.0f;
    }

    public final boolean m16110ui(int[] iArr) {
        C8112b bVar;
        int measuredWidth = this.f23477D1.getMeasuredWidth();
        int measuredHeight = this.f23477D1.getMeasuredHeight();
        if (measuredHeight == 0 || measuredWidth == 0 || (bVar = this.f23569a1) == null) {
            return false;
        }
        float Z = bVar.m13520Z();
        float A = this.f23569a1.m13570A();
        float min = Math.min(measuredWidth / Z, measuredHeight / A);
        iArr[0] = (int) (Z * min);
        iArr[1] = (int) (A * min);
        return true;
    }

    public final boolean m16108uk() {
        C8112b g = this.f23646s0.m13461g();
        C6257p imageReceiver = this.f23477D1.getBaseCell().getImageReceiver();
        if (g.m13492n0() || g.m13512d0() || imageReceiver == null) {
            C1379j0.m37292y0(R.string.MediaTypeUnsupported, 0);
            return false;
        }
        Bitmap q = imageReceiver.m20799q();
        this.f23592f4 = q;
        if (q == null || q.isRecycled()) {
            return false;
        }
        this.f23596g4 = g.m13550K().mo20873x();
        this.f23584d4 = m16329Tj(true);
        this.f23640q4 = m16321Uj(false);
        this.f23588e4 = new C7856c(this.f23584d4);
        return true;
    }

    public final void m16107ul(float f) {
        this.f23533R0 = f;
        m16080xm();
        m16098vm();
        m16422Hm();
        m16414Im();
    }

    public final void m16106um(boolean z) {
        C8112b g = this.f23646s0.m13461g();
        int i = this.f23626o0;
        if (i != 0) {
            if (i == 3) {
                this.f23473C2 = true;
                TdApi.FormattedText s = g.m13483s();
                if (s != null) {
                    ((RunnableC9558i0) this.f23546U1).m8249v0(C4779t2.m25441q5(s), true);
                } else {
                    ((RunnableC9558i0) this.f23546U1).m8249v0("", true);
                }
                this.f23473C2 = false;
                return;
            } else if (i != 5) {
                return;
            }
        }
        boolean z2 = g.m13483s() != null;
        if (z2) {
            ((C6973n0) this.f23546U1).m18246y(g.m13483s().text, g.m13481t(), false);
            if (!z && !this.f23517N0) {
                this.f23517N0 = true;
                this.f23521O0 = 1.0f;
            }
        }
        m16238el(z2, z);
    }

    @Override
    public void mo15889v5(C8112b bVar, boolean z) {
        if (this.f23646s0.m13461g() == bVar) {
            C7489q1 q1Var = this.f23558X1;
            if (q1Var != null) {
                q1Var.m15829E1(z, this.f23678y2 > 0.0f);
            }
            this.f23581d1 = z;
            int i = this.f23626o0;
            if (i == 0 || i == 5) {
                m16447Em(z);
                if (!z) {
                    m16398Kl(true, true);
                }
            }
        }
    }

    public final void m16103vh() {
        ImageLoader.m14392e().m14386k(this.f23532Q3);
    }

    public final int m16102vi(int i) {
        int i2;
        int i3 = this.f23676y0 ? this.f23654t3 : 0;
        if (i == 1) {
            i2 = C1357a0.m37541i(220.0f);
        } else if (i == 2) {
            i2 = C1357a0.m37541i(160.0f);
        } else if (i == 3) {
            i2 = C1357a0.m37541i(136.0f);
        } else if (i != 4) {
            return 0;
        } else {
            i2 = m16093wi(i) + C1357a0.m37541i(12.0f);
        }
        return i2 + i3;
    }

    public final void m16100vk() {
        if (this.f23548U3 == null) {
            C7855b bVar = new C7855b(mo4347s());
            this.f23548U3 = bVar;
            bVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 49);
            t1.topMargin = m16084xi(2);
            t1.bottomMargin = m16102vi(2);
            int i = C1357a0.m37541i(22.0f);
            t1.rightMargin = i;
            t1.leftMargin = i;
            C7857d dVar = new C7857d(mo4347s());
            this.f23556W3 = dVar;
            dVar.setLayoutParams(t1);
            this.f23548U3.addView(this.f23556W3);
            C7851a aVar = new C7851a(mo4347s());
            this.f23552V3 = aVar;
            aVar.setRectChangeListener(new C7851a.AbstractC7853b() {
                @Override
                public final void mo14831a(double d, double d2, double d3, double d4) {
                    View$OnClickListenerC7430j1.this.m16109uj(d, d2, d3, d4);
                }
            });
            this.f23552V3.setNormalizeListener(new C7438h());
            this.f23552V3.setRotateModeChangeListener(new C7851a.AbstractC7854c() {
                @Override
                public final void mo14830a(boolean z) {
                    View$OnClickListenerC7430j1.this.m16101vj(z);
                }
            });
            this.f23552V3.m14835v(t1.leftMargin, t1.topMargin, t1.rightMargin, t1.bottomMargin);
            this.f23552V3.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f23548U3.addView(this.f23552V3);
        }
    }

    public final void m16099vl(float f) {
        float f2 = 1.0f - f;
        this.f23526P1.setAlpha(f2);
        float f3 = (f2 * 0.4f) + 0.6f;
        this.f23526P1.setScaleX(f3);
        this.f23526P1.setScaleY(f3);
        int w = C1399s0.m37150w(this.f23526P1);
        boolean z = false;
        for (int i = 0; i < this.f23518N1.getChildCount(); i++) {
            View childAt = this.f23518N1.getChildAt(i);
            if (childAt == this.f23526P1) {
                z = true;
            } else if (z) {
                childAt.setTranslationX(((-w) / 2) * f);
            } else {
                childAt.setTranslationX((w / 2) * f);
            }
        }
    }

    public final void m16098vm() {
        LinearLayout linearLayout = this.f23542T1;
        if (linearLayout != null) {
            linearLayout.setAlpha(this.f23521O0 * this.f23533R0 * (1.0f - this.f23565Z0));
        }
    }

    @Override
    public void mo16097w0(String str) {
        ((RunnableC9558i0) this.f23546U1).m8260p0(str);
    }

    @Override
    public boolean mo11108w2(me.C6924j2 r8, p051db.C3950k r9) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.mo11108w2(me.j2, db.k):boolean");
    }

    @Override
    public boolean mo9136wc(boolean z) {
        if (this.f23626o0 != 3) {
            return super.mo9136wc(z);
        }
        boolean z2 = true;
        if (z && !m9348S9()) {
            m16394Lh(true);
        }
        boolean wc = super.mo9136wc(z);
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23481E0;
        if (z0Var != null) {
            z0Var.m17841j(z);
        }
        if (!z && !this.f23485F0) {
            z2 = false;
        }
        m16073yl(z2);
        this.f23477D1.m16520k2();
        return wc;
    }

    public final void m16094wh(int i, int i2) {
        if (this.f23684z3 != i && m16373Og()) {
            boolean Fi = m16442Fi();
            boolean z = false;
            if (i2 != 0) {
                if (i2 == 1) {
                    z = true;
                } else if (i2 != 2) {
                    return;
                }
            } else if (Fi) {
                m16171mm();
                return;
            }
            if (Fi) {
                if (!z) {
                    m16432Gk();
                } else if (m16344Rk(i)) {
                    return;
                }
            }
            m16085xh(i);
        }
    }

    public final void m16091wk() {
        this.f23614l2.m16491i(false, false);
        int i = this.f23596g4;
        C7856c cVar = this.f23588e4;
        int l = C5069h.m24081l(i + (cVar != null ? cVar.m14822h() : 0), 360);
        this.f23556W3.m14810b(this.f23592f4, l, this.f23584d4.m14827c(), this.f23640q4);
        this.f23623n2.m15975d(this.f23584d4.m14827c(), false);
        this.f23552V3.m14842o();
        this.f23552V3.m14841p(C7389v0.m16656a1(this.f23592f4, l), C7389v0.m16753B0(this.f23592f4, l), this.f23584d4.m14826d(), this.f23584d4.m14821i(), this.f23584d4.m14823g(), this.f23584d4.m14828b(), false);
    }

    public final void m16090wl(float f) {
        float f2;
        float f3;
        float f4;
        if (this.f23572a4 != f) {
            this.f23572a4 = f;
            int i = this.f23580c4;
            float f5 = i * f;
            float f6 = 1.0f;
            if (C7389v0.m16564x1(i)) {
                int measuredWidth = this.f23556W3.getMeasuredWidth();
                int measuredHeight = this.f23556W3.getMeasuredHeight();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23556W3.getLayoutParams();
                int targetHeight = this.f23556W3.getTargetHeight();
                float min = Math.min(((this.f23548U3.getMeasuredWidth() - layoutParams.leftMargin) - layoutParams.rightMargin) / targetHeight, ((this.f23548U3.getMeasuredHeight() - layoutParams.topMargin) - layoutParams.bottomMargin) / this.f23556W3.getTargetWidth());
                int i2 = ((int) ((((int) (f3 * min)) - measuredHeight) * f)) + measuredHeight;
                f6 = (((int) ((((int) (f4 * min)) - measuredWidth) * f)) + measuredWidth) / measuredWidth;
                f2 = i2 / measuredHeight;
            } else {
                f2 = 1.0f;
            }
            this.f23556W3.setBaseRotation(f5);
            this.f23556W3.m14808d(f6, f2);
            this.f23552V3.setRotation(f5);
            this.f23552V3.setScaleX(f6);
            this.f23552V3.setScaleY(f2);
        }
    }

    public final void m16089wm() {
        int i = 0;
        float f = 1.0f;
        boolean z = this.f23678y2 == 1.0f && !this.f23471C0;
        if (this.f23463A2 != z) {
            this.f23463A2 = z;
            LinearLayout linearLayout = this.f23542T1;
            float f2 = 0.0f;
            if (!z) {
                float f3 = (-C1357a0.m37541i(56.0f)) * this.f23678y2;
                if (this.f23471C0) {
                    f = 0.0f;
                }
                f2 = f3 * f;
            }
            linearLayout.setTranslationY(f2 + (this.f23547U2 * C1357a0.m37541i(9.0f)));
            LinearLayout linearLayout2 = this.f23542T1;
            if (this.f23463A2) {
                i = C1357a0.m37541i(56.0f);
            }
            C1399s0.m37195Z(linearLayout2, i);
        }
    }

    @Override
    public void mo16088x5(C7401b0 b0Var, float f, float f2) {
        m16411Jh();
    }

    public final void m16085xh(int i) {
        if (!m16328Tk(this.f23684z3, i) && m16346Ri(i)) {
            int i2 = this.f23684z3;
            this.f23464A3 = i2;
            this.f23469B3 = m16084xi(i2);
            this.f23479D3 = m16102vi(this.f23464A3);
            this.f23488F3 = this.f23477D1.getOffsetHorizontal();
            this.f23477D1.getBaseCell().getDetector().m15861v();
            m16474Bk(this.f23464A3);
            m16466Ck(i);
            m16307Wh(i);
            this.f23684z3 = i;
            this.f23474C3 = m16084xi(i);
            this.f23484E3 = m16102vi(this.f23684z3);
            this.f23492G3 = m16134ri(this.f23684z3);
            m16064zm(true);
            C3950k kVar = this.f23496H3;
            if (kVar == null) {
                this.f23496H3 = new C3950k(4, this, C2057b.f7283e, 380L);
            } else {
                kVar.m29541l(0.0f);
            }
            this.f23496H3.m29544i(1.0f);
        }
    }

    public final boolean m16082xk() {
        Bitmap tk = m16116tk();
        if (tk == null) {
            return false;
        }
        this.f23516M3 = m16150pi(true);
        this.f23536R3 = new C8111a(this.f23516M3);
        C6253l K = this.f23646s0.m13461g().m13550K();
        if (this.f23504J3 != K) {
            m16103vh();
            C6246h S = this.f23646s0.m13461g().m13534S(false);
            if (this.f23520N3.m20798r() != S) {
                tk = null;
            }
            m16278Zl(S, K, tk);
        }
        return true;
    }

    public final void m16081xl() {
        m16073yl(m9348S9() || this.f23485F0);
    }

    public final void m16080xm() {
        View$OnClickListenerC9170d1 d1Var = this.f23586e2;
        if (d1Var != null) {
            d1Var.setAlpha(this.f23533R0 * (1.0f - this.f23565Z0));
        }
    }

    @Override
    public void mo4536y2(C10930q6 q6Var, TdApi.Call call) {
        if (call != null && !call.isOutgoing && !C4779t2.m25686G2(call) && !C4779t2.m25562Z2(call)) {
            m16377Nj();
        }
    }

    public final void m16077yh() {
        float i = this.f23547U2 * C1357a0.m37541i(9.0f);
        if (this.f23542T1 != null) {
            m16089wm();
            if (!this.f23463A2) {
                this.f23542T1.setTranslationY(((-C1357a0.m37541i(56.0f)) * this.f23678y2) + i);
            }
        }
        C7489q1 q1Var = this.f23558X1;
        if (q1Var != null) {
            q1Var.setTranslationY((C1357a0.m37541i(56.0f) * (1.0f - this.f23678y2)) + i);
        }
    }

    public final float m16076yi() {
        if (this.f23591f3 == 0) {
            return 1.0f;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f23591f3;
        if (uptimeMillis > 100) {
            return 1.0f;
        }
        return Math.max(0.0f, ((float) uptimeMillis) / 200.0f);
    }

    public final boolean m16074yk() {
        C8112b g = this.f23646s0.m13461g();
        C6257p imageReceiver = this.f23477D1.getBaseCell().getImageReceiver();
        if (g.m13492n0() || g.m13512d0() || imageReceiver == null) {
            C1379j0.m37292y0(R.string.MediaTypeUnsupported, 0);
            return false;
        }
        Bitmap tk = m16116tk();
        if (tk == null) {
            return false;
        }
        C8431f Uj = m16321Uj(true);
        this.f23640q4 = Uj;
        Uj.m12499d(this);
        this.f23645r4 = new C8431f(this.f23640q4);
        this.f23584d4 = m16329Tj(false);
        this.f23625n4 = this.f23646s0.m13461g();
        this.f23630o4 = tk.getWidth();
        this.f23635p4 = tk.getHeight();
        return true;
    }

    public final void m16073yl(boolean z) {
        int i = 0;
        boolean z2 = z && this.f23684z3 == 0;
        if (this.f23471C0 != z2) {
            this.f23471C0 = z2;
            if (!z2 && !C5070i.m24060j(((TextView) this.f23546U1).getText())) {
                m16320Uk();
            }
            m16089wm();
            this.f23550V1.setEnabled(z2);
            this.f23554W1.setEnabled(z2);
            this.f23477D1.setDisableTouch(z2);
            this.f23477D1.setButStillNeedClick(z2 ? this : null);
            C1399s0.m37195Z(this.f23538S1, m16191ki());
            FrameLayoutFix frameLayoutFix = this.f23514M1;
            if (z2) {
                i = 8;
            }
            frameLayoutFix.setVisibility(i);
            m16422Hm();
            if (this.f23476D0 == null) {
                this.f23476D0 = new C3950k(17, this, C2057b.f7280b, 180L, this.f23466B0);
            }
            this.f23476D0.m29544i(z2 ? 1.0f : 0.0f);
            if (!z2) {
                C1379j0.m37332e0(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC7430j1.this.m16467Cj();
                    }
                }, 100L);
            }
        }
    }

    public final void m16072ym() {
        View$OnClickListenerC9170d1 d1Var = this.f23586e2;
        if (d1Var != null) {
            int i = 8;
            d1Var.m10097P3(R.id.menu_photo, R.id.menu_btn_masks, m16127sh() ? 0 : 8, 0);
            this.f23586e2.m10097P3(R.id.menu_photo, R.id.menu_btn_pictureInPicture, m16160oh() ? 0 : 8, 0);
            View$OnClickListenerC9170d1 d1Var2 = this.f23586e2;
            if (m16135rh()) {
                i = 0;
            }
            d1Var2.m10097P3(R.id.menu_photo, R.id.menu_btn_forward, i, 0);
            m16406Jm();
        }
    }

    @Override
    public long mo8232z(RunnableC9558i0 i0Var) {
        TdApi.Chat U2 = this.f30167b.m2632U2(mo8237D5(i0Var));
        if (U2 != null) {
            return C4779t2.m25465n2(U2);
        }
        return 0L;
    }

    @Override
    public void mo15888z2(C8112b bVar, long j, long j2, float f) {
        C7489q1 q1Var;
        if (this.f23646s0.m13461g() == bVar && (q1Var = this.f23558X1) != null) {
            q1Var.m15824L1(j, j2, f);
        }
    }

    public final void m16069zh() {
        int i = (C1357a0.m37541i(9.0f) * 2) + C1357a0.m37541i(43.0f);
        float f = this.f23507K2;
        float Lj = m16392Lj() * f;
        FrameLayoutFix frameLayoutFix = this.f23538S1;
        if (frameLayoutFix != null) {
            frameLayoutFix.setTranslationY(Lj - ((this.f23547U2 * i) * (1.0f - f)));
        }
        if (this.f23555W2 != null) {
            this.f23555W2.setTranslationY(Lj + (i * Math.max(1.0f - this.f23547U2, this.f23507K2)));
        }
    }

    public final String m16068zi() {
        return C4403w.m27865j1(R.string.XofY, C1363c0.m37437f(this.f23646s0.m13458j() + 1), C1363c0.m37437f(this.f23646s0.m13457k()));
    }

    public final void m16066zk() {
        this.f23627o1 = this.f23637q1;
        this.f23632p1 = this.f23642r1;
    }

    public final void m16065zl(float f) {
        if (this.f23466B0 != f) {
            this.f23466B0 = f;
            m16480Am();
            View$OnClickListenerC9694y yVar = this.f23461A0;
            if (yVar != null) {
                yVar.setAlpha(f);
            }
            ImageView imageView = this.f23550V1;
            float f2 = 1.0f - f;
            imageView.setTranslationX((-imageView.getMeasuredWidth()) * f2);
            this.f23550V1.setAlpha(f);
            this.f23554W1.setAlpha(f);
            this.f23546U1.setTranslationX((-(C1357a0.m37541i(55.0f) - C1357a0.m37541i(14.0f))) * f2);
        }
    }

    public final void m16064zm(boolean z) {
        this.f23530Q1.m16490j(m16468Ci(), z);
        this.f23522O1.m16490j(m16476Bi(), z);
        this.f23526P1.m16490j(m16460Di(), z);
        if (this.f23534R1 != null) {
            int O = this.f23646s0.m13461g().m13542O();
            String f3 = O != 0 ? HandlerC10770jj.m3593f3(O, TimeUnit.SECONDS, false) : null;
            if (z) {
                this.f23534R1.m9977n(f3, false);
            } else {
                this.f23534R1.m9979l(f3, true);
            }
        }
    }

    public static class C7448r {
        public final AbstractC9323v4<?> f23720a;
        public final int f23721b;
        public AbstractC7459k1 f23722c;
        public final AbstractC7511x f23723d;
        public final AbstractC7513y f23724e;
        public final C8113c f23725f;
        public String f23726g;
        public boolean f23727h;
        public String f23728i;
        public boolean f23729j;
        public String f23730k;
        public boolean f23731l;
        public long f23732m;
        public long f23733n;
        public boolean f23734o;
        public boolean f23735p;
        public TdApi.SearchMessagesFilter f23736q;

        public C7448r(AbstractC9323v4<?> v4Var, int i, AbstractC7459k1 k1Var, AbstractC7511x xVar, AbstractC7513y yVar, C8113c cVar) {
            this.f23720a = v4Var;
            this.f23721b = i;
            this.f23722c = k1Var;
            this.f23723d = xVar;
            this.f23724e = yVar;
            this.f23725f = cVar;
        }

        public static C7448r m16049o(AbstractC9323v4<?> v4Var, AbstractC7459k1 k1Var, AbstractC7511x xVar, AbstractC7513y yVar, C8113c cVar, boolean z) {
            return new C7448r(v4Var, 3, k1Var, xVar, yVar, cVar).m16046r(z);
        }

        public C7448r m16048p(boolean z) {
            this.f23735p = z;
            return this;
        }

        public void m16047q(TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f23736q = searchMessagesFilter;
        }

        public C7448r m16046r(boolean z) {
            this.f23734o = z;
            return this;
        }

        public C7448r m16045s(long j) {
            this.f23732m = j;
            return this;
        }

        public C7448r(AbstractC9323v4<?> v4Var, int i, C8113c cVar) {
            this(v4Var, i, null, null, null, cVar);
        }
    }
}
