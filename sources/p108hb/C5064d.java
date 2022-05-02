package p108hb;

import android.graphics.Color;
import qa.C8298k;

public final class C5064d {
    public static final int m24131a(float f, int i) {
        return (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0 ? i : m24130b(C5069h.m24083j(0, Color.alpha(i), f), i);
    }

    public static final int m24130b(int i, int i2) {
        return (i << 24) | (i2 & 16777215);
    }

    public static final int m24129c(int i, int i2) {
        float alpha = Color.alpha(i2) / 255.0f;
        boolean z = true;
        if (alpha == 0.0f) {
            return i;
        }
        if (alpha != 1.0f) {
            z = false;
        }
        if (z) {
            return i2;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int red2 = Color.red(i2);
        int green2 = Color.green(i2);
        int blue2 = Color.blue(i2);
        if (red == red2 && green == green2 && blue == blue2) {
            return Color.rgb(red, green, blue);
        }
        float f = 1.0f - alpha;
        return Color.rgb(((int) (red2 * alpha)) + ((int) (red * f)), ((int) (green2 * alpha)) + ((int) (green * f)), ((int) (blue2 * alpha)) + ((int) (blue * f)));
    }

    public static final int m24128d(int i, int i2, float f) {
        if (!Float.isNaN(f)) {
            if (i != i2) {
                if (f <= 0.0f) {
                    return i;
                }
                if (f < 1.0f) {
                    return Color.argb(C5069h.m24083j(Color.alpha(i), Color.alpha(i2), f), C5069h.m24083j(Color.red(i), Color.red(i2), f), C5069h.m24083j(Color.green(i), Color.green(i2), f), C5069h.m24083j(Color.blue(i), Color.blue(i2), f));
                }
            }
            return i2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int m24127e(float f, float f2, float f3) {
        if (f2 == 0.0f) {
            int i = (int) (f3 * 255.0f);
            return Color.rgb(i, i, i);
        }
        float f4 = f3 < 0.5f ? (f2 + 1.0f) * f3 : (f3 + f2) - (f2 * f3);
        float f5 = (f3 * 2.0f) - f4;
        return Color.rgb((int) (m24126f(f5, f4, f + 0.33333334f) * 255.0f), (int) (m24126f(f5, f4, f) * 255.0f), (int) (m24126f(f5, f4, f - 0.33333334f) * 255.0f));
    }

    public static final float m24126f(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        return f3 < 0.16666667f ? f + ((f2 - f) * 6.0f * f3) : f3 < 0.5f ? f2 : f3 < 0.6666667f ? f + ((f2 - f) * (0.6666667f - f3) * 6.0f) : f;
    }

    public static final int m24125g(String str, boolean z) {
        int length;
        C8298k.m12934e(str, "hex");
        try {
            length = str.length();
        } catch (IllegalArgumentException unused) {
        }
        if (length == 3) {
            String substring = str.substring(0, 1);
            C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(0, 1);
            C8298k.m12935d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring3 = str.substring(1, 2);
            C8298k.m12935d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring4 = str.substring(1, 2);
            C8298k.m12935d(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring5 = str.substring(2, 3);
            C8298k.m12935d(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring6 = str.substring(2, 3);
            C8298k.m12935d(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
            return Color.parseColor("#" + substring + substring2 + substring3 + substring4 + substring5 + substring6);
        } else if (length == 4) {
            String substring7 = str.substring(3, 4);
            C8298k.m12935d(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring8 = str.substring(3, 4);
            C8298k.m12935d(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring9 = str.substring(0, 1);
            C8298k.m12935d(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring10 = str.substring(0, 1);
            C8298k.m12935d(substring10, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring11 = str.substring(1, 2);
            C8298k.m12935d(substring11, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring12 = str.substring(1, 2);
            C8298k.m12935d(substring12, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring13 = str.substring(2, 3);
            C8298k.m12935d(substring13, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring14 = str.substring(2, 3);
            C8298k.m12935d(substring14, "this as java.lang.String…ing(startIndex, endIndex)");
            return Color.parseColor("#" + substring7 + substring8 + substring9 + substring10 + substring11 + substring12 + substring13 + substring14);
        } else if (length != 6) {
            if (length == 8) {
                String substring15 = str.substring(6, 8);
                C8298k.m12935d(substring15, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring16 = str.substring(0, 6);
                C8298k.m12935d(substring16, "this as java.lang.String…ing(startIndex, endIndex)");
                return Color.parseColor("#" + substring15 + substring16);
            }
            if (z) {
                return Color.parseColor(str);
            }
            throw new IllegalArgumentException(str);
        } else {
            return Color.parseColor("#" + str);
        }
    }

    public static final void m24124h(int i, float[] fArr) {
        float f;
        float f2;
        C8298k.m12934e(fArr, "hsl");
        if (fArr.length >= 3) {
            float red = Color.red(i) / 255.0f;
            float green = Color.green(i) / 255.0f;
            float blue = Color.blue(i) / 255.0f;
            float max = Math.max(red, Math.max(green, blue));
            float min = Math.min(red, Math.min(green, blue));
            float f3 = max + min;
            float f4 = f3 / 2;
            float f5 = 0.0f;
            if (max == min) {
                f = 0.0f;
            } else {
                float f6 = max - min;
                if (f4 > 0.5f) {
                    f3 = (2.0f - max) - min;
                }
                f = f6 / f3;
                if (max == red) {
                    float f7 = (green - blue) / f6;
                    if (green < blue) {
                        f5 = 6.0f;
                    }
                    f2 = f7 + f5;
                } else {
                    if (max == green) {
                        f2 = ((blue - red) / f6) + 2.0f;
                    } else {
                        if (max == blue) {
                            f2 = ((red - green) / f6) + 4.0f;
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                f5 = f2 / 6.0f;
            }
            fArr[0] = f5;
            fArr[1] = f;
            fArr[2] = f4;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
