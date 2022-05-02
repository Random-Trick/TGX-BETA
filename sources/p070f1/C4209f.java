package p070f1;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import p337y0.C10326a;

public final class C4209f {

    public static class C4210a {
        public static EdgeEffect m28437a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float m28436b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float m28435c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    public static EdgeEffect m28441a(Context context, AttributeSet attributeSet) {
        if (C10326a.m5418c()) {
            return C4210a.m28437a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float m28440b(EdgeEffect edgeEffect) {
        if (C10326a.m5418c()) {
            return C4210a.m28436b(edgeEffect);
        }
        return 0.0f;
    }

    public static void m28439c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    public static float m28438d(EdgeEffect edgeEffect, float f, float f2) {
        if (C10326a.m5418c()) {
            return C4210a.m28435c(edgeEffect, f, f2);
        }
        m28439c(edgeEffect, f, f2);
        return f;
    }
}
