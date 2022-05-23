package ee;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import he.i;
import ib.h;
import me.vkryl.android.widget.FrameLayoutFix;

public class o extends FrameLayoutFix {
    public k M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public int R;

    public o(Context context) {
        super(context);
    }

    public int getOriginalHeight() {
        return this.R;
    }

    public int getOriginalWidth() {
        return this.Q;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int defaultSize = FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i10);
        int defaultSize2 = FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i11);
        this.M.rf().f0(defaultSize, defaultSize2);
        if (!this.P) {
            float p02 = i.c2().p0();
            if (p02 != 0.0f) {
                float a10 = h.a(defaultSize, defaultSize2);
                if (a10 != p02) {
                    if (defaultSize > defaultSize2) {
                        defaultSize = (int) ((defaultSize / a10) * p02);
                    } else {
                        defaultSize2 = (int) ((defaultSize2 / a10) * p02);
                    }
                }
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(defaultSize2, View.MeasureSpec.getMode(i11)));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.N != measuredWidth || this.O != measuredHeight) {
            this.N = measuredWidth;
            this.O = measuredHeight;
            this.M.jf();
        }
    }

    public void setDisallowRatioChanges(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            requestLayout();
        }
    }

    public void setParent(k kVar) {
        this.M = kVar;
    }
}
