package td;

import android.content.Context;
import android.widget.ScrollView;
import be.C1379j0;
import ge.C4896n;

@Deprecated
public class C9255o extends ScrollView {
    public C9239m f29889a;
    public C9290s0 f29890b;
    public float f29891c = 1.0f;
    public boolean f29888M = true;

    public C9255o(Context context) {
        super(context);
        setVerticalScrollBarEnabled(false);
    }

    public float getScrollFactor() {
        return this.f29891c;
    }

    @Override
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f29889a != null && !this.f29888M) {
            float h = 1.0f - (i2 / C4896n.m24476h());
            View$OnClickListenerC9170d1 v = C1379j0.m37302v();
            if (h >= 1.0f) {
                this.f29891c = 1.0f;
                this.f29889a.mo8402i0(1.0f, 1.0f, 1.0f, true);
                if (v != null) {
                    v.setBackgroundHeight(C4896n.m24476h());
                }
            } else if (h <= 0.0f) {
                this.f29891c = 0.0f;
                this.f29889a.mo8402i0(0.0f, 0.0f, 0.0f, true);
                if (v != null) {
                    v.setBackgroundHeight(C4896n.m24479e());
                }
            } else {
                this.f29891c = h;
                this.f29889a.mo8402i0(h, h, h, true);
                if (v != null) {
                    v.setBackgroundHeight(C4896n.m24479e() + ((int) (C4896n.m24476h() * h)));
                }
            }
            C9290s0 s0Var = this.f29890b;
            if (s0Var != null) {
                s0Var.m9618j(this.f29891c, 0.0f, true);
            }
        }
    }

    public void setFactorLocked(boolean z) {
        this.f29888M = z;
    }

    public void setFloatingButton(C9290s0 s0Var) {
        this.f29890b = s0Var;
    }

    public void setHeaderView(C9239m mVar) {
        this.f29889a = mVar;
    }
}
