package vc;

import be.C1357a0;
import be.C1379j0;
import gd.C4601c3;
import gd.C4614d3;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p108hb.C5062b;
import p108hb.C5070i;
import p124ib.C5322e;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7316a;
import p193nb.C7321e;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import vc.C9914k;

public class C9914k {
    public final C10930q6 f32258a;
    public final AbstractC9920f f32259b;
    public int f32260c;
    public volatile int f32261d;
    public String f32262e;
    public TdApi.ChatList f32263f;
    public boolean f32264g;
    public boolean f32265h;
    public ArrayList<C4601c3> f32266i;
    public long[] f32267j;
    public boolean f32268k;
    public boolean f32269l;
    public ArrayList<C4601c3> f32270m;
    public String f32271n;
    public ArrayList<C4601c3> f32272o = new ArrayList<>();
    public ArrayList<C4601c3> f32273p;
    public ArrayList<C4614d3> f32274q;
    public boolean f32275r;
    public boolean f32276s;
    public boolean f32277t;
    public boolean f32278u;

    public class C9915a implements Client.AbstractC7865g {
        public final int[] f32279M;
        public final TdApi.ChatList f32280N;
        public final int f32282a;
        public final C5322e f32283b;
        public final String f32284c;

        public C9915a(int i, C5322e eVar, String str, int[] iArr, TdApi.ChatList chatList) {
            this.f32282a = i;
            this.f32283b = eVar;
            this.f32284c = str;
            this.f32279M = iArr;
            this.f32280N = chatList;
        }

        public void m6507b(int i, boolean z, String str, ArrayList arrayList, boolean z2, TdApi.ChatList chatList) {
            if (C9914k.this.f32261d == i) {
                if (z) {
                    C9914k.this.m6533f0(i, str, arrayList);
                } else {
                    C9914k.this.m6518q(i, str, arrayList);
                }
                if (z2) {
                    C9914k.this.m6543a0(i, chatList, str);
                }
            }
        }

        @Override
        public void mo255t2(org.drinkless.p210td.libcore.telegram.TdApi.Object r20) {
            throw new UnsupportedOperationException("Method not decompiled: vc.C9914k.C9915a.mo255t2(org.drinkless.td.libcore.telegram.TdApi$Object):void");
        }
    }

    public class C9916b extends AbstractRunnableC5910b {
        public final int f32285M;

        public C9916b(int i) {
            this.f32285M = i;
        }

        @Override
        public void mo1364b() {
            if (C9914k.this.f32261d == this.f32285M) {
                C9914k.this.m6514u();
                C9914k.this.m6513v();
            }
        }
    }

    public class C9917c extends AbstractRunnableC5910b {
        public final int f32287M;

        public C9917c(int i) {
            this.f32287M = i;
        }

        @Override
        public void mo1364b() {
            if (C9914k.this.f32261d == this.f32287M) {
                C9914k.this.m6513v();
            }
        }
    }

    public class C9918d implements Client.AbstractC7865g {
        public final String f32289M;
        public final int f32290N;
        public final boolean f32291O;
        public final int f32293a;
        public final AbstractRunnableC5910b f32294b;
        public final TdApi.ChatList f32295c;

        public C9918d(int i, AbstractRunnableC5910b bVar, TdApi.ChatList chatList, String str, int i2, boolean z) {
            this.f32293a = i;
            this.f32294b = bVar;
            this.f32295c = chatList;
            this.f32289M = str;
            this.f32290N = i2;
            this.f32291O = z;
        }

