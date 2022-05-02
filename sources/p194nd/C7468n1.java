package p194nd;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1389o;
import nc.C7389v0;
import p037cb.C2057b;
import p051db.C3950k;
import td.C9203h3;

public class C7468n1 extends View implements C3950k.AbstractC3952b {
    public AbstractC7469a f23808M;
    public float f23809N;
    public float f23810O;
    public float f23811P;
    public float f23812Q;
    public float f23813R;
    public float f23814S;
    public float f23815T;
    public final int f23816U = C1357a0.m37544i(1.5f);
    public final int f23817V = C1357a0.m37544i(6.5f);
    public float f23818W;
    public C9203h3 f23819a;
    public int f23820a0;
    public Paint f23821b;
    public String f23822b0;
    public Paint f23823c;
    public float f23824c0;
    public float f23825d0;
    public float f23826e0;
    public boolean f23827f0;
    public C3950k f23828g0;
    public float f23829h0;

    public interface AbstractC7469a {
        void mo15973T3(boolean z);

        boolean mo15972Y4();

        void mo15971Y5(float f);

        void mo15970t3(float f);
    }

    public C7468n1(Context context) {
        super(context);
        setPadding(C1357a0.m37544i(20.0f), 0, C1357a0.m37544i(20.0f), 0);
        Paint paint = new Paint(5);
        this.f23821b = paint;
        paint.setTextSize(C1357a0.m37544i(14.0f));
        this.f23821b.setColor(-1);
        this.f23821b.setTypeface(C1389o.m37261k());
        Paint paint2 = new Paint(5);
        this.f23823c = paint2;
        paint2.setTextSize(C1357a0.m37544i(12.0f));
        this.f23823c.setColor(-1);
        this.f23823c.setTypeface(C1389o.m37261k());
        this.f23810O = C7389v0.m16680T1("°", this.f23823c);
        this.f23811P = C7389v0.m16680T1("0", this.f23823c);
        this.f23812Q = C7389v0.m16680T1("15", this.f23823c);
        this.f23813R = C7389v0.m16680T1("30", this.f23823c);
        this.f23814S = C7389v0.m16680T1("45", this.f23823c);
        this.f23815T = C7389v0.m16680T1("60", this.f23823c);
        this.f23809N = C7389v0.m16680T1("-", this.f23823c);
        C9203h3 h3Var = new C9203h3();
        this.f23819a = h3Var;
        h3Var.m9972d(-1);
        setValueInt(0);
    }

    public static String m15977b(int i) {
        return i != -60 ? i != -45 ? i != -30 ? i != -15 ? i != 0 ? i != 15 ? i != 30 ? i != 45 ? i != 60 ? "" : "60°" : "45°" : "30°" : "15°" : "0°" : "-15°" : "-30°" : "-45°" : "-60°";
    }

    private void setUp(boolean z) {
        AbstractC7469a aVar;
        boolean z2 = z && ((aVar = this.f23808M) == null || aVar.mo15972Y4());
        if (this.f23827f0 != z2) {
            this.f23827f0 = z2;
            m15978a(z2 ? 1.0f : 0.0f);
            AbstractC7469a aVar2 = this.f23808M;
            if (aVar2 != null) {
                aVar2.mo15973T3(z2);
            }
        }
    }

    private void setValue(float f) {
        if (this.f23818W != f) {
            this.f23818W = f;
            setValueInt(Math.round(f));
            invalidate();
        }
    }

    private void setValueInt(int i) {
        if (this.f23820a0 != i || this.f23822b0 == null) {
            this.f23820a0 = i;
            String str = Integer.toString(i) + (char) 176;
            this.f23822b0 = str;
            this.f23824c0 = C7389v0.m16684S1(str, 0, str.length() - 1, this.f23821b);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0 && this.f23829h0 != f) {
            this.f23829h0 = f;
            invalidate();
            AbstractC7469a aVar = this.f23808M;
            if (aVar != null) {
                aVar.mo15970t3(f);
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m15978a(float f) {
        if (this.f23828g0 == null) {
            this.f23828g0 = new C3950k(0, this, C2057b.f7280b, 140L, this.f23829h0);
        }
        this.f23828g0.m29546i(f);
    }

    public final float m15976c(int i) {
        float f;
        float f2;
        if (i == -60) {
            f = this.f23815T;
            f2 = this.f23809N;
        } else if (i == -45) {
            f = this.f23814S;
            f2 = this.f23809N;
        } else if (i == -30) {
            f = this.f23813R;
            f2 = this.f23809N;
        } else if (i == -15) {
            f = this.f23812Q;
            f2 = this.f23809N;
        } else if (i == 0) {
            return this.f23811P;
        } else {
            if (i == 15) {
                return this.f23812Q;
            }
            if (i == 30) {
                return this.f23813R;
            }
            if (i == 45) {
                return this.f23814S;
            }
            if (i != 60) {
                return 0.0f;
            }
            return this.f23815T;
        }
        return f + f2;
    }

    public void m15975d(float f, boolean z) {
        if (z) {
            m15974e(f);
        } else {
            setValue(f);
        }
    }

    public final void m15974e(float f) {
        float max = Math.max(-45.0f, Math.min(45.0f, f));
        if (this.f23818W != max) {
            setValue(max);
            AbstractC7469a aVar = this.f23808M;
            if (aVar != null) {
                aVar.mo15971Y5(max);
            }
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7468n1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f23825d0 = motionEvent.getX();
            int paddingLeft = getPaddingLeft() + (measuredWidth / 2);
            int min = Math.min(measuredWidth, C1357a0.m37544i(192.0f));
            float f = this.f23825d0;
            int i = min / 2;
            if (f >= paddingLeft - i && f <= paddingLeft + i) {
                z = true;
            }
            setUp(z);
            if (this.f23827f0) {
                this.f23826e0 = this.f23818W;
                return true;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f23827f0) {
                    setUp(false);
                    return true;
                }
            } else if (this.f23827f0) {
                m15974e(this.f23826e0 + ((((motionEvent.getX() - this.f23825d0) * 0.1f) * (-45.0f)) / (measuredWidth / 2.5f)));
            }
        } else if (this.f23827f0) {
            setUp(false);
            return true;
        }
        return this.f23827f0;
    }

    public void setCallback(AbstractC7469a aVar) {
        this.f23808M = aVar;
    }
}
