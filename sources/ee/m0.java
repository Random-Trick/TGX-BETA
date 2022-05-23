package ee;

import android.content.Context;
import android.view.TextureView;
import org.thunderdog.challegram.Log;

public class m0 extends TextureView {
    public int M;
    public boolean N;
    public boolean O;
    public w f11718a;
    public int f11719b;
    public int f11720c;

    public m0(Context context) {
        super(context);
    }

    public void a(int i10, int i11) {
        if (this.f11719b != i10 || this.f11720c != i11) {
            this.f11719b = i10;
            this.f11720c = i11;
            if (!this.N) {
                requestLayout();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int defaultSize = TextureView.getDefaultSize(getSuggestedMinimumWidth(), i10);
        int defaultSize2 = TextureView.getDefaultSize(getSuggestedMinimumHeight(), i11);
        this.N = true;
        this.f11718a.x0(defaultSize, defaultSize2);
        this.N = false;
        if (this.O || (i12 = this.f11719b) <= 0 || (i13 = this.f11720c) <= 0) {
            setMeasuredDimension(defaultSize, defaultSize2);
        } else {
            if (defaultSize < (defaultSize2 * i12) / i13) {
                i14 = (int) (defaultSize * (i13 / i12));
                i15 = defaultSize;
            } else {
                i15 = (int) (defaultSize2 * (i12 / i13));
                i14 = defaultSize2;
            }
            float f10 = i15;
            float f11 = i14;
            float max = Math.max(defaultSize / f10, defaultSize2 / f11);
            if (max > 1.0f) {
                i15 = (int) (f10 * max);
                i14 = (int) (f11 * max);
            }
            this.M = i15;
            setMeasuredDimension(i15, i14);
        }
        this.f11718a.W(getMeasuredWidth(), getMeasuredHeight());
        Log.i((int) Log.TAG_CAMERA, "CameraTextureView: onMeasure %d %d", Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
    }

    public void setIgnoreAspectRatio(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            requestLayout();
        }
    }

    public void setManager(w wVar) {
        this.f11718a = wVar;
    }
}
