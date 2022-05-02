package p363zc;

import gd.AbstractC4761s4;
import org.drinkless.p210td.libcore.telegram.TdApi;
import sc.AbstractC8809o;
import sc.View$OnClickListenerC8851y1;
import td.AbstractC9323v4;

public class C11504x extends View$OnClickListenerC8851y1 {
    public AbstractC8809o<?> f36521M0;

    public interface AbstractC11505a<VC extends AbstractC8809o<?>> {
        VC mo380a(C11504x xVar);
    }

    public C11504x(AbstractC9323v4<?> v4Var) {
        super(v4Var);
    }

    public static AbstractC8809o m392A3(TdApi.ChatInviteLinkInfo chatInviteLinkInfo, Runnable runnable, C11504x xVar) {
        return new View$OnClickListenerC11473a(xVar, chatInviteLinkInfo, runnable);
    }

    public static AbstractC8809o m391B3(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo, C11504x xVar) {
        return new View$OnClickListenerC11497r(xVar, j, chatJoinRequestsInfo);
    }

    public static AbstractC8809o m390C3(AbstractC4761s4 s4Var, long[] jArr, C11504x xVar) {
        return new View$OnClickListenerC11498s(xVar, s4Var, jArr);
    }

    public static void m389E3(AbstractC9323v4<?> v4Var, AbstractC11505a<?> aVar) {
        final C11504x xVar = new C11504x(v4Var);
        ?? a = aVar.mo380a(xVar);
        a.m9255fd(new Runnable() {
            @Override
            public final void run() {
                C11504x.this.m11113t3();
            }
        });
        xVar.setController(a);
        xVar.m11104z2();
    }

    public static void m388F3(AbstractC9323v4<?> v4Var, final TdApi.ChatInviteLinkInfo chatInviteLinkInfo, final Runnable runnable) {
        m386H3(v4Var, new AbstractC11505a() {
            @Override
            public final AbstractC8809o mo380a(C11504x xVar) {
                AbstractC8809o A3;
                A3 = C11504x.m392A3(TdApi.ChatInviteLinkInfo.this, runnable, xVar);
                return A3;
            }
        });
    }

    public static void m387G3(AbstractC9323v4<?> v4Var, final long j, final TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        m389E3(v4Var, new AbstractC11505a() {
            @Override
            public final AbstractC8809o mo380a(C11504x xVar) {
                AbstractC8809o B3;
                B3 = C11504x.m391B3(j, chatJoinRequestsInfo, xVar);
                return B3;
            }
        });
    }

    public static void m386H3(AbstractC9323v4<?> v4Var, AbstractC11505a<?> aVar) {
        C11504x xVar = new C11504x(v4Var);
        xVar.setController(aVar.mo380a(xVar));
        xVar.m11104z2();
        xVar.m11113t3();
    }

    public static void m385I3(AbstractC9323v4<?> v4Var, final AbstractC4761s4 s4Var, final long[] jArr) {
        m386H3(v4Var, new AbstractC11505a() {
            @Override
            public final AbstractC8809o mo380a(C11504x xVar) {
                AbstractC8809o C3;
                C3 = C11504x.m390C3(AbstractC4761s4.this, jArr, xVar);
                return C3;
            }
        });
    }

    @Override
    public AbstractC8809o<?> mo384m2(int i) {
        return this.f36521M0;
    }

    public void setController(AbstractC8809o<?> oVar) {
        oVar.get();
        this.f36521M0 = oVar;
    }
}
