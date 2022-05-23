package od;

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
import bd.a;
import ce.a0;
import ce.j0;
import ce.p0;
import de.rh;
import de.y00;
import eb.k;
import gb.c;
import gb.g;
import hd.a5;
import hd.h6;
import hd.i7;
import hd.n5;
import hd.s4;
import hd.t2;
import he.i;
import ie.c0;
import ie.g0;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import je.l0;
import kb.j;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b1;
import ne.f3;
import ne.f4;
import ne.g1;
import ne.j2;
import ne.n0;
import ne.t0;
import ne.z0;
import oc.v0;
import od.b0;
import od.n1;
import od.o;
import od.p1;
import od.r;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.loader.ImageLoader;
import pd.a;
import rd.e;
import sd.f;
import td.b;
import td.c;
import ud.c2;
import ud.d1;
import ud.h1;
import ud.h2;
import ud.v4;
import ud.x2;
import vc.h0;
import vc.q;
import vc.x;
import zd.hj;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.z;

public class j1 extends v4<r> implements j2.d, k.b, View.OnClickListener, od.z, r.a, ld.x, n1.a, b0.b, z0.f, h0.e, x.i, o.b, p1.a, t1.a, h1, Client.g, ud.j1, j2.j, a.AbstractC0060a, z.a, c.a, f.b, b0.c, q.b {
    public static final Interpolator E4 = new OvershootInterpolator(0.97f);
    public static final Interpolator F4 = new OvershootInterpolator(0.82f);
    public static final int[][] G4 = {new int[]{1, 1, R.id.btn_proportion_square, R.drawable.baseline_crop_square_24}, new int[]{3, 2, R.id.btn_proportion_3_2, R.drawable.baseline_crop_5_4_24}, new int[]{4, 3, R.id.btn_proportion_4_3, R.drawable.baseline_crop_3_2_24}, new int[]{16, 9, R.id.btn_proportion_16_9, R.drawable.baseline_crop_16_9_24}};
    public vc.x A0;
    public boolean A2;
    public int A3;
    public i.t A4;
    public float B0;
    public eb.k B1;
    public j2 B2;
    public int B3;
    public i.t B4;
    public boolean C0;
    public FrameLayoutFix C1;
    public boolean C2;
    public int C3;
    public List<i.t> C4;
    public eb.k D0;
    public b0 D1;
    public bd.a D2;
    public int D3;
    public boolean D4;
    public z0 E0;
    public FrameLayoutFix E1;
    public boolean E2;
    public int E3;
    public boolean F0;
    public od.i F1;
    public boolean F2;
    public int F3;
    public boolean G0;
    public od.i G1;
    public qd.b G2;
    public int G3;
    public int H0;
    public View H1;
    public float H2;
    public eb.k H3;
    public qd.b I0;
    public m1 I1;
    public float I2;
    public rd.e I3;
    public s J1;
    public float J2;
    public ld.l J3;
    public float K0;
    public od.i K1;
    public float K2;
    public Bitmap K3;
    public od.i L1;
    public float L2;
    public ld.h L3;
    public float M0;
    public FrameLayoutFix M1;
    public float M2;
    public qd.a M3;
    public boolean N0;
    public LinearLayout N1;
    public float N2;
    public ld.p N3;
    public float O0;
    public od.i O1;
    public float O2;
    public int O3;
    public eb.k P0;
    public od.i P1;
    public float P2;
    public int P3;
    public od.i Q1;
    public float Q2;
    public ld.y Q3;
    public h2 R1;
    public float R2;
    public qd.a R3;
    public eb.k S0;
    public FrameLayoutFix S1;
    public eb.k S2;
    public boolean S3;
    public float T0;
    public LinearLayout T1;
    public boolean T2;
    public boolean T3;
    public boolean U0;
    public View U1;
    public float U2;
    public pd.b U3;
    public boolean V0;
    public ImageView V1;
    public eb.f V2;
    public pd.a V3;
    public float W0;
    public ImageView W1;
    public x W2;
    public pd.d W3;
    public boolean X0;
    public q1 X1;
    public tc.d X2;
    public eb.k Y0;
    public t Y1;
    public u Y2;
    public float Z0;
    public ne.b0 Z1;
    public LinearLayoutManager Z2;
    public boolean Z3;
    public qd.b f19534a1;
    public od.h f19535a2;
    public eb.f f19536a3;
    public float f19537a4;
    public float f19538b1;
    public View f19539b2;
    public boolean f19540b3;
    public eb.k f19541b4;
    public float f19542c1;
    public LinearLayout f19543c2;
    public float f19544c3;
    public int f19545c4;
    public boolean f19546d1;
    public ud.s f19547d2;
    public int f19548d3;
    public pd.c f19549d4;
    public int f19550e1;
    public d1 f19551e2;
    public int f19552e3;
    public pd.c f19553e4;
    public int f19554f1;
    public RecyclerView f19555f2;
    public long f19556f3;
    public Bitmap f19557f4;
    public float f19558g1;
    public od.r f19559g2;
    public boolean f19560g3;
    public int f19561g4;
    public float f19562h1;
    public FrameLayoutFix f19563h2;
    public float f19564h3;
    public float f19565h4;
    public boolean f19566i1;
    public p1 f19567i2;
    public float f19569i4;
    public boolean f19570j1;
    public TextView f19571j2;
    public int f19572j3;
    public boolean f19573j4;
    public eb.k f19574k1;
    public FrameLayoutFix f19575k2;
    public eb.k f19576k3;
    public boolean f19577k4;
    public boolean f19578l1;
    public od.i f19579l2;
    public int f19580l3;
    public boolean f19581l4;
    public eb.k f19582m1;
    public od.i f19583m2;
    public int f19584m3;
    public eb.k f19585m4;
    public boolean f19586n0;
    public float f19587n1;
    public n1 f19588n2;
    public w f19589n3;
    public qd.b f19590n4;
    public int f19591o0;
    public float f19592o1;
    public FrameLayoutFix f19593o2;
    public float f19594o3;
    public int f19595o4;
    public k1 f19596p0;
    public float f19597p1;
    public td.b f19598p2;
    public int f19599p3;
    public int f19600p4;
    public od.x f19601q0;
    public float f19602q1;
    public td.e f19603q2;
    public int f19604q3;
    public sd.f f19605q4;
    public od.y f19606r0;
    public float f19607r1;
    public f3 f19608r2;
    public int f19609r3;
    public sd.f f19610r4;
    public qd.c f19611s0;
    public eb.k f19612s1;
    public ImageView f19613s2;
    public int f19614s3;
    public rd.e f19615s4;
    public TdApi.SearchMessagesFilter f19616t0;
    public float f19617t1;
    public od.i f19618t2;
    public int f19619t3;
    public x2.l f19620t4;
    public long f19621u0;
    public float f19622u1;
    public td.c f19623u2;
    public boolean f19624u3;
    public int f19625u4;
    public eb.k f19626v0;
    public float f19627v1;
    public float f19628v2;
    public eb.k f19629v3;
    public int f19631w0;
    public float f19632w1;
    public eb.k f19633w2;
    public float f19634w3;
    public boolean f19635w4;
    public l1 f19636x0;
    public float f19637x1;
    public boolean f19638x2;
    public od.v f19639x3;
    public int f19640x4;
    public boolean f19641y0;
    public float f19642y1;
    public float f19643y2;
    public od.u f19644y3;
    public int f19645y4;
    public boolean f19646z0;
    public eb.k f19648z2;
    public int f19649z3;
    public float f19650z4;
    public int J0 = -1;
    public Path L0 = new Path();
    public boolean Q0 = true;
    public float R0 = 1.0f;
    public boolean f19647z1 = true;
    public float A1 = 1.0f;
    public int f19568i3 = -1;
    public eb.f X3 = new eb.f(18, this, db.b.f7287b, 140);
    public int Y3 = -1;
    public boolean f19630v4 = true;

