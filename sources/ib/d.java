package ib;

import android.graphics.Color;
import ra.k;

public final class d {
    public static final int a(float f10, int i10) {
        return (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0 ? i10 : b(h.j(0, Color.alpha(i10), f10), i10);
    }

    public static final int b(int i10, int i11) {
        return (i10 << 24) | (i11 & 16777215);
    }

    public static final int c(int i10, int i11) {
        float alpha = Color.alpha(i11) / 255.0f;
        boolean z10 = true;
        if (alpha == 0.0f) {
            return i10;
        }
        if (alpha != 1.0f) {
            z10 = false;
        }
        if (z10) {
            return i11;
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int red2 = Color.red(i11);
        int green2 = Color.green(i11);
        int blue2 = Color.blue(i11);
        if (red == red2 && green == green2 && blue == blue2) {
            return Color.rgb(red, green, blue);
        }
        float f10 = 1.0f - alpha;
        return Color.rgb(((int) (red2 * alpha)) + ((int) (red * f10)), ((int) (green2 * alpha)) + ((int) (green * f10)), ((int) (blue2 * alpha)) + ((int) (blue * f10)));
    }

    public static final int d(int i10, int i11, float f10) {
        if (!Float.isNaN(f10)) {
            if (i10 != i11) {
                if (f10 <= 0.0f) {
                    return i10;
                }
                if (f10 < 1.0f) {
                    return Color.argb(h.j(Color.alpha(i10), Color.alpha(i11), f10), h.j(Color.red(i10), Color.red(i11), f10), h.j(Color.green(i10), Color.green(i11), f10), h.j(Color.blue(i10), Color.blue(i11), f10));
                }
            }
            return i11;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int e(float f10, float f11, float f12) {
        if (f11 == 0.0f) {
            int i10 = (int) (f12 * 255.0f);
            return Color.rgb(i10, i10, i10);
        }
        float f13 = f12 < 0.5f ? (f11 + 1.0f) * f12 : (f12 + f11) - (f11 * f12);
        float f14 = (f12 * 2.0f) - f13;
        return Color.rgb((int) (f(f14, f13, f10 + 0.33333334f) * 255.0f), (int) (f(f14, f13, f10) * 255.0f), (int) (f(f14, f13, f10 - 0.33333334f) * 255.0f));
    }

    public static final float f(float f10, float f11, float f12) {
        if (f12 < 0.0f) {
            f12 += 1.0f;
        }
        if (f12 > 1.0f) {
            f12 -= 1.0f;
        }
        return f12 < 0.16666667f ? f10 + ((f11 - f10) * 6.0f * f12) : f12 < 0.5f ? f11 : f12 < 0.6666667f ? f10 + ((f11 - f10) * (0.6666667f - f12) * 6.0f) : f10;
    }

    public static final int g(String str, boolean z10) {
        int length;
        k.e(str, "hex");
        try {
            length = str.length();
        } catch (IllegalArgumentException unused) {
        }
        if (length == 3) {
            String substring = str.substring(0, 1);
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(0, 1);
            k.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring3 = str.substring(1, 2);
            k.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring4 = str.substring(1, 2);
            k.d(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring5 = str.substring(2, 3);
            k.d(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring6 = str.substring(2, 3);
            k.d(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
            return Color.parseColor("#" + substring + substring2 + substring3 + substring4 + substring5 + substring6);
        } else if (length == 4) {
            String substring7 = str.substring(3, 4);
            k.d(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring8 = str.substring(3, 4);
            k.d(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring9 = str.substring(0, 1);
            k.d(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring10 = str.substring(0, 1);
            k.d(substring10, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring11 = str.substring(1, 2);
            k.d(substring11, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring12 = str.substring(1, 2);
            k.d(substring12, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring13 = str.substring(2, 3);
            k.d(substring13, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring14 = str.substring(2, 3);
            k.d(substring14, "this as java.lang.String…ing(startIndex, endIndex)");
            return Color.parseColor("#" + substring7 + substring8 + substring9 + substring10 + substring11 + substring12 + substring13 + substring14);
        } else if (length != 6) {
            if (length == 8) {
                String substring15 = str.substring(6, 8);
                k.d(substring15, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring16 = str.substring(0, 6);
                k.d(substring16, "this as java.lang.String…ing(startIndex, endIndex)");
                return Color.parseColor("#" + substring15 + substring16);
            }
            if (z10) {
                return Color.parseColor(str);
            }
            throw new IllegalArgumentException(str);
        } else {
            return Color.parseColor("#" + str);
        }
    }

    public static final void h(int i10, float[] fArr) {
        float f10;
        float f11;
        k.e(fArr, "hsl");
        if (fArr.length >= 3) {
            float red = Color.red(i10) / 255.0f;
            float green = Color.green(i10) / 255.0f;
            float blue = Color.blue(i10) / 255.0f;
            float max = Math.max(red, Math.max(green, blue));
            float min = Math.min(red, Math.min(green, blue));
            float f12 = max + min;
            float f13 = f12 / 2;
            float f14 = 0.0f;
            if (max == min) {
                f10 = 0.0f;
            } else {
                float f15 = max - min;
                if (f13 > 0.5f) {
                    f12 = (2.0f - max) - min;
                }
                f10 = f15 / f12;
                if (max == red) {
                    float f16 = (green - blue) / f15;
                    if (green < blue) {
                        f14 = 6.0f;
                    }
                    f11 = f16 + f14;
                } else {
                    if (max == green) {
                        f11 = ((blue - red) / f15) + 2.0f;
                    } else {
                        if (max == blue) {
                            f11 = ((red - green) / f15) + 4.0f;
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                f14 = f11 / 6.0f;
            }
            fArr[0] = f14;
            fArr[1] = f10;
            fArr[2] = f13;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
