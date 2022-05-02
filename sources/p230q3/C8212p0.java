package p230q3;

import android.util.Pair;
import java.util.Map;

public final class C8212p0 {
    public static long m13197a(Map<String, String> map, String str) {
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

    public static Pair<Long, Long> m13196b(AbstractC8208o oVar) {
        Map<String, String> d = oVar.mo13204d();
        if (d == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m13197a(d, "LicenseDurationRemaining")), Long.valueOf(m13197a(d, "PlaybackDurationRemaining")));
    }
}
