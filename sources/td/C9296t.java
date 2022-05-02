package td;

import android.content.Context;
import android.view.MotionEvent;
import me.vkryl.android.widget.FrameLayoutFix;

public class C9296t extends FrameLayoutFix {
    public C9296t(Context context) {
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
