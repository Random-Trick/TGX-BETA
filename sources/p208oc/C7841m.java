package p208oc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class C7841m extends Drawable implements Drawable.Callback {
    public int f25227M;
    public int f25228N;
    public int f25229O;
    public int f25230P;
    public int f25231Q;
    public int f25232R;
    public int f25233S;
    public boolean f25234T;
    public Drawable f25235a;
    public Drawable f25236b;
    public int f25237c;

    public C7841m(Drawable drawable, Drawable drawable2, int i, int i2) {
        this.f25235a = drawable;
        this.f25236b = drawable2;
        this.f25237c = i;
        this.f25227M = i2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    public void m14889a(boolean z) {
        this.f25234T = z;
    }

    @Override
    public void draw(Canvas canvas) {
        this.f25235a.setBounds(getBounds());
        this.f25235a.draw(canvas);
        if (this.f25236b != null) {
            if (this.f25234T) {
                Rect bounds = getBounds();
                int i = this.f25237c;
                if (i != 0) {
                    int i2 = bounds.top;
                    int i3 = this.f25227M;
                    this.f25236b.setBounds(bounds.left + i, i2 + i3, bounds.right - i, bounds.bottom - i3);
                } else {
                    this.f25236b.setBounds(bounds);
                }
            } else if (this.f25228N != 0) {
                int centerX = (getBounds().centerX() - (this.f25228N / 2)) + this.f25237c + this.f25232R;
                int centerY = getBounds().centerY();
                int i4 = this.f25229O;
                int i5 = (centerY - (i4 / 2)) + this.f25227M + this.f25233S;
                this.f25236b.setBounds(centerX, i5, this.f25228N + centerX, i4 + i5);
            } else {
                int centerX2 = (getBounds().centerX() - (this.f25236b.getIntrinsicWidth() / 2)) + this.f25237c;
                int centerY2 = (getBounds().centerY() - (this.f25236b.getIntrinsicHeight() / 2)) + this.f25227M;
                Drawable drawable = this.f25236b;
                drawable.setBounds(centerX2, centerY2, drawable.getIntrinsicWidth() + centerX2, this.f25236b.getIntrinsicHeight() + centerY2);
            }
            this.f25236b.draw(canvas);
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f25236b.getConstantState();
    }

    @Override
    public int getIntrinsicHeight() {
        int i = this.f25231Q;
        return i != 0 ? i : this.f25235a.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        int i = this.f25230P;
        return i != 0 ? i : this.f25235a.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        int i = this.f25231Q;
        return i != 0 ? i : this.f25235a.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        int i = this.f25230P;
        return i != 0 ? i : this.f25235a.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.f25236b.getOpacity();
    }

    @Override
    public int[] getState() {
        return this.f25236b.getState();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        return this.f25236b.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        this.f25236b.jumpToCurrentState();
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public void setAlpha(int i) {
        this.f25236b.setAlpha(i);
        this.f25235a.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25236b.setColorFilter(colorFilter);
    }

    @Override
    public boolean setState(int[] iArr) {
        this.f25236b.setState(iArr);
        return true;
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
