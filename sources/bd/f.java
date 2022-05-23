package bd;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ce.j0;
import db.c;
import org.thunderdog.challegram.Log;
import x6.b;

public class f {
    public static String a(int i10) {
        int i11;
        StringBuilder sb2 = new StringBuilder(5);
        int i12 = i10 / 60;
        if (i12 > 60) {
            i11 = i12 / 60;
            i12 %= 60;
        } else {
            i11 = 0;
        }
        int i13 = i10 % 60;
        if (i11 > 0) {
            sb2.append(i11);
            sb2.append(':');
        }
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        sb2.append(':');
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        return sb2.toString();
    }

    public static String b(b bVar) {
        return bVar == null ? "NULL" : b.CLIENT_LIBRARY_UPDATE_REQUIRED.equals(bVar) ? "Client library update required" : b.DEVELOPER_KEY_INVALID.equals(bVar) ? "Developer key invalid" : b.ERROR_CONNECTING_TO_SERVICE.equals(bVar) ? "Connection error" : b.INTERNAL_ERROR.equals(bVar) ? "Internal error" : b.INVALID_APPLICATION_SIGNATURE.equals(bVar) ? "Invalid application signature" : b.NETWORK_ERROR.equals(bVar) ? "Network error" : b.SERVICE_DISABLED.equals(bVar) ? "YouTube App is disabled.\nEnable at Settings -> Applications -> YouTube." : b.SERVICE_INVALID.equals(bVar) ? "Service is invalid" : b.SERVICE_MISSING.equals(bVar) ? "YouTube app is not installed." : b.SERVICE_VERSION_UPDATE_REQUIRED.equals(bVar) ? "YouTube app update required" : b.UNKNOWN_ERROR.equals(bVar) ? "Unknown error" : bVar.name();
    }

    public static boolean c() {
        return c.b(j0.q(), "com.google.android.youtube");
    }

    public static String d(String str) {
        int i10;
        int i11;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("youtu.be/");
        if (indexOf == -1 || str.length() <= (i11 = indexOf + 9)) {
            int indexOf2 = str.indexOf("youtube.com/watch?");
            if (indexOf2 != -1 && str.length() > (i10 = indexOf2 + 18)) {
                for (String str2 : str.substring(i10).split("&")) {
                    String[] split = str2.split("=");
                    if (split.length == 2 && "v".equals(split[0])) {
                        return split[1];
                    }
                }
            }
            return null;
        }
        String substring = str.substring(i11);
        int indexOf3 = substring.indexOf(63);
        if (indexOf3 != -1) {
            substring = substring.substring(0, indexOf3);
        }
        if (substring.length() > 0) {
            return substring;
        }
        return null;
    }

    public static void e(ProgressBar progressBar) {
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void f(View view) {
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof ProgressBar) {
                        e((ProgressBar) childAt);
                    }
                    if (childAt instanceof ImageView) {
                        childAt.setVisibility(4);
                    }
                    f(childAt);
                }
            }
        } catch (Throwable th) {
            Log.w(Log.TAG_YOUTUBE, "Cannot patch youtube player", th, new Object[0]);
        }
    }
}
