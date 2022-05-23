package ud;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import me.vkryl.android.widget.FrameLayoutFix;

public class p extends FrameLayoutFix {
    public int M;

    public p(Context context) {
        super(context);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public int getClipLeft() {
        return this.M;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setClipLeft(int i10) {
        int i11 = this.M;
        if (i11 == i10) {
            return;
        }
        if (i10 < i11) {
            this.M = i10;
            invalidate();
            return;
        }
        this.M = i10;
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
    }
}
