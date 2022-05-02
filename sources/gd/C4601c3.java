package gd;

import android.text.SpannableStringBuilder;
import be.C1363c0;
import gd.C4587b;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5070i;
import p156kd.C6246h;
import p193nb.C7316a;
import p350yd.C10930q6;
import vc.C9903a;

public class C4601c3 {
    public int f15204a;
    public final C10930q6 f15205b;
    public final TdApi.ChatList f15206c;
    public final long f15207d;
    public long f15208e;
    public TdApi.Chat f15209f;
    public CharSequence f15210g;
    public String f15211h;
    public String f15212i;
    public C6246h f15213j;
    public C4587b.C4588a f15214k;
    public boolean f15215l;
    public TdApi.Chat f15216m;
    public String f15217n;
    public boolean f15218o;
    public boolean f15219p;
    public boolean f15220q;
    public CharSequence f15221r;
    public long f15222s;
    public C4737p7 f15223t;

    public C4601c3(C10930q6 q6Var, TdApi.ChatList chatList, long j, boolean z) {
        this.f15205b = q6Var;
        this.f15206c = chatList;
        this.f15207d = j;
        m27027y(q6Var.m2771L3(j), null, z);
    }

    public C4601c3 m27064A() {
        this.f15204a |= 16;
        return this;
    }

    public C4601c3 m27063B(String str) {
        this.f15212i = str;
        return this;
    }

    public void m27062C() {
        this.f15215l = true;
    }

    public C4601c3 m27061D() {
        this.f15204a |= 2;
        return this;
    }

    public void m27060E(TdApi.File file) {
        if (file != null) {
            C6246h hVar = new C6246h(this.f15205b, file);
            this.f15213j = hVar;
            hVar.mo20767t0(C9903a.getDefaultAvatarCacheSize());
            return;
        }
        this.f15213j = null;
    }

    public final void m27059F(String str, TdApi.Chat chat) {
        TdApi.User b4;
        C4587b.C4588a aVar = null;
        if (this.f15218o || C5070i.m24061i(this.f15217n) || C5070i.m24067c(this.f15210g, str)) {
            this.f15210g = str;
            this.f15209f = (this.f15204a & 4) == 0 ? chat : null;
        } else {
            this.f15210g = C1363c0.m37465I(str, this.f15217n, 0, C4776t.f16203g0);
            this.f15209f = null;
        }
        if ((this.f15204a & 4) != 0) {
            aVar = this.f15205b.m2480e2().m1683U1();
        } else if (chat != null) {
            aVar = this.f15205b.m2899D3(chat, true);
        }
        this.f15214k = aVar;
        if ((this.f15204a & 4) != 0) {
            this.f15211h = C4403w.m27869i1(R.string.Saved);
        } else if (chat != null && (b4 = this.f15205b.m2525b4(chat)) != null && b4.type.getConstructor() == -598644325) {
            this.f15211h = b4.firstName;
        }
    }

    public void m27058G() {
        this.f15204a |= 8;
        m27052M(this.f15216m);
    }

    public final void m27057H(TdApi.User user, String str) {
        if ((this.f15204a & 4) != 0) {
            this.f15214k = this.f15205b.m2480e2().m1683U1();
            this.f15210g = C1363c0.m37465I(C4403w.m27869i1(R.string.SavedMessages), str, 0, C4776t.f16203g0);
        } else {
            this.f15214k = this.f15205b.m2480e2().m1701P2(user, true);
            this.f15210g = C1363c0.m37465I(C4779t2.m25437r2(user), str, 0, C4776t.f16203g0);
        }
        TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
        m27060E(profilePhoto != null ? profilePhoto.small : null);
    }

    public void m27056I() {
        long j = this.f15207d;
        if (j != 0) {
            TdApi.Chat U2 = this.f15205b.m2632U2(j);
            if (U2 != null) {
                m27055J(U2);
                return;
            }
            return;
        }
        TdApi.User v2 = this.f15205b.m2480e2().m1583v2(this.f15208e);
        if (v2 != null) {
            m27053L(v2);
        }
    }

    public final void m27055J(TdApi.Chat chat) {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        m27052M(chat);
        boolean z = (this.f15204a & 4) != 0;
        m27059F(this.f15205b.m2661S3(chat), chat);
        this.f15219p = this.f15205b.m2255s3(this.f15207d);
        this.f15220q = this.f15205b.m2223u3(this.f15207d);
        this.f15214k = z ? this.f15205b.m2480e2().m1683U1() : this.f15205b.m2899D3(chat, true);
        m27060E((z || (chatPhotoInfo = chat.photo) == null) ? null : chatPhotoInfo.small);
    }

    public void m27054K() {
        this.f15219p = this.f15205b.m2255s3(this.f15207d);
        this.f15220q = this.f15205b.m2223u3(this.f15207d);
    }

    public final void m27053L(TdApi.User user) {
        if (!m27031u()) {
            this.f15214k = this.f15205b.m2480e2().m1701P2(user, true);
            this.f15210g = C1363c0.m37465I(C4779t2.m25437r2(user), this.f15217n, 0, C4776t.f16203g0);
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            m27060E(profilePhoto != null ? profilePhoto.small : null);
        }
    }

