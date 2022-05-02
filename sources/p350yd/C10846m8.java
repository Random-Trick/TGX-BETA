package p350yd;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5913e;
import p139jb.AbstractC5918j;
import p193nb.C7317b;
import p350yd.C10684g8;
import p350yd.C10930q6;

public class C10846m8 {
    public final C10930q6 f34749a;
    public final C10684g8 f34750b;
    public final AbstractC5912d<TdApi.Chat> f34751c;
    public final boolean f34752d;
    public AbstractC10700h0 f34753e;
    public AbstractC10700h0 f34754f;
    public final List<C10848b> f34755g = new ArrayList();
    public AbstractC5918j<List<C10848b>> f34756h;
    public int f34757i;
    public int f34758j;
    public boolean f34759k;
    public boolean f34760l;

    public class C10847a implements AbstractC10700h0 {
        public final AbstractC10700h0 f34761a;

        public C10847a(AbstractC10700h0 h0Var) {
            this.f34761a = h0Var;
        }

        @Override
        public void mo3013I5(C10684g8 g8Var, int i, int i2) {
            this.f34761a.mo3013I5(g8Var, i, i2);
        }

        @Override
        public void mo3012T1(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
            if (C10846m8.this.f34751c == null || C10846m8.this.f34751c.mo1511a(chat)) {
                C10848b bVar = new C10848b(chat, g8Var.m4290j(), gVar.f35136a, C10846m8.this.f34752d);
                if (C10846m8.this.m3041F()) {
                    i = C10846m8.this.m3021s(bVar);
                }
                if (i == C10846m8.this.f34755g.size()) {
                    C10846m8.this.f34755g.add(bVar);
                } else {
                    C10846m8.this.f34755g.add(i, bVar);
                }
                if (i < C10846m8.this.f34758j) {
                    this.f34761a.mo3012T1(g8Var, chat, i, gVar);
                    C10846m8.this.f34758j++;
                    this.f34761a.mo3009i(g8Var, 2);
                    return;
                }
                C10846m8.this.m3023q(0);
            }
        }

        @Override
        public void mo3011e4(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
            int r = C10846m8.this.m3022r(i, chat.f25367id);
            if (r != -1 && r < C10846m8.this.f34758j) {
                this.f34761a.mo3011e4(g8Var, chat, r, gVar);
                this.f34761a.mo3009i(g8Var, 1);
            }
        }

        @Override
        public void mo3010g1(C10684g8 g8Var, TdApi.Chat chat, int i) {
            TdApi.ChatPosition a;
            int t = C10846m8.this.m3020t(chat.f25367id);
            if (t == -1) {
                if (C10846m8.this.f34751c != null && C10846m8.this.f34751c.mo1511a(chat) && (a = C7317b.m17043a(chat, g8Var.m4290j())) != null && a.order != 0) {
                    C10848b bVar = new C10848b(chat, g8Var.m4290j(), a, C10846m8.this.f34752d);
                    int s = C10846m8.this.m3021s(bVar);
                    if (s == C10846m8.this.f34755g.size()) {
                        C10846m8.this.f34755g.add(bVar);
                        C10846m8.this.m3023q(0);
                        return;
                    }
                    C10846m8.this.f34755g.add(s, bVar);
                    this.f34761a.mo3012T1(g8Var, chat, s, new C10930q6.C10937g(a, 7));
                    C10846m8.this.f34758j++;
                    this.f34761a.mo3009i(g8Var, 2);
                }
            } else if (t < C10846m8.this.f34758j) {
                this.f34761a.mo3010g1(g8Var, chat, i);
                this.f34761a.mo3009i(g8Var, 1);
            }
        }

        @Override
        public void mo3009i(C10684g8 g8Var, int i) {
        }

        @Override
        public void mo3008m5(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
            int r = C10846m8.this.m3022r(i, chat.f25367id);
            if (r != -1 && !((C10848b) C10846m8.this.f34755g.get(r)).f34764N) {
                C10846m8.this.f34755g.remove(r);
                if (r < C10846m8.this.f34758j) {
                    this.f34761a.mo3008m5(g8Var, chat, r, gVar);
                    C10846m8 m8Var = C10846m8.this;
                    m8Var.f34758j--;
                    C10846m8.this.m3023q(4);
                }
            }
        }

