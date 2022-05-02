package gd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;
import p139jb.AbstractC5919k;
import p193nb.C7321e;
import p350yd.AbstractC10596d1;
import p350yd.AbstractC10748j1;
import p350yd.C10626e1;
import p350yd.C10722i1;
import p350yd.C10930q6;

public class C4837y0 extends AbstractC10596d1<TdApi.Message> implements AbstractC10748j1, Comparator<TdApi.Message> {
    public final long f16495U;
    public final long f16496V;
    public final String f16497W;
    public final TdApi.MessageSender f16498X;
    public final TdApi.SearchMessagesFilter f16499Y;
    public final long f16500Z;
    public boolean f16501a0;
    public boolean f16502b0;
    public long f16503c0;
    public final AbstractC10596d1.AbstractC10598b<TdApi.Message> f16504d0;
    public final List<AbstractC4840c> f16505e0;

    public class C4838a implements AbstractC10596d1.AbstractC10598b<TdApi.Message> {
        public C4838a() {
        }

        @Override
        public void mo4486C3(AbstractC10596d1<TdApi.Message> d1Var, boolean z) {
            C10626e1.m4426a(this, d1Var, z);
        }

        @Override
        public void mo4485C6(AbstractC10596d1<TdApi.Message> d1Var, List<TdApi.Message> list, int i, boolean z) {
            if (i == 0) {
                C4837y0.this.m25074g1(list.get(0).f25406id);
            }
        }

        @Override
        public void mo4484F5(AbstractC10596d1<TdApi.Message> d1Var) {
            C10626e1.m4419h(this, d1Var);
        }

        @Override
        public void mo4482J6(AbstractC10596d1<TdApi.Message> d1Var, int i) {
            C10626e1.m4418i(this, d1Var, i);
        }

        public void mo4478x2(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
            if (i == 0) {
                C4837y0.this.m25074g1(message.f25406id);
            }
        }

        public void mo4480i7(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
            if (i == 0) {
                C4837y0.this.m25074g1(message.f25406id);
            }
        }

        public void mo4483H6(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
            if (i2 == 0) {
                C4837y0.this.m25074g1(message.f25406id);
            } else if (i == 0) {
                C4837y0 y0Var = C4837y0.this;
                y0Var.m25074g1(((TdApi.Message) y0Var.f33973b.get(0)).f25406id);
            }
        }

        public void mo4481d4(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
            if (i == 0) {
                C4837y0 y0Var = C4837y0.this;
                y0Var.m25074g1(y0Var.f33973b.isEmpty() ? 0L : ((TdApi.Message) C4837y0.this.f33973b.get(0)).f25406id);
            }
        }

        @Override
        public void mo4479t6(AbstractC10596d1<TdApi.Message> d1Var) {
            C10626e1.m4425b(this, d1Var);
        }
    }

    public interface AbstractC4839b extends AbstractC10596d1.AbstractC10598b<TdApi.Message> {
    }

    public interface AbstractC4840c {
        void mo7603a(AbstractC10596d1<TdApi.Message> d1Var, long j);
    }

    public C4837y0(C10930q6 q6Var, int i, int i2, AbstractC4839b bVar, long j, long j2, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter, long j3) {
        super(q6Var, i, i2, j2 != 0, bVar);
        C4838a aVar = new C4838a();
        this.f16504d0 = aVar;
        this.f16505e0 = new ArrayList();
        this.f16495U = j;
        this.f16496V = j2;
        this.f16497W = str;
        this.f16498X = messageSender;
        this.f16499Y = searchMessagesFilter;
        this.f16500Z = j3;
        mo1346a0();
        mo4517I(null);
        m4497r(aVar);
    }

