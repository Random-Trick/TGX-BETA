package c5;

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
import d.j;
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
import m3.q1;
import m3.s2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.voip.VoIPController;
import z6.b;
import z6.d;

public final class l0 {
    public static final int f4841a;
    public static final String f4842b;
    public static final String f4843c;
    public static final String f4844d;
    public static final String f4845e;
    public static HashMap<String, String> f4851k;
    public static final byte[] f4846f = new byte[0];
    public static final Pattern f4847g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern f4848h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    public static final Pattern f4849i = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final Pattern f4850j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    public static final String[] f4852l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    public static final String[] f4853m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    public static final int[] f4854n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    public static final int[] f4855o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, j.K0, 126, j.M0, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, j.G0, j.H0, 125, j.N0, 137, 142, 135, Log.TAG_YOUTUBE, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, j.I0, j.F0, j.O0, j.P0, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, j.J0, 113, j.L0, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10 = Build.VERSION.SDK_INT;
        f4841a = i10;
        String str = Build.DEVICE;
        f4842b = str;
        String str2 = Build.MANUFACTURER;
        f4843c = str2;
        String str3 = Build.MODEL;
        f4844d = str3;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i10);
        f4845e = sb2.toString();
    }

    public static String A(byte[] bArr) {
        return new String(bArr, d.f27014c);
    }

    public static void A0(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 >= 0 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        }
    }

    public static String B(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, d.f27014c);
    }

    public static String[] B0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int C(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static String[] C0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int D(int i10) {
        switch (i10) {
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
                int i11 = f4841a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static long D0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static s2.b E(s2 s2Var, s2.b bVar) {
        boolean h10 = s2Var.h();
        boolean D = s2Var.D();
        boolean n10 = s2Var.n();
        boolean F = s2Var.F();
        boolean W = s2Var.W();
        boolean N = s2Var.N();
        boolean u10 = s2Var.R().u();
        boolean z10 = false;
        s2.b.a d10 = new s2.b.a().b(bVar).d(4, !h10).d(5, D && !h10).d(6, n10 && !h10).d(7, !u10 && (n10 || !W || D) && !h10).d(8, F && !h10).d(9, !u10 && (F || (W && N)) && !h10).d(10, !h10).d(11, D && !h10);
        if (D && !h10) {
            z10 = true;
        }
        return d10.d(12, z10).e();
    }

    public static byte[] E0(InputStream inputStream) {
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

    public static int F(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static long F0(int i10, int i11) {
        return G0(i11) | (G0(i10) << 32);
    }

    public static String G(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static long G0(int i10) {
        return i10 & 4294967295L;
    }

    public static String H(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return b.d(networkCountryIso);
            }
        }
        return b.d(Locale.getDefault().getCountry());
    }

    public static CharSequence H0(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    public static Point I(Context context) {
        DisplayManager displayManager;
        Display display = (f4841a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return J(context, display);
    }

    public static long I0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static Point J(Context context, Display display) {
        String str;
        if (display.getDisplayId() == 0 && m0(context)) {
            if (f4841a < 28) {
                str = d0("sys.display-size");
            } else {
                str = d0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] B0 = B0(str.trim(), "x");
                    if (B0.length == 2) {
                        int parseInt = Integer.parseInt(B0[0]);
                        int parseInt2 = Integer.parseInt(B0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(str);
                s.c("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(f4843c) && f4844d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f4841a;
        if (i10 >= 23) {
            N(display, point);
        } else if (i10 >= 17) {
            M(display, point);
        } else {
            L(display, point);
        }
        return point;
    }

    public static void J0(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static Looper K() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static void L(Display display, Point point) {
        display.getSize(point);
    }

    public static void M(Display display, Point point) {
        display.getRealSize(point);
    }

    public static void N(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static int O(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
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
                switch (i10) {
                    case j.K3:
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

    public static int P(String str) {
        String[] B0;
        int length;
        if (str == null || (length = (B0 = B0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = B0[length - 1];
        boolean z10 = length >= 3 && "neg".equals(B0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) a.e(str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String Q(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String R(Locale locale) {
        return f4841a >= 21 ? S(locale) : locale.toString();
    }

    public static String S(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long T(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long U(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static int V(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 != 16) {
            return i10 != 24 ? i10 != 32 ? 0 : 805306368 : Log.TAG_TDLIB_FILES;
        }
        return 2;
    }

    public static q1 W(int i10, int i11, int i12) {
        return new q1.b().e0("audio/raw").H(i11).f0(i12).Y(i10).E();
    }

    public static int X(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static long Y(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static int Z(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
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

    public static String[] a0() {
        String[] b02 = b0();
        for (int i10 = 0; i10 < b02.length; i10++) {
            b02[i10] = t0(b02[i10]);
        }
        return b02;
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static String[] b0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f4841a >= 24 ? c0(configuration) : new String[]{R(configuration.locale)};
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static String[] c0(Configuration configuration) {
        return B0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(list.size() - 1, i10) : i10;
    }

    public static String d0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            String valueOf = String.valueOf(str);
            s.d("Util", valueOf.length() != 0 ? "Failed to read system property ".concat(valueOf) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static int e(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static String e0(int i10) {
        switch (i10) {
            case VoIPController.ERROR_PRIVACY:
                return "none";
            case -1:
                return "unknown";
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
            default:
                if (i10 < 10000) {
                    return "?";
                }
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("custom (");
                sb2.append(i10);
                sb2.append(")");
                return sb2.toString();
        }
    }

    public static int f(t tVar, long j10, boolean z10, boolean z11) {
        int i10;
        int c10 = tVar.c() - 1;
        int i11 = 0;
        while (i11 <= c10) {
            int i12 = (i11 + c10) >>> 1;
            if (tVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                c10 = i12 - 1;
            }
        }
        if (z10 && (i10 = c10 + 1) < tVar.c() && tVar.b(i10) == j10) {
            return i10;
        }
        if (!z11 || c10 != -1) {
            return c10;
        }
        return 0;
    }

    public static byte[] f0(String str) {
        return str.getBytes(d.f27014c);
    }

    public static <T extends Comparable<? super T>> int g(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static boolean g0(b0 b0Var, b0 b0Var2, Inflater inflater) {
        if (b0Var.a() <= 0) {
            return false;
        }
        if (b0Var2.b() < b0Var.a()) {
            b0Var2.c(b0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(b0Var.d(), b0Var.e(), b0Var.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(b0Var2.d(), i10, b0Var2.b() - i10);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    } else if (i10 == b0Var2.b()) {
                        b0Var2.c(b0Var2.b() * 2);
                    }
                } else {
                    b0Var2.O(i10);
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

    public static int h(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i10);
            i11 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static boolean h0(Context context) {
        return f4841a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int i(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static boolean i0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T j(T t10) {
        return t10;
    }

    public static boolean j0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    public static boolean k0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static int l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static boolean l0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean m0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int n(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public static Thread n0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static float o(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int o0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static int p(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static String p0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f4853m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                String valueOf = String.valueOf(strArr[i10 + 1]);
                String valueOf2 = String.valueOf(str.substring(strArr[i10].length()));
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            i10 += 2;
        }
    }

    public static long q(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static <T> void q0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static int r(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f4854n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static long r0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static int s(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f4855o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static ExecutorService s0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public final Thread newThread(Runnable runnable) {
                Thread n02;
                n02 = l0.n0(str, runnable);
                return n02;
            }
        });
    }

    public static Handler t(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String t0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c10 = b.c(str);
        String str2 = C0(c10, "-")[0];
        if (f4851k == null) {
            f4851k = y();
        }
        String str3 = f4851k.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(c10.substring(str2.length()));
            c10 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? p0(c10) : c10;
    }

    public static Handler u() {
        return v(null);
    }

    public static <T> T[] u0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Handler v(Handler.Callback callback) {
        return t((Looper) a.h(Looper.myLooper()), callback);
    }

    public static <T> T[] v0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static Handler w() {
        return x(null);
    }

    public static <T> T[] w0(T[] tArr, int i10, int i11) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i11 > tArr.length) {
            z10 = false;
        }
        a.a(z10);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static Handler x(Handler.Callback callback) {
        return t(K(), callback);
    }

    public static boolean x0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static HashMap<String, String> y() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f4852l.length);
        int i10 = 0;
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
            String[] strArr = f4852l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static boolean y0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static String z(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long z0(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (j10 * (j11 / j12));
    }
}
