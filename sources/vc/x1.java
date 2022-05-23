package vc;

import android.os.SystemClock;
import ce.c0;
import ce.j0;
import gd.l;
import gd.w;
import hd.o7;
import hd.p1;
import hd.p7;
import hd.s4;
import hd.t2;
import ib.i;
import ie.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.e;
import kb.j;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.json.JSONArray;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import vc.x1;
import zd.d9;
import zd.o6;

public class x1 implements Client.g {
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public ob.d R;
    public int S;
    public int T;
    public String U;
    public TdApi.MessageSender V;
    public TdApi.SearchMessagesFilter W;
    public TdApi.Chat X;
    public p7 Y;
    public k Z;
    public final v2 f25338a;
    public long f25339a0;
    public final o6 f25340b;
    public volatile Client.g f25341b0;
    public boolean f25342c;
    public TdApi.Message[] f25343c0;
    public int f25344d0;
    public long f25345e0;
    public boolean f25346f0;
    public boolean f25347g0;
    public boolean f25348h0;
    public ob.d f25349i0;
    public String f25350j0;
    public int f25351k0;
    public int f25352l0;
    public boolean f25353m0;
    public long f25355o0;
    public long f25356p0;
    public int f25357q0;
    public int Q = -1;
    public final Object f25354n0 = new Object();

    public class a extends k {
        public final long f25358b;
        public final j f25359c;

        public a(long j10, j jVar) {
            this.f25358b = j10;
            this.f25359c = jVar;
        }

        public void e(TdApi.Object object, long j10, j jVar) {
            x1.this.P = false;
            TdApi.SponsoredMessage sponsoredMessage = null;
            x1.this.Z = null;
            if (object.getConstructor() == -1384343080) {
                sponsoredMessage = (TdApi.SponsoredMessage) object;
            } else if (x1.this.f25340b.A1().G()) {
                sponsoredMessage = p1.a(x1.this.f25340b);
            }
            if (j10 == x1.this.H()) {
                jVar.a(sponsoredMessage);
            }
        }

