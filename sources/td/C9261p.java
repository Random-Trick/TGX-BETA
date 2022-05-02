package td;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import me.vkryl.android.widget.FrameLayoutFix;

public class C9261p extends FrameLayoutFix {
    public int f29911M;

    public C9261p(Context context) {
        super(context);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public int getClipLeft() {
        return this.f29911M;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setClipLeft(int i) {
        int i2 = this.f29911M;
        if (i2 == i) {
            return;
        }
        if (i < i2) {
            this.f29911M = i;
            invalidate();
            return;
        }
        this.f29911M = i;
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }
}
