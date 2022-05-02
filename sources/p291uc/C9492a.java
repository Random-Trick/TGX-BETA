package p291uc;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import be.C1399s0;

public class C9492a extends LinearLayout {
    public C9492a(Context context) {
        super(context);
    }

    public void m8496a() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i5 = layoutParams.width;
            if (i3 == 0) {
                i3 = layoutParams.height;
            }
            i += i5;
            if (childAt.getVisibility() == 0) {
                i2 += i5;
            }
        }
        setPivotX(i - ((int) (i2 * 0.5f)));
        setPivotY((int) (i3 * 0.5f));
    }

    public int getVisibleChildrenWidth() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                i += childAt.getLayoutParams().width;
            }
        }
        return i;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && !C1399s0.m37221C(this)) || super.onInterceptTouchEvent(motionEvent);
    }
}
