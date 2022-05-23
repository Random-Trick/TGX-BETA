package x0;

import android.net.ConnectivityManager;

public final class a {
    public static boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
