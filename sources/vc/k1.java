package vc;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import de.rh;
import eb.c;
import ne.z0;

public class k1 extends RelativeLayout implements c {
    public Runnable M;
    public rh f25073a;
    public boolean f25074b;
    public int f25075c;

    public k1(Context context) {
        super(context);
    }

    @Override
    public void S(View view, Runnable runnable) {
        this.M = runnable;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f25074b) {
            boolean hk = this.f25073a.hk();
            z0 gk = this.f25073a.gk();
            boolean Yj = this.f25073a.Yj();
            g mk = this.f25073a.mk();
            if (hk && gk != null) {
                gk.j(true);
            }
            if (Yj && mk != null) {
                mk.f(true);
            }
        }
        Runnable runnable = this.M;
        if (runnable != null) {
            runnable.run();
            this.M = null;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean hk = this.f25073a.hk();
        z0 gk = this.f25073a.gk();
        boolean Yj = this.f25073a.Yj();
        g mk = this.f25073a.mk();
        int measuredHeight = getMeasuredHeight();
        super.onMeasure(i10, i11);
        this.f25074b = measuredHeight > getMeasuredHeight() && ((hk && gk != null) || (Yj && mk != null)) && getMeasuredWidth() == this.f25075c;
        this.f25075c = getMeasuredWidth();
    }

    public void setController(rh rhVar) {
        this.f25073a = rhVar;
    }
}
