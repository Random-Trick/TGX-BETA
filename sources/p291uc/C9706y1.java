package p291uc;

import android.os.SystemClock;
import be.C1363c0;
import be.C1379j0;
import gd.AbstractC4761s4;
import gd.C4728o7;
import gd.C4731p1;
import gd.C4737p7;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.json.JSONArray;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p039d.C3563j;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5123k;
import p139jb.AbstractC5918j;
import p143k0.C6035e;
import p193nb.C7319d;
import p291uc.C9706y1;
import p350yd.AbstractC10664f9;
import p350yd.C10930q6;

public class C9706y1 implements Client.AbstractC7865g {
    public boolean f31537M;
    public boolean f31538N;
    public int f31539O;
    public boolean f31540P;
    public C7319d f31542R;
    public int f31543S;
    public int f31544T;
    public String f31545U;
    public TdApi.MessageSender f31546V;
    public TdApi.SearchMessagesFilter f31547W;
    public TdApi.Chat f31548X;
    public C4737p7 f31549Y;
    public AbstractC5123k f31550Z;
    public final C9678w2 f31551a;
    public long f31552a0;
    public final C10930q6 f31553b;
    public volatile Client.AbstractC7865g f31554b0;
    public boolean f31555c;
    public TdApi.Message[] f31556c0;
    public int f31557d0;
    public long f31558e0;
    public boolean f31559f0;
    public boolean f31560g0;
    public boolean f31561h0;
    public C7319d f31562i0;
    public String f31563j0;
    public int f31564k0;
    public int f31565l0;
    public boolean f31566m0;
    public long f31568o0;
    public long f31569p0;
    public int f31570q0;
    public int f31541Q = -1;
    public final Object f31567n0 = new Object();

    public class C9707a extends AbstractC5123k {
        public final long f31572b;
        public final AbstractC5918j f31573c;

        public C9707a(long j, AbstractC5918j jVar) {
            this.f31572b = j;
            this.f31573c = jVar;
        }

        public void m7436e(TdApi.Object object, long j, AbstractC5918j jVar) {
            C9706y1.this.f31540P = false;
            TdApi.SponsoredMessage sponsoredMessage = null;
            C9706y1.this.f31550Z = null;
            if (object.getConstructor() == -1384343080) {
                sponsoredMessage = (TdApi.SponsoredMessage) object;
            } else if (C9706y1.this.f31553b.m2949A1().m1504G()) {
                sponsoredMessage = C4731p1.m26310a(C9706y1.this.f31553b);
            }
            if (j == C9706y1.this.m7509H()) {
                jVar.mo1330a(sponsoredMessage);
            }
        }

