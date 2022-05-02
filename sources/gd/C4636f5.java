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
                C4636f5.C4637a.this.m26664r(rVar);
            }
        }, C2057b.f7280b, 200);

        public C4637a(TdApi.Message message, C4707n nVar, TdApi.FormattedText formattedText) {
            int i = C4636f5.this.f15441U2 + 1;
            C4636f5.this.f15441U2 = i;
            this.f15453a = i;
            long j = message.f25406id;
            this.f15454b = j;
            this.f15455c = nVar;
            this.f15444M = formattedText;
            this.f15445N = C4636f5.this.f16099O0.m2769L5(message.chatId, j);
            m26662t(false);
        }

        public void m26664r(C3965r rVar) {
            C4636f5.this.f15443W2.m29513w(C4636f5.this.m25945e7());
            C4636f5.this.m25791u5();
        }

        @Override
        public boolean mo26679a() {
            if (!this.f15450S.m29457b(m26667o())) {
                if (!this.f15451T.m29457b(m26663s() ? 1.0f : 0.0f)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void mo26678b(boolean z) {
            this.f15450S.m29456c(z);
            this.f15451T.m29456c(z);
        }

        @Override
        public boolean mo26677c(float f) {
            return this.f15451T.m29458a(f) || this.f15450S.m29458a(f);
        }

        @Override
        public int mo7991d(boolean z) {
            if (!z) {
                return C1357a0.m37541i(3.5f);
            }
            if (!m26665q() || !C4636f5.this.m26068R9() || C4636f5.this.m26046T9()) {
                return 0;
            }
            return Math.max(0, C1357a0.m37541i(10.0f) - C4636f5.this.mo25219b2());
        }

        @Override
        public void mo26676e() {
            this.f15450S.m29454e(m26667o());
            this.f15451T.m29454e(m26663s() ? 1.0f : 0.0f);
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof C4637a) && ((C4637a) obj).f15454b == this.f15454b);
        }

        @Override
        public void mo26675f() {
            this.f15450S.m29452g(m26667o());
            this.f15451T.m29452g(m26663s() ? 1.0f : 0.0f);
        }

        @Override
        public int mo7990g(boolean z) {
            if (z) {
                return 0;
            }
            return C1357a0.m37541i(3.5f);
        }

        @Override
        public int getHeight() {
            return this.f15455c.mo25241i() + (m26665q() ? C1357a0.m37541i(10.0f) + this.f15449R.getHeight() : 0);
        }

        @Override
        public int getWidth() {
            return Math.max(this.f15455c.mo25240j(), m26665q() ? this.f15449R.getWidth() : 0);
        }

        public int hashCode() {
            return C5063c.m24142d(this.f15454b);
        }

        public final int m26668n() {
            C5459x0 x0Var = this.f15449R;
            if (x0Var == null) {
                return this.f15455c.m26420J();
            }
            if (x0Var.m22623o() != C4403w.m27984G2()) {
                return -1;
            }
            return this.f15449R.m22622p();
        }

        public final int m26667o() {
            int n = m26668n();
            return n == -1 || C4636f5.this.m25880l7(n) ? getWidth() - C4636f5.this.m25773w2() : n;
        }

        public float m26666p() {
            C3950k kVar = this.f15446O;
            if (kVar != null) {
                return kVar.m29538o() * C5069h.m24089d(C4636f5.this.f15443W2.m29516t().m29477i() - 1.0f);
            }
            return 0.0f;
        }

        public final boolean m26665q() {
            return !C7321e.m16965a1(this.f15447P);
        }

        public final boolean m26663s() {
            int n = m26668n();
            return n == -1 || C4636f5.this.m25880l7(n);
        }

        public final boolean m26662t(boolean z) {
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
                C5457w0 M4 = AbstractC4761s4.m26125M4();
                AbstractC5408k L4 = C4636f5.this.m26134L4();
                C4636f5 f5Var = C4636f5.this;
                x0Var = new C5459x0(str, M4, L4, AbstractC5411l0.m22789F(f5Var.f16099O0, formattedText, f5Var.m25916h8())).m22635a(Log.TAG_GIF_LOADER).m22640D(C4636f5.this.m26209E0());
                x0Var.m22636H(C4636f5.this.f16101P0);
                x0Var.m22642B(C4636f5.this.m25994Z2());
            }
            C3965r<C5459x0> rVar = this.f15448Q;
            this.f15449R = x0Var;
            rVar.m29462u(x0Var, z);
            return true;
        }
    }

    public C4636f5(C9678w2 w2Var, TdApi.Message message) {
        super(w2Var, message);
        ArrayList arrayList = new ArrayList();
        this.f15442V2 = arrayList;
        C3955n<C4637a> nVar = new C3955n<>(new C3955n.AbstractC3957b() {
            @Override
            public final void mo26892a(C3955n nVar2) {
                C4636f5.this.m26681ga(nVar2);
            }
        }, C2057b.f7280b, 200L);
        this.f15443W2 = nVar;
        arrayList.add(m26680ha(this, message));
        nVar.m29524B(arrayList, false);
    }

    public void m26681ga(C3955n nVar) {
        if (m26243A8()) {
            m26140K8();
        } else {
            m25791u5();
        }
    }

    @Override
    public void mo26213D7(long j, C3950k kVar) {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j) {
                aVar.f15446O = kVar;
                return;
            }
        }
    }

    @Override
    public boolean mo26153J5() {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15445N != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo25334L8(C6238b bVar, boolean z, int i) {
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            if (!z || i <= 0 || next.f13320a.f15453a == i) {
                C6257p k = bVar.m20992k(next.f13320a.f15453a);
                C6240c l = bVar.m20991l(next.f13320a.f15453a);
                int d = next.f13320a.f15455c.mo25244d(0);
                l.mo20259D0(d);
                k.mo20259D0(d);
                if (!z || i == next.f13320a.f15453a) {
                    next.f13320a.f15455c.mo25237m(l);
                }
                next.f13320a.f15455c.mo25238l(k);
            }
        }
    }

    @Override
    public boolean mo25333L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        TdApi.FormattedText formattedText;
        boolean z2;
        boolean z3 = false;
        while (true) {
            boolean z4 = false;
            for (C4637a aVar : this.f15442V2) {
                if (aVar.f15454b == message.f25406id) {
                    C4707n nVar = aVar.f15455c;
                    int constructor = messageContent.getConstructor();
                    if (constructor == 276722716) {
                        TdApi.MessageAudio messageAudio = (TdApi.MessageAudio) messageContent;
                        TdApi.Audio audio = ((TdApi.MessageAudio) message.content).audio;
                        if (nVar == null || audio.audio.f25373id == messageAudio.audio.audio.f25373id) {
                            z2 = false;
                        } else {
                            nVar.mo25242h().m18643Y(messageAudio.audio.audio, message);
                            z2 = true;
                        }
                        formattedText = messageAudio.caption;
                    } else if (constructor == 527777781) {
                        TdApi.MessageVoiceNote messageVoiceNote = (TdApi.MessageVoiceNote) messageContent;
                        TdApi.VoiceNote voiceNote = ((TdApi.MessageVoiceNote) message.content).voiceNote;
                        if (nVar == null || voiceNote.voice.f25373id == messageVoiceNote.voiceNote.voice.f25373id) {
                            z2 = false;
                        } else {
                            nVar.mo25242h().m18643Y(messageVoiceNote.voiceNote.voice, message);
                            z2 = true;
                        }
                        formattedText = messageVoiceNote.caption;
                    } else if (constructor != 596945783) {
                        return false;
                    } else {
                        TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) messageContent;
                        TdApi.Document document = ((TdApi.MessageDocument) message.content).document;
                        if (nVar == null || document.document.f25373id == messageDocument.document.document.f25373id) {
                            z2 = false;
                        } else {
                            nVar.mo25242h().m18643Y(messageDocument.document.document, message);
                            z2 = true;
                        }
                        formattedText = messageDocument.caption;
                    }
                    aVar.f15444M = formattedText;
                    z3 = aVar.m26662t(m25945e7()) || z3;
                    if (z2 || z4) {
                        z4 = true;
                    }
                }
            }
            if (!z3) {
                return z4;
            }
            this.f15443W2.m29513w(m25945e7());
            return true;
        }
    }

    @Override
    public int mo26128M1() {
        List<C4637a> list = this.f15442V2;
        return Math.round(list.get(list.size() - 1).f15450S.m29455d());
    }

    @Override
    public void mo26070R7(C9552h1 h1Var, boolean z) {
        for (C4637a aVar : this.f15442V2) {
            aVar.f15455c.mo25242h().m18654P();
        }
    }

    @Override
    public void mo26048T7(TdApi.Message message, int i) {
        this.f15442V2.remove(i);
        this.f15443W2.m29524B(this.f15442V2, m25945e7());
    }

    @Override
    public int mo25323U1() {
        return -3;
    }

    @Override
    public void mo26038U7(TdApi.Message message, boolean z, boolean z2) {
        int Z2;
        C4637a ha = m26680ha(this, message);
        if (z2 && (Z2 = m25994Z2()) > 0) {
            ha.f15455c.mo25246a(Z2);
            if (ha.m26665q()) {
                ha.f15449R.m22642B(Z2);
                ha.f15448Q.m29463t(false);
            }
        }
        if (z) {
            this.f15442V2.add(ha);
        } else {
            this.f15442V2.add(0, ha);
        }
        this.f15443W2.m29524B(this.f15442V2, m25945e7());
        if (z2) {
            m26246A5(message.f25406id, ha.f15453a);
        }
    }

    @Override
    public boolean mo25319W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
        mo25333L9(message, messageContent2, z);
        return true;
    }

    @Override
    public int mo25222X2() {
        return Math.round(this.f15443W2.m29516t().m29476j());
    }

    @Override
    public void mo26010X7(long j) {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j) {
                aVar.f15455c.m26405Y();
            }
        }
    }

    @Override
    public void mo26007Y(TdApi.ChatType chatType) {
        for (C4637a aVar : this.f15442V2) {
            aVar.f15455c.mo25242h().m18619l(chatType);
        }
    }

    @Override
    public void mo25990Z7(long j, long j2, boolean z) {
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j) {
                aVar.f15454b = j2;
                aVar.f15455c.mo25242h().m18653P0(j, j2, z);
            }
        }
    }

    @Override
    public void mo25221a0(int i) {
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            next.f13320a.f15455c.mo25246a(i);
            Iterator<C3955n.C3958c<C5459x0>> it2 = next.f13320a.f15448Q.iterator();
            while (it2.hasNext()) {
                it2.next().f13320a.m22642B(i);
            }
            next.f13320a.f15448Q.m29463t(false);
        }
        this.f15443W2.m29513w(false);
    }

    @Override
    public int mo25980a8(long j, long j2, int i) {
        int i2 = 0;
        for (C4637a aVar : this.f15442V2) {
            if (aVar.f15454b == j2) {
                aVar.f15445N = this.f16099O0.m2769L5(j, j2);
                aVar.m26662t(m25945e7());
                i2 = 1;
            }
        }
        return i2;
    }

    @Override
    public void mo25973b8(long j, float f, boolean z) {
        if (z) {
            m25791u5();
        }
    }

    @Override
    public void mo25312c1(p291uc.C9552h1 r26, android.graphics.Canvas r27, int r28, int r29, int r30, p156kd.C6238b r31) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4636f5.mo25312c1(uc.h1, android.graphics.Canvas, int, int, int, kd.b):void");
    }

    @Override
    public int mo25218c3() {
        return Math.round(this.f15443W2.m29516t().m29478h());
    }

    @Override
    public float mo25950e2() {
        List<C4637a> list = this.f15442V2;
        return list.get(list.size() - 1).f15451T.m29455d();
    }

    @Override
    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        boolean f8 = super.mo25217f8(h1Var, motionEvent);
        for (C4637a aVar : this.f15442V2) {
            Iterator<C3955n.C3958c<C5459x0>> it = aVar.f15448Q.iterator();
            while (it.hasNext()) {
                if (it.next().f13320a.m22614x(h1Var, motionEvent)) {
                    f8 = true;
                }
            }
            if (aVar.f15455c.mo25239k(h1Var, motionEvent)) {
                f8 = true;
            }
        }
        return f8;
    }

    public final C4637a m26680ha(AbstractC4761s4 s4Var, TdApi.Message message) {
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
            nVar.m26402b0();
        }
        nVar.mo25236n(s4Var.f16101P0);
        return new C4637a(message, nVar, formattedText);
    }

    @Override
    public boolean mo25298k7() {
        return true;
    }

    @Override
    public boolean mo25295m8(View view, float f, float f2) {
        boolean m8 = super.mo25295m8(view, f, f2);
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            next.f13320a.f15455c.m26426A();
            Iterator<C3955n.C3958c<C5459x0>> it2 = next.f13320a.f15448Q.iterator();
            while (it2.hasNext()) {
                if (it2.next().f13320a.m22643A(view)) {
                    m8 = true;
                }
            }
        }
        return m8;
    }

    @Override
    public long mo25855o1(float f, float f2) {
        if (f < m25959d3() || f >= m25959d3() + mo25218c3() || f2 < m25949e3() || f2 >= m25949e3() + mo25222X2()) {
            return 0L;
        }
        Iterator<C3955n.C3958c<C4637a>> it = this.f15443W2.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C4637a> next = it.next();
            RectF q = next.m29493q();
            q.offset(0.0f, m25949e3());
            if (f2 >= q.top && f2 < q.bottom) {
                return next.f13320a.f15454b;
            }
        }
        return 0L;
    }

    @Override
    public int mo25753y3() {
        return C1357a0.m37541i(4.0f);
    }

    @Override
    public int mo25743z3() {
        List<C4637a> list = this.f15442V2;
        return C1357a0.m37541i(list.get(list.size() + (-1)).m26665q() ? 3.0f : 6.0f);
    }
}
