package p199o3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import java.util.Arrays;
import p008a7.C0199c;
import p020b5.C1216l0;
import p358z6.AbstractC11396q;

public final class C7606f {
    public static final C7606f f24338c = new C7606f(new int[]{2}, 8);
    public static final C7606f f24339d = new C7606f(new int[]{2, 5, 6}, 8);
    public static final int[] f24340e = {5, 6, 18, 17, 14, 7, 8};
    public final int[] f24341a;
    public final int f24342b;

    public static final class C7607a {
        public static int[] m15520a() {
            int[] iArr;
            AbstractC11396q.C11397a x = AbstractC11396q.m760x();
            for (int i : C7606f.f24340e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    x.m757d(Integer.valueOf(i));
                }
            }
            x.m757d(2);
            return C0199c.m42097i(x.m756e());
        }
    }

    public C7606f(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f24341a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f24341a = new int[0];
        }
        this.f24342b = i;
    }

    public static boolean m15525b() {
        if (C1216l0.f4526a >= 17) {
            String str = C1216l0.f4528c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static C7606f m15524c(Context context) {
        return m15523d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static C7606f m15523d(Context context, Intent intent) {
        if (m15525b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f24339d;
        }
        if (C1216l0.f4526a >= 29 && (C1216l0.m37963l0(context) || C1216l0.m37973g0(context))) {
            return new C7606f(C7607a.m15520a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f24338c;
        }
        return new C7606f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public int m15522e() {
        return this.f24342b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7606f)) {
            return false;
        }
        C7606f fVar = (C7606f) obj;
        return Arrays.equals(this.f24341a, fVar.f24341a) && this.f24342b == fVar.f24342b;
    }

    public boolean m15521f(int i) {
        return Arrays.binarySearch(this.f24341a, i) >= 0;
    }

    public int hashCode() {
        return this.f24342b + (Arrays.hashCode(this.f24341a) * 31);
    }

    public String toString() {
        int i = this.f24342b;
        String arrays = Arrays.toString(this.f24341a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i);
        sb2.append(", supportedEncodings=");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}
