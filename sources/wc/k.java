package wc;

import ce.a0;
import ce.j0;
import hd.c3;
import hd.d3;
import hd.t2;
import ib.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import wc.k;
import zd.hj;
import zd.o6;

public class k {
    public final o6 f25878a;
    public final f f25879b;
    public int f25880c;
    public volatile int f25881d;
    public String f25882e;
    public TdApi.ChatList f25883f;
    public boolean f25884g;
    public boolean f25885h;
    public ArrayList<c3> f25886i;
    public long[] f25887j;
    public boolean f25888k;
    public boolean f25889l;
    public ArrayList<c3> f25890m;
    public String f25891n;
    public ArrayList<c3> f25892o = new ArrayList<>();
    public ArrayList<c3> f25893p;
    public ArrayList<d3> f25894q;
    public boolean f25895r;
    public boolean f25896s;
    public boolean f25897t;
    public boolean f25898u;

    public class a implements Client.g {
        public final int[] M;
        public final TdApi.ChatList N;
        public final int f25899a;
        public final jb.e f25900b;
        public final String f25901c;

        public a(int i10, jb.e eVar, String str, int[] iArr, TdApi.ChatList chatList) {
            this.f25899a = i10;
            this.f25900b = eVar;
            this.f25901c = str;
            this.M = iArr;
            this.N = chatList;
        }

        public void b(int i10, boolean z10, String str, ArrayList arrayList, boolean z11, TdApi.ChatList chatList) {
            if (k.this.f25881d == i10) {
                if (z10) {
                    k.this.f0(i10, str, arrayList);
                } else {
                    k.this.q(i10, str, arrayList);
                }
                if (z11) {
                    k.this.a0(i10, chatList, str);
                }
            }
        }

        @Override
        public void r2(org.drinkless.td.libcore.telegram.TdApi.Object r20) {
            throw new UnsupportedOperationException("Method not decompiled: wc.k.a.r2(org.drinkless.td.libcore.telegram.TdApi$Object):void");
        }
    }

    public class b extends kb.b {
        public final int M;

        public b(int i10) {
            this.M = i10;
        }

        @Override
        public void b() {
            if (k.this.f25881d == this.M) {
                k.this.u();
                k.this.v();
            }
        }
    }

    public class c extends kb.b {
        public final int M;

        public c(int i10) {
            this.M = i10;
        }

        @Override
        public void b() {
            if (k.this.f25881d == this.M) {
                k.this.v();
            }
        }
    }

    public class d implements Client.g {
        public final String M;
        public final int N;
        public final boolean O;
        public final int f25902a;
        public final kb.b f25903b;
        public final TdApi.ChatList f25904c;

        public d(int i10, kb.b bVar, TdApi.ChatList chatList, String str, int i11, boolean z10) {
            this.f25902a = i10;
            this.f25903b = bVar;
            this.f25904c = chatList;
            this.M = str;
            this.N = i11;
            this.O = z10;
        }

