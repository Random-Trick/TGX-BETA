package de;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;

public class C4030d extends View implements C3950k.AbstractC3952b {
    public boolean f13534M;
    public int f13535N;
    public float f13536O;
    public C3950k f13537P;
    public float f13538Q;
    public C3950k f13539R;
    public boolean f13540S;
    public boolean f13541T;
    public AbstractC4031a f13542U;
    public boolean f13543V;
    public float f13544W;
    public int f13545a;
    public Drawable f13546b;
    public Drawable f13547c;

    public interface AbstractC4031a {
        void m29262a(C4030d dVar, float f, float f2);
    }

    public C4030d(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.m18008s1(C1357a0.m37544i(56.0f), C1357a0.m37544i(56.0f)));
    }

    private void setChangeFactor(float f) {
        if (this.f13536O != f) {
            this.f13536O = f;
            invalidate();
        }
    }

    private void setSpinFactor(float f) {
        this.f13538Q = f;
        float f2 = 180.0f * f;
        setRotationY(f2);
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        float f3 = i <= 0 ? f / 0.5f : 1.0f - ((f - 0.5f) / 0.5f);
        float f4 = (0.15f * f3) + 1.0f;
        setScaleX(f4);
        setScaleY(f4);
        boolean z = this.f13540S;
        if ((z && f >= 0.5f) || (!z && i <= 0)) {
            setCameraIconRes(this.f13541T);
        }
        AbstractC4031a aVar = this.f13542U;
        if (aVar != null) {
            if (i > 0) {
                f2 = (-90.0f) * (1.0f - ((f - 0.5f) / 0.5f));
            }
            aVar.m29262a(this, f2, f3);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setChangeFactor(f);
        } else if (i == 1) {
            setSpinFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            this.f13546b = this.f13547c;
            this.f13547c = null;
            this.f13537P.m29543l(0.0f);
            this.f13536O = 0.0f;
        }
    }

    public void m29269a(View view) {
        ViewParent parent;
        float f;
        if (!this.f13534M && (parent = view.getParent()) != null) {
            float f2 = 0.0f;
            int i = -1;
            if ((((FrameLayout.LayoutParams) view.getLayoutParams()).gravity & 7) != 1) {
                int measuredHeight = (((View) parent).getMeasuredHeight() / 4) + (view.getMeasuredHeight() / 2);
                if (this.f13545a == 5) {
                    i = 1;
                }
                f = measuredHeight * i;
            } else {
                int measuredWidth = (((View) parent).getMeasuredWidth() / 4) + (view.getMeasuredWidth() / 2);
                if (this.f13545a == 5) {
                    i = 1;
                }
                f2 = measuredWidth * i;
                f = 0.0f;
            }
            view.setTranslationX(f2);
            view.setTranslationY(f);
        }
    }

    public final void m29268b() {
        C3950k kVar = this.f13537P;
        if (kVar != null) {
            kVar.m29543l(0.0f);
            this.f13536O = 0.0f;
            this.f13547c = null;
        }
    }

    public void m29267c(int i) {
        if (this.f13535N != i) {
            this.f13535N = i;
            C3950k kVar = this.f13537P;
            if (kVar == null) {
                this.f13537P = new C3950k(0, this, C2057b.f7280b, 220L);
            } else if (!kVar.m29533v() || this.f13536O >= 1.0f) {
                this.f13537P.m29543l(0.0f);
                this.f13536O = 0.0f;
            } else {
                this.f13537P.m29544k();
                float f = this.f13536O;
                if (f > 0.5f) {
                    this.f13536O = (1.0f - ((1.0f - f) / 0.5f)) * 0.5f;
                    this.f13546b = this.f13547c;
                }
            }
            this.f13547c = C1362c.m37485g(getResources(), i);
            this.f13537P.m29546i(1.0f);
        }
    }

    public final void m29266d() {
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            m29269a(this.f13543V ? (View) getParent() : this);
        }
    }

    public void m29265e(boolean z) {
        float f = z ? 1.0f : 0.0f;
        C3950k kVar = this.f13539R;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        this.f13538Q = f;
    }

    public void m29264f() {
        this.f13534M = true;
        setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
    }

    public void m29263g(boolean z, boolean z2) {
        C3950k kVar = this.f13539R;
        if (kVar == null) {
            this.f13539R = new C3950k(1, this, C2057b.f7280b, 360L);
        } else if (this.f13540S == z && kVar.m29533v()) {
            return;
        }
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        float f3 = this.f13538Q;
        if (f3 == 1.0f || f3 == 0.0f) {
            this.f13539R.m29543l(f);
            this.f13538Q = f;
        }
        this.f13540S = z;
        this.f13541T = z2;
        this.f13539R.m29546i(f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        if (this.f13546b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float max = Math.max(0.8f, measuredWidth / C1357a0.m37544i(56.0f));
            int i = measuredWidth / 2;
            int i2 = measuredHeight / 2;
            float f = this.f13544W;
            int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            boolean z = (i3 == 0 && max == 1.0f) ? false : true;
            if (z) {
                canvas.save();
                if (max != 1.0f) {
                    canvas.scale(max, max, i, i2);
                }
                if (i3 != 0) {
                    canvas.rotate(f, i, i2);
                }
            }
            Paint J = this.f13534M ? C1410y.m37071J() : C1410y.m37058W(-1);
            if (this.f13536O == 0.0f) {
                C1362c.m37490b(canvas, this.f13546b, i - (drawable3.getMinimumWidth() / 2), i2 - (this.f13546b.getMinimumHeight() / 2), J);
            } else {
                int alpha = J.getAlpha();
                J.setAlpha((int) ((1.0f - this.f13536O) * 255.0f));
                float f2 = i;
                C1362c.m37490b(canvas, this.f13546b, i - (drawable.getMinimumWidth() / 2), (i2 - (this.f13546b.getMinimumHeight() / 2)) + (this.f13536O * f2), J);
                J.setAlpha((int) (this.f13536O * 255.0f));
                C1362c.m37490b(canvas, this.f13547c, i - (drawable2.getMinimumWidth() / 2), (i2 - (this.f13546b.getMinimumHeight() / 2)) - (f2 * (1.0f - this.f13536O)), J);
                J.setAlpha(alpha);
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m29266d();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getAlpha() == 1.0f && getVisibility() == 0 && super.onTouchEvent(motionEvent);
    }

    public void setAlignGravity(int i) {
        if (this.f13545a != i) {
            this.f13545a = i;
            m29266d();
        }
    }

    public void setCameraIconRes(boolean z) {
        setIconRes(z ? R.drawable.baseline_camera_rear_24 : R.drawable.baseline_camera_front_24);
    }

    public void setComponentRotation(float f) {
        if (this.f13544W != f) {
            this.f13544W = f;
            invalidate();
        }
    }

    public void setIconRes(int i) {
        m29268b();
        this.f13535N = i;
        this.f13546b = C1362c.m37485g(getResources(), i);
        invalidate();
    }

    public void setNeedParentTranslation(boolean z) {
        this.f13543V = z;
    }

    public void setSpinCallback(AbstractC4031a aVar) {
        this.f13542U = aVar;
    }
}
