package org.thunderdog.challegram.sync;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import ce.j0;
import f2.s;
import f2.t;
import zd.ya;

public class SyncTask extends Worker {

    public static class AnonymousClass1 {
        public static final int[] f20148a;

        static {
            int[] iArr = new int[s.a.values().length];
            f20148a = iArr;
            try {
                iArr[s.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20148a[s.a.ENQUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SyncTask(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static void r(int i10) {
        if (i10 == -1) {
            t.g(j0.n()).a("sync");
            return;
        }
        t g10 = t.g(j0.n());
        g10.b("sync:" + i10);
    }

    public static void s(long r9, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.sync.SyncTask.s(long, int):void");
    }

    @Override
    public ListenableWorker.a q() {
        b g10 = g();
        long j10 = g10.j("push_id", 0L);
        if (ya.Z1(a(), g10.h("account_id", -1), 0, j10, !ya.l1(), 0L)) {
            return ListenableWorker.a.c();
        }
        return ListenableWorker.a.b();
    }
}
