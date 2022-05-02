package p280u0;

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

public class C9415e extends C9414d {
    public static Method f30471Q;

    public C9415e(Drawable drawable) {
        super(drawable);
        m8744g();
    }

    @Override
    public boolean mo8745c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f30467O;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void m8744g() {
        if (f30471Q == null) {
            try {
                f30471Q = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override
    public Rect getDirtyBounds() {
        return this.f30467O.getDirtyBounds();
    }

    @Override
    public void getOutline(Outline outline) {
        this.f30467O.getOutline(outline);
    }

    @Override
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f30467O;
        if (!(drawable == null || (method = f30471Q) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override
    public void setHotspot(float f, float f2) {
        this.f30467O.setHotspot(f, f2);
    }

    @Override
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f30467O.setHotspotBounds(i, i2, i3, i4);
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
    public void setTint(int i) {
        if (mo8745c()) {
            super.setTint(i);
        } else {
            this.f30467O.setTint(i);
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        if (mo8745c()) {
            super.setTintList(colorStateList);
        } else {
            this.f30467O.setTintList(colorStateList);
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo8745c()) {
            super.setTintMode(mode);
        } else {
            this.f30467O.setTintMode(mode);
        }
    }

    public C9415e(C9416f fVar, Resources resources) {
        super(fVar, resources);
        m8744g();
    }
}
