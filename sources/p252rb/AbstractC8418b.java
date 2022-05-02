package p252rb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import qa.C8298k;

public interface AbstractC8418b {

    public static final class C8419a implements AbstractC8418b {
        public static final C8419a f27328b = new C8419a();
        public static final RectF f27327a = new RectF();

        @Override
        public void mo12531a(Canvas canvas, Paint paint, float f) {
            C8298k.m12933e(canvas, "canvas");
            C8298k.m12933e(paint, "paint");
            RectF rectF = f27327a;
            rectF.set(0.0f, 0.0f, f, f);
            canvas.drawOval(rectF, paint);
        }
    }

    public static final class C8420b implements AbstractC8418b {
        public final float f27329a;
        public final Drawable f27330b;
        public final boolean f27331c;

        public C8420b(Drawable drawable, boolean z) {
            float f;
            C8298k.m12933e(drawable, "drawable");
            this.f27330b = drawable;
            this.f27331c = z;
            if (drawable.getIntrinsicHeight() == -1 && drawable.getIntrinsicWidth() == -1) {
                f = 1.0f;
            } else {
                f = (drawable.getIntrinsicHeight() == -1 || drawable.getIntrinsicWidth() == -1) ? 0.0f : drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
            }
            this.f27329a = f;
        }

        public static C8420b m12533c(C8420b bVar, Drawable drawable, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = bVar.f27330b;
            }
            if ((i & 2) != 0) {
                z = bVar.f27331c;
            }
            return bVar.m12534b(drawable, z);
        }

        @Override
        public void mo12531a(Canvas canvas, Paint paint, float f) {
            C8298k.m12933e(canvas, "canvas");
            C8298k.m12933e(paint, "paint");
            if (this.f27331c) {
                this.f27330b.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
            } else {
                this.f27330b.setAlpha(paint.getAlpha());
            }
            int i = (int) (this.f27329a * f);
            int i2 = (int) ((f - i) / 2.0f);
            this.f27330b.setBounds(0, i2, (int) f, i + i2);
            this.f27330b.draw(canvas);
        }

        public final C8420b m12534b(Drawable drawable, boolean z) {
            C8298k.m12933e(drawable, "drawable");
            return new C8420b(drawable, z);
        }

        public final Drawable m12532d() {
            return this.f27330b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8420b)) {
                return false;
            }
            C8420b bVar = (C8420b) obj;
            return C8298k.m12936b(this.f27330b, bVar.f27330b) && this.f27331c == bVar.f27331c;
        }

        public int hashCode() {
            Drawable drawable = this.f27330b;
            int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
            boolean z = this.f27331c;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            return "DrawableShape(drawable=" + this.f27330b + ", tint=" + this.f27331c + ")";
        }
    }

    public static final class C8421c implements AbstractC8418b {
        public static final C8421c f27332a = new C8421c();

        @Override
        public void mo12531a(Canvas canvas, Paint paint, float f) {
            C8298k.m12933e(canvas, "canvas");
            C8298k.m12933e(paint, "paint");
            canvas.drawRect(0.0f, 0.0f, f, f, paint);
        }
    }

    void mo12531a(Canvas canvas, Paint paint, float f);
}
