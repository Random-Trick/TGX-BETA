package p194nd;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import be.C1357a0;
import p082fd.C4403w;

public class GestureDetector$OnGestureListenerC7501t implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public GestureDetector f24017a;
    public C7401b0 f24018b;

    public GestureDetector$OnGestureListenerC7501t(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.f24017a = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
    }

    public boolean m15769a(MotionEvent motionEvent) {
        return this.f24017a.onTouchEvent(motionEvent);
    }

    public void m15768b(C7401b0 b0Var) {
        this.f24018b = b0Var;
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
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C7401b0 b0Var = this.f24018b;
        if (b0Var != null && !b0Var.m16529Y1()) {
            float j = C1357a0.m37543j(250.0f, 1.0f);
            float abs = Math.abs(j) / C1357a0.m37544i(500.0f);
            if (!C4403w.m27986G2() ? f >= j : f <= (-j)) {
                if (this.f24018b.m16530X1()) {
                    this.f24018b.m16533U1(1, abs);
                    return true;
                }
            }
            if (!C4403w.m27986G2() ? f <= (-j) : f >= j) {
                if (this.f24018b.m16531W1()) {
                    this.f24018b.m16533U1(2, abs);
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
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
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
