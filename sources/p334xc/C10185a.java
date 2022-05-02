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
    public AbstractC4718o<?> f32923N;
    public float f32924O;
    public float f32925P;
    public float f32926Q;
    public float f32927R;
    public float f32928S;
    public C6918i3 f32929T;
    public C3950k f32930U;
    public C4007j f32931V;
    public int f32933c;
    public int f32922M = -1;
    public final C6238b f32932b = new C6238b(this);

    public C10185a(Context context) {
        super(context);
        C1399s0.m37196a0(this);
        C10189d.m5794j(this);
    }

    private void setSelectFactor(float f) {
        if (this.f32926Q != f) {
            this.f32926Q = f;
            invalidate();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setSelectFactor(f);
    }

    @Override
    public void mo5812V0() {
        if (this.f32931V == null) {
            this.f32931V = new C4007j(this, R.drawable.baseline_remove_circle_24);
        }
        this.f32931V.m29342c();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public void mo4501a3() {
        setInlineResult(null);
        C6918i3 i3Var = this.f32929T;
        if (i3Var != null) {
            i3Var.m18467a();
            this.f32929T = null;
        }
    }

    public void m5811b() {
        int i = this.f32933c;
        if ((i & 1) == 0) {
            this.f32933c = i | 1;
            this.f32932b.m20995i();
            AbstractC4718o<?> oVar = this.f32923N;
            if (oVar != null) {
                oVar.m26340i(this);
            }
        }
    }

    public void m5810f() {
        int i = this.f32933c;
        if (!((i & 1) == 0)) {
            this.f32933c = i & (-2);
            this.f32932b.m21002b();
            AbstractC4718o<?> oVar = this.f32923N;
            if (oVar != null) {
                oVar.m26342c(this);
            }
        }
    }

    @Override
    public void mo5809i(boolean z, int i) {
        int i2 = this.f32933c;
        if (((i2 & 4) != 0) != z) {
            this.f32933c = C5063c.m24139h(i2, 4, z);
            boolean x = m5805x(i);
            this.f32922M = i;
            this.f32927R = this.f32924O;
            this.f32928S = this.f32925P;
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
        if (this.f32923N != null) {
            C4007j jVar = this.f32931V;
            if (jVar != null) {
                jVar.m29340e(canvas);
            }
            this.f32923N.m26339j(this, canvas, this.f32932b, getMeasuredWidth(), getMeasuredHeight(), this.f32927R, this.f32928S, this.f32926Q, this.f32922M, this.f32929T);
            C4007j jVar2 = this.f32931V;
            if (jVar2 != null) {
                jVar2.m29341d(canvas);
                this.f32931V.m29343b(canvas);
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (this.f32923N == null) {
            super.onMeasure(i, i2);
            return;
        }
        this.f32923N.m26357D(((View) getParent()).getMeasuredWidth(), this.f32932b);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.MeasureSpec.makeMeasureSpec(this.f32923N.m26338o(), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC4718o<?> oVar;
        AbstractC4718o<?> oVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32924O = motionEvent.getX();
            this.f32925P = motionEvent.getY();
            boolean z = this.f32926Q == 0.0f && (oVar2 = this.f32923N) != null && oVar2.mo25115I(this, motionEvent);
            this.f32933c = C5063c.m24139h(this.f32933c, 2, z);
            if (z) {
                return true;
            }
        } else if (action == 2) {
            this.f32924O = motionEvent.getX();
            this.f32925P = motionEvent.getY();
        }
        return ((this.f32933c & 2) == 0 || (oVar = this.f32923N) == null) ? super.onTouchEvent(motionEvent) : oVar.mo25115I(this, motionEvent);
    }

    public void setInlineResult(AbstractC4718o<?> oVar) {
        AbstractC4718o<?> oVar2;
        boolean z = true;
        if ((this.f32933c & 1) != 0) {
            z = false;
        }
        if (z && (oVar2 = this.f32923N) != null) {
            oVar2.m26340i(this);
        }
        this.f32923N = oVar;
        if (oVar != null) {
            oVar.m26357D(getMeasuredWidth(), this.f32932b);
            this.f32923N.m26353M(this.f32932b);
            if (z) {
                this.f32923N.m26342c(this);
                return;
            }
            return;
        }
        this.f32932b.m21000d();
    }

    @Override
    public void setRemoveDx(float f) {
        if (this.f32931V == null) {
            this.f32931V = new C4007j(this, R.drawable.baseline_remove_circle_24);
        }
        this.f32931V.m29339f(f);
    }

    public final void m5808t(float f) {
        if (this.f32930U == null) {
            this.f32930U = new C3950k(0, this, C2057b.f7280b, 180L, this.f32926Q);
        }
        this.f32930U.m29546i(f);
    }

    public void m5807u(boolean z, int i) {
        C3950k kVar = this.f32930U;
        float f = 1.0f;
        if (kVar != null) {
            kVar.m29543l(z ? 1.0f : 0.0f);
        }
        this.f32933c = C5063c.m24139h(this.f32933c, 4, z);
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
        AbstractC4718o<?> oVar2 = this.f32923N;
        if (oVar2 == oVar && oVar != null) {
            oVar2.mo25114L(this.f32932b, true);
        }
    }

    public final boolean m5805x(int i) {
        if (this.f32922M == i) {
            return false;
        }
        this.f32922M = i;
        if (i != -1 && this.f32929T == null) {
            this.f32929T = C6918i3.m18460h(this.f32926Q, String.valueOf(i + 1));
        }
        return true;
    }
}
