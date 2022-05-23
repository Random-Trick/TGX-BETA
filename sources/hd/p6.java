package hd;

import android.view.View;
import gd.l;
import gd.w;
import hd.b;
import ib.i;
import je.g;
import je.v0;
import ld.h;
import ld.v;
import ob.d;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.hj;

public class p6 extends m6 implements Client.g, Runnable {
    public final String M;
    public final long N;
    public String O;
    public TdApi.ChatPhotoInfo P;
    public final long f13348c;

    public p6(s4 s4Var, TdApi.MessageForwardOriginChannel messageForwardOriginChannel) {
        super(s4Var);
        this.f13348c = messageForwardOriginChannel.chatId;
        this.M = messageForwardOriginChannel.authorSignature;
        this.N = messageForwardOriginChannel.messageId;
    }

    public void j() {
        this.f13273a.B8();
        this.f13273a.q8();
    }

    public void k() {
        this.f13273a.B8();
        this.f13273a.q8();
    }

    @Override
    public void a() {
    }

    @Override
    public String b() {
        String str = this.O;
        return str == null ? w.i1(R.string.LoadingChannel) : str;
    }

    @Override
    public h c() {
        TdApi.ChatPhotoInfo chatPhotoInfo = this.P;
        if (chatPhotoInfo != null) {
            return t2.E0(this.f13273a.O0, chatPhotoInfo);
        }
        return null;
    }

    @Override
    public b.a d() {
        return this.f13273a.c().F3(this.f13348c, false);
    }

    @Override
    public void f() {
        if (this.f13348c != 0) {
            TdApi.Chat W2 = this.f13273a.c().W2(this.f13348c);
            if (W2 != null) {
                l(W2);
            } else {
                this.f13273a.c().v4().o(new TdApi.GetChat(this.f13348c), this);
            }
        }
    }

    @Override
    public boolean g(View view, g gVar, v0 v0Var, hj.q qVar, v vVar) {
        if (this.f13348c == 0) {
            return false;
        }
        if (this.N != 0) {
            this.f13273a.c().hd().r7(this.f13273a.Q0(), this.f13348c, new d(this.f13348c, this.N), qVar);
            return true;
        }
        this.f13273a.c().hd().h7(this.f13273a.Q0(), this.f13348c, qVar != null ? new hj.j().s(qVar) : null);
        return true;
    }

    public final void l(TdApi.Chat chat) {
        if (i.i(this.M) || this.f13273a.x1()) {
            this.O = chat.title;
        } else {
            this.O = w.j1(R.string.format_channelAndSignature, chat.title, this.M);
        }
        this.P = chat.photo;
        this.f13274b = true;
    }

    @Override
    public void r2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.O = w.i1(R.string.ChannelPrivate);
            this.f13274b = true;
            this.P = null;
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    p6.this.k();
                }
            });
        } else if (constructor != -1601123095) {
            Log.unexpectedTdlibResponse(object, TdApi.GetChat.class, TdApi.Chat.class);
        } else {
            l(this.f13273a.c().W2(((TdApi.Chat) object).f19908id));
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    p6.this.j();
                }
            });
        }
    }

    @Override
    public void run() {
        this.f13273a.B8();
        this.f13273a.q8();
    }

    public p6(s4 s4Var, TdApi.MessageForwardOriginChat messageForwardOriginChat) {
        super(s4Var);
        this.f13348c = messageForwardOriginChat.senderChatId;
        this.M = messageForwardOriginChat.authorSignature;
        this.N = 0L;
    }
}
