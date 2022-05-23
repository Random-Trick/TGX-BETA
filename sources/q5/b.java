package q5;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;

@Deprecated
public class b {
    @RecentlyNonNull
    public static String a(@RecentlyNonNull PowerManager.WakeLock wakeLock, @RecentlyNonNull String str) {
        String valueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
