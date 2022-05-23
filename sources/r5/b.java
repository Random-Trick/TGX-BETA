package r5;

import androidx.annotation.RecentlyNonNull;
import m5.q;

public final class b {
    public static boolean a(@RecentlyNonNull int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean b(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (!q.a(tArr[i10], t10)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }
}
