package he;

import ab.o;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ra.k;

public final class e {
    public static final int a(TdApi.Session session) {
        k.e(session, "<this>");
        return session.apiId == 21724 ? R.drawable.baseline_device_android_x : b(session, "firefox") ? R.drawable.templarian_device_web_firefox : b(session, "opera") ? R.drawable.baseline_device_web_opera : b(session, "edg") ? R.drawable.templarian_device_web_edge : b(session, "chrome") ? R.drawable.templarian_device_web_chrome : b(session, "safari") ? R.drawable.templarian_device_web_safari : c(session, "android") ? R.drawable.baseline_device_android : c(session, "windows") ? R.drawable.baseline_device_windows : c(session, "mac") ? b(session, "macbook") ? R.drawable.baseline_device_macbook : R.drawable.baseline_device_imac : c(session, "ios") ? b(session, "ipad") ? R.drawable.baseline_device_ipad : R.drawable.baseline_device_iphone : R.drawable.baseline_device_other;
    }

    public static final boolean b(TdApi.Session session, String str) {
        String str2 = session.deviceModel;
        k.d(str2, "deviceModel");
        return o.A(str2, str, true);
    }

    public static final boolean c(TdApi.Session session, String str) {
        String str2 = session.platform;
        k.d(str2, "platform");
        if (o.A(str2, str, true)) {
            return true;
        }
        String str3 = session.systemVersion;
        k.d(str3, "systemVersion");
        return o.A(str3, str, true);
    }
}
