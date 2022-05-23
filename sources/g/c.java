package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import u0.a;

public class c extends Drawable implements Drawable.Callback {
    public Drawable f12011a;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f12011a;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f12011a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f12011a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        this.f12011a.draw(canvas);
    }

    @Override
    public int getChangingConfigurations() {
        return this.f12011a.getChangingConfigurations();
    }

    @Override
    public Drawable getCurrent() {
        return this.f12011a.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.f12011a.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.f12011a.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        return this.f12011a.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return this.f12011a.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.f12011a.getOpacity();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return this.f12011a.getPadding(rect);
    }

    @Override
    public int[] getState() {
        return this.f12011a.getState();
    }

    @Override
    public Region getTransparentRegion() {
        return this.f12011a.getTransparentRegion();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isAutoMirrored() {
        return a.g(this.f12011a);
    }

    @Override
    public boolean isStateful() {
        return this.f12011a.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        a.h(this.f12011a);
    }

    @Override
    public void onBoundsChange(Rect rect) {
        this.f12011a.setBounds(rect);
    }

    @Override
    public boolean onLevelChange(int i10) {
        return this.f12011a.setLevel(i10);
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public void setAlpha(int i10) {
        this.f12011a.setAlpha(i10);
    }

    @Override
    public void setAutoMirrored(boolean z10) {
        a.i(this.f12011a, z10);
    }

    @Override
    public void setChangingConfigurations(int i10) {
        this.f12011a.setChangingConfigurations(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12011a.setColorFilter(colorFilter);
    }

    @Override
    public void setDither(boolean z10) {
        this.f12011a.setDither(z10);
    }

    @Override
    public void setFilterBitmap(boolean z10) {
        this.f12011a.setFilterBitmap(z10);
    }

    @Override
    public void setHotspot(float f10, float f11) {
        a.j(this.f12011a, f10, f11);
    }

    @Override
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        a.k(this.f12011a, i10, i11, i12, i13);
    }

    @Override
    public boolean setState(int[] iArr) {
        return this.f12011a.setState(iArr);
    }

    @Override
    public void setTint(int i10) {
        a.m(this.f12011a, i10);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        a.n(this.f12011a, colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        a.o(this.f12011a, mode);
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f12011a.setVisible(z10, z11);
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
