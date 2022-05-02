package p215p2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p198o2.C7535d;
import p323x1.AbstractC10066b;

public class C7996c {
    public final WorkDatabase f26045a;

    public C7996c(WorkDatabase workDatabase) {
        this.f26045a = workDatabase;
    }

    public static void m13809a(Context context, AbstractC10066b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.mo5390e();
            try {
                bVar.mo5394M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                bVar.mo5394M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                bVar.mo5395K();
            } finally {
                bVar.mo5392V();
            }
        }
    }

    public int m13808b() {
        int c;
        synchronized (C7996c.class) {
            c = m13807c("next_alarm_manager_id");
        }
        return c;
    }

    public final int m13807c(String str) {
        this.f26045a.m8731c();
        try {
            Long b = this.f26045a.mo38443z().mo15715b(str);
            int i = 0;
            int intValue = b != null ? b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            m13805e(str, i);
            this.f26045a.m8714t();
            return intValue;
        } finally {
            this.f26045a.m8727g();
        }
    }

    public int m13806d(int i, int i2) {
        synchronized (C7996c.class) {
            int c = m13807c("next_job_scheduler_id");
            if (c >= i && c <= i2) {
                i = c;
            }
            m13805e("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    public final void m13805e(String str, int i) {
        this.f26045a.mo38443z().mo15716a(new C7535d(str, i));
    }
}