    public void m25100K0(boolean z, long j, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor != -1679978726) {
            if (constructor == 1435961258) {
                final TdApi.Message message = (TdApi.Message) object;
                if (m25082c1(message)) {
                    m4504X(new Runnable() {
                        @Override
                        public final void run() {
                            C4837y0.this.m25101J0(message);
                        }
                    });
                }
            }
        } else if (z) {
            m25107D0(j, false);
        }
    }

    public void m25098M0(final AbstractC5919k kVar, TdApi.Object object) {
        final int i;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("GetChatMessageCount: %s, filter:%s, chatId:%s", C4779t2.m25378z5(object), this.f16499Y, Long.valueOf(this.f16495U));
            i = -1;
        } else if (constructor == 1295577348) {
            i = ((TdApi.Count) object).count;
        } else {
            Log.unexpectedTdlibResponse(object, TdApi.GetChatMessageCount.class, TdApi.Count.class);
            throw new AssertionError(object.toString());
        }
        if (kVar != null) {
            m4504X(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5919k.this.mo3250a(i);
                }
            });
        }
    }

    public void m25096O0(TdApi.Function function, final AbstractC5919k kVar, TdApi.Object object) {
        final int i;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("%s: %s, chatId: %d", function.getClass().getSimpleName(), C4779t2.m25378z5(object), Long.valueOf(this.f16495U));
            i = -1;
        } else if (constructor == -16498159) {
            i = ((TdApi.Messages) object).totalCount;
        } else {
            Log.unexpectedTdlibResponse(object, function.getClass(), TdApi.Messages.class);
            throw new AssertionError(object.toString());
        }
        if (kVar != null) {
            m4504X(new Runnable() {
                @Override
                public final void run() {
                    AbstractC5919k.this.mo3250a(i);
                }
            });
        }
    }

    public void m25095P0(Runnable runnable, int i) {
        if (i != -1 && m4493v() == -1) {
            m4502Z(i);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void m25094Q0(final Runnable runnable, int i) {
        if (i != -1) {
            if (m4493v() == -1) {
                m4502Z(i);
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        m25106E0(false, new AbstractC5919k() {
            @Override
            public final void mo3250a(int i2) {
                C4837y0.this.m25095P0(runnable, i2);
            }
        });
    }

    public void m25093R0(long j, TdApi.MessageContent messageContent) {
        int I0 = m25102I0(j);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f33973b.get(I0);
            message.content = messageContent;
            if (m25082c1(message)) {
                m4513M(I0, 3);
            } else {
                m25078e1(I0);
            }
        }
    }

    public void m25092S0(long j, int i, TdApi.ReplyMarkup replyMarkup) {
        int I0 = m25102I0(j);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f33973b.get(I0);
            message.f25406id = j;
            message.editDate = i;
            message.replyMarkup = replyMarkup;
            m4513M(I0, 4);
        }
    }

    public void m25091U0(long j, TdApi.MessageInteractionInfo messageInteractionInfo) {
        int I0 = m25102I0(j);
        if (I0 != -1) {
            ((TdApi.Message) this.f33973b.get(I0)).interactionInfo = messageInteractionInfo;
            m4513M(I0, 7);
        }
    }

    public void m25090V0(long j) {
        int I0 = m25102I0(j);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f33973b.get(I0);
            if (message.containsUnreadMention) {
                message.containsUnreadMention = false;
                if (m25082c1(message)) {
                    m4513M(I0, 6);
                } else {
                    m25078e1(I0);
                }
            }
        }
    }

    public void m25089W0(long j) {
        int I0 = m25102I0(j);
        if (I0 != -1) {
            C4779t2.m25497i5((TdApi.Message) this.f33973b.get(I0));
            m4513M(I0, 5);
        }
    }

    public void m25088X0(long j, boolean z) {
        int I0 = m25102I0(j);
        if (I0 != -1) {
            TdApi.Message message = (TdApi.Message) this.f33973b.get(I0);
            if (message.isPinned != z) {
                message.isPinned = z;
                if (!m25082c1(message)) {
                    m25078e1(I0);
                    return;
                }
                return;
            }
            return;
        }
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f16499Y;
        if (searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512 && z) {
            m25107D0(j, true);
        }
    }

    public void m25087Y0(TdApi.Message message, long j) {
        m25076f1(message, j, 2);
    }

    public void m25086Z0(TdApi.Message message, long j) {
        m25076f1(message, j, 1);
    }

    public void m25085a1(long[] jArr) {
        int i = 0;
        for (long j : jArr) {
            int I0 = m25102I0(j);
            if (I0 != -1) {
                m4508R((TdApi.Message) this.f33973b.remove(I0), I0);
                i++;
            }
        }
        m4496s(-i);
    }

    public final int m25084b1(TdApi.Message message) {
        int i = -1;
        if (m25082c1(message)) {
            int binarySearch = Collections.binarySearch(this.f33973b, message, this);
            if (binarySearch >= 0) {
                return -1;
            }
            int i2 = (binarySearch * (-1)) - 1;
            if (i2 != this.f33973b.size() || m4489z()) {
                this.f33973b.add(i2, message);
                m4510P(message, i2);
                i = i2;
            }
            m4496s(1);
        }
        return i;
    }

    public int compare(TdApi.Message message, TdApi.Message message2) {
        return Long.compare(message2.f25406id, message.f25406id);
    }

    public void m25108C0(long j) {
        if (m25080d1() > j) {
            m4489z();
        }
    }

    public final void m25107D0(final long j, final boolean z) {
        this.f33972a.m2270r4().m14783o(z ? new TdApi.GetMessageLocally(this.f16495U, j) : new TdApi.GetMessage(this.f16495U, j), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C4837y0.this.m25100K0(z, j, object);
            }
        });
    }

    public final void m25106E0(boolean z, final AbstractC5919k kVar) {
        final TdApi.Function function;
        if (m25104G0() || this.f16499Y == null) {
            if (!m25104G0()) {
                function = new TdApi.GetChatHistory(this.f16495U, 0L, 0, 1, z);
            } else if (!z) {
                function = new TdApi.SearchChatMessages(this.f16495U, this.f16497W, this.f16498X, 0L, 0, 1, this.f16499Y, this.f16500Z);
            } else if (kVar != null) {
                kVar.mo3250a(-1);
                return;
            } else {
                return;
            }
            this.f33972a.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C4837y0.this.m25096O0(function, kVar, object);
                }
            });
            return;
        }
        this.f33972a.m2270r4().m14783o(new TdApi.GetChatMessageCount(this.f16495U, this.f16499Y, z), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C4837y0.this.m25098M0(kVar, object);
            }
        });
    }

    @Override
    public void mo4051E2(final TdApi.Message message) {
        if (m25082c1(message)) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25084b1(message);
                }
            });
        }
    }

    public long m25105F0() {
        return this.f16503c0;
    }

    public final boolean m25104G0() {
        return (C5070i.m24061i(this.f16497W) && this.f16498X == null && this.f16500Z == 0) ? false : true;
    }

    @Override
    public void mo4050H(long j, final long[] jArr) {
        if (this.f16495U == j) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25085a1(jArr);
                }
            });
        }
    }

    public final boolean m25103H0() {
        return this.f16499Y != null || m25104G0();
    }

    @Override
    public void mo4517I(final Runnable runnable) {
        m25106E0(true, new AbstractC5919k() {
            @Override
            public final void mo3250a(int i) {
                C4837y0.this.m25094Q0(runnable, i);
            }
        });
    }

    public final int m25102I0(long j) {
        int i = 0;
        for (T t : this.f33973b) {
            if (t.f25406id == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public TdApi.Function mo4516J(boolean z, int i, int i2) {
        long j;
        if (this.f33973b.isEmpty()) {
            j = this.f16496V;
        } else {
            List<T> list = this.f33973b;
            j = ((TdApi.Message) list.get(z ? 0 : list.size() - 1)).f25406id;
        }
        long j2 = j;
        if (m25103H0()) {
            if (z) {
                return new TdApi.SearchChatMessages(this.f16495U, this.f16497W, this.f16498X, j2, -i2, i2 + 1, this.f16499Y, this.f16500Z);
            }
            return new TdApi.SearchChatMessages(this.f16495U, this.f16497W, this.f16498X, j2, 0, i2, this.f16499Y, this.f16500Z);
        } else if (z) {
            return new TdApi.GetChatHistory(this.f16495U, j2, -i, i + 1, !this.f16502b0);
        } else {
            return new TdApi.GetChatHistory(this.f16495U, j2, 0, i, !this.f16501a0);
        }
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public void mo4048R3(long j, long j2) {
        C10722i1.m4163i(this, j, j2);
    }

    @Override
    public void mo4047T0(long j, final long j2, final TdApi.MessageInteractionInfo messageInteractionInfo) {
        if (this.f16495U == j) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25091U0(j2, messageInteractionInfo);
                }
            });
        }
    }

    @Override
    public AbstractC10596d1.C10599c<TdApi.Message> mo1347U(TdApi.Object object, Client.AbstractC7865g gVar, int i, boolean z) {
        TdApi.Messages messages = (TdApi.Messages) object;
        List asList = Arrays.asList(messages.messages);
        if (m25103H0() || !asList.isEmpty()) {
            return new AbstractC10596d1.C10599c<>(asList, messages.totalCount);
        }
        if (z) {
            this.f16502b0 = true;
        } else {
            this.f16501a0 = true;
        }
        this.f33972a.m2270r4().m14783o(mo4516J(z, this.f33973b.size(), i), gVar);
        return null;
    }

    @Override
    public void mo4046V(long j, final long j2) {
        if (this.f16495U == j) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25090V0(j2);
                }
            });
        }
    }

    @Override
    public void mo4045V1(long j, final long j2, final boolean z) {
        if (this.f16495U == j) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25088X0(j2, z);
                }
            });
        }
    }

    @Override
    public void mo4044X1(final TdApi.Message message, final long j) {
        if (message.chatId == this.f16495U) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25086Z0(message, j);
                }
            });
        }
    }

    @Override
    public void mo1346a0() {
        if (this.f16495U != 0) {
            this.f33972a.m2781K9().m1858g0(this.f16495U, this);
        }
    }

    @Override
    public void mo1345b0() {
        this.f33972a.m2781K9().m1806t0(this.f16495U, this);
    }

    public final boolean m25082c1(TdApi.Message message) {
        TdApi.MessageSender messageSender;
        TdApi.SearchMessagesFilter searchMessagesFilter;
        if (message.chatId == this.f16495U) {
            if (m25103H0()) {
                if (C5070i.m24061i(this.f16497W)) {
                    long j = this.f16500Z;
                    if ((j == 0 || message.messageThreadId == j) && (((messageSender = this.f16498X) == null || C7321e.m16975W(message.senderId, messageSender)) && ((searchMessagesFilter = this.f16499Y) == null || C7321e.m16941i1(message, searchMessagesFilter)))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    public long m25080d1() {
        if (this.f33973b.isEmpty()) {
            return 0L;
        }
        List<T> list = this.f33973b;
        return ((TdApi.Message) list.get(list.size() - 1)).f25406id;
    }

    public final void m25078e1(int i) {
        m4508R((TdApi.Message) this.f33973b.remove(i), i);
        m4496s(-1);
    }

    public final void m25076f1(TdApi.Message message, long j, int i) {
        int I0 = m25102I0(j);
        if (I0 != -1) {
            TdApi.Message message2 = (TdApi.Message) this.f33973b.remove(I0);
            int A0 = m25084b1(message);
            if (A0 == I0) {
                m4513M(I0, i);
            } else if (A0 == -1) {
                m4508R(message2, I0);
            } else {
                m4509Q(message2, I0, A0);
                m4513M(A0, i);
            }
        } else {
            m25084b1(message);
        }
    }

    public final void m25074g1(long j) {
        if (this.f16503c0 != j) {
            this.f16503c0 = j;
            if (!m4490y()) {
                for (int size = this.f16505e0.size() - 1; size >= 0; size--) {
                    this.f16505e0.get(size).mo7603a(this, j);
                }
            }
        }
    }

    @Override
    public void mo4042k5(final TdApi.Message message, final long j, int i, String str) {
        if (message.chatId == this.f16495U) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25087Y0(message, j);
                }
            });
        }
    }

    @Override
    public void mo4041l0(long j, final long j2, final TdApi.MessageContent messageContent) {
        if (this.f16495U == j) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25093R0(j2, messageContent);
                }
            });
        }
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    @Override
    public void mo4039r5(long j, final long j2, final int i, final TdApi.ReplyMarkup replyMarkup) {
        if (this.f16495U == j) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25092S0(j2, i, replyMarkup);
                }
            });
        }
    }

    public void m25056z0(AbstractC4840c cVar) {
        this.f16505e0.add(cVar);
    }

    @Override
    public void mo4038z5(long j, final long j2) {
        if (this.f16495U == j) {
            m4503Y(new Runnable() {
                @Override
                public final void run() {
                    C4837y0.this.m25089W0(j2);
                }
            });
        }
    }
}
