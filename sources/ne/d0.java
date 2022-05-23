package ne;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;
import me.vkryl.android.widget.FrameLayoutFix;

public class d0 extends FrameLayoutFix {
    public int P;
    public int Q;
    public boolean O = true;
    public final Paint N = null;
    public final Path M = null;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            int measuredWidth = view.getMeasuredWidth();
            outline.setRoundRect(0, 0, measuredWidth, view.getMeasuredHeight(), measuredWidth / 2);
            outline.setAlpha(d0.this.O ? 0.0f : 1.0f);
        }
    }

    public d0(Context context) {
        super(context);
        setOutlineProvider(new a());
        setClipToOutline(true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.P != measuredWidth || this.Q != measuredHeight) {
            this.P = measuredWidth;
            this.Q = measuredHeight;
            invalidateOutline();
        }
    }

    public void setTransparentOutline(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            invalidateOutline();
        }
    }
}
