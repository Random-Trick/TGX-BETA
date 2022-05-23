package hd;

import android.graphics.Canvas;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import gd.w;
import he.i;
import je.k;
import je.l0;
import je.t;
import je.x0;
import ld.c;
import ld.p;
import ld.v;
import md.m;
import ob.e;
import od.l1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import vc.g1;
import vc.v2;
import zd.hj;
import zd.o6;

public class h6 extends s4 {
    public TdApi.FormattedText U2;
    public x0 V2;
    public i7 W2;
    public TdApi.MessageText X2;
    public TdApi.MessageText Y2;
    public TdApi.SponsoredMessage Z2;

    public h6(v2 v2Var, TdApi.Message message, TdApi.MessageText messageText, TdApi.MessageText messageText2) {
        super(v2Var, message);
        this.X2 = messageText;
        this.Y2 = messageText2;
        if (messageText2 != null) {
            qa(messageText2.text, false);
            ra(this.Y2.webPage);
            return;
        }
        qa(messageText.text, false);
        ra(messageText.webPage);
    }

    public void oa(TdApi.MessageLinkInfo messageLinkInfo) {
        this.O0.hd().t7(this, messageLinkInfo, null);
    }

    public void pa(TdApi.Object object) {
        if (object.getConstructor() == -981646294) {
            final TdApi.MessageLinkInfo messageLinkInfo = (TdApi.MessageLinkInfo) object;
            this.O0.hd().post(new Runnable() {
                @Override
                public final void run() {
                    h6.this.oa(messageLinkInfo);
                }
            });
        }
    }

    @Override
    public boolean I5() {
        return this.Y2 != null;
    }

