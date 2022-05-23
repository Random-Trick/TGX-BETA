package hd;

import android.text.SpannableStringBuilder;
import ce.c0;
import gd.w;
import hd.b;
import ib.c;
import ib.i;
import ld.h;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import wc.a;
import zd.o6;

public class c3 {
    public int f12830a;
    public final o6 f12831b;
    public final TdApi.ChatList f12832c;
    public final long f12833d;
    public long f12834e;
    public TdApi.Chat f12835f;
    public CharSequence f12836g;
    public String f12837h;
    public String f12838i;
    public h f12839j;
    public b.a f12840k;
    public boolean f12841l;
    public TdApi.Chat f12842m;
    public String f12843n;
    public boolean f12844o;
    public boolean f12845p;
    public boolean f12846q;
    public CharSequence f12847r;
    public long f12848s;
    public p7 f12849t;

    public c3(o6 o6Var, TdApi.ChatList chatList, long j10, boolean z10) {
        this.f12831b = o6Var;
        this.f12832c = chatList;
        this.f12833d = j10;
        y(o6Var.P3(j10), null, z10);
    }

    public c3 A() {
        this.f12830a |= 16;
        return this;
    }

    public c3 B(String str) {
        this.f12838i = str;
        return this;
    }

    public void C() {
        this.f12841l = true;
    }

    public c3 D() {
        this.f12830a |= 2;
        return this;
    }

    public void E(TdApi.File file) {
        if (file != null) {
            h hVar = new h(this.f12831b, file);
            this.f12839j = hVar;
            hVar.t0(a.getDefaultAvatarCacheSize());
            return;
        }
        this.f12839j = null;
    }

    public final void F(String str, TdApi.Chat chat) {
        TdApi.User f42;
        b.a aVar = null;
        if (this.f12844o || i.i(this.f12843n) || i.c(this.f12836g, str)) {
            this.f12836g = str;
            this.f12835f = (this.f12830a & 4) == 0 ? chat : null;
        } else {
            this.f12836g = c0.I(str, this.f12843n, 0, t.f13524g0);
            this.f12835f = null;
        }
        if ((this.f12830a & 4) != 0) {
            aVar = this.f12831b.e2().S1();
        } else if (chat != null) {
            aVar = this.f12831b.G3(chat, true);
        }
        this.f12840k = aVar;
        if ((this.f12830a & 4) != 0) {
            this.f12837h = w.i1(R.string.Saved);
        } else if (chat != null && (f42 = this.f12831b.f4(chat)) != null && f42.type.getConstructor() == -598644325) {
            this.f12837h = f42.firstName;
        }
    }

    public void G() {
        this.f12830a |= 8;
        M(this.f12842m);
    }

    public final void H(TdApi.User user, String str) {
        if ((this.f12830a & 4) != 0) {
            this.f12840k = this.f12831b.e2().S1();
            this.f12836g = c0.I(w.i1(R.string.SavedMessages), str, 0, t.f13524g0);
        } else {
            this.f12840k = this.f12831b.e2().O2(user, true);
            this.f12836g = c0.I(t2.r2(user), str, 0, t.f13524g0);
        }
        TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
        E(profilePhoto != null ? profilePhoto.small : null);
    }

    public void I() {
        long j10 = this.f12833d;
        if (j10 != 0) {
            TdApi.Chat W2 = this.f12831b.W2(j10);
            if (W2 != null) {
                J(W2);
                return;
            }
            return;
        }
        TdApi.User u22 = this.f12831b.e2().u2(this.f12834e);
        if (u22 != null) {
            L(u22);
        }
    }

    public final void J(TdApi.Chat chat) {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        M(chat);
        boolean z10 = (this.f12830a & 4) != 0;
        F(this.f12831b.W3(chat), chat);
        this.f12845p = this.f12831b.v3(this.f12833d);
        this.f12846q = this.f12831b.x3(this.f12833d);
        this.f12840k = z10 ? this.f12831b.e2().S1() : this.f12831b.G3(chat, true);
        E((z10 || (chatPhotoInfo = chat.photo) == null) ? null : chatPhotoInfo.small);
    }

    public void K() {
        this.f12845p = this.f12831b.v3(this.f12833d);
        this.f12846q = this.f12831b.x3(this.f12833d);
    }

    public final void L(TdApi.User user) {
        if (!u()) {
            this.f12840k = this.f12831b.e2().O2(user, true);
            this.f12836g = c0.I(t2.r2(user), this.f12843n, 0, t.f13524g0);
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            E(profilePhoto != null ? profilePhoto.small : null);
        }
    }

