package p291uc;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import p038ce.View$OnClickListenerC2971rh;
import p051db.AbstractC3937c;

public class C9597l1 extends RelativeLayout implements AbstractC3937c {
    public Runnable f31116M;
    public View$OnClickListenerC2971rh f31117a;
    public boolean f31118b;
    public int f31119c;

    public C9597l1(Context context) {
        super(context);
    }

    @Override
    public void mo8061R(View view, Runnable runnable) {
        this.f31116M = runnable;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f31118b) {
            boolean hk = this.f31117a.m32384hk();
            ViewTreeObserver$OnPreDrawListenerC7081z0 gk = this.f31117a.m32397gk();
            boolean Yj = this.f31117a.m32502Yj();
            ViewTreeObserver$OnPreDrawListenerC9542g mk = this.f31117a.m32319mk();
            if (hk && gk != null) {
                gk.m17841j(true);
            }
            if (Yj && mk != null) {
                mk.m8382f(true);
            }
        }
        Runnable runnable = this.f31116M;
        if (runnable != null) {
            runnable.run();
            this.f31116M = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        boolean hk = this.f31117a.m32384hk();
        ViewTreeObserver$OnPreDrawListenerC7081z0 gk = this.f31117a.m32397gk();
        boolean Yj = this.f31117a.m32502Yj();
        ViewTreeObserver$OnPreDrawListenerC9542g mk = this.f31117a.m32319mk();
        int measuredHeight = getMeasuredHeight();
        super.onMeasure(i, i2);
        this.f31118b = measuredHeight > getMeasuredHeight() && ((hk && gk != null) || (Yj && mk != null)) && getMeasuredWidth() == this.f31119c;
        this.f31119c = getMeasuredWidth();
    }

    public void setController(View$OnClickListenerC2971rh rhVar) {
        this.f31117a = rhVar;
    }
}
