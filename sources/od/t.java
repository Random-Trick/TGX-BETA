package od;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import ce.a0;
import gd.w;

public class t implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public GestureDetector f19848a;
    public b0 f19849b;

    public t(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.f19848a = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f19848a.onTouchEvent(motionEvent);
    }

    public void b(b0 b0Var) {
        this.f19849b = b0Var;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        b0 b0Var = this.f19849b;
        if (b0Var != null && !b0Var.X1()) {
            float j10 = a0.j(250.0f, 1.0f);
            float abs = Math.abs(j10) / a0.i(500.0f);
            if (!w.G2() ? f10 >= j10 : f10 <= (-j10)) {
                if (this.f19849b.W1()) {
                    this.f19849b.S1(1, abs);
                    return true;
                }
            }
            if (!w.G2() ? f10 <= (-j10) : f10 >= j10) {
                if (this.f19849b.V1()) {
                    this.f19849b.S1(2, abs);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
