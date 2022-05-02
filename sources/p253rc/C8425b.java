package p253rc;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.RelativeLayout;
import org.thunderdog.challegram.R;
import p053dd.C4007j;

public class C8425b extends RelativeLayout implements C4007j.AbstractC4011d {
    public C4007j f27334a = new C4007j(this, R.drawable.baseline_remove_circle_24);

    public C8425b(Context context) {
        super(context);
    }

    @Override
    public void mo5812V0() {
        this.f27334a.m29340c();
    }

    @Override
    public void draw(Canvas canvas) {
        this.f27334a.m29338e(canvas);
        super.draw(canvas);
        this.f27334a.m29339d(canvas);
        this.f27334a.m29341b(canvas);
    }

    @Override
    public void setRemoveDx(float f) {
        this.f27334a.m29337f(f);
    }
}
