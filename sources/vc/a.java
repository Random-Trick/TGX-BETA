package vc;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ce.p0;

public class a extends LinearLayout {
    public a(Context context) {
        super(context);
    }

    public void a() {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i14 = layoutParams.width;
            if (i12 == 0) {
                i12 = layoutParams.height;
            }
            i10 += i14;
            if (childAt.getVisibility() == 0) {
                i11 += i14;
            }
        }
        setPivotX(i10 - ((int) (i11 * 0.5f)));
        setPivotY((int) (i12 * 0.5f));
    }

    public int getVisibleChildrenWidth() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0) {
                i10 += childAt.getLayoutParams().width;
            }
        }
        return i10;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && !p0.z(this)) || super.onInterceptTouchEvent(motionEvent);
    }
}
