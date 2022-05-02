package p350yd;

import gd.C4779t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p193nb.C7317b;
import p193nb.C7321e;
import p350yd.C10930q6;

public class C10684g8 implements Comparator<C10687c>, AbstractC10903p0 {
    public final C10930q6 f34194a;
    public final TdApi.ChatList f34195b;
    public final ArrayList<C10687c> f34196c = new ArrayList<>();
    public final List<Runnable> f34191M = new ArrayList();
    public final List<AbstractC5918j<TdApi.Chat>> f34192N = new ArrayList();
    public int f34193O = 0;

    public class RunnableC10685a implements Runnable {
        public final int f34197M;
        public final AbstractC5912d f34199a;
        public final int f34200b;
        public final Runnable f34201c;

        public RunnableC10685a(AbstractC5912d dVar, int i, Runnable runnable, int i2) {
            this.f34199a = dVar;
            this.f34200b = i;
            this.f34201c = runnable;
            this.f34197M = i2;
        }

        @Override
        public void run() {
            int l = C10684g8.this.m4288l(this.f34199a);
            if (C10684g8.this.m4281s() || l >= this.f34200b) {
                Runnable runnable = this.f34201c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            C10684g8.this.m4275y(this.f34197M - l, this);
        }
    }

    public class RunnableC10686b implements Runnable {
        public final AbstractC5918j f34202a;
        public final AbstractC5917i f34203b;

        public RunnableC10686b(AbstractC5918j jVar, AbstractC5917i iVar) {
            this.f34202a = jVar;
            this.f34203b = iVar;
        }

        @Override
        public void run() {
            boolean s = C10684g8.this.m4281s();
            if (s) {
                C10684g8.this.f34192N.remove(this.f34202a);
            }
            AbstractC5917i iVar = this.f34203b;
            if (iVar != null) {
                iVar.mo1322a(s);
            }
            if (!s) {
                C10684g8.this.m4275y(100, this);
            }
        }
    }

    public static class C10687c implements Comparable<C10687c> {
        public final TdApi.Chat f34205a;
        public final TdApi.ChatList f34206b;
        public TdApi.ChatPosition f34207c;

        public C10687c(TdApi.Chat chat, TdApi.ChatList chatList, TdApi.ChatPosition chatPosition) {
            this.f34205a = chat;
            this.f34206b = chatList;
            if (chatPosition != null) {
                this.f34207c = new TdApi.ChatPosition(chatPosition.list, chatPosition.order, chatPosition.isPinned, chatPosition.source);
            } else {
                this.f34207c = new TdApi.ChatPosition(chatList, 0L, false, null);
            }
        }

        public int compareTo(C10687c cVar) {
            long j = this.f34207c.order;
            long j2 = cVar.f34207c.order;
            if (j != j2) {
                return Long.compare(j2, j);
            }
            return Long.compare(cVar.f34205a.f25367id, this.f34205a.f25367id);
        }
    }

    public C10684g8(C10930q6 q6Var, TdApi.ChatList chatList) {
        this.f34194a = q6Var;
        this.f34195b = chatList;
    }

    public void m4278v(AbstractC5918j jVar, AbstractC10700h0 h0Var, List list) {
        jVar.mo1330a(list);
        m4302K(h0Var);
    }

    public void m4274z(TdApi.Object object) {
        int i = 0;
        if (object.getConstructor() == -1679978726) {
            i = 2;
        }
        m4303J(i);
        if (!this.f34191M.isEmpty()) {
            ArrayList<Runnable> arrayList = new ArrayList(this.f34191M);
            this.f34191M.clear();
            for (Runnable runnable : arrayList) {
                runnable.run();
            }
        }
    }

    public final List<C10687c> m4312A(AbstractC5912d<TdApi.Chat> dVar) {
        ArrayList arrayList = new ArrayList(this.f34196c.size());
        Iterator<C10687c> it = this.f34196c.iterator();
        while (it.hasNext()) {
            C10687c next = it.next();
            if (dVar == null || dVar.mo1511a(next.f34205a)) {
                arrayList.add(new C10687c(next.f34205a, next.f34206b, next.f34207c));
            }
        }
        return arrayList;
    }

