package p291uc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import gd.AbstractC4761s4;
import org.thunderdog.challegram.Log;

public class C9634q0 extends View {
    public C9552h1 f31243a;
    public AbstractC4761s4 f31244b;

    public class C9635a extends ViewOutlineProvider {
        public C9635a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setEmpty();
        }
    }

    public C9634q0(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C9635a());
        }
    }

    public C9634q0 m7952a(C9552h1 h1Var) {
        this.f31243a = h1Var;
        return this;
    }

    @Override
    public void onDraw(Canvas canvas) {
        C9552h1 h1Var;
        AbstractC4761s4 s4Var = this.f31244b;
        if (s4Var != null && (h1Var = this.f31243a) != null) {
            s4Var.m25913i1(h1Var, canvas);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (getParent() instanceof C9565i1) {
            super.onMeasure(i, i2);
            return;
        }
        AbstractC4761s4 s4Var = this.f31244b;
        if (s4Var != null) {
            s4Var.m25934g0(getMeasuredWidth());
        }
        AbstractC4761s4 s4Var2 = this.f31244b;
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(s4Var2 != null ? s4Var2.mo25354J3() : 0, Log.TAG_TDLIB_OPTIONS));
    }

    public void setMessage(AbstractC4761s4 s4Var) {
        AbstractC4761s4 s4Var2 = this.f31244b;
        if (s4Var2 != s4Var) {
            if (s4Var2 != null) {
                s4Var2.m26141K7(this);
            }
            this.f31244b = s4Var;
            if (s4Var != null) {
                s4Var.m26202E7(this);
            }
            invalidate();
        }
    }
}