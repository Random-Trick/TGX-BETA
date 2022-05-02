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
    public AbstractC7469a f23805M;
    public float f23806N;
    public float f23807O;
    public float f23808P;
    public float f23809Q;
    public float f23810R;
    public float f23811S;
    public float f23812T;
    public final int f23813U = C1357a0.m37541i(1.5f);
    public final int f23814V = C1357a0.m37541i(6.5f);
    public float f23815W;
    public C9203h3 f23816a;
    public int f23817a0;
    public Paint f23818b;
    public String f23819b0;
    public Paint f23820c;
    public float f23821c0;
    public float f23822d0;
    public float f23823e0;
    public boolean f23824f0;
    public C3950k f23825g0;
    public float f23826h0;

    public interface AbstractC7469a {
        void mo15973T3(boolean z);

        boolean mo15972Y4();

        void mo15971Y5(float f);

        void mo15970t3(float f);
    }

    public C7468n1(Context context) {
        super(context);
        setPadding(C1357a0.m37541i(20.0f), 0, C1357a0.m37541i(20.0f), 0);
        Paint paint = new Paint(5);
        this.f23818b = paint;
        paint.setTextSize(C1357a0.m37541i(14.0f));
        this.f23818b.setColor(-1);
        this.f23818b.setTypeface(C1389o.m37258k());
        Paint paint2 = new Paint(5);
        this.f23820c = paint2;
        paint2.setTextSize(C1357a0.m37541i(12.0f));
        this.f23820c.setColor(-1);
        this.f23820c.setTypeface(C1389o.m37258k());
        this.f23807O = C7389v0.m16680T1("°", this.f23820c);
        this.f23808P = C7389v0.m16680T1("0", this.f23820c);
        this.f23809Q = C7389v0.m16680T1("15", this.f23820c);
        this.f23810R = C7389v0.m16680T1("30", this.f23820c);
        this.f23811S = C7389v0.m16680T1("45", this.f23820c);
        this.f23812T = C7389v0.m16680T1("60", this.f23820c);
        this.f23806N = C7389v0.m16680T1("-", this.f23820c);
        C9203h3 h3Var = new C9203h3();
        this.f23816a = h3Var;
        h3Var.m9973d(-1);
        setValueInt(0);
    }

    public static String m15977b(int i) {
        return i != -60 ? i != -45 ? i != -30 ? i != -15 ? i != 0 ? i != 15 ? i != 30 ? i != 45 ? i != 60 ? "" : "60°" : "45°" : "30°" : "15°" : "0°" : "-15°" : "-30°" : "-45°" : "-60°";
    }

    private void setUp(boolean z) {
        AbstractC7469a aVar;
        boolean z2 = z && ((aVar = this.f23805M) == null || aVar.mo15972Y4());
        if (this.f23824f0 != z2) {
            this.f23824f0 = z2;
            m15978a(z2 ? 1.0f : 0.0f);
            AbstractC7469a aVar2 = this.f23805M;
            if (aVar2 != null) {
                aVar2.mo15973T3(z2);
            }
        }
    }

    private void setValue(float f) {
        if (this.f23815W != f) {
            this.f23815W = f;
            setValueInt(Math.round(f));
            invalidate();
        }
    }

    private void setValueInt(int i) {
        if (this.f23817a0 != i || this.f23819b0 == null) {
            this.f23817a0 = i;
            String str = Integer.toString(i) + (char) 176;
            this.f23819b0 = str;
            this.f23821c0 = C7389v0.m16684S1(str, 0, str.length() - 1, this.f23818b);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0 && this.f23826h0 != f) {
            this.f23826h0 = f;
            invalidate();
            AbstractC7469a aVar = this.f23805M;
            if (aVar != null) {
                aVar.mo15970t3(f);
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m15978a(float f) {
        if (this.f23825g0 == null) {
            this.f23825g0 = new C3950k(0, this, C2057b.f7280b, 140L, this.f23826h0);
        }
        this.f23825g0.m29544i(f);
    }

    public final float m15976c(int i) {
        float f;
        float f2;
        if (i == -60) {
            f = this.f23812T;
            f2 = this.f23806N;
        } else if (i == -45) {
            f = this.f23811S;
            f2 = this.f23806N;
        } else if (i == -30) {
            f = this.f23810R;
            f2 = this.f23806N;
        } else if (i == -15) {
            f = this.f23809Q;
            f2 = this.f23806N;
        } else if (i == 0) {
            return this.f23808P;
        } else {
            if (i == 15) {
                return this.f23809Q;
            }
            if (i == 30) {
                return this.f23810R;
            }
            if (i == 45) {
                return this.f23811S;
            }
            if (i != 60) {
                return 0.0f;
            }
            return this.f23812T;
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
        if (this.f23815W != max) {
            setValue(max);
            AbstractC7469a aVar = this.f23805M;
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
            this.f23822d0 = motionEvent.getX();
            int paddingLeft = getPaddingLeft() + (measuredWidth / 2);
            int min = Math.min(measuredWidth, C1357a0.m37541i(192.0f));
            float f = this.f23822d0;
            int i = min / 2;
            if (f >= paddingLeft - i && f <= paddingLeft + i) {
                z = true;
            }
            setUp(z);
            if (this.f23824f0) {
                this.f23823e0 = this.f23815W;
                return true;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f23824f0) {
                    setUp(false);
                    return true;
                }
            } else if (this.f23824f0) {
                m15974e(this.f23823e0 + ((((motionEvent.getX() - this.f23822d0) * 0.1f) * (-45.0f)) / (measuredWidth / 2.5f)));
            }
        } else if (this.f23824f0) {
            setUp(false);
            return true;
        }
        return this.f23824f0;
    }

    public void setCallback(AbstractC7469a aVar) {
        this.f23805M = aVar;
    }
}
