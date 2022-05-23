package kd;

import ce.j0;
import de.rh;
import hd.o;
import hd.r;
import hd.t2;
import hd.t4;
import ib.i;
import java.util.ArrayList;
import java.util.Iterator;
import je.g;
import kd.u;
import ob.a;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import vc.v2;
import zd.t7;

public class f implements Client.g, Runnable, u.j, t7.i, t7.b, t7.h {
    public int M;
    public t4 N;
    public long O;
    public ArrayList<o<?>> P;
    public String Q;
    public u.l R;
    public boolean S;
    public String T;
    public String U;
    public ArrayList<o<?>> V;
    public boolean W;
    public long X;
    public TdApi.Message Y;
    public int Z;
    public int f15780a;
    public final rh f15781b;
    public long f15782c;

    public f(rh rhVar, TdApi.Chat chat) {
        this.f15781b = rhVar;
        if (chat != null) {
            this.f15782c = chat.f19908id;
            int constructor = chat.type.getConstructor();
            if (constructor == -1472570774) {
                this.M = 2;
                this.O = a.p(chat.f19908id);
            } else if (constructor == 973884508) {
                this.M = 1;
                this.O = a.m(chat.f19908id);
            } else if (constructor == 1579049844) {
                this.M = 0;
                this.O = t2.n2(chat);
            }
            q();
            r(chat.replyMarkupMessageId);
            return;
        }
        r(0L);
    }

    public void l(TdApi.BasicGroup basicGroup) {
        C(!t2.h3(basicGroup.status));
    }

    public void m(TdApi.Message message) {
        x(message, true);
    }

    public void n(TdApi.Supergroup supergroup) {
        C(!t2.h3(supergroup.status));
    }

    public void o() {
        String str;
        u.l lVar = this.R;
        if (lVar != null && (str = this.Q) != null && !this.S) {
            lVar.a(str);
            this.Q = null;
            this.R = null;
        }
    }

    public void p() {
        x(null, true);
    }

    public final void A(TdApi.UserFullInfo userFullInfo) {
        TdApi.BotInfo botInfo;
        if (userFullInfo != null && (botInfo = userFullInfo.botInfo) != null) {
            if (!i.i(botInfo.description) && !this.f15781b.ui()) {
                v2 nk = this.f15781b.nk();
                long j10 = this.f15782c;
                String str = userFullInfo.botInfo.description;
                this.N = new t4(nk, j10, new TdApi.FormattedText(str, g.G(str, 15)));
            }
            if (userFullInfo.botInfo.commands.length > 0) {
                ArrayList<o<?>> arrayList = new ArrayList<>(userFullInfo.botInfo.commands.length);
                for (TdApi.BotCommand botCommand : userFullInfo.botInfo.commands) {
                    arrayList.add(new r(this.f15781b.t(), this.f15781b.c(), this.O, botCommand));
                }
                this.P = arrayList;
                this.f15781b.c().id(this);
            } else if (this.N != null) {
                this.f15781b.c().id(this);
            }
        }
    }

    public final void B() {
        this.U = null;
        this.T = null;
        this.V = null;
    }

