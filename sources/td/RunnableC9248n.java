package td;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ge.C4896n;
import org.thunderdog.challegram.p211v.CustomRecyclerView;

public class RunnableC9248n extends CustomRecyclerView implements Runnable {
    public C9239m f29870F1;
    public AbstractC9323v4<?> f29871G1;
    public C9290s0 f29872H1;
    public float f29873I1 = 1.0f;
    public boolean f29874J1 = true;
    public int f29875K1;
    public int f29876L1;

    public class C9249a extends RecyclerView.AbstractC0910t {
        public C9249a() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            RunnableC9248n.this.f29875K1 += i2;
            if (RunnableC9248n.this.f29870F1 != null && !RunnableC9248n.this.f29874J1) {
                RunnableC9248n.this.m9796S1(true);
            }
        }
    }

    public RunnableC9248n(Context context, AbstractC9323v4<?> v4Var) {
        super(context);
        this.f29871G1 = v4Var;
        setHasFixedSize(true);
        setVerticalScrollBarEnabled(false);
        m39425k(new C9249a());
    }

    public void m9798Q1() {
        this.f29876L1 |= 1;
    }

    public void m9797R1(C9239m mVar, AbstractC9323v4<?> v4Var) {
        this.f29870F1 = mVar;
        this.f29871G1 = v4Var;
    }

    public final void m9796S1(boolean z) {
        View$OnClickListenerC9170d1 d1Var;
        if (!this.f29871G1.m9390Ma() || (this.f29876L1 & 2) != 0) {
            View C = getLayoutManager().mo39265C(0);
            float V9 = 1.0f - ((C == null ? this.f29871G1.mo9326V9() : -C.getTop()) / C4896n.m24478f(true));
            if (V9 >= 1.0f) {
                this.f29873I1 = 1.0f;
            } else if (V9 <= 0.0f) {
                this.f29873I1 = 0.0f;
            } else {
                this.f29873I1 = V9;
            }
            if ((this.f29876L1 & 2) == 0) {
                C9239m mVar = this.f29870F1;
                float f = this.f29873I1;
                mVar.mo8402i0(f, f, f, true);
                if (!(this.f29872H1 == null || this.f29871G1.mo9413J9() == 0)) {
                    this.f29872H1.m9618j(this.f29873I1, 0.0f, true);
                }
                if (z && (d1Var = this.f29871G1.f30159R) != null) {
                    float f2 = this.f29873I1;
                    if (f2 == 1.0f) {
                        d1Var.setBackgroundHeight(C4896n.m24482b(true));
                    } else if (f2 == 0.0f) {
                        d1Var.setBackgroundHeight(C4896n.m24479e());
                    } else {
                        d1Var.setBackgroundHeight(C4896n.m24479e() + ((int) (C4896n.m24478f(true) * this.f29873I1)));
                    }
                }
            }
        }
    }

    public float getScrollFactor() {
        if (getChildCount() == 0) {
            return 1.0f;
        }
        if (this.f29870F1 == null || this.f29874J1) {
            return this.f29873I1;
        }
        m9796S1(false);
        return this.f29873I1;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f29874J1) {
            int i5 = this.f29876L1;
            if ((i5 & 1) != 0) {
                this.f29876L1 = i5 & (-2);
                m9796S1(true);
            }
        }
    }

    @Override
    public void run() {
        m9796S1(true);
    }

    public void setFactorLocked(boolean z) {
        this.f29874J1 = z;
    }

    public void setFloatingButton(C9290s0 s0Var) {
        this.f29872H1 = s0Var;
    }
}
