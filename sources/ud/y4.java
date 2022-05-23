package ud;

import android.content.Context;
import android.widget.FrameLayout;
import he.n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class y4 extends g2 implements i2, y1 {
    public final b5 N;

    public y4(Context context) {
        super(context);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, n.c(), 48);
        r12.topMargin = n.e();
        b5 b5Var = new b5(context);
        this.N = b5Var;
        b5Var.setLayoutParams(r12);
        b5Var.Y1(R.id.theme_color_headerTabActive);
        b5Var.Z1(R.id.theme_color_headerTabInactiveText, R.id.theme_color_headerTabActiveText);
        addView(b5Var);
    }

    @Override
    public b5 getTopView() {
        return this.N;
    }

    @Override
    public void k0(float f10, float f11, float f12, boolean z10) {
        float c10 = f10 / (n.c() / n.f(false));
        this.N.setAlpha(c10 <= 0.25f ? 0.0f : (c10 - 0.25f) / 0.25f);
        this.N.setTranslationY((-n.c()) * (1.0f - c10));
    }

    @Override
    public void s() {
        this.N.s();
    }
}
