package gd;

import android.view.View;
import gd.C4587b;
import ie.C5455v0;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p193nb.C7319d;
import p350yd.HandlerC10770jj;

public class RunnableC4736p6 extends AbstractC4705m6 implements Client.AbstractC7865g, Runnable {
    public final String f15930M;
    public final long f15931N;
    public String f15932O;
    public TdApi.ChatPhotoInfo f15933P;
    public final long f15934c;

    public RunnableC4736p6(AbstractC4761s4 s4Var, TdApi.MessageForwardOriginChannel messageForwardOriginChannel) {
        super(s4Var);
        this.f15934c = messageForwardOriginChannel.chatId;
        this.f15930M = messageForwardOriginChannel.authorSignature;
        this.f15931N = messageForwardOriginChannel.messageId;
    }

    public void m26304j() {
        this.f15807a.m26234B8();
        this.f15807a.m25829q8();
    }

    public void m26303k() {
        this.f15807a.m26234B8();
        this.f15807a.m25829q8();
    }

    @Override
    public void mo25217a() {
    }

    @Override
    public String mo25216b() {
        String str = this.f15932O;
        return str == null ? C4403w.m27871i1(R.string.LoadingChannel) : str;
    }

    @Override
    public C6246h mo25215c() {
        TdApi.ChatPhotoInfo chatPhotoInfo = this.f15933P;
        if (chatPhotoInfo != null) {
            return C4779t2.m25703E0(this.f15807a.f16099O0, chatPhotoInfo);
        }
        return null;
    }

    @Override
    public C4587b.C4588a mo25214d() {
        return this.f15807a.mo4348c().m2915C3(this.f15934c, false);
    }

    @Override
    public void mo25213f() {
        if (this.f15934c != 0) {
            TdApi.Chat U2 = this.f15807a.mo4348c().m2632U2(this.f15934c);
            if (U2 != null) {
                m26302l(U2);
            } else {
                this.f15807a.mo4348c().m2270r4().m14783o(new TdApi.GetChat(this.f15934c), this);
            }
        }
    }

    @Override
    public boolean mo25212g(View view, RunnableC5390g gVar, C5455v0 v0Var, HandlerC10770jj.C10788q qVar, AbstractC6264v vVar) {
        if (this.f15934c == 0) {
            return false;
        }
        if (this.f15931N != 0) {
            this.f15807a.mo4348c().m2485dd().m3469r7(this.f15807a.m26097P0(), this.f15934c, new C7319d(this.f15934c, this.f15931N), qVar);
            return true;
        }
        this.f15807a.mo4348c().m2485dd().m3569h7(this.f15807a.m26097P0(), this.f15934c, qVar != null ? new HandlerC10770jj.C10780j().m3357s(qVar) : null);
        return true;
    }

    public final void m26302l(TdApi.Chat chat) {
        if (C5070i.m24062i(this.f15930M) || this.f15807a.m26251A1()) {
            this.f15932O = chat.title;
        } else {
            this.f15932O = C4403w.m27867j1(R.string.format_channelAndSignature, chat.title, this.f15930M);
        }
        this.f15933P = chat.photo;
        this.f15808b = true;
    }

    @Override
    public void run() {
        this.f15807a.m26234B8();
        this.f15807a.m25829q8();
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            this.f15932O = C4403w.m27871i1(R.string.ChannelPrivate);
            this.f15808b = true;
            this.f15933P = null;
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    RunnableC4736p6.this.m26303k();
                }
            });
        } else if (constructor != -1601123095) {
            Log.unexpectedTdlibResponse(object, TdApi.GetChat.class, TdApi.Chat.class);
        } else {
            m26302l(this.f15807a.mo4348c().m2632U2(((TdApi.Chat) object).f25370id));
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    RunnableC4736p6.this.m26304j();
                }
            });
        }
    }

    public RunnableC4736p6(AbstractC4761s4 s4Var, TdApi.MessageForwardOriginChat messageForwardOriginChat) {
        super(s4Var);
        this.f15934c = messageForwardOriginChat.senderChatId;
        this.f15930M = messageForwardOriginChat.authorSignature;
        this.f15931N = 0L;
    }
}
