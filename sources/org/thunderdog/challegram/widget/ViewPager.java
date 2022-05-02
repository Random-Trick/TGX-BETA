package org.thunderdog.challegram.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.reflect.Field;
import org.thunderdog.challegram.Log;

public class ViewPager extends androidx.viewpager.widget.ViewPager {
    public boolean f25814U0;
    public Field f25815V0;
    public boolean f25816W0 = true;

    public ViewPager(Context context) {
        super(context);
    }

    public boolean m14040T() {
        return this.f25816W0;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25814U0) {
            try {
                if (this.f25815V0 == null) {
                    Field declaredField = androidx.viewpager.widget.ViewPager.class.getDeclaredField("C0");
                    this.f25815V0 = declaredField;
                    declaredField.setAccessible(true);
                }
                this.f25815V0.set(this, Boolean.FALSE);
            } catch (Throwable th) {
                Log.m14708w(th);
            }
        } else {
            this.f25814U0 = true;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f25816W0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f25816W0 && super.onTouchEvent(motionEvent);
    }

    public void setPagingEnabled(boolean z) {
        this.f25816W0 = z;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
