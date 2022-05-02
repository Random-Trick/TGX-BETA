package td;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p364zd.C11524j;

public class C9145a2 extends Drawable {
    public final C9146a f29488a;

    public static class C9146a extends Drawable.ConstantState {
        public final AbstractView$OnTouchListenerC7889a f29489a;
        public boolean f29490b;

        public C9146a(AbstractView$OnTouchListenerC7889a aVar) {
            this.f29489a = aVar;
        }

        public final int m10176d() {
            AbstractC9323v4<?> F;
            if (this.f29489a.m14413y1()) {
                return R.id.theme_color_headerBackground;
            }
            C9270q1 P1 = this.f29489a.m14551P1();
            AbstractC9323v4<?> O0 = this.f29489a.m14556O0();
            if (O0 != null) {
                return O0.mo9286ba();
            }
            return (P1 == null || (F = P1.m9762F()) == null || F.mo9386Me()) ? R.id.theme_color_filling : F.mo9286ba();
        }

        @Override
        public int getChangingConfigurations() {
            return 0;
        }

        @Override
        public Drawable newDrawable() {
            C9145a2 a2Var = new C9145a2(this.f29489a);
            a2Var.f29488a.f29490b = this.f29490b;
            return a2Var;
        }
    }

    public C9145a2(AbstractView$OnTouchListenerC7889a aVar) {
        this.f29488a = new C9146a(aVar);
    }

    @Override
    public void draw(Canvas canvas) {
        int n;
        int i;
        int i2;
        int i3;
        if (!this.f29488a.f29490b) {
            canvas.drawColor(C11524j.m228N(this.f29488a.m10176d()));
        }
        if (Build.VERSION.SDK_INT >= 19 && (n = C1357a0.m37539n()) > 0 && this.f29488a.f29489a.m14505c1()) {
            int a1 = this.f29488a.f29489a.m14512a1();
            Rect bounds = getBounds();
            if (a1 != 0) {
                if (a1 == 90) {
                    canvas.drawRect(i2 - n, bounds.top, bounds.right, bounds.bottom, C1410y.m37042g(C1379j0.f5017k));
                    return;
                } else if (a1 != 180) {
                    if (a1 == 270) {
                        canvas.drawRect(bounds.left, bounds.top, i3 + n, bounds.bottom, C1410y.m37042g(C1379j0.f5017k));
                        return;
                    }
                    return;
                }
            }
            canvas.drawRect(bounds.left, i - n, bounds.right, bounds.bottom, C1410y.m37042g(C1379j0.f5017k));
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f29488a;
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
