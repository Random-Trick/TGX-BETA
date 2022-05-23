package zd;

import hd.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kb.d;
import kb.i;
import kb.j;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class e8 implements Comparator<c>, n0 {
    public final o6 f27449a;
    public final TdApi.ChatList f27450b;
    public final ArrayList<c> f27451c = new ArrayList<>();
    public final List<Runnable> M = new ArrayList();
    public final List<j<TdApi.Chat>> N = new ArrayList();
    public int O = 0;

    public class a implements Runnable {
        public final int M;
        public final d f27452a;
        public final int f27453b;
        public final Runnable f27454c;

        public a(d dVar, int i10, Runnable runnable, int i11) {
            this.f27452a = dVar;
            this.f27453b = i10;
            this.f27454c = runnable;
            this.M = i11;
        }

        @Override
        public void run() {
            int l10 = e8.this.l(this.f27452a);
            if (e8.this.s() || l10 >= this.f27453b) {
                Runnable runnable = this.f27454c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            e8.this.y(this.M - l10, this);
        }
    }

    public class b implements Runnable {
        public final j f27455a;
        public final i f27456b;

        public b(j jVar, i iVar) {
            this.f27455a = jVar;
            this.f27456b = iVar;
        }

        @Override
        public void run() {
            boolean s10 = e8.this.s();
            if (s10) {
                e8.this.N.remove(this.f27455a);
            }
            i iVar = this.f27456b;
            if (iVar != null) {
                iVar.a(s10);
            }
            if (!s10) {
                e8.this.y(100, this);
            }
        }
    }

    public static class c implements Comparable<c> {
        public final TdApi.Chat f27458a;
        public final TdApi.ChatList f27459b;
        public TdApi.ChatPosition f27460c;

        public c(TdApi.Chat chat, TdApi.ChatList chatList, TdApi.ChatPosition chatPosition) {
            this.f27458a = chat;
            this.f27459b = chatList;
            if (chatPosition != null) {
                this.f27460c = new TdApi.ChatPosition(chatPosition.list, chatPosition.order, chatPosition.isPinned, chatPosition.source);
            } else {
                this.f27460c = new TdApi.ChatPosition(chatList, 0L, false, null);
            }
        }

        public int compareTo(c cVar) {
            long j10 = this.f27460c.order;
            long j11 = cVar.f27460c.order;
            if (j10 != j11) {
                return Long.compare(j11, j10);
            }
            return Long.compare(cVar.f27458a.f19908id, this.f27458a.f19908id);
        }
    }

    public e8(o6 o6Var, TdApi.ChatList chatList) {
        this.f27449a = o6Var;
        this.f27450b = chatList;
    }

    public void v(j jVar, f0 f0Var, List list) {
        jVar.a(list);
        K(f0Var);
    }

    public void z(TdApi.Object object) {
        int i10 = 0;
        if (object.getConstructor() == -1679978726) {
            i10 = 2;
        }
        J(i10);
        if (!this.M.isEmpty()) {
            ArrayList<Runnable> arrayList = new ArrayList(this.M);
            this.M.clear();
            for (Runnable runnable : arrayList) {
                runnable.run();
            }
        }
    }

    public final List<c> A(d<TdApi.Chat> dVar) {
        ArrayList arrayList = new ArrayList(this.f27451c.size());
        Iterator<c> it = this.f27451c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (dVar == null || dVar.a(next.f27458a)) {
                arrayList.add(new c(next.f27458a, next.f27459b, next.f27460c));
            }
        }
        return arrayList;
    }

    public void w(final j<TdApi.Chat> jVar, final i iVar) {
        if (!this.f27449a.D6()) {
            this.f27449a.bb(new Runnable() {
                @Override
                public final void run() {
                    e8.this.w(jVar, iVar);
                }
            });
            return;
        }
        b bVar = new b(jVar, iVar);
        Iterator<c> it = this.f27451c.iterator();
        while (it.hasNext()) {
            jVar.a(it.next().f27458a);
        }
        this.N.add(jVar);
        y(100, bVar);
    }

    public void x(final d<TdApi.Chat> dVar, final int i10, final int i11, final Runnable runnable) {
        if (!this.f27449a.D6()) {
            this.f27449a.bb(new Runnable() {
                @Override
                public final void run() {
                    e8.this.x(dVar, i10, i11, runnable);
                }
            });
        } else {
            new a(dVar, i10, runnable, i11).run();
        }
    }

    public void D(d<TdApi.Chat> dVar, int i10, Runnable runnable) {
        x(dVar, i10, i10, runnable);
    }

    public void y(final int i10, final Runnable runnable) {
        if (!this.f27449a.D6()) {
            this.f27449a.bb(new Runnable() {
                @Override
                public final void run() {
                    e8.this.y(i10, runnable);
                }
            });
        } else if (this.O != 2) {
            if (runnable != null) {
                this.M.add(runnable);
            }
            if (this.O != 1) {
                J(1);
                this.f27449a.v4().o(new TdApi.LoadChats(this.f27450b, i10), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        e8.this.z(object);
                    }
                });
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public int F() {
        int i10;
        synchronized (this.f27451c) {
            i10 = 0;
            Iterator<c> it = this.f27451c.iterator();
            while (it.hasNext()) {
                c next = it.next();
                TdApi.Message message = next.f27458a.lastMessage;
                if (message != null) {
                    i10 = Math.max(message.date, i10);
                    if (!ob.b.g(next.f27458a, this.f27450b)) {
                        break;
                    }
                }
            }
        }
        return i10;
    }

    public void G(TdApi.Chat chat, o6.g gVar) {
        c cVar;
        int i10;
        TdApi.ChatPosition chatPosition = gVar.f28135a;
        int q10 = q(chat.f19908id);
        if (q10 == -1) {
            if (chatPosition.order != 0) {
                h(new c(chat, j(), chatPosition), gVar);
            }
        } else if (chatPosition.order == 0) {
            I(q10, gVar);
        } else {
            if (gVar.b()) {
                synchronized (this.f27451c) {
                    cVar = this.f27451c.remove(q10);
                    e.s(chatPosition, cVar.f27460c);
                    int binarySearch = Collections.binarySearch(this.f27451c, cVar, this);
                    if (binarySearch < 0) {
                        i10 = (binarySearch * (-1)) - 1;
                        this.f27451c.add(i10, cVar);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (i10 != q10) {
                    this.f27449a.O9().h1(this, cVar.f27458a, q10, i10, gVar);
                    return;
                }
            } else {
                cVar = this.f27451c.get(q10);
            }
            if (gVar.a()) {
                this.f27449a.O9().M0(this, cVar.f27458a, q10, gVar);
            }
        }
    }

    public void H(TdApi.Chat chat) {
        TdApi.ChatPosition a10;
        if (chat.positions != null && (a10 = ob.b.a(chat, j())) != null && a10.order != 0) {
            h(new c(chat, j(), a10), new o6.g(a10, 0));
        }
    }

    public final void I(int i10, o6.g gVar) {
        c remove;
        synchronized (this.f27451c) {
            remove = this.f27451c.remove(i10);
        }
        this.f27449a.O9().w1(this, remove.f27458a, i10, gVar);
    }

    public final void J(int i10) {
        int i11 = this.O;
        if (i11 != i10) {
            this.O = i10;
            this.f27449a.O9().e1(this, i10, i11);
        }
    }

    public void K(f0 f0Var) {
        this.f27449a.O9().c0(this.f27450b, f0Var);
    }

    public int L() {
        return Math.max(this.f27449a.k6(this.f27450b), l(null));
    }

    public void M(f0 f0Var) {
        this.f27449a.O9().p0(this.f27450b, f0Var);
    }

    @Override
    public void R(TdApi.ChatList chatList, int i10, int i11) {
        m0.b(this, chatList, i10, i11);
    }

    @Override
    public void a4(TdApi.ChatList chatList, boolean z10, int i10, int i11, int i12) {
        m0.a(this, chatList, z10, i10, i11, i12);
    }

    public final void h(c cVar, o6.g gVar) {
        int binarySearch = Collections.binarySearch(this.f27451c, cVar, this);
        if (binarySearch < 0) {
            int i10 = (binarySearch * (-1)) - 1;
            synchronized (this.f27451c) {
                this.f27451c.add(i10, cVar);
            }
            for (j<TdApi.Chat> jVar : this.N) {
                jVar.a(cVar.f27458a);
            }
            this.f27449a.O9().J0(this, cVar.f27458a, i10, gVar);
            return;
        }
        throw new IllegalStateException();
    }

    public boolean i() {
        return this.O == 0;
    }

    public TdApi.ChatList j() {
        return this.f27450b;
    }

    public int compare(c cVar, c cVar2) {
        return cVar.compareTo(cVar2);
    }

    public int l(d<TdApi.Chat> dVar) {
        synchronized (this.f27451c) {
            if (dVar == null) {
                return this.f27451c.size();
            }
            int i10 = 0;
            Iterator<c> it = this.f27451c.iterator();
            while (it.hasNext()) {
                if (dVar.a(it.next().f27458a)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    public void u(final d<TdApi.Chat> dVar, final j<List<c>> jVar) {
        if (!this.f27449a.D6()) {
            this.f27449a.bb(new Runnable() {
                @Override
                public final void run() {
                    e8.this.u(dVar, jVar);
                }
            });
        } else {
            jVar.a(A(dVar));
        }
    }

    public boolean n() {
        synchronized (this.f27451c) {
            Iterator<c> it = this.f27451c.iterator();
            while (it.hasNext()) {
                if (t2.R2(it.next().f27458a.lastMessage)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean o() {
        synchronized (this.f27451c) {
            Iterator<c> it = this.f27451c.iterator();
            while (it.hasNext()) {
                if (it.next().f27458a.hasScheduledMessages) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean p() {
        synchronized (this.f27451c) {
            Iterator<c> it = this.f27451c.iterator();
            while (it.hasNext()) {
                if (it.next().f27458a.unreadMentionCount > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public final int q(long j10) {
        Iterator<c> it = this.f27451c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f27458a.f19908id == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void r(d<TdApi.Chat> dVar, final f0 f0Var, final j<List<c>> jVar, int i10, Runnable runnable) {
        u(dVar, new j() {
            @Override
            public final void a(Object obj) {
                e8.this.v(jVar, f0Var, (List) obj);
            }
        });
        D(dVar, i10, runnable);
    }

    public boolean s() {
        return this.O == 2;
    }

    public void t(j<TdApi.Chat> jVar) {
        synchronized (this.f27451c) {
            Iterator<c> it = this.f27451c.iterator();
            while (it.hasNext()) {
                jVar.a(it.next().f27458a);
            }
        }
    }
}
