package p067ed;

import android.os.Build;
import p108hb.C5070i;

public class C4184b {
    public static final int f14108a;
    public static final int f14109b;
    public static final boolean f14110c;
    public static final boolean f14111d;
    public static final boolean f14112e;
    public static final boolean f14113f;
    public static final boolean f14114g;
    public static final boolean f14115h;
    public static final boolean f14116i;
    public static final boolean f14117j;
    public static final boolean f14118k;
    public static final boolean f14119l;
    public static final boolean f14120m;
    public static final boolean f14121n;
    public static final boolean f14122o;
    public static final boolean f14123p;
    public static final boolean f14124q;

    static {
        boolean z;
        String str;
        String str2;
        int a = m28613a(Build.MANUFACTURER, Build.BRAND);
        f14108a = a;
        int b = m28612b(a, Build.PRODUCT);
        f14109b = b;
        boolean z2 = false;
        boolean z3 = a == 1;
        f14110c = z3;
        f14111d = a == 18;
        boolean z4 = b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 6;
        f14112e = z4;
        boolean z5 = a == 1 && b == 1;
        f14113f = z5;
        f14114g = z5;
        f14115h = z5;
        f14116i = z5;
        f14117j = z3;
        f14118k = z5;
        f14119l = z4;
        f14120m = a == 20 && Build.VERSION.SDK_INT <= 21;
        if (!z4) {
            String str3 = Build.DEVICE;
            if (!C5070i.m24067c(str3, "zeroflte") && !C5070i.m24067c(str3, "zenlte")) {
                z = false;
                f14121n = z;
                f14122o = a != 4 && (b == 20 || ((str2 = Build.MODEL) != null && C5070i.m24067c(str2, "ASUS_Z010DD")));
                f14123p = z4;
                str = Build.DISPLAY;
                if (!C5070i.m24061i(str) && str.toLowerCase().contains("flyme")) {
                    z2 = true;
                }
                f14124q = z2;
            }
        }
        z = true;
        f14121n = z;
        f14122o = a != 4 && (b == 20 || ((str2 = Build.MODEL) != null && C5070i.m24067c(str2, "ASUS_Z010DD")));
        f14123p = z4;
        str = Build.DISPLAY;
        if (!C5070i.m24061i(str)) {
            z2 = true;
        }
        f14124q = z2;
    }

    public static int m28613a(String str, String str2) {
        if (C5070i.m24061i(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = C5070i.m24061i(str2) ? null : str2.toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1414265340:
                if (lowerCase.equals("amazon")) {
                    c = 0;
                    break;
                }
                break;
            case -1320380160:
                if (lowerCase.equals("oneplus")) {
                    c = 1;
                    break;
                }
                break;
            case -1240244679:
                if (lowerCase.equals("google")) {
                    c = 2;
                    break;
                }
                break;
            case -1214328289:
                if (lowerCase.equals("sony ericsson")) {
                    c = 3;
                    break;
                }
                break;
            case -1206476313:
                if (lowerCase.equals("huawei")) {
                    c = 4;
                    break;
                }
                break;
            case -1033557701:
                if (lowerCase.equals("nvidia")) {
                    c = 5;
                    break;
                }
                break;
            case -759499589:
                if (lowerCase.equals("xiaomi")) {
                    c = 6;
                    break;
                }
                break;
            case -151542385:
                if (lowerCase.equals("motorola")) {
                    c = 7;
                    break;
                }
                break;
            case 103639:
                if (lowerCase.equals("htc")) {
                    c = '\b';
                    break;
                }
                break;
            case 107082:
                if (lowerCase.equals("lge")) {
                    c = '\t';
                    break;
                }
                break;
            case 112918:
                if (lowerCase.equals("rim")) {
                    c = '\n';
                    break;
                }
                break;
            case 120939:
                if (lowerCase.equals("zte")) {
                    c = 11;
                    break;
                }
                break;
            case 3003984:
                if (lowerCase.equals("asus")) {
                    c = '\f';
                    break;
                }
                break;
            case 3536167:
                if (lowerCase.equals("sony")) {
                    c = '\r';
                    break;
                }
                break;
            case 1864941562:
                if (lowerCase.equals("samsung")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
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

    public static int m28612b(int i, String str) {
        if (i == 0 || C5070i.m24061i(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        if (i == 1) {
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -2135733512:
                    if (lowerCase.equals("starltekx")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2135733109:
                    if (lowerCase.equals("starltexx")) {
                        c = 1;
                        break;
                    }
                    break;
                case 387219675:
                    if (lowerCase.equals("beyond1ltexx")) {
                        c = 2;
                        break;
                    }
                    break;
                case 415848418:
                    if (lowerCase.equals("beyond2lteks")) {
                        c = 3;
                        break;
                    }
                    break;
                case 415848826:
                    if (lowerCase.equals("beyond2ltexx")) {
                        c = 4;
                        break;
                    }
                    break;
                case 539687292:
                    if (lowerCase.equals("star2qlteue")) {
                        c = 5;
                        break;
                    }
                    break;
                case 844299754:
                    if (lowerCase.equals("star2ltekx")) {
                        c = 6;
                        break;
                    }
                    break;
                case 844300157:
                    if (lowerCase.equals("star2ltexx")) {
                        c = 7;
                        break;
                    }
                    break;
                case 979709922:
                    if (lowerCase.equals("dreamlteks")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 979710330:
                    if (lowerCase.equals("dreamltexx")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
            switch (c) {
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
        } else if (i == 4) {
            lowerCase.hashCode();
            if (lowerCase.equals("ww_phone") || lowerCase.equals("asus_z010dd")) {
                return 20;
            }
        }
        return 0;
    }
}
