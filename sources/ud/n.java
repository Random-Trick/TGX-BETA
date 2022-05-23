package ud;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.thunderdog.challegram.v.CustomRecyclerView;

public class n extends CustomRecyclerView implements Runnable {
    public m E1;
    public v4<?> F1;
    public s0 G1;
    public float H1 = 1.0f;
    public boolean I1 = true;
    public int J1;
    public int K1;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            n.this.J1 += i11;
            if (n.this.E1 != null && !n.this.I1) {
                n.this.R1(true);
            }
        }
    }

    public n(Context context, v4<?> v4Var) {
        super(context);
        this.F1 = v4Var;
        setHasFixedSize(true);
        setVerticalScrollBarEnabled(false);
        k(new a());
    }

    public void P1() {
        this.K1 |= 1;
    }

    public void Q1(m mVar, v4<?> v4Var) {
        this.E1 = mVar;
        this.F1 = v4Var;
    }

    public final void R1(boolean z10) {
        d1 d1Var;
        if (!this.F1.Ma() || (this.K1 & 2) != 0) {
            View C = getLayoutManager().C(0);
            float V9 = 1.0f - ((C == null ? this.F1.V9() : -C.getTop()) / he.n.f(true));
            if (V9 >= 1.0f) {
                this.H1 = 1.0f;
            } else if (V9 <= 0.0f) {
                this.H1 = 0.0f;
            } else {
                this.H1 = V9;
            }
            if ((this.K1 & 2) == 0) {
                m mVar = this.E1;
                float f10 = this.H1;
                mVar.k0(f10, f10, f10, true);
                if (!(this.G1 == null || this.F1.J9() == 0)) {
                    this.G1.j(this.H1, 0.0f, true);
                }
                if (z10 && (d1Var = this.F1.R) != null) {
                    float f11 = this.H1;
                    if (f11 == 1.0f) {
                        d1Var.setBackgroundHeight(he.n.b(true));
                    } else if (f11 == 0.0f) {
                        d1Var.setBackgroundHeight(he.n.e());
                    } else {
                        d1Var.setBackgroundHeight(he.n.e() + ((int) (he.n.f(true) * this.H1)));
                    }
                }
            }
        }
    }

    public float getScrollFactor() {
        if (getChildCount() == 0) {
            return 1.0f;
        }
        if (this.E1 == null || this.I1) {
            return this.H1;
        }
        R1(false);
        return this.H1;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.I1) {
            int i14 = this.K1;
            if ((i14 & 1) != 0) {
                this.K1 = i14 & (-2);
                R1(true);
            }
        }
    }

    @Override
    public void run() {
        R1(true);
    }

    public void setFactorLocked(boolean z10) {
        this.I1 = z10;
    }

    public void setFloatingButton(s0 s0Var) {
        this.G1 = s0Var;
    }
}
