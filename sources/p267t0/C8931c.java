package p267t0;

import android.graphics.Path;
import android.util.Log;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import java.util.ArrayList;
import p039d.C3563j;

public class C8931c {

    public static class C8932a {
        public int f28795a;
        public boolean f28796b;
    }

    public static void m10926a(ArrayList<C8933b> arrayList, char c, float[] fArr) {
        arrayList.add(new C8933b(c, fArr));
    }

    public static boolean m10925b(C8933b[] bVarArr, C8933b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (!(bVarArr[i].f28797a == bVarArr2[i].f28797a && bVarArr[i].f28798b.length == bVarArr2[i].f28798b.length)) {
                return false;
            }
        }
        return true;
    }

    public static float[] m10924c(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static C8933b[] m10923d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = m10918i(str, i);
            String trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
                m10926a(arrayList, trim.charAt(0), m10919h(trim));
            }
            i = i3 + 1;
            i2 = i3;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m10926a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C8933b[]) arrayList.toArray(new C8933b[arrayList.size()]);
    }

    public static Path m10922e(String str) {
        Path path = new Path();
        C8933b[] d = m10923d(str);
        if (d == null) {
            return null;
        }
        try {
            C8933b.m10912e(d, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static C8933b[] m10921f(C8933b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C8933b[] bVarArr2 = new C8933b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C8933b(bVarArr[i]);
        }
        return bVarArr2;
    }

    public static void m10920g(java.lang.String r8, int r9, p267t0.C8931c.C8932a r10) {
        throw new UnsupportedOperationException("Method not decompiled: p267t0.C8931c.m10920g(java.lang.String, int, t0.c$a):void");
    }

    public static float[] m10919h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C8932a aVar = new C8932a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m10920g(str, i, aVar);
                int i3 = aVar.f28795a;
                if (i < i3) {
                    i2++;
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                }
                i = aVar.f28796b ? i3 : i3 + 1;
            }
            return m10924c(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    public static int m10918i(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static void m10917j(C8933b[] bVarArr, C8933b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f28797a = bVarArr2[i].f28797a;
            for (int i2 = 0; i2 < bVarArr2[i].f28798b.length; i2++) {
                bVarArr[i].f28798b[i2] = bVarArr2[i].f28798b[i2];
            }
        }
    }

    public static class C8933b {
        public char f28797a;
        public float[] f28798b;

        public C8933b(char c, float[] fArr) {
            this.f28797a = c;
            this.f28798b = fArr;
        }

        public static void m10916a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case XtraBox.MP4_XTRA_BT_GUID:
                case 'V':
                case 'h':
                case C3563j.f11947J0:
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case C3563j.f11922E0:
                case 'l':
                case 'm':
                case C3563j.f11937H0:
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case C3563j.f11932G0:
                    i = 4;
                    break;
                case 'Z':
                case C3563j.f11967N0:
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i3 = 0;
            char c4 = c;
            while (i3 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i2 = i3;
                        int i4 = i2 + 2;
                        int i5 = i2 + 3;
                        int i6 = i2 + 4;
                        int i7 = i2 + 5;
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i4], fArr2[i5], fArr2[i6], fArr2[i7]);
                        f15 = fArr2[i6];
                        float f19 = fArr2[i7];
                        float f20 = fArr2[i4];
                        float f21 = fArr2[i5];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i2 = i3;
                        int i8 = i2 + 0;
                        path.lineTo(fArr2[i8], f16);
                        f15 = fArr2[i8];
                    } else if (c3 == 'Q') {
                        i2 = i3;
                        int i9 = i2 + 0;
                        int i10 = i2 + 1;
                        int i11 = i2 + 2;
                        int i12 = i2 + 3;
                        path.quadTo(fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        float f22 = fArr2[i9];
                        float f23 = fArr2[i10];
                        f15 = fArr2[i11];
                        f16 = fArr2[i12];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i2 = i3;
                        int i13 = i2 + 0;
                        path.lineTo(f15, fArr2[i13]);
                        f16 = fArr2[i13];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                int i14 = i3 + 0;
                                path.rLineTo(fArr2[i14], 0.0f);
                                f15 += fArr2[i14];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    int i15 = i3 + 0;
                                    path.rLineTo(0.0f, fArr2[i15]);
                                    f4 = fArr2[i15];
                                } else if (c3 == 'L') {
                                    int i16 = i3 + 0;
                                    int i17 = i3 + 1;
                                    path.lineTo(fArr2[i16], fArr2[i17]);
                                    f15 = fArr2[i16];
                                    f16 = fArr2[i17];
                                } else if (c3 == 'M') {
                                    int i18 = i3 + 0;
                                    f15 = fArr2[i18];
                                    int i19 = i3 + 1;
                                    f16 = fArr2[i19];
                                    if (i3 > 0) {
                                        path.lineTo(fArr2[i18], fArr2[i19]);
                                    } else {
                                        path.moveTo(fArr2[i18], fArr2[i19]);
                                        i2 = i3;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f16;
                                    int i20 = i3 + 0;
                                    int i21 = i3 + 1;
                                    int i22 = i3 + 2;
                                    int i23 = i3 + 3;
                                    path.cubicTo(f15, f24, fArr2[i20], fArr2[i21], fArr2[i22], fArr2[i23]);
                                    f2 = fArr2[i20];
                                    f = fArr2[i21];
                                    f15 = fArr2[i22];
                                    f16 = fArr2[i23];
                                    f11 = f2;
                                    f12 = f;
                                } else if (c3 == 'T') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i24 = i3 + 0;
                                    int i25 = i3 + 1;
                                    path.quadTo(f15, f16, fArr2[i24], fArr2[i25]);
                                    float f25 = fArr2[i24];
                                    float f26 = fArr2[i25];
                                    i2 = i3;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = f25;
                                    f16 = f26;
                                } else if (c3 == 'l') {
                                    int i26 = i3 + 0;
                                    int i27 = i3 + 1;
                                    path.rLineTo(fArr2[i26], fArr2[i27]);
                                    f15 += fArr2[i26];
                                    f4 = fArr2[i27];
                                } else if (c3 == 'm') {
                                    int i28 = i3 + 0;
                                    f15 += fArr2[i28];
                                    int i29 = i3 + 1;
                                    f16 += fArr2[i29];
                                    if (i3 > 0) {
                                        path.rLineTo(fArr2[i28], fArr2[i29]);
                                    } else {
                                        path.rMoveTo(fArr2[i28], fArr2[i29]);
                                        i2 = i3;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f6 = f15 - f11;
                                        f5 = f16 - f12;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i30 = i3 + 0;
                                    int i31 = i3 + 1;
                                    int i32 = i3 + 2;
                                    int i33 = i3 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f2 = fArr2[i30] + f15;
                                    f = fArr2[i31] + f16;
                                    f15 += fArr2[i32];
                                    f3 = fArr2[i33];
                                } else if (c3 == 't') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i34 = i3 + 0;
                                    int i35 = i3 + 1;
                                    path.rQuadTo(f7, f8, fArr2[i34], fArr2[i35]);
                                    f11 = f7 + f15;
                                    f12 = f8 + f16;
                                    f15 += fArr2[i34];
                                    f16 += fArr2[i35];
                                }
                                f16 += f4;
                            } else {
                                int i36 = i3 + 0;
                                int i37 = i3 + 1;
                                int i38 = i3 + 2;
                                int i39 = i3 + 3;
                                path.rQuadTo(fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                f2 = fArr2[i36] + f15;
                                f = fArr2[i37] + f16;
                                f15 += fArr2[i38];
                                f3 = fArr2[i39];
                            }
                            i2 = i3;
                        } else {
                            int i40 = i3 + 2;
                            int i41 = i3 + 3;
                            int i42 = i3 + 4;
                            int i43 = i3 + 5;
                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                            f2 = fArr2[i40] + f15;
                            f = fArr2[i41] + f16;
                            f15 += fArr2[i42];
                            f3 = fArr2[i43];
                        }
                        f16 += f3;
                        f11 = f2;
                        f12 = f;
                        i2 = i3;
                    } else {
                        int i44 = i3 + 5;
                        int i45 = i3 + 6;
                        i2 = i3;
                        m10914c(path, f15, f16, fArr2[i44] + f15, fArr2[i45] + f16, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f15 += fArr2[i44];
                        f16 += fArr2[i45];
                    }
                    i3 = i2 + i;
                    c4 = c2;
                    c3 = c4;
                } else {
                    i2 = i3;
                    int i46 = i2 + 5;
                    int i47 = i2 + 6;
                    m10914c(path, f15, f16, fArr2[i46], fArr2[i47], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                    f15 = fArr2[i46];
                    f16 = fArr2[i47];
                }
                f12 = f16;
                f11 = f15;
                i3 = i2 + i;
                c4 = c2;
                c3 = c4;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        public static void m10915b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ceil;
            double d19 = d8;
            int i = 0;
            double d20 = d5;
            double d21 = d6;
            while (i < ceil) {
                double d22 = d19 + d18;
                double sin3 = Math.sin(d22);
                double cos3 = Math.cos(d22);
                ceil = ceil;
                double d23 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d24 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d25 = (d12 * sin3) - (d13 * cos3);
                double d26 = (sin3 * d15) + (cos3 * d16);
                double d27 = d22 - d19;
                double tan = Math.tan(d27 / 2.0d);
                double sin4 = (Math.sin(d27) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                cos = cos;
                sin = sin;
                d18 = d18;
                d15 = d15;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d20 + (d14 * sin4)), (float) (d21 + (d17 * sin4)), (float) (d23 - (sin4 * d25)), (float) (d24 - (sin4 * d26)), (float) d23, (float) d24);
                i++;
                d20 = d23;
                d19 = d22;
                d17 = d26;
                d14 = d25;
                d21 = d24;
                d10 = d3;
            }
        }

        public static void m10914c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * cos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * sin)) / d6;
            double d8 = f6;
            double d9 = (((-f) * sin) + (d5 * cos)) / d8;
            double d10 = f4;
            double d11 = ((f3 * cos) + (d10 * sin)) / d6;
            double d12 = (((-f3) * sin) + (d10 * cos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d17);
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                m10914c(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d2 = d15 - d20;
                d = d16 + d19;
            } else {
                d2 = d15 + d20;
                d = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d, d7 - d2);
            double atan22 = Math.atan2(d12 - d, d11 - d2) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d21 = d2 * d6;
            double d22 = d * d8;
            m10915b(path, (d21 * cos) - (d22 * sin), (d21 * sin) + (d22 * cos), d6, d8, d3, d5, radians, atan2, atan22);
        }

        public static void m10912e(C8933b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m10916a(path, fArr, c, bVarArr[i].f28797a, bVarArr[i].f28798b);
                c = bVarArr[i].f28797a;
            }
        }

        public void m10913d(C8933b bVar, C8933b bVar2, float f) {
            this.f28797a = bVar.f28797a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.f28798b;
                if (i < fArr.length) {
                    this.f28798b[i] = (fArr[i] * (1.0f - f)) + (bVar2.f28798b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        public C8933b(C8933b bVar) {
            this.f28797a = bVar.f28797a;
            float[] fArr = bVar.f28798b;
            this.f28798b = C8931c.m10924c(fArr, 0, fArr.length);
        }
    }
}
