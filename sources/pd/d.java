package pd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import ce.b;
import ib.h;
import oc.v0;
import sd.f;

public class d extends View {
    public float M;
    public float N;
    public float O = 1.0f;
    public float P = 1.0f;
    public float Q;
    public boolean R;
    public Bitmap f21190a;
    public int f21191b;
    public f f21192c;

    public d(Context context) {
        super(context);
    }

    public final void a() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        if (measuredWidth != 0.0f && measuredHeight != 0.0f) {
            double radians = Math.toRadians(this.M);
            float abs = (float) Math.abs(Math.sin(radians));
            float abs2 = (float) Math.abs(Math.cos(radians));
            this.N = Math.max(((measuredWidth * abs2) + (measuredHeight * abs)) / measuredWidth, ((abs * measuredWidth) + (abs2 * measuredHeight)) / measuredHeight);
            e(false);
        }
    }

    public void b(Bitmap bitmap, int i10, float f10, f fVar) {
        Bitmap bitmap2;
        f fVar2;
        if (this.f21190a != bitmap || this.f21191b != i10 || this.M != f10 || (((fVar2 = this.f21192c) == null && fVar != null) || ((fVar2 != null && fVar == null) || (fVar2 != null && !fVar2.e(fVar))))) {
            boolean z10 = bitmap != null && ((bitmap2 = this.f21190a) == null || bitmap2.isRecycled() || v0.a1(this.f21190a, this.f21191b) != v0.a1(bitmap, i10) || v0.B0(this.f21190a, this.f21191b) != v0.B0(bitmap, i10));
            this.f21190a = bitmap;
            this.f21191b = i10;
            this.M = f10;
            this.f21192c = fVar;
            if (z10) {
                requestLayout();
            }
            a();
            invalidate();
        }
    }

    public void c(int i10) {
        b(this.f21190a, h.l(this.f21191b + i10, 360), this.M, this.f21192c);
    }

    public void d(float f10, float f11) {
        if (this.O != f10 || this.P != f11) {
            this.O = f10;
            this.P = f11;
            e(false);
        }
    }

    public final void e(boolean z10) {
        float f10;
        float f11;
        if (this.R) {
            f11 = 1.0f;
            f10 = 0.0f;
        } else {
            f11 = this.N;
            f10 = this.M;
        }
        setScaleX(this.O * f11);
        setScaleY(this.P * f11);
        setRotation(this.Q + f10);
        if (z10 || this.R) {
            invalidate();
        }
    }

    public int getTargetHeight() {
        return v0.B0(this.f21190a, this.f21191b);
    }

    public int getTargetWidth() {
        return v0.a1(this.f21190a, this.f21191b);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        boolean z10 = this.R && !(this.M == 0.0f && this.N == 1.0f);
        if (z10) {
            canvas.save();
            float f10 = measuredWidth;
            float f11 = measuredHeight;
            canvas.rotate(this.M, f10, f11);
            float f12 = this.N;
            canvas.scale(f12, f12, f10, f11);
        }
        b.v(getMeasuredWidth(), getMeasuredHeight(), canvas, this.f21190a, this.f21191b, this.f21192c);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f21190a != null) {
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
            int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
            float targetWidth = getTargetWidth();
            float targetHeight = getTargetHeight();
            float min = Math.min(defaultSize / targetWidth, defaultSize2 / targetHeight);
            setMeasuredDimension((int) (targetWidth * min), (int) (targetHeight * min));
            setTranslationY((defaultSize2 / 2) - (i12 / 2));
            a();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setBaseRotation(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            e(false);
        }
    }

    public void setDegreesAroundCenter(float f10) {
        if (this.M != f10) {
            this.M = f10;
            a();
        }
    }

    public void setRotateInternally(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            e(this.M != 0.0f);
        }
    }
}
