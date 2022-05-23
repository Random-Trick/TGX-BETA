package zd;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kb.d;
import kb.e;
import kb.j;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.e8;
import zd.o6;

public class k8 {
    public final o6 f27855a;
    public final e8 f27856b;
    public final d<TdApi.Chat> f27857c;
    public final boolean f27858d;
    public f0 f27859e;
    public f0 f27860f;
    public final List<b> f27861g = new ArrayList();
    public j<List<b>> f27862h;
    public int f27863i;
    public int f27864j;
    public boolean f27865k;
    public boolean f27866l;

    public class a implements f0 {
        public final f0 f27867a;

        public a(f0 f0Var) {
            this.f27867a = f0Var;
        }

        @Override
        public void G6(e8 e8Var, TdApi.Chat chat, int i10, int i11, o6.g gVar) {
            boolean F = k8.this.F();
            if (!F || (i10 = k8.this.r(i10, chat.f19908id)) != -1) {
                int i12 = i10;
                b bVar = (b) k8.this.f27861g.remove(i12);
                if (!bVar.N) {
                    TdApi.ChatPosition chatPosition = bVar.f27460c;
                    TdApi.ChatPosition chatPosition2 = gVar.f28135a;
                    chatPosition.order = chatPosition2.order;
                    chatPosition.isPinned = chatPosition2.isPinned;
                    chatPosition.source = chatPosition2.source;
                }
                if (!F || (i11 = k8.this.s(bVar)) != i12) {
                    int i13 = i11;
                    k8.this.f27861g.add(i13, bVar);
                    if (i12 < k8.this.f27864j && i13 < k8.this.f27864j) {
                        this.f27867a.G6(e8Var, chat, i12, i13, gVar);
                        this.f27867a.U6(e8Var, 8);
                    } else if (i12 < k8.this.f27864j) {
                        this.f27867a.Y6(e8Var, chat, i12, gVar);
                        k8.this.f27864j--;
                        k8.this.q(4);
                    } else if (i13 < k8.this.f27864j) {
                        this.f27867a.X2(e8Var, chat, i13, gVar);
                        k8.this.f27864j++;
                        this.f27867a.U6(e8Var, 2);
                    }
                } else {
                    k8.this.f27861g.add(i11, bVar);
                    if (i11 < k8.this.f27864j) {
                        this.f27867a.i2(e8Var, chat, i11, gVar);
                        this.f27867a.U6(e8Var, 1);
                    }
                }
            }
        }

        @Override
        public void R0(e8 e8Var, TdApi.Chat chat, int i10) {
            TdApi.ChatPosition a10;
            int t10 = k8.this.t(chat.f19908id);
            if (t10 == -1) {
                if (k8.this.f27857c != null && k8.this.f27857c.a(chat) && (a10 = ob.b.a(chat, e8Var.j())) != null && a10.order != 0) {
                    b bVar = new b(chat, e8Var.j(), a10, k8.this.f27858d);
                    int s10 = k8.this.s(bVar);
                    if (s10 == k8.this.f27861g.size()) {
                        k8.this.f27861g.add(bVar);
                        k8.this.q(0);
                        return;
                    }
                    k8.this.f27861g.add(s10, bVar);
                    this.f27867a.X2(e8Var, chat, s10, new o6.g(a10, 7));
                    k8.this.f27864j++;
                    this.f27867a.U6(e8Var, 2);
                }
            } else if (t10 < k8.this.f27864j) {
                this.f27867a.R0(e8Var, chat, i10);
                this.f27867a.U6(e8Var, 1);
            }
        }

        @Override
        public void U6(e8 e8Var, int i10) {
        }