        @Override
        public void mo3007n7(C10684g8 g8Var, TdApi.Chat chat, int i, int i2, C10930q6.C10937g gVar) {
            boolean F = C10846m8.this.m3041F();
            if (!F || (i = C10846m8.this.m3022r(i, chat.f25367id)) != -1) {
                int i3 = i;
                C10848b bVar = (C10848b) C10846m8.this.f34755g.remove(i3);
                if (!bVar.f34764N) {
                    TdApi.ChatPosition chatPosition = bVar.f34207c;
                    TdApi.ChatPosition chatPosition2 = gVar.f35136a;
                    chatPosition.order = chatPosition2.order;
                    chatPosition.isPinned = chatPosition2.isPinned;
                    chatPosition.source = chatPosition2.source;
                }
                if (!F || (i2 = C10846m8.this.m3021s(bVar)) != i3) {
                    int i4 = i2;
                    C10846m8.this.f34755g.add(i4, bVar);
                    if (i3 < C10846m8.this.f34758j && i4 < C10846m8.this.f34758j) {
                        this.f34761a.mo3007n7(g8Var, chat, i3, i4, gVar);
                        this.f34761a.mo3009i(g8Var, 8);
                    } else if (i3 < C10846m8.this.f34758j) {
                        this.f34761a.mo3008m5(g8Var, chat, i3, gVar);
                        C10846m8.this.f34758j--;
                        C10846m8.this.m3023q(4);
                    } else if (i4 < C10846m8.this.f34758j) {
                        this.f34761a.mo3012T1(g8Var, chat, i4, gVar);
                        C10846m8.this.f34758j++;
                        this.f34761a.mo3009i(g8Var, 2);
                    }
                } else {
                    C10846m8.this.f34755g.add(i2, bVar);
                    if (i2 < C10846m8.this.f34758j) {
                        this.f34761a.mo3011e4(g8Var, chat, i2, gVar);
                        this.f34761a.mo3009i(g8Var, 1);
                    }
                }
            }
        }
    }

    public static class C10848b extends C10684g8.C10687c {
        public long f34763M;
        public boolean f34764N;

        public C10848b(TdApi.Chat chat, TdApi.ChatList chatList, TdApi.ChatPosition chatPosition, boolean z) {
            super(chat, chatList, chatPosition);
            this.f34764N = z;
        }

        @Override
        public int compareTo(C10684g8.C10687c cVar) {
            long j = cVar instanceof C10848b ? ((C10848b) cVar).f34763M : 0L;
            long j2 = this.f34763M;
            if (j2 != j) {
                return Long.compare(j, j2);
            }
            return super.compareTo(cVar);
        }

        public void m3004c() {
            this.f34763M = SystemClock.uptimeMillis();
            this.f34764N = true;
        }
    }

    public C10846m8(C10930q6 q6Var, TdApi.ChatList chatList, AbstractC5912d<TdApi.Chat> dVar, boolean z) {
        this.f34749a = q6Var;
        this.f34750b = q6Var.m2367l3(chatList);
        this.f34751c = dVar;
        this.f34752d = z;
        this.f34760l = z;
    }

