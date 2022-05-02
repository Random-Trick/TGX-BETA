package p020b5;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.voip.VoIPController;
import p039d.C3563j;
import p174m3.C6600g1;
import p343y6.C10422b;
import p343y6.C10428d;

public final class C1216l0 {
    public static final int f4526a;
    public static final String f4527b;
    public static final String f4528c;
    public static final String f4529d;
    public static final String f4530e;
    public static HashMap<String, String> f4536k;
    public static final byte[] f4531f = new byte[0];
    public static final Pattern f4532g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern f4533h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    public static final Pattern f4534i = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final Pattern f4535j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    public static final String[] f4537l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    public static final String[] f4538m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    public static final int[] f4539n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    public static final int[] f4540o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, C3563j.f11952K0, 126, C3563j.f11962M0, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, C3563j.f11932G0, C3563j.f11937H0, 125, C3563j.f11967N0, 137, 142, 135, Log.TAG_YOUTUBE, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, C3563j.f11942I0, C3563j.f11927F0, C3563j.f11972O0, C3563j.f11977P0, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, C3563j.f11947J0, 113, C3563j.f11957L0, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i = Build.VERSION.SDK_INT;
        f4526a = i;
        String str = Build.DEVICE;
        f4527b = str;
        String str2 = Build.MANUFACTURER;
        f4528c = str2;
        String str3 = Build.MODEL;
        f4529d = str3;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i);
        f4530e = sb2.toString();
    }

    public static String m38021A(byte[] bArr) {
        return new String(bArr, C10428d.f33498c);
    }

    public static String[] m38020A0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String m38019B(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, C10428d.f33498c);
    }

    public static String[] m38018B0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int m38017C(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static long m38016C0(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    public static int m38015D(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f4526a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static byte[] m38014D0(InputStream inputStream) {
        byte[] bArr = new byte[Log.TAG_EMOJI];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int m38013E(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static long m38012E0(int i, int i2) {
        return m38010F0(i2) | (m38010F0(i) << 32);
    }

    public static String m38011F(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb2.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static long m38010F0(int i) {
        return i & 4294967295L;
    }

    public static String m38009G(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C10422b.m5148d(networkCountryIso);
            }
        }
        return C10422b.m5148d(Locale.getDefault().getCountry());
    }

    public static CharSequence m38008G0(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    public static Point m38007H(Context context) {
        DisplayManager displayManager;
        Display display = (f4526a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) C1186a.m38185e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m38005I(context, display);
    }

    public static long m38006H0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static Point m38005I(Context context, Display display) {
        String str;
        if (display.getDisplayId() == 0 && m37963l0(context)) {
            if (f4526a < 28) {
                str = m37981c0("sys.display-size");
            } else {
                str = m37981c0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] A0 = m38020A0(str.trim(), "x");
                    if (A0.length == 2) {
                        int parseInt = Integer.parseInt(A0[0]);
                        int parseInt2 = Integer.parseInt(A0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(str);
                C1230s.m37887c("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(f4528c) && f4529d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i = f4526a;
        if (i >= 23) {
            m38000M(display, point);
        } else if (i >= 17) {
            m38001L(display, point);
        } else {
            m38002K(display, point);
        }
        return point;
    }

    public static void m38004I0(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static Looper m38003J() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static void m38002K(Display display, Point point) {
        display.getSize(point);
    }

    public static void m38001L(Display display, Point point) {
        display.getRealSize(point);
    }

    public static void m38000M(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static int m37999N(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case C3563j.f11955K3:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int m37998O(String str) {
        String[] A0;
        int length;
        if (str == null || (length = (A0 = m38020A0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = A0[length - 1];
        boolean z = length >= 3 && "neg".equals(A0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) C1186a.m38185e(str2));
            return z ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String m37997P(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String m37996Q(Locale locale) {
        return f4526a >= 21 ? m37995R(locale) : locale.toString();
    }

    public static String m37995R(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long m37994S(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    public static long m37993T(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    public static int m37992U(int i) {
        if (i == 8) {
            return 3;
        }
        if (i != 16) {
            return i != 24 ? i != 32 ? 0 : 805306368 : Log.TAG_TDLIB_FILES;
        }
        return 2;
    }

    public static C6600g1 m37991V(int i, int i2, int i3) {
        return new C6600g1.C6602b().m19858e0("audio/raw").m19886H(i2).m19856f0(i3).m19869Y(i).m19889E();
    }

    public static int m37990W(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static long m37989X(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    public static int m37988Y(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String[] m37987Z() {
        String[] a0 = m37985a0();
        for (int i = 0; i < a0.length; i++) {
            a0[i] = m37949s0(a0[i]);
        }
        return a0;
    }

    public static String[] m37985a0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f4526a >= 24 ? m37983b0(configuration) : new String[]{m37996Q(configuration.locale)};
    }

    public static long m37984b(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    public static String[] m37983b0(Configuration configuration) {
        return m38020A0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static boolean m37982c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static String m37981c0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            C1230s.m37886d("Util", valueOf.length() != 0 ? "Failed to read system property ".concat(valueOf) : new String("Failed to read system property "), e);
            return null;
        }
    }

    public static <T extends Comparable<? super T>> int m37980d(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t) == 0);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(list.size() - 1, i) : i;
    }

    public static String m37979d0(int i) {
        switch (i) {
            case VoIPController.ERROR_PRIVACY:
                return "none";
            case -1:
            default:
                if (i < 10000) {
                    return "?";
                }
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("custom (");
                sb2.append(i);
                sb2.append(")");
                return sb2.toString();
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
        }
    }

    public static int m37978e(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    public static byte[] m37977e0(String str) {
        return str.getBytes(C10428d.f33498c);
    }

    public static int m37976f(C1231t tVar, long j, boolean z, boolean z2) {
        int i;
        int c = tVar.m37877c() - 1;
        int i2 = 0;
        while (i2 <= c) {
            int i3 = (i2 + c) >>> 1;
            if (tVar.m37878b(i3) < j) {
                i2 = i3 + 1;
            } else {
                c = i3 - 1;
            }
        }
        if (z && (i = c + 1) < tVar.m37877c() && tVar.m37878b(i) == j) {
            return i;
        }
        if (!z2 || c != -1) {
            return c;
        }
        return 0;
    }

    public static boolean m37975f0(C1189b0 b0Var, C1189b0 b0Var2, Inflater inflater) {
        if (b0Var.m38142a() <= 0) {
            return false;
        }
        if (b0Var2.m38141b() < b0Var.m38142a()) {
            b0Var2.m38140c(b0Var.m38142a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(b0Var.m38139d(), b0Var.m38138e(), b0Var.m38142a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(b0Var2.m38139d(), i, b0Var2.m38141b() - i);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else if (i == b0Var2.m38141b()) {
                        b0Var2.m38140c(b0Var2.m38141b() * 2);
                    }
                } else {
                    b0Var2.m38145O(i);
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static <T extends Comparable<? super T>> int m37974g(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t) == 0);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static boolean m37973g0(Context context) {
        return f4526a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int m37972h(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static boolean m37971h0(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    public static int m37970i(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static boolean m37969i0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T m37968j(T t) {
        return t;
    }

    public static boolean m37967j0(int i) {
        return i == 10 || i == 13;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] m37966k(T[] tArr) {
        return tArr;
    }

    public static boolean m37965k0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static int m37964l(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static boolean m37963l0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void m37962m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Thread m37961m0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int m37960n(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public static int m37959n0(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static float m37958o(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static String m37957o0(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f4538m;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                String valueOf = String.valueOf(strArr[i + 1]);
                String valueOf2 = String.valueOf(str.substring(strArr[i].length()));
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            i += 2;
        }
    }

    public static int m37956p(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static <T> void m37955p0(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    public static long m37954q(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long m37953q0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static int m37952r(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f4539n[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static ExecutorService m37951r0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                Thread m0;
                m0 = C1216l0.m37961m0(str, runnable);
                return m0;
            }
        });
    }

    public static int m37950s(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f4540o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    public static String m37949s0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c = C10422b.m5149c(str);
        String str2 = m38018B0(c, "-")[0];
        if (f4536k == null) {
            f4536k = m37938y();
        }
        String str3 = f4536k.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(c.substring(str2.length()));
            c = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? m37957o0(c) : c;
    }

    public static Handler m37948t(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static <T> T[] m37947t0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Handler m37946u() {
        return m37944v(null);
    }

    public static <T> T[] m37945u0(T[] tArr, int i) {
        C1186a.m38189a(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static Handler m37944v(Handler.Callback callback) {
        return m37948t((Looper) C1186a.m38182h(Looper.myLooper()), callback);
    }

    public static <T> T[] m37943v0(T[] tArr, int i, int i2) {
        boolean z = true;
        C1186a.m38189a(i >= 0);
        if (i2 > tArr.length) {
            z = false;
        }
        C1186a.m38189a(z);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    public static Handler m37942w() {
        return m37940x(null);
    }

    public static boolean m37941w0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Handler m37940x(Handler.Callback callback) {
        return m37948t(m38003J(), callback);
    }

    public static boolean m37939x0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static HashMap<String, String> m37938y() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f4537l.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f4537l;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static long m37937y0(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    public static String m37936z(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void m37935z0(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i2 >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || j % j2 != 0) {
            double d = j / j2;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }
}
