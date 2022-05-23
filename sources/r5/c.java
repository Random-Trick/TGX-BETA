package r5;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;

public final class c {
    @RecentlyNonNull
    public static String a(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
