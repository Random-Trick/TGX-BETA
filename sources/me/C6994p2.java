package me;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import be.C1399s0;
import me.vkryl.android.widget.FrameLayoutFix;

public class C6994p2 extends FrameLayoutFix {
    public int f22182M;
    public int f22183N;

    public class C6995a extends ViewOutlineProvider {
        public C6995a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, C6994p2.this.f22182M, view.getMeasuredWidth(), view.getMeasuredHeight() - C6994p2.this.f22183N);
        }
    }

    public C6994p2(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C6995a());
            setClipToOutline(true);
        }
    }

    public final void m18136E1() {
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void m18135F1(int i, int i2) {
        if (this.f22182M != i || this.f22183N != i2) {
            this.f22182M = i;
            this.f22183N = i2;
            m18136E1();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        int V = C1399s0.m37199V(canvas);
        canvas.clipRect(0, this.f22182M, getMeasuredWidth(), getMeasuredHeight() - this.f22183N);
        super.dispatchDraw(canvas);
        C1399s0.m37201T(canvas, V);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m18136E1();
    }
}
