package p232q5;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;

public final class C8243c {
    @RecentlyNonNull
    public static String m13053a(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
