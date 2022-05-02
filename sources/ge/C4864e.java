package ge;

import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import qa.C8298k;
import za.C11452o;

public final class C4864e {
    public static final int m24930a(TdApi.Session session) {
        C8298k.m12934e(session, "<this>");
        return session.apiId == 21724 ? R.drawable.baseline_device_android_x : m24929b(session, "firefox") ? R.drawable.templarian_device_web_firefox : m24929b(session, "opera") ? R.drawable.baseline_device_web_opera : m24929b(session, "edg") ? R.drawable.templarian_device_web_edge : m24929b(session, "chrome") ? R.drawable.templarian_device_web_chrome : m24929b(session, "safari") ? R.drawable.templarian_device_web_safari : m24928c(session, "android") ? R.drawable.baseline_device_android : m24928c(session, "windows") ? R.drawable.baseline_device_windows : m24928c(session, "mac") ? m24929b(session, "macbook") ? R.drawable.baseline_device_macbook : R.drawable.baseline_device_imac : m24928c(session, "ios") ? m24929b(session, "ipad") ? R.drawable.baseline_device_ipad : R.drawable.baseline_device_iphone : R.drawable.baseline_device_other;
    }

    public static final boolean m24929b(TdApi.Session session, String str) {
        String str2 = session.deviceModel;
        C8298k.m12935d(str2, "deviceModel");
        return C11452o.m620A(str2, str, true);
    }

    public static final boolean m24928c(TdApi.Session session, String str) {
        String str2 = session.platform;
        C8298k.m12935d(str2, "platform");
        if (C11452o.m620A(str2, str, true)) {
            return true;
        }
        String str3 = session.systemVersion;
        C8298k.m12935d(str3, "systemVersion");
        return C11452o.m620A(str3, str, true);
    }
}
