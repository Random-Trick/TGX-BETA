package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import ld.c;
import ld.h;
import ld.p;
import ne.i;
import org.thunderdog.challegram.Log;

public class o extends i {
    public final c f25153k0 = new c(this, 0);
    public final p f25154l0 = new p(this, 0);

    public o(Context context) {
        super(context, null);
    }

    public void C0(h hVar, h hVar2, h hVar3) {
        this.f25153k0.j(hVar, hVar2);
        this.f25154l0.G(hVar3);
    }

    public void b() {
        this.f25153k0.b();
        this.f25154l0.b();
    }

    public void e() {
        this.f25153k0.e();
        this.f25154l0.e();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f25154l0.e0()) {
            if (this.f25153k0.e0()) {
                this.f25153k0.O(canvas);
            }
            this.f25153k0.draw(canvas);
        }
        this.f25154l0.draw(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.MeasureSpec.makeMeasureSpec(a0.i(118.0f), Log.TAG_TDLIB_OPTIONS));
        this.f25153k0.K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f25154l0.K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
