package o3;

import a7.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import b7.d;
import c5.l0;
import java.util.Arrays;

public final class f {
    public static final f f18775c = new f(new int[]{2}, 8);
    public static final f f18776d = new f(new int[]{2, 5, 6}, 8);
    public static final int[] f18777e = {5, 6, 18, 17, 14, 7, 8};
    public final int[] f18778a;
    public final int f18779b;

    public static final class a {
        public static int[] a() {
            int[] iArr;
            q.a x10 = q.x();
            for (int i10 : f.f18777e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    x10.a(Integer.valueOf(i10));
                }
            }
            x10.a(2);
            return d.i(x10.h());
        }
    }

    public f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f18778a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f18778a = new int[0];
        }
        this.f18779b = i10;
    }

    public static boolean b() {
        if (l0.f4841a >= 17) {
            String str = l0.f4843c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static f c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static f d(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f18776d;
        }
        if (l0.f4841a >= 29 && (l0.m0(context) || l0.h0(context))) {
            return new f(a.a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f18775c;
        }
        return new f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public int e() {
        return this.f18779b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Arrays.equals(this.f18778a, fVar.f18778a) && this.f18779b == fVar.f18779b;
    }

    public boolean f(int i10) {
        return Arrays.binarySearch(this.f18778a, i10) >= 0;
    }

    public int hashCode() {
        return this.f18779b + (Arrays.hashCode(this.f18778a) * 31);
    }

    public String toString() {
        int i10 = this.f18779b;
        String arrays = Arrays.toString(this.f18778a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", supportedEncodings=");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}
