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
    public float f25328M;
    public float f25329N;
    public float f25330O = 1.0f;
    public float f25331P = 1.0f;
    public float f25332Q;
    public boolean f25333R;
    public Bitmap f25334a;
    public int f25335b;
    public C8431f f25336c;

    public C7857d(Context context) {
        super(context);
    }

    public final void m14811a() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth != 0.0f && measuredHeight != 0.0f) {
            double radians = Math.toRadians(this.f25328M);
            float abs = (float) Math.abs(Math.sin(radians));
            float abs2 = (float) Math.abs(Math.cos(radians));
            this.f25329N = Math.max(((measuredWidth * abs2) + (measuredHeight * abs)) / measuredWidth, ((abs * measuredWidth) + (abs2 * measuredHeight)) / measuredHeight);
            m14807e(false);
        }
    }

    public void m14810b(Bitmap bitmap, int i, float f, C8431f fVar) {
        Bitmap bitmap2;
        C8431f fVar2;
        if (this.f25334a != bitmap || this.f25335b != i || this.f25328M != f || (((fVar2 = this.f25336c) == null && fVar != null) || ((fVar2 != null && fVar == null) || (fVar2 != null && !fVar2.m12497e(fVar))))) {
            boolean z = bitmap != null && ((bitmap2 = this.f25334a) == null || bitmap2.isRecycled() || C7389v0.m16656a1(this.f25334a, this.f25335b) != C7389v0.m16656a1(bitmap, i) || C7389v0.m16753B0(this.f25334a, this.f25335b) != C7389v0.m16753B0(bitmap, i));
            this.f25334a = bitmap;
            this.f25335b = i;
            this.f25328M = f;
            this.f25336c = fVar;
            if (z) {
                requestLayout();
            }
            m14811a();
            invalidate();
        }
    }

    public void m14809c(int i) {
        m14810b(this.f25334a, C5069h.m24082l(this.f25335b + i, 360), this.f25328M, this.f25336c);
    }

    public void m14808d(float f, float f2) {
        if (this.f25330O != f || this.f25331P != f2) {
            this.f25330O = f;
            this.f25331P = f2;
            m14807e(false);
        }
    }

    public final void m14807e(boolean z) {
        float f;
        float f2;
        if (this.f25333R) {
            f2 = 1.0f;
            f = 0.0f;
        } else {
            f2 = this.f25329N;
            f = this.f25328M;
        }
        setScaleX(this.f25330O * f2);
        setScaleY(this.f25331P * f2);
        setRotation(this.f25332Q + f);
        if (z || this.f25333R) {
            invalidate();
        }
    }

    public int getTargetHeight() {
        return C7389v0.m16753B0(this.f25334a, this.f25335b);
    }

    public int getTargetWidth() {
        return C7389v0.m16656a1(this.f25334a, this.f25335b);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        boolean z = this.f25333R && !(this.f25328M == 0.0f && this.f25329N == 1.0f);
        if (z) {
            canvas.save();
            float f = measuredWidth;
            float f2 = measuredHeight;
            canvas.rotate(this.f25328M, f, f2);
            float f3 = this.f25329N;
            canvas.scale(f3, f3, f, f2);
        }
        C1359b.m37500v(getMeasuredWidth(), getMeasuredHeight(), canvas, this.f25334a, this.f25335b, this.f25336c);
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f25334a != null) {
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
        if (this.f25332Q != f) {
            this.f25332Q = f;
            m14807e(false);
        }
    }

    public void setDegreesAroundCenter(float f) {
        if (this.f25328M != f) {
            this.f25328M = f;
            m14811a();
        }
    }

    public void setRotateInternally(boolean z) {
        if (this.f25333R != z) {
            this.f25333R = z;
            m14807e(this.f25328M != 0.0f);
        }
    }
}