        @Override
        public void mo7438c(final TdApi.Object object) {
            final long j = this.f31572b;
            final AbstractC5918j jVar = this.f31573c;
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C9706y1.C9707a.this.m7436e(object, j, jVar);
                }
            });
        }
    }

    public class C9708b implements Client.AbstractC7865g {
        public final boolean f31574M;
        public final long f31576a;
        public final boolean f31577b;
        public final boolean f31578c;

        public C9708b(long j, boolean z, boolean z2, boolean z3) {
            this.f31576a = j;
            this.f31577b = z;
            this.f31578c = z2;
            this.f31574M = z3;
        }

        @Override
        public void mo255t2(org.drinkless.p210td.libcore.telegram.TdApi.Object r21) {
            throw new UnsupportedOperationException("Method not decompiled: p291uc.C9706y1.C9708b.mo255t2(org.drinkless.td.libcore.telegram.TdApi$Object):void");
        }
    }

    public static class C9709c {
        public final int f31579a;
        public final int f31580b;
        public final boolean f31581c;
        public final int f31582d;
        public final TdApi.MessageContent f31583e;

        public C9709c(int i, int i2, boolean z, int i3, TdApi.MessageContent messageContent) {
            this.f31579a = i;
            this.f31580b = i2;
            this.f31581c = z;
            this.f31582d = i3;
            this.f31583e = messageContent;
        }
    }

    public static class C9710d {
        public int f31584a;
        public JSONObject f31585b;

        public C9710d(int i, JSONObject jSONObject) {
            this.f31584a = i;
            this.f31585b = jSONObject;
        }
    }

    public C9706y1(C9678w2 w2Var) {
        this.f31551a = w2Var;
        this.f31553b = w2Var.m7645r0().mo4348c();
        m7449u0();
    }

    public static boolean m7510G(AbstractC10664f9 f9Var, List<TdApi.Message> list, C6035e<TdApi.User> eVar) {
        String i1 = C4403w.m27871i1(R.string.json_ChatDemo);
        if (!C5070i.m24062i(i1) && !i1.equals("0")) {
            try {
                return m7459p0(f9Var, list, eVar, i1);
            } catch (Throwable th) {
                Log.m14725e("Cannot parse chat demo content", th, new Object[0]);
                list.clear();
                eVar.m21510b();
            }
        }
        try {
            return m7459p0(f9Var, list, eVar, "[{\"lang\":1,\"member\":\"name\",\"_\":[{\"sticker\":[512,512,\"AAQCABMktIENAAQ7jAMIc7zJ7Xd8AAIC\",\"CAADAgADQQIAAkf7CQw2YkvFWC1DowI\",867500685606780933]},{\"text\":[\"text1\",1]},{\"text\":[\"text2\",1],\"out\":1},{\"voice\":3,\"out\":1},{\"text\":[\"text3\",1]},{\"audio\":[243,\"audioTitle\",\"audioPerformer\"]},{\"text\":[\"text4\",1],\"out\":1}]},{\"lang\":2,\"members\":[[6,\"name1\"],[7,\"name2\"],[3,\"name3\"],[1,\"name4\"]],\"_\":[{\"created\":\"title\",\"out\":1},{\"text\":[\"text1\",1],\"author\":6},{\"text\":[\"text2\",1],\"out\":1},{\"text\":[\"text3\",1],\"author\":7},{\"text\":[\"text4\",1],\"author\":3},{\"left\":3},{\"text\":[\"text5\",1],\"author\":1},{\"sticker\":[467,512,\"AAQCABNfgVkqAAT-l09kzZivgi08AAIC\",\"CAADAgAD3gAD9HsZAAG9he9u98XOPQI\",7173162320003073],\"out\":1}]},{\"lang\":3,\"member\":[0,\"name\"],\"_\":[{\"sticker\":[512,512,\"AAQCABOzP0sNAATjTYV36dMVWNVCAQABAg\",\"CAADAgADfgUAAvoLtghVynd3kd-TuAI\"]},{\"text\":[\"text1\",1],\"out\":1},{\"text\":[\"text2\",1]},{\"text\":[\"text3\",1],\"out\":1},{\"text\":[\"text4\",1]},{\"text\":[\"text5\",1],\"out\":1},{\"text\":[\"text6\",1]},{\"ttl\":15},{\"text\":[\"text7\",1],\"out\":1}]},{\"lang\":4,\"member\":\"name\",\"_\":[{\"text\":[\"text1\",1]},{\"text\":[\"text2\",1],\"out\":1}],\"guide\":1}]");
        } catch (Throwable th2) {
            Log.m14723e(th2);
            list.clear();
            eVar.m21510b();
            return false;
        }
    }

    public static int m7505L(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2029069091:
                if (str.equals("json_1_audioPerformer")) {
                    c = 0;
                    break;
                }
                break;
            case -1483933566:
                if (str.equals("json_4_text1")) {
                    c = 1;
                    break;
                }
                break;
            case -1483933565:
                if (str.equals("json_4_text2")) {
                    c = 2;
                    break;
                }
                break;
            case 148522687:
                if (str.equals("json_1_text1")) {
                    c = 3;
                    break;
                }
                break;
            case 148522688:
                if (str.equals("json_1_text2")) {
                    c = 4;
                    break;
                }
                break;
            case 148522689:
                if (str.equals("json_1_text3")) {
                    c = 5;
                    break;
                }
                break;
            case 148522690:
                if (str.equals("json_1_text4")) {
                    c = 6;
                    break;
                }
                break;
            case 1030355042:
                if (str.equals("json_2_name1")) {
                    c = 7;
                    break;
                }
                break;
            case 1030355043:
                if (str.equals("json_2_name2")) {
                    c = '\b';
                    break;
                }
                break;
            case 1030355044:
                if (str.equals("json_2_name3")) {
                    c = '\t';
                    break;
                }
                break;
            case 1030355045:
                if (str.equals("json_2_name4")) {
                    c = '\n';
                    break;
                }
                break;
            case 1036026368:
                if (str.equals("json_2_text1")) {
                    c = 11;
                    break;
                }
                break;
            case 1036026369:
                if (str.equals("json_2_text2")) {
                    c = '\f';
                    break;
                }
                break;
            case 1036026370:
                if (str.equals("json_2_text3")) {
                    c = '\r';
                    break;
                }
                break;
            case 1036026371:
                if (str.equals("json_2_text4")) {
                    c = 14;
                    break;
                }
                break;
            case 1036026372:
                if (str.equals("json_2_text5")) {
                    c = 15;
                    break;
                }
                break;
            case 1036141492:
                if (str.equals("json_2_title")) {
                    c = 16;
                    break;
                }
                break;
            case 1251534096:
                if (str.equals("json_1_name")) {
                    c = 17;
                    break;
                }
                break;
            case 1308792398:
                if (str.equals("json_3_name")) {
                    c = 18;
                    break;
                }
                break;
            case 1337421549:
                if (str.equals("json_4_name")) {
                    c = 19;
                    break;
                }
                break;
            case 1451507431:
                if (str.equals("json_1_audioTitle")) {
                    c = 20;
                    break;
                }
                break;
            case 1923530049:
                if (str.equals("json_3_text1")) {
                    c = 21;
                    break;
                }
                break;
            case 1923530050:
                if (str.equals("json_3_text2")) {
                    c = 22;
                    break;
                }
                break;
            case 1923530051:
                if (str.equals("json_3_text3")) {
                    c = 23;
                    break;
                }
                break;
            case 1923530052:
                if (str.equals("json_3_text4")) {
                    c = 24;
                    break;
                }
                break;
            case 1923530053:
                if (str.equals("json_3_text5")) {
                    c = 25;
                    break;
                }
                break;
            case 1923530054:
                if (str.equals("json_3_text6")) {
                    c = 26;
                    break;
                }
                break;
            case 1923530055:
                if (str.equals("json_3_text7")) {
                    c = 27;
                    break;
                }
                break;
        }
        switch (c) {
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
            case C3563j.f11955K3:
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

    public void m7495V(List list, C10930q6.C10936f fVar) {
        this.f31551a.m7680j3(list, fVar);
    }

    public static void m7494W(C10930q6.C10936f fVar, C10930q6.C10936f fVar2) {
        fVar2.f35136a.size();
        fVar.f35136a.size();
    }

    public void m7493X(final List list, final C10930q6.C10936f fVar) {
        if (fVar.f35136a.size() != list.size()) {
            this.f31553b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9706y1.this.m7495V(list, fVar);
                }
            });
        }
        if (fVar.m2131a()) {
            this.f31553b.m2269r5(fVar.f35136a, false, fVar, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C9706y1.m7494W(C10930q6.C10936f.this, (C10930q6.C10936f) obj);
                }
            });
        }
    }

    public void m7492Y(int i) {
        this.f31551a.m7686i2();
        this.f31551a.m7628v0(new ArrayList<>(), i, 0, null, null, 0, false);
    }

    public void m7491Z() {
        ArrayList arrayList = new ArrayList();
        C6035e<TdApi.User> eVar = new C6035e<>();
        this.f31551a.m7772N2(eVar, m7510G(this.f31551a.m7645r0(), arrayList, eVar));
        TdApi.Message[] messageArr = new TdApi.Message[arrayList.size()];
        arrayList.toArray(messageArr);
        m7453s0(this.f31552a0, messageArr, 0, null, true, null);
    }

    public static int m7489a0(C9710d dVar, C9710d dVar2) {
        return Integer.compare(dVar2.f31584a, dVar.f31584a);
    }

    public static void m7487b0(List list, boolean z, AbstractC4761s4 s4Var, AbstractC4761s4 s4Var2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TdApi.Message message = (TdApi.Message) it.next();
            if (z) {
                s4Var.m26200F0(message, true);
            } else {
                s4Var2.m26200F0(message, false);
            }
        }
    }

    public void m7485c0() {
        synchronized (this.f31567n0) {
            this.f31538N = false;
        }
        this.f31551a.m7715c2();
        this.f31551a.m7720b2();
    }

    public void m7483d0() {
        synchronized (this.f31567n0) {
            this.f31538N = false;
        }
        this.f31551a.m7676k2();
        if (!this.f31537M) {
            this.f31551a.m7720b2();
        }
    }

    public void m7481e0(long j, long j2, int i, String str, boolean z, List list, ArrayList arrayList, int i2, int i3, AbstractC4761s4 s4Var, C7319d dVar, boolean z2, boolean z3) {
        int size;
        if (this.f31552a0 == j && m7509H() == j2) {
            m7443x0(i);
            this.f31563j0 = str;
            boolean z4 = true;
            boolean z5 = false;
            this.f31566m0 = this.f31566m0 || z;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m7511F((List) it.next());
                }
            }
            if (!this.f31559f0 || !arrayList.isEmpty()) {
                int i4 = i2 == -1 ? 19 : 33;
                int i5 = this.f31539O;
                boolean z6 = (i5 == 0 || i5 == 3) && arrayList.size() < i4 && arrayList.size() > 0;
                this.f31551a.m7628v0(arrayList, this.f31539O, i3, s4Var, dVar, this.f31543S, z6 && this.f31559f0);
                synchronized (this.f31567n0) {
                    this.f31538N = false;
                }
                int i6 = this.f31539O;
                if ((i6 == 0 || i6 == 3) && (size = arrayList.size()) > 0 && size < i4) {
                    if (Log.isEnabled(8)) {
                        Log.m14721i(8, "Loading more messages, because we received too few messages", new Object[0]);
                    }
                    int i7 = i4 - size;
                    if (z6 && this.f31559f0) {
                        z5 = true;
                    }
                    m7471j0(true, i7, z5);
                } else {
                    z4 = false;
                }
                boolean z7 = this.f31555c;
                if (z7 != z2 && !z7) {
                    this.f31551a.m7676k2();
                }
                boolean z8 = this.f31537M;
                if (z8 != z3 && !z8) {
                    this.f31551a.m7715c2();
                }
                if (!this.f31537M && !z4) {
                    this.f31551a.m7720b2();
                }
                this.f31551a.m7623w0();
                return;
            }
            this.f31551a.m7686i2();
            synchronized (this.f31567n0) {
                this.f31538N = false;
            }
            m7479f0(this.f31562i0, this.f31564k0, this.f31565l0, this.f31539O, false, this.f31560g0, this.f31561h0);
        }
    }

    public static boolean m7459p0(p350yd.AbstractC10664f9 r42, java.util.List<org.drinkless.p210td.libcore.telegram.TdApi.Message> r43, p143k0.C6035e<org.drinkless.p210td.libcore.telegram.TdApi.User> r44, java.lang.String r45) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9706y1.m7459p0(yd.f9, java.util.List, k0.e, java.lang.String):boolean");
    }

    public static String m7457q0(String str, int i) {
        if (i == 0) {
            return str;
        }
        String str2 = "json_" + i + "_" + str;
        int L = m7505L(str2);
        if (L != 0) {
            return C4403w.m27871i1(L);
        }
        String o1 = C4403w.m27847o1(str2);
        if (o1 != null) {
            return o1;
        }
        throw new IllegalArgumentException("Invalid variable: json_" + i + "_" + str);
    }

    public static TdApi.User m7455r0(C10930q6 q6Var, JSONArray jSONArray, int i) {
        TdApi.File T5;
        int length = jSONArray.length();
        String str = null;
        TdApi.User F4 = C4779t2.m25692F4(jSONArray.getInt(0), m7457q0(jSONArray.getString(1), i), length > 2 ? m7457q0(jSONArray.getString(2), i) : null);
        if (length > 3) {
            str = jSONArray.getString(3);
        }
        if (!C5070i.m24062i(str) && !C1363c0.m37460Q(str) && (T5 = q6Var.m2644T5(str, new TdApi.FileTypeProfilePhoto(), 0L)) != null) {
            F4.profilePhoto = new TdApi.ProfilePhoto(0L, T5, T5, null, false);
        }
        return F4;
    }

    public boolean m7516A() {
        if (!this.f31537M) {
            return false;
        }
        boolean z = !m7499R();
        this.f31537M = z;
        return z;
    }

    public boolean m7515B() {
        return this.f31555c;
    }

    public final boolean m7514C(long j) {
        return this.f31553b.m2784K6(j) && !this.f31551a.m7645r0().m9332Ua() && !this.f31551a.m7645r0().m32569Tk() && !this.f31551a.m7645r0().m32219ui() && !this.f31551a.m7645r0().m32232ti();
    }

    public final void m7513D() {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(this.f31570q0);
        objArr[1] = Long.valueOf(this.f31569p0);
        int i = this.f31570q0;
        objArr[2] = Long.valueOf(i == 0 ? -1L : this.f31569p0 / i);
        Log.m14721i(8, "processed %d steps in %dms (average %dms per step)", objArr);
        this.f31569p0 = 0L;
        this.f31570q0 = 0;
    }

    public final void m7512E(AbstractC4761s4 s4Var, long j, int i) {
        long uptimeMillis = SystemClock.uptimeMillis() - this.f31568o0;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Long.valueOf(uptimeMillis);
        objArr[3] = s4Var != null ? s4Var.getClass().getName() : "combination";
        Log.m14721i(8, "message_id=%d (size: %d) took %dms (%s)", objArr);
        this.f31569p0 += uptimeMillis;
        this.f31570q0++;
    }

    public final void m7511F(final List<TdApi.Message> list) {
        this.f31553b.m2269r5(list, true, null, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C9706y1.this.m7493X(list, (C10930q6.C10936f) obj);
            }
        });
    }

    public long m7509H() {
        C4737p7 p7Var = this.f31549Y;
        if (p7Var != null) {
            return p7Var.m26300b();
        }
        TdApi.Chat chat = this.f31548X;
        if (chat != null) {
            return chat.f25370id;
        }
        return 0L;
    }

    public int m7508I() {
        return this.f31541Q;
    }

    public C4737p7 m7507J() {
        return this.f31549Y;
    }

    public long m7506K() {
        C4737p7 p7Var = this.f31549Y;
        if (p7Var != null) {
            return p7Var.m26295g();
        }
        return 0L;
    }

    public int m7504M() {
        return this.f31544T;
    }

    public final C7319d m7503N() {
        AbstractC4761s4 g0 = this.f31551a.m7808E0().m8119g0();
        if (g0 != null) {
            return new C7319d(g0.m26146K2(), g0.m26066S1());
        }
        return null;
    }

    public final C7319d m7502O() {
        AbstractC4761s4 l0 = this.f31551a.m7808E0().m8114l0();
        if (l0 != null) {
            return new C7319d(l0.m26146K2(), l0.m26206E4());
        }
        return null;
    }

    public final boolean m7501P() {
        return (this.f31549Y == null && this.f31547W == null) ? false : true;
    }

    public boolean m7500Q() {
        return this.f31553b.m2752M6(this.f31548X);
    }

    public final boolean m7499R() {
        return m7498S(m7503N());
    }

    public final boolean m7498S(C7319d dVar) {
        int i = this.f31544T;
        if (i == 3) {
            return true;
        }
        if (dVar == null) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        TdApi.Chat chat = this.f31548X;
        if (chat == null || chat.f25370id != dVar.m17027c()) {
            return false;
        }
        if (this.f31548X.lastMessage != null && dVar.m17026d() >= this.f31548X.lastMessage.f25409id) {
            return true;
        }
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f31547W;
        return searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512 && this.f31551a.m7750T1() != 0 && dVar.m17026d() >= this.f31551a.m7750T1();
    }

    public boolean m7497T() {
        return this.f31538N;
    }

    public boolean m7496U() {
        TdApi.Chat chat = this.f31548X;
        return chat != null && chat.type.getConstructor() == 862366513;
    }

    public final void m7479f0(p193nb.C7319d r24, int r25, int r26, final int r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9706y1.m7479f0(nb.d, int, int, int, boolean, boolean, boolean):void");
    }

    public void m7477g0(C7319d dVar, int i, boolean z) {
        m7449u0();
        this.f31537M = z;
        this.f31555c = z;
        this.f31542R = dVar;
        this.f31543S = i;
        m7479f0(dVar, -19, 33, z ? 0 : 3, false, true, true);
    }

    public void m7475h0(C7319d dVar) {
        m7449u0();
        this.f31555c = true;
        this.f31537M = false;
        this.f31542R = dVar;
        this.f31543S = 0;
        m7479f0(dVar, 0, 19, 0, true, true, true);
    }

    public boolean m7473i0(boolean z) {
        return m7471j0(z, z ? 50 : 31, false);
    }

    public final boolean m7471j0(boolean z, int i, boolean z2) {
        if (!this.f31538N && m7509H() != 0) {
            if (z) {
                C7319d O = m7502O();
                if (m7515B() && O != null) {
                    if (Log.isEnabled(8)) {
                        Log.m14721i(8, "Loading more messages on top.", new Object[0]);
                    }
                    m7479f0(O, 0, i, 1, z2, true, false);
                    return true;
                }
            } else {
                C7319d N = m7503N();
                if (m7516A() && N != null) {
                    if (Log.isEnabled(8)) {
                        Log.m14721i(8, "Loading more messages on bottom.", new Object[0]);
                    }
                    m7479f0(N, -30, i, 2, z2, false, true);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean m7469k0() {
        return m7473i0(m7515B());
    }

    public void m7467l0() {
        m7449u0();
        this.f31555c = false;
        this.f31537M = false;
        this.f31538N = true;
        this.f31539O = 0;
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                C9706y1.this.m7491Z();
            }
        });
    }

    public final Client.AbstractC7865g m7465m0(boolean z, boolean z2, boolean z3) {
        long j = this.f31552a0;
        if (this.f31554b0 == null) {
            C9708b bVar = new C9708b(j, z, z2, z3);
            this.f31554b0 = bVar;
            return bVar;
        }
        throw new IllegalStateException("lastHandler != null");
    }

    public final TdApi.Message m7463n0(long j, boolean z, TdApi.ChatEvent chatEvent) {
        long j2 = chatEvent.f25371id;
        TdApi.MessageSender messageSender = chatEvent.memberId;
        return new TdApi.Message(j2, messageSender, j, null, null, this.f31553b.m2395j7(messageSender), false, false, false, false, false, false, false, false, false, false, false, false, z, false, chatEvent.date, 0, null, null, null, 0L, 0L, 0L, 0, 0.0d, 0L, null, 0L, null, null, null);
    }

    public final TdApi.Message[] m7461o0(long j, TdApi.ChatEvent[] chatEventArr) {
        ArrayList arrayList = new ArrayList(chatEventArr.length);
        boolean K6 = this.f31553b.m2784K6(j);
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
                    message = m7463n0(j, K6, chatEvent);
                    message.content = new C4728o7(chatEvent, false, false);
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
                    message = m7463n0(j, K6, chatEvent);
                    message.content = new C4728o7(chatEvent, true, false);
                    break;
                case TdApi.ChatEventMessageDeleted.CONSTRUCTOR:
                case TdApi.ChatEventMessageEdited.CONSTRUCTOR:
                case TdApi.ChatEventDescriptionChanged.CONSTRUCTOR:
                case TdApi.ChatEventMessagePinned.CONSTRUCTOR:
                case TdApi.ChatEventUsernameChanged.CONSTRUCTOR:
                case TdApi.ChatEventPollStopped.CONSTRUCTOR:
                    TdApi.Message n0 = m7463n0(j, K6, chatEvent);
                    n0.content = new C4728o7(chatEvent, true, true);
                    arrayList.add(n0);
                    message = m7463n0(j, K6, chatEvent);
                    message.content = new C4728o7(chatEvent, false, false);
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

    public final void m7453s0(final long r41, org.drinkless.p210td.libcore.telegram.TdApi.Message[] r43, final int r44, final java.lang.String r45, boolean r46, final java.util.List<java.util.List<org.drinkless.p210td.libcore.telegram.TdApi.Message>> r47) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9706y1.m7453s0(long, org.drinkless.td.libcore.telegram.TdApi$Message[], int, java.lang.String, boolean, java.util.List):void");
    }

    public void m7451t0(long j, AbstractC5918j<TdApi.SponsoredMessage> jVar) {
        if (m7514C(j) && !this.f31540P) {
            this.f31540P = true;
            this.f31550Z = new C9707a(j, jVar);
            this.f31553b.m2270r4().m14783o(new TdApi.GetChatSponsoredMessage(j), this.f31550Z);
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        if (object.getConstructor() != -722616727) {
            C1379j0.m37293z0("Weird viewMessage response: " + object.toString(), 1);
        }
    }

    public void m7449u0() {
        this.f31542R = null;
        this.f31543S = 0;
        this.f31541Q = -1;
        this.f31566m0 = false;
        this.f31555c = false;
        this.f31537M = false;
        if (this.f31552a0 == Long.MAX_VALUE) {
            this.f31552a0 = 0L;
        }
        this.f31552a0++;
        this.f31557d0 = 0;
        this.f31556c0 = null;
        AbstractC5123k kVar = this.f31550Z;
        if (kVar != null) {
            kVar.m23883a();
        }
        synchronized (this.f31567n0) {
            this.f31554b0 = null;
            this.f31538N = false;
        }
    }

    public void m7447v0() {
        this.f31537M = true;
    }

    public void m7445w0(TdApi.Chat chat, C4737p7 p7Var, int i, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f31548X = chat;
        this.f31549Y = p7Var;
        this.f31544T = i;
        this.f31547W = searchMessagesFilter;
    }

    public final void m7443x0(int i) {
        if (this.f31541Q != i) {
            this.f31541Q = i;
            this.f31551a.m7645r0().m32226to(m7509H(), i);
        }
    }

    public void m7441y0(String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f31545U = str;
        this.f31546V = messageSender;
        this.f31547W = searchMessagesFilter;
    }

    public final void m7439z0() {
        this.f31568o0 = SystemClock.uptimeMillis();
    }
}
