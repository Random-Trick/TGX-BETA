package p059e4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p174m3.C6600g1;
import p216p3.C8028h;

public final class C4139n {
    public final String f13952a;
    public final String f13953b;
    public final String f13954c;
    public final MediaCodecInfo.CodecCapabilities f13955d;
    public final boolean f13956e;
    public final boolean f13957f;
    public final boolean f13958g;
    public final boolean f13959h;
    public final boolean f13960i;
    public final boolean f13961j;
    public final boolean f13962k;

    public C4139n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f13952a = (String) C1186a.m38185e(str);
        this.f13953b = str2;
        this.f13954c = str3;
        this.f13955d = codecCapabilities;
        this.f13959h = z;
        this.f13960i = z2;
        this.f13961j = z3;
        this.f13956e = z4;
        this.f13957f = z5;
        this.f13958g = z6;
        this.f13962k = C1234w.m37858m(str2);
    }

    public static C4139n m28808A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C4139n(str, str2, str3, codecCapabilities, z, z2, z3, !z4 && codecCapabilities != null && m28800h(codecCapabilities) && !m28783y(str), codecCapabilities != null && m28790r(codecCapabilities), z5 || (codecCapabilities != null && m28792p(codecCapabilities)));
    }

    public static int m28807a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((C1216l0.f4526a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("AssumedMaxChannelAdjustment: ");
        sb2.append(str);
        sb2.append(", [");
        sb2.append(i);
        sb2.append(" to ");
        sb2.append(i2);
        sb2.append("]");
        C1230s.m37881i("MediaCodecInfo", sb2.toString());
        return i2;
    }

    public static Point m28805c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C1216l0.m37964l(i, widthAlignment) * widthAlignment, C1216l0.m37964l(i2, heightAlignment) * heightAlignment);
    }

    public static boolean m28804d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point c = m28805c(videoCapabilities, i, i2);
        int i3 = c.x;
        int i4 = c.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public static MediaCodecInfo.CodecProfileLevel[] m28802f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i = intValue >= 180000000 ? Log.TAG_CAMERA : intValue >= 120000000 ? Log.TAG_GIF_LOADER : intValue >= 60000000 ? Log.TAG_CRASH : intValue >= 30000000 ? Log.TAG_YOUTUBE : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean m28800h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C1216l0.f4526a >= 19 && m28799i(codecCapabilities);
    }

    public static boolean m28799i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean m28792p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C1216l0.f4526a >= 21 && m28791q(codecCapabilities);
    }

    public static boolean m28791q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean m28790r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C1216l0.f4526a >= 21 && m28789s(codecCapabilities);
    }

    public static boolean m28789s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean m28785w(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean m28784x(String str) {
        return C1216l0.f4529d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean m28783y(String str) {
        if (C1216l0.f4526a <= 22) {
            String str2 = C1216l0.f4529d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m28782z(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(C1216l0.f4527b);
    }

    public Point m28806b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13955d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m28805c(videoCapabilities, i, i2);
    }

    public C8028h m28803e(C6600g1 g1Var, C6600g1 g1Var2) {
        int i = !C1216l0.m37982c(g1Var.f20575U, g1Var2.f20575U) ? 8 : 0;
        if (this.f13962k) {
            if (g1Var.f20586c0 != g1Var2.f20586c0) {
                i |= Log.TAG_CAMERA;
            }
            if (!this.f13956e && !(g1Var.f20580Z == g1Var2.f20580Z && g1Var.f20582a0 == g1Var2.f20582a0)) {
                i |= Log.TAG_GIF_LOADER;
            }
            if (!C1216l0.m37982c(g1Var.f20590g0, g1Var2.f20590g0)) {
                i |= Log.TAG_VOICE;
            }
            if (m28784x(this.f13952a) && !g1Var.m19896g(g1Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C8028h(this.f13952a, g1Var, g1Var2, g1Var.m19896g(g1Var2) ? 3 : 2, 0);
            }
        } else {
            if (g1Var.f20591h0 != g1Var2.f20591h0) {
                i |= Log.TAG_EMOJI;
            }
            if (g1Var.f20592i0 != g1Var2.f20592i0) {
                i |= Log.TAG_LUX;
            }
            if (g1Var.f20593j0 != g1Var2.f20593j0) {
                i |= Log.TAG_VIDEO;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f13953b)) {
                Pair<Integer, Integer> p = C4148v.m28684p(g1Var);
                Pair<Integer, Integer> p2 = C4148v.m28684p(g1Var2);
                if (!(p == null || p2 == null)) {
                    int intValue = ((Integer) p.first).intValue();
                    int intValue2 = ((Integer) p2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C8028h(this.f13952a, g1Var, g1Var2, 3, 0);
                    }
                }
            }
            if (!g1Var.m19896g(g1Var2)) {
                i |= 32;
            }
            if (m28785w(this.f13953b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C8028h(this.f13952a, g1Var, g1Var2, 1, 0);
            }
        }
        return new C8028h(this.f13952a, g1Var, g1Var2, 0, i);
    }

    public MediaCodecInfo.CodecProfileLevel[] m28801g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13955d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean m28798j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13955d;
        if (codecCapabilities == null) {
            m28786v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m28786v("channelCount.aCaps");
            return false;
        } else if (m28807a(this.f13952a, this.f13953b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("channelCount.support, ");
            sb2.append(i);
            m28786v(sb2.toString());
            return false;
        }
    }

    public boolean m28797k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13955d;
        if (codecCapabilities == null) {
            m28786v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m28786v("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("sampleRate.support, ");
            sb2.append(i);
            m28786v(sb2.toString());
            return false;
        }
    }

    public boolean m28796l(C6600g1 g1Var) {
        String d;
        String str = g1Var.f20572R;
        if (str == null || this.f13953b == null || (d = C1234w.m37867d(str)) == null) {
            return true;
        }
        if (!this.f13953b.equals(d)) {
            String str2 = g1Var.f20572R;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13 + d.length());
            sb2.append("codec.mime ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(d);
            m28786v(sb2.toString());
            return false;
        }
        Pair<Integer, Integer> p = C4148v.m28684p(g1Var);
        if (p == null) {
            return true;
        }
        int intValue = ((Integer) p.first).intValue();
        int intValue2 = ((Integer) p.second).intValue();
        if (!(this.f13962k || intValue == 42)) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g = m28801g();
        if (C1216l0.f4526a <= 23 && "video/x-vnd.on2.vp9".equals(this.f13953b) && g.length == 0) {
            g = m28802f(this.f13955d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        String str3 = g1Var.f20572R;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 22 + d.length());
        sb3.append("codec.profileLevel, ");
        sb3.append(str3);
        sb3.append(", ");
        sb3.append(d);
        m28786v(sb3.toString());
        return false;
    }

    public boolean m28795m(C6600g1 g1Var) {
        int i;
        boolean z = false;
        if (!m28796l(g1Var)) {
            return false;
        }
        if (this.f13962k) {
            int i2 = g1Var.f20580Z;
            if (i2 <= 0 || (i = g1Var.f20582a0) <= 0) {
                return true;
            }
            if (C1216l0.f4526a >= 21) {
                return m28788t(i2, i, g1Var.f20584b0);
            }
            if (i2 * i <= C4148v.m28704M()) {
                z = true;
            }
            if (!z) {
                int i3 = g1Var.f20580Z;
                int i4 = g1Var.f20582a0;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("legacyFrameSize, ");
                sb2.append(i3);
                sb2.append("x");
                sb2.append(i4);
                m28786v(sb2.toString());
            }
            return z;
        }
        if (C1216l0.f4526a >= 21) {
            int i5 = g1Var.f20592i0;
            if (i5 != -1 && !m28797k(i5)) {
                return false;
            }
            int i6 = g1Var.f20591h0;
            if (i6 != -1 && !m28798j(i6)) {
                return false;
            }
        }
        return true;
    }

    public boolean m28794n() {
        if (C1216l0.f4526a >= 29 && "video/x-vnd.on2.vp9".equals(this.f13953b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m28801g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m28793o(C6600g1 g1Var) {
        if (this.f13962k) {
            return this.f13956e;
        }
        Pair<Integer, Integer> p = C4148v.m28684p(g1Var);
        return p != null && ((Integer) p.first).intValue() == 42;
    }

    public boolean m28788t(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13955d;
        if (codecCapabilities == null) {
            m28786v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m28786v("sizeAndRate.vCaps");
            return false;
        } else if (m28804d(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m28782z(this.f13952a) || !m28804d(videoCapabilities, i2, i, d)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.support, ");
                sb2.append(i);
                sb2.append("x");
                sb2.append(i2);
                sb2.append("x");
                sb2.append(d);
                m28786v(sb2.toString());
                return false;
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.rotated, ");
            sb3.append(i);
            sb3.append("x");
            sb3.append(i2);
            sb3.append("x");
            sb3.append(d);
            m28787u(sb3.toString());
            return true;
        }
    }

    public String toString() {
        return this.f13952a;
    }

    public final void m28787u(String str) {
        String str2 = this.f13952a;
        String str3 = this.f13953b;
        String str4 = C1216l0.f4530e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("AssumedSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        C1230s.m37888b("MediaCodecInfo", sb2.toString());
    }

    public final void m28786v(String str) {
        String str2 = this.f13952a;
        String str3 = this.f13953b;
        String str4 = C1216l0.f4530e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        C1230s.m37888b("MediaCodecInfo", sb2.toString());
    }
}
