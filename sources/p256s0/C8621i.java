package p256s0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class C8621i {
    public static boolean m11905a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m11896j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static int m11904b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m11896j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static ColorStateList m11903c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m11896j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return C8604c.m11964d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m11902d(typedValue);
        }
    }

    public static ColorStateList m11902d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static C8605d m11901e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m11896j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C8605d.m11958b(typedValue.data);
            }
            C8605d g = C8605d.m11953g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C8605d.m11958b(i2);
    }

    public static float m11900f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m11896j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int m11899g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m11896j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int m11898h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m11896j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    public static String m11897i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m11896j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static boolean m11896j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray m11895k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue m11894l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m11896j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
