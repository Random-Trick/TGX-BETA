package td;

import android.content.Context;
import android.widget.ScrollView;
import be.C1379j0;
import ge.C4896n;

@Deprecated
public class C9255o extends ScrollView {
    public C9239m f29886a;
    public C9290s0 f29887b;
    public float f29888c = 1.0f;
    public boolean f29885M = true;

    public C9255o(Context context) {
        super(context);
        setVerticalScrollBarEnabled(false);
    }

    public float getScrollFactor() {
        return this.f29888c;
    }

    @Override
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f29886a != null && !this.f29885M) {
            float h = 1.0f - (i2 / C4896n.m24475h());
            View$OnClickListenerC9170d1 v = C1379j0.m37299v();
            if (h >= 1.0f) {
                this.f29888c = 1.0f;
                this.f29886a.mo8402i0(1.0f, 1.0f, 1.0f, true);
                if (v != null) {
                    v.setBackgroundHeight(C4896n.m24475h());
                }
            } else if (h <= 0.0f) {
                this.f29888c = 0.0f;
                this.f29886a.mo8402i0(0.0f, 0.0f, 0.0f, true);
                if (v != null) {
                    v.setBackgroundHeight(C4896n.m24478e());
                }
            } else {
                this.f29888c = h;
                this.f29886a.mo8402i0(h, h, h, true);
                if (v != null) {
                    v.setBackgroundHeight(C4896n.m24478e() + ((int) (C4896n.m24475h() * h)));
                }
            }
            C9290s0 s0Var = this.f29887b;
            if (s0Var != null) {
                s0Var.m9619j(this.f29888c, 0.0f, true);
            }
        }
    }

    public void setFactorLocked(boolean z) {
        this.f29885M = z;
    }

    public void setFloatingButton(C9290s0 s0Var) {
        this.f29887b = s0Var;
    }

    public void setHeaderView(C9239m mVar) {
        this.f29886a = mVar;
    }
}