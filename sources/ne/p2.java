package ne;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import me.vkryl.android.widget.FrameLayoutFix;

public class p2 extends FrameLayoutFix {
    public int M;
    public int N;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, p2.this.M, view.getMeasuredWidth(), view.getMeasuredHeight() - p2.this.N);
        }
    }

    public p2(Context context) {
        super(context);
        setOutlineProvider(new a());
        setClipToOutline(true);
    }

    public final void B1() {
        invalidateOutline();
    }

    public void C1(int i10, int i11) {
        if (this.M != i10 || this.N != i11) {
            this.M = i10;
            this.N = i11;
            B1();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B1();
    }
}
