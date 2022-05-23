package tc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.y;
import eb.k;
import gb.b;
import gb.c;
import gd.w;
import ib.d;
import kb.c;
import ld.h;
import ld.l;
import ld.p;
import ne.i3;
import oc.v0;
import org.thunderdog.challegram.R;

public class g1 extends View implements c, k.b, c.a, h.a {
    public int M;
    public a O;
    public boolean P;
    public View.OnLongClickListener Q;
    public String R;
    public int S;
    public String U;
    public boolean V;
    public k W;
    public final p f23158a;
    public float f23159a0;
    public h f23160b;
    public i3 f23161b0;
    public int f23162c;
    public int T = -1;
    public final gb.c N = new gb.c(this);

    public interface a {
        void y(View view, boolean z10);
    }

    public g1(Context context) {
        super(context);
        p pVar = new p(this, 0);
        this.f23158a = pVar;
        pVar.F();
        pVar.S0(true);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    private void setFactor(float f10) {
        if (this.f23159a0 != f10) {
            this.f23159a0 = f10;
            if (f10 > 0.0f && this.f23161b0 == null) {
                this.f23161b0 = i3.h(f10, this.U);
            }
            invalidate();
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return true;
    }

    @Override
    public void C(View view, float f10, float f11) {
        if (this.O != null) {
            int i10 = a0.i(24.0f) * 2;
            this.O.y(view, f11 <= ((float) i10) && f10 >= ((float) (getMeasuredWidth() - i10)));
        }
    }

    @Override
    public boolean E4() {
        return b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        b.h(this, view, f10, f11);
    }

    @Override
    public void Q2() {
        this.f23158a.G(null);
        i3 i3Var = this.f23161b0;
        if (i3Var != null) {
            i3Var.a();
            this.f23161b0 = null;
        }
        this.f23159a0 = 0.0f;
    }

    @Override
    public void U2(View view, float f10, float f11) {
        b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return b.c(this, f10, f11);
    }

    @Override
    public void a(h hVar) {
        if (this.f23160b == hVar) {
            this.f23158a.clear();
            this.f23158a.G(this.f23160b);
        }
    }

    public final void b(float f10) {
        if (this.W == null) {
            this.W = new k(0, this, db.b.f7287b, 180L, this.f23159a0);
        }
        this.W.i(f10);
    }

    public void c() {
        this.f23158a.e();
    }

    public void d() {
        this.f23158a.b();
    }

    public final void e(float f10) {
        k kVar = this.W;
        if (kVar != null) {
            kVar.l(f10);
        }
        setFactor(f10);
    }

    public void f(int i10, boolean z10) {
        if (i10 >= 0) {
            setSelectionIndex(i10);
            g(true, z10);
            return;
        }
        g(false, z10);
    }

    public final void g(boolean z10, boolean z11) {
        if (this.V != z10) {
            this.V = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                b(f10);
                return;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            e(f10);
        }
    }

    public h getImage() {
        return this.f23160b;
    }

    @Override
    public long getLongPressDuration() {
        return b.b(this);
    }

    public int getReceiverOffset() {
        if (this.f23159a0 != 0.0f) {
            return (this.f23158a.getWidth() - ((int) (this.f23158a.getWidth() * (1.0f - (this.f23159a0 * 0.24f))))) / 2;
        }
        return 0;
    }

    public void h(h hVar, int i10, boolean z10) {
        h hVar2 = this.f23160b;
        if (hVar2 != hVar) {
            if (hVar2 != null) {
                hVar2.V(this);
            }
            this.f23160b = hVar;
            if (hVar != null) {
                hVar.b(this);
            }
            this.f23158a.G(hVar);
            if (hVar instanceof l) {
                l lVar = (l) hVar;
                if (lVar.e1()) {
                    int S0 = lVar.S0(false);
                    int S02 = lVar.S0(false);
                    if (S0 < S02) {
                        this.R = w.j1(R.string.format_trimmedDuration, c0.h(S0), c0.h(S02));
                    } else {
                        this.R = c0.h(S02);
                    }
                    this.S = (int) v0.T1(this.R, y.F0(12.0f, false, true));
                    f(i10, false);
                    i(!z10, false);
                    setSelectionIndex(i10);
                    invalidate();
                }
            }
            this.R = null;
            f(i10, false);
            i(!z10, false);
            setSelectionIndex(i10);
            invalidate();
        }
    }

    public void i(boolean z10, boolean z11) {
        if (this.P != z10) {
            this.P = z10;
            invalidate();
        }
    }

    public final void j() {
        this.f23158a.K0(0, 0, this.f23162c, this.M);
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return this.O != null;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setFactor(f10);
    }

    @Override
    public void o(View view, float f10, float f11) {
        b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        b.g(this, view, f10, f11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        i3 i3Var;
        if (this.f23159a0 != 0.0f || this.f23158a.e0()) {
            canvas.drawRect(0.0f, 0.0f, this.f23162c, this.M, y.g(j.i()));
        }
        float f10 = this.f23159a0;
        boolean z10 = f10 != 0.0f;
        if (z10) {
            float f11 = 1.0f - (f10 * 0.24f);
            canvas.save();
            canvas.scale(f11, f11, this.f23158a.J0(), this.f23158a.x0());
        }
        this.f23158a.draw(canvas);
        String str = this.R;
        if (str != null && !str.isEmpty()) {
            int left = this.f23158a.getLeft() + a0.i(7.0f);
            int top = this.f23158a.getTop() + a0.i(5.0f);
            RectF a02 = y.a0();
            a02.set(left - a0.i(3.0f), top - a0.i(2.0f), this.S + left + a0.i(3.0f), a0.i(15.0f) + top);
            canvas.drawRoundRect(a02, a0.i(4.0f), a0.i(4.0f), y.g(1275068416));
            canvas.drawText(this.R, left, top + a0.i(11.0f), y.F0(12.0f, false, false));
        }
        if (z10) {
            canvas.restore();
        }
        if (!this.P) {
            int J0 = this.f23158a.J0() + (((int) (this.f23158a.getWidth() * 0.76f)) / 2);
            int x02 = this.f23158a.x0() - (((int) (this.f23158a.getHeight() * 0.76f)) / 2);
            canvas.drawCircle(J0, x02, a0.i((this.f23159a0 * 2.0f) + 9.0f), y.R(d.a(1.0f, d.d(-1, d.c(j.u(), j.i()), this.f23159a0))));
            float f12 = this.f23159a0;
            if (f12 != 0.0f && (i3Var = this.f23161b0) != null) {
                i3.c(canvas, J0, x02, f12, this.U, i3Var);
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f23162c != measuredWidth || this.M != measuredHeight) {
            this.f23162c = measuredWidth;
            this.M = measuredHeight;
            j();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.N.e(this, motionEvent);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        View.OnLongClickListener onLongClickListener = this.Q;
        return onLongClickListener != null && onLongClickListener.onLongClick(view);
    }

    public void setAnimationsDisabled(boolean z10) {
        this.f23158a.S0(z10);
    }

    public void setClickListener(a aVar) {
        this.O = aVar;
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.Q = onLongClickListener;
    }

    public void setSelectionIndex(int i10) {
        if (this.T != i10 && i10 >= 0) {
            this.T = i10;
            this.U = String.valueOf(i10 + 1);
            invalidate();
        }
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
