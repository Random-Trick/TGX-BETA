package vc;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import ce.a0;
import ud.x2;

public class j0 extends ImageView implements x2.f {
    public j0(Context context) {
        super(context);
    }

    public boolean a() {
        return getVisibility() == 0;
    }

    public boolean c(boolean z10) {
        int i10 = 0;
        if ((getVisibility() == 0) == z10) {
            return false;
        }
        if (!z10) {
            i10 = 4;
        }
        setVisibility(i10);
        return true;
    }

    @Override
    public void d1(View view, Rect rect) {
        rect.top += a0.i(8.0f);
        rect.bottom -= a0.i(8.0f);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getVisibility() == 0 && super.onTouchEvent(motionEvent);
    }
}
