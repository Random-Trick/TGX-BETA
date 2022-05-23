package hd;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import eb.b;
import eb.k;
import eb.n;
import eb.r;
import eb.s;
import gd.w;
import hd.f5;
import ib.c;
import ib.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.l0;
import je.w0;
import je.x0;
import ld.p;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import vc.g1;
import vc.v2;

public class f5 extends s4 {
    public int U2;
    public final List<a> V2;
    public final n<a> W2;

    public class a implements n.d, b {
        public TdApi.FormattedText M;
        public TdApi.FormattedText N;
        public k O;
        public TdApi.FormattedText P;
        public x0 R;
        public final int f13008a;
        public long f13009b;
        public n f13010c;
        public final s S = new s(0.0f);
        public final s T = new s(1.0f);
        public final r<x0> Q = new r<>(new r.a() {
            @Override
            public final void a(r rVar) {
                f5.a.this.r(rVar);
            }
        }, db.b.f7287b, 200);

        public a(TdApi.Message message, n nVar, TdApi.FormattedText formattedText) {
            int i10 = f5.this.U2 + 1;
            f5.this.U2 = i10;
            this.f13008a = i10;
            long j10 = message.f19946id;
            this.f13009b = j10;
            this.f13010c = nVar;
            this.M = formattedText;
            this.N = f5.this.O0.P5(message.chatId, j10);
            t(false);
        }

        public void r(r rVar) {
            f5.this.W2.w(f5.this.e7());
            f5.this.u5();
        }

        @Override
        public boolean a() {
            if (!this.S.b(o())) {
                if (!this.T.b(s() ? 1.0f : 0.0f)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void b(boolean z10) {
            this.S.c(z10);
            this.T.c(z10);
        }

        @Override
        public boolean c(float f10) {
            return this.T.a(f10) || this.S.a(f10);
        }

        @Override
        public int d(boolean z10) {
            if (!z10) {
                return a0.i(3.5f);
            }
            if (!q() || !f5.this.R9() || f5.this.T9()) {
                return 0;
            }
            return Math.max(0, a0.i(10.0f) - f5.this.Y1());
        }

        @Override
        public void e() {
            this.S.e(o());
            this.T.e(s() ? 1.0f : 0.0f);
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof a) && ((a) obj).f13009b == this.f13009b);
        }

        @Override
        public void f() {
            this.S.g(o());
            this.T.g(s() ? 1.0f : 0.0f);
        }

        @Override
        public int g(boolean z10) {
            if (z10) {
                return 0;
            }
            return a0.i(3.5f);
        }

        @Override
        public int getHeight() {
            return this.f13010c.h() + (q() ? a0.i(10.0f) + this.R.getHeight() : 0);
        }

        @Override
        public int getWidth() {
            return Math.max(this.f13010c.j(), q() ? this.R.getWidth() : 0);
        }

        public int hashCode() {
            return c.d(this.f13009b);
        }

        public final int n() {
            x0 x0Var = this.R;
            if (x0Var == null) {
                return this.f13010c.K();
            }
            if (x0Var.o() != w.G2()) {
                return -1;
            }
            return this.R.p();
        }

        public final int o() {
            int n10 = n();
            return n10 == -1 || f5.this.l7(n10) ? getWidth() - f5.this.u2() : n10;
        }

        public float p() {
            k kVar = this.O;
            if (kVar != null) {
                return kVar.o() * h.d(f5.this.W2.t().i() - 1.0f);
            }
            return 0.0f;
        }

        public final boolean q() {
            return !e.c1(this.P);
        }

        public final boolean s() {
            int n10 = n();
            return n10 == -1 || f5.this.l7(n10);
        }

        public final boolean t(boolean z10) {
            TdApi.FormattedText formattedText = this.N;
            if (formattedText == null) {
                formattedText = this.M;
            }
            if (e.O(this.P, formattedText)) {
                return false;
            }
            x0 x0Var = null;
            this.P = e.c1(formattedText) ? null : formattedText;
            if (!e.c1(formattedText)) {
                String str = formattedText.text;
                w0 L4 = s4.L4();
                je.k K4 = f5.this.K4();
                f5 f5Var = f5.this;
                x0Var = new x0(str, L4, K4, l0.F(f5Var.O0, formattedText, f5Var.h8())).a(Log.TAG_GIF_LOADER).D(f5.this.F0());
                x0Var.H(f5.this.P0);
                x0Var.B(f5.this.Y2());
            }
            r<x0> rVar = this.Q;
            this.R = x0Var;
            rVar.u(x0Var, z10);
            return true;
        }
    }

    public f5(v2 v2Var, TdApi.Message message) {
        super(v2Var, message);
        ArrayList arrayList = new ArrayList();
        this.V2 = arrayList;
        n<a> nVar = new n<>(new n.b() {
            @Override
            public final void a(n nVar2) {
                f5.this.ga(nVar2);
            }
        }, db.b.f7287b, 200L);
        this.W2 = nVar;
        arrayList.add(ha(this, message));
        nVar.B(arrayList, false);
    }

