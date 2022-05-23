package tc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.o;
import ce.p0;
import ce.y;
import eb.f;
import eb.k;
import gd.w;
import hd.b;
import ib.i;
import je.e;
import kb.c;
import ld.h;
import ld.p;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.a;
import ne.b0;
import ne.b2;
import ne.m2;
import ne.r3;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.d;

public class k2 extends FrameLayoutFix implements a, c, k.b, r3.a {
    public z1 M;
    public TextView N;
    public TextView O;
    public p P;
    public b0 Q;
    public r3 R;
    public int U;
    public v4<?> V;
    public e f23236a0;
    public float f23237b0;
    public b f23238c0;
    public Runnable f23239d0;
    public f f23240e0;
    public m2 f23241f0;
    public long f23242g0;
    public int W = R.id.theme_color_fileAttach;
    public final Drawable S = ce.c.g(getResources(), R.drawable.baseline_location_on_18);
    public final Drawable T = ce.c.g(getResources(), R.drawable.baseline_location_on_24);

    public k2(Context context) {
        super(context);
    }

    private void setIsRed(boolean z10) {
        int h10 = ib.c.h(this.U, 1, z10);
        if (this.U != h10) {
            this.U = h10;
            v4<?> v4Var = this.V;
            if (v4Var != null) {
                v4Var.qd(this.N);
            }
            int i10 = z10 ? R.id.theme_color_textNegative : R.id.theme_color_text;
            this.N.setTextColor(j.L(i10));
            v4<?> v4Var2 = this.V;
            if (v4Var2 != null) {
                v4Var2.z8(this.N, i10);
            }
        }
    }

