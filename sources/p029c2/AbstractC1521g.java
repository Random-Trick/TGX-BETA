package p029c2;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p280u0.AbstractC9412b;
import p280u0.C9411a;

public abstract class AbstractC1521g extends Drawable implements AbstractC9412b {
    public Drawable f5411a;

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8767a(drawable, theme);
        }
    }

    @Override
    public void clearColorFilter() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override
    public Drawable getCurrent() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override
    public int getMinimumHeight() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override
    public int[] getState() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override
    public Region getTransparentRegion() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override
    public void jumpToCurrentState() {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8760h(drawable);
        }
    }

    @Override
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    @Override
    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    @Override
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    @Override
    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8758j(drawable, f, f2);
        }
    }

    @Override
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            C9411a.m8757k(drawable, i, i2, i3, i4);
        }
    }

    @Override
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f5411a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
