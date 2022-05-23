package od;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class s extends RecyclerView {
    public s(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
