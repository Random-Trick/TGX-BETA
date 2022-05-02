package p209od;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import be.C1359b;
import nc.C7389v0;
import p108hb.C5069h;
import p254rd.C8431f;

public class C7857d extends View {
    public float f25325M;
    public float f25326N;
    public float f25327O = 1.0f;
    public float f25328P = 1.0f;
    public float f25329Q;
    public boolean f25330R;
    public Bitmap f25331a;
    public int f25332b;
    public C8431f f25333c;

    public C7857d(Context context) {
        super(context);
    }

    public final void m14811a() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth != 0.0f && measuredHeight != 0.0f) {
            double radians = Math.toRadians(this.f25325M);
            float abs = (float) Math.abs(Math.sin(radians));
            float abs2 = (float) Math.abs(Math.cos(radians));
            this.f25326N = Math.max(((measuredWidth * abs2) + (measuredHeight * abs)) / measuredWidth, ((abs * measuredWidth) + (abs2 * measuredHeight)) / measuredHeight);
            m14807e(false);
        }
    }

    public void m14810b(Bitmap bitmap, int i, float f, C8431f fVar) {
        Bitmap bitmap2;
        C8431f fVar2;
        if (this.f25331a != bitmap || this.f25332b != i || this.f25325M != f || (((fVar2 = this.f25333c) == null && fVar != null) || ((fVar2 != null && fVar == null) || (fVar2 != null && !fVar2.m12498e(fVar))))) {
            boolean z = bitmap != null && ((bitmap2 = this.f25331a) == null || bitmap2.isRecycled() || C7389v0.m16656a1(this.f25331a, this.f25332b) != C7389v0.m16656a1(bitmap, i) || C7389v0.m16753B0(this.f25331a, this.f25332b) != C7389v0.m16753B0(bitmap, i));
            this.f25331a = bitmap;
            this.f25332b = i;
            this.f25325M = f;
            this.f25333c = fVar;
            if (z) {
                requestLayout();
            }
            m14811a();
            invalidate();
        }
    }

    public void m14809c(int i) {
        m14810b(this.f25331a, C5069h.m24081l(this.f25332b + i, 360), this.f25325M, this.f25333c);
    }

    public void m14808d(float f, float f2) {
        if (this.f25327O != f || this.f25328P != f2) {
            this.f25327O = f;
            this.f25328P = f2;
            m14807e(false);
        }
    }

    public final void m14807e(boolean z) {
        float f;
        float f2;
        if (this.f25330R) {
            f2 = 1.0f;
            f = 0.0f;
        } else {
            f2 = this.f25326N;
            f = this.f25325M;
        }
        setScaleX(this.f25327O * f2);
        setScaleY(this.f25328P * f2);
        setRotation(this.f25329Q + f);
        if (z || this.f25330R) {
            invalidate();
        }
    }

    public int getTargetHeight() {
        return C7389v0.m16753B0(this.f25331a, this.f25332b);
    }

    public int getTargetWidth() {
        return C7389v0.m16656a1(this.f25331a, this.f25332b);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        boolean z = this.f25330R && !(this.f25325M == 0.0f && this.f25326N == 1.0f);
        if (z) {
            canvas.save();
            float f = measuredWidth;
            float f2 = measuredHeight;
            canvas.rotate(this.f25325M, f, f2);
            float f3 = this.f25326N;
            canvas.scale(f3, f3, f, f2);
        }
        C1359b.m37497v(getMeasuredWidth(), getMeasuredHeight(), canvas, this.f25331a, this.f25332b, this.f25333c);
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f25331a != null) {
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            float targetWidth = getTargetWidth();
            float targetHeight = getTargetHeight();
            float min = Math.min(defaultSize / targetWidth, defaultSize2 / targetHeight);
            setMeasuredDimension((int) (targetWidth * min), (int) (targetHeight * min));
            setTranslationY((defaultSize2 / 2) - (i3 / 2));
            m14811a();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setBaseRotation(float f) {
        if (this.f25329Q != f) {
            this.f25329Q = f;
            m14807e(false);
        }
    }

    public void setDegreesAroundCenter(float f) {
        if (this.f25325M != f) {
            this.f25325M = f;
            m14811a();
        }
    }

    public void setRotateInternally(boolean z) {
        if (this.f25330R != z) {
            this.f25330R = z;
            m14807e(this.f25325M != 0.0f);
        }
    }
}
