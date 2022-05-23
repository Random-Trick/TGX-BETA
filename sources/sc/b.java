package sc;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.RelativeLayout;
import ed.j;
import org.thunderdog.challegram.R;

public class b extends RelativeLayout implements j.d {
    public j f22704a = new j(this, R.drawable.baseline_remove_circle_24);

    public b(Context context) {
        super(context);
    }

    @Override
    public void U0() {
        this.f22704a.c();
    }

    @Override
    public void draw(Canvas canvas) {
        this.f22704a.e(canvas);
        super.draw(canvas);
        this.f22704a.d(canvas);
        this.f22704a.b(canvas);
    }

    @Override
    public void setRemoveDx(float f10) {
        this.f22704a.f(f10);
    }
}
