package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public final class f {

    public static class a {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        if (y0.a.c()) {
            return a.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (y0.a.c()) {
            return a.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(EdgeEffect edgeEffect, float f10, float f11) {
        edgeEffect.onPull(f10, f11);
    }

    public static float d(EdgeEffect edgeEffect, float f10, float f11) {
        if (y0.a.c()) {
            return a.c(edgeEffect, f10, f11);
        }
        c(edgeEffect, f10, f11);
        return f10;
    }
}
