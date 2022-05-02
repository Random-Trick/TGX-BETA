package p067ed;

import android.os.Build;
import be.C1379j0;
import gd.C4779t2;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;

public class C4183a {
    public static final boolean f14083a;
    public static final int f14084b;
    public static final int f14085c;
    public static final boolean f14086d;
    public static final boolean f14087e;
    public static final boolean f14088f;
    public static final boolean f14089g;
    public static final boolean f14090h;
    public static final boolean f14091i;
    public static final boolean f14092j;
    public static final boolean f14093k;
    public static final boolean f14094l;
    public static final boolean f14095m;
    public static final boolean f14096n;
    public static final boolean f14097o;
    public static final boolean f14098p;
    public static final boolean f14099q;
    public static final boolean f14100r;
    public static final boolean f14101s;
    public static boolean f14102t;
    public static boolean f14103u;
    public static boolean f14104v;
    public static final boolean f14105w;
    public static final boolean f14106x;
    public static final boolean f14107y;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        f14083a = i >= 31;
        f14084b = i >= 23 ? R.id.theme_color_statusBar : R.id.theme_color_statusBarLegacy;
        f14085c = i >= 23 ? R.id.theme_color_statusBarContent : R.id.theme_color_statusBarLegacyContent;
        boolean z2 = i >= 29;
        f14086d = z2;
        f14087e = z2;
        f14088f = i < 23 && i >= 11;
        boolean z3 = i >= 18;
        f14089g = z3;
        f14090h = z3;
        f14091i = !C7389v0.m16612l1(C1379j0.m37318n());
        f14092j = i >= 16;
        f14093k = i >= 21;
        f14094l = i >= 15;
        f14095m = i >= 16;
        f14096n = C4184b.f14110c;
        f14097o = i >= 16;
        f14098p = i >= 18;
        f14099q = i >= 26;
        f14100r = i >= 16;
        f14101s = i >= 30;
        f14102t = i < 26;
        f14103u = false;
        f14104v = true;
        f14105w = i >= 21;
        f14106x = i >= 26;
        if (i >= 21) {
            z = true;
        }
        f14107y = z;
    }

    public static boolean m28618a(TdApi.Document document) {
        String str;
        return (document == null || (str = document.fileName) == null || !str.toLowerCase().endsWith(".tgx-theme")) ? false : true;
    }

    public static boolean m28617b() {
        return false;
    }

    public static boolean m28616c(TdApi.Message message) {
        if (!f14100r || message == null) {
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
            return C4779t2.m25693F3(((TdApi.MessageDocument) message.content).document);
        }
    }
}
