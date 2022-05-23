package td;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import sd.f;

public class f extends View implements f.a {
    public sd.f f23428a;

    public f(Context context) {
        super(context);
    }

    @Override
    public void a(sd.f fVar) {
        if (this.f23428a == fVar) {
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        sd.f fVar = this.f23428a;
        if (fVar != null) {
            fVar.g(canvas, 0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setPaintState(sd.f fVar) {
        sd.f fVar2 = this.f23428a;
        if (fVar2 != null) {
            fVar2.t(this);
        }
        this.f23428a = fVar;
        if (fVar != null) {
            fVar.c(this);
        }
        invalidate();
    }
}
