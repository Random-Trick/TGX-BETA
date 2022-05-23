package s0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import o0.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
    public static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k10 = i.k(resources, theme, attributeSet, d.A);
            float f10 = i.f(k10, xmlPullParser, "startX", d.J, 0.0f);
            float f11 = i.f(k10, xmlPullParser, "startY", d.K, 0.0f);
            float f12 = i.f(k10, xmlPullParser, "endX", d.L, 0.0f);
            float f13 = i.f(k10, xmlPullParser, "endY", d.M, 0.0f);
            float f14 = i.f(k10, xmlPullParser, "centerX", d.E, 0.0f);
            float f15 = i.f(k10, xmlPullParser, "centerY", d.F, 0.0f);
            int g10 = i.g(k10, xmlPullParser, "type", d.D, 0);
            int b10 = i.b(k10, xmlPullParser, "startColor", d.B, 0);
            boolean j10 = i.j(xmlPullParser, "centerColor");
            int b11 = i.b(k10, xmlPullParser, "centerColor", d.I, 0);
            int b12 = i.b(k10, xmlPullParser, "endColor", d.C, 0);
            int g11 = i.g(k10, xmlPullParser, "tileMode", d.H, 0);
            float f16 = i.f(k10, xmlPullParser, "gradientRadius", d.G, 0.0f);
            k10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b10, b12, j10, b11);
            if (g10 != 1) {
                if (g10 != 2) {
                    return new LinearGradient(f10, f11, f12, f13, a10.f22416a, a10.f22417b, d(g11));
                }
                return new SweepGradient(f14, f15, a10.f22416a, a10.f22417b);
            } else if (f16 > 0.0f) {
                return new RadialGradient(f14, f15, f16, a10.f22416a, a10.f22417b, d(g11));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    public static s0.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        throw new UnsupportedOperationException("Method not decompiled: s0.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):s0.f$a");
    }

    public static Shader.TileMode d(int i10) {
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    public static final class a {
        public final int[] f22416a;
        public final float[] f22417b;

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f22416a = new int[size];
            this.f22417b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f22416a[i10] = list.get(i10).intValue();
                this.f22417b[i10] = list2.get(i10).floatValue();
            }
        }

        public a(int i10, int i11) {
            this.f22416a = new int[]{i10, i11};
            this.f22417b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f22416a = new int[]{i10, i11, i12};
            this.f22417b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
