package ee;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ce.a0;
import ce.p0;
import ce.y;
import db.b;
import eb.k;
import ib.h;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import yd.d;
import zd.ya;

public class c extends View implements k.b, Runnable {
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public k S;
    public float T;
    public float U;
    public boolean V;
    public float W;
    public k f11613a;
    public float f11614a0;
    public b f11615b;
    public a f11616b0;
    public Bitmap f11617c = ce.c.o(ce.c.f(R.drawable.baseline_camera_alt_24));
    public Bitmap N = ce.c.o(ce.c.f(R.drawable.baseline_close_24));
    public Bitmap M = ce.c.o(ce.c.f(R.drawable.baseline_stop_24));

    public interface a {
        void K4(c cVar);

        void n1(c cVar);

        boolean v3(c cVar);
    }

    public c(Context context) {
        super(context);
        p0.T(this);
        d.d(this, 56.0f, 4.0f, R.id.theme_color_white, null);
        setLayerType(2, null);
        int i10 = a0.i(4.0f);
        int i11 = i10 * 2;
        setLayoutParams(FrameLayoutFix.q1(a0.i(56.0f) + i11, a0.i(56.0f) + i11));
        setPadding(i10, i10, i10, i10);
    }

    public static void b(Canvas canvas, Bitmap bitmap, int i10, int i11, float f10) {
        if (f10 != 0.0f) {
            int width = i10 - (bitmap.getWidth() / 2);
            int height = i11 - (bitmap.getHeight() / 2);
            Paint u02 = y.u0();
            u02.setAlpha((int) (f10 * 255.0f));
            canvas.drawBitmap(bitmap, width, height, u02);
        }
    }

    private void setRecordFactor(float f10) {
        if (this.R != f10) {
            this.R = f10;
            this.f11615b.setExpandFactor(f10);
            float f11 = ((1.0f - f10) * 0.15f) + 0.85f;
            setScaleX(f11);
            setScaleY(f11);
            this.f11613a.kg(f10);
            invalidate();
        }
    }

    public final void a() {
        removeCallbacks(this);
    }

    public final void c(MotionEvent motionEvent) {
        if (this.O) {
            this.O = false;
            if (motionEvent != null) {
                super.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                super.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, this.T, this.U, 0));
            }
            a();
        }
    }

    public boolean d(boolean z10) {
        a();
        if (this.P) {
            this.P = false;
            z10 = z10 && this.f11616b0 != null && !this.Q;
            a aVar = this.f11616b0;
            if (aVar != null) {
                aVar.n1(this);
            } else {
                this.f11615b.a();
                setInRecordMode(false);
            }
            if (!z10) {
                return true;
            }
        }
        return z10 && f();
    }

    public final void e() {
        postDelayed(this, ViewConfiguration.getLongPressTimeout());
    }

    public boolean f() {
        if (this.P) {
            return false;
        }
        this.f11615b.a();
        a aVar = this.f11616b0;
        if (aVar == null) {
            return true;
        }
        aVar.K4(this);
        return true;
    }

    public void g() {
        a aVar = this.f11616b0;
        if (aVar != null) {
            this.P = aVar.v3(this);
            return;
        }
        this.P = true;
        setInRecordMode(true);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setRecordFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        if (this.f11613a.yf()) {
            b(canvas, this.N, measuredWidth, measuredHeight, 1.0f - (this.R / 0.5f));
            return;
        }
        float f10 = this.R;
        if (f10 > 0.3f) {
            b(canvas, this.M, measuredWidth, measuredHeight, (f10 - 0.3f) / 0.7f);
        }
        float f11 = this.R;
        if (f11 <= 0.5f) {
            b(canvas, this.f11617c, measuredWidth, measuredHeight, 1.0f - (f11 / 0.5f));
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.T = motionEvent.getX();
        this.U = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.O) {
                        float f10 = this.T;
                        if (f10 >= 0.0f) {
                            float f11 = this.U;
                            if (f11 >= 0.0f && f10 <= measuredWidth && f11 <= measuredHeight) {
                                super.onTouchEvent(motionEvent);
                            }
                        }
                        c(motionEvent);
                    }
                    float d10 = h.d((-this.U) / a0.k(150.0f));
                    float p10 = this.f11613a.rf().p();
                    float o10 = this.f11613a.rf().o();
                    if (!this.V && this.U < 0.0f && ((o10 - p10) * d10) + p10 >= this.W) {
                        this.V = true;
                    }
                    if (this.V) {
                        this.f11613a.rf().J(p10 + ((o10 - p10) * d10));
                    }
                } else if (action != 3) {
                    if (this.O) {
                        super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.O) {
                super.onTouchEvent(motionEvent);
            }
            d(!this.Q && motionEvent.getAction() == 1 && this.O);
            this.O = false;
        } else {
            this.V = false;
            super.onTouchEvent(motionEvent);
            if (!this.Q) {
                e();
            }
            this.O = true;
        }
        return true;
    }

    @Override
    public void run() {
        if (this.O) {
            g();
        }
    }

    public void setActualZoom(float f10) {
        this.W = f10;
    }

    public void setBlurView(b bVar) {
        this.f11615b = bVar;
    }

    public void setComponentRotation(float f10) {
        if (this.f11614a0 != f10) {
            this.f11614a0 = f10;
            setRotation(f10);
            this.V = false;
        }
    }

    public void setInRecordMode(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        if (this.P || !z10) {
            this.Q = z10;
            if (this.S == null) {
                this.S = new k(0, this, b.f7287b, 180L, this.R);
            }
            this.S.i(z10 ? 1.0f : 0.0f);
            if (z10) {
                ya.o1().w2().A0(Log.TAG_CRASH);
                c(null);
            } else if (this.f11616b0 != null) {
                this.f11615b.a();
            }
        }
    }

    public void setParent(k kVar) {
        this.f11613a = kVar;
    }

    public void setRecordListener(a aVar) {
        this.f11616b0 = aVar;
    }
}
