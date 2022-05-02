package p029c2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p256s0.C8621i;
import p267t0.C8931c;

public class C1517d {

    public static class C1518a implements TypeEvaluator<C8931c.C8933b[]> {
        public C8931c.C8933b[] f5407a;

        public C8931c.C8933b[] evaluate(float f, C8931c.C8933b[] bVarArr, C8931c.C8933b[] bVarArr2) {
            if (C8931c.m10925b(bVarArr, bVarArr2)) {
                if (!C8931c.m10925b(this.f5407a, bVarArr)) {
                    this.f5407a = C8931c.m10921f(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f5407a[i].m10913d(bVarArr[i], bVarArr2[i], f);
                }
                return this.f5407a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator m36579a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m36578b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    public static android.animation.Animator m36578b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: p029c2.C1517d.m36578b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe m36577c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    public static void m36576d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    public static PropertyValuesHolder m36575e(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        PropertyValuesHolder propertyValuesHolder;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m36572h(i7)) && (!z2 || !m36572h(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C8931c.C8933b[] d = C8931c.m10923d(string);
            C8931c.C8933b[] d2 = C8931c.m10923d(string2);
            if (d == null && d2 == null) {
                return null;
            }
            if (d != null) {
                C1518a aVar = new C1518a();
                if (d2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d);
                } else if (C8931c.m10925b(d, d2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d, d2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (d2 != null) {
                return PropertyValuesHolder.ofObject(str, new C1518a(), d2);
            } else {
                return null;
            }
        } else {
            C1519e a = i == 3 ? C1519e.m36559a() : null;
            if (z3) {
                if (z) {
                    if (i7 == 5) {
                        f2 = typedArray.getDimension(i2, 0.0f);
                    } else {
                        f2 = typedArray.getFloat(i2, 0.0f);
                    }
                    if (z2) {
                        if (i8 == 5) {
                            f3 = typedArray.getDimension(i3, 0.0f);
                        } else {
                            f3 = typedArray.getFloat(i3, 0.0f);
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                    }
                } else {
                    if (i8 == 5) {
                        f = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                if (i7 == 5) {
                    i5 = (int) typedArray.getDimension(i2, 0.0f);
                } else if (m36572h(i7)) {
                    i5 = typedArray.getColor(i2, 0);
                } else {
                    i5 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i8 == 5) {
                        i6 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (m36572h(i8)) {
                        i6 = typedArray.getColor(i3, 0);
                    } else {
                        i6 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5, i6);
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5);
                }
            } else if (z2) {
                if (i8 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m36572h(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i4);
            }
            if (propertyValuesHolder3 == null || a == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a);
            return propertyValuesHolder3;
        }
    }

    public static int m36574f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !m36572h(i3)) && (!z || !m36572h(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    public static int m36573g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = C8621i.m11895k(resources, theme, attributeSet, C1511a.f5391j);
        int i = 0;
        TypedValue l = C8621i.m11894l(k, xmlPullParser, "value", 0);
        if ((l != null) && m36572h(l.type)) {
            i = 3;
        }
        k.recycle();
        return i;
    }

    public static boolean m36572h(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator m36571i(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m36570j(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator m36570j(Context context, Resources resources, Resources.Theme theme, int i) {
        return m36569k(context, resources, theme, i, 1.0f);
    }

    public static Animator m36569k(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m36579a(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static ValueAnimator m36568l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray k = C8621i.m11895k(resources, theme, attributeSet, C1511a.f5388g);
        TypedArray k2 = C8621i.m11895k(resources, theme, attributeSet, C1511a.f5392k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m36563q(valueAnimator, k, k2, f, xmlPullParser);
        int h = C8621i.m11898h(k, xmlPullParser, "interpolator", 0, 0);
        if (h > 0) {
            valueAnimator.setInterpolator(C1516c.m36580b(context, h));
        }
        k.recycle();
        if (k2 != null) {
            k2.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe m36567m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        Keyframe keyframe;
        TypedArray k = C8621i.m11895k(resources, theme, attributeSet, C1511a.f5391j);
        float f = C8621i.m11900f(k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l = C8621i.m11894l(k, xmlPullParser, "value", 0);
        boolean z = l != null;
        if (i == 4) {
            i = (!z || !m36572h(l.type)) ? 0 : 3;
        }
        if (z) {
            if (i != 0) {
                keyframe = (i == 1 || i == 3) ? Keyframe.ofInt(f, C8621i.m11899g(k, xmlPullParser, "value", 0, 0)) : null;
            } else {
                keyframe = Keyframe.ofFloat(f, C8621i.m11900f(k, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(f);
        } else {
            keyframe = Keyframe.ofInt(f);
        }
        int h = C8621i.m11898h(k, xmlPullParser, "interpolator", 1, 0);
        if (h > 0) {
            keyframe.setInterpolator(C1516c.m36580b(context, h));
        }
        k.recycle();
        return keyframe;
    }

    public static ObjectAnimator m36566n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m36568l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder m36565o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m36573g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m = m36567m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m36577c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m36577c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2 + 1;
                            int i5 = i2;
                            while (i4 < i3 && keyframeArr[i4].getFraction() < 0.0f) {
                                i4++;
                                i5 = i4;
                            }
                            m36576d(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i5);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C1519e.m36559a());
            }
        }
        return propertyValuesHolder;
    }

    public static PropertyValuesHolder[] m36564p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray k = C8621i.m11895k(resources, theme, attributeSet, C1511a.f5390i);
                    String i2 = C8621i.m11897i(k, xmlPullParser, "propertyName", 3);
                    int g = C8621i.m11899g(k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder o = m36565o(context, resources, theme, xmlPullParser, i2, g);
                    if (o == null) {
                        o = m36575e(k, g, 0, 1, i2);
                    }
                    if (o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o);
                    }
                    k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    public static void m36563q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long g = C8621i.m11899g(typedArray, xmlPullParser, "duration", 1, 300);
        long g2 = C8621i.m11899g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g3 = C8621i.m11899g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C8621i.m11896j(xmlPullParser, "valueFrom") && C8621i.m11896j(xmlPullParser, "valueTo")) {
            if (g3 == 4) {
                g3 = m36574f(typedArray, 5, 6);
            }
            PropertyValuesHolder e = m36575e(typedArray, g3, 5, 6, "");
            if (e != null) {
                valueAnimator.setValues(e);
            }
        }
        valueAnimator.setDuration(g);
        valueAnimator.setStartDelay(g2);
        valueAnimator.setRepeatCount(C8621i.m11899g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C8621i.m11899g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m36562r(valueAnimator, typedArray2, g3, f, xmlPullParser);
        }
    }

    public static void m36562r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i2 = C8621i.m11897i(typedArray, xmlPullParser, "pathData", 1);
        if (i2 != null) {
            String i3 = C8621i.m11897i(typedArray, xmlPullParser, "propertyXName", 2);
            String i4 = C8621i.m11897i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (i3 == null && i4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m36561s(C8931c.m10922e(i2), objectAnimator, f * 0.5f, i3, i4);
            return;
        }
        objectAnimator.setPropertyName(C8621i.m11897i(typedArray, xmlPullParser, "propertyName", 0));
    }

    public static void m36561s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }
}
