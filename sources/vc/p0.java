package vc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import hd.s4;
import org.thunderdog.challegram.Log;

public class p0 extends View {
    public g1 f25164a;
    public s4 f25165b;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setEmpty();
        }
    }

    public p0(Context context) {
        super(context);
        setOutlineProvider(new a());
    }

    public p0 a(g1 g1Var) {
        this.f25164a = g1Var;
        return this;
    }

    @Override
    public void onDraw(Canvas canvas) {
        g1 g1Var;
        s4 s4Var = this.f25165b;
        if (s4Var != null && (g1Var = this.f25164a) != null) {
            s4Var.h1(g1Var, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (getParent() instanceof h1) {
            super.onMeasure(i10, i11);
            return;
        }
        s4 s4Var = this.f25165b;
        if (s4Var != null) {
            s4Var.h0(getMeasuredWidth());
        }
        s4 s4Var2 = this.f25165b;
        setMeasuredDimension(i10, View.MeasureSpec.makeMeasureSpec(s4Var2 != null ? s4Var2.G3() : 0, Log.TAG_TDLIB_OPTIONS));
    }

    public void setMessage(s4 s4Var) {
        s4 s4Var2 = this.f25165b;
        if (s4Var2 != s4Var) {
            if (s4Var2 != null) {
                s4Var2.K7(this);
            }
            this.f25165b = s4Var;
            if (s4Var != null) {
                s4Var.E7(this);
            }
            invalidate();
        }
    }
}
