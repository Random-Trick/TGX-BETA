package gd;

import android.graphics.Canvas;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1363c0;
import ge.C4868i;
import ie.AbstractC5408k;
import ie.AbstractC5411l0;
import ie.C5428t;
import ie.C5459x0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p194nd.C7462l1;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;

public class C4656h6 extends AbstractC4761s4 {
    public TdApi.FormattedText f15532U2;
    public C5459x0 f15533V2;
    public C4666i7 f15534W2;
    public TdApi.MessageText f15535X2;
    public TdApi.MessageText f15536Y2;
    public TdApi.SponsoredMessage f15537Z2;

    public C4656h6(C9678w2 w2Var, TdApi.Message message, TdApi.MessageText messageText, TdApi.MessageText messageText2) {
        super(w2Var, message);
        this.f15535X2 = messageText;
        this.f15536Y2 = messageText2;
        if (messageText2 != null) {
            m26613qa(messageText2.text, false);
            m26612ra(this.f15536Y2.webPage);
            return;
        }
        m26613qa(messageText.text, false);
        m26612ra(messageText.webPage);
    }

    public void m26615oa(TdApi.MessageLinkInfo messageLinkInfo) {
        this.f16099O0.m2485dd().m3449t7(this, messageLinkInfo, null);
    }

    public void m26614pa(TdApi.Object object) {
        if (object.getConstructor() == -981646294) {
            final TdApi.MessageLinkInfo messageLinkInfo = (TdApi.MessageLinkInfo) object;
            this.f16099O0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C4656h6.this.m26615oa(messageLinkInfo);
                }
            });
        }
    }

    @Override
    public void mo26160I8(RunnableC6507m mVar) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26558f0(mVar, m25959d3(), m26616na());
        } else {
            mVar.m20231r(null);
        }
    }

    @Override
    public boolean mo26153J5() {
        return this.f15536Y2 != null;
    }

    @Override
    public void mo26150J8(C6257p pVar) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26559e0(pVar, m25959d3(), m26616na());
        } else {
            pVar.m20819G(null);
        }
    }

    @Override
    public boolean mo25333L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        TdApi.WebPage webPage = this.f16122a.content.getConstructor() == 1989037971 ? ((TdApi.MessageText) this.f16122a.content).webPage : null;
        this.f16122a.content = messageContent;
        TdApi.MessageText messageText = messageContent.getConstructor() == 908195298 ? new TdApi.MessageText(C7321e.m16899w1(messageContent), null) : (TdApi.MessageText) messageContent;
        this.f15535X2 = messageText;
        if (mo26153J5()) {
            return true;
        }
        m26613qa(messageText.text, false);
        m26612ra(messageText.webPage);
        m25740z8();
        if (C7321e.m16921p0(webPage, messageText.webPage)) {
            return true;
        }
        mo13519a();
        m26183G5();
        return true;
    }

    @Override
    public void mo26121M8(C6240c cVar) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26556g0(cVar, m25959d3(), m26616na());
        } else {
            cVar.clear();
        }
    }

    @Override
    public int mo26074R3(boolean z) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            return i7Var.m26592A(z);
        }
        return 0;
    }

    @Override
    public void mo26070R7(C9552h1 h1Var, boolean z) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26565a0();
        }
    }

    @Override
    public int mo25323U1() {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            return i7Var.m26588E();
        }
        if (C4403w.m27984G2() == this.f15533V2.m22623o()) {
            return this.f15533V2.m22622p();
        }
        return -1;
    }

    @Override
    public void mo25321V7() {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26534v();
        }
    }

    @Override
    public C7462l1 mo26022W3(long j, View view, int i, int i2, int i3) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var == null || i7Var.m26586G() == null) {
            return null;
        }
        C7462l1 I = this.f15534W2.m26586G().m26775I(view, i, i2, i3);
        if (I != null) {
            I.m15987m((!m26068R9() || !m25928g6()) ? R.id.theme_color_filling : R.id.theme_color_bubbleOut_background);
        }
        return I;
    }

    @Override
    public boolean mo25319W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
        if (C7321e.m16995M(C7321e.m16899w1(messageContent), C7321e.m16899w1(messageContent2))) {
            TdApi.WebPage webPage = null;
            TdApi.WebPage webPage2 = messageContent.getConstructor() == 1989037971 ? ((TdApi.MessageText) messageContent).webPage : null;
            if (messageContent2.getConstructor() == 1989037971) {
                webPage = ((TdApi.MessageText) messageContent2).webPage;
            }
            if (C7321e.m16921p0(webPage2, webPage)) {
                return false;
            }
        }
        mo25333L9(this.f16122a, messageContent2, z);
        return true;
    }

    @Override
    public int mo25222X2() {
        int i = 0;
        if (!C7321e.m16965a1(this.f15532U2)) {
            i = 0 + this.f15533V2.getHeight() + m26114N4();
        }
        if (this.f15534W2 == null) {
            return i;
        }
        if (i > 0) {
            i += C1357a0.m37541i(8.0f);
        }
        return i + this.f15534W2.m26530z();
    }

    @Override
    public void mo26007Y(TdApi.ChatType chatType) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26541o(chatType);
        }
    }

    @Override
    public void mo25990Z7(long j, long j2, boolean z) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26542n0(j, j2, z);
        }
    }

    @Override
    public void mo25221a0(int i) {
        this.f15533V2.m22642B(i);
        int G4 = m26184G4();
        TdApi.MessageText messageText = this.f15536Y2;
        if (messageText != null) {
            if (m26612ra(messageText.webPage)) {
                this.f15534W2.m26538r(G4);
            }
        } else if (this.f16122a.content.getConstructor() != 1989037971 || !m26612ra(((TdApi.MessageText) this.f16122a.content).webPage)) {
            C4666i7 i7Var = this.f15534W2;
            if (i7Var != null && i7Var.m26587F() != G4) {
                this.f15534W2.m26538r(G4);
            }
        } else {
            this.f15534W2.m26538r(G4);
        }
    }

    @Override
    public int mo25980a8(long j, long j2, int i) {
        if (this.f15535X2 != null) {
            TdApi.MessageContent M5 = this.f16099O0.m2753M5(j, j2);
            if (M5 != null && M5.getConstructor() == 908195298 && C4868i.m24726c2().m24663k1(16L)) {
                M5 = new TdApi.MessageText(C7321e.m16899w1(M5), null);
            }
            if (this.f15536Y2 != M5) {
                if (M5 != null && M5.getConstructor() != 1989037971) {
                    return 3;
                }
                TdApi.MessageText messageText = (TdApi.MessageText) M5;
                this.f15536Y2 = messageText;
                if (messageText != null) {
                    m26613qa(messageText.text, false);
                    m26612ra(messageText.webPage);
                } else {
                    m26613qa(this.f15535X2.text, false);
                    m26612ra(this.f15535X2.webPage);
                }
                m25740z8();
                return mo25354J3() == i ? 1 : 2;
            }
        }
        return 0;
    }

    @Override
    public void mo25220b1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        mo25961d1(h1Var, canvas, i, i2, i3, null, null);
    }

    @Override
    public int mo25219b2() {
        return AbstractC4761s4.f16062g2 + AbstractC4761s4.f16063h2;
    }

    @Override
    public int mo25218c3() {
        return this.f15534W2 != null ? Math.max(this.f15533V2.getWidth(), this.f15534W2.m26582K()) : this.f15533V2.getWidth();
    }

    @Override
    public void mo25961d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        this.f15533V2.m22630h(canvas, i, m26619ka(i, i3), 0, i2 + m26114N4(), null, 1.0f);
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null && vVar2 != null) {
            i7Var.m26533w(h1Var, canvas, C4403w.m27984G2() ? (i + i3) - this.f15534W2.m26582K() : i, m26616na(), vVar, vVar2, 1.0f);
        }
    }

    public void m26625ea() {
        if (mo25841p6()) {
            long ia = m26621ia();
            TdApi.InternalLinkType internalLinkType = this.f15537Z2.link;
            if (internalLinkType == null) {
                this.f16099O0.m2485dd().m3569h7(this, ia, new HandlerC10770jj.C10780j().m3368h());
                return;
            }
            int constructor = internalLinkType.getConstructor();
            if (constructor == -1206724291) {
                this.f16099O0.m2485dd().m3569h7(this, ia, new HandlerC10770jj.C10780j().m3358r(new C4822w2(ia, ((TdApi.InternalLinkTypeBotStart) this.f15537Z2.link).startParameter, false)).m3368h());
            } else if (constructor != 978541650) {
                this.f16099O0.m2485dd().m3569h7(this, ia, new HandlerC10770jj.C10780j().m3368h());
            } else {
                this.f16099O0.m2270r4().m14783o(new TdApi.GetMessageLinkInfo(((TdApi.InternalLinkTypeMessage) this.f15537Z2.link).url), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C4656h6.this.m26614pa(object);
                    }
                });
            }
        }
    }

    @Override
    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        C4666i7 i7Var;
        return super.mo25217f8(h1Var, motionEvent) || this.f15533V2.m22614x(h1Var, motionEvent) || ((i7Var = this.f15534W2) != null && i7Var.m26564b0(h1Var, motionEvent, m25959d3(), m26616na(), m26209E0()));
    }

    public String m26624fa(TdApi.WebPage webPage) {
        Uri l0;
        TdApi.TextEntity[] textEntityArr;
        String str;
        TdApi.TextEntity[] textEntityArr2 = this.f15532U2.entities;
        if (textEntityArr2 == null || textEntityArr2.length == 0 || (l0 = C1363c0.m37424l0(webPage.url)) == null) {
            return null;
        }
        Uri uri = null;
        int i = 0;
        for (TdApi.TextEntity textEntity : this.f15532U2.entities) {
            int constructor = textEntity.type.getConstructor();
            if (constructor == -1312762756) {
                str = C7321e.m16911s1(this.f15532U2.text, textEntity);
            } else if (constructor != 445719651) {
                continue;
            } else {
                str = ((TdApi.TextEntityTypeTextUrl) textEntity.type).url;
            }
            i++;
            uri = C1363c0.m37424l0(str);
            if (uri != null && uri.buildUpon().fragment(null).build().equals(l0)) {
                return uri.getEncodedFragment();
            }
        }
        if (i != 1 || uri == null) {
            return null;
        }
        return uri.getEncodedFragment();
    }

    public C4666i7 m26623ga() {
        return this.f15534W2;
    }

    @Override
    public boolean mo25919h5(String str) {
        TdApi.TextEntity[] textEntityArr;
        String str2;
        C4666i7 i7Var = this.f15534W2;
        if (i7Var == null || !i7Var.m26568Y()) {
            return false;
        }
        if (str.equals(this.f15534W2.m26583J().url)) {
            return true;
        }
        boolean z = false;
        for (TdApi.TextEntity textEntity : this.f15532U2.entities) {
            if (textEntity.type.getConstructor() == -1312762756) {
                String str3 = this.f15532U2.text;
                int i = textEntity.offset;
                str2 = str3.substring(i, textEntity.length + i);
            } else if (textEntity.type.getConstructor() == 445719651) {
                str2 = ((TdApi.TextEntityTypeTextUrl) textEntity.type).url;
            } else {
                continue;
            }
            if (!str.equals(str2)) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public int m26622ha() {
        TdApi.InternalLinkType internalLinkType;
        if (!mo25841p6() || (internalLinkType = this.f15537Z2.link) == null) {
            return R.string.OpenChannel;
        }
        int constructor = internalLinkType.getConstructor();
        return constructor != -1206724291 ? constructor != 978541650 ? R.string.OpenChannel : R.string.OpenMessage : R.string.OpenBot;
    }

    public long m26621ia() {
        if (mo25841p6()) {
            return this.f15537Z2.sponsorChatId;
        }
        return 0L;
    }

    public String m26620ja() {
        TdApi.InternalLinkType internalLinkType;
        if (!mo25841p6() || (internalLinkType = this.f15537Z2.link) == null) {
            C10930q6 q6Var = this.f16099O0;
            return q6Var.m2637Tc(q6Var.m2462f4(m26621ia()));
        }
        int constructor = internalLinkType.getConstructor();
        if (constructor == -1206724291) {
            TdApi.InternalLinkTypeBotStart internalLinkTypeBotStart = (TdApi.InternalLinkTypeBotStart) this.f15537Z2.link;
            return this.f16099O0.m2682Qc(internalLinkTypeBotStart.botUsername, internalLinkTypeBotStart.startParameter, false);
        } else if (constructor == 978541650) {
            return ((TdApi.InternalLinkTypeMessage) this.f15537Z2.link).url;
        } else {
            C10930q6 q6Var2 = this.f16099O0;
            return q6Var2.m2637Tc(q6Var2.m2462f4(m26621ia()));
        }
    }

    public final int m26619ka(int i, int i2) {
        return m26068R9() ? m26176H1() - mo25219b2() : i + i2;
    }

    public TdApi.File m26618la() {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            return i7Var.m26585H();
        }
        return null;
    }

    @Override
    public boolean mo25869m7() {
        C4666i7 i7Var = this.f15534W2;
        return i7Var != null && i7Var.m26570W();
    }

    @Override
    public boolean mo25295m8(View view, float f, float f2) {
        C4666i7 i7Var;
        return this.f15533V2.m22643A(view) || ((i7Var = this.f15534W2) != null && i7Var.m26560d0(view, this)) || super.mo25295m8(view, f, f2);
    }

    public TdApi.FormattedText m26617ma() {
        return this.f15532U2;
    }

    public final int m26616na() {
        if (C7321e.m16965a1(this.f15532U2)) {
            return m25949e3();
        }
        return m25949e3() + this.f15533V2.getHeight() + m26114N4() + C1357a0.m37541i(6.0f);
    }

    @Override
    public boolean mo25841p6() {
        return this.f15537Z2 != null;
    }

    @Override
    public boolean mo25829q7() {
        return this.f15534W2 != null;
    }

    public final boolean m26613qa(TdApi.FormattedText formattedText, boolean z) {
        TdApi.FormattedText formattedText2 = this.f15532U2;
        if (formattedText2 != null && C7321e.m16995M(formattedText2, formattedText)) {
            return false;
        }
        this.f15532U2 = formattedText;
        AbstractC5408k L4 = m26012X5() ? C5428t.AbstractC5441d.f17876G : m26134L4();
        if (formattedText.entities != null || !z) {
            this.f15533V2 = new C5459x0(formattedText.text, AbstractC4761s4.m26125M4(), L4, AbstractC5411l0.m22789F(this.f16099O0, formattedText, m25916h8())).m22640D(m26209E0());
        } else {
            this.f15533V2 = new C5459x0(this.f16099O0, formattedText.text, AbstractC4761s4.m26125M4(), L4, 0, m25916h8()).m22640D(m26209E0());
        }
        this.f15533V2.m22635a(Log.TAG_GIF_LOADER);
        if (m26068R9()) {
            this.f15533V2.m22635a(Log.TAG_YOUTUBE);
        }
        if (!m26068R9()) {
            this.f15533V2.m22635a(64);
        }
        this.f15533V2.m22636H(this.f16101P0);
        return true;
    }

    @Override
    public boolean mo25289r6(TdApi.Message message, TdApi.MessageContent messageContent) {
        if (messageContent.getConstructor() == 908195298) {
            return C4868i.m24726c2().m24663k1(16L);
        }
        return super.mo25289r6(message, messageContent);
    }

    public final boolean m26612ra(TdApi.WebPage webPage) {
        if (webPage != null) {
            TdApi.FormattedText formattedText = this.f15532U2;
            C4666i7 i7Var = new C4666i7(this, webPage, formattedText != null ? C7321e.m17000J0(formattedText, webPage.url, false) : webPage.url);
            this.f15534W2 = i7Var;
            i7Var.m26544m0(this.f16101P0);
            return true;
        }
        this.f15534W2 = null;
        return false;
    }

    @Override
    public TdApi.WebPage mo25816s1(String str) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var == null || !i7Var.m26578O(str)) {
            return null;
        }
        return this.f15534W2.m26583J();
    }

    @Override
    public int mo25743z3() {
        return C7321e.m16965a1(this.f15532U2) ? -C1357a0.m37541i(3.0f) : C1357a0.m37541i(7.0f);
    }

    public C4656h6(C9678w2 w2Var, TdApi.Message message, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        this.f15535X2 = new TdApi.MessageText(formattedText, null);
        m26613qa(formattedText, true);
    }

    public C4656h6(C9678w2 w2Var, TdApi.Message message, TdApi.SponsoredMessage sponsoredMessage) {
        super(w2Var, message);
        this.f15537Z2 = sponsoredMessage;
        TdApi.MessageText messageText = (TdApi.MessageText) sponsoredMessage.content;
        this.f15535X2 = messageText;
        m26613qa(messageText.text, true);
    }
}
