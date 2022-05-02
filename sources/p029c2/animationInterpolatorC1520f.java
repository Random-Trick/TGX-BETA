package p029c2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p256s0.C8621i;
import p267t0.C8931c;

public class animationInterpolatorC1520f implements Interpolator {
    public float[] f5409a;
    public float[] f5410b;

    public animationInterpolatorC1520f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public final void m36555a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m36554b(path);
    }

    public final void m36554b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f5409a = new float[min];
            this.f5410b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.f5409a[i2] = fArr[0];
                this.f5410b[i2] = fArr[1];
            }
            if (Math.abs(this.f5409a[0]) <= 1.0E-5d && Math.abs(this.f5410b[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.f5409a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f5410b[i3] - 1.0f) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f5409a;
                        i4++;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f5409a[0]);
            sb2.append(",");
            sb2.append(this.f5410b[0]);
            sb2.append(" end:");
            int i5 = min - 1;
            sb2.append(this.f5409a[i5]);
            sb2.append(",");
            sb2.append(this.f5410b[i5]);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    public final void m36553c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m36554b(path);
    }

    public final void m36552d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C8621i.m11897j(xmlPullParser, "pathData")) {
            String i = C8621i.m11898i(typedArray, xmlPullParser, "pathData", 4);
            Path e = C8931c.m10923e(i);
            if (e != null) {
                m36554b(e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i);
        } else if (!C8621i.m11897j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C8621i.m11897j(xmlPullParser, "controlY1")) {
            float f = C8621i.m11901f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float f2 = C8621i.m11901f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean j = C8621i.m11897j(xmlPullParser, "controlX2");
            if (j != C8621i.m11897j(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!j) {
                m36553c(f, f2);
            } else {
                m36555a(f, f2, C8621i.m11901f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C8621i.m11901f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    @Override
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f5409a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f5409a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f5409a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f5410b[i];
        }
        float[] fArr2 = this.f5410b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    public animationInterpolatorC1520f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = C8621i.m11896k(resources, theme, attributeSet, C1511a.f5393l);
        m36552d(k, xmlPullParser);
        k.recycle();
    }
}
