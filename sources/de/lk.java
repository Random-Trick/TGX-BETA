package de;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import ce.y;
import de.y00;
import eb.k;
import ed.j;
import gb.g;
import gd.w;
import hd.o;
import hd.s;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import je.g;
import je.t;
import ld.p;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.f3;
import ne.m2;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import ud.d1;
import ud.h1;
import ud.j1;
import ud.q1;
import ud.v4;
import vc.n0;
import vd.o0;
import zd.h9;
import zd.o6;
import zd.s1;
import zd.t1;

public class lk extends v4<Void> implements h1, j1, View.OnClickListener, o0.e, o0.f, h9.c, o0.c, t1.a {
    public h A0;
    public boolean B0;
    public boolean C0;
    public long D0;
    public long E0;
    public long F0;
    public boolean G0;
    public boolean H0;
    public List<TdApi.Message> I0;
    public boolean J0 = true;
    public s K0;
    public int L0;
    public long M0;
    public boolean N0;
    public float O0;
    public float P0;
    public int f8607n0;
    public iq f8608o0;
    public List<ra> f8609p0;
    public long f8610q0;
    public e f8611r0;
    public f f8612s0;
    public c f8613t0;
    public f3 f8614u0;
    public ImageView f8615v0;
    public ImageView f8616w0;
    public ImageView f8617x0;
    public ImageView f8618y0;
    public g f8619z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void o2(ra raVar, int i10, ne.t1 t1Var) {
            if (lk.this.f24495b.F4().w2().a0()) {
                t1Var.B1(w.k0(R.string.format_tracksAndDuration, w.q2(R.string.xAudios, lk.this.Gf()), c0.h(lk.this.f8610q0)));
            } else {
                t1Var.C1();
            }
        }
    }

    public class b extends g.e {
        public final androidx.recyclerview.widget.g[] f8621d;

        public b(androidx.recyclerview.widget.g[] gVarArr) {
            this.f8621d = gVarArr;
        }

        @Override
        public void B(RecyclerView.c0 c0Var, int i10) {
            if ((i10 & 12) != 0) {
                this.f8621d[0].b(c0Var.f2982a);
            }
            if (i10 == 4) {
                ((j.d) c0Var.f2982a).U0();
                lk.this.Xf((s) ((ra) c0Var.f2982a.getTag()).d());
            }
        }

        @Override
        public int k(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int k10;
            if (!lk.this.Nf() && (k10 = c0Var.k()) != -1 && k10 >= 1 && c0Var.n() == 41) {
                return g.e.t(3, 4);
            }
            return 0;
        }

        @Override
        public boolean q() {
            return true;
        }

        @Override
        public boolean r() {
            return true;
        }

        @Override
        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f10, float f11, int i10, boolean z10) {
            if (i10 != 1) {
                super.u(canvas, recyclerView, c0Var, f10, f11, i10, z10);
            }
            View view = c0Var.f2982a;
            if (view instanceof j.d) {
                ((j.d) view).setRemoveDx(f10);
            }
        }

        @Override
        public boolean y(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            int i10;
            int k10 = c0Var.k();
            int k11 = c0Var2.k();
            int Gf = lk.this.Gf();
            if (k10 < 1 || k10 >= (i10 = Gf + 1) || k11 < 1 || k11 >= i10) {
                return false;
            }
            int i11 = k10 - 1;
            int i12 = k11 - 1;
            if ((lk.this.L0 & Log.TAG_ROUND) != 0) {
                i11 = (Gf - i11) - 1;
                i12 = (Gf - i12) - 1;
            }
            lk.this.Rf(i11, i12, true);
            return true;
        }

        @Override
        public void z(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10, RecyclerView.c0 c0Var2, int i11, int i12, int i13) {
            super.z(recyclerView, c0Var, i10, c0Var2, i11, i12, i13);
            c0Var.f2982a.invalidate();
            c0Var2.f2982a.invalidate();
        }
    }

    public static class c extends SparseDrawableView implements k.b, g.a {
        public lk N;
        public boolean O;
        public m2 R;
        public boolean T;
        public eb.f U;
        public float V;
        public float W;
        public k f8623a0;
        public float f8625b0;
        public boolean f8627c0;
        public String f8628d0;
        public String f8629e0;
        public je.g f8630f0;
        public je.g f8631g0;
        public int f8632h0;
        public float f8633i0;
        public boolean f8634j0;
        public k f8635k0;
        public String f8636l0;
        public String f8637m0;
        public float f8638n0;
        public float f8643s0;
        public float f8644t0;
        public k f8645u0;
        public k f8646v0;
        public s f8647w0;
        public n0 f8648x0;
        public float f8649y0;
        public long f8639o0 = -1;
        public long f8640p0 = -1;
        public int f8641q0 = -1;
        public int f8642r0 = -1;
        public final Drawable S = ce.c.g(getResources(), R.drawable.baseline_music_note_48);
        public Paint P = new Paint(5);
        public Paint Q = new Paint(5);
        public final ld.b f8624b = new ld.b(this);
        public final p f8626c = new p(this, 0);
        public final p M = new p(this, 0);

        public class a extends Drawable {
            public a() {
            }

            @Override
            public void draw(Canvas canvas) {
                float Af = c.this.N.Af();
                canvas.drawRect(0.0f, 0.0f, getBounds().right, Af, y.g(ae.j.u()));
                if (c.this.N.f8614u0.getTranslationY() != Af) {
                    c.this.N.f8614u0.setTranslationY(Af);
                }
                if (c.this.N.Pf()) {
                    c.this.N.f8614u0.setAlpha(c.this.J());
                }
            }

            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i10) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public c(Context context) {
            super(context);
            m2 m2Var = new m2(j0.r(context), a0.i(4.0f));
            this.R = m2Var;
            m2Var.d(16777215);
            this.R.a(this);
            this.P.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f3.q(), f3.r(), (float[]) null, Shader.TileMode.CLAMP));
            float L = L();
            this.Q.setShader(new RadialGradient(L, L, L, 268435456, 0, Shader.TileMode.CLAMP));
            h0(true);
            db.g.d(this, new a());
        }

        public static int L() {
            return a0.i(28.0f);
        }

        public void B0(s sVar) {
            s sVar2 = this.f8647w0;
            if (sVar2 != sVar) {
                if (sVar2 != null) {
                    sVar2.h(this);
                }
                this.f8647w0 = sVar;
                V0(false, false);
                long j10 = 0;
                boolean z10 = true;
                if (sVar != null) {
                    sVar.b(this);
                    boolean z11 = Y0(sVar.e0()) || e1(sVar.f0());
                    long M = this.N.c().F4().w2().M(sVar.V(), sVar.getMessage());
                    long K = this.N.c().F4().w2().K(sVar.V(), sVar.getMessage());
                    if (K == -1) {
                        K = sVar.c0().duration * 1000;
                    }
                    if (M != -1) {
                        j10 = M;
                    }
                    if (!w0(j10, K) && !z11) {
                        z10 = false;
                    }
                    if (z10) {
                        invalidate();
                    }
                } else {
                    boolean z12 = Y0(null) || e1(null);
                    if (!w0(0L, 0L) && !z12) {
                        z10 = false;
                    }
                    if (z10) {
                        invalidate();
                    }
                }
                U(false);
            }
        }

        public final void C0(float f10) {
            if (this.f8644t0 != f10) {
                this.f8644t0 = f10;
                invalidate();
            }
        }

        public final boolean D0(int i10) {
            if (this.f8641q0 == i10) {
                return false;
            }
            this.f8641q0 = i10;
            this.f8636l0 = c0.h(i10);
            return true;
        }

        public final long E() {
            long j10 = this.f8640p0;
            return (long) Math.max(0.0d, Math.min(j10, j10 * this.f8625b0));
        }

        public final float F() {
            long j10 = this.f8640p0;
            if (j10 > 0) {
                long j11 = this.f8639o0;
                if (j11 > 0) {
                    return ib.h.d((float) (j11 / j10));
                }
            }
            return 0.0f;
        }

        public final void G0(float f10) {
            if (this.f8643s0 != f10) {
                this.f8643s0 = f10;
                invalidate();
            }
        }

        public final float J() {
            return this.f8633i0;
        }

        public final int K() {
            int i10 = a0.i(58.0f);
            int i11 = a0.i(50.0f);
            return getMeasuredWidth() - (((i10 + i11) + a0.i(13.0f)) + a0.i(30.0f));
        }

        public final void L0(float f10) {
            if (this.V != f10) {
                this.V = f10;
                invalidate();
            }
        }

        public final float M() {
            float F = F();
            float f10 = this.V;
            return f10 == 0.0f ? F : F + ((this.f8625b0 - F) * f10);
        }

        public final int N() {
            je.g gVar = this.f8631g0;
            if (gVar != null) {
                return gVar.getWidth();
            }
            return 0;
        }

        public final void P0(float f10) {
            if (this.W != f10) {
                this.W = f10;
                invalidate();
            }
        }

        public final void Q0(float f10, boolean z10) {
            if (z10) {
                if (this.f8623a0 == null) {
                    this.f8623a0 = new k(4, this, db.b.f7287b, 90L, this.W);
                }
                this.f8623a0.i(f10);
                return;
            }
            k kVar = this.f8623a0;
            if (kVar != null) {
                kVar.l(f10);
            }
            P0(f10);
        }

        public final int S() {
            je.g gVar = this.f8630f0;
            if (gVar != null) {
                return gVar.getWidth();
            }
            return 0;
        }

        public void T(lk lkVar) {
            this.N = lkVar;
        }

        public final void U(boolean z10) {
            s sVar = this.f8647w0;
            n0 q10 = sVar != null ? sVar.q() : null;
            this.f8648x0 = q10;
            if (this.f8647w0 == null) {
                this.f8624b.d();
                this.f8626c.clear();
                this.M.clear();
            } else if (!z10) {
                if (q10 != null) {
                    q10.f(this.f8624b, false);
                } else {
                    this.f8624b.d();
                }
                ld.f fVar = new ld.f(this.f8647w0.V(), this.f8647w0.getMessage());
                fVar.l0();
                fVar.t0(a0.B());
                fVar.s0(2);
                this.M.G(fVar);
            }
        }

        public final void V0(boolean z10, boolean z11) {
            if (this.T != z10) {
                this.T = z10;
                if (this.U == null) {
                    this.U = new eb.f(3, this, db.b.f7287b, 180L, !z10);
                }
                getParent().requestDisallowInterceptTouchEvent(z10);
                if (!z10 && z11) {
                    long E = E();
                    this.N.c().F4().w2().V0(this.f8647w0.getMessage(), E);
                    v0(E, this.f8640p0);
                }
                this.U.p(z10, true);
                if (p0()) {
                    invalidate();
                }
            }
        }

        public final boolean Y0(String str) {
            if (i.c(this.f8629e0, str)) {
                return false;
            }
            this.f8629e0 = str;
            f1();
            return true;
        }

        @Override
        public void a() {
            U(true);
        }

        public final void b1() {
            if (!this.f8627c0) {
                this.f8627c0 = true;
                this.N.Cf().sendMessageDelayed(Message.obtain(this.N.Cf(), 1), 38L);
            }
        }

        public final void c0(float f10) {
            if (this.f8649y0 != f10) {
                this.f8649y0 = f10;
                this.R.o(f10);
                invalidate();
            }
        }

        public final void d0(boolean z10, boolean z11) {
            boolean z12 = z11 && !this.O && this.N.J0;
            if (this.f8634j0 != z10 || !z12) {
                this.f8634j0 = z10;
                float f10 = z10 ? 1.0f : 0.0f;
                if (z12) {
                    if (this.f8635k0 == null) {
                        this.f8635k0 = new k(1, this, db.b.f7287b, 220L, this.f8633i0);
                    }
                    this.f8635k0.i(f10);
                    return;
                }
                k kVar = this.f8635k0;
                if (kVar != null) {
                    kVar.l(f10);
                }
                setCollapseFactor(f10);
            }
        }

        public final boolean e1(String str) {
            if (i.c(this.f8628d0, str)) {
                return false;
            }
            this.f8628d0 = str;
            l1();
            return true;
        }

        public final void f1() {
            this.f8631g0 = i.i(this.f8629e0) ? null : new g.b(this.f8629e0, K(), y.g0(), t.d.D).v().f();
        }

        public final void g0(float f10) {
            if (this.f8625b0 != f10) {
                this.f8625b0 = f10;
                if (this.T) {
                    b1();
                }
                if (this.V > 0.0f) {
                    invalidate();
                }
            }
        }

        public void h0(boolean z10) {
            this.O = z10;
            this.f8624b.r(z10);
            this.f8626c.S0(z10);
            this.M.S0(z10);
        }

        public final void l1() {
            this.f8630f0 = i.i(this.f8628d0) ? null : new g.b(this.f8628d0, K(), y.q0(), t.d.C).b().v().f();
        }

        public final boolean n0(int i10) {
            if (this.f8642r0 == i10) {
                return false;
            }
            this.f8642r0 = i10;
            StringBuilder sb2 = new StringBuilder(5);
            sb2.append('-');
            c0.i(this.f8642r0, TimeUnit.SECONDS, false, sb2);
            String sb3 = sb2.toString();
            this.f8637m0 = sb3;
            this.f8638n0 = v0.T1(sb3, y.b0(12.0f));
            return true;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (i10 == 0) {
                G0(f10);
            } else if (i10 == 1) {
                setCollapseFactor(f10);
            } else if (i10 == 3) {
                L0(f10);
            } else if (i10 == 4) {
                P0(f10);
            } else if (i10 == 5) {
                c0(f10);
            } else if (i10 == 6) {
                C0(f10);
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10;
            int i11;
            float f10;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            View view;
            int i19;
            Drawable drawable;
            if (this.f8647w0 != null) {
                int measuredWidth = getMeasuredWidth();
                int Af = this.N.Af();
                int i20 = (Af - a0.i(34.0f)) - a0.i(30.0f);
                int min = Math.min(measuredWidth, a0.i(480.0f));
                int i21 = measuredWidth != min ? (measuredWidth / 2) - (min / 2) : 0;
                int i22 = a0.i(12.0f);
                int i23 = i21 + i22;
                int i24 = min - (i22 * 2);
                int i25 = i20 - a0.i(22.0f);
                int i26 = a0.i(10.0f);
                float J = J();
                float f11 = 1.0f - J;
                int i27 = a0.i(58.0f);
                int i28 = a0.i(50.0f);
                int topOffset = d1.getTopOffset() + a0.i(5.0f);
                int Df = Af - lk.Df();
                int i29 = measuredWidth / 2;
                float i30 = topOffset + a0.i(5.0f) + (((i10 - a0.i(98.0f)) - (topOffset + a0.i(19.0f))) * f11);
                float i31 = i27 + i28 + a0.i(13.0f);
                float S = (((i29 - (S() / 2)) - i11) * f11) + i31;
                float N = i31 + (((i29 - (N() / 2)) - i11) * f11);
                je.g gVar = this.f8630f0;
                if (gVar != null) {
                    f10 = J;
                    gVar.t(canvas, (int) S, (int) i30);
                } else {
                    f10 = J;
                }
                je.g gVar2 = this.f8631g0;
                if (gVar2 != null) {
                    gVar2.t(canvas, (int) N, ((int) i30) + a0.i(24.0f));
                }
                int R0 = ae.j.R0();
                float f12 = i20;
                canvas.drawText(this.f8636l0, i21 + i26, f12, y.c0(12.0f, R0));
                canvas.drawText(this.f8637m0, ((i21 + min) - this.f8638n0) - i26, f12, y.c0(12.0f, R0));
                float f13 = i24;
                float f14 = f13 * this.W;
                float f15 = f13 * this.f8644t0;
                float f16 = f13 * this.f8643s0;
                int i32 = a0.i(2.0f);
                int L = ae.j.L(R.id.theme_color_seekDone);
                if (f15 > 0.0f || f16 < f13) {
                    float f17 = i25;
                    i13 = min;
                    i15 = L;
                    i12 = topOffset;
                    i14 = measuredWidth;
                    i16 = i32;
                    canvas.drawLine(i23, f17, i24 + i23, f17, y.Y(ae.j.L(R.id.theme_color_seekEmpty), i32));
                } else {
                    i13 = min;
                    i12 = topOffset;
                    i15 = L;
                    i14 = measuredWidth;
                    i16 = i32;
                }
                float f18 = i23;
                float f19 = f18 + f15;
                float f20 = i25;
                float f21 = i16;
                canvas.drawLine(f19, f20, f18 + f16, f20, y.Y(ae.j.L(R.id.theme_color_seekReady), f21));
                canvas.drawLine(f18, f20, f18 + f14, f20, y.Y(i15, f21));
                float M = f18 + (f13 * M());
                canvas.drawCircle(M, f20, a0.i(6.0f) + (a0.i(4.0f) * this.V), y.g(i15));
                if (this.f8649y0 > 0.0f) {
                    int i33 = a0.i(4.0f);
                    int i34 = (int) M;
                    this.R.p(i34 - i33, i25 - i33, i34 + i33, i25 + i33);
                    this.R.c(canvas);
                }
                float f22 = 1.0f - f11;
                int i35 = (int) (i27 * f22);
                int i36 = (int) (i12 * f22);
                int i37 = i28 + ((int) ((i14 - i28) * f11));
                int i38 = i28 + ((int) ((Df - i28) * f11));
                int i39 = (int) (a0.i(4.0f) * f22);
                boolean z10 = f11 < 0.5f;
                if (this.M.e0() || z10) {
                    int i40 = i35 + i37;
                    int i41 = i36 + i38;
                    this.f8626c.K0(i35, i36, i40, i41);
                    if (this.f8626c.e0()) {
                        n0 n0Var = this.f8648x0;
                        if (n0Var == null || n0Var.e(this.f8624b)) {
                            if (i39 == 0) {
                                canvas.drawRect(i35, i36, i40, i41, y.g(ae.j.L(R.id.theme_color_playerCoverPlaceholder)));
                            } else {
                                RectF a02 = y.a0();
                                a02.set(i35, i36, i40, i41);
                                float f23 = i39;
                                canvas.drawRoundRect(a02, f23, f23, y.g(ae.j.L(R.id.theme_color_playerCoverPlaceholder)));
                            }
                            canvas.save();
                            canvas.clipRect(i35, i36, i40, i41);
                            int J0 = this.f8626c.J0();
                            int x02 = this.f8626c.x0();
                            float max = Math.max(this.f8626c.getWidth() / getMeasuredWidth(), this.f8626c.getHeight() / getMeasuredHeight()) * ((1.5f * f10) + 2.0f);
                            if (max != 1.0f) {
                                canvas.scale(max, max, J0, x02);
                            }
                            ce.c.b(canvas, this.S, J0 - (drawable.getMinimumWidth() / 2), x02 - (this.S.getMinimumHeight() / 2), y.Q());
                            canvas.restore();
                        }
                        n0 n0Var2 = this.f8648x0;
                        if (n0Var2 != null) {
                            i17 = i39;
                            n0Var2.b(this, canvas, this.f8624b, i35, i36, i37, i38, i39, 1.0f);
                            this.f8626c.draw(canvas);
                        }
                    }
                    i17 = i39;
                    this.f8626c.draw(canvas);
                } else {
                    i17 = i39;
                }
                int i42 = i35 + i37;
                int i43 = i38 + i36;
                this.M.K0(i35, i36, i42, i43);
                this.M.draw(canvas);
                int i44 = (int) (255.0f * f11);
                if (f11 > 0.0f) {
                    this.P.setAlpha((int) (i44 * 0.4f));
                    canvas.save();
                    int q10 = f3.q();
                    canvas.clipRect(i35, i36, i42, i43);
                    canvas.translate(i35, i43 - q10);
                    canvas.drawRect(0.0f, 0.0f, i37, q10, this.P);
                    int L2 = L();
                    i18 = 2;
                    int i45 = (a0.i(56.0f) / 2) - L2;
                    int i46 = (i14 - (a0.i(49.0f) / 2)) - L2;
                    this.Q.setAlpha(i44);
                    canvas.translate(i45 - i35, ((d1.getTopOffset() + (d1.a3(false) / 2)) - L2) - i19);
                    float f24 = L2 * 2;
                    canvas.drawRect(0.0f, 0.0f, f24, f24, this.Q);
                    canvas.translate(i46 - i45, 0.0f);
                    canvas.drawRect(0.0f, 0.0f, f24, f24, this.Q);
                    canvas.restore();
                } else {
                    i18 = 2;
                }
                int i47 = i17;
                if (i47 > 0) {
                    RectF a03 = y.a0();
                    int i48 = i47 / 2;
                    int i49 = i48 / 2;
                    a03.set(i35 - i49, i36 - i49, i42 + i49, i43 + i49);
                    float f25 = i47;
                    canvas.drawRoundRect(a03, f25, f25, y.Y(ae.j.u(), i48));
                }
                int i50 = (i13 / 5) / 6;
                int i51 = (i29 - (i13 / 2)) + i50;
                int i52 = (i13 - (i50 * 2)) / 5;
                for (int i53 = 0; i53 < 5; i53++) {
                    if (i53 == 0) {
                        view = this.N.f8615v0;
                    } else if (i53 == 1) {
                        view = this.N.f8618y0;
                    } else if (i53 == i18) {
                        view = this.N.f8619z0;
                    } else if (i53 == 3) {
                        view = this.N.f8617x0;
                    } else if (i53 == 4) {
                        view = this.N.f8616w0;
                    } else {
                        throw new IllegalArgumentException("i == " + i53);
                    }
                    view.setTranslationX((i51 + (i52 / 2)) - (view.getMeasuredWidth() / i18));
                    view.setTranslationY(i10 - (view.getMeasuredHeight() / i18));
                    i51 += i52;
                }
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredWidth = getMeasuredWidth();
            if (this.f8632h0 != measuredWidth) {
                this.f8632h0 = measuredWidth;
                l1();
                f1();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int measuredWidth = getMeasuredWidth();
            int Af = (this.N.Af() - a0.i(34.0f)) - a0.i(30.0f);
            int min = Math.min(measuredWidth, a0.i(480.0f));
            int i10 = measuredWidth != min ? (measuredWidth / 2) - (min / 2) : 0;
            int i11 = a0.i(12.0f);
            int i12 = i10 + i11;
            int i13 = min - (i11 * 2);
            int i14 = Af - a0.i(22.0f);
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                int i15 = (y10 > this.N.Af() ? 1 : (y10 == this.N.Af() ? 0 : -1));
                boolean z10 = i15 < 0 && this.f8640p0 > 0;
                if (z10) {
                    z10 = v0.o1(i12 + (i13 * M()), i14, x10, y10, a0.i(22.0f));
                }
                if (z10) {
                    z10 = this.N.c().F4().w2().x(this.f8647w0.getMessage());
                }
                if (z10) {
                    g0(ib.h.d((x10 - i12) / i13));
                }
                V0(z10, false);
                if (!z10) {
                    if (i15 >= 0) {
                        return false;
                    }
                    if (!this.f8634j0 && this.N.f8611r0.X(x10, y10) == null) {
                        return false;
                    }
                }
                return true;
            } else if (action != 1) {
                if (action == 2) {
                    if (this.T) {
                        g0(this.N.c().F4().w2().k0(this.f8640p0, ib.h.d((x10 - i12) / i13)));
                    }
                    return this.T;
                } else if (action != 3 || !this.T) {
                    return false;
                } else {
                    V0(false, false);
                    return true;
                }
            } else if (!this.T) {
                return false;
            } else {
                V0(false, true);
                return true;
            }
        }

        public final boolean p0() {
            long j10;
            long j11 = this.f8640p0;
            if (this.T) {
                j10 = E();
            } else {
                j10 = this.f8639o0;
            }
            int max = Math.max(0, (int) Math.floor(j10 / 1000.0d));
            return n0(Math.max(max, (int) Math.floor(((double) j11) / 1000.0d)) - max) || D0(max);
        }

        public final void q0() {
            if (p0()) {
                invalidate();
            }
            this.f8627c0 = false;
        }

        public final void setCollapseFactor(float f10) {
            if (this.f8633i0 != f10) {
                this.f8633i0 = f10;
                this.N.ig();
                invalidate();
            }
        }

        public void v0(long j10, long j11) {
            s sVar = this.f8647w0;
            if (sVar != null) {
                if (j11 == -1) {
                    j11 = sVar.c0().duration * 1000;
                }
                if (j10 == -1) {
                    j10 = 0;
                }
                if (w0(j10, j11)) {
                    invalidate();
                }
            }
        }

        public final boolean w0(long j10, long j11) {
            if (this.f8639o0 == j10 && this.f8640p0 == j11) {
                return false;
            }
            this.f8639o0 = j10;
            this.f8640p0 = j11;
            if (!this.T) {
                p0();
            }
            Q0(F(), false);
            return true;
        }

        public void y0(float f10, float f11, boolean z10) {
            float f12 = f11 + f10;
            if (z10) {
                k kVar = this.f8645u0;
                if (kVar == null || kVar.t() != f12) {
                    float f13 = this.f8643s0;
                    long j10 = f12 > f13 ? 160L : 120L;
                    k kVar2 = this.f8645u0;
                    if (kVar2 == null) {
                        this.f8645u0 = new k(0, this, db.b.f7287b, j10, f13);
                    } else {
                        kVar2.y(j10);
                    }
                    this.f8645u0.i(f12);
                }
                k kVar3 = this.f8646v0;
                if (kVar3 == null || kVar3.t() != f10) {
                    float f14 = this.f8644t0;
                    long j11 = f10 > f14 ? 160L : 120L;
                    k kVar4 = this.f8646v0;
                    if (kVar4 == null) {
                        this.f8646v0 = new k(6, this, db.b.f7287b, j11, f14);
                    } else {
                        kVar4.y(j11);
                    }
                    this.f8646v0.i(f10);
                    return;
                }
                return;
            }
            k kVar5 = this.f8645u0;
            if (kVar5 != null) {
                kVar5.l(f12);
            }
            G0(f12);
            k kVar6 = this.f8646v0;
            if (kVar6 != null) {
                kVar6.l(f10);
            }
            C0(f10);
        }
    }

    public static class d extends RecyclerView.o {
        public final lk f8651a;

        public d(lk lkVar) {
            this.f8651a = lkVar;
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            RecyclerView.c0 l02 = recyclerView.l0(view);
            ra raVar = (ra) view.getTag();
            if ((l02 == null || l02.k() != 0) && (raVar == null || raVar.A() != 73)) {
                rect.top = 0;
            } else {
                rect.top = this.f8651a.yf(recyclerView.getMeasuredWidth(), recyclerView.getMeasuredHeight());
            }
        }
    }

    public static class e extends RecyclerView {
        public lk f8652t1;
        public int f8653u1;

        public class a extends RecyclerView.t {
            public boolean f8654a;
            public final lk f8655b;

            public a(lk lkVar) {
                this.f8655b = lkVar;
            }

            @Override
            public void a(RecyclerView recyclerView, int i10) {
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                this.f8654a = z10;
            }

            @Override
            public void b(RecyclerView recyclerView, int i10, int i11) {
                if (i11 != 0 && this.f8654a) {
                    this.f8655b.hg();
                }
                this.f8655b.tf(i10 == 0 && i11 == 0);
            }
        }

        public e(Context context) {
            super(context);
        }

        public void F1(lk lkVar) {
            this.f8652t1 = lkVar;
            k(new a(lkVar));
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                if (getAlpha() == 0.0f) {
                    return true;
                }
                if (!this.f8652t1.J0 && motionEvent.getY() <= this.f8652t1.Af()) {
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            if (this.f8653u1 != measuredHeight) {
                if (!this.f8652t1.J0) {
                    this.f8652t1.vf(false);
                }
                if (this.f8653u1 != 0) {
                    A0();
                    if (!this.f8652t1.Qf(getMeasuredWidth(), getMeasuredHeight())) {
                        this.f8652t1.f8613t0.d0(true, false);
                    } else {
                        this.f8652t1.uf(true);
                    }
                } else if (!this.f8652t1.Qf(getMeasuredWidth(), getMeasuredHeight())) {
                    this.f8652t1.f8613t0.d0(true, false);
                }
                this.f8653u1 = measuredHeight;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !(getAlpha() == 0.0f && motionEvent.getAction() == 0) && super.onTouchEvent(motionEvent);
        }
    }

    public static class f extends FrameLayoutFix {
        public lk M;

        public f(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.M.yf(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)), Log.TAG_TDLIB_OPTIONS));
        }

        public void z1(lk lkVar) {
            this.M = lkVar;
        }
    }

    public static class g extends View implements k.b {
        public float M;
        public float f8658b = -1.0f;
        public final Path f8657a = new Path();
        public eb.f f8659c = new eb.f(0, this, db.b.f7287b, 160);

        public g(Context context) {
            super(context);
        }

        public void a(float f10) {
            if (this.M != f10) {
                this.M = f10;
                invalidate();
            }
        }

        public void b(boolean z10, boolean z11) {
            this.f8659c.p(z10, z11);
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            a(f10);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10 = a0.i(18.0f);
            Path path = this.f8657a;
            float f10 = this.f8658b;
            float f11 = this.M;
            this.f8658b = f11;
            ce.b.t(canvas, getMeasuredWidth() / 2, getMeasuredHeight() / 2, i10, path, f10, f11, 1.0f, ae.j.L(R.id.theme_color_playerButton));
        }
    }

    public static class h extends Handler {
        public final lk f8660a;

        public h(lk lkVar) {
            super(Looper.getMainLooper());
            this.f8660a = lkVar;
        }

        @Override
        public void handleMessage(Message message) {
            this.f8660a.Wf(message);
        }
    }

    public lk(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int Df() {
        return a0.i(112.0f) + d1.a3(false);
    }

    public boolean Of(s sVar, View view, int i10) {
        if (i10 == R.id.btn_delete) {
            this.f24495b.F4().w2().P0(sVar.getMessage(), true);
        }
        return true;
    }

    public static ra jg(s sVar) {
        sVar.j0(true);
        return new ra(41, R.id.btn_custom).G(sVar);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void Ac() {
        super.Ac();
        d1 d1Var = this.R;
        if (d1Var != null && this.f8613t0 != null) {
            d1Var.W3(this, W9(), this.f8613t0.J());
        }
    }

    public final int Af() {
        return Bf(this.f8611r0.getMeasuredWidth(), this.f8611r0.getMeasuredHeight(), Ff());
    }

    public final int Bf(int i10, int i11, float f10) {
        int yf = yf(i10, i11);
        if (!Qf(i10, i11)) {
            return yf;
        }
        float zf = zf(i10, i11, f10);
        int Df = Df() + d1.getTopOffset();
        return Df + ((int) ((yf - Df) * zf));
    }

    public final h Cf() {
        if (this.A0 == null) {
            synchronized (this) {
                if (this.A0 == null) {
                    this.A0 = new h(this);
                }
            }
        }
        return this.A0;
    }

    public final int Ef() {
        return o0.N(this.L0) == 4 ? R.drawable.round_repeat_one_24 : R.drawable.round_repeat_24;
    }

    public final float Ff() {
        return ib.h.d(this.O0);
    }

    public final int Gf() {
        return this.f8609p0.size() - 2;
    }

    public final void Hf() {
        If(Jf(), true);
    }

    public final void If(int i10, boolean z10) {
        if (i10 != -1) {
            int xf = xf();
            int measuredHeight = this.f8611r0.getMeasuredHeight();
            int i11 = a0.i(65.0f);
            int Gf = Gf();
            int Df = Df();
            int W = (((Gf * i11) + xf) - measuredHeight) + ap.W(42);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8611r0.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            if (X1 != -1) {
                this.f8611r0.C1();
                View C = linearLayoutManager.C(X1);
                int U = C != null ? linearLayoutManager.U(C) : 0;
                int i12 = X1 == 0 ? -U : (-U) + xf + ((X1 - 1) * i11);
                int max = Math.max(0, Math.min(W, (((xf + (i10 * i11)) - Df) - ((measuredHeight - Df) / 2)) + (i11 / 2)));
                if (z10) {
                    ((o) this.f8609p0.get(i10 + 1).d()).y();
                }
                this.f8611r0.u1(0, max - i12);
            }
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more) {
            jb.c cVar = new jb.c(3);
            u0 u0Var = new u0(3);
            TdApi.Message message = this.K0.getMessage();
            if (t2.T2(t2.j1(message))) {
                cVar.a(R.id.btn_saveFile);
                u0Var.a(R.string.SaveToMusic);
            }
            if (message.chatId != 0) {
                cVar.a(R.id.btn_share);
                u0Var.a(R.string.Share);
                cVar.a(R.id.btn_showInChat);
                u0Var.a(R.string.ShowInChat);
            }
            if (this.f8609p0.size() > 5 && this.J0) {
                cVar.a(R.id.btn_showInPlaylist);
                u0Var.a(R.string.PlayListHighlight);
            }
            if (this.f24495b.F4().w2().w()) {
                cVar.a(R.id.btn_reverseOrder);
                u0Var.a(R.string.PlayListReverse);
            }
            Yd(cVar.e(), u0Var.d(), 0);
        }
    }

    public final int Jf() {
        if (this.K0 == null) {
            return -1;
        }
        int size = this.f8609p0.size();
        TdApi.Message message = this.K0.getMessage();
        for (int i10 = 1; i10 < size - 1; i10++) {
            ra raVar = this.f8609p0.get(i10);
            if (raVar.d() == this.K0 || o0.D(message, ((o) raVar.d()).getMessage())) {
                return i10 - 1;
            }
        }
        return -1;
    }

    @Override
    public void K0(o6 o6Var, int i10, int i11, TdApi.File file) {
        if (i11 == 2 && file != null) {
            cg(file);
        }
    }

    @Override
    public void K1(o6 o6Var, TdApi.Message message, int i10, boolean z10) {
        if ((this.L0 & Log.TAG_ROUND) != 0) {
            i10 = (Gf() - i10) - 1;
        }
        this.f8608o0.j1(i10 + 1);
        rf(-((TdApi.MessageAudio) message.content).audio.duration);
    }

    @Override
    public void K6(o6 o6Var, TdApi.Message message, int i10) {
        o<?> X = o.X(this.f24493a, o6Var, message);
        if ((X instanceof s) && X.v() == 7) {
            s sVar = (s) X;
            this.f8608o0.s0((this.L0 & Log.TAG_ROUND) != 0 ? (Gf() + 1) - i10 : i10 + 1, jg(sVar));
            rf(sVar.c0().duration);
        }
    }

    public final boolean Kf() {
        return this.K0 != null && this.f24495b.F4().w2().O(this.f24495b, this.K0.getMessage()) == 3;
    }

    @Override
    public void L6(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, boolean z10, int i11) {
        eg(i10, true);
        this.K0.k0(true);
    }

    public final boolean Lf() {
        return (this.L0 & 6) != 0;
    }

    @Override
    public boolean Me() {
        return true;
    }

    public final boolean Mf() {
        return (this.L0 & 1) != 0;
    }

    @Override
    public int N9() {
        return ib.d.d(-1, ae.j.L(R.id.theme_color_headerLightIcon), this.f8613t0.J());
    }

    public final boolean Nf() {
        return Gf() <= 1;
    }

    @Override
    public void P0(int i10) {
        switch (i10) {
            case R.id.btn_reverseOrder:
                this.f24495b.F4().w2().k1();
                return;
            case R.id.btn_saveFile:
                t2.e f12 = t2.f1(this.K0.getMessage());
                if (f12 != null) {
                    t2.Y4(f12);
                    return;
                }
                return;
            case R.id.btn_share:
                y00 y00Var = new y00(this.f24493a, this.f24495b);
                y00Var.Vi(new y00.m(this.K0.getMessage()).A(true));
                y00Var.ej();
                return;
            case R.id.btn_showInChat:
                TdApi.Message message = this.K0.getMessage();
                if (t2.A3(message)) {
                    this.f24495b.hd().A7(this, message);
                    return;
                } else {
                    this.f24495b.hd().s7(this, message, null);
                    return;
                }
            case R.id.btn_showInPlaylist:
                Hf();
                return;
            default:
                return;
        }
    }

    @Override
    public void P1(o6 o6Var, List<TdApi.Message> list, boolean z10) {
        s sVar;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z11 = false;
        int i10 = 1;
        boolean z12 = (this.L0 & Log.TAG_ROUND) != 0;
        long j10 = 0;
        while (true) {
            size--;
            if (size >= 0) {
                o<?> X = o.X(this.f24493a, o6Var, list.get(z12 ? size : (list.size() - 1) - size));
                if ((X instanceof s) && X.v() == 7) {
                    arrayList.add(jg((s) X));
                    j10 += sVar.c0().duration;
                } else {
                    return;
                }
            } else if (!arrayList.isEmpty()) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8611r0.getLayoutManager();
                int X1 = linearLayoutManager.X1();
                int max = X1 != -1 ? Math.max(1, X1) : -1;
                View I = linearLayoutManager.I(max);
                int U = I != null ? linearLayoutManager.U(I) : 0;
                if (z12 != z10) {
                    z11 = true;
                }
                if (z11) {
                    i10 = this.f8609p0.size() - 1;
                }
                this.f8609p0.addAll(i10, arrayList);
                this.f8608o0.M(i10, arrayList.size());
                if (!z11 && max != -1) {
                    linearLayoutManager.z2(max + list.size(), U);
                }
                rf(j10);
                return;
            } else {
                return;
            }
        }
    }

    public final boolean Pf() {
        return Qf(this.f8611r0.getMeasuredWidth(), this.f8611r0.getMeasuredHeight());
    }

    public final boolean Qf(int i10, int i11) {
        int Df = Df();
        if ((i11 != 0 ? i10 / i11 : 0.0f) > 0.7f) {
            return false;
        }
        int topOffset = d1.getTopOffset();
        return (topOffset + ((i11 - topOffset) / 2)) + Df > Df / 2;
    }

    @Override
    public int R9() {
        return R.id.controller_playback;
    }

    public final void Rf(int i10, int i11, boolean z10) {
        if (i10 != i11) {
            if (z10) {
                this.N0 = true;
                this.f24495b.F4().w2().h0(i10, i11);
                this.N0 = false;
            }
            if ((this.L0 & Log.TAG_ROUND) != 0) {
                int Gf = Gf();
                i10 = (Gf - i10) - 1;
                i11 = (Gf - i11) - 1;
            }
            this.f8608o0.u1(i10 + 1, i11 + 1);
        }
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        if (f11 >= Df() + d1.getTopOffset() && this.O0 != 0.0f) {
            return !this.J0 && f11 < ((float) Af());
        }
        return true;
    }

    public final ImageView Sf(int i10, int i11, boolean z10) {
        ImageView imageView = new ImageView(t());
        imageView.setId(i10);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(i11);
        imageView.setLayoutParams(FrameLayoutFix.q1(a0.i(64.0f), a0.i(48.0f)));
        int i12 = z10 ? R.id.theme_color_playerButtonActive : R.id.theme_color_playerButton;
        imageView.setColorFilter(ae.j.L(i12));
        imageView.setOnClickListener(this);
        q8(imageView, i12);
        return imageView;
    }

    public final void Tf(float f10, float f11) {
        if (Qf(this.f8611r0.getMeasuredWidth(), this.f8611r0.getMeasuredHeight()) && f10 != f11) {
            if ((f10 >= 0.0f && f10 <= 1.0f) || (f11 >= 0.0f && f11 <= 1.0f)) {
                this.f8613t0.invalidate();
            }
        }
    }

    @Override
    public void U0(TdApi.File file) {
        cg(file);
    }

    public final void Uf() {
        this.f8611r0.setAlpha(Gf() <= 1 ? 0.0f : 1.0f);
        this.f8608o0.p3(R.id.btn_info);
    }

    public int Vf() {
        TdApi.Message J;
        List<TdApi.Message> S = this.f24495b.F4().w2().S();
        if (S == null || S.isEmpty() || (J = this.f24495b.F4().w2().J()) == null) {
            return -1;
        }
        long L = this.f24495b.F4().w2().L();
        int Q = this.f24495b.F4().w2().Q();
        ArrayList arrayList = new ArrayList(S.size() + 2);
        arrayList.add(new ra(73));
        int sf = sf(arrayList, this.f24495b, J, S, L, Q);
        if (sf == -1) {
            return -1;
        }
        arrayList.add(new ra(42, R.id.btn_info));
        a aVar = new a(this);
        this.f8608o0 = aVar;
        aVar.s2(arrayList, false);
        this.f8609p0 = this.f8608o0.D0();
        return sf;
    }

    @Override
    public int W9() {
        return R.id.menu_player;
    }

    public final void Wf(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 == 1) {
                this.f8613t0.q0();
            } else if (i10 == 2) {
                if (message.arg1 != 1) {
                    z10 = false;
                }
                tf(z10);
            } else if (i10 == 3) {
                if (message.arg1 != 1) {
                    z10 = false;
                }
                wf(z10);
            }
        } else {
            cg((TdApi.File) message.obj);
        }
    }

    @Override
    public CharSequence X9() {
        return "";
    }

    public final void Xf(final s sVar) {
        if (this.K0 != null) {
            ee(w.m1(R.string.PlayListRemoveTrack, sVar.f0() + " – " + sVar.e0()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.PlayListRemove), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean Of;
                    Of = lk.this.Of(sVar, view, i10);
                    return Of;
                }
            });
        }
    }

    public final int Yf(int i10) {
        return Zf(i10, Gf(), (this.L0 & Log.TAG_ROUND) != 0);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.F4().w2().S0(this);
        t1.b().d(this);
        t1.b().d(this.f8608o0);
        p0.n(this.f8611r0);
        this.f8613t0.B0(null);
    }

    public final int Zf(int i10, int i11, boolean z10) {
        return z10 ? (i11 - 1) - i10 : i10;
    }

    public final void ag(long j10, long j11, long j12, boolean z10, boolean z11, List<TdApi.Message> list) {
        if (!this.C0) {
            this.C0 = true;
            this.D0 = j10;
            this.E0 = j11;
            this.F0 = j12;
            this.G0 = z10;
            this.H0 = z11;
            if (list == null || list.isEmpty()) {
                this.I0 = null;
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            this.I0 = arrayList;
            arrayList.addAll(list);
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public final void bg(ImageView imageView, boolean z10) {
        qd(imageView);
        int i10 = z10 ? R.id.theme_color_playerButtonActive : R.id.theme_color_playerButton;
        imageView.setColorFilter(ae.j.L(i10));
        q8(imageView, i10);
    }

    public final void cg(TdApi.File file) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            h Cf = Cf();
            Cf.sendMessage(Message.obtain(Cf, 0, file));
            return;
        }
        s sVar = this.K0;
        if (sVar != null && file.f19913id == sVar.d0().f19913id) {
            this.f8613t0.y0(t2.p1(file), t2.r1(file), true);
        }
    }

    public final void dg(s sVar, boolean z10) {
        float f10;
        s sVar2 = this.K0;
        if (sVar2 != sVar) {
            boolean z11 = sVar2 != null;
            if (z11) {
                this.f24495b.F4().w2().T0(this.f24495b, this.K0.getMessage(), this);
                this.f24495b.m5().D0(this.K0.d0().f19913id, this);
                if (z10) {
                    this.K0.k0(false);
                }
            }
            this.K0 = sVar;
            this.f8613t0.B0(sVar);
            float f11 = 0.0f;
            if (sVar != null) {
                if (z10) {
                    sVar.k0(true);
                }
                this.f24495b.F4().w2().r(this.f24495b, sVar.getMessage(), this);
                this.f24495b.m5().B0(sVar.d0(), this);
                f11 = t2.p1(sVar.d0());
                f10 = t2.r1(sVar.d0());
            } else {
                f10 = 0.0f;
            }
            this.f8613t0.y0(f11, f10, z11);
            wf(z11);
        } else if (sVar != null && z10) {
            sVar.k0(true);
            sVar.l0(true);
        }
    }

    @Override
    public void e2() {
        c cVar = this.f8613t0;
        if (cVar != null) {
            cVar.invalidate();
        }
    }

    public final void eg(int i10, boolean z10) {
        dg((s) this.f8609p0.get(Yf(i10) + 1).d(), z10);
    }

    public final void fg(int i10) {
        if (this.L0 != i10) {
            this.L0 = i10;
        }
    }

    @Override
    public void g6() {
        this.f8608o0.p3(R.id.btn_info);
    }

    public final void gg(float f10, float f11) {
        if (this.O0 != f10) {
            float Ff = Ff();
            this.O0 = f10;
            Tf(Ff, Ff());
        }
        if (this.P0 != f11) {
            this.P0 = f11;
            if (!Pf()) {
                this.f8614u0.setAlpha(f11);
            }
        }
    }

    public final void hg() {
        if (!this.J0) {
            this.J0 = true;
        }
    }

    @Override
    public void i(o6 o6Var, long j10, long j11, int i10, int i11) {
        s sVar;
        if ((i11 == 2 || i11 == 3) && (sVar = this.K0) != null && o0.C(sVar.getMessage(), j10, j11, i10)) {
            boolean z10 = i11 == 3;
            this.f8619z0.b(z10, true);
            s sVar2 = this.K0;
            if (sVar2 != null) {
                sVar2.l0(z10);
            }
        }
    }

    public void ig() {
        d1 d1Var = this.R;
        if (d1Var != null && this.f8613t0 != null) {
            d1Var.W3(this, W9(), this.f8613t0.J());
            this.R.P3(this, N9());
        }
    }

    @Override
    public void j1(o6 o6Var, TdApi.Message message, int i10, int i11) {
        if (!this.N0) {
            Rf(i10, i11, false);
        }
    }

    @Override
    public o0.b m5(TdApi.Message message) {
        if (this.C0) {
            int Gf = Gf();
            if (Gf > 0) {
                ArrayList arrayList = new ArrayList(Gf);
                boolean z10 = (this.L0 & Log.TAG_ROUND) != 0;
                int i10 = Gf;
                int i11 = -1;
                while (true) {
                    i10--;
                    if (i10 >= 0) {
                        TdApi.Message message2 = ((s) this.f8609p0.get(z10 ? i10 + 1 : Gf - i10).d()).getMessage();
                        if (message == message2 || o0.D(message, message2)) {
                            if (i11 == -1) {
                                i11 = arrayList.size();
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        arrayList.add(message2);
                    } else {
                        this.B0 = true;
                        o0.b bVar = new o0.b(arrayList, i11);
                        bVar.q(this.L0 & 98304);
                        bVar.r(this.D0, this.E0, this.F0);
                        bVar.t(this.I0);
                        bVar.s(this.G0, this.H0);
                        this.C0 = false;
                        return bVar;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void m7(o6 o6Var, long j10, long j11, long j12, boolean z10, boolean z11, List<TdApi.Message> list) {
        this.f8619z0.b(false, true);
        s sVar = this.K0;
        if (sVar != null) {
            sVar.k0(false);
            dg((s) this.f8609p0.get(1).d(), false);
            this.f8613t0.v0(-1L, -1L);
        }
        ag(j10, j11, j12, z10, z11, list);
    }

    @Override
    public View oc(Context context) {
        if (this.f8608o0 != null) {
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
            frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            yd.g.i(frameLayoutFix, R.id.theme_color_filling, this);
            e eVar = new e(context);
            this.f8611r0 = eVar;
            eVar.F1(this);
            this.f8611r0.setVerticalScrollBarEnabled(false);
            this.f8611r0.setLayoutManager(new LinearLayoutManager(context, 1, false));
            this.f8611r0.g(new d(this));
            this.f8611r0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.f8611r0.setAdapter(this.f8608o0);
            this.f8611r0.setItemAnimator(new tc.d(db.b.f7287b, 180L));
            this.f8611r0.setAlpha(Nf() ? 0.0f : 1.0f);
            frameLayoutFix.addView(this.f8611r0);
            androidx.recyclerview.widget.g[] gVarArr = {new androidx.recyclerview.widget.g(new b(gVarArr))};
            gVarArr[0].m(this.f8611r0);
            f fVar = new f(context);
            this.f8612s0 = fVar;
            fVar.z1(this);
            this.f8612s0.setLayoutParams(FrameLayoutFix.q1(-1, -2));
            frameLayoutFix.addView(this.f8612s0);
            c cVar = new c(context);
            this.f8613t0 = cVar;
            cVar.T(this);
            this.f8613t0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.f8612s0.addView(this.f8613t0);
            t8(this.f8613t0);
            f3 f3Var = new f3(context);
            this.f8614u0 = f3Var;
            f3Var.setSimpleBottomTransparentShadow(true);
            this.f8614u0.setAlpha(0.0f);
            f3 f3Var2 = this.f8614u0;
            f3Var2.setLayoutParams(FrameLayoutFix.t1(f3Var2.getLayoutParams()));
            frameLayoutFix.addView(this.f8614u0);
            t8(this.f8614u0);
            this.f8615v0 = Sf(R.id.btn_shuffle, R.drawable.round_shuffle_24, Mf());
            this.f8617x0 = Sf(R.id.btn_next, R.drawable.round_skip_next_36, false);
            this.f8618y0 = Sf(R.id.btn_previous, R.drawable.round_skip_previous_36, false);
            this.f8616w0 = Sf(R.id.btn_repeat, Ef(), Lf());
            g gVar = new g(context);
            this.f8619z0 = gVar;
            gVar.setId(R.id.btn_play);
            this.f8619z0.setOnClickListener(this);
            this.f8619z0.setLayoutParams(FrameLayoutFix.q1(a0.i(64.0f), a0.i(64.0f)));
            t8(this.f8619z0);
            frameLayoutFix.addView(this.f8615v0);
            frameLayoutFix.addView(this.f8616w0);
            frameLayoutFix.addView(this.f8618y0);
            frameLayoutFix.addView(this.f8617x0);
            frameLayoutFix.addView(this.f8619z0);
            this.f24495b.F4().w2().q(this, false);
            dg((s) this.f8609p0.get(this.f8607n0 + 1).d(), true);
            t1.b().a(this);
            t1.b().a(this.f8608o0);
            boolean Kf = Kf();
            this.f8619z0.b(Kf, false);
            this.K0.l0(Kf);
            return frameLayoutFix;
        }
        throw new IllegalStateException("Using PlaybackController without calling prepare()");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_custom:
                this.f24495b.F4().w2().H0(this.f24495b, ((s) ((ra) view.getTag()).d()).getMessage(), this);
                return;
            case R.id.btn_next:
                this.f24495b.F4().w2().c1(true);
                return;
            case R.id.btn_play:
                if (this.K0 != null) {
                    this.f24495b.F4().w2().H0(this.f24495b, this.K0.getMessage(), this);
                    return;
                }
                return;
            case R.id.btn_previous:
                this.f24495b.F4().w2().c1(false);
                return;
            case R.id.btn_repeat:
                this.f24495b.F4().w2().j1();
                return;
            case R.id.btn_shuffle:
                this.f24495b.F4().w2().i1(1);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean p7(TdApi.Message message, boolean z10, boolean z11, List<TdApi.Message> list, long j10) {
        return true;
    }

    public final void rf(long j10) {
        if (j10 != 0) {
            this.f8610q0 += j10;
        }
        Uf();
    }

    @Override
    public void sc() {
        super.sc();
        this.f8613t0.h0(false);
        a9(R.id.controller_playback);
    }

    public final int sf(List<ra> list, o6 o6Var, TdApi.Message message, List<TdApi.Message> list2, long j10, int i10) {
        List<TdApi.Message> list3;
        int i11;
        s sVar;
        int i12 = 1;
        boolean z10 = (32768 & i10) != 0;
        int size = list2.size();
        long j11 = 0;
        int i13 = -1;
        while (true) {
            int i14 = size - 1;
            if (i14 >= 0) {
                if (z10) {
                    list3 = list2;
                    i11 = i14;
                } else {
                    i11 = (list2.size() - i12) - i14;
                    list3 = list2;
                }
                TdApi.Message message2 = list3.get(i11);
                o<?> X = o.X(this.f24493a, o6Var, message2);
                if (!(X instanceof s) || X.v() != 7) {
                    break;
                }
                if (o0.D(message, message2)) {
                    if (i13 == -1) {
                        i13 = list.size() - i12;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                list.add(jg((s) X));
                j11 += sVar.c0().duration;
                size = i14;
                i12 = 1;
            } else if (i13 != -1) {
                this.f8607n0 = i13;
                this.f8610q0 = j11;
                this.M0 = j10;
                fg(i10);
                return i13;
            } else {
                throw new IllegalStateException();
            }
        }
        list.clear();
        return -1;
    }

    public final void tf(boolean z10) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8611r0.getLayoutManager();
        int a22 = linearLayoutManager.a2();
        if (a22 != -1 && a22 + 10 >= Gf()) {
            this.f24495b.F4().w2().U0();
        }
        int X1 = linearLayoutManager.X1();
        if (X1 != -1) {
            if (X1 > 0) {
                gg(1.0f, 1.0f);
                if (this.J0) {
                    this.f8613t0.d0(true, !z10);
                    return;
                }
                return;
            }
            View C = linearLayoutManager.C(X1);
            if (C != null) {
                int top = C.getTop();
                int n02 = linearLayoutManager.n0(C);
                int xf = xf();
                if (!(n02 == xf || top <= 0 || n02 == 0)) {
                    top = (int) (top * (xf / n02));
                }
                int Df = Df() + d1.getTopOffset();
                int i10 = top - Df;
                if (i10 < 0) {
                    gg(1.0f, ib.h.d((-i10) / a0.i(12.0f)));
                    if (this.J0) {
                        this.f8613t0.d0(true, !z10);
                        return;
                    }
                    return;
                }
                int xf2 = xf() - Df;
                gg(ib.h.d((i10 > xf2 || xf2 == 0) ? 0.0f : 1.0f - (i10 / xf2)), 0.0f);
                if (Pf()) {
                    boolean z11 = false;
                    int topOffset = d1.getTopOffset() + (d1.a3(false) / 2);
                    if (this.J0) {
                        c cVar = this.f8613t0;
                        if (i10 <= topOffset) {
                            z11 = true;
                        }
                        cVar.d0(z11, !z10);
                    }
                }
            }
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_player) {
            d1Var.c2(linearLayout, this, 0).h(R.id.theme_color_white, R.id.theme_color_headerLightIcon, this.f8613t0.J());
        }
    }

    @Override
    public void u4(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, long j10, int i11, int i12) {
        if (this.B0) {
            this.B0 = false;
            eg(i10, true);
            return;
        }
        List<ra> list2 = this.f8609p0;
        ra raVar = list2.get(list2.size() - 1);
        int size = this.f8609p0.size() - 2;
        this.f8609p0.clear();
        ib.b.m(this.f8609p0, list.size() + 1);
        this.f8609p0.add(this.f8609p0.get(0));
        if (sf(this.f8609p0, o6Var, message, list, j10, i11) != -1) {
            this.f8609p0.add(raVar);
            int size2 = this.f8609p0.size() - 2;
            this.f8608o0.L(1, Math.min(size2, size));
            if (size2 > size) {
                this.f8608o0.M(size + 1, size2 - size);
            } else if (size2 < size) {
                this.f8608o0.N(size + 1, size - size2);
            }
            dg((s) this.f8609p0.get(this.f8607n0 + 1).d(), true);
            Uf();
            return;
        }
        throw new IllegalStateException();
    }

    public final void uf(boolean z10) {
        Cf().sendMessage(Message.obtain(Cf(), 2, z10 ? 1 : 0, 0));
    }

    @Override
    public void v4(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: de.lk.v4(int):void");
    }

    public final void vf(boolean z10) {
        Cf().sendMessage(Message.obtain(Cf(), 3, z10 ? 1 : 0, 0));
    }

    public final void wf(boolean z10) {
        if (!this.J0 && Math.min(this.f8611r0.getMeasuredWidth(), this.f8611r0.getMeasuredHeight()) > 0) {
            int Jf = Jf();
            if (Jf != -1) {
                int xf = xf();
                int measuredHeight = this.f8611r0.getMeasuredHeight();
                int i10 = a0.i(65.0f);
                int Gf = Gf();
                Df();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8611r0.getLayoutManager();
                int i11 = Jf + 1;
                int i12 = Jf != 0 ? i10 : 0;
                int i13 = Jf * i10;
                int i14 = (Gf * i10) - ((measuredHeight - xf) - i10);
                if (i13 > i14) {
                    i12 += i13 - i14;
                }
                int X1 = linearLayoutManager.X1();
                View C = X1 != -1 ? linearLayoutManager.C(X1) : null;
                int U = C != null ? linearLayoutManager.U(C) : 0;
                if (!z10 || C == null) {
                    linearLayoutManager.z2(i11, xf + i12);
                    return;
                }
                int max = (-U) + (Math.max(0, X1 - 1) * i10);
                if (X1 <= 0) {
                    xf = 0;
                }
                this.f8611r0.u1(0, ((i10 * Math.max(0, i11 - 1)) - i12) - (max + xf));
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override
    public void x6(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10) {
        s sVar = this.K0;
        if (sVar != null && o0.C(sVar.getMessage(), j10, j11, i10)) {
            this.f8613t0.v0(j12, j13);
        }
    }

    public final int xf() {
        return yf(this.f8611r0.getMeasuredWidth(), this.f8611r0.getMeasuredHeight());
    }

    public final int yf(int i10, int i11) {
        int Df = Df();
        if ((i11 != 0 ? i10 / i11 : 0.0f) <= 0.7f) {
            d1.getTopOffset();
            int i12 = i10 + Df;
            if (i12 > Df / 2) {
                return i12;
            }
        }
        return Df + d1.getTopOffset();
    }

    public final float zf(int i10, int i11, float f10) {
        if (f10 >= 1.0f || !Qf(i10, i11)) {
            return 0.0f;
        }
        return (1.0f - f10) * (1.0f - this.f8613t0.f8633i0);
    }
}
