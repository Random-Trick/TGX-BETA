package ad;

import hd.s4;
import org.drinkless.td.libcore.telegram.TdApi;
import tc.o;
import tc.y1;
import ud.v4;

public class x extends y1 {
    public o<?> M0;

    public interface a<VC extends o<?>> {
        VC a(x xVar);
    }

    public x(v4<?> v4Var) {
        super(v4Var);
    }

    public static o D3(TdApi.ChatInviteLinkInfo chatInviteLinkInfo, Runnable runnable, x xVar) {
        return new ad.a(xVar, chatInviteLinkInfo, runnable);
    }

    public static o E3(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo, x xVar) {
        return new r(xVar, j10, chatJoinRequestsInfo);
    }

    public static o F3(s4 s4Var, long[] jArr, x xVar) {
        return new s(xVar, s4Var, jArr);
    }

    public static void G3(v4<?> v4Var, a<?> aVar) {
        final x xVar = new x(v4Var);
        ?? a10 = aVar.a(xVar);
        a10.fd(new Runnable() {
            @Override
            public final void run() {
                x.this.v3();
            }
        });
        xVar.setController(a10);
        xVar.u2();
    }

    public static void H3(v4<?> v4Var, final TdApi.ChatInviteLinkInfo chatInviteLinkInfo, final Runnable runnable) {
        J3(v4Var, new a() {
            @Override
            public final o a(x xVar) {
                o D3;
                D3 = x.D3(TdApi.ChatInviteLinkInfo.this, runnable, xVar);
                return D3;
            }
        });
    }

    public static void I3(v4<?> v4Var, final long j10, final TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        G3(v4Var, new a() {
            @Override
            public final o a(x xVar) {
                o E3;
                E3 = x.E3(j10, chatJoinRequestsInfo, xVar);
                return E3;
            }
        });
    }

    public static void J3(v4<?> v4Var, a<?> aVar) {
        x xVar = new x(v4Var);
        xVar.setController(aVar.a(xVar));
        xVar.u2();
        xVar.v3();
    }

    public static void L3(v4<?> v4Var, final s4 s4Var, final long[] jArr) {
        J3(v4Var, new a() {
            @Override
            public final o a(x xVar) {
                o F3;
                F3 = x.F3(s4.this, jArr, xVar);
                return F3;
            }
        });
    }

    @Override
    public o<?> j2(int i10) {
        return this.M0;
    }

    public void setController(o<?> oVar) {
        oVar.get();
        this.M0 = oVar;
    }
}