        public void b(int i10, d3[] d3VarArr, String str, int i11, boolean z10) {
            if (k.this.f25881d == i10) {
                k.this.f25895r = d3VarArr != null && d3VarArr.length > 0;
                k.this.h0(i10, str, i11, d3VarArr, z10);
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            TdApi.Message[] messageArr;
            if (k.this.f25881d == this.f25902a) {
                kb.b bVar = this.f25903b;
                if (bVar != null) {
                    bVar.c();
                }
                int constructor = object.getConstructor();
                d3[] d3VarArr = null;
                TdApi.Chat chat = null;
                if (constructor == -1679978726) {
                    Log.w("SearchMessages returned error, displaying no results: %s", t2.z5(object));
                } else if (constructor != -16498159) {
                    Log.unexpectedTdlibResponse(object, TdApi.SearchMessages.class, TdApi.Messages.class, TdApi.Error.class);
                    return;
                } else {
                    TdApi.Messages messages = (TdApi.Messages) object;
                    ArrayList arrayList = new ArrayList(messages.messages.length);
                    for (TdApi.Message message : messages.messages) {
                        if (chat == null || chat.f19908id != message.chatId) {
                            chat = k.this.f25878a.W2(message.chatId);
                        }
                        if (k.this.f25879b.A(chat)) {
                            arrayList.add(new d3(k.this.f25878a, this.f25904c, chat, message, this.M));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        TdApi.Message[] messageArr2 = messages.messages;
                        if (messageArr2.length > 0) {
                            TdApi.Message message2 = messageArr2[messageArr2.length - 1];
                            k.this.f25878a.v4().o(new TdApi.SearchMessages(this.f25904c, this.M, message2.date, message2.chatId, message2.f19946id, this.N, null, 0, 0), this);
                            return;
                        }
                    }
                    d3VarArr = (d3[]) arrayList.toArray(new d3[0]);
                }
                final d3[] d3VarArr2 = d3VarArr;
                hj hd2 = k.this.f25878a.hd();
                final int i10 = this.f25902a;
                final String str = this.M;
                final int i11 = this.N;
                final boolean z10 = this.O;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        k.d.this.b(i10, d3VarArr2, str, i11, z10);
                    }
                });
            }
        }
    }

    public static abstract class e implements f {
    }

    public interface f {
        boolean A(TdApi.Chat chat);

        void B(long[] jArr, long[] jArr2);

        void a();

        void b(int i10);

        void c();

        boolean d(ArrayList<c3> arrayList, boolean z10, boolean z11);

        void e(int i10);

        void f(ArrayList<c3> arrayList, int i10);

        void g(int i10, ArrayList<d3> arrayList);

        void h(int i10);

        void i(long j10, int i10, int i11);

        void j(c3 c3Var);

        void k(boolean z10, boolean z11);

        void l(ArrayList<c3> arrayList);

        void m(c3 c3Var);

        void n(ArrayList<c3> arrayList);

        void o(int i10, ArrayList<c3> arrayList);

        void p();

        void q(int i10);

        void r(c3 c3Var, int i10, int i11);

        void s(ArrayList<d3> arrayList);

        void t(int i10, ArrayList<c3> arrayList);

        int u();

        void v(int i10, ArrayList<d3> arrayList);

        boolean w(TdApi.Chat chat);

        void x(boolean z10);

        void y(long j10);

        void z(int i10);
    }

    public k(o6 o6Var, e eVar) {
        this.f25878a = o6Var;
        this.f25879b = eVar;
    }

    public static boolean D(int i10) {
        return (i10 & 15320) != 0;
    }

    public void F(int i10, boolean z10, TdApi.ChatList chatList, String str, ArrayList arrayList, long[] jArr) {
        if (this.f25881d == i10 || z10) {
            j0(i10, chatList, str, arrayList, jArr, z10);
        }
    }

    public void G(final int i10, final boolean z10, final TdApi.ChatList chatList, final String str, TdApi.Object object) {
        final long[] jArr;
        if (this.f25881d == i10 || z10) {
            int constructor = object.getConstructor();
            int i11 = 0;
            final ArrayList arrayList = null;
            if (constructor == -1679978726) {
                Log.i("GetTopChats error, displaying no results: %s", t2.z5(object));
            } else if (constructor != 1809654812) {
                Log.unexpectedTdlibResponse(object, TdApi.GetTopChats.class, TdApi.Chats.class, TdApi.Error.class);
                return;
            } else {
                long[] jArr2 = ((TdApi.Chats) object).chatIds;
                ArrayList arrayList2 = new ArrayList(jArr2.length);
                int S = S(this.f25878a, this.f25879b, this.f25880c, arrayList2, chatList, jArr2, null, false, null);
                if (S != 0) {
                    if (S != jArr2.length) {
                        jArr2 = new long[S];
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            jArr2[i11] = ((c3) it.next()).i();
                            i11++;
                        }
                    }
                    jArr = jArr2;
                    arrayList = arrayList2;
                    this.f25878a.hd().post(new Runnable() {
                        @Override
                        public final void run() {
                            k.this.F(i10, z10, chatList, str, arrayList, jArr);
                        }
                    });
                }
            }
            jArr = null;
            this.f25878a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    k.this.F(i10, z10, chatList, str, arrayList, jArr);
                }
            });
        }
    }

    public void H(int i10, TdApi.ChatList chatList, String str, ArrayList arrayList) {
        if (this.f25881d == i10) {
            d0(i10, chatList, str, arrayList);
        }
    }

    public void I(final int i10, kb.b bVar, final TdApi.ChatList chatList, String str, final String str2, TdApi.Object object) {
        ArrayList arrayList;
        if (this.f25881d == i10) {
            bVar.c();
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.i("SearchPublicChats error, showing no results: %s", t2.z5(object));
                arrayList = null;
            } else if (constructor != 1809654812) {
                Log.unexpectedTdlibResponse(object, TdApi.SearchChats.class, TdApi.Chats.class, TdApi.Error.class);
                return;
            } else {
                long[] jArr = ((TdApi.Chats) object).chatIds;
                arrayList = new ArrayList(jArr.length);
                S(this.f25878a, this.f25879b, this.f25880c & (-129), arrayList, chatList, jArr, str, true, null);
            }
            final ArrayList arrayList2 = arrayList;
            this.f25878a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    k.this.H(i10, chatList, str2, arrayList2);
                }
            });
        }
    }

    public void J(int i10, boolean z10, TdApi.ChatList chatList, String str, int i11, kb.b bVar) {
        long j10;
        int i12;
        ArrayList<d3> arrayList;
        if (this.f25881d == i10) {
            long j11 = 0;
            if (z10) {
                TdApi.Message e10 = this.f25894q.get(arrayList.size() - 1).e();
                i12 = e10.date;
                j11 = e10.chatId;
                j10 = e10.f19946id;
            } else {
                j10 = 0;
                i12 = 0;
            }
            this.f25878a.v4().o(new TdApi.SearchMessages(chatList, str, i12, j11, j10, i11, null, 0, 0), new d(i10, bVar, chatList, str, i11, z10));
        }
    }

    public static int S(o6 o6Var, f fVar, int i10, ArrayList<c3> arrayList, TdApi.ChatList chatList, long[] jArr, String str, boolean z10, long[] jArr2) {
        o6 o6Var2 = o6Var;
        List<TdApi.Chat> m42 = o6Var2.m4(jArr);
        arrayList.ensureCapacity(jArr.length);
        boolean z11 = (i10 & 8) != 0;
        boolean z12 = (i10 & 16) != 0;
        boolean z13 = (i10 & Log.TAG_YOUTUBE) != 0;
        boolean z14 = (i10 & 64) != 0;
        boolean z15 = (i10 & Log.TAG_CRASH) != 0;
        boolean z16 = (i10 & Log.TAG_EMOJI) != 0;
        boolean z17 = (i10 & Log.TAG_LUX) != 0;
        boolean z18 = (i10 & Log.TAG_VOICE) != 0;
        boolean z19 = (i10 & Log.TAG_VIDEO) != 0;
        boolean z20 = ((i10 & Log.TAG_GIF_LOADER) == 0 || fVar == null) ? false : true;
        if (jArr2 != null || D(i10)) {
            int i11 = 0;
            for (TdApi.Chat chat : m42) {
                if (jArr2 == null || ib.b.s(jArr2, chat.f19908id) == -1) {
                    if (!z15 || chat.f19908id != o6Var.qb()) {
                        if (!z18 || !o6Var2.O6(chat.f19908id)) {
                            if (!z19 || !o6Var2.b7(chat.f19908id)) {
                                if (!z12 || (ob.a.l(chat.f19908id) && o6Var2.j2(chat))) {
                                    if (!z17 || !ob.a.j(chat.f19908id)) {
                                        if (!z11 || o6Var2.y6(chat)) {
                                            if (!z14 || !o6Var2.M6(chat)) {
                                                if (!z16 || !o6Var2.v7(chat)) {
                                                    if (!z13 || (ob.a.l(chat.f19908id) && o6Var2.U6(chat))) {
                                                        if (!z20 || fVar.w(chat)) {
                                                            c3 c3Var = new c3(o6Var, chatList, chat, z10, str);
                                                            if (fVar != null) {
                                                                fVar.j(c3Var);
                                                            }
                                                            arrayList.add(c3Var);
                                                            i11++;
                                                            o6Var2 = o6Var;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return i11;
        }
        for (TdApi.Chat chat2 : m42) {
            c3 c3Var2 = new c3(o6Var, chatList, chat2, z10, str);
            if (fVar != null) {
                fVar.j(c3Var2);
            }
            arrayList.add(c3Var2);
        }
        return m42.size();
    }

    public final int A(long j10) {
        ArrayList<c3> arrayList = this.f25890m;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            Iterator<c3> it = this.f25890m.iterator();
            while (it.hasNext()) {
                if (it.next().i() == j10) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public boolean B() {
        return this.f25897t;
    }

    public final boolean C() {
        return D(this.f25880c);
    }

    public boolean E() {
        return this.f25884g;
    }

    public void K() {
        ArrayList<d3> arrayList;
        if (!this.f25896s && this.f25895r && (arrayList = this.f25894q) != null && !arrayList.isEmpty()) {
            c0(this.f25881d, this.f25883f, this.f25882e, true);
        }
    }

    public final void L(final int i10, final TdApi.ChatList chatList, final String str, final boolean z10) {
        if (this.f25881d == i10 || z10) {
            boolean z11 = !i.i(str);
            if (!z10) {
                if (z11) {
                    this.f25888k = true;
                    this.f25889l = false;
                } else {
                    this.f25888k = true;
                    this.f25889l = true;
                }
            }
            if (z10 || ((1 & this.f25880c) != 0 && !z11)) {
                this.f25878a.v4().o(new TdApi.GetTopChats((this.f25880c & Log.TAG_CAMERA) != 0 ? new TdApi.TopChatCategoryGroups() : new TdApi.TopChatCategoryUsers(), 30), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        k.this.G(i10, z10, chatList, str, object);
                    }
                });
            } else {
                b0(i10, chatList, str);
            }
        }
    }

    public void M(TdApi.ChatList chatList) {
        if (this.f25884g) {
            this.f25884g = false;
            this.f25879b.a();
            T(chatList, "", 0);
            r(null);
        }
    }

    public final void N() {
        if (!this.f25897t) {
            this.f25897t = true;
            this.f25879b.p();
        }
    }

    public final void O() {
        if (!this.f25898u) {
            this.f25898u = true;
            this.f25879b.b(this.f25881d);
        }
    }

    public void P(TdApi.ChatList chatList) {
        if (!this.f25884g) {
            this.f25884g = true;
            this.f25879b.c();
            T(chatList, "", 1);
        }
    }

    public void Q(TdApi.ChatList chatList, String str) {
        if (!this.f25885h) {
            this.f25885h = true;
            T(chatList, str, 1);
        }
    }

    public void R(TdApi.ChatList chatList, String str) {
        T(chatList, str, 0);
    }

    public final void T(TdApi.ChatList chatList, String str, int i10) {
        String str2 = this.f25882e;
        if (str2 == null || !i.c(str2, str) || !ob.e.E(this.f25883f, chatList)) {
            int z10 = z();
            Z();
            this.f25882e = str;
            this.f25883f = chatList;
            this.f25879b.x(i.i(str));
            if ((this.f25880c & 32) != 0) {
                c0(z10, chatList, str, false);
            } else {
                L(z10, chatList, str, false);
            }
        } else if (this.f25897t && i10 != 0 && i.i(this.f25882e)) {
            if (i10 == 1) {
                W();
            } else {
                L(this.f25881d, this.f25883f, this.f25882e, false);
            }
        }
    }

    public final void U(int i10, ArrayList<c3> arrayList, long[] jArr, boolean z10) {
        if (this.f25881d == i10) {
            ArrayList<c3> arrayList2 = this.f25886i;
            int i11 = 0;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            if (arrayList != null) {
                i11 = arrayList.size();
            }
            if (size != i11) {
                if (size == 0) {
                    this.f25886i = arrayList;
                    this.f25887j = jArr;
                    this.f25879b.d(arrayList, true, z10);
                } else if (i11 == 0) {
                    this.f25886i = arrayList;
                    this.f25887j = jArr;
                    this.f25879b.k(z10, true);
                } else if (!Arrays.equals(this.f25887j, jArr)) {
                    long[] jArr2 = this.f25887j;
                    this.f25886i = arrayList;
                    this.f25887j = jArr;
                    this.f25879b.B(jArr2, jArr);
                }
            } else if (i11 > 0 && !Arrays.equals(this.f25887j, jArr)) {
                long[] jArr3 = this.f25887j;
                this.f25886i = arrayList;
                this.f25887j = jArr;
                this.f25879b.B(jArr3, jArr);
            }
        }
    }

    public void V(TdApi.ChatList chatList) {
        String str = this.f25882e;
        if (str == null) {
            str = "";
        }
        T(chatList, str, 2);
    }

    public final void W() {
        int i10 = this.f25880c;
        if ((i10 & 1) != 0 && (i10 & 32) == 0) {
            L(this.f25881d, this.f25883f, this.f25882e, true);
        }
    }

    public void X(c3 c3Var) {
        int A = A(c3Var.i());
        if (A != -1) {
            this.f25890m.remove(A);
            if (this.f25890m.isEmpty()) {
                this.f25879b.e(1);
            } else {
                this.f25879b.i(c3Var.i(), A, this.f25890m.size() + 1);
            }
            this.f25878a.v4().o(new TdApi.RemoveRecentlyFoundChat(c3Var.i()), this.f25878a.na());
        }
    }

    public void Y(long j10) {
        int s10 = ib.b.s(this.f25887j, j10);
        if (s10 != -1) {
            this.f25886i.remove(s10);
            this.f25887j = ib.b.y(this.f25887j, s10);
            this.f25878a.v4().o(new TdApi.RemoveTopChat(new TdApi.TopChatCategoryUsers(), j10), this.f25878a.na());
            if (this.f25887j.length == 0) {
                this.f25879b.k(true, !i.i(this.f25882e));
                return;
            }
            this.f25879b.y(j10);
            W();
        }
    }

    public final void Z() {
        this.f25882e = null;
        this.f25883f = null;
        this.f25888k = false;
        this.f25895r = false;
        e0(false);
        this.f25897t = false;
        this.f25898u = false;
    }

    public final void a0(final int i10, final TdApi.ChatList chatList, final String str) {
        if (this.f25881d == i10) {
            if ((this.f25880c & 4) == 0) {
                O();
                c0(i10, chatList, str, false);
                return;
            }
            final String substring = (i.i(str) || str.charAt(0) != '@') ? str : str.substring(1);
            O();
            final b bVar = new b(i10);
            bVar.e(j0.o());
            if (i.i(str)) {
                u();
                v();
                N();
                return;
            }
            this.f25878a.hd().post(bVar);
            this.f25878a.v4().o(new TdApi.SearchPublicChats(substring), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    k.this.I(i10, bVar, chatList, substring, str, object);
                }
            });
        }
    }

    public final void b0(int i10, TdApi.ChatList chatList, String str) {
        if (this.f25881d == i10) {
            int[] iArr = new int[2];
            this.f25878a.v4().o(new TdApi.SearchChats(str, i.i(str) ? 20 : C() ? 50 : 30), new a(i10, new jb.e(16), str, iArr, chatList));
        }
    }

    public final void c0(final int i10, final TdApi.ChatList chatList, final String str, final boolean z10) {
        c cVar;
        if (this.f25881d == i10 && !this.f25896s) {
            if ((this.f25880c & 2) == 0) {
                N();
                return;
            }
            e0(true);
            if (z10) {
                cVar = null;
            } else {
                cVar = new c(i10);
                cVar.e(j0.o());
                this.f25878a.hd().post(cVar);
            }
            final c cVar2 = cVar;
            final int c10 = z10 ? 30 : a0.c(a0.i(72.0f), 5, a0.D() - this.f25879b.u());
            Runnable fVar = new Runnable() {
                @Override
                public final void run() {
                    k.this.J(i10, z10, chatList, str, c10, cVar2);
                }
            };
            if (z10) {
                fVar.run();
            } else {
                this.f25878a.hd().postDelayed(fVar, 150L);
            }
        }
    }

    public final void d0(int i10, TdApi.ChatList chatList, String str, ArrayList<c3> arrayList) {
        if (this.f25881d == i10) {
            ArrayList<c3> arrayList2 = this.f25893p;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            this.f25893p = arrayList;
            int size2 = arrayList != null ? arrayList.size() : 0;
            if (size == size2 || (size > 0 && size2 > 0)) {
                if (size != 0) {
                    this.f25879b.t(size, arrayList);
                }
            } else if (size2 == 0) {
                this.f25879b.h(size);
            } else if (size == 0) {
                this.f25879b.n(arrayList);
            }
            c0(i10, chatList, str, false);
        }
    }

    public final void e0(boolean z10) {
        if (this.f25896s != z10) {
            this.f25896s = z10;
        }
    }

    public final void f0(int i10, String str, ArrayList<c3> arrayList) {
        if (this.f25881d == i10) {
            ArrayList<c3> arrayList2 = this.f25890m;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            g0(arrayList, str);
            int size2 = arrayList != null ? arrayList.size() : 0;
            if (size == size2 || (size > 0 && size2 > 0)) {
                if (size != 0) {
                    this.f25879b.o(size, arrayList);
                }
            } else if (size2 == 0) {
                this.f25879b.e(size);
            } else if (size == 0) {
                this.f25879b.l(arrayList);
            }
            if (this.f25888k) {
                this.f25888k = false;
                if (this.f25889l) {
                    ArrayList<c3> arrayList3 = this.f25886i;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        this.f25879b.d(this.f25886i, false, false);
                        return;
                    }
                    return;
                }
                this.f25879b.k(false, false);
            }
        }
    }

    public final void g0(ArrayList<c3> arrayList, String str) {
        this.f25890m = arrayList;
        this.f25891n = str;
    }

    public final void h0(int i10, String str, int i11, d3[] d3VarArr, boolean z10) {
        if (this.f25881d == i10 && this.f25896s) {
            e0(false);
            ArrayList<d3> arrayList = this.f25894q;
            int size = arrayList != null ? arrayList.size() : 0;
            int length = d3VarArr != null ? d3VarArr.length : 0;
            int i12 = z10 ? size + length : length;
            if (!z10) {
                this.f25879b.z(this.f25881d);
            }
            if (length == 0) {
                this.f25895r = false;
                if (!z10) {
                    v();
                }
                N();
                return;
            }
            if (this.f25894q == null) {
                this.f25894q = new ArrayList<>(d3VarArr.length);
            }
            ArrayList<d3> arrayList2 = this.f25894q;
            arrayList2.ensureCapacity(arrayList2.size() + d3VarArr.length);
            Collections.addAll(this.f25894q, d3VarArr);
            if (z10) {
                this.f25879b.v(size, this.f25894q);
            } else if (size == 0) {
                this.f25879b.s(this.f25894q);
            } else if (size == i12 || (size > 0 && i12 > 0)) {
                this.f25879b.g(size, this.f25894q);
            }
            if (!this.f25895r) {
                N();
            }
        }
    }

    public void i0(int i10) {
        this.f25880c = i10;
    }

    public final void j0(int i10, TdApi.ChatList chatList, String str, ArrayList<c3> arrayList, long[] jArr, boolean z10) {
        int i11 = 0;
        boolean z11 = this.f25881d != i10 || z10;
        ArrayList<c3> arrayList2 = this.f25886i;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        if (arrayList != null) {
            i11 = arrayList.size();
        }
        if (size != 0 || i11 != 0) {
            U(i10, arrayList, jArr, z11);
            if (!z11) {
                b0(i10, chatList, str);
            }
        } else if (!z11) {
            b0(i10, chatList, str);
        }
    }

    public final void q(int i10, String str, ArrayList<c3> arrayList) {
        if (this.f25881d == i10) {
            ArrayList<c3> arrayList2 = this.f25890m;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            if (size == 0) {
                f0(i10, str, arrayList);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                this.f25890m.addAll(arrayList);
                this.f25879b.f(arrayList, size);
            }
        }
    }

    public void r(c3 c3Var) {
        s(c3Var, true);
    }

    public final void s(c3 c3Var, boolean z10) {
        if (!this.f25884g) {
            if (z10 && !this.f25892o.isEmpty()) {
                Iterator<c3> it = this.f25892o.iterator();
                while (it.hasNext()) {
                    s(it.next(), false);
                }
                this.f25892o.clear();
            }
            if (c3Var != null) {
                if (i.i(this.f25882e) && this.f25890m != null && i.i(this.f25891n)) {
                    int A = A(c3Var.i());
                    if (A == -1) {
                        if (this.f25890m == null) {
                            this.f25890m = new ArrayList<>();
                        }
                        this.f25890m.add(0, c3Var);
                        if (this.f25890m.size() == 1) {
                            this.f25879b.l(this.f25890m);
                        } else {
                            this.f25879b.m(c3Var);
                        }
                    } else if (A != 0) {
                        c3 remove = this.f25890m.remove(A);
                        if (remove == c3Var || remove.a() == c3Var.a() || (remove.p() == c3Var.p() && c3Var.p() != 0)) {
                            this.f25890m.add(0, remove);
                            this.f25879b.r(remove, A, this.f25890m.size());
                        } else {
                            throw new RuntimeException("Stub!");
                        }
                    }
                }
                this.f25878a.v4().o(new TdApi.AddRecentlyFoundChat(c3Var.a()), this.f25878a.na());
            }
        } else if (c3Var != null) {
            this.f25892o.add(c3Var);
        }
    }

    public boolean t() {
        return i.i(this.f25882e);
    }

    public final void u() {
        ArrayList<c3> arrayList = this.f25893p;
        if (arrayList != null && arrayList.size() > 0) {
            this.f25879b.h(this.f25893p.size());
            this.f25893p = null;
        }
    }

    public final void v() {
        ArrayList<d3> arrayList = this.f25894q;
        if (arrayList != null && arrayList.size() > 0) {
            this.f25879b.q(this.f25894q.size());
            this.f25894q.clear();
        }
    }

    public void w() {
        ArrayList<c3> arrayList = this.f25890m;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            if (i.i(this.f25882e)) {
                g0(null, this.f25882e);
                this.f25879b.e(size);
            }
            this.f25878a.v4().o(new TdApi.ClearRecentlyFoundChats(), this.f25878a.na());
        }
    }

    public int x() {
        ArrayList<d3> arrayList = this.f25894q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public ArrayList<c3> y() {
        return this.f25886i;
    }

    public final int z() {
        if (this.f25881d == Integer.MAX_VALUE) {
            this.f25881d = 0;
        } else {
            this.f25881d++;
        }
        return this.f25881d;
    }
}
