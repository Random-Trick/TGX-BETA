package p291uc;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import be.C1357a0;
import td.C9357x2;

public class C9585k0 extends ImageView implements C9357x2.AbstractC9363f {
    public C9585k0(Context context) {
        super(context);
    }

    public boolean m8100a() {
        return getVisibility() == 0;
    }

    public boolean m8099c(boolean z) {
        int i = 0;
        if ((getVisibility() == 0) == z) {
            return false;
        }
        if (!z) {
            i = 4;
        }
        setVisibility(i);
        return true;
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        rect.top += C1357a0.m37541i(8.0f);
        rect.bottom -= C1357a0.m37541i(8.0f);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getVisibility() == 0 && super.onTouchEvent(motionEvent);
    }
}
