package p350yd;

import android.content.Intent;
import android.os.Bundle;
import be.C1379j0;
import java.util.concurrent.TimeUnit;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p193nb.C7316a;

public class C10666fb {
    public final int f34137a;
    public final int f34138b;
    public final long f34139c;
    public final long f34140d;
    public final int f34141e;
    public final int f34142f;
    public final boolean f34143g;
    public final boolean f34144h;
    public final long[] f34145i;
    public final long[] f34146j;

    public C10666fb(int i, int i2) {
        this.f34137a = i;
        this.f34138b = i2;
        this.f34139c = 0L;
        this.f34140d = 0L;
        this.f34141e = 0;
        this.f34142f = 0;
        this.f34143g = false;
        this.f34144h = false;
        this.f34145i = null;
        this.f34146j = null;
    }

    public static long[] m4346a(Bundle bundle, String str) {
        try {
            return bundle.getLongArray(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long[] m4345b(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            if (!(obj instanceof int[])) {
                return null;
            }
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static C10666fb m4342e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i = bundle.getInt("account_id", -1);
        int i2 = bundle.getInt("category", -1);
        long j = bundle.getLong("chat_id");
        long j2 = bundle.getLong("message_thread_id");
        int i3 = bundle.getInt("max_notification_id");
        int i4 = bundle.getInt("notification_group_id");
        boolean z = bundle.getBoolean("need_reply");
        boolean z2 = bundle.getBoolean("mentions");
        long[] a = m4346a(bundle, "message_ids");
        long[] b = m4345b(bundle, "user_ids");
        if (i != -1 && i2 != -1 && j != 0 && i3 != 0 && i4 != 0) {
            return new C10666fb(i, i2, j, j2, i3, i4, z, z2, a, b);
        }
        Log.m14709w("Incomplete notification extras: %s", bundle);
        return null;
    }

    public static C10666fb m4341f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i = bundle.getInt("account_id", -1);
        int i2 = bundle.getInt("category", -1);
        if (i != -1 && i2 != -1) {
            return new C10666fb(i, i2);
        }
        Log.m14709w("Incomplete notification extras: %s", bundle);
        return null;
    }

    public static void m4340g(Intent intent, C10930q6 q6Var, C10711hb hbVar, boolean z, long[] jArr, long[] jArr2) {
        C10609db J = hbVar.m4241J();
        intent.putExtra("account_id", q6Var.m2188w6());
        intent.putExtra("category", hbVar.m4221u());
        intent.putExtra("chat_id", hbVar.m4220v());
        intent.putExtra("message_thread_id", hbVar.m4218x());
        intent.putExtra("max_notification_id", J.m4462j());
        intent.putExtra("notification_group_id", hbVar.m4219w());
        intent.putExtra("need_reply", z);
        intent.putExtra("mentions", hbVar.m4247D());
        intent.putExtra("message_ids", jArr);
        intent.putExtra("user_ids", jArr2);
    }

    public void m4344c(C10930q6 q6Var) {
        q6Var.m2440ga().m3144c2(this);
    }

    public void m4343d(C10930q6 q6Var) {
        boolean h1 = q6Var.m2440ga().m3126h1(this.f34142f);
        int seconds = (int) TimeUnit.HOURS.toSeconds(1L);
        boolean z = this.f34144h;
        int i = R.string.NotificationMutedPerson;
        String str = null;
        if (z) {
            long[] jArr = this.f34146j;
            if (jArr != null) {
                if (h1) {
                    str = jArr.length == 1 ? C4403w.m27867j1(R.string.NotificationMutedPerson, q6Var.m2480e2().m1721K2(this.f34146j[0])) : C4403w.m27846o2(R.string.NotificationMutedPersons, jArr.length);
                }
                for (long j : this.f34146j) {
                    q6Var.m2470ec(j, seconds);
                }
            }
        } else {
            q6Var.m2470ec(this.f34139c, seconds);
            if (h1) {
                if (!C7316a.m17049l(this.f34139c)) {
                    i = R.string.NotificationMutedChat;
                }
                str = C4403w.m27867j1(i, q6Var.m2691Q3(this.f34139c));
            }
        }
        m4344c(q6Var);
        if (h1) {
            C1379j0.m37293z0(str, 0);
        }
    }

    public void m4339h(C10930q6 q6Var) {
        boolean h1 = q6Var.m2440ga().m3126h1(this.f34142f);
        if (this.f34144h) {
            q6Var.m2270r4().m14783o(new TdApi.ReadAllChatMentions(this.f34139c), q6Var.m2214uc());
        } else {
            q6Var.m2716Oa(this.f34139c, this.f34140d, this.f34145i);
        }
        m4344c(q6Var);
        if (h1) {
            C1379j0.m37295y0(this.f34144h ? R.string.NotificationReadMentions : R.string.NotificationRead, 0);
        }
    }

    public C10666fb(int i, int i2, long j, long j2, int i3, int i4, boolean z, boolean z2, long[] jArr, long[] jArr2) {
        this.f34137a = i;
        this.f34138b = i2;
        this.f34139c = j;
        this.f34140d = j2;
        this.f34141e = i3;
        this.f34142f = i4;
        this.f34143g = z;
        this.f34144h = z2;
        this.f34145i = (jArr == null || jArr.length <= 0) ? null : jArr;
        this.f34146j = (jArr2 == null || jArr2.length <= 0) ? null : jArr2;
    }
}
