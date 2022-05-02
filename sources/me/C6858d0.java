package me;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import me.vkryl.android.widget.FrameLayoutFix;

public class C6858d0 extends FrameLayoutFix {
    public final Path f21546M;
    public final Paint f21547N;
    public boolean f21548O = true;
    public int f21549P;
    public int f21550Q;

    public class C6859a extends ViewOutlineProvider {
        public C6859a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            int measuredWidth = view.getMeasuredWidth();
            outline.setRoundRect(0, 0, measuredWidth, view.getMeasuredHeight(), measuredWidth / 2);
            outline.setAlpha(C6858d0.this.f21548O ? 0.0f : 1.0f);
        }
    }

    public C6858d0(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f21547N = null;
            this.f21546M = null;
            setOutlineProvider(new C6859a());
            setClipToOutline(true);
            return;
        }
        Paint paint = new Paint(1);
        this.f21547N = paint;
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(2, null);
        this.f21546M = new Path();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f21546M, this.f21547N);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f21549P != measuredWidth || this.f21550Q != measuredHeight) {
            this.f21549P = measuredWidth;
            this.f21550Q = measuredHeight;
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
                return;
            }
            this.f21546M.reset();
            Path path = this.f21546M;
            int i3 = this.f21549P;
            path.addCircle(i3 / 2, this.f21550Q / 2, i3 / 2, Path.Direction.CW);
            this.f21546M.toggleInverseFillType();
        }
    }

    public void setTransparentOutline(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && this.f21548O != z) {
            this.f21548O = z;
            invalidateOutline();
        }
    }
}
