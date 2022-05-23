package ne;

import android.content.Context;
import android.widget.TextView;

public class b2 extends TextView {
    public b2(Context context) {
        super(context);
    }

    @Override
    public boolean canScrollHorizontally(int i10) {
        return false;
    }

    @Override
    public boolean canScrollVertically(int i10) {
        return false;
    }
}
