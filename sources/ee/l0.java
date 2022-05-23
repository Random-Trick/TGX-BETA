package ee;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import ce.j0;
import me.vkryl.android.widget.FrameLayoutFix;
import ud.v4;

public class l0 extends FrameLayoutFix {
    public v4<?> M;

    public l0(Context context) {
        super(context);
    }

    public void A1() {
        throw null;
    }

    public void B1(float f10) {
        throw null;
    }

    public void C1(v4<?> v4Var) {
        this.M = v4Var;
    }

    public void D1(RectF rectF, int i10, int i11, int i12, boolean z10) {
        throw null;
    }

    public void E1(boolean z10, boolean z11) {
        throw null;
    }

    public void G1(int i10) {
        throw null;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        v4<?> v4Var = this.M;
        if (v4Var != null) {
            v4Var.n9();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !this.M.Ta()) {
            return true;
        }
        j0.r(getContext()).l2(null, false);
        return true;
    }

    public void z1() {
        throw null;
    }
}
