package me.vkryl.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.thunderdog.challegram.Log;
import p051db.AbstractC3937c;

public class FrameLayoutFix extends FrameLayout implements AbstractC3937c {
    public final ArrayList<View> f22367a = new ArrayList<>();
    public boolean f22368b;
    public Runnable f22369c;

    public FrameLayoutFix(Context context) {
        super(context);
    }

    public static FrameLayout.LayoutParams m18009A1(FrameLayout.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, layoutParams.gravity);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        return layoutParams2;
    }

    public static FrameLayout.LayoutParams m18008s1(int i, int i2) {
        return new FrameLayout.LayoutParams(i, i2);
    }

    public static FrameLayout.LayoutParams m18007t1(int i, int i2, int i3) {
        return new FrameLayout.LayoutParams(i, i2, i3);
    }

    public static FrameLayout.LayoutParams m18006u1(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2, i3);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        layoutParams.rightMargin = i6;
        layoutParams.bottomMargin = i7;
        return layoutParams;
    }

    public static FrameLayout.LayoutParams m18005v1(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return m18009A1((FrameLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return m18004z1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return m18008s1(layoutParams.width, layoutParams.height);
    }

    public static FrameLayout.LayoutParams m18004z1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
        layoutParams.leftMargin = marginLayoutParams.leftMargin;
        layoutParams.topMargin = marginLayoutParams.topMargin;
        layoutParams.rightMargin = marginLayoutParams.rightMargin;
        layoutParams.bottomMargin = marginLayoutParams.bottomMargin;
        return layoutParams;
    }

    public void mo8061R(View view, Runnable runnable) {
        this.f22369c = runnable;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        Runnable runnable = this.f22369c;
        if (runnable != null) {
            runnable.run();
            this.f22369c = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int childCount = getChildCount();
        boolean z = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        this.f22367a.clear();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != null && (this.f22368b || childAt.getVisibility() != 8)) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = Math.max(i7, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                i6 = Math.max(i6, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                i5 = FrameLayout.combineMeasuredStates(i5, childAt.getMeasuredState());
                if (z && (layoutParams.width == -1 || layoutParams.height == -1)) {
                    this.f22367a.add(childAt);
                }
            }
        }
        int i9 = i5;
        int i10 = i6;
        int i11 = -1;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i12 = paddingLeft + paddingRight;
        int i13 = paddingTop + paddingBottom;
        int max = Math.max(i10 + i13, getSuggestedMinimumHeight());
        int max2 = Math.max(i7 + i12, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        setMeasuredDimension(FrameLayout.resolveSizeAndState(max2, i, i9), FrameLayout.resolveSizeAndState(max, i2, i9 << 16));
        int size = this.f22367a.size();
        if (size > 1) {
            int i14 = 0;
            while (i14 < size) {
                View view = this.f22367a.get(i14);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i15 = marginLayoutParams.width;
                if (i15 == i11) {
                    i3 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - paddingLeft) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), Log.TAG_TDLIB_OPTIONS);
                } else {
                    i3 = FrameLayout.getChildMeasureSpec(i, marginLayoutParams.leftMargin + i12 + marginLayoutParams.rightMargin, i15);
                }
                int i16 = marginLayoutParams.height;
                if (i16 == -1) {
                    i4 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - paddingTop) - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), Log.TAG_TDLIB_OPTIONS);
                } else {
                    i4 = FrameLayout.getChildMeasureSpec(i2, marginLayoutParams.topMargin + i13 + marginLayoutParams.bottomMargin, i16);
                }
                view.measure(i3, i4);
                i14++;
                i11 = -1;
            }
        }
    }

    @Override
    public void setMeasureAllChildren(boolean z) {
        super.setMeasureAllChildren(z);
        this.f22368b = z;
    }

    public FrameLayoutFix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FrameLayoutFix(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