    public void A1(v4<?> v4Var, boolean z10) {
        Context context = getContext();
        this.V = v4Var;
        int i10 = a0.i(20.0f);
        int i11 = a0.i(8.0f) + (z10 ? a0.i(4.0f) : 0);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, 16);
        r12.bottomMargin = a0.i(10.0f);
        int i12 = i10 * 2;
        int i13 = i12 + i12;
        r12.leftMargin = i13;
        r12.rightMargin = i10;
        b2 b2Var = new b2(context);
        this.N = b2Var;
        b2Var.setTypeface(o.i());
        this.N.setTextSize(1, 16.0f);
        this.N.setTextColor(j.P0());
        if (v4Var != null) {
            v4Var.y8(this.N);
        }
        this.N.setSingleLine();
        this.N.setLayoutParams(r12);
        this.N.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.N);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-1, -2, 16);
        r13.topMargin = a0.i(10.0f);
        r13.leftMargin = i13;
        r13.rightMargin = i10;
        b2 b2Var2 = new b2(context);
        this.O = b2Var2;
        b2Var2.setTypeface(o.k());
        this.O.setTextSize(1, 13.0f);
        this.O.setTextColor(j.R0());
        if (v4Var != null) {
            v4Var.A8(this.O);
        }
        this.O.setSingleLine();
        this.O.setLayoutParams(r13);
        this.O.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.O);
        FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(a0.i(26.0f), a0.i(26.0f), 21);
        r14.rightMargin = a0.i(10.0f);
        r3 r3Var = new r3(context);
        this.R = r3Var;
        r3Var.setListener(this);
        this.R.setTextColor(j.F0());
        if (v4Var != null) {
            v4Var.z8(this.R, R.id.theme_color_progress);
        }
        this.R.setLayoutParams(r14);
        addView(this.R);
        FrameLayout.LayoutParams r15 = FrameLayoutFix.r1((a0.i(1.0f) * 2) + i12, (a0.i(1.0f) * 2) + i12, 51);
        r15.leftMargin = i10 - a0.i(1.0f);
        r15.topMargin = i11 - a0.i(1.0f);
        b0 b0Var = new b0(context);
        this.Q = b0Var;
        b0Var.m(4);
        if (v4Var != null) {
            v4Var.t8(this.Q);
        }
        this.Q.setLayoutParams(r15);
        addView(this.Q);
        p pVar = new p(this, 0);
        this.P = pVar;
        pVar.K0(i10 + 0, i11 + 0, (i10 + i12) - 0, (i11 + i12) - 0);
        setWillNotDraw(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(z10 ? 64.0f : 56.0f)));
        p0.T(this);
        d.h(this, v4Var);
    }

    public void B1(Runnable runnable, long j10) {
        Runnable runnable2 = this.f23239d0;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f23239d0 = runnable;
        if (runnable != null) {
            postDelayed(runnable, j10);
        }
    }

    public void C1(boolean z10, boolean z11) {
        if (z11) {
            this.Q.setChecked(z10);
        } else {
            this.Q.k(z10);
        }
    }

    public void D1(boolean z10, boolean z11) {
        f fVar = this.f23240e0;
        if ((fVar != null && fVar.h()) != z10) {
            if (this.f23240e0 == null) {
                this.f23240e0 = new f(0, this, db.b.f7287b, 180L);
            }
            if (this.f23241f0 == null) {
                this.f23241f0 = m2.F(this, 5.0f, this.P.getLeft(), this.P.getTop(), this.P.getWidth(), this.P.getHeight());
            }
            this.f23240e0.p(z10, z11);
        }
    }

    public void E1(String str, String str2, boolean z10, boolean z11, boolean z12, int i10, long j10) {
        this.U = ib.c.h(ib.c.h(ib.c.h(this.U, 8, z11), 2, z12), 4, true);
        this.f23239d0 = null;
        this.f23236a0 = null;
        setIsRed(z10);
        setIsFaded(z12);
        this.R.c(i10, j10);
        this.N.setText(str);
        this.O.setText(str2);
        this.P.G(null);
        this.Q.k(false);
        this.P.invalidate();
    }

    public void G1(String str, String str2, int i10, e eVar, boolean z10, int i11, long j10) {
        boolean z11;
        z1();
        setIsFaded(z10);
        this.R.c(i11, j10);
        this.N.setText(str);
        this.O.setText(str2);
        boolean z12 = true;
        if (this.W != i10) {
            this.W = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        e eVar2 = this.f23236a0;
        String str3 = null;
        String str4 = eVar2 != null ? eVar2.f15363a : null;
        if (eVar != null) {
            str3 = eVar.f15363a;
        }
        if (!i.c(str4, str3)) {
            this.f23236a0 = eVar;
            this.f23237b0 = y.v0(eVar, 17.0f);
        } else {
            z12 = z11;
        }
        if (z12) {
            this.P.invalidate();
        }
    }

    public void H1(z1 z1Var, boolean z10) {
        z1();
        z1 z1Var2 = this.M;
        if (z1Var2 == null || !z1Var2.equals(z1Var)) {
            this.M = z1Var;
            this.P.G(z1Var.c());
            this.N.setText(z1Var.f());
            this.O.setText(z1Var.b());
        }
        this.Q.k(z10);
    }

    public void I1(CharSequence charSequence) {
        this.O.setText(charSequence);
    }

    @Override
    public void Q2() {
        this.P.b0();
    }

    @Override
    public void b() {
        this.P.b();
    }

    @Override
    public void e() {
        this.P.e();
    }

    public z1 getLocation() {
        return this.M;
    }

    public Runnable getSubtitleUpdater() {
        return this.f23239d0;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        this.f23241f0.o(f10);
        invalidate();
    }

    @Override
    public void o1(r3 r3Var, boolean z10) {
        int i10 = a0.i(20.0f) + (this.R.a() ? a0.i(26.0f) : 0);
        p0.d0(this.N, i10);
        p0.d0(this.O, i10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int m10 = this.P.m();
        int n10 = this.P.n();
        int i10 = this.U;
        float f10 = (i10 & 2) != 0 ? 0.6f : 1.0f;
        if ((i10 & 4) != 0) {
            f fVar = this.f23240e0;
            float g10 = fVar != null ? fVar.g() : 0.0f;
            float f11 = m10;
            float f12 = n10;
            canvas.drawCircle(f11, f12, a0.i(20.0f), y.g(ib.d.a(f10, j.L(R.id.theme_color_fileRed))));
            if (g10 < 1.0f) {
                Paint W = y.W(-1);
                int i11 = (int) ((1.0f - g10) * 255.0f * f10);
                W.setAlpha(i11);
                ce.c.b(canvas, this.S, m10 - (drawable2.getMinimumWidth() / 2), n10 - (this.S.getMinimumHeight() / 2), W);
                W.setAlpha(255);
                if ((this.U & 8) != 0) {
                    long B = ce.b.B(canvas, f11, f12, ib.d.b(i11, 16777215), false, this.f23242g0);
                    if (B != -1) {
                        this.f23242g0 = SystemClock.uptimeMillis() + B;
                        postInvalidateDelayed(B, this.P.getLeft(), this.P.getTop(), this.P.getRight(), this.P.getBottom());
                    }
                }
            }
            m2 m2Var = this.f23241f0;
            if (m2Var != null) {
                m2Var.c(canvas);
                return;
            }
            return;
        }
        b bVar = this.f23238c0;
        if (bVar != null) {
            bVar.a(canvas, m10, n10);
            return;
        }
        float f13 = m10;
        canvas.drawCircle(f13, n10, a0.i(20.0f), y.g(ib.d.a(f10, j.L(this.W))));
        e eVar = this.f23236a0;
        if (eVar != null) {
            y.e(canvas, eVar, f13 - (this.f23237b0 / 2.0f), a0.i(6.0f) + n10, 17.0f, f10);
        }
        if (this.f23236a0 == null || this.P.r() != null) {
            if (this.P.e0()) {
                Paint W2 = y.W(-1);
                W2.setAlpha((int) ((f10 - this.P.s()) * 255.0f));
                ce.c.b(canvas, this.T, m10 - (drawable.getMinimumWidth() / 2), n10 - (this.T.getMinimumHeight() / 2), W2);
                W2.setAlpha(255);
            }
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                this.P.V(f10);
            }
            this.P.draw(canvas);
            if (i12 != 0) {
                this.P.Q();
            }
        }
    }

    public void setDefaultLiveLocation(boolean z10) {
        E1(w.i1(R.string.ShareLiveLocation), w.i1(R.string.SendLiveLocationInfo), false, z10, false, 0, 0L);
    }

    public void setIsFaded(boolean z10) {
        int h10 = ib.c.h(this.U, 2, z10);
        if (this.U != h10) {
            this.U = h10;
            float f10 = z10 ? 0.6f : 1.0f;
            this.N.setAlpha(f10);
            this.O.setAlpha(f10);
            this.P.invalidate();
        }
    }

    public void setLocationImage(h hVar) {
        this.P.E0(0);
        this.P.G(hVar);
    }

    public void setPlaceholder(b.a aVar) {
        this.P.clear();
        this.f23238c0 = new b(20.0f, aVar, null);
    }

    public void setRoundedLocationImage(h hVar) {
        this.P.E0(a0.i(20.0f));
        this.P.G(hVar);
    }

    public final void z1() {
        this.U = this.U & (-5) & (-9);
        B1(null, -1L);
        setIsRed(false);
    }
}
