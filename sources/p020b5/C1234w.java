package p020b5;

import android.text.TextUtils;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.thunderdog.challegram.Log;
import p343y6.C10422b;

public final class C1234w {
    public static final ArrayList<C1235a> f4565a = new ArrayList<>();
    public static final Pattern f4566b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class C1235a {
        public final String f4567a;
        public final String f4568b;
        public final int f4569c;
    }

    public static final class C1236b {
        public final int f4570a;
        public final int f4571b;

        public C1236b(int i, int i2) {
            this.f4570a = i;
            this.f4571b = i2;
        }

        public int m37856a() {
            int i = this.f4571b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i != 42) {
                return i != 22 ? i != 23 ? 0 : 15 : Log.TAG_TDLIB_OPTIONS;
            }
            return 16;
        }
    }

    public static boolean m37870a(String str, String str2) {
        C1236b f;
        int a;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
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
                return (str2 == null || (f = m37865f(str2)) == null || (a = f.m37856a()) == 0 || a == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String m37869b(String str) {
        int size = f4565a.size();
        for (int i = 0; i < size; i++) {
            C1235a aVar = f4565a.get(i);
            if (str.startsWith(aVar.f4568b)) {
                return aVar.f4567a;
            }
        }
        return null;
    }

    public static int m37868c(String str, String str2) {
        C1236b f;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (f = m37865f(str2)) == null) {
                    return 0;
                }
                return f.m37856a();
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

    public static String m37867d(String str) {
        C1236b f;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String c = C10422b.m5149c(str.trim());
        if (c.startsWith(VisualSampleEntry.TYPE3) || c.startsWith(VisualSampleEntry.TYPE4)) {
            return "video/avc";
        }
        if (c.startsWith(VisualSampleEntry.TYPE7) || c.startsWith(VisualSampleEntry.TYPE6)) {
            return "video/hevc";
        }
        if (c.startsWith("dvav") || c.startsWith("dva1") || c.startsWith("dvhe") || c.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (c.startsWith("av01")) {
            return "video/av01";
        }
        if (c.startsWith("vp9") || c.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (c.startsWith("vp8") || c.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!c.startsWith(AudioSampleEntry.TYPE3)) {
            return c.startsWith("mha1") ? "audio/mha1" : c.startsWith("mhm1") ? "audio/mhm1" : (c.startsWith(AudioSampleEntry.TYPE8) || c.startsWith(AC3SpecificBox.TYPE)) ? "audio/ac3" : (c.startsWith(AudioSampleEntry.TYPE9) || c.startsWith(EC3SpecificBox.TYPE)) ? "audio/eac3" : c.startsWith("ec+3") ? "audio/eac3-joc" : (c.startsWith("ac-4") || c.startsWith("dac4")) ? "audio/ac4" : c.startsWith("dtsc") ? "audio/vnd.dts" : c.startsWith(AudioSampleEntry.TYPE13) ? "audio/vnd.dts.hd;profile=lbr" : (c.startsWith(AudioSampleEntry.TYPE12) || c.startsWith(AudioSampleEntry.TYPE11)) ? "audio/vnd.dts.hd" : c.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : c.startsWith("opus") ? "audio/opus" : c.startsWith("vorbis") ? "audio/vorbis" : c.startsWith("flac") ? "audio/flac" : c.startsWith(XMLSubtitleSampleEntry.TYPE) ? "application/ttml+xml" : c.startsWith(WebVTTSampleEntry.TYPE) ? "text/vtt" : c.contains("cea708") ? "application/cea-708" : (c.contains("eia608") || c.contains("cea608")) ? "application/cea-608" : m37869b(c);
        }
        if (c.startsWith("mp4a.") && (f = m37865f(c)) != null) {
            str2 = m37866e(f.f4570a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String m37866e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
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
                switch (i) {
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

    public static C1236b m37865f(String str) {
        Matcher matcher = f4566b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C1186a.m38185e(matcher.group(1));
        String group = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            }
            return new C1236b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String m37864g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int m37863h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m37861j(str)) {
            return 1;
        }
        if (m37858m(str)) {
            return 2;
        }
        if (m37859l(str)) {
            return 3;
        }
        if (m37860k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m37862i(str);
    }

    public static int m37862i(String str) {
        int size = f4565a.size();
        for (int i = 0; i < size; i++) {
            C1235a aVar = f4565a.get(i);
            if (str.equals(aVar.f4567a)) {
                return aVar.f4569c;
            }
        }
        return -1;
    }

    public static boolean m37861j(String str) {
        return "audio".equals(m37864g(str));
    }

    public static boolean m37860k(String str) {
        return "image".equals(m37864g(str));
    }

    public static boolean m37859l(String str) {
        return "text".equals(m37864g(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m37858m(String str) {
        return "video".equals(m37864g(str));
    }

    public static String m37857n(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
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
