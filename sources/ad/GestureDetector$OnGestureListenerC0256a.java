package ad;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureDetector$OnGestureListenerC0256a implements GestureDetector.OnGestureListener {
    public GestureDetector f778a;
    public AbstractC0257a f779b;

    public interface AbstractC0257a {
        boolean mo7205o7(float f, float f2);
    }

    public GestureDetector$OnGestureListenerC0256a(Context context, AbstractC0257a aVar) {
        this.f779b = aVar;
        this.f778a = new GestureDetector(context, this);
    }

    public boolean m41997a(MotionEvent motionEvent) {
        return this.f778a.onTouchEvent(motionEvent);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f779b.mo7205o7(f, f2);
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
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