    public final void C(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            x(z10 ? null : this.Y, false);
        }
    }

    public final boolean D(long j10) {
        TdApi.ChatMemberStatus O3 = this.f15781b.c().O3(j10);
        return O3 != null && !t2.h3(O3);
    }

    public void E(long j10, long j11) {
        if (j11 == 0) {
            this.f15781b.c().id(new Runnable() {
                @Override
                public final void run() {
                    f.this.p();
                }
            });
        } else {
            this.f15781b.c().v4().o(new TdApi.GetMessage(j10, j11), this);
        }
    }

    @Override
    public void K2(final TdApi.BasicGroup basicGroup, boolean z10) {
        this.f15781b.c().id(new Runnable() {
            @Override
            public final void run() {
                f.this.l(basicGroup);
            }
        });
    }

    @Override
    public void M1(TdApi.User user) {
    }

    @Override
    public void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        v(basicGroupFullInfo);
    }

    @Override
    public ArrayList<o<?>> a(String str, String str2, u.l lVar) {
        ArrayList<o<?>> arrayList = null;
        if ((this.f15780a & 2) == 0) {
            this.Q = str2;
            this.R = lVar;
            this.S = true;
            return null;
        }
        ArrayList<o<?>> arrayList2 = this.P;
        String str3 = this.T;
        if (!(str3 == null || this.U == null || !str.startsWith(str3))) {
            arrayList2 = this.V;
        }
        if (arrayList2 != null) {
            Iterator<o<?>> it = arrayList2.iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                if (rVar.d0(str)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>(arrayList2.size());
                    }
                    arrayList.add(rVar);
                }
            }
        }
        this.U = str2;
        this.T = str;
        this.V = arrayList;
        return arrayList;
    }

    @Override
    public void f0(long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        z(supergroupFullInfo);
    }

    public void g() {
        this.f15780a |= 1;
        int i10 = this.M;
        if (i10 == 0) {
            this.f15781b.c().e2().N1(this.O, this);
        } else if (i10 == 1) {
            this.f15781b.c().e2().n2(this.O, this);
        } else if (i10 == 2) {
            this.f15781b.c().e2().p2(this.O, this);
        }
    }

    public o<?> h(String str) {
        ArrayList<o<?>> arrayList = this.P;
        if (arrayList == null) {
            return null;
        }
        Iterator<o<?>> it = arrayList.iterator();
        while (it.hasNext()) {
            o<?> next = it.next();
            if ((next instanceof r) && str.equals(((r) next).a0())) {
                return next;
            }
        }
        return null;
    }

    public o<?> i() {
        return h("/help");
    }

    public o<?> j() {
        return h("/settings");
    }

    public boolean k() {
        ArrayList<o<?>> arrayList = this.P;
        return arrayList != null && !arrayList.isEmpty();
    }

    public final void q() {
        int i10 = this.M;
        if (i10 == 0) {
            this.f15781b.c().e2().L(this.O, this);
            A(this.f15781b.c().e2().D2(this.O));
        } else if (i10 == 1) {
            this.f15781b.c().e2().Z1(this.O, this);
            v(this.f15781b.c().e2().O(this.O));
        } else if (i10 == 2) {
            this.f15781b.c().e2().b2(this.O, this);
            z(this.f15781b.c().e2().h2(this.O));
        }
    }

    public final void r(long j10) {
        if (this.X == 0 && j10 != 0) {
            this.f15781b.c().v4().o(new TdApi.GetMessage(this.f15782c, j10), this);
        }
    }

    @Override
    public void r2(TdApi.Object object) {
        if ((this.f15780a & 1) == 0) {
            int constructor = object.getConstructor();
            if (constructor != -1679978726) {
                if (constructor == 1435961258) {
                    final TdApi.Message message = (TdApi.Message) object;
                    this.f15781b.c().id(new Runnable() {
                        @Override
                        public final void run() {
                            f.this.m(message);
                        }
                    });
                }
            } else if (this.M != 2) {
                j0.t0(object);
            } else {
                Log.w("Cannot get bots for supergroup: %s", t2.z5(object));
            }
        }
    }

    @Override
    public void run() {
        int i10 = this.f15780a;
        if ((i10 & 1) == 0) {
            this.f15780a = i10 | 2;
            if (!(this.Q == null || this.R == null || !this.S)) {
                B();
                this.R.a(this.Q);
                this.Q = null;
                this.R = null;
            }
            rh rhVar = this.f15781b;
            if (rhVar != null) {
                if (this.N != null) {
                    rhVar.nk().R2(this.N);
                } else {
                    rhVar.nk().g0();
                }
                this.f15781b.vr((this.Z > 0 || this.M == 0) && k());
            }
        }
    }

    public void s(long j10) {
        if (this.X == j10) {
            this.f15781b.c().v4().o(new TdApi.DeleteChatReplyMarkup(this.f15782c, j10), this);
        }
    }

    @Override
    public void s0(final TdApi.Supergroup supergroup) {
        this.f15781b.c().id(new Runnable() {
            @Override
            public final void run() {
                f.this.n(supergroup);
            }
        });
    }

    public final void t(TdApi.BotCommands[] botCommandsArr) {
        TdApi.User u22;
        ArrayList<o<?>> arrayList = new ArrayList<>();
        int i10 = 0;
        for (TdApi.BotCommands botCommands : botCommandsArr) {
            if (!(botCommands.commands.length == 0 || (u22 = this.f15781b.c().e2().u2(botCommands.botUserId)) == null)) {
                i10++;
                for (TdApi.BotCommand botCommand : botCommands.commands) {
                    arrayList.add(new r(this.f15781b.t(), this.f15781b.c(), u22, botCommand));
                }
            }
        }
        int i11 = this.Z;
        this.Z = i10;
        this.P = arrayList;
        if (i10 > 0 || i11 > 0) {
            this.f15781b.c().id(this);
        }
        this.f15781b.c().id(new Runnable() {
            @Override
            public final void run() {
                f.this.o();
            }
        });
    }

    public final void u(TdApi.Message message, boolean z10) {
        if (z10) {
            this.f15781b.Vq();
            this.f15781b.cr(message, false, false);
        } else if (this.M == 0) {
            this.f15781b.cr(message, false, false);
        }
        if (message != null) {
            this.f15781b.c().v4().o(new TdApi.DeleteChatReplyMarkup(this.f15782c, message.f19946id), this);
        }
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        A(userFullInfo);
    }

    public final void v(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (basicGroupFullInfo != null) {
            t(basicGroupFullInfo.botCommands);
        }
    }

    public final void w(long j10, boolean z10) {
        this.f15781b.Lk(z10);
        if (j10 != 0) {
            this.f15781b.c().v4().o(new TdApi.DeleteChatReplyMarkup(this.f15782c, j10), this);
        }
    }

    public final void x(TdApi.Message message, boolean z10) {
        TdApi.ReplyMarkup replyMarkup = null;
        if (z10) {
            this.Y = message;
            if (this.W || (message != null && D(message.chatId))) {
                this.W = true;
                message = null;
            }
        }
        if (message != null) {
            replyMarkup = message.replyMarkup;
        }
        long j10 = message == null ? 0L : message.f19946id;
        if ((this.f15780a & 1) == 0) {
            if (j10 > this.X) {
                this.X = j10;
            } else if (j10 != 0) {
                return;
            }
            if (j10 == 0 || replyMarkup == null) {
                this.f15781b.f1();
                return;
            }
            int constructor = replyMarkup.getConstructor();
            if (constructor == -691252879) {
                w(j10, ((TdApi.ReplyMarkupRemoveKeyboard) replyMarkup).isPersonal);
            } else if (constructor == -64985802) {
                y(j10, (TdApi.ReplyMarkupShowKeyboard) replyMarkup);
                int i10 = this.M;
                if (i10 == 1 || i10 == 2) {
                    this.f15781b.cr(message, false, false);
                }
            } else if (constructor == 1101461919) {
                u(message, ((TdApi.ReplyMarkupForceReply) replyMarkup).isPersonal);
            }
        }
    }

    public final void y(long j10, TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard) {
        this.f15781b.Wq(j10, replyMarkupShowKeyboard);
    }

    public final void z(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (supergroupFullInfo != null) {
            t(supergroupFullInfo.botCommands);
        }
    }
}
