package l7;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

public class g {
    public static g f16307c;
    public static final SimpleDateFormat f16308d = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences f16309a;
    public final SharedPreferences f16310b;

    public g(Context context) {
        this.f16309a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f16310b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public static synchronized g a(Context context) {
        g gVar;
        synchronized (g.class) {
            if (f16307c == null) {
                f16307c = new g(context);
            }
            gVar = f16307c;
        }
        return gVar;
    }

    public static boolean b(long j10, long j11) {
        Date date = new Date(j10);
        Date date2 = new Date(j11);
        SimpleDateFormat simpleDateFormat = f16308d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public synchronized boolean c(long j10) {
        return d("fire-global", j10);
    }

    public synchronized boolean d(String str, long j10) {
        if (!this.f16309a.contains(str)) {
            this.f16309a.edit().putLong(str, j10).apply();
            return true;
        } else if (!b(this.f16309a.getLong(str, -1L), j10)) {
            return false;
        } else {
            this.f16309a.edit().putLong(str, j10).apply();
            return true;
        }
    }
}
