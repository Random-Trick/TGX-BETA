package gd;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import gd.C4636f5;
import ie.AbstractC5408k;
import ie.AbstractC5411l0;
import ie.C5457w0;
import ie.C5459x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p037cb.C2057b;
import p051db.AbstractC3936b;
import p051db.C3950k;
import p051db.C3955n;
import p051db.C3965r;
import p051db.C3967s;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5069h;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6257p;
import p193nb.C7321e;
import p291uc.C9552h1;
import p291uc.C9678w2;

public class C4636f5 extends AbstractC4761s4 {
    public int f15441U2;
    public final List<C4637a> f15442V2;
    public final C3955n<C4637a> f15443W2;

    public class C4637a implements C3955n.AbstractC3959d, AbstractC3936b {
        public TdApi.FormattedText f15444M;
        public TdApi.FormattedText f15445N;
        public C3950k f15446O;
        public TdApi.FormattedText f15447P;
        public C5459x0 f15449R;
        public final int f15453a;
        public long f15454b;
        public C4707n f15455c;
        public final C3967s f15450S = new C3967s(0.0f);
        public final C3967s f15451T = new C3967s(1.0f);
        public final C3965r<C5459x0> f15448Q = new C3965r<>(new C3965r.AbstractC3966a() {
            @Override
            public final void mo7848a(C3965r rVar) {
                C4636f5.C4637a.this.m26665r(rVar);
            }
        }, C2057b.f7280b, 200);

        public C4637a(TdApi.Message message, C4707n nVar, TdApi.FormattedText formattedText) {
            int i = C4636f5.this.f15441U2 + 1;
            C4636f5.this.f15441U2 = i;
            this.f15453a = i;
            long j = message.f25409id;
            this.f15454b = j;
            this.f15455c = nVar;
            this.f15444M = formattedText;
            this.f15445N = C4636f5.this.f16099O0.m2769L5(message.chatId, j);
            m26663t(false);
        }

        public void m26665r(C3965r rVar) {
            C4636f5.this.f15443W2.m29515w(C4636f5.this.m25946e7());
            C4636f5.this.m25792u5();
        }

        @Override
        public boolean mo26680a() {
            if (!this.f15450S.m29459b(m26668o())) {
                if (!this.f15451T.m29459b(m26664s() ? 1.0f : 0.0f)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void mo26679b(boolean z) {
            this.f15450S.m29458c(z);
            this.f15451T.m29458c(z);
        }

        @Override
        public boolean mo26678c(float f) {
            return this.f15451T.m29460a(f) || this.f15450S.m29460a(f);
        }

        @Override
        public int mo7991d(boolean z) {
            if (!z) {
                return C1357a0.m37544i(3.5f);
            }
            if (!m26666q() || !C4636f5.this.m26069R9() || C4636f5.this.m26047T9()) {
                return 0;
            }
            return Math.max(0, C1357a0.m37544i(10.0f) - C4636f5.this.mo25220b2());
        }

        @Override
        public void mo26677e() {
            this.f15450S.m29456e(m26668o());
            this.f15451T.m29456e(m26664s() ? 1.0f : 0.0f);
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof C4637a) && ((C4637a) obj).f15454b == this.f15454b);
        }

        @Override
        public void mo26676f() {
            this.f15450S.m29454g(m26668o());
            this.f15451T.m29454g(m26664s() ? 1.0f : 0.0f);
        }

        @Override
        public int mo7990g(boolean z) {
            if (z) {
                return 0;
            }
            return C1357a0.m37544i(3.5f);
        }

        @Override
        public int getHeight() {
            return this.f15455c.mo25242i() + (m26666q() ? C1357a0.m37544i(10.0f) + this.f15449R.getHeight() : 0);
        }

        @Override
        public int getWidth() {
            return Math.max(this.f15455c.mo25241j(), m26666q() ? this.f15449R.getWidth() : 0);
        }

        public int hashCode() {
            return C5063c.m24143d(this.f15454b);
        }

        public final int m26669n() {
            C5459x0 x0Var = this.f15449R;
            if (x0Var == null) {
                return this.f15455c.m26421J();
            }
            if (x0Var.m22624o() != C4403w.m27986G2()) {
                return -1;
            }
            return this.f15449R.m22623p();
        }

        public final int m26668o() {
            int n = m26669n();
            return n == -1 || C4636f5.this.m25881l7(n) ? getWidth() - C4636f5.this.m25774w2() : n;
        }

        public float m26667p() {
            C3950k kVar = this.f15446O;
            if (kVar != null) {
                return kVar.m29540o() * C5069h.m24090d(C4636f5.this.f15443W2.m29518t().m29479i() - 1.0f);
            }
            return 0.0f;
        }

        public final boolean m26666q() {
            return !C7321e.m16965a1(this.f15447P);
        }

        public final boolean m26664s() {
            int n = m26669n();
            return n == -1 || C4636f5.this.m25881l7(n);
        }

        public final boolean m26663t(boolean z) {
            TdApi.FormattedText formattedText = this.f15445N;
            if (formattedText == null) {
                formattedText = this.f15444M;
            }
            if (C7321e.m16995M(this.f15447P, formattedText)) {
                return false;
            }
            C5459x0 x0Var = null;
            this.f15447P = C7321e.m16965a1(formattedText) ? null : formattedText;
            if (!C7321e.m16965a1(formattedText)) {
                String str = formattedText.text;
                C5457w0 M4 = AbstractC4761s4.m26126M4();
                AbstractC5408k L4 = C4636f5.this.m26135L4();
                C4636f5 f5Var = C4636f5.this;
                x0Var = new C5459x0(str, M4, L4, AbstractC5411l0.m22790F(f5Var.f16099O0, formattedText, f5Var.m25917h8())).m22636a(Log.TAG_GIF_LOADER).m22641D(C4636f5.this.m26210E0());
                x0Var.m22637H(C4636f5.this.f16101P0);
                x0Var.m22643B(C4636f5.this.m25995Z2());
            }
            C3965r<C5459x0> rVar = this.f15448Q;
            this.f15449R = x0Var;
            rVar.m29464u(x0Var, z);
            return true;
        }
    }

