package zd;

import java.util.Iterator;
import lb.d;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.voip.gui.CallSettings;

public class t9 {
    public final ya f28474a;
    public final d<u0> f28475b = new d<>(true);
    public final d<x0> f28476c = new d<>(true);
    public final d<s0> f28477d = new d<>(true);
    public final d<t0> f28478e = new d<>(true);
    public final d<w0> f28479f = new d<>();

    public t9(ya yaVar) {
        this.f28474a = yaVar;
    }

    public void a(s0 s0Var) {
        this.f28477d.add(s0Var);
    }

    public void b(t0 t0Var) {
        this.f28478e.add(t0Var);
    }

    public void c(u0 u0Var) {
        this.f28475b.add(u0Var);
    }

    public void d(w0 w0Var) {
        this.f28479f.add(w0Var);
    }

    public void e(x0 x0Var) {
        this.f28476c.add(x0Var);
    }

    public void f(w6 w6Var, int i10, boolean z10) {
        if (z10) {
            Iterator<s0> it = this.f28477d.iterator();
            while (it.hasNext()) {
                it.next().S(w6Var, i10);
            }
            return;
        }
        Iterator<s0> it2 = this.f28477d.iterator();
        while (it2.hasNext()) {
            it2.next().N6(w6Var, i10);
        }
    }

    public void g(w6 w6Var, int i10, int i11) {
        Iterator<s0> it = this.f28477d.iterator();
        while (it.hasNext()) {
            it.next().z5(w6Var, i10, i11);
        }
    }

    public void h(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
        Iterator<s0> it = this.f28477d.iterator();
        while (it.hasNext()) {
            it.next().v0(w6Var, user, z10, z11);
        }
    }

    public void i(w6 w6Var, boolean z10, boolean z11) {
        Iterator<s0> it = this.f28477d.iterator();
        while (it.hasNext()) {
            it.next().D4(w6Var, z10, z11);
        }
    }

    public void j(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
        Iterator<s0> it = this.f28477d.iterator();
        while (it.hasNext()) {
            it.next().V1(w6Var, user, i10, w6Var2);
        }
    }

    public void k(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        Iterator<s0> it = this.f28477d.iterator();
        while (it.hasNext()) {
            it.next().l(w6Var, authorizationState, i10);
        }
    }

    public void l(o6 o6Var, int i10, CallSettings callSettings) {
        Iterator<t0> it = this.f28478e.iterator();
        while (it.hasNext()) {
            it.next().a(o6Var, i10, callSettings);
        }
    }

    public void m(o6 o6Var, TdApi.Call call) {
        Iterator<t0> it = this.f28478e.iterator();
        while (it.hasNext()) {
            it.next().b(o6Var, call);
        }
    }

    public void n(o6 o6Var, int i10, boolean z10) {
        Iterator<u0> it = this.f28475b.iterator();
        while (it.hasNext()) {
            it.next().c3(o6Var, i10, z10);
        }
    }

    public void o(int i10, int i11) {
        Iterator<u0> it = this.f28475b.iterator();
        while (it.hasNext()) {
            it.next().v6(i10, i11);
        }
    }

    public void p(o6 o6Var, TdApi.ChatList chatList, int i10, boolean z10) {
        Iterator<w0> it = this.f28479f.iterator();
        while (it.hasNext()) {
            it.next().T1(o6Var, chatList, i10, z10);
        }
    }

    public void q(o6 o6Var, boolean z10) {
        Iterator<s0> it = this.f28477d.iterator();
        while (it.hasNext()) {
            it.next().z(o6Var, z10);
        }
    }

    public void r(boolean z10) {
        Iterator<u0> it = this.f28475b.iterator();
        while (it.hasNext()) {
            it.next().v(z10);
        }
    }

    public void s(TdApi.ChatList chatList, boolean z10) {
        Iterator<w0> it = this.f28479f.iterator();
        while (it.hasNext()) {
            it.next().E(chatList, z10);
        }
    }

    public void t(o6 o6Var, TdApi.UpdateMessageSendFailed updateMessageSendFailed) {
        Iterator<x0> it = this.f28476c.iterator();
        while (it.hasNext()) {
            it.next().d(o6Var, updateMessageSendFailed.message, updateMessageSendFailed.oldMessageId, updateMessageSendFailed.errorCode, updateMessageSendFailed.errorMessage);
        }
    }

    public void u(o6 o6Var, TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        Iterator<x0> it = this.f28476c.iterator();
        while (it.hasNext()) {
            it.next().a(o6Var, updateMessageSendSucceeded.message, updateMessageSendSucceeded.oldMessageId);
        }
    }

    public void v(o6 o6Var, TdApi.UpdateDeleteMessages updateDeleteMessages) {
        Iterator<x0> it = this.f28476c.iterator();
        while (it.hasNext()) {
            it.next().b(o6Var, updateDeleteMessages.chatId, updateDeleteMessages.messageIds);
        }
    }

    public void w(o6 o6Var, TdApi.UpdateNewMessage updateNewMessage) {
        Iterator<x0> it = this.f28476c.iterator();
        while (it.hasNext()) {
            it.next().c(o6Var, updateNewMessage.message);
        }
    }

    public void x(s0 s0Var) {
        this.f28477d.remove(s0Var);
    }

    public void y(u0 u0Var) {
        this.f28475b.remove(u0Var);
    }

    public void z(w0 w0Var) {
        this.f28479f.remove(w0Var);
    }
}
