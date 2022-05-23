package p2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import o2.d;
import x1.b;

public class f {
    public final WorkDatabase f20419a;

    public f(WorkDatabase workDatabase) {
        this.f20419a = workDatabase;
    }

    public static void b(Context context, b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            bVar.e();
            try {
                bVar.N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                bVar.N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                bVar.L();
            } finally {
                bVar.W();
            }
        }
    }

    public boolean a() {
        Long b10 = this.f20419a.z().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f20419a.z().a(new d("reschedule_needed", z10));
    }
}
