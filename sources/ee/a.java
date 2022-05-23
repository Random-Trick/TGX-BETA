package ee;

import android.content.Context;
import android.view.MotionEvent;
import de.rh;
import he.i;
import oc.v0;
import ud.v4;
import vc.j0;

public class a extends j0 {
    public final rh f11602a;
    public boolean f11603b;
    public v4.k f11604c;

    public a(Context context, rh rhVar) {
        super(context);
        this.f11602a = rhVar;
        this.f11603b = v0.W(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (i.c2().r0() != 2 && onTouchEvent && motionEvent.getAction() == 0) {
            if (!this.f11603b) {
                this.f11603b = v0.W(getContext());
            }
            if (this.f11603b && this.f11602a.Gi()) {
                if (this.f11604c == null) {
                    this.f11604c = new v4.k();
                }
                ce.j0.r(getContext()).l2(this.f11604c, true);
            }
        }
        return onTouchEvent;
    }

    public void setCameraOpenOptions(v4.k kVar) {
        this.f11604c = kVar;
    }
}
