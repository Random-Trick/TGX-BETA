package me.vkryl.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import eb.c;
import java.util.ArrayList;
import org.thunderdog.challegram.Log;

public class FrameLayoutFix extends FrameLayout implements c {
    public final ArrayList<View> f17505a = new ArrayList<>();
    public boolean f17506b;
    public Runnable f17507c;

    public FrameLayoutFix(Context context) {
        super(context);
    }

    public static FrameLayout.LayoutParams q1(int i10, int i11) {
        return new FrameLayout.LayoutParams(i10, i11);
    }

    public static FrameLayout.LayoutParams r1(int i10, int i11, int i12) {
        return new FrameLayout.LayoutParams(i10, i11, i12);
    }

    public static FrameLayout.LayoutParams s1(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11, i12);
        layoutParams.leftMargin = i13;
        layoutParams.topMargin = i14;
        layoutParams.rightMargin = i15;
        layoutParams.bottomMargin = i16;
        return layoutParams;
    }

    public static FrameLayout.LayoutParams t1(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return v1((FrameLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return u1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return q1(layoutParams.width, layoutParams.height);
    }

    public static FrameLayout.LayoutParams u1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams.width, marginLayoutParams.height);
        layoutParams.leftMargin = marginLayoutParams.leftMargin;
        layoutParams.topMargin = marginLayoutParams.topMargin;
        layoutParams.rightMargin = marginLayoutParams.rightMargin;
        layoutParams.bottomMargin = marginLayoutParams.bottomMargin;
        return layoutParams;
    }

    public static FrameLayout.LayoutParams v1(FrameLayout.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, layoutParams.gravity);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        return layoutParams2;
    }

    public void S(View view, Runnable runnable) {
        this.f17507c = runnable;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } catch (NullPointerException e10) {
            e10.printStackTrace();
        }
        Runnable runnable = this.f17507c;
        if (runnable != null) {
            runnable.run();
            this.f17507c = null;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int childCount = getChildCount();
        boolean z10 = (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) ? false : true;
        this.f17505a.clear();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt != null && (this.f17506b || childAt.getVisibility() != 8)) {
                measureChildWithMargins(childAt, i10, 0, i11, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i16 = Math.max(i16, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                i15 = Math.max(i15, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                i14 = FrameLayout.combineMeasuredStates(i14, childAt.getMeasuredState());
                if (z10 && (layoutParams.width == -1 || layoutParams.height == -1)) {
                    this.f17505a.add(childAt);
                }
            }
        }
        int i18 = i14;
        int i19 = i15;
        int i20 = -1;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i21 = paddingLeft + paddingRight;
        int i22 = paddingTop + paddingBottom;
        int max = Math.max(i19 + i22, getSuggestedMinimumHeight());
        int max2 = Math.max(i16 + i21, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        setMeasuredDimension(FrameLayout.resolveSizeAndState(max2, i10, i18), FrameLayout.resolveSizeAndState(max, i11, i18 << 16));
        int size = this.f17505a.size();
        if (size > 1) {
            int i23 = 0;
            while (i23 < size) {
                View view = this.f17505a.get(i23);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i24 = marginLayoutParams.width;
                if (i24 == i20) {
                    i12 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - paddingLeft) - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), Log.TAG_TDLIB_OPTIONS);
                } else {
                    i12 = FrameLayout.getChildMeasureSpec(i10, marginLayoutParams.leftMargin + i21 + marginLayoutParams.rightMargin, i24);
                }
                int i25 = marginLayoutParams.height;
                if (i25 == -1) {
                    i13 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - paddingTop) - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), Log.TAG_TDLIB_OPTIONS);
                } else {
                    i13 = FrameLayout.getChildMeasureSpec(i11, marginLayoutParams.topMargin + i22 + marginLayoutParams.bottomMargin, i25);
                }
                view.measure(i12, i13);
                i23++;
                i20 = -1;
            }
        }
    }

    @Override
    public void setMeasureAllChildren(boolean z10) {
        super.setMeasureAllChildren(z10);
        this.f17506b = z10;
    }

    public FrameLayoutFix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FrameLayoutFix(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
