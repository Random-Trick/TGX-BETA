package ad;

import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import be.C1379j0;
import org.thunderdog.challegram.Log;
import p037cb.C2059c;
import p313w6.EnumC9986b;

public class C0264f {
    public static String m41977a(int i) {
        int i2;
        StringBuilder sb2 = new StringBuilder(5);
        int i3 = i / 60;
        if (i3 > 60) {
            i2 = i3 / 60;
            i3 %= 60;
        } else {
            i2 = 0;
        }
        int i4 = i % 60;
        if (i2 > 0) {
            sb2.append(i2);
            sb2.append(':');
        }
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        sb2.append(':');
        if (i4 < 10) {
            sb2.append('0');
        }
        sb2.append(i4);
        return sb2.toString();
    }

    public static String m41976b(EnumC9986b bVar) {
        return bVar == null ? "NULL" : EnumC9986b.CLIENT_LIBRARY_UPDATE_REQUIRED.equals(bVar) ? "Client library update required" : EnumC9986b.DEVELOPER_KEY_INVALID.equals(bVar) ? "Developer key invalid" : EnumC9986b.ERROR_CONNECTING_TO_SERVICE.equals(bVar) ? "Connection error" : EnumC9986b.INTERNAL_ERROR.equals(bVar) ? "Internal error" : EnumC9986b.INVALID_APPLICATION_SIGNATURE.equals(bVar) ? "Invalid application signature" : EnumC9986b.NETWORK_ERROR.equals(bVar) ? "Network error" : EnumC9986b.SERVICE_DISABLED.equals(bVar) ? "YouTube App is disabled.\nEnable at Settings -> Applications -> YouTube." : EnumC9986b.SERVICE_INVALID.equals(bVar) ? "Service is invalid" : EnumC9986b.SERVICE_MISSING.equals(bVar) ? "YouTube app is not installed." : EnumC9986b.SERVICE_VERSION_UPDATE_REQUIRED.equals(bVar) ? "YouTube app update required" : EnumC9986b.UNKNOWN_ERROR.equals(bVar) ? "Unknown error" : bVar.name();
    }

    public static boolean m41975c() {
        return C2059c.m35733b(C1379j0.m37312q(), "com.google.android.youtube");
    }

    public static String m41974d(String str) {
        int i;
        int i2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("youtu.be/");
        if (indexOf == -1 || str.length() <= (i2 = indexOf + 9)) {
            int indexOf2 = str.indexOf("youtube.com/watch?");
            if (indexOf2 != -1 && str.length() > (i = indexOf2 + 18)) {
                for (String str2 : str.substring(i).split("&")) {
                    String[] split = str2.split("=");
                    if (split.length == 2 && "v".equals(split[0])) {
                        return split[1];
                    }
                }
            }
            return null;
        }
        String substring = str.substring(i2);
        int indexOf3 = substring.indexOf(63);
        if (indexOf3 != -1) {
            substring = substring.substring(0, indexOf3);
        }
        if (substring.length() > 0) {
            return substring;
        }
        return null;
    }

    public static void m41973e(ProgressBar progressBar) {
        if (Build.VERSION.SDK_INT >= 21) {
            progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
    }

    public static void m41972f(View view) {
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof ProgressBar) {
                        m41973e((ProgressBar) childAt);
                    }
                    if (childAt instanceof ImageView) {
                        childAt.setVisibility(4);
                    }
                    m41972f(childAt);
                }
            }
        } catch (Throwable th) {
            Log.m14712w(Log.TAG_YOUTUBE, "Cannot patch youtube player", th, new Object[0]);
        }
    }
}
