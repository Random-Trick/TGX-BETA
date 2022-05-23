package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import ce.a0;
import ce.o;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import ib.d;
import ib.h;
import oc.v0;

public class r3 extends b2 implements k.b, Handler.Callback {
    public long M;
    public a N;
    public boolean O;
    public boolean P;
    public final Handler f18359a = new Handler(this);
    public final f f18360b = new f(0, this, b.f7287b, 180);
    public int f18361c;

    public interface a {
        void o1(r3 r3Var, boolean z10);
    }

    public r3(Context context) {
        super(context);
        setTypeface(o.i());
        setTextSize(1, 13.0f);
        setGravity(17);
        setPadding(0, 0, 0, a0.i(1.0f));
        setAlpha(0.0f);
    }

    public boolean a() {
        return this.f18360b.h();
    }

    public final void b(boolean z10, boolean z11) {
        a aVar;
        boolean h10 = this.f18360b.h();
        this.f18360b.p(z10, z11);
        if (h10 != z10 && (aVar = this.N) != null) {
            aVar.o1(this, z10);
        }
    }

    public void c(int i10, long j10) {
        b(j10 > 0, false);
        this.f18361c = i10;
        this.M = j10;
        if (this.O || this.P) {
            this.O = false;
            this.P = false;
            this.f18359a.removeCallbacksAndMessages(null);
        }
        d();
        invalidate();
    }

    public final void d() {
        String str;
        if (this.M != 0) {
            long uptimeMillis = this.M - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                this.M = 0L;
                b(false, false);
                return;
            }
            long j10 = 1000;
            if (uptimeMillis <= 60000) {
                str = Integer.toString((int) (uptimeMillis / 1000));
            } else if (uptimeMillis < 3600000) {
                j10 = 60000 - (uptimeMillis % 60000);
                str = Integer.toString((int) ((uptimeMillis / 1000) / 60.0d));
            } else {
                j10 = 3600000 - (uptimeMillis % 3600000);
                str = ((int) Math.ceil(((uptimeMillis / 1000) / 60) / 60.0d)) + "h";
            }
            setText(str);
            if (!this.P) {
                this.P = true;
                Handler handler = this.f18359a;
                handler.sendMessageDelayed(Message.obtain(handler, 1), j10);
            }
        }
    }

    @Override
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1 && this.P) {
                this.P = false;
                d();
            }
        } else if (this.O) {
            this.O = false;
            invalidate();
        }
        return true;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setAlpha(f10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f18361c == 0) {
            super.onDraw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i10 = a0.i(12.0f);
        int F0 = j.F0();
        float d10 = h.d((float) ((this.M - SystemClock.uptimeMillis()) / (this.f18361c * 1000)));
        int i11 = a0.i(1.5f);
        int i12 = (int) (d10 * 360.0f);
        if (i12 == 360) {
            canvas.drawCircle(measuredWidth, measuredHeight, i10, y.Y(F0, i11));
        } else {
            float f10 = i11;
            canvas.drawCircle(measuredWidth, measuredHeight, i10, y.Y(d.a(0.25f, F0), f10));
            RectF a02 = y.a0();
            a02.set(measuredWidth - i10, measuredHeight - i10, measuredWidth + i10, measuredHeight + i10);
            canvas.drawArc(a02, h.l((360 - i12) - 90, 360), i12, false, y.Y(F0, f10));
        }
        if (!this.O) {
            long u10 = v0.u(i10 * 2, this.f18361c * 1000);
            this.O = true;
            Handler handler = this.f18359a;
            handler.sendMessageDelayed(Message.obtain(handler, 0), u10);
        }
        super.onDraw(canvas);
    }

    public void setListener(a aVar) {
        this.N = aVar;
    }
}