        @Override
        public void X2(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar) {
            if (k8.this.f27857c == null || k8.this.f27857c.a(chat)) {
                b bVar = new b(chat, e8Var.j(), gVar.f28135a, k8.this.f27858d);
                if (k8.this.F()) {
                    i10 = k8.this.s(bVar);
                }
                if (i10 == k8.this.f27861g.size()) {
                    k8.this.f27861g.add(bVar);
                } else {
                    k8.this.f27861g.add(i10, bVar);
                }
                if (i10 < k8.this.f27864j) {
                    this.f27867a.X2(e8Var, chat, i10, gVar);
                    k8.this.f27864j++;
                    this.f27867a.U6(e8Var, 2);
                    return;
                }
                k8.this.q(0);
            }
        }

        @Override
        public void Y6(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar) {
            int r10 = k8.this.r(i10, chat.f19908id);
            if (r10 != -1 && !((b) k8.this.f27861g.get(r10)).N) {
                k8.this.f27861g.remove(r10);
                if (r10 < k8.this.f27864j) {
                    this.f27867a.Y6(e8Var, chat, r10, gVar);
                    k8 k8Var = k8.this;
                    k8Var.f27864j--;
                    k8.this.q(4);
                }
            }
        }

        @Override
        public void i2(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar) {
            int r10 = k8.this.r(i10, chat.f19908id);
            if (r10 != -1 && r10 < k8.this.f27864j) {
                this.f27867a.i2(e8Var, chat, r10, gVar);
                this.f27867a.U6(e8Var, 1);
            }
        }

        @Override
        public void i5(e8 e8Var, int i10, int i11) {
            this.f27867a.i5(e8Var, i10, i11);
        }
    }

    public static class b extends e8.c {
        public long M;
        public boolean N;

        public b(TdApi.Chat chat, TdApi.ChatList chatList, TdApi.ChatPosition chatPosition, boolean z10) {
            super(chat, chatList, chatPosition);
            this.N = z10;
        }

        @Override
        public int compareTo(e8.c cVar) {
            long j10 = cVar instanceof b ? ((b) cVar).M : 0L;
            long j11 = this.M;
            if (j11 != j10) {
                return Long.compare(j10, j11);
            }
            return super.compareTo(cVar);
        }

        public void c() {
            this.M = SystemClock.uptimeMillis();
            this.N = true;
        }
    }

    public k8(o6 o6Var, TdApi.ChatList chatList, d<TdApi.Chat> dVar, boolean z10) {
        this.f27855a = o6Var;
        this.f27856b = o6Var.o3(chatList);
        this.f27857c = dVar;
        this.f27858d = z10;
        this.f27866l = z10;
    }