        @Override
        public void c(final TdApi.Object object) {
            final long j10 = this.f25358b;
            final j jVar = this.f25359c;
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    x1.a.this.e(object, j10, jVar);
                }
            });
        }
    }

    public class b implements Client.g {
        public final boolean M;
        public final long f25360a;
        public final boolean f25361b;
        public final boolean f25362c;

        public b(long j10, boolean z10, boolean z11, boolean z12) {
            this.f25360a = j10;
            this.f25361b = z10;
            this.f25362c = z11;
            this.M = z12;
        }

        @Override
        public void r2(org.drinkless.td.libcore.telegram.TdApi.Object r21) {
            throw new UnsupportedOperationException("Method not decompiled: vc.x1.b.r2(org.drinkless.td.libcore.telegram.TdApi$Object):void");
        }
    }

    public static class c {
        public final int f25363a;
        public final int f25364b;
        public final boolean f25365c;
        public final int f25366d;
        public final TdApi.MessageContent f25367e;

        public c(int i10, int i11, boolean z10, int i12, TdApi.MessageContent messageContent) {
            this.f25363a = i10;
            this.f25364b = i11;
            this.f25365c = z10;
            this.f25366d = i12;
            this.f25367e = messageContent;
        }
    }

    public static class d {
        public int f25368a;
        public JSONObject f25369b;

        public d(int i10, JSONObject jSONObject) {
            this.f25368a = i10;
            this.f25369b = jSONObject;
        }
    }

    public x1(v2 v2Var) {
        this.f25338a = v2Var;
        this.f25340b = v2Var.r0().c();
        u0();
    }

    public static boolean G(d9 d9Var, List<TdApi.Message> list, e<TdApi.User> eVar) {
        String i12 = w.i1(R.string.json_ChatDemo);
        if (!i.i(i12) && !i12.equals("0")) {
            try {
                return p0(d9Var, list, eVar, i12);
            } catch (Throwable th) {
                Log.e("Cannot parse chat demo content", th, new Object[0]);
                list.clear();
                eVar.b();
            }
        }
        try {
            return p0(d9Var, list, eVar, "[{\"lang\":1,\"member\":\"name\",\"_\":[{\"sticker\":[512,512,\"AAQCABMktIENAAQ7jAMIc7zJ7Xd8AAIC\",\"CAADAgADQQIAAkf7CQw2YkvFWC1DowI\",867500685606780933]},{\"text\":[\"text1\",1]},{\"text\":[\"text2\",1],\"out\":1},{\"voice\":3,\"out\":1},{\"text\":[\"text3\",1]},{\"audio\":[243,\"audioTitle\",\"audioPerformer\"]},{\"text\":[\"text4\",1],\"out\":1}]},{\"lang\":2,\"members\":[[6,\"name1\"],[7,\"name2\"],[3,\"name3\"],[1,\"name4\"]],\"_\":[{\"created\":\"title\",\"out\":1},{\"text\":[\"text1\",1],\"author\":6},{\"text\":[\"text2\",1],\"out\":1},{\"text\":[\"text3\",1],\"author\":7},{\"text\":[\"text4\",1],\"author\":3},{\"left\":3},{\"text\":[\"text5\",1],\"author\":1},{\"sticker\":[467,512,\"AAQCABNfgVkqAAT-l09kzZivgi08AAIC\",\"CAADAgAD3gAD9HsZAAG9he9u98XOPQI\",7173162320003073],\"out\":1}]},{\"lang\":3,\"member\":[0,\"name\"],\"_\":[{\"sticker\":[512,512,\"AAQCABOzP0sNAATjTYV36dMVWNVCAQABAg\",\"CAADAgADfgUAAvoLtghVynd3kd-TuAI\"]},{\"text\":[\"text1\",1],\"out\":1},{\"text\":[\"text2\",1]},{\"text\":[\"text3\",1],\"out\":1},{\"text\":[\"text4\",1]},{\"text\":[\"text5\",1],\"out\":1},{\"text\":[\"text6\",1]},{\"ttl\":15},{\"text\":[\"text7\",1],\"out\":1}]},{\"lang\":4,\"member\":\"name\",\"_\":[{\"text\":[\"text1\",1]},{\"text\":[\"text2\",1],\"out\":1}],\"guide\":1}]");
        } catch (Throwable th2) {
            Log.e(th2);
            list.clear();
            eVar.b();
            return false;
        }
    }

    public static int L(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2029069091:
                if (str.equals("json_1_audioPerformer")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1483933566:
                if (str.equals("json_4_text1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1483933565:
                if (str.equals("json_4_text2")) {
                    c10 = 2;
                    break;
                }
                break;
            case 148522687:
                if (str.equals("json_1_text1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 148522688:
                if (str.equals("json_1_text2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 148522689:
                if (str.equals("json_1_text3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 148522690:
                if (str.equals("json_1_text4")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1030355042:
                if (str.equals("json_2_name1")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1030355043:
                if (str.equals("json_2_name2")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1030355044:
                if (str.equals("json_2_name3")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1030355045:
                if (str.equals("json_2_name4")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1036026368:
                if (str.equals("json_2_text1")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1036026369:
                if (str.equals("json_2_text2")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1036026370:
                if (str.equals("json_2_text3")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1036026371:
                if (str.equals("json_2_text4")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1036026372:
                if (str.equals("json_2_text5")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1036141492:
                if (str.equals("json_2_title")) {
                    c10 = 16;
                    break;
                }
                break;
            case 1251534096:
                if (str.equals("json_1_name")) {
                    c10 = 17;
                    break;
                }
                break;
            case 1308792398:
                if (str.equals("json_3_name")) {
                    c10 = 18;
                    break;
                }
                break;
            case 1337421549:
                if (str.equals("json_4_name")) {
                    c10 = 19;
                    break;
                }
                break;
            case 1451507431:
                if (str.equals("json_1_audioTitle")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1923530049:
                if (str.equals("json_3_text1")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1923530050:
                if (str.equals("json_3_text2")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1923530051:
                if (str.equals("json_3_text3")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1923530052:
                if (str.equals("json_3_text4")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1923530053:
                if (str.equals("json_3_text5")) {
                    c10 = 25;
                    break;
                }
                break;
            case 1923530054:
                if (str.equals("json_3_text6")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1923530055:
                if (str.equals("json_3_text7")) {
                    c10 = 27;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return R.string.json_1_audioPerformer;
            case 1:
                return R.string.json_4_text1;
            case 2:
                return R.string.json_4_text2;
            case 3:
                return R.string.json_1_text1;
            case 4:
                return R.string.json_1_text2;
            case 5:
                return R.string.json_1_text3;
            case 6:
                return R.string.json_1_text4;
            case 7:
                return R.string.json_2_name1;
            case '\b':
                return R.string.json_2_name2;
            case '\t':
                return R.string.json_2_name3;
            case '\n':
                return R.string.json_2_name4;
            case 11:
                return R.string.json_2_text1;
            case '\f':
                return R.string.json_2_text2;
            case '\r':
                return R.string.json_2_text3;
            case 14:
                return R.string.json_2_text4;
            case 15:
                return R.string.json_2_text5;
            case 16:
                return R.string.json_2_title;
            case 17:
                return R.string.json_1_name;
            case 18:
                return R.string.json_3_name;
            case 19:
                return R.string.json_4_name;
            case 20:
                return R.string.json_1_audioTitle;
            case 21:
                return R.string.json_3_text1;
            case 22:
                return R.string.json_3_text2;
            case 23:
                return R.string.json_3_text3;
            case d.j.K3:
                return R.string.json_3_text4;
            case 25:
                return R.string.json_3_text5;
            case 26:
                return R.string.json_3_text6;
            case 27:
                return R.string.json_3_text7;
            default:
                return 0;
        }
    }

    public void V(List list, o6.f fVar) {
        this.f25338a.k3(list, fVar);
    }

    public static void W(o6.f fVar, o6.f fVar2) {
        fVar2.f28132a.size();
        fVar.f28132a.size();
    }

    public void X(final List list, final o6.f fVar) {
        if (fVar.f28132a.size() != list.size()) {
            this.f25340b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    x1.this.V(list, fVar);
                }
            });
        }
        if (fVar.a()) {
            this.f25340b.v5(fVar.f28132a, false, fVar, new j() {
                @Override
                public final void a(Object obj) {
                    x1.W(o6.f.this, (o6.f) obj);
                }
            });
        }
    }

    public void Y(int i10) {
        this.f25338a.i2();
        this.f25338a.v0(new ArrayList<>(), i10, 0, null, null, 0, false);
    }

    public void Z() {
        ArrayList arrayList = new ArrayList();
        e<TdApi.User> eVar = new e<>();
        this.f25338a.N2(eVar, G(this.f25338a.r0(), arrayList, eVar));
        TdApi.Message[] messageArr = new TdApi.Message[arrayList.size()];
        arrayList.toArray(messageArr);
        s0(this.f25339a0, messageArr, 0, null, true, null);
    }

    public static int a0(d dVar, d dVar2) {
        return Integer.compare(dVar2.f25368a, dVar.f25368a);
    }

    public static void b0(List list, boolean z10, s4 s4Var, s4 s4Var2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TdApi.Message message = (TdApi.Message) it.next();
            if (z10) {
                s4Var.G0(message, true);
            } else {
                s4Var2.G0(message, false);
            }
        }
    }

    public void c0() {
        synchronized (this.f25354n0) {
            this.N = false;
        }
        this.f25338a.c2();
        this.f25338a.b2();
    }

    public void d0() {
        synchronized (this.f25354n0) {
            this.N = false;
        }
        this.f25338a.k2();
        if (!this.M) {
            this.f25338a.b2();
        }
    }

    public void e0(long j10, long j11, int i10, String str, boolean z10, List list, ArrayList arrayList, int i11, int i12, s4 s4Var, ob.d dVar, boolean z11, boolean z12) {
        int size;
        if (this.f25339a0 == j10 && H() == j11) {
            x0(i10);
            this.f25350j0 = str;
            boolean z13 = true;
            boolean z14 = false;
            this.f25353m0 = this.f25353m0 || z10;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    F((List) it.next());
                }
            }
            if (!this.f25346f0 || !arrayList.isEmpty()) {
                int i13 = i11 == -1 ? 19 : 33;
                int i14 = this.O;
                boolean z15 = (i14 == 0 || i14 == 3) && arrayList.size() < i13 && arrayList.size() > 0;
                this.f25338a.v0(arrayList, this.O, i12, s4Var, dVar, this.S, z15 && this.f25346f0);
                synchronized (this.f25354n0) {
                    this.N = false;
                }
                int i15 = this.O;
                if ((i15 == 0 || i15 == 3) && (size = arrayList.size()) > 0 && size < i13) {
                    if (Log.isEnabled(8)) {
                        Log.i(8, "Loading more messages, because we received too few messages", new Object[0]);
                    }
                    int i16 = i13 - size;
                    if (z15 && this.f25346f0) {
                        z14 = true;
                    }
                    j0(true, i16, z14);
                } else {
                    z13 = false;
                }
                boolean z16 = this.f25342c;
                if (z16 != z11 && !z16) {
                    this.f25338a.k2();
                }
                boolean z17 = this.M;
                if (z17 != z12 && !z17) {
                    this.f25338a.c2();
                }
                if (!this.M && !z13) {
                    this.f25338a.b2();
                }
                this.f25338a.w0();
                return;
            }
            this.f25338a.i2();
            synchronized (this.f25354n0) {
                this.N = false;
            }
            f0(this.f25349i0, this.f25351k0, this.f25352l0, this.O, false, this.f25347g0, this.f25348h0);
        }
    }

    public static boolean p0(zd.d9 r42, java.util.List<org.drinkless.td.libcore.telegram.TdApi.Message> r43, k0.e<org.drinkless.td.libcore.telegram.TdApi.User> r44, java.lang.String r45) {
        throw new UnsupportedOperationException("Method not decompiled: vc.x1.p0(zd.d9, java.util.List, k0.e, java.lang.String):boolean");
    }

    public static String q0(String str, int i10) {
        if (i10 == 0) {
            return str;
        }
        String str2 = "json_" + i10 + "_" + str;
        int L = L(str2);
        if (L != 0) {
            return w.i1(L);
        }
        String o12 = w.o1(str2);
        if (o12 != null) {
            return o12;
        }
        throw new IllegalArgumentException("Invalid variable: json_" + i10 + "_" + str);
    }

    public static TdApi.User r0(o6 o6Var, JSONArray jSONArray, int i10) {
        TdApi.File X5;
        int length = jSONArray.length();
        String str = null;
        TdApi.User F4 = t2.F4(jSONArray.getInt(0), q0(jSONArray.getString(1), i10), length > 2 ? q0(jSONArray.getString(2), i10) : null);
        if (length > 3) {
            str = jSONArray.getString(3);
        }
        if (!i.i(str) && !c0.Q(str) && (X5 = o6Var.X5(str, new TdApi.FileTypeProfilePhoto(), 0L)) != null) {
            F4.profilePhoto = new TdApi.ProfilePhoto(0L, X5, X5, null, false);
        }
        return F4;
    }

    public boolean A() {
        if (!this.M) {
            return false;
        }
        boolean z10 = !R();
        this.M = z10;
        return z10;
    }

    public boolean B() {
        return this.f25342c;
    }

    public final boolean C(long j10) {
        return this.f25340b.O6(j10) && !this.f25338a.r0().Ua() && !this.f25338a.r0().Tk() && !this.f25338a.r0().ui() && !this.f25338a.r0().ti();
    }

    public final void D() {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(this.f25357q0);
        objArr[1] = Long.valueOf(this.f25356p0);
        int i10 = this.f25357q0;
        objArr[2] = Long.valueOf(i10 == 0 ? -1L : this.f25356p0 / i10);
        Log.i(8, "processed %d steps in %dms (average %dms per step)", objArr);
        this.f25356p0 = 0L;
        this.f25357q0 = 0;
    }

    public final void E(s4 s4Var, long j10, int i10) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f25355o0;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(j10);
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Long.valueOf(uptimeMillis);
        objArr[3] = s4Var != null ? s4Var.getClass().getName() : "combination";
        Log.i(8, "message_id=%d (size: %d) took %dms (%s)", objArr);
        this.f25356p0 += uptimeMillis;
        this.f25357q0++;
    }

    public final void F(final List<TdApi.Message> list) {
        this.f25340b.v5(list, true, null, new j() {
            @Override
            public final void a(Object obj) {
                x1.this.X(list, (o6.f) obj);
            }
        });
    }

    public long H() {
        p7 p7Var = this.Y;
        if (p7Var != null) {
            return p7Var.b();
        }
        TdApi.Chat chat = this.X;
        if (chat != null) {
            return chat.f19908id;
        }
        return 0L;
    }

    public int I() {
        return this.Q;
    }

    public p7 J() {
        return this.Y;
    }

    public long K() {
        p7 p7Var = this.Y;
        if (p7Var != null) {
            return p7Var.g();
        }
        return 0L;
    }

    public int M() {
        return this.T;
    }

    public final ob.d N() {
        s4 f02 = this.f25338a.E0().f0();
        if (f02 != null) {
            return new ob.d(f02.I2(), f02.P1());
        }
        return null;
    }

    public final ob.d O() {
        s4 k02 = this.f25338a.E0().k0();
        if (k02 != null) {
            return new ob.d(k02.I2(), k02.D4());
        }
        return null;
    }

    public final boolean P() {
        return (this.Y == null && this.W == null) ? false : true;
    }

    public boolean Q() {
        return this.f25340b.Q6(this.X);
    }

    public final boolean R() {
        return S(N());
    }

    public final boolean S(ob.d dVar) {
        int i10 = this.T;
        if (i10 == 3) {
            return true;
        }
        if (dVar == null) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        TdApi.Chat chat = this.X;
        if (chat == null || chat.f19908id != dVar.c()) {
            return false;
        }
        if (this.X.lastMessage != null && dVar.d() >= this.X.lastMessage.f19946id) {
            return true;
        }
        TdApi.SearchMessagesFilter searchMessagesFilter = this.W;
        return searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512 && this.f25338a.U1() != 0 && dVar.d() >= this.f25338a.U1();
    }

    public boolean T() {
        return this.N;
    }

    public boolean U() {
        TdApi.Chat chat = this.X;
        return chat != null && chat.type.getConstructor() == 862366513;
    }

    public final void f0(ob.d r24, int r25, int r26, final int r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: vc.x1.f0(ob.d, int, int, int, boolean, boolean, boolean):void");
    }

    public void g0(ob.d dVar, int i10, boolean z10) {
        u0();
        this.M = z10;
        this.f25342c = z10;
        this.R = dVar;
        this.S = i10;
        f0(dVar, -19, 33, z10 ? 0 : 3, false, true, true);
    }

    public void h0(ob.d dVar) {
        u0();
        this.f25342c = true;
        this.M = false;
        this.R = dVar;
        this.S = 0;
        f0(dVar, 0, 19, 0, true, true, true);
    }

    public boolean i0(boolean z10) {
        return j0(z10, z10 ? 50 : 31, false);
    }

    public final boolean j0(boolean z10, int i10, boolean z11) {
        if (!this.N && H() != 0) {
            if (z10) {
                ob.d O = O();
                if (B() && O != null) {
                    if (Log.isEnabled(8)) {
                        Log.i(8, "Loading more messages on top.", new Object[0]);
                    }
                    f0(O, 0, i10, 1, z11, true, false);
                    return true;
                }
            } else {
                ob.d N = N();
                if (A() && N != null) {
                    if (Log.isEnabled(8)) {
                        Log.i(8, "Loading more messages on bottom.", new Object[0]);
                    }
                    f0(N, -30, i10, 2, z11, false, true);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean k0() {
        return i0(B());
    }

    public void l0() {
        u0();
        this.f25342c = false;
        this.M = false;
        this.N = true;
        this.O = 0;
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                x1.this.Z();
            }
        });
    }

    public final Client.g m0(boolean z10, boolean z11, boolean z12) {
        long j10 = this.f25339a0;
        if (this.f25341b0 == null) {
            b bVar = new b(j10, z10, z11, z12);
            this.f25341b0 = bVar;
            return bVar;
        }
        throw new IllegalStateException("lastHandler != null");
    }

    public final TdApi.Message n0(long j10, boolean z10, TdApi.ChatEvent chatEvent) {
        long j11 = chatEvent.f19909id;
        TdApi.MessageSender messageSender = chatEvent.memberId;
        return new TdApi.Message(j11, messageSender, j10, null, null, this.f25340b.n7(messageSender), false, false, false, false, false, false, false, false, false, false, false, false, z10, false, chatEvent.date, 0, null, null, null, 0L, 0L, 0L, 0, 0.0d, 0L, null, 0L, null, null, null);
    }

    public final TdApi.Message[] o0(long j10, TdApi.ChatEvent[] chatEventArr) {
        ArrayList arrayList = new ArrayList(chatEventArr.length);
        boolean O6 = this.f25340b.O6(j10);
        for (TdApi.ChatEvent chatEvent : chatEventArr) {
            TdApi.Message message = null;
            switch (chatEvent.action.getConstructor()) {
                case TdApi.ChatEventSlowModeDelayChanged.CONSTRUCTOR:
                case TdApi.ChatEventMemberJoinedByRequest.CONSTRUCTOR:
                case TdApi.ChatEventIsAllHistoryAvailableToggled.CONSTRUCTOR:
                case TdApi.ChatEventInviteLinkRevoked.CONSTRUCTOR:
                case TdApi.ChatEventInviteLinkDeleted.CONSTRUCTOR:
                case TdApi.ChatEventSignMessagesToggled.CONSTRUCTOR:
                case TdApi.ChatEventStickerSetChanged.CONSTRUCTOR:
                case TdApi.ChatEventLocationChanged.CONSTRUCTOR:
                case TdApi.ChatEventMessageUnpinned.CONSTRUCTOR:
                case TdApi.ChatEventMemberJoinedByInviteLink.CONSTRUCTOR:
                case TdApi.ChatEventHasProtectedContentToggled.CONSTRUCTOR:
                case TdApi.ChatEventVideoChatMuteNewParticipantsToggled.CONSTRUCTOR:
                case TdApi.ChatEventInvitesToggled.CONSTRUCTOR:
                case TdApi.ChatEventVideoChatParticipantIsMutedToggled.CONSTRUCTOR:
                case TdApi.ChatEventVideoChatParticipantVolumeLevelChanged.CONSTRUCTOR:
                case TdApi.ChatEventLinkedChatChanged.CONSTRUCTOR:
                    message = n0(j10, O6, chatEvent);
                    message.content = new o7(chatEvent, false, false);
                    break;
                case TdApi.ChatEventPermissionsChanged.CONSTRUCTOR:
                case TdApi.ChatEventMemberLeft.CONSTRUCTOR:
                case TdApi.ChatEventPhotoChanged.CONSTRUCTOR:
                case TdApi.ChatEventInviteLinkEdited.CONSTRUCTOR:
                case TdApi.ChatEventMemberJoined.CONSTRUCTOR:
                case TdApi.ChatEventMemberPromoted.CONSTRUCTOR:
                case TdApi.ChatEventMessageTtlChanged.CONSTRUCTOR:
                case TdApi.ChatEventMemberInvited.CONSTRUCTOR:
                case TdApi.ChatEventTitleChanged.CONSTRUCTOR:
                case TdApi.ChatEventMemberRestricted.CONSTRUCTOR:
                case TdApi.ChatEventVideoChatEnded.CONSTRUCTOR:
                case TdApi.ChatEventVideoChatCreated.CONSTRUCTOR:
                    message = n0(j10, O6, chatEvent);
                    message.content = new o7(chatEvent, true, false);
                    break;
                case TdApi.ChatEventMessageDeleted.CONSTRUCTOR:
                case TdApi.ChatEventMessageEdited.CONSTRUCTOR:
                case TdApi.ChatEventDescriptionChanged.CONSTRUCTOR:
                case TdApi.ChatEventMessagePinned.CONSTRUCTOR:
                case TdApi.ChatEventUsernameChanged.CONSTRUCTOR:
                case TdApi.ChatEventPollStopped.CONSTRUCTOR:
                    TdApi.Message n02 = n0(j10, O6, chatEvent);
                    n02.content = new o7(chatEvent, true, true);
                    arrayList.add(n02);
                    message = n0(j10, O6, chatEvent);
                    message.content = new o7(chatEvent, false, false);
                    break;
            }
            if (message != null) {
                arrayList.add(message);
            }
        }
        TdApi.Message[] messageArr = new TdApi.Message[arrayList.size()];
        arrayList.toArray(messageArr);
        return messageArr;
    }

    @Override
    public void r2(TdApi.Object object) {
        if (object.getConstructor() != -722616727) {
            j0.z0("Weird viewMessage response: " + object.toString(), 1);
        }
    }

    public final void s0(final long r41, org.drinkless.td.libcore.telegram.TdApi.Message[] r43, final int r44, final java.lang.String r45, boolean r46, final java.util.List<java.util.List<org.drinkless.td.libcore.telegram.TdApi.Message>> r47) {
        throw new UnsupportedOperationException("Method not decompiled: vc.x1.s0(long, org.drinkless.td.libcore.telegram.TdApi$Message[], int, java.lang.String, boolean, java.util.List):void");
    }

    public void t0(long j10, j<TdApi.SponsoredMessage> jVar) {
        if (C(j10) && !this.P) {
            this.P = true;
            this.Z = new a(j10, jVar);
            this.f25340b.v4().o(new TdApi.GetChatSponsoredMessage(j10), this.Z);
        }
    }

    public void u0() {
        this.R = null;
        this.S = 0;
        this.Q = -1;
        this.f25353m0 = false;
        this.f25342c = false;
        this.M = false;
        if (this.f25339a0 == Long.MAX_VALUE) {
            this.f25339a0 = 0L;
        }
        this.f25339a0++;
        this.f25344d0 = 0;
        this.f25343c0 = null;
        k kVar = this.Z;
        if (kVar != null) {
            kVar.a();
        }
        synchronized (this.f25354n0) {
            this.f25341b0 = null;
            this.N = false;
        }
    }

    public void v0() {
        this.M = true;
    }

    public void w0(TdApi.Chat chat, p7 p7Var, int i10, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.X = chat;
        this.Y = p7Var;
        this.T = i10;
        this.W = searchMessagesFilter;
    }

    public final void x0(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            this.f25338a.r0().to(H(), i10);
        }
    }

    public void y0(String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.U = str;
        this.V = messageSender;
        this.W = searchMessagesFilter;
    }

    public final void z0() {
        this.f25355o0 = SystemClock.uptimeMillis();
    }
}
