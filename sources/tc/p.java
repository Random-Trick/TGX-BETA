package tc;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class p extends RecyclerView {
    public boolean f23292t1;

    public p(Context context) {
        super(context);
    }

    public void F1(MotionEvent motionEvent) {
        if (this.f23292t1) {
            dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23292t1 = true;
        } else if (action == 1) {
            this.f23292t1 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23292t1 = true;
        } else if (action == 1) {
            this.f23292t1 = false;
        }
        return motionEvent.getAction() != 3 && super.onTouchEvent(motionEvent);
    }
}
