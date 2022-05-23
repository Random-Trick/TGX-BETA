package od;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.o;
import db.b;
import eb.k;
import oc.v0;
import ud.h3;

public class n1 extends View implements k.b {
    public a M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final int U = a0.i(1.5f);
    public final int V = a0.i(6.5f);
    public float W;
    public h3 f19749a;
    public int f19750a0;
    public Paint f19751b;
    public String f19752b0;
    public Paint f19753c;
    public float f19754c0;
    public float f19755d0;
    public float f19756e0;
    public boolean f19757f0;
    public k f19758g0;
    public float f19759h0;

    public interface a {
        void L3(boolean z10);

        boolean T4();

        void W5(float f10);

        void j3(float f10);
    }

    public n1(Context context) {
        super(context);
        setPadding(a0.i(20.0f), 0, a0.i(20.0f), 0);
        Paint paint = new Paint(5);
        this.f19751b = paint;
        paint.setTextSize(a0.i(14.0f));
        this.f19751b.setColor(-1);
        this.f19751b.setTypeface(o.k());
        Paint paint2 = new Paint(5);
        this.f19753c = paint2;
        paint2.setTextSize(a0.i(12.0f));
        this.f19753c.setColor(-1);
        this.f19753c.setTypeface(o.k());
        this.O = v0.T1("°", this.f19753c);
        this.P = v0.T1("0", this.f19753c);
        this.Q = v0.T1("15", this.f19753c);
        this.R = v0.T1("30", this.f19753c);
        this.S = v0.T1("45", this.f19753c);
        this.T = v0.T1("60", this.f19753c);
        this.N = v0.T1("-", this.f19753c);
        h3 h3Var = new h3();
        this.f19749a = h3Var;
        h3Var.d(-1);
        setValueInt(0);
    }

    public static String b(int i10) {
        return i10 != -60 ? i10 != -45 ? i10 != -30 ? i10 != -15 ? i10 != 0 ? i10 != 15 ? i10 != 30 ? i10 != 45 ? i10 != 60 ? "" : "60°" : "45°" : "30°" : "15°" : "0°" : "-15°" : "-30°" : "-45°" : "-60°";
    }

    private void setUp(boolean z10) {
        a aVar;
        boolean z11 = z10 && ((aVar = this.M) == null || aVar.T4());
        if (this.f19757f0 != z11) {
            this.f19757f0 = z11;
            a(z11 ? 1.0f : 0.0f);
            a aVar2 = this.M;
            if (aVar2 != null) {
                aVar2.L3(z11);
            }
        }
    }

    private void setValue(float f10) {
        if (this.W != f10) {
            this.W = f10;
            setValueInt(Math.round(f10));
            invalidate();
        }
    }

    private void setValueInt(int i10) {
        if (this.f19750a0 != i10 || this.f19752b0 == null) {
            this.f19750a0 = i10;
            String str = Integer.toString(i10) + (char) 176;
            this.f19752b0 = str;
            this.f19754c0 = v0.S1(str, 0, str.length() - 1, this.f19751b);
        }
    }

    public final void a(float f10) {
        if (this.f19758g0 == null) {
            this.f19758g0 = new k(0, this, b.f7287b, 140L, this.f19759h0);
        }
        this.f19758g0.i(f10);
    }

    public final float c(int i10) {
        float f10;
        float f11;
        if (i10 == -60) {
            f10 = this.T;
            f11 = this.N;
        } else if (i10 == -45) {
            f10 = this.S;
            f11 = this.N;
        } else if (i10 == -30) {
            f10 = this.R;
            f11 = this.N;
        } else if (i10 == -15) {
            f10 = this.Q;
            f11 = this.N;
        } else if (i10 == 0) {
            return this.P;
        } else {
            if (i10 == 15) {
                return this.Q;
            }
            if (i10 == 30) {
                return this.R;
            }
            if (i10 == 45) {
                return this.S;
            }
            if (i10 != 60) {
                return 0.0f;
            }
            return this.T;
        }
        return f10 + f11;
    }

    public void d(float f10, boolean z10) {
        if (z10) {
            e(f10);
        } else {
            setValue(f10);
        }
    }

    public final void e(float f10) {
        float max = Math.max(-45.0f, Math.min(45.0f, f10));
        if (this.W != max) {
            setValue(max);
            a aVar = this.M;
            if (aVar != null) {
                aVar.W5(max);
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0 && this.f19759h0 != f10) {
            this.f19759h0 = f10;
            invalidate();
            a aVar = this.M;
            if (aVar != null) {
                aVar.j3(f10);
            }
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: od.n1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int action = motionEvent.getAction();
        boolean z10 = false;
        if (action == 0) {
            this.f19755d0 = motionEvent.getX();
            int paddingLeft = getPaddingLeft() + (measuredWidth / 2);
            int min = Math.min(measuredWidth, a0.i(192.0f));
            float f10 = this.f19755d0;
            int i10 = min / 2;
            if (f10 >= paddingLeft - i10 && f10 <= paddingLeft + i10) {
                z10 = true;
            }
            setUp(z10);
            if (this.f19757f0) {
                this.f19756e0 = this.W;
                return true;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f19757f0) {
                    setUp(false);
                    return true;
                }
            } else if (this.f19757f0) {
                e(this.f19756e0 + ((((motionEvent.getX() - this.f19755d0) * 0.1f) * (-45.0f)) / (measuredWidth / 2.5f)));
            }
        } else if (this.f19757f0) {
            setUp(false);
            return true;
        }
        return this.f19757f0;
    }

    public void setCallback(a aVar) {
        this.M = aVar;
    }
}
