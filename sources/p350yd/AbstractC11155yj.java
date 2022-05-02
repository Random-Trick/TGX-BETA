package p350yd;

import java.util.ArrayList;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p124ib.C5323f;
import p350yd.AbstractC10596d1;
import p350yd.C11059v7;

public abstract class AbstractC11155yj extends AbstractC10596d1<Long> implements C11059v7.AbstractC11068i, C11059v7.AbstractC11069j {
    public final C5323f f35788U = new C5323f();

    public interface AbstractC11156a extends AbstractC10596d1.AbstractC10598b<Long> {
    }

    public AbstractC11155yj(C10930q6 q6Var, int i, int i2, AbstractC11156a aVar) {
        super(q6Var, i, i2, false, aVar);
    }

    public void m1340g0(long j) {
        int w = m4492w(Long.valueOf(j));
        if (w != -1) {
            m4513M(w, 1);
        }
    }

    public void m1339h0(long j) {
        int w = m4492w(Long.valueOf(j));
        if (w != -1) {
            m4513M(w, 2);
        }
    }

    public void m1338i0(TdApi.User user) {
        int w = m4492w(Long.valueOf(user.f25442id));
        if (w != -1) {
            m4513M(w, 0);
        }
    }

    public void m1337j0(long j, Runnable runnable) {
        if (this.f35788U.m23261m(j)) {
            runnable.run();
        }
    }

    @Override
    public boolean mo1350D3() {
        return false;
    }

    @Override
    public void mo1349J3(final long j, TdApi.UserStatus userStatus, boolean z) {
        m1336k0(j, new Runnable() {
            @Override
            public final void run() {
                AbstractC11155yj.this.m1339h0(j);
            }
        });
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        m1336k0(user.f25442id, new Runnable() {
            @Override
            public final void run() {
                AbstractC11155yj.this.m1338i0(user);
            }
        });
    }

    @Override
    public AbstractC10596d1.C10599c<Long> mo1347U(TdApi.Object object, Client.AbstractC7865g gVar, int i, boolean z) {
        TdApi.Users users = (TdApi.Users) object;
        long[] jArr = users.userIds;
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            if (this.f35788U.m23263h(j)) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return new AbstractC10596d1.C10599c<>(arrayList, users.totalCount);
    }

    @Override
    public void mo1346a0() {
        this.f33975a.m2480e2().m1732I(this);
    }

    @Override
    public void mo1345b0() {
        this.f33975a.m2480e2().m1710N1(this);
    }

    public final void m1336k0(final long j, final Runnable runnable) {
        m4503Y(new Runnable() {
            @Override
            public final void run() {
                AbstractC11155yj.this.m1337j0(j, runnable);
            }
        });
    }

    @Override
    public void mo1335u7(final long j, TdApi.UserFullInfo userFullInfo) {
        m1336k0(j, new Runnable() {
            @Override
            public final void run() {
                AbstractC11155yj.this.m1340g0(j);
            }
        });
    }
}