    public final void M(TdApi.Chat chat) {
        TdApi.Supergroup g22;
        if (this.f12844o) {
            String j42 = this.f12831b.j4(chat.f19908id);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            if (!i.i(j42)) {
                if ((this.f12830a & 8) != 0) {
                    sb2.append('/');
                } else {
                    sb2.append('@');
                }
                sb2.append(j42);
            }
            if (chat.type.getConstructor() == -1472570774) {
                long p10 = ob.a.p(chat.f19908id);
                TdApi.SupergroupFullInfo h22 = this.f12831b.e2().h2(p10);
                int i10 = h22 != null ? h22.memberCount : 0;
                if (i10 == 0 && (g22 = this.f12831b.e2().g2(p10)) != null) {
                    i10 = g22.memberCount;
                }
                if (i10 != 0) {
                    sb3.append(w.o2(t2.N2(chat.type) ? R.string.xSubscribers : R.string.xMembers, i10));
                }
            }
            spannableStringBuilder.append(c0.I(sb2.toString(), this.f12843n, 1, null));
            if (sb3.length() > 0) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) sb3.toString());
            }
            if (spannableStringBuilder.length() == 0) {
                spannableStringBuilder.append(this.f12831b.Bc().m(this.f12833d));
            }
            this.f12847r = spannableStringBuilder;
        }
    }

    public long a() {
        long j10 = this.f12833d;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.f12848s;
        return j11 != 0 ? j11 : ob.a.c(this.f12834e);
    }

    public h b() {
        return this.f12839j;
    }

    public b.a c() {
        return this.f12840k;
    }

    public TdApi.Chat d() {
        return this.f12842m;
    }

    public long e() {
        return this.f12833d;
    }

    public long f() {
        long j10 = this.f12833d;
        return j10 != 0 ? j10 : ob.a.c(this.f12834e);
    }

    public String g() {
        return this.f12838i;
    }

    public String h() {
        return (this.f12830a & 4) != 0 ? w.i1(R.string.SavedMessages) : this.f12836g.toString();
    }

    public long i() {
        return this.f12833d;
    }

    public TdApi.ChatList j() {
        return this.f12832c;
    }

    public p7 k() {
        return this.f12849t;
    }

    public TdApi.MessageSender l() {
        long j10 = this.f12834e;
        if (j10 != 0) {
            return new TdApi.MessageSenderUser(j10);
        }
        long j11 = this.f12833d;
        if (j11 == 0) {
            throw new IllegalStateException();
        } else if (ob.a.l(j11)) {
            return new TdApi.MessageSenderUser(this.f12831b.h4(this.f12833d));
        } else {
            return new TdApi.MessageSenderChat(this.f12833d);
        }
    }

    public CharSequence m() {
        return i.i(this.f12837h) ? this.f12836g : this.f12837h;
    }

    public CharSequence n() {
        TdApi.Chat chat = this.f12835f;
        return chat != null ? this.f12831b.W3(chat) : this.f12836g;
    }

    public int o() {
        TdApi.Chat chat;
        if ((this.f12830a & 2) != 0 || (chat = this.f12842m) == null) {
            return 0;
        }
        int i10 = chat.unreadCount;
        if (i10 > 0) {
            return i10;
        }
        if (chat.isMarkedAsUnread) {
            return o6.A2;
        }
        return 0;
    }

    public long p() {
        return this.f12834e;
    }

    public CharSequence q() {
        return this.f12847r;
    }

    public boolean r() {
        return !i.i(this.f12843n);
    }

    public boolean s() {
        return this.f12844o;
    }

    public boolean t() {
        return (this.f12830a & 1) != 0;
    }

    public boolean u() {
        return (this.f12830a & 4) != 0;
    }

    public boolean v() {
        return c.b(this.f12830a, 16);
    }

    public boolean w() {
        return this.f12841l;
    }

    public boolean x() {
        return this.f12846q;
    }

    public final void y(TdApi.Chat chat, String str, boolean z10) {
        this.f12842m = chat;
        this.f12844o = z10;
        this.f12843n = str;
        int h10 = c.h(c.h(this.f12830a, 1, ob.a.j(chat.f19908id)), 4, this.f12831b.k7(chat.f19908id));
        this.f12830a = h10;
        this.f12834e = t2.o2(chat.type);
        this.f12840k = (h10 & 4) != 0 ? this.f12831b.e2().S1() : this.f12831b.G3(chat, true);
        J(chat);
    }

    public void z(long j10) {
        this.f12848s = j10;
    }

    public c3(o6 o6Var, TdApi.ChatList chatList, TdApi.Chat chat, boolean z10, String str) {
        this.f12831b = o6Var;
        this.f12832c = chatList;
        this.f12833d = chat.f19908id;
        y(chat, str, z10);
    }

    public c3(o6 o6Var, long j10) {
        this(o6Var, o6Var.e2().u2(j10), (String) null, false);
    }

    public c3(o6 o6Var, TdApi.User user, String str, boolean z10) {
        this.f12831b = o6Var;
        this.f12833d = 0L;
        this.f12834e = user.f19979id;
        this.f12832c = null;
        if (z10) {
            this.f12830a |= 4;
        }
        H(user, str);
    }

    public c3(o6 o6Var, TdApi.ChatList chatList, TdApi.Chat chat, String str) {
        this.f12831b = o6Var;
        this.f12832c = chatList;
        this.f12833d = chat.f19908id;
        y(chat, str, false);
    }
}
