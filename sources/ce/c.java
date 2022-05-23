package ce;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import gd.w;
import id.d;
import id.h;
import id.i;
import ie.n;
import org.thunderdog.challegram.R;

public class c {
    public static final int[] f5239a = {16842919};
    public static final int[] f5240b = {16842913};
    public static final int[] f5241c = {16843518};

    public static Drawable a(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static void b(Canvas canvas, Drawable drawable, float f10, float f11, Paint paint) {
        int i10;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int minimumWidth = drawable.getMinimumWidth();
            int minimumHeight = drawable.getMinimumHeight();
            boolean z10 = false;
            if (!(bounds.top == 0 && bounds.left == 0 && bounds.right == minimumWidth && bounds.bottom == minimumHeight)) {
                drawable.setBounds(0, 0, minimumWidth, minimumHeight);
            }
            m(drawable, paint);
            if (!(f10 == 0.0f && f11 == 0.0f)) {
                z10 = true;
            }
            if (z10) {
                i10 = p0.O(canvas);
                canvas.translate(f10, f11);
            } else {
                i10 = -1;
            }
            drawable.draw(canvas);
            if (z10) {
                p0.N(canvas, i10);
            }
        }
    }

    public static void c(Canvas canvas, Drawable drawable, float f10, float f11, Paint paint) {
        b(canvas, drawable, f10 - (drawable.getMinimumWidth() / 2.0f), f11 - (drawable.getMinimumHeight() / 2.0f), paint);
    }

    public static void d(Canvas canvas, Drawable drawable, float f10, float f11, Paint paint, int i10, boolean z10) {
        if (z10) {
            b(canvas, drawable, (i10 - f10) - drawable.getMinimumWidth(), f11, paint);
        } else {
            b(canvas, drawable, f10, f11, paint);
        }
    }

    public static Drawable e(String str) {
        i q10 = d.z().q(str);
        if (q10 == null) {
            return null;
        }
        return new h(q10);
    }

    public static Drawable f(int i10) {
        return g(j0.B(), i10);
    }

    public static Drawable g(Resources resources, int i10) {
        Drawable k10 = k(resources, i10);
        if (k10 != null) {
            return k10.mutate();
        }
        return null;
    }

    public static Bitmap h(int i10) {
        Drawable f10 = f(i10);
        Bitmap createBitmap = Bitmap.createBitmap(f10.getIntrinsicWidth(), f10.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        f10.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        f10.draw(canvas);
        return createBitmap;
    }

    public static Drawable i(Drawable drawable, Drawable drawable2) {
        n nVar = new n();
        nVar.addState(f5239a, drawable2);
        nVar.addState(f5240b, drawable2);
        nVar.addState(f5241c, drawable2);
        if (drawable != null) {
            nVar.addState(StateSet.WILD_CARD, drawable);
        }
        return nVar;
    }

    public static Drawable j(int i10) {
        return k(j0.B(), i10);
    }

    public static Drawable k(Resources resources, int i10) {
        if (i10 == 0) {
            return null;
        }
        Drawable d10 = s0.h.d(resources, i10, null);
        if (d10 != null) {
            return d10;
        }
        throw new Resources.NotFoundException("res == " + i10);
    }

    public static boolean l(int i10) {
        if (!w.G2()) {
            return false;
        }
        switch (i10) {
            case R.drawable.baseline_arrow_forward_24:
            case R.drawable.baseline_content_copy_24:
            case R.drawable.baseline_forward_24:
            case R.drawable.baseline_reply_24:
            case R.drawable.baseline_share_24:
            case R.drawable.deproko_baseline_send_24:
                return true;
            default:
                return false;
        }
    }

    public static void m(Drawable drawable, Paint paint) {
        if (paint != null) {
            int alpha = paint.getAlpha();
            ColorFilter colorFilter = paint.getColorFilter();
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getPaint().getColorFilter() != colorFilter) {
                    drawable.setColorFilter(colorFilter);
                }
                bitmapDrawable.setAlpha(alpha);
                return;
            }
            if (colorFilter != drawable.getColorFilter()) {
                drawable.setColorFilter(colorFilter);
            }
            if (alpha != drawable.getAlpha()) {
                drawable.setAlpha(alpha);
            }
        }
    }

    public static void n(Drawable drawable, int i10) {
        if (drawable.getAlpha() != i10) {
            drawable.setAlpha(i10);
        }
    }

    public static Bitmap o(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
