package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1357a0;
import me.View$OnClickListenerC6902i;
import org.thunderdog.challegram.Log;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6257p;

public class C9628p extends View$OnClickListenerC6902i {
    public final C6240c f31228k0 = new C6240c(this, 0);
    public final C6257p f31229l0 = new C6257p(this, 0);

    public C9628p(Context context) {
        super(context, null);
    }

    public void m7960B0(C6246h hVar, C6246h hVar2, C6246h hVar3) {
        this.f31228k0.m20977j(hVar, hVar2);
        this.f31229l0.m20819G(hVar3);
    }

    public void m7959b() {
        this.f31228k0.mo20247b();
        this.f31229l0.mo20247b();
    }

    public void m7958f() {
        this.f31228k0.mo20245f();
        this.f31229l0.mo20245f();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f31229l0.mo20246c0()) {
            if (this.f31228k0.mo20246c0()) {
                this.f31228k0.mo20255N(canvas);
            }
            this.f31228k0.draw(canvas);
        }
        this.f31229l0.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.MeasureSpec.makeMeasureSpec(C1357a0.m37541i(118.0f), Log.TAG_TDLIB_OPTIONS));
        this.f31228k0.mo20256K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f31229l0.mo20256K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}