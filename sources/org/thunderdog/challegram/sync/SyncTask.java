package org.thunderdog.challegram.sync;

import android.content.Context;
import androidx.work.C1070b;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import be.C1379j0;
import p071f2.AbstractC4252t;
import p071f2.C4250s;
import p350yd.C10536ab;

public class SyncTask extends Worker {

    public static class C79171 {
        public static final int[] f25712a;

        static {
            int[] iArr = new int[C4250s.EnumC4251a.values().length];
            f25712a = iArr;
            try {
                iArr[C4250s.EnumC4251a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25712a[C4250s.EnumC4251a.ENQUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SyncTask(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static void m14198r(int i) {
        if (i == -1) {
            AbstractC4252t.m28348g(C1379j0.m37318n()).mo27604a("sync");
            return;
        }
        AbstractC4252t g = AbstractC4252t.m28348g(C1379j0.m37318n());
        g.mo27603b("sync:" + i);
    }

    public static void m14197s(long r9, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.sync.SyncTask.m14197s(long, int):void");
    }

    @Override
    public ListenableWorker.AbstractC1060a mo14199q() {
        C1070b g = m38517g();
        long j = g.m38475j("push_id", 0L);
        if (C10536ab.m4723Z1(m38521a(), g.m38477h("account_id", -1), 0, j, !C10536ab.m4677l1(), 0L)) {
            return ListenableWorker.AbstractC1060a.m38508c();
        }
        return ListenableWorker.AbstractC1060a.m38509b();
    }
}
