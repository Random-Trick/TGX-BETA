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
    public static final Interpolator f23461E4 = new OvershootInterpolator(0.97f);
    public static final Interpolator f23462F4 = new OvershootInterpolator(0.82f);
    public static final int[][] f23463G4 = {new int[]{1, 1, R.id.btn_proportion_square, R.drawable.baseline_crop_square_24}, new int[]{3, 2, R.id.btn_proportion_3_2, R.drawable.baseline_crop_5_4_24}, new int[]{4, 3, R.id.btn_proportion_4_3, R.drawable.baseline_crop_3_2_24}, new int[]{16, 9, R.id.btn_proportion_16_9, R.drawable.baseline_crop_16_9_24}};
    public View$OnClickListenerC9694y f23464A0;
    public boolean f23466A2;
    public int f23467A3;
    public C4868i.C4889t f23468A4;
    public float f23469B0;
    public C3950k f23470B1;
    public C6924j2 f23471B2;
    public int f23472B3;
    public C4868i.C4889t f23473B4;
    public boolean f23474C0;
    public FrameLayoutFix f23475C1;
    public boolean f23476C2;
    public int f23477C3;
    public List<C4868i.C4889t> f23478C4;
    public C3950k f23479D0;
    public C7401b0 f23480D1;
    public GestureDetector$OnGestureListenerC0256a f23481D2;
    public int f23482D3;
    public boolean f23483D4;
    public ViewTreeObserver$OnPreDrawListenerC7081z0 f23484E0;
    public FrameLayoutFix f23485E1;
    public boolean f23486E2;
    public int f23487E3;
    public boolean f23488F0;
    public C7425i f23489F1;
    public boolean f23490F2;
    public int f23491F3;
    public boolean f23492G0;
    public C7425i f23493G1;
    public C8112b f23494G2;
    public int f23495G3;
    public int f23496H0;
    public View f23497H1;
    public float f23498H2;
    public C3950k f23499H3;
    public C8112b f23500I0;
    public C7465m1 f23501I1;
    public float f23502I2;
    public C8328e f23503I3;
    public C7449s f23505J1;
    public float f23506J2;
    public C6253l f23507J3;
    public float f23508K0;
    public C7425i f23509K1;
    public float f23510K2;
    public Bitmap f23511K3;
    public C7425i f23513L1;
    public float f23514L2;
    public C6246h f23515L3;
    public float f23516M0;
    public FrameLayoutFix f23517M1;
    public float f23518M2;
    public C8111a f23519M3;
    public boolean f23520N0;
    public LinearLayout f23521N1;
    public float f23522N2;
    public C6257p f23523N3;
    public float f23524O0;
    public C7425i f23525O1;
    public float f23526O2;
    public int f23527O3;
    public C3950k f23528P0;
    public C7425i f23529P1;
    public float f23530P2;
    public int f23531P3;
    public C7425i f23533Q1;
    public float f23534Q2;
    public C6267y f23535Q3;
    public C9202h2 f23537R1;
    public float f23538R2;
    public C8111a f23539R3;
    public C3950k f23540S0;
    public FrameLayoutFix f23541S1;
    public C3950k f23542S2;
    public boolean f23543S3;
    public float f23544T0;
    public LinearLayout f23545T1;
    public boolean f23546T2;
    public boolean f23547T3;
    public boolean f23548U0;
    public View f23549U1;
    public float f23550U2;
    public C7855b f23551U3;
    public boolean f23552V0;
    public ImageView f23553V1;
    public C3940f f23554V2;
    public C7851a f23555V3;
    public float f23556W0;
    public ImageView f23557W1;
    public RunnableC7454x f23558W2;
    public C7857d f23559W3;
    public boolean f23560X0;
    public C7489q1 f23561X1;
    public C8731d f23562X2;
    public C3950k f23564Y0;
    public C7450t f23565Y1;
    public C7451u f23566Y2;
    public float f23568Z0;
    public C6840b0 f23569Z1;
    public LinearLayoutManager f23570Z2;
    public boolean f23571Z3;
    public C8112b f23572a1;
    public C7422h f23573a2;
    public C3940f f23574a3;
    public float f23575a4;
    public float f23576b1;
    public View f23577b2;
    public boolean f23578b3;
    public C3950k f23579b4;
    public float f23580c1;
    public LinearLayout f23581c2;
    public float f23582c3;
    public int f23583c4;
    public boolean f23584d1;
    public C9289s f23585d2;
    public int f23586d3;
    public C7856c f23587d4;
    public int f23588e1;
    public View$OnClickListenerC9170d1 f23589e2;
    public int f23590e3;
    public C7856c f23591e4;
    public int f23592f1;
    public RecyclerView f23593f2;
    public long f23594f3;
    public Bitmap f23595f4;
    public float f23596g1;
    public C7490r f23597g2;
    public boolean f23598g3;
    public int f23599g4;
    public float f23600h1;
    public FrameLayoutFix f23601h2;
    public float f23602h3;
    public float f23603h4;
    public boolean f23604i1;
    public C7484p1 f23605i2;
    public float f23607i4;
    public boolean f23608j1;
    public TextView f23609j2;
    public int f23610j3;
    public boolean f23611j4;
    public C3950k f23612k1;
    public FrameLayoutFix f23613k2;
    public C3950k f23614k3;
    public boolean f23615k4;
    public boolean f23616l1;
    public C7425i f23617l2;
    public int f23618l3;
    public boolean f23619l4;
    public C3950k f23620m1;
    public C7425i f23621m2;
    public int f23622m3;
    public C3950k f23623m4;
    public boolean f23624n0;
    public float f23625n1;
    public C7468n1 f23626n2;
    public C7453w f23627n3;
    public C8112b f23628n4;
    public int f23629o0;
    public float f23630o1;
    public FrameLayoutFix f23631o2;
    public float f23632o3;
    public int f23633o4;
    public AbstractC7459k1 f23634p0;
    public float f23635p1;
    public C8864b f23636p2;
    public int f23637p3;
    public int f23638p4;
    public AbstractC7511x f23639q0;
    public float f23640q1;
    public C8872e f23641q2;
    public int f23642q3;
    public C8431f f23643q4;
    public AbstractC7513y f23644r0;
    public float f23645r1;
    public C6879f3 f23646r2;
    public int f23647r3;
    public C8431f f23648r4;
    public C8113c f23649s0;
    public C3950k f23650s1;
    public ImageView f23651s2;
    public int f23652s3;
    public C8328e f23653s4;
    public TdApi.SearchMessagesFilter f23654t0;
    public float f23655t1;
    public C7425i f23656t2;
    public int f23657t3;
    public C9357x2.C9370l f23658t4;
    public long f23659u0;
    public float f23660u1;
    public C8867c f23661u2;
    public boolean f23662u3;
    public int f23663u4;
    public C3950k f23664v0;
    public float f23665v1;
    public float f23666v2;
    public C3950k f23667v3;
    public int f23669w0;
    public float f23670w1;
    public C3950k f23671w2;
    public float f23672w3;
    public boolean f23673w4;
    public C7462l1 f23674x0;
    public float f23675x1;
    public boolean f23676x2;
    public C7506v f23677x3;
    public int f23678x4;
    public boolean f23679y0;
    public float f23680y1;
    public float f23681y2;
    public C7503u f23682y3;
    public int f23683y4;
    public boolean f23684z0;
    public C3950k f23686z2;
    public int f23687z3;
    public float f23688z4;
    public int f23504J0 = -1;
    public Path f23512L0 = new Path();
    public boolean f23532Q0 = true;
    public float f23536R0 = 1.0f;
    public boolean f23685z1 = true;
    public float f23465A1 = 1.0f;
    public int f23606i3 = -1;
    public C3940f f23563X3 = new C3940f(18, this, C2057b.f7280b, 140);
    public int f23567Y3 = -1;
    public boolean f23668v4 = true;

    public class C7431a extends View {
        public C7431a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !View$OnClickListenerC7430j1.this.f23662u3) {
                return false;
            }
            View$OnClickListenerC7430j1.this.m16311Vl(false);
            return true;
        }
    }

    public class C7432b extends FrameLayoutFix {
        public float f23690M;
        public float f23691N;

        public C7432b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3 && View$OnClickListenerC7430j1.this.f23604i1) {
                        View$OnClickListenerC7430j1.this.f23604i1 = false;
                        return true;
                    }
                } else if (View$OnClickListenerC7430j1.this.f23604i1) {
                    if (Math.max(Math.abs(this.f23690M - motionEvent.getX()), Math.abs(this.f23691N - motionEvent.getY())) < C1357a0.m37537p()) {
                        View$OnClickListenerC7430j1.this.m16138qm();
                    }
                    View$OnClickListenerC7430j1.this.f23604i1 = false;
                    return true;
                }
            } else if (View$OnClickListenerC7430j1.this.f23568Z0 == 1.0f && (View$OnClickListenerC7430j1.this.f23650s1 == null || !View$OnClickListenerC7430j1.this.f23650s1.m29533v())) {
                View$OnClickListenerC7430j1.this.f23604i1 = true;
                this.f23690M = motionEvent.getX();
                this.f23691N = motionEvent.getY();
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
            return C1399s0.m37208P(this, motionEvent) && super.onTouchEvent(motionEvent);
        }
    }

    public class C7434d extends RecyclerView.AbstractC0901o {
        public C7434d() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            rect.set(recyclerView.m39424k0(view) == View$OnClickListenerC7430j1.this.f23682y3.mo6153D() + (-1) ? C1357a0.m37544i(4.0f) : 0, C1357a0.m37544i(6.0f), C1357a0.m37544i(4.0f), C1357a0.m37544i(6.0f));
        }
    }

    public class C7435e extends RecyclerView.AbstractC0901o {
        public C7435e() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            rect.set(0, recyclerView.m39424k0(view) == 0 ? C1357a0.m37544i(16.0f) : 0, 0, 0);
        }
    }

    public class C7436f implements C7484p1.AbstractC7485a {
        public int f23696a = -1;

        public C7436f() {
        }

        @Override
        public void mo15839U0(C7484p1 p1Var, float f) {
            int round = Math.round(f * (View$OnClickListenerC7430j1.this.f23478C4.size() - 1));
            if (this.f23696a != round) {
                this.f23696a = round;
                View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                j1Var.f23473B4 = (C4868i.C4889t) j1Var.f23478C4.get(this.f23696a);
                if (this.f23696a == View$OnClickListenerC7430j1.this.f23478C4.size() - 1 && (View$OnClickListenerC7430j1.this.f23468A4.f16716a.m24485b() || (!View$OnClickListenerC7430j1.this.f23473B4.f16716a.m24485b() && View$OnClickListenerC7430j1.this.f23473B4.f16716a.f16719a < View$OnClickListenerC7430j1.this.f23468A4.f16716a.f16719a))) {
                    View$OnClickListenerC7430j1 j1Var2 = View$OnClickListenerC7430j1.this;
                    j1Var2.f23473B4 = new C4868i.C4889t(j1Var2.f23468A4);
                }
                View$OnClickListenerC7430j1.this.m16438Fm();
            }
        }

        @Override
        public void mo15838q2(C7484p1 p1Var, boolean z) {
            if (!z) {
                View$OnClickListenerC7430j1.this.f23605i2.m15847b(this.f23696a * (1.0f / (View$OnClickListenerC7430j1.this.f23478C4.size() - 1)));
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
        public void mo11068a(C8864b bVar, boolean z) {
            View$OnClickListenerC7430j1.this.m16211hm();
        }

        @Override
        public void mo11067b(C8864b bVar, boolean z) {
            if (z) {
                C4868i.m24727c2().m24583u2(131072L);
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
            super.onMeasure(i, View$OnClickListenerC7430j1.this.f23471B2.getMeasuredHeight());
        }
    }

    public class C7440j extends RecyclerView.AbstractC0910t {
        public boolean f23701a;

        public C7440j() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            boolean z = true;
            boolean z2 = i != 0;
            if (!z2) {
                View$OnClickListenerC7430j1.this.f23598g3 = false;
                if (this.f23701a) {
                    View$OnClickListenerC7430j1.this.f23475C1.requestDisallowInterceptTouchEvent(false);
                }
            }
            this.f23701a = z2;
            View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
            if (!z2 || !j1Var.f23598g3) {
                z = false;
            }
            j1Var.m16253cm(z);
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (!View$OnClickListenerC7430j1.this.f23598g3) {
                boolean z = false;
                View$OnClickListenerC7430j1.this.f23598g3 = Math.abs(i) > 1 && this.f23701a;
                View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                if (this.f23701a && j1Var.f23598g3) {
                    z = true;
                }
                j1Var.m16253cm(z);
            }
            if (i != 0 && this.f23701a) {
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
            View$OnClickListenerC7430j1.this.f23480D1.m16519l2();
        }

        @Override
        public void mo6871o6() {
            View$OnClickListenerC7430j1.this.f23480D1.m16518m2();
        }
    }

    public class C7442l extends FrameLayoutFix {
        public int f23704M;
        public int f23705N;
        public float f23706O;
        public float f23707P;
        public float f23708Q;
        public float f23709R;
        public float f23710S;
        public float f23711T;
        public boolean f23712U;

        public C7442l(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (View$OnClickListenerC7430j1.this.f23516M0 != 0.0f) {
                float max = Math.max(0.0f, Math.min(1.0f, View$OnClickListenerC7430j1.this.f23516M0));
                boolean z = Build.VERSION.SDK_INT >= 19 && View$OnClickListenerC7430j1.this.f23512L0 != null && !View$OnClickListenerC7430j1.this.f23490F2 && View$OnClickListenerC7430j1.this.f23498H2 == 0.0f && View$OnClickListenerC7430j1.this.f23502I2 == 0.0f && View$OnClickListenerC7430j1.this.f23674x0 != null && View$OnClickListenerC7430j1.this.f23516M0 > 0.0f && View$OnClickListenerC7430j1.this.f23516M0 < 1.0f && !View$OnClickListenerC7430j1.this.f23674x0.m15994f();
                int b = z ? C10192g.m5789b(canvas, View$OnClickListenerC7430j1.this.f23512L0) : Integer.MIN_VALUE;
                if (View$OnClickListenerC7430j1.this.f23674x0 != null && View$OnClickListenerC7430j1.this.f23516M0 < 1.0f && !View$OnClickListenerC7430j1.this.f23490F2 && View$OnClickListenerC7430j1.this.f23498H2 == 0.0f && View$OnClickListenerC7430j1.this.f23502I2 == 0.0f) {
                    View$OnClickListenerC7430j1.this.f23674x0.m15997c(canvas);
                }
                float f = max * (1.0f - View$OnClickListenerC7430j1.this.f23568Z0);
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
            if (View$OnClickListenerC7430j1.this.f23542S2 != null && View$OnClickListenerC7430j1.this.f23542S2.m29533v()) {
                return true;
            }
            if (View$OnClickListenerC7430j1.this.f23629o0 == 4 || View$OnClickListenerC7430j1.this.f23474C0 || this.f23712U) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23706O = motionEvent.getX();
                this.f23707P = motionEvent.getY();
                View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                if (!j1Var.m16168nh() || View$OnClickListenerC7430j1.this.f23568Z0 != 0.0f || View$OnClickListenerC7430j1.this.f23480D1.getCurrentZoom() != 1.0f || !View$OnClickListenerC7430j1.this.f23480D1.m16526a2()) {
                    z = false;
                }
                j1Var.f23486E2 = z;
            } else if (action == 2) {
                if (View$OnClickListenerC7430j1.this.f23486E2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(this.f23707P - y) >= C1357a0.m37536q() && Math.abs(this.f23706O - x) < C1357a0.m37537p() * 1.65f) {
                        View$OnClickListenerC7430j1.this.f23480D1.m16533U1(0, 0.0f);
                        View$OnClickListenerC7430j1.this.f23486E2 = false;
                        this.f23711T = x;
                        this.f23710S = y;
                        View$OnClickListenerC7430j1.this.m16465Cl(x, y);
                        return true;
                    } else if (Math.abs(this.f23706O - x) >= C1357a0.m37535r()) {
                        View$OnClickListenerC7430j1.this.f23486E2 = false;
                    }
                } else if (View$OnClickListenerC7430j1.this.f23490F2) {
                    return true;
                } else {
                    if (View$OnClickListenerC7430j1.this.f23604i1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.max(Math.abs(this.f23706O - x2), Math.abs(this.f23707P - y2)) > C1357a0.m37536q()) {
                            View$OnClickListenerC7430j1.this.f23604i1 = false;
                            this.f23708Q = this.f23706O - x2;
                            this.f23709R = this.f23707P - y2;
                            this.f23706O = x2;
                            this.f23707P = y2;
                            View$OnClickListenerC7430j1.this.m16351Ql(true, 0.0f, 0.0f);
                            return true;
                        }
                    } else if (View$OnClickListenerC7430j1.this.f23608j1) {
                        return true;
                    }
                }
            }
            View$OnClickListenerC7430j1.this.f23481D2.m41997a(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3;
            View$OnClickListenerC7430j1.this.m16456Dm(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), true, true);
            super.onMeasure(i, i2);
            if (View$OnClickListenerC7430j1.this.f23629o0 == 3) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int i4 = this.f23704M;
                if (i4 == 0 || (i3 = this.f23705N) == 0) {
                    this.f23704M = measuredWidth;
                    this.f23705N = measuredHeight;
                } else if (i4 != measuredWidth || i3 != measuredHeight) {
                    this.f23704M = measuredWidth;
                    this.f23705N = measuredHeight;
                    View$OnClickListenerC7430j1 j1Var = View$OnClickListenerC7430j1.this;
                    j1Var.m16399Kk(j1Var.f23687z3);
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
            this.f23712U = z;
        }
    }

    public class C7443m extends ViewOutlineProvider {
        public final int[] f23714a = new int[2];

        public C7443m() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (View$OnClickListenerC7430j1.this.m16110ui(this.f23714a)) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i = measuredWidth / 2;
                int[] iArr = this.f23714a;
                int i2 = measuredHeight / 2;
                outline.setRect(i - (iArr[0] / 2), i2 - (iArr[1] / 2), i + (iArr[0] / 2), i2 + (iArr[1] / 2));
                return;
            }
            outline.setEmpty();
        }
    }

    public class C7444n extends RunnableC9558i0 {
        public boolean f23716y0;

        public C7444n(Context context, C10930q6 q6Var) {
            super(context, q6Var);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View$OnClickListenerC7430j1.this.f23464A0 != null) {
                View$OnClickListenerC7430j1.this.f23464A0.m7575B2(true);
            }
        }

        @Override
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            View$OnClickListenerC7430j1.this.f23475C1.requestDisallowInterceptTouchEvent(this.f23716y0);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z = C1399s0.m37208P(this, motionEvent) && super.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f23716y0 = true;
            } else if (action == 1 || action == 3) {
                this.f23716y0 = false;
            }
            return z;
        }
    }

    public class C7445o implements TextWatcher {
        public final RunnableC9558i0 f23718a;

        public C7445o(RunnableC9558i0 i0Var) {
            this.f23718a = i0Var;
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (View$OnClickListenerC7430j1.this.f23476C2) {
                View$OnClickListenerC7430j1.this.f23476C2 = false;
            } else {
                View$OnClickListenerC7430j1.this.f23649s0.m13460g().m13473w0(this.f23718a.mo8279f(false));
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
        public boolean f23721a;

        public C7447q() {
        }

        @Override
        public void mo6838a(C6890g4 g4Var, double d, double d2, double d3, int i, long j) {
            View$OnClickListenerC7430j1.this.f23649s0.m13460g().m13549K().m20834o1((long) (1000000.0d * d), d2, d3, i, j);
        }

        @Override
        public void mo6837b(C6890g4 g4Var, boolean z) {
            if (z) {
                boolean z2 = View$OnClickListenerC7430j1.this.f23584d1;
                this.f23721a = z2;
                if (z2) {
                    View$OnClickListenerC7430j1.this.m16124sk();
                }
            } else if (this.f23721a) {
                View$OnClickListenerC7430j1.this.f23649s0.m13460g().m13479t0(View$OnClickListenerC7430j1.this.f23501I1);
            }
        }

        @Override
        public boolean mo6836c(C6890g4 g4Var) {
            return true;
        }

        @Override
        public void mo6835d(C6890g4 g4Var, float f) {
            View$OnClickListenerC7430j1.this.f23480D1.setSeekProgress(f);
        }

        @Override
        public void mo6834e(C6890g4 g4Var, double d, double d2, double d3) {
            boolean z;
            C8112b g = View$OnClickListenerC7430j1.this.f23649s0.m13460g();
            if (d2 == 0.0d && d3 == d) {
                z = g.m13549K().m20835n1(-1L, -1L, (long) (1000000.0d * d));
            } else {
                z = g.m13549K().m20835n1((long) (d2 * 1000000.0d), (long) (d3 * 1000000.0d), (long) (1000000.0d * d));
            }
            if (z) {
                boolean j = g.m13500j();
                RunnableC7470o V1 = View$OnClickListenerC7430j1.this.f23480D1 != null ? View$OnClickListenerC7430j1.this.f23480D1.m16532V1(View$OnClickListenerC7430j1.this.f23649s0.m13460g()) : null;
                if (V1 != null) {
                    V1.m15922f0(j);
                    long timeNow = V1.getTimeNow();
                    long timeTotal = V1.getTimeTotal();
                    if (timeNow == -1 || timeTotal == -1) {
                        timeNow = 0;
                        timeTotal = (long) ((d3 - d2) * 1000.0d);
                    }
                    View$OnClickListenerC7430j1.this.f23561X1.m15830D1(timeTotal, timeNow, true, true);
                    return;
                }
                g.mo13518a();
            }
        }
    }

    public static class C7449s extends View {
        public Drawable f23740a = C1362c.m37485g(getResources(), R.drawable.baseline_keyboard_arrow_left_24);
        public boolean f23741b;

        public C7449s(Context context) {
            super(context);
        }

        public void m16044a(boolean z) {
            if (this.f23741b != z) {
                this.f23741b = z;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight = (getMeasuredHeight() / 2) - (this.f23740a.getMinimumHeight() / 2);
            if (this.f23741b) {
                canvas.save();
                canvas.rotate(180.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
                C1362c.m37490b(canvas, this.f23740a, 0.0f, measuredHeight, C1410y.m37058W(-1));
                canvas.restore();
                return;
            }
            C1362c.m37490b(canvas, this.f23740a, 0.0f, measuredHeight, C1410y.m37058W(-1));
        }
    }

    public static class C7450t extends View implements AbstractC4761s4.AbstractC4769h {
        public Paint f23742M;
        public C4714n5 f23743a;
        public String f23744b;
        public int f23745c;

        public C7450t(Context context) {
            super(context);
            Paint paint = new Paint(5);
            this.f23742M = paint;
            paint.setTypeface(C1389o.m37263i());
            this.f23742M.setTextSize(C1357a0.m37544i(19.0f));
            this.f23742M.setColor(-1);
        }

        @Override
        public void mo16043a(boolean z) {
            C4714n5 n5Var = this.f23743a;
            if (n5Var != null) {
                if (z) {
                    m16040d(n5Var.m26127M3());
                }
                invalidate();
            }
        }

        public void m16042b() {
            C4714n5 n5Var = this.f23743a;
            if (n5Var != null) {
                n5Var.m25980a9(null);
            }
        }

        public void m16041c(C4714n5 n5Var) {
            if (!n5Var.m25929g6()) {
                this.f23743a = n5Var;
                m16040d(n5Var.m26127M3());
                n5Var.m25980a9(this);
            }
        }

        public final void m16040d(String str) {
            String str2 = this.f23744b;
            if (str2 == null || !str2.equals(str)) {
                this.f23744b = str;
                this.f23745c = (int) C7389v0.m16680T1(str, this.f23742M);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            if (this.f23743a != null) {
                int i2 = C1357a0.m37544i(18.0f);
                int i3 = C1357a0.m37544i(10.0f);
                int i4 = i2 + i3;
                RectF a0 = C1410y.m37053a0();
                int i5 = C1357a0.m37544i(16.0f);
                C1357a0.m37544i(4.0f);
                float f = i4 - i3;
                float f2 = i4 + i3;
                a0.set(f, f, f2, f2);
                canvas.drawArc(a0, -90.0f, this.f23743a.m26145K3() * (-360.0f), true, C1410y.m37042g(-1));
                canvas.drawText(this.f23744b, i + i5, C1357a0.m37544i(35.5f), this.f23742M);
            }
        }
    }

    public static class C7451u extends RecyclerView.AbstractC0890h<C7456z> {
        public final Context f23746M;
        public final View$OnClickListenerC7430j1 f23747N;
        public C7453w f23748O;

        public C7451u(Context context, View$OnClickListenerC7430j1 j1Var) {
            this.f23746M = context;
            this.f23747N = j1Var;
        }

        @Override
        public int mo6153D() {
            C7453w wVar = this.f23748O;
            if (wVar != null) {
                return wVar.m16014s();
            }
            return 0;
        }

        public void mo6146Q(C7456z zVar, int i) {
            C7455y Q = C7456z.m16000Q(zVar.f3479a);
            C7453w wVar = this.f23748O;
            if (wVar != null) {
                Q.m16003i(wVar.m16028e(i), this.f23748O);
                int max = Math.max(4, this.f23747N.f23558W2.getChildCount());
                if (i >= this.f23748O.m16014s() - max) {
                    this.f23747N.m16409Jj(true, true);
                } else if (i - max <= 0) {
                    this.f23747N.m16409Jj(true, false);
                }
            } else {
                Q.m16003i(null, null);
            }
        }

        public C7456z mo6145S(ViewGroup viewGroup, int i) {
            return C7456z.m16001P(this.f23746M, this.f23747N);
        }

        public void mo6144V(C7456z zVar) {
            C1399s0.m37175l(C7456z.m16000Q(zVar.f3479a));
        }

        public void mo6143W(C7456z zVar) {
            C1399s0.m37163r(C7456z.m16000Q(zVar.f3479a));
        }

        public void m16033h0(C7453w wVar) {
            C7453w wVar2 = this.f23748O;
            if (wVar2 == null) {
                this.f23748O = wVar;
                if (wVar != null) {
                    m39311M(0, wVar.m16014s());
                }
            } else if (wVar == null) {
                int s = wVar2.m16014s();
                this.f23748O = null;
                if (s > 0) {
                    m39310N(0, s);
                }
            } else if (wVar2.m16014s() == wVar.m16014s()) {
                this.f23748O = wVar;
                m39312L(0, wVar.m16014s());
            } else {
                int s2 = this.f23748O.m16014s();
                this.f23748O = null;
                m39310N(0, s2);
                this.f23748O = wVar;
                m39311M(0, wVar.m16014s());
            }
        }
    }

    public static class C7452v extends RecyclerView.AbstractC0901o {
        public final C7451u f23749a;

        public C7452v(C7451u uVar) {
            this.f23749a = uVar;
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            C7455y Q = C7456z.m16000Q(view);
            C8112b e = Q.m16006e();
            C7453w g = Q.m16005g();
            int measuredWidth = (recyclerView.getMeasuredWidth() / 2) - (this.f23749a.f23747N.m16176mh() / 2);
            if (g == null || e == null) {
                int k0 = recyclerView.m39424k0(view);
                if (k0 != -1) {
                    int D = recyclerView.getAdapter().mo6153D();
                    if (C4403w.m27986G2()) {
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
            } else if (C4403w.m27986G2()) {
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
                    float f = 1.0f - this.f23749a.f23747N.f23602h3;
                    if (!(g == null || e == null)) {
                        float left = Q.getLeft() + (Q.getMeasuredWidth() / 2.0f);
                        int k0 = recyclerView.m39424k0(childAt);
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
                            left = C4403w.m27986G2() ? left - n : left + n;
                        }
                        Q.m16007d(canvas, (int) left, C1357a0.m37544i(9.0f), childAt.getAlpha(), f);
                    }
                }
            }
        }
    }

    public static class C7453w {
        public final C7451u f23750a;
        public final ArrayList<C8112b> f23751b;
        public int f23752c;
        public C8112b f23753d;
        public C8112b f23755f;
        public float f23757h;
        public int f23754e = -1;
        public int f23756g = -1;

        public C7453w(C7451u uVar, ArrayList<C8112b> arrayList, int i) {
            this.f23750a = uVar;
            this.f23751b = arrayList;
            this.f23752c = i;
        }

        public static int m16027f(C8112b bVar, int i, int i2) {
            int i3;
            if (bVar != null) {
                int Z = bVar.m13519Z();
                int A = bVar.m13569A();
                i3 = (int) (Z * (A != 0 ? i2 / A : 1.0f));
            } else {
                i3 = 0;
            }
            return Math.min(Math.max(i, i3), C1357a0.m37544i(86.0f));
        }

        public void m16029d(ArrayList<C8112b> arrayList, boolean z, boolean z2) {
            int i;
            int size = arrayList.size();
            int i2 = 0;
            if (z2) {
                ArrayList<C8112b> arrayList2 = null;
                long j = this.f23751b.get(0).getMessage().mediaAlbumId;
                int max = Math.max(1, 10 - this.f23751b.size());
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
                        this.f23752c += size;
                        return;
                    }
                    return;
                }
            }
            int size3 = arrayList.size();
            if (z) {
                this.f23752c += size - size3;
            }
            if (z) {
                arrayList.size();
                this.f23751b.addAll(0, arrayList);
                i = 0;
            } else {
                i = this.f23751b.size();
                this.f23751b.addAll(arrayList);
            }
            if (this.f23750a.f23748O == this) {
                if (z) {
                    m16015r(size3);
                }
                this.f23750a.f23747N.m16336Sk();
                this.f23750a.m39311M(i, size3);
                this.f23750a.m39315I(i);
                this.f23750a.f23747N.f23558W2.m39507A0();
                View$OnClickListenerC7430j1 j1Var = this.f23750a.f23747N;
                if (z) {
                    i2 = size3;
                }
                j1Var.m16369Ok(i2);
            }
        }

        public C8112b m16028e(int i) {
            ArrayList<C8112b> arrayList = this.f23751b;
            if (arrayList == null || i < 0 || i >= arrayList.size()) {
                return null;
            }
            return this.f23751b.get(i);
        }

        public float m16026g() {
            return this.f23757h;
        }

        public float m16025h(C8112b bVar) {
            if (bVar == null) {
                return 0.0f;
            }
            if (bVar == this.f23753d) {
                return this.f23757h;
            }
            if (bVar == this.f23755f) {
                return 1.0f - this.f23757h;
            }
            return 0.0f;
        }

        public C8112b m16024i() {
            return m16028e(0);
        }

        public int m16023j() {
            return this.f23754e;
        }

        public C8112b m16022k() {
            ArrayList<C8112b> arrayList = this.f23751b;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            ArrayList<C8112b> arrayList2 = this.f23751b;
            return arrayList2.get(arrayList2.size() - 1);
        }

        public long m16021l() {
            return this.f23751b.get(0).getMessage().mediaAlbumId;
        }

        public int m16020m() {
            return this.f23756g;
        }

        public float m16019n(C8112b bVar, int i, float f) {
            float i2 = C1357a0.m37544i(5.0f);
            float f2 = this.f23757h * f;
            int i3 = C1357a0.m37544i(43.0f);
            int mh = this.f23750a.f23747N.m16176mh();
            C8112b bVar2 = this.f23753d;
            float f3 = -1.0f;
            float f4 = 0.0f;
            if (!(bVar2 == null || bVar2 == bVar || f2 <= 0.0f)) {
                f4 = 0.0f + ((((m16027f(bVar2, mh, i3) - mh) / 2) + i2) * f2 * (i < this.f23754e ? -1.0f : 1.0f));
            }
            C8112b bVar3 = this.f23755f;
            if (bVar3 == null || bVar3 == bVar || f2 >= 1.0f) {
                return f4;
            }
            float f5 = (i2 + ((m16027f(bVar3, mh, i3) - mh) / 2)) * (1.0f - f2);
            if (i >= this.f23756g) {
                f3 = 1.0f;
            }
            return f4 + (f5 * f3);
        }

        public int m16018o(C8112b bVar) {
            return this.f23751b.indexOf(bVar);
        }

        public boolean m16017p(int i, int i2, float f) {
            if (this.f23754e == i && this.f23756g == i2 && this.f23757h == f) {
                return false;
            }
            this.f23754e = i;
            this.f23753d = m16028e(i);
            this.f23756g = i2;
            this.f23755f = m16028e(i2);
            this.f23757h = f;
            return true;
        }

        public void m16016q(C8112b bVar, int i, float f) {
            this.f23753d = bVar;
            this.f23754e = i;
            this.f23757h = f;
        }

        public final void m16015r(int i) {
            int i2 = this.f23754e;
            if (i2 != -1) {
                this.f23754e = i2 + i;
            }
            int i3 = this.f23756g;
            if (i3 != -1) {
                this.f23756g = i3 + i;
            }
        }

        public int m16014s() {
            ArrayList<C8112b> arrayList = this.f23751b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        public int m16013t(int i) {
            int i2;
            ArrayList<C8112b> arrayList = this.f23751b;
            if (arrayList == null || i < (i2 = this.f23752c) || i >= i2 + arrayList.size()) {
                return -1;
            }
            return i - this.f23752c;
        }

        public void m16012u() {
            int i = this.f23756g;
            C8112b bVar = this.f23755f;
            this.f23756g = this.f23754e;
            this.f23755f = this.f23753d;
            this.f23754e = i;
            this.f23753d = bVar;
            this.f23757h = 1.0f - this.f23757h;
        }
    }

    public static class RunnableC7454x extends RecyclerView implements Runnable, C4336c.AbstractC4337a {
        public final C4336c f23758u1;
        public boolean f23759v1;
        public View$OnClickListenerC7430j1 f23760w1;
        public int f23761x1;

        public RunnableC7454x(Context context) {
            super(context);
            C4336c cVar = new C4336c(this);
            this.f23758u1 = cVar;
            cVar.m28245h(true);
        }

        @Override
        public boolean mo7429B(float f, float f2) {
            return C4335b.m28260d(this, f, f2);
        }

        @Override
        public void mo7428C(View view, float f, float f2) {
            if (!(this.f23760w1.m16208ih() || f2 < 0.0f || f2 > getMeasuredHeight() || this.f23760w1.f23598g3 || this.f23760w1.m16330Ti())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null) {
                        C7455y Q = C7456z.m16000Q(childAt);
                        C8112b e = Q.m16006e();
                        C7453w g = Q.m16005g();
                        if (g != null && Q.f23766a.m20979i(f, f2) && this.f23760w1.m16315Vh(e, g, g.m16018o(e), true)) {
                            C2065g.m35722c(this);
                            return;
                        }
                    }
                }
            }
        }

        @Override
        public void mo7427F(View view, float f, float f2) {
            C4335b.m28256h(this, view, f, f2);
        }

        public final boolean m16011G1() {
            View$OnClickListenerC7430j1 j1Var = this.f23760w1;
            return j1Var != null && !j1Var.f23480D1.m16525b2() && this.f23760w1.f23550U2 == 1.0f && C1399s0.m37221C(this);
        }

        public void m16010H1() {
            this.f23759v1 = true;
        }

        public void m16009I1(View$OnClickListenerC7430j1 j1Var) {
            this.f23760w1 = j1Var;
        }

        @Override
        public boolean mo7426K4() {
            return C4335b.m28263a(this);
        }

        @Override
        public boolean mo7425W6(float f, float f2) {
            return C4335b.m28261c(this, f, f2);
        }

        @Override
        public void mo7424Z4(View view, float f, float f2) {
            C4335b.m28258f(this, view, f, f2);
        }

        @Override
        public void mo7419f3(View view, float f, float f2) {
            C4335b.m28259e(this, view, f, f2);
        }

        @Override
        public long getLongPressDuration() {
            return C4335b.m28262b(this);
        }

        @Override
        public boolean mo7418n0(View view, float f, float f2) {
            return true;
        }

        @Override
        public void mo7417o2(View view, float f, float f2) {
            C4335b.m28257g(this, view, f, f2);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent) || (motionEvent.getAction() == 0 && !m16011G1());
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            if (this.f23761x1 != measuredWidth) {
                this.f23761x1 = measuredWidth;
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
            if (z2 && this.f23760w1.m16330Ti() && !this.f23760w1.m16363Ph()) {
                return false;
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (!z2) {
                boolean z3 = this.f23759v1 || this.f23760w1.m16208ih();
                this.f23759v1 = z3;
                if (z3) {
                    return onTouchEvent;
                }
            }
            this.f23759v1 = false;
            if (this.f23758u1.m28248e(this, motionEvent) || onTouchEvent) {
                z = true;
            }
            return z;
        }

        @Override
        public void mo7416p(View view, float f, float f2) {
            C4335b.m28255i(this, view, f, f2);
        }

        @Override
        public void run() {
            this.f23760w1.m16391Lk();
        }

        @Override
        public boolean mo7415z4(View view, float f, float f2) {
            return C4335b.m28253k(this, view, f, f2);
        }

        @Override
        public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
            C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
        }
    }

    public static class C7455y extends View implements AbstractC6828a, AbstractC5911c, C4341g.AbstractC4342a {
        public boolean f23762M = true;
        public int f23763N;
        public int f23764O;
        public int f23765P;
        public C6240c f23766a;
        public C7453w f23767b;
        public C8112b f23768c;

        public C7455y(Context context, RecyclerView recyclerView) {
            super(context);
            this.f23766a = new C6240c(recyclerView, 0);
        }

        @Override
        public void mo13518a() {
            C8112b bVar = this.f23768c;
            if (bVar != null && bVar.m13559F() == null) {
                this.f23766a.m20983d().m20820G(this.f23768c.m13531T(C1357a0.m37544i(43.0f) + (C1357a0.m37544i(9.0f) * 2), false));
            }
        }

        @Override
        public void mo4501a3() {
            this.f23766a.mo20250Z();
        }

        @Override
        public void mo8229b() {
            this.f23766a.mo20248b();
            this.f23762M = false;
            C8112b bVar = this.f23768c;
            if (bVar != null) {
                bVar.m13490o(this);
            }
        }

        public void m16007d(Canvas canvas, int i, int i2, float f, float f2) {
            m16004h();
            if (this.f23763N != 0 && this.f23765P != 0) {
                C7453w wVar = this.f23767b;
                float h = wVar != null ? wVar.m16025h(this.f23768c) * f2 : 0.0f;
                int i3 = this.f23763N;
                int i4 = i3 + ((int) ((this.f23764O - i3) * h));
                int i5 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i5 != 0) {
                    this.f23766a.mo20251U(f);
                }
                int i6 = i - (i4 / 2);
                if (this.f23766a.mo20247c0()) {
                    canvas.drawRect(i6, i2, i6 + i4, this.f23765P + i2, C1410y.m37042g(285212671));
                }
                this.f23766a.mo20257K0(i6, i2, i4 + i6, this.f23765P + i2);
                this.f23766a.draw(canvas);
                if (i5 != 0) {
                    this.f23766a.mo20254P();
                }
            }
        }

        public C8112b m16006e() {
            return this.f23768c;
        }

        @Override
        public void mo8225f() {
            this.f23766a.mo20246f();
            this.f23762M = true;
            C8112b bVar = this.f23768c;
            if (bVar != null) {
                bVar.m13516b(this);
            }
        }

        public C7453w m16005g() {
            return this.f23767b;
        }

        public final boolean m16004h() {
            int i = C1357a0.m37544i(1.0f);
            int i2 = C1357a0.m37544i(9.0f);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return false;
            }
            int i3 = measuredHeight - (i2 * 2);
            int i4 = measuredWidth - i;
            int f = C7453w.m16027f(this.f23768c, i4, i3);
            if (this.f23763N == i4 && this.f23764O == f && this.f23765P == i3) {
                return false;
            }
            this.f23763N = i4;
            this.f23764O = f;
            this.f23765P = i3;
            return true;
        }

        public void m16003i(C8112b bVar, C7453w wVar) {
            C8112b bVar2 = this.f23768c;
            if (bVar2 != bVar) {
                if (bVar2 != null && this.f23762M) {
                    bVar2.m13490o(this);
                }
                this.f23768c = bVar;
                this.f23767b = wVar;
                this.f23766a.m20978j(bVar.m13529U(), bVar.m13531T(C1357a0.m37544i(43.0f) + (C1357a0.m37544i(9.0f) * 2), false));
                m16004h();
                if (this.f23762M) {
                    bVar.m13516b(this);
                }
                invalidate();
            } else if (this.f23767b != wVar) {
                this.f23767b = wVar;
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
            C7455y yVar = new C7455y(context, j1Var.f23558W2);
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
        C6246h hVar2 = this.f23515L3;
        if (hVar2 == hVar) {
            m16278Zl(hVar2, this.f23507J3, bitmap);
            this.f23503I3.m12814s(this.f23507J3, this.f23511K3.getWidth(), this.f23511K3.getHeight(), this.f23511K3, this.f23519M3, this.f23507J3.m20897t());
            this.f23503I3.setEditorVisible(true);
        }
    }

    public void m16467Cj() {
        if (!m9347Sa() && !this.f23474C0) {
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
                int brushColor = this.f23636p2.getPreview().getBrushColor();
                C8434g gVar = new C8434g(3);
                gVar.m12449y(brushColor, 0.0f);
                this.f23643q4.m12500b(gVar);
                this.f23643q4.m12478x(gVar);
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
        if (this.f23649s0.m13460g() == bVar) {
            int b = pVar.m3331b();
            bVar.m13534R0(b);
            this.f23537R1.setValue(b != 0 ? HandlerC10770jj.m3593f3(b, TimeUnit.SECONDS, false) : null);
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
            C6252k A0 = this.f23649s0.m13460g().m13568A0(this.f23519M3);
            this.f30170b.m2429h5().m23151B0(A0, bitmap);
            m16283Zg(A0, bitmap);
            m16085xh(i);
            return;
        }
        C1379j0.m37293z0("Error while saving changes, sorry", 0);
    }

    public boolean m16256cj(View view, int i) {
        if (i == R.id.btn_crop_reset) {
            m16424Hk(true);
        } else if (i == R.id.btn_proportion_free) {
            m16180ll(0, 0);
        } else if (i == R.id.btn_proportion_original) {
            int targetWidth = this.f23555V3.getTargetWidth();
            int targetHeight = this.f23555V3.getTargetHeight();
            m16180ll(Math.max(targetWidth, targetHeight), Math.min(targetWidth, targetHeight));
        } else {
            int[] iArr = null;
            int[][] iArr2 = f23463G4;
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
        return this.f23683y4 == 0;
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
            AbstractC7511x xVar = this.f23639q0;
            int P0 = xVar != null ? xVar.mo11241P0() : 1;
            if (P0 <= 1) {
                str = C4403w.m27871i1(z ? R.string.SendOriginal : R.string.SendAsFile);
            } else {
                str = C4403w.m27846o2(z ? R.string.SendXOriginals : R.string.SendAsXFiles, P0);
            }
            list.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendAsFile, str, (int) R.drawable.baseline_insert_drive_file_24).m23938j(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC7430j1.this.m16240ej(view);
                }
            }).m23941g(4096L));
        }
    }

    public void m16223gj(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        m16312Vk(z, messageSchedulingState, z2, false);
    }

    public void m16214hj(RunnableC9558i0 i0Var) {
        if (!this.f23476C2) {
            this.f23649s0.m13460g().m13473w0(i0Var.mo8279f(false));
        }
    }

    public static void m16213hk(AbstractC9323v4<?> v4Var, TdApi.Chat chat, AbstractC8424a aVar) {
        if (C7316a.m17049l(chat.f25370id)) {
            m16173mk(v4Var, v4Var.mo4348c().m2541a4(chat.f25370id), aVar);
        } else if (!v4Var.m9292ab()) {
            C8113c cVar = new C8113c(v4Var.mo4347s(), v4Var.mo4348c());
            cVar.m13445v(new C8112b(v4Var.mo4347s(), v4Var.mo4348c(), chat.f25370id, chat.photo));
            C7448r rVar = new C7448r(v4Var, 2, cVar);
            if (aVar != null) {
                aVar.mo9811t1(chat, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public void m16206ij(View view) {
        C6883g1 x = this.f23649s0.m13460g().m13472x();
        if (x != null) {
            x.m18647U(view);
        }
    }

    public static void m16205ik(AbstractC9323v4<?> v4Var, C8112b bVar) {
        if (!v4Var.m9292ab()) {
            boolean z = v4Var instanceof AbstractC8424a;
            C8113c cVar = null;
            if (z) {
                cVar = ((AbstractC8424a) v4Var).mo9831R4(bVar.mo13512d(), null);
            }
            if (cVar == null) {
                cVar = new C8113c(v4Var.mo4347s(), v4Var.mo4348c());
                cVar.m13445v(C8112b.m13498k(bVar));
            }
            C7448r rVar = new C7448r(v4Var, 0, cVar);
            rVar.f23734l = true;
            rVar.f23732j = true;
            if (bVar.m13509e0()) {
                rVar.f23739q = new TdApi.SearchMessagesFilterAnimation();
            }
            if (z) {
                ((AbstractC8424a) v4Var).mo9811t1(bVar, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public void m16198jj(View view) {
        C6883g1 x = this.f23649s0.m13460g().m13472x();
        if (x != null) {
            x.m18647U(view);
        }
    }

    public static void m16197jk(C4583a5 a5Var) {
        C8112b V0;
        AbstractC9323v4<?> P0 = a5Var.m26097P0();
        if (!P0.m9292ab() && (V0 = C8112b.m13526V0(P0.mo4347s(), P0.mo4348c(), a5Var.m25994Z3())) != null) {
            V0.m13542N0(a5Var);
            C8113c cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
            cVar.m13445v(V0);
            C7448r rVar = new C7448r(P0, 2, cVar);
            rVar.f23734l = true;
            if (P0 instanceof AbstractC8424a) {
                ((AbstractC8424a) P0).mo9811t1(a5Var, rVar);
            }
            rVar.f23730h = a5Var.m26003Y5();
            m16140qk(P0, rVar);
        }
    }

    public static float m16192kh(int i, int i2, float f, float f2) {
        return ((i * (-f2)) + (i2 * f2)) * f;
    }

    public static void m16189kk(C4714n5 n5Var, long j) {
        TdApi.SearchMessagesFilterAnimation searchMessagesFilterAnimation;
        AbstractC9323v4<?> P0 = n5Var.m26097P0();
        TdApi.Message a4 = n5Var.m25985a4(j);
        C8112b V0 = C8112b.m13526V0(P0.mo4347s(), P0.mo4348c(), a4);
        if (V0 != null) {
            int constructor = a4.content.getConstructor();
            C8113c cVar = null;
            if (constructor != 1306939396) {
                if (constructor == 2021281344 && Build.VERSION.SDK_INT < 14) {
                    C1379j0.m37345Z(n5Var.m26097P0(), null, new File(((TdApi.MessageVideo) a4.content).video.video.local.path), "video/mp4", C4779t2.m25424t2(a4.interactionInfo));
                }
                searchMessagesFilterAnimation = null;
            } else {
                searchMessagesFilterAnimation = new TdApi.SearchMessagesFilterAnimation();
            }
            if (!P0.m9292ab()) {
                boolean z = P0 instanceof AbstractC8424a;
                if (z) {
                    cVar = ((AbstractC8424a) P0).mo9831R4(a4.f25409id, searchMessagesFilterAnimation);
                }
                if (cVar == null) {
                    cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
                    cVar.m13445v(V0);
                }
                C7448r rVar = new C7448r(P0, 0, cVar);
                rVar.f23730h = n5Var.m26003Y5();
                if (z) {
                    ((AbstractC8424a) P0).mo9811t1(a4, rVar);
                }
                rVar.m16047q(searchMessagesFilterAnimation);
                m16140qk(P0, rVar);
            }
        }
    }

    public static void m16182lj(View view, Rect rect) {
        rect.top += C1357a0.m37544i(8.0f);
        rect.bottom -= C1357a0.m37544i(8.0f);
        rect.left -= C1357a0.m37544i(4.0f);
        rect.right -= C1357a0.m37544i(4.0f);
    }

    public static void m16181lk(C4656h6 h6Var) {
        C4666i7 ga2;
        AbstractC9323v4<?> P0 = h6Var.m26097P0();
        if (!P0.m9292ab() && (ga2 = h6Var.m26624ga()) != null) {
            TdApi.WebPage J = ga2.m26584J();
            C8113c cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
            String str = J.displayUrl;
            TdApi.Message Z3 = h6Var.m25994Z3();
            h6Var.m26618ma();
            ArrayList<C8112b> B = ga2.m26592B();
            if (B != null) {
                cVar.m13447t(ga2.m26591C(), B);
                if (!C5070i.m24062i(J.author)) {
                    str = J.author;
                }
            } else if (J.sticker != null) {
                cVar.m13445v(new C8112b(P0.mo4347s(), P0.mo4348c(), h6Var.m26146K2(), h6Var.m26116N3(), C4779t2.m25552b0(J.sticker), true).m13538P0(Z3.chatId, Z3.f25409id));
            } else if (J.video != null) {
                cVar.m13445v(new C8112b(P0.mo4347s(), P0.mo4348c(), J.video, new TdApi.FormattedText("", null), true).m13538P0(Z3.chatId, Z3.f25409id));
            } else if (J.animation != null) {
                cVar.m13445v(new C8112b(P0.mo4347s(), P0.mo4348c(), J.animation, (TdApi.FormattedText) null).m13538P0(Z3.chatId, Z3.f25409id));
            } else if (J.photo != null) {
                cVar.m13445v(new C8112b(P0.mo4347s(), P0.mo4348c(), h6Var.m26146K2(), h6Var.m26116N3(), J.photo).m13538P0(Z3.chatId, Z3.f25409id));
            } else {
                return;
            }
            C7448r rVar = new C7448r(P0, 0, cVar);
            rVar.f23730h = true;
            rVar.f23731i = str;
            rVar.f23733k = J.url;
            rVar.f23732j = true;
            if (P0 instanceof AbstractC8424a) {
                ((AbstractC8424a) P0).mo9811t1(h6Var, rVar);
            }
            m16140qk(P0, rVar);
        }
    }

    public void m16174mj(long j, TdApi.PhotoSize photoSize) {
        HandlerC10770jj.m3698U7(this, j, photoSize.photo.f25376id, null, m16142qi());
    }

    public static void m16173mk(AbstractC9323v4<?> v4Var, TdApi.User user, AbstractC8424a aVar) {
        if (!v4Var.m9292ab() && user.profilePhoto != null) {
            C8113c cVar = new C8113c(v4Var.mo4347s(), v4Var.mo4348c());
            cVar.m13445v(new C8112b(v4Var.mo4347s(), v4Var.mo4348c(), user.f25442id, user.profilePhoto));
            C7448r rVar = new C7448r(v4Var, 1, cVar);
            if (aVar != null) {
                aVar.mo9811t1(user, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public void m16166nj(final long j, final TdApi.PhotoSize photoSize) {
        if (photoSize != null) {
            this.f30170b.m2485dd().post(new Runnable() {
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
        AbstractC9323v4<?> P0 = n5Var.m26097P0();
        C8112b V0 = C8112b.m13526V0(P0.mo4347s(), P0.mo4348c(), n5Var.m25994Z3());
        if (V0 == null) {
            return null;
        }
        C8113c cVar = new C8113c(P0.mo4347s(), P0.mo4348c());
        cVar.m13445v(V0);
        V0.m13550J0(n5Var);
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
        C1379j0.m37328i(mVar.f35167a, mVar.f35168b ? R.string.CopiedLink : R.string.CopiedLinkPrivate);
    }

    public static void m16132rk(AbstractC9323v4<?> v4Var, C8113c cVar, String str, AbstractC8424a aVar, boolean z) {
        if (!v4Var.m9292ab()) {
            C7448r rVar = new C7448r(v4Var, 5, cVar);
            rVar.f23729g = str;
            rVar.f23732j = z;
            if (aVar != null) {
                aVar.mo9811t1(cVar, rVar);
            }
            m16140qk(v4Var, rVar);
        }
    }

    public static int m16126si(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 100 ? R.drawable.baseline_bubble_chart_24 : R.drawable.baseline_zoom_out_map_24 : R.drawable.baseline_crop_3_2_24 : R.drawable.baseline_arrow_upward_24 : R.drawable.baseline_adjust_24;
    }

    public void m16109uj(double d, double d2, double d3, double d4) {
        if (this.f23547T3) {
            this.f23587d4.m14812r(d, d2, d3, d4);
        }
    }

    public void m16101vj(boolean z) {
        this.f23559W3.setRotateInternally(z);
    }

    public static int m16093wi(int i) {
        if (i == 1) {
            return C1357a0.m37544i(164.0f);
        }
        if (i == 2) {
            return C1357a0.m37544i(72.0f);
        }
        if (i == 3) {
            return C1357a0.m37544i(64.0f);
        }
        if (i != 4) {
            return 0;
        }
        return C1357a0.m37544i(72.0f) + C1357a0.m37544i(24.0f);
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
        return C1357a0.m37538o() * 2;
    }

    public boolean m16083xj(View view) {
        C8328e eVar = this.f23653s4;
        if (eVar == null || eVar.getContentWrap().m12804G1()) {
            return false;
        }
        m9254fe(null, new int[]{R.id.paint_clear, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.ClearDrawing), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean wj;
                wj = View$OnClickListenerC7430j1.this.m16092wj(view2, i);
                return wj;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        }, m16142qi());
        return true;
    }

    public void m16075yj(C8867c cVar, int i) {
        m16211hm();
    }

    public void m16067zj() {
        C9357x2.C9370l lVar = this.f23658t4;
        if (lVar != null) {
            lVar.m8904U();
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public final void m16485Ah() {
        C8431f fVar = this.f23643q4;
        m16262bl(fVar != null && !fVar.m12493i());
    }

    public final void m16484Ai(boolean z) {
        int i = this.f23687z3;
        if (i != 0) {
            m16094wh(0, (z || i == 3) ? 0 : 2);
        }
    }

    public final boolean m16482Ak() {
        C4868i.C4889t z1 = C4868i.m24727c2().m24548z1();
        this.f23468A4 = z1;
        this.f23473B4 = new C4868i.C4889t(z1);
        return true;
    }

    public final void m16481Al(boolean z) {
        if (this.f23547T3 != z) {
            this.f23547T3 = z;
            if (!z) {
                m16474Bk(2);
                this.f23480D1.setVisibility(0);
            }
            this.f23563X3.m29581l(z ? this.f23587d4.m14818l() ? 160L : 198L : 120L);
            this.f23563X3.m29577p(z, true);
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
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23484E0;
        float f = -((z0Var == null || z0Var.getVisibility() != 0 || this.f23484E0.getParent() == null) ? 0 : this.f23484E0.getMeasuredHeight());
        this.f23553V1.setTranslationY(f);
        this.f23557W1.setTranslationY(f);
        this.f23545T1.setTranslationY(f);
        View$OnClickListenerC9694y yVar = this.f23464A0;
        if (yVar != null) {
            yVar.m7575B2(true);
        }
    }

    public final boolean m16476Bi() {
        C7856c v = this.f23649s0.m13460g().m13476v();
        return v != null && !v.m14818l();
    }

    public final void m16474Bk(int i) {
        if (i == 0) {
            this.f23480D1.setDisallowMove(true);
        } else if (i == 1) {
            m16393Li();
        } else if (i == 3) {
            m16385Mi();
        } else if (i == 4) {
            m16378Ni();
        }
    }

    public final void m16473Bl(boolean z) {
        if (this.f23560X0 != z) {
            this.f23560X0 = z;
            this.f23480D1.getBaseCell().getDetector().m15861v();
            this.f23572a1 = this.f23649s0.m13460g();
            if (z) {
                mo4347s().m14468l2(this.f23471B2);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f23480D1.invalidateOutline();
                }
            } else {
                m16164nl(true);
            }
            if (this.f23564Y0 == null) {
                this.f23564Y0 = new C3950k(8, this, C2057b.f7280b, 198L, this.f23568Z0);
            }
            this.f23564Y0.m29546i(z ? 1.0f : 0.0f);
        }
    }

    public final void m16472Bm() {
        this.f30168a.m14459n3(this.f23516M0 * (1.0f - this.f23568Z0));
    }

    public final void m16469Ch() {
        m16439Fl(m16353Qj());
    }

    public final boolean m16468Ci() {
        C8111a z = this.f23649s0.m13460g().m13468z();
        return z != null && !z.m13574k();
    }

    public final void m16466Ck(int i) {
        if (i == 1) {
            RecyclerView recyclerView = this.f23593f2;
            if (recyclerView == null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo4347s(), 1, false);
                C7490r rVar = new C7490r(mo4347s(), linearLayoutManager);
                this.f23597g2 = rVar;
                rVar.m15814f0(this.f23519M3);
                this.f23597g2.m15816e0(this);
                C7498s sVar = new C7498s(mo4347s());
                this.f23593f2 = sVar;
                sVar.setItemAnimator(null);
                this.f23593f2.setOverScrollMode(2);
                this.f23593f2.m39437g(new C7435e());
                this.f23593f2.setLayoutManager(linearLayoutManager);
                this.f23593f2.setAdapter(this.f23597g2);
                this.f23593f2.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                this.f23593f2.setLayoutParams(FrameLayoutFix.m18007t1(-1, m16093wi(1), 80));
                this.f23593f2.setTranslationY(m16093wi(1));
                this.f23593f2.setAlpha(0.0f);
            } else {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).m39525z2(0, 0);
                this.f23597g2.m15814f0(this.f23519M3);
            }
            this.f23541S1.addView(this.f23593f2);
        } else if (i == 2) {
            if (this.f23613k2 == null) {
                FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, m16093wi(2), 80);
                FrameLayoutFix frameLayoutFix = new FrameLayoutFix(mo4347s());
                this.f23613k2 = frameLayoutFix;
                frameLayoutFix.setPadding(0, C1357a0.m37544i(16.0f), 0, 0);
                this.f23613k2.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                this.f23613k2.setLayoutParams(t1);
                this.f23613k2.setAlpha(0.0f);
                C7425i iVar = new C7425i(mo4347s());
                this.f23621m2 = iVar;
                iVar.setId(R.id.btn_rotate);
                this.f23621m2.setOnClickListener(this);
                this.f23621m2.m16489k(R.drawable.baseline_rotate_90_degrees_ccw_24, false, false);
                this.f23621m2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f), -1, 5));
                this.f23613k2.addView(this.f23621m2);
                C7425i iVar2 = new C7425i(mo4347s());
                this.f23617l2 = iVar2;
                iVar2.setId(R.id.btn_proportion);
                this.f23617l2.setOnClickListener(this);
                this.f23617l2.m16489k(R.drawable.baseline_image_aspect_ratio_24, false, false);
                this.f23617l2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f), -1, 3));
                this.f23613k2.addView(this.f23617l2);
                FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
                s1.leftMargin = C1357a0.m37544i(56.0f);
                s1.rightMargin = C1357a0.m37544i(56.0f);
                C7468n1 n1Var = new C7468n1(mo4347s());
                this.f23626n2 = n1Var;
                n1Var.setCallback(this);
                this.f23626n2.setLayoutParams(s1);
                this.f23613k2.addView(this.f23626n2);
                m16100vk();
            }
            this.f23551U3.setAlpha(0.0f);
            m16091wk();
            this.f23541S1.addView(this.f23613k2);
            this.f23475C1.addView(this.f23551U3, m16362Pi());
        } else if (i == 3) {
            if (this.f23631o2 == null) {
                FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, -1, 80);
                FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(mo4347s());
                this.f23631o2 = frameLayoutFix2;
                frameLayoutFix2.setAlpha(0.0f);
                this.f23631o2.setLayoutParams(t12);
                int i2 = C1357a0.m37544i(56.0f);
                int i3 = C1357a0.m37544i(18.0f);
                int i4 = i3 * 2;
                FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(12.0f) + i4, 80);
                View view = new View(mo4347s());
                view.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                view.setLayoutParams(t13);
                this.f23631o2.addView(view);
                FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f), C1357a0.m37544i(48.0f), 83);
                ImageView imageView = new ImageView(mo4347s());
                this.f23651s2 = imageView;
                imageView.setId(R.id.paint_undo);
                this.f23651s2.setOnClickListener(this);
                this.f23651s2.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view2) {
                        boolean xj;
                        xj = View$OnClickListenerC7430j1.this.m16083xj(view2);
                        return xj;
                    }
                });
                this.f23651s2.setScaleType(ImageView.ScaleType.CENTER);
                this.f23651s2.setImageResource(R.drawable.baseline_undo_24);
                this.f23651s2.setColorFilter(-1);
                C1399s0.m37196a0(this.f23651s2);
                this.f23651s2.setBackgroundResource(R.drawable.bg_btn_header_light);
                this.f23651s2.setLayoutParams(t14);
                this.f23631o2.addView(this.f23651s2);
                FrameLayout.LayoutParams t15 = FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f), C1357a0.m37544i(48.0f), 85);
                C7425i iVar3 = new C7425i(mo4347s());
                this.f23656t2 = iVar3;
                iVar3.setId(R.id.btn_paintType);
                this.f23656t2.m16488l();
                this.f23656t2.setOnClickListener(this);
                this.f23656t2.m16489k(m16126si(1), false, false);
                this.f23656t2.setLayoutParams(t15);
                this.f23631o2.addView(this.f23656t2);
                FrameLayout.LayoutParams t16 = FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(12.0f) + i4, 81);
                int i5 = i2 - i3;
                t16.rightMargin = i5;
                t16.leftMargin = i5;
                C8864b bVar = new C8864b(mo4347s());
                this.f23636p2 = bVar;
                bVar.setToneEventListener(new C7437g());
                this.f23636p2.setPadding(i3, i3, i3, i3);
                this.f23636p2.setLayoutParams(t16);
                this.f23631o2.addView(this.f23636p2);
                FrameLayout.LayoutParams t17 = FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(220.0f), 80);
                t17.bottomMargin = C1357a0.m37544i(12.0f) + i4;
                C8872e eVar = new C8872e(mo4347s());
                this.f23641q2 = eVar;
                eVar.setAlpha(0.0f);
                this.f23641q2.setLayoutParams(t17);
                this.f23631o2.addView(this.f23641q2);
                C6879f3 f3Var = new C6879f3(mo4347s());
                this.f23646r2 = f3Var;
                f3Var.setSimpleTopShadow(true);
                this.f23646r2.setAlpha(0.0f);
                FrameLayout.LayoutParams t18 = FrameLayoutFix.m18007t1(-1, this.f23646r2.getLayoutParams().height, 80);
                t18.bottomMargin = C1357a0.m37544i(220.0f) + C1357a0.m37544i(12.0f) + i4;
                this.f23646r2.setLayoutParams(t18);
                this.f23631o2.addView(this.f23646r2);
                int i6 = C1357a0.m37544i(78.0f);
                FrameLayout.LayoutParams t19 = FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(220.0f) + i3 + i6, 80);
                t19.bottomMargin = C1357a0.m37544i(12.0f) + i3;
                C8863a aVar = new C8863a(mo4347s());
                aVar.setPadding(0, i6, 0, 0);
                aVar.setLayoutParams(t19);
                this.f23631o2.addView(aVar);
                FrameLayout.LayoutParams t110 = FrameLayoutFix.m18007t1(C1357a0.m37544i(48.0f), C1357a0.m37544i(48.0f), 83);
                t110.leftMargin = i2 - (C1357a0.m37544i(48.0f) / 2);
                t110.bottomMargin = ((C1357a0.m37544i(12.0f) + i4) / 2) - (C1357a0.m37544i(48.0f) / 2);
                C8867c cVar = new C8867c(mo4347s());
                this.f23661u2 = cVar;
                cVar.setColorChangeListener(new C8867c.AbstractC8869b() {
                    @Override
                    public final void mo11055a(C8867c cVar2, int i7) {
                        View$OnClickListenerC7430j1.this.m16075yj(cVar2, i7);
                    }
                });
                this.f23661u2.setPositionChangeListener(new C8867c.AbstractC8870c() {
                    @Override
                    public final void mo11054a() {
                        View$OnClickListenerC7430j1.this.m16067zj();
                    }
                });
                this.f23661u2.setBrushChangeListener(this);
                this.f23661u2.setTone(this.f23641q2);
                this.f23661u2.setDirection(aVar);
                this.f23661u2.setLayoutParams(t110);
                this.f23631o2.addView(this.f23661u2);
                this.f23641q2.setPreview(this.f23661u2);
                this.f23636p2.setPreview(this.f23661u2);
                this.f23636p2.m11070k(this.f23641q2, this.f23646r2);
                this.f23636p2.setDirection(aVar);
            }
            m16415Il(C8429d.m12503a(), false);
            m16485Ah();
            this.f23661u2.m11063d(true);
            this.f23541S1.addView(this.f23631o2);
        } else if (i == 4) {
            if (this.f23601h2 == null) {
                int wi = m16093wi(4);
                int i7 = C1357a0.m37544i(56.0f);
                C1357a0.m37544i(16.0f);
                int i8 = C1357a0.m37544i(18.0f);
                FrameLayoutFix frameLayoutFix3 = new FrameLayoutFix(mo4347s());
                this.f23601h2 = frameLayoutFix3;
                frameLayoutFix3.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
                this.f23601h2.setAlpha(0.0f);
                this.f23601h2.setLayoutParams(FrameLayoutFix.m18007t1(-1, wi, 80));
                C7484p1 p1Var = new C7484p1(mo4347s());
                this.f23605i2 = p1Var;
                p1Var.setListener(new C7436f());
                this.f23605i2.setLayoutParams(FrameLayoutFix.m18006u1(-1, i7, 80, 0, 0, 0, i8));
                this.f23605i2.setAnchorMode(0);
                this.f23605i2.setAddPaddingLeft(C1357a0.m37544i(18.0f));
                this.f23605i2.setAddPaddingRight(C1357a0.m37544i(18.0f));
                this.f23605i2.m15842g(R.id.theme_color_white, false);
                this.f23601h2.addView(this.f23605i2);
                TextView O = C1399s0.m37209O(mo4347s(), 14.0f, C11524j.m228N(R.id.theme_color_white), 3, 2);
                O.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 51, C1357a0.m37544i(15.0f), C1357a0.m37544i(10.0f), C1357a0.m37544i(15.0f), 0));
                O.setText(R.string.QualityWorse);
                this.f23601h2.addView(O);
                TextView O2 = C1399s0.m37209O(mo4347s(), 14.0f, C11524j.m228N(R.id.theme_color_white), 5, 2);
                O2.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 53, C1357a0.m37544i(15.0f), C1357a0.m37544i(10.0f), C1357a0.m37544i(15.0f), 0));
                O2.setText(R.string.QualityBetter);
                this.f23601h2.addView(O2);
                TextView O3 = C1399s0.m37209O(mo4347s(), 15.0f, C11524j.m228N(R.id.theme_color_white), 17, 2);
                this.f23609j2 = O3;
                O3.setLayoutParams(FrameLayoutFix.m18006u1(-2, -2, 81, 0, 0, 0, C1357a0.m37544i(8.0f)));
                this.f23601h2.addView(this.f23609j2);
            }
            this.f23541S1.addView(this.f23601h2);
            m16430Gm();
        }
    }

    public final void m16465Cl(float f, float f2) {
        this.f23494G2 = this.f23649s0.m13460g();
        this.f23490F2 = true;
    }

    public final void m16464Cm() {
        float f = this.f23465A1 * (1.0f - this.f23625n1);
        this.f23489F1.setAlpha(f);
        this.f23493G1.setAlpha(f);
        this.f23501I1.setAlpha(f);
        this.f23497H1.setAlpha(0.7f * f);
        boolean z = true;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        this.f23489F1.setEnabled(i == 0);
        this.f23493G1.setEnabled(i == 0);
        C7465m1 m1Var = this.f23501I1;
        if (i != 0) {
            z = false;
        }
        m1Var.setEnabled(z);
    }

    @Override
    public void mo8238D4(RunnableC9558i0 i0Var, String str) {
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23484E0;
        if (z0Var != null) {
            z0Var.m17832v2(str);
        }
    }

    @Override
    public long mo8237D5(RunnableC9558i0 i0Var) {
        return m9131x9().f23735m;
    }

    public final void m16461Dh() {
        RunnableC7454x xVar = this.f23558W2;
        if (xVar != null) {
            C8731d dVar = (this.f23516M0 != 1.0f || this.f23550U2 <= 0.0f) ? null : this.f23562X2;
            if (xVar.getItemAnimator() != dVar) {
                this.f23558W2.setItemAnimator(dVar);
            }
        }
    }

    public final boolean m16460Di() {
        C8431f C = this.f23649s0.m13460g().m13565C();
        return C != null && !C.m12493i();
    }

    public final void m16458Dk() {
        if (this.f23488F0) {
            m16073yl(this.f23492G0 || m9348S9());
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
            mo4347s().m14431u3(0, true);
        } else if (this.f23629o0 != 4 || i < 19) {
            mo4347s().m14431u3(1, true);
        } else {
            mo4347s().m14431u3(7, true);
        }
    }

    public final void m16456Dm(int r23, int r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16456Dm(int, int, boolean, boolean):void");
    }

    @Override
    public boolean mo16455E(View view, TdApi.Animation animation) {
        return C6846b1.m18795b(this, view, animation);
    }

    public final void m16452Eh(C8112b bVar, int i) {
        if (bVar != null && bVar.m13468z() != null && !bVar.m13468z().m13574k()) {
            C8111a z = bVar.m13468z();
            bVar.m13568A0(null);
            this.f30170b.m2429h5().m23072y0(C6252k.m20879D0(z));
        }
    }

    public final boolean m16451Ei() {
        View view = this.f23549U1;
        if (view != null) {
            if (view instanceof TextView) {
                return ((TextView) view).getText().length() > 0;
            }
            if (view instanceof C6973n0) {
                return !C5070i.m24062i(((C6973n0) view).getText());
            }
        }
        return false;
    }

    public final void m16449Ek() {
    }

    public final void m16448El(boolean z, boolean z2) {
        if (this.f23639q0 != null) {
            int h = this.f23649s0.m13459h();
            C8112b g = this.f23649s0.m13460g();
            if (!z) {
                m16452Eh(g, h);
            }
            this.f23639q0.mo11239Q1(h, g, z);
            int P0 = this.f23639q0.mo11241P0();
            if (!z || P0 != 1) {
                if (P0 != 0 || z) {
                    this.f23573a2.m9678E(P0);
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
        C7465m1 m1Var = this.f23501I1;
        if (m1Var != null) {
            m1Var.m15979a(z, this.f23568Z0 > 0.0f && m1Var.getAlpha() > 0.0f);
        }
    }

    @Override
    public boolean mo16446F4(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        return C6846b1.m18794c(this, view, lVar, z, messageSchedulingState);
    }

    public final void m16443Fh() {
        if (this.f23507J3 != null) {
            if (this.f23511K3 != null) {
                C6244g.m20961k().m20959m(this.f23515L3, this.f23511K3);
            }
            this.f23511K3 = null;
            this.f23507J3 = null;
        }
    }

    public final boolean m16442Fi() {
        int i = this.f23687z3;
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
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23484E0;
        if (z0Var != null && z0Var.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) this.f23484E0.getParent();
            viewGroup.removeView(this.f23484E0);
            viewGroup.requestLayout();
        }
    }

    public final void m16439Fl(boolean z) {
        C3940f fVar = this.f23554V2;
        boolean z2 = true;
        if ((fVar != null && fVar.m29585h()) != z) {
            if (this.f23554V2 == null) {
                this.f23554V2 = new C3940f(21, this, C2057b.f7280b, 150L);
            }
            if (z) {
                m16338Si();
                m16299Xh();
            }
            C3940f fVar2 = this.f23554V2;
            if (this.f23516M0 <= 0.0f) {
                z2 = false;
            }
            fVar2.m29577p(z, z2);
        } else if (z && this.f23629o0 == 0 && !m9131x9().f23732j && this.f23566Y2.f23748O.m16021l() != this.f23649s0.m13460g().getMessage().mediaAlbumId) {
            m16299Xh();
        }
    }

    public final void m16438Fm() {
        int i;
        StringBuilder sb2;
        double d;
        if (this.f23609j2 != null) {
            C6253l K = this.f23649s0.m13460g().m13549K();
            int Y0 = K.m20850Y0();
            int L0 = K.m20863L0();
            int U0 = K.m20854U0();
            long R0 = K.m20857R0();
            double W0 = K.m20852W0();
            double V0 = K.m20853V0();
            double T0 = K.m20855T0(true, TimeUnit.MILLISECONDS) / 1000.0d;
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
            int c = this.f23473B4.m24490c(U0);
            C4868i.C4891v d2 = this.f23473B4.m24489d(Y0, L0);
            if (d2 == null) {
                d2 = new C4868i.C4891v(Math.max(Y0, L0), Math.min(Y0, L0));
            }
            long b = this.f23473B4.m24491b(d2, c, R0);
            long j = (long) (0 + ((b * T0) / 8.0d));
            if (!K.m20833p1()) {
                j = (long) (j + ((T0 * 62000.0d) / 8.0d));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C1363c0.m37424n(j, true));
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
            sb3.append((b + (K.m20833p1() ? 0 : 6200)) / 1000);
            sb3.append(" kbps");
            this.f23609j2.setText(sb3.toString());
        }
    }

    @Override
    public View mo8869G9() {
        return this.f23585d2;
    }

    public final void m16435Gh() {
        C7451u uVar = this.f23566Y2;
        if (uVar != null) {
            uVar.m16033h0(null);
            this.f23558W2.setItemAnimator(null);
        }
    }

    public final boolean m16434Gi() {
        return !this.f23591e4.m14829a(this.f23587d4);
    }

    public final void m16432Gk() {
        boolean z;
        int i = this.f23687z3;
        if (i == 1) {
            C8111a aVar = this.f23539R3;
            if (aVar != null && this.f23543S3) {
                this.f23519M3.m13572m(aVar);
            }
        } else if (i == 2) {
            C7856c cVar = this.f23591e4;
            if (cVar == null || cVar.m14818l()) {
                if (this.f23587d4.m14820j()) {
                    m16424Hk(false);
                }
                this.f23649s0.m13460g().m13469y0(null);
                return;
            }
            if (!this.f23591e4.m14829a(this.f23587d4)) {
                m16424Hk(false);
            }
            this.f23649s0.m13460g().m13469y0(this.f23591e4);
        } else if (i == 3) {
            C8431f fVar = this.f23648r4;
            if (fVar == null || fVar.m12493i()) {
                z = this.f23649s0.m13460g().m13560E0(null, true);
            } else {
                z = this.f23649s0.m13460g().m13560E0(this.f23648r4, true);
            }
            if (z) {
                this.f23480D1.getBaseReceiver().invalidate();
            }
        } else if (i == 4) {
            this.f23473B4 = new C4868i.C4889t(this.f23468A4);
        }
    }

    public final void m16431Gl(float f) {
        if (this.f23672w3 != f) {
            this.f23672w3 = f;
            float max = Math.max(0.0f, Math.min(1.0f, f));
            this.f23577b2.setAlpha(max);
            this.f23677x3.setAlpha(max);
            float f2 = 1.0f - max;
            m16230fl(f2);
            m16204il(f2 * Math.max(0.0f, Math.min(1.0f, this.f23666v2)));
        }
    }

    public final void m16430Gm() {
        C4868i.C4889t next;
        C4868i.C4891v d;
        double d2;
        if (this.f23605i2 != null) {
            List<C4868i.C4889t> list = this.f23478C4;
            if (list != null) {
                list.clear();
            } else {
                this.f23478C4 = new ArrayList();
            }
            C6253l K = this.f23649s0.m13460g().m13549K();
            int Y0 = K.m20850Y0();
            int L0 = K.m20863L0();
            double W0 = K.m20852W0();
            double V0 = K.m20853V0();
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
            Iterator<C4868i.C4889t> it = C4868i.m24727c2().m24587t6().iterator();
            int i = -1;
            int i2 = -1;
            while (it.hasNext() && (d = (next = it.next()).m24489d(Y0, L0)) != null) {
                int abs = Math.abs(this.f23473B4.f16716a.f16719a - d.f16719a);
                if (i == -1 || abs < i2) {
                    i = this.f23478C4.size();
                    i2 = abs;
                }
                this.f23478C4.add(next);
            }
            boolean z = true;
            if (this.f23473B4.f16716a.m24485b()) {
                i = this.f23478C4.size() - 1;
            }
            this.f23605i2.setValueCount(this.f23478C4.size());
            this.f23605i2.setValue(i / (this.f23478C4.size() - 1));
            C7484p1 p1Var = this.f23605i2;
            if (this.f23478C4.size() <= 1) {
                z = false;
            }
            p1Var.m15841h(z, false);
            m16438Fm();
        }
    }

    public void m16427Hh() {
        if (this.f23560X0) {
            m16386Mh();
        } else if (this.f23504J0 != -1 || !mo404jc(false)) {
            this.f23471B2.m18408y2(true);
        }
    }

    public final boolean m16426Hi() {
        return this.f23543S3 && !this.f23539R3.m13583b(this.f23519M3);
    }

    public final void m16425Hj() {
        if (Build.VERSION.SDK_INT >= 19 && this.f23512L0 != null && this.f23674x0 != null) {
            float f = this.f23516M0;
            if (f > 0.0f && f < 1.0f) {
                float max = Math.max(0.0f, Math.min(1.0f, f));
                this.f23674x0.m15999a();
                int measuredWidth = this.f23475C1.getMeasuredWidth();
                int measuredHeight = this.f23475C1.getMeasuredHeight();
                AbstractC6264v baseReceiver = this.f23480D1.getBaseReceiver();
                float min = Math.min(this.f23674x0.m15980t(), this.f23674x0.m15995e()) / 2;
                float sqrt = min + (((((float) Math.sqrt((measuredWidth * measuredWidth) + (measuredHeight * measuredHeight))) * 0.5f) - min) * max);
                RectF a0 = C1410y.m37053a0();
                a0.set(baseReceiver.mo20258I0() - sqrt, baseReceiver.mo20228y0() - sqrt, baseReceiver.mo20258I0() + sqrt, baseReceiver.mo20228y0() + sqrt);
                this.f23512L0.reset();
                this.f23512L0.addRoundRect(a0, sqrt, sqrt, Path.Direction.CCW);
            }
        }
    }

    public final void m16424Hk(boolean z) {
        C7856c cVar;
        C7856c cVar2;
        C7856c cVar3;
        if (!this.f23615k4) {
            m16111uh();
            this.f23603h4 = this.f23587d4.m14827c();
            float c = (z || (cVar3 = this.f23591e4) == null) ? 0.0f : cVar3.m14827c();
            this.f23607i4 = c;
            boolean z2 = false;
            this.f23611j4 = c - this.f23603h4 != 0.0f;
            int h = ((z || (cVar2 = this.f23591e4) == null) ? 0 : cVar2.m14822h()) - this.f23587d4.m14822h();
            this.f23583c4 = h;
            if (h < -180) {
                this.f23583c4 = h + 360;
            }
            this.f23587d4.m14815o(this.f23583c4);
            this.f23617l2.m16491i(false, true);
            this.f23615k4 = this.f23611j4 || this.f23583c4 != 0;
            this.f23619l4 = !z;
            if (z || (cVar = this.f23591e4) == null || cVar.m14818l()) {
                if (this.f23555V3.m14843n(this.f23615k4, !z)) {
                    this.f23615k4 = true;
                }
            } else if (this.f23555V3.m14855b(this.f23591e4.m14826d(), this.f23591e4.m14821i(), this.f23591e4.m14823g(), this.f23591e4.m14828b(), true, true)) {
                this.f23615k4 = true;
            }
            if (this.f23619l4 && this.f23615k4) {
                z2 = true;
            }
            this.f23619l4 = z2;
        }
    }

    public final void m16423Hl(float f) {
    }

    public final void m16422Hm() {
        C7489q1 q1Var = this.f23561X1;
        if (q1Var != null) {
            float f = 1.0f;
            float f2 = this.f23536R0 * (1.0f - this.f23568Z0);
            if (this.f23474C0) {
                f = 0.0f;
            }
            q1Var.setAlpha(f2 * f);
        }
    }

    @Override
    public void mo11175I2(C6924j2 j2Var) {
        if (this.f23669w0 == 1) {
            this.f23480D1.setPendingOpenAnimator(this.f23664v0);
        } else {
            this.f23664v0.m29546i(1.0f);
        }
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        m16406Jm();
        View view = this.f23549U1;
        if (view instanceof AbstractC9165c2) {
            ((AbstractC9165c2) view).mo8255s();
        }
        LinearLayoutManager linearLayoutManager = this.f23570Z2;
        if (linearLayoutManager != null) {
            linearLayoutManager.m39575B2(C4403w.m27986G2());
        }
        RunnableC7454x xVar = this.f23558W2;
        if (xVar != null) {
            xVar.m39507A0();
            m16339Sh(false, false);
        }
    }

    public void m16419Ih() {
        new C3950k(14, this, C2057b.f7280b, 180L).m29546i(1.0f);
        this.f23504J0 = 4;
        this.f23471B2.m18408y2(true);
    }

    public final boolean m16418Ii() {
        return !this.f23648r4.m12497e(this.f23643q4);
    }

    public final void m16417Ij() {
        m16409Jj(false, false);
    }

    public final void m16416Ik() {
        this.f23591e4 = null;
    }

    public final void m16415Il(int i, boolean z) {
        if (this.f23663u4 != i) {
            this.f23663u4 = i;
            if (z) {
                C8429d.m12502b(i);
            }
            this.f23656t2.m16489k(m16126si(i), z, false);
            m16250dh(i);
        }
    }

    public final void m16414Im() {
        RunnableC7454x xVar = this.f23558W2;
        if (xVar != null) {
            xVar.setAlpha(this.f23544T0 * this.f23536R0 * (1.0f - this.f23568Z0));
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            C5320c cVar = new C5320c(4);
            C5146u0 u0Var = new C5146u0(4);
            C8112b g = this.f23649s0.m13460g();
            TdApi.Chat U2 = this.f30170b.m2632U2(g.m13551J());
            if (g.m13491n0() && !g.m13509e0() && g.m13507f0()) {
                cVar.m23285a(R.id.btn_open);
                u0Var.m23817a(R.string.OpenInExternalApp);
            }
            if (g.m13507f0() && g.m13504h()) {
                cVar.m23285a(R.id.btn_saveToGallery);
                u0Var.m23817a(R.string.SaveToGallery);
            }
            int i2 = this.f23629o0;
            if (i2 != 4 && i2 != 3 && g.m13504h() && g.m13502i()) {
                cVar.m23285a(R.id.btn_share);
                u0Var.m23817a(R.string.Share);
            }
            if (g.m13509e0() && g.m13504h()) {
                cVar.m23285a(R.id.btn_saveGif);
                u0Var.m23817a(R.string.SaveGif);
            }
            if (!C5070i.m24062i(m9131x9().f23733k) || (U2 != null && this.f30170b.m2272r2(g.getMessage()))) {
                cVar.m23285a(R.id.btn_copyLink);
                u0Var.m23817a(R.string.CopyLink);
            }
            if (!(g.m13551J() == 0 || g.mo13512d() == 0 || this.f23629o0 != 0)) {
                cVar.m23285a(R.id.btn_showInChat);
                u0Var.m23817a(R.string.ShowInChat);
            }
            if (g.m13508f() && (g.getMessage() != null || this.f23649s0.m13459h() == 0)) {
                cVar.m23285a(R.id.btn_messageReport);
                u0Var.m23817a(R.string.Report);
            }
            boolean z = true;
            boolean z2 = this.f23629o0 == 1 && this.f30170b.m2395j7(g.m13545M());
            if (z2 || this.f23629o0 != 2) {
                z = z2;
            } else if (U2 == null || !this.f30170b.m2352m2(U2)) {
                z = false;
            }
            if (z2 && this.f23649s0.m13459h() != 0) {
                cVar.m23285a(R.id.btn_setProfilePhoto);
                u0Var.m23817a(R.string.SetAsCurrent);
            }
            if (z) {
                cVar.m23285a(R.id.btn_deleteProfilePhoto);
                u0Var.m23817a(R.string.Delete);
            }
            if (!cVar.m23280f()) {
                m9302Yd(cVar.m23281e(), u0Var.m23814d(), 0);
            }
        } else if (i == R.id.menu_btn_pictureInPicture) {
            m16323Uh();
        }
    }

    @Override
    public int[] mo7925J2(C9639r rVar, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        return C9639r.m7947e(rVar, view, view2, i, i2, i3, i4, i5, this.f23475C1, this.f23541S1, this.f23484E0);
    }

    public final void m16411Jh() {
        if (!this.f23474C0) {
            return;
        }
        if (this.f23488F0) {
            m16265bi();
        } else {
            C1408x.m37091c(this.f23549U1);
        }
    }

    public final boolean m16410Ji() {
        return !this.f23473B4.equals(this.f23468A4);
    }

    public final void m16409Jj(boolean z, boolean z2) {
        if (!this.f23552V0 && !m9131x9().f23730h) {
            int i = this.f23629o0;
            if (i == 0) {
                long J = this.f23649s0.m13460g().m13551J();
                if (J != 0) {
                    if (this.f23548U0) {
                        if (this.f23624n0) {
                            if ((!z || !z2) && this.f23649s0.m13459h() < this.f23649s0.m13458i() - 4) {
                                return;
                            }
                        } else if ((!z || z2) && this.f23649s0.m13459h() > 4) {
                            return;
                        }
                    }
                    this.f23552V0 = true;
                    C8112b r = this.f23624n0 ? this.f23649s0.m13449r() : this.f23649s0.m13464c();
                    Client r4 = this.f30170b.m2270r4();
                    long d = r.mo13512d();
                    TdApi.SearchMessagesFilter searchMessagesFilter = this.f23654t0;
                    if (searchMessagesFilter == null) {
                        searchMessagesFilter = new TdApi.SearchMessagesFilterPhotoAndVideo();
                    }
                    r4.m14783o(new TdApi.SearchChatMessages(J, null, null, d, 0, 40, searchMessagesFilter, this.f23659u0), this);
                }
            } else if (i == 1) {
                long S0 = C7321e.m16982S0(this.f23649s0.m13460g().m13545M());
                if (!this.f23548U0 || ((z && z2) || this.f23649s0.m13459h() <= this.f23649s0.m13458i() - 4)) {
                    this.f23552V0 = true;
                    this.f30170b.m2270r4().m14783o(new TdApi.GetUserProfilePhotos(S0, this.f23548U0 ? this.f23649s0.m13458i() : 0, 100), this);
                }
            } else if (i == 2) {
                long J2 = this.f23649s0.m13460g().m13551J();
                if (!this.f23548U0 || ((z && z2) || this.f23649s0.m13459h() <= this.f23649s0.m13458i() - 4)) {
                    this.f23552V0 = true;
                    C8112b r2 = this.f23649s0.m13449r();
                    Client r42 = this.f30170b.m2270r4();
                    long d2 = r2.mo13512d();
                    TdApi.SearchMessagesFilter searchMessagesFilter2 = this.f23654t0;
                    if (searchMessagesFilter2 == null) {
                        searchMessagesFilter2 = new TdApi.SearchMessagesFilterChatPhoto();
                    }
                    r42.m14783o(new TdApi.SearchChatMessages(J2, null, null, d2, 0, 100, searchMessagesFilter2, this.f23659u0), this);
                }
            }
        }
    }

    public final void m16408Jk() {
        this.f23539R3 = null;
    }

    public final void m16407Jl(float f) {
        if (this.f23465A1 != f) {
            this.f23465A1 = f;
            m16464Cm();
        }
    }

    public final void m16406Jm() {
        if (this.f23585d2 != null) {
            int Mj = m16384Mj();
            int i = C1357a0.m37544i(68.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23585d2.getLayoutParams();
            int i2 = C4403w.m27986G2() ? Mj : i;
            int topOffset = this.f23589e2.m10024w3() ? View$OnClickListenerC9170d1.getTopOffset() : 0;
            if (C4403w.m27986G2()) {
                Mj = i;
            }
            if (C1399s0.m37180i0(layoutParams, i2, topOffset, Mj, 0)) {
                C1399s0.m37148y0(this.f23585d2);
            }
        }
    }

    @Override
    public boolean mo16405K1(float f, float f2) {
        return this.f23568Z0 != 0.0f;
    }

    public final void m16403Kg(java.util.List<org.drinkless.p210td.libcore.telegram.TdApi.Message> r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16403Kg(java.util.List, int):void");
    }

    public final boolean m16402Kh(int i) {
        if (this.f23571Z3) {
            this.f23571Z3 = false;
            return false;
        } else if (this.f23567Y3 != -1) {
            return true;
        } else {
            this.f23567Y3 = i;
            if (!this.f23615k4) {
                m16481Al(false);
            }
            return true;
        }
    }

    public final void m16401Ki() {
        AbstractC7459k1 k1Var;
        C8112b g = this.f23649s0.m13460g();
        C8112b bVar = this.f23500I0;
        if (bVar == null || bVar != g) {
            if (!(bVar == null || (k1Var = this.f23634p0) == null)) {
                k1Var.mo9807F2(this.f23496H0, bVar, true);
            }
            this.f23500I0 = g;
            int h = this.f23649s0.m13459h();
            this.f23496H0 = h;
            AbstractC7459k1 k1Var2 = this.f23634p0;
            if (k1Var2 != null) {
                k1Var2.mo9807F2(h, this.f23500I0, false);
            }
        }
    }

    public final void m16400Kj(C6246h hVar) {
        if (this.f23535Q3 == null) {
            this.f23535Q3 = new C6267y(this);
        }
        ImageLoader.m14391e().m14384l(hVar, this.f23535Q3);
    }

    public final void m16399Kk(int i) {
        this.f23480D1.m16513u2(m16134ri(i), m16084xi(i), m16102vi(i));
    }

    public final void m16398Kl(boolean z, boolean z2) {
        if (this.f23685z1 != z) {
            this.f23685z1 = z;
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
        C8112b g = this.f23649s0.m13460g();
        boolean n0 = g.m13491n0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m16229fm(n0, true, g.m13521Y(true, timeUnit), timeUnit, z);
        if (this.f23629o0 != 3) {
            return;
        }
        if (g.m13491n0()) {
            this.f23533Q1.m16489k(R.drawable.baseline_settings_24, z, false);
            this.f23525O1.m16489k(R.drawable.baseline_rotate_90_degrees_ccw_24, z, false);
            this.f23529P1.m16489k(R.drawable.baseline_volume_up_24, z, g.m13487p0());
            return;
        }
        this.f23533Q1.m16489k(R.drawable.baseline_tune_24, z, false);
        this.f23525O1.m16489k(R.drawable.baseline_crop_rotate_24, z, false);
        this.f23529P1.m16489k(R.drawable.baseline_brush_24, z, false);
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_transparentEditor;
    }

    @Override
    public void mo9397La() {
        super.mo9397La();
        if (this.f23629o0 == 3) {
            m16411Jh();
        }
    }

    public final void m16117tj(org.drinkless.p210td.libcore.telegram.TdApi.ChatPhotos r20) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16117tj(org.drinkless.td.libcore.telegram.TdApi$ChatPhotos):void");
    }

    public final void m16394Lh(boolean z) {
        if (this.f23488F0) {
            if (this.f23484E0 != null) {
                m16440Fk();
                if (this.f23492G0) {
                    if (z) {
                        this.f23484E0.m17861R2((C7029t0) this.f23549U1);
                    } else {
                        this.f23484E0.m17861R2((C7029t0) this.f23549U1);
                    }
                }
            }
            this.f23488F0 = false;
            this.f23553V1.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
        }
    }

    public final void m16393Li() {
        m16103vh();
        this.f23503I3.setEditorVisible(false);
        this.f23503I3.m12816q();
        this.f23503I3.setScaleX(1.0f);
        this.f23503I3.setScaleY(1.0f);
    }

    public final int m16392Lj() {
        LinearLayout linearLayout;
        int i = (int) (C1357a0.m37544i(56.0f) * this.f23681y2);
        return (this.f23524O0 != 1.0f || (linearLayout = this.f23545T1) == null) ? i : i + linearLayout.getMeasuredHeight();
    }

    public final void m16391Lk() {
        C3940f fVar;
        if (this.f23558W2 != null && (fVar = this.f23554V2) != null && fVar.m29585h()) {
            m16119th();
            this.f23558W2.m39507A0();
            m16339Sh(false, false);
        }
    }

    public final void m16390Ll(float f) {
        float f2 = (0.4f * f) + 0.6f;
        float f3 = this.f23556W0 * f2;
        this.f23480D1.setScaleX(f3);
        this.f23480D1.setScaleY(f3);
        this.f23480D1.setAlpha(f);
        this.f23485E1.setScaleX(f2);
        this.f23485E1.setScaleY(f2);
        this.f23485E1.setAlpha(f);
    }

    @Override
    public void mo16389M2(ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, boolean z) {
    }

    @Override
    public void mo15892M5(C8112b bVar, boolean z) {
        C7489q1 q1Var;
        if (this.f23649s0.m13460g() == bVar && (q1Var = this.f23561X1) != null) {
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
        this.f23556W0 = this.f23480D1.getScaleX();
        this.f23504J0 = 3;
        this.f23471B2.m18408y2(true);
    }

    public final void m16385Mi() {
        this.f23653s4.setEditorVisible(false);
        C8112b bVar = this.f23628n4;
        if (bVar.m13560E0(bVar.m13565C(), false)) {
            this.f23480D1.getBaseReceiver().invalidate();
        }
        this.f23653s4.m12816q();
        this.f23653s4.setScaleX(1.0f);
        this.f23653s4.setScaleY(1.0f);
        m16211hm();
    }

    public final int m16384Mj() {
        int i = C1357a0.m37544i(49.0f);
        if (m16135rh()) {
            i += C1357a0.m37544i(49.0f);
        }
        if (m16160oh()) {
            i += C1357a0.m37544i(49.0f);
        }
        return m16127sh() ? i + C1357a0.m37544i(49.0f) : i;
    }

    public final void m16383Mk() {
        this.f23468A4 = null;
    }

    public final void m16382Ml(float f, float f2) {
        if (this.f23568Z0 == f) {
            return;
        }
        if (!Float.isNaN(f)) {
            this.f23568Z0 = f;
            boolean z = false;
            m16456Dm(this.f23480D1.getMeasuredWidth(), this.f23480D1.getMeasuredHeight(), false, false);
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                this.f23480D1.setTranslationZ(C1357a0.m37544i(1.0f) * f);
            }
            this.f23572a1.m13471x0(1.0f - f);
            if (this.f23480D1.getBaseCell().getDetector().m15857z(f2) && i >= 21) {
                this.f23480D1.invalidateOutline();
            }
            C7401b0 b0Var = this.f23480D1;
            if (f != 0.0f) {
                z = true;
            }
            b0Var.setDisableTouch(z);
            this.f23475C1.invalidate();
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
        C8112b g = this.f23649s0.m13460g();
        CharSequence charSequence2 = null;
        int i2 = 2;
        boolean z = true;
        switch (i) {
            case R.id.btn_copyLink:
                if (!C5070i.m24062i(m9131x9().f23733k)) {
                    C1379j0.m37328i(m9131x9().f23733k, R.string.CopiedLink);
                    return;
                } else if (g.m13551J() != 0 && this.f30170b.m2272r2(g.getMessage())) {
                    C10930q6 q6Var = this.f30170b;
                    TdApi.Message message = g.getMessage();
                    if (this.f23659u0 == 0) {
                        z = false;
                    }
                    q6Var.m2849G5(message, false, z, C7488q0.f23965a);
                    return;
                } else {
                    return;
                }
            case R.id.btn_deleteProfilePhoto:
                int i3 = this.f23629o0;
                if (i3 == 1) {
                    this.f30170b.m2270r4().m14783o(new TdApi.DeleteProfilePhoto(g.m13563D()), this.f30170b.m2392ja());
                } else if (i3 == 2) {
                    this.f30170b.m2270r4().m14783o(new TdApi.SetChatPhoto(g.m13551J(), null), this.f30170b.m2392ja());
                }
                this.f23504J0 = 0;
                m16427Hh();
                return;
            case R.id.btn_messageReport:
                TdApi.Message message2 = g.getMessage();
                if (message2 != null) {
                    HandlerC10770jj.m3708T7(this, g.m13551J(), new TdApi.Message[]{message2}, null, m16142qi());
                    return;
                }
                final long Q0 = C7321e.m16986Q0(g.m13545M());
                final AbstractC5918j o0Var = new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC7430j1.this.m16166nj(Q0, (TdApi.PhotoSize) obj);
                    }
                };
                switch (C7316a.m17057d(Q0)) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                        this.f30170b.m2480e2().m1627k2(C7316a.m17045p(Q0), new AbstractC5918j() {
                            @Override
                            public final void mo1330a(Object obj) {
                                View$OnClickListenerC7430j1.m16141qj(AbstractC5918j.this, (TdApi.SupergroupFullInfo) obj);
                            }
                        });
                        return;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        this.f30170b.m2480e2().m1737G2(this.f30170b.m2494d4(Q0), new AbstractC5918j() {
                            @Override
                            public final void mo1330a(Object obj) {
                                View$OnClickListenerC7430j1.m16149pj(AbstractC5918j.this, (TdApi.UserFullInfo) obj);
                            }
                        });
                        return;
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        this.f30170b.m2480e2().m1700Q(C7316a.m17048m(Q0), new AbstractC5918j() {
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
                if (g.m13543N() != null) {
                    C7389v0.m16603n2(this, g.m13543N());
                    return;
                }
                return;
            case R.id.btn_saveGif:
                TdApi.File P = g.m13539P();
                if (P != null) {
                    this.f30170b.m2485dd().m3668X7(P.f25376id);
                    return;
                }
                return;
            case R.id.btn_saveToGallery:
                TdApi.File P2 = g.m13539P();
                if (C4779t2.m25587V2(P2)) {
                    String str = P2.local.path;
                    if (!g.m13509e0()) {
                        i2 = g.m13491n0() ? 1 : 0;
                    }
                    C7389v0.m16706N(str, i2);
                    return;
                }
                return;
            case R.id.btn_setProfilePhoto:
                this.f30170b.m2270r4().m14783o(new TdApi.SetProfilePhoto(new TdApi.InputChatPhotoPrevious(g.m13563D())), this.f30170b.m2392ja());
                m16427Hh();
                return;
            case R.id.btn_share:
                if (g.getMessage() != null) {
                    x00Var = new x00(this.f30168a, this.f30170b);
                    if (g.getMessage().content.getConstructor() != 1989037971) {
                        x00Var.m30996Vi(new x00.C3281m(g.getMessage()));
                    } else {
                        String str2 = ((TdApi.MessageText) g.getMessage().content).webPage.displayUrl;
                        x00Var.m30996Vi(new x00.C3281m(g, str2, str2));
                    }
                } else if (g.m13555H() != null) {
                    x00Var = new x00(this.f30168a, this.f30170b);
                    int i4 = this.f23629o0;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            long J = this.f23649s0.m13460g().m13551J();
                            String Q3 = this.f30170b.m2691Q3(J);
                            if (!C5070i.m24062i(Q3)) {
                                if (this.f30170b.m2784K6(J)) {
                                    charSequence = C4403w.m27867j1(R.string.ShareTextChannel, Q3);
                                } else {
                                    charSequence = C4403w.m27867j1(R.string.ShareTextChat, Q3);
                                }
                                String f4 = this.f30170b.m2462f4(J);
                                if (!C5070i.m24062i(f4)) {
                                    charSequence = C4403w.m27867j1(R.string.format_ShareTextSignature, charSequence, this.f30170b.m2637Tc(f4));
                                }
                            }
                        } else if (i4 == 5 && !C7321e.m16965a1(g.m13482s())) {
                            charSequence2 = C4779t2.m25442q5(g.m13482s());
                        }
                        charSequence = charSequence2;
                    } else {
                        long S0 = C7321e.m16982S0(this.f23649s0.m13460g().m13545M());
                        String K2 = this.f30170b.m2480e2().m1721K2(S0);
                        charSequence = !C5070i.m24062i(K2) ? C4403w.m27867j1(R.string.ShareTextProfile, K2) : null;
                        String R2 = this.f30170b.m2480e2().m1694R2(S0);
                        if (!C5070i.m24062i(R2)) {
                            charSequence = C4403w.m27867j1(R.string.format_ShareTextSignature, charSequence, this.f30170b.m2637Tc(R2));
                        }
                    }
                    x00Var.m30996Vi(new x00.C3281m(g, charSequence2, charSequence));
                } else {
                    return;
                }
                x00Var.m30962ej();
                this.f23504J0 = 0;
                m16427Hh();
                return;
            case R.id.btn_showInChat:
                this.f23504J0 = 0;
                AbstractC9323v4<?> F = this.f30168a.m14551P1().m9762F();
                if (!(F instanceof View$OnClickListenerC2971rh) || F.mo9464C9() != g.m13551J()) {
                    this.f30170b.m2485dd().m3469r7(this, g.m13551J(), new C7319d(g.m13551J(), g.mo13512d()), null);
                } else {
                    ((View$OnClickListenerC2971rh) F).m32635Ok(new C7319d(g.m13551J(), g.mo13512d()));
                }
                m16427Hh();
                return;
            default:
                return;
        }
    }

    public final void m16380Ng(ArrayList<C8112b> arrayList, boolean z) {
        if (arrayList != null && !arrayList.isEmpty()) {
            C3940f fVar = this.f23554V2;
            if (fVar == null || !fVar.m29585h()) {
                m16469Ch();
            } else {
                this.f23566Y2.f23748O.m16029d(arrayList, z, this.f23629o0 == 0 && !m9131x9().f23732j);
            }
        }
    }

    public final void m16379Nh(int i) {
        C3950k kVar = this.f23579b4;
        if (kVar == null) {
            this.f23579b4 = new C3950k(19, this, C2057b.f7280b, 180L);
        } else if (!kVar.m29533v()) {
            this.f23579b4.m29543l(0.0f);
            this.f23575a4 = 0.0f;
        } else {
            return;
        }
        if (i != 0) {
            this.f23587d4.m14815o(i);
            this.f23583c4 = i;
            this.f23579b4.m29546i(1.0f);
        }
    }

    public final void m16378Ni() {
    }

    public void m16377Nj() {
        if (!this.f23560X0) {
            m16124sk();
            if (m16160oh()) {
                m16323Uh();
            } else {
                m16427Hh();
            }
        }
    }

    public final void m16376Nk() {
        long w1 = C4868i.m24727c2().m24569w1();
        this.f23576b1 = C5063c.m24134m(w1);
        this.f23580c1 = C5063c.m24133n(w1);
    }

    public final void m16375Nl(boolean z, boolean z2) {
        if (this.f23616l1 != z) {
            this.f23616l1 = z;
            if (this.f23620m1 == null) {
                this.f23620m1 = new C3950k(12, this, C2057b.f7280b, 180L);
            }
            if (z) {
                this.f23505J1.m16044a(z2);
            }
            this.f23620m1.m29546i(z ? 1.0f : 0.0f);
        }
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_white;
    }

    public final boolean m16373Og() {
        C3950k kVar = this.f23499H3;
        return (kVar == null || !kVar.m29533v()) && !this.f23673w4 && m16306Wi();
    }

    public final void m16372Oh() {
        m16339Sh(true, true);
        if (this.f23637p3 != -1 && this.f23566Y2.f23748O != null) {
            int round = Math.round(this.f23637p3 / m16176mh());
            if (m16315Vh(this.f23566Y2.f23748O.m16028e(round), this.f23566Y2.f23748O, round, false)) {
                this.f23594f3 = SystemClock.uptimeMillis();
            }
        }
    }

    public final void m16371Oi(int i) {
        if (i == 1) {
            m16408Jk();
            this.f23541S1.removeViewInLayout(this.f23593f2);
            this.f23480D1.getBaseCell().removeView(this.f23503I3);
        } else if (i == 2) {
            m16416Ik();
            this.f23541S1.removeView(this.f23613k2);
            this.f23475C1.removeView(this.f23551U3);
        } else if (i == 3) {
            C8431f fVar = this.f23643q4;
            if (fVar != null) {
                fVar.m12481u(this);
            }
            this.f23541S1.removeView(this.f23631o2);
            this.f23480D1.getBaseCell().removeView(this.f23653s4);
        } else if (i == 4) {
            m16383Mk();
            this.f23541S1.removeViewInLayout(this.f23601h2);
        }
    }

    public final void m16370Oj(float f, float f2, int i, int i2) {
        this.f23640q1 = this.f23630o1 + f;
        this.f23645r1 = this.f23635p1 + f2;
        m16456Dm(i, i2, false, true);
    }

    public final void m16369Ok(int i) {
        int i2 = this.f23606i3;
        if (i2 != -1) {
            this.f23606i3 = i2 + i;
            if (this.f23558W2.getMeasuredWidth() <= 0) {
                return;
            }
            if (m16208ih()) {
                this.f23570Z2.m39525z2(this.f23606i3, this.f23610j3);
            } else {
                m16339Sh(false, false);
            }
        }
    }

    public final void m16368Ol(float f) {
        if (this.f23625n1 != f) {
            this.f23625n1 = f;
            m16464Cm();
            this.f23505J1.setAlpha(f);
        }
    }

    public final int m16367P0() {
        AbstractC7511x xVar = this.f23639q0;
        if (xVar != null) {
            return xVar.mo11241P0();
        }
        return 0;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        switch (i) {
            case 0:
                int i2 = this.f23669w0;
                if (i2 == 0) {
                    m16139ql(f);
                } else if (i2 == 1) {
                    this.f23480D1.getBaseCell().getDetector().m15857z(f2);
                    this.f23480D1.setRevealFactor(f);
                } else if (i2 == 3) {
                    m16390Ll(f);
                } else if (i2 == 4) {
                    C7450t tVar = this.f23565Y1;
                    if (tVar != null) {
                        tVar.setAlpha(f);
                    }
                    this.f23480D1.setAlpha(f);
                }
                m16221gl(f);
                m16123sl(C5069h.m24090d(f));
                int i3 = this.f23629o0;
                if (i3 != 0) {
                    if (i3 == 3) {
                        m16147pl(Math.max(0.0f, Math.min(1.0f, f)));
                        return;
                    } else if (i3 != 5) {
                        return;
                    }
                }
                m16279Zk(C5069h.m24090d(f));
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
                this.f23480D1.getBaseReceiver().setAlpha(1.0f - f);
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
        C3940f fVar = this.f23574a3;
        if (fVar == null || !fVar.m29585h()) {
            return true;
        }
        if (z) {
            this.f23558W2.m39499D1();
            m16253cm(false);
        }
        return false;
    }

    public final boolean m16363Ph() {
        return false;
    }

    public final int m16362Pi() {
        return this.f23475C1.indexOfChild(this.f23480D1) + 1;
    }

    public final boolean m16361Pj() {
        int i = this.f23629o0;
        return i == 0 || i == 5 || i == 2 || i == 1;
    }

    public final void m16360Pk() {
        C8112b g;
        if (this.f23480D1.m16526a2() && this.f23480D1.m16523f2() && (g = this.f23649s0.m13460g()) != null) {
            if (!g.m13491n0()) {
                m16379Nh(-90);
            } else if (!C4183a.f14089g) {
                C1379j0.m37313p0(18);
            } else {
                C3950k kVar = this.f23623m4;
                if (kVar == null) {
                    this.f23623m4 = new C3950k(18, this, C2057b.f7280b, 180L);
                } else if (kVar.m29533v()) {
                    return;
                }
                RunnableC7470o baseCell = this.f23480D1.getBaseCell();
                g.m13475v0();
                baseCell.m15926d0(true);
                if (this.f23687z3 == 4) {
                    m16438Fm();
                }
            }
        }
    }

    public final void m16359Pl(float f) {
        float f2 = this.f23655t1;
        this.f23640q1 = f2 + ((this.f23665v1 - f2) * f);
        float f3 = this.f23660u1;
        this.f23645r1 = f3 + ((this.f23670w1 - f3) * f);
        m16456Dm(this.f23480D1.getMeasuredWidth(), this.f23480D1.getMeasuredHeight(), false, false);
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_white;
    }

    public boolean m16356Qg() {
        return (this.f23629o0 == 3 && this.f23687z3 == 3 && this.f23663u4 != 100) ? false : true;
    }

    public final void m16355Qh(float f, float f2) {
        m16351Ql(false, f, f2);
    }

    public final void m16354Qi() {
        View$OnClickListenerC9170d1 d1Var = this.f23589e2;
        if (d1Var != null) {
            if (this.f23669w0 == 1) {
                d1Var.setTranslationY(-View$OnClickListenerC9170d1.m10065c3(d1Var.m10024w3()));
            } else {
                d1Var.setAlpha(0.0f);
            }
            m16115tl(0.0f);
        }
    }

    public final boolean m16353Qj() {
        if (this.f23649s0.m13458i() <= 1) {
            return false;
        }
        int i = this.f23629o0;
        if (i == 1 || i == 2 || m9131x9().f23732j) {
            return true;
        }
        if (this.f23629o0 != 0) {
            return false;
        }
        C8112b g = this.f23649s0.m13460g();
        C8112b m = this.f23649s0.m13454m();
        C8112b l = this.f23649s0.m13455l();
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
        C4868i.m24727c2().m24604r5(this.f23576b1, this.f23580c1);
    }

    public final void m16351Ql(boolean z, float f, float f2) {
        if (this.f23608j1 != z) {
            this.f23608j1 = z;
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
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23484E0;
        return this.f23549U1.getMeasuredHeight() + ((z0Var == null || z0Var.getVisibility() != 0 || this.f23484E0.getParent() == null) ? 0 : this.f23484E0.getMeasuredHeight());
    }

    @Override
    public int mo407R9() {
        return R.id.controller_mediaView;
    }

    @Override
    public boolean mo9350Rd() {
        return this.f23629o0 == 4 || !this.f23649s0.m13460g().m13504h();
    }

    public final void m16348Rg(float f) {
        if (this.f23528P0 == null) {
            this.f23528P0 = new C3950k(6, this, C2057b.f7280b, 150L, this.f23524O0);
        }
        this.f23528P0.m29546i(f);
    }

    public final void m16347Rh(float f, float f2, boolean z) {
        this.f23490F2 = false;
        this.f23514L2 = this.f23498H2;
        this.f23518M2 = this.f23502I2;
        this.f23522N2 = this.f23480D1.getRotation();
        this.f23526O2 = this.f23506J2;
        if (this.f23514L2 != 0.0f || this.f23518M2 != 0.0f) {
            C3950k kVar = this.f23542S2;
            if (kVar == null) {
                this.f23542S2 = new C3950k(15, this, C2057b.f7280b, 280L);
            } else {
                kVar.m29543l(0.0f);
            }
            if (z) {
                double atan2 = Math.atan2(f2, f);
                float measuredWidth = this.f23480D1.getMeasuredWidth();
                float measuredHeight = this.f23480D1.getMeasuredHeight();
                Math.min(measuredWidth / this.f23494G2.m13519Z(), measuredHeight / this.f23494G2.m13569A());
                double cos = Math.cos(atan2);
                double sin = Math.sin(atan2);
                double d = measuredWidth;
                this.f23530P2 = (float) (cos * d);
                double d2 = measuredHeight;
                this.f23534Q2 = (float) (sin * d2);
                float f3 = this.f23522N2 * 1.5f;
                this.f23538R2 = f3;
                this.f23530P2 += Math.abs(measuredWidth - ((float) (Math.abs(Math.sin(f3) * d) + Math.abs(Math.cos(this.f23538R2) * d2)))) * Math.signum(this.f23530P2);
                this.f23534Q2 += Math.abs(measuredHeight - ((float) (Math.abs(d * Math.cos(this.f23538R2)) + Math.abs(d2 * Math.sin(this.f23538R2))))) * Math.signum(this.f23534Q2);
            } else {
                this.f23538R2 = 0.0f;
                this.f23534Q2 = 0.0f;
                this.f23530P2 = 0.0f;
            }
            this.f23542S2.m29546i(1.0f);
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
        return Build.VERSION.SDK_INT >= 18 && this.f23629o0 == 3;
    }

    public final boolean m16344Rk(int i) {
        int i2 = this.f23687z3;
        if (i2 != 1) {
            if (i2 == 2) {
                if (!this.f23587d4.m14818l()) {
                    m16320Uk();
                }
                this.f23649s0.m13460g().m13469y0(this.f23587d4);
                return false;
            } else if (i2 == 3) {
                if (!this.f23643q4.m12493i()) {
                    m16320Uk();
                }
                if (!this.f23649s0.m13460g().m13560E0(this.f23643q4, true)) {
                    return false;
                }
                this.f23480D1.getBaseReceiver().invalidate();
                return false;
            } else if (i2 != 4) {
                return false;
            } else {
                C4868i.m24727c2().m24580u5(this.f23473B4);
                return false;
            }
        } else if (this.f23519M3.m13574k()) {
            C6252k y = this.f23649s0.m13460g().m13470y();
            if (y != null) {
                this.f30170b.m2429h5().m23072y0(y.mo20876q());
            }
            this.f23649s0.m13460g().m13568A0(null);
            m16283Zg(this.f23515L3, this.f23511K3);
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
            this.f23480D1.setTranslationZ(C1357a0.m37544i(1.0f) + (C1357a0.m37544i(2.0f) * f));
        }
    }

    public final void m16340Sg(float f) {
        if (this.f23671w2 == null) {
            this.f23671w2 = new C3950k(1, this, new OvershootInterpolator(3.8f), 260L, this.f23666v2);
        }
        this.f23671w2.m29546i(f);
    }

    public final void m16339Sh(boolean z, boolean z2) {
        if (this.f23558W2.getMeasuredWidth() > 0) {
            m16331Th(z, z2, this.f23566Y2.f23748O.m16023j());
        }
    }

    public final void m16338Si() {
        if (this.f23558W2 == null) {
            this.f23562X2 = new C8731d(C2057b.f7280b, 140L);
            this.f23566Y2 = new C7451u(mo4347s(), this);
            this.f23570Z2 = new LinearLayoutManager(mo4347s(), 0, C4403w.m27986G2());
            RunnableC7454x xVar = new RunnableC7454x(mo4347s());
            this.f23558W2 = xVar;
            xVar.m39425k(new C7440j());
            this.f23558W2.setOverScrollMode(2);
            this.f23558W2.m16009I1(this);
            this.f23558W2.m39437g(new C7452v(this.f23566Y2));
            this.f23558W2.setItemAnimator(null);
            this.f23558W2.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
            this.f23558W2.setLayoutManager(this.f23570Z2);
            this.f23558W2.setAdapter(this.f23566Y2);
            this.f23558W2.setAlpha(0.0f);
            this.f23558W2.setLayoutParams(FrameLayoutFix.m18007t1(-1, (C1357a0.m37544i(9.0f) * 2) + C1357a0.m37544i(43.0f), 80));
            if (Build.VERSION.SDK_INT >= 21) {
                this.f23558W2.setElevation(C1357a0.m37544i(3.0f));
            }
            m16069zh();
            this.f23475C1.addView(this.f23558W2);
        }
    }

    public final void m16337Sj(float r29, float r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16337Sj(float, float, boolean):void");
    }

    public final void m16336Sk() {
        int X1 = this.f23570Z2.m39552X1();
        this.f23606i3 = X1;
        View C = this.f23570Z2.mo39265C(X1);
        this.f23610j3 = C != null ? this.f23570Z2.m39240Q(C) : 0;
    }

    public final void m16335Sl(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16335Sl(float, float):void");
    }

    @Override
    public void mo15973T3(boolean z) {
        this.f23555V3.m14836u(z ? 2 : 0, false);
    }

    public final void m16332Tg(float f) {
        if (this.f23540S0 == null) {
            this.f23540S0 = new C3950k(7, this, C2057b.f7280b, 150L, this.f23536R0);
        }
        this.f23540S0.m29546i(f);
    }

    public final void m16331Th(boolean z, boolean z2, int i) {
        int i2;
        int i3;
        int X1 = this.f23570Z2.m39552X1();
        int i4 = -1;
        View C = X1 != -1 ? this.f23570Z2.mo39265C(X1) : null;
        if (C != null) {
            i2 = C4403w.m27986G2() ? this.f23558W2.getMeasuredWidth() - this.f23570Z2.m39235T(C) : this.f23570Z2.m39240Q(C);
        } else {
            i2 = 0;
        }
        int mh = m16176mh();
        int measuredWidth = (this.f23558W2.getMeasuredWidth() / 2) - (mh / 2);
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
            int m = this.f23566Y2.f23748O.m16020m();
            if (m != -1) {
                float g = this.f23566Y2.f23748O.m16026g();
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
                    this.f23647r3 = i6 - i3;
                } else {
                    RunnableC7454x xVar = this.f23558W2;
                    int i7 = i6 - i3;
                    if (!C4403w.m27986G2()) {
                        i4 = 1;
                    }
                    xVar.scrollBy(i7 * i4, 0);
                }
                i4 = i6;
            } else if (!z2) {
                this.f23570Z2.m39525z2(i, i5);
            } else {
                this.f23647r3 = 0;
            }
        }
        if (z2) {
            this.f23637p3 = i3;
            this.f23642q3 = i4;
        }
    }

    public final boolean m16330Ti() {
        C3950k kVar = this.f23614k3;
        return kVar != null && kVar.m29533v();
    }

    public final C7856c m16329Tj(boolean z) {
        C7856c v = this.f23649s0.m13460g().m13476v();
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
            this.f23688z4 = 1.0f - f;
            m16480Am();
            this.f23545T1.setAlpha(f);
            C7489q1 q1Var = this.f23561X1;
            if (q1Var != null) {
                q1Var.setAlpha(f);
            }
        } else if (i == 1) {
            this.f23593f2.setAlpha(C5069h.m24090d(f));
            this.f23593f2.setTranslationY(m16093wi(1) * (1.0f - f));
        } else if (i == 2) {
            this.f23613k2.setAlpha(f);
            this.f23480D1.getBaseCell().getImageReceiver().m20815L(1.0f - f);
        } else if (i == 3) {
            this.f23631o2.setAlpha(f);
        } else if (i == 4) {
            this.f23601h2.setAlpha(C5069h.m24090d(f));
            this.f23601h2.setTranslationY(m16093wi(4) * (1.0f - f));
        }
    }

    @Override
    public void mo15839U0(C7484p1 p1Var, float f) {
    }

    @Override
    public void mo15891U4(C8112b bVar, float f) {
        C7489q1 q1Var;
        if (this.f23649s0.m13460g() == bVar && (q1Var = this.f23561X1) != null) {
            q1Var.m15825J1(f);
        }
    }

    public final void m16324Ug(float f) {
        if (this.f23667v3 == null) {
            this.f23667v3 = new C3950k(2, this, C2057b.f7280b, 180L, this.f23672w3);
        }
        this.f23667v3.m29546i(f);
    }

    public final void m16323Uh() {
        if (this.f23480D1.m16523f2()) {
            m16473Bl(true);
        }
    }

    public final boolean m16322Ui() {
        return this.f23679y0;
    }

    public final C8431f m16321Uj(boolean z) {
        C8431f C = this.f23649s0.m13460g().m13565C();
        return (C != null || !z) ? C : new C8431f();
    }

    public final void m16320Uk() {
        if (this.f23639q0 != null && !this.f23569Z1.m18808n()) {
            m16448El(this.f23569Z1.m18800v(), false);
        }
    }

    public final void m16319Ul(ArrayList<C6246h> arrayList) {
        if (this.f23677x3 == null) {
            C7503u uVar = new C7503u(mo4347s(), this);
            this.f23682y3 = uVar;
            uVar.m15761h0(arrayList);
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(112.0f) + View$OnClickListenerC9170d1.getTopOffset(), 48);
            C7506v vVar = new C7506v(mo4347s());
            this.f23677x3 = vVar;
            vVar.setPadding(C1357a0.m37544i(2.0f), View$OnClickListenerC9170d1.getTopOffset(), C1357a0.m37544i(2.0f), 0);
            this.f23677x3.setLayoutManager(new LinearLayoutManager(mo4347s(), 0, true));
            this.f23677x3.setHasFixedSize(true);
            this.f23677x3.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
            this.f23677x3.setClipToPadding(false);
            this.f23677x3.setBackgroundColor(C11524j.m228N(R.id.theme_color_transparentEditor));
            this.f23677x3.setOverScrollMode(2);
            this.f23677x3.m39437g(new C7434d());
            this.f23677x3.setAlpha(0.0f);
            this.f23677x3.setAdapter(this.f23682y3);
            this.f23677x3.setLayoutParams(t1);
            this.f23475C1.addView(this.f23677x3);
            return;
        }
        this.f23682y3.m15761h0(arrayList);
    }

    public final void m16316Vg(float f) {
        if (this.f23470B1 == null) {
            this.f23470B1 = new C3950k(10, this, C2057b.f7280b, 180L, this.f23465A1);
        }
        this.f23470B1.m29546i(f);
    }

    public final boolean m16315Vh(C8112b bVar, C7453w wVar, int i, boolean z) {
        C7401b0 b0Var;
        if (bVar == null || wVar == null || i == -1 || (b0Var = this.f23480D1) == null || b0Var.m16525b2()) {
            return false;
        }
        boolean z2 = wVar.m16023j() != i;
        if (z2 && z) {
            wVar.m16012u();
            wVar.m16016q(bVar, i, wVar.f23757h);
        } else if (wVar.m16017p(i, -1, wVar.f23757h)) {
            this.f23558W2.invalidate();
        }
        if (z2) {
            this.f23480D1.getBaseCell().m15954H0(bVar, true, C1357a0.m37544i(43.0f) + (C1357a0.m37544i(9.0f) * 2), z ? 1.0f : m16076yi());
            this.f23649s0.m13463d(wVar.f23752c + i);
        }
        if (z) {
            float f = wVar.f23757h;
            wVar.f23757h = 1.0f;
            m16339Sh(true, true);
            wVar.f23757h = f;
            m16119th();
            this.f23558W2.m39499D1();
            if (this.f23647r3 == 0) {
                m16339Sh(true, false);
                this.f23558W2.invalidate();
            } else {
                this.f23627n3 = wVar;
                this.f23632o3 = wVar.f23757h;
                this.f23618l3 = this.f23647r3;
                this.f23622m3 = 0;
                if (this.f23614k3 == null) {
                    this.f23614k3 = new C3950k(23, this, C2057b.f7280b, 180L);
                }
                this.f23614k3.m29546i(1.0f);
            }
        }
        return z2;
    }

    public final boolean m16314Vi() {
        AbstractC7511x xVar = this.f23639q0;
        return xVar != null && xVar.mo11197v1(this.f23649s0.m13459h(), this.f23649s0.m13460g());
    }

    public final void m16313Vj() {
    }

    public void m16312Vk(final boolean z, TdApi.MessageSchedulingState messageSchedulingState, final boolean z2, final boolean z3) {
        if (this.f23644r0 != null) {
            if (messageSchedulingState != null || !m9131x9().f23737o) {
                this.f23504J0 = 0;
                this.f23483D4 = true;
                AbstractC7511x xVar = this.f23639q0;
                ArrayList<C6246h> J0 = xVar != null ? xVar.mo11249J0(true) : null;
                if (J0 == null) {
                    J0 = new ArrayList<>();
                    J0.add(this.f23649s0.m13460g().m13549K());
                } else if (J0.isEmpty()) {
                    J0.add(this.f23649s0.m13460g().m13549K());
                }
                this.f23644r0.mo11246L6(J0, new TdApi.MessageSendOptions(z, false, false, messageSchedulingState), z2, z3);
                m16245dm(true);
                this.f23471B2.m18408y2(true);
                return;
            }
            this.f30170b.m2485dd().m3787L8(this, mo16269b(), false, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z4, TdApi.MessageSchedulingState messageSchedulingState2, boolean z5) {
                    View$OnClickListenerC7430j1.this.m16483Aj(z, z2, z3, z4, messageSchedulingState2, z5);
                }
            }, m16142qi());
        }
    }

    public final void m16311Vl(boolean z) {
        AbstractC7511x xVar;
        if (this.f23662u3 != z) {
            this.f23662u3 = z;
            if (z && (xVar = this.f23639q0) != null) {
                ArrayList<C6246h> J0 = xVar.mo11249J0(true);
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
        this.f23464A0.m7554W1(this, arrayList, null);
    }

    @Override
    public int mo418W9() {
        return R.id.menu_photo;
    }

    public final void m16308Wg(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.f23612k1 == null) {
                this.f23612k1 = new C3950k(9, this, C2057b.f7280b, 180L);
            }
            this.f23612k1.m29546i(z ? 1.0f : 0.0f);
        }
    }

    public final void m16307Wh(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16307Wh(int):void");
    }

    public final boolean m16306Wi() {
        C8112b g = this.f23649s0.m13460g();
        return g != null && (g.m13549K() == null || g.m13549K().m20846c1());
    }

    public final void m16305Wj() {
        m16411Jh();
    }

    public final void m16304Wk(int i, boolean z) {
        this.f23480D1.setDisableAnimations(z);
        this.f23669w0 = i;
        long j = 0;
        if (i == 0) {
            this.f23664v0.m29559B(C2057b.f7280b);
            C3950k kVar = this.f23664v0;
            if (this.f23629o0 != 4 && !this.f23546T2) {
                j = 180;
            }
            kVar.m29530y(j);
        } else if (i != 1) {
            if (i == 3) {
                this.f23664v0.m29559B(C2057b.f7280b);
                this.f23664v0.m29530y(190L);
            } else if (i == 4) {
                this.f23664v0.m29559B(C2057b.f7280b);
                this.f23664v0.m29530y(220L);
            } else if (i == 5) {
                this.f23664v0.m29559B(C2057b.f7283e);
                this.f23664v0.m29530y(0L);
            }
        } else if ((this.f23629o0 == 3 || z) && !this.f23679y0) {
            this.f23664v0.m29559B(C2057b.f7280b);
            this.f23664v0.m29530y(180L);
        } else {
            this.f23664v0.m29559B(C2057b.f7280b);
            this.f23664v0.m29530y(180L);
        }
    }

    public final void m16303Wl(float f, float f2, float f3, boolean z, boolean z2) {
        this.f23498H2 = f;
        this.f23502I2 = f2;
        this.f23506J2 = f3;
        float abs = Math.abs(Math.min(1.0f, f2 / C1357a0.m37544i(125.0f)));
        if (Float.isNaN(abs)) {
            abs = 0.0f;
        }
        if (z || abs > this.f23510K2 || z2) {
            m16295Xl(abs);
        }
        this.f23480D1.setTranslationX(f);
        this.f23480D1.setTranslationY(f2);
        if (!z) {
            if (f3 == 0.0f || f2 == 0.0f) {
                this.f23480D1.setRotation(0.0f);
            } else {
                this.f23480D1.setRotation(m16184lh(f, f2, f3));
            }
        }
    }

    public final void m16300Xg(float f) {
        if (this.f23686z2 == null) {
            this.f23686z2 = new C3950k(5, this, C2057b.f7280b, 150L, this.f23681y2);
        }
        this.f23686z2.m29546i(f);
    }

    public final void m16299Xh() {
        int i;
        int i2;
        ArrayList arrayList;
        if (this.f23649s0.m13458i() > 1) {
            C8112b g = this.f23649s0.m13460g();
            int i3 = this.f23629o0;
            if (i3 == 1 || i3 == 2 || m9131x9().f23732j) {
                arrayList = new ArrayList(this.f23649s0.m13458i());
                arrayList.addAll(this.f23649s0.m13461f());
                i = this.f23649s0.m13459h();
                i2 = 0;
            } else if (this.f23629o0 == 0) {
                arrayList = new ArrayList(10);
                long j = this.f23649s0.m13460g().getMessage().mediaAlbumId;
                if (j != 0) {
                    i2 = this.f23649s0.m13459h();
                    while (true) {
                        int i4 = i2 - 1;
                        if (i4 < 0 || this.f23649s0.m13462e(i4).getMessage().mediaAlbumId != j) {
                            break;
                        }
                        i2--;
                    }
                    int i5 = this.f23649s0.m13458i();
                    i = -1;
                    for (int i6 = i2; i6 < i5; i6++) {
                        C8112b e = this.f23649s0.m13462e(i6);
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
                C7453w wVar = new C7453w(this.f23566Y2, arrayList, i2);
                wVar.m16016q(g, i, 1.0f);
                this.f23566Y2.m16033h0(wVar);
                m16339Sh(false, false);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean m16298Xi() {
        return this.f23488F0;
    }

    public final void m16297Xj() {
        if (this.f23567Y3 != -1) {
            if (this.f23615k4) {
                m16288Yj();
            }
            this.f23571Z3 = true;
            m16085xh(this.f23567Y3);
            this.f23567Y3 = -1;
        }
    }

    public void m16296Xk(C7448r rVar) {
        super.m9476Ad(rVar);
        this.f23629o0 = rVar.f23724b;
        this.f23634p0 = rVar.f23725c;
        this.f23639q0 = rVar.f23726d;
        this.f23644r0 = rVar.f23727e;
        this.f23649s0 = rVar.f23728f;
        this.f23624n0 = rVar.f23734l;
        this.f23654t0 = rVar.f23739q;
        this.f23659u0 = rVar.f23736n;
    }

    public final void m16295Xl(float f) {
        if (this.f23510K2 != f) {
            this.f23510K2 = f;
            m16221gl(1.0f - f);
            View$OnClickListenerC9170d1 d1Var = this.f23589e2;
            if (d1Var != null) {
                d1Var.setTranslationY((-View$OnClickListenerC9170d1.m10065c3(d1Var.m10024w3())) * this.f23510K2);
            }
            if (this.f23629o0 == 3) {
                m16147pl(1.0f - this.f23510K2);
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
                        if (this.f23534Q2 != 0.0f || this.f23530P2 != 0.0f) {
                            m16216hh();
                        }
                    }
                } else if (f == 0.0f) {
                    m16254cl("", null);
                }
            } else if (f == 0.0f) {
                this.f23682y3.m15761h0(null);
            }
        } else if (f == 0.0f) {
            m16220gm();
            this.f23471B2.m18441G2();
            m16131rl(false);
            if (this.f23629o0 == 4 && this.f23669w0 == 4) {
                m16457Dl(false);
            }
            m16280Zj();
        } else if (f == 1.0f) {
            this.f23471B2.mo18440H2();
            this.f23480D1.setDisableAnimations(false);
            this.f23480D1.m16541J1(false);
            if (this.f23629o0 == 4) {
                final C8112b g = this.f23649s0.m13460g();
                C1379j0.m37335e0(new Runnable() {
                    @Override
                    public final void run() {
                        C8112b.this.m13520Y0();
                    }
                }, 20L);
            }
            if (m16143qh() != 0 && C4868i.m24727c2().m24764X2(4096L)) {
                C4868i.m24727c2().m24568w2(4096L);
                mo4347s().m14584H3().m8985g(this.f23513L1).m8960g(mo4347s().m14584H3().m8979m(m16142qi())).m8948u(C7512x0.f24031a).m8958i(this).m8972C(this.f30170b, R.string.HoldToSendAsFile).m8919F();
            }
        }
    }

    public final boolean m16294Y3() {
        AbstractC7511x xVar = this.f23639q0;
        if (xVar == null) {
            return false;
        }
        ArrayList<C6246h> J0 = xVar.mo11249J0(false);
        if (J0 != null) {
            Iterator<C6246h> it = J0.iterator();
            while (it.hasNext()) {
                C6246h next = it.next();
                if ((next instanceof C6253l) && ((C6253l) next).m20872D0()) {
                    return true;
                }
            }
            return false;
        } else if (this.f23649s0.m13460g().m13549K().m20872D0()) {
            return true;
        } else {
            return this.f23639q0.mo11226Y3();
        }
    }

    @Override
    public boolean mo15972Y4() {
        C3950k kVar = this.f23499H3;
        return (kVar == null || !kVar.m29533v()) && this.f23547T3 && this.f23555V3.m14853d();
    }

    @Override
    public void mo15971Y5(float f) {
        this.f23587d4.m14813q(f);
        this.f23559W3.setDegreesAroundCenter(f);
    }

    public final void m16291Yg(boolean z) {
        if (z) {
            this.f23480D1.setVisibility(4);
        } else {
            m16297Xj();
        }
    }

    public void m16290Yh(boolean z) {
        this.f23684z0 = z;
        this.f23504J0 = 5;
        this.f23679y0 = true;
    }

    public boolean m16289Yi() {
        return this.f23679y0;
    }

    public final void m16288Yj() {
        this.f23611j4 = false;
        this.f23615k4 = false;
        m16266bh();
        if (this.f23619l4) {
            this.f23619l4 = false;
            m16481Al(false);
        }
    }

    public final void m16287Yk(float f) {
        int i = (int) (this.f23618l3 * f);
        int i2 = i - this.f23622m3;
        if (i != 0) {
            this.f23622m3 = i;
            this.f23558W2.scrollBy(i2 * (C4403w.m27986G2() ? -1 : 1), 0);
        }
        float f2 = this.f23632o3;
        float f3 = f2 + ((1.0f - f2) * f);
        if (this.f23627n3.f23757h != f3) {
            this.f23627n3.f23757h = f3;
            this.f23558W2.invalidate();
        }
    }

    public final void m16286Yl(float f) {
        float f2 = this.f23514L2;
        float f3 = f2 + ((this.f23530P2 - f2) * f);
        float f4 = this.f23518M2;
        float f5 = f4 + ((this.f23534Q2 - f4) * f);
        boolean z = this.f23538R2 != -1.0f;
        m16303Wl(f3, f5, this.f23526O2, z, false);
        if (z) {
            C7401b0 b0Var = this.f23480D1;
            float f6 = this.f23522N2;
            b0Var.setRotation(f6 + ((this.f23538R2 - f6) * f));
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (!this.f23483D4 && m9139w9() != null && m9131x9().f23738p && this.f23649s0 != null) {
            for (int i = 0; i < this.f23649s0.m13458i(); i++) {
                C8112b e = this.f23649s0.m13462e(i);
                if (e.m13549K().m20847b1()) {
                    e.m13492n();
                }
            }
        }
        RunnableC7454x xVar = this.f23558W2;
        if (xVar != null) {
            C1399s0.m37165q(xVar);
        }
        C11052v1.m1768b().m1766d(this);
        C7401b0 b0Var = this.f23480D1;
        if (b0Var != null) {
            b0Var.m16528Z();
        }
        C7450t tVar = this.f23565Y1;
        if (tVar != null) {
            tVar.m16042b();
        }
        this.f30170b.m2930B4().m4713c0().m4614A0(this);
        this.f30168a.m14437t2(this, true);
    }

    public final void m16283Zg(C6246h hVar, Bitmap bitmap) {
        this.f23523N3.m20817J(hVar, bitmap, true);
    }

    public final void m16282Zh(float f) {
        C3950k kVar = this.f23528P0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        m16246dl(f);
    }

    public boolean m16281Zi() {
        return this.f23516M0 == 1.0f;
    }

    public final void m16280Zj() {
    }

    public final void m16279Zk(float f) {
        if (m16451Ei() || this.f23629o0 == 3) {
            this.f23545T1.setAlpha(this.f23536R0 * f * (1.0f - this.f23568Z0));
        }
        C7489q1 q1Var = this.f23561X1;
        if (q1Var != null) {
            q1Var.setAlpha(this.f23536R0 * f * (1.0f - this.f23568Z0));
        }
        RunnableC7454x xVar = this.f23558W2;
        if (xVar != null) {
            xVar.setAlpha(f * this.f23536R0 * (1.0f - this.f23568Z0));
        }
    }

    public final void m16278Zl(C6246h hVar, C6253l lVar, Bitmap bitmap) {
        m16443Fh();
        this.f23507J3 = lVar;
        this.f23515L3 = hVar;
        this.f23511K3 = bitmap;
        if (lVar != null && bitmap != null) {
            C6244g.m20961k().m20970b(hVar, bitmap);
        }
    }

    @Override
    public void mo15757a6(int i, int i2, C8112b bVar, boolean z) {
        int i3 = this.f23629o0;
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                m16263bk(z);
                m16417Ij();
                return;
            } else if (i3 == 3) {
                C6840b0 b0Var = this.f23569Z1;
                AbstractC7511x xVar = this.f23639q0;
                b0Var.setChecked(xVar != null && xVar.mo11197v1(i, bVar));
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
        this.f23503I3.m12820m(new AbstractC8323a() {
            @Override
            public final void mo12881a(Bitmap bitmap) {
                View$OnClickListenerC7430j1.this.m16264bj(i, bitmap);
            }
        });
    }

    public void m16274ai() {
        if (this.f23560X0) {
            m16386Mh();
        } else {
            this.f23471B2.m18408y2(true);
        }
    }

    public boolean m16273aj() {
        return this.f23483D4;
    }

    public void m16272ak(C7401b0 b0Var, float f, float f2) {
        boolean z = false;
        if (this.f23560X0) {
            m16473Bl(false);
            C2065g.m35722c(this.f23475C1);
        } else if (this.f23629o0 != 3 || this.f23687z3 == 0) {
            if (this.f23649s0.m13460g().m13483r0(b0Var, f, f2) || m16155om()) {
                z = true;
            }
            if (!z && this.f23629o0 == 3) {
                z = m16163nm();
            }
            if (z) {
                C2065g.m35722c(b0Var);
            }
        }
    }

    public final void m16271al(int i, boolean z) {
        if (i == R.id.btn_adjust) {
            this.f23533Q1.m16491i(z, true);
        } else if (i == R.id.btn_crop) {
            this.f23525O1.m16491i(z, true);
        } else if (i == R.id.btn_paint) {
            this.f23529P1.m16491i(z, true);
        }
    }

    public final void m16270am(float f) {
        if (this.f23550U2 != f) {
            this.f23550U2 = f;
            m16077yh();
            m16069zh();
            m16461Dh();
            m16414Im();
        }
    }

    @Override
    public long mo16269b() {
        AbstractC7511x xVar = this.f23639q0;
        if (xVar != null) {
            return xVar.mo11220b();
        }
        return 0L;
    }

    @Override
    public void mo7924b5(C9639r rVar, View view) {
        this.f23475C1.removeView(view);
    }

    public final void m16266bh() {
        if (this.f23583c4 != 0) {
            this.f23559W3.setBaseRotation(0.0f);
            this.f23559W3.m14808d(1.0f, 1.0f);
            this.f23559W3.m14809c(this.f23583c4);
            this.f23555V3.setRotation(0.0f);
            this.f23555V3.setScaleX(1.0f);
            this.f23555V3.setScaleY(1.0f);
            this.f23555V3.m14840q(this.f23583c4);
            m16399Kk(2);
            this.f23583c4 = 0;
        }
    }

    public final void m16265bi() {
        if (this.f23488F0) {
            m16440Fk();
            this.f23488F0 = false;
            this.f23553V1.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
            m16081xl();
        }
    }

    public final void m16263bk(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16263bk(boolean):void");
    }

    public final void m16262bl(boolean z) {
        if (this.f23668v4 != z) {
            this.f23668v4 = z;
            this.f23651s2.setAlpha(z ? 1.0f : 0.4f);
            this.f23651s2.setEnabled(z);
        }
    }

    public final void m16261bm(float f) {
        if (this.f23602h3 != f) {
            this.f23602h3 = f;
            if (this.f23578b3) {
                float f2 = this.f23582c3;
                int i = (int) (((f2 - f) / f2) * this.f23586d3);
                int i2 = i - this.f23590e3;
                if (i2 != 0) {
                    this.f23590e3 = i;
                    this.f23558W2.scrollBy(i2, 0);
                }
            }
            this.f23558W2.invalidate();
        }
    }

    public final void m16258ch(boolean z) {
    }

    public final void m16257ci(float f) {
        C3950k kVar = this.f23671w2;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        this.f23666v2 = -1.0f;
        m16196jl(f);
    }

    public void m16255ck() {
        if (this.f23629o0 == 3 && this.f23687z3 == 3) {
            this.f23653s4.getContentWrap().m12807D1();
        }
    }

    public final void m16254cl(String str, AbstractC5411l0[] l0VarArr) {
        View view = this.f23549U1;
        if (view instanceof TextView) {
            ((TextView) view).setText(C5078d.m23987z().m24025I(str));
        } else if (view instanceof C6973n0) {
            ((C6973n0) view).m18246y(str, l0VarArr, false);
        }
    }

    public final void m16253cm(boolean z) {
        int i;
        C3940f fVar = this.f23574a3;
        boolean z2 = fVar != null && fVar.m29585h();
        boolean z3 = z && !m16330Ti();
        if (z2 != z3) {
            if (this.f23574a3 == null) {
                this.f23574a3 = new C3940f(22, this, C2057b.f7280b, 140L);
            }
            this.f23578b3 = false;
            if (!z3) {
                this.f23594f3 = 0L;
                float g = this.f23574a3.m29586g();
                m16339Sh(true, true);
                if (g == 0.0f || (i = this.f23647r3) == 0) {
                    m16339Sh(true, false);
                } else if (i != 0) {
                    this.f23578b3 = true;
                    this.f23582c3 = g;
                    this.f23586d3 = i;
                    this.f23590e3 = 0;
                }
            } else {
                m16119th();
                this.f23558W2.m16010H1();
            }
            this.f23574a3.m29577p(z3, true);
        }
    }

    @Override
    public void mo11141d0() {
        this.f23664v0 = new C3950k(0, this, C2057b.f7280b, 180L);
        m16457Dl(true);
        m16313Vj();
        C7462l1 oi = m16159oi();
        if (oi == null || this.f23684z0) {
            this.f23674x0 = null;
            if (this.f23679y0 || this.f23684z0) {
                m16304Wk(5, true);
            } else {
                m16304Wk(0, true);
                this.f23480D1.setAlpha(0.0f);
            }
        } else {
            this.f23674x0 = oi;
            m16304Wk(1, true);
            this.f23480D1.m16512v2(oi, 0.0f);
            m16401Ki();
            if (this.f23629o0 == 3) {
                m16147pl(0.0f);
            }
        }
        m16354Qi();
    }

    public final void m16250dh(int i) {
        C8328e eVar = this.f23653s4;
        if (eVar != null) {
            eVar.setPaintingMode(i);
        }
    }

    public final void m16249di(float f) {
        C3950k kVar = this.f23470B1;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        m16407Jl(f);
    }

    public void m16247dk() {
        get();
        this.f23471B2.m18433P2(this.f23475C1, this);
    }

    public final void m16246dl(float f) {
        if (this.f23524O0 != f) {
            this.f23524O0 = f;
            this.f23545T1.setAlpha(f * this.f23536R0);
        }
    }

    public void m16245dm(boolean z) {
        this.f23673w4 = z;
    }

    public final void m16242eh() {
        float f = this.f23568Z0;
        if (f == 0.0f) {
            mo4347s().m14566L1(this.f23471B2);
            m16131rl(true);
            m16457Dl(true);
            this.f23572a1 = null;
        } else if (f == 1.0f) {
            m16131rl(false);
            m16457Dl(false);
            m16164nl(false);
        }
    }

    public final void m16241ei(float f) {
        C3950k kVar = this.f23686z2;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        m16237em(f);
    }

    public final void m16239ek() {
        if (this.f23687z3 != 2) {
            m16094wh(2, 1);
        }
    }

    public final void m16238el(boolean z, boolean z2) {
        if (this.f23520N0 != z) {
            this.f23520N0 = z;
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
        if (this.f23681y2 != f) {
            this.f23681y2 = f;
            m16077yh();
            C7489q1 q1Var = this.f23561X1;
            if (q1Var != null) {
                q1Var.setInnerAlpha(f);
            }
        }
    }

    @Override
    public void mo15890f1(C8112b bVar, boolean z) {
        if (this.f23561X1 != null && this.f23649s0.m13460g() == bVar) {
            this.f23561X1.m15829E1(z, true);
            m16447Em(z);
            this.f23561X1.m15827G1(true, true);
        }
    }

    public final void m16234fh() {
        this.f23576b1 = this.f23675x1;
        this.f23580c1 = this.f23680y1;
        this.f23645r1 = 0.0f;
        this.f23640q1 = 0.0f;
        m16352Qk();
    }

    public final CharSequence m16233fi() {
        int i;
        String str = m9131x9().f23731i;
        if (!C5070i.m24062i(str)) {
            return str;
        }
        C8112b g = this.f23649s0.m13460g();
        String J0 = g.mo13506g() != 0 ? C4403w.m27976J0(g.mo13506g(), TimeUnit.SECONDS) : null;
        int i2 = this.f23629o0;
        if (i2 == 0) {
            String ii = m16207ii(g);
            if (ii == null) {
                return J0 != null ? J0 : "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii);
            spannableStringBuilder.setSpan(C4403w.m27891d2(RunnableC5390g.m22984M0(ii)), 0, ii.length(), 33);
            if (J0 != null) {
                spannableStringBuilder.append(' ');
                spannableStringBuilder.append((CharSequence) J0);
            }
            return spannableStringBuilder;
        } else if (i2 != 1 && i2 != 2) {
            return i2 != 5 ? "" : C5070i.m24075D(m9131x9().f23729g);
        } else {
            if (J0 != null) {
                return this.f23649s0.m13456k() != 1 ? C4403w.m27867j1(R.string.format_mediaIndexAndTime, m16068zi(), J0) : J0;
            }
            if (i2 == 2) {
                i = this.f30170b.m2784K6(this.f23649s0.m13460g().m13551J()) ? R.string.ChannelPhoto : R.string.GroupPhoto;
            } else {
                i = R.string.ProfilePhoto;
            }
            return this.f23649s0.m13456k() != 1 ? m16068zi() : C4403w.m27871i1(i);
        }
    }

    public final void m16231fk() {
        if (!this.f23488F0) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23484E0;
            if (z0Var == null) {
                ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var2 = new ViewTreeObserver$OnPreDrawListenerC7081z0(mo4347s());
                this.f23484E0 = z0Var2;
                z0Var2.m17847a2(this, false, this, this, false);
                this.f23484E0.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 80));
                this.f23541S1.addView(this.f23484E0);
                this.f23471B2.getViewTreeObserver().addOnPreDrawListener(this.f23484E0);
            } else if (z0Var.getParent() == null) {
                this.f23541S1.addView(this.f23484E0);
            }
            boolean S9 = m9348S9();
            this.f23492G0 = S9;
            this.f23488F0 = true;
            if (S9) {
                this.f23553V1.setImageResource(R.drawable.baseline_keyboard_24);
                this.f23484E0.m17848Z1((C7029t0) this.f23549U1);
                return;
            }
            this.f23553V1.setImageResource(R.drawable.baseline_direction_arrow_down_24);
        }
    }

    public final void m16230fl(float f) {
        this.f23569Z1.setAlpha(f);
        this.f23569Z1.setEnabled(f == 1.0f);
        LinearLayout linearLayout = this.f23581c2;
        if (linearLayout != null) {
            linearLayout.setAlpha(f);
        }
    }

    public final void m16229fm(boolean z, boolean z2, long j, TimeUnit timeUnit, boolean z3) {
        long j2;
        long j3;
        long j4;
        long j5;
        if (this.f23561X1 != null) {
            C7401b0 b0Var = this.f23480D1;
            RunnableC7470o V1 = b0Var != null ? b0Var.m16532V1(this.f23649s0.m13460g()) : null;
            float f = 1.0f;
            boolean z4 = false;
            if (this.f23676x2 != z) {
                this.f23676x2 = z;
                if (z) {
                    if (!z2 || V1 == null) {
                        j5 = -1;
                        j4 = -1;
                    } else {
                        j4 = V1.getTimeNow();
                        j5 = V1.getTimeTotal();
                    }
                    if ((j4 == -1) || (j5 == -1)) {
                        this.f23561X1.m15830D1(timeUnit.toMillis(j), 0L, z2, z3 && this.f23681y2 != 0.0f);
                    } else {
                        this.f23561X1.m15830D1(j5, j4, z2, z3 && this.f23681y2 != 0.0f);
                    }
                    this.f23561X1.setFile(this.f23649s0.m13460g().m13549K());
                    boolean z5 = z2 && (this.f23649s0.m13460g().m13509e0() || (this.f23516M0 < 1.0f && !C8112b.m13513c0(this.f23649s0.m13460g().m13523X())));
                    this.f23561X1.m15827G1(z5, z3 && this.f23681y2 != 0.0f);
                    if (z5 && this.f23516M0 < 1.0f) {
                        C7489q1 q1Var = this.f23561X1;
                        if (z3 && this.f23681y2 != 0.0f) {
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
                    this.f23561X1.m15830D1(timeUnit.toMillis(j), 0L, z2, z3);
                } else {
                    this.f23561X1.m15830D1(j3, j2, z2, z3);
                }
                this.f23561X1.setFile(this.f23649s0.m13460g().m13549K());
                if (z2 && (this.f23649s0.m13460g().m13509e0() || this.f23516M0 < 1.0f)) {
                    z4 = true;
                }
                this.f23561X1.m15827G1(z4, z3);
                if (!z4) {
                    return;
                }
                if (this.f23516M0 < 1.0f || this.f23649s0.m13460g().m13517a0()) {
                    this.f23561X1.m15829E1(true, z3);
                    m16447Em(true);
                }
            }
        }
    }

    @Override
    public void mo452g2() {
        View view = this.f23549U1;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public boolean mo16228g5() {
        return C5070i.m24062i(((TextView) this.f23549U1).getText());
    }

    @Override
    public void mo9251g9(int i, int i2, int i3, int i4) {
        boolean z = this.f23657t3 != i4;
        this.f23657t3 = i4;
        if (this.f23629o0 == 3 && this.f23679y0) {
            if (i4 > C1357a0.m37539n()) {
                i4 = 0;
            }
            m16212hl(i4);
            int vi = m16102vi(2);
            C1399s0.m37198Z(this.f23559W3, vi);
            C7851a aVar = this.f23555V3;
            if (aVar != null) {
                aVar.setOffsetBottom(vi);
            }
        }
        C7401b0 b0Var = this.f23480D1;
        if (b0Var != null) {
            if (z) {
                b0Var.setOffsetBottom(m16102vi(this.f23687z3));
            }
            this.f23480D1.m16520k2();
        }
    }

    public final void m16225gh() {
        m16457Dl(true);
        m16371Oi(this.f23467A3);
        int i = this.f23687z3;
        if (i == 0) {
            this.f23480D1.setDisallowMove(false);
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
        float mi = (1.0f - this.f23672w3) * (1.0f - this.f23688z4) * (1.0f - this.f23469B0) * (1.0f - m16175mi());
        if (this.f23639q0 == null) {
            f = 0.0f;
        }
        return mi * f;
    }

    public final void m16222gk() {
        if (Build.VERSION.SDK_INT < 14) {
            C1379j0.m37293z0("Sorry, this feature is available only on Android 4.0+", 0);
        } else if (this.f23687z3 != 1) {
            m16094wh(1, 1);
        }
    }

    public final void m16221gl(float f) {
        if (this.f23516M0 == f) {
            return;
        }
        if (!Float.isNaN(f)) {
            this.f23516M0 = f;
            m16472Bm();
            if (!(Build.VERSION.SDK_INT < 19 || this.f23512L0 == null || this.f23674x0 == null)) {
                float f2 = this.f23516M0;
                if (f2 > 0.0f && f2 < 1.0f) {
                    m16425Hj();
                }
            }
            this.f23475C1.setWillNotDraw(f == 0.0f);
            this.f23475C1.invalidate();
            m16461Dh();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void m16220gm() {
        AbstractC7459k1 k1Var;
        C8112b bVar = this.f23500I0;
        if (!(bVar == null || (k1Var = this.f23634p0) == null)) {
            k1Var.mo9807F2(this.f23496H0, bVar, true);
        }
        this.f23500I0 = null;
    }

    @Override
    public void mo16219h(C7401b0 b0Var, float f) {
        float f2;
        int i;
        int i2;
        C3940f fVar = this.f23554V2;
        if (fVar != null && fVar.m29585h() && this.f23566Y2.f23748O != null) {
            int h = this.f23649s0.m13459h();
            float f3 = 1.0f;
            if (f < 0.0f && h > 0) {
                i = this.f23566Y2.f23748O.m16013t(h - 1);
                f2 = f + 1.0f;
            } else if (f <= 0.0f || (i2 = h + 1) >= this.f23649s0.m13458i()) {
                f2 = 1.0f;
                i = -1;
            } else {
                i = this.f23566Y2.f23748O.m16013t(i2);
                f2 = 1.0f - f;
            }
            if (i != -1) {
                f3 = f2;
            }
            int t = this.f23566Y2.f23748O.m16013t(h);
            if (t != -1 && this.f23566Y2.f23748O.m16017p(t, i, f3)) {
                m16339Sh(true, false);
                this.f23558W2.invalidate();
            }
        }
    }

    @Override
    public void mo12475h3(C8431f fVar, boolean z, int i) {
        m16262bl(z);
    }

    @Override
    public TdApi.Chat mo8235h7(RunnableC9558i0 i0Var) {
        long j = m9131x9().f23735m;
        if (j != 0) {
            return this.f30170b.m2632U2(j);
        }
        return null;
    }

    public final void m16216hh() {
        this.f23504J0 = 0;
        this.f23546T2 = true;
        m16427Hh();
    }

    public final float m16215hi() {
        return Math.max(0.0f, Math.min(1.0f, this.f23666v2)) * (1.0f - this.f23672w3) * (1.0f - this.f23688z4) * (1.0f - this.f23469B0) * (1.0f - m16175mi());
    }

    public final void m16212hl(int i) {
        if (this.f23652s3 != i) {
            this.f23652s3 = i;
            C1399s0.m37198Z(this.f23517M1, i);
            C1399s0.m37198Z(this.f23541S1, m16191ki());
        }
    }

    public void m16211hm() {
        String str;
        C8328e eVar = this.f23653s4;
        if (eVar != null && eVar.m12818o() && !this.f23653s4.getContentWrap().m12805F1()) {
            int i = 2;
            if (this.f23636p2.m11076e()) {
                float hue = this.f23661u2.getHue();
                float[] hsv = this.f23661u2.getHsv();
                int brushColor = this.f23661u2.getBrushColor();
                str = C1363c0.m37475B(0, hue, hsv[1], hsv[2], brushColor, true) + "\n" + C1363c0.m37475B(1, hue, hsv[1], hsv[2], brushColor, true) + "\n" + C1363c0.m37475B(2, hue, hsv[1], hsv[2], brushColor, true) + "\n" + ((Object) C4403w.m27855m1(R.string.BrushSize, C7389v0.m16641e0(this.f23661u2.m11066a(1.0f), false)));
            } else {
                str = C4868i.m24727c2().m24764X2(131072L) ? C4403w.m27871i1(R.string.HoldToTone) : null;
                i = 0;
            }
            if (!C5070i.m24062i(str)) {
                C9357x2.C9370l lVar = this.f23658t4;
                if (lVar != null) {
                    if (!str.equals(lVar.m8922C())) {
                        this.f23658t4.m8903V(mo4347s().m14584H3().m8981k(this.f30170b, str, i), 0);
                    }
                    this.f23658t4.m8900Y();
                    return;
                }
                this.f23658t4 = mo4347s().m14584H3().m8985g(this.f23661u2).m8943z(true).m8960g(mo4347s().m14584H3().m8979m(m16142qi())).m8973B(mo4347s().m14584H3().m8981k(this.f30170b, str, i));
                return;
            }
        }
        C9357x2.C9370l lVar2 = this.f23658t4;
        if (lVar2 != null) {
            lVar2.m8915J();
        }
    }

    public final boolean m16208ih() {
        C3940f fVar = this.f23574a3;
        return fVar != null && fVar.m29585h();
    }

    public final String m16207ii(C8112b bVar) {
        TdApi.Chat U2;
        if (bVar.m13545M() != null) {
            return this.f30170b.m2151yb(bVar.m13545M());
        }
        if (bVar.m13551J() == 0 || (U2 = this.f30170b.m2632U2(bVar.m13551J())) == null) {
            return null;
        }
        return U2.title;
    }

    public final void m16204il(float f) {
        this.f23573a2.setAlpha(f);
        this.f23573a2.setEnabled(f == 1.0f);
    }

    public final void m16203im() {
        if (this.f23503I3 == null) {
            C8328e eVar = new C8328e(mo4347s());
            this.f23503I3 = eVar;
            eVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, 17));
        }
        Bitmap bitmap = this.f23511K3;
        if (bitmap != null) {
            this.f23503I3.m12814s(this.f23507J3, bitmap.getWidth(), this.f23511K3.getHeight(), this.f23511K3, this.f23519M3, this.f23507J3.m20897t());
        } else {
            this.f23503I3.m12812u(this.f23527O3, this.f23531P3, this.f23507J3.m20851X0(), this.f23507J3.m20913j());
        }
        this.f23480D1.getBaseCell().addView(this.f23503I3);
        if (this.f23511K3 != null) {
            this.f23503I3.setEditorVisible(true);
        } else {
            m16400Kj(this.f23515L3);
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        C3950k kVar;
        if (this.f23490F2 || ((kVar = this.f23542S2) != null && kVar.m29533v())) {
            return true;
        }
        if (this.f23662u3) {
            m16311Vl(false);
            return true;
        } else if (this.f23687z3 != 0) {
            m16484Ai(true);
            return true;
        } else if (this.f23488F0) {
            m16265bi();
            return true;
        } else if (this.f23480D1.getCurrentZoom() <= 1.0f) {
            return false;
        } else {
            this.f23480D1.getBaseCell().getDetector().m15870m(true);
            return true;
        }
    }

    public final void m16200jh() {
        AbstractC9323v4<?> F = this.f30168a.m14551P1().m9762F();
        if (F != null) {
            F.mo9397La();
        }
        if (this.f23480D1.m16523f2()) {
            m16473Bl(false);
        }
    }

    public int m16199ji() {
        return this.f23657t3;
    }

    public final void m16196jl(float f) {
        if (this.f23666v2 != f) {
            this.f23666v2 = f;
            m16204il(m16215hi());
            float f2 = (f * 0.3f) + 0.7f;
            this.f23573a2.setScaleX(f2);
            this.f23573a2.setScaleY(f2);
        }
    }

    public final void m16195jm() {
        if (this.f23653s4 == null) {
            C8328e eVar = new C8328e(mo4347s());
            this.f23653s4 = eVar;
            eVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, 17));
            m16250dh(this.f23663u4);
        }
        this.f23653s4.getContentWrap().m12802J1(this.f23661u2.getBrushColor(), this.f23661u2.m11066a(m16183li()));
        this.f23653s4.m12814s(this.f23628n4.m13549K(), this.f23633o4, this.f23638p4, null, null, this.f23643q4);
        boolean E0 = this.f23628n4.m13560E0(null, false);
        this.f23480D1.getBaseCell().addView(this.f23653s4);
        this.f23653s4.setEditorVisible(true);
        this.f23653s4.getContentWrap().setDrawingListener(new C8328e.RunnableC8330b.AbstractC8331a() {
            @Override
            public final void mo12801a(View view, int i) {
                View$OnClickListenerC7430j1.this.m16459Dj(view, i);
            }
        });
        if (E0) {
            this.f23480D1.getBaseReceiver().invalidate();
        }
        m16211hm();
    }

    @Override
    public void mo14383k0(C6246h hVar, boolean z, Bitmap bitmap) {
        if (z) {
            m16156ol(hVar, bitmap);
        }
    }

    @Override
    public void mo11056k7(C8867c cVar) {
        C8328e eVar = this.f23653s4;
        if (eVar != null) {
            eVar.getContentWrap().m12802J1(cVar.getBrushColor(), cVar.m11066a(m16183li()));
        }
    }

    public final int m16191ki() {
        return (this.f23474C0 ? 0 : C1357a0.m37544i(56.0f)) + this.f23652s3;
    }

    public final void m16188kl(float f) {
        this.f23551U3.setAlpha(f);
    }

    public final void m16187km() {
        C8431f fVar = this.f23643q4;
        if (fVar != null) {
            fVar.m12493i();
        }
        C5320c cVar = new C5320c(5);
        C5320c cVar2 = new C5320c(5);
        C5146u0 u0Var = new C5146u0(5);
        cVar.m23285a(R.id.paint_mode_path);
        cVar2.m23285a(R.drawable.baseline_adjust_24);
        u0Var.m23817a(R.string.PaintModeDoodle);
        cVar.m23285a(R.id.paint_mode_arrow);
        cVar2.m23285a(R.drawable.baseline_arrow_upward_24);
        u0Var.m23817a(R.string.PaintModeArrow);
        cVar.m23285a(R.id.paint_mode_rect);
        cVar2.m23285a(R.drawable.baseline_crop_3_2_24);
        u0Var.m23817a(R.string.PaintModeRect);
        C8431f fVar2 = this.f23643q4;
        if (fVar2 != null && fVar2.m12493i()) {
            cVar.m23285a(R.id.paint_mode_fill);
            cVar2.m23285a(R.drawable.baseline_format_color_fill_24);
            u0Var.m23817a(R.string.PaintModeFill);
        }
        m9254fe(null, cVar.m23281e(), u0Var.m23814d(), null, cVar2.m23281e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Ej;
                Ej = View$OnClickListenerC7430j1.this.m16450Ej(view, i);
                return Ej;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        }, m16142qi());
    }

    public final float m16184lh(float f, float f2, float f3) {
        float f4;
        int measuredWidth = this.f23480D1.getMeasuredWidth();
        int measuredHeight = this.f23480D1.getMeasuredHeight();
        float f5 = measuredWidth;
        float Z = this.f23494G2.m13519Z();
        float f6 = (f3 - (measuredWidth / 2)) * (-1.0f);
        return (f6 / (f5 * 0.5f)) * (f2 / (measuredHeight * 0.5f)) * (-35.0f) * Math.min(1.0f, Math.max(-1.0f, f / (((int) (Z * Math.min(f5 / Z, f4 / this.f23494G2.m13569A()))) * 0.2f))) * Math.signum(f6);
    }

    public final float m16183li() {
        return 1.0f;
    }

    public final void m16180ll(int i, int i2) {
        this.f23555V3.m14837t(i, i2);
        this.f23617l2.m16491i((i == 0 || i2 == 0) ? false : true, true);
    }

    public final void m16179lm() {
        final C8112b g = this.f23649s0.m13460g();
        this.f30170b.m2485dd();
        HandlerC10770jj.m3757O8(mo4347s(), g.m13541O(), true, true, g.m13491n0() ? R.string.MessageLifetimeVideo : R.string.MessageLifetimePhoto, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC7430j1.this.m16441Fj(g, (HandlerC10770jj.C10787p) obj);
            }
        });
    }

    public final int m16176mh() {
        int i = this.f23629o0;
        return C1357a0.m37544i((i == 1 || i == 2) ? 26.0f : 22.0f) + C1357a0.m37544i(1.0f);
    }

    public final float m16175mi() {
        return m16322Ui() ? 1.0f : 0.0f;
    }

    public final void m16172ml(float f) {
        if (this.f23611j4) {
            C7468n1 n1Var = this.f23626n2;
            float f2 = this.f23603h4;
            n1Var.m15975d(f2 + ((this.f23607i4 - f2) * f), true);
        }
        if (this.f23583c4 != 0) {
            m16090wl(f);
        }
    }

    public final void m16171mm() {
        m9254fe(C4403w.m27871i1(R.string.DiscardCurrentChanges), new int[]{R.id.btn_discard, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Discard), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Gj;
                Gj = View$OnClickListenerC7430j1.this.m16433Gj(view, i);
                return Gj;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        }, m16142qi());
    }

    @Override
    public void mo15809n6(int i) {
        boolean z = true;
        this.f23543S3 = true;
        C8328e eVar = this.f23503I3;
        if (eVar != null) {
            if (i != 14) {
                z = false;
            }
            eVar.m12815r(z);
        }
    }

    public final boolean m16168nh() {
        int i = this.f23629o0;
        return i != 4 && (i != 3 || this.f23687z3 == 0) && this.f23480D1.getCurrentZoom() == 1.0f && !this.f23474C0;
    }

    public TdApi.File m16167ni() {
        return this.f23649s0.m13460g().m13539P();
    }

    public final void m16165nk() {
        if (!this.f23649s0.m13460g().m13491n0() && this.f23687z3 != 3) {
            m16094wh(3, 1);
        }
    }

    public final void m16164nl(boolean z) {
        View$OnClickListenerC9170d1 d1Var = this.f23589e2;
        int i = 0;
        if (d1Var != null) {
            d1Var.setVisibility(z ? 0 : 8);
        }
        FrameLayoutFix frameLayoutFix = this.f23541S1;
        if (frameLayoutFix != null) {
            if (!z) {
                i = 8;
            }
            frameLayoutFix.setVisibility(i);
        }
    }

    public final boolean m16163nm() {
        if (this.f23639q0 == null) {
            return false;
        }
        m16448El(this.f23569Z1.m18800v(), true);
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
        if (this.f23608j1) {
            m16355Qh(f, f2);
            return true;
        }
        if (this.f23490F2) {
            if (Math.max(Math.abs(f), Math.abs(f2)) <= C1357a0.m37544i(50.0f)) {
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
        C8112b g = this.f23649s0.m13460g();
        return g != null && g.m13491n0() && !g.m13509e0();
    }

    public C7462l1 m16159oi() {
        if (this.f23634p0 == null || C1379j0.m37356O()) {
            return null;
        }
        return this.f23634p0.mo9806v(this.f23649s0.m13459h(), this.f23649s0.m13460g());
    }

    public final void m16157ok() {
        if (this.f23687z3 == 4) {
            return;
        }
        if (!C4183a.f14089g) {
            C1379j0.m37313p0(18);
        } else {
            m16094wh(4, 1);
        }
    }

    public final void m16156ol(final C6246h hVar, final Bitmap bitmap) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC7430j1.this.m16475Bj(hVar, bitmap);
            }
        });
    }

    public final boolean m16155om() {
        if (this.f23589e2 == null) {
            return false;
        }
        boolean z = !this.f23532Q0;
        this.f23532Q0 = z;
        m16332Tg(z ? 1.0f : 0.0f);
        return true;
    }

    @Override
    public void onClick(View view) {
        boolean z;
        float f;
        int[] iArr;
        int[][] iArr2;
        if (!this.f23673w4) {
            char c = 0;
            switch (view.getId()) {
                case R.id.btn_adjust:
                    int X = this.f23649s0.m13460g().m13523X();
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
                    if (this.f23687z3 != 0) {
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
                    AbstractC7511x xVar = this.f23639q0;
                    if (xVar != null) {
                        if (xVar.mo11197v1(this.f23649s0.m13459h(), this.f23649s0.m13460g())) {
                            z = true;
                            if (this.f23639q0.mo11241P0() <= 1) {
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
                    if (this.f23649s0.m13460g().m13491n0()) {
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
                    this.f23649s0.m13460g().m13479t0(view);
                    return;
                case R.id.btn_paint:
                    int X2 = this.f23649s0.m13460g().m13523X();
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
                    if (m16373Og() && this.f23687z3 == 2) {
                        int[][] iArr3 = f23463G4;
                        C5320c cVar = new C5320c(iArr3.length + 2);
                        C5146u0 u0Var = new C5146u0(iArr3.length + 2);
                        C5320c cVar2 = new C5320c(iArr3.length + 2);
                        C5320c cVar3 = new C5320c(iArr3.length + 2);
                        C8112b g = this.f23649s0.m13460g();
                        g.m13519Z();
                        g.m13569A();
                        if (this.f23617l2.m16492h()) {
                            f = this.f23555V3.getFixedProportion();
                            cVar2.m23285a(R.drawable.baseline_crop_free_24);
                            cVar.m23285a(R.id.btn_proportion_free);
                            u0Var.m23817a(R.string.CropFree);
                            cVar3.m23285a(1);
                        } else {
                            f = 0.0f;
                        }
                        float originalProportion = this.f23555V3.getOriginalProportion();
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
                            cVar2.m23285a(R.drawable.baseline_crop_original_24);
                            cVar.m23285a(R.id.btn_proportion_original);
                            if (iArr == null) {
                                u0Var.m23817a(R.string.CropOriginal);
                            } else if (iArr[2] == R.id.btn_proportion_square) {
                                u0Var.m23816b(C4403w.m27871i1(R.string.CropOriginal) + " (" + C4403w.m27871i1(R.string.CropSquare) + ")");
                            } else {
                                u0Var.m23816b(C4403w.m27871i1(R.string.CropOriginal) + " (" + iArr[0] + ":" + iArr[1] + ")");
                            }
                            cVar3.m23285a(originalProportion == f ? 3 : 1);
                        }
                        int[][] iArr5 = f23463G4;
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
                            cVar.m23285a(i3);
                            if (i3 == R.id.btn_proportion_square) {
                                u0Var.m23817a(R.string.CropSquare);
                            } else {
                                u0Var.m23816b(i4 + ":" + i5);
                            }
                            cVar2.m23285a(i6);
                            cVar3.m23285a(((float) i4) / ((float) i5) == f ? 3 : 1);
                            i2++;
                            iArr5 = iArr2;
                            c = 0;
                        }
                        if (!this.f23587d4.m14818l()) {
                            cVar3.m23285a(2);
                            cVar.m23285a(R.id.btn_crop_reset);
                            u0Var.m23817a(R.string.Reset);
                            cVar2.m23285a(R.drawable.baseline_cancel_24);
                        }
                        m9254fe(null, cVar.m23281e(), u0Var.m23814d(), cVar3.m23281e(), cVar2.m23281e(), new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i7) {
                                boolean cj;
                                cj = View$OnClickListenerC7430j1.this.m16256cj(view2, i7);
                                return cj;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23936a(this);
                            }

                            @Override
                            public Object mo491b2(int i7) {
                                return C5115g0.m23935b(this, i7);
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
                    if (this.f23687z3 != 0) {
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
        C9310u0 B2 = d1Var.m10131B2(R.id.menu_btn_pictureInPicture, R.drawable.deproko_baseline_outinline_24, R.id.theme_color_white, null, C1357a0.m37544i(49.0f), d1Var);
        B2.setBackgroundResource(R.drawable.bg_btn_header_light);
        int i2 = 0;
        B2.setVisibility(m16160oh() ? 0 : 8);
        linearLayout.addView(B2);
        C9310u0 Z1 = d1Var.m10072Z1(linearLayout, null, R.id.theme_color_white);
        Z1.setBackgroundResource(R.drawable.bg_btn_header_light);
        if (!m16135rh()) {
            i2 = 8;
        }
        Z1.setVisibility(i2);
        d1Var.m10064d2(linearLayout, null, R.id.theme_color_white).setBackgroundResource(R.drawable.bg_btn_header_light);
    }

    @Override
    public void mo16154p5() {
        if (((TextView) this.f23549U1).getText().length() > 0) {
            this.f23549U1.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public final boolean m16151ph() {
        return this.f23629o0 == 4 && Build.VERSION.SDK_INT < 26;
    }

    public final C8111a m16150pi(boolean z) {
        C8111a z2 = this.f23649s0.m13460g().m13468z();
        return (z2 != null || !z) ? z2 : new C8111a();
    }

    public final void m16147pl(float f) {
        this.f23517M1.setAlpha(f);
        this.f23577b2.setAlpha(this.f23672w3 * f);
        C7506v vVar = this.f23677x3;
        if (vVar != null) {
            vVar.setAlpha(this.f23672w3 * f);
        }
        int i = this.f23687z3;
        if (i == 0) {
            m16279Zk(f);
            m16230fl(m16224gi() * f);
            m16204il(f * m16215hi());
        } else if (i == 1) {
            this.f23593f2.setAlpha(f);
        } else if (i == 4) {
            this.f23601h2.setAlpha(f);
        }
    }

    public final void m16146pm() {
        if (C4183a.f14090h) {
            this.f23529P1.m16491i(this.f23649s0.m13460g().m13530T0(), true);
            this.f23480D1.getBaseCell().m15948K0();
            m16438Fm();
            return;
        }
        C1379j0.m37313p0(18);
    }

    @Override
    public void mo15838q2(C7484p1 p1Var, boolean z) {
        if (z) {
            this.f23480D1.m16516p2();
        } else {
            this.f23480D1.m16514t2(p1Var.getValue());
        }
    }

    @Override
    public void mo14382q5(C6246h hVar, float f) {
    }

    public final int m16143qh() {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.m16143qh():int");
    }

    public final AbstractC11531p m16142qi() {
        return C11514c0.m348a(2);
    }

    public final void m16139ql(float f) {
        if (this.f23508K0 != f) {
            this.f23508K0 = f;
            this.f23480D1.setAlpha(Math.max(0.0f, Math.min(1.0f, f)));
        }
    }

    public final void m16138qm() {
        if (Math.abs(this.f23576b1) == 2.0f) {
            m16337Sj(0.0f, 0.0f, false);
        } else {
            m16398Kl(!this.f23685z1, true);
        }
    }

    @Override
    public void mo8233r0(RunnableC9558i0 i0Var, ArrayList<AbstractC4718o<?>> arrayList, boolean z) {
        if (this.f23464A0 == null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 80);
                C7439i iVar = new C7439i(mo4347s());
                this.f23464A0 = iVar;
                iVar.setListener((View$OnClickListenerC9694y.AbstractC9704j) this.f23549U1);
                this.f23464A0.setAlpha(this.f23469B0);
                this.f23464A0.setOffsetProvider(this);
                this.f23464A0.setUseDarkMode(true);
                this.f23464A0.setLayoutParams(t1);
            } else {
                return;
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<AbstractC4718o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo25207P(true);
            }
            if (this.f23464A0.getParent() == null) {
                this.f23471B2.addView(this.f23464A0);
            }
        }
        this.f23464A0.m7533v2(this, arrayList, z, ((RunnableC9558i0) this.f23549U1).getInlineSearchContext(), false);
    }

    @Override
    public int mo7522r4(View$OnClickListenerC9694y yVar) {
        return this.f23471B2.getMeasuredHeight();
    }

    public final boolean m16135rh() {
        return false;
    }

    public final int m16134ri(int i) {
        int i2 = i != 2 ? 0 : C1357a0.m37544i(22.0f);
        C6253l K = this.f23649s0.m13460g().m13549K();
        float Z0 = K.m20849Z0();
        float M0 = K.m20862M0();
        return i2 + Math.max(0, ((((int) (Math.min(this.f23480D1.getActualImageWidth() / Z0, this.f23480D1.getActualImageHeight() / M0) * Z0)) - ((int) (Z0 * Math.min(((this.f23480D1.getMeasuredWidth() - i2) - i2) / Z0, ((this.f23480D1.getMeasuredHeight() - m16102vi(i)) - m16084xi(i)) / M0)))) / 2) - i2);
    }

    public final void m16131rl(boolean z) {
        int i;
        AbstractC9323v4<?> F;
        if (Build.VERSION.SDK_INT >= 21 && (i = this.f23629o0) != 3) {
            if (z && ((i == 0 || i == 5) && (F = this.f30168a.m14551P1().m9762F()) != null)) {
                F.mo9397La();
            }
            if (z) {
                mo4347s().m14549Q(this, true);
            } else {
                mo4347s().m14437t2(this, true);
            }
        }
    }

    public final boolean m16130rm() {
        C8328e eVar = this.f23653s4;
        if (eVar == null || eVar.getContentWrap().m12804G1()) {
            return false;
        }
        this.f23643q4.m12477y();
        return true;
    }

    @Override
    public boolean mo15837s0(C7484p1 p1Var) {
        return this.f23649s0.m13460g().m13491n0();
    }

    public final boolean m16127sh() {
        return false;
    }

    public void m16124sk() {
        if (this.f23584d1) {
            this.f23649s0.m13460g().m13479t0(this.f23501I1);
        }
    }

    public final void m16123sl(float f) {
        View$OnClickListenerC9170d1 d1Var;
        m16115tl(f);
        int i = this.f23669w0;
        if (i == 0) {
            View$OnClickListenerC9170d1 d1Var2 = this.f23589e2;
            if (d1Var2 != null) {
                d1Var2.setAlpha(f);
            }
        } else if (i == 1 && (d1Var = this.f23589e2) != null) {
            d1Var.setTranslationY((-View$OnClickListenerC9170d1.m10065c3(d1Var.m10024w3())) * (1.0f - f));
        }
    }

    public final void m16122sm() {
        C8328e eVar = this.f23653s4;
        if (eVar != null && !eVar.getContentWrap().m12804G1()) {
            this.f23643q4.m12476z();
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
        this.f23555V3.m14848i(f);
    }

    public final void m16119th() {
        C3950k kVar = this.f23614k3;
        if (kVar != null) {
            kVar.m29543l(0.0f);
            this.f23627n3 = null;
        }
    }

    public int m16118ti() {
        return this.f23629o0;
    }

    public final Bitmap m16116tk() {
        if (!(this.f23480D1.getBaseReceiver() instanceof C6257p)) {
            return null;
        }
        C6257p pVar = (C6257p) this.f23480D1.getBaseReceiver();
        this.f23523N3 = pVar;
        Bitmap q = pVar.m20800q();
        if (q == null || q.isRecycled()) {
            return null;
        }
        this.f23527O3 = q.getWidth();
        this.f23531P3 = q.getHeight();
        return q;
    }

    public final void m16115tl(float f) {
        if (this.f23544T0 != f) {
            this.f23544T0 = f;
            m16414Im();
        }
    }

    public final void m16114tm(C6246h hVar) {
        int p = this.f23649s0.m13451p(hVar);
        if (p != -1) {
            if (p == this.f23649s0.m13459h()) {
                this.f23569Z1.setChecked(false);
            }
            if (this.f23639q0 != null) {
                C8112b e = this.f23649s0.m13462e(p);
                m16452Eh(e, p);
                this.f23639q0.mo11239Q1(p, e, false);
                int P0 = this.f23639q0.mo11241P0();
                if (P0 == 0) {
                    m16257ci(0.0f);
                } else {
                    this.f23573a2.m9678E(P0);
                }
            }
            this.f23682y3.m15762g0(hVar);
            if (this.f23682y3.mo6153D() == 0) {
                m16311Vl(false);
            }
        }
    }

    @Override
    public boolean mo15808u4() {
        return !this.f23673w4;
    }

    public final void m16111uh() {
        C3950k kVar = this.f23579b4;
        if (kVar != null) {
            kVar.m29544k();
        }
        this.f23575a4 = 0.0f;
    }

    public final boolean m16110ui(int[] iArr) {
        C8112b bVar;
        int measuredWidth = this.f23480D1.getMeasuredWidth();
        int measuredHeight = this.f23480D1.getMeasuredHeight();
        if (measuredHeight == 0 || measuredWidth == 0 || (bVar = this.f23572a1) == null) {
            return false;
        }
        float Z = bVar.m13519Z();
        float A = this.f23572a1.m13569A();
        float min = Math.min(measuredWidth / Z, measuredHeight / A);
        iArr[0] = (int) (Z * min);
        iArr[1] = (int) (A * min);
        return true;
    }

    public final boolean m16108uk() {
        C8112b g = this.f23649s0.m13460g();
        C6257p imageReceiver = this.f23480D1.getBaseCell().getImageReceiver();
        if (g.m13491n0() || g.m13511d0() || imageReceiver == null) {
            C1379j0.m37295y0(R.string.MediaTypeUnsupported, 0);
            return false;
        }
        Bitmap q = imageReceiver.m20800q();
        this.f23595f4 = q;
        if (q == null || q.isRecycled()) {
            return false;
        }
        this.f23599g4 = g.m13549K().mo20874x();
        this.f23587d4 = m16329Tj(true);
        this.f23643q4 = m16321Uj(false);
        this.f23591e4 = new C7856c(this.f23587d4);
        return true;
    }

    public final void m16107ul(float f) {
        this.f23536R0 = f;
        m16080xm();
        m16098vm();
        m16422Hm();
        m16414Im();
    }

    public final void m16106um(boolean z) {
        C8112b g = this.f23649s0.m13460g();
        int i = this.f23629o0;
        if (i != 0) {
            if (i == 3) {
                this.f23476C2 = true;
                TdApi.FormattedText s = g.m13482s();
                if (s != null) {
                    ((RunnableC9558i0) this.f23549U1).m8249v0(C4779t2.m25442q5(s), true);
                } else {
                    ((RunnableC9558i0) this.f23549U1).m8249v0("", true);
                }
                this.f23476C2 = false;
                return;
            } else if (i != 5) {
                return;
            }
        }
        boolean z2 = g.m13482s() != null;
        if (z2) {
            ((C6973n0) this.f23549U1).m18246y(g.m13482s().text, g.m13480t(), false);
            if (!z && !this.f23520N0) {
                this.f23520N0 = true;
                this.f23524O0 = 1.0f;
            }
        }
        m16238el(z2, z);
    }

    @Override
    public void mo15889v5(C8112b bVar, boolean z) {
        if (this.f23649s0.m13460g() == bVar) {
            C7489q1 q1Var = this.f23561X1;
            if (q1Var != null) {
                q1Var.m15829E1(z, this.f23681y2 > 0.0f);
            }
            this.f23584d1 = z;
            int i = this.f23629o0;
            if (i == 0 || i == 5) {
                m16447Em(z);
                if (!z) {
                    m16398Kl(true, true);
                }
            }
        }
    }

    public final void m16103vh() {
        ImageLoader.m14391e().m14385k(this.f23535Q3);
    }

    public final int m16102vi(int i) {
        int i2;
        int i3 = this.f23679y0 ? this.f23657t3 : 0;
        if (i == 1) {
            i2 = C1357a0.m37544i(220.0f);
        } else if (i == 2) {
            i2 = C1357a0.m37544i(160.0f);
        } else if (i == 3) {
            i2 = C1357a0.m37544i(136.0f);
        } else if (i != 4) {
            return 0;
        } else {
            i2 = m16093wi(i) + C1357a0.m37544i(12.0f);
        }
        return i2 + i3;
    }

    public final void m16100vk() {
        if (this.f23551U3 == null) {
            C7855b bVar = new C7855b(mo4347s());
            this.f23551U3 = bVar;
            bVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 49);
            t1.topMargin = m16084xi(2);
            t1.bottomMargin = m16102vi(2);
            int i = C1357a0.m37544i(22.0f);
            t1.rightMargin = i;
            t1.leftMargin = i;
            C7857d dVar = new C7857d(mo4347s());
            this.f23559W3 = dVar;
            dVar.setLayoutParams(t1);
            this.f23551U3.addView(this.f23559W3);
            C7851a aVar = new C7851a(mo4347s());
            this.f23555V3 = aVar;
            aVar.setRectChangeListener(new C7851a.AbstractC7853b() {
                @Override
                public final void mo14831a(double d, double d2, double d3, double d4) {
                    View$OnClickListenerC7430j1.this.m16109uj(d, d2, d3, d4);
                }
            });
            this.f23555V3.setNormalizeListener(new C7438h());
            this.f23555V3.setRotateModeChangeListener(new C7851a.AbstractC7854c() {
                @Override
                public final void mo14830a(boolean z) {
                    View$OnClickListenerC7430j1.this.m16101vj(z);
                }
            });
            this.f23555V3.m14835v(t1.leftMargin, t1.topMargin, t1.rightMargin, t1.bottomMargin);
            this.f23555V3.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f23551U3.addView(this.f23555V3);
        }
    }

    public final void m16099vl(float f) {
        float f2 = 1.0f - f;
        this.f23529P1.setAlpha(f2);
        float f3 = (f2 * 0.4f) + 0.6f;
        this.f23529P1.setScaleX(f3);
        this.f23529P1.setScaleY(f3);
        int w = C1399s0.m37153w(this.f23529P1);
        boolean z = false;
        for (int i = 0; i < this.f23521N1.getChildCount(); i++) {
            View childAt = this.f23521N1.getChildAt(i);
            if (childAt == this.f23529P1) {
                z = true;
            } else if (z) {
                childAt.setTranslationX(((-w) / 2) * f);
            } else {
                childAt.setTranslationX((w / 2) * f);
            }
        }
    }

    public final void m16098vm() {
        LinearLayout linearLayout = this.f23545T1;
        if (linearLayout != null) {
            linearLayout.setAlpha(this.f23524O0 * this.f23536R0 * (1.0f - this.f23568Z0));
        }
    }

    @Override
    public void mo16097w0(String str) {
        ((RunnableC9558i0) this.f23549U1).m8260p0(str);
    }

    @Override
    public boolean mo11107w2(me.C6924j2 r8, p051db.C3950k r9) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.View$OnClickListenerC7430j1.mo11107w2(me.j2, db.k):boolean");
    }

    @Override
    public boolean mo9136wc(boolean z) {
        if (this.f23629o0 != 3) {
            return super.mo9136wc(z);
        }
        boolean z2 = true;
        if (z && !m9348S9()) {
            m16394Lh(true);
        }
        boolean wc = super.mo9136wc(z);
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f23484E0;
        if (z0Var != null) {
            z0Var.m17841j(z);
        }
        if (!z && !this.f23488F0) {
            z2 = false;
        }
        m16073yl(z2);
        this.f23480D1.m16520k2();
        return wc;
    }

    public final void m16094wh(int i, int i2) {
        if (this.f23687z3 != i && m16373Og()) {
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
        this.f23617l2.m16491i(false, false);
        int i = this.f23599g4;
        C7856c cVar = this.f23591e4;
        int l = C5069h.m24082l(i + (cVar != null ? cVar.m14822h() : 0), 360);
        this.f23559W3.m14810b(this.f23595f4, l, this.f23587d4.m14827c(), this.f23643q4);
        this.f23626n2.m15975d(this.f23587d4.m14827c(), false);
        this.f23555V3.m14842o();
        this.f23555V3.m14841p(C7389v0.m16656a1(this.f23595f4, l), C7389v0.m16753B0(this.f23595f4, l), this.f23587d4.m14826d(), this.f23587d4.m14821i(), this.f23587d4.m14823g(), this.f23587d4.m14828b(), false);
    }

    public final void m16090wl(float f) {
        float f2;
        float f3;
        float f4;
        if (this.f23575a4 != f) {
            this.f23575a4 = f;
            int i = this.f23583c4;
            float f5 = i * f;
            float f6 = 1.0f;
            if (C7389v0.m16564x1(i)) {
                int measuredWidth = this.f23559W3.getMeasuredWidth();
                int measuredHeight = this.f23559W3.getMeasuredHeight();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23559W3.getLayoutParams();
                int targetHeight = this.f23559W3.getTargetHeight();
                float min = Math.min(((this.f23551U3.getMeasuredWidth() - layoutParams.leftMargin) - layoutParams.rightMargin) / targetHeight, ((this.f23551U3.getMeasuredHeight() - layoutParams.topMargin) - layoutParams.bottomMargin) / this.f23559W3.getTargetWidth());
                int i2 = ((int) ((((int) (f3 * min)) - measuredHeight) * f)) + measuredHeight;
                f6 = (((int) ((((int) (f4 * min)) - measuredWidth) * f)) + measuredWidth) / measuredWidth;
                f2 = i2 / measuredHeight;
            } else {
                f2 = 1.0f;
            }
            this.f23559W3.setBaseRotation(f5);
            this.f23559W3.m14808d(f6, f2);
            this.f23555V3.setRotation(f5);
            this.f23555V3.setScaleX(f6);
            this.f23555V3.setScaleY(f2);
        }
    }

    public final void m16089wm() {
        int i = 0;
        float f = 1.0f;
        boolean z = this.f23681y2 == 1.0f && !this.f23474C0;
        if (this.f23466A2 != z) {
            this.f23466A2 = z;
            LinearLayout linearLayout = this.f23545T1;
            float f2 = 0.0f;
            if (!z) {
                float f3 = (-C1357a0.m37544i(56.0f)) * this.f23681y2;
                if (this.f23474C0) {
                    f = 0.0f;
                }
                f2 = f3 * f;
            }
            linearLayout.setTranslationY(f2 + (this.f23550U2 * C1357a0.m37544i(9.0f)));
            LinearLayout linearLayout2 = this.f23545T1;
            if (this.f23466A2) {
                i = C1357a0.m37544i(56.0f);
            }
            C1399s0.m37198Z(linearLayout2, i);
        }
    }

    @Override
    public void mo16088x5(C7401b0 b0Var, float f, float f2) {
        m16411Jh();
    }

    public final void m16085xh(int i) {
        if (!m16328Tk(this.f23687z3, i) && m16346Ri(i)) {
            int i2 = this.f23687z3;
            this.f23467A3 = i2;
            this.f23472B3 = m16084xi(i2);
            this.f23482D3 = m16102vi(this.f23467A3);
            this.f23491F3 = this.f23480D1.getOffsetHorizontal();
            this.f23480D1.getBaseCell().getDetector().m15861v();
            m16474Bk(this.f23467A3);
            m16466Ck(i);
            m16307Wh(i);
            this.f23687z3 = i;
            this.f23477C3 = m16084xi(i);
            this.f23487E3 = m16102vi(this.f23687z3);
            this.f23495G3 = m16134ri(this.f23687z3);
            m16064zm(true);
            C3950k kVar = this.f23499H3;
            if (kVar == null) {
                this.f23499H3 = new C3950k(4, this, C2057b.f7283e, 380L);
            } else {
                kVar.m29543l(0.0f);
            }
            this.f23499H3.m29546i(1.0f);
        }
    }

    public final boolean m16082xk() {
        Bitmap tk = m16116tk();
        if (tk == null) {
            return false;
        }
        this.f23519M3 = m16150pi(true);
        this.f23539R3 = new C8111a(this.f23519M3);
        C6253l K = this.f23649s0.m13460g().m13549K();
        if (this.f23507J3 != K) {
            m16103vh();
            C6246h S = this.f23649s0.m13460g().m13533S(false);
            if (this.f23523N3.m20799r() != S) {
                tk = null;
            }
            m16278Zl(S, K, tk);
        }
        return true;
    }

    public final void m16081xl() {
        m16073yl(m9348S9() || this.f23488F0);
    }

    public final void m16080xm() {
        View$OnClickListenerC9170d1 d1Var = this.f23589e2;
        if (d1Var != null) {
            d1Var.setAlpha(this.f23536R0 * (1.0f - this.f23568Z0));
        }
    }

    @Override
    public void mo4536y2(C10930q6 q6Var, TdApi.Call call) {
        if (call != null && !call.isOutgoing && !C4779t2.m25687G2(call) && !C4779t2.m25563Z2(call)) {
            m16377Nj();
        }
    }

    public final void m16077yh() {
        float i = this.f23550U2 * C1357a0.m37544i(9.0f);
        if (this.f23545T1 != null) {
            m16089wm();
            if (!this.f23466A2) {
                this.f23545T1.setTranslationY(((-C1357a0.m37544i(56.0f)) * this.f23681y2) + i);
            }
        }
        C7489q1 q1Var = this.f23561X1;
        if (q1Var != null) {
            q1Var.setTranslationY((C1357a0.m37544i(56.0f) * (1.0f - this.f23681y2)) + i);
        }
    }

    public final float m16076yi() {
        if (this.f23594f3 == 0) {
            return 1.0f;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f23594f3;
        if (uptimeMillis > 100) {
            return 1.0f;
        }
        return Math.max(0.0f, ((float) uptimeMillis) / 200.0f);
    }

    public final boolean m16074yk() {
        C8112b g = this.f23649s0.m13460g();
        C6257p imageReceiver = this.f23480D1.getBaseCell().getImageReceiver();
        if (g.m13491n0() || g.m13511d0() || imageReceiver == null) {
            C1379j0.m37295y0(R.string.MediaTypeUnsupported, 0);
            return false;
        }
        Bitmap tk = m16116tk();
        if (tk == null) {
            return false;
        }
        C8431f Uj = m16321Uj(true);
        this.f23643q4 = Uj;
        Uj.m12498d(this);
        this.f23648r4 = new C8431f(this.f23643q4);
        this.f23587d4 = m16329Tj(false);
        this.f23628n4 = this.f23649s0.m13460g();
        this.f23633o4 = tk.getWidth();
        this.f23638p4 = tk.getHeight();
        return true;
    }

    public final void m16073yl(boolean z) {
        int i = 0;
        boolean z2 = z && this.f23687z3 == 0;
        if (this.f23474C0 != z2) {
            this.f23474C0 = z2;
            if (!z2 && !C5070i.m24061j(((TextView) this.f23549U1).getText())) {
                m16320Uk();
            }
            m16089wm();
            this.f23553V1.setEnabled(z2);
            this.f23557W1.setEnabled(z2);
            this.f23480D1.setDisableTouch(z2);
            this.f23480D1.setButStillNeedClick(z2 ? this : null);
            C1399s0.m37198Z(this.f23541S1, m16191ki());
            FrameLayoutFix frameLayoutFix = this.f23517M1;
            if (z2) {
                i = 8;
            }
            frameLayoutFix.setVisibility(i);
            m16422Hm();
            if (this.f23479D0 == null) {
                this.f23479D0 = new C3950k(17, this, C2057b.f7280b, 180L, this.f23469B0);
            }
            this.f23479D0.m29546i(z2 ? 1.0f : 0.0f);
            if (!z2) {
                C1379j0.m37335e0(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC7430j1.this.m16467Cj();
                    }
                }, 100L);
            }
        }
    }

    public final void m16072ym() {
        View$OnClickListenerC9170d1 d1Var = this.f23589e2;
        if (d1Var != null) {
            int i = 8;
            d1Var.m10096P3(R.id.menu_photo, R.id.menu_btn_masks, m16127sh() ? 0 : 8, 0);
            this.f23589e2.m10096P3(R.id.menu_photo, R.id.menu_btn_pictureInPicture, m16160oh() ? 0 : 8, 0);
            View$OnClickListenerC9170d1 d1Var2 = this.f23589e2;
            if (m16135rh()) {
                i = 0;
            }
            d1Var2.m10096P3(R.id.menu_photo, R.id.menu_btn_forward, i, 0);
            m16406Jm();
        }
    }

    @Override
    public long mo8232z(RunnableC9558i0 i0Var) {
        TdApi.Chat U2 = this.f30170b.m2632U2(mo8237D5(i0Var));
        if (U2 != null) {
            return C4779t2.m25466n2(U2);
        }
        return 0L;
    }

    @Override
    public void mo15888z2(C8112b bVar, long j, long j2, float f) {
        C7489q1 q1Var;
        if (this.f23649s0.m13460g() == bVar && (q1Var = this.f23561X1) != null) {
            q1Var.m15824L1(j, j2, f);
        }
    }

    public final void m16069zh() {
        int i = (C1357a0.m37544i(9.0f) * 2) + C1357a0.m37544i(43.0f);
        float f = this.f23510K2;
        float Lj = m16392Lj() * f;
        FrameLayoutFix frameLayoutFix = this.f23541S1;
        if (frameLayoutFix != null) {
            frameLayoutFix.setTranslationY(Lj - ((this.f23550U2 * i) * (1.0f - f)));
        }
        if (this.f23558W2 != null) {
            this.f23558W2.setTranslationY(Lj + (i * Math.max(1.0f - this.f23550U2, this.f23510K2)));
        }
    }

    public final String m16068zi() {
        return C4403w.m27867j1(R.string.XofY, C1363c0.m37440f(this.f23649s0.m13457j() + 1), C1363c0.m37440f(this.f23649s0.m13456k()));
    }

    public final void m16066zk() {
        this.f23630o1 = this.f23640q1;
        this.f23635p1 = this.f23645r1;
    }

    public final void m16065zl(float f) {
        if (this.f23469B0 != f) {
            this.f23469B0 = f;
            m16480Am();
            View$OnClickListenerC9694y yVar = this.f23464A0;
            if (yVar != null) {
                yVar.setAlpha(f);
            }
            ImageView imageView = this.f23553V1;
            float f2 = 1.0f - f;
            imageView.setTranslationX((-imageView.getMeasuredWidth()) * f2);
            this.f23553V1.setAlpha(f);
            this.f23557W1.setAlpha(f);
            this.f23549U1.setTranslationX((-(C1357a0.m37544i(55.0f) - C1357a0.m37544i(14.0f))) * f2);
        }
    }

    public final void m16064zm(boolean z) {
        this.f23533Q1.m16490j(m16468Ci(), z);
        this.f23525O1.m16490j(m16476Bi(), z);
        this.f23529P1.m16490j(m16460Di(), z);
        if (this.f23537R1 != null) {
            int O = this.f23649s0.m13460g().m13541O();
            String f3 = O != 0 ? HandlerC10770jj.m3593f3(O, TimeUnit.SECONDS, false) : null;
            if (z) {
                this.f23537R1.m9976n(f3, false);
            } else {
                this.f23537R1.m9978l(f3, true);
            }
        }
    }

    public static class C7448r {
        public final AbstractC9323v4<?> f23723a;
        public final int f23724b;
        public AbstractC7459k1 f23725c;
        public final AbstractC7511x f23726d;
        public final AbstractC7513y f23727e;
        public final C8113c f23728f;
        public String f23729g;
        public boolean f23730h;
        public String f23731i;
        public boolean f23732j;
        public String f23733k;
        public boolean f23734l;
        public long f23735m;
        public long f23736n;
        public boolean f23737o;
        public boolean f23738p;
        public TdApi.SearchMessagesFilter f23739q;

        public C7448r(AbstractC9323v4<?> v4Var, int i, AbstractC7459k1 k1Var, AbstractC7511x xVar, AbstractC7513y yVar, C8113c cVar) {
            this.f23723a = v4Var;
            this.f23724b = i;
            this.f23725c = k1Var;
            this.f23726d = xVar;
            this.f23727e = yVar;
            this.f23728f = cVar;
        }

        public static C7448r m16049o(AbstractC9323v4<?> v4Var, AbstractC7459k1 k1Var, AbstractC7511x xVar, AbstractC7513y yVar, C8113c cVar, boolean z) {
            return new C7448r(v4Var, 3, k1Var, xVar, yVar, cVar).m16046r(z);
        }

        public C7448r m16048p(boolean z) {
            this.f23738p = z;
            return this;
        }

        public void m16047q(TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f23739q = searchMessagesFilter;
        }

        public C7448r m16046r(boolean z) {
            this.f23737o = z;
            return this;
        }

        public C7448r m16045s(long j) {
            this.f23735m = j;
            return this;
        }

        public C7448r(AbstractC9323v4<?> v4Var, int i, C8113c cVar) {
            this(v4Var, i, null, null, null, cVar);
        }
    }
}
