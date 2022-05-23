package db;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.LruCache;

public final class e {
    public static final LruCache<Integer, Drawable> f7295a = new LruCache<>(10);

    public class a extends ShapeDrawable.ShaderFactory {
        public final float f7296a;
        public final float f7297b;
        public final float f7298c;
        public final float f7299d;
        public final int[] f7300e;

        public a(float f10, float f11, float f12, float f13, int[] iArr) {
            this.f7296a = f10;
            this.f7297b = f11;
            this.f7298c = f12;
            this.f7299d = f13;
            this.f7300e = iArr;
        }

        @Override
        public Shader resize(int i10, int i11) {
            float f10 = i10;
            float f11 = i11;
            return new LinearGradient(f10 * this.f7296a, f11 * this.f7297b, f10 * this.f7298c, f11 * this.f7299d, this.f7300e, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    public static class b {
        public static float a(float f10, float f11, float f12) {
            return Math.max(f10, Math.min(f11, f12));
        }
    }

    public static android.graphics.drawable.Drawable a(int r15, int r16, int r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: db.e.a(int, int, int, boolean):android.graphics.drawable.Drawable");
    }
}
