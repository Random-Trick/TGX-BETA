package e4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import c5.a;
import c5.l0;
import c5.s;
import c5.w;
import m3.q1;
import org.thunderdog.challegram.Log;
import p3.h;

public final class n {
    public final String f10511a;
    public final String f10512b;
    public final String f10513c;
    public final MediaCodecInfo.CodecCapabilities f10514d;
    public final boolean f10515e;
    public final boolean f10516f;
    public final boolean f10517g;
    public final boolean f10518h;
    public final boolean f10519i;
    public final boolean f10520j;
    public final boolean f10521k;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f10511a = (String) a.e(str);
        this.f10512b = str2;
        this.f10513c = str3;
        this.f10514d = codecCapabilities;
        this.f10518h = z10;
        this.f10519i = z11;
        this.f10520j = z12;
        this.f10515e = z13;
        this.f10516f = z14;
        this.f10517g = z15;
        this.f10521k = w.k(str2);
    }

    public static final boolean A(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(l0.f4842b);
    }

    public static n B(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, !z13 && codecCapabilities != null && h(codecCapabilities) && !z(str), codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && q(codecCapabilities)));
    }

    public static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((l0.f4841a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("AssumedMaxChannelAdjustment: ");
        sb2.append(str);
        sb2.append(", [");
        sb2.append(i10);
        sb2.append(" to ");
        sb2.append(i11);
        sb2.append("]");
        s.i("MediaCodecInfo", sb2.toString());
        return i11;
    }

    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(l0.l(i10, widthAlignment) * widthAlignment, l0.l(i11, heightAlignment) * heightAlignment);
    }

    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point c10 = c(videoCapabilities, i10, i11);
        int i12 = c10.x;
        int i13 = c10.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? Log.TAG_CAMERA : intValue >= 120000000 ? Log.TAG_GIF_LOADER : intValue >= 60000000 ? Log.TAG_CRASH : intValue >= 30000000 ? Log.TAG_YOUTUBE : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return l0.f4841a >= 19 && i(codecCapabilities);
    }

    public static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return l0.f4841a >= 21 && r(codecCapabilities);
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return l0.f4841a >= 21 && t(codecCapabilities);
    }

    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean y(String str) {
        return l0.f4844d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean z(String str) {
        if (l0.f4841a <= 22) {
            String str2 = l0.f4844d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10514d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public h e(q1 q1Var, q1 q1Var2) {
        int i10 = !l0.c(q1Var.U, q1Var2.U) ? 8 : 0;
        if (this.f10521k) {
            if (q1Var.f16903c0 != q1Var2.f16903c0) {
                i10 |= Log.TAG_CAMERA;
            }
            if (!this.f10515e && !(q1Var.Z == q1Var2.Z && q1Var.f16899a0 == q1Var2.f16899a0)) {
                i10 |= Log.TAG_GIF_LOADER;
            }
            if (!l0.c(q1Var.f16907g0, q1Var2.f16907g0)) {
                i10 |= Log.TAG_VOICE;
            }
            if (y(this.f10511a) && !q1Var.g(q1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new h(this.f10511a, q1Var, q1Var2, q1Var.g(q1Var2) ? 3 : 2, 0);
            }
        } else {
            if (q1Var.f16908h0 != q1Var2.f16908h0) {
                i10 |= Log.TAG_EMOJI;
            }
            if (q1Var.f16909i0 != q1Var2.f16909i0) {
                i10 |= Log.TAG_LUX;
            }
            if (q1Var.f16910j0 != q1Var2.f16910j0) {
                i10 |= Log.TAG_VIDEO;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f10512b)) {
                Pair<Integer, Integer> q10 = v.q(q1Var);
                Pair<Integer, Integer> q11 = v.q(q1Var2);
                if (!(q10 == null || q11 == null)) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new h(this.f10511a, q1Var, q1Var2, 3, 0);
                    }
                }
            }
            if (!q1Var.g(q1Var2)) {
                i10 |= 32;
            }
            if (x(this.f10512b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new h(this.f10511a, q1Var, q1Var2, 1, 0);
            }
        }
        return new h(this.f10511a, q1Var, q1Var2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10514d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10514d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        } else if (a(this.f10511a, this.f10512b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("channelCount.support, ");
            sb2.append(i10);
            w(sb2.toString());
            return false;
        }
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10514d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("sampleRate.support, ");
            sb2.append(i10);
            w(sb2.toString());
            return false;
        }
    }

    public final boolean l(q1 q1Var) {
        Pair<Integer, Integer> q10;
        if (q1Var.R == null || (q10 = v.q(q1Var)) == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(q1Var.U)) {
            if ("video/avc".equals(this.f10512b)) {
                intValue = 8;
            } else if ("video/hevc".equals(this.f10512b)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!(this.f10521k || intValue == 42)) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g10 = g();
        if (l0.f4841a <= 23 && "video/x-vnd.on2.vp9".equals(this.f10512b) && g10.length == 0) {
            g10 = f(this.f10514d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g10) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        String str = q1Var.R;
        String str2 = this.f10513c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        w(sb2.toString());
        return false;
    }

    public boolean m(q1 q1Var) {
        int i10;
        boolean z10 = false;
        if (!o(q1Var) || !l(q1Var)) {
            return false;
        }
        if (this.f10521k) {
            int i11 = q1Var.Z;
            if (i11 <= 0 || (i10 = q1Var.f16899a0) <= 0) {
                return true;
            }
            if (l0.f4841a >= 21) {
                return u(i11, i10, q1Var.f16901b0);
            }
            if (i11 * i10 <= v.N()) {
                z10 = true;
            }
            if (!z10) {
                int i12 = q1Var.Z;
                int i13 = q1Var.f16899a0;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("legacyFrameSize, ");
                sb2.append(i12);
                sb2.append("x");
                sb2.append(i13);
                w(sb2.toString());
            }
            return z10;
        }
        if (l0.f4841a >= 21) {
            int i14 = q1Var.f16909i0;
            if (i14 != -1 && !k(i14)) {
                return false;
            }
            int i15 = q1Var.f16908h0;
            if (i15 != -1 && !j(i15)) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        if (l0.f4841a >= 29 && "video/x-vnd.on2.vp9".equals(this.f10512b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(q1 q1Var) {
        return this.f10512b.equals(q1Var.U) || this.f10512b.equals(v.m(q1Var));
    }

    public boolean p(q1 q1Var) {
        if (this.f10521k) {
            return this.f10515e;
        }
        Pair<Integer, Integer> q10 = v.q(q1Var);
        return q10 != null && ((Integer) q10.first).intValue() == 42;
    }

    public String toString() {
        return this.f10511a;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10514d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        } else if (d(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 >= i11 || !A(this.f10511a) || !d(videoCapabilities, i11, i10, d10)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.support, ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(d10);
                w(sb2.toString());
                return false;
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.rotated, ");
            sb3.append(i10);
            sb3.append("x");
            sb3.append(i11);
            sb3.append("x");
            sb3.append(d10);
            v(sb3.toString());
            return true;
        }
    }

    public final void v(String str) {
        String str2 = this.f10511a;
        String str3 = this.f10512b;
        String str4 = l0.f4845e;
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
        s.b("MediaCodecInfo", sb2.toString());
    }

    public final void w(String str) {
        String str2 = this.f10511a;
        String str3 = this.f10512b;
        String str4 = l0.f4845e;
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
        s.b("MediaCodecInfo", sb2.toString());
    }
}