    @Override
    public void I8(m mVar) {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            i7Var.f0(mVar, b3(), na());
        } else {
            mVar.r(null);
        }
    }

    @Override
    public void J8(p pVar) {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            i7Var.e0(pVar, b3(), na());
        } else {
            pVar.G(null);
        }
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        TdApi.WebPage webPage = this.f13449a.content.getConstructor() == 1989037971 ? ((TdApi.MessageText) this.f13449a.content).webPage : null;
        this.f13449a.content = messageContent;
        TdApi.MessageText messageText = messageContent.getConstructor() == 908195298 ? new TdApi.MessageText(e.y1(messageContent), null) : (TdApi.MessageText) messageContent;
        this.X2 = messageText;
        if (I5()) {
            return true;
        }
        qa(messageText.text, false);
        ra(messageText.webPage);
        z8();
        if (e.r0(webPage, messageText.webPage)) {
            return true;
        }
        a();
        F5();
        return true;
    }

    @Override
    public void M8(c cVar) {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            i7Var.g0(cVar, b3(), na());
        } else {
            cVar.clear();
        }
    }

    @Override
    public int O3(boolean z10) {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            return i7Var.A(z10);
        }
        return 0;
    }

    @Override
    public int R1() {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            return i7Var.E();
        }
        if (w.G2() == this.V2.o()) {
            return this.V2.p();
        }
        return -1;
    }

    @Override
    public void R7(g1 g1Var, boolean z10) {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            i7Var.a0();
        }
    }

    @Override
    public l1 U3(long j10, View view, int i10, int i11, int i12) {
        i7 i7Var = this.W2;
        if (i7Var == null || i7Var.G() == null) {
            return null;
        }
        l1 I = this.W2.G().I(view, i10, i11, i12);
        if (I != null) {
            I.m((!R9() || !f6()) ? R.id.theme_color_filling : R.id.theme_color_bubbleOut_background);
        }
        return I;
    }

    @Override
    public void V7() {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            i7Var.v();
        }
    }

    @Override
    public int W2() {
        int i10 = 0;
        if (!e.c1(this.U2)) {
            i10 = 0 + this.V2.getHeight() + M4();
        }
        if (this.W2 == null) {
            return i10;
        }
        if (i10 > 0) {
            i10 += a0.i(8.0f);
        }
        return i10 + this.W2.z();
    }

    @Override
    public boolean W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z10) {
        if (e.O(e.y1(messageContent), e.y1(messageContent2))) {
            TdApi.WebPage webPage = null;
            TdApi.WebPage webPage2 = messageContent.getConstructor() == 1989037971 ? ((TdApi.MessageText) messageContent).webPage : null;
            if (messageContent2.getConstructor() == 1989037971) {
                webPage = ((TdApi.MessageText) messageContent2).webPage;
            }
            if (e.r0(webPage2, webPage)) {
                return false;
            }
        }
        L9(this.f13449a, messageContent2, z10);
        return true;
    }

    @Override
    public int Y1() {
        return s4.f13429g2 + s4.f13430h2;
    }

    @Override
    public void Z(TdApi.ChatType chatType) {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            i7Var.o(chatType);
        }
    }

    @Override
    public void Z7(long j10, long j11, boolean z10) {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            i7Var.n0(j10, j11, z10);
        }
    }

    @Override
    public void a1(g1 g1Var, Canvas canvas, int i10, int i11, int i12) {
        c1(g1Var, canvas, i10, i11, i12, null, null);
    }

    @Override
    public int a3() {
        return this.W2 != null ? Math.max(this.V2.getWidth(), this.W2.K()) : this.V2.getWidth();
    }

    @Override
    public int a8(long j10, long j11, int i10) {
        if (this.X2 != null) {
            TdApi.MessageContent Q5 = this.O0.Q5(j10, j11);
            if (Q5 != null && Q5.getConstructor() == 908195298 && i.c2().k1(16L)) {
                Q5 = new TdApi.MessageText(e.y1(Q5), null);
            }
            if (this.Y2 != Q5) {
                if (Q5 != null && Q5.getConstructor() != 1989037971) {
                    return 3;
                }
                TdApi.MessageText messageText = (TdApi.MessageText) Q5;
                this.Y2 = messageText;
                if (messageText != null) {
                    qa(messageText.text, false);
                    ra(messageText.webPage);
                } else {
                    qa(this.X2.text, false);
                    ra(this.X2.webPage);
                }
                z8();
                return G3() == i10 ? 1 : 2;
            }
        }
        return 0;
    }

    @Override
    public void b0(int i10) {
        this.V2.B(i10);
        int G4 = G4();
        TdApi.MessageText messageText = this.Y2;
        if (messageText != null) {
            if (ra(messageText.webPage)) {
                this.W2.r(G4);
            }
        } else if (this.f13449a.content.getConstructor() != 1989037971 || !ra(((TdApi.MessageText) this.f13449a.content).webPage)) {
            i7 i7Var = this.W2;
            if (i7Var != null && i7Var.F() != G4) {
                this.W2.r(G4);
            }
        } else {
            this.W2.r(G4);
        }
    }

    @Override
    public void c1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, v vVar, v vVar2) {
        this.V2.h(canvas, i10, ka(i10, i12), 0, i11 + M4(), null, 1.0f);
        i7 i7Var = this.W2;
        if (i7Var != null && vVar2 != null) {
            i7Var.w(g1Var, canvas, w.G2() ? (i10 + i12) - this.W2.K() : i10, na(), vVar, vVar2, 1.0f);
        }
    }

    public void ea() {
        if (o6()) {
            long ia2 = ia();
            TdApi.InternalLinkType internalLinkType = this.Z2.link;
            if (internalLinkType == null) {
                this.O0.hd().h7(this, ia2, new hj.j().h());
                return;
            }
            int constructor = internalLinkType.getConstructor();
            if (constructor == -1206724291) {
                this.O0.hd().h7(this, ia2, new hj.j().r(new w2(ia2, ((TdApi.InternalLinkTypeBotStart) this.Z2.link).startParameter, false)).h());
            } else if (constructor != 978541650) {
                this.O0.hd().h7(this, ia2, new hj.j().h());
            } else {
                this.O0.v4().o(new TdApi.GetMessageLinkInfo(((TdApi.InternalLinkTypeMessage) this.Z2.link).url), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        h6.this.pa(object);
                    }
                });
            }
        }
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        i7 i7Var;
        return super.f8(g1Var, motionEvent) || this.V2.x(g1Var, motionEvent) || ((i7Var = this.W2) != null && i7Var.b0(g1Var, motionEvent, b3(), na(), F0()));
    }

    public String fa(TdApi.WebPage webPage) {
        Uri l02;
        TdApi.TextEntity[] textEntityArr;
        String str;
        TdApi.TextEntity[] textEntityArr2 = this.U2.entities;
        if (textEntityArr2 == null || textEntityArr2.length == 0 || (l02 = c0.l0(webPage.url)) == null) {
            return null;
        }
        Uri uri = null;
        int i10 = 0;
        for (TdApi.TextEntity textEntity : this.U2.entities) {
            int constructor = textEntity.type.getConstructor();
            if (constructor == -1312762756) {
                str = e.u1(this.U2.text, textEntity);
            } else if (constructor != 445719651) {
                continue;
            } else {
                str = ((TdApi.TextEntityTypeTextUrl) textEntity.type).url;
            }
            i10++;
            uri = c0.l0(str);
            if (uri != null && uri.buildUpon().fragment(null).build().equals(l02)) {
                return uri.getEncodedFragment();
            }
        }
        if (i10 != 1 || uri == null) {
            return null;
        }
        return uri.getEncodedFragment();
    }

    @Override
    public boolean g5(String str) {
        TdApi.TextEntity[] textEntityArr;
        String str2;
        i7 i7Var = this.W2;
        if (i7Var == null || !i7Var.Y()) {
            return false;
        }
        if (str.equals(this.W2.J().url)) {
            return true;
        }
        boolean z10 = false;
        for (TdApi.TextEntity textEntity : this.U2.entities) {
            if (textEntity.type.getConstructor() == -1312762756) {
                String str3 = this.U2.text;
                int i10 = textEntity.offset;
                str2 = str3.substring(i10, textEntity.length + i10);
            } else if (textEntity.type.getConstructor() == 445719651) {
                str2 = ((TdApi.TextEntityTypeTextUrl) textEntity.type).url;
            } else {
                continue;
            }
            if (!str.equals(str2)) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public i7 ga() {
        return this.W2;
    }

    public int ha() {
        TdApi.InternalLinkType internalLinkType;
        if (!o6() || (internalLinkType = this.Z2.link) == null) {
            return R.string.OpenChannel;
        }
        int constructor = internalLinkType.getConstructor();
        return constructor != -1206724291 ? constructor != 978541650 ? R.string.OpenChannel : R.string.OpenMessage : R.string.OpenBot;
    }

    public long ia() {
        if (o6()) {
            return this.Z2.sponsorChatId;
        }
        return 0L;
    }

    public String ja() {
        TdApi.InternalLinkType internalLinkType;
        if (!o6() || (internalLinkType = this.Z2.link) == null) {
            o6 o6Var = this.O0;
            return o6Var.Xc(o6Var.j4(ia()));
        }
        int constructor = internalLinkType.getConstructor();
        if (constructor == -1206724291) {
            TdApi.InternalLinkTypeBotStart internalLinkTypeBotStart = (TdApi.InternalLinkTypeBotStart) this.Z2.link;
            return this.O0.Uc(internalLinkTypeBotStart.botUsername, internalLinkTypeBotStart.startParameter, false);
        } else if (constructor == 978541650) {
            return ((TdApi.InternalLinkTypeMessage) this.Z2.link).url;
        } else {
            o6 o6Var2 = this.O0;
            return o6Var2.Xc(o6Var2.j4(ia()));
        }
    }

    public final int ka(int i10, int i11) {
        return R9() ? E1() - Y1() : i10 + i11;
    }

    public TdApi.File la() {
        i7 i7Var = this.W2;
        if (i7Var != null) {
            return i7Var.H();
        }
        return null;
    }

    @Override
    public boolean m7() {
        i7 i7Var = this.W2;
        return i7Var != null && i7Var.W();
    }

    @Override
    public boolean m8(View view, float f10, float f11) {
        i7 i7Var;
        return this.V2.A(view) || ((i7Var = this.W2) != null && i7Var.d0(view, this)) || super.m8(view, f10, f11);
    }

    public TdApi.FormattedText ma() {
        return this.U2;
    }

    public final int na() {
        if (e.c1(this.U2)) {
            return c3();
        }
        return c3() + this.V2.getHeight() + M4() + a0.i(6.0f);
    }

    @Override
    public boolean o6() {
        return this.Z2 != null;
    }

    @Override
    public TdApi.WebPage q1(String str) {
        i7 i7Var = this.W2;
        if (i7Var == null || !i7Var.O(str)) {
            return null;
        }
        return this.W2.J();
    }

    @Override
    public boolean q6(TdApi.Message message, TdApi.MessageContent messageContent) {
        if (messageContent.getConstructor() == 908195298) {
            return i.c2().k1(16L);
        }
        return super.q6(message, messageContent);
    }

    @Override
    public boolean q7() {
        return this.W2 != null;
    }

    public final boolean qa(TdApi.FormattedText formattedText, boolean z10) {
        TdApi.FormattedText formattedText2 = this.U2;
        if (formattedText2 != null && e.O(formattedText2, formattedText)) {
            return false;
        }
        this.U2 = formattedText;
        k K4 = W5() ? t.d.G : K4();
        if (formattedText.entities != null || !z10) {
            this.V2 = new x0(formattedText.text, s4.L4(), K4, l0.F(this.O0, formattedText, h8())).D(F0());
        } else {
            this.V2 = new x0(this.O0, formattedText.text, s4.L4(), K4, 0, h8()).D(F0());
        }
        this.V2.a(Log.TAG_GIF_LOADER);
        if (R9()) {
            this.V2.a(Log.TAG_YOUTUBE);
        }
        if (!R9()) {
            this.V2.a(64);
        }
        this.V2.H(this.P0);
        return true;
    }

    public final boolean ra(TdApi.WebPage webPage) {
        if (webPage != null) {
            TdApi.FormattedText formattedText = this.U2;
            i7 i7Var = new i7(this, webPage, formattedText != null ? e.L0(formattedText, webPage.url, false) : webPage.url);
            this.W2 = i7Var;
            i7Var.m0(this.P0);
            return true;
        }
        this.W2 = null;
        return false;
    }

    @Override
    public int w3() {
        return e.c1(this.U2) ? -a0.i(3.0f) : a0.i(7.0f);
    }

    public h6(v2 v2Var, TdApi.Message message, TdApi.FormattedText formattedText) {
        super(v2Var, message);
        this.X2 = new TdApi.MessageText(formattedText, null);
        qa(formattedText, true);
    }

    public h6(v2 v2Var, TdApi.Message message, TdApi.SponsoredMessage sponsoredMessage) {
        super(v2Var, message);
        this.Z2 = sponsoredMessage;
        TdApi.MessageText messageText = (TdApi.MessageText) sponsoredMessage.content;
        this.X2 = messageText;
        qa(messageText.text, true);
    }
}
