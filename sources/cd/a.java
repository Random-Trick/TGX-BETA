package cd;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import ce.a0;
import ce.c0;
import ce.y;
import eb.f;
import eb.k;
import gb.c;
import ib.d;
import ib.h;
import ie.k0;
import java.util.concurrent.TimeUnit;
import kb.c;
import ld.p;
import ld.v;
import md.m;
import ne.g1;
import ne.i3;
import oc.v0;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import qd.b;

public class a extends SparseDrawableView implements c, k.b, k0 {
    public g1.c O;
    public b Q;
    public float R;
    public float S;
    public k T;
    public String V;
    public int W;
    public gb.c f5214a0;
    public final f P = new f(1, this, db.b.f7287b, 230);
    public boolean U = true;
    public final p f5215b = new p(this, 0);
    public final p f5216c = new p(this, 0);
    public final p M = new p(this, 0);
    public final m N = new m(this);

    public a(Context context) {
        super(context);
    }

    private void setSelectionFactor(float f10) {
        if (this.S != f10) {
            this.S = f10;
            invalidate();
        }
    }

    private void setText(String str) {
        String str2 = this.V;
        if (str2 != null || str != null) {
            if (str == null) {
                this.V = null;
                this.W = 0;
            } else if (str2 == null || !str2.equals(str)) {
                this.V = str;
                this.W = (int) v0.T1(str, y.F0(12.0f, false, true));
            }
        }
    }

