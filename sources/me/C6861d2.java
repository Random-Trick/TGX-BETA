package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1399s0;
import gd.AbstractC4576a1;
import org.thunderdog.challegram.Log;
import p139jb.AbstractC5911c;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p335xd.C10189d;
import p350yd.C10930q6;

public class C6861d2 extends View$OnClickListenerC6902i implements AbstractC5911c {
    public AbstractC4576a1 f21553k0;
    public int f21554l0;
    public final C6238b f21555m0 = new C6238b(this);
    public C6240c f21556n0;
    public C6257p f21557o0;
    public RunnableC6507m f21558p0;
    public C6238b f21559q0;
    public View.OnClickListener f21560r0;
    public View.OnLongClickListener f21561s0;
    public boolean f21562t0;

    public C6861d2(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        C1399s0.m37193a0(this);
        C10189d.m5794j(this);
    }

    private void setNeedClick(boolean z) {
        if (this.f21562t0 != z) {
            this.f21562t0 = z;
            if (z) {
                setOnClickListener(this.f21560r0);
                setOnLongClickListener(this.f21561s0);
                return;
            }
            setOnClickListener(null);
            setOnLongClickListener(null);
        }
    }

    public void m18742B0(int i) {
        if (this.f21554l0 != i) {
            this.f21554l0 = i;
            if (i == 1) {
                this.f21556n0 = new C6240c(this, 0);
                this.f21557o0 = new C6257p(this, 0);
            } else if (i == 2) {
                this.f21556n0 = new C6240c(this, 0);
                this.f21558p0 = new RunnableC6507m(this);
            } else if (i == 3) {
                this.f21559q0 = new C6238b(this);
            } else if (i == 4) {
                this.f21556n0 = new C6240c(this, C1357a0.m37541i(40.0f) / 2);
                this.f21557o0 = new C6257p(this, C1357a0.m37541i(40.0f) / 2);
            }
        }
    }

    public void m18741C0(boolean z) {
        AbstractC4576a1 a1Var = this.f21553k0;
        if (a1Var != null) {
            a1Var.mo26324R(this.f21555m0);
            int i = this.f21554l0;
            if (i != 1) {
                if (i == 2) {
                    if (!z) {
                        this.f21553k0.mo26457T(this.f21556n0);
                    }
                    this.f21553k0.mo26707Q(this.f21558p0);
                    return;
                } else if (i == 3) {
                    this.f21553k0.mo26708P(this.f21559q0, z);
                    return;
                } else if (i != 4) {
                    return;
                }
            }
            if (i == 1) {
                this.f21556n0.mo20259D0(this.f21553k0.mo26658t());
                this.f21557o0.mo20259D0(this.f21553k0.mo26658t());
            }
            if (!z) {
                this.f21553k0.mo26457T(this.f21556n0);
            }
            this.f21553k0.mo26458S(this.f21557o0);
            return;
        }
        this.f21555m0.m20999d();
        int i2 = this.f21554l0;
        if (i2 != 1) {
            if (i2 == 2) {
                this.f21556n0.clear();
                this.f21558p0.clear();
                return;
            } else if (i2 == 3) {
                this.f21559q0.m20999d();
                return;
            } else if (i2 != 4) {
                return;
            }
        }
        this.f21556n0.clear();
        this.f21557o0.clear();
    }

    public void m18740F0(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        this.f21560r0 = onClickListener;
        this.f21561s0 = onLongClickListener;
    }

    @Override
    public void mo4501a3() {
        this.f21555m0.mo4501a3();
        int i = this.f21554l0;
        if (i != 1) {
            if (i == 2) {
                this.f21556n0.mo20249Z();
                this.f21558p0.mo20249Z();
                return;
            } else if (i == 3) {
                this.f21559q0.mo4501a3();
                return;
            } else if (i != 4) {
                return;
            }
        }
        this.f21556n0.mo20249Z();
        this.f21557o0.mo20249Z();
    }

    public void m18739b() {
        this.f21555m0.m20994i();
        int i = this.f21554l0;
        if (i != 1) {
            if (i == 2) {
                this.f21556n0.mo20247b();
                this.f21558p0.mo20247b();
                return;
            } else if (i == 3) {
                this.f21559q0.m20994i();
                return;
            } else if (i != 4) {
                return;
            }
        }
        this.f21556n0.mo20247b();
        this.f21557o0.mo20247b();
    }

    public void m18738f() {
        this.f21555m0.m21001b();
        int i = this.f21554l0;
        if (i != 1) {
            if (i == 2) {
                this.f21556n0.mo20245f();
                this.f21558p0.mo20245f();
                return;
            } else if (i == 3) {
                this.f21559q0.m21001b();
                return;
            } else if (i != 4) {
                return;
            }
        }
        this.f21556n0.mo20245f();
        this.f21557o0.mo20245f();
    }

    public AbstractC4576a1 getBlock() {
        return this.f21553k0;
    }

    public C6238b getMultipleReceiver() {
        return this.f21559q0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        AbstractC4576a1 a1Var = this.f21553k0;
        if (a1Var != null) {
            C6240c cVar = this.f21556n0;
            int i = this.f21554l0;
            a1Var.m27281h(this, canvas, cVar, i == 3 ? null : i == 2 ? this.f21558p0 : this.f21557o0, this.f21555m0);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        AbstractC4576a1 a1Var = this.f21553k0;
        setMeasuredDimension(defaultSize, View.MeasureSpec.makeMeasureSpec(a1Var != null ? a1Var.m27277s(this, defaultSize) : 0, Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.f21562t0 && super.onTouchEvent(motionEvent);
        AbstractC4576a1 a1Var = this.f21553k0;
        return (a1Var != null && a1Var.m27290M(this, motionEvent)) || z;
    }

    public void setBlock(AbstractC4576a1 a1Var) {
        int i;
        AbstractC4576a1 a1Var2 = this.f21553k0;
        if (a1Var2 == a1Var) {
            m18741C0(false);
            return;
        }
        if (a1Var2 != null) {
            a1Var2.m27282g(this);
            this.f21553k0 = null;
        }
        this.f21553k0 = a1Var;
        setNeedClick(a1Var != null && a1Var.mo26460H());
        int measuredWidth = getMeasuredWidth();
        if (a1Var != null) {
            a1Var.mo26698e();
            a1Var.m27283d(this);
            if (measuredWidth != 0) {
                i = a1Var.m27277s(this, measuredWidth);
                m18741C0(false);
                if (measuredWidth != 0 && getMeasuredHeight() != i) {
                    requestLayout();
                    return;
                }
            }
        }
        i = 0;
        m18741C0(false);
        if (measuredWidth != 0) {
        }
    }
}
