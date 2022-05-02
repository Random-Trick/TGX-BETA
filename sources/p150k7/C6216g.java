package p150k7;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C6216g {
    public static C6216g f19626c;
    public static final SimpleDateFormat f19627d = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences f19628a;
    public final SharedPreferences f19629b;

    public C6216g(Context context) {
        this.f19628a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f19629b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public static synchronized C6216g m21059a(Context context) {
        C6216g gVar;
        synchronized (C6216g.class) {
            if (f19626c == null) {
                f19626c = new C6216g(context);
            }
            gVar = f19626c;
        }
        return gVar;
    }

    public static boolean m21058b(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f19627d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public synchronized boolean m21057c(long j) {
        return m21056d("fire-global", j);
    }

    public synchronized boolean m21056d(String str, long j) {
        if (!this.f19628a.contains(str)) {
            this.f19628a.edit().putLong(str, j).apply();
            return true;
        } else if (!m21058b(this.f19628a.getLong(str, -1L), j)) {
            return false;
        } else {
            this.f19628a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