    public void m4277w(final AbstractC5918j<TdApi.Chat> jVar, final AbstractC5917i iVar) {
        if (!this.f34194a.m2140z6()) {
            this.f34194a.m2579Xa(new Runnable() {
                @Override
                public final void run() {
                    C10684g8.this.m4277w(jVar, iVar);
                }
            });
            return;
        }
        RunnableC10686b bVar = new RunnableC10686b(jVar, iVar);
        Iterator<C10687c> it = this.f34196c.iterator();
        while (it.hasNext()) {
            jVar.mo1330a(it.next().f34205a);
        }
        this.f34192N.add(jVar);
        m4275y(100, bVar);
    }

    public void m4276x(final AbstractC5912d<TdApi.Chat> dVar, final int i, final int i2, final Runnable runnable) {
        if (!this.f34194a.m2140z6()) {
            this.f34194a.m2579Xa(new Runnable() {
                @Override
                public final void run() {
                    C10684g8.this.m4276x(dVar, i, i2, runnable);
                }
            });
        } else {
            new RunnableC10685a(dVar, i, runnable, i2).run();
        }
    }

    public void m4309D(AbstractC5912d<TdApi.Chat> dVar, int i, Runnable runnable) {
        m4276x(dVar, i, i, runnable);
    }

    public void m4275y(final int i, final Runnable runnable) {
        if (!this.f34194a.m2140z6()) {
            this.f34194a.m2579Xa(new Runnable() {
                @Override
                public final void run() {
                    C10684g8.this.m4275y(i, runnable);
                }
            });
        } else if (this.f34193O != 2) {
            if (runnable != null) {
                this.f34191M.add(runnable);
            }
            if (this.f34193O != 1) {
                m4303J(1);
                this.f34194a.m2270r4().m14783o(new TdApi.LoadChats(this.f34195b, i), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C10684g8.this.m4274z(object);
                    }
                });
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public int m4307F() {
        int i;
        synchronized (this.f34196c) {
            i = 0;
            Iterator<C10687c> it = this.f34196c.iterator();
            while (it.hasNext()) {
                C10687c next = it.next();
                TdApi.Message message = next.f34205a.lastMessage;
                if (message != null) {
                    i = Math.max(message.date, i);
                    if (!C7317b.m17037g(next.f34205a, this.f34195b)) {
                        break;
                    }
                }
            }
        }
        return i;
    }

    public void m4306G(TdApi.Chat chat, C10930q6.C10937g gVar) {
        C10687c cVar;
        int i;
        TdApi.ChatPosition chatPosition = gVar.f35136a;
        int q = m4283q(chat.f25367id);
        if (q == -1) {
            if (chatPosition.order != 0) {
                m4292h(new C10687c(chat, m4290j(), chatPosition), gVar);
            }
        } else if (chatPosition.order == 0) {
            m4304I(q, gVar);
        } else {
            if (gVar.m2129b()) {
                synchronized (this.f34196c) {
                    cVar = this.f34196c.remove(q);
                    C7321e.m16916r(chatPosition, cVar.f34207c);
                    int binarySearch = Collections.binarySearch(this.f34196c, cVar, this);
                    if (binarySearch < 0) {
                        i = (binarySearch * (-1)) - 1;
                        this.f34196c.add(i, cVar);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (i != q) {
                    this.f34194a.m2781K9().m1853h1(this, cVar.f34205a, q, i, gVar);
                    return;
                }
            } else {
                cVar = this.f34196c.get(q);
            }
            if (gVar.m2130a()) {
                this.f34194a.m2781K9().m1930M0(this, cVar.f34205a, q, gVar);
            }
        }
    }

    public void m4305H(TdApi.Chat chat) {
        TdApi.ChatPosition a;
        if (chat.positions != null && (a = C7317b.m17043a(chat, m4290j())) != null && a.order != 0) {
            m4292h(new C10687c(chat, m4290j(), a), new C10930q6.C10937g(a, 0));
        }
    }

    public final void m4304I(int i, C10930q6.C10937g gVar) {
        C10687c remove;
        synchronized (this.f34196c) {
            remove = this.f34196c.remove(i);
        }
        this.f34194a.m2781K9().m1793w1(this, remove.f34205a, i, gVar);
    }

    public final void m4303J(int i) {
        int i2 = this.f34193O;
        if (i2 != i) {
            this.f34193O = i;
            this.f34194a.m2781K9().m1865e1(this, i, i2);
        }
    }

    public void m4302K(AbstractC10700h0 h0Var) {
        this.f34194a.m2781K9().m1874c0(this.f34195b, h0Var);
    }

    public int m4301L() {
        return Math.max(this.f34194a.m2460f6(this.f34195b), m4288l(null));
    }

    public void m4300M(AbstractC10700h0 h0Var) {
        this.f34194a.m2781K9().m1822p0(this.f34195b, h0Var);
    }

    @Override
    public void mo2963S(TdApi.ChatList chatList, int i, int i2) {
        C10882o0.m2965b(this, chatList, i, i2);
    }

    public final void m4292h(C10687c cVar, C10930q6.C10937g gVar) {
        int binarySearch = Collections.binarySearch(this.f34196c, cVar, this);
        if (binarySearch < 0) {
            int i = (binarySearch * (-1)) - 1;
            synchronized (this.f34196c) {
                this.f34196c.add(i, cVar);
            }
            for (AbstractC5918j<TdApi.Chat> jVar : this.f34192N) {
                jVar.mo1330a(cVar.f34205a);
            }
            this.f34194a.m2781K9().m1942J0(this, cVar.f34205a, i, gVar);
            return;
        }
        throw new IllegalStateException();
    }

    public boolean m4291i() {
        return this.f34193O == 0;
    }

    public TdApi.ChatList m4290j() {
        return this.f34195b;
    }

    public int compare(C10687c cVar, C10687c cVar2) {
        return cVar.compareTo(cVar2);
    }

    public int m4288l(AbstractC5912d<TdApi.Chat> dVar) {
        synchronized (this.f34196c) {
            if (dVar == null) {
                return this.f34196c.size();
            }
            int i = 0;
            Iterator<C10687c> it = this.f34196c.iterator();
            while (it.hasNext()) {
                if (dVar.mo1511a(it.next().f34205a)) {
                    i++;
                }
            }
            return i;
        }
    }

    public void m4279u(final AbstractC5912d<TdApi.Chat> dVar, final AbstractC5918j<List<C10687c>> jVar) {
        if (!this.f34194a.m2140z6()) {
            this.f34194a.m2579Xa(new Runnable() {
                @Override
                public final void run() {
                    C10684g8.this.m4279u(dVar, jVar);
                }
            });
        } else {
            jVar.mo1330a(m4312A(dVar));
        }
    }

    public boolean m4286n() {
        synchronized (this.f34196c) {
            Iterator<C10687c> it = this.f34196c.iterator();
            while (it.hasNext()) {
                if (C4779t2.m25610R2(it.next().f34205a.lastMessage)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void mo2962n4(TdApi.ChatList chatList, boolean z, int i, int i2, int i3) {
        C10882o0.m2966a(this, chatList, z, i, i2, i3);
    }

    public boolean m4285o() {
        synchronized (this.f34196c) {
            Iterator<C10687c> it = this.f34196c.iterator();
            while (it.hasNext()) {
                if (it.next().f34205a.hasScheduledMessages) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean m4284p() {
        synchronized (this.f34196c) {
            Iterator<C10687c> it = this.f34196c.iterator();
            while (it.hasNext()) {
                if (it.next().f34205a.unreadMentionCount > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public final int m4283q(long j) {
        Iterator<C10687c> it = this.f34196c.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().f34205a.f25367id == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m4282r(AbstractC5912d<TdApi.Chat> dVar, final AbstractC10700h0 h0Var, final AbstractC5918j<List<C10687c>> jVar, int i, Runnable runnable) {
        m4279u(dVar, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C10684g8.this.m4278v(jVar, h0Var, (List) obj);
            }
        });
        m4309D(dVar, i, runnable);
    }

    public boolean m4281s() {
        return this.f34193O == 2;
    }

    public void m4280t(AbstractC5918j<TdApi.Chat> jVar) {
        synchronized (this.f34196c) {
            Iterator<C10687c> it = this.f34196c.iterator();
            while (it.hasNext()) {
                jVar.mo1330a(it.next().f34205a);
            }
        }
    }
}