    public void ga(n nVar) {
        if (A8()) {
            K8();
        } else {
            u5();
        }
    }

    @Override
    public void D7(long j10, k kVar) {
        for (a aVar : this.V2) {
            if (aVar.f13009b == j10) {
                aVar.O = kVar;
                return;
            }
        }
    }

    @Override
    public boolean I5() {
        for (a aVar : this.V2) {
            if (aVar.N != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int J1() {
        List<a> list = this.V2;
        return Math.round(list.get(list.size() - 1).S.d());
    }

    @Override
    public void L8(ld.b bVar, boolean z10, int i10) {
        Iterator<n.c<a>> it = this.W2.iterator();
        while (it.hasNext()) {
            n.c<a> next = it.next();
            if (!z10 || i10 <= 0 || next.f11479a.f13008a == i10) {
                p k10 = bVar.k(next.f11479a.f13008a);
                ld.c l10 = bVar.l(next.f11479a.f13008a);
                int c10 = next.f11479a.f13010c.c(0);
                l10.E0(c10);
                k10.E0(c10);
                if (!z10 || i10 == next.f11479a.f13008a) {
                    next.f11479a.f13010c.n(l10);
                }
                next.f11479a.f13010c.m(k10);
            }
        }
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        TdApi.FormattedText formattedText;
        boolean z11;
        boolean z12 = false;
        while (true) {
            boolean z13 = false;
            for (a aVar : this.V2) {
                if (aVar.f13009b == message.f19946id) {
                    n nVar = aVar.f13010c;
                    int constructor = messageContent.getConstructor();
                    if (constructor == 276722716) {
                        TdApi.MessageAudio messageAudio = (TdApi.MessageAudio) messageContent;
                        TdApi.Audio audio = ((TdApi.MessageAudio) message.content).audio;
                        if (nVar == null || audio.audio.f19913id == messageAudio.audio.audio.f19913id) {
                            z11 = false;
                        } else {
                            nVar.f().a0(messageAudio.audio.audio, message);
                            z11 = true;
                        }
                        formattedText = messageAudio.caption;
                    } else if (constructor == 527777781) {
                        TdApi.MessageVoiceNote messageVoiceNote = (TdApi.MessageVoiceNote) messageContent;
                        TdApi.VoiceNote voiceNote = ((TdApi.MessageVoiceNote) message.content).voiceNote;
                        if (nVar == null || voiceNote.voice.f19913id == messageVoiceNote.voiceNote.voice.f19913id) {
                            z11 = false;
                        } else {
                            nVar.f().a0(messageVoiceNote.voiceNote.voice, message);
                            z11 = true;
                        }
                        formattedText = messageVoiceNote.caption;
                    } else if (constructor != 596945783) {
                        return false;
                    } else {
                        TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) messageContent;
                        TdApi.Document document = ((TdApi.MessageDocument) message.content).document;
                        if (nVar == null || document.document.f19913id == messageDocument.document.document.f19913id) {
                            z11 = false;
                        } else {
                            nVar.f().a0(messageDocument.document.document, message);
                            z11 = true;
                        }
                        formattedText = messageDocument.caption;
                    }
                    aVar.M = formattedText;
                    z12 = aVar.t(e7()) || z12;
                    if (z11 || z13) {
                        z13 = true;
                    }
                }
            }
            if (!z12) {
                return z13;
            }
            this.W2.w(e7());
            return true;
        }
    }

    @Override
    public int R1() {
        return -3;
    }

    @Override
    public void R7(g1 g1Var, boolean z10) {
        for (a aVar : this.V2) {
            aVar.f13010c.f().R();
        }
    }

    @Override
    public void T7(TdApi.Message message, int i10) {
        this.V2.remove(i10);
        this.W2.B(this.V2, e7());
    }

    @Override
    public void U7(TdApi.Message message, boolean z10, boolean z11) {
        int Y2;
        a ha2 = ha(this, message);
        if (z11 && (Y2 = Y2()) > 0) {
            ha2.f13010c.a(Y2);
            if (ha2.q()) {
                ha2.R.B(Y2);
                ha2.Q.t(false);
            }
        }
        if (z10) {
            this.V2.add(ha2);
        } else {
            this.V2.add(0, ha2);
        }
        this.W2.B(this.V2, e7());
        if (z11) {
            z5(message.f19946id, ha2.f13008a);
        }
    }

    @Override
    public int W2() {
        return Math.round(this.W2.t().j());
    }

    @Override
    public boolean W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z10) {
        L9(message, messageContent2, z10);
        return true;
    }

    @Override
    public void X7(long j10) {
        for (a aVar : this.V2) {
            if (aVar.f13009b == j10) {
                aVar.f13010c.Z();
            }
        }
    }

    @Override
    public void Z(TdApi.ChatType chatType) {
        for (a aVar : this.V2) {
            aVar.f13010c.f().m(chatType);
        }
    }

    @Override
    public void Z7(long j10, long j11, boolean z10) {
        for (a aVar : this.V2) {
            if (aVar.f13009b == j10) {
                aVar.f13009b = j11;
                aVar.f13010c.f().V0(j10, j11, z10);
            }
        }
    }

    @Override
    public int a3() {
        return Math.round(this.W2.t().h());
    }

    @Override
    public int a8(long j10, long j11, int i10) {
        int i11 = 0;
        for (a aVar : this.V2) {
            if (aVar.f13009b == j11) {
                aVar.N = this.O0.P5(j10, j11);
                aVar.t(e7());
                i11 = 1;
            }
        }
        return i11;
    }

    @Override
    public void b0(int i10) {
        Iterator<n.c<a>> it = this.W2.iterator();
        while (it.hasNext()) {
            n.c<a> next = it.next();
            next.f11479a.f13010c.a(i10);
            Iterator<n.c<x0>> it2 = next.f11479a.Q.iterator();
            while (it2.hasNext()) {
                it2.next().f11479a.B(i10);
            }
            next.f11479a.Q.t(false);
        }
        this.W2.w(false);
    }

    @Override
    public void b1(vc.g1 r26, android.graphics.Canvas r27, int r28, int r29, int r30, ld.b r31) {
        throw new UnsupportedOperationException("Method not decompiled: hd.f5.b1(vc.g1, android.graphics.Canvas, int, int, int, ld.b):void");
    }

    @Override
    public float b2() {
        List<a> list = this.V2;
        return list.get(list.size() - 1).T.d();
    }

    @Override
    public void b8(long j10, float f10, boolean z10) {
        if (z10) {
            u5();
        }
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        boolean f82 = super.f8(g1Var, motionEvent);
        for (a aVar : this.V2) {
            Iterator<n.c<x0>> it = aVar.Q.iterator();
            while (it.hasNext()) {
                if (it.next().f11479a.x(g1Var, motionEvent)) {
                    f82 = true;
                }
            }
            if (aVar.f13010c.l(g1Var, motionEvent)) {
                f82 = true;
            }
        }
        return f82;
    }

    public final a ha(s4 s4Var, TdApi.Message message) {
        n nVar;
        TdApi.FormattedText formattedText;
        int constructor = message.content.getConstructor();
        boolean z10 = true;
        if (constructor == 276722716) {
            TdApi.MessageAudio messageAudio = (TdApi.MessageAudio) message.content;
            nVar = new n(s4Var, messageAudio.audio, message, s4Var.N0);
            formattedText = messageAudio.caption;
        } else if (constructor == 527777781) {
            TdApi.MessageVoiceNote messageVoiceNote = (TdApi.MessageVoiceNote) message.content;
            nVar = new n(s4Var, messageVoiceNote.voiceNote, message, s4Var.N0);
            formattedText = messageVoiceNote.caption;
            z10 = false;
        } else if (constructor == 596945783) {
            TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
            nVar = new n(s4Var, messageDocument.document);
            formattedText = messageDocument.caption;
        } else {
            throw new IllegalArgumentException(message.content.toString());
        }
        if (z10) {
            nVar.c0();
        }
        nVar.p(s4Var.P0);
        return new a(message, nVar, formattedText);
    }

    @Override
    public boolean k7() {
        return true;
    }

    @Override
    public long m1(float f10, float f11) {
        if (f10 < b3() || f10 >= b3() + a3() || f11 < c3() || f11 >= c3() + W2()) {
            return 0L;
        }
        Iterator<n.c<a>> it = this.W2.iterator();
        while (it.hasNext()) {
            n.c<a> next = it.next();
            RectF q10 = next.q();
            q10.offset(0.0f, c3());
            if (f11 >= q10.top && f11 < q10.bottom) {
                return next.f11479a.f13009b;
            }
        }
        return 0L;
    }

    @Override
    public boolean m8(View view, float f10, float f11) {
        boolean m82 = super.m8(view, f10, f11);
        Iterator<n.c<a>> it = this.W2.iterator();
        while (it.hasNext()) {
            n.c<a> next = it.next();
            next.f11479a.f13010c.D();
            Iterator<n.c<x0>> it2 = next.f11479a.Q.iterator();
            while (it2.hasNext()) {
                if (it2.next().f11479a.A(view)) {
                    m82 = true;
                }
            }
        }
        return m82;
    }

    @Override
    public int v3() {
        return a0.i(4.0f);
    }

    @Override
    public int w3() {
        List<a> list = this.V2;
        return a0.i(list.get(list.size() + (-1)).q() ? 3.0f : 6.0f);
    }
}
