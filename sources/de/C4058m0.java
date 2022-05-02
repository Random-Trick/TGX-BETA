package de;

import android.content.Context;
import android.view.TextureView;
import org.thunderdog.challegram.Log;

public class C4058m0 extends TextureView {
    public int f13680M;
    public boolean f13681N;
    public boolean f13682O;
    public AbstractTextureView$SurfaceTextureListenerC4068w f13683a;
    public int f13684b;
    public int f13685c;

    public C4058m0(Context context) {
        super(context);
    }

    public void m29110a(int i, int i2) {
        if (this.f13684b != i || this.f13685c != i2) {
            this.f13684b = i;
            this.f13685c = i2;
            if (!this.f13681N) {
                requestLayout();
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int defaultSize = TextureView.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = TextureView.getDefaultSize(getSuggestedMinimumHeight(), i2);
        this.f13681N = true;
        this.f13683a.mo28490x0(defaultSize, defaultSize2);
        this.f13681N = false;
        if (this.f13682O || (i3 = this.f13684b) <= 0 || (i4 = this.f13685c) <= 0) {
            setMeasuredDimension(defaultSize, defaultSize2);
        } else {
            if (defaultSize < (defaultSize2 * i3) / i4) {
                i5 = (int) (defaultSize * (i4 / i3));
                i6 = defaultSize;
            } else {
                i6 = (int) (defaultSize2 * (i3 / i4));
                i5 = defaultSize2;
            }
            float f = i6;
            float f2 = i5;
            float max = Math.max(defaultSize / f, defaultSize2 / f2);
            if (max > 1.0f) {
                i6 = (int) (f * max);
                i5 = (int) (f2 * max);
            }
            this.f13680M = i6;
            setMeasuredDimension(i6, i5);
        }
        this.f13683a.m29090W(getMeasuredWidth(), getMeasuredHeight());
        Log.m14721i((int) Log.TAG_CAMERA, "CameraTextureView: onMeasure %d %d", Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
    }

    public void setIgnoreAspectRatio(boolean z) {
        if (this.f13682O != z) {
            this.f13682O = z;
            requestLayout();
        }
    }

    public void setManager(AbstractTextureView$SurfaceTextureListenerC4068w wVar) {
        this.f13683a = wVar;
    }
}
