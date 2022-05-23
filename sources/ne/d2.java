package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.p0;
import hd.a1;
import kb.c;
import ld.b;
import ld.p;
import md.m;
import org.thunderdog.challegram.Log;
import yd.d;
import zd.o6;

public class d2 extends i implements c {
    public a1 f17939k0;
    public int f17940l0;
    public final b f17941m0 = new b(this);
    public ld.c f17942n0;
    public p f17943o0;
    public m f17944p0;
    public b f17945q0;
    public View.OnClickListener f17946r0;
    public View.OnLongClickListener f17947s0;
    public boolean f17948t0;

    public d2(Context context, o6 o6Var) {
        super(context, o6Var);
        p0.T(this);
        d.j(this);
    }

    private void setNeedClick(boolean z10) {
        if (this.f17948t0 != z10) {
            this.f17948t0 = z10;
            if (z10) {
                setOnClickListener(this.f17946r0);
                setOnLongClickListener(this.f17947s0);
                return;
            }
            setOnClickListener(null);
            setOnLongClickListener(null);
        }
    }

    public void C0(int i10) {
        if (this.f17940l0 != i10) {
            this.f17940l0 = i10;
            if (i10 == 1) {
                this.f17942n0 = new ld.c(this, 0);
                this.f17943o0 = new p(this, 0);
            } else if (i10 == 2) {
                this.f17942n0 = new ld.c(this, 0);
                this.f17944p0 = new m(this);
            } else if (i10 == 3) {
                this.f17945q0 = new b(this);
            } else if (i10 == 4) {
                this.f17942n0 = new ld.c(this, a0.i(40.0f) / 2);
                this.f17943o0 = new p(this, a0.i(40.0f) / 2);
            }
        }
    }

    public void D0(boolean z10) {
        a1 a1Var = this.f17939k0;
        if (a1Var != null) {
            a1Var.Q(this.f17941m0);
            int i10 = this.f17940l0;
            if (i10 != 1) {
                if (i10 == 2) {
                    if (!z10) {
                        this.f17939k0.S(this.f17942n0);
                    }
                    this.f17939k0.P(this.f17944p0);
                    return;
                } else if (i10 == 3) {
                    this.f17939k0.O(this.f17945q0, z10);
                    return;
                } else if (i10 != 4) {
                    return;
                }
            }
            if (i10 == 1) {
                this.f17942n0.E0(this.f17939k0.t());
                this.f17943o0.E0(this.f17939k0.t());
            }
            if (!z10) {
                this.f17939k0.S(this.f17942n0);
            }
            this.f17939k0.R(this.f17943o0);
            return;
        }
        this.f17941m0.d();
        int i11 = this.f17940l0;
        if (i11 != 1) {
            if (i11 == 2) {
                this.f17942n0.clear();
                this.f17944p0.clear();
                return;
            } else if (i11 == 3) {
                this.f17945q0.d();
                return;
            } else if (i11 != 4) {
                return;
            }
        }
        this.f17942n0.clear();
        this.f17943o0.clear();
    }

    public void G0(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        this.f17946r0 = onClickListener;
        this.f17947s0 = onLongClickListener;
    }

    @Override
    public void Q2() {
        this.f17941m0.Q2();
        int i10 = this.f17940l0;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f17942n0.b0();
                this.f17944p0.b0();
                return;
            } else if (i10 == 3) {
                this.f17945q0.Q2();
                return;
            } else if (i10 != 4) {
                return;
            }
        }
        this.f17942n0.b0();
        this.f17943o0.b0();
    }

    public void b() {
        this.f17941m0.i();
        int i10 = this.f17940l0;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f17942n0.b();
                this.f17944p0.b();
                return;
            } else if (i10 == 3) {
                this.f17945q0.i();
                return;
            } else if (i10 != 4) {
                return;
            }
        }
        this.f17942n0.b();
        this.f17943o0.b();
    }

    public void e() {
        this.f17941m0.b();
        int i10 = this.f17940l0;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f17942n0.e();
                this.f17944p0.e();
                return;
            } else if (i10 == 3) {
                this.f17945q0.b();
                return;
            } else if (i10 != 4) {
                return;
            }
        }
        this.f17942n0.e();
        this.f17943o0.e();
    }

    public a1 getBlock() {
        return this.f17939k0;
    }

    public b getMultipleReceiver() {
        return this.f17945q0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        a1 a1Var = this.f17939k0;
        if (a1Var != null) {
            ld.c cVar = this.f17942n0;
            int i10 = this.f17940l0;
            a1Var.i(this, canvas, cVar, i10 == 3 ? null : i10 == 2 ? this.f17944p0 : this.f17943o0, this.f17941m0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        a1 a1Var = this.f17939k0;
        setMeasuredDimension(defaultSize, View.MeasureSpec.makeMeasureSpec(a1Var != null ? a1Var.s(this, defaultSize) : 0, Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f17948t0 && super.onTouchEvent(motionEvent);
        a1 a1Var = this.f17939k0;
        return (a1Var != null && a1Var.L(this, motionEvent)) || z10;
    }

    public void setBlock(a1 a1Var) {
        int i10;
        a1 a1Var2 = this.f17939k0;
        if (a1Var2 == a1Var) {
            D0(false);
            return;
        }
        if (a1Var2 != null) {
            a1Var2.h(this);
            this.f17939k0 = null;
        }
        this.f17939k0 = a1Var;
        setNeedClick(a1Var != null && a1Var.G());
        int measuredWidth = getMeasuredWidth();
        if (a1Var != null) {
            a1Var.e();
            a1Var.d(this);
            if (measuredWidth != 0) {
                i10 = a1Var.s(this, measuredWidth);
                D0(false);
                if (measuredWidth != 0 && getMeasuredHeight() != i10) {
                    requestLayout();
                    return;
                }
            }
        }
        i10 = 0;
        D0(false);
        if (measuredWidth != 0) {
        }
    }
}
