package zd;

import java.util.ArrayList;
import jb.f;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.b1;
import zd.t7;

public abstract class wj extends b1<Long> implements t7.i, t7.j {
    public final f U = new f();

    public interface a extends b1.b<Long> {
    }

    public wj(o6 o6Var, int i10, int i11, a aVar) {
        super(o6Var, i10, i11, false, aVar);
    }

    public void g0(long j10) {
        int w10 = w(Long.valueOf(j10));
        if (w10 != -1) {
            M(w10, 1);
        }
    }

    public void h0(long j10) {
        int w10 = w(Long.valueOf(j10));
        if (w10 != -1) {
            M(w10, 2);
        }
    }

    public void i0(TdApi.User user) {
        int w10 = w(Long.valueOf(user.f19979id));
        if (w10 != -1) {
            M(w10, 0);
        }
    }

    public void k0(long j10, Runnable runnable) {
        if (this.U.m(j10)) {
            runnable.run();
        }
    }

    @Override
    public void A3(final long j10, TdApi.UserStatus userStatus, boolean z10) {
        l0(j10, new Runnable() {
            @Override
            public final void run() {
                wj.this.h0(j10);
            }
        });
    }

    @Override
    public void M1(final TdApi.User user) {
        l0(user.f19979id, new Runnable() {
            @Override
            public final void run() {
                wj.this.i0(user);
            }
        });
    }

    @Override
    public b1.c<Long> U(TdApi.Object object, Client.g gVar, int i10, boolean z10) {
        TdApi.Users users = (TdApi.Users) object;
        long[] jArr = users.userIds;
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            if (this.U.f(j10)) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return new b1.c<>(arrayList, users.totalCount);
    }

    @Override
    public void a0() {
        this.f27260a.e2().I(this);
    }

    @Override
    public void b0() {
        this.f27260a.e2().L1(this);
    }

    public final void l0(final long j10, final Runnable runnable) {
        Y(new Runnable() {
            @Override
            public final void run() {
                wj.this.k0(j10, runnable);
            }
        });
    }

    @Override
    public boolean u3() {
        return false;
    }

    @Override
    public void u7(final long j10, TdApi.UserFullInfo userFullInfo) {
        l0(j10, new Runnable() {
            @Override
            public final void run() {
                wj.this.g0(j10);
            }
        });
    }
}