    public void A(int i10, final Runnable runnable) {
        this.f27863i += i10;
        if (q(0) == 0) {
            this.f27856b.y(i10, new Runnable() {
                @Override
                public final void run() {
                    k8.this.z(runnable);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void w(long j10, Runnable runnable, TdApi.Chat chat) {
        int t10 = t(j10);
        if (t10 != -1) {
            this.f27866l = true;
            b remove = this.f27861g.remove(t10);
            remove.c();
            int s10 = s(remove);
            this.f27861g.add(s10, remove);
            if (t10 != s10) {
                if (t10 < this.f27864j) {
                    this.f27860f.G6(this.f27856b, remove.f27458a, t10, s10, new o6.g(remove.f27460c, 7));
                    this.f27860f.U6(this.f27856b, 8);
                } else {
                    this.f27860f.X2(this.f27856b, remove.f27458a, s10, new o6.g(remove.f27460c, 7));
                    this.f27864j++;
                    this.f27860f.U6(this.f27856b, 2);
                }
            }
        } else if (chat != null) {
            this.f27866l = true;
            b bVar = new b(chat, this.f27856b.j(), ob.b.a(chat, this.f27856b.j()), this.f27858d);
            bVar.c();
            int s11 = s(bVar);
            this.f27861g.add(s11, bVar);
            this.f27860f.X2(this.f27856b, bVar.f27458a, s11, new o6.g(bVar.f27460c, 7));
            this.f27864j++;
            this.f27860f.U6(this.f27856b, 2);
        } else {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void x(List list) {
        synchronized (this.f27861g) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e8.c cVar = (e8.c) it.next();
                d<TdApi.Chat> dVar = this.f27857c;
                if (dVar == null || dVar.a(cVar.f27458a)) {
                    if (!this.f27866l || t(cVar.f27458a.f19908id) == -1) {
                        arrayList.add(new b(cVar.f27458a, cVar.f27459b, cVar.f27460c, this.f27858d));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean D = D(arrayList, this.f27861g.size());
                this.f27861g.addAll(arrayList);
                if (D) {
                    this.f27866l = true;
                }
                q(0);
            }
        }
    }

    public void y(Runnable runnable) {
        this.f27865k = false;
        q(0);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void z(Runnable runnable) {
        q(0);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void B(final int i10, final Runnable runnable) {
        if (!this.f27865k) {
            this.f27855a.bb(new Runnable() {
                @Override
                public final void run() {
                    k8.this.A(i10, runnable);
                }
            });
        }
    }

    public final int C() {
        int size;
        synchronized (this.f27861g) {
            size = this.f27861g.size();
        }
        return size;
    }

    public boolean D(List<b> list, int i10) {
        return false;
    }

    public boolean E() {
        return this.f27864j == 0 && !this.f27856b.s();
    }

    public final boolean F() {
        return this.f27857c != null || this.f27866l;
    }

    public void G(f0 f0Var) {
        f0 f0Var2 = this.f27859e;
        if (f0Var2 != null) {
            this.f27856b.M(f0Var2);
            this.f27859e = null;
        }
    }

    public void o(final long j10, e<TdApi.Function> eVar, final Runnable runnable) {
        if (this.f27859e != null) {
            this.f27855a.X2(j10, eVar, new j() {
                @Override
                public final void a(Object obj) {
                    k8.this.w(j10, runnable, (TdApi.Chat) obj);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public boolean p() {
        return this.f27864j < C() || this.f27856b.i();
    }

    public final int q(int i10) {
        if (this.f27865k) {
            return 0;
        }
        int max = Math.max(0, Math.min(this.f27861g.size(), this.f27863i) - this.f27864j);
        if (max > 0) {
            ArrayList arrayList = new ArrayList(max);
            for (int i11 = 0; i11 < max; i11++) {
                arrayList.add(this.f27861g.get(this.f27864j + i11));
            }
            this.f27862h.a(arrayList);
            this.f27864j += arrayList.size();
            this.f27860f.U6(this.f27856b, i10 | 2);
        }
        return max;
    }

    public final int r(int i10, long j10) {
        return F() ? t(j10) : i10;
    }

    public int s(b bVar) {
        int binarySearch = Collections.binarySearch(this.f27861g, bVar);
        if (binarySearch < 0) {
            return (-binarySearch) - 1;
        }
        throw new IllegalStateException();
    }

    public final int t(long j10) {
        int i10 = 0;
        for (b bVar : this.f27861g) {
            if (bVar.f27458a.f19908id == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void u(f0 f0Var, j<List<b>> jVar, int i10, final Runnable runnable) {
        if (this.f27859e == null) {
            this.f27860f = f0Var;
            this.f27859e = new a(f0Var);
            this.f27862h = jVar;
            j<List<e8.c>> i8Var = new j() {
                @Override
                public final void a(Object obj) {
                    k8.this.x((List) obj);
                }
            };
            this.f27865k = true;
            e8 e8Var = this.f27856b;
            d<TdApi.Chat> dVar = this.f27857c;
            f0 f0Var2 = this.f27859e;
            this.f27863i = i10;
            e8Var.r(dVar, f0Var2, i8Var, i10, new Runnable() {
                @Override
                public final void run() {
                    k8.this.y(runnable);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public boolean v() {
        return this.f27864j == C() && this.f27856b.s();
    }
}
