package p208oc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class C7841m extends Drawable implements Drawable.Callback {
    public int f25230M;
    public int f25231N;
    public int f25232O;
    public int f25233P;
    public int f25234Q;
    public int f25235R;
    public int f25236S;
    public boolean f25237T;
    public Drawable f25238a;
    public Drawable f25239b;
    public int f25240c;

    public C7841m(Drawable drawable, Drawable drawable2, int i, int i2) {
        this.f25238a = drawable;
        this.f25239b = drawable2;
        this.f25240c = i;
        this.f25230M = i2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    public void m14889a(boolean z) {
        this.f25237T = z;
    }

    @Override
    public void draw(Canvas canvas) {
        this.f25238a.setBounds(getBounds());
        this.f25238a.draw(canvas);
        if (this.f25239b != null) {
            if (this.f25237T) {
                Rect bounds = getBounds();
                int i = this.f25240c;
                if (i != 0) {
                    int i2 = bounds.top;
                    int i3 = this.f25230M;
                    this.f25239b.setBounds(bounds.left + i, i2 + i3, bounds.right - i, bounds.bottom - i3);
                } else {
                    this.f25239b.setBounds(bounds);
                }
            } else if (this.f25231N != 0) {
                int centerX = (getBounds().centerX() - (this.f25231N / 2)) + this.f25240c + this.f25235R;
                int centerY = getBounds().centerY();
                int i4 = this.f25232O;
                int i5 = (centerY - (i4 / 2)) + this.f25230M + this.f25236S;
                this.f25239b.setBounds(centerX, i5, this.f25231N + centerX, i4 + i5);
            } else {
                int centerX2 = (getBounds().centerX() - (this.f25239b.getIntrinsicWidth() / 2)) + this.f25240c;
                int centerY2 = (getBounds().centerY() - (this.f25239b.getIntrinsicHeight() / 2)) + this.f25230M;
                Drawable drawable = this.f25239b;
                drawable.setBounds(centerX2, centerY2, drawable.getIntrinsicWidth() + centerX2, this.f25239b.getIntrinsicHeight() + centerY2);
            }
            this.f25239b.draw(canvas);
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f25239b.getConstantState();
    }

    @Override
    public int getIntrinsicHeight() {
        int i = this.f25234Q;
        return i != 0 ? i : this.f25238a.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        int i = this.f25233P;
        return i != 0 ? i : this.f25238a.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        int i = this.f25234Q;
        return i != 0 ? i : this.f25238a.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        int i = this.f25233P;
        return i != 0 ? i : this.f25238a.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.f25239b.getOpacity();
    }

    @Override
    public int[] getState() {
        return this.f25239b.getState();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        return this.f25239b.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        this.f25239b.jumpToCurrentState();
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
        this.f25239b.setAlpha(i);
        this.f25238a.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25239b.setColorFilter(colorFilter);
    }

    @Override
    public boolean setState(int[] iArr) {
        this.f25239b.setState(iArr);
        return true;
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
