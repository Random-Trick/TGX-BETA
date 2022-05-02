package ge;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import be.C1379j0;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary;
import com.google.android.exoplayer2.ext.flac.C3454i;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import java.util.ArrayList;
import p309w2.C9951c;
import p309w2.C9956d;

public class C4861c implements C9951c.AbstractC9955d {
    public static volatile boolean f16592b;
    public static volatile C4861c f16593c;
    public ArrayList<String> f16594a;

    public static C4861c m24983c() {
        if (f16593c == null) {
            synchronized (C4861c.class) {
                if (f16593c == null) {
                    f16593c = new C4861c();
                }
            }
        }
        return f16593c;
    }

    public static synchronized boolean m24982d() {
        boolean z;
        synchronized (C4861c.class) {
            if (!f16592b) {
                C9956d i = C9951c.m6435a().m6422i(m24983c());
                ArrayList<String> arrayList = new ArrayList(3);
                arrayList.add("c++_shared");
                arrayList.add("tdjni");
                arrayList.add("leveldbjni");
                arrayList.add("challegram.23");
                for (String str : arrayList) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    i.m6425f(C1379j0.m37318n(), str, "1.304");
                    Log.v(org.thunderdog.challegram.Log.LOG_TAG, "Loaded " + str + " in " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms");
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    OpusLibrary.m30517c(1, new String[0]);
                    VpxLibrary.m30507c(1, new String[0]);
                    C3454i.m30531a(new String[0]);
                    FfmpegLibrary.m30550e(new String[0]);
                }
                f16592b = true;
            }
            z = f16592b;
        }
        return z;
    }

    @Override
    public void mo6431a(String str) {
        synchronized (this) {
            if (this.f16594a == null) {
                this.f16594a = new ArrayList<>();
            }
            this.f16594a.add(str);
        }
    }

    public String m24984b() {
        String str;
        synchronized (this) {
            ArrayList<String> arrayList = this.f16594a;
            if (arrayList == null || arrayList.isEmpty()) {
                str = null;
            } else {
                str = "==== ReLinker ====\n" + TextUtils.join("\n", this.f16594a) + "\n==== ReLinker END ====\n";
            }
            this.f16594a = null;
        }
        return str;
    }
}
