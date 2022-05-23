package db;

import android.os.Build;
import d.j;

public final class f {
    public static final String a() {
        return c(0, 1, null);
    }

    public static final String b(int i10) {
        if (i10 == 10000) {
            return "Magic Version";
        }
        switch (i10) {
            case 11:
                return "Honeycomb";
            case 12:
                return "Honeycomb MR1";
            case 13:
                return "Honeycomb MR2";
            case 14:
                return "Ice Cream Sandwich";
            case 15:
                return "Ice Cream Sandwich MR1";
            case 16:
                return "Jelly Bean";
            case 17:
                return "Jelly Bean MR1";
            case 18:
                return "Jelly Bean MR2";
            case 19:
                return "Kitkat";
            case 20:
                return "Kitkat Watch";
            case 21:
                return "Lollipop";
            case 22:
                return "Lollipop MR1";
            case 23:
                return "Marshmallow";
            case j.K3:
                return "Nougat";
            case 25:
                return "Nougat MR1";
            case 26:
                return "Oreo";
            case 27:
                return "Oreo MR1";
            case 28:
                return "Pie";
            case j.P3:
                return "Q";
            case 30:
                return "R";
            case 31:
                return "S";
            default:
                return "Unknown";
        }
    }

    public static String c(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return b(i10);
    }

    public static final String d(int i10) {
        if (i10 == 10000) {
            return "Magic Version";
        }
        switch (i10) {
            case 11:
                return "3.0";
            case 12:
                return "3.1";
            case 13:
                return "3.2";
            case 14:
                return "4.0";
            case 15:
                return "4.0.3";
            case 16:
                return "4.1";
            case 17:
                return "4.2";
            case 18:
                return "4.3";
            case 19:
                return "4.4";
            case 20:
                return "4.4W";
            case 21:
                return "5.0";
            case 22:
                return "5.1";
            case 23:
                return "6.0";
            case j.K3:
                return "7.0";
            case 25:
                return "7.1";
            case 26:
                return "8.0";
            case 27:
                return "8.1";
            case 28:
                return "9.0";
            case j.P3:
                return "10";
            case 30:
                return "11";
            case 31:
                return "12";
            default:
                return "Unknown";
        }
    }
}
