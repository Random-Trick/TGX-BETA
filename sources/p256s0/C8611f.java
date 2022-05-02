package p256s0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p196o0.C7525d;

public final class C8611f {
    public static C8612a m11929a(C8612a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C8612a(i, i3, i2);
        }
        return new C8612a(i, i2);
    }

    public static Shader m11928b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C7525d.f24055A);
            float f = C8621i.m11901f(k, xmlPullParser, "startX", C7525d.f24064J, 0.0f);
            float f2 = C8621i.m11901f(k, xmlPullParser, "startY", C7525d.f24065K, 0.0f);
            float f3 = C8621i.m11901f(k, xmlPullParser, "endX", C7525d.f24066L, 0.0f);
            float f4 = C8621i.m11901f(k, xmlPullParser, "endY", C7525d.f24067M, 0.0f);
            float f5 = C8621i.m11901f(k, xmlPullParser, "centerX", C7525d.f24059E, 0.0f);
            float f6 = C8621i.m11901f(k, xmlPullParser, "centerY", C7525d.f24060F, 0.0f);
            int g = C8621i.m11900g(k, xmlPullParser, "type", C7525d.f24058D, 0);
            int b = C8621i.m11905b(k, xmlPullParser, "startColor", C7525d.f24056B, 0);
            boolean j = C8621i.m11897j(xmlPullParser, "centerColor");
            int b2 = C8621i.m11905b(k, xmlPullParser, "centerColor", C7525d.f24063I, 0);
            int b3 = C8621i.m11905b(k, xmlPullParser, "endColor", C7525d.f24057C, 0);
            int g2 = C8621i.m11900g(k, xmlPullParser, "tileMode", C7525d.f24062H, 0);
            float f7 = C8621i.m11901f(k, xmlPullParser, "gradientRadius", C7525d.f24061G, 0.0f);
            k.recycle();
            C8612a a = m11929a(m11927c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g != 1) {
                if (g != 2) {
                    return new LinearGradient(f, f2, f3, f4, a.f27900a, a.f27901b, m11926d(g2));
                }
                return new SweepGradient(f5, f6, a.f27900a, a.f27901b);
            } else if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, a.f27900a, a.f27901b, m11926d(g2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    public static p256s0.C8611f.C8612a m11927c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        throw new UnsupportedOperationException("Method not decompiled: p256s0.C8611f.m11927c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):s0.f$a");
    }

    public static Shader.TileMode m11926d(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    public static final class C8612a {
        public final int[] f27900a;
        public final float[] f27901b;

        public C8612a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f27900a = new int[size];
            this.f27901b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f27900a[i] = list.get(i).intValue();
                this.f27901b[i] = list2.get(i).floatValue();
            }
        }

        public C8612a(int i, int i2) {
            this.f27900a = new int[]{i, i2};
            this.f27901b = new float[]{0.0f, 1.0f};
        }

        public C8612a(int i, int i2, int i3) {
            this.f27900a = new int[]{i, i2, i3};
            this.f27901b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
