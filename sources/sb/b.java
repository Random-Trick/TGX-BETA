package sb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ra.k;

public interface b {

    public static final class a implements b {
        public static final a f22695b = new a();
        public static final RectF f22694a = new RectF();

        @Override
        public void a(Canvas canvas, Paint paint, float f10) {
            k.e(canvas, "canvas");
            k.e(paint, "paint");
            RectF rectF = f22694a;
            rectF.set(0.0f, 0.0f, f10, f10);
            canvas.drawOval(rectF, paint);
        }
    }

    public static final class C0214b implements b {
        public final float f22696a;
        public final Drawable f22697b;
        public final boolean f22698c;

        public C0214b(Drawable drawable, boolean z10) {
            float f10;
            k.e(drawable, "drawable");
            this.f22697b = drawable;
            this.f22698c = z10;
            if (drawable.getIntrinsicHeight() == -1 && drawable.getIntrinsicWidth() == -1) {
                f10 = 1.0f;
            } else {
                f10 = (drawable.getIntrinsicHeight() == -1 || drawable.getIntrinsicWidth() == -1) ? 0.0f : drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
            }
            this.f22696a = f10;
        }

        public static C0214b c(C0214b bVar, Drawable drawable, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f22697b;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f22698c;
            }
            return bVar.b(drawable, z10);
        }

        @Override
        public void a(Canvas canvas, Paint paint, float f10) {
            k.e(canvas, "canvas");
            k.e(paint, "paint");
            if (this.f22698c) {
                this.f22697b.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
            } else {
                this.f22697b.setAlpha(paint.getAlpha());
            }
            int i10 = (int) (this.f22696a * f10);
            int i11 = (int) ((f10 - i10) / 2.0f);
            this.f22697b.setBounds(0, i11, (int) f10, i10 + i11);
            this.f22697b.draw(canvas);
        }

        public final C0214b b(Drawable drawable, boolean z10) {
            k.e(drawable, "drawable");
            return new C0214b(drawable, z10);
        }

        public final Drawable d() {
            return this.f22697b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0214b)) {
                return false;
            }
            C0214b bVar = (C0214b) obj;
            return k.b(this.f22697b, bVar.f22697b) && this.f22698c == bVar.f22698c;
        }

        public int hashCode() {
            Drawable drawable = this.f22697b;
            int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
            boolean z10 = this.f22698c;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            return hashCode + i10;
        }

        public String toString() {
            return "DrawableShape(drawable=" + this.f22697b + ", tint=" + this.f22698c + ")";
        }
    }

    public static final class c implements b {
        public static final c f22699a = new c();

        @Override
        public void a(Canvas canvas, Paint paint, float f10) {
            k.e(canvas, "canvas");
            k.e(paint, "paint");
            canvas.drawRect(0.0f, 0.0f, f10, f10, paint);
        }
    }

    void a(Canvas canvas, Paint paint, float f10);
}
