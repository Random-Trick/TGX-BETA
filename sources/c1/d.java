package c1;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

public final class d {
    public final a f4239a;

    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    public static class b implements a {
        public final GestureDetector f4240a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f4240a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override
        public boolean a(MotionEvent motionEvent) {
            return this.f4240a.onTouchEvent(motionEvent);
        }
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f4239a.a(motionEvent);
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f4239a = new b(context, onGestureListener, handler);
    }
}
