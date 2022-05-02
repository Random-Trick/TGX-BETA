package p215p2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p198o2.C7535d;
import p323x1.AbstractC10066b;

public class C8001f {
    public final WorkDatabase f26051a;

    public C8001f(WorkDatabase workDatabase) {
        this.f26051a = workDatabase;
    }

    public static void m13802b(Context context, AbstractC10066b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            bVar.mo5390e();
            try {
                bVar.mo5394M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                bVar.mo5394M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                bVar.mo5395K();
            } finally {
                bVar.mo5392V();
            }
        }
    }

    public boolean m13803a() {
        Long b = this.f26051a.mo38440z().mo15715b("reschedule_needed");
        return b != null && b.longValue() == 1;
    }

    public void m13801c(boolean z) {
        this.f26051a.mo38440z().mo15716a(new C7535d("reschedule_needed", z));
    }
}
