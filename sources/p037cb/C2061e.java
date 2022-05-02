package p037cb;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.LruCache;

public final class C2061e {
    public static final LruCache<Integer, Drawable> f7288a = new LruCache<>(10);

    public class C2062a extends ShapeDrawable.ShaderFactory {
        public final float f7289a;
        public final float f7290b;
        public final float f7291c;
        public final float f7292d;
        public final int[] f7293e;

        public C2062a(float f, float f2, float f3, float f4, int[] iArr) {
            this.f7289a = f;
            this.f7290b = f2;
            this.f7291c = f3;
            this.f7292d = f4;
            this.f7293e = iArr;
        }

        @Override
        public Shader resize(int i, int i2) {
            float f = i;
            float f2 = i2;
            return new LinearGradient(f * this.f7289a, f2 * this.f7290b, f * this.f7291c, f2 * this.f7292d, this.f7293e, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public static class C2063b {
        public static float m35729a(float f, float f2, float f3) {
            return Math.max(f, Math.min(f2, f3));
        }
    }

    public static android.graphics.drawable.Drawable m35730a(int r15, int r16, int r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: p037cb.C2061e.m35730a(int, int, int, boolean):android.graphics.drawable.Drawable");
    }
}
