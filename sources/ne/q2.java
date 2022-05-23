package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.y;
import ib.d;
import org.thunderdog.challegram.R;

public class q2 extends View {
    public int f18343a = R.id.theme_color_filling;
    public float f18344b;

    public q2(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f18344b > 0.0f) {
            int L = j.L(this.f18343a);
            canvas.drawColor(d.a(this.f18344b, L));
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, ((float) Math.sqrt((f10 * f10) + (f11 * f11))) * 0.5f * this.f18344b, y.g(L));
        }
    }

    public void setRevealFactor(float f10) {
        if (this.f18344b != f10) {
            this.f18344b = f10;
            invalidate();
        }
    }
}
