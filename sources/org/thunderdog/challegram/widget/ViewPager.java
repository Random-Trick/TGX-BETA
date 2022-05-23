package org.thunderdog.challegram.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.reflect.Field;
import org.thunderdog.challegram.Log;

public class ViewPager extends androidx.viewpager.widget.ViewPager {
    public boolean U0;
    public Field V0;
    public boolean W0 = true;

    public ViewPager(Context context) {
        super(context);
    }

    public boolean T() {
        return this.W0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.U0) {
            try {
                if (this.V0 == null) {
                    Field declaredField = androidx.viewpager.widget.ViewPager.class.getDeclaredField("C0");
                    this.V0 = declaredField;
                    declaredField.setAccessible(true);
                }
                this.V0.set(this, Boolean.FALSE);
            } catch (Throwable th) {
                Log.w(th);
            }
        } else {
            this.U0 = true;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.W0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.W0 && super.onTouchEvent(motionEvent);
    }

    public void setPagingEnabled(boolean z10) {
        this.W0 = z10;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