    public final void m27052M(TdApi.Chat chat) {
        TdApi.Supergroup h2;
        if (this.f15218o) {
            String f4 = this.f15205b.m2462f4(chat.f25367id);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            if (!C5070i.m24061i(f4)) {
                if ((this.f15204a & 8) != 0) {
                    sb2.append('/');
                } else {
                    sb2.append('@');
                }
                sb2.append(f4);
            }
            if (chat.type.getConstructor() == -1472570774) {
                long p = C7316a.m17045p(chat.f25367id);
                TdApi.SupergroupFullInfo i2 = this.f15205b.m2480e2().m1634i2(p);
                int i = i2 != null ? i2.memberCount : 0;
                if (i == 0 && (h2 = this.f15205b.m2480e2().m1638h2(p)) != null) {
                    i = h2.memberCount;
                }
                if (i != 0) {
                    sb3.append(C4403w.m27844o2(C4779t2.m25637N2(chat.type) ? R.string.xSubscribers : R.string.xMembers, i));
                }
            }
            spannableStringBuilder.append(C1363c0.m37465I(sb2.toString(), this.f15217n, 1, null));
            if (sb3.length() > 0) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) sb3.toString());
            }
            if (spannableStringBuilder.length() == 0) {
                spannableStringBuilder.append(this.f15205b.m2166xc().m3296m(this.f15207d));
            }
            this.f15221r = spannableStringBuilder;
        }
    }

    public long m27051a() {
        long j = this.f15207d;
        if (j != 0) {
            return j;
        }
        long j2 = this.f15222s;
        return j2 != 0 ? j2 : C7316a.m17058c(this.f15208e);
    }

    public C6246h m27050b() {
        return this.f15213j;
    }

    public C4587b.C4588a m27049c() {
        return this.f15214k;
    }

    public TdApi.Chat m27048d() {
        return this.f15216m;
    }

    public long m27047e() {
        return this.f15207d;
    }

    public long m27046f() {
        long j = this.f15207d;
        return j != 0 ? j : C7316a.m17058c(this.f15208e);
    }

    public String m27045g() {
        return this.f15212i;
    }

    public String m27044h() {
        return (this.f15204a & 4) != 0 ? C4403w.m27869i1(R.string.SavedMessages) : this.f15210g.toString();
    }

    public long m27043i() {
        return this.f15207d;
    }

    public TdApi.ChatList m27042j() {
        return this.f15206c;
    }

    public C4737p7 m27041k() {
        return this.f15223t;
    }

    public TdApi.MessageSender m27040l() {
        long j = this.f15208e;
        if (j != 0) {
            return new TdApi.MessageSenderUser(j);
        }
        long j2 = this.f15207d;
        if (j2 == 0) {
            throw new IllegalStateException();
        } else if (C7316a.m17049l(j2)) {
            return new TdApi.MessageSenderUser(this.f15205b.m2494d4(this.f15207d));
        } else {
            return new TdApi.MessageSenderChat(this.f15207d);
        }
    }

    public CharSequence m27039m() {
        return C5070i.m24061i(this.f15211h) ? this.f15210g : this.f15211h;
    }

    public CharSequence m27038n() {
        TdApi.Chat chat = this.f15209f;
        return chat != null ? this.f15205b.m2661S3(chat) : this.f15210g;
    }

    public int m27037o() {
        TdApi.Chat chat;
        if ((this.f15204a & 2) != 0 || (chat = this.f15216m) == null) {
            return 0;
        }
        int i = chat.unreadCount;
        if (i > 0) {
            return i;
        }
        if (chat.isMarkedAsUnread) {
            return C10930q6.f34956A2;
        }
        return 0;
    }

    public long m27036p() {
        return this.f15208e;
    }

    public CharSequence m27035q() {
        return this.f15221r;
    }

    public boolean m27034r() {
        return !C5070i.m24061i(this.f15217n);
    }

    public boolean m27033s() {
        return this.f15218o;
    }

    public boolean m27032t() {
        return (this.f15204a & 1) != 0;
    }

    public boolean m27031u() {
        return (this.f15204a & 4) != 0;
    }

    public boolean m27030v() {
        return C5063c.m24144b(this.f15204a, 16);
    }

    public boolean m27029w() {
        return this.f15215l;
    }

    public boolean m27028x() {
        return this.f15220q;
    }

    public final void m27027y(TdApi.Chat chat, String str, boolean z) {
        this.f15216m = chat;
        this.f15218o = z;
        this.f15217n = str;
        int h = C5063c.m24138h(C5063c.m24138h(this.f15204a, 1, C7316a.m17051j(chat.f25367id)), 4, this.f15205b.m2443g7(chat.f25367id));
        this.f15204a = h;
        this.f15208e = C4779t2.m25458o2(chat.type);
        this.f15214k = (h & 4) != 0 ? this.f15205b.m2480e2().m1683U1() : this.f15205b.m2899D3(chat, true);
        m27055J(chat);
    }

    public void m27026z(long j) {
        this.f15222s = j;
    }

    public C4601c3(C10930q6 q6Var, TdApi.ChatList chatList, TdApi.Chat chat, boolean z, String str) {
        this.f15205b = q6Var;
        this.f15206c = chatList;
        this.f15207d = chat.f25367id;
        m27027y(chat, str, z);
    }

    public C4601c3(C10930q6 q6Var, long j) {
        this(q6Var, q6Var.m2480e2().m1583v2(j), (String) null, false);
    }

    public C4601c3(C10930q6 q6Var, TdApi.User user, String str, boolean z) {
        this.f15205b = q6Var;
        this.f15207d = 0L;
        this.f15208e = user.f25439id;
        this.f15206c = null;
        if (z) {
            this.f15204a |= 4;
        }
        m27057H(user, str);
    }

    public C4601c3(C10930q6 q6Var, TdApi.ChatList chatList, TdApi.Chat chat, String str) {
        this.f15205b = q6Var;
        this.f15206c = chatList;
        this.f15207d = chat.f25367id;
        m27027y(chat, str, false);
    }
}