    public C4636f5(C9678w2 w2Var, TdApi.Message message) {
        super(w2Var, message);
        ArrayList arrayList = new ArrayList();
        this.f15442V2 = arrayList;
        C3955n<C4637a> nVar = new C3955n<>(new C3955n.AbstractC3957b() {
            @Override
            public final void mo26894a(C3955n nVar2) {
                C4636f5.this.m26682ga(nVar2);
            }
        }, C2057b.f7280b, 200L);
        this.f15443W2 = nVar;
        arrayList.add(m26681ha(this, message));
        nVar.m29526B(arrayList, false);
    }

    public void m26682ga(C3955n nVar) {
        if (m26244A8()) {
            m26141K8();
        } else {
            m25792u5();
        }
    }

    @Override
    public void mo26214D7(long j, C3950k kVar) {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j) {
                aVar.f15446O = kVar;
                return;
            }
        }
    }

    @Override
    public boolean mo26154J5() {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15445N != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo25335L8(C6238b bVar, boolean z, int i) {
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            if (!z || i <= 0 || next.f13320a.f15453a == i) {
                C6257p k = bVar.m20993k(next.f13320a.f15453a);
                C6240c l = bVar.m20992l(next.f13320a.f15453a);
                int d = next.f13320a.f15455c.mo25245d(0);
                l.mo20260D0(d);
                k.mo20260D0(d);
                if (!z || i == next.f13320a.f15453a) {
                    next.f13320a.f15455c.mo25238m(l);
                }
                next.f13320a.f15455c.mo25239l(k);
            }
        }
    }

    @Override
    public boolean mo25334L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        TdApi.FormattedText formattedText;
        boolean z2;
        boolean z3 = false;
        while (true) {
            boolean z4 = false;
            for (C4637a aVar : this.f15442V2) {
                if (aVar.f15454b == message.f25409id) {
                    C4707n nVar = aVar.f15455c;
                    int constructor = messageContent.getConstructor();
                    if (constructor == 276722716) {
                        TdApi.MessageAudio messageAudio = (TdApi.MessageAudio) messageContent;
                        TdApi.Audio audio = ((TdApi.MessageAudio) message.content).audio;
                        if (nVar == null || audio.audio.f25376id == messageAudio.audio.audio.f25376id) {
                            z2 = false;
                        } else {
                            nVar.mo25243h().m18643Y(messageAudio.audio.audio, message);
                            z2 = true;
                        }
                        formattedText = messageAudio.caption;
                    } else if (constructor == 527777781) {
                        TdApi.MessageVoiceNote messageVoiceNote = (TdApi.MessageVoiceNote) messageContent;
                        TdApi.VoiceNote voiceNote = ((TdApi.MessageVoiceNote) message.content).voiceNote;
                        if (nVar == null || voiceNote.voice.f25376id == messageVoiceNote.voiceNote.voice.f25376id) {
                            z2 = false;
                        } else {
                            nVar.mo25243h().m18643Y(messageVoiceNote.voiceNote.voice, message);
                            z2 = true;
                        }
                        formattedText = messageVoiceNote.caption;
                    } else if (constructor != 596945783) {
                        return false;
                    } else {
                        TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) messageContent;
                        TdApi.Document document = ((TdApi.MessageDocument) message.content).document;
                        if (nVar == null || document.document.f25376id == messageDocument.document.document.f25376id) {
                            z2 = false;
                        } else {
                            nVar.mo25243h().m18643Y(messageDocument.document.document, message);
                            z2 = true;
                        }
                        formattedText = messageDocument.caption;
                    }
                    aVar.f15444M = formattedText;
                    z3 = aVar.m26663t(m25946e7()) || z3;
                    if (z2 || z4) {
                        z4 = true;
                    }
                }
            }
            if (!z3) {
                return z4;
            }
            this.f15443W2.m29515w(m25946e7());
            return true;
        }
    }

    @Override
    public int mo26129M1() {
        List<C4637a> list = this.f15442V2;
        return Math.round(list.get(list.size() - 1).f15450S.m29457d());
    }

    @Override
    public void mo26071R7(C9552h1 h1Var, boolean z) {
        for (C4637a aVar : this.f15442V2) {
            aVar.f15455c.mo25243h().m18655P();
        }
    }

    @Override
    public void mo26049T7(TdApi.Message message, int i) {
        this.f15442V2.remove(i);
        this.f15443W2.m29526B(this.f15442V2, m25946e7());
    }

    @Override
    public int mo25324U1() {
        return -3;
    }

    @Override
    public void mo26039U7(TdApi.Message message, boolean z, boolean z2) {
        int Z2;
        C4637a ha = m26681ha(this, message);
        if (z2 && (Z2 = m25995Z2()) > 0) {
            ha.f15455c.mo25247a(Z2);
            if (ha.m26666q()) {
                ha.f15449R.m22643B(Z2);
                ha.f15448Q.m29465t(false);
            }
        }
        if (z) {
            this.f15442V2.add(ha);
        } else {
            this.f15442V2.add(0, ha);
        }
        this.f15443W2.m29526B(this.f15442V2, m25946e7());
        if (z2) {
            m26247A5(message.f25409id, ha.f15453a);
        }
    }

    @Override
    public boolean mo25320W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
        mo25334L9(message, messageContent2, z);
        return true;
    }

    @Override
    public int mo25223X2() {
        return Math.round(this.f15443W2.m29518t().m29478j());
    }

    @Override
    public void mo26011X7(long j) {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j) {
                aVar.f15455c.m26406Y();
            }
        }
    }

    @Override
    public void mo26008Y(TdApi.ChatType chatType) {
        for (C4637a aVar : this.f15442V2) {
            aVar.f15455c.mo25243h().m18619l(chatType);
        }
    }

    @Override
    public void mo25991Z7(long j, long j2, boolean z) {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j) {
                aVar.f15454b = j2;
                aVar.f15455c.mo25243h().m18652Q0(j, j2, z);
            }
        }
    }

    @Override
    public void mo25222a0(int i) {
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            next.f13320a.f15455c.mo25247a(i);
            Iterator<C3955n.C3958c<C5459x0>> it2 = next.f13320a.f15448Q.iterator();
            while (it2.hasNext()) {
                it2.next().f13320a.m22643B(i);
            }
            next.f13320a.f15448Q.m29465t(false);
        }
        this.f15443W2.m29515w(false);
    }

    @Override
    public int mo25981a8(long j, long j2, int i) {
        int i2 = 0;
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j2) {
                aVar.f15445N = this.f16099O0.m2769L5(j, j2);
                aVar.m26663t(m25946e7());
                i2 = 1;
            }
        }
        return i2;
    }

    @Override
    public void mo25974b8(long j, float f, boolean z) {
        if (z) {
            m25792u5();
        }
    }

    @Override
    public void mo25313c1(p291uc.C9552h1 r26, android.graphics.Canvas r27, int r28, int r29, int r30, p156kd.C6238b r31) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4636f5.mo25313c1(uc.h1, android.graphics.Canvas, int, int, int, kd.b):void");
    }

    @Override
    public int mo25219c3() {
        return Math.round(this.f15443W2.m29518t().m29480h());
    }

    @Override
    public float mo25951e2() {
        List<C4637a> list = this.f15442V2;
        return list.get(list.size() - 1).f15451T.m29457d();
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        boolean f8 = super.mo25218f8(h1Var, motionEvent);
        for (C4637a aVar : this.f15442V2) {
            Iterator<C3955n.C3958c<C5459x0>> it = aVar.f15448Q.iterator();
            while (it.hasNext()) {
                if (it.next().f13320a.m22615x(h1Var, motionEvent)) {
                    f8 = true;
                }
            }
            if (aVar.f15455c.mo25240k(h1Var, motionEvent)) {
                f8 = true;
            }
        }
        return f8;
    }

    public final C4637a m26681ha(AbstractC4761s4 s4Var, TdApi.Message message) {
        C4707n nVar;
        TdApi.FormattedText formattedText;
        int constructor = message.content.getConstructor();
        boolean z = true;
        if (constructor == 276722716) {
            TdApi.MessageAudio messageAudio = (TdApi.MessageAudio) message.content;
            nVar = new C4707n(s4Var, messageAudio.audio, message, s4Var.f16097N0);
            formattedText = messageAudio.caption;
        } else if (constructor == 527777781) {
            TdApi.MessageVoiceNote messageVoiceNote = (TdApi.MessageVoiceNote) message.content;
            nVar = new C4707n(s4Var, messageVoiceNote.voiceNote, message, s4Var.f16097N0);
            formattedText = messageVoiceNote.caption;
            z = false;
        } else if (constructor == 596945783) {
            TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
            nVar = new C4707n(s4Var, messageDocument.document);
            formattedText = messageDocument.caption;
        } else {
            throw new IllegalArgumentException(message.content.toString());
        }
        if (z) {
            nVar.m26403b0();
        }
        nVar.mo25237n(s4Var.f16101P0);
        return new C4637a(message, nVar, formattedText);
    }

    @Override
    public boolean mo25299k7() {
        return true;
    }

    @Override
    public boolean mo25296m8(View view, float f, float f2) {
        boolean m8 = super.mo25296m8(view, f, f2);
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            next.f13320a.f15455c.m26427A();
            Iterator<C3955n.C3958c<C5459x0>> it2 = next.f13320a.f15448Q.iterator();
            while (it2.hasNext()) {
                if (it2.next().f13320a.m22644A(view)) {
                    m8 = true;
                }
            }
        }
        return m8;
    }

    @Override
    public long mo25856o1(float f, float f2) {
        if (f < m25960d3() || f >= m25960d3() + mo25219c3() || f2 < m25950e3() || f2 >= m25950e3() + mo25223X2()) {
            return 0L;
        }
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            RectF q = next.m29495q();
            q.offset(0.0f, m25950e3());
            if (f2 >= q.top && f2 < q.bottom) {
                return next.f13320a.f15454b;
            }
        }
        return 0L;
    }

    @Override
    public int mo25754y3() {
        return C1357a0.m37544i(4.0f);
    }

    @Override
    public int mo25744z3() {
        List<C4637a> list = this.f15442V2;
        return C1357a0.m37544i(list.get(list.size() + (-1)).m26666q() ? 3.0f : 6.0f);
    }
}
