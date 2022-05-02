package p291uc;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import p038ce.View$OnClickListenerC2971rh;
import p051db.AbstractC3937c;

public class C9597l1 extends RelativeLayout implements AbstractC3937c {
    public Runnable f31119M;
    public View$OnClickListenerC2971rh f31120a;
    public boolean f31121b;
    public int f31122c;

    public C9597l1(Context context) {
        super(context);
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f31119M = runnable;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f31121b) {
            boolean hk = this.f31120a.m32387hk();
            ViewTreeObserver$OnPreDrawListenerC7081z0 gk = this.f31120a.m32400gk();
            boolean Yj = this.f31120a.m32505Yj();
            ViewTreeObserver$OnPreDrawListenerC9542g mk = this.f31120a.m32322mk();
            if (hk && gk != null) {
                gk.m17841j(true);
            }
            if (Yj && mk != null) {
                mk.m8382f(true);
            }
        }
        Runnable runnable = this.f31119M;
        if (runnable != null) {
            runnable.run();
            this.f31119M = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        boolean hk = this.f31120a.m32387hk();
        ViewTreeObserver$OnPreDrawListenerC7081z0 gk = this.f31120a.m32400gk();
        boolean Yj = this.f31120a.m32505Yj();
        ViewTreeObserver$OnPreDrawListenerC9542g mk = this.f31120a.m32322mk();
        int measuredHeight = getMeasuredHeight();
        super.onMeasure(i, i2);
        this.f31121b = measuredHeight > getMeasuredHeight() && ((hk && gk != null) || (Yj && mk != null)) && getMeasuredWidth() == this.f31122c;
        this.f31122c = getMeasuredWidth();
    }

    public void setController(View$OnClickListenerC2971rh rhVar) {
        this.f31120a = rhVar;
    }
}
