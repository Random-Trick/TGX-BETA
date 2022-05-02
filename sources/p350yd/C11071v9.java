package p350yd;

import java.util.Iterator;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.voip.gui.CallSettings;
import p154kb.C6227d;

public class C11071v9 {
    public final C10536ab f35536a;
    public final C6227d<AbstractC11083w0> f35537b = new C6227d<>(true);
    public final C6227d<AbstractC11158z0> f35538c = new C6227d<>(true);
    public final C6227d<AbstractC11030u0> f35539d = new C6227d<>(true);
    public final C6227d<AbstractC11051v0> f35540e = new C6227d<>(true);
    public final C6227d<AbstractC11125y0> f35541f = new C6227d<>();

    public C11071v9(C10536ab abVar) {
        this.f35536a = abVar;
    }

    public void m1554a(AbstractC11030u0 u0Var) {
        this.f35539d.add(u0Var);
    }

    public void m1553b(AbstractC11051v0 v0Var) {
        this.f35540e.add(v0Var);
    }

    public void m1552c(AbstractC11083w0 w0Var) {
        this.f35537b.add(w0Var);
    }

    public void m1551d(AbstractC11125y0 y0Var) {
        this.f35541f.add(y0Var);
    }

    public void m1550e(AbstractC11158z0 z0Var) {
        this.f35538c.add(z0Var);
    }

    public void m1549f(C11131y6 y6Var, int i, boolean z) {
        if (z) {
            Iterator<AbstractC11030u0> it = this.f35539d.iterator();
            while (it.hasNext()) {
                it.next().mo11p6(y6Var, i);
            }
            return;
        }
        Iterator<AbstractC11030u0> it2 = this.f35539d.iterator();
        while (it2.hasNext()) {
            it2.next().mo29b1(y6Var, i);
        }
    }

    public void m1548g(C11131y6 y6Var, int i, int i2) {
        Iterator<AbstractC11030u0> it = this.f35539d.iterator();
        while (it.hasNext()) {
            it.next().mo61C4(y6Var, i, i2);
        }
    }

    public void m1547h(C11131y6 y6Var, TdApi.User user, boolean z, boolean z2) {
        Iterator<AbstractC11030u0> it = this.f35539d.iterator();
        while (it.hasNext()) {
            it.next().mo12p4(y6Var, user, z, z2);
        }
    }

    public void m1546i(C11131y6 y6Var, boolean z, boolean z2) {
        Iterator<AbstractC11030u0> it = this.f35539d.iterator();
        while (it.hasNext()) {
            it.next().mo48O(y6Var, z, z2);
        }
    }

    public void m1545j(C11131y6 y6Var, TdApi.User user, int i, C11131y6 y6Var2) {
        Iterator<AbstractC11030u0> it = this.f35539d.iterator();
        while (it.hasNext()) {
            it.next().mo4v4(y6Var, user, i, y6Var2);
        }
    }

    public void m1544k(C11131y6 y6Var, TdApi.AuthorizationState authorizationState, int i) {
        Iterator<AbstractC11030u0> it = this.f35539d.iterator();
        while (it.hasNext()) {
            it.next().mo56G2(y6Var, authorizationState, i);
        }
    }

    public void m1543l(C10930q6 q6Var, int i, CallSettings callSettings) {
        Iterator<AbstractC11051v0> it = this.f35540e.iterator();
        while (it.hasNext()) {
            it.next().mo1771a(q6Var, i, callSettings);
        }
    }

    public void m1542m(C10930q6 q6Var, TdApi.Call call) {
        Iterator<AbstractC11051v0> it = this.f35540e.iterator();
        while (it.hasNext()) {
            it.next().mo1770b(q6Var, call);
        }
    }

    public void m1541n(C10930q6 q6Var, int i, boolean z) {
        Iterator<AbstractC11083w0> it = this.f35537b.iterator();
        while (it.hasNext()) {
            it.next().mo1528h5(q6Var, i, z);
        }
    }

    public void m1540o(int i, int i2) {
        Iterator<AbstractC11083w0> it = this.f35537b.iterator();
        while (it.hasNext()) {
            it.next().mo1526v6(i, i2);
        }
    }

    public void m1539p(C10930q6 q6Var, TdApi.ChatList chatList, int i, boolean z) {
        Iterator<AbstractC11125y0> it = this.f35541f.iterator();
        while (it.hasNext()) {
            it.next().mo1512m(q6Var, chatList, i, z);
        }
    }

    public void m1538q(C10930q6 q6Var, boolean z) {
        Iterator<AbstractC11030u0> it = this.f35539d.iterator();
        while (it.hasNext()) {
            it.next().mo47O6(q6Var, z);
        }
    }

    public void m1537r(boolean z) {
        Iterator<AbstractC11083w0> it = this.f35537b.iterator();
        while (it.hasNext()) {
            it.next().mo1527u(z);
        }
    }

    public void m1536s(TdApi.ChatList chatList, boolean z) {
        Iterator<AbstractC11125y0> it = this.f35541f.iterator();
        while (it.hasNext()) {
            it.next().mo1513D(chatList, z);
        }
    }

    public void m1535t(C10930q6 q6Var, TdApi.UpdateMessageSendFailed updateMessageSendFailed) {
        Iterator<AbstractC11158z0> it = this.f35538c.iterator();
        while (it.hasNext()) {
            it.next().mo1332c(q6Var, updateMessageSendFailed.message, updateMessageSendFailed.oldMessageId, updateMessageSendFailed.errorCode, updateMessageSendFailed.errorMessage);
        }
    }

    public void m1534u(C10930q6 q6Var, TdApi.UpdateMessageSendSucceeded updateMessageSendSucceeded) {
        Iterator<AbstractC11158z0> it = this.f35538c.iterator();
        while (it.hasNext()) {
            it.next().mo1331d(q6Var, updateMessageSendSucceeded.message, updateMessageSendSucceeded.oldMessageId);
        }
    }

    public void m1533v(C10930q6 q6Var, TdApi.UpdateDeleteMessages updateDeleteMessages) {
        Iterator<AbstractC11158z0> it = this.f35538c.iterator();
        while (it.hasNext()) {
            it.next().mo1333b(q6Var, updateDeleteMessages.chatId, updateDeleteMessages.messageIds);
        }
    }

    public void m1532w(C10930q6 q6Var, TdApi.UpdateNewMessage updateNewMessage) {
        Iterator<AbstractC11158z0> it = this.f35538c.iterator();
        while (it.hasNext()) {
            it.next().mo1334a(q6Var, updateNewMessage.message);
        }
    }

    public void m1531x(AbstractC11030u0 u0Var) {
        this.f35539d.remove(u0Var);
    }

    public void m1530y(AbstractC11083w0 w0Var) {
        this.f35537b.remove(w0Var);
    }

    public void m1529z(AbstractC11125y0 y0Var) {
        this.f35541f.remove(y0Var);
    }
}
