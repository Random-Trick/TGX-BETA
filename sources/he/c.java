package he;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import ce.j0;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary;
import com.google.android.exoplayer2.ext.flac.i;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import java.util.ArrayList;
import w2.c;
import w2.d;

public class c implements c.d {
    public static volatile boolean f13810b;
    public static volatile c f13811c;
    public ArrayList<String> f13812a;

    public static c c() {
        if (f13811c == null) {
            synchronized (c.class) {
                if (f13811c == null) {
                    f13811c = new c();
                }
            }
        }
        return f13811c;
    }

    public static synchronized boolean d() {
        boolean z10;
        synchronized (c.class) {
            if (!f13810b) {
                d i10 = w2.c.a().i(c());
                ArrayList<String> arrayList = new ArrayList(3);
                arrayList.add("c++_shared");
                arrayList.add("tdjni");
                arrayList.add("leveldbjni");
                arrayList.add("challegram.23");
                for (String str : arrayList) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    i10.f(j0.n(), str, "1.305");
                    Log.v(org.thunderdog.challegram.Log.LOG_TAG, "Loaded " + str + " in " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms");
                }
                OpusLibrary.c(1, new String[0]);
                VpxLibrary.c(1, new String[0]);
                i.a(new String[0]);
                FfmpegLibrary.e(new String[0]);
                f13810b = true;
            }
            z10 = f13810b;
        }
        return z10;
    }

    @Override
    public void a(String str) {
        synchronized (this) {
            if (this.f13812a == null) {
                this.f13812a = new ArrayList<>();
            }
            this.f13812a.add(str);
        }
    }

    public String b() {
        String str;
        synchronized (this) {
            ArrayList<String> arrayList = this.f13812a;
            if (arrayList == null || arrayList.isEmpty()) {
                str = null;
            } else {
                str = "==== ReLinker ====\n" + TextUtils.join("\n", this.f13812a) + "\n==== ReLinker END ====\n";
            }
            this.f13812a = null;
        }
        return str;
    }
}
