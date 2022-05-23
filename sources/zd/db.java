package zd;

import android.content.Intent;
import android.os.Bundle;
import ce.j0;
import gd.w;
import java.util.concurrent.TimeUnit;
import ob.a;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class db {
    public final int f27394a;
    public final int f27395b;
    public final long f27396c;
    public final long f27397d;
    public final int f27398e;
    public final int f27399f;
    public final boolean f27400g;
    public final boolean f27401h;
    public final long[] f27402i;
    public final long[] f27403j;

    public db(int i10, int i11) {
        this.f27394a = i10;
        this.f27395b = i11;
        this.f27396c = 0L;
        this.f27397d = 0L;
        this.f27398e = 0;
        this.f27399f = 0;
        this.f27400g = false;
        this.f27401h = false;
        this.f27402i = null;
        this.f27403j = null;
    }

    public static long[] a(Bundle bundle, String str) {
        try {
            return bundle.getLongArray(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long[] b(Bundle bundle, String str) {
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
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static db e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i10 = bundle.getInt("account_id", -1);
        int i11 = bundle.getInt("category", -1);
        long j10 = bundle.getLong("chat_id");
        long j11 = bundle.getLong("message_thread_id");
        int i12 = bundle.getInt("max_notification_id");
        int i13 = bundle.getInt("notification_group_id");
        boolean z10 = bundle.getBoolean("need_reply");
        boolean z11 = bundle.getBoolean("mentions");
        long[] a10 = a(bundle, "message_ids");
        long[] b10 = b(bundle, "user_ids");
        if (i10 != -1 && i11 != -1 && j10 != 0 && i12 != 0 && i13 != 0) {
            return new db(i10, i11, j10, j11, i12, i13, z10, z11, a10, b10);
        }
        Log.w("Incomplete notification extras: %s", bundle);
        return null;
    }

    public static db f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i10 = bundle.getInt("account_id", -1);
        int i11 = bundle.getInt("category", -1);
        if (i10 != -1 && i11 != -1) {
            return new db(i10, i11);
        }
        Log.w("Incomplete notification extras: %s", bundle);
        return null;
    }

    public static void g(Intent intent, o6 o6Var, fb fbVar, boolean z10, long[] jArr, long[] jArr2) {
        bb J = fbVar.J();
        intent.putExtra("account_id", o6Var.A6());
        intent.putExtra("category", fbVar.u());
        intent.putExtra("chat_id", fbVar.v());
        intent.putExtra("message_thread_id", fbVar.x());
        intent.putExtra("max_notification_id", J.j());
        intent.putExtra("notification_group_id", fbVar.w());
        intent.putExtra("need_reply", z10);
        intent.putExtra("mentions", fbVar.D());
        intent.putExtra("message_ids", jArr);
        intent.putExtra("user_ids", jArr2);
    }

    public void c(o6 o6Var) {
        o6Var.ka().c2(this);
    }

    public void d(o6 o6Var) {
        boolean h12 = o6Var.ka().h1(this.f27399f);
        int seconds = (int) TimeUnit.HOURS.toSeconds(1L);
        boolean z10 = this.f27401h;
        int i10 = R.string.NotificationMutedPerson;
        String str = null;
        if (z10) {
            long[] jArr = this.f27403j;
            if (jArr != null) {
                if (h12) {
                    str = jArr.length == 1 ? w.j1(R.string.NotificationMutedPerson, o6Var.e2().J2(this.f27403j[0])) : w.o2(R.string.NotificationMutedPersons, jArr.length);
                }
                for (long j10 : this.f27403j) {
                    o6Var.ic(j10, seconds);
                }
            }
        } else {
            o6Var.ic(this.f27396c, seconds);
            if (h12) {
                if (!a.l(this.f27396c)) {
                    i10 = R.string.NotificationMutedChat;
                }
                str = w.j1(i10, o6Var.U3(this.f27396c));
            }
        }
        c(o6Var);
        if (h12) {
            j0.z0(str, 0);
        }
    }

    public void h(o6 o6Var) {
        boolean h12 = o6Var.ka().h1(this.f27399f);
        if (this.f27401h) {
            o6Var.v4().o(new TdApi.ReadAllChatMentions(this.f27396c), o6Var.yc());
        } else {
            o6Var.Sa(this.f27396c, this.f27397d, this.f27402i);
        }
        c(o6Var);
        if (h12) {
            j0.y0(this.f27401h ? R.string.NotificationReadMentions : R.string.NotificationRead, 0);
        }
    }

    public db(int i10, int i11, long j10, long j11, int i12, int i13, boolean z10, boolean z11, long[] jArr, long[] jArr2) {
        this.f27394a = i10;
        this.f27395b = i11;
        this.f27396c = j10;
        this.f27397d = j11;
        this.f27398e = i12;
        this.f27399f = i13;
        this.f27400g = z10;
        this.f27401h = z11;
        this.f27402i = (jArr == null || jArr.length <= 0) ? null : jArr;
        this.f27403j = (jArr2 == null || jArr2.length <= 0) ? null : jArr2;
    }
}
