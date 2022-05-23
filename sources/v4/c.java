package v4;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import b7.d;
import c5.l0;
import c5.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {
    public final String f24710a;
    public final int f24711b;
    public final Integer f24712c;
    public final float f24713d;
    public final boolean f24714e;
    public final boolean f24715f;
    public final boolean f24716g;
    public final boolean f24717h;

    public static final class a {
        public final int f24718a;
        public final int f24719b;
        public final int f24720c;
        public final int f24721d;
        public final int f24722e;
        public final int f24723f;
        public final int f24724g;
        public final int f24725h;
        public final int f24726i;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f24718a = i10;
            this.f24719b = i11;
            this.f24720c = i12;
            this.f24721d = i13;
            this.f24722e = i14;
            this.f24723f = i15;
            this.f24724g = i16;
            this.f24725h = i17;
            this.f24726i = i18;
        }

        public static a a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < split.length; i18++) {
                String c11 = z6.b.c(split[i18].trim());
                c11.hashCode();
                switch (c11.hashCode()) {
                    case -1178781136:
                        if (c11.equals("italic")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1026963764:
                        if (c11.equals("underline")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -192095652:
                        if (c11.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -70925746:
                        if (c11.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3029637:
                        if (c11.equals("bold")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3373707:
                        if (c11.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 366554320:
                        if (c11.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1767875043:
                        if (c11.equals("alignment")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        i15 = i18;
                        break;
                    case 1:
                        i16 = i18;
                        break;
                    case 2:
                        i17 = i18;
                        break;
                    case 3:
                        i12 = i18;
                        break;
                    case 4:
                        i14 = i18;
                        break;
                    case 5:
                        i10 = i18;
                        break;
                    case 6:
                        i13 = i18;
                        break;
                    case 7:
                        i11 = i18;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, split.length);
            }
            return null;
        }
    }

    public static final class b {
        public static final Pattern f24727c = Pattern.compile("\\{([^}]*)\\}");
        public static final Pattern f24728d = Pattern.compile(l0.z("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern f24729e = Pattern.compile(l0.z("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern f24730f = Pattern.compile("\\\\an(\\d+)");
        public final int f24731a;
        public final PointF f24732b;

        public b(int i10, PointF pointF) {
            this.f24731a = i10;
            this.f24732b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f24730f.matcher(str);
            if (matcher.find()) {
                return c.d((String) c5.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f24727c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) c5.a.e(matcher.group(1));
                try {
                    PointF c10 = c(str2);
                    if (c10 != null) {
                        pointF = c10;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a10 = a(str2);
                    if (a10 != -1) {
                        i10 = a10;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        public static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = f24728d.matcher(str);
            Matcher matcher2 = f24729e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82);
                    sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb2.append(str);
                    sb2.append("'");
                    s.f("SsaStyle.Overrides", sb2.toString());
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) c5.a.e(str2)).trim()), Float.parseFloat(((String) c5.a.e(str3)).trim()));
        }

        public static String d(String str) {
            return f24727c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f24710a = str;
        this.f24711b = i10;
        this.f24712c = num;
        this.f24713d = f10;
        this.f24714e = z10;
        this.f24715f = z11;
        this.f24716g = z12;
        this.f24717h = z13;
    }

    public static c b(String str, a aVar) {
        c5.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f24726i;
        if (length != i10) {
            s.i("SsaStyle", l0.z("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f24718a].trim();
            int i11 = aVar.f24719b;
            int d10 = i11 != -1 ? d(split[i11].trim()) : -1;
            int i12 = aVar.f24720c;
            Integer f10 = i12 != -1 ? f(split[i12].trim()) : null;
            int i13 = aVar.f24721d;
            float g10 = i13 != -1 ? g(split[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f24722e;
            boolean z10 = i14 != -1 && e(split[i14].trim());
            int i15 = aVar.f24723f;
            boolean z11 = i15 != -1 && e(split[i15].trim());
            int i16 = aVar.f24724g;
            boolean z12 = i16 != -1 && e(split[i16].trim());
            int i17 = aVar.f24725h;
            return new c(trim, d10, f10, g10, z10, z11, z12, i17 != -1 && e(split[i17].trim()));
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            s.j("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    public static boolean c(int i10) {
        switch (i10) {
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

    public static int d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        s.i("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    public static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            s.j("SsaStyle", sb2.toString(), e10);
            return false;
        }
    }

    public static Integer f(String str) {
        long j10;
        try {
            if (str.startsWith("&H")) {
                j10 = Long.parseLong(str.substring(2), 16);
            } else {
                j10 = Long.parseLong(str);
            }
            c5.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(d.d(((j10 >> 24) & 255) ^ 255), d.d(j10 & 255), d.d((j10 >> 8) & 255), d.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            s.j("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    public static float g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29);
            sb2.append("Failed to parse font size: '");
            sb2.append(str);
            sb2.append("'");
            s.j("SsaStyle", sb2.toString(), e10);
            return -3.4028235E38f;
        }
    }
}
