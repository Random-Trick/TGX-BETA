package bd;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class a implements GestureDetector.OnGestureListener {
    public GestureDetector f4108a;
    public AbstractC0060a f4109b;

    public interface AbstractC0060a {
        boolean n7(float f10, float f11);
    }

    public a(Context context, AbstractC0060a aVar) {
        this.f4109b = aVar;
        this.f4108a = new GestureDetector(context, this);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f4108a.onTouchEvent(motionEvent);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return this.f4109b.n7(f10, f11);
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
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
