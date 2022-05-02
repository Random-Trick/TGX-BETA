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
    public final C10930q6 f32261a;
    public final AbstractC9920f f32262b;
    public int f32263c;
    public volatile int f32264d;
    public String f32265e;
    public TdApi.ChatList f32266f;
    public boolean f32267g;
    public boolean f32268h;
    public ArrayList<C4601c3> f32269i;
    public long[] f32270j;
    public boolean f32271k;
    public boolean f32272l;
    public ArrayList<C4601c3> f32273m;
    public String f32274n;
    public ArrayList<C4601c3> f32275o = new ArrayList<>();
    public ArrayList<C4601c3> f32276p;
    public ArrayList<C4614d3> f32277q;
    public boolean f32278r;
    public boolean f32279s;
    public boolean f32280t;
    public boolean f32281u;

    public class C9915a implements Client.AbstractC7865g {
        public final int[] f32282M;
        public final TdApi.ChatList f32283N;
        public final int f32285a;
        public final C5322e f32286b;
        public final String f32287c;

        public C9915a(int i, C5322e eVar, String str, int[] iArr, TdApi.ChatList chatList) {
            this.f32285a = i;
            this.f32286b = eVar;
            this.f32287c = str;
            this.f32282M = iArr;
            this.f32283N = chatList;
        }

        public void m6507b(int i, boolean z, String str, ArrayList arrayList, boolean z2, TdApi.ChatList chatList) {
            if (C9914k.this.f32264d == i) {
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
        public final int f32288M;

        public C9916b(int i) {
            this.f32288M = i;
        }

        @Override
        public void mo1364b() {
            if (C9914k.this.f32264d == this.f32288M) {
                C9914k.this.m6514u();
                C9914k.this.m6513v();
            }
        }
    }

    public class C9917c extends AbstractRunnableC5910b {
        public final int f32290M;

        public C9917c(int i) {
            this.f32290M = i;
        }

        @Override
        public void mo1364b() {
            if (C9914k.this.f32264d == this.f32290M) {
                C9914k.this.m6513v();
            }
        }
    }

    public class C9918d implements Client.AbstractC7865g {
        public final String f32292M;
        public final int f32293N;
        public final boolean f32294O;
        public final int f32296a;
        public final AbstractRunnableC5910b f32297b;
        public final TdApi.ChatList f32298c;

        public C9918d(int i, AbstractRunnableC5910b bVar, TdApi.ChatList chatList, String str, int i2, boolean z) {
            this.f32296a = i;
            this.f32297b = bVar;
            this.f32298c = chatList;
            this.f32292M = str;
            this.f32293N = i2;
            this.f32294O = z;
        }

        public void m6505b(int i, C4614d3[] d3VarArr, String str, int i2, boolean z) {
            if (C9914k.this.f32264d == i) {
                C9914k.this.f32278r = d3VarArr != null && d3VarArr.length > 0;
                C9914k.this.m6529h0(i, str, i2, d3VarArr, z);
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            TdApi.Message[] messageArr;
            if (C9914k.this.f32264d == this.f32296a) {
                AbstractRunnableC5910b bVar = this.f32297b;
                if (bVar != null) {
                    bVar.m21858c();
                }
                int constructor = object.getConstructor();
                C4614d3[] d3VarArr = null;
                TdApi.Chat chat = null;
                if (constructor == -1679978726) {
                    Log.m14709w("SearchMessages returned error, displaying no results: %s", C4779t2.m25379z5(object));
                } else if (constructor != -16498159) {
                    Log.unexpectedTdlibResponse(object, TdApi.SearchMessages.class, TdApi.Messages.class, TdApi.Error.class);
                    return;
                } else {
                    TdApi.Messages messages = (TdApi.Messages) object;
                    ArrayList arrayList = new ArrayList(messages.messages.length);
                    for (TdApi.Message message : messages.messages) {
                        if (chat == null || chat.f25370id != message.chatId) {
                            chat = C9914k.this.f32261a.m2632U2(message.chatId);
                        }
                        if (C9914k.this.f32262b.mo6504A(chat)) {
                            arrayList.add(new C4614d3(C9914k.this.f32261a, this.f32298c, chat, message, this.f32292M));
                        }
                    }
                    if (arrayList.isEmpty()) {
                        TdApi.Message[] messageArr2 = messages.messages;
                        if (messageArr2.length > 0) {
                            TdApi.Message message2 = messageArr2[messageArr2.length - 1];
                            C9914k.this.f32261a.m2270r4().m14783o(new TdApi.SearchMessages(this.f32298c, this.f32292M, message2.date, message2.chatId, message2.f25409id, this.f32293N, null, 0, 0), this);
                            return;
                        }
                    }
                    d3VarArr = (C4614d3[]) arrayList.toArray(new C4614d3[0]);
                }
                final C4614d3[] d3VarArr2 = d3VarArr;
                HandlerC10770jj dd = C9914k.this.f32261a.m2485dd();
                final int i = this.f32296a;
                final String str = this.f32292M;
                final int i2 = this.f32293N;
                final boolean z = this.f32294O;
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
        this.f32261a = q6Var;
        this.f32262b = eVar;
    }

    public static boolean m6567D(int i) {
        return (i & 15320) != 0;
    }

    public void m6565F(int i, boolean z, TdApi.ChatList chatList, String str, ArrayList arrayList, long[] jArr) {
        if (this.f32264d == i || z) {
            m6525j0(i, chatList, str, arrayList, jArr, z);
        }
    }

    public void m6564G(final int i, final boolean z, final TdApi.ChatList chatList, final String str, TdApi.Object object) {
        final long[] jArr;
        if (this.f32264d == i || z) {
            int constructor = object.getConstructor();
            int i2 = 0;
            final ArrayList arrayList = null;
            if (constructor == -1679978726) {
                Log.m14719i("GetTopChats error, displaying no results: %s", C4779t2.m25379z5(object));
            } else if (constructor != 1809654812) {
                Log.unexpectedTdlibResponse(object, TdApi.GetTopChats.class, TdApi.Chats.class, TdApi.Error.class);
                return;
            } else {
                long[] jArr2 = ((TdApi.Chats) object).chatIds;
                ArrayList arrayList2 = new ArrayList(jArr2.length);
                int S = m6552S(this.f32261a, this.f32262b, this.f32263c, arrayList2, chatList, jArr2, null, false, null);
                if (S != 0) {
                    if (S != jArr2.length) {
                        jArr2 = new long[S];
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            jArr2[i2] = ((C4601c3) it.next()).m27045i();
                            i2++;
                        }
                    }
                    jArr = jArr2;
                    arrayList = arrayList2;
                    this.f32261a.m2485dd().post(new Runnable() {
                        @Override
                        public final void run() {
                            C9914k.this.m6565F(i, z, chatList, str, arrayList, jArr);
                        }
                    });
                }
            }
            jArr = null;
            this.f32261a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9914k.this.m6565F(i, z, chatList, str, arrayList, jArr);
                }
            });
        }
    }

    public void m6563H(int i, TdApi.ChatList chatList, String str, ArrayList arrayList) {
        if (this.f32264d == i) {
            m6537d0(i, chatList, str, arrayList);
        }
    }

    public void m6562I(final int i, AbstractRunnableC5910b bVar, final TdApi.ChatList chatList, String str, final String str2, TdApi.Object object) {
        ArrayList arrayList;
        if (this.f32264d == i) {
            bVar.m21858c();
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.m14719i("SearchPublicChats error, showing no results: %s", C4779t2.m25379z5(object));
                arrayList = null;
            } else if (constructor != 1809654812) {
                Log.unexpectedTdlibResponse(object, TdApi.SearchChats.class, TdApi.Chats.class, TdApi.Error.class);
                return;
            } else {
                long[] jArr = ((TdApi.Chats) object).chatIds;
                arrayList = new ArrayList(jArr.length);
                m6552S(this.f32261a, this.f32262b, this.f32263c & (-129), arrayList, chatList, jArr, str, true, null);
            }
            final ArrayList arrayList2 = arrayList;
            this.f32261a.m2485dd().post(new Runnable() {
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
        if (this.f32264d == i) {
            long j2 = 0;
            if (z) {
                TdApi.Message e = this.f32277q.get(arrayList.size() - 1).m26896e();
                i3 = e.date;
                j2 = e.chatId;
                j = e.f25409id;
            } else {
                j = 0;
                i3 = 0;
            }
            this.f32261a.m2270r4().m14783o(new TdApi.SearchMessages(chatList, str, i3, j2, j, i2, null, 0, 0), new C9918d(i, bVar, chatList, str, i2, z));
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
                if (jArr2 == null || C5062b.m24154s(jArr2, chat.f25370id) == -1) {
                    if (!z6 || chat.f25370id != q6Var.m2343mb()) {
                        if (!z9 || !q6Var2.m2784K6(chat.f25370id)) {
                            if (!z10 || !q6Var2.m2583X6(chat.f25370id)) {
                                if (!z3 || (C7316a.m17049l(chat.f25370id) && q6Var2.m2400j2(chat))) {
                                    if (!z8 || !C7316a.m17051j(chat.f25370id)) {
                                        if (!z2 || q6Var2.m2220u6(chat)) {
                                            if (!z5 || !q6Var2.m2816I6(chat)) {
                                                if (!z7 || !q6Var2.m2267r7(chat)) {
                                                    if (!z4 || (C7316a.m17049l(chat.f25370id) && q6Var2.m2688Q6(chat))) {
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
        ArrayList<C4601c3> arrayList = this.f32273m;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<C4601c3> it = this.f32273m.iterator();
            while (it.hasNext()) {
                if (it.next().m27045i() == j) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public boolean m6569B() {
        return this.f32280t;
    }

    public final boolean m6568C() {
        return m6567D(this.f32263c);
    }

    public boolean m6566E() {
        return this.f32267g;
    }

    public void m6560K() {
        ArrayList<C4614d3> arrayList;
        if (!this.f32279s && this.f32278r && (arrayList = this.f32277q) != null && !arrayList.isEmpty()) {
            m6539c0(this.f32264d, this.f32266f, this.f32265e, true);
        }
    }

    public final void m6559L(final int i, final TdApi.ChatList chatList, final String str, final boolean z) {
        if (this.f32264d == i || z) {
            boolean z2 = !C5070i.m24062i(str);
            if (!z) {
                if (z2) {
                    this.f32271k = true;
                    this.f32272l = false;
                } else {
                    this.f32271k = true;
                    this.f32272l = true;
                }
            }
            if (z || ((1 & this.f32263c) != 0 && !z2)) {
                this.f32261a.m2270r4().m14783o(new TdApi.GetTopChats((this.f32263c & Log.TAG_CAMERA) != 0 ? new TdApi.TopChatCategoryGroups() : new TdApi.TopChatCategoryUsers(), 30), new Client.AbstractC7865g() {
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
        if (this.f32267g) {
            this.f32267g = false;
            this.f32262b.mo6502a();
            m6551T(chatList, "", 0);
            m6517r(null);
        }
    }

    public final void m6557N() {
        if (!this.f32280t) {
            this.f32280t = true;
            this.f32262b.mo6488o();
        }
    }

    public final void m6556O() {
        if (!this.f32281u) {
            this.f32281u = true;
            this.f32262b.mo6501b(this.f32264d);
        }
    }

    public void m6555P(TdApi.ChatList chatList) {
        if (!this.f32267g) {
            this.f32267g = true;
            this.f32262b.mo6499d();
            m6551T(chatList, "", 1);
        }
    }

    public void m6554Q(TdApi.ChatList chatList, String str) {
        if (!this.f32268h) {
            this.f32268h = true;
            m6551T(chatList, str, 1);
        }
    }

    public void m6553R(TdApi.ChatList chatList, String str) {
        m6551T(chatList, str, 0);
    }

    public final void m6551T(TdApi.ChatList chatList, String str, int i) {
        String str2 = this.f32265e;
        if (str2 == null || !C5070i.m24068c(str2, str) || !C7321e.m17015C(this.f32266f, chatList)) {
            int z = m6509z();
            m6545Z();
            this.f32265e = str;
            this.f32266f = chatList;
            this.f32262b.mo6480w(C5070i.m24062i(str));
            if ((this.f32263c & 32) != 0) {
                m6539c0(z, chatList, str, false);
            } else {
                m6559L(z, chatList, str, false);
            }
        } else if (this.f32280t && i != 0 && C5070i.m24062i(this.f32265e)) {
            if (i == 1) {
                m6548W();
            } else {
                m6559L(this.f32264d, this.f32266f, this.f32265e, false);
            }
        }
    }

    public final void m6550U(int i, ArrayList<C4601c3> arrayList, long[] jArr, boolean z) {
        if (this.f32264d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32269i;
            int i2 = 0;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            if (arrayList != null) {
                i2 = arrayList.size();
            }
            if (size != i2) {
                if (size == 0) {
                    this.f32269i = arrayList;
                    this.f32270j = jArr;
                    this.f32262b.mo6498e(arrayList, true, z);
                } else if (i2 == 0) {
                    this.f32269i = arrayList;
                    this.f32270j = jArr;
                    this.f32262b.mo6492k(z, true);
                } else if (!Arrays.equals(this.f32270j, jArr)) {
                    long[] jArr2 = this.f32270j;
                    this.f32269i = arrayList;
                    this.f32270j = jArr;
                    this.f32262b.mo6503B(jArr2, jArr);
                }
            } else if (i2 > 0 && !Arrays.equals(this.f32270j, jArr)) {
                long[] jArr3 = this.f32270j;
                this.f32269i = arrayList;
                this.f32270j = jArr;
                this.f32262b.mo6503B(jArr3, jArr);
            }
        }
    }

    public void m6549V(TdApi.ChatList chatList) {
        String str = this.f32265e;
        if (str == null) {
            str = "";
        }
        m6551T(chatList, str, 2);
    }

    public final void m6548W() {
        int i = this.f32263c;
        if ((i & 1) != 0 && (i & 32) == 0) {
            m6559L(this.f32264d, this.f32266f, this.f32265e, true);
        }
    }

    public void m6547X(C4601c3 c3Var) {
        int A = m6570A(c3Var.m27045i());
        if (A != -1) {
            this.f32273m.remove(A);
            if (this.f32273m.isEmpty()) {
                this.f32262b.mo6497f(1);
            } else {
                this.f32262b.mo6493j(c3Var.m27045i(), A, this.f32273m.size() + 1);
            }
            this.f32261a.m2270r4().m14783o(new TdApi.RemoveRecentlyFoundChat(c3Var.m27045i()), this.f32261a.m2392ja());
        }
    }

    public void m6546Y(long j) {
        int s = C5062b.m24154s(this.f32270j, j);
        if (s != -1) {
            this.f32269i.remove(s);
            this.f32270j = C5062b.m24148y(this.f32270j, s);
            this.f32261a.m2270r4().m14783o(new TdApi.RemoveTopChat(new TdApi.TopChatCategoryUsers(), j), this.f32261a.m2392ja());
            if (this.f32270j.length == 0) {
                this.f32262b.mo6492k(true, !C5070i.m24062i(this.f32265e));
                return;
            }
            this.f32262b.mo6478y(j);
            m6548W();
        }
    }

    public final void m6545Z() {
        this.f32265e = null;
        this.f32266f = null;
        this.f32271k = false;
        this.f32278r = false;
        m6535e0(false);
        this.f32280t = false;
        this.f32281u = false;
    }

    public final void m6543a0(final int i, final TdApi.ChatList chatList, final String str) {
        if (this.f32264d == i) {
            if ((this.f32263c & 4) == 0) {
                m6556O();
                m6539c0(i, chatList, str, false);
                return;
            }
            final String substring = (C5070i.m24062i(str) || str.charAt(0) != '@') ? str : str.substring(1);
            m6556O();
            final C9916b bVar = new C9916b(i);
            bVar.m21856e(C1379j0.m37316o());
            if (C5070i.m24062i(str)) {
                m6514u();
                m6513v();
                m6557N();
                return;
            }
            this.f32261a.m2485dd().post(bVar);
            this.f32261a.m2270r4().m14783o(new TdApi.SearchPublicChats(substring), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C9914k.this.m6562I(i, bVar, chatList, substring, str, object);
                }
            });
        }
    }

    public final void m6541b0(int i, TdApi.ChatList chatList, String str) {
        if (this.f32264d == i) {
            int[] iArr = new int[2];
            this.f32261a.m2270r4().m14783o(new TdApi.SearchChats(str, C5070i.m24062i(str) ? 20 : m6568C() ? 50 : 30), new C9915a(i, new C5322e(16), str, iArr, chatList));
        }
    }

    public final void m6539c0(final int i, final TdApi.ChatList chatList, final String str, final boolean z) {
        C9917c cVar;
        if (this.f32264d == i && !this.f32279s) {
            if ((this.f32263c & 2) == 0) {
                m6557N();
                return;
            }
            m6535e0(true);
            if (z) {
                cVar = null;
            } else {
                cVar = new C9917c(i);
                cVar.m21856e(C1379j0.m37316o());
                this.f32261a.m2485dd().post(cVar);
            }
            final C9917c cVar2 = cVar;
            final int c = z ? 30 : C1357a0.m37550c(C1357a0.m37544i(72.0f), 5, C1357a0.m37554D() - this.f32262b.mo6483t());
            Runnable fVar = new Runnable() {
                @Override
                public final void run() {
                    C9914k.this.m6561J(i, z, chatList, str, c, cVar2);
                }
            };
            if (z) {
                fVar.run();
            } else {
                this.f32261a.m2485dd().postDelayed(fVar, 150L);
            }
        }
    }

    public final void m6537d0(int i, TdApi.ChatList chatList, String str, ArrayList<C4601c3> arrayList) {
        if (this.f32264d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32276p;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            this.f32276p = arrayList;
            int size2 = arrayList != null ? arrayList.size() : 0;
            if (size == size2 || (size > 0 && size2 > 0)) {
                if (size != 0) {
                    this.f32262b.mo6485r(size, arrayList);
                }
            } else if (size2 == 0) {
                this.f32262b.mo6494i(size);
            } else if (size == 0) {
                this.f32262b.mo6490m(arrayList);
            }
            m6539c0(i, chatList, str, false);
        }
    }

    public final void m6535e0(boolean z) {
        if (this.f32279s != z) {
            this.f32279s = z;
        }
    }

    public final void m6533f0(int i, String str, ArrayList<C4601c3> arrayList) {
        if (this.f32264d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32273m;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            m6531g0(arrayList, str);
            int size2 = arrayList != null ? arrayList.size() : 0;
            if (size == size2 || (size > 0 && size2 > 0)) {
                if (size != 0) {
                    this.f32262b.mo6489n(size, arrayList);
                }
            } else if (size2 == 0) {
                this.f32262b.mo6497f(size);
            } else if (size == 0) {
                this.f32262b.mo6491l(arrayList);
            }
            if (this.f32271k) {
                this.f32271k = false;
                if (this.f32272l) {
                    ArrayList<C4601c3> arrayList3 = this.f32269i;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        this.f32262b.mo6498e(this.f32269i, false, false);
                        return;
                    }
                    return;
                }
                this.f32262b.mo6492k(false, false);
            }
        }
    }

    public final void m6531g0(ArrayList<C4601c3> arrayList, String str) {
        this.f32273m = arrayList;
        this.f32274n = str;
    }

    public final void m6529h0(int i, String str, int i2, C4614d3[] d3VarArr, boolean z) {
        if (this.f32264d == i && this.f32279s) {
            m6535e0(false);
            ArrayList<C4614d3> arrayList = this.f32277q;
            int size = arrayList != null ? arrayList.size() : 0;
            int length = d3VarArr != null ? d3VarArr.length : 0;
            int i3 = z ? size + length : length;
            if (!z) {
                this.f32262b.mo6477z(this.f32264d);
            }
            if (length == 0) {
                this.f32278r = false;
                if (!z) {
                    m6513v();
                }
                m6557N();
                return;
            }
            if (this.f32277q == null) {
                this.f32277q = new ArrayList<>(d3VarArr.length);
            }
            ArrayList<C4614d3> arrayList2 = this.f32277q;
            arrayList2.ensureCapacity(arrayList2.size() + d3VarArr.length);
            Collections.addAll(this.f32277q, d3VarArr);
            if (z) {
                this.f32262b.mo6482u(size, this.f32277q);
            } else if (size == 0) {
                this.f32262b.mo6486q(this.f32277q);
            } else if (size == i3 || (size > 0 && i3 > 0)) {
                this.f32262b.mo6495h(size, this.f32277q);
            }
            if (!this.f32278r) {
                m6557N();
            }
        }
    }

    public void m6527i0(int i) {
        this.f32263c = i;
    }

    public final void m6525j0(int i, TdApi.ChatList chatList, String str, ArrayList<C4601c3> arrayList, long[] jArr, boolean z) {
        int i2 = 0;
        boolean z2 = this.f32264d != i || z;
        ArrayList<C4601c3> arrayList2 = this.f32269i;
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
        if (this.f32264d == i) {
            ArrayList<C4601c3> arrayList2 = this.f32273m;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            if (size == 0) {
                m6533f0(i, str, arrayList);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                this.f32273m.addAll(arrayList);
                this.f32262b.mo6496g(arrayList, size);
            }
        }
    }

    public void m6517r(C4601c3 c3Var) {
        m6516s(c3Var, true);
    }

    public final void m6516s(C4601c3 c3Var, boolean z) {
        if (!this.f32267g) {
            if (z && !this.f32275o.isEmpty()) {
                Iterator<C4601c3> it = this.f32275o.iterator();
                while (it.hasNext()) {
                    m6516s(it.next(), false);
                }
                this.f32275o.clear();
            }
            if (c3Var != null) {
                if (C5070i.m24062i(this.f32265e) && this.f32273m != null && C5070i.m24062i(this.f32274n)) {
                    int A = m6570A(c3Var.m27045i());
                    if (A == -1) {
                        if (this.f32273m == null) {
                            this.f32273m = new ArrayList<>();
                        }
                        this.f32273m.add(0, c3Var);
                        if (this.f32273m.size() == 1) {
                            this.f32262b.mo6491l(this.f32273m);
                        } else {
                            this.f32262b.mo6479x(c3Var);
                        }
                    } else if (A != 0) {
                        C4601c3 remove = this.f32273m.remove(A);
                        if (remove == c3Var || remove.m27053a() == c3Var.m27053a() || (remove.m27038p() == c3Var.m27038p() && c3Var.m27038p() != 0)) {
                            this.f32273m.add(0, remove);
                            this.f32262b.mo6484s(remove, A, this.f32273m.size());
                        } else {
                            throw new RuntimeException("Stub!");
                        }
                    }
                }
                this.f32261a.m2270r4().m14783o(new TdApi.AddRecentlyFoundChat(c3Var.m27053a()), this.f32261a.m2392ja());
            }
        } else if (c3Var != null) {
            this.f32275o.add(c3Var);
        }
    }

    public boolean m6515t() {
        return C5070i.m24062i(this.f32265e);
    }

    public final void m6514u() {
        ArrayList<C4601c3> arrayList = this.f32276p;
        if (arrayList != null && arrayList.size() > 0) {
            this.f32262b.mo6494i(this.f32276p.size());
            this.f32276p = null;
        }
    }

    public final void m6513v() {
        ArrayList<C4614d3> arrayList = this.f32277q;
        if (arrayList != null && arrayList.size() > 0) {
            this.f32262b.mo6487p(this.f32277q.size());
            this.f32277q.clear();
        }
    }

    public void m6512w() {
        ArrayList<C4601c3> arrayList = this.f32273m;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            if (C5070i.m24062i(this.f32265e)) {
                m6531g0(null, this.f32265e);
                this.f32262b.mo6497f(size);
            }
            this.f32261a.m2270r4().m14783o(new TdApi.ClearRecentlyFoundChats(), this.f32261a.m2392ja());
        }
    }

    public int m6511x() {
        ArrayList<C4614d3> arrayList = this.f32277q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public ArrayList<C4601c3> m6510y() {
        return this.f32269i;
    }

    public final int m6509z() {
        if (this.f32264d == Integer.MAX_VALUE) {
            this.f32264d = 0;
        } else {
            this.f32264d++;
        }
        return this.f32264d;
    }
}
