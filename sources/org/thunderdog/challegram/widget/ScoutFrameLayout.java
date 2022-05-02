package org.thunderdog.challegram.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import me.AbstractC6828a;
import me.vkryl.android.widget.FrameLayoutFix;
import p139jb.AbstractC5911c;

public class ScoutFrameLayout extends FrameLayoutFix implements AbstractC6828a, AbstractC5911c {
    public ScoutFrameLayout(Context context) {
        super(context);
    }

    public static void m14044C1(View view, boolean z) {
        if (view != null) {
            if (view instanceof AbstractC6828a) {
                if (z) {
                    ((AbstractC6828a) view).mo8225f();
                } else {
                    ((AbstractC6828a) view).mo8229b();
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m14044C1(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static void m14043D1(View view) {
        if (view != null) {
            if (view instanceof AbstractC5911c) {
                ((AbstractC5911c) view).mo4501a3();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m14043D1(viewGroup.getChildAt(i));
                }
            }
        }
    }

    @Override
    public void mo4501a3() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m14043D1(getChildAt(i));
        }
    }

    @Override
    public void mo8229b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m14044C1(getChildAt(i), false);
        }
    }

    @Override
    public void mo8225f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m14044C1(getChildAt(i), true);
        }
    }

    public ScoutFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScoutFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
