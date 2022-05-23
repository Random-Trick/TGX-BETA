package ud;

import android.content.Context;
import android.view.MotionEvent;
import me.vkryl.android.widget.FrameLayoutFix;

public class t extends FrameLayoutFix {
    public t(Context context) {
        super(context);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || motionEvent.getAction() == 0;
    }
}
