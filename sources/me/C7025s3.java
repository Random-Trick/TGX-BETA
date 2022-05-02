package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import be.C1357a0;
import be.C1389o;
import be.C1410y;
import nc.C7389v0;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p108hb.C5064d;
import p108hb.C5069h;
import p364zd.C11524j;

public class C7025s3 extends C6847b2 implements C3950k.AbstractC3952b, Handler.Callback {
    public long f22290M;
    public AbstractC7026a f22291N;
    public boolean f22292O;
    public boolean f22293P;
    public final Handler f22294a = new Handler(this);
    public final C3940f f22295b = new C3940f(0, this, C2057b.f7280b, 180);
    public int f22296c;

    public interface AbstractC7026a {
        void mo11337T0(C7025s3 s3Var, boolean z);
    }

    public C7025s3(Context context) {
        super(context);
        setTypeface(C1389o.m37260i());
        setTextSize(1, 13.0f);
        setGravity(17);
        setPadding(0, 0, 0, C1357a0.m37541i(1.0f));
        setAlpha(0.0f);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setAlpha(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public boolean m18073a() {
        return this.f22295b.m29583h();
    }

    public final void m18072b(boolean z, boolean z2) {
        AbstractC7026a aVar;
        boolean h = this.f22295b.m29583h();
        this.f22295b.m29575p(z, z2);
        if (h != z && (aVar = this.f22291N) != null) {
            aVar.mo11337T0(this, z);
        }
    }

    public void m18071c(int i, long j) {
        m18072b(j > 0, false);
        this.f22296c = i;
        this.f22290M = j;
        if (this.f22292O || this.f22293P) {
            this.f22292O = false;
            this.f22293P = false;
            this.f22294a.removeCallbacksAndMessages(null);
        }
        m18070d();
        invalidate();
    }

    public final void m18070d() {
        String str;
        if (this.f22290M != 0) {
            long uptimeMillis = this.f22290M - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                this.f22290M = 0L;
                m18072b(false, false);
                return;
            }
            long j = 1000;
            if (uptimeMillis <= 60000) {
                str = Integer.toString((int) (uptimeMillis / 1000));
            } else if (uptimeMillis < 3600000) {
                j = 60000 - (uptimeMillis % 60000);
                str = Integer.toString((int) ((uptimeMillis / 1000) / 60.0d));
            } else {
                j = 3600000 - (uptimeMillis % 3600000);
                str = ((int) Math.ceil(((uptimeMillis / 1000) / 60) / 60.0d)) + "h";
            }
            setText(str);
            if (!this.f22293P) {
                this.f22293P = true;
                Handler handler = this.f22294a;
                handler.sendMessageDelayed(Message.obtain(handler, 1), j);
            }
        }
    }

    @Override
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1 && this.f22293P) {
                this.f22293P = false;
                m18070d();
            }
        } else if (this.f22292O) {
            this.f22292O = false;
            invalidate();
        }
        return true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f22296c == 0) {
            super.onDraw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i = C1357a0.m37541i(12.0f);
        int H0 = C11524j.m239H0();
        float d = C5069h.m24089d((float) ((this.f22290M - SystemClock.uptimeMillis()) / (this.f22296c * 1000)));
        int i2 = C1357a0.m37541i(1.5f);
        int i3 = (int) (d * 360.0f);
        if (i3 == 360) {
            canvas.drawCircle(measuredWidth, measuredHeight, i, C1410y.m37053Y(H0, i2));
        } else {
            float f = i2;
            canvas.drawCircle(measuredWidth, measuredHeight, i, C1410y.m37053Y(C5064d.m24131a(0.25f, H0), f));
            RectF a0 = C1410y.m37050a0();
            a0.set(measuredWidth - i, measuredHeight - i, measuredWidth + i, measuredHeight + i);
            canvas.drawArc(a0, C5069h.m24081l((360 - i3) - 90, 360), i3, false, C1410y.m37053Y(H0, f));
        }
        if (!this.f22292O) {
            long u = C7389v0.m16578u(i * 2, this.f22296c * 1000);
            this.f22292O = true;
            Handler handler = this.f22294a;
            handler.sendMessageDelayed(Message.obtain(handler, 0), u);
        }
        super.onDraw(canvas);
    }

    public void setListener(AbstractC7026a aVar) {
        this.f22291N = aVar;
    }
}
