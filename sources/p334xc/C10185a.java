package p334xc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1399s0;
import gd.AbstractC4718o;
import me.C6918i3;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p037cb.C2057b;
import p051db.C3950k;
import p053dd.C4007j;
import p108hb.C5063c;
import p111he.AbstractC5124k0;
import p139jb.AbstractC5911c;
import p156kd.C6238b;
import p335xd.C10189d;

public class C10185a extends SparseDrawableView implements AbstractC5911c, AbstractC5124k0, C3950k.AbstractC3952b, C4007j.AbstractC4011d {
    public AbstractC4718o<?> f32920N;
    public float f32921O;
    public float f32922P;
    public float f32923Q;
    public float f32924R;
    public float f32925S;
    public C6918i3 f32926T;
    public C3950k f32927U;
    public C4007j f32928V;
    public int f32930c;
    public int f32919M = -1;
    public final C6238b f32929b = new C6238b(this);

    public C10185a(Context context) {
        super(context);
        C1399s0.m37193a0(this);
        C10189d.m5794j(this);
    }

    private void setSelectFactor(float f) {
        if (this.f32923Q != f) {
            this.f32923Q = f;
            invalidate();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setSelectFactor(f);
    }

    @Override
    public void mo5812V0() {
        if (this.f32928V == null) {
            this.f32928V = new C4007j(this, R.drawable.baseline_remove_circle_24);
        }
        this.f32928V.m29340c();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        setInlineResult(null);
        C6918i3 i3Var = this.f32926T;
        if (i3Var != null) {
            i3Var.m18467a();
            this.f32926T = null;
        }
    }

    public void m5811b() {
        int i = this.f32930c;
        if ((i & 1) == 0) {
            this.f32930c = i | 1;
            this.f32929b.m20994i();
            AbstractC4718o<?> oVar = this.f32920N;
            if (oVar != null) {
                oVar.m26339i(this);
            }
        }
    }

    public void m5810f() {
        int i = this.f32930c;
        if (!((i & 1) == 0)) {
            this.f32930c = i & (-2);
            this.f32929b.m21001b();
            AbstractC4718o<?> oVar = this.f32920N;
            if (oVar != null) {
                oVar.m26341c(this);
            }
        }
    }

    @Override
    public void mo5809i(boolean z, int i) {
        int i2 = this.f32930c;
        if (((i2 & 4) != 0) != z) {
            this.f32930c = C5063c.m24138h(i2, 4, z);
            boolean x = m5805x(i);
            this.f32919M = i;
            this.f32924R = this.f32921O;
            this.f32925S = this.f32922P;
            m5808t(z ? 1.0f : 0.0f);
            if (x) {
                invalidate();
            }
        } else if (z && m5805x(i)) {
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f32920N != null) {
            C4007j jVar = this.f32928V;
            if (jVar != null) {
                jVar.m29338e(canvas);
            }
            this.f32920N.m26338j(this, canvas, this.f32929b, getMeasuredWidth(), getMeasuredHeight(), this.f32924R, this.f32925S, this.f32923Q, this.f32919M, this.f32926T);
            C4007j jVar2 = this.f32928V;
            if (jVar2 != null) {
                jVar2.m29339d(canvas);
                this.f32928V.m29341b(canvas);
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.f32920N == null) {
            super.onMeasure(i, i2);
            return;
        }
        this.f32920N.m26356D(((View) getParent()).getMeasuredWidth(), this.f32929b);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.MeasureSpec.makeMeasureSpec(this.f32920N.m26337o(), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC4718o<?> oVar;
        AbstractC4718o<?> oVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32921O = motionEvent.getX();
            this.f32922P = motionEvent.getY();
            boolean z = this.f32923Q == 0.0f && (oVar2 = this.f32920N) != null && oVar2.mo25114I(this, motionEvent);
            this.f32930c = C5063c.m24138h(this.f32930c, 2, z);
            if (z) {
                return true;
            }
        } else if (action == 2) {
            this.f32921O = motionEvent.getX();
            this.f32922P = motionEvent.getY();
        }
        return ((this.f32930c & 2) == 0 || (oVar = this.f32920N) == null) ? super.onTouchEvent(motionEvent) : oVar.mo25114I(this, motionEvent);
    }

    public void setInlineResult(AbstractC4718o<?> oVar) {
        AbstractC4718o<?> oVar2;
        boolean z = true;
        if ((this.f32930c & 1) != 0) {
            z = false;
        }
        if (z && (oVar2 = this.f32920N) != null) {
            oVar2.m26339i(this);
        }
        this.f32920N = oVar;
        if (oVar != null) {
            oVar.m26356D(getMeasuredWidth(), this.f32929b);
            this.f32920N.m26352M(this.f32929b);
            if (z) {
                this.f32920N.m26341c(this);
                return;
            }
            return;
        }
        this.f32929b.m20999d();
    }

    @Override
    public void setRemoveDx(float f) {
        if (this.f32928V == null) {
            this.f32928V = new C4007j(this, R.drawable.baseline_remove_circle_24);
        }
        this.f32928V.m29337f(f);
    }

    public final void m5808t(float f) {
        if (this.f32927U == null) {
            this.f32927U = new C3950k(0, this, C2057b.f7280b, 180L, this.f32923Q);
        }
        this.f32927U.m29544i(f);
    }

    public void m5807u(boolean z, int i) {
        C3950k kVar = this.f32927U;
        float f = 1.0f;
        if (kVar != null) {
            kVar.m29541l(z ? 1.0f : 0.0f);
        }
        this.f32930c = C5063c.m24138h(this.f32930c, 4, z);
        boolean x = m5805x(i);
        if (!z) {
            f = 0.0f;
        }
        setSelectFactor(f);
        if (x) {
            invalidate();
        }
    }

    public void m5806v(AbstractC4718o<?> oVar) {
        AbstractC4718o<?> oVar2 = this.f32920N;
        if (oVar2 == oVar && oVar != null) {
            oVar2.mo25113L(this.f32929b, true);
        }
    }

    public final boolean m5805x(int i) {
        if (this.f32919M == i) {
            return false;
        }
        this.f32919M = i;
        if (i != -1 && this.f32926T == null) {
            this.f32926T = C6918i3.m18460h(this.f32923Q, String.valueOf(i + 1));
        }
        return true;
    }
}
