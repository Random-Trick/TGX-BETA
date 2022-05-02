package p284u4;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p008a7.C0199c;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p343y6.C10422b;

public final class C9441c {
    public final String f30604a;
    public final int f30605b;
    public final Integer f30606c;
    public final float f30607d;
    public final boolean f30608e;
    public final boolean f30609f;
    public final boolean f30610g;
    public final boolean f30611h;

    public static final class C9442a {
        public final int f30612a;
        public final int f30613b;
        public final int f30614c;
        public final int f30615d;
        public final int f30616e;
        public final int f30617f;
        public final int f30618g;
        public final int f30619h;
        public final int f30620i;

        public C9442a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f30612a = i;
            this.f30613b = i2;
            this.f30614c = i3;
            this.f30615d = i4;
            this.f30616e = i5;
            this.f30617f = i6;
            this.f30618g = i7;
            this.f30619h = i8;
            this.f30620i = i9;
        }

        public static C9442a m8633a(String str) {
            char c;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < split.length; i9++) {
                String c2 = C10422b.m5149c(split[i9].trim());
                c2.hashCode();
                switch (c2.hashCode()) {
                    case -1178781136:
                        if (c2.equals("italic")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026963764:
                        if (c2.equals("underline")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192095652:
                        if (c2.equals("strikeout")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (c2.equals("primarycolour")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (c2.equals("bold")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (c2.equals("name")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (c2.equals("fontsize")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (c2.equals("alignment")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i6 = i9;
                        break;
                    case 1:
                        i7 = i9;
                        break;
                    case 2:
                        i8 = i9;
                        break;
                    case 3:
                        i3 = i9;
                        break;
                    case 4:
                        i5 = i9;
                        break;
                    case 5:
                        i = i9;
                        break;
                    case 6:
                        i4 = i9;
                        break;
                    case 7:
                        i2 = i9;
                        break;
                }
            }
            if (i != -1) {
                return new C9442a(i, i2, i3, i4, i5, i6, i7, i8, split.length);
            }
            return null;
        }
    }

    public static final class C9443b {
        public static final Pattern f30621c = Pattern.compile("\\{([^}]*)\\}");
        public static final Pattern f30622d = Pattern.compile(C1216l0.m37939z("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern f30623e = Pattern.compile(C1216l0.m37939z("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern f30624f = Pattern.compile("\\\\an(\\d+)");
        public final int f30625a;
        public final PointF f30626b;

        public C9443b(int i, PointF pointF) {
            this.f30625a = i;
            this.f30626b = pointF;
        }

        public static int m8632a(String str) {
            Matcher matcher = f30624f.matcher(str);
            if (matcher.find()) {
                return C9441c.m8637d((String) C1186a.m38188e(matcher.group(1)));
            }
            return -1;
        }

        public static C9443b m8631b(String str) {
            Matcher matcher = f30621c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) C1186a.m38188e(matcher.group(1));
                try {
                    PointF c = m8630c(str2);
                    if (c != null) {
                        pointF = c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a = m8632a(str2);
                    if (a != -1) {
                        i = a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C9443b(i, pointF);
        }

        public static PointF m8630c(String str) {
            String str2;
            String str3;
            Matcher matcher = f30622d.matcher(str);
            Matcher matcher2 = f30623e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82);
                    sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb2.append(str);
                    sb2.append("'");
                    C1230s.m37887f("SsaStyle.Overrides", sb2.toString());
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C1186a.m38188e(str2)).trim()), Float.parseFloat(((String) C1186a.m38188e(str3)).trim()));
        }

        public static String m8629d(String str) {
            return f30621c.matcher(str).replaceAll("");
        }
    }

    public C9441c(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f30604a = str;
        this.f30605b = i;
        this.f30606c = num;
        this.f30607d = f;
        this.f30608e = z;
        this.f30609f = z2;
        this.f30610g = z3;
        this.f30611h = z4;
    }

    public static C9441c m8639b(String str, C9442a aVar) {
        C1186a.m38192a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = aVar.f30620i;
        if (length != i) {
            C1230s.m37884i("SsaStyle", C1216l0.m37939z("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f30612a].trim();
            int i2 = aVar.f30613b;
            int d = i2 != -1 ? m8637d(split[i2].trim()) : -1;
            int i3 = aVar.f30614c;
            Integer f = i3 != -1 ? m8635f(split[i3].trim()) : null;
            int i4 = aVar.f30615d;
            float g = i4 != -1 ? m8634g(split[i4].trim()) : -3.4028235E38f;
            int i5 = aVar.f30616e;
            boolean z = i5 != -1 && m8636e(split[i5].trim());
            int i6 = aVar.f30617f;
            boolean z2 = i6 != -1 && m8636e(split[i6].trim());
            int i7 = aVar.f30618g;
            boolean z3 = i7 != -1 && m8636e(split[i7].trim());
            int i8 = aVar.f30619h;
            return new C9441c(trim, d, f, g, z, z2, z3, i8 != -1 && m8636e(split[i8].trim()));
        } catch (RuntimeException e) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            C1230s.m37883j("SsaStyle", sb2.toString(), e);
            return null;
        }
    }

    public static boolean m8638c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static int m8637d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m8638c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        C1230s.m37884i("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    public static boolean m8636e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            C1230s.m37883j("SsaStyle", sb2.toString(), e);
            return false;
        }
    }

    public static Integer m8635f(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C1186a.m38192a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(C0199c.m42105d(((j >> 24) & 255) ^ 255), C0199c.m42105d(j & 255), C0199c.m42105d((j >> 8) & 255), C0199c.m42105d((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            C1230s.m37883j("SsaStyle", sb2.toString(), e);
            return null;
        }
    }

    public static float m8634g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29);
            sb2.append("Failed to parse font size: '");
            sb2.append(str);
            sb2.append("'");
            C1230s.m37883j("SsaStyle", sb2.toString(), e);
            return -3.4028235E38f;
        }
    }
}
