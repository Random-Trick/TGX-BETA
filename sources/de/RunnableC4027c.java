package de;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p108hb.C5069h;
import p335xd.C10189d;
import p350yd.C10536ab;

public class RunnableC4027c extends View implements C3950k.AbstractC3952b, Runnable {
    public boolean f13514O;
    public boolean f13515P;
    public boolean f13516Q;
    public float f13517R;
    public C3950k f13518S;
    public float f13519T;
    public float f13520U;
    public boolean f13521V;
    public float f13522W;
    public View$OnClickListenerC4045k f13523a;
    public float f13524a0;
    public C4025b f13525b;
    public AbstractC4028a f13526b0;
    public Bitmap f13527c = C1362c.m37477o(C1362c.m37486f(R.drawable.baseline_camera_alt_24));
    public Bitmap f13513N = C1362c.m37477o(C1362c.m37486f(R.drawable.baseline_close_24));
    public Bitmap f13512M = C1362c.m37477o(C1362c.m37486f(R.drawable.baseline_stop_24));

    public interface AbstractC4028a {
        void mo29216T6(RunnableC4027c cVar);

        boolean mo29155x6(RunnableC4027c cVar);

        void mo29152y(RunnableC4027c cVar);
    }

    public RunnableC4027c(Context context) {
        super(context);
        C1399s0.m37196a0(this);
        C10189d.m5800d(this, 56.0f, 4.0f, R.id.theme_color_white, null);
        setLayerType(2, null);
        int i = C1357a0.m37544i(4.0f);
        int i2 = i * 2;
        setLayoutParams(FrameLayoutFix.m18008s1(C1357a0.m37544i(56.0f) + i2, C1357a0.m37544i(56.0f) + i2));
        setPadding(i, i, i, i);
    }

    public static void m29275b(Canvas canvas, Bitmap bitmap, int i, int i2, float f) {
        if (f != 0.0f) {
            int width = i - (bitmap.getWidth() / 2);
            int height = i2 - (bitmap.getHeight() / 2);
            Paint u0 = C1410y.m37013u0();
            u0.setAlpha((int) (f * 255.0f));
            canvas.drawBitmap(bitmap, width, height, u0);
        }
    }

    private void setRecordFactor(float f) {
        if (this.f13517R != f) {
            this.f13517R = f;
            this.f13525b.setExpandFactor(f);
            float f2 = ((1.0f - f) * 0.15f) + 0.85f;
            setScaleX(f2);
            setScaleY(f2);
            this.f13523a.m29180kg(f);
            invalidate();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setRecordFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m29276a() {
        removeCallbacks(this);
    }

    public final void m29274c(MotionEvent motionEvent) {
        if (this.f13514O) {
            this.f13514O = false;
            if (motionEvent != null) {
                super.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                super.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, this.f13519T, this.f13520U, 0));
            }
            m29276a();
        }
    }

    public boolean m29273d(boolean z) {
        m29276a();
        if (this.f13515P) {
            this.f13515P = false;
            z = z && this.f13526b0 != null && !this.f13516Q;
            AbstractC4028a aVar = this.f13526b0;
            if (aVar != null) {
                aVar.mo29216T6(this);
            } else {
                this.f13525b.m29277a();
                setInRecordMode(false);
            }
            if (!z) {
                return true;
            }
        }
        return z && m29271f();
    }

    public final void m29272e() {
        postDelayed(this, ViewConfiguration.getLongPressTimeout());
    }

    public boolean m29271f() {
        if (this.f13515P) {
            return false;
        }
        this.f13525b.m29277a();
        AbstractC4028a aVar = this.f13526b0;
        if (aVar == null) {
            return true;
        }
        aVar.mo29152y(this);
        return true;
    }

    public void m29270g() {
        AbstractC4028a aVar = this.f13526b0;
        if (aVar != null) {
            this.f13515P = aVar.mo29155x6(this);
            return;
        }
        this.f13515P = true;
        setInRecordMode(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        if (this.f13523a.m29151yf()) {
            m29275b(canvas, this.f13513N, measuredWidth, measuredHeight, 1.0f - (this.f13517R / 0.5f));
            return;
        }
        float f = this.f13517R;
        if (f > 0.3f) {
            m29275b(canvas, this.f13512M, measuredWidth, measuredHeight, (f - 0.3f) / 0.7f);
        }
        float f2 = this.f13517R;
        if (f2 <= 0.5f) {
            m29275b(canvas, this.f13527c, measuredWidth, measuredHeight, 1.0f - (f2 / 0.5f));
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f13519T = motionEvent.getX();
        this.f13520U = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.f13514O) {
                        float f = this.f13519T;
                        if (f >= 0.0f) {
                            float f2 = this.f13520U;
                            if (f2 >= 0.0f && f <= measuredWidth && f2 <= measuredHeight) {
                                super.onTouchEvent(motionEvent);
                            }
                        }
                        m29274c(motionEvent);
                    }
                    float d = C5069h.m24090d((-this.f13520U) / C1357a0.m37542k(150.0f));
                    float p = this.f13523a.m29167rf().mo27757p();
                    float o = this.f13523a.m29167rf().mo27758o();
                    if (!this.f13521V && this.f13520U < 0.0f && ((o - p) * d) + p >= this.f13522W) {
                        this.f13521V = true;
                    }
                    if (this.f13521V) {
                        this.f13523a.m29167rf().mo27771J(p + ((o - p) * d));
                    }
                } else if (action != 3) {
                    if (this.f13514O) {
                        super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.f13514O) {
                super.onTouchEvent(motionEvent);
            }
            m29273d(!this.f13516Q && motionEvent.getAction() == 1 && this.f13514O);
            this.f13514O = false;
        } else {
            this.f13521V = false;
            super.onTouchEvent(motionEvent);
            if (!this.f13516Q) {
                m29272e();
            }
            this.f13514O = true;
        }
        return true;
    }

    @Override
    public void run() {
        if (this.f13514O) {
            m29270g();
        }
    }

    public void setActualZoom(float f) {
        this.f13522W = f;
    }

    public void setBlurView(C4025b bVar) {
        this.f13525b = bVar;
    }

    public void setComponentRotation(float f) {
        if (this.f13524a0 != f) {
            this.f13524a0 = f;
            setRotation(f);
            this.f13521V = false;
        }
    }

    public void setInRecordMode(boolean z) {
        if (this.f13516Q == z) {
            return;
        }
        if (this.f13515P || !z) {
            this.f13516Q = z;
            if (this.f13518S == null) {
                this.f13518S = new C3950k(0, this, C2057b.f7280b, 180L, this.f13517R);
            }
            this.f13518S.m29546i(z ? 1.0f : 0.0f);
            if (z) {
                C10536ab.m4667o1().m4636w2().m7119A0(Log.TAG_CRASH);
                m29274c(null);
            } else if (this.f13526b0 != null) {
                this.f13525b.m29277a();
            }
        }
    }

    public void setParent(View$OnClickListenerC4045k kVar) {
        this.f13523a = kVar;
    }

    public void setRecordListener(AbstractC4028a aVar) {
        this.f13526b0 = aVar;
    }
}
