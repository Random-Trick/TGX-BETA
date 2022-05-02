package sd;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import p254rd.C8431f;

public class C8874f extends View implements C8431f.AbstractC8432a {
    public C8431f f28696a;

    public C8874f(Context context) {
        super(context);
    }

    @Override
    public void mo11043a(C8431f fVar) {
        if (this.f28696a == fVar) {
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        C8431f fVar = this.f28696a;
        if (fVar != null) {
            fVar.m12496g(canvas, 0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setPaintState(C8431f fVar) {
        C8431f fVar2 = this.f28696a;
        if (fVar2 != null) {
            fVar2.m12483t(this);
        }
        this.f28696a = fVar;
        if (fVar != null) {
            fVar.m12500c(this);
        }
        invalidate();
    }
}