    public void m3046A(int i, final Runnable runnable) {
        this.f34757i += i;
        if (m3023q(0) == 0) {
            this.f34750b.m4275y(i, new Runnable() {
                @Override
                public final void run() {
                    C10846m8.this.m3014z(runnable);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void m3017w(long j, Runnable runnable, TdApi.Chat chat) {
        int t = m3020t(j);
        if (t != -1) {
            this.f34760l = true;
            C10848b remove = this.f34755g.remove(t);
            remove.m3004c();
            int s = m3021s(remove);
            this.f34755g.add(s, remove);
            if (t != s) {
                if (t < this.f34758j) {
                    this.f34754f.mo3007n7(this.f34750b, remove.f34205a, t, s, new C10930q6.C10937g(remove.f34207c, 7));
                    this.f34754f.mo3009i(this.f34750b, 8);
                } else {
                    this.f34754f.mo3012T1(this.f34750b, remove.f34205a, s, new C10930q6.C10937g(remove.f34207c, 7));
                    this.f34758j++;
                    this.f34754f.mo3009i(this.f34750b, 2);
                }
            }
        } else if (chat != null) {
            this.f34760l = true;
            C10848b bVar = new C10848b(chat, this.f34750b.m4290j(), C7317b.m17043a(chat, this.f34750b.m4290j()), this.f34752d);
            bVar.m3004c();
            int s2 = m3021s(bVar);
            this.f34755g.add(s2, bVar);
            this.f34754f.mo3012T1(this.f34750b, bVar.f34205a, s2, new C10930q6.C10937g(bVar.f34207c, 7));
            this.f34758j++;
            this.f34754f.mo3009i(this.f34750b, 2);
        } else {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void m3016x(List list) {
        synchronized (this.f34755g) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C10684g8.C10687c cVar = (C10684g8.C10687c) it.next();
                AbstractC5912d<TdApi.Chat> dVar = this.f34751c;
                if (dVar == null || dVar.mo1511a(cVar.f34205a)) {
                    if (!this.f34760l || m3020t(cVar.f34205a.f25367id) == -1) {
                        arrayList.add(new C10848b(cVar.f34205a, cVar.f34206b, cVar.f34207c, this.f34752d));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean D = mo3043D(arrayList, this.f34755g.size());
                this.f34755g.addAll(arrayList);
                if (D) {
                    this.f34760l = true;
                }
                m3023q(0);
            }
        }
    }

    public void m3015y(Runnable runnable) {
        this.f34759k = false;
        m3023q(0);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void m3014z(Runnable runnable) {
        m3023q(0);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void m3045B(final int i, final Runnable runnable) {
        if (!this.f34759k) {
            this.f34749a.m2579Xa(new Runnable() {
                @Override
                public final void run() {
                    C10846m8.this.m3046A(i, runnable);
                }
            });
        }
    }

    public final int m3044C() {
        int size;
        synchronized (this.f34755g) {
            size = this.f34755g.size();
        }
        return size;
    }

    public boolean mo3043D(List<C10848b> list, int i) {
        return false;
    }

    public boolean m3042E() {
        return this.f34758j == 0 && !this.f34750b.m4281s();
    }

    public final boolean m3041F() {
        return this.f34751c != null || this.f34760l;
    }

    public void m3040G(AbstractC10700h0 h0Var) {
        AbstractC10700h0 h0Var2 = this.f34753e;
        if (h0Var2 != null) {
            this.f34750b.m4300M(h0Var2);
            this.f34753e = null;
        }
    }

    public void m3025o(final long j, AbstractC5913e<TdApi.Function> eVar, final Runnable runnable) {
        if (this.f34753e != null) {
            this.f34749a.m2617V2(j, eVar, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10846m8.this.m3017w(j, runnable, (TdApi.Chat) obj);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public boolean m3024p() {
        return this.f34758j < m3044C() || this.f34750b.m4291i();
    }

    public final int m3023q(int i) {
        if (this.f34759k) {
            return 0;
        }
        int max = Math.max(0, Math.min(this.f34755g.size(), this.f34757i) - this.f34758j);
        if (max > 0) {
            ArrayList arrayList = new ArrayList(max);
            for (int i2 = 0; i2 < max; i2++) {
                arrayList.add(this.f34755g.get(this.f34758j + i2));
            }
            this.f34756h.mo1330a(arrayList);
            this.f34758j += arrayList.size();
            this.f34754f.mo3009i(this.f34750b, i | 2);
        }
        return max;
    }

    public final int m3022r(int i, long j) {
        return m3041F() ? m3020t(j) : i;
    }

    public int m3021s(C10848b bVar) {
        int binarySearch = Collections.binarySearch(this.f34755g, bVar);
        if (binarySearch < 0) {
            return (-binarySearch) - 1;
        }
        throw new IllegalStateException();
    }

    public final int m3020t(long j) {
        int i = 0;
        for (C10848b bVar : this.f34755g) {
            if (bVar.f34205a.f25367id == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m3019u(AbstractC10700h0 h0Var, AbstractC5918j<List<C10848b>> jVar, int i, final Runnable runnable) {
        if (this.f34753e == null) {
            this.f34754f = h0Var;
            this.f34753e = new C10847a(h0Var);
            this.f34756h = jVar;
            AbstractC5918j<List<C10684g8.C10687c>> k8Var = new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C10846m8.this.m3016x((List) obj);
                }
            };
            this.f34759k = true;
            C10684g8 g8Var = this.f34750b;
            AbstractC5912d<TdApi.Chat> dVar = this.f34751c;
            AbstractC10700h0 h0Var2 = this.f34753e;
            this.f34757i = i;
            g8Var.m4282r(dVar, h0Var2, k8Var, i, new Runnable() {
                @Override
                public final void run() {
                    C10846m8.this.m3015y(runnable);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public boolean m3018v() {
        return this.f34758j == m3044C() && this.f34750b.m4281s();
    }
}
