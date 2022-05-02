package p028c1;

import android.view.MotionEvent;

public final class C1476l {
    @Deprecated
    public static int m36812a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int m36811b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int m36810c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static int m36809d(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float m36808e(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    public static float m36807f(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    public static boolean m36806g(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
