package p084g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p280u0.C9411a;

public class C4436c extends Drawable implements Drawable.Callback {
    public Drawable f14692a;

    public C4436c(Drawable drawable) {
        m27678b(drawable);
    }

    public Drawable m27679a() {
        return this.f14692a;
    }

    public void m27678b(Drawable drawable) {
        Drawable drawable2 = this.f14692a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14692a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        this.f14692a.draw(canvas);
    }

    @Override
    public int getChangingConfigurations() {
        return this.f14692a.getChangingConfigurations();
    }

    @Override
    public Drawable getCurrent() {
        return this.f14692a.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.f14692a.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.f14692a.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        return this.f14692a.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return this.f14692a.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.f14692a.getOpacity();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return this.f14692a.getPadding(rect);
    }

    @Override
    public int[] getState() {
        return this.f14692a.getState();
    }

    @Override
    public Region getTransparentRegion() {
        return this.f14692a.getTransparentRegion();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isAutoMirrored() {
        return C9411a.m8761g(this.f14692a);
    }

    @Override
    public boolean isStateful() {
        return this.f14692a.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        C9411a.m8760h(this.f14692a);
    }

    @Override
    public void onBoundsChange(Rect rect) {
        this.f14692a.setBounds(rect);
    }

    @Override
    public boolean onLevelChange(int i) {
        return this.f14692a.setLevel(i);
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public void setAlpha(int i) {
        this.f14692a.setAlpha(i);
    }

    @Override
    public void setAutoMirrored(boolean z) {
        C9411a.m8759i(this.f14692a, z);
    }

    @Override
    public void setChangingConfigurations(int i) {
        this.f14692a.setChangingConfigurations(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14692a.setColorFilter(colorFilter);
    }

    @Override
    public void setDither(boolean z) {
        this.f14692a.setDither(z);
    }

    @Override
    public void setFilterBitmap(boolean z) {
        this.f14692a.setFilterBitmap(z);
    }

    @Override
    public void setHotspot(float f, float f2) {
        C9411a.m8758j(this.f14692a, f, f2);
    }

    @Override
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C9411a.m8757k(this.f14692a, i, i2, i3, i4);
    }

    @Override
    public boolean setState(int[] iArr) {
        return this.f14692a.setState(iArr);
    }

    @Override
    public void setTint(int i) {
        C9411a.m8755m(this.f14692a, i);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        C9411a.m8754n(this.f14692a, colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        C9411a.m8753o(this.f14692a, mode);
    }

    @Override
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f14692a.setVisible(z, z2);
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
