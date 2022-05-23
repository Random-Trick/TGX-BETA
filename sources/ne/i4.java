package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import ce.y;
import ib.d;

public class i4 extends View {
    public int f18124a;
    public float f18125b;

    public i4(Context context) {
        super(context);
    }

    public void a(int i10, float f10) {
        if (this.f18124a != i10 || this.f18125b != f10) {
            this.f18124a = i10;
            this.f18125b = f10;
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i10 = a0.i(12.0f);
        int i11 = measuredHeight / 2;
        int i12 = (measuredWidth / 2) - ((this.f18124a / 2) * i10);
        for (int i13 = 0; i13 < this.f18124a; i13++) {
            float abs = 1.0f - Math.abs(this.f18125b - i13);
            if (abs > 1.0f || abs < 0.0f) {
                abs = 0.0f;
            }
            canvas.drawCircle(i12, i11, a0.i(2.0f), y.g(d.b((int) (((abs * 0.4f) + 0.6f) * 255.0f), 16777215)));
            i12 += i10;
        }
    }

    public void setPositionFactor(float f10) {
        if (this.f18125b != f10) {
            this.f18125b = f10;
            invalidate();
        }
    }
}
