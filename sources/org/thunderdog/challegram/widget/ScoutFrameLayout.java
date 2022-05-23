package org.thunderdog.challegram.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.a;

public class ScoutFrameLayout extends FrameLayoutFix implements a, c {
    public ScoutFrameLayout(Context context) {
        super(context);
    }

    public static void A1(View view) {
        if (view != null) {
            if (view instanceof c) {
                ((c) view).Q2();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    A1(viewGroup.getChildAt(i10));
                }
            }
        }
    }

    public static void z1(View view, boolean z10) {
        if (view != null) {
            if (view instanceof a) {
                if (z10) {
                    ((a) view).e();
                } else {
                    ((a) view).b();
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    z1(viewGroup.getChildAt(i10), z10);
                }
            }
        }
    }

    @Override
    public void Q2() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            A1(getChildAt(i10));
        }
    }

    @Override
    public void b() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            z1(getChildAt(i10), false);
        }
    }

    @Override
    public void e() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            z1(getChildAt(i10), true);
        }
    }

    public ScoutFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScoutFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
