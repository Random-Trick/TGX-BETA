package de;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import be.C1379j0;
import me.vkryl.android.widget.FrameLayoutFix;
import td.AbstractC9323v4;

public class C4056l0 extends FrameLayoutFix {
    public AbstractC9323v4<?> f13678M;

    public C4056l0(Context context) {
        super(context);
    }

    public void mo29119C1() {
        throw null;
    }

    public void mo29118D1() {
        throw null;
    }

    public void mo29117E1(float f) {
        throw null;
    }

    public void m29116F1(AbstractC9323v4<?> v4Var) {
        this.f13678M = v4Var;
    }

    public void mo29115G1(RectF rectF, int i, int i2, int i3, boolean z) {
        throw null;
    }

    public void mo29114I1(boolean z, boolean z2) {
        throw null;
    }

    public void mo29113J1(int i) {
        throw null;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AbstractC9323v4<?> v4Var = this.f13678M;
        if (v4Var != null) {
            v4Var.m9204n9();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !this.f13678M.m9339Ta()) {
            return true;
        }
        C1379j0.m37310r(getContext()).m14472k2(null, false);
        return true;
    }
}
