package ee;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ce.a0;
import ce.c;
import ce.y;
import db.b;
import eb.k;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class d extends View implements k.b {
    public boolean M;
    public int N;
    public float O;
    public k P;
    public float Q;
    public k R;
    public boolean S;
    public boolean T;
    public a U;
    public boolean V;
    public float W;
    public int f11621a;
    public Drawable f11622b;
    public Drawable f11623c;

    public interface a {
        void a(d dVar, float f10, float f11);
    }

    public d(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.q1(a0.i(56.0f), a0.i(56.0f)));
    }

    private void setChangeFactor(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidate();
        }
    }

    private void setSpinFactor(float f10) {
        this.Q = f10;
        float f11 = 180.0f * f10;
        setRotationY(f11);
        int i10 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        float f12 = i10 <= 0 ? f10 / 0.5f : 1.0f - ((f10 - 0.5f) / 0.5f);
        float f13 = (0.15f * f12) + 1.0f;
        setScaleX(f13);
        setScaleY(f13);
        boolean z10 = this.S;
        if ((z10 && f10 >= 0.5f) || (!z10 && i10 <= 0)) {
            setCameraIconRes(this.T);
        }
        a aVar = this.U;
        if (aVar != null) {
            if (i10 > 0) {
                f11 = (-90.0f) * (1.0f - ((f10 - 0.5f) / 0.5f));
            }
            aVar.a(this, f11, f12);
        }
    }

    public void a(View view) {
        ViewParent parent;
        float f10;
        if (!this.M && (parent = view.getParent()) != null) {
            float f11 = 0.0f;
            int i10 = -1;
            if ((((FrameLayout.LayoutParams) view.getLayoutParams()).gravity & 7) != 1) {
                int measuredHeight = (((View) parent).getMeasuredHeight() / 4) + (view.getMeasuredHeight() / 2);
                if (this.f11621a == 5) {
                    i10 = 1;
                }
                f10 = measuredHeight * i10;
            } else {
                int measuredWidth = (((View) parent).getMeasuredWidth() / 4) + (view.getMeasuredWidth() / 2);
                if (this.f11621a == 5) {
                    i10 = 1;
                }
                f11 = measuredWidth * i10;
                f10 = 0.0f;
            }
            view.setTranslationX(f11);
            view.setTranslationY(f10);
        }
    }

    public final void b() {
        k kVar = this.P;
        if (kVar != null) {
            kVar.l(0.0f);
            this.O = 0.0f;
            this.f11623c = null;
        }
    }

    public void c(int i10) {
        if (this.N != i10) {
            this.N = i10;
            k kVar = this.P;
            if (kVar == null) {
                this.P = new k(0, this, b.f7287b, 220L);
            } else if (!kVar.v() || this.O >= 1.0f) {
                this.P.l(0.0f);
                this.O = 0.0f;
            } else {
                this.P.k();
                float f10 = this.O;
                if (f10 > 0.5f) {
                    this.O = (1.0f - ((1.0f - f10) / 0.5f)) * 0.5f;
                    this.f11622b = this.f11623c;
                }
            }
            this.f11623c = c.g(getResources(), i10);
            this.P.i(1.0f);
        }
    }

    public final void d() {
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            a(this.V ? (View) getParent() : this);
        }
    }

    public void e(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        k kVar = this.R;
        if (kVar != null) {
            kVar.l(f10);
        }
        this.Q = f10;
    }

    public void f() {
        this.M = true;
        setLayoutParams(FrameLayoutFix.q1(-1, -1));
    }

    public void g(boolean z10, boolean z11) {
        k kVar = this.R;
        if (kVar == null) {
            this.R = new k(1, this, b.f7287b, 360L);
        } else if (this.S == z10 && kVar.v()) {
            return;
        }
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        float f12 = this.Q;
        if (f12 == 1.0f || f12 == 0.0f) {
            this.R.l(f10);
            this.Q = f10;
        }
        this.S = z10;
        this.T = z11;
        this.R.i(f11);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setChangeFactor(f10);
        } else if (i10 == 1) {
            setSpinFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0) {
            this.f11622b = this.f11623c;
            this.f11623c = null;
            this.P.l(0.0f);
            this.O = 0.0f;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        if (this.f11622b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float max = Math.max(0.8f, measuredWidth / a0.i(56.0f));
            int i10 = measuredWidth / 2;
            int i11 = measuredHeight / 2;
            float f10 = this.W;
            int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            boolean z10 = (i12 == 0 && max == 1.0f) ? false : true;
            if (z10) {
                canvas.save();
                if (max != 1.0f) {
                    canvas.scale(max, max, i10, i11);
                }
                if (i12 != 0) {
                    canvas.rotate(f10, i10, i11);
                }
            }
            Paint J = this.M ? y.J() : y.W(-1);
            if (this.O == 0.0f) {
                c.b(canvas, this.f11622b, i10 - (drawable3.getMinimumWidth() / 2), i11 - (this.f11622b.getMinimumHeight() / 2), J);
            } else {
                int alpha = J.getAlpha();
                J.setAlpha((int) ((1.0f - this.O) * 255.0f));
                float f11 = i10;
                c.b(canvas, this.f11622b, i10 - (drawable.getMinimumWidth() / 2), (i11 - (this.f11622b.getMinimumHeight() / 2)) + (this.O * f11), J);
                J.setAlpha((int) (this.O * 255.0f));
                c.b(canvas, this.f11623c, i10 - (drawable2.getMinimumWidth() / 2), (i11 - (this.f11622b.getMinimumHeight() / 2)) - (f11 * (1.0f - this.O)), J);
                J.setAlpha(alpha);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getAlpha() == 1.0f && getVisibility() == 0 && super.onTouchEvent(motionEvent);
    }

    public void setAlignGravity(int i10) {
        if (this.f11621a != i10) {
            this.f11621a = i10;
            d();
        }
    }

    public void setCameraIconRes(boolean z10) {
        setIconRes(z10 ? R.drawable.baseline_camera_rear_24 : R.drawable.baseline_camera_front_24);
    }

    public void setComponentRotation(float f10) {
        if (this.W != f10) {
            this.W = f10;
            invalidate();
        }
    }

    public void setIconRes(int i10) {
        b();
        this.N = i10;
        this.f11622b = c.g(getResources(), i10);
        invalidate();
    }

    public void setNeedParentTranslation(boolean z10) {
        this.V = z10;
    }

    public void setSpinCallback(a aVar) {
        this.U = aVar;
    }
}
