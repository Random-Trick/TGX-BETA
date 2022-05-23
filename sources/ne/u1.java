package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import ce.a0;
import ce.b;
import ce.y;
import kb.c;
import org.thunderdog.challegram.R;

public class u1 extends View implements c {
    public Drawable f18392a = ce.c.g(getResources(), R.drawable.baseline_location_on_48);
    public long f18393b;

    public u1(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(132.0f)));
    }

    @Override
    public void Q2() {
        if (this.f18392a != null) {
            this.f18392a = null;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f18392a != null) {
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            Drawable drawable = this.f18392a;
            ce.c.b(canvas, drawable, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f18392a.getMinimumHeight() / 2), y.W(-1));
            long B = b.B(canvas, measuredWidth, measuredHeight - a0.i(4.0f), -1, true, this.f18393b);
            if (B != -1) {
                this.f18393b = SystemClock.uptimeMillis() + B;
                postInvalidateDelayed(B);
            }
        }
    }
}
