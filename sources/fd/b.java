package fd;

import android.os.Build;
import ib.i;

public class b {
    public static final int f11904a;
    public static final int f11905b;
    public static final boolean f11906c;
    public static final boolean f11907d;
    public static final boolean f11908e;
    public static final boolean f11909f;
    public static final boolean f11910g;
    public static final boolean f11911h;
    public static final boolean f11912i;
    public static final boolean f11913j;
    public static final boolean f11914k;
    public static final boolean f11915l;
    public static final boolean f11916m;
    public static final boolean f11917n;
    public static final boolean f11918o;
    public static final boolean f11919p;
    public static final boolean f11920q;

    static {
        boolean z10;
        String str;
        String str2;
        int a10 = a(Build.MANUFACTURER, Build.BRAND);
        f11904a = a10;
        int b10 = b(a10, Build.PRODUCT);
        f11905b = b10;
        boolean z11 = false;
        boolean z12 = a10 == 1;
        f11906c = z12;
        f11907d = a10 == 18;
        boolean z13 = b10 == 1 || b10 == 2 || b10 == 3 || b10 == 4 || b10 == 5 || b10 == 6;
        f11908e = z13;
        boolean z14 = a10 == 1 && b10 == 1;
        f11909f = z14;
        f11910g = z14;
        f11911h = z14;
        f11912i = z14;
        f11913j = z12;
        f11914k = z14;
        f11915l = z13;
        f11916m = a10 == 20 && Build.VERSION.SDK_INT <= 21;
        if (!z13) {
            String str3 = Build.DEVICE;
            if (!i.c(str3, "zeroflte") && !i.c(str3, "zenlte")) {
                z10 = false;
                f11917n = z10;
                f11918o = a10 != 4 && (b10 == 20 || ((str2 = Build.MODEL) != null && i.c(str2, "ASUS_Z010DD")));
                f11919p = z13;
                str = Build.DISPLAY;
                if (!i.i(str) && str.toLowerCase().contains("flyme")) {
                    z11 = true;
                }
                f11920q = z11;
            }
        }
        z10 = true;
        f11917n = z10;
        f11918o = a10 != 4 && (b10 == 20 || ((str2 = Build.MODEL) != null && i.c(str2, "ASUS_Z010DD")));
        f11919p = z13;
        str = Build.DISPLAY;
        if (!i.i(str)) {
            z11 = true;
        }
        f11920q = z11;
    }

    public static int a(String str, String str2) {
        if (i.i(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = i.i(str2) ? null : str2.toLowerCase();
        lowerCase.hashCode();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -1414265340:
                if (lowerCase.equals("amazon")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1320380160:
                if (lowerCase.equals("oneplus")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1240244679:
                if (lowerCase.equals("google")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1214328289:
                if (lowerCase.equals("sony ericsson")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1206476313:
                if (lowerCase.equals("huawei")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1033557701:
                if (lowerCase.equals("nvidia")) {
                    c10 = 5;
                    break;
                }
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    c10 = 6;
                    break;
                }
                break;
            case -151542385:
                if (lowerCase.equals("motorola")) {
                    c10 = 7;
                    break;
                }
                break;
            case 103639:
                if (lowerCase.equals("htc")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 107082:
                if (lowerCase.equals("lge")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 112918:
                if (lowerCase.equals("rim")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 120939:
                if (lowerCase.equals("zte")) {
                    c10 = 11;
                    break;
                }
                break;
            case 3003984:
                if (lowerCase.equals("asus")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 3536167:
                if (lowerCase.equals("sony")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1864941562:
                if (lowerCase.equals("samsung")) {
                    c10 = 14;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 3;
            case 1:
                return 17;
            case 2:
                return 2;
            case 3:
            case '\r':
                return 16;
            case 4:
                return 6;
            case 5:
                return 9;
            case 6:
                return 18;
            case 7:
                return 8;
            case '\b':
                return 5;
            case '\t':
                return 7;
            case '\n':
                return "blackberry".equals(lowerCase2) ? 20 : 0;
            case 11:
                return 19;
            case '\f':
                return 4;
            case 14:
                return 1;
            default:
                return 0;
        }
    }

    public static int b(int i10, String str) {
        if (i10 == 0 || i.i(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        if (i10 == 1) {
            lowerCase.hashCode();
            char c10 = 65535;
            switch (lowerCase.hashCode()) {
                case -2135733512:
                    if (lowerCase.equals("starltekx")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -2135733109:
                    if (lowerCase.equals("starltexx")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 387219675:
                    if (lowerCase.equals("beyond1ltexx")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 415848418:
                    if (lowerCase.equals("beyond2lteks")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 415848826:
                    if (lowerCase.equals("beyond2ltexx")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 539687292:
                    if (lowerCase.equals("star2qlteue")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 844299754:
                    if (lowerCase.equals("star2ltekx")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 844300157:
                    if (lowerCase.equals("star2ltexx")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 979709922:
                    if (lowerCase.equals("dreamlteks")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 979710330:
                    if (lowerCase.equals("dreamltexx")) {
                        c10 = '\t';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 6:
                    return 3;
                case 3:
                case 4:
                    return 6;
                case 5:
                case 7:
                    return 4;
                case '\b':
                    return 2;
                case '\t':
                    return 1;
            }
        } else if (i10 == 4) {
            lowerCase.hashCode();
            if (lowerCase.equals("ww_phone") || lowerCase.equals("asus_z010dd")) {
                return 20;
            }
        }
        return 0;
    }
}