    public final void A() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f5215b.K0(0, 0, measuredWidth, measuredHeight);
        this.f5216c.K0(0, 0, measuredWidth, measuredHeight);
        this.M.K0(0, 0, measuredWidth, measuredHeight);
        this.N.K0(0, 0, measuredWidth, measuredHeight);
    }

    public void E(float f10, float f11) {
        if (this.R != f10) {
            this.R = f10;
            w(f11);
            invalidate();
            return;
        }
        w(f11);
    }

    @Override
    public void Q2() {
        setItem(null);
    }

    public void b() {
        if (this.U) {
            this.U = false;
            this.N.b();
            this.M.b();
            this.f5215b.b();
            this.f5216c.b();
        }
    }

    public void e() {
        if (!this.U) {
            this.U = true;
            this.N.e();
            this.M.e();
            this.f5215b.e();
            this.f5216c.e();
        }
    }

    @Override
    public void h(boolean z10, int i10) {
        v(z10 ? 1.0f : 0.0f);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 1) {
            invalidate();
        } else {
            setSelectionFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        b bVar;
        if (this.Q != null) {
            float f10 = this.S * this.R;
            boolean z10 = true;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            boolean z11 = i10 != 0;
            if (z11) {
                canvas.drawRect(this.f5216c.getLeft(), this.f5216c.getTop(), this.f5216c.getRight(), this.f5216c.getBottom(), y.g(j.i()));
                canvas.save();
                float f11 = 1.0f - (0.24f * f10);
                canvas.scale(f11, f11, this.f5216c.J0(), this.f5216c.x0());
            }
            v vVar = this.M.r() != null ? this.M : this.N;
            if (!(vVar == this.N && (bVar = this.Q) != null && bVar.X() == 8)) {
                z10 = false;
            }
            if (z10) {
                canvas.save();
                canvas.clipRect(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
                float sqrt = (float) Math.sqrt(2.0d);
                canvas.scale(sqrt, sqrt, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            if (vVar.e0()) {
                if (this.f5216c.e0()) {
                    if (this.f5215b.e0()) {
                        this.f5215b.O(canvas);
                    }
                    this.f5215b.draw(canvas);
                }
                this.f5216c.draw(canvas);
            }
            vVar.draw(canvas);
            if (z10) {
                canvas.restore();
            }
            boolean n02 = this.Q.n0();
            int left = vVar.getLeft() + a0.i(7.0f);
            int top = vVar.getTop() + a0.i(5.0f);
            if (this.V != null) {
                float g10 = 1.0f - this.P.g();
                RectF a02 = y.a0();
                a02.set(left - a0.i(3.0f), top - a0.i(2.0f), this.W + left + a0.i(3.0f) + (n02 ? a0.i(22.0f) * g10 : 0.0f), (n02 ? h.j(a0.i(15.0f), a0.i(21.0f), g10) : a0.i(15.0f)) + top);
                canvas.drawRoundRect(a02, a0.i(4.0f), a0.i(4.0f), y.g(1275068416));
                canvas.drawText(this.V, left + (n02 ? a0.i(22.0f) * g10 : 0.0f), top + a0.i(11.0f) + (n02 ? a0.i(3.5f) * g10 : 0.0f), y.F0(12.0f, false, false));
                this.Q.x().k0(R.drawable.baseline_play_arrow_36_white);
                this.Q.x().C0(R.drawable.baseline_cloud_download_16);
                if (n02) {
                    this.Q.x().Q0(false);
                    this.Q.x().P0(false, false, 2, a02, this.P);
                    this.Q.x().O0(a02);
                }
            }
            if (this.Q.n0() || this.Q.d0() || this.Q.X() == 8) {
                this.Q.r(this, canvas, 0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            if (z11) {
                canvas.restore();
            }
            if (this.R != 0.0f) {
                int J0 = vVar.J0() + (((int) (vVar.getWidth() * 0.76f)) / 2);
                int x02 = vVar.x0() - (((int) (vVar.getHeight() * 0.76f)) / 2);
                canvas.drawCircle(J0, x02, a0.i((2.0f * f10) + 9.0f), y.R(d.a(this.R, d.d(-1, d.c(j.u(), j.i()), f10))));
                if (i10 != 0) {
                    i3.b(canvas, J0, x02, f10, null);
                }
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
        A();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        gb.c cVar = this.f5214a0;
        return cVar != null && cVar.e(this, motionEvent);
    }

    public void setItem(b bVar) {
        b bVar2 = this.Q;
        if (bVar2 != null) {
            bVar2.p(this);
            if (this.Q.g0() && ((bVar == null || this.Q.w() != bVar.w()) && this.Q.h0())) {
                this.Q.s0();
            }
        }
        this.Q = bVar;
        String str = null;
        if (bVar != null) {
            this.f5215b.G(bVar.B());
            this.f5216c.G((!bVar.f0() || bVar.Q() != null) ? bVar.F() : null);
            this.M.G(bVar.f0() ? bVar.S(false) : null);
            this.N.r(bVar.f0() ? bVar.Q() : null);
            this.P.p(bVar.f0(), false);
            bVar.c(this);
            bVar.K0(this.O);
            bVar.q(false);
            if (bVar.n0() && !bVar.e0()) {
                str = c0.h(bVar.Y(false, TimeUnit.SECONDS));
            }
            setText(str);
            return;
        }
        this.f5215b.G(null);
        this.f5216c.G(null);
        this.M.G(null);
        this.N.r(null);
    }

    public void setListener(g1.c cVar) {
        this.O = cVar;
    }

    public void setSelectableFactor(float f10) {
        if (this.R != f10) {
            this.R = f10;
            invalidate();
        }
    }

    public void v(float f10) {
        if (this.T == null) {
            this.T = new k(0, this, db.b.f7287b, 180L, this.S);
        }
        this.T.i(f10);
    }

    public void w(float f10) {
        k kVar = this.T;
        if (kVar != null) {
            kVar.l(f10);
        }
        setSelectionFactor(f10);
    }

    public void x(c.a aVar) {
        this.f5214a0 = new gb.c(aVar);
    }

    public void y(b bVar) {
        if (this.Q == bVar) {
            md.j jVar = null;
            this.M.G(bVar != null ? bVar.R() : null);
            m mVar = this.N;
            if (bVar != null) {
                jVar = bVar.Q();
            }
            mVar.r(jVar);
        }
    }
}
