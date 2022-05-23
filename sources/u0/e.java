package u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public class e extends d {
    public static Method Q;

    public e(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.O;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void g() {
        if (Q == null) {
            try {
                Q = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override
    public Rect getDirtyBounds() {
        return this.O.getDirtyBounds();
    }

    @Override
    public void getOutline(Outline outline) {
        this.O.getOutline(outline);
    }

    @Override
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.O;
        if (!(drawable == null || (method = Q) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    @Override
    public void setHotspot(float f10, float f11) {
        this.O.setHotspot(f10, f11);
    }

    @Override
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.O.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override
    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.O.setTint(i10);
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.O.setTintList(colorStateList);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.O.setTintMode(mode);
        }
    }

    public e(f fVar, Resources resources) {
        super(fVar, resources);
        g();
    }
}
