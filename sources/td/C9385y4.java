package td;

import android.content.Context;
import android.widget.FrameLayout;
import ge.C4896n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class C9385y4 extends C9196g2 implements AbstractC9208i2, AbstractC9382y1 {
    public final View$OnClickListenerC9156b5 f30425N;

    public C9385y4(Context context) {
        super(context);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C4896n.m24480c(), 48);
        t1.topMargin = C4896n.m24478e();
        View$OnClickListenerC9156b5 b5Var = new View$OnClickListenerC9156b5(context);
        this.f30425N = b5Var;
        b5Var.setLayoutParams(t1);
        b5Var.m10153Z1(R.id.theme_color_headerTabActive);
        b5Var.m10152a2(R.id.theme_color_headerTabInactiveText, R.id.theme_color_headerTabActiveText);
        addView(b5Var);
    }

    @Override
    public View$OnClickListenerC9156b5 getTopView() {
        return this.f30425N;
    }

    @Override
    public void mo8402i0(float f, float f2, float f3, boolean z) {
        float c = f / (C4896n.m24480c() / C4896n.m24477f(false));
        this.f30425N.setAlpha(c <= 0.25f ? 0.0f : (c - 0.25f) / 0.25f);
        this.f30425N.setTranslationY((-C4896n.m24480c()) * (1.0f - c));
    }

    @Override
    public void mo8255s() {
        this.f30425N.mo8255s();
    }
}
