package p028c1;

import android.view.MotionEvent;

public final class C1476l {
    @Deprecated
    public static int m36809a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int m36808b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int m36807c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static int m36806d(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float m36805e(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    public static float m36804f(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    public static boolean m36803g(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
