package pc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class m extends Drawable implements Drawable.Callback {
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable f21128a;
    public Drawable f21129b;
    public int f21130c;

    public m(Drawable drawable, Drawable drawable2, int i10, int i11) {
        this.f21128a = drawable;
        this.f21129b = drawable2;
        this.f21130c = i10;
        this.M = i11;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    public void a(boolean z10) {
        this.T = z10;
    }

    @Override
    public void draw(Canvas canvas) {
        this.f21128a.setBounds(getBounds());
        this.f21128a.draw(canvas);
        if (this.f21129b != null) {
            if (this.T) {
                Rect bounds = getBounds();
                int i10 = this.f21130c;
                if (i10 != 0) {
                    int i11 = bounds.top;
                    int i12 = this.M;
                    this.f21129b.setBounds(bounds.left + i10, i11 + i12, bounds.right - i10, bounds.bottom - i12);
                } else {
                    this.f21129b.setBounds(bounds);
                }
            } else if (this.N != 0) {
                int centerX = (getBounds().centerX() - (this.N / 2)) + this.f21130c + this.R;
                int centerY = getBounds().centerY();
                int i13 = this.O;
                int i14 = (centerY - (i13 / 2)) + this.M + this.S;
                this.f21129b.setBounds(centerX, i14, this.N + centerX, i13 + i14);
            } else {
                int centerX2 = (getBounds().centerX() - (this.f21129b.getIntrinsicWidth() / 2)) + this.f21130c;
                int centerY2 = (getBounds().centerY() - (this.f21129b.getIntrinsicHeight() / 2)) + this.M;
                Drawable drawable = this.f21129b;
                drawable.setBounds(centerX2, centerY2, drawable.getIntrinsicWidth() + centerX2, this.f21129b.getIntrinsicHeight() + centerY2);
            }
            this.f21129b.draw(canvas);
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f21129b.getConstantState();
    }

    @Override
    public int getIntrinsicHeight() {
        int i10 = this.Q;
        return i10 != 0 ? i10 : this.f21128a.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        int i10 = this.P;
        return i10 != 0 ? i10 : this.f21128a.getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        int i10 = this.Q;
        return i10 != 0 ? i10 : this.f21128a.getMinimumHeight();
    }

    @Override
    public int getMinimumWidth() {
        int i10 = this.P;
        return i10 != 0 ? i10 : this.f21128a.getMinimumWidth();
    }

    @Override
    public int getOpacity() {
        return this.f21129b.getOpacity();
    }

    @Override
    public int[] getState() {
        return this.f21129b.getState();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        return this.f21129b.isStateful();
    }

    @Override
    public void jumpToCurrentState() {
        this.f21129b.jumpToCurrentState();
    }

    @Override
    public boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public void setAlpha(int i10) {
        this.f21129b.setAlpha(i10);
        this.f21128a.setAlpha(i10);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21129b.setColorFilter(colorFilter);
    }

    @Override
    public boolean setState(int[] iArr) {
        this.f21129b.setState(iArr);
        return true;
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
