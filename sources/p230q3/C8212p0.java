package p230q3;

import android.util.Pair;
import java.util.Map;

public final class C8212p0 {
    public static long m13196a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> m13195b(AbstractC8208o oVar) {
        Map<String, String> d = oVar.mo13203d();
        if (d == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m13196a(d, "LicenseDurationRemaining")), Long.valueOf(m13196a(d, "PlaybackDurationRemaining")));
    }
}
