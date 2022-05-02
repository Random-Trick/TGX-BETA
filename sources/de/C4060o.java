package de;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ge.C4868i;
import me.vkryl.android.widget.FrameLayoutFix;
import p108hb.C5069h;

public class C4060o extends FrameLayoutFix {
    public View$OnClickListenerC4045k f13689M;
    public int f13690N;
    public int f13691O;
    public boolean f13692P;
    public int f13693Q;
    public int f13694R;

    public C4060o(Context context) {
        super(context);
    }

    public int getOriginalHeight() {
        return this.f13694R;
    }

    public int getOriginalWidth() {
        return this.f13693Q;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int defaultSize = FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i2);
        this.f13689M.m29167rf().m29078f0(defaultSize, defaultSize2);
        if (!this.f13692P) {
            float p0 = C4868i.m24727c2().m24625p0();
            if (p0 != 0.0f) {
                float a = C5069h.m24093a(defaultSize, defaultSize2);
                if (a != p0) {
                    if (defaultSize > defaultSize2) {
                        defaultSize = (int) ((defaultSize / a) * p0);
                    } else {
                        defaultSize2 = (int) ((defaultSize2 / a) * p0);
                    }
                }
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(defaultSize2, View.MeasureSpec.getMode(i2)));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f13690N != measuredWidth || this.f13691O != measuredHeight) {
            this.f13690N = measuredWidth;
            this.f13691O = measuredHeight;
            this.f13689M.m29183jf();
        }
    }

    public void setDisallowRatioChanges(boolean z) {
        if (this.f13692P != z) {
            this.f13692P = z;
            requestLayout();
        }
    }

    public void setParent(View$OnClickListenerC4045k kVar) {
        this.f13689M = kVar;
    }
}
