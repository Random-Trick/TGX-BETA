package ud;

import ae.j;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ce.a0;
import ce.j0;
import ce.y;
import org.thunderdog.challegram.R;

public class a2 extends Drawable {
    public final a f24042a;

    public static class a extends Drawable.ConstantState {
        public final org.thunderdog.challegram.a f24043a;
        public boolean f24044b;

        public a(org.thunderdog.challegram.a aVar) {
            this.f24043a = aVar;
        }

        public final int d() {
            v4<?> F;
            if (this.f24043a.z1()) {
                return R.id.theme_color_headerBackground;
            }
            q1 Q1 = this.f24043a.Q1();
            v4<?> R0 = this.f24043a.R0();
            if (R0 != null) {
                return R0.ba();
            }
            return (Q1 == null || (F = Q1.F()) == null || F.Me()) ? R.id.theme_color_filling : F.ba();
        }

        @Override
        public int getChangingConfigurations() {
            return 0;
        }

        @Override
        public Drawable newDrawable() {
            a2 a2Var = new a2(this.f24043a);
            a2Var.f24042a.f24044b = this.f24044b;
            return a2Var;
        }
    }

    public a2(org.thunderdog.challegram.a aVar) {
        this.f24042a = new a(aVar);
    }

    @Override
    public void draw(Canvas canvas) {
        int n10;
        int i10;
        int i11;
        int i12;
        if (!this.f24042a.f24044b) {
            canvas.drawColor(j.L(this.f24042a.d()));
        }
        if (a0.n() > 0 && this.f24042a.f24043a.d1()) {
            int c12 = this.f24042a.f24043a.c1();
            Rect bounds = getBounds();
            if (c12 != 0) {
                if (c12 == 90) {
                    canvas.drawRect(i11 - n10, bounds.top, bounds.right, bounds.bottom, y.g(j0.f5284k));
                    return;
                } else if (c12 != 180) {
                    if (c12 == 270) {
                        canvas.drawRect(bounds.left, bounds.top, i12 + n10, bounds.bottom, y.g(j0.f5284k));
                        return;
                    }
                    return;
                }
            }
            canvas.drawRect(bounds.left, i10 - n10, bounds.right, bounds.bottom, y.g(j0.f5284k));
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f24042a;
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i10) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
