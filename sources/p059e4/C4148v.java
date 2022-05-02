package p059e4;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p032c5.C1608c;
import p039d.C3563j;
import p059e4.C4148v;
import p174m3.C6600g1;
import p343y6.C10422b;

@SuppressLint({"InlinedApi"})
public final class C4148v {
    public static final Pattern f14045a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<C4150b, List<C4139n>> f14046b = new HashMap<>();
    public static int f14047c = -1;

    public static final class C4150b {
        public final String f14048a;
        public final boolean f14049b;
        public final boolean f14050c;

        public C4150b(String str, boolean z, boolean z2) {
            this.f14048a = str;
            this.f14049b = z;
            this.f14050c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C4150b.class) {
                return false;
            }
            C4150b bVar = (C4150b) obj;
            return TextUtils.equals(this.f14048a, bVar.f14048a) && this.f14049b == bVar.f14049b && this.f14050c == bVar.f14050c;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = (((this.f14048a.hashCode() + 31) * 31) + (this.f14049b ? 1231 : 1237)) * 31;
            if (!this.f14050c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    public static class C4151c extends Exception {
        public C4151c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface AbstractC4152d {
        MediaCodecInfo mo28675a(int i);

        boolean mo28674b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean mo28673c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int mo28672d();

        boolean mo28671e();
    }

    public static final class C4153e implements AbstractC4152d {
        public C4153e() {
        }

        @Override
        public MediaCodecInfo mo28675a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override
        public boolean mo28674b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override
        public boolean mo28673c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override
        public int mo28672d() {
            return MediaCodecList.getCodecCount();
        }

        @Override
        public boolean mo28671e() {
            return false;
        }
    }

    public static final class C4154f implements AbstractC4152d {
        public final int f14051a;
        public MediaCodecInfo[] f14052b;

        public C4154f(boolean z, boolean z2) {
            this.f14051a = (z || z2) ? 1 : 0;
        }

        @Override
        public MediaCodecInfo mo28675a(int i) {
            m28670f();
            return this.f14052b[i];
        }

        @Override
        public boolean mo28674b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override
        public boolean mo28673c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override
        public int mo28672d() {
            m28670f();
            return this.f14052b.length;
        }

        @Override
        public boolean mo28671e() {
            return true;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        public final void m28670f() {
            if (this.f14052b == null) {
                this.f14052b = new MediaCodecList(this.f14051a).getCodecInfos();
            }
        }
    }

    public interface AbstractC4155g<T> {
        int mo28669a(T t);
    }

    public static boolean m28718A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean m28717B(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C1216l0.f4526a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C1216l0.f4527b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C1216l0.f4528c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C1216l0.f4527b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C1216l0.f4527b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C1216l0.f4528c))) {
            String str6 = C1216l0.f4527b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C1216l0.f4528c)) {
            String str7 = C1216l0.f4527b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i > 19 || !C1216l0.f4527b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    public static boolean m28716C(MediaCodecInfo mediaCodecInfo) {
        if (C1216l0.f4526a >= 29) {
            return m28715D(mediaCodecInfo);
        }
        return !m28714E(mediaCodecInfo);
    }

    public static boolean m28715D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean m28714E(MediaCodecInfo mediaCodecInfo) {
        if (C1216l0.f4526a >= 29) {
            return m28713F(mediaCodecInfo);
        }
        String c = C10422b.m5149c(mediaCodecInfo.getName());
        if (c.startsWith("arc.")) {
            return false;
        }
        return c.startsWith("omx.google.") || c.startsWith("omx.ffmpeg.") || (c.startsWith("omx.sec.") && c.contains(".sw.")) || c.equals("omx.qcom.video.decoder.hevcswvdec") || c.startsWith("c2.android.") || c.startsWith("c2.google.") || (!c.startsWith("omx.") && !c.startsWith("c2."));
    }

    public static boolean m28713F(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean m28712G(MediaCodecInfo mediaCodecInfo) {
        if (C1216l0.f4526a >= 29) {
            return m28711H(mediaCodecInfo);
        }
        String c = C10422b.m5149c(mediaCodecInfo.getName());
        return !c.startsWith("omx.google.") && !c.startsWith("c2.android.") && !c.startsWith("c2.google.");
    }

    public static boolean m28711H(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int m28710I(C4139n nVar) {
        String str = nVar.f13952a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C1216l0.f4526a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static int m28709J(C4139n nVar) {
        return nVar.f13952a.startsWith("OMX.google") ? 1 : 0;
    }

    public static int m28708K(C6600g1 g1Var, C4139n nVar) {
        try {
            return nVar.m28797m(g1Var) ? 1 : 0;
        } catch (C4151c unused) {
            return -1;
        }
    }

    public static int m28707L(AbstractC4155g gVar, Object obj, Object obj2) {
        return gVar.mo28669a(obj2) - gVar.mo28669a(obj);
    }

    public static int m28706M() {
        if (f14047c == -1) {
            int i = 0;
            C4139n q = m28685q("video/avc", false, false);
            if (q != null) {
                MediaCodecInfo.CodecProfileLevel[] g = q.m28803g();
                int length = g.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m28694h(g[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C1216l0.f4526a >= 21 ? 345600 : 172800);
            }
            f14047c = i;
        }
        return f14047c;
    }

    public static int m28705N(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
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
        return i2;
    }

    public static <T> void m28704O(List<T> list, final AbstractC4155g<T> gVar) {
        Collections.sort(list, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int L;
                L = C4148v.m28707L(C4148v.AbstractC4155g.this, obj, obj2);
                return L;
            }
        });
    }

    public static int m28703P(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return Log.TAG_YOUTUBE;
        }
        if (i == 50) {
            return Log.TAG_CRASH;
        }
        if (i == 51) {
            return Log.TAG_GIF_LOADER;
        }
        switch (i) {
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

    public static int m28702Q(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void m28697e(String str, List<C4139n> list) {
        if ("audio/raw".equals(str)) {
            if (C1216l0.f4526a < 26 && C1216l0.f4527b.equals("R9") && list.size() == 1 && list.get(0).f13952a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C4139n.m28810A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m28704O(list, C4145s.f14042a);
        }
        int i = C1216l0.f4526a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f13952a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m28704O(list, C4146t.f14043a);
            }
        }
        if (i < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f13952a)) {
            list.add(list.remove(0));
        }
    }

    public static int m28696f(int i) {
        switch (i) {
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

    public static int m28695g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return Log.TAG_YOUTUBE;
                    default:
                        switch (i) {
                            case 30:
                                return Log.TAG_CRASH;
                            case 31:
                                return Log.TAG_GIF_LOADER;
                            case Log.TAG_IMAGE_LOADER:
                                return Log.TAG_CAMERA;
                            default:
                                switch (i) {
                                    case 40:
                                        return Log.TAG_VOICE;
                                    case 41:
                                        return Log.TAG_EMOJI;
                                    case 42:
                                        return Log.TAG_LUX;
                                    default:
                                        switch (i) {
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

    public static int m28694h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
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

    public static int m28693i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    public static Integer m28692j(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
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

    public static Integer m28691k(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
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

    public static Pair<Integer, Integer> m28690l(String str, String[] strArr) {
        int N;
        if (strArr.length != 3) {
            String valueOf = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C1234w.m37869e(Integer.parseInt(strArr[1], 16))) && (N = m28705N(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(N), 0);
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    public static Pair<Integer, Integer> m28689m(String str, String[] strArr, C1608c cVar) {
        int i;
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i2 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AV1 profile: ");
                sb2.append(parseInt);
                C1230s.m37884i("MediaCodecUtil", sb2.toString());
                return null;
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                if (parseInt3 != 8) {
                    i2 = (cVar == null || !(cVar.f5890M != null || (i = cVar.f5894c) == 7 || i == 6)) ? 2 : Log.TAG_EMOJI;
                }
                int f = m28696f(parseInt2);
                if (f != -1) {
                    return new Pair<>(Integer.valueOf(i2), Integer.valueOf(f));
                }
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown AV1 level: ");
                sb3.append(parseInt2);
                C1230s.m37884i("MediaCodecUtil", sb3.toString());
                return null;
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Unknown AV1 bit depth: ");
                sb4.append(parseInt3);
                C1230s.m37884i("MediaCodecUtil", sb4.toString());
                return null;
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    public static Pair<Integer, Integer> m28688n(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                i2 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
            } else {
                String valueOf2 = String.valueOf(str);
                C1230s.m37884i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            int i3 = m28693i(i2);
            if (i3 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AVC profile: ");
                sb2.append(i2);
                C1230s.m37884i("MediaCodecUtil", sb2.toString());
                return null;
            }
            int g = m28695g(i);
            if (g != -1) {
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(g));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown AVC level: ");
            sb3.append(i);
            C1230s.m37884i("MediaCodecUtil", sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf3 = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    public static String m28687o(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m28686p(p174m3.C6600g1 r6) {
        throw new UnsupportedOperationException("Method not decompiled: p059e4.C4148v.m28686p(m3.g1):android.util.Pair");
    }

    public static C4139n m28685q(String str, boolean z, boolean z2) {
        List<C4139n> r = m28684r(str, z, z2);
        if (r.isEmpty()) {
            return null;
        }
        return r.get(0);
    }

    public static synchronized List<C4139n> m28684r(String str, boolean z, boolean z2) {
        AbstractC4152d dVar;
        synchronized (C4148v.class) {
            C4150b bVar = new C4150b(str, z, z2);
            HashMap<C4150b, List<C4139n>> hashMap = f14046b;
            List<C4139n> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = C1216l0.f4526a;
            if (i >= 21) {
                dVar = new C4154f(z, z2);
            } else {
                dVar = new C4153e();
            }
            ArrayList<C4139n> s = m28683s(bVar, dVar);
            if (z && s.isEmpty() && 21 <= i && i <= 23) {
                s = m28683s(bVar, new C4153e());
                if (!s.isEmpty()) {
                    String str2 = s.get(0).f13952a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    C1230s.m37884i("MediaCodecUtil", sb2.toString());
                }
            }
            m28697e(str, s);
            List<C4139n> unmodifiableList = Collections.unmodifiableList(s);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static ArrayList<C4139n> m28683s(C4150b bVar, AbstractC4152d dVar) {
        boolean z;
        int i;
        int i2;
        String o;
        String str;
        String str2;
        Exception e;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b;
        boolean c;
        boolean z2;
        try {
            ArrayList<C4139n> arrayList = new ArrayList<>();
            String str3 = bVar.f14048a;
            int d = dVar.mo28672d();
            boolean e2 = dVar.mo28671e();
            int i3 = 0;
            while (i3 < d) {
                MediaCodecInfo a = dVar.mo28675a(i3);
                if (!m28676z(a)) {
                    String name = a.getName();
                    if (m28717B(a, name, e2, str3) && (o = m28687o(a, name, str3)) != null) {
                        try {
                            capabilitiesForType = a.getCapabilitiesForType(o);
                            b = dVar.mo28674b("tunneled-playback", o, capabilitiesForType);
                            c = dVar.mo28673c("tunneled-playback", o, capabilitiesForType);
                            z2 = bVar.f14050c;
                        } catch (Exception e3) {
                            e = e3;
                            str2 = o;
                            str = name;
                            i = i3;
                            z = e2;
                            i2 = d;
                        }
                        if ((z2 || !c) && (!z2 || b)) {
                            boolean b2 = dVar.mo28674b("secure-playback", o, capabilitiesForType);
                            boolean c2 = dVar.mo28673c("secure-playback", o, capabilitiesForType);
                            boolean z3 = bVar.f14049b;
                            if ((z3 || !c2) && (!z3 || b2)) {
                                boolean C = m28716C(a);
                                boolean E = m28714E(a);
                                boolean G = m28712G(a);
                                if ((!e2 || bVar.f14049b != b2) && (e2 || bVar.f14049b)) {
                                    str2 = o;
                                    str = name;
                                    i = i3;
                                    z = e2;
                                    i2 = d;
                                    if (!z && b2) {
                                        arrayList.add(C4139n.m28810A(String.valueOf(str).concat(".secure"), str3, str2, capabilitiesForType, C, E, G, false, true));
                                        return arrayList;
                                    }
                                    i3 = i + 1;
                                    d = i2;
                                    e2 = z;
                                } else {
                                    str2 = o;
                                    str = name;
                                    i = i3;
                                    z = e2;
                                    i2 = d;
                                    try {
                                        arrayList.add(C4139n.m28810A(name, str3, o, capabilitiesForType, C, E, G, false, false));
                                    } catch (Exception e4) {
                                        e = e4;
                                        if (C1216l0.f4526a > 23 || arrayList.isEmpty()) {
                                            String str4 = str;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 25 + str2.length());
                                            sb2.append("Failed to query codec ");
                                            sb2.append(str4);
                                            sb2.append(" (");
                                            sb2.append(str2);
                                            sb2.append(")");
                                            C1230s.m37890c("MediaCodecUtil", sb2.toString());
                                            throw e;
                                        }
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 46);
                                        sb3.append("Skipping codec ");
                                        sb3.append(str);
                                        sb3.append(" (failed to query capabilities)");
                                        C1230s.m37890c("MediaCodecUtil", sb3.toString());
                                        i3 = i + 1;
                                        d = i2;
                                        e2 = z;
                                    }
                                    i3 = i + 1;
                                    d = i2;
                                    e2 = z;
                                }
                            }
                        }
                    }
                }
                i = i3;
                z = e2;
                i2 = d;
                i3 = i + 1;
                d = i2;
                e2 = z;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new C4151c(e5);
        }
    }

    public static List<C4139n> m28682t(List<C4139n> list, final C6600g1 g1Var) {
        ArrayList arrayList = new ArrayList(list);
        m28704O(arrayList, new AbstractC4155g() {
            @Override
            public final int mo28669a(Object obj) {
                int K;
                K = C4148v.m28708K(C6600g1.this, (C4139n) obj);
                return K;
            }
        });
        return arrayList;
    }

    public static C4139n m28681u() {
        return m28685q("audio/raw", false, false);
    }

    public static Pair<Integer, Integer> m28680v(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f14045a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String group = matcher.group(1);
        Integer k = m28691k(group);
        if (k == null) {
            String valueOf3 = String.valueOf(group);
            C1230s.m37884i("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(valueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer j = m28692j(str2);
        if (j != null) {
            return new Pair<>(k, j);
        }
        String valueOf4 = String.valueOf(str2);
        C1230s.m37884i("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(valueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    public static Pair<Integer, Integer> m28679w(String str, String[] strArr) {
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i = 1;
        Matcher matcher = f14045a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if ("2".equals(group)) {
                i = 2;
            } else {
                String valueOf3 = String.valueOf(group);
                C1230s.m37884i("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
        }
        String str2 = strArr[3];
        Integer y = m28677y(str2);
        if (y != null) {
            return new Pair<>(Integer.valueOf(i), y);
        }
        String valueOf4 = String.valueOf(str2);
        C1230s.m37884i("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    public static Pair<Integer, Integer> m28678x(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int Q = m28702Q(parseInt);
            if (Q == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown VP9 profile: ");
                sb2.append(parseInt);
                C1230s.m37884i("MediaCodecUtil", sb2.toString());
                return null;
            }
            int P = m28703P(parseInt2);
            if (P != -1) {
                return new Pair<>(Integer.valueOf(Q), Integer.valueOf(P));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown VP9 level: ");
            sb3.append(parseInt2);
            C1230s.m37884i("MediaCodecUtil", sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            C1230s.m37884i("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    public static Integer m28677y(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
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
            case C3563j.f11955K3:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    public static boolean m28676z(MediaCodecInfo mediaCodecInfo) {
        return C1216l0.f4526a >= 29 && m28718A(mediaCodecInfo);
    }
}
