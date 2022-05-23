package fd;

import android.os.Build;
import ce.j0;
import hd.t2;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;

public class a {
    public static final boolean f11879a;
    public static final int f11880b;
    public static final int f11881c;
    public static final boolean f11882d;
    public static final boolean f11883e;
    public static final boolean f11884f;
    public static final boolean f11885g;
    public static final boolean f11886h;
    public static final boolean f11887i;
    public static final boolean f11888j;
    public static final boolean f11889k;
    public static final boolean f11890l;
    public static final boolean f11891m;
    public static final boolean f11892n;
    public static final boolean f11893o;
    public static final boolean f11894p;
    public static final boolean f11895q;
    public static final boolean f11896r;
    public static final boolean f11897s;
    public static boolean f11898t;
    public static boolean f11899u;
    public static boolean f11900v;
    public static final boolean f11901w;
    public static final boolean f11902x;
    public static final boolean f11903y;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        f11879a = i10 >= 31;
        f11880b = i10 >= 23 ? R.id.theme_color_statusBar : R.id.theme_color_statusBarLegacy;
        f11881c = i10 >= 23 ? R.id.theme_color_statusBarContent : R.id.theme_color_statusBarLegacyContent;
        boolean z11 = i10 >= 29;
        f11882d = z11;
        f11883e = z11;
        f11884f = i10 < 23;
        f11885g = true;
        f11886h = true;
        f11887i = !v0.l1(j0.n());
        f11888j = true;
        f11889k = true;
        f11890l = true;
        f11891m = true;
        f11892n = b.f11906c;
        f11893o = true;
        f11894p = true;
        f11895q = i10 >= 26;
        f11896r = true;
        f11897s = i10 >= 30;
        f11898t = i10 < 26;
        f11899u = false;
        f11900v = true;
        f11901w = true;
        if (i10 >= 26) {
            z10 = true;
        }
        f11902x = z10;
        f11903y = true;
    }

    public static boolean a(TdApi.Document document) {
        String str;
        return (document == null || (str = document.fileName) == null || !str.toLowerCase().endsWith(".tgx-theme")) ? false : true;
    }

    public static boolean b() {
        return false;
    }

    public static boolean c(TdApi.Message message) {
        if (!f11896r || message == null) {
            return false;
        }
        int constructor = message.content.getConstructor();
        if (constructor == 276722716) {
            TdApi.RemoteFile remoteFile = ((TdApi.MessageAudio) message.content).audio.audio.remote;
            return remoteFile == null || !remoteFile.isUploadingActive;
        } else if (constructor == 527777781) {
            TdApi.RemoteFile remoteFile2 = ((TdApi.MessageVoiceNote) message.content).voiceNote.voice.remote;
            return remoteFile2 == null || !remoteFile2.isUploadingActive;
        } else if (constructor != 596945783) {
            return false;
        } else {
            return t2.F3(((TdApi.MessageDocument) message.content).document);
        }
    }
}