        public void m6505b(int i, C4614d3[] d3VarArr, String str, int i2, boolean z) {
            if (C9914k.this.f32261d == i) {
                C9914k.this.f32275r = d3VarArr != null && d3VarArr.length > 0;
                C9914k.this.m6529h0(i, str, i2, d3VarArr, z);
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            TdApi.Message[] messageArr;
            if (C9914k.this.f32261d == this.f32293a) {
                AbstractRunnableC5910b bVar = this.f32294b;
                if (bVar != null) {
                    bVar.m21857c();
                }
                int constructor = object.getConstructor();
                C4614d3[] d3VarArr = null;
                TdApi.Chat chat = null;
                if (constructor == -1679978726) {
                    Log.m14709w("SearchMessages returned error, displaying no results: %s", C4779t2.m25378z5(object));
                } else if (constructor != -16498159) {
                    Log.unexpectedTdlibResponse(object, TdApi.SearchMessages.class, TdApi.Messages.class, TdApi.Error.class);
                    return;
                } else {
                    TdApi.Messages messages = (TdApi.Messages) object;
                    ArrayList arrayList = new ArrayList(messages.messages.length);
                    for (TdApi.Message message : messages.messages) {
                        if (chat == null || chat.f25367id != message.chatId) {
                            chat = C9914k.this.f32258a.m2632U2(message.chatId);
                        }
                        if (C9914k.this.f32259b.mo6504A(chat)) {
                            arrayList.add(new C4614d3(C9914k.this.f32258a, this.f32295c, chat, message, this.f32289M));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        TdApi.Message[] messageArr2 = messages.messages;
                        if (messageArr2.length > 0) {
                            TdApi.Message message2 = messageArr2[messageArr2.length - 1];
                            C9914k.this.f32258a.m2270r4().m14783o(new TdApi.SearchMessages(this.f32295c, this.f32289M, message2.date, message2.chatId, message2.f25406id, this.f32290N, null, 0, 0), this);
                            return;
                        }
                    }
                    d3VarArr = (C4614d3[]) arrayList.toArray(new C4614d3[0]);
                }
                final C4614d3[] d3VarArr2 = d3VarArr;
                HandlerC10770jj dd = C9914k.this.f32258a.m2485dd();
                final int i = this.f32293a;
                final String str = this.f32289M;
                final int i2 = this.f32290N;
                final boolean z = this.f32291O;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        C9914k.C9918d.this.m6505b(i, d3VarArr2, str, i2, z);
                    }
                });
            }
        }
    }

    public static abstract class AbstractC9919e implements AbstractC9920f {
    }

    public interface AbstractC9920f {
        boolean mo6504A(TdApi.Chat chat);

        void mo6503B(long[] jArr, long[] jArr2);

        void mo6502a();

        void mo6501b(int i);

        void mo6500c(C4601c3 c3Var);

        void mo6499d();

        boolean mo6498e(ArrayList<C4601c3> arrayList, boolean z, boolean z2);

        void mo6497f(int i);

        void mo6496g(ArrayList<C4601c3> arrayList, int i);

        void mo6495h(int i, ArrayList<C4614d3> arrayList);

        void mo6494i(int i);

        void mo6493j(long j, int i, int i2);

        void mo6492k(boolean z, boolean z2);

        void mo6491l(ArrayList<C4601c3> arrayList);

        void mo6490m(ArrayList<C4601c3> arrayList);

        void mo6489n(int i, ArrayList<C4601c3> arrayList);

        void mo6488o();

        void mo6487p(int i);

        void mo6486q(ArrayList<C4614d3> arrayList);

        void mo6485r(int i, ArrayList<C4601c3> arrayList);

        void mo6484s(C4601c3 c3Var, int i, int i2);

        int mo6483t();

        void mo6482u(int i, ArrayList<C4614d3> arrayList);

        boolean mo6481v(TdApi.Chat chat);

        void mo6480w(boolean z);

        void mo6479x(C4601c3 c3Var);

        void mo6478y(long j);

        void mo6477z(int i);
    }

    public C9914k(C10930q6 q6Var, AbstractC9919e eVar) {
        this.f32258a = q6Var;
        this.f32259b = eVar;
    }

    public static boolean m6567D(int i) {
        return (i & 15320) != 0;
    }

    public void m6565F(int i, boolean z, TdApi.ChatList chatList, String str, ArrayList arrayList, long[] jArr) {
        if (this.f32261d == i || z) {
            m6525j0(i, chatList, str, arrayList, jArr, z);
        }
    }

    public void m6564G(final int i, final boolean z, final TdApi.ChatList chatList, final String str, TdApi.Object object) {
        final long[] jArr;
        if (this.f32261d == i || z) {
            int constructor = object.getConstructor();
            int i2 = 0;
            final ArrayList arrayList = null;
            if (constructor == -1679978726) {
                Log.m14719i("GetTopChats error, displaying no results: %s", C4779t2.m25378z5(object));
            } else if (constructor != 1809654812) {
                Log.unexpectedTdlibResponse(object, TdApi.GetTopChats.class, TdApi.Chats.class, TdApi.Error.class);
                return;
            } else {
                long[] jArr2 = ((TdApi.Chats) object).chatIds;
                ArrayList arrayList2 = new ArrayList(jArr2.length);
                int S = m6552S(this.f32258a, this.f32259b, this.f32260c, arrayList2, chatList, jArr2, null, false, null);
                if (S != 0) {
                    if (S != jArr2.length) {
                        jArr2 = new long[S];
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            jArr2[i2] = ((C4601c3) it.next()).m27043i();
                            i2++;
                        }
                    }
                    jArr = jArr2;
                    arrayList = arrayList2;
                    this.f32258a.m2485dd().post(new Runnable() {
                        @Override
                        public final void run() {
                            C9914k.this.m6565F(i, z, chatList, str, arrayList, jArr);
                        }
                    });
                }
            }
            jArr = null;
            this.f32258a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9914k.this.m6565F(i, z, chatList, str, arrayList, jArr);
                }
            });
        }
    }

    public void m6563H(int i, TdApi.ChatList chatList, String str, ArrayList arrayList) {
        if (this.f32261d == i) {
            m6537d0(i, chatList, str, arrayList);
        }
    }

    public void m6562I(final int i, AbstractRunnableC5910b bVar, final TdApi.ChatList chatList, String str, final String str2, TdApi.Object object) {
        ArrayList arrayList;
        if (this.f32261d == i) {
            bVar.m21857c();
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.m14719i("SearchPublicChats error, showing no results: %s", C4779t2.m25378z5(object));
                arrayList = null;
            } else if (constructor != 1809654812) {
                Log.unexpectedTdlibResponse(object, TdApi.SearchChats.class, TdApi.Chats.class, TdApi.Error.class);
                return;
            } else {
                long[] jArr = ((TdApi.Chats) object).chatIds;
                arrayList = new ArrayList(jArr.length);
                m6552S(this.f32258a, this.f32259b, this.f32260c & (-129), arrayList, chatList, jArr, str, true, null);
            }
            final ArrayList arrayList2 = arrayList;
            this.f32258a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9914k.this.m6563H(i, chatList, str2, arrayList2);
                }
            });
        }
    }

    public void m6561J(int i, boolean z, TdApi.ChatList chatList, String str, int i2, AbstractRunnableC5910b bVar) {
        long j;
        int i3;
        ArrayList<C4614d3> arrayList;
        if (this.f32261d == i) {
            long j2 = 0;
            if (z) {
                TdApi.Message e = this.f32274q.get(arrayList.size() - 1).m26894e();
                i3 = e.date;
                j2 = e.chatId;
                j = e.f25406id;
            } else {
                j = 0;
                i3 = 0;
            }
            this.f32258a.m2270r4().m14783o(new TdApi.SearchMessages(chatList, str, i3, j2, j, i2, null, 0, 0), new C9918d(i, bVar, chatList, str, i2, z));
        }
    }

    public static int m6552S(C10930q6 q6Var, AbstractC9920f fVar, int i, ArrayList<C4601c3> arrayList, TdApi.ChatList chatList, long[] jArr, String str, boolean z, long[] jArr2) {
        C10930q6 q6Var2 = q6Var;
        List<TdApi.Chat> i4 = q6Var2.m2414i4(jArr);
        arrayList.ensureCapacity(jArr.length);
        boolean z2 = (i & 8) != 0;
        boolean z3 = (i & 16) != 0;
        boolean z4 = (i & Log.TAG_YOUTUBE) != 0;
        boolean z5 = (i & 64) != 0;
        boolean z6 = (i & Log.TAG_CRASH) != 0;
        boolean z7 = (i & Log.TAG_EMOJI) != 0;
        boolean z8 = (i & Log.TAG_LUX) != 0;
        boolean z9 = (i & Log.TAG_VOICE) != 0;
        boolean z10 = (i & Log.TAG_VIDEO) != 0;
        boolean z11 = ((i & Log.TAG_GIF_LOADER) == 0 || fVar == null) ? false : true;
        if (jArr2 != null || m6567D(i)) {
            int i2 = 0;
            for (TdApi.Chat chat : i4) {
                if (jArr2 == null || C5062b.m24153s(jArr2, chat.f25367id) == -1) {
                    if (!z6 || chat.f25367id != q6Var.m2343mb()) {
                        if (!z9 || !q6Var2.m2784K6(chat.f25367id)) {
                            if (!z10 || !q6Var2.m2583X6(chat.f25367id)) {
                                if (!z3 || (C7316a.m17049l(chat.f25367id) && q6Var2.m2400j2(chat))) {
                                    if (!z8 || !C7316a.m17051j(chat.f25367id)) {
                                        if (!z2 || q6Var2.m2220u6(chat)) {
                                            if (!z5 || !q6Var2.m2816I6(chat)) {
                                                if (!z7 || !q6Var2.m2267r7(chat)) {
                                                    if (!z4 || (C7316a.m17049l(chat.f25367id) && q6Var2.m2688Q6(chat))) {
                                                        if (!z11 || fVar.mo6481v(chat)) {
                                                            C4601c3 c3Var = new C4601c3(q6Var, chatList, chat, z, str);
                                                            if (fVar != null) {
                                                                fVar.mo6500c(c3Var);
                                                            }
                                                            arrayList.add(c3Var);
                                                            i2++;
                                                            q6Var2 = q6Var;
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
            return i2;
        }
        for (TdApi.Chat chat2 : i4) {
            C4601c3 c3Var2 = new C4601c3(q6Var, chatList, chat2, z, str);
            if (fVar != null) {
                fVar.mo6500c(c3Var2);
            }
            arrayList.add(c3Var2);
        }
        return i4.size();
    }

    public final int m6570A(long j) {
        ArrayList<C4601c3> arrayList = this.f32270m;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<C4601c3> it = this.f32270m.iterator();
            while (it.hasNext()) {
                if (it.next().m27043i() == j) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public boolean m6569B() {
        return this.f32277t;
    }

    public final boolean m6568C() {
        return m6567D(this.f32260c);
    }

    public boolean m6566E() {
        return this.f32264g;
    }

    public void m6560K() {
        ArrayList<C4614d3> arrayList;
        if (!this.f32276s && this.f32275r && (arrayList = this.f32274q) != null && !arrayList.isEmpty()) {
            m6539c0(this.f32261d, this.f32263f, this.f32262e, true);
        }
    }

    public final void m6559L(final int i, final TdApi.ChatList chatList, final String str, final boolean z) {
        if (this.f32261d == i || z) {
            boolean z2 = !C5070i.m24061i(str);
            if (!z) {
                if (z2) {
                    this.f32268k = true;
                    this.f32269l = false;
                } else {
                    this.f32268k = true;
                    this.f32269l = true;
                }
            }
            if (z || ((1 & this.f32260c) != 0 && !z2)) {
                this.f32258a.m2270r4().m14783o(new TdApi.GetTopChats((this.f32260c & Log.TAG_CAMERA) != 0 ? new TdApi.TopChatCategoryGroups() : new TdApi.TopChatCategoryUsers(), 30), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C9914k.this.m6564G(i, z, chatList, str, object);
                    }
                });
            } else {
                m6541b0(i, chatList, str);
            }
        }
    }

    public void m6558M(TdApi.ChatList chatList) {
        if (this.f32264g) {
            this.f32264g = false;
            this.f32259b.mo6502a();
            m6551T(chatList, "", 0);
            m6517r(null);
        }
    }

    public final void m6557N() {
        if (!this.f32277t) {
            this.f32277t = true;
            this.f32259b.mo6488o();
        }
    }

    public final void m6556O() {
        if (!this.f32278u) {
            this.f32278u = true;
            this.f32259b.mo6501b(this.f32261d);
        }
    }

    public void m6555P(TdApi.ChatList chatList) {
        if (!this.f32264g) {
            this.f32264g = true;
            this.f32259b.mo6499d();
            m6551T(chatList, "", 1);
        }
    }

    public void m6554Q(TdApi.ChatList chatList, String str) {
        if (!this.f32265h) {
            this.f32265h = true;
            m6551T(chatList, str, 1);
        }
    }

    public void m6553R(TdApi.ChatList chatList, String str) {
        m6551T(chatList, str, 0);
    }

    public final void m6551T(TdApi.ChatList chatList, String str, int i) {
        String str2 = this.f32262e;
        if (str2 == null || !C5070i.m24067c(str2, str) || !C7321e.m17015C(this.f32263f, chatList)) {
            int z = m6509z();
            m6545Z();
            this.f32262e = str;
            this.f32263f = chatList;
            this.f32259b.mo6480w(C5070i.m24061i(str));
            if ((this.f32260c & 32) != 0) {
                m6539c0(z, chatList, str, false);
            } else {
                m6559L(z, chatList, str, false);
            }
        } else if (this.f32277t && i != 0 && C5070i.m24061i(this.f32262e)) {
            if (i == 1) {
                m6548W();
            } else {
                m6559L(this.f32261d, this.f32263f, this.f32262e, false);
            }
        }
    }

    public final void m6550U(int i, ArrayList<C4601c3> arrayList, long[] jArr, boolean z) {
        if (this.f32261d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32266i;
            int i2 = 0;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            if (arrayList != null) {
                i2 = arrayList.size();
            }
            if (size != i2) {
                if (size == 0) {
                    this.f32266i = arrayList;
                    this.f32267j = jArr;
                    this.f32259b.mo6498e(arrayList, true, z);
                } else if (i2 == 0) {
                    this.f32266i = arrayList;
                    this.f32267j = jArr;
                    this.f32259b.mo6492k(z, true);
                } else if (!Arrays.equals(this.f32267j, jArr)) {
                    long[] jArr2 = this.f32267j;
                    this.f32266i = arrayList;
                    this.f32267j = jArr;
                    this.f32259b.mo6503B(jArr2, jArr);
                }
            } else if (i2 > 0 && !Arrays.equals(this.f32267j, jArr)) {
                long[] jArr3 = this.f32267j;
                this.f32266i = arrayList;
                this.f32267j = jArr;
                this.f32259b.mo6503B(jArr3, jArr);
            }
        }
    }

    public void m6549V(TdApi.ChatList chatList) {
        String str = this.f32262e;
        if (str == null) {
            str = "";
        }
        m6551T(chatList, str, 2);
    }

    public final void m6548W() {
        int i = this.f32260c;
        if ((i & 1) != 0 && (i & 32) == 0) {
            m6559L(this.f32261d, this.f32263f, this.f32262e, true);
        }
    }

    public void m6547X(C4601c3 c3Var) {
        int A = m6570A(c3Var.m27043i());
        if (A != -1) {
            this.f32270m.remove(A);
            if (this.f32270m.isEmpty()) {
                this.f32259b.mo6497f(1);
            } else {
                this.f32259b.mo6493j(c3Var.m27043i(), A, this.f32270m.size() + 1);
            }
            this.f32258a.m2270r4().m14783o(new TdApi.RemoveRecentlyFoundChat(c3Var.m27043i()), this.f32258a.m2392ja());
        }
    }

    public void m6546Y(long j) {
        int s = C5062b.m24153s(this.f32267j, j);
        if (s != -1) {
            this.f32266i.remove(s);
            this.f32267j = C5062b.m24147y(this.f32267j, s);
            this.f32258a.m2270r4().m14783o(new TdApi.RemoveTopChat(new TdApi.TopChatCategoryUsers(), j), this.f32258a.m2392ja());
            if (this.f32267j.length == 0) {
                this.f32259b.mo6492k(true, !C5070i.m24061i(this.f32262e));
                return;
            }
            this.f32259b.mo6478y(j);
            m6548W();
        }
    }

    public final void m6545Z() {
        this.f32262e = null;
        this.f32263f = null;
        this.f32268k = false;
        this.f32275r = false;
        m6535e0(false);
        this.f32277t = false;
        this.f32278u = false;
    }

    public final void m6543a0(final int i, final TdApi.ChatList chatList, final String str) {
        if (this.f32261d == i) {
            if ((this.f32260c & 4) == 0) {
                m6556O();
                m6539c0(i, chatList, str, false);
                return;
            }
            final String substring = (C5070i.m24061i(str) || str.charAt(0) != '@') ? str : str.substring(1);
            m6556O();
            final C9916b bVar = new C9916b(i);
            bVar.m21855e(C1379j0.m37313o());
            if (C5070i.m24061i(str)) {
                m6514u();
                m6513v();
                m6557N();
                return;
            }
            this.f32258a.m2485dd().post(bVar);
            this.f32258a.m2270r4().m14783o(new TdApi.SearchPublicChats(substring), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C9914k.this.m6562I(i, bVar, chatList, substring, str, object);
                }
            });
        }
    }

    public final void m6541b0(int i, TdApi.ChatList chatList, String str) {
        if (this.f32261d == i) {
            int[] iArr = new int[2];
            this.f32258a.m2270r4().m14783o(new TdApi.SearchChats(str, C5070i.m24061i(str) ? 20 : m6568C() ? 50 : 30), new C9915a(i, new C5322e(16), str, iArr, chatList));
        }
    }

    public final void m6539c0(final int i, final TdApi.ChatList chatList, final String str, final boolean z) {
        C9917c cVar;
        if (this.f32261d == i && !this.f32276s) {
            if ((this.f32260c & 2) == 0) {
                m6557N();
                return;
            }
            m6535e0(true);
            if (z) {
                cVar = null;
            } else {
                cVar = new C9917c(i);
                cVar.m21855e(C1379j0.m37313o());
                this.f32258a.m2485dd().post(cVar);
            }
            final C9917c cVar2 = cVar;
            final int c = z ? 30 : C1357a0.m37547c(C1357a0.m37541i(72.0f), 5, C1357a0.m37551D() - this.f32259b.mo6483t());
            Runnable fVar = new Runnable() {
                @Override
                public final void run() {
                    C9914k.this.m6561J(i, z, chatList, str, c, cVar2);
                }
            };
            if (z) {
                fVar.run();
            } else {
                this.f32258a.m2485dd().postDelayed(fVar, 150L);
            }
        }
    }

    public final void m6537d0(int i, TdApi.ChatList chatList, String str, ArrayList<C4601c3> arrayList) {
        if (this.f32261d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32273p;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            this.f32273p = arrayList;
            int size2 = arrayList != null ? arrayList.size() : 0;
            if (size == size2 || (size > 0 && size2 > 0)) {
                if (size != 0) {
                    this.f32259b.mo6485r(size, arrayList);
                }
            } else if (size2 == 0) {
                this.f32259b.mo6494i(size);
            } else if (size == 0) {
                this.f32259b.mo6490m(arrayList);
            }
            m6539c0(i, chatList, str, false);
        }
    }

    public final void m6535e0(boolean z) {
        if (this.f32276s != z) {
            this.f32276s = z;
        }
    }

    public final void m6533f0(int i, String str, ArrayList<C4601c3> arrayList) {
        if (this.f32261d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32270m;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            m6531g0(arrayList, str);
            int size2 = arrayList != null ? arrayList.size() : 0;
            if (size == size2 || (size > 0 && size2 > 0)) {
                if (size != 0) {
                    this.f32259b.mo6489n(size, arrayList);
                }
            } else if (size2 == 0) {
                this.f32259b.mo6497f(size);
            } else if (size == 0) {
                this.f32259b.mo6491l(arrayList);
            }
            if (this.f32268k) {
                this.f32268k = false;
                if (this.f32269l) {
                    ArrayList<C4601c3> arrayList3 = this.f32266i;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        this.f32259b.mo6498e(this.f32266i, false, false);
                        return;
                    }
                    return;
                }
                this.f32259b.mo6492k(false, false);
            }
        }
    }

    public final void m6531g0(ArrayList<C4601c3> arrayList, String str) {
        this.f32270m = arrayList;
        this.f32271n = str;
    }

    public final void m6529h0(int i, String str, int i2, C4614d3[] d3VarArr, boolean z) {
        if (this.f32261d == i && this.f32276s) {
            m6535e0(false);
            ArrayList<C4614d3> arrayList = this.f32274q;
            int size = arrayList != null ? arrayList.size() : 0;
            int length = d3VarArr != null ? d3VarArr.length : 0;
            int i3 = z ? size + length : length;
            if (!z) {
                this.f32259b.mo6477z(this.f32261d);
            }
            if (length == 0) {
                this.f32275r = false;
                if (!z) {
                    m6513v();
                }
                m6557N();
                return;
            }
            if (this.f32274q == null) {
                this.f32274q = new ArrayList<>(d3VarArr.length);
            }
            ArrayList<C4614d3> arrayList2 = this.f32274q;
            arrayList2.ensureCapacity(arrayList2.size() + d3VarArr.length);
            Collections.addAll(this.f32274q, d3VarArr);
            if (z) {
                this.f32259b.mo6482u(size, this.f32274q);
            } else if (size == 0) {
                this.f32259b.mo6486q(this.f32274q);
            } else if (size == i3 || (size > 0 && i3 > 0)) {
                this.f32259b.mo6495h(size, this.f32274q);
            }
            if (!this.f32275r) {
                m6557N();
            }
        }
    }

    public void m6527i0(int i) {
        this.f32260c = i;
    }

    public final void m6525j0(int i, TdApi.ChatList chatList, String str, ArrayList<C4601c3> arrayList, long[] jArr, boolean z) {
        int i2 = 0;
        boolean z2 = this.f32261d != i || z;
        ArrayList<C4601c3> arrayList2 = this.f32266i;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        if (arrayList != null) {
            i2 = arrayList.size();
        }
        if (size != 0 || i2 != 0) {
            m6550U(i, arrayList, jArr, z2);
            if (!z2) {
                m6541b0(i, chatList, str);
            }
        } else if (!z2) {
            m6541b0(i, chatList, str);
        }
    }

    public final void m6518q(int i, String str, ArrayList<C4601c3> arrayList) {
        if (this.f32261d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32270m;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            if (size == 0) {
                m6533f0(i, str, arrayList);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                this.f32270m.addAll(arrayList);
                this.f32259b.mo6496g(arrayList, size);
            }
        }
    }

    public void m6517r(C4601c3 c3Var) {
        m6516s(c3Var, true);
    }

    public final void m6516s(C4601c3 c3Var, boolean z) {
        if (!this.f32264g) {
            if (z && !this.f32272o.isEmpty()) {
                Iterator<C4601c3> it = this.f32272o.iterator();
                while (it.hasNext()) {
                    m6516s(it.next(), false);
                }
                this.f32272o.clear();
            }
            if (c3Var != null) {
                if (C5070i.m24061i(this.f32262e) && this.f32270m != null && C5070i.m24061i(this.f32271n)) {
                    int A = m6570A(c3Var.m27043i());
                    if (A == -1) {
                        if (this.f32270m == null) {
                            this.f32270m = new ArrayList<>();
                        }
                        this.f32270m.add(0, c3Var);
                        if (this.f32270m.size() == 1) {
                            this.f32259b.mo6491l(this.f32270m);
                        } else {
                            this.f32259b.mo6479x(c3Var);
                        }
                    } else if (A != 0) {
                        C4601c3 remove = this.f32270m.remove(A);
                        if (remove == c3Var || remove.m27051a() == c3Var.m27051a() || (remove.m27036p() == c3Var.m27036p() && c3Var.m27036p() != 0)) {
                            this.f32270m.add(0, remove);
                            this.f32259b.mo6484s(remove, A, this.f32270m.size());
                        } else {
                            throw new RuntimeException("Stub!");
                        }
                    }
                }
                this.f32258a.m2270r4().m14783o(new TdApi.AddRecentlyFoundChat(c3Var.m27051a()), this.f32258a.m2392ja());
            }
        } else if (c3Var != null) {
            this.f32272o.add(c3Var);
        }
    }

    public boolean m6515t() {
        return C5070i.m24061i(this.f32262e);
    }

    public final void m6514u() {
        ArrayList<C4601c3> arrayList = this.f32273p;
        if (arrayList != null && arrayList.size() > 0) {
            this.f32259b.mo6494i(this.f32273p.size());
            this.f32273p = null;
        }
    }

    public final void m6513v() {
        ArrayList<C4614d3> arrayList = this.f32274q;
        if (arrayList != null && arrayList.size() > 0) {
            this.f32259b.mo6487p(this.f32274q.size());
            this.f32274q.clear();
        }
    }

    public void m6512w() {
        ArrayList<C4601c3> arrayList = this.f32270m;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            if (C5070i.m24061i(this.f32262e)) {
                m6531g0(null, this.f32262e);
                this.f32259b.mo6497f(size);
            }
            this.f32258a.m2270r4().m14783o(new TdApi.ClearRecentlyFoundChats(), this.f32258a.m2392ja());
        }
    }

    public int m6511x() {
        ArrayList<C4614d3> arrayList = this.f32274q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public ArrayList<C4601c3> m6510y() {
        return this.f32266i;
    }

    public final int m6509z() {
        if (this.f32261d == Integer.MAX_VALUE) {
            this.f32261d = 0;
        } else {
            this.f32261d++;
        }
        return this.f32261d;
    }
}
