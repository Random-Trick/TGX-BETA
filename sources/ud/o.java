package ud;

import android.content.Context;
import android.widget.ScrollView;
import ce.j0;
import he.n;

@Deprecated
public class o extends ScrollView {
    public m f24317a;
    public s0 f24318b;
    public float f24319c = 1.0f;
    public boolean M = true;

    public o(Context context) {
        super(context);
        setVerticalScrollBarEnabled(false);
    }

    public float getScrollFactor() {
        return this.f24319c;
    }

    @Override
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f24317a != null && !this.M) {
            float h10 = 1.0f - (i11 / n.h());
            d1 v10 = j0.v();
            if (h10 >= 1.0f) {
                this.f24319c = 1.0f;
                this.f24317a.k0(1.0f, 1.0f, 1.0f, true);
                if (v10 != null) {
                    v10.setBackgroundHeight(n.h());
                }
            } else if (h10 <= 0.0f) {
                this.f24319c = 0.0f;
                this.f24317a.k0(0.0f, 0.0f, 0.0f, true);
                if (v10 != null) {
                    v10.setBackgroundHeight(n.e());
                }
            } else {
                this.f24319c = h10;
                this.f24317a.k0(h10, h10, h10, true);
                if (v10 != null) {
                    v10.setBackgroundHeight(n.e() + ((int) (n.h() * h10)));
                }
            }
            s0 s0Var = this.f24318b;
            if (s0Var != null) {
                s0Var.j(this.f24319c, 0.0f, true);
            }
        }
    }

    public void setFactorLocked(boolean z10) {
        this.M = z10;
    }

    public void setFloatingButton(s0 s0Var) {
        this.f24318b = s0Var;
    }

    public void setHeaderView(m mVar) {
        this.f24317a = mVar;
    }
}
