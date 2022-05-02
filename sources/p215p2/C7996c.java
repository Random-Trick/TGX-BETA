package p215p2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p198o2.C7535d;
import p323x1.AbstractC10066b;

public class C7996c {
    public final WorkDatabase f26042a;

    public C7996c(WorkDatabase workDatabase) {
        this.f26042a = workDatabase;
    }

    public static void m13810a(Context context, AbstractC10066b bVar) {
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

    public int m13809b() {
        int c;
        synchronized (C7996c.class) {
            c = m13808c("next_alarm_manager_id");
        }
        return c;
    }

    public final int m13808c(String str) {
        this.f26042a.m8731c();
        try {
            Long b = this.f26042a.mo38440z().mo15715b(str);
            int i = 0;
            int intValue = b != null ? b.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            m13806e(str, i);
            this.f26042a.m8714t();
            return intValue;
        } finally {
            this.f26042a.m8727g();
        }
    }

    public int m13807d(int i, int i2) {
        synchronized (C7996c.class) {
            int c = m13808c("next_job_scheduler_id");
            if (c >= i && c <= i2) {
                i = c;
            }
            m13806e("next_job_scheduler_id", i + 1);
        }
        return i;
    }

    public final void m13806e(String str, int i) {
        this.f26042a.mo38440z().mo15716a(new C7535d(str, i));
    }
}
