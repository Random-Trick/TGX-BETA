package u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode P = PorterDuff.Mode.SRC_IN;
    public f M;
    public boolean N;
    public Drawable O;
    public int f23457a;
    public PorterDuff.Mode f23458b;
    public boolean f23459c;

    public d(f fVar, Resources resources) {
        this.M = fVar;
        e(resources);
    }

    @Override
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.O;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.O = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.M;
            if (fVar != null) {
                fVar.f23461b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override
    public final Drawable b() {
        return this.O;
    }

    public boolean c() {
        throw null;
    }

    public final f d() {
        return new f(this.M);
    }

    @Override
    public void draw(Canvas canvas) {
        this.O.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.M;
        if (fVar != null && (constantState = fVar.f23461b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.M;
        ColorStateList colorStateList = fVar.f23462c;
        PorterDuff.Mode mode = fVar.f23463d;
        if (colorStateList == null || mode == null) {
            this.f23459c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f23459c && colorForState == this.f23457a && mode == this.f23458b)) {
                setColorFilter(colorForState, mode);
                this.f23457a = colorForState;
                this.f23458b = mode;
                this.f23459c = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.M;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.O.getChangingConfigurations();
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        f fVar = this.M;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.M.f23460a = getChangingConfigurations();
        return this.M;
    }

    @Override
    public Drawable getCurrent() {
        return this.O.getCurrent();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.O.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.O.getIntrinsicWidth();
    }

    @Override
    public int getLayoutDirection() {
        return a.e(this.O);
    }

    @Override
    public int getMinimumHeight() {
        return this.O.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        return this.O.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.O.getOpacity();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return this.O.getPadding(rect);
    }

    @Override
    public int[] getState() {
        return this.O.getState();
    }

    @Override
    public Region getTransparentRegion() {
        return this.O.getTransparentRegion();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isAutoMirrored() {
        return a.g(this.O);
    }

    @Override
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.M) == null) ? null : fVar.f23462c;
        return (colorStateList != null && colorStateList.isStateful()) || this.O.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        this.O.jumpToCurrentState();
    }

    @Override
    public Drawable mutate() {
        if (!this.N && super.mutate() == this) {
            this.M = d();
            Drawable drawable = this.O;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.M;
            if (fVar != null) {
                Drawable drawable2 = this.O;
                fVar.f23461b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.N = true;
        }
        return this;
    }

    @Override
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public boolean onLayoutDirectionChanged(int i10) {
        return a.l(this.O, i10);
    }

    @Override
    public boolean onLevelChange(int i10) {
        return this.O.setLevel(i10);
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public void setAlpha(int i10) {
        this.O.setAlpha(i10);
    }

    @Override
    public void setAutoMirrored(boolean z10) {
        a.i(this.O, z10);
    }

    @Override
    public void setChangingConfigurations(int i10) {
        this.O.setChangingConfigurations(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.O.setColorFilter(colorFilter);
    }

    @Override
    public void setDither(boolean z10) {
        this.O.setDither(z10);
    }

    @Override
    public void setFilterBitmap(boolean z10) {
        this.O.setFilterBitmap(z10);
    }

    @Override
    public boolean setState(int[] iArr) {
        return f(iArr) || this.O.setState(iArr);
    }

    @Override
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        this.M.f23462c = colorStateList;
        f(getState());
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        this.M.f23463d = mode;
        f(getState());
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.O.setVisible(z10, z11);
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(Drawable drawable) {
        this.M = d();
        a(drawable);
    }
}