    public class a extends View {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !j1.this.f19624u3) {
                return false;
            }
            j1.this.Vl(false);
            return true;
        }
    }

    public class b extends FrameLayoutFix {
        public float M;
        public float N;

        public b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3 && j1.this.f19566i1) {
                        j1.this.f19566i1 = false;
                        return true;
                    }
                } else if (j1.this.f19566i1) {
                    if (Math.max(Math.abs(this.M - motionEvent.getX()), Math.abs(this.N - motionEvent.getY())) < a0.p()) {
                        j1.this.qm();
                    }
                    j1.this.f19566i1 = false;
                    return true;
                }
            } else if (j1.this.Z0 == 1.0f && (j1.this.f19612s1 == null || !j1.this.f19612s1.v())) {
                j1.this.f19566i1 = true;
                this.M = motionEvent.getX();
                this.N = motionEvent.getY();
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public class c extends n0 {
        public c(Context context, o6 o6Var) {
            super(context, o6Var);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return p0.J(this, motionEvent) && super.onTouchEvent(motionEvent);
        }
    }

    public class d extends RecyclerView.o {
        public d() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.set(recyclerView.k0(view) == j1.this.f19644y3.D() + (-1) ? a0.i(4.0f) : 0, a0.i(6.0f), a0.i(4.0f), a0.i(6.0f));
        }
    }

    public class e extends RecyclerView.o {
        public e() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.set(0, recyclerView.k0(view) == 0 ? a0.i(16.0f) : 0, 0, 0);
        }
    }

    public class f implements p1.a {
        public int f19655a = -1;

        public f() {
        }

        @Override
        public boolean A4(p1 p1Var) {
            return true;
        }

        @Override
        public void O2(p1 p1Var, boolean z10) {
            if (!z10) {
                j1.this.f19567i2.b(this.f19655a * (1.0f / (j1.this.C4.size() - 1)));
            }
        }

        @Override
        public void Y0(p1 p1Var, float f10) {
            int round = Math.round(f10 * (j1.this.C4.size() - 1));
            if (this.f19655a != round) {
                this.f19655a = round;
                j1 j1Var = j1.this;
                j1Var.B4 = (i.t) j1Var.C4.get(this.f19655a);
                if (this.f19655a == j1.this.C4.size() - 1 && (j1.this.A4.f13890a.b() || (!j1.this.B4.f13890a.b() && j1.this.B4.f13890a.f13893a < j1.this.A4.f13890a.f13893a))) {
                    j1 j1Var2 = j1.this;
                    j1Var2.B4 = new i.t(j1Var2.A4);
                }
                j1.this.Fm();
            }
        }
    }

    public class g implements b.AbstractC0218b {
        public g() {
        }

        @Override
        public void a(td.b bVar, boolean z10) {
            j1.this.hm();
        }

        @Override
        public void b(td.b bVar, boolean z10) {
            if (z10) {
                he.i.c2().u2(131072L);
            }
        }
    }

    public class h implements a.AbstractC0188a {
        public h() {
        }

        @Override
        public void a() {
            j1.this.Yj();
        }

        @Override
        public void b(float f10) {
            j1.this.ml(f10);
        }
    }

    public class i extends vc.x {
        public i(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, j1.this.B2.getMeasuredHeight());
        }
    }

    public class j extends RecyclerView.t {
        public boolean f19660a;

        public j() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            boolean z10 = true;
            boolean z11 = i10 != 0;
            if (!z11) {
                j1.this.f19560g3 = false;
                if (this.f19660a) {
                    j1.this.C1.requestDisallowInterceptTouchEvent(false);
                }
            }
            this.f19660a = z11;
            j1 j1Var = j1.this;
            if (!z11 || !j1Var.f19560g3) {
                z10 = false;
            }
            j1Var.cm(z10);
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (!j1.this.f19560g3) {
                boolean z10 = false;
                j1.this.f19560g3 = Math.abs(i10) > 1 && this.f19660a;
                j1 j1Var = j1.this;
                if (this.f19660a && j1Var.f19560g3) {
                    z10 = true;
                }
                j1Var.cm(z10);
            }
            if (i10 != 0 && this.f19660a) {
                j1.this.Oh();
            }
        }
    }

    public class k implements a.h {
        public k() {
        }

        @Override
        public void M4() {
        }

        @Override
        public void Q0(int i10, boolean z10) {
        }

        @Override
        public void c6() {
            j1.this.D1.i2();
        }

        @Override
        public void o6() {
            j1.this.D1.j2();
        }
    }

    public class l extends FrameLayoutFix {
        public int M;
        public int N;
        public float O;
        public float P;
        public float Q;
        public float R;
        public float S;
        public float T;
        public boolean U;

        public l(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (j1.this.M0 != 0.0f) {
                float max = Math.max(0.0f, Math.min(1.0f, j1.this.M0));
                boolean z10 = j1.this.L0 != null && !j1.this.F2 && j1.this.H2 == 0.0f && j1.this.I2 == 0.0f && j1.this.f19636x0 != null && j1.this.M0 > 0.0f && j1.this.M0 < 1.0f && !j1.this.f19636x0.f();
                int b10 = z10 ? yd.g.b(canvas, j1.this.L0) : Integer.MIN_VALUE;
                if (j1.this.f19636x0 != null && j1.this.M0 < 1.0f && !j1.this.F2 && j1.this.H2 == 0.0f && j1.this.I2 == 0.0f) {
                    j1.this.f19636x0.c(canvas);
                }
                float f10 = max * (1.0f - j1.this.Z0);
                if (f10 > 0.0f) {
                    canvas.drawColor(((int) (f10 * 255.0f)) << 24);
                }
                if (z10) {
                    yd.g.f(canvas, b10);
                }
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10 = true;
            if (j1.this.S2 != null && j1.this.S2.v()) {
                return true;
            }
            if (j1.this.f19591o0 == 4 || j1.this.C0 || this.U) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.O = motionEvent.getX();
                this.P = motionEvent.getY();
                j1 j1Var = j1.this;
                if (!j1Var.nh() || j1.this.Z0 != 0.0f || j1.this.D1.getCurrentZoom() != 1.0f || !j1.this.D1.Z1()) {
                    z10 = false;
                }
                j1Var.E2 = z10;
            } else if (action == 2) {
                if (j1.this.E2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (Math.abs(this.P - y10) >= a0.q() && Math.abs(this.O - x10) < a0.p() * 1.65f) {
                        j1.this.D1.S1(0, 0.0f);
                        j1.this.E2 = false;
                        this.T = x10;
                        this.S = y10;
                        j1.this.Cl(x10, y10);
                        return true;
                    } else if (Math.abs(this.O - x10) >= a0.r()) {
                        j1.this.E2 = false;
                    }
                } else if (j1.this.F2) {
                    return true;
                } else {
                    if (j1.this.f19566i1) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        if (Math.max(Math.abs(this.O - x11), Math.abs(this.P - y11)) > a0.q()) {
                            j1.this.f19566i1 = false;
                            this.Q = this.O - x11;
                            this.R = this.P - y11;
                            this.O = x11;
                            this.P = y11;
                            j1.this.Ql(true, 0.0f, 0.0f);
                            return true;
                        }
                    } else if (j1.this.f19570j1) {
                        return true;
                    }
                }
            }
            j1.this.D2.a(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int i12;
            j1.this.Dm(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11), true, true);
            super.onMeasure(i10, i11);
            if (j1.this.f19591o0 == 3) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int i13 = this.M;
                if (i13 == 0 || (i12 = this.N) == 0) {
                    this.M = measuredWidth;
                    this.N = measuredHeight;
                } else if (i13 != measuredWidth || i12 != measuredHeight) {
                    this.M = measuredWidth;
                    this.N = measuredHeight;
                    j1 j1Var = j1.this;
                    j1Var.Kk(j1Var.f19649z3);
                }
            }
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            throw new UnsupportedOperationException("Method not decompiled: od.j1.l.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z10) {
            super.requestDisallowInterceptTouchEvent(z10);
            this.U = z10;
        }
    }

    public class m extends ViewOutlineProvider {
        public final int[] f19663a = new int[2];

        public m() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (j1.this.ui(this.f19663a)) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int i10 = measuredWidth / 2;
                int[] iArr = this.f19663a;
                int i11 = measuredHeight / 2;
                outline.setRect(i10 - (iArr[0] / 2), i11 - (iArr[1] / 2), i10 + (iArr[0] / 2), i11 + (iArr[1] / 2));
                return;
            }
            outline.setEmpty();
        }
    }

    public class n extends h0 {
        public boolean f19665y0;

        public n(Context context, o6 o6Var) {
            super(context, o6Var);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (j1.this.A0 != null) {
                j1.this.A0.y2(true);
            }
        }

        @Override
        public void onScrollChanged(int i10, int i11, int i12, int i13) {
            super.onScrollChanged(i10, i11, i12, i13);
            j1.this.C1.requestDisallowInterceptTouchEvent(this.f19665y0);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10 = p0.J(this, motionEvent) && super.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f19665y0 = true;
            } else if (action == 1 || action == 3) {
                this.f19665y0 = false;
            }
            return z10;
        }
    }

    public class o implements TextWatcher {
        public final h0 f19667a;

        public o(h0 h0Var) {
            this.f19667a = h0Var;
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (j1.this.C2) {
                j1.this.C2 = false;
            } else {
                j1.this.f19611s0.g().w0(this.f19667a.d(false));
            }
        }
    }

    public class p extends LinearLayout {
        public p(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return (getVisibility() == 0 && getAlpha() == 1.0f) ? false : true;
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            j1.this.Bh();
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            j1.this.Bh();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return getVisibility() == 0 && getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
        }
    }

    public class q implements f4.c {
        public boolean f19670a;

        public q() {
        }

        @Override
        public void a(f4 f4Var, double d10, double d11, double d12) {
            boolean z10;
            qd.b g10 = j1.this.f19611s0.g();
            if (d11 == 0.0d && d12 == d10) {
                z10 = g10.K().n1(-1L, -1L, (long) (1000000.0d * d10));
            } else {
                z10 = g10.K().n1((long) (d11 * 1000000.0d), (long) (d12 * 1000000.0d), (long) (1000000.0d * d10));
            }
            if (z10) {
                boolean j10 = g10.j();
                od.o T1 = j1.this.D1 != null ? j1.this.D1.T1(j1.this.f19611s0.g()) : null;
                if (T1 != null) {
                    T1.f0(j10);
                    long timeNow = T1.getTimeNow();
                    long timeTotal = T1.getTimeTotal();
                    if (timeNow == -1 || timeTotal == -1) {
                        timeNow = 0;
                        timeTotal = (long) ((d12 - d11) * 1000.0d);
                    }
                    j1.this.X1.A1(timeTotal, timeNow, true, true);
                    return;
                }
                g10.a();
            }
        }

        @Override
        public void b(f4 f4Var, float f10) {
            j1.this.D1.setSeekProgress(f10);
        }

        @Override
        public boolean c(f4 f4Var) {
            return true;
        }

        @Override
        public void d(f4 f4Var, boolean z10) {
            if (z10) {
                boolean z11 = j1.this.f19546d1;
                this.f19670a = z11;
                if (z11) {
                    j1.this.sk();
                }
            } else if (this.f19670a) {
                j1.this.f19611s0.g().t0(j1.this.I1);
            }
        }

        @Override
        public void e(f4 f4Var, double d10, double d11, double d12, int i10, long j10) {
            j1.this.f19611s0.g().K().o1((long) (1000000.0d * d10), d11, d12, i10, j10);
        }
    }

    public static class s extends View {
        public Drawable f19689a = ce.c.g(getResources(), R.drawable.baseline_keyboard_arrow_left_24);
        public boolean f19690b;

        public s(Context context) {
            super(context);
        }

        public void a(boolean z10) {
            if (this.f19690b != z10) {
                this.f19690b = z10;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight = (getMeasuredHeight() / 2) - (this.f19689a.getMinimumHeight() / 2);
            if (this.f19690b) {
                canvas.save();
                canvas.rotate(180.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
                ce.c.b(canvas, this.f19689a, 0.0f, measuredHeight, ce.y.W(-1));
                canvas.restore();
                return;
            }
            ce.c.b(canvas, this.f19689a, 0.0f, measuredHeight, ce.y.W(-1));
        }
    }

    public static class t extends View implements s4.h {
        public Paint M;
        public n5 f19691a;
        public String f19692b;
        public int f19693c;

        public t(Context context) {
            super(context);
            Paint paint = new Paint(5);
            this.M = paint;
            paint.setTypeface(ce.o.i());
            this.M.setTextSize(a0.i(19.0f));
            this.M.setColor(-1);
        }

        @Override
        public void a(boolean z10) {
            n5 n5Var = this.f19691a;
            if (n5Var != null) {
                if (z10) {
                    d(n5Var.J3());
                }
                invalidate();
            }
        }

        public void b() {
            n5 n5Var = this.f19691a;
            if (n5Var != null) {
                n5Var.a9(null);
            }
        }

        public void c(n5 n5Var) {
            if (!n5Var.f6()) {
                this.f19691a = n5Var;
                d(n5Var.J3());
                n5Var.a9(this);
            }
        }

        public final void d(String str) {
            String str2 = this.f19692b;
            if (str2 == null || !str2.equals(str)) {
                this.f19692b = str;
                this.f19693c = (int) v0.T1(str, this.M);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10;
            if (this.f19691a != null) {
                int i11 = a0.i(18.0f);
                int i12 = a0.i(10.0f);
                int i13 = i11 + i12;
                RectF a02 = ce.y.a0();
                int i14 = a0.i(16.0f);
                a0.i(4.0f);
                float f10 = i13 - i12;
                float f11 = i13 + i12;
                a02.set(f10, f10, f11, f11);
                canvas.drawArc(a02, -90.0f, this.f19691a.H3() * (-360.0f), true, ce.y.g(-1));
                canvas.drawText(this.f19692b, i10 + i14, a0.i(35.5f), this.M);
            }
        }
    }

    public static class u extends RecyclerView.h<z> {
        public final Context M;
        public final j1 N;
        public w O;

        public u(Context context, j1 j1Var) {
            this.M = context;
            this.N = j1Var;
        }

        @Override
        public int D() {
            w wVar = this.O;
            if (wVar != null) {
                return wVar.s();
            }
            return 0;
        }

        public void Q(z zVar, int i10) {
            y Q = z.Q(zVar.f2982a);
            w wVar = this.O;
            if (wVar != null) {
                Q.i(wVar.e(i10), this.O);
                int max = Math.max(4, this.N.W2.getChildCount());
                if (i10 >= this.O.s() - max) {
                    this.N.Jj(true, true);
                } else if (i10 - max <= 0) {
                    this.N.Jj(true, false);
                }
            } else {
                Q.i(null, null);
            }
        }

        public z S(ViewGroup viewGroup, int i10) {
            return z.P(this.M, this.N);
        }

        public void V(z zVar) {
            p0.i(z.Q(zVar.f2982a));
        }

        public void W(z zVar) {
            p0.o(z.Q(zVar.f2982a));
        }

        public void g0(w wVar) {
            w wVar2 = this.O;
            if (wVar2 == null) {
                this.O = wVar;
                if (wVar != null) {
                    M(0, wVar.s());
                }
            } else if (wVar == null) {
                int s10 = wVar2.s();
                this.O = null;
                if (s10 > 0) {
                    N(0, s10);
                }
            } else if (wVar2.s() == wVar.s()) {
                this.O = wVar;
                L(0, wVar.s());
            } else {
                int s11 = this.O.s();
                this.O = null;
                N(0, s11);
                this.O = wVar;
                M(0, wVar.s());
            }
        }
    }

    public static class v extends RecyclerView.o {
        public final u f19694a;

        public v(u uVar) {
            this.f19694a = uVar;
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            y Q = z.Q(view);
            qd.b f10 = Q.f();
            w g10 = Q.g();
            int measuredWidth = (recyclerView.getMeasuredWidth() / 2) - (this.f19694a.N.mh() / 2);
            if (g10 == null || f10 == null) {
                int k02 = recyclerView.k0(view);
                if (k02 != -1) {
                    int D = recyclerView.getAdapter().D();
                    if (gd.w.G2()) {
                        rect.left = k02 == D + (-1) ? measuredWidth : 0;
                        if (k02 != 0) {
                            measuredWidth = 0;
                        }
                        rect.right = measuredWidth;
                        return;
                    }
                    rect.left = k02 == 0 ? measuredWidth : 0;
                    if (k02 != D - 1) {
                        measuredWidth = 0;
                    }
                    rect.right = measuredWidth;
                }
            } else if (gd.w.G2()) {
                rect.left = g10.k() == f10 ? measuredWidth : 0;
                if (g10.i() != f10) {
                    measuredWidth = 0;
                }
                rect.right = measuredWidth;
            } else {
                rect.left = g10.i() == f10 ? measuredWidth : 0;
                if (g10.k() != f10) {
                    measuredWidth = 0;
                }
                rect.right = measuredWidth;
            }
        }

        @Override
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != null) {
                    y Q = z.Q(childAt);
                    w g10 = Q.g();
                    qd.b f10 = Q.f();
                    float f11 = 1.0f - this.f19694a.N.f19564h3;
                    if (!(g10 == null || f10 == null)) {
                        float left = Q.getLeft() + (Q.getMeasuredWidth() / 2.0f);
                        int k02 = recyclerView.k0(childAt);
                        if (k02 == -1) {
                            Integer num = (Integer) childAt.getTag();
                            if (num != null) {
                                k02 = num.intValue();
                            } else {
                                k02 = g10.o(f10);
                                childAt.setTag(Integer.valueOf(k02));
                            }
                        } else {
                            childAt.setTag(null);
                        }
                        if (k02 != -1) {
                            float n10 = g10.n(f10, k02, f11);
                            left = gd.w.G2() ? left - n10 : left + n10;
                        }
                        Q.d(canvas, (int) left, a0.i(9.0f), childAt.getAlpha(), f11);
                    }
                }
            }
        }
    }

    public static class w {
        public final u f19695a;
        public final ArrayList<qd.b> f19696b;
        public int f19697c;
        public qd.b f19698d;
        public qd.b f19700f;
        public float f19702h;
        public int f19699e = -1;
        public int f19701g = -1;

        public w(u uVar, ArrayList<qd.b> arrayList, int i10) {
            this.f19695a = uVar;
            this.f19696b = arrayList;
            this.f19697c = i10;
        }

        public static int f(qd.b bVar, int i10, int i11) {
            int i12;
            if (bVar != null) {
                int Z = bVar.Z();
                int A = bVar.A();
                i12 = (int) (Z * (A != 0 ? i11 / A : 1.0f));
            } else {
                i12 = 0;
            }
            return Math.min(Math.max(i10, i12), a0.i(86.0f));
        }

        public void d(ArrayList<qd.b> arrayList, boolean z10, boolean z11) {
            int i10;
            int size = arrayList.size();
            int i11 = 0;
            if (z11) {
                ArrayList<qd.b> arrayList2 = null;
                long j10 = this.f19696b.get(0).getMessage().mediaAlbumId;
                int max = Math.max(1, 10 - this.f19696b.size());
                if (z10) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        qd.b bVar = arrayList.get(size2);
                        if (bVar.getMessage().mediaAlbumId != j10) {
                            break;
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>(max);
                        }
                        arrayList2.add(bVar);
                    }
                } else {
                    Iterator<qd.b> it = arrayList.iterator();
                    while (it.hasNext()) {
                        qd.b next = it.next();
                        if (next.getMessage().mediaAlbumId != j10) {
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
                    if (z10) {
                        this.f19697c += size;
                        return;
                    }
                    return;
                }
            }
            int size3 = arrayList.size();
            if (z10) {
                this.f19697c += size - size3;
            }
            if (z10) {
                arrayList.size();
                this.f19696b.addAll(0, arrayList);
                i10 = 0;
            } else {
                i10 = this.f19696b.size();
                this.f19696b.addAll(arrayList);
            }
            if (this.f19695a.O == this) {
                if (z10) {
                    r(size3);
                }
                this.f19695a.N.Sk();
                this.f19695a.M(i10, size3);
                this.f19695a.I(i10);
                this.f19695a.N.W2.A0();
                j1 j1Var = this.f19695a.N;
                if (z10) {
                    i11 = size3;
                }
                j1Var.Ok(i11);
            }
        }

        public qd.b e(int i10) {
            ArrayList<qd.b> arrayList = this.f19696b;
            if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
                return null;
            }
            return this.f19696b.get(i10);
        }

        public float g() {
            return this.f19702h;
        }

        public float h(qd.b bVar) {
            if (bVar == null) {
                return 0.0f;
            }
            if (bVar == this.f19698d) {
                return this.f19702h;
            }
            if (bVar == this.f19700f) {
                return 1.0f - this.f19702h;
            }
            return 0.0f;
        }

        public qd.b i() {
            return e(0);
        }

        public int j() {
            return this.f19699e;
        }

        public qd.b k() {
            ArrayList<qd.b> arrayList = this.f19696b;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            ArrayList<qd.b> arrayList2 = this.f19696b;
            return arrayList2.get(arrayList2.size() - 1);
        }

        public long l() {
            return this.f19696b.get(0).getMessage().mediaAlbumId;
        }

        public int m() {
            return this.f19701g;
        }

        public float n(qd.b bVar, int i10, float f10) {
            float i11 = a0.i(5.0f);
            float f11 = this.f19702h * f10;
            int i12 = a0.i(43.0f);
            int mh = this.f19695a.N.mh();
            qd.b bVar2 = this.f19698d;
            float f12 = -1.0f;
            float f13 = 0.0f;
            if (!(bVar2 == null || bVar2 == bVar || f11 <= 0.0f)) {
                f13 = 0.0f + ((((f(bVar2, mh, i12) - mh) / 2) + i11) * f11 * (i10 < this.f19699e ? -1.0f : 1.0f));
            }
            qd.b bVar3 = this.f19700f;
            if (bVar3 == null || bVar3 == bVar || f11 >= 1.0f) {
                return f13;
            }
            float f14 = (i11 + ((f(bVar3, mh, i12) - mh) / 2)) * (1.0f - f11);
            if (i10 >= this.f19701g) {
                f12 = 1.0f;
            }
            return f13 + (f14 * f12);
        }

        public int o(qd.b bVar) {
            return this.f19696b.indexOf(bVar);
        }

        public boolean p(int i10, int i11, float f10) {
            if (this.f19699e == i10 && this.f19701g == i11 && this.f19702h == f10) {
                return false;
            }
            this.f19699e = i10;
            this.f19698d = e(i10);
            this.f19701g = i11;
            this.f19700f = e(i11);
            this.f19702h = f10;
            return true;
        }

        public void q(qd.b bVar, int i10, float f10) {
            this.f19698d = bVar;
            this.f19699e = i10;
            this.f19702h = f10;
        }

        public final void r(int i10) {
            int i11 = this.f19699e;
            if (i11 != -1) {
                this.f19699e = i11 + i10;
            }
            int i12 = this.f19701g;
            if (i12 != -1) {
                this.f19701g = i12 + i10;
            }
        }

        public int s() {
            ArrayList<qd.b> arrayList = this.f19696b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        public int t(int i10) {
            int i11;
            ArrayList<qd.b> arrayList = this.f19696b;
            if (arrayList == null || i10 < (i11 = this.f19697c) || i10 >= i11 + arrayList.size()) {
                return -1;
            }
            return i10 - this.f19697c;
        }

        public void u() {
            int i10 = this.f19701g;
            qd.b bVar = this.f19700f;
            this.f19701g = this.f19699e;
            this.f19700f = this.f19698d;
            this.f19699e = i10;
            this.f19698d = bVar;
            this.f19702h = 1.0f - this.f19702h;
        }
    }

    public static class x extends RecyclerView implements Runnable, c.a {
        public final gb.c f19703t1;
        public boolean f19704u1;
        public j1 f19705v1;
        public int f19706w1;

        public x(Context context) {
            super(context);
            gb.c cVar = new gb.c(this);
            this.f19703t1 = cVar;
            cVar.h(true);
        }

        @Override
        public boolean B(float f10, float f11) {
            return gb.b.d(this, f10, f11);
        }

        @Override
        public void C(View view, float f10, float f11) {
            if (!(this.f19705v1.ih() || f11 < 0.0f || f11 > getMeasuredHeight() || this.f19705v1.f19560g3 || this.f19705v1.Ti())) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null) {
                        y Q = z.Q(childAt);
                        qd.b f12 = Q.f();
                        w g10 = Q.g();
                        if (g10 != null && Q.f19707a.i(f10, f11) && this.f19705v1.Vh(f12, g10, g10.o(f12), true)) {
                            db.g.c(this);
                            return;
                        }
                    }
                }
            }
        }

        @Override
        public boolean E4() {
            return gb.b.a(this);
        }

        public final boolean F1() {
            j1 j1Var = this.f19705v1;
            return j1Var != null && !j1Var.D1.a2() && this.f19705v1.U2 == 1.0f && p0.z(this);
        }

        @Override
        public void G(View view, float f10, float f11) {
            gb.b.h(this, view, f10, f11);
        }

        public void G1() {
            this.f19704u1 = true;
        }

        public void H1(j1 j1Var) {
            this.f19705v1 = j1Var;
        }

        @Override
        public void U2(View view, float f10, float f11) {
            gb.b.e(this, view, f10, f11);
        }

        @Override
        public void U4(View view, float f10, float f11) {
            gb.b.f(this, view, f10, f11);
        }

        @Override
        public boolean X6(float f10, float f11) {
            return gb.b.c(this, f10, f11);
        }

        @Override
        public long getLongPressDuration() {
            return gb.b.b(this);
        }

        @Override
        public boolean m0(View view, float f10, float f11) {
            return true;
        }

        @Override
        public void o(View view, float f10, float f11) {
            gb.b.i(this, view, f10, f11);
        }

        @Override
        public void o2(View view, float f10, float f11) {
            gb.b.g(this, view, f10, f11);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent) || (motionEvent.getAction() == 0 && !F1());
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredWidth = getMeasuredWidth();
            if (this.f19706w1 != measuredWidth) {
                this.f19706w1 = measuredWidth;
                post(this);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10 = false;
            if (motionEvent.getAction() == 0 && !F1()) {
                return false;
            }
            boolean z11 = motionEvent.getAction() == 0;
            if (z11 && this.f19705v1.Ti() && !this.f19705v1.Ph()) {
                return false;
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (!z11) {
                boolean z12 = this.f19704u1 || this.f19705v1.ih();
                this.f19704u1 = z12;
                if (z12) {
                    return onTouchEvent;
                }
            }
            this.f19704u1 = false;
            if (this.f19703t1.e(this, motionEvent) || onTouchEvent) {
                z10 = true;
            }
            return z10;
        }

        @Override
        public void run() {
            this.f19705v1.Lk();
        }

        @Override
        public boolean s4(View view, float f10, float f11) {
            return gb.b.k(this, view, f10, f11);
        }

        @Override
        public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
            gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
        }
    }

    public static class y extends View implements ne.a, kb.c, g.a {
        public boolean M = true;
        public int N;
        public int O;
        public int P;
        public ld.c f19707a;
        public w f19708b;
        public qd.b f19709c;

        public y(Context context, RecyclerView recyclerView) {
            super(context);
            this.f19707a = new ld.c(recyclerView, 0);
        }

        @Override
        public void Q2() {
            this.f19707a.b0();
        }

        @Override
        public void a() {
            qd.b bVar = this.f19709c;
            if (bVar != null && bVar.F() == null) {
                this.f19707a.d().G(this.f19709c.T(a0.i(43.0f) + (a0.i(9.0f) * 2), false));
            }
        }

        @Override
        public void b() {
            this.f19707a.b();
            this.M = false;
            qd.b bVar = this.f19709c;
            if (bVar != null) {
                bVar.o(this);
            }
        }

        public void d(Canvas canvas, int i10, int i11, float f10, float f11) {
            h();
            if (this.N != 0 && this.P != 0) {
                w wVar = this.f19708b;
                float h10 = wVar != null ? wVar.h(this.f19709c) * f11 : 0.0f;
                int i12 = this.N;
                int i13 = i12 + ((int) ((this.O - i12) * h10));
                int i14 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i14 != 0) {
                    this.f19707a.V(f10);
                }
                int i15 = i10 - (i13 / 2);
                if (this.f19707a.e0()) {
                    canvas.drawRect(i15, i11, i15 + i13, this.P + i11, ce.y.g(285212671));
                }
                this.f19707a.K0(i15, i11, i13 + i15, this.P + i11);
                this.f19707a.draw(canvas);
                if (i14 != 0) {
                    this.f19707a.Q();
                }
            }
        }

        @Override
        public void e() {
            this.f19707a.e();
            this.M = true;
            qd.b bVar = this.f19709c;
            if (bVar != null) {
                bVar.b(this);
            }
        }

        public qd.b f() {
            return this.f19709c;
        }

        public w g() {
            return this.f19708b;
        }

        public final boolean h() {
            int i10 = a0.i(1.0f);
            int i11 = a0.i(9.0f);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return false;
            }
            int i12 = measuredHeight - (i11 * 2);
            int i13 = measuredWidth - i10;
            int f10 = w.f(this.f19709c, i13, i12);
            if (this.N == i13 && this.O == f10 && this.P == i12) {
                return false;
            }
            this.N = i13;
            this.O = f10;
            this.P = i12;
            return true;
        }

        public void i(qd.b bVar, w wVar) {
            qd.b bVar2 = this.f19709c;
            if (bVar2 != bVar) {
                if (bVar2 != null && this.M) {
                    bVar2.o(this);
                }
                this.f19709c = bVar;
                this.f19708b = wVar;
                this.f19707a.j(bVar.U(), bVar.T(a0.i(43.0f) + (a0.i(9.0f) * 2), false));
                h();
                if (this.M) {
                    bVar.b(this);
                }
                invalidate();
            } else if (this.f19708b != wVar) {
                this.f19708b = wVar;
                invalidate();
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            h();
        }
    }

    public static class z extends RecyclerView.c0 {
        public z(View view) {
            super(view);
        }

        public static z P(Context context, j1 j1Var) {
            y yVar = new y(context, j1Var.W2);
            yVar.setLayoutParams(new RecyclerView.LayoutParams(j1Var.mh(), -1));
            return new z(yVar);
        }

        public static y Q(View view) {
            return (y) view;
        }
    }

    public j1(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Aj(boolean z10, boolean z11, boolean z12, boolean z13, TdApi.MessageSchedulingState messageSchedulingState, boolean z14) {
        Vk(z10, messageSchedulingState, z11, z12);
    }

    public void Bj(ld.h hVar, Bitmap bitmap) {
        ld.h hVar2 = this.L3;
        if (hVar2 == hVar) {
            Zl(hVar2, this.J3, bitmap);
            this.I3.s(this.J3, this.K3.getWidth(), this.K3.getHeight(), this.K3, this.M3, this.J3.t());
            this.I3.setEditorVisible(true);
        }
    }

    public void Cj() {
        if (!Sa() && !this.C0) {
            Dl(true);
        }
    }

    public void Dj(View view, int i10) {
        hm();
    }

    public boolean Ej(View view, int i10) {
        int i11 = 3;
        switch (i10) {
            case R.id.paint_mode_arrow:
                i11 = 2;
                break;
            case R.id.paint_mode_fill:
                int brushColor = this.f19598p2.getPreview().getBrushColor();
                sd.g gVar = new sd.g(3);
                gVar.y(brushColor, 0.0f);
                this.f19605q4.b(gVar);
                this.f19605q4.x(gVar);
                return true;
            case R.id.paint_mode_path:
                i11 = 1;
                break;
            case R.id.paint_mode_rect:
                break;
            case R.id.paint_mode_zoom:
                i11 = 100;
                break;
            default:
                return true;
        }
        Il(i11, true);
        return true;
    }

    public void Fj(qd.b bVar, hj.p pVar) {
        if (this.f19611s0.g() == bVar) {
            int b10 = pVar.b();
            bVar.R0(b10);
            this.R1.setValue(b10 != 0 ? hj.f3(b10, TimeUnit.SECONDS, false) : null);
            if (b10 != 0) {
                Uk();
            }
        }
    }

    public boolean Gj(View view, int i10) {
        if (i10 != R.id.btn_discard) {
            return true;
        }
        wh(0, 2);
        return true;
    }

    public void bj(int i10, Bitmap bitmap) {
        dm(false);
        if (bitmap != null) {
            ld.k A0 = this.f19611s0.g().A0(this.M3);
            this.f24495b.l5().B0(A0, bitmap);
            Zg(A0, bitmap);
            xh(i10);
            return;
        }
        j0.z0("Error while saving changes, sorry", 0);
    }

    public boolean cj(View view, int i10) {
        if (i10 == R.id.btn_crop_reset) {
            Hk(true);
        } else if (i10 == R.id.btn_proportion_free) {
            ll(0, 0);
        } else if (i10 == R.id.btn_proportion_original) {
            int targetWidth = this.V3.getTargetWidth();
            int targetHeight = this.V3.getTargetHeight();
            ll(Math.max(targetWidth, targetHeight), Math.min(targetWidth, targetHeight));
        } else {
            int[] iArr = null;
            int[][] iArr2 = G4;
            int length = iArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                int[] iArr3 = iArr2[i11];
                if (iArr3[2] == i10) {
                    iArr = iArr3;
                    break;
                }
                i11++;
            }
            if (iArr != null) {
                ll(iArr[0], iArr[1]);
            }
        }
        return true;
    }

    public boolean dj() {
        return this.f19645y4 == 0;
    }

    public void ej(View view) {
        if (view.getId() == R.id.btn_sendAsFile) {
            Vk(false, null, false, true);
        }
    }

    public void fj(List list) {
        String str;
        int qh = qh();
        if (qh != 0) {
            boolean z10 = qh == 2;
            od.x xVar = this.f19601q0;
            int S0 = xVar != null ? xVar.S0() : 1;
            if (S0 <= 1) {
                str = gd.w.i1(z10 ? R.string.SendOriginal : R.string.SendAsFile);
            } else {
                str = gd.w.o2(z10 ? R.string.SendXOriginals : R.string.SendAsXFiles, S0);
            }
            list.add(new c0.a((int) R.id.btn_sendAsFile, str, (int) R.drawable.baseline_insert_drive_file_24).j(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    j1.this.ej(view);
                }
            }).g(4096L));
        }
    }

    public void gj(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        Vk(z10, messageSchedulingState, z11, false);
    }

    public void hj(h0 h0Var) {
        if (!this.C2) {
            this.f19611s0.g().w0(h0Var.d(false));
        }
    }

    public static void hk(v4<?> v4Var, TdApi.Chat chat, sc.a aVar) {
        if (ob.a.l(chat.f19908id)) {
            mk(v4Var, v4Var.c().e4(chat.f19908id), aVar);
        } else if (!v4Var.ab()) {
            qd.c cVar = new qd.c(v4Var.t(), v4Var.c());
            cVar.v(new qd.b(v4Var.t(), v4Var.c(), chat.f19908id, chat.photo));
            r rVar = new r(v4Var, 2, cVar);
            if (aVar != null) {
                aVar.j4(chat, rVar);
            }
            qk(v4Var, rVar);
        }
    }

    public void ij(View view) {
        g1 x10 = this.f19611s0.g().x();
        if (x10 != null) {
            x10.W(view);
        }
    }

    public static void ik(v4<?> v4Var, qd.b bVar) {
        if (!v4Var.ab()) {
            boolean z10 = v4Var instanceof sc.a;
            qd.c cVar = null;
            if (z10) {
                cVar = ((sc.a) v4Var).J4(bVar.d(), null);
            }
            if (cVar == null) {
                cVar = new qd.c(v4Var.t(), v4Var.c());
                cVar.v(qd.b.k(bVar));
            }
            r rVar = new r(v4Var, 0, cVar);
            rVar.f19683l = true;
            rVar.f19681j = true;
            if (bVar.e0()) {
                rVar.f19688q = new TdApi.SearchMessagesFilterAnimation();
            }
            if (z10) {
                ((sc.a) v4Var).j4(bVar, rVar);
            }
            qk(v4Var, rVar);
        }
    }

    public void jj(View view) {
        g1 x10 = this.f19611s0.g().x();
        if (x10 != null) {
            x10.W(view);
        }
    }

    public static void jk(a5 a5Var) {
        qd.b V0;
        v4<?> Q0 = a5Var.Q0();
        if (!Q0.ab() && (V0 = qd.b.V0(Q0.t(), Q0.c(), a5Var.X3())) != null) {
            V0.N0(a5Var);
            qd.c cVar = new qd.c(Q0.t(), Q0.c());
            cVar.v(V0);
            r rVar = new r(Q0, 2, cVar);
            rVar.f19683l = true;
            if (Q0 instanceof sc.a) {
                ((sc.a) Q0).j4(a5Var, rVar);
            }
            rVar.f19679h = a5Var.X5();
            qk(Q0, rVar);
        }
    }

    public static float kh(int i10, int i11, float f10, float f11) {
        return ((i10 * (-f11)) + (i11 * f11)) * f10;
    }

    public static void kk(n5 n5Var, long j10) {
        v4<?> Q0 = n5Var.Q0();
        TdApi.Message Y3 = n5Var.Y3(j10);
        qd.b V0 = qd.b.V0(Q0.t(), Q0.c(), Y3);
        if (V0 != null) {
            qd.c cVar = null;
            TdApi.SearchMessagesFilterAnimation searchMessagesFilterAnimation = Y3.content.getConstructor() != 1306939396 ? null : new TdApi.SearchMessagesFilterAnimation();
            if (!Q0.ab()) {
                boolean z10 = Q0 instanceof sc.a;
                if (z10) {
                    cVar = ((sc.a) Q0).J4(Y3.f19946id, searchMessagesFilterAnimation);
                }
                if (cVar == null) {
                    cVar = new qd.c(Q0.t(), Q0.c());
                    cVar.v(V0);
                }
                r rVar = new r(Q0, 0, cVar);
                rVar.f19679h = n5Var.X5();
                if (z10) {
                    ((sc.a) Q0).j4(Y3, rVar);
                }
                rVar.q(searchMessagesFilterAnimation);
                qk(Q0, rVar);
            }
        }
    }

    public static void lj(View view, Rect rect) {
        rect.top += a0.i(8.0f);
        rect.bottom -= a0.i(8.0f);
        rect.left -= a0.i(4.0f);
        rect.right -= a0.i(4.0f);
    }

    public static void lk(h6 h6Var) {
        i7 ga2;
        v4<?> Q0 = h6Var.Q0();
        if (!Q0.ab() && (ga2 = h6Var.ga()) != null) {
            TdApi.WebPage J = ga2.J();
            qd.c cVar = new qd.c(Q0.t(), Q0.c());
            String str = J.displayUrl;
            TdApi.Message X3 = h6Var.X3();
            h6Var.ma();
            ArrayList<qd.b> B = ga2.B();
            if (B != null) {
                cVar.t(ga2.C(), B);
                if (!ib.i.i(J.author)) {
                    str = J.author;
                }
            } else if (J.sticker != null) {
                cVar.v(new qd.b(Q0.t(), Q0.c(), h6Var.I2(), h6Var.K3(), t2.b0(J.sticker), true).P0(X3.chatId, X3.f19946id));
            } else if (J.video != null) {
                cVar.v(new qd.b(Q0.t(), Q0.c(), J.video, new TdApi.FormattedText("", null), true).P0(X3.chatId, X3.f19946id));
            } else if (J.animation != null) {
                cVar.v(new qd.b(Q0.t(), Q0.c(), J.animation, (TdApi.FormattedText) null).P0(X3.chatId, X3.f19946id));
            } else if (J.photo != null) {
                cVar.v(new qd.b(Q0.t(), Q0.c(), h6Var.I2(), h6Var.K3(), J.photo).P0(X3.chatId, X3.f19946id));
            } else {
                return;
            }
            r rVar = new r(Q0, 0, cVar);
            rVar.f19679h = true;
            rVar.f19680i = str;
            rVar.f19682k = J.url;
            rVar.f19681j = true;
            if (Q0 instanceof sc.a) {
                ((sc.a) Q0).j4(h6Var, rVar);
            }
            qk(Q0, rVar);
        }
    }

    public void mj(long j10, TdApi.PhotoSize photoSize) {
        hj.U7(this, j10, photoSize.photo.f19913id, null, qi());
    }

    public static void mk(v4<?> v4Var, TdApi.User user, sc.a aVar) {
        if (!v4Var.ab() && user.profilePhoto != null) {
            qd.c cVar = new qd.c(v4Var.t(), v4Var.c());
            cVar.v(new qd.b(v4Var.t(), v4Var.c(), user.f19979id, user.profilePhoto));
            r rVar = new r(v4Var, 1, cVar);
            if (aVar != null) {
                aVar.j4(user, rVar);
            }
            qk(v4Var, rVar);
        }
    }

    public void nj(final long j10, final TdApi.PhotoSize photoSize) {
        if (photoSize != null) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    j1.this.mj(j10, photoSize);
                }
            });
        }
    }

    public static void oj(kb.j jVar, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        TdApi.ChatPhoto chatPhoto;
        if (basicGroupFullInfo != null && (chatPhoto = basicGroupFullInfo.photo) != null) {
            jVar.a(ob.e.D0(chatPhoto.sizes));
        }
    }

    public static void pj(kb.j jVar, TdApi.UserFullInfo userFullInfo) {
        TdApi.ChatPhoto chatPhoto;
        if (userFullInfo != null && (chatPhoto = userFullInfo.photo) != null) {
            jVar.a(ob.e.D0(chatPhoto.sizes));
        }
    }

    public static j1 pk(n5 n5Var) {
        v4<?> Q0 = n5Var.Q0();
        qd.b V0 = qd.b.V0(Q0.t(), Q0.c(), n5Var.X3());
        if (V0 == null) {
            return null;
        }
        qd.c cVar = new qd.c(Q0.t(), Q0.c());
        cVar.v(V0);
        V0.J0(n5Var);
        return qk(Q0, new r(Q0, 4, cVar));
    }

    public static void qj(kb.j jVar, TdApi.SupergroupFullInfo supergroupFullInfo) {
        TdApi.ChatPhoto chatPhoto;
        if (supergroupFullInfo != null && (chatPhoto = supergroupFullInfo.photo) != null) {
            jVar.a(ob.e.D0(chatPhoto.sizes));
        }
    }

    public static j1 qk(v4<?> v4Var, r rVar) {
        j1 j1Var = new j1(v4Var.t(), v4Var.c());
        j1Var.Xk(rVar);
        j1Var.dk();
        return j1Var;
    }

    public static void rj(o6.m mVar) {
        j0.i(mVar.f28153a, mVar.f28154b ? R.string.CopiedLink : R.string.CopiedLinkPrivate);
    }

    public static void rk(v4<?> v4Var, qd.c cVar, String str, sc.a aVar, boolean z10) {
        if (!v4Var.ab()) {
            r rVar = new r(v4Var, 5, cVar);
            rVar.f19678g = str;
            rVar.f19681j = z10;
            if (aVar != null) {
                aVar.j4(cVar, rVar);
            }
            qk(v4Var, rVar);
        }
    }

    public static int si(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 100 ? R.drawable.baseline_bubble_chart_24 : R.drawable.baseline_zoom_out_map_24 : R.drawable.baseline_crop_3_2_24 : R.drawable.baseline_arrow_upward_24 : R.drawable.baseline_adjust_24;
    }

    public void uj(double d10, double d11, double d12, double d13) {
        if (this.T3) {
            this.f19549d4.r(d10, d11, d12, d13);
        }
    }

    public void vj(boolean z10) {
        this.W3.setRotateInternally(z10);
    }

    public static int wi(int i10) {
        if (i10 == 1) {
            return a0.i(164.0f);
        }
        if (i10 == 2) {
            return a0.i(72.0f);
        }
        if (i10 == 3) {
            return a0.i(64.0f);
        }
        if (i10 != 4) {
            return 0;
        }
        return a0.i(72.0f) + a0.i(24.0f);
    }

    public boolean wj(View view, int i10) {
        if (i10 != R.id.paint_clear) {
            return true;
        }
        rm();
        return true;
    }

    public static int xi(int i10) {
        if (i10 != 2) {
            return 0;
        }
        return a0.o() * 2;
    }

    public boolean xj(View view) {
        rd.e eVar = this.f19615s4;
        if (eVar == null || eVar.getContentWrap().D1()) {
            return false;
        }
        fe(null, new int[]{R.id.paint_clear, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.ClearDrawing), gd.w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new ie.h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view2, int i10) {
                boolean wj;
                wj = j1.this.wj(view2, i10);
                return wj;
            }
        }, qi());
        return true;
    }

    public void yj(td.c cVar, int i10) {
        hm();
    }

    public void zj() {
        x2.l lVar = this.f19620t4;
        if (lVar != null) {
            lVar.U();
        }
    }

    @Override
    public boolean A4(p1 p1Var) {
        return this.f19611s0.g().n0();
    }

    @Override
    public int A9() {
        return 3;
    }

    public final void Ah() {
        sd.f fVar = this.f19605q4;
        bl(fVar != null && !fVar.i());
    }

    public final void Ai(boolean z10) {
        int i10 = this.f19649z3;
        if (i10 != 0) {
            wh(0, (z10 || i10 == 3) ? 0 : 2);
        }
    }

    public final boolean Ak() {
        i.t z12 = he.i.c2().z1();
        this.A4 = z12;
        this.B4 = new i.t(z12);
        return true;
    }

    public final void Al(boolean z10) {
        if (this.T3 != z10) {
            this.T3 = z10;
            if (!z10) {
                Bk(2);
                this.D1.setVisibility(0);
            }
            this.X3.l(z10 ? this.f19549d4.l() ? 160L : 198L : 120L);
            this.X3.p(z10, true);
        }
    }

    public final void Am() {
        fl(gi());
        il(hi());
    }

    @Override
    public int B9() {
        return R.drawable.bg_btn_header_light;
    }

    public final void Bh() {
        z0 z0Var = this.E0;
        float f10 = -((z0Var == null || z0Var.getVisibility() != 0 || this.E0.getParent() == null) ? 0 : this.E0.getMeasuredHeight());
        this.V1.setTranslationY(f10);
        this.W1.setTranslationY(f10);
        this.T1.setTranslationY(f10);
        vc.x xVar = this.A0;
        if (xVar != null) {
            xVar.y2(true);
        }
    }

    public final boolean Bi() {
        pd.c v10 = this.f19611s0.g().v();
        return v10 != null && !v10.l();
    }

    public final void Bk(int i10) {
        if (i10 == 0) {
            this.D1.setDisallowMove(true);
        } else if (i10 == 1) {
            Li();
        } else if (i10 == 3) {
            Mi();
        } else if (i10 == 4) {
            Ni();
        }
    }

    public final void Bl(boolean z10) {
        if (this.X0 != z10) {
            this.X0 = z10;
            this.D1.getBaseCell().getDetector().v();
            this.f19534a1 = this.f19611s0.g();
            if (z10) {
                t().m2(this.B2);
                this.D1.invalidateOutline();
            } else {
                nl(true);
            }
            if (this.Y0 == null) {
                this.Y0 = new eb.k(8, this, db.b.f7287b, 198L, this.Z0);
            }
            this.Y0.i(z10 ? 1.0f : 0.0f);
        }
    }

    public final void Bm() {
        this.f24493a.o3(this.M0 * (1.0f - this.Z0));
    }

    public final void Ch() {
        Fl(Qj());
    }

    public final boolean Ci() {
        qd.a z10 = this.f19611s0.g().z();
        return z10 != null && !z10.k();
    }

    public final void Ck(int i10) {
        if (i10 == 1) {
            RecyclerView recyclerView = this.f19555f2;
            if (recyclerView == null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(t(), 1, false);
                od.r rVar = new od.r(t(), linearLayoutManager);
                this.f19559g2 = rVar;
                rVar.e0(this.M3);
                this.f19559g2.d0(this);
                od.s sVar = new od.s(t());
                this.f19555f2 = sVar;
                sVar.setItemAnimator(null);
                this.f19555f2.setOverScrollMode(2);
                this.f19555f2.g(new e());
                this.f19555f2.setLayoutManager(linearLayoutManager);
                this.f19555f2.setAdapter(this.f19559g2);
                this.f19555f2.setBackgroundColor(ae.j.L(R.id.theme_color_transparentEditor));
                this.f19555f2.setLayoutParams(FrameLayoutFix.r1(-1, wi(1), 80));
                this.f19555f2.setTranslationY(wi(1));
                this.f19555f2.setAlpha(0.0f);
            } else {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).z2(0, 0);
                this.f19559g2.e0(this.M3);
            }
            this.S1.addView(this.f19555f2);
        } else if (i10 == 2) {
            if (this.f19575k2 == null) {
                FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, wi(2), 80);
                FrameLayoutFix frameLayoutFix = new FrameLayoutFix(t());
                this.f19575k2 = frameLayoutFix;
                frameLayoutFix.setPadding(0, a0.i(16.0f), 0, 0);
                this.f19575k2.setBackgroundColor(ae.j.L(R.id.theme_color_transparentEditor));
                this.f19575k2.setLayoutParams(r12);
                this.f19575k2.setAlpha(0.0f);
                od.i iVar = new od.i(t());
                this.f19583m2 = iVar;
                iVar.setId(R.id.btn_rotate);
                this.f19583m2.setOnClickListener(this);
                this.f19583m2.k(R.drawable.baseline_rotate_90_degrees_ccw_24, false, false);
                this.f19583m2.setLayoutParams(FrameLayoutFix.r1(a0.i(56.0f), -1, 5));
                this.f19575k2.addView(this.f19583m2);
                od.i iVar2 = new od.i(t());
                this.f19579l2 = iVar2;
                iVar2.setId(R.id.btn_proportion);
                this.f19579l2.setOnClickListener(this);
                this.f19579l2.k(R.drawable.baseline_image_aspect_ratio_24, false, false);
                this.f19579l2.setLayoutParams(FrameLayoutFix.r1(a0.i(56.0f), -1, 3));
                this.f19575k2.addView(this.f19579l2);
                FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -1);
                q12.leftMargin = a0.i(56.0f);
                q12.rightMargin = a0.i(56.0f);
                n1 n1Var = new n1(t());
                this.f19588n2 = n1Var;
                n1Var.setCallback(this);
                this.f19588n2.setLayoutParams(q12);
                this.f19575k2.addView(this.f19588n2);
                vk();
            }
            this.U3.setAlpha(0.0f);
            wk();
            this.S1.addView(this.f19575k2);
            this.C1.addView(this.U3, Pi());
        } else if (i10 == 3) {
            if (this.f19593o2 == null) {
                FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-1, -1, 80);
                FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(t());
                this.f19593o2 = frameLayoutFix2;
                frameLayoutFix2.setAlpha(0.0f);
                this.f19593o2.setLayoutParams(r13);
                int i11 = a0.i(56.0f);
                int i12 = a0.i(18.0f);
                int i13 = i12 * 2;
                FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(-1, a0.i(12.0f) + i13, 80);
                View view = new View(t());
                view.setBackgroundColor(ae.j.L(R.id.theme_color_transparentEditor));
                view.setLayoutParams(r14);
                this.f19593o2.addView(view);
                FrameLayout.LayoutParams r15 = FrameLayoutFix.r1(a0.i(56.0f), a0.i(48.0f), 83);
                ImageView imageView = new ImageView(t());
                this.f19613s2 = imageView;
                imageView.setId(R.id.paint_undo);
                this.f19613s2.setOnClickListener(this);
                this.f19613s2.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view2) {
                        boolean xj;
                        xj = j1.this.xj(view2);
                        return xj;
                    }
                });
                this.f19613s2.setScaleType(ImageView.ScaleType.CENTER);
                this.f19613s2.setImageResource(R.drawable.baseline_undo_24);
                this.f19613s2.setColorFilter(-1);
                p0.T(this.f19613s2);
                this.f19613s2.setBackgroundResource(R.drawable.bg_btn_header_light);
                this.f19613s2.setLayoutParams(r15);
                this.f19593o2.addView(this.f19613s2);
                FrameLayout.LayoutParams r16 = FrameLayoutFix.r1(a0.i(56.0f), a0.i(48.0f), 85);
                od.i iVar3 = new od.i(t());
                this.f19618t2 = iVar3;
                iVar3.setId(R.id.btn_paintType);
                this.f19618t2.l();
                this.f19618t2.setOnClickListener(this);
                this.f19618t2.k(si(1), false, false);
                this.f19618t2.setLayoutParams(r16);
                this.f19593o2.addView(this.f19618t2);
                FrameLayout.LayoutParams r17 = FrameLayoutFix.r1(-1, a0.i(12.0f) + i13, 81);
                int i14 = i11 - i12;
                r17.rightMargin = i14;
                r17.leftMargin = i14;
                td.b bVar = new td.b(t());
                this.f19598p2 = bVar;
                bVar.setToneEventListener(new g());
                this.f19598p2.setPadding(i12, i12, i12, i12);
                this.f19598p2.setLayoutParams(r17);
                this.f19593o2.addView(this.f19598p2);
                FrameLayout.LayoutParams r18 = FrameLayoutFix.r1(-1, a0.i(220.0f), 80);
                r18.bottomMargin = a0.i(12.0f) + i13;
                td.e eVar = new td.e(t());
                this.f19603q2 = eVar;
                eVar.setAlpha(0.0f);
                this.f19603q2.setLayoutParams(r18);
                this.f19593o2.addView(this.f19603q2);
                f3 f3Var = new f3(t());
                this.f19608r2 = f3Var;
                f3Var.setSimpleTopShadow(true);
                this.f19608r2.setAlpha(0.0f);
                FrameLayout.LayoutParams r19 = FrameLayoutFix.r1(-1, this.f19608r2.getLayoutParams().height, 80);
                r19.bottomMargin = a0.i(220.0f) + a0.i(12.0f) + i13;
                this.f19608r2.setLayoutParams(r19);
                this.f19593o2.addView(this.f19608r2);
                int i15 = a0.i(78.0f);
                FrameLayout.LayoutParams r110 = FrameLayoutFix.r1(-1, a0.i(220.0f) + i12 + i15, 80);
                r110.bottomMargin = a0.i(12.0f) + i12;
                td.a aVar = new td.a(t());
                aVar.setPadding(0, i15, 0, 0);
                aVar.setLayoutParams(r110);
                this.f19593o2.addView(aVar);
                FrameLayout.LayoutParams r111 = FrameLayoutFix.r1(a0.i(48.0f), a0.i(48.0f), 83);
                r111.leftMargin = i11 - (a0.i(48.0f) / 2);
                r111.bottomMargin = ((a0.i(12.0f) + i13) / 2) - (a0.i(48.0f) / 2);
                td.c cVar = new td.c(t());
                this.f19623u2 = cVar;
                cVar.setColorChangeListener(new c.b() {
                    @Override
                    public final void a(td.c cVar2, int i16) {
                        j1.this.yj(cVar2, i16);
                    }
                });
                this.f19623u2.setPositionChangeListener(new c.AbstractC0219c() {
                    @Override
                    public final void a() {
                        j1.this.zj();
                    }
                });
                this.f19623u2.setBrushChangeListener(this);
                this.f19623u2.setTone(this.f19603q2);
                this.f19623u2.setDirection(aVar);
                this.f19623u2.setLayoutParams(r111);
                this.f19593o2.addView(this.f19623u2);
                this.f19603q2.setPreview(this.f19623u2);
                this.f19598p2.setPreview(this.f19623u2);
                this.f19598p2.k(this.f19603q2, this.f19608r2);
                this.f19598p2.setDirection(aVar);
            }
            Il(sd.d.a(), false);
            Ah();
            this.f19623u2.d(true);
            this.S1.addView(this.f19593o2);
        } else if (i10 == 4) {
            if (this.f19563h2 == null) {
                int wi = wi(4);
                int i16 = a0.i(56.0f);
                a0.i(16.0f);
                int i17 = a0.i(18.0f);
                FrameLayoutFix frameLayoutFix3 = new FrameLayoutFix(t());
                this.f19563h2 = frameLayoutFix3;
                frameLayoutFix3.setBackgroundColor(ae.j.L(R.id.theme_color_transparentEditor));
                this.f19563h2.setAlpha(0.0f);
                this.f19563h2.setLayoutParams(FrameLayoutFix.r1(-1, wi, 80));
                p1 p1Var = new p1(t());
                this.f19567i2 = p1Var;
                p1Var.setListener(new f());
                this.f19567i2.setLayoutParams(FrameLayoutFix.s1(-1, i16, 80, 0, 0, 0, i17));
                this.f19567i2.setAnchorMode(0);
                this.f19567i2.setAddPaddingLeft(a0.i(18.0f));
                this.f19567i2.setAddPaddingRight(a0.i(18.0f));
                this.f19567i2.g(R.id.theme_color_white, false);
                this.f19563h2.addView(this.f19567i2);
                TextView I = p0.I(t(), 14.0f, ae.j.L(R.id.theme_color_white), 3, 2);
                I.setLayoutParams(FrameLayoutFix.s1(-2, -2, 51, a0.i(15.0f), a0.i(10.0f), a0.i(15.0f), 0));
                I.setText(R.string.QualityWorse);
                this.f19563h2.addView(I);
                TextView I2 = p0.I(t(), 14.0f, ae.j.L(R.id.theme_color_white), 5, 2);
                I2.setLayoutParams(FrameLayoutFix.s1(-2, -2, 53, a0.i(15.0f), a0.i(10.0f), a0.i(15.0f), 0));
                I2.setText(R.string.QualityBetter);
                this.f19563h2.addView(I2);
                TextView I3 = p0.I(t(), 15.0f, ae.j.L(R.id.theme_color_white), 17, 2);
                this.f19571j2 = I3;
                I3.setLayoutParams(FrameLayoutFix.s1(-2, -2, 81, 0, 0, 0, a0.i(8.0f)));
                this.f19563h2.addView(this.f19571j2);
            }
            this.S1.addView(this.f19563h2);
            Gm();
        }
    }

    public final void Cl(float f10, float f11) {
        this.G2 = this.f19611s0.g();
        this.F2 = true;
    }

    public final void Cm() {
        float f10 = this.A1 * (1.0f - this.f19587n1);
        this.F1.setAlpha(f10);
        this.G1.setAlpha(f10);
        this.I1.setAlpha(f10);
        this.H1.setAlpha(0.7f * f10);
        boolean z10 = true;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        this.F1.setEnabled(i10 == 0);
        this.G1.setEnabled(i10 == 0);
        m1 m1Var = this.I1;
        if (i10 != 0) {
            z10 = false;
        }
        m1Var.setEnabled(z10);
    }

    public final void Dh() {
        x xVar = this.W2;
        if (xVar != null) {
            tc.d dVar = (this.M0 != 1.0f || this.U2 <= 0.0f) ? null : this.X2;
            if (xVar.getItemAnimator() != dVar) {
                this.W2.setItemAnimator(dVar);
            }
        }
    }

    public final boolean Di() {
        sd.f C = this.f19611s0.g().C();
        return C != null && !C.i();
    }

    public final void Dk() {
        if (this.F0) {
            yl(this.G0 || S9());
            Lh(false);
            return;
        }
        fk();
        xl();
    }

    public final void Dl(boolean z10) {
        if (!z10) {
            t().v3(0, true);
        } else if (this.f19591o0 == 4) {
            t().v3(7, true);
        } else {
            t().v3(1, true);
        }
    }

    public final void Dm(int r23, int r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.Dm(int, int, boolean, boolean):void");
    }

    public final void Eh(qd.b bVar, int i10) {
        if (bVar != null && bVar.z() != null && !bVar.z().k()) {
            qd.a z10 = bVar.z();
            bVar.A0(null);
            this.f24495b.l5().y0(ld.k.D0(z10));
        }
    }

    public final boolean Ei() {
        View view = this.U1;
        if (view != null) {
            if (view instanceof TextView) {
                return ((TextView) view).getText().length() > 0;
            }
            if (view instanceof n0) {
                return !ib.i.i(((n0) view).getText());
            }
        }
        return false;
    }

    public final void Ek() {
    }

    public final void El(boolean z10, boolean z11) {
        if (this.f19601q0 != null) {
            int h10 = this.f19611s0.h();
            qd.b g10 = this.f19611s0.g();
            if (!z10) {
                Eh(g10, h10);
            }
            this.f19601q0.b5(h10, g10, z10);
            int S0 = this.f19601q0.S0();
            if (!z10 || S0 != 1) {
                if (S0 != 0 || z10) {
                    this.f19535a2.E(S0);
                } else if (z11) {
                    Sg(0.0f);
                } else {
                    ci(0.0f);
                }
            } else if (z11) {
                Sg(1.0f);
            } else {
                ci(1.0f);
            }
        }
    }

    public final void Em(boolean z10) {
        m1 m1Var = this.I1;
        if (m1Var != null) {
            m1Var.a(z10, this.Z0 > 0.0f && m1Var.getAlpha() > 0.0f);
        }
    }

    @Override
    public boolean F(View view, TdApi.Animation animation) {
        return b1.b(this, view, animation);
    }

    @Override
    public boolean F1(float f10, float f11) {
        return this.Z0 != 0.0f;
    }

    @Override
    public void F4(o6 o6Var, TdApi.Call call) {
        if (call != null && !call.isOutgoing && !t2.G2(call) && !t2.Z2(call)) {
            Nj();
        }
    }

    public final void Fh() {
        if (this.J3 != null) {
            if (this.K3 != null) {
                ld.g.k().m(this.L3, this.K3);
            }
            this.K3 = null;
            this.J3 = null;
        }
    }

    public final boolean Fi() {
        int i10 = this.f19649z3;
        if (i10 == 1) {
            return Hi();
        }
        if (i10 == 2) {
            return Gi();
        }
        if (i10 == 3) {
            return Ii();
        }
        if (i10 != 4) {
            return false;
        }
        return Ji();
    }

    public final void Fk() {
        z0 z0Var = this.E0;
        if (z0Var != null && z0Var.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) this.E0.getParent();
            viewGroup.removeView(this.E0);
            viewGroup.requestLayout();
        }
    }

    public final void Fl(boolean z10) {
        eb.f fVar = this.V2;
        boolean z11 = true;
        if ((fVar != null && fVar.h()) != z10) {
            if (this.V2 == null) {
                this.V2 = new eb.f(21, this, db.b.f7287b, 150L);
            }
            if (z10) {
                Si();
                Xh();
            }
            eb.f fVar2 = this.V2;
            if (this.M0 <= 0.0f) {
                z11 = false;
            }
            fVar2.p(z10, z11);
        } else if (z10 && this.f19591o0 == 0 && !x9().f19681j && this.Y2.O.l() != this.f19611s0.g().getMessage().mediaAlbumId) {
            Xh();
        }
    }

    public final void Fm() {
        int i10;
        StringBuilder sb2;
        double d10;
        if (this.f19571j2 != null) {
            ld.l K = this.f19611s0.g().K();
            int Y0 = K.Y0();
            int L0 = K.L0();
            int U0 = K.U0();
            long R0 = K.R0();
            double W0 = K.W0();
            double V0 = K.V0();
            double T0 = K.T0(true, TimeUnit.MILLISECONDS) / 1000.0d;
            if (!(W0 == 0.0d || V0 == 0.0d)) {
                if (Y0 > L0) {
                    Y0 = (int) Math.max(W0, V0);
                    d10 = Math.min(W0, V0);
                } else {
                    Y0 = (int) Math.min(W0, V0);
                    d10 = Math.max(W0, V0);
                }
                L0 = (int) d10;
            }
            int c10 = this.B4.c(U0);
            i.v d11 = this.B4.d(Y0, L0);
            if (d11 == null) {
                d11 = new i.v(Math.max(Y0, L0), Math.min(Y0, L0));
            }
            long b10 = this.B4.b(d11, c10, R0);
            long j10 = (long) (0 + ((b10 * T0) / 8.0d));
            if (!K.p1()) {
                j10 = (long) (j10 + ((T0 * 62000.0d) / 8.0d));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ce.c0.n(j10, true));
            sb3.append(" • ");
            if (Y0 > L0) {
                sb2 = new StringBuilder();
                sb2.append(d11.f13893a);
                sb2.append("x");
                i10 = d11.f13894b;
            } else {
                sb2 = new StringBuilder();
                sb2.append(d11.f13894b);
                sb2.append("x");
                i10 = d11.f13893a;
            }
            sb2.append(i10);
            sb3.append(sb2.toString());
            sb3.append(" • ");
            sb3.append(c10);
            sb3.append(" FPS");
            sb3.append(" • ");
            sb3.append((b10 + (K.p1() ? 0 : 6200)) / 1000);
            sb3.append(" kbps");
            this.f19571j2.setText(sb3.toString());
        }
    }

    @Override
    public View G9() {
        return this.f19547d2;
    }

    public final void Gh() {
        u uVar = this.Y2;
        if (uVar != null) {
            uVar.g0(null);
            this.W2.setItemAnimator(null);
        }
    }

    public final boolean Gi() {
        return !this.f19553e4.a(this.f19549d4);
    }

    public final void Gk() {
        boolean z10;
        int i10 = this.f19649z3;
        if (i10 == 1) {
            qd.a aVar = this.R3;
            if (aVar != null && this.S3) {
                this.M3.m(aVar);
            }
        } else if (i10 == 2) {
            pd.c cVar = this.f19553e4;
            if (cVar == null || cVar.l()) {
                if (this.f19549d4.j()) {
                    Hk(false);
                }
                this.f19611s0.g().y0(null);
                return;
            }
            if (!this.f19553e4.a(this.f19549d4)) {
                Hk(false);
            }
            this.f19611s0.g().y0(this.f19553e4);
        } else if (i10 == 3) {
            sd.f fVar = this.f19610r4;
            if (fVar == null || fVar.i()) {
                z10 = this.f19611s0.g().E0(null, true);
            } else {
                z10 = this.f19611s0.g().E0(this.f19610r4, true);
            }
            if (z10) {
                this.D1.getBaseReceiver().invalidate();
            }
        } else if (i10 == 4) {
            this.B4 = new i.t(this.A4);
        }
    }

    public final void Gl(float f10) {
        if (this.f19634w3 != f10) {
            this.f19634w3 = f10;
            float max = Math.max(0.0f, Math.min(1.0f, f10));
            this.f19539b2.setAlpha(max);
            this.f19639x3.setAlpha(max);
            float f11 = 1.0f - max;
            fl(f11);
            il(f11 * Math.max(0.0f, Math.min(1.0f, this.f19628v2)));
        }
    }

    public final void Gm() {
        i.t next;
        i.v d10;
        double d11;
        if (this.f19567i2 != null) {
            List<i.t> list = this.C4;
            if (list != null) {
                list.clear();
            } else {
                this.C4 = new ArrayList();
            }
            ld.l K = this.f19611s0.g().K();
            int Y0 = K.Y0();
            int L0 = K.L0();
            double W0 = K.W0();
            double V0 = K.V0();
            if (!(W0 == 0.0d || V0 == 0.0d)) {
                if (Y0 > L0) {
                    Y0 = (int) Math.max(W0, V0);
                    d11 = Math.min(W0, V0);
                } else {
                    Y0 = (int) Math.min(W0, V0);
                    d11 = Math.max(W0, V0);
                }
                L0 = (int) d11;
            }
            Iterator<i.t> it = he.i.c2().t6().iterator();
            int i10 = -1;
            int i11 = -1;
            while (it.hasNext() && (d10 = (next = it.next()).d(Y0, L0)) != null) {
                int abs = Math.abs(this.B4.f13890a.f13893a - d10.f13893a);
                if (i10 == -1 || abs < i11) {
                    i10 = this.C4.size();
                    i11 = abs;
                }
                this.C4.add(next);
            }
            boolean z10 = true;
            if (this.B4.f13890a.b()) {
                i10 = this.C4.size() - 1;
            }
            this.f19567i2.setValueCount(this.C4.size());
            this.f19567i2.setValue(i10 / (this.C4.size() - 1));
            p1 p1Var = this.f19567i2;
            if (this.C4.size() <= 1) {
                z10 = false;
            }
            p1Var.h(z10, false);
            Fm();
        }
    }

    @Override
    public void H2(j2 j2Var) {
        if (this.f19631w0 == 1) {
            this.D1.setPendingOpenAnimator(this.f19626v0);
        } else {
            this.f19626v0.i(1.0f);
        }
    }

    public void Hh() {
        if (this.X0) {
            Mh();
        } else if (this.J0 != -1 || !jc(false)) {
            this.B2.s2(true);
        }
    }

    public final boolean Hi() {
        return this.S3 && !this.R3.b(this.M3);
    }

    public final void Hj() {
        if (this.L0 != null && this.f19636x0 != null) {
            float f10 = this.M0;
            if (f10 > 0.0f && f10 < 1.0f) {
                float max = Math.max(0.0f, Math.min(1.0f, f10));
                this.f19636x0.a();
                int measuredWidth = this.C1.getMeasuredWidth();
                int measuredHeight = this.C1.getMeasuredHeight();
                ld.v baseReceiver = this.D1.getBaseReceiver();
                float min = Math.min(this.f19636x0.t(), this.f19636x0.e()) / 2;
                float sqrt = min + (((((float) Math.sqrt((measuredWidth * measuredWidth) + (measuredHeight * measuredHeight))) * 0.5f) - min) * max);
                RectF a02 = ce.y.a0();
                a02.set(baseReceiver.J0() - sqrt, baseReceiver.x0() - sqrt, baseReceiver.J0() + sqrt, baseReceiver.x0() + sqrt);
                this.L0.reset();
                this.L0.addRoundRect(a02, sqrt, sqrt, Path.Direction.CCW);
            }
        }
    }

    public final void Hk(boolean z10) {
        pd.c cVar;
        pd.c cVar2;
        pd.c cVar3;
        if (!this.f19577k4) {
            uh();
            this.f19565h4 = this.f19549d4.c();
            float c10 = (z10 || (cVar3 = this.f19553e4) == null) ? 0.0f : cVar3.c();
            this.f19569i4 = c10;
            boolean z11 = false;
            this.f19573j4 = c10 - this.f19565h4 != 0.0f;
            int h10 = ((z10 || (cVar2 = this.f19553e4) == null) ? 0 : cVar2.h()) - this.f19549d4.h();
            this.f19545c4 = h10;
            if (h10 < -180) {
                this.f19545c4 = h10 + 360;
            }
            this.f19549d4.o(this.f19545c4);
            this.f19579l2.i(false, true);
            this.f19577k4 = this.f19573j4 || this.f19545c4 != 0;
            this.f19581l4 = !z10;
            if (z10 || (cVar = this.f19553e4) == null || cVar.l()) {
                if (this.V3.n(this.f19577k4, !z10)) {
                    this.f19577k4 = true;
                }
            } else if (this.V3.b(this.f19553e4.d(), this.f19553e4.i(), this.f19553e4.g(), this.f19553e4.b(), true, true)) {
                this.f19577k4 = true;
            }
            if (this.f19581l4 && this.f19577k4) {
                z11 = true;
            }
            this.f19581l4 = z11;
        }
    }

    public final void Hl(float f10) {
    }

    public final void Hm() {
        q1 q1Var = this.X1;
        if (q1Var != null) {
            float f10 = 1.0f;
            float f11 = this.R0 * (1.0f - this.Z0);
            if (this.C0) {
                f10 = 0.0f;
            }
            q1Var.setAlpha(f11 * f10);
        }
    }

    @Override
    public void Ia() {
        super.Ia();
        Jm();
        View view = this.U1;
        if (view instanceof c2) {
            ((c2) view).s();
        }
        LinearLayoutManager linearLayoutManager = this.Z2;
        if (linearLayoutManager != null) {
            linearLayoutManager.B2(gd.w.G2());
        }
        x xVar = this.W2;
        if (xVar != null) {
            xVar.A0();
            Sh(false, false);
        }
    }

    public void Ih() {
        new eb.k(14, this, db.b.f7287b, 180L).i(1.0f);
        this.J0 = 4;
        this.B2.s2(true);
    }

    public final boolean Ii() {
        return !this.f19610r4.e(this.f19605q4);
    }

    public final void Ij() {
        Jj(false, false);
    }

    public final void Ik() {
        this.f19553e4 = null;
    }

    public final void Il(int i10, boolean z10) {
        if (this.f19625u4 != i10) {
            this.f19625u4 = i10;
            if (z10) {
                sd.d.b(i10);
            }
            this.f19618t2.k(si(i10), z10, false);
            dh(i10);
        }
    }

    public final void Im() {
        x xVar = this.W2;
        if (xVar != null) {
            xVar.setAlpha(this.T0 * this.R0 * (1.0f - this.Z0));
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more) {
            jb.c cVar = new jb.c(4);
            u0 u0Var = new u0(4);
            qd.b g10 = this.f19611s0.g();
            TdApi.Chat W2 = this.f24495b.W2(g10.J());
            if (g10.n0() && !g10.e0() && g10.f0()) {
                cVar.a(R.id.btn_open);
                u0Var.a(R.string.OpenInExternalApp);
            }
            if (g10.f0() && g10.h()) {
                cVar.a(R.id.btn_saveToGallery);
                u0Var.a(R.string.SaveToGallery);
            }
            int i11 = this.f19591o0;
            if (i11 != 4 && i11 != 3 && g10.h() && g10.i()) {
                cVar.a(R.id.btn_share);
                u0Var.a(R.string.Share);
            }
            if (g10.e0() && g10.h()) {
                cVar.a(R.id.btn_saveGif);
                u0Var.a(R.string.SaveGif);
            }
            if (!ib.i.i(x9().f19682k) || (W2 != null && this.f24495b.t2(g10.getMessage()))) {
                cVar.a(R.id.btn_copyLink);
                u0Var.a(R.string.CopyLink);
            }
            if (!(g10.J() == 0 || g10.d() == 0 || this.f19591o0 != 0)) {
                cVar.a(R.id.btn_showInChat);
                u0Var.a(R.string.ShowInChat);
            }
            if (g10.g() && (g10.getMessage() != null || this.f19611s0.h() == 0)) {
                cVar.a(R.id.btn_messageReport);
                u0Var.a(R.string.Report);
            }
            boolean z10 = true;
            boolean z11 = this.f19591o0 == 1 && this.f24495b.n7(g10.M());
            if (z11 || this.f19591o0 != 2) {
                z10 = z11;
            } else if (W2 == null || !this.f24495b.m2(W2)) {
                z10 = false;
            }
            if (z11 && this.f19611s0.h() != 0) {
                cVar.a(R.id.btn_setProfilePhoto);
                u0Var.a(R.string.SetAsCurrent);
            }
            if (z10) {
                cVar.a(R.id.btn_deleteProfilePhoto);
                u0Var.a(R.string.Delete);
            }
            if (!cVar.f()) {
                Yd(cVar.e(), u0Var.d(), 0);
            }
        } else if (i10 == R.id.menu_btn_pictureInPicture) {
            Uh();
        }
    }

    public final void Jh() {
        if (!this.C0) {
            return;
        }
        if (this.F0) {
            bi();
        } else {
            ce.x.c(this.U1);
        }
    }

    public final boolean Ji() {
        return !this.B4.equals(this.A4);
    }

    public final void Jj(boolean z10, boolean z11) {
        if (!this.V0 && !x9().f19679h) {
            int i10 = this.f19591o0;
            if (i10 == 0) {
                long J = this.f19611s0.g().J();
                if (J != 0) {
                    if (this.U0) {
                        if (this.f19586n0) {
                            if ((!z10 || !z11) && this.f19611s0.h() < this.f19611s0.i() - 4) {
                                return;
                            }
                        } else if ((!z10 || z11) && this.f19611s0.h() > 4) {
                            return;
                        }
                    }
                    this.V0 = true;
                    qd.b r10 = this.f19586n0 ? this.f19611s0.r() : this.f19611s0.c();
                    Client v42 = this.f24495b.v4();
                    long d10 = r10.d();
                    TdApi.SearchMessagesFilter searchMessagesFilter = this.f19616t0;
                    if (searchMessagesFilter == null) {
                        searchMessagesFilter = new TdApi.SearchMessagesFilterPhotoAndVideo();
                    }
                    v42.o(new TdApi.SearchChatMessages(J, null, null, d10, 0, 40, searchMessagesFilter, this.f19621u0), this);
                }
            } else if (i10 == 1) {
                long U0 = ob.e.U0(this.f19611s0.g().M());
                if (!this.U0 || ((z10 && z11) || this.f19611s0.h() <= this.f19611s0.i() - 4)) {
                    this.V0 = true;
                    this.f24495b.v4().o(new TdApi.GetUserProfilePhotos(U0, this.U0 ? this.f19611s0.i() : 0, 100), this);
                }
            } else if (i10 == 2) {
                long J2 = this.f19611s0.g().J();
                if (!this.U0 || ((z10 && z11) || this.f19611s0.h() <= this.f19611s0.i() - 4)) {
                    this.V0 = true;
                    qd.b r11 = this.f19611s0.r();
                    Client v43 = this.f24495b.v4();
                    long d11 = r11.d();
                    TdApi.SearchMessagesFilter searchMessagesFilter2 = this.f19616t0;
                    if (searchMessagesFilter2 == null) {
                        searchMessagesFilter2 = new TdApi.SearchMessagesFilterChatPhoto();
                    }
                    v43.o(new TdApi.SearchChatMessages(J2, null, null, d11, 0, 100, searchMessagesFilter2, this.f19621u0), this);
                }
            }
        }
    }

    public final void Jk() {
        this.R3 = null;
    }

    public final void Jl(float f10) {
        if (this.A1 != f10) {
            this.A1 = f10;
            Cm();
        }
    }

    public final void Jm() {
        if (this.f19547d2 != null) {
            int Mj = Mj();
            int i10 = a0.i(68.0f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19547d2.getLayoutParams();
            int i11 = gd.w.G2() ? Mj : i10;
            int topOffset = this.f19551e2.x3() ? d1.getTopOffset() : 0;
            if (gd.w.G2()) {
                Mj = i10;
            }
            if (p0.b0(layoutParams, i11, topOffset, Mj, 0)) {
                p0.r0(this.f19547d2);
            }
        }
    }

    public final void Kg(java.util.List<org.drinkless.td.libcore.telegram.TdApi.Message> r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.Kg(java.util.List, int):void");
    }

    public final boolean Kh(int i10) {
        if (this.Z3) {
            this.Z3 = false;
            return false;
        } else if (this.Y3 != -1) {
            return true;
        } else {
            this.Y3 = i10;
            if (!this.f19577k4) {
                Al(false);
            }
            return true;
        }
    }

    public final void Ki() {
        k1 k1Var;
        qd.b g10 = this.f19611s0.g();
        qd.b bVar = this.I0;
        if (bVar == null || bVar != g10) {
            if (!(bVar == null || (k1Var = this.f19596p0) == null)) {
                k1Var.Z1(this.H0, bVar, true);
            }
            this.I0 = g10;
            int h10 = this.f19611s0.h();
            this.H0 = h10;
            k1 k1Var2 = this.f19596p0;
            if (k1Var2 != null) {
                k1Var2.Z1(h10, this.I0, false);
            }
        }
    }

    public final void Kj(ld.h hVar) {
        if (this.Q3 == null) {
            this.Q3 = new ld.y(this);
        }
        ImageLoader.e().l(hVar, this.Q3);
    }

    public final void Kk(int i10) {
        this.D1.p2(ri(i10), xi(i10), vi(i10));
    }

    public final void Kl(boolean z10, boolean z11) {
        if (this.f19647z1 != z10) {
            this.f19647z1 = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                Vg(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            di(f10);
        }
    }

    public final void Km(boolean z10) {
        qd.b g10 = this.f19611s0.g();
        boolean n02 = g10.n0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fm(n02, true, g10.Y(true, timeUnit), timeUnit, z10);
        if (this.f19591o0 != 3) {
            return;
        }
        if (g10.n0()) {
            this.Q1.k(R.drawable.baseline_settings_24, z10, false);
            this.O1.k(R.drawable.baseline_rotate_90_degrees_ccw_24, z10, false);
            this.P1.k(R.drawable.baseline_volume_up_24, z10, g10.p0());
            return;
        }
        this.Q1.k(R.drawable.baseline_tune_24, z10, false);
        this.O1.k(R.drawable.baseline_crop_rotate_24, z10, false);
        this.P1.k(R.drawable.baseline_brush_24, z10, false);
    }

    @Override
    public void L(qd.b bVar, float f10) {
        q1 q1Var;
        if (this.f19611s0.g() == bVar && (q1Var = this.X1) != null) {
            q1Var.G1(f10);
        }
    }

    @Override
    public void L3(boolean z10) {
        this.V3.u(z10 ? 2 : 0, false);
    }

    @Override
    public int L9() {
        return R.id.theme_color_transparentEditor;
    }

    @Override
    public void La() {
        super.La();
        if (this.f19591o0 == 3) {
            Jh();
        }
    }

    public final void tj(org.drinkless.td.libcore.telegram.TdApi.ChatPhotos r20) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.tj(org.drinkless.td.libcore.telegram.TdApi$ChatPhotos):void");
    }

    public final void Lh(boolean z10) {
        if (this.F0) {
            if (this.E0 != null) {
                Fk();
                if (this.G0) {
                    if (z10) {
                        this.E0.P2((t0) this.U1);
                    } else {
                        this.E0.P2((t0) this.U1);
                    }
                }
            }
            this.F0 = false;
            this.V1.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
        }
    }

    public final void Li() {
        vh();
        this.I3.setEditorVisible(false);
        this.I3.q();
        this.I3.setScaleX(1.0f);
        this.I3.setScaleY(1.0f);
    }

    public final int Lj() {
        LinearLayout linearLayout;
        int i10 = (int) (a0.i(56.0f) * this.f19643y2);
        return (this.O0 != 1.0f || (linearLayout = this.T1) == null) ? i10 : i10 + linearLayout.getMeasuredHeight();
    }

    public final void Lk() {
        eb.f fVar;
        if (this.W2 != null && (fVar = this.V2) != null && fVar.h()) {
            th();
            this.W2.A0();
            Sh(false, false);
        }
    }

    public final void Ll(float f10) {
        float f11 = (0.4f * f10) + 0.6f;
        float f12 = this.W0 * f11;
        this.D1.setScaleX(f12);
        this.D1.setScaleY(f12);
        this.D1.setAlpha(f10);
        this.E1.setScaleX(f11);
        this.E1.setScaleY(f11);
        this.E1.setAlpha(f10);
    }

    public final void sj(TdApi.Messages messages) {
        TdApi.Message[] messageArr;
        ArrayList arrayList = new ArrayList(messages.messages.length);
        for (TdApi.Message message : messages.messages) {
            if (!ob.e.i1(message.content)) {
                arrayList.add(message);
            }
        }
        Kg(arrayList, messages.totalCount);
    }

    public final void Mh() {
        this.W0 = this.D1.getScaleX();
        this.J0 = 3;
        this.B2.s2(true);
    }

    public final void Mi() {
        this.f19615s4.setEditorVisible(false);
        qd.b bVar = this.f19590n4;
        if (bVar.E0(bVar.C(), false)) {
            this.D1.getBaseReceiver().invalidate();
        }
        this.f19615s4.q();
        this.f19615s4.setScaleX(1.0f);
        this.f19615s4.setScaleY(1.0f);
        hm();
    }

    public final int Mj() {
        int i10 = a0.i(49.0f);
        if (rh()) {
            i10 += a0.i(49.0f);
        }
        if (oh()) {
            i10 += a0.i(49.0f);
        }
        return sh() ? i10 + a0.i(49.0f) : i10;
    }

    public final void Mk() {
        this.A4 = null;
    }

    public final void Ml(float f10, float f11) {
        if (this.Z0 == f10) {
            return;
        }
        if (!Float.isNaN(f10)) {
            this.Z0 = f10;
            boolean z10 = false;
            Dm(this.D1.getMeasuredWidth(), this.D1.getMeasuredHeight(), false, false);
            this.D1.setTranslationZ(a0.i(1.0f) * f10);
            this.f19534a1.x0(1.0f - f10);
            if (this.D1.getBaseCell().getDetector().z(f11)) {
                this.D1.invalidateOutline();
            }
            b0 b0Var = this.D1;
            if (f10 != 0.0f) {
                z10 = true;
            }
            b0Var.setDisableTouch(z10);
            this.C1.invalidate();
            xm();
            vm();
            Hm();
            Im();
            Bm();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void Ng(ArrayList<qd.b> arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            eb.f fVar = this.V2;
            if (fVar == null || !fVar.h()) {
                Ch();
            } else {
                this.Y2.O.d(arrayList, z10, this.f19591o0 == 0 && !x9().f19681j);
            }
        }
    }

    public final void Nh(int i10) {
        eb.k kVar = this.f19541b4;
        if (kVar == null) {
            this.f19541b4 = new eb.k(19, this, db.b.f7287b, 180L);
        } else if (!kVar.v()) {
            this.f19541b4.l(0.0f);
            this.f19537a4 = 0.0f;
        } else {
            return;
        }
        if (i10 != 0) {
            this.f19549d4.o(i10);
            this.f19545c4 = i10;
            this.f19541b4.i(1.0f);
        }
    }

    public final void Ni() {
    }

    public void Nj() {
        if (!this.X0) {
            sk();
            if (oh()) {
                Uh();
            } else {
                Hh();
            }
        }
    }

    public final void Nk() {
        long w12 = he.i.c2().w1();
        this.f19538b1 = ib.c.m(w12);
        this.f19542c1 = ib.c.n(w12);
    }

    public final void Nl(boolean z10, boolean z11) {
        if (this.f19578l1 != z10) {
            this.f19578l1 = z10;
            if (this.f19582m1 == null) {
                this.f19582m1 = new eb.k(12, this, db.b.f7287b, 180L);
            }
            if (z10) {
                this.J1.a(z11);
            }
            this.f19582m1.i(z10 ? 1.0f : 0.0f);
        }
    }

    @Override
    public void O2(p1 p1Var, boolean z10) {
        if (z10) {
            this.D1.l2();
        } else {
            this.D1.n2(p1Var.getValue());
        }
    }

    @Override
    public void O5(td.c cVar) {
        rd.e eVar = this.f19615s4;
        if (eVar != null) {
            eVar.getContentWrap().G1(cVar.getBrushColor(), cVar.a(li()));
        }
    }

    @Override
    public int O9() {
        return R.id.theme_color_white;
    }

    public final boolean Og() {
        eb.k kVar = this.H3;
        return (kVar == null || !kVar.v()) && !this.f19635w4 && Wi();
    }

    public final void Oh() {
        Sh(true, true);
        if (this.f19599p3 != -1 && this.Y2.O != null) {
            int round = Math.round(this.f19599p3 / mh());
            if (Vh(this.Y2.O.e(round), this.Y2.O, round, false)) {
                this.f19556f3 = SystemClock.uptimeMillis();
            }
        }
    }

    public final void Oi(int i10) {
        if (i10 == 1) {
            Jk();
            this.S1.removeViewInLayout(this.f19555f2);
            this.D1.getBaseCell().removeView(this.I3);
        } else if (i10 == 2) {
            Ik();
            this.S1.removeView(this.f19575k2);
            this.C1.removeView(this.U3);
        } else if (i10 == 3) {
            sd.f fVar = this.f19605q4;
            if (fVar != null) {
                fVar.u(this);
            }
            this.S1.removeView(this.f19593o2);
            this.D1.getBaseCell().removeView(this.f19615s4);
        } else if (i10 == 4) {
            Mk();
            this.S1.removeViewInLayout(this.f19563h2);
        }
    }

    public final void Oj(float f10, float f11, int i10, int i11) {
        this.f19602q1 = this.f19592o1 + f10;
        this.f19607r1 = this.f19597p1 + f11;
        Dm(i10, i11, false, true);
    }

    public final void Ok(int i10) {
        int i11 = this.f19568i3;
        if (i11 != -1) {
            this.f19568i3 = i11 + i10;
            if (this.W2.getMeasuredWidth() <= 0) {
                return;
            }
            if (ih()) {
                this.Z2.z2(this.f19568i3, this.f19572j3);
            } else {
                Sh(false, false);
            }
        }
    }

    public final void Ol(float f10) {
        if (this.f19587n1 != f10) {
            this.f19587n1 = f10;
            Cm();
            this.J1.setAlpha(f10);
        }
    }

    @Override
    public void P0(int i10) {
        y00 y00Var;
        CharSequence charSequence;
        qd.b g10 = this.f19611s0.g();
        CharSequence charSequence2 = null;
        int i11 = 2;
        boolean z10 = true;
        switch (i10) {
            case R.id.btn_copyLink:
                if (!ib.i.i(x9().f19682k)) {
                    j0.i(x9().f19682k, R.string.CopiedLink);
                    return;
                } else if (g10.J() != 0 && this.f24495b.t2(g10.getMessage())) {
                    o6 o6Var = this.f24495b;
                    TdApi.Message message = g10.getMessage();
                    if (this.f19621u0 == 0) {
                        z10 = false;
                    }
                    o6Var.K5(message, false, z10, q0.f19839a);
                    return;
                } else {
                    return;
                }
            case R.id.btn_deleteProfilePhoto:
                int i12 = this.f19591o0;
                if (i12 == 1) {
                    this.f24495b.v4().o(new TdApi.DeleteProfilePhoto(g10.D()), this.f24495b.na());
                } else if (i12 == 2) {
                    this.f24495b.v4().o(new TdApi.SetChatPhoto(g10.J(), null), this.f24495b.na());
                }
                this.J0 = 0;
                Hh();
                return;
            case R.id.btn_messageReport:
                TdApi.Message message2 = g10.getMessage();
                if (message2 != null) {
                    hj.T7(this, g10.J(), new TdApi.Message[]{message2}, null, qi());
                    return;
                }
                final long S0 = ob.e.S0(g10.M());
                final kb.j o0Var = new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        j1.this.nj(S0, (TdApi.PhotoSize) obj);
                    }
                };
                switch (ob.a.d(S0)) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                        this.f24495b.e2().j2(ob.a.p(S0), new kb.j() {
                            @Override
                            public final void a(Object obj) {
                                j1.qj(j.this, (TdApi.SupergroupFullInfo) obj);
                            }
                        });
                        return;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        this.f24495b.e2().F2(this.f24495b.h4(S0), new kb.j() {
                            @Override
                            public final void a(Object obj) {
                                j1.pj(j.this, (TdApi.UserFullInfo) obj);
                            }
                        });
                        return;
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        this.f24495b.e2().Q(ob.a.m(S0), new kb.j() {
                            @Override
                            public final void a(Object obj) {
                                j1.oj(j.this, (TdApi.BasicGroupFullInfo) obj);
                            }
                        });
                        return;
                    default:
                        return;
                }
            case R.id.btn_open:
                if (g10.N() != null) {
                    v0.n2(this, g10.N());
                    return;
                }
                return;
            case R.id.btn_saveGif:
                TdApi.File P = g10.P();
                if (P != null) {
                    this.f24495b.hd().X7(P.f19913id);
                    return;
                }
                return;
            case R.id.btn_saveToGallery:
                TdApi.File P2 = g10.P();
                if (t2.V2(P2)) {
                    String str = P2.local.path;
                    if (!g10.e0()) {
                        i11 = g10.n0() ? 1 : 0;
                    }
                    v0.N(str, i11);
                    return;
                }
                return;
            case R.id.btn_setProfilePhoto:
                this.f24495b.v4().o(new TdApi.SetProfilePhoto(new TdApi.InputChatPhotoPrevious(g10.D())), this.f24495b.na());
                Hh();
                return;
            case R.id.btn_share:
                if (g10.getMessage() != null) {
                    y00Var = new y00(this.f24493a, this.f24495b);
                    if (g10.getMessage().content.getConstructor() != 1989037971) {
                        y00Var.Vi(new y00.m(g10.getMessage()));
                    } else {
                        String str2 = ((TdApi.MessageText) g10.getMessage().content).webPage.displayUrl;
                        y00Var.Vi(new y00.m(g10, str2, str2));
                    }
                } else if (g10.H() != null) {
                    y00Var = new y00(this.f24493a, this.f24495b);
                    int i13 = this.f19591o0;
                    if (i13 != 1) {
                        if (i13 == 2) {
                            long J = this.f19611s0.g().J();
                            String U3 = this.f24495b.U3(J);
                            if (!ib.i.i(U3)) {
                                if (this.f24495b.O6(J)) {
                                    charSequence = gd.w.j1(R.string.ShareTextChannel, U3);
                                } else {
                                    charSequence = gd.w.j1(R.string.ShareTextChat, U3);
                                }
                                String j42 = this.f24495b.j4(J);
                                if (!ib.i.i(j42)) {
                                    charSequence = gd.w.j1(R.string.format_ShareTextSignature, charSequence, this.f24495b.Xc(j42));
                                }
                            }
                        } else if (i13 == 5 && !ob.e.c1(g10.s())) {
                            charSequence2 = t2.q5(g10.s());
                        }
                        charSequence = charSequence2;
                    } else {
                        long U0 = ob.e.U0(this.f19611s0.g().M());
                        String J2 = this.f24495b.e2().J2(U0);
                        charSequence = !ib.i.i(J2) ? gd.w.j1(R.string.ShareTextProfile, J2) : null;
                        String Q2 = this.f24495b.e2().Q2(U0);
                        if (!ib.i.i(Q2)) {
                            charSequence = gd.w.j1(R.string.format_ShareTextSignature, charSequence, this.f24495b.Xc(Q2));
                        }
                    }
                    y00Var.Vi(new y00.m(g10, charSequence2, charSequence));
                } else {
                    return;
                }
                y00Var.ej();
                this.J0 = 0;
                Hh();
                return;
            case R.id.btn_showInChat:
                this.J0 = 0;
                v4<?> F = this.f24493a.Q1().F();
                if (!(F instanceof rh) || F.C9() != g10.J()) {
                    this.f24495b.hd().r7(this, g10.J(), new ob.d(g10.J(), g10.d()), null);
                } else {
                    ((rh) F).Ok(new ob.d(g10.J(), g10.d()));
                }
                Hh();
                return;
            default:
                return;
        }
    }

    public final boolean P3() {
        od.x xVar = this.f19601q0;
        if (xVar == null) {
            return false;
        }
        ArrayList<ld.h> L0 = xVar.L0(false);
        if (L0 != null) {
            Iterator<ld.h> it = L0.iterator();
            while (it.hasNext()) {
                ld.h next = it.next();
                if ((next instanceof ld.l) && ((ld.l) next).D0()) {
                    return true;
                }
            }
            return false;
        } else if (this.f19611s0.g().K().D0()) {
            return true;
        } else {
            return this.f19601q0.P3();
        }
    }

    @Override
    public boolean P4(View view, dd.l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        return b1.c(this, view, lVar, z10, messageSchedulingState);
    }

    public boolean Pg(boolean z10) {
        eb.f fVar = this.f19536a3;
        if (fVar == null || !fVar.h()) {
            return true;
        }
        if (z10) {
            this.W2.C1();
            cm(false);
        }
        return false;
    }

    public final boolean Ph() {
        return false;
    }

    public final int Pi() {
        return this.C1.indexOfChild(this.D1) + 1;
    }

    public final boolean Pj() {
        int i10 = this.f19591o0;
        return i10 == 0 || i10 == 5 || i10 == 2 || i10 == 1;
    }

    public final void Pk() {
        qd.b g10;
        if (this.D1.Z1() && this.D1.d2() && (g10 = this.f19611s0.g()) != null) {
            if (!g10.n0()) {
                Nh(-90);
            } else if (!fd.a.f11885g) {
                j0.p0(18);
            } else {
                eb.k kVar = this.f19585m4;
                if (kVar == null) {
                    this.f19585m4 = new eb.k(18, this, db.b.f7287b, 180L);
                } else if (kVar.v()) {
                    return;
                }
                od.o baseCell = this.D1.getBaseCell();
                g10.v0();
                baseCell.d0(true);
                if (this.f19649z3 == 4) {
                    Fm();
                }
            }
        }
    }

    public final void Pl(float f10) {
        float f11 = this.f19617t1;
        this.f19602q1 = f11 + ((this.f19627v1 - f11) * f10);
        float f12 = this.f19622u1;
        this.f19607r1 = f12 + ((this.f19632w1 - f12) * f10);
        Dm(this.D1.getMeasuredWidth(), this.D1.getMeasuredHeight(), false, false);
    }

    @Override
    public int Q9() {
        return R.id.theme_color_white;
    }

    public boolean Qg() {
        return (this.f19591o0 == 3 && this.f19649z3 == 3 && this.f19625u4 != 100) ? false : true;
    }

    public final void Qh(float f10, float f11) {
        Ql(false, f10, f11);
    }

    public final void Qi() {
        d1 d1Var = this.f19551e2;
        if (d1Var != null) {
            if (this.f19631w0 == 1) {
                d1Var.setTranslationY(-d1.a3(d1Var.x3()));
            } else {
                d1Var.setAlpha(0.0f);
            }
            tl(0.0f);
        }
    }

    public final boolean Qj() {
        if (this.f19611s0.i() <= 1) {
            return false;
        }
        int i10 = this.f19591o0;
        if (i10 == 1 || i10 == 2 || x9().f19681j) {
            return true;
        }
        if (this.f19591o0 != 0) {
            return false;
        }
        qd.b g10 = this.f19611s0.g();
        qd.b m10 = this.f19611s0.m();
        qd.b l10 = this.f19611s0.l();
        TdApi.Message message = g10.getMessage();
        TdApi.Message message2 = null;
        TdApi.Message message3 = m10 != null ? m10.getMessage() : null;
        if (l10 != null) {
            message2 = l10.getMessage();
        }
        if (message == null) {
            return false;
        }
        long j10 = message.mediaAlbumId;
        if (j10 != 0) {
            return (message3 != null && message3.mediaAlbumId == j10) || (message2 != null && message2.mediaAlbumId == j10);
        }
        return false;
    }

    public final void Qk() {
        he.i.c2().r5(this.f19538b1, this.f19542c1);
    }

    public final void Ql(boolean z10, float f10, float f11) {
        if (this.f19570j1 != z10) {
            this.f19570j1 = z10;
            if (z10) {
                zk();
            } else {
                Sj(f10, f11, true);
            }
            Wg(z10);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_mediaView;
    }

    @Override
    public boolean Rd() {
        return this.f19591o0 == 4 || !this.f19611s0.g().h();
    }

    public final void Rg(float f10) {
        if (this.P0 == null) {
            this.P0 = new eb.k(6, this, db.b.f7287b, 150L, this.O0);
        }
        this.P0.i(f10);
    }

    public final void Rh(float f10, float f11, boolean z10) {
        this.F2 = false;
        this.L2 = this.H2;
        this.M2 = this.I2;
        this.N2 = this.D1.getRotation();
        this.O2 = this.J2;
        if (this.L2 != 0.0f || this.M2 != 0.0f) {
            eb.k kVar = this.S2;
            if (kVar == null) {
                this.S2 = new eb.k(15, this, db.b.f7287b, 280L);
            } else {
                kVar.l(0.0f);
            }
            if (z10) {
                double atan2 = Math.atan2(f11, f10);
                float measuredWidth = this.D1.getMeasuredWidth();
                float measuredHeight = this.D1.getMeasuredHeight();
                Math.min(measuredWidth / this.G2.Z(), measuredHeight / this.G2.A());
                double cos = Math.cos(atan2);
                double sin = Math.sin(atan2);
                double d10 = measuredWidth;
                this.P2 = (float) (cos * d10);
                double d11 = measuredHeight;
                this.Q2 = (float) (sin * d11);
                float f12 = this.N2 * 1.5f;
                this.R2 = f12;
                this.P2 += Math.abs(measuredWidth - ((float) (Math.abs(Math.sin(f12) * d10) + Math.abs(Math.cos(this.R2) * d11)))) * Math.signum(this.P2);
                this.Q2 += Math.abs(measuredHeight - ((float) (Math.abs(d10 * Math.cos(this.R2)) + Math.abs(d11 * Math.sin(this.R2))))) * Math.signum(this.Q2);
            } else {
                this.R2 = 0.0f;
                this.Q2 = 0.0f;
                this.P2 = 0.0f;
            }
            this.S2.i(1.0f);
        }
    }

    public final boolean Ri(int i10) {
        if (i10 == 1) {
            return Wi() && xk();
        }
        if (i10 == 2) {
            return Wi() && uk();
        }
        if (i10 == 3) {
            return Wi() && yk();
        }
        if (i10 != 4) {
            return true;
        }
        return Wi() && Ak();
    }

    public final boolean Rj() {
        return this.f19591o0 == 3;
    }

    public final boolean Rk(int i10) {
        int i11 = this.f19649z3;
        if (i11 != 1) {
            if (i11 == 2) {
                if (!this.f19549d4.l()) {
                    Uk();
                }
                this.f19611s0.g().y0(this.f19549d4);
                return false;
            } else if (i11 == 3) {
                if (!this.f19605q4.i()) {
                    Uk();
                }
                if (!this.f19611s0.g().E0(this.f19605q4, true)) {
                    return false;
                }
                this.D1.getBaseReceiver().invalidate();
                return false;
            } else if (i11 != 4) {
                return false;
            } else {
                he.i.c2().u5(this.B4);
                return false;
            }
        } else if (this.M3.k()) {
            ld.k y10 = this.f19611s0.g().y();
            if (y10 != null) {
                this.f24495b.l5().y0(y10.q());
            }
            this.f19611s0.g().A0(null);
            Zg(this.L3, this.K3);
            return false;
        } else {
            Uk();
            dm(true);
            ah(i10);
            return true;
        }
    }

    public final void Rl(float f10) {
        this.D1.setTranslationZ(a0.i(1.0f) + (a0.i(2.0f) * f10));
    }

    public final int S0() {
        od.x xVar = this.f19601q0;
        if (xVar != null) {
            return xVar.S0();
        }
        return 0;
    }

    public final void Sg(float f10) {
        if (this.f19633w2 == null) {
            this.f19633w2 = new eb.k(1, this, new OvershootInterpolator(3.8f), 260L, this.f19628v2);
        }
        this.f19633w2.i(f10);
    }

    public final void Sh(boolean z10, boolean z11) {
        if (this.W2.getMeasuredWidth() > 0) {
            Th(z10, z11, this.Y2.O.j());
        }
    }

    public final void Si() {
        if (this.W2 == null) {
            this.X2 = new tc.d(db.b.f7287b, 140L);
            this.Y2 = new u(t(), this);
            this.Z2 = new LinearLayoutManager(t(), 0, gd.w.G2());
            x xVar = new x(t());
            this.W2 = xVar;
            xVar.k(new j());
            this.W2.setOverScrollMode(2);
            this.W2.H1(this);
            this.W2.g(new v(this.Y2));
            this.W2.setItemAnimator(null);
            this.W2.setBackgroundColor(ae.j.L(R.id.theme_color_transparentEditor));
            this.W2.setLayoutManager(this.Z2);
            this.W2.setAdapter(this.Y2);
            this.W2.setAlpha(0.0f);
            this.W2.setLayoutParams(FrameLayoutFix.r1(-1, (a0.i(9.0f) * 2) + a0.i(43.0f), 80));
            this.W2.setElevation(a0.i(3.0f));
            zh();
            this.C1.addView(this.W2);
        }
    }

    public final void Sj(float r29, float r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.Sj(float, float, boolean):void");
    }

    public final void Sk() {
        int X1 = this.Z2.X1();
        this.f19568i3 = X1;
        View C = this.Z2.C(X1);
        this.f19572j3 = C != null ? this.Z2.Q(C) : 0;
    }

    public final void Sl(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.Sl(float, float):void");
    }

    @Override
    public void T(h0 h0Var, ArrayList<hd.o<?>> arrayList, boolean z10) {
        if (this.A0 == null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, 80);
                i iVar = new i(t());
                this.A0 = iVar;
                iVar.setListener((x.j) this.U1);
                this.A0.setAlpha(this.B0);
                this.A0.setOffsetProvider(this);
                this.A0.setUseDarkMode(true);
                this.A0.setLayoutParams(r12);
            } else {
                return;
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<hd.o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().P(true);
            }
            if (this.A0.getParent() == null) {
                this.B2.addView(this.A0);
            }
        }
        this.A0.r2(this, arrayList, z10, ((h0) this.U1).getInlineSearchContext(), false);
    }

    @Override
    public boolean T4() {
        eb.k kVar = this.H3;
        return (kVar == null || !kVar.v()) && this.T3 && this.V3.d();
    }

    @Override
    public void T6(z0 z0Var, boolean z10) {
    }

    public final void Tg(float f10) {
        if (this.S0 == null) {
            this.S0 = new eb.k(7, this, db.b.f7287b, 150L, this.R0);
        }
        this.S0.i(f10);
    }

    public final void Th(boolean z10, boolean z11, int i10) {
        int i11;
        int i12;
        int X1 = this.Z2.X1();
        int i13 = -1;
        View C = X1 != -1 ? this.Z2.C(X1) : null;
        if (C != null) {
            i11 = gd.w.G2() ? this.W2.getMeasuredWidth() - this.Z2.T(C) : this.Z2.Q(C);
        } else {
            i11 = 0;
        }
        int mh = mh();
        int measuredWidth = (this.W2.getMeasuredWidth() / 2) - (mh / 2);
        if (X1 == -1 || C == null) {
            i12 = -1;
        } else {
            i12 = (-i11) + (mh * X1);
            if (X1 > 0) {
                i12 += measuredWidth;
            }
            if (i12 < 0) {
                i12 = 0;
            }
        }
        if (i10 != -1) {
            int i14 = i10 != 0 ? measuredWidth : 0;
            int m10 = this.Y2.O.m();
            if (m10 != -1) {
                float g10 = this.Y2.O.g();
                if (m10 < i10) {
                    i14 += (int) ((i10 - m10) * mh * (1.0f - g10));
                } else if (m10 > i10) {
                    i14 -= (int) (((m10 - i10) * mh) * (1.0f - g10));
                }
            }
            if (z10 && i12 != -1) {
                int i15 = (mh * i10) - i14;
                if (i10 != 0) {
                    i15 += measuredWidth;
                }
                if (i15 == i12 || z11) {
                    this.f19609r3 = i15 - i12;
                } else {
                    x xVar = this.W2;
                    int i16 = i15 - i12;
                    if (!gd.w.G2()) {
                        i13 = 1;
                    }
                    xVar.scrollBy(i16 * i13, 0);
                }
                i13 = i15;
            } else if (!z11) {
                this.Z2.z2(i10, i14);
            } else {
                this.f19609r3 = 0;
            }
        }
        if (z11) {
            this.f19599p3 = i12;
            this.f19604q3 = i13;
        }
    }

    public final boolean Ti() {
        eb.k kVar = this.f19576k3;
        return kVar != null && kVar.v();
    }

    public final pd.c Tj(boolean z10) {
        pd.c v10 = this.f19611s0.g().v();
        return (v10 != null || !z10) ? v10 : new pd.c();
    }

    public final boolean Tk(int i10, int i11) {
        if (i10 != 2) {
            return false;
        }
        return Kh(i11);
    }

    public final void Tl(int i10, float f10) {
        if (i10 == 0) {
            this.f19650z4 = 1.0f - f10;
            Am();
            this.T1.setAlpha(f10);
            q1 q1Var = this.X1;
            if (q1Var != null) {
                q1Var.setAlpha(f10);
            }
        } else if (i10 == 1) {
            this.f19555f2.setAlpha(ib.h.d(f10));
            this.f19555f2.setTranslationY(wi(1) * (1.0f - f10));
        } else if (i10 == 2) {
            this.f19575k2.setAlpha(f10);
            this.D1.getBaseCell().getImageReceiver().L(1.0f - f10);
        } else if (i10 == 3) {
            this.f19593o2.setAlpha(f10);
        } else if (i10 == 4) {
            this.f19563h2.setAlpha(ib.h.d(f10));
            this.f19563h2.setTranslationY(wi(4) * (1.0f - f10));
        }
    }

    @Override
    public boolean U1(ne.j2 r8, eb.k r9) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.U1(ne.j2, eb.k):boolean");
    }

    @Override
    public int[] U5(vc.q qVar, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
        return vc.q.e(qVar, view, view2, i10, i11, i12, i13, i14, this.C1, this.S1, this.E0);
    }

    public final void Ug(float f10) {
        if (this.f19629v3 == null) {
            this.f19629v3 = new eb.k(2, this, db.b.f7287b, 180L, this.f19634w3);
        }
        this.f19629v3.i(f10);
    }

    public final void Uh() {
        if (this.D1.d2()) {
            Bl(true);
        }
    }

    public final boolean Ui() {
        return this.f19641y0;
    }

    public final sd.f Uj(boolean z10) {
        sd.f C = this.f19611s0.g().C();
        return (C != null || !z10) ? C : new sd.f();
    }

    public final void Uk() {
        if (this.f19601q0 != null && !this.Z1.n()) {
            El(this.Z1.v(), false);
        }
    }

    public final void Ul(ArrayList<ld.h> arrayList) {
        if (this.f19639x3 == null) {
            od.u uVar = new od.u(t(), this);
            this.f19644y3 = uVar;
            uVar.g0(arrayList);
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, a0.i(112.0f) + d1.getTopOffset(), 48);
            od.v vVar = new od.v(t());
            this.f19639x3 = vVar;
            vVar.setPadding(a0.i(2.0f), d1.getTopOffset(), a0.i(2.0f), 0);
            this.f19639x3.setLayoutManager(new LinearLayoutManager(t(), 0, true));
            this.f19639x3.setHasFixedSize(true);
            this.f19639x3.setItemAnimator(new tc.d(db.b.f7287b, 180L));
            this.f19639x3.setClipToPadding(false);
            this.f19639x3.setBackgroundColor(ae.j.L(R.id.theme_color_transparentEditor));
            this.f19639x3.setOverScrollMode(2);
            this.f19639x3.g(new d());
            this.f19639x3.setAlpha(0.0f);
            this.f19639x3.setAdapter(this.f19644y3);
            this.f19639x3.setLayoutParams(r12);
            this.C1.addView(this.f19639x3);
            return;
        }
        this.f19644y3.g0(arrayList);
    }

    public final void Vg(float f10) {
        if (this.B1 == null) {
            this.B1 = new eb.k(10, this, db.b.f7287b, 180L, this.A1);
        }
        this.B1.i(f10);
    }

    public final boolean Vh(qd.b bVar, w wVar, int i10, boolean z10) {
        b0 b0Var;
        if (bVar == null || wVar == null || i10 == -1 || (b0Var = this.D1) == null || b0Var.a2()) {
            return false;
        }
        boolean z11 = wVar.j() != i10;
        if (z11 && z10) {
            wVar.u();
            wVar.q(bVar, i10, wVar.f19702h);
        } else if (wVar.p(i10, -1, wVar.f19702h)) {
            this.W2.invalidate();
        }
        if (z11) {
            this.D1.getBaseCell().H0(bVar, true, a0.i(43.0f) + (a0.i(9.0f) * 2), z10 ? 1.0f : yi());
            this.f19611s0.d(wVar.f19697c + i10);
        }
        if (z10) {
            float f10 = wVar.f19702h;
            wVar.f19702h = 1.0f;
            Sh(true, true);
            wVar.f19702h = f10;
            th();
            this.W2.C1();
            if (this.f19609r3 == 0) {
                Sh(true, false);
                this.W2.invalidate();
            } else {
                this.f19589n3 = wVar;
                this.f19594o3 = wVar.f19702h;
                this.f19580l3 = this.f19609r3;
                this.f19584m3 = 0;
                if (this.f19576k3 == null) {
                    this.f19576k3 = new eb.k(23, this, db.b.f7287b, 180L);
                }
                this.f19576k3.i(1.0f);
            }
        }
        return z11;
    }

    public final boolean Vi() {
        od.x xVar = this.f19601q0;
        return xVar != null && xVar.k(this.f19611s0.h(), this.f19611s0.g());
    }

    public final void Vj() {
    }

    public void Vk(final boolean z10, TdApi.MessageSchedulingState messageSchedulingState, final boolean z11, final boolean z12) {
        if (this.f19606r0 != null) {
            if (messageSchedulingState != null || !x9().f19686o) {
                this.J0 = 0;
                this.D4 = true;
                od.x xVar = this.f19601q0;
                ArrayList<ld.h> L0 = xVar != null ? xVar.L0(true) : null;
                if (L0 == null) {
                    L0 = new ArrayList<>();
                    L0.add(this.f19611s0.g().K());
                } else if (L0.isEmpty()) {
                    L0.add(this.f19611s0.g().K());
                }
                this.f19606r0.H6(L0, new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState), z11, z12);
                dm(true);
                this.B2.s2(true);
                return;
            }
            this.f24495b.hd().L8(this, b(), false, new hj.o() {
                @Override
                public final void a(boolean z13, TdApi.MessageSchedulingState messageSchedulingState2, boolean z14) {
                    j1.this.Aj(z10, z11, z12, z13, messageSchedulingState2, z14);
                }
            }, qi());
        }
    }

    public final void Vl(boolean z10) {
        od.x xVar;
        if (this.f19624u3 != z10) {
            this.f19624u3 = z10;
            if (z10 && (xVar = this.f19601q0) != null) {
                ArrayList<ld.h> L0 = xVar.L0(true);
                Ul(L0);
                if (L0 == null || L0.isEmpty()) {
                    return;
                }
            }
            Ug(z10 ? 1.0f : 0.0f);
        }
    }

    @Override
    public void W5(float f10) {
        this.f19549d4.q(f10);
        this.W3.setDegreesAroundCenter(f10);
    }

    @Override
    public void W6(h0 h0Var, ArrayList<hd.o<?>> arrayList) {
        this.A0.V1(this, arrayList, null);
    }

    @Override
    public int W9() {
        return R.id.menu_photo;
    }

    public final void Wg(boolean z10) {
        if (this.f19574k1 == null) {
            this.f19574k1 = new eb.k(9, this, db.b.f7287b, 180L);
        }
        this.f19574k1.i(z10 ? 1.0f : 0.0f);
    }

    public final void Wh(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.Wh(int):void");
    }

    public final boolean Wi() {
        qd.b g10 = this.f19611s0.g();
        return g10 != null && (g10.K() == null || g10.K().c1());
    }

    public final void Wj() {
        Jh();
    }

    public final void Wk(int i10, boolean z10) {
        this.D1.setDisableAnimations(z10);
        this.f19631w0 = i10;
        long j10 = 0;
        if (i10 == 0) {
            this.f19626v0.B(db.b.f7287b);
            eb.k kVar = this.f19626v0;
            if (this.f19591o0 != 4 && !this.T2) {
                j10 = 180;
            }
            kVar.y(j10);
        } else if (i10 != 1) {
            if (i10 == 3) {
                this.f19626v0.B(db.b.f7287b);
                this.f19626v0.y(190L);
            } else if (i10 == 4) {
                this.f19626v0.B(db.b.f7287b);
                this.f19626v0.y(220L);
            } else if (i10 == 5) {
                this.f19626v0.B(db.b.f7290e);
                this.f19626v0.y(0L);
            }
        } else if ((this.f19591o0 == 3 || z10) && !this.f19641y0) {
            this.f19626v0.B(db.b.f7287b);
            this.f19626v0.y(180L);
        } else {
            this.f19626v0.B(db.b.f7287b);
            this.f19626v0.y(180L);
        }
    }

    public final void Wl(float f10, float f11, float f12, boolean z10, boolean z11) {
        this.H2 = f10;
        this.I2 = f11;
        this.J2 = f12;
        float abs = Math.abs(Math.min(1.0f, f11 / a0.i(125.0f)));
        if (Float.isNaN(abs)) {
            abs = 0.0f;
        }
        if (z10 || abs > this.K2 || z11) {
            Xl(abs);
        }
        this.D1.setTranslationX(f10);
        this.D1.setTranslationY(f11);
        if (!z10) {
            if (f12 == 0.0f || f11 == 0.0f) {
                this.D1.setRotation(0.0f);
            } else {
                this.D1.setRotation(lh(f10, f11, f12));
            }
        }
    }

    @Override
    public void X3(b0 b0Var, float f10) {
        float f11;
        int i10;
        int i11;
        eb.f fVar = this.V2;
        if (fVar != null && fVar.h() && this.Y2.O != null) {
            int h10 = this.f19611s0.h();
            float f12 = 1.0f;
            if (f10 < 0.0f && h10 > 0) {
                i10 = this.Y2.O.t(h10 - 1);
                f11 = f10 + 1.0f;
            } else if (f10 <= 0.0f || (i11 = h10 + 1) >= this.f19611s0.i()) {
                f11 = 1.0f;
                i10 = -1;
            } else {
                i10 = this.Y2.O.t(i11);
                f11 = 1.0f - f10;
            }
            if (i10 != -1) {
                f12 = f11;
            }
            int t10 = this.Y2.O.t(h10);
            if (t10 != -1 && this.Y2.O.p(t10, i10, f12)) {
                Sh(true, false);
                this.W2.invalidate();
            }
        }
    }

    @Override
    public void X5(h0 h0Var, String str) {
        z0 z0Var = this.E0;
        if (z0Var != null) {
            z0Var.r2(str);
        }
    }

    public final void Xg(float f10) {
        if (this.f19648z2 == null) {
            this.f19648z2 = new eb.k(5, this, db.b.f7287b, 150L, this.f19643y2);
        }
        this.f19648z2.i(f10);
    }

    public final void Xh() {
        int i10;
        int i11;
        ArrayList arrayList;
        if (this.f19611s0.i() > 1) {
            qd.b g10 = this.f19611s0.g();
            int i12 = this.f19591o0;
            if (i12 == 1 || i12 == 2 || x9().f19681j) {
                arrayList = new ArrayList(this.f19611s0.i());
                arrayList.addAll(this.f19611s0.f());
                i10 = this.f19611s0.h();
                i11 = 0;
            } else if (this.f19591o0 == 0) {
                arrayList = new ArrayList(10);
                long j10 = this.f19611s0.g().getMessage().mediaAlbumId;
                if (j10 != 0) {
                    i11 = this.f19611s0.h();
                    while (true) {
                        int i13 = i11 - 1;
                        if (i13 < 0 || this.f19611s0.e(i13).getMessage().mediaAlbumId != j10) {
                            break;
                        }
                        i11--;
                    }
                    int i14 = this.f19611s0.i();
                    i10 = -1;
                    for (int i15 = i11; i15 < i14; i15++) {
                        qd.b e10 = this.f19611s0.e(i15);
                        if (e10.getMessage().mediaAlbumId != j10) {
                            break;
                        }
                        if (e10 == g10) {
                            i10 = arrayList.size();
                        }
                        arrayList.add(e10);
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
            if (i11 == -1) {
                throw new IllegalArgumentException();
            } else if (arrayList.isEmpty()) {
                throw new IllegalArgumentException();
            } else if (i10 != -1) {
                w wVar = new w(this.Y2, arrayList, i11);
                wVar.q(g10, i10, 1.0f);
                this.Y2.g0(wVar);
                Sh(false, false);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean Xi() {
        return this.F0;
    }

    public final void Xj() {
        if (this.Y3 != -1) {
            if (this.f19577k4) {
                Yj();
            }
            this.Z3 = true;
            xh(this.Y3);
            this.Y3 = -1;
        }
    }

    public void Xk(r rVar) {
        super.Ad(rVar);
        this.f19591o0 = rVar.f19673b;
        this.f19596p0 = rVar.f19674c;
        this.f19601q0 = rVar.f19675d;
        this.f19606r0 = rVar.f19676e;
        this.f19611s0 = rVar.f19677f;
        this.f19586n0 = rVar.f19683l;
        this.f19616t0 = rVar.f19688q;
        this.f19621u0 = rVar.f19685n;
    }

    public final void Xl(float f10) {
        if (this.K2 != f10) {
            this.K2 = f10;
            gl(1.0f - f10);
            d1 d1Var = this.f19551e2;
            if (d1Var != null) {
                d1Var.setTranslationY((-d1.a3(d1Var.x3())) * this.K2);
            }
            if (this.f19591o0 == 3) {
                pl(1.0f - this.K2);
            } else {
                zh();
            }
        }
    }

    @Override
    public void Y0(p1 p1Var, float f10) {
    }

    public final void Yg(boolean z10) {
        if (z10) {
            this.D1.setVisibility(4);
        } else {
            Xj();
        }
    }

    public void Yh(boolean z10) {
        this.f19646z0 = z10;
        this.J0 = 5;
        this.f19641y0 = true;
    }

    public boolean Yi() {
        return this.f19641y0;
    }

    public final void Yj() {
        this.f19573j4 = false;
        this.f19577k4 = false;
        bh();
        if (this.f19581l4) {
            this.f19581l4 = false;
            Al(false);
        }
    }

    public final void Yk(float f10) {
        int i10 = (int) (this.f19580l3 * f10);
        int i11 = i10 - this.f19584m3;
        if (i10 != 0) {
            this.f19584m3 = i10;
            this.W2.scrollBy(i11 * (gd.w.G2() ? -1 : 1), 0);
        }
        float f11 = this.f19594o3;
        float f12 = f11 + ((1.0f - f11) * f10);
        if (this.f19589n3.f19702h != f12) {
            this.f19589n3.f19702h = f12;
            this.W2.invalidate();
        }
    }

    public final void Yl(float f10) {
        float f11 = this.L2;
        float f12 = f11 + ((this.P2 - f11) * f10);
        float f13 = this.M2;
        float f14 = f13 + ((this.Q2 - f13) * f10);
        boolean z10 = this.R2 != -1.0f;
        Wl(f12, f14, this.O2, z10, false);
        if (z10) {
            b0 b0Var = this.D1;
            float f15 = this.N2;
            b0Var.setRotation(f15 + ((this.R2 - f15) * f10));
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        if (!this.D4 && w9() != null && x9().f19687p && this.f19611s0 != null) {
            for (int i10 = 0; i10 < this.f19611s0.i(); i10++) {
                qd.b e10 = this.f19611s0.e(i10);
                if (e10.K().b1()) {
                    e10.n();
                }
            }
        }
        x xVar = this.W2;
        if (xVar != null) {
            p0.n(xVar);
        }
        t1.b().d(this);
        b0 b0Var = this.D1;
        if (b0Var != null) {
            b0Var.b0();
        }
        t tVar = this.Y1;
        if (tVar != null) {
            tVar.b();
        }
        this.f24495b.F4().c0().w0(this);
        this.f24493a.u2(this, true);
    }

    public final void Zg(ld.h hVar, Bitmap bitmap) {
        this.N3.J(hVar, bitmap, true);
    }

    public final void Zh(float f10) {
        eb.k kVar = this.P0;
        if (kVar != null) {
            kVar.l(f10);
        }
        dl(f10);
    }

    public boolean Zi() {
        return this.M0 == 1.0f;
    }

    public final void Zj() {
    }

    public final void Zk(float f10) {
        if (Ei() || this.f19591o0 == 3) {
            this.T1.setAlpha(this.R0 * f10 * (1.0f - this.Z0));
        }
        q1 q1Var = this.X1;
        if (q1Var != null) {
            q1Var.setAlpha(this.R0 * f10 * (1.0f - this.Z0));
        }
        x xVar = this.W2;
        if (xVar != null) {
            xVar.setAlpha(f10 * this.R0 * (1.0f - this.Z0));
        }
    }

    public final void Zl(ld.h hVar, ld.l lVar, Bitmap bitmap) {
        Fh();
        this.J3 = lVar;
        this.L3 = hVar;
        this.K3 = bitmap;
        if (lVar != null && bitmap != null) {
            ld.g.k().b(hVar, bitmap);
        }
    }

    public final void ah(final int i10) {
        this.I3.m(new rd.a() {
            @Override
            public final void a(Bitmap bitmap) {
                j1.this.bj(i10, bitmap);
            }
        });
    }

    public void ai() {
        if (this.X0) {
            Mh();
        } else {
            this.B2.s2(true);
        }
    }

    public boolean aj() {
        return this.D4;
    }

    public void ak(b0 b0Var, float f10, float f11) {
        boolean z10 = false;
        if (this.X0) {
            Bl(false);
            db.g.c(this.C1);
        } else if (this.f19591o0 != 3 || this.f19649z3 == 0) {
            if (this.f19611s0.g().r0(b0Var, f10, f11) || om()) {
                z10 = true;
            }
            if (!z10 && this.f19591o0 == 3) {
                z10 = nm();
            }
            if (z10) {
                db.g.c(b0Var);
            }
        }
    }

    public final void al(int i10, boolean z10) {
        if (i10 == R.id.btn_adjust) {
            this.Q1.i(z10, true);
        } else if (i10 == R.id.btn_crop) {
            this.O1.i(z10, true);
        } else if (i10 == R.id.btn_paint) {
            this.P1.i(z10, true);
        }
    }

    public final void am(float f10) {
        if (this.U2 != f10) {
            this.U2 = f10;
            yh();
            zh();
            Dh();
            Im();
        }
    }

    @Override
    public long b() {
        od.x xVar = this.f19601q0;
        if (xVar != null) {
            return xVar.b();
        }
        return 0L;
    }

    @Override
    public TdApi.Chat b0(h0 h0Var) {
        long j10 = x9().f19684m;
        if (j10 != 0) {
            return this.f24495b.W2(j10);
        }
        return null;
    }

    @Override
    public boolean b1(h0 h0Var) {
        return true;
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public final void bh() {
        if (this.f19545c4 != 0) {
            this.W3.setBaseRotation(0.0f);
            this.W3.d(1.0f, 1.0f);
            this.W3.c(this.f19545c4);
            this.V3.setRotation(0.0f);
            this.V3.setScaleX(1.0f);
            this.V3.setScaleY(1.0f);
            this.V3.q(this.f19545c4);
            Kk(2);
            this.f19545c4 = 0;
        }
    }

    public final void bi() {
        if (this.F0) {
            Fk();
            this.F0 = false;
            this.V1.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
            xl();
        }
    }

    public final void bk(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.bk(boolean):void");
    }

    public final void bl(boolean z10) {
        if (this.f19630v4 != z10) {
            this.f19630v4 = z10;
            this.f19613s2.setAlpha(z10 ? 1.0f : 0.4f);
            this.f19613s2.setEnabled(z10);
        }
    }

    public final void bm(float f10) {
        if (this.f19564h3 != f10) {
            this.f19564h3 = f10;
            if (this.f19540b3) {
                float f11 = this.f19544c3;
                int i10 = (int) (((f11 - f10) / f11) * this.f19548d3);
                int i11 = i10 - this.f19552e3;
                if (i11 != 0) {
                    this.f19552e3 = i10;
                    this.W2.scrollBy(i11, 0);
                }
            }
            this.W2.invalidate();
        }
    }

    @Override
    public void c0() {
        this.f19626v0 = new eb.k(0, this, db.b.f7287b, 180L);
        Dl(true);
        Vj();
        l1 oi = oi();
        if (oi == null || this.f19646z0) {
            this.f19636x0 = null;
            if (this.f19641y0 || this.f19646z0) {
                Wk(5, true);
            } else {
                Wk(0, true);
                this.D1.setAlpha(0.0f);
            }
        } else {
            this.f19636x0 = oi;
            Wk(1, true);
            this.D1.r2(oi, 0.0f);
            Ki();
            if (this.f19591o0 == 3) {
                pl(0.0f);
            }
        }
        Qi();
    }

    @Override
    public boolean c5() {
        return ib.i.i(((TextView) this.U1).getText());
    }

    public final void ch(boolean z10) {
    }

    public final void ci(float f10) {
        eb.k kVar = this.f19633w2;
        if (kVar != null) {
            kVar.l(f10);
        }
        this.f19628v2 = -1.0f;
        jl(f10);
    }

    public void ck() {
        if (this.f19591o0 == 3 && this.f19649z3 == 3) {
            this.f19615s4.getContentWrap().A1();
        }
    }

    public final void cl(String str, l0[] l0VarArr) {
        View view = this.U1;
        if (view instanceof TextView) {
            ((TextView) view).setText(id.d.z().I(str));
        } else if (view instanceof n0) {
            ((n0) view).y(str, l0VarArr, false);
        }
    }

    public final void cm(boolean z10) {
        int i10;
        eb.f fVar = this.f19536a3;
        boolean z11 = fVar != null && fVar.h();
        boolean z12 = z10 && !Ti();
        if (z11 != z12) {
            if (this.f19536a3 == null) {
                this.f19536a3 = new eb.f(22, this, db.b.f7287b, 140L);
            }
            this.f19540b3 = false;
            if (!z12) {
                this.f19556f3 = 0L;
                float g10 = this.f19536a3.g();
                Sh(true, true);
                if (g10 == 0.0f || (i10 = this.f19609r3) == 0) {
                    Sh(true, false);
                } else if (i10 != 0) {
                    this.f19540b3 = true;
                    this.f19544c3 = g10;
                    this.f19548d3 = i10;
                    this.f19552e3 = 0;
                }
            } else {
                th();
                this.W2.G1();
            }
            this.f19536a3.p(z12, true);
        }
    }

    @Override
    public void d0(ld.h hVar, boolean z10, Bitmap bitmap) {
        if (z10) {
            ol(hVar, bitmap);
        }
    }

    public final void dh(int i10) {
        rd.e eVar = this.f19615s4;
        if (eVar != null) {
            eVar.setPaintingMode(i10);
        }
    }

    public final void di(float f10) {
        eb.k kVar = this.B1;
        if (kVar != null) {
            kVar.l(f10);
        }
        Jl(f10);
    }

    public void dk() {
        get();
        this.B2.L2(this.C1, this);
    }

    public final void dl(float f10) {
        if (this.O0 != f10) {
            this.O0 = f10;
            this.T1.setAlpha(f10 * this.R0);
        }
    }

    public void dm(boolean z10) {
        this.f19635w4 = z10;
    }

    @Override
    public void e2() {
        View view = this.U1;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void eh() {
        float f10 = this.Z0;
        if (f10 == 0.0f) {
            t().M1(this.B2);
            rl(true);
            Dl(true);
            this.f19534a1 = null;
        } else if (f10 == 1.0f) {
            rl(false);
            Dl(false);
            nl(false);
        }
    }

    public final void ei(float f10) {
        eb.k kVar = this.f19648z2;
        if (kVar != null) {
            kVar.l(f10);
        }
        em(f10);
    }

    public final void ek() {
        if (this.f19649z3 != 2) {
            wh(2, 1);
        }
    }

    public final void el(boolean z10, boolean z11) {
        if (this.N0 != z10) {
            this.N0 = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                Rg(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            Zh(f10);
        }
    }

    public final void em(float f10) {
        if (this.f19643y2 != f10) {
            this.f19643y2 = f10;
            yh();
            q1 q1Var = this.X1;
            if (q1Var != null) {
                q1Var.setInnerAlpha(f10);
            }
        }
    }

    public final void fh() {
        this.f19538b1 = this.f19637x1;
        this.f19542c1 = this.f19642y1;
        this.f19607r1 = 0.0f;
        this.f19602q1 = 0.0f;
        Qk();
    }

    public final CharSequence fi() {
        int i10;
        String str = x9().f19680i;
        if (!ib.i.i(str)) {
            return str;
        }
        qd.b g10 = this.f19611s0.g();
        String J0 = g10.f() != 0 ? gd.w.J0(g10.f(), TimeUnit.SECONDS) : null;
        int i11 = this.f19591o0;
        if (i11 == 0) {
            String ii = ii(g10);
            if (ii == null) {
                return J0 != null ? J0 : "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ii);
            spannableStringBuilder.setSpan(gd.w.d2(je.g.M0(ii)), 0, ii.length(), 33);
            if (J0 != null) {
                spannableStringBuilder.append(' ');
                spannableStringBuilder.append((CharSequence) J0);
            }
            return spannableStringBuilder;
        } else if (i11 != 1 && i11 != 2) {
            return i11 != 5 ? "" : ib.i.D(x9().f19678g);
        } else {
            if (J0 != null) {
                return this.f19611s0.k() != 1 ? gd.w.j1(R.string.format_mediaIndexAndTime, zi(), J0) : J0;
            }
            if (i11 == 2) {
                i10 = this.f24495b.O6(this.f19611s0.g().J()) ? R.string.ChannelPhoto : R.string.GroupPhoto;
            } else {
                i10 = R.string.ProfilePhoto;
            }
            return this.f19611s0.k() != 1 ? zi() : gd.w.i1(i10);
        }
    }

    public final void fk() {
        if (!this.F0) {
            z0 z0Var = this.E0;
            if (z0Var == null) {
                z0 z0Var2 = new z0(t());
                this.E0 = z0Var2;
                z0Var2.Z1(this, false, this, this, false);
                this.E0.setLayoutParams(FrameLayoutFix.r1(-1, -2, 80));
                this.S1.addView(this.E0);
                this.B2.getViewTreeObserver().addOnPreDrawListener(this.E0);
            } else if (z0Var.getParent() == null) {
                this.S1.addView(this.E0);
            }
            boolean S9 = S9();
            this.G0 = S9;
            this.F0 = true;
            if (S9) {
                this.V1.setImageResource(R.drawable.baseline_keyboard_24);
                this.E0.Y1((t0) this.U1);
                return;
            }
            this.V1.setImageResource(R.drawable.baseline_direction_arrow_down_24);
        }
    }

    public final void fl(float f10) {
        this.Z1.setAlpha(f10);
        this.Z1.setEnabled(f10 == 1.0f);
        LinearLayout linearLayout = this.f19543c2;
        if (linearLayout != null) {
            linearLayout.setAlpha(f10);
        }
    }

    public final void fm(boolean z10, boolean z11, long j10, TimeUnit timeUnit, boolean z12) {
        long j11;
        long j12;
        long j13;
        long j14;
        if (this.X1 != null) {
            b0 b0Var = this.D1;
            od.o T1 = b0Var != null ? b0Var.T1(this.f19611s0.g()) : null;
            float f10 = 1.0f;
            boolean z13 = false;
            if (this.f19638x2 != z10) {
                this.f19638x2 = z10;
                if (z10) {
                    if (!z11 || T1 == null) {
                        j14 = -1;
                        j13 = -1;
                    } else {
                        j13 = T1.getTimeNow();
                        j14 = T1.getTimeTotal();
                    }
                    if ((j13 == -1) || (j14 == -1)) {
                        this.X1.A1(timeUnit.toMillis(j10), 0L, z11, z12 && this.f19643y2 != 0.0f);
                    } else {
                        this.X1.A1(j14, j13, z11, z12 && this.f19643y2 != 0.0f);
                    }
                    this.X1.setFile(this.f19611s0.g().K());
                    boolean z14 = z11 && (this.f19611s0.g().e0() || (this.M0 < 1.0f && !qd.b.c0(this.f19611s0.g().X())));
                    this.X1.D1(z14, z12 && this.f19643y2 != 0.0f);
                    if (z14 && this.M0 < 1.0f) {
                        q1 q1Var = this.X1;
                        if (z12 && this.f19643y2 != 0.0f) {
                            z13 = true;
                        }
                        q1Var.B1(true, z13);
                        Em(true);
                    }
                }
                if (z12) {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    Xg(f10);
                    return;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                ei(f10);
            } else if (z10) {
                if (!z11 || T1 == null) {
                    j12 = -1;
                    j11 = -1;
                } else {
                    j11 = T1.getTimeNow();
                    j12 = T1.getTimeTotal();
                }
                if (j11 == -1 || j12 == -1) {
                    this.X1.A1(timeUnit.toMillis(j10), 0L, z11, z12);
                } else {
                    this.X1.A1(j12, j11, z11, z12);
                }
                this.X1.setFile(this.f19611s0.g().K());
                if (z11 && (this.f19611s0.g().e0() || this.M0 < 1.0f)) {
                    z13 = true;
                }
                this.X1.D1(z13, z12);
                if (!z13) {
                    return;
                }
                if (this.M0 < 1.0f || this.f19611s0.g().a0()) {
                    this.X1.B1(true, z12);
                    Em(true);
                }
            }
        }
    }

    @Override
    public void g(qd.b bVar, long j10, long j11, float f10) {
        q1 q1Var;
        if (this.f19611s0.g() == bVar && (q1Var = this.X1) != null) {
            q1Var.H1(j10, j11, f10);
        }
    }

    @Override
    public void g9(int i10, int i11, int i12, int i13) {
        boolean z10 = this.f19619t3 != i13;
        this.f19619t3 = i13;
        if (this.f19591o0 == 3 && this.f19641y0) {
            if (i13 > a0.n()) {
                i13 = 0;
            }
            hl(i13);
            int vi = vi(2);
            p0.S(this.W3, vi);
            pd.a aVar = this.V3;
            if (aVar != null) {
                aVar.setOffsetBottom(vi);
            }
        }
        b0 b0Var = this.D1;
        if (b0Var != null) {
            if (z10) {
                b0Var.setOffsetBottom(vi(this.f19649z3));
            }
            this.D1.h2();
        }
    }

    public final void gh() {
        Dl(true);
        Oi(this.A3);
        int i10 = this.f19649z3;
        if (i10 == 0) {
            this.D1.setDisallowMove(false);
        } else if (i10 == 1) {
            im();
        } else if (i10 == 2) {
            Al(true);
        } else if (i10 == 3) {
            jm();
        }
    }

    public final float gi() {
        float f10 = 1.0f;
        float mi = (1.0f - this.f19634w3) * (1.0f - this.f19650z4) * (1.0f - this.B0) * (1.0f - mi());
        if (this.f19601q0 == null) {
            f10 = 0.0f;
        }
        return mi * f10;
    }

    public final void gk() {
        if (this.f19649z3 != 1) {
            wh(1, 1);
        }
    }

    public final void gl(float f10) {
        if (this.M0 == f10) {
            return;
        }
        if (!Float.isNaN(f10)) {
            this.M0 = f10;
            Bm();
            if (!(this.L0 == null || this.f19636x0 == null)) {
                float f11 = this.M0;
                if (f11 > 0.0f && f11 < 1.0f) {
                    Hj();
                }
            }
            this.C1.setWillNotDraw(f10 == 0.0f);
            this.C1.invalidate();
            Dh();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void gm() {
        k1 k1Var;
        qd.b bVar = this.I0;
        if (!(bVar == null || (k1Var = this.f19596p0) == null)) {
            k1Var.Z1(this.H0, bVar, true);
        }
        this.I0 = null;
    }

    @Override
    public void h7(sd.f fVar, boolean z10, int i10) {
        bl(z10);
    }

    public final void hh() {
        this.J0 = 0;
        this.T2 = true;
        Hh();
    }

    public final float hi() {
        return Math.max(0.0f, Math.min(1.0f, this.f19628v2)) * (1.0f - this.f19634w3) * (1.0f - this.f19650z4) * (1.0f - this.B0) * (1.0f - mi());
    }

    public final void hl(int i10) {
        if (this.f19614s3 != i10) {
            this.f19614s3 = i10;
            p0.S(this.M1, i10);
            p0.S(this.S1, ki());
        }
    }

    public void hm() {
        String str;
        rd.e eVar = this.f19615s4;
        if (eVar != null && eVar.o() && !this.f19615s4.getContentWrap().C1()) {
            int i10 = 2;
            if (this.f19598p2.e()) {
                float hue = this.f19623u2.getHue();
                float[] hsv = this.f19623u2.getHsv();
                int brushColor = this.f19623u2.getBrushColor();
                str = ce.c0.B(0, hue, hsv[1], hsv[2], brushColor, true) + "\n" + ce.c0.B(1, hue, hsv[1], hsv[2], brushColor, true) + "\n" + ce.c0.B(2, hue, hsv[1], hsv[2], brushColor, true) + "\n" + ((Object) gd.w.m1(R.string.BrushSize, v0.e0(this.f19623u2.a(1.0f), false)));
            } else {
                str = he.i.c2().X2(131072L) ? gd.w.i1(R.string.HoldToTone) : null;
                i10 = 0;
            }
            if (!ib.i.i(str)) {
                x2.l lVar = this.f19620t4;
                if (lVar != null) {
                    if (!str.equals(lVar.C())) {
                        this.f19620t4.V(t().I3().k(this.f24495b, str, i10), 0);
                    }
                    this.f19620t4.Y();
                    return;
                }
                this.f19620t4 = t().I3().g(this.f19623u2).z(true).g(t().I3().m(qi())).B(t().I3().k(this.f24495b, str, i10));
                return;
            }
        }
        x2.l lVar2 = this.f19620t4;
        if (lVar2 != null) {
            lVar2.J();
        }
    }

    @Override
    public void i7(int i10, int i11, qd.b bVar, boolean z10) {
        int i12 = this.f19591o0;
        if (i12 != 0) {
            if (i12 == 1 || i12 == 2) {
                bk(z10);
                Ij();
                return;
            } else if (i12 == 3) {
                ne.b0 b0Var = this.Z1;
                od.x xVar = this.f19601q0;
                b0Var.setChecked(xVar != null && xVar.k(i10, bVar));
                zm(true);
                Km(true);
                um(true);
                return;
            } else if (i12 != 5) {
                return;
            }
        }
        if (!z10) {
            Km(true);
        }
        um(true);
        ym();
        bk(z10);
        Ij();
    }

    public final boolean ih() {
        eb.f fVar = this.f19536a3;
        return fVar != null && fVar.h();
    }

    public final String ii(qd.b bVar) {
        TdApi.Chat W2;
        if (bVar.M() != null) {
            return this.f24495b.Cb(bVar.M());
        }
        if (bVar.J() == 0 || (W2 = this.f24495b.W2(bVar.J())) == null) {
            return null;
        }
        return W2.title;
    }

    public final void il(float f10) {
        this.f19535a2.setAlpha(f10);
        this.f19535a2.setEnabled(f10 == 1.0f);
    }

    public final void im() {
        if (this.I3 == null) {
            rd.e eVar = new rd.e(t());
            this.I3 = eVar;
            eVar.setLayoutParams(FrameLayoutFix.r1(-1, -1, 17));
        }
        Bitmap bitmap = this.K3;
        if (bitmap != null) {
            this.I3.s(this.J3, bitmap.getWidth(), this.K3.getHeight(), this.K3, this.M3, this.J3.t());
        } else {
            this.I3.u(this.O3, this.P3, this.J3.X0(), this.J3.j());
        }
        this.D1.getBaseCell().addView(this.I3);
        if (this.K3 != null) {
            this.I3.setEditorVisible(true);
        } else {
            Kj(this.L3);
        }
    }

    @Override
    public void j3(float f10) {
        this.V3.i(f10);
    }

    @Override
    public boolean jc(boolean z10) {
        eb.k kVar;
        if (this.F2 || ((kVar = this.S2) != null && kVar.v())) {
            return true;
        }
        if (this.f19624u3) {
            Vl(false);
            return true;
        } else if (this.f19649z3 != 0) {
            Ai(true);
            return true;
        } else if (this.F0) {
            bi();
            return true;
        } else if (this.D1.getCurrentZoom() <= 1.0f) {
            return false;
        } else {
            this.D1.getBaseCell().getDetector().m(true);
            return true;
        }
    }

    public final void jh() {
        v4<?> F = this.f24493a.Q1().F();
        if (F != null) {
            F.La();
        }
        if (this.D1.d2()) {
            Bl(false);
        }
    }

    public int ji() {
        return this.f19619t3;
    }

    public final void jl(float f10) {
        if (this.f19628v2 != f10) {
            this.f19628v2 = f10;
            il(hi());
            float f11 = (f10 * 0.3f) + 0.7f;
            this.f19535a2.setScaleX(f11);
            this.f19535a2.setScaleY(f11);
        }
    }

    public final void jm() {
        if (this.f19615s4 == null) {
            rd.e eVar = new rd.e(t());
            this.f19615s4 = eVar;
            eVar.setLayoutParams(FrameLayoutFix.r1(-1, -1, 17));
            dh(this.f19625u4);
        }
        this.f19615s4.getContentWrap().G1(this.f19623u2.getBrushColor(), this.f19623u2.a(li()));
        this.f19615s4.s(this.f19590n4.K(), this.f19595o4, this.f19600p4, null, null, this.f19605q4);
        boolean E0 = this.f19590n4.E0(null, false);
        this.D1.getBaseCell().addView(this.f19615s4);
        this.f19615s4.setEditorVisible(true);
        this.f19615s4.getContentWrap().setDrawingListener(new e.b.a() {
            @Override
            public final void a(View view, int i10) {
                j1.this.Dj(view, i10);
            }
        });
        if (E0) {
            this.D1.getBaseReceiver().invalidate();
        }
        hm();
    }

    @Override
    public void k0(vc.q qVar, View view) {
        this.C1.removeView(view);
    }

    @Override
    public void k5() {
        if (((TextView) this.U1).getText().length() > 0) {
            this.U1.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public final int ki() {
        return (this.C0 ? 0 : a0.i(56.0f)) + this.f19614s3;
    }

    public final void kl(float f10) {
        this.U3.setAlpha(f10);
    }

    public final void km() {
        sd.f fVar = this.f19605q4;
        if (fVar != null) {
            fVar.i();
        }
        jb.c cVar = new jb.c(5);
        jb.c cVar2 = new jb.c(5);
        u0 u0Var = new u0(5);
        cVar.a(R.id.paint_mode_path);
        cVar2.a(R.drawable.baseline_adjust_24);
        u0Var.a(R.string.PaintModeDoodle);
        cVar.a(R.id.paint_mode_arrow);
        cVar2.a(R.drawable.baseline_arrow_upward_24);
        u0Var.a(R.string.PaintModeArrow);
        cVar.a(R.id.paint_mode_rect);
        cVar2.a(R.drawable.baseline_crop_3_2_24);
        u0Var.a(R.string.PaintModeRect);
        sd.f fVar2 = this.f19605q4;
        if (fVar2 != null && fVar2.i()) {
            cVar.a(R.id.paint_mode_fill);
            cVar2.a(R.drawable.baseline_format_color_fill_24);
            u0Var.a(R.string.PaintModeFill);
        }
        fe(null, cVar.e(), u0Var.d(), null, cVar2.e(), new ie.h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Ej;
                Ej = j1.this.Ej(view, i10);
                return Ej;
            }
        }, qi());
    }

    @Override
    public void l1(qd.b bVar, boolean z10) {
        if (this.X1 != null && this.f19611s0.g() == bVar) {
            this.X1.B1(z10, true);
            Em(z10);
            this.X1.D1(true, true);
        }
    }

    public final float lh(float f10, float f11, float f12) {
        float f13;
        int measuredWidth = this.D1.getMeasuredWidth();
        int measuredHeight = this.D1.getMeasuredHeight();
        float f14 = measuredWidth;
        float Z = this.G2.Z();
        float f15 = (f12 - (measuredWidth / 2)) * (-1.0f);
        return (f15 / (f14 * 0.5f)) * (f11 / (measuredHeight * 0.5f)) * (-35.0f) * Math.min(1.0f, Math.max(-1.0f, f10 / (((int) (Z * Math.min(f14 / Z, f13 / this.G2.A()))) * 0.2f))) * Math.signum(f15);
    }

    public final float li() {
        return 1.0f;
    }

    public final void ll(int i10, int i11) {
        this.V3.t(i10, i11);
        this.f19579l2.i((i10 == 0 || i11 == 0) ? false : true, true);
    }

    public final void lm() {
        final qd.b g10 = this.f19611s0.g();
        this.f24495b.hd();
        hj.O8(t(), g10.O(), true, true, g10.n0() ? R.string.MessageLifetimeVideo : R.string.MessageLifetimePhoto, new kb.j() {
            @Override
            public final void a(Object obj) {
                j1.this.Fj(g10, (hj.p) obj);
            }
        });
    }

    @Override
    public boolean m4() {
        return !this.f19635w4;
    }

    public final int mh() {
        int i10 = this.f19591o0;
        return a0.i((i10 == 1 || i10 == 2) ? 26.0f : 22.0f) + a0.i(1.0f);
    }

    public final float mi() {
        return Ui() ? 1.0f : 0.0f;
    }

    public final void ml(float f10) {
        if (this.f19573j4) {
            n1 n1Var = this.f19588n2;
            float f11 = this.f19565h4;
            n1Var.d(f11 + ((this.f19569i4 - f11) * f10), true);
        }
        if (this.f19545c4 != 0) {
            wl(f10);
        }
    }

    public final void mm() {
        fe(gd.w.i1(R.string.DiscardCurrentChanges), new int[]{R.id.btn_discard, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.Discard), gd.w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new ie.h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Gj;
                Gj = j1.this.Gj(view, i10);
                return Gj;
            }
        }, qi());
    }

    @Override
    public int n2(vc.x xVar) {
        return this.B2.getMeasuredHeight();
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        switch (i10) {
            case 0:
                int i11 = this.f19631w0;
                if (i11 == 0) {
                    ql(f10);
                } else if (i11 == 1) {
                    this.D1.getBaseCell().getDetector().z(f11);
                    this.D1.setRevealFactor(f10);
                } else if (i11 == 3) {
                    Ll(f10);
                } else if (i11 == 4) {
                    t tVar = this.Y1;
                    if (tVar != null) {
                        tVar.setAlpha(f10);
                    }
                    this.D1.setAlpha(f10);
                }
                gl(f10);
                sl(ib.h.d(f10));
                int i12 = this.f19591o0;
                if (i12 != 0) {
                    if (i12 == 3) {
                        pl(Math.max(0.0f, Math.min(1.0f, f10)));
                        return;
                    } else if (i12 != 5) {
                        return;
                    }
                }
                Zk(ib.h.d(f10));
                return;
            case 1:
                jl(f10);
                return;
            case 2:
                Gl(f10);
                return;
            case 3:
            case 13:
            case 16:
            default:
                return;
            case 4:
                Sl(f10, f11);
                return;
            case 5:
                em(f10);
                return;
            case 6:
                dl(f10);
                return;
            case 7:
                ul(f10);
                return;
            case 8:
                Ml(f10, f11);
                return;
            case 9:
                Rl(f10);
                return;
            case 10:
                Jl(f10);
                return;
            case 11:
                Pl(f10);
                return;
            case 12:
                Ol(f10);
                return;
            case 14:
                this.D1.getBaseReceiver().setAlpha(1.0f - f10);
                return;
            case 15:
                Yl(f10);
                return;
            case 17:
                zl(f10);
                return;
            case 18:
                kl(f10);
                return;
            case 19:
                wl(f10);
                return;
            case 20:
                vl(f10);
                return;
            case 21:
                am(f10);
                return;
            case 22:
                bm(f10);
                return;
            case 23:
                Yk(f10);
                return;
        }
    }

    @Override
    public void n5(ld.h hVar, float f10) {
    }

    @Override
    public void n6(int i10) {
        boolean z10 = true;
        this.S3 = true;
        rd.e eVar = this.I3;
        if (eVar != null) {
            if (i10 != 14) {
                z10 = false;
            }
            eVar.r(z10);
        }
    }

    @Override
    public boolean n7(float f10, float f11) {
        boolean z10 = true;
        if (this.f19570j1) {
            Qh(f10, f11);
            return true;
        }
        if (this.F2) {
            if (Math.max(Math.abs(f10), Math.abs(f11)) <= a0.i(50.0f)) {
                z10 = false;
            }
            Rh(f10, f11, z10);
        }
        return false;
    }

    public final boolean nh() {
        int i10 = this.f19591o0;
        return i10 != 4 && (i10 != 3 || this.f19649z3 == 0) && this.D1.getCurrentZoom() == 1.0f && !this.C0;
    }

    public TdApi.File ni() {
        return this.f19611s0.g().P();
    }

    public final void nk() {
        if (!this.f19611s0.g().n0() && this.f19649z3 != 3) {
            wh(3, 1);
        }
    }

    public final void nl(boolean z10) {
        d1 d1Var = this.f19551e2;
        int i10 = 0;
        if (d1Var != null) {
            d1Var.setVisibility(z10 ? 0 : 8);
        }
        FrameLayoutFix frameLayoutFix = this.S1;
        if (frameLayoutFix != null) {
            if (!z10) {
                i10 = 8;
            }
            frameLayoutFix.setVisibility(i10);
        }
    }

    public final boolean nm() {
        if (this.f19601q0 == null) {
            return false;
        }
        El(this.Z1.v(), true);
        return true;
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 == 4) {
                    gh();
                } else if (i10 != 6) {
                    if (i10 == 8) {
                        eh();
                    } else if (i10 == 11) {
                        fh();
                    } else if (i10 != 15) {
                        if (i10 != 21) {
                            switch (i10) {
                                case 17:
                                    if (f10 == 1.0f) {
                                        z10 = true;
                                    }
                                    ch(z10);
                                    return;
                                case 18:
                                    if (f10 == 1.0f) {
                                        z10 = true;
                                    }
                                    Yg(z10);
                                    return;
                                case 19:
                                    bh();
                                    return;
                                default:
                                    return;
                            }
                        } else if (f10 == 0.0f) {
                            Gh();
                        }
                    } else if (f10 != 1.0f) {
                    } else {
                        if (this.Q2 != 0.0f || this.P2 != 0.0f) {
                            hh();
                        }
                    }
                } else if (f10 == 0.0f) {
                    cl("", null);
                }
            } else if (f10 == 0.0f) {
                this.f19644y3.g0(null);
            }
        } else if (f10 == 0.0f) {
            gm();
            this.B2.B2();
            rl(false);
            if (this.f19591o0 == 4 && this.f19631w0 == 4) {
                Dl(false);
            }
            Zj();
        } else if (f10 == 1.0f) {
            this.B2.C2();
            this.D1.setDisableAnimations(false);
            this.D1.G1(false);
            if (this.f19591o0 == 4) {
                final qd.b g10 = this.f19611s0.g();
                j0.e0(new Runnable() {
                    @Override
                    public final void run() {
                        qd.b.this.Y0();
                    }
                }, 20L);
            }
            if (qh() != 0 && he.i.c2().X2(4096L)) {
                he.i.c2().w2(4096L);
                t().I3().g(this.L1).g(t().I3().m(qi())).u(x0.f19875a).i(this).C(this.f24495b, R.string.HoldToSendAsFile).F();
            }
        }
    }

    @Override
    public android.view.View oc(android.content.Context r24) {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.oc(android.content.Context):android.view.View");
    }

    public final boolean oh() {
        qd.b g10 = this.f19611s0.g();
        return g10 != null && g10.n0() && !g10.e0();
    }

    public l1 oi() {
        if (this.f19596p0 == null || j0.O()) {
            return null;
        }
        return this.f19596p0.s1(this.f19611s0.h(), this.f19611s0.g());
    }

    public final void ok() {
        if (this.f19649z3 == 4) {
            return;
        }
        if (!fd.a.f11885g) {
            j0.p0(18);
        } else {
            wh(4, 1);
        }
    }

    public final void ol(final ld.h hVar, final Bitmap bitmap) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j1.this.Bj(hVar, bitmap);
            }
        });
    }

    public final boolean om() {
        if (this.f19551e2 == null) {
            return false;
        }
        boolean z10 = !this.Q0;
        this.Q0 = z10;
        Tg(z10 ? 1.0f : 0.0f);
        return true;
    }

    @Override
    public void onClick(View view) {
        boolean z10;
        float f10;
        int[] iArr;
        int[][] iArr2;
        if (!this.f19635w4) {
            char c10 = 0;
            switch (view.getId()) {
                case R.id.btn_adjust:
                    int X = this.f19611s0.g().X();
                    if (X == 3) {
                        gk();
                        return;
                    } else if (X == 4) {
                        ok();
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_back:
                    if (this.f19649z3 != 0) {
                        Ai(false);
                        return;
                    } else {
                        Hh();
                        return;
                    }
                case R.id.btn_caption_done:
                    Wj();
                    return;
                case R.id.btn_caption_emoji:
                    Dk();
                    return;
                case R.id.btn_check:
                    nm();
                    return;
                case R.id.btn_counter:
                    od.x xVar = this.f19601q0;
                    if (xVar != null) {
                        if (xVar.k(this.f19611s0.h(), this.f19611s0.g())) {
                            z10 = true;
                            if (this.f19601q0.S0() <= 1) {
                                return;
                            }
                        } else {
                            z10 = true;
                        }
                        Vl(z10);
                        return;
                    }
                    return;
                case R.id.btn_crop:
                    if (this.f19611s0.g().n0()) {
                        Pk();
                        return;
                    } else {
                        ek();
                        return;
                    }
                case R.id.btn_inlineClose:
                    Mh();
                    return;
                case R.id.btn_inlineOpen:
                    jh();
                    return;
                case R.id.btn_inlinePlayPause:
                    this.f19611s0.g().t0(view);
                    return;
                case R.id.btn_paint:
                    int X2 = this.f19611s0.g().X();
                    if (X2 == 3) {
                        nk();
                        return;
                    } else if (X2 == 4) {
                        pm();
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_paintType:
                    km();
                    return;
                case R.id.btn_proportion:
                    if (Og() && this.f19649z3 == 2) {
                        int[][] iArr3 = G4;
                        jb.c cVar = new jb.c(iArr3.length + 2);
                        u0 u0Var = new u0(iArr3.length + 2);
                        jb.c cVar2 = new jb.c(iArr3.length + 2);
                        jb.c cVar3 = new jb.c(iArr3.length + 2);
                        qd.b g10 = this.f19611s0.g();
                        g10.Z();
                        g10.A();
                        if (this.f19579l2.h()) {
                            f10 = this.V3.getFixedProportion();
                            cVar2.a(R.drawable.baseline_crop_free_24);
                            cVar.a(R.id.btn_proportion_free);
                            u0Var.a(R.string.CropFree);
                            cVar3.a(1);
                        } else {
                            f10 = 0.0f;
                        }
                        float originalProportion = this.V3.getOriginalProportion();
                        int length = iArr3.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                int[] iArr4 = iArr3[i10];
                                if (iArr4[0] / iArr4[1] == originalProportion) {
                                    iArr = iArr4;
                                } else {
                                    i10++;
                                }
                            } else {
                                iArr = null;
                            }
                        }
                        if (originalProportion != 0.0f) {
                            cVar2.a(R.drawable.baseline_crop_original_24);
                            cVar.a(R.id.btn_proportion_original);
                            if (iArr == null) {
                                u0Var.a(R.string.CropOriginal);
                            } else if (iArr[2] == R.id.btn_proportion_square) {
                                u0Var.b(gd.w.i1(R.string.CropOriginal) + " (" + gd.w.i1(R.string.CropSquare) + ")");
                            } else {
                                u0Var.b(gd.w.i1(R.string.CropOriginal) + " (" + iArr[0] + ":" + iArr[1] + ")");
                            }
                            cVar3.a(originalProportion == f10 ? 3 : 1);
                        }
                        int[][] iArr5 = G4;
                        int length2 = iArr5.length;
                        int i11 = 0;
                        while (i11 < length2) {
                            int[] iArr6 = iArr5[i11];
                            int i12 = iArr6[2];
                            int i13 = iArr6[c10];
                            int i14 = iArr6[1];
                            int i15 = iArr6[3];
                            iArr = iArr;
                            if (iArr != null) {
                                iArr2 = iArr5;
                                if (i13 / i14 == originalProportion) {
                                    i11++;
                                    iArr5 = iArr2;
                                    c10 = 0;
                                }
                            } else {
                                iArr2 = iArr5;
                            }
                            cVar.a(i12);
                            if (i12 == R.id.btn_proportion_square) {
                                u0Var.a(R.string.CropSquare);
                            } else {
                                u0Var.b(i13 + ":" + i14);
                            }
                            cVar2.a(i15);
                            cVar3.a(((float) i13) / ((float) i14) == f10 ? 3 : 1);
                            i11++;
                            iArr5 = iArr2;
                            c10 = 0;
                        }
                        if (!this.f19549d4.l()) {
                            cVar3.a(2);
                            cVar.a(R.id.btn_crop_reset);
                            u0Var.a(R.string.Reset);
                            cVar2.a(R.drawable.baseline_cancel_24);
                        }
                        fe(null, cVar.e(), u0Var.d(), cVar3.e(), cVar2.e(), new ie.h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i16) {
                                return g0.b(this, i16);
                            }

                            @Override
                            public final boolean r3(View view2, int i16) {
                                boolean cj;
                                cj = j1.this.cj(view2, i16);
                                return cj;
                            }
                        }, qi());
                        return;
                    }
                    return;
                case R.id.btn_removePhoto:
                    tm(((od.w) view.getParent()).getImage());
                    return;
                case R.id.btn_rotate:
                    Pk();
                    return;
                case R.id.btn_send:
                    if (this.f19649z3 != 0) {
                        wh(0, 1);
                        return;
                    } else {
                        Vk(false, null, false, false);
                        return;
                    }
                case R.id.menu_btn_stopwatch:
                    lm();
                    return;
                case R.id.paint_undo:
                    sm();
                    return;
                default:
                    return;
            }
        }
    }

    public final boolean ph() {
        return this.f19591o0 == 4 && Build.VERSION.SDK_INT < 26;
    }

    public final qd.a pi(boolean z10) {
        qd.a z11 = this.f19611s0.g().z();
        return (z11 != null || !z10) ? z11 : new qd.a();
    }

    public final void pl(float f10) {
        this.M1.setAlpha(f10);
        this.f19539b2.setAlpha(this.f19634w3 * f10);
        od.v vVar = this.f19639x3;
        if (vVar != null) {
            vVar.setAlpha(this.f19634w3 * f10);
        }
        int i10 = this.f19649z3;
        if (i10 == 0) {
            Zk(f10);
            fl(gi() * f10);
            il(f10 * hi());
        } else if (i10 == 1) {
            this.f19555f2.setAlpha(f10);
        } else if (i10 == 4) {
            this.f19563h2.setAlpha(f10);
        }
    }

    public final void pm() {
        if (fd.a.f11886h) {
            this.P1.i(this.f19611s0.g().T0(), true);
            this.D1.getBaseCell().K0();
            Fm();
            return;
        }
        j0.p0(18);
    }

    public final int qh() {
        throw new UnsupportedOperationException("Method not decompiled: od.j1.qh():int");
    }

    public final ae.p qi() {
        return ae.c0.a(2);
    }

    public final void ql(float f10) {
        if (this.K0 != f10) {
            this.K0 = f10;
            this.D1.setAlpha(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void qm() {
        if (Math.abs(this.f19538b1) == 2.0f) {
            Sj(0.0f, 0.0f, false);
        } else {
            Kl(!this.f19647z1, true);
        }
    }

    @Override
    public void r1(qd.b bVar, boolean z10) {
        q1 q1Var;
        if (this.f19611s0.g() == bVar && (q1Var = this.X1) != null) {
            q1Var.setSlideEnabled(z10);
        }
    }

    @Override
    public void r2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1510699180) {
            final TdApi.ChatPhotos chatPhotos = (TdApi.ChatPhotos) object;
            ud(new Runnable() {
                @Override
                public final void run() {
                    j1.this.tj(chatPhotos);
                }
            });
        } else if (constructor == -16498159) {
            final TdApi.Messages messages = (TdApi.Messages) object;
            ud(new Runnable() {
                @Override
                public final void run() {
                    j1.this.sj(messages);
                }
            });
        }
    }

    public final boolean rh() {
        return false;
    }

    public final int ri(int i10) {
        int i11 = i10 != 2 ? 0 : a0.i(22.0f);
        ld.l K = this.f19611s0.g().K();
        float Z0 = K.Z0();
        float M0 = K.M0();
        return i11 + Math.max(0, ((((int) (Math.min(this.D1.getActualImageWidth() / Z0, this.D1.getActualImageHeight() / M0) * Z0)) - ((int) (Z0 * Math.min(((this.D1.getMeasuredWidth() - i11) - i11) / Z0, ((this.D1.getMeasuredHeight() - vi(i10)) - xi(i10)) / M0)))) / 2) - i11);
    }

    public final void rl(boolean z10) {
        v4<?> F;
        int i10 = this.f19591o0;
        if (i10 != 3) {
            if (z10 && ((i10 == 0 || i10 == 5) && (F = this.f24493a.Q1().F()) != null)) {
                F.La();
            }
            if (z10) {
                t().R(this, true);
            } else {
                t().u2(this, true);
            }
        }
    }

    public final boolean rm() {
        rd.e eVar = this.f19615s4;
        if (eVar == null || eVar.getContentWrap().D1()) {
            return false;
        }
        this.f19605q4.y();
        return true;
    }

    @Override
    public int s(vc.x xVar) {
        z0 z0Var = this.E0;
        return this.U1.getMeasuredHeight() + ((z0Var == null || z0Var.getVisibility() != 0 || this.E0.getParent() == null) ? 0 : this.E0.getMeasuredHeight());
    }

    public final boolean sh() {
        return false;
    }

    public void sk() {
        if (this.f19546d1) {
            this.f19611s0.g().t0(this.I1);
        }
    }

    public final void sl(float f10) {
        d1 d1Var;
        tl(f10);
        int i10 = this.f19631w0;
        if (i10 == 0) {
            d1 d1Var2 = this.f19551e2;
            if (d1Var2 != null) {
                d1Var2.setAlpha(f10);
            }
        } else if (i10 == 1 && (d1Var = this.f19551e2) != null) {
            d1Var.setTranslationY((-d1.a3(d1Var.x3())) * (1.0f - f10));
        }
    }

    public final void sm() {
        rd.e eVar = this.f19615s4;
        if (eVar != null && !eVar.getContentWrap().D1()) {
            this.f19605q4.z();
        }
    }

    public final void th() {
        eb.k kVar = this.f19576k3;
        if (kVar != null) {
            kVar.l(0.0f);
            this.f19589n3 = null;
        }
    }

    public int ti() {
        return this.f19591o0;
    }

    public final Bitmap tk() {
        if (!(this.D1.getBaseReceiver() instanceof ld.p)) {
            return null;
        }
        ld.p pVar = (ld.p) this.D1.getBaseReceiver();
        this.N3 = pVar;
        Bitmap q10 = pVar.q();
        if (q10 == null || q10.isRecycled()) {
            return null;
        }
        this.O3 = q10.getWidth();
        this.P3 = q10.getHeight();
        return q10;
    }

    public final void tl(float f10) {
        if (this.T0 != f10) {
            this.T0 = f10;
            Im();
        }
    }

    public final void tm(ld.h hVar) {
        int p10 = this.f19611s0.p(hVar);
        if (p10 != -1) {
            if (p10 == this.f19611s0.h()) {
                this.Z1.setChecked(false);
            }
            if (this.f19601q0 != null) {
                qd.b e10 = this.f19611s0.e(p10);
                Eh(e10, p10);
                this.f19601q0.b5(p10, e10, false);
                int S0 = this.f19601q0.S0();
                if (S0 == 0) {
                    ci(0.0f);
                } else {
                    this.f19535a2.E(S0);
                }
            }
            this.f19644y3.f0(hVar);
            if (this.f19644y3.D() == 0) {
                Vl(false);
            }
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        ud.u0 y22 = d1Var.y2(R.id.menu_btn_pictureInPicture, R.drawable.deproko_baseline_outinline_24, R.id.theme_color_white, null, a0.i(49.0f), d1Var);
        y22.setBackgroundResource(R.drawable.bg_btn_header_light);
        int i11 = 0;
        y22.setVisibility(oh() ? 0 : 8);
        linearLayout.addView(y22);
        ud.u0 Y1 = d1Var.Y1(linearLayout, null, R.id.theme_color_white);
        Y1.setBackgroundResource(R.drawable.bg_btn_header_light);
        if (!rh()) {
            i11 = 8;
        }
        Y1.setVisibility(i11);
        d1Var.c2(linearLayout, null, R.id.theme_color_white).setBackgroundResource(R.drawable.bg_btn_header_light);
    }

    @Override
    public void u5(qd.b bVar, boolean z10) {
        if (this.f19611s0.g() == bVar) {
            q1 q1Var = this.X1;
            if (q1Var != null) {
                q1Var.B1(z10, this.f19643y2 > 0.0f);
            }
            this.f19546d1 = z10;
            int i10 = this.f19591o0;
            if (i10 == 0 || i10 == 5) {
                Em(z10);
                if (!z10) {
                    Kl(true, true);
                }
            }
        }
    }

    public final void uh() {
        eb.k kVar = this.f19541b4;
        if (kVar != null) {
            kVar.k();
        }
        this.f19537a4 = 0.0f;
    }

    public final boolean ui(int[] iArr) {
        qd.b bVar;
        int measuredWidth = this.D1.getMeasuredWidth();
        int measuredHeight = this.D1.getMeasuredHeight();
        if (measuredHeight == 0 || measuredWidth == 0 || (bVar = this.f19534a1) == null) {
            return false;
        }
        float Z = bVar.Z();
        float A = this.f19534a1.A();
        float min = Math.min(measuredWidth / Z, measuredHeight / A);
        iArr[0] = (int) (Z * min);
        iArr[1] = (int) (A * min);
        return true;
    }

    public final boolean uk() {
        qd.b g10 = this.f19611s0.g();
        ld.p imageReceiver = this.D1.getBaseCell().getImageReceiver();
        if (g10.n0() || g10.d0() || imageReceiver == null) {
            j0.y0(R.string.MediaTypeUnsupported, 0);
            return false;
        }
        Bitmap q10 = imageReceiver.q();
        this.f19557f4 = q10;
        if (q10 == null || q10.isRecycled()) {
            return false;
        }
        this.f19561g4 = g10.K().x();
        this.f19549d4 = Tj(true);
        this.f19605q4 = Uj(false);
        this.f19553e4 = new pd.c(this.f19549d4);
        return true;
    }

    public final void ul(float f10) {
        this.R0 = f10;
        xm();
        vm();
        Hm();
        Im();
    }

    public final void um(boolean z10) {
        qd.b g10 = this.f19611s0.g();
        int i10 = this.f19591o0;
        if (i10 != 0) {
            if (i10 == 3) {
                this.C2 = true;
                TdApi.FormattedText s10 = g10.s();
                if (s10 != null) {
                    ((h0) this.U1).v0(t2.q5(s10), true);
                } else {
                    ((h0) this.U1).v0("", true);
                }
                this.C2 = false;
                return;
            } else if (i10 != 5) {
                return;
            }
        }
        boolean z11 = g10.s() != null;
        if (z11) {
            ((n0) this.U1).y(g10.s().text, g10.t(), false);
            if (!z10 && !this.N0) {
                this.N0 = true;
                this.O0 = 1.0f;
            }
        }
        el(z11, z10);
    }

    public final void vh() {
        ImageLoader.e().k(this.Q3);
    }

    public final int vi(int i10) {
        int i11;
        int i12 = this.f19641y0 ? this.f19619t3 : 0;
        if (i10 == 1) {
            i11 = a0.i(220.0f);
        } else if (i10 == 2) {
            i11 = a0.i(160.0f);
        } else if (i10 == 3) {
            i11 = a0.i(136.0f);
        } else if (i10 != 4) {
            return 0;
        } else {
            i11 = wi(i10) + a0.i(12.0f);
        }
        return i11 + i12;
    }

    public final void vk() {
        if (this.U3 == null) {
            pd.b bVar = new pd.b(t());
            this.U3 = bVar;
            bVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, 49);
            r12.topMargin = xi(2);
            r12.bottomMargin = vi(2);
            int i10 = a0.i(22.0f);
            r12.rightMargin = i10;
            r12.leftMargin = i10;
            pd.d dVar = new pd.d(t());
            this.W3 = dVar;
            dVar.setLayoutParams(r12);
            this.U3.addView(this.W3);
            pd.a aVar = new pd.a(t());
            this.V3 = aVar;
            aVar.setRectChangeListener(new a.b() {
                @Override
                public final void a(double d10, double d11, double d12, double d13) {
                    j1.this.uj(d10, d11, d12, d13);
                }
            });
            this.V3.setNormalizeListener(new h());
            this.V3.setRotateModeChangeListener(new a.c() {
                @Override
                public final void a(boolean z10) {
                    j1.this.vj(z10);
                }
            });
            this.V3.v(r12.leftMargin, r12.topMargin, r12.rightMargin, r12.bottomMargin);
            this.V3.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.U3.addView(this.V3);
        }
    }

    public final void vl(float f10) {
        float f11 = 1.0f - f10;
        this.P1.setAlpha(f11);
        float f12 = (f11 * 0.4f) + 0.6f;
        this.P1.setScaleX(f12);
        this.P1.setScaleY(f12);
        int t10 = p0.t(this.P1);
        boolean z10 = false;
        for (int i10 = 0; i10 < this.N1.getChildCount(); i10++) {
            View childAt = this.N1.getChildAt(i10);
            if (childAt == this.P1) {
                z10 = true;
            } else if (z10) {
                childAt.setTranslationX(((-t10) / 2) * f10);
            } else {
                childAt.setTranslationX((t10 / 2) * f10);
            }
        }
    }

    public final void vm() {
        LinearLayout linearLayout = this.T1;
        if (linearLayout != null) {
            linearLayout.setAlpha(this.O0 * this.R0 * (1.0f - this.Z0));
        }
    }

    @Override
    public void w0(String str) {
        ((h0) this.U1).p0(str);
    }

    @Override
    public long w5(h0 h0Var) {
        TdApi.Chat W2 = this.f24495b.W2(y(h0Var));
        if (W2 != null) {
            return t2.n2(W2);
        }
        return 0L;
    }

    @Override
    public boolean wc(boolean z10) {
        if (this.f19591o0 != 3) {
            return super.wc(z10);
        }
        boolean z11 = true;
        if (z10 && !S9()) {
            Lh(true);
        }
        boolean wc2 = super.wc(z10);
        z0 z0Var = this.E0;
        if (z0Var != null) {
            z0Var.j(z10);
        }
        if (!z10 && !this.F0) {
            z11 = false;
        }
        yl(z11);
        this.D1.h2();
        return wc2;
    }

    public final void wh(int i10, int i11) {
        if (this.f19649z3 != i10 && Og()) {
            boolean Fi = Fi();
            boolean z10 = false;
            if (i11 != 0) {
                if (i11 == 1) {
                    z10 = true;
                } else if (i11 != 2) {
                    return;
                }
            } else if (Fi) {
                mm();
                return;
            }
            if (Fi) {
                if (!z10) {
                    Gk();
                } else if (Rk(i10)) {
                    return;
                }
            }
            xh(i10);
        }
    }

    public final void wk() {
        this.f19579l2.i(false, false);
        int i10 = this.f19561g4;
        pd.c cVar = this.f19553e4;
        int l10 = ib.h.l(i10 + (cVar != null ? cVar.h() : 0), 360);
        this.W3.b(this.f19557f4, l10, this.f19549d4.c(), this.f19605q4);
        this.f19588n2.d(this.f19549d4.c(), false);
        this.V3.o();
        this.V3.p(v0.a1(this.f19557f4, l10), v0.B0(this.f19557f4, l10), this.f19549d4.d(), this.f19549d4.i(), this.f19549d4.g(), this.f19549d4.b(), false);
    }

    public final void wl(float f10) {
        float f11;
        float f12;
        float f13;
        if (this.f19537a4 != f10) {
            this.f19537a4 = f10;
            int i10 = this.f19545c4;
            float f14 = i10 * f10;
            float f15 = 1.0f;
            if (v0.x1(i10)) {
                int measuredWidth = this.W3.getMeasuredWidth();
                int measuredHeight = this.W3.getMeasuredHeight();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W3.getLayoutParams();
                int targetHeight = this.W3.getTargetHeight();
                float min = Math.min(((this.U3.getMeasuredWidth() - layoutParams.leftMargin) - layoutParams.rightMargin) / targetHeight, ((this.U3.getMeasuredHeight() - layoutParams.topMargin) - layoutParams.bottomMargin) / this.W3.getTargetWidth());
                int i11 = ((int) ((((int) (f12 * min)) - measuredHeight) * f10)) + measuredHeight;
                f15 = (((int) ((((int) (f13 * min)) - measuredWidth) * f10)) + measuredWidth) / measuredWidth;
                f11 = i11 / measuredHeight;
            } else {
                f11 = 1.0f;
            }
            this.W3.setBaseRotation(f14);
            this.W3.d(f15, f11);
            this.V3.setRotation(f14);
            this.V3.setScaleX(f15);
            this.V3.setScaleY(f11);
        }
    }

    public final void wm() {
        int i10 = 0;
        float f10 = 1.0f;
        boolean z10 = this.f19643y2 == 1.0f && !this.C0;
        if (this.A2 != z10) {
            this.A2 = z10;
            LinearLayout linearLayout = this.T1;
            float f11 = 0.0f;
            if (!z10) {
                float f12 = (-a0.i(56.0f)) * this.f19643y2;
                if (this.C0) {
                    f10 = 0.0f;
                }
                f11 = f12 * f10;
            }
            linearLayout.setTranslationY(f11 + (this.U2 * a0.i(9.0f)));
            LinearLayout linearLayout2 = this.T1;
            if (this.A2) {
                i10 = a0.i(56.0f);
            }
            p0.S(linearLayout2, i10);
        }
    }

    @Override
    public void x4(b0 b0Var, float f10, float f11) {
        Jh();
    }

    public final void xh(int i10) {
        if (!Tk(this.f19649z3, i10) && Ri(i10)) {
            int i11 = this.f19649z3;
            this.A3 = i11;
            this.B3 = xi(i11);
            this.D3 = vi(this.A3);
            this.F3 = this.D1.getOffsetHorizontal();
            this.D1.getBaseCell().getDetector().v();
            Bk(this.A3);
            Ck(i10);
            Wh(i10);
            this.f19649z3 = i10;
            this.C3 = xi(i10);
            this.E3 = vi(this.f19649z3);
            this.G3 = ri(this.f19649z3);
            zm(true);
            eb.k kVar = this.H3;
            if (kVar == null) {
                this.H3 = new eb.k(4, this, db.b.f7290e, 380L);
            } else {
                kVar.l(0.0f);
            }
            this.H3.i(1.0f);
        }
    }

    public final boolean xk() {
        Bitmap tk = tk();
        if (tk == null) {
            return false;
        }
        this.M3 = pi(true);
        this.R3 = new qd.a(this.M3);
        ld.l K = this.f19611s0.g().K();
        if (this.J3 != K) {
            vh();
            ld.h S = this.f19611s0.g().S(false);
            if (this.N3.r() != S) {
                tk = null;
            }
            Zl(S, K, tk);
        }
        return true;
    }

    public final void xl() {
        yl(S9() || this.F0);
    }

    public final void xm() {
        d1 d1Var = this.f19551e2;
        if (d1Var != null) {
            d1Var.setAlpha(this.R0 * (1.0f - this.Z0));
        }
    }

    @Override
    public long y(h0 h0Var) {
        return x9().f19684m;
    }

    public final void yh() {
        float i10 = this.U2 * a0.i(9.0f);
        if (this.T1 != null) {
            wm();
            if (!this.A2) {
                this.T1.setTranslationY(((-a0.i(56.0f)) * this.f19643y2) + i10);
            }
        }
        q1 q1Var = this.X1;
        if (q1Var != null) {
            q1Var.setTranslationY((a0.i(56.0f) * (1.0f - this.f19643y2)) + i10);
        }
    }

    public final float yi() {
        if (this.f19556f3 == 0) {
            return 1.0f;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f19556f3;
        if (uptimeMillis > 100) {
            return 1.0f;
        }
        return Math.max(0.0f, ((float) uptimeMillis) / 200.0f);
    }

    public final boolean yk() {
        qd.b g10 = this.f19611s0.g();
        ld.p imageReceiver = this.D1.getBaseCell().getImageReceiver();
        if (g10.n0() || g10.d0() || imageReceiver == null) {
            j0.y0(R.string.MediaTypeUnsupported, 0);
            return false;
        }
        Bitmap tk = tk();
        if (tk == null) {
            return false;
        }
        sd.f Uj = Uj(true);
        this.f19605q4 = Uj;
        Uj.d(this);
        this.f19610r4 = new sd.f(this.f19605q4);
        this.f19549d4 = Tj(false);
        this.f19590n4 = this.f19611s0.g();
        this.f19595o4 = tk.getWidth();
        this.f19600p4 = tk.getHeight();
        return true;
    }

    public final void yl(boolean z10) {
        int i10 = 0;
        boolean z11 = z10 && this.f19649z3 == 0;
        if (this.C0 != z11) {
            this.C0 = z11;
            if (!z11 && !ib.i.j(((TextView) this.U1).getText())) {
                Uk();
            }
            wm();
            this.V1.setEnabled(z11);
            this.W1.setEnabled(z11);
            this.D1.setDisableTouch(z11);
            this.D1.setButStillNeedClick(z11 ? this : null);
            p0.S(this.S1, ki());
            FrameLayoutFix frameLayoutFix = this.M1;
            if (z11) {
                i10 = 8;
            }
            frameLayoutFix.setVisibility(i10);
            Hm();
            if (this.D0 == null) {
                this.D0 = new eb.k(17, this, db.b.f7287b, 180L, this.B0);
            }
            this.D0.i(z11 ? 1.0f : 0.0f);
            if (!z11) {
                j0.e0(new Runnable() {
                    @Override
                    public final void run() {
                        j1.this.Cj();
                    }
                }, 100L);
            }
        }
    }

    public final void ym() {
        d1 d1Var = this.f19551e2;
        if (d1Var != null) {
            int i10 = 8;
            d1Var.Q3(R.id.menu_photo, R.id.menu_btn_masks, sh() ? 0 : 8, 0);
            this.f19551e2.Q3(R.id.menu_photo, R.id.menu_btn_pictureInPicture, oh() ? 0 : 8, 0);
            d1 d1Var2 = this.f19551e2;
            if (rh()) {
                i10 = 0;
            }
            d1Var2.Q3(R.id.menu_photo, R.id.menu_btn_forward, i10, 0);
            Jm();
        }
    }

    public final void zh() {
        int i10 = (a0.i(9.0f) * 2) + a0.i(43.0f);
        float f10 = this.K2;
        float Lj = Lj() * f10;
        FrameLayoutFix frameLayoutFix = this.S1;
        if (frameLayoutFix != null) {
            frameLayoutFix.setTranslationY(Lj - ((this.U2 * i10) * (1.0f - f10)));
        }
        if (this.W2 != null) {
            this.W2.setTranslationY(Lj + (i10 * Math.max(1.0f - this.U2, this.K2)));
        }
    }

    public final String zi() {
        return gd.w.j1(R.string.XofY, ce.c0.f(this.f19611s0.j() + 1), ce.c0.f(this.f19611s0.k()));
    }

    public final void zk() {
        this.f19592o1 = this.f19602q1;
        this.f19597p1 = this.f19607r1;
    }

    public final void zl(float f10) {
        if (this.B0 != f10) {
            this.B0 = f10;
            Am();
            vc.x xVar = this.A0;
            if (xVar != null) {
                xVar.setAlpha(f10);
            }
            ImageView imageView = this.V1;
            float f11 = 1.0f - f10;
            imageView.setTranslationX((-imageView.getMeasuredWidth()) * f11);
            this.V1.setAlpha(f10);
            this.W1.setAlpha(f10);
            this.U1.setTranslationX((-(a0.i(55.0f) - a0.i(14.0f))) * f11);
        }
    }

    public final void zm(boolean z10) {
        this.Q1.j(Ci(), z10);
        this.O1.j(Bi(), z10);
        this.P1.j(Di(), z10);
        if (this.R1 != null) {
            int O = this.f19611s0.g().O();
            String f32 = O != 0 ? hj.f3(O, TimeUnit.SECONDS, false) : null;
            if (z10) {
                this.R1.n(f32, false);
            } else {
                this.R1.l(f32, true);
            }
        }
    }

    public static class r {
        public final v4<?> f19672a;
        public final int f19673b;
        public k1 f19674c;
        public final od.x f19675d;
        public final od.y f19676e;
        public final qd.c f19677f;
        public String f19678g;
        public boolean f19679h;
        public String f19680i;
        public boolean f19681j;
        public String f19682k;
        public boolean f19683l;
        public long f19684m;
        public long f19685n;
        public boolean f19686o;
        public boolean f19687p;
        public TdApi.SearchMessagesFilter f19688q;

        public r(v4<?> v4Var, int i10, k1 k1Var, od.x xVar, od.y yVar, qd.c cVar) {
            this.f19672a = v4Var;
            this.f19673b = i10;
            this.f19674c = k1Var;
            this.f19675d = xVar;
            this.f19676e = yVar;
            this.f19677f = cVar;
        }

        public static r o(v4<?> v4Var, k1 k1Var, od.x xVar, od.y yVar, qd.c cVar, boolean z10) {
            return new r(v4Var, 3, k1Var, xVar, yVar, cVar).r(z10);
        }

        public r p(boolean z10) {
            this.f19687p = z10;
            return this;
        }

        public void q(TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f19688q = searchMessagesFilter;
        }

        public r r(boolean z10) {
            this.f19686o = z10;
            return this;
        }

        public r s(long j10) {
            this.f19684m = j10;
            return this;
        }

        public r(v4<?> v4Var, int i10, qd.c cVar) {
            this(v4Var, i10, null, null, null, cVar);
        }
    }
}
