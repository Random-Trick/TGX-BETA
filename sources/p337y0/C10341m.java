package p337y0;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class C10341m {
    public static boolean m5396a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
