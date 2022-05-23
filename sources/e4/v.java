package e4;

import a7.q;
import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import c5.l0;
import c5.s;
import c5.w;
import d.j;
import e4.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.thunderdog.challegram.Log;

@SuppressLint({"InlinedApi"})
public final class v {
    public static final Pattern f10572a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<b, List<n>> f10573b = new HashMap<>();
    public static int f10574c = -1;

    public static final class b {
        public final String f10575a;
        public final boolean f10576b;
        public final boolean f10577c;

        public b(String str, boolean z10, boolean z11) {
            this.f10575a = str;
            this.f10576b = z10;
            this.f10577c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f10575a, bVar.f10575a) && this.f10576b == bVar.f10576b && this.f10577c == bVar.f10577c;
        }

        public int hashCode() {
            int i10 = 1231;
            int hashCode = (((this.f10575a.hashCode() + 31) * 31) + (this.f10576b ? 1231 : 1237)) * 31;
            if (!this.f10577c) {
                i10 = 1237;
            }
            return hashCode + i10;
        }
    }

    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class e implements d {
        public e() {
        }

        @Override
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override
        public boolean e() {
            return false;
        }
    }

    public static final class f implements d {
        public final int f10578a;
        public MediaCodecInfo[] f10579b;

        public f(boolean z10, boolean z11) {
            this.f10578a = (z10 || z11) ? 1 : 0;
        }

        @Override
        public MediaCodecInfo a(int i10) {
            f();
            return this.f10579b[i10];
        }

        @Override
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override
        public int d() {
            f();
            return this.f10579b.length;
        }

        @Override
        public boolean e() {
            return true;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        public final void f() {
            if (this.f10579b == null) {
                this.f10579b = new MediaCodecList(this.f10578a).getCodecInfos();
            }
        }
    }

    public interface g<T> {
        int a(T t10);
    }

    public static boolean A(MediaCodecInfo mediaCodecInfo) {
        return l0.f4841a >= 29 && B(mediaCodecInfo);
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = l0.f4841a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = l0.f4842b;
            if ("a70".equals(str3) || ("Xiaomi".equals(l0.f4843c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = l0.f4842b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = l0.f4842b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(l0.f4843c))) {
            String str6 = l0.f4842b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(l0.f4843c)) {
            String str7 = l0.f4842b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 > 19 || !l0.f4842b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return i10 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo, String str) {
        if (l0.f4841a >= 29) {
            return E(mediaCodecInfo);
        }
        return !F(mediaCodecInfo, str);
    }

    public static boolean E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        if (l0.f4841a >= 29) {
            return G(mediaCodecInfo);
        }
        if (w.h(str)) {
            return true;
        }
        String c10 = z6.b.c(mediaCodecInfo.getName());
        if (c10.startsWith("arc.")) {
            return false;
        }
        if (c10.startsWith("omx.google.") || c10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((!c10.startsWith("omx.sec.") || !c10.contains(".sw.")) && !c10.equals("omx.qcom.video.decoder.hevcswvdec") && !c10.startsWith("c2.android.") && !c10.startsWith("c2.google.")) {
            return !c10.startsWith("omx.") && !c10.startsWith("c2.");
        }
        return true;
    }

    public static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean H(MediaCodecInfo mediaCodecInfo) {
        if (l0.f4841a >= 29) {
            return I(mediaCodecInfo);
        }
        String c10 = z6.b.c(mediaCodecInfo.getName());
        return !c10.startsWith("omx.google.") && !c10.startsWith("c2.android.") && !c10.startsWith("c2.google.");
    }

    public static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int J(n nVar) {
        String str = nVar.f10511a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (l0.f4841a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static int K(n nVar) {
        return nVar.f10511a.startsWith("OMX.google") ? 1 : 0;
    }

    public static int L(q1 q1Var, n nVar) {
        try {
            return nVar.m(q1Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    public static int M(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int N() {
        if (f10574c == -1) {
            int i10 = 0;
            n r10 = r("video/avc", false, false);
            if (r10 != null) {
                MediaCodecInfo.CodecProfileLevel[] g10 = r10.g();
                int length = g10.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(h(g10[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, l0.f4841a >= 21 ? 345600 : 172800);
            }
            f10574c = i10;
        }
        return f10574c;
    }

    public static int O(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static <T> void P(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int M;
                M = v.M(v.g.this, obj, obj2);
                return M;
            }
        });
    }

    public static int Q(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return Log.TAG_YOUTUBE;
        }
        if (i10 == 50) {
            return Log.TAG_CRASH;
        }
        if (i10 == 51) {
            return Log.TAG_GIF_LOADER;
        }
        switch (i10) {
            case 60:
                return Log.TAG_VOICE;
            case 61:
                return Log.TAG_EMOJI;
            case 62:
                return Log.TAG_LUX;
            default:
                return -1;
        }
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void e(String str, List<n> list) {
        if ("audio/raw".equals(str)) {
            if (l0.f4841a < 26 && l0.f4842b.equals("R9") && list.size() == 1 && list.get(0).f10511a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(n.B("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            P(list, s.f10569a);
        }
        int i10 = l0.f4841a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f10511a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                P(list, t.f10570a);
            }
        }
        if (i10 < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f10511a)) {
            list.add(list.remove(0));
        }
    }

    public static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return Log.TAG_YOUTUBE;
            case 8:
                return Log.TAG_CRASH;
            case 9:
                return Log.TAG_GIF_LOADER;
            case 10:
                return Log.TAG_CAMERA;
            case 11:
                return Log.TAG_VOICE;
            case 12:
                return Log.TAG_EMOJI;
            case 13:
                return Log.TAG_LUX;
            case 14:
                return Log.TAG_VIDEO;
            case 15:
                return Log.TAG_ROUND;
            case 16:
                return Log.TAG_COMPRESS;
            case 17:
                return Log.TAG_CONTACT;
            case 18:
                return Log.TAG_PAINT;
            case 19:
                return Log.TAG_PLAYER;
            case 20:
                return Log.TAG_NDK;
            case 21:
                return Log.TAG_ACCOUNTS;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return Log.TAG_YOUTUBE;
                    default:
                        switch (i10) {
                            case 30:
                                return Log.TAG_CRASH;
                            case 31:
                                return Log.TAG_GIF_LOADER;
                            case Log.TAG_IMAGE_LOADER:
                                return Log.TAG_CAMERA;
                            default:
                                switch (i10) {
                                    case 40:
                                        return Log.TAG_VOICE;
                                    case 41:
                                        return Log.TAG_EMOJI;
                                    case 42:
                                        return Log.TAG_LUX;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return Log.TAG_VIDEO;
                                            case 51:
                                                return Log.TAG_ROUND;
                                            case 52:
                                                return Log.TAG_COMPRESS;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case Log.TAG_IMAGE_LOADER:
                return 101376;
            case Log.TAG_SPEED_TEXT:
                return 202752;
            case Log.TAG_YOUTUBE:
            case Log.TAG_CRASH:
                return 414720;
            case Log.TAG_GIF_LOADER:
                return 921600;
            case Log.TAG_CAMERA:
                return 1310720;
            case Log.TAG_VOICE:
            case Log.TAG_EMOJI:
                return Log.TAG_ACCOUNTS;
            case Log.TAG_LUX:
                return 2228224;
            case Log.TAG_VIDEO:
                return 5652480;
            case Log.TAG_ROUND:
            case Log.TAG_COMPRESS:
                return 9437184;
            case Log.TAG_CONTACT:
            case Log.TAG_PAINT:
            case Log.TAG_PLAYER:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static Integer j(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return Integer.valueOf((int) Log.TAG_YOUTUBE);
            case '\b':
                return Integer.valueOf((int) Log.TAG_CRASH);
            case '\t':
                return Integer.valueOf((int) Log.TAG_GIF_LOADER);
            case '\n':
                return Integer.valueOf((int) Log.TAG_CAMERA);
            case 11:
                return Integer.valueOf((int) Log.TAG_VOICE);
            case '\f':
                return Integer.valueOf((int) Log.TAG_EMOJI);
            default:
                return null;
        }
    }

    public static Integer k(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return Integer.valueOf((int) Log.TAG_YOUTUBE);
            case '\b':
                return Integer.valueOf((int) Log.TAG_CRASH);
            case '\t':
                return Integer.valueOf((int) Log.TAG_GIF_LOADER);
            default:
                return null;
        }
    }

    public static Pair<Integer, Integer> l(String str, String[] strArr) {
        int O;
        if (strArr.length != 3) {
            String valueOf = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(w.c(Integer.parseInt(strArr[1], 16))) && (O = O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(O), 0);
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    public static String m(q1 q1Var) {
        Pair<Integer, Integer> q10;
        if ("audio/eac3-joc".equals(q1Var.U)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(q1Var.U) || (q10 = q(q1Var)) == null) {
            return null;
        }
        int intValue = ((Integer) q10.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static Pair<Integer, Integer> n(String str, String[] strArr, d5.c cVar) {
        int i10;
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i11 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AV1 profile: ");
                sb2.append(parseInt);
                s.i("MediaCodecUtil", sb2.toString());
                return null;
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                if (parseInt3 != 8) {
                    i11 = (cVar == null || !(cVar.M != null || (i10 = cVar.f6212c) == 7 || i10 == 6)) ? 2 : Log.TAG_EMOJI;
                }
                int f10 = f(parseInt2);
                if (f10 != -1) {
                    return new Pair<>(Integer.valueOf(i11), Integer.valueOf(f10));
                }
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown AV1 level: ");
                sb3.append(parseInt2);
                s.i("MediaCodecUtil", sb3.toString());
                return null;
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Unknown AV1 bit depth: ");
                sb4.append(parseInt3);
                s.i("MediaCodecUtil", sb4.toString());
                return null;
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    public static Pair<Integer, Integer> o(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                i11 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
            } else {
                String valueOf2 = String.valueOf(str);
                s.i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            int i12 = i(i11);
            if (i12 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AVC profile: ");
                sb2.append(i11);
                s.i("MediaCodecUtil", sb2.toString());
                return null;
            }
            int g10 = g(i10);
            if (g10 != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(g10));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown AVC level: ");
            sb3.append(i10);
            s.i("MediaCodecUtil", sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf3 = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    public static String p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> q(m3.q1 r6) {
        throw new UnsupportedOperationException("Method not decompiled: e4.v.q(m3.q1):android.util.Pair");
    }

    public static n r(String str, boolean z10, boolean z11) {
        List<n> s10 = s(str, z10, z11);
        if (s10.isEmpty()) {
            return null;
        }
        return s10.get(0);
    }

    public static synchronized List<n> s(String str, boolean z10, boolean z11) {
        d dVar;
        synchronized (v.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<n>> hashMap = f10573b;
            List<n> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = l0.f4841a;
            if (i10 >= 21) {
                dVar = new f(z10, z11);
            } else {
                dVar = new e();
            }
            ArrayList<n> t10 = t(bVar, dVar);
            if (z10 && t10.isEmpty() && 21 <= i10 && i10 <= 23) {
                t10 = t(bVar, new e());
                if (!t10.isEmpty()) {
                    String str2 = t10.get(0).f10511a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    s.i("MediaCodecUtil", sb2.toString());
                }
            }
            e(str, t10);
            q z12 = q.z(t10);
            hashMap.put(bVar, z12);
            return z12;
        }
    }

    public static ArrayList<n> t(b bVar, d dVar) {
        boolean z10;
        int i10;
        int i11;
        String p10;
        String str;
        String str2;
        Exception e10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b10;
        boolean c10;
        boolean z11;
        try {
            ArrayList<n> arrayList = new ArrayList<>();
            String str3 = bVar.f10575a;
            int d10 = dVar.d();
            boolean e11 = dVar.e();
            int i12 = 0;
            while (i12 < d10) {
                MediaCodecInfo a10 = dVar.a(i12);
                if (!A(a10)) {
                    String name = a10.getName();
                    if (C(a10, name, e11, str3) && (p10 = p(a10, name, str3)) != null) {
                        try {
                            capabilitiesForType = a10.getCapabilitiesForType(p10);
                            b10 = dVar.b("tunneled-playback", p10, capabilitiesForType);
                            c10 = dVar.c("tunneled-playback", p10, capabilitiesForType);
                            z11 = bVar.f10577c;
                        } catch (Exception e12) {
                            e10 = e12;
                            str2 = p10;
                            str = name;
                            i10 = i12;
                            z10 = e11;
                            i11 = d10;
                        }
                        if ((z11 || !c10) && (!z11 || b10)) {
                            boolean b11 = dVar.b("secure-playback", p10, capabilitiesForType);
                            boolean c11 = dVar.c("secure-playback", p10, capabilitiesForType);
                            boolean z12 = bVar.f10576b;
                            if ((z12 || !c11) && (!z12 || b11)) {
                                boolean D = D(a10, str3);
                                boolean F = F(a10, str3);
                                boolean H = H(a10);
                                if ((!e11 || bVar.f10576b != b11) && (e11 || bVar.f10576b)) {
                                    str2 = p10;
                                    str = name;
                                    i10 = i12;
                                    z10 = e11;
                                    i11 = d10;
                                    if (!z10 && b11) {
                                        arrayList.add(n.B(String.valueOf(str).concat(".secure"), str3, str2, capabilitiesForType, D, F, H, false, true));
                                        return arrayList;
                                    }
                                    i12 = i10 + 1;
                                    d10 = i11;
                                    e11 = z10;
                                } else {
                                    str2 = p10;
                                    str = name;
                                    i10 = i12;
                                    z10 = e11;
                                    i11 = d10;
                                    try {
                                        arrayList.add(n.B(name, str3, p10, capabilitiesForType, D, F, H, false, false));
                                    } catch (Exception e13) {
                                        e10 = e13;
                                        if (l0.f4841a > 23 || arrayList.isEmpty()) {
                                            String str4 = str;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 25 + str2.length());
                                            sb2.append("Failed to query codec ");
                                            sb2.append(str4);
                                            sb2.append(" (");
                                            sb2.append(str2);
                                            sb2.append(")");
                                            s.c("MediaCodecUtil", sb2.toString());
                                            throw e10;
                                        }
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 46);
                                        sb3.append("Skipping codec ");
                                        sb3.append(str);
                                        sb3.append(" (failed to query capabilities)");
                                        s.c("MediaCodecUtil", sb3.toString());
                                        i12 = i10 + 1;
                                        d10 = i11;
                                        e11 = z10;
                                    }
                                    i12 = i10 + 1;
                                    d10 = i11;
                                    e11 = z10;
                                }
                            }
                        }
                    }
                }
                i10 = i12;
                z10 = e11;
                i11 = d10;
                i12 = i10 + 1;
                d10 = i11;
                e11 = z10;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new c(e14);
        }
    }

    public static List<n> u(List<n> list, final q1 q1Var) {
        ArrayList arrayList = new ArrayList(list);
        P(arrayList, new g() {
            @Override
            public final int a(Object obj) {
                int L;
                L = v.L(q1.this, (n) obj);
                return L;
            }
        });
        return arrayList;
    }

    public static n v() {
        return r("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> w(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f10572a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String group = matcher.group(1);
        Integer k10 = k(group);
        if (k10 == null) {
            String valueOf3 = String.valueOf(group);
            s.i("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(valueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer j10 = j(str2);
        if (j10 != null) {
            return new Pair<>(k10, j10);
        }
        String valueOf4 = String.valueOf(str2);
        s.i("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(valueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    public static Pair<Integer, Integer> x(String str, String[] strArr) {
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i10 = 1;
        Matcher matcher = f10572a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if ("2".equals(group)) {
                i10 = 2;
            } else {
                String valueOf3 = String.valueOf(group);
                s.i("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
        }
        String str2 = strArr[3];
        Integer z10 = z(str2);
        if (z10 != null) {
            return new Pair<>(Integer.valueOf(i10), z10);
        }
        String valueOf4 = String.valueOf(str2);
        s.i("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    public static Pair<Integer, Integer> y(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int R = R(parseInt);
            if (R == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown VP9 profile: ");
                sb2.append(parseInt);
                s.i("MediaCodecUtil", sb2.toString());
                return null;
            }
            int Q = Q(parseInt2);
            if (Q != -1) {
                return new Pair<>(Integer.valueOf(R), Integer.valueOf(Q));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown VP9 level: ");
            sb3.append(parseInt2);
            s.i("MediaCodecUtil", sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            s.i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    public static Integer z(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return Integer.valueOf((int) Log.TAG_YOUTUBE);
            case 4:
                return Integer.valueOf((int) Log.TAG_GIF_LOADER);
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return Integer.valueOf((int) Log.TAG_CRASH);
            case '\n':
                return Integer.valueOf((int) Log.TAG_VOICE);
            case 11:
                return Integer.valueOf((int) Log.TAG_LUX);
            case '\f':
                return Integer.valueOf((int) Log.TAG_ROUND);
            case '\r':
                return Integer.valueOf((int) Log.TAG_CONTACT);
            case 14:
                return Integer.valueOf((int) Log.TAG_PLAYER);
            case 15:
                return Integer.valueOf((int) Log.TAG_ACCOUNTS);
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return Integer.valueOf((int) Log.TAG_CAMERA);
            case 19:
                return Integer.valueOf((int) Log.TAG_EMOJI);
            case 20:
                return Integer.valueOf((int) Log.TAG_VIDEO);
            case 21:
                return Integer.valueOf((int) Log.TAG_COMPRESS);
            case 22:
                return Integer.valueOf((int) Log.TAG_PAINT);
            case 23:
                return Integer.valueOf((int) Log.TAG_NDK);
            case j.K3:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }
}
