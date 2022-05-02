package sc;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class C8817p extends RecyclerView {
    public boolean f28468u1;

    public C8817p(Context context) {
        super(context);
    }

    public void m11268G1(MotionEvent motionEvent) {
        if (this.f28468u1) {
            dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f28468u1 = true;
        } else if (action == 1) {
            this.f28468u1 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f28468u1 = true;
        } else if (action == 1) {
            this.f28468u1 = false;
        }
        return motionEvent.getAction() != 3 && super.onTouchEvent(motionEvent);
    }
}
