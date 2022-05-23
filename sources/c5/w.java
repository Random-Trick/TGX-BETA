package c5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.thunderdog.challegram.Log;

public final class w {
    public static final ArrayList<a> f4895a = new ArrayList<>();
    public static final Pattern f4896b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {
        public final String f4897a;
        public final int f4898b;
    }

    public static final class b {
        public final int f4899a;
        public final int f4900b;

        public b(int i10, int i11) {
            this.f4899a = i10;
            this.f4900b = i11;
        }

        public int a() {
            int i10 = this.f4900b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 != 42) {
                return i10 != 22 ? i10 != 23 ? 0 : 15 : Log.TAG_TDLIB_OPTIONS;
            }
            return 16;
        }
    }

    public static boolean a(String str, String str2) {
        b d10;
        int a10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (d10 = d(str2)) == null || (a10 = d10.a()) == 0 || a10 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b d10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (d10 = d(str2)) == null) {
                    return 0;
                }
                return d10.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String c(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static b d(String str) {
        Matcher matcher = f4896b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) c5.a.e(matcher.group(1));
        String group = matcher.group(2);
        int i10 = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i10 = Integer.parseInt(group);
            }
            return new b(parseInt, i10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String e(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return g(str);
    }

    public static int g(String str) {
        int size = f4895a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f4895a.get(i10);
            if (str.equals(aVar.f4897a)) {
                return aVar.f4898b;
            }
        }
        return -1;
    }

    public static boolean h(String str) {
        return "audio".equals(e(str));
    }

    public static boolean i(String str) {
        return "image".equals(e(str));
    }

    public static boolean j(String str) {
        return "text".equals(e(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean k(String str) {
        return "video".equals(e(str));
    }

    public static String l(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
