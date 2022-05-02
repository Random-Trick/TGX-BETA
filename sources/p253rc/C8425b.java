package p253rc;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.RelativeLayout;
import org.thunderdog.challegram.R;
import p053dd.C4007j;

public class C8425b extends RelativeLayout implements C4007j.AbstractC4011d {
    public C4007j f27337a = new C4007j(this, R.drawable.baseline_remove_circle_24);

    public C8425b(Context context) {
        super(context);
    }

    @Override
    public void mo5812V0() {
        this.f27337a.m29342c();
    }

    @Override
    public void draw(Canvas canvas) {
        this.f27337a.m29340e(canvas);
        super.draw(canvas);
        this.f27337a.m29341d(canvas);
        this.f27337a.m29343b(canvas);
    }

    @Override
    public void setRemoveDx(float f) {
        this.f27337a.m29339f(f);
    }
}
