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
            m26614qa(messageText2.text, false);
            m26613ra(this.f15536Y2.webPage);
            return;
        }
        m26614qa(messageText.text, false);
        m26613ra(messageText.webPage);
    }

    public void m26616oa(TdApi.MessageLinkInfo messageLinkInfo) {
        this.f16099O0.m2485dd().m3449t7(this, messageLinkInfo, null);
    }

    public void m26615pa(TdApi.Object object) {
        if (object.getConstructor() == -981646294) {
            final TdApi.MessageLinkInfo messageLinkInfo = (TdApi.MessageLinkInfo) object;
            this.f16099O0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C4656h6.this.m26616oa(messageLinkInfo);
                }
            });
        }
    }

    @Override
    public void mo26161I8(RunnableC6507m mVar) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26559f0(mVar, m25960d3(), m26617na());
        } else {
            mVar.m20232r(null);
        }
    }

    @Override
    public boolean mo26154J5() {
        return this.f15536Y2 != null;
    }

    @Override
    public void mo26151J8(C6257p pVar) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26560e0(pVar, m25960d3(), m26617na());
        } else {
            pVar.m20820G(null);
        }
    }

    @Override
    public boolean mo25334L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        TdApi.WebPage webPage = this.f16122a.content.getConstructor() == 1989037971 ? ((TdApi.MessageText) this.f16122a.content).webPage : null;
        this.f16122a.content = messageContent;
        TdApi.MessageText messageText = messageContent.getConstructor() == 908195298 ? new TdApi.MessageText(C7321e.m16899w1(messageContent), null) : (TdApi.MessageText) messageContent;
        this.f15535X2 = messageText;
        if (mo26154J5()) {
            return true;
        }
        m26614qa(messageText.text, false);
        m26613ra(messageText.webPage);
        m25741z8();
        if (C7321e.m16921p0(webPage, messageText.webPage)) {
            return true;
        }
        mo13518a();
        m26184G5();
        return true;
    }

    @Override
    public void mo26122M8(C6240c cVar) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26557g0(cVar, m25960d3(), m26617na());
        } else {
            cVar.clear();
        }
    }

    @Override
    public int mo26075R3(boolean z) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            return i7Var.m26593A(z);
        }
        return 0;
    }

    @Override
    public void mo26071R7(C9552h1 h1Var, boolean z) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26566a0();
        }
    }

    @Override
    public int mo25324U1() {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            return i7Var.m26589E();
        }
        if (C4403w.m27986G2() == this.f15533V2.m22624o()) {
            return this.f15533V2.m22623p();
        }
        return -1;
    }

    @Override
    public void mo25322V7() {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26535v();
        }
    }

    @Override
    public C7462l1 mo26023W3(long j, View view, int i, int i2, int i3) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var == null || i7Var.m26587G() == null) {
            return null;
        }
        C7462l1 I = this.f15534W2.m26587G().m26777I(view, i, i2, i3);
        if (I != null) {
            I.m15987m((!m26069R9() || !m25929g6()) ? R.id.theme_color_filling : R.id.theme_color_bubbleOut_background);
        }
        return I;
    }

    @Override
    public boolean mo25320W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
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
        mo25334L9(this.f16122a, messageContent2, z);
        return true;
    }

    @Override
    public int mo25223X2() {
        int i = 0;
        if (!C7321e.m16965a1(this.f15532U2)) {
            i = 0 + this.f15533V2.getHeight() + m26115N4();
        }
        if (this.f15534W2 == null) {
            return i;
        }
        if (i > 0) {
            i += C1357a0.m37544i(8.0f);
        }
        return i + this.f15534W2.m26531z();
    }

    @Override
    public void mo26008Y(TdApi.ChatType chatType) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26542o(chatType);
        }
    }

    @Override
    public void mo25991Z7(long j, long j2, boolean z) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            i7Var.m26543n0(j, j2, z);
        }
    }

    @Override
    public void mo25222a0(int i) {
        this.f15533V2.m22643B(i);
        int G4 = m26185G4();
        TdApi.MessageText messageText = this.f15536Y2;
        if (messageText != null) {
            if (m26613ra(messageText.webPage)) {
                this.f15534W2.m26539r(G4);
            }
        } else if (this.f16122a.content.getConstructor() != 1989037971 || !m26613ra(((TdApi.MessageText) this.f16122a.content).webPage)) {
            C4666i7 i7Var = this.f15534W2;
            if (i7Var != null && i7Var.m26588F() != G4) {
                this.f15534W2.m26539r(G4);
            }
        } else {
            this.f15534W2.m26539r(G4);
        }
    }

    @Override
    public int mo25981a8(long j, long j2, int i) {
        if (this.f15535X2 != null) {
            TdApi.MessageContent M5 = this.f16099O0.m2753M5(j, j2);
            if (M5 != null && M5.getConstructor() == 908195298 && C4868i.m24727c2().m24664k1(16L)) {
                M5 = new TdApi.MessageText(C7321e.m16899w1(M5), null);
            }
            if (this.f15536Y2 != M5) {
                if (M5 != null && M5.getConstructor() != 1989037971) {
                    return 3;
                }
                TdApi.MessageText messageText = (TdApi.MessageText) M5;
                this.f15536Y2 = messageText;
                if (messageText != null) {
                    m26614qa(messageText.text, false);
                    m26613ra(messageText.webPage);
                } else {
                    m26614qa(this.f15535X2.text, false);
                    m26613ra(this.f15535X2.webPage);
                }
                m25741z8();
                return mo25355J3() == i ? 1 : 2;
            }
        }
        return 0;
    }

    @Override
    public void mo25221b1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        mo25962d1(h1Var, canvas, i, i2, i3, null, null);
    }

    @Override
    public int mo25220b2() {
        return AbstractC4761s4.f16062g2 + AbstractC4761s4.f16063h2;
    }

    @Override
    public int mo25219c3() {
        return this.f15534W2 != null ? Math.max(this.f15533V2.getWidth(), this.f15534W2.m26583K()) : this.f15533V2.getWidth();
    }

    @Override
    public void mo25962d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        this.f15533V2.m22631h(canvas, i, m26620ka(i, i3), 0, i2 + m26115N4(), null, 1.0f);
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null && vVar2 != null) {
            i7Var.m26534w(h1Var, canvas, C4403w.m27986G2() ? (i + i3) - this.f15534W2.m26583K() : i, m26617na(), vVar, vVar2, 1.0f);
        }
    }

    public void m26626ea() {
        if (mo25842p6()) {
            long ia = m26622ia();
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
                        C4656h6.this.m26615pa(object);
                    }
                });
            }
        }
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        C4666i7 i7Var;
        return super.mo25218f8(h1Var, motionEvent) || this.f15533V2.m22615x(h1Var, motionEvent) || ((i7Var = this.f15534W2) != null && i7Var.m26565b0(h1Var, motionEvent, m25960d3(), m26617na(), m26210E0()));
    }

    public String m26625fa(TdApi.WebPage webPage) {
        Uri l0;
        TdApi.TextEntity[] textEntityArr;
        String str;
        TdApi.TextEntity[] textEntityArr2 = this.f15532U2.entities;
        if (textEntityArr2 == null || textEntityArr2.length == 0 || (l0 = C1363c0.m37427l0(webPage.url)) == null) {
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
            uri = C1363c0.m37427l0(str);
            if (uri != null && uri.buildUpon().fragment(null).build().equals(l0)) {
                return uri.getEncodedFragment();
            }
        }
        if (i != 1 || uri == null) {
            return null;
        }
        return uri.getEncodedFragment();
    }

    public C4666i7 m26624ga() {
        return this.f15534W2;
    }

    @Override
    public boolean mo25920h5(String str) {
        TdApi.TextEntity[] textEntityArr;
        String str2;
        C4666i7 i7Var = this.f15534W2;
        if (i7Var == null || !i7Var.m26569Y()) {
            return false;
        }
        if (str.equals(this.f15534W2.m26584J().url)) {
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

    public int m26623ha() {
        TdApi.InternalLinkType internalLinkType;
        if (!mo25842p6() || (internalLinkType = this.f15537Z2.link) == null) {
            return R.string.OpenChannel;
        }
        int constructor = internalLinkType.getConstructor();
        return constructor != -1206724291 ? constructor != 978541650 ? R.string.OpenChannel : R.string.OpenMessage : R.string.OpenBot;
    }

    public long m26622ia() {
        if (mo25842p6()) {
            return this.f15537Z2.sponsorChatId;
        }
        return 0L;
    }

    public String m26621ja() {
        TdApi.InternalLinkType internalLinkType;
        if (!mo25842p6() || (internalLinkType = this.f15537Z2.link) == null) {
            C10930q6 q6Var = this.f16099O0;
            return q6Var.m2637Tc(q6Var.m2462f4(m26622ia()));
        }
        int constructor = internalLinkType.getConstructor();
        if (constructor == -1206724291) {
            TdApi.InternalLinkTypeBotStart internalLinkTypeBotStart = (TdApi.InternalLinkTypeBotStart) this.f15537Z2.link;
            return this.f16099O0.m2682Qc(internalLinkTypeBotStart.botUsername, internalLinkTypeBotStart.startParameter, false);
        } else if (constructor == 978541650) {
            return ((TdApi.InternalLinkTypeMessage) this.f15537Z2.link).url;
        } else {
            C10930q6 q6Var2 = this.f16099O0;
            return q6Var2.m2637Tc(q6Var2.m2462f4(m26622ia()));
        }
    }

    public final int m26620ka(int i, int i2) {
        return m26069R9() ? m26177H1() - mo25220b2() : i + i2;
    }

    public TdApi.File m26619la() {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var != null) {
            return i7Var.m26586H();
        }
        return null;
    }

    @Override
    public boolean mo25870m7() {
        C4666i7 i7Var = this.f15534W2;
        return i7Var != null && i7Var.m26571W();
    }

    @Override
    public boolean mo25296m8(View view, float f, float f2) {
        C4666i7 i7Var;
        return this.f15533V2.m22644A(view) || ((i7Var = this.f15534W2) != null && i7Var.m26561d0(view, this)) || super.mo25296m8(view, f, f2);
    }

    public TdApi.FormattedText m26618ma() {
        return this.f15532U2;
    }

    public final int m26617na() {
        if (C7321e.m16965a1(this.f15532U2)) {
            return m25950e3();
        }
        return m25950e3() + this.f15533V2.getHeight() + m26115N4() + C1357a0.m37544i(6.0f);
    }

    @Override
    public boolean mo25842p6() {
        return this.f15537Z2 != null;
    }

    @Override
    public boolean mo25830q7() {
        return this.f15534W2 != null;
    }

    public final boolean m26614qa(TdApi.FormattedText formattedText, boolean z) {
        TdApi.FormattedText formattedText2 = this.f15532U2;
        if (formattedText2 != null && C7321e.m16995M(formattedText2, formattedText)) {
            return false;
        }
        this.f15532U2 = formattedText;
        AbstractC5408k L4 = m26013X5() ? C5428t.AbstractC5441d.f17876G : m26135L4();
        if (formattedText.entities != null || !z) {
            this.f15533V2 = new C5459x0(formattedText.text, AbstractC4761s4.m26126M4(), L4, AbstractC5411l0.m22790F(this.f16099O0, formattedText, m25917h8())).m22641D(m26210E0());
        } else {
            this.f15533V2 = new C5459x0(this.f16099O0, formattedText.text, AbstractC4761s4.m26126M4(), L4, 0, m25917h8()).m22641D(m26210E0());
        }
        this.f15533V2.m22636a(Log.TAG_GIF_LOADER);
        if (m26069R9()) {
            this.f15533V2.m22636a(Log.TAG_YOUTUBE);
        }
        if (!m26069R9()) {
            this.f15533V2.m22636a(64);
        }
        this.f15533V2.m22637H(this.f16101P0);
        return true;
    }

    @Override
    public boolean mo25290r6(TdApi.Message message, TdApi.MessageContent messageContent) {
        if (messageContent.getConstructor() == 908195298) {
            return C4868i.m24727c2().m24664k1(16L);
        }
        return super.mo25290r6(message, messageContent);
    }

    public final boolean m26613ra(TdApi.WebPage webPage) {
        if (webPage != null) {
            TdApi.FormattedText formattedText = this.f15532U2;
            C4666i7 i7Var = new C4666i7(this, webPage, formattedText != null ? C7321e.m17000J0(formattedText, webPage.url, false) : webPage.url);
            this.f15534W2 = i7Var;
            i7Var.m26545m0(this.f16101P0);
            return true;
        }
        this.f15534W2 = null;
        return false;
    }

    @Override
    public TdApi.WebPage mo25817s1(String str) {
        C4666i7 i7Var = this.f15534W2;
        if (i7Var == null || !i7Var.m26579O(str)) {
            return null;
        }
        return this.f15534W2.m26584J();
    }

    @Override
    public int mo25744z3() {
        return C7321e.m16965a1(this.f15532U2) ? -C1357a0.m37544i(3.0f) : C1357a0.m37544i(7.0f);
    }

    public C4656h6(C9678w2 w2Var, TdApi.Message message, TdApi.FormattedText formattedText) {
        super(w2Var, message);
        this.f15535X2 = new TdApi.MessageText(formattedText, null);
        m26614qa(formattedText, true);
    }

    public C4656h6(C9678w2 w2Var, TdApi.Message message, TdApi.SponsoredMessage sponsoredMessage) {
        super(w2Var, message);
        this.f15537Z2 = sponsoredMessage;
        TdApi.MessageText messageText = (TdApi.MessageText) sponsoredMessage.content;
        this.f15535X2 = messageText;
        m26614qa(messageText.text, true);
    }
}
