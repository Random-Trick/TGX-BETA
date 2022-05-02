package gd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1363c0;
import be.C1399s0;
import be.C1410y;
import ie.AbstractC5411l0;
import ie.C5459x0;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import me.C6918i3;
import me.RunnableC6969m2;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2776nk;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3955n;
import p051db.C3965r;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p124ib.C5320c;
import p139jb.AbstractC5911c;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6246h;
import p156kd.C6257p;
import p193nb.C7321e;
import p291uc.C9552h1;
import p291uc.C9678w2;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.C9357x2;

public class C4792t5 extends AbstractC4761s4 implements C4336c.AbstractC4337a, C6238b.AbstractC6239a, C9357x2.AbstractC9374m {
    public C4796d f16299U2;
    public C4796d f16300V2;
    public C4794b[] f16301W2;
    public RunnableC6969m2 f16302X2;
    public RunnableC6969m2 f16303Y2;
    public int f16304Z2;
    public RunnableC5390g f16305a3;
    public String f16307c3;
    public int f16308d3;
    public final C3940f f16309e3;
    public final C3965r<C4793a> f16310f3;
    public C5459x0 f16311g3;
    public C3950k f16312h3;
    public float f16313i3;
    public C3955n<C4797e> f16315k3;
    public Drawable f16316l3;
    public Drawable f16317m3;
    public float f16318n3;
    public String f16320p3;
    public float f16321q3;
    public C9357x2.C9370l f16323s3;
    public int f16306b3 = -1;
    public int f16319o3 = -1;
    public int f16322r3 = -1;
    public int f16324t3 = -1;
    public final C4336c f16314j3 = new C4336c(this);

    public static class C4793a {
        public final int f16325a;
        public final RunnableC5390g f16326b;
        public final boolean f16327c;

        public C4793a(int i, RunnableC5390g gVar, boolean z) {
            this.f16325a = i;
            this.f16326b = gVar;
            this.f16327c = z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4793a) {
                C4793a aVar = (C4793a) obj;
                if (aVar.f16325a == this.f16325a && aVar.f16326b.mo22957a().equals(this.f16326b.mo22957a())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class C4794b implements AbstractC5911c {
        public float f16328M;
        public C6918i3 f16329N;
        public C5459x0 f16330O;
        public RunnableC6969m2 f16331P;
        public C3940f f16332Q;
        public int f16333a = -1;
        public String f16334b;
        public int f16335c;

        @Override
        public void mo4501a3() {
            RunnableC6969m2 m2Var = this.f16331P;
            if (m2Var != null) {
                m2Var.mo4501a3();
                this.f16331P = null;
            }
            C6918i3 i3Var = this.f16329N;
            if (i3Var != null) {
                i3Var.m18467a();
                this.f16329N = null;
            }
        }

        public float m25262p() {
            if (this.f16332Q != null) {
                return 1.0f - this.f16328M;
            }
            return 0.0f;
        }

        public float m25261q() {
            float f = this.f16328M;
            C3940f fVar = this.f16332Q;
            return Math.max(f, fVar != null ? fVar.m29586g() : 0.0f);
        }

        public boolean m25260r() {
            C3940f fVar = this.f16332Q;
            return fVar != null && fVar.m29585h();
        }
    }

    public static class C4795c {
        public TdApi.PollOption f16336a;
        public final float f16337b;
        public final float f16338c;

        public C4795c(TdApi.PollOption pollOption, float f, float f2) {
            this.f16336a = pollOption;
            this.f16337b = f;
            this.f16338c = f2;
        }
    }

    public static class C4797e {
        public final long f16348a;
        public final C6246h f16349b;
        public final C4587b f16350c;

        public C4797e(C10930q6 q6Var, long j) {
            this.f16348a = j;
            C6246h w2 = q6Var.m2480e2().m1579w2(j);
            this.f16349b = w2;
            if (w2 != null) {
                w2.mo20768t0(C1357a0.m37544i(9.0f) * 2);
            }
            this.f16350c = q6Var.m2480e2().m1713M2(j, false, 9.0f, null);
        }

        public void m25249c(Canvas canvas, AbstractC4761s4 s4Var, C6238b bVar, float f, float f2, float f3) {
            int i;
            if (f3 != 0.0f) {
                C6257p k = this.f16349b != null ? bVar.m20993k(this.f16348a) : null;
                int i2 = C1357a0.m37544i(9.0f);
                int a3 = s4Var.m25986a3();
                int i3 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
                boolean z = i3 != 0;
                if (z) {
                    float f4 = (f3 * 0.5f) + 0.5f;
                    i = C1399s0.m37202V(canvas);
                    canvas.scale(f4, f4, f, f2);
                } else {
                    i = -1;
                }
                float f5 = i2;
                canvas.drawCircle(f, f2, (C1357a0.m37544i(1.0f) * f3 * 0.5f) + f5, C1410y.m37056Y(a3, C1357a0.m37544i(1.0f) * f3));
                if (k != null) {
                    if (i3 != 0) {
                        k.mo20251U(k.mo20253R0() * f3);
                    }
                    k.mo20257K0((int) (f - f5), (int) (f2 - f5), (int) (f + f5), (int) (f2 + f5));
                    if (k.mo20247c0()) {
                        k.mo20237m1(canvas, i2, C5064d.m24132a(f3, C11524j.m241G0()));
                    }
                    k.draw(canvas);
                    if (i3 != 0) {
                        k.mo20254P();
                    }
                } else {
                    C4587b bVar2 = this.f16350c;
                    if (bVar2 != null) {
                        bVar2.m27216b(canvas, f, f2, f3);
                    }
                }
                if (z) {
                    C1399s0.m37204T(canvas, i);
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4797e) && ((C4797e) obj).f16348a == this.f16348a;
        }

        public int hashCode() {
            long j = this.f16348a;
            return (int) (j ^ (j >>> 32));
        }
    }

    public C4792t5(C9678w2 w2Var, TdApi.Message message, TdApi.Poll poll) {
        super(w2Var, message);
        this.f16299U2 = new C4796d(this.f16099O0, poll);
        if (!poll.isAnonymous || m25343Fa()) {
            this.f16309e3 = new C3940f(2, this, C2057b.f7280b, 120L);
            this.f16310f3 = new C3965r<>(new C3965r.AbstractC3966a() {
                @Override
                public final void mo7848a(C3965r rVar) {
                    C4792t5.this.m25340Ha(rVar);
                }
            });
            return;
        }
        this.f16309e3 = null;
        this.f16310f3 = null;
    }

    public void m25340Ha(C3965r rVar) {
        m25792u5();
    }

    public void m25338Ia(View view, Rect rect) {
        int height = this.f16311g3.getHeight() + C1357a0.m37544i(5.0f) + C1357a0.m37544i(18.0f);
        for (C4794b bVar : this.f16301W2) {
            height += Math.max(C1357a0.m37544i(46.0f), bVar.f16330O.getHeight()) + C1357a0.m37529x();
        }
        rect.set(0, height, mo25219c3(), mo25223X2());
    }

    public void m25337Ja(int i, View view, Rect rect) {
        int height = this.f16311g3.getHeight() + C1357a0.m37544i(5.0f) + C1357a0.m37544i(18.0f);
        int i2 = 0;
        for (C4794b bVar : this.f16301W2) {
            int wa = m25284wa(bVar.f16330O);
            if (i == i2) {
                int i3 = C1357a0.m37544i(12.0f);
                int i4 = height + C1357a0.m37544i(22.0f);
                int i5 = C1357a0.m37544i(9.0f);
                rect.set(i3 - i5, i4 - i5, i3 + i5, i4 + i5);
                return;
            }
            height += wa;
            i2++;
        }
        rect.set(0, 0, 0, 0);
    }

    public void m25336Ka(int i, View view, Rect rect) {
        C4794b[] bVarArr;
        int height = this.f16311g3.getHeight() + C1357a0.m37544i(5.0f) + C1357a0.m37544i(18.0f);
        int i2 = 0;
        for (C4794b bVar : this.f16301W2) {
            int wa = m25284wa(bVar.f16330O);
            if (i == i2) {
                int i3 = height + C1357a0.m37544i(15.0f);
                rect.set(C1357a0.m37544i(34.0f), i3, C1357a0.m37544i(34.0f) + bVar.f16330O.m22619t(0), bVar.f16330O.m22620s() + i3);
                return;
            }
            height += wa;
            i2++;
        }
        rect.set(0, 0, 0, 0);
    }

    public void m25333La(View view, Rect rect) {
        rect.set(0, 0, this.f16311g3.getWidth(), this.f16311g3.getHeight());
    }

    public static String m25332Ma(int i) {
        return i + "%";
    }

    public static float m25295ma(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public static int m25294na(int i, int i2, float f) {
        return i + m25293oa((i2 - i) * f);
    }

    public static int m25293oa(float f) {
        return (int) f;
    }

    public final float m25348Aa(int i) {
        C4796d dVar = this.f16300V2;
        if (dVar != null) {
            float f = this.f16313i3;
            if (f != 0.0f) {
                if (f == 1.0f) {
                    return dVar.f16341c[i].f16337b;
                }
                return m25295ma(this.f16299U2.f16341c[i].f16337b, this.f16300V2.f16341c[i].f16337b, this.f16313i3);
            }
        }
        if (this.f16299U2.f16345g) {
            return this.f16299U2.f16341c[i].f16337b;
        }
        return 0.0f;
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    public final float m25347Ba() {
        C4796d dVar = this.f16300V2;
        if (dVar != null) {
            float f = this.f16313i3;
            if (f != 0.0f) {
                if (f == 1.0f) {
                    return dVar.f16342d;
                }
                return m25295ma(this.f16299U2.f16342d, this.f16300V2.f16342d, this.f16313i3);
            }
        }
        return this.f16299U2.f16342d;
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        int i = this.f16322r3;
        if (i != -1) {
            if (i == -3) {
                m25307eb(view);
            } else {
                if (i == -2) {
                    if (this.f16310f3.m29463v() != null) {
                        if (m25882l6()) {
                            m26233B9(view, new C9357x2.AbstractC9363f() {
                                @Override
                                public final void mo8098f1(View view2, Rect rect) {
                                    C4792t5.this.m25338Ia(view2, rect);
                                }
                            }, R.string.ErrorScheduled);
                        } else {
                            int i2 = this.f16310f3.m29463v().f13320a.f16325a;
                            if (i2 == R.id.btn_viewResults) {
                                View$OnClickListenerC2776nk nkVar = new View$OnClickListenerC2776nk(mo4347s(), mo4348c());
                                TdApi.Poll xa = m25283xa();
                                TdApi.Message message = this.f16122a;
                                nkVar.m9476Ad(new View$OnClickListenerC2776nk.C2779b(xa, message.chatId, message.f25409id));
                                m25966c7(nkVar);
                            } else if (i2 == R.id.btn_vote) {
                                C5320c cVar = new C5320c(this.f16301W2.length);
                                C5320c cVar2 = new C5320c(cVar.m23279g());
                                int i3 = 0;
                                for (C4794b bVar : this.f16301W2) {
                                    if (bVar.m25260r()) {
                                        cVar.m23285a(i3);
                                    }
                                    if (m25283xa().options[i3].isBeingChosen) {
                                        cVar2.m23285a(i3);
                                    }
                                    i3++;
                                }
                                int[] e = cVar.m23281e();
                                if (Arrays.equals(e, cVar2.m23281e())) {
                                    Client r4 = this.f16099O0.m2270r4();
                                    TdApi.Message message2 = this.f16122a;
                                    r4.m14783o(new TdApi.SetPollAnswer(message2.chatId, message2.f25409id, null), this.f16099O0.m2392ja());
                                } else {
                                    Client r42 = this.f16099O0.m2270r4();
                                    TdApi.Message message3 = this.f16122a;
                                    r42.m14783o(new TdApi.SetPollAnswer(message3.chatId, message3.f25409id, e), this.f16099O0.m2392ja());
                                }
                            }
                        }
                    }
                } else if (m25882l6()) {
                    final int i4 = this.f16322r3;
                    m26233B9(view, new C9357x2.AbstractC9363f() {
                        @Override
                        public final void mo8098f1(View view2, Rect rect) {
                            C4792t5.this.m25337Ja(i4, view2, rect);
                        }
                    }, R.string.ErrorScheduled);
                } else if (!m25298ka(true)) {
                    final int i5 = this.f16322r3;
                    m26223C9(view, new C9357x2.AbstractC9363f() {
                        @Override
                        public final void mo8098f1(View view2, Rect rect) {
                            C4792t5.this.m25336Ka(i5, view2, rect);
                        }
                    }, C4779t2.m25726A5(m25287ta(m25283xa(), m25283xa().options[i5].voterCount), false));
                } else if (m25343Fa()) {
                    m25327Ra(this.f16322r3);
                } else {
                    m25297la(this.f16322r3);
                }
            }
            this.f16322r3 = -1;
        }
    }

    public final float m25346Ca() {
        C4796d dVar = this.f16300V2;
        if (dVar != null) {
            float f = this.f16313i3;
            if (f != 0.0f) {
                if (f == 1.0f) {
                    return dVar.f16343e;
                }
                return m25295ma(this.f16299U2.f16343e, this.f16300V2.f16343e, this.f16313i3);
            }
        }
        return this.f16299U2.f16343e;
    }

    public final boolean m25345Da() {
        return C4779t2.m25410v2(m25283xa());
    }

    public boolean m25344Ea() {
        return this.f16299U2.f16339a.isAnonymous;
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    public final boolean m25343Fa() {
        return C4779t2.m25472m3(m25283xa());
    }

    public final boolean m25342Ga() {
        return m25283xa().type.getConstructor() == 657013913;
    }

    @Override
    public void mo25341H7(int i, float f, C3950k kVar) {
        C4794b[] bVarArr;
        if (i == 0 && f == 1.0f && this.f16300V2 != null) {
            m25325Ta(1.0f);
            if (m25343Fa() && m25345Da()) {
                for (C4794b bVar : this.f16301W2) {
                    if (bVar.f16332Q != null) {
                        bVar.f16332Q.m29577p(false, false);
                        bVar.f16332Q = null;
                    }
                }
            }
            this.f16299U2 = this.f16300V2;
            this.f16300V2 = null;
            this.f16312h3.m29543l(0.0f);
            this.f16313i3 = 0.0f;
        }
    }

    @Override
    public void mo25339I7(int i, float f, float f2) {
        if (i == 0) {
            m25325Ta(f);
        } else if (i == 1 || i == 2) {
            m25792u5();
        }
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    @Override
    public void mo25335L8(C6238b bVar, boolean z, int i) {
        C3955n<C4797e> nVar = this.f16315k3;
        if (nVar != null) {
            Iterator<C3955n.C3958c<C4797e>> it = nVar.iterator();
            while (it.hasNext()) {
                C3955n.C3958c<C4797e> next = it.next();
                C6257p k = bVar.m20993k(next.f13320a.f16348a);
                k.mo20260D0(C1357a0.m37544i(9.0f));
                k.m20820G(next.f13320a.f16349b);
            }
        }
        bVar.m20998f(this);
    }

    @Override
    public boolean mo25334L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        m25300ja(((TdApi.MessagePoll) messageContent).poll);
        return true;
    }

    public final RunnableC6969m2 m25331Na(boolean z) {
        RunnableC6969m2 m2Var = new RunnableC6969m2(mo4347s(), C1357a0.m37544i(z ? 3.0f : 9.0f));
        m2Var.m18270t(true);
        m2Var.m18291E(this.f16101P0);
        m2Var.m18286d(0);
        return m2Var;
    }

    public final void m25330Oa(TdApi.PollOption[] pollOptionArr) {
        int length = pollOptionArr.length;
        C4794b[] bVarArr = this.f16301W2;
        if (bVarArr == null) {
            this.f16301W2 = new C4794b[length];
            for (int i = 0; i < length; i++) {
                this.f16301W2[i] = new C4794b();
                if (pollOptionArr[i].isBeingChosen && m25343Fa()) {
                    this.f16301W2[i].f16332Q = new C3940f(1, this, C2057b.f7280b, 165L, true);
                }
            }
        } else if (length != bVarArr.length) {
            this.f16301W2 = (C4794b[]) C5062b.m24179D(bVarArr, length);
            for (int length2 = bVarArr.length; length2 < length; length2++) {
                this.f16301W2[length2] = new C4794b();
                if (pollOptionArr[length2].isBeingChosen && m25343Fa()) {
                    this.f16301W2[length2].f16332Q = new C3940f(1, this, C2057b.f7280b, 165L, true);
                }
            }
        }
    }

    public final void m25329Pa(TdApi.PollOption[] pollOptionArr) {
        m25330Oa(pollOptionArr);
        int i = 0;
        if (!m25343Fa()) {
            int length = pollOptionArr.length;
            int i2 = 0;
            while (i < length) {
                if (pollOptionArr[i].isBeingChosen && this.f16301W2[i2].f16331P == null) {
                    m25281za(i2);
                }
                i2++;
                i++;
            }
        } else if (this.f16302X2 == null) {
            int length2 = pollOptionArr.length;
            while (i < length2) {
                if (pollOptionArr[i].isBeingChosen) {
                    m25291qa();
                    return;
                }
                i++;
            }
        }
    }

    public final void m25328Qa(boolean z) {
        C3950k kVar = this.f16312h3;
        if (kVar != null) {
            kVar.m29544k();
            this.f16312h3.m29543l(0.0f);
        }
        C4796d dVar = this.f16300V2;
        if (dVar != null) {
            if (z) {
                this.f16299U2 = new C4796d(this.f16099O0, this.f16299U2, dVar, this.f16313i3);
            }
            this.f16300V2 = null;
        }
        C3955n<C4797e> nVar = this.f16315k3;
        if (nVar != null) {
            nVar.m29524D(z);
        }
        C3965r<C4793a> rVar = this.f16310f3;
        if (rVar != null) {
            rVar.m29461x(z);
        }
        this.f16313i3 = 0.0f;
    }

    public final void m25327Ra(int i) {
        if (this.f16301W2[i].f16332Q == null) {
            this.f16301W2[i].f16332Q = new C3940f(1, this, C2057b.f7280b, 165L);
        }
        this.f16301W2[i].f16332Q.m29575r(m25946e7());
        m25305fb(m25946e7());
    }

    public final void m25326Sa(boolean z) {
        String str;
        int i;
        if (this.f16310f3 != null) {
            boolean z2 = false;
            if (m25343Fa() && !m25345Da() && m25298ka(false)) {
                i = R.id.btn_vote;
                str = C4403w.m27871i1(R.string.Vote);
            } else if (m25344Ea() || (!m25345Da() && m25298ka(false))) {
                str = null;
                i = 0;
            } else {
                i = R.id.btn_viewResults;
                int i2 = m25283xa().totalVoterCount;
                if (m25298ka(false) && !C4779t2.m25410v2(m25283xa())) {
                    i2++;
                }
                if (i2 == 0 && m25283xa().isClosed) {
                    str = C4403w.m27871i1(m25342Ga() ? R.string.NoAnswersResult : R.string.NoVotesResult);
                    z2 = true;
                } else if (i2 > 1) {
                    str = C4403w.m27846o2(m25342Ga() ? R.string.ViewXQuizResults : R.string.ViewXPollResults, i2);
                } else {
                    str = C4403w.m27871i1(m25342Ga() ? R.string.ViewQuizResults : R.string.ViewPollResults);
                }
            }
            if (str != null) {
                this.f16310f3.m29464u(new C4793a(i, new RunnableC5390g.C5392b(str, m25995Z2(), z2 ? C1410y.m37086A0(12.0f) : AbstractC4761s4.m25921h4(), z2 ? m25845p3() : m26033V3()).m22869v().m22888c(!z2).m22885f(), z2), z);
            } else {
                this.f16310f3.m29468m(z);
            }
            m25305fb(z);
        }
    }

    public final void m25325Ta(float f) {
        if (this.f16313i3 != f) {
            this.f16313i3 = f;
            C3955n<C4797e> nVar = this.f16315k3;
            if (nVar != null) {
                nVar.m29522i(f);
            }
            C3965r<C4793a> rVar = this.f16310f3;
            if (rVar != null) {
                rVar.m29469i(f);
            }
            m25311cb();
            m25303gb();
            RunnableC6969m2 m2Var = this.f16303Y2;
            if (m2Var != null) {
                m2Var.m18275o(m25346Ca());
            }
            m25792u5();
        }
    }

    @Override
    public int mo25324U1() {
        return this.f16308d3;
    }

    public final void m25323Ua(float f) {
        if (this.f16318n3 != f) {
            this.f16318n3 = f;
            if (m25285va() > 0.0f) {
                m25792u5();
            }
        }
    }

    @Override
    public void mo25322V7() {
        C4794b[] bVarArr = this.f16301W2;
        if (bVarArr != null) {
            for (C4794b bVar : bVarArr) {
                bVar.mo4501a3();
            }
        }
    }

    public final void m25321Va(int i, View view, float f, float f2) {
        if (this.f16324t3 != i) {
            this.f16324t3 = i;
            m25792u5();
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    @Override
    public boolean mo25320W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
        if (messageContent2.getConstructor() != -662130099) {
            return false;
        }
        m25300ja(((TdApi.MessagePoll) messageContent2).poll);
        return true;
    }

    public final void m25319Wa(TdApi.PollOption[] pollOptionArr) {
        m25330Oa(pollOptionArr);
        int i = 0;
        for (TdApi.PollOption pollOption : pollOptionArr) {
            if (this.f16301W2[i].f16330O == null || !C5070i.m24068c(this.f16301W2[i].f16330O.m22617v(), pollOption.text)) {
                this.f16301W2[i].f16330O = new C5459x0(pollOption.text, AbstractC4761s4.m26126M4(), m26135L4(), null).m22637H(this.f16101P0);
            }
            i++;
        }
    }

    @Override
    public int mo25223X2() {
        C5459x0 x0Var = this.f16311g3;
        int height = (x0Var != null ? x0Var.getHeight() : 0) + C1357a0.m37544i(5.0f) + C1357a0.m37544i(18.0f);
        C4794b[] bVarArr = this.f16301W2;
        if (bVarArr != null) {
            for (C4794b bVar : bVarArr) {
                height += m25284wa(bVar.f16330O);
            }
        } else {
            height += (C1357a0.m37544i(46.0f) + C1357a0.m37529x()) * m25283xa().options.length;
        }
        int i = height + C1357a0.m37544i(10.0f) + C1357a0.m37544i(14.0f) + C1357a0.m37544i(12.0f);
        return m26069R9() ? i + C1357a0.m37544i(8.0f) : i;
    }

    public final void m25318Xa(int i, int i2) {
        C4794b[] bVarArr = this.f16301W2;
        if (bVarArr != null && bVarArr[i].f16333a != i2) {
            this.f16301W2[i].f16333a = i2;
            this.f16301W2[i].f16334b = m25332Ma(i2);
            C4794b[] bVarArr2 = this.f16301W2;
            bVarArr2[i].f16335c = (int) C7389v0.m16680T1(bVarArr2[i].f16334b, C1410y.m37065P(13.0f, false));
        }
    }

    public final void m25317Ya(boolean z, TdApi.PollOption[] pollOptionArr) {
        m25330Oa(pollOptionArr);
        for (int i = 0; i < pollOptionArr.length; i++) {
            m25318Xa(i, z ? pollOptionArr[i].votePercentage : 0);
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    public final void m25316Za(int i) {
        int i2;
        if (this.f16304Z2 != i) {
            this.f16304Z2 = i;
            int constructor = m25283xa().type.getConstructor();
            if (constructor != 641265698) {
                if (constructor != 657013913) {
                    throw new IllegalArgumentException(m25283xa().type.toString());
                } else if (i == 2) {
                    i2 = R.string.QuizResults;
                } else {
                    i2 = m25283xa().isAnonymous ? R.string.QuizAnonymous : R.string.QuizPublic;
                }
            } else if (i == 2) {
                i2 = R.string.PollResults;
            } else {
                i2 = m25283xa().isAnonymous ? R.string.PollAnonymous : R.string.PollPublic;
            }
            this.f16305a3 = new RunnableC5390g.C5392b(C4403w.m27871i1(i2), m25995Z2(), C1410y.m37086A0(12.0f), m25845p3()).m22869v().m22885f();
        }
    }

    @Override
    public void mo25222a0(int i) {
        if (this.f16311g3 == null) {
            m25314bb(this.f16299U2.f16339a.recentVoterUserIds, false);
            m25315ab(this.f16299U2.f16339a.question);
            m25319Wa(this.f16299U2.f16339a.options);
            m25329Pa(this.f16299U2.f16339a.options);
            m25311cb();
            m25326Sa(false);
        }
        this.f16311g3.m22643B(i);
        int i2 = i - C1357a0.m37544i(34.0f);
        for (C4794b bVar : this.f16301W2) {
            bVar.f16330O.m22643B(i2);
        }
    }

    public final void m25315ab(String str) {
        C5459x0 x0Var = this.f16311g3;
        if (x0Var == null || !C5070i.m24068c(x0Var.m22617v(), str)) {
            this.f16311g3 = new C5459x0(this.f16299U2.f16339a.question, AbstractC4761s4.m26077R1(), m26135L4(), new AbstractC5411l0[]{AbstractC5411l0.m22792D(this.f16099O0, this.f16299U2.f16339a.question, new TdApi.TextEntity(0, this.f16299U2.f16339a.question.length(), new TdApi.TextEntityTypeBold()), null)}).m22637H(this.f16101P0);
        }
    }

    @Override
    public void mo25221b1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z;
        C4794b bVar;
        float f;
        int i7;
        C4794b[] bVarArr;
        int i8;
        int i9;
        int max;
        float f2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f3;
        float f4;
        int i16;
        int i17;
        C4794b bVar2;
        C4796d dVar;
        int i18;
        float f5;
        int i19;
        float f6;
        int i20 = i;
        int J4 = m26155J4();
        int m3 = m25874m3();
        int i21 = C1357a0.m37544i(12.0f);
        int i22 = i20 + i3;
        this.f16311g3.m22631h(canvas, i, i22, 0, i2, null, 1.0f);
        float f7 = 5.0f;
        int height = i2 + this.f16311g3.getHeight() + C1357a0.m37544i(5.0f);
        this.f16305a3.m22904t(canvas, i20, height);
        float va2 = m25285va();
        float f8 = 0.0f;
        if (va2 > 0.0f) {
            Drawable ua2 = m25286ua(false);
            float minimumWidth = (i22 - (ua2.getMinimumWidth() / 2.0f)) - C1357a0.m37544i(2.0f);
            float height2 = height + (this.f16305a3.getHeight() / 2.0f);
            if (this.f16318n3 < 1.0f) {
                C1362c.m37490b(canvas, ua2, minimumWidth - (ua2.getMinimumWidth() / 2.0f), height2 - (ua2.getMinimumHeight() / 2.0f), va2 == 1.0f ? m25815s3() : C1410y.m37058W(C5064d.m24132a(va2, m3)));
            }
            if (this.f16318n3 > 0.0f) {
                Drawable ua3 = m25286ua(true);
                int q4 = m25833q4();
                int i23 = C1357a0.m37544i(2.0f);
                C1362c.m37490b(canvas, ua3, minimumWidth - (ua2.getMinimumWidth() / 2.0f), height2 - (ua2.getMinimumHeight() / 2.0f), C1410y.m37058W(C5064d.m24132a(this.f16318n3 * va2, q4)));
                float i24 = height2 - C1357a0.m37544i(2.5f);
                int a = C5064d.m24132a(va2 * this.f16318n3, q4);
                int i25 = C1357a0.m37544i(2.5f);
                float i26 = C1357a0.m37544i(6.0f) + C1357a0.m37544i(3.0f);
                float f9 = i25 * this.f16318n3;
                float f10 = 0.0f;
                while (f10 < 360.0f) {
                    if (f10 == 180.0f || f10 == 135.0f || f10 == 225.0f) {
                        f6 = f10;
                        f5 = i26;
                        i19 = i23;
                    } else {
                        double radians = Math.toRadians(f10);
                        f6 = f10;
                        float sin = (float) Math.sin(radians);
                        float cos = (float) Math.cos(radians);
                        float f11 = i26 + f9;
                        f5 = i26;
                        i19 = i23;
                        canvas.drawLine(minimumWidth - (i26 * sin), i24 - (i26 * cos), minimumWidth - (sin * f11), i24 - (f11 * cos), C1410y.m37056Y(a, i23));
                    }
                    f10 = f6 + 45.0f;
                    i23 = i19;
                    i26 = f5;
                }
            }
        }
        float Ca = m25346Ca();
        if (Ca > 0.0f || this.f16303Y2 != null) {
            if (this.f16303Y2 == null) {
                RunnableC6969m2 m2Var = new RunnableC6969m2(mo4347s(), C1357a0.m37544i(5.0f));
                this.f16303Y2 = m2Var;
                m2Var.m18291E(this.f16101P0);
                RunnableC6969m2 m2Var2 = this.f16303Y2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                m2Var2.m18264z(this.f16099O0.m2532ad(this.f16122a.date, timeUnit), this.f16099O0.m2532ad(m25283xa().closeDate, timeUnit));
                this.f16303Y2.m18293C(C1357a0.m37544i(1.5f));
            }
            int i27 = (i22 - C1357a0.m37544i(12.0f)) - C1357a0.m37544i(1.0f);
            int height3 = (this.f16305a3.getHeight() / 2) + height;
            int i28 = C1357a0.m37544i(12.0f);
            long h = this.f16303Y2.m18282h();
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(h);
            if (h >= 10000) {
                i18 = m25874m3();
            } else {
                i18 = h <= 5000 ? m25911i4() : C5064d.m24129d(m25911i4(), m25874m3(), ((float) (h - 5000)) / 5000.0f);
            }
            this.f16303Y2.m18286d(i18);
            this.f16303Y2.m18275o(Ca);
            i4 = J4;
            this.f16303Y2.m18274p(i27 - i28, height3 - i28, i27 + i28, i28 + height3);
            this.f16303Y2.m18287c(canvas);
            TextPaint c0 = C1410y.m37049c0(12.0f, C5064d.m24132a(Ca, i18));
            if (this.f16319o3 != seconds || this.f16320p3 == null) {
                String h2 = C1363c0.m37436h(seconds);
                this.f16320p3 = h2;
                this.f16319o3 = seconds;
                this.f16321q3 = C7389v0.m16680T1(h2, c0);
            }
            canvas.drawText(this.f16320p3, (int) (i27 - ((C1357a0.m37544i(5.0f) + C1357a0.m37544i(6.0f)) + this.f16321q3)), height3 + C1357a0.m37544i(4.0f), c0);
        } else {
            i4 = J4;
        }
        int i29 = height + C1357a0.m37544i(18.0f);
        boolean z2 = this.f16299U2.f16339a.type.getConstructor() == 657013913;
        if (z2) {
            int i30 = ((TdApi.PollTypeQuiz) this.f16299U2.f16339a.type).correctOptionId;
            if (i30 == -1 && (dVar = this.f16300V2) != null && dVar.f16339a.type.getConstructor() == 657013913) {
                i30 = ((TdApi.PollTypeQuiz) this.f16300V2.f16339a.type).correctOptionId;
            }
            i5 = i30;
        } else {
            i5 = -1;
        }
        float Ba = m25347Ba();
        C4794b[] bVarArr2 = this.f16301W2;
        int length = bVarArr2.length;
        int i31 = 0;
        int i32 = 0;
        while (i32 < length) {
            C4794b bVar3 = bVarArr2[i32];
            int wa = m25284wa(bVar3.f16330O);
            int l2 = (m26069R9() ? m25886l2() : 0) + i22;
            if (Ba < 1.0f) {
                float x = (i29 + wa) - C1357a0.m37529x();
                i7 = i32;
                i8 = i31;
                bVar = bVar3;
                f = Ba;
                i9 = l2;
                z = z2;
                i6 = length;
                bVarArr = bVarArr2;
                canvas.drawLine(i20 + C1357a0.m37544i(34.0f), x, l2, x, C1410y.m37056Y(C5064d.m24132a(1.0f - Ba, m26238B4()), C1357a0.m37529x()));
            } else {
                bVar = bVar3;
                i7 = i32;
                i6 = length;
                bVarArr = bVarArr2;
                f = Ba;
                z = z2;
                i9 = l2;
                i8 = i31;
            }
            if (this.f16324t3 == i8) {
                canvas.drawRect(i20 - (m26069R9() ? mo25220b2() : 0), i29, i9, i29 + wa, C1410y.m37042g(C11524j.m228N(m25844p4())));
            }
            int i33 = i29;
            bVarArr2 = bVarArr;
            float f12 = f;
            bVar.f16330O.m22631h(canvas, i20 + C1357a0.m37544i(34.0f), i22, 0, i29 + Math.max(C1357a0.m37544i(8.0f), (C1357a0.m37544i(46.0f) / 2) - (bVar.f16330O.m22620s() / 2)), null, 1.0f);
            float ya = m25282ya(i8);
            float f13 = f12 >= 0.5f ? 0.0f : 1.0f - (f12 / 0.5f);
            int i34 = C1357a0.m37544i(9.0f);
            int i35 = i20 + C1357a0.m37544i(12.0f);
            int i36 = i33 + C1357a0.m37544i(22.0f);
            if (f13 > 0.0f) {
                int a2 = C5064d.m24132a((m25343Fa() ? 1.0f - bVar.m25261q() : 1.0f - ya) * f13, m3);
                if (m25343Fa()) {
                    RectF a0 = C1410y.m37053a0();
                    i34 -= C1357a0.m37544i(1.0f);
                    i11 = m3;
                    i10 = i22;
                    f2 = f12;
                    a0.set(i35 - i34, i36 - i34, i35 + i34, i36 + i34);
                    float i37 = C1357a0.m37544i(3.0f);
                    canvas.drawRoundRect(a0, i37, i37, C1410y.m37056Y(a2, C1357a0.m37544i(1.0f)));
                } else {
                    i10 = i22;
                    i11 = m3;
                    f2 = f12;
                    canvas.drawCircle(i35, i36, i34, C1410y.m37056Y(a2, C1357a0.m37544i(1.0f)));
                }
                if (ya > 0.0f && bVar.f16331P != null && !m25343Fa()) {
                    RunnableC6969m2 za2 = m25281za(i8);
                    za2.m18286d(C5064d.m24132a(f13 * ya, C11524j.m228N(m25822r4())));
                    za2.m18274p(i35 - i34, i36 - i34, i35 + i34, i34 + i36);
                    za2.m18287c(canvas);
                }
            } else {
                i10 = i22;
                i11 = m3;
                f2 = f12;
            }
            int V4 = m26032V4();
            int W4 = m26022W4();
            float q = bVar.m25261q();
            if (i5 != -1) {
                boolean z3 = m25283xa().options[i5].isChosen;
                int g3 = i8 == i5 ? m25932g3(z3) : m25911i4();
                int h3 = i8 == i5 ? m25922h3(z3) : m25901j4();
                V4 = C5064d.m24129d(V4, g3, q);
                W4 = C5064d.m24129d(W4, h3, q);
            }
            int i38 = V4;
            int i39 = W4;
            int i40 = i33 + wa;
            int x2 = (i40 - C1357a0.m37529x()) - C1357a0.m37544i(2.5f);
            int i41 = i + C1357a0.m37544i(34.0f);
            if (f2 > 0.0f) {
                float f14 = i41;
                float f15 = x2;
                float f16 = f2;
                i13 = i35;
                f3 = f16;
                i14 = i41;
                i12 = i36;
                canvas.drawLine(f14, f15, f14 + ((i10 - i41) * m25348Aa(i8)), f15, C1410y.m37056Y(C5064d.m24132a(f16, i38), C1357a0.m37544i(3.0f)));
                i15 = i4;
                canvas.drawText(bVar.f16334b, (i14 - bVar.f16335c) - C1357a0.m37544i(8.0f), max + i21, C1410y.m37066O(13.0f, C5064d.m24132a(f3, i15), false));
            } else {
                i14 = i41;
                i13 = i35;
                i15 = i4;
                f3 = f2;
                i12 = i36;
            }
            if (q > 0.0f) {
                float p = bVar.m25262p();
                float f17 = (this.f16299U2.f16339a.type.getConstructor() != 641265698 || !((TdApi.PollTypeRegular) this.f16299U2.f16339a.type).allowMultipleAnswers) ? 0.0f : 1.0f;
                if (bVar.f16329N == null) {
                    bVar2 = bVar;
                    bVar2.f16329N = C6918i3.m18459i(q, null, i38, i39, z && i8 != i5, p);
                } else {
                    bVar2 = bVar;
                }
                float f18 = 0.75f;
                int l = ((i14 - (((int) (C6918i3.m18456l() * 0.75f)) / 2)) - C1357a0.m37544i(8.0f)) + ((int) (C1357a0.m37544i(2.0f) * 0.75f));
                int i42 = x2 - ((int) (C1357a0.m37544i(2.0f) * 0.75f));
                if (p > 0.0f) {
                    l = (int) (l + ((i13 - l) * p));
                    i42 = (int) (i42 + ((i12 - i42) * p));
                    f18 = 0.75f + (0.25f * p);
                }
                int i43 = (f18 > 1.0f ? 1 : (f18 == 1.0f ? 0 : -1));
                if (i43 != 0) {
                    canvas.save();
                    canvas.scale(f18, f18, l, x2);
                }
                f4 = f3;
                i17 = i5;
                i16 = i10;
                C6918i3.m18464d(canvas, l, i42, q, null, bVar2.f16329N, i38, i39, z && i8 != i5, f17);
                if (i43 != 0) {
                    canvas.restore();
                }
            } else {
                f4 = f3;
                i17 = i5;
                i16 = i10;
            }
            i31 = i8 + 1;
            i32 = i7 + 1;
            i4 = i15;
            i5 = i17;
            i29 = i40;
            i22 = i16;
            m3 = i11;
            Ba = f4;
            z2 = z;
            length = i6;
            i20 = i;
        }
        int i44 = i29;
        int i45 = i22;
        int i46 = m3;
        int i47 = 0;
        if (this.f16324t3 == -2) {
            if (!m26099O9() || m26047T9()) {
                int l22 = i45 + (m26069R9() ? m25886l2() : 0);
                if (m26069R9()) {
                    i47 = mo25220b2();
                }
                canvas.drawRect(i - i47, i44, l22, i44 + C1357a0.m37544i(46.0f), C1410y.m37042g(C11524j.m228N(m25844p4())));
            } else {
                canvas.save();
                canvas.clipRect(m26188G1(), i44, m26177H1(), m26055T1());
                canvas.drawPath(m25866n2(), C1410y.m37042g(C11524j.m228N(m25844p4())));
                canvas.restore();
            }
        }
        int i48 = i44 + C1357a0.m37544i(10.0f);
        C3965r<C4793a> rVar = this.f16310f3;
        if (rVar != null) {
            Iterator<C3955n.C3958c<C4793a>> it = rVar.iterator();
            float f19 = 0.0f;
            while (it.hasNext()) {
                C3955n.C3958c<C4793a> next = it.next();
                f19 = Math.max(next.m29493s(), f19);
                int width = (i + (i3 / 2)) - (next.f13320a.f16326b.getWidth() / 2);
                int i49 = i48 + C1357a0.m37544i(m26069R9() ? 6.0f : 4.0f);
                next.f13320a.f16326b.m22892z(canvas, width, i49, null, (1.0f - ((1.0f - this.f16309e3.m29586g()) * 0.4f)) * next.m29493s());
                if (this.f16302X2 != null && next.f13320a.f16325a == R.id.btn_vote) {
                    this.f16302X2.m18286d(C5064d.m24132a((m25347Ba() >= 0.5f ? 0.0f : 1.0f - (m25347Ba() / 0.5f)) * m25292pa() * next.m29493s(), C11524j.m228N(m25822r4())));
                    int i50 = C1357a0.m37544i(3.0f);
                    int width2 = width + next.f13320a.f16326b.getWidth() + i50 + C1357a0.m37544i(7.0f);
                    int height4 = i49 + (next.f13320a.f16326b.getHeight() / 2);
                    this.f16302X2.m18274p(width2 - i50, height4 - i50, width2 + i50, height4 + i50);
                    this.f16302X2.m18287c(canvas);
                }
            }
            f8 = f19;
        }
        int i51 = i48 + C1357a0.m37544i(12.0f);
        int i52 = (i + (i3 / 2)) - (this.f16308d3 / 2);
        int i53 = i51 + i21;
        if (!m26069R9()) {
            f7 = 7.0f;
        }
        int i54 = i53 - C1357a0.m37544i(f7);
        if (!m25344Ea() || m25343Fa()) {
            canvas.drawText(this.f16307c3, i52, i54, C1410y.m37049c0(12.0f, C5064d.m24132a(1.0f - f8, i46)));
        } else {
            canvas.drawText(this.f16307c3, i52, i54, C1410y.m37049c0(12.0f, i46));
        }
    }

    public final void m25314bb(long[] jArr, boolean z) {
        if (jArr == null || jArr.length <= 0) {
            C3955n<C4797e> nVar = this.f16315k3;
            if (nVar != null) {
                nVar.m29521m(z);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new C4797e(this.f16099O0, j));
        }
        if (this.f16315k3 == null) {
            this.f16315k3 = new C3955n<>(this.f16101P0);
        }
        this.f16315k3.m29526B(arrayList, z);
    }

    @Override
    public void mo25313c1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, C6238b bVar) {
        mo25221b1(h1Var, canvas, i, i2, i3);
        int height = ((i2 + (this.f16311g3.getHeight() + C1357a0.m37544i(5.0f))) + C1357a0.m37544i(18.0f)) - C1357a0.m37544i(10.0f);
        if (this.f16315k3 != null) {
            int width = i + this.f16305a3.getWidth() + C1357a0.m37544i(9.0f) + C1357a0.m37544i(6.0f);
            int i4 = (C1357a0.m37544i(9.0f) * 2) - C1357a0.m37544i(4.0f);
            for (int size = this.f16315k3.size() - 1; size >= 0; size--) {
                C3955n.C3958c<C4797e> s = this.f16315k3.m29519s(size);
                if ((s.m29497o() * i4) + width + C1357a0.m37544i(9.0f) + C1357a0.m37544i(2.0f) <= i + i3) {
                    s.f13320a.m25249c(canvas, this, bVar, width + (s.m29496p() * i4), height, s.m29493s());
                }
            }
        }
    }

    public final void m25311cb() {
        C4796d dVar = this.f16300V2;
        int i = 2;
        int i2 = -1;
        int i3 = 0;
        if (dVar == null) {
            m25309db(this.f16299U2.f16339a);
            if (!this.f16299U2.f16339a.isClosed) {
                i = 1;
            }
            m25316Za(i);
            m25317Ya(C4779t2.m25387y4(this.f16299U2.f16339a), this.f16299U2.f16339a.options);
            if (this.f16299U2.f16339a.type.getConstructor() == 657013913) {
                i2 = ((TdApi.PollTypeQuiz) this.f16299U2.f16339a.type).correctOptionId;
            }
            while (i3 < this.f16299U2.f16339a.options.length) {
                this.f16301W2[i3].f16328M = (i3 == i2 || this.f16299U2.f16339a.options[i3].isChosen) ? 1.0f : 0.0f;
                i3++;
            }
            return;
        }
        m25309db(dVar.f16339a);
        if (this.f16299U2.f16339a.isClosed != this.f16300V2.f16339a.isClosed) {
            if (!this.f16300V2.f16339a.isClosed) {
                i = 1;
            }
            m25316Za(i);
        }
        int i4 = this.f16299U2.f16339a.type.getConstructor() == 657013913 ? ((TdApi.PollTypeQuiz) this.f16299U2.f16339a.type).correctOptionId : -1;
        if (this.f16300V2.f16339a.type.getConstructor() == 657013913) {
            i2 = ((TdApi.PollTypeQuiz) this.f16300V2.f16339a.type).correctOptionId;
        }
        int i5 = 0;
        while (i5 < this.f16299U2.f16339a.options.length) {
            int g = this.f16299U2.f16345g ? this.f16299U2.m25253g(i5) : 0;
            int g2 = this.f16300V2.f16345g ? this.f16300V2.m25253g(i5) : 0;
            if (g != g2) {
                m25318Xa(i5, m25294na(g, g2, this.f16313i3));
            }
            this.f16301W2[i5].f16328M = m25295ma((i5 == i4 || this.f16299U2.f16339a.options[i5].isChosen) ? 1.0f : 0.0f, (i5 == i2 || this.f16300V2.f16339a.options[i5].isChosen) ? 1.0f : 0.0f, this.f16313i3);
            i5++;
        }
    }

    public final void m25309db(TdApi.Poll poll) {
        int i = poll.totalVoterCount;
        if (!poll.isAnonymous) {
            if (C4779t2.m25410v2(poll)) {
                i--;
            }
        } else if (m25343Fa() && m25298ka(false) && !C4779t2.m25410v2(poll)) {
            i++;
        }
        if (this.f16306b3 != i) {
            this.f16306b3 = i;
            String charSequence = m25287ta(poll, i).toString();
            this.f16307c3 = charSequence;
            this.f16308d3 = (int) C7389v0.m16680T1(charSequence, C1410y.m37051b0(12.0f));
        }
    }

    public final void m25307eb(View view) {
        TdApi.FormattedText h1 = C4779t2.m25509h1(m25283xa());
        if (!C7321e.m16965a1(h1)) {
            C9357x2.C9370l lVar = this.f16323s3;
            if (lVar != null) {
                lVar.m8905T(this);
            }
            this.f16323s3 = m25978b0(view, new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view2, Rect rect) {
                    C4792t5.this.m25333La(view2, rect);
                }
            }).m8951q(R.drawable.baseline_info_24).m8947v(true).m8962e(-2.0f).m8949s(true).m8954n(true).m8970E(this.f16099O0, h1).m8881r(this);
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        if (this.f16322r3 <= -1 || m25298ka(true)) {
            m25321Va(this.f16322r3, view, f, f2);
        }
    }

    @Override
    public boolean mo25218f8(C9552h1 h1Var, MotionEvent motionEvent) {
        return (!m26003Y5() && this.f16314j3.m28248e(h1Var, motionEvent)) || super.mo25218f8(h1Var, motionEvent);
    }

    public final void m25305fb(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4792t5.m25305fb(boolean):void");
    }

    public final void m25303gb() {
        RunnableC6969m2 za2;
        if (this.f16301W2 != null) {
            float Ba = m25347Ba();
            float f = Ba >= 0.5f ? 0.0f : 1.0f - (Ba / 0.5f);
            int N = C11524j.m228N(m25822r4());
            int i = 0;
            if (m25343Fa()) {
                C4794b[] bVarArr = this.f16301W2;
                int length = bVarArr.length;
                int i2 = 0;
                float f2 = 0.0f;
                while (i < length) {
                    C4794b bVar = bVarArr[i];
                    f2 = Math.max(f2, m25282ya(i2));
                    i2++;
                    i++;
                }
                if (this.f16302X2 != null || f2 > 0.0f) {
                    m25291qa().m18286d(C5064d.m24132a(f * f2, N));
                    return;
                }
                return;
            }
            C4794b[] bVarArr2 = this.f16301W2;
            int length2 = bVarArr2.length;
            int i3 = 0;
            while (i < length2) {
                C4794b bVar2 = bVarArr2[i];
                float ya = m25282ya(i3);
                if ((bVar2.f16331P != null || (ya > 0.0f && f > 0.0f)) && (za2 = m25281za(i3)) != null) {
                    za2.m18286d(C5064d.m24132a(ya * f, N));
                }
                i3++;
                i++;
            }
        }
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    @Override
    public boolean mo8015h(int i, AbstractC6264v vVar, long j) {
        C3955n<C4797e> nVar = this.f16315k3;
        if (nVar == null) {
            return false;
        }
        Iterator<C3955n.C3958c<C4797e>> it = nVar.iterator();
        while (it.hasNext()) {
            if (it.next().f13320a.f16348a == j) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo8872i(C9357x2.C9370l lVar, float f) {
        if (this.f16323s3 == lVar) {
            m25323Ua(C5069h.m24090d(f));
        }
    }

    public final void m25300ja(TdApi.Poll poll) {
        C4794b[] bVarArr;
        TdApi.Poll xa = m25283xa();
        boolean z = !C4779t2.m25566Z(xa, poll) || this.f16311g3 == null;
        if (!z && m25946e7()) {
            m25328Qa(true);
            this.f16300V2 = new C4796d(this.f16099O0, poll);
            m25314bb(poll.recentVoterUserIds, true);
            m25326Sa(true);
            if (this.f16315k3 != null) {
                m25752y5();
            }
            if (m25342Ga()) {
                TdApi.PollOption[] pollOptionArr = xa.options;
                int length = pollOptionArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        i2 = -1;
                        break;
                    } else if (pollOptionArr[i].isBeingChosen) {
                        break;
                    } else {
                        i2++;
                        i++;
                    }
                }
                TdApi.PollOption[] pollOptionArr2 = poll.options;
                int length2 = pollOptionArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i4 = -1;
                        break;
                    } else if (pollOptionArr2[i3].isChosen) {
                        break;
                    } else {
                        i4++;
                        i3++;
                    }
                }
                int i5 = poll.type.getConstructor() == 657013913 ? ((TdApi.PollTypeQuiz) poll.type).correctOptionId : 0;
                if (i5 == -1 || i2 == -1 || !poll.options[i2].isChosen) {
                    if (i5 != -1 && i4 != -1 && i5 != i4 && poll.type.getConstructor() == 657013913 && xa.type.getConstructor() == 657013913 && C7321e.m16965a1(((TdApi.PollTypeQuiz) xa.type).explanation) && !C7321e.m16965a1(((TdApi.PollTypeQuiz) poll.type).explanation)) {
                        m25307eb(null);
                    } else if (i4 == -1 && !xa.isClosed && poll.isClosed && xa.openPeriod > 0 && xa.closeDate != 0 && (this.f16099O0.m2898D4() / 1000) + 5 >= xa.closeDate) {
                        m25860n8(false);
                    }
                } else if (i2 == i5) {
                    m25880l8(m25289ra(i2), m25288sa(i2));
                    m25860n8(true);
                } else {
                    m25860n8(false);
                    if (poll.type.getConstructor() == 657013913 && !C7321e.m16965a1(((TdApi.PollTypeQuiz) poll.type).explanation)) {
                        m25307eb(null);
                    }
                }
            }
            if (m25343Fa() && C4779t2.m25410v2(poll)) {
                int i6 = 0;
                for (C4794b bVar : this.f16301W2) {
                    if (bVar.f16332Q != null) {
                        TdApi.PollOption[] pollOptionArr3 = poll.options;
                        if (!pollOptionArr3[i6].isChosen && !pollOptionArr3[i6].isBeingChosen) {
                            bVar.f16332Q.m29577p(false, false);
                            bVar.f16332Q = null;
                        }
                    }
                    i6++;
                }
            }
            if (this.f16312h3 == null) {
                this.f16312h3 = new C3950k(0, this, C2057b.f7280b, 280L);
            }
            this.f16312h3.m29546i(1.0f);
            return;
        }
        m25328Qa(false);
        this.f16299U2 = new C4796d(this.f16099O0, poll);
        m25314bb(poll.recentVoterUserIds, false);
        if (this.f16315k3 != null) {
            m25752y5();
        }
        m25326Sa(false);
        m25311cb();
        if (z) {
            m25315ab(poll.question);
            m25319Wa(poll.options);
            m25329Pa(poll.options);
            m25749y8();
            return;
        }
        m25792u5();
    }

    @Override
    public boolean mo25299k7() {
        return !m25283xa().isAnonymous;
    }

    public final boolean m25298ka(boolean z) {
        return C4779t2.m25590V(m25283xa()) && (!z || !m25343Fa() || m25345Da() || !C4779t2.m25715C2(m25283xa()));
    }

    @Override
    public void mo8871l(C9357x2.C9370l lVar, boolean z) {
        if (this.f16323s3 == lVar && !z) {
            this.f16323s3 = null;
        }
    }

    public final void m25297la(int i) {
        if (m25283xa().options[i].isBeingChosen) {
            Client r4 = this.f16099O0.m2270r4();
            TdApi.Message message = this.f16122a;
            r4.m14783o(new TdApi.SetPollAnswer(message.chatId, message.f25409id, null), this.f16099O0.m2392ja());
            return;
        }
        Client r42 = this.f16099O0.m2270r4();
        TdApi.Message message2 = this.f16122a;
        r42.m14783o(new TdApi.SetPollAnswer(message2.chatId, message2.f25409id, new int[]{i}), this.f16099O0.m2392ja());
    }

    @Override
    public boolean mo25296m8(View view, float f, float f2) {
        this.f16314j3.m28251b(view, f, f2);
        return super.mo25296m8(view, f, f2);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        float d3 = f - m25960d3();
        float e3 = f2 - m25950e3();
        int Z2 = m25995Z2();
        if (d3 >= 0.0f && e3 >= 0.0f) {
            float f3 = Z2;
            if (d3 <= f3 && !m25947e6()) {
                int height = this.f16311g3.getHeight() + C1357a0.m37544i(5.0f);
                if (this.f16316l3 != null && m25285va() > 0.0f) {
                    float minimumWidth = (f3 - (this.f16316l3.getMinimumWidth() / 2.0f)) - C1357a0.m37544i(2.0f);
                    float height2 = height + (this.f16305a3.getHeight() / 2.0f);
                    float i = C1357a0.m37544i(6.0f);
                    float minimumWidth2 = (this.f16316l3.getMinimumWidth() / 2.0f) + i;
                    float minimumHeight = (this.f16316l3.getMinimumHeight() / 2.0f) + i;
                    if (d3 >= minimumWidth - minimumWidth2 && d3 <= minimumWidth + minimumWidth2 && e3 >= height2 - minimumHeight && e3 <= height2 + minimumHeight) {
                        this.f16322r3 = -3;
                        return true;
                    }
                }
                int i2 = height + C1357a0.m37544i(18.0f);
                int i3 = 0;
                for (C4794b bVar : this.f16301W2) {
                    int wa = m25284wa(bVar.f16330O);
                    if (e3 < i2 || e3 >= i2 + wa) {
                        i2 += wa;
                        i3++;
                    } else {
                        this.f16322r3 = i3;
                        return true;
                    }
                }
                C3940f fVar = this.f16309e3;
                if (fVar != null && fVar.m29585h() && this.f16310f3.m29463v() != null && !this.f16310f3.m29463v().f13320a.f16327c && e3 >= i2) {
                    if (e3 < mo25223X2() + (m26069R9() ? mo25220b2() : 0)) {
                        this.f16322r3 = -2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        m25321Va(-1, view, f, f2);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public final float m25292pa() {
        float f = 0.0f;
        for (int i = 0; i < this.f16299U2.f16341c.length; i++) {
            f = Math.max(f, m25282ya(i));
        }
        return f;
    }

    public final RunnableC6969m2 m25291qa() {
        if (!m25343Fa()) {
            return null;
        }
        if (this.f16302X2 == null) {
            this.f16302X2 = m25331Na(true);
        }
        return this.f16302X2;
    }

    @Override
    public boolean mo25290r6(TdApi.Message message, TdApi.MessageContent messageContent) {
        if (!super.mo25290r6(message, messageContent)) {
            return false;
        }
        TdApi.Poll xa = m25283xa();
        TdApi.Poll poll = ((TdApi.MessagePoll) messageContent).poll;
        return xa.options.length == poll.options.length && xa.type.getConstructor() == poll.type.getConstructor() && C4779t2.m25472m3(xa) == C4779t2.m25472m3(poll);
    }

    public final int m25289ra(int i) {
        return m25960d3() + C1357a0.m37544i(12.0f);
    }

    public final int m25288sa(int i) {
        C4794b[] bVarArr;
        int e3 = m25950e3() + this.f16311g3.getHeight() + C1357a0.m37544i(5.0f) + C1357a0.m37544i(18.0f);
        int i2 = 0;
        for (C4794b bVar : this.f16301W2) {
            if (i2 == i) {
                return e3 + C1357a0.m37544i(22.0f);
            }
            e3 += m25284wa(bVar.f16330O);
            i2++;
        }
        return m25950e3() + (mo25223X2() / 2);
    }

    public final CharSequence m25287ta(TdApi.Poll poll, int i) {
        int constructor = m25283xa().type.getConstructor();
        if (constructor != 641265698) {
            if (constructor != 657013913) {
                throw new IllegalArgumentException(m25283xa().type.toString());
            } else if (i > 0) {
                return C4403w.m27838q2(R.string.xAnswers, i);
            } else {
                return C4403w.m27871i1(poll.isClosed ? R.string.NoAnswersResult : R.string.NoAnswers);
            }
        } else if (i > 0) {
            return C4403w.m27838q2(R.string.xVotes, i);
        } else {
            return C4403w.m27871i1(poll.isClosed ? R.string.NoVotesResult : R.string.NoVotes);
        }
    }

    public final Drawable m25286ua(boolean z) {
        if (z) {
            if (this.f16317m3 == null) {
                this.f16317m3 = C1362c.m37486f(R.drawable.deproko_baseline_lamp_filled_22);
            }
            return this.f16317m3;
        }
        if (this.f16316l3 == null) {
            this.f16316l3 = C1362c.m37486f(R.drawable.deproko_baseline_lamp_22);
        }
        return this.f16316l3;
    }

    public final float m25285va() {
        C4796d dVar = this.f16300V2;
        if (dVar != null) {
            float f = this.f16313i3;
            if (f != 0.0f) {
                if (f == 1.0f) {
                    return dVar.f16344f;
                }
                return m25295ma(this.f16299U2.f16344f, this.f16300V2.f16344f, this.f16313i3);
            }
        }
        return this.f16299U2.f16344f;
    }

    public final int m25284wa(C5459x0 x0Var) {
        return Math.max(C1357a0.m37544i(46.0f), Math.max(C1357a0.m37544i(8.0f), (C1357a0.m37544i(46.0f) / 2) - (x0Var.m22620s() / 2)) + x0Var.getHeight() + C1357a0.m37544i(12.0f)) + C1357a0.m37529x();
    }

    public final TdApi.Poll m25283xa() {
        C4796d dVar = this.f16300V2;
        if (dVar == null) {
            dVar = this.f16299U2;
        }
        return dVar.f16339a;
    }

    public final float m25282ya(int i) {
        C4796d dVar = this.f16300V2;
        if (dVar != null) {
            float f = this.f16313i3;
            if (f != 0.0f) {
                if (f == 1.0f) {
                    return dVar.f16341c[i].f16338c;
                }
                return m25295ma(this.f16299U2.f16341c[i].f16338c, this.f16300V2.f16341c[i].f16338c, this.f16313i3);
            }
        }
        return this.f16299U2.f16341c[i].f16338c;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }

    public final RunnableC6969m2 m25281za(int i) {
        if (m25343Fa()) {
            return null;
        }
        RunnableC6969m2 m2Var = this.f16301W2[i].f16331P;
        if (m2Var != null) {
            return m2Var;
        }
        RunnableC6969m2 Na = m25331Na(false);
        this.f16301W2[i].f16331P = Na;
        return Na;
    }

    public static class C4796d {
        public final TdApi.Poll f16339a;
        public final int f16340b;
        public final C4795c[] f16341c;
        public final float f16342d;
        public final float f16343e;
        public final float f16344f;
        public final boolean f16345g;
        public final boolean f16346h;
        public final boolean f16347i;

        public C4796d(C10930q6 q6Var, TdApi.Poll poll) {
            this.f16339a = poll;
            boolean y4 = C4779t2.m25387y4(poll);
            this.f16345g = y4;
            this.f16342d = y4 ? 1.0f : 0.0f;
            boolean z = true;
            int i = 0;
            boolean z2 = !poll.isClosed && poll.openPeriod != 0;
            this.f16346h = z2;
            this.f16343e = z2 ? 1.0f : 0.0f;
            z = (poll.type.getConstructor() != 657013913 || C7321e.m16965a1(((TdApi.PollTypeQuiz) poll.type).explanation)) ? false : z;
            this.f16347i = z;
            this.f16344f = z ? 1.0f : 0.0f;
            this.f16340b = C4779t2.m25674I1(poll);
            this.f16341c = new C4795c[poll.options.length];
            while (true) {
                TdApi.PollOption[] pollOptionArr = poll.options;
                if (i < pollOptionArr.length) {
                    this.f16341c[i] = new C4795c(pollOptionArr[i], m25252h(i), poll.options[i].isBeingChosen ? 1.0f : 0.0f);
                    i++;
                } else {
                    return;
                }
            }
        }

        public int m25253g(int i) {
            return this.f16339a.options[i].votePercentage;
        }

        public float m25252h(int i) {
            int i2 = this.f16340b;
            if (i2 != 0) {
                return this.f16339a.options[i].voterCount / i2;
            }
            return 0.0f;
        }

        public C4796d(C10930q6 q6Var, C4796d dVar, C4796d dVar2, float f) {
            if (dVar.f16341c.length == dVar2.f16341c.length) {
                float ma2 = C4792t5.m25295ma(dVar.f16342d, dVar2.f16342d, f);
                this.f16342d = ma2;
                boolean z = true;
                this.f16345g = ma2 > 0.0f;
                float ma3 = C4792t5.m25295ma(dVar.f16343e, dVar2.f16343e, f);
                this.f16343e = ma3;
                this.f16346h = ma3 > 0.0f;
                float ma4 = C4792t5.m25295ma(dVar.f16344f, dVar2.f16344f, f);
                this.f16344f = ma4;
                this.f16347i = ma4 <= 0.0f ? false : z;
                this.f16340b = C4792t5.m25294na(dVar.f16340b, dVar2.f16340b, f);
                this.f16341c = new C4795c[dVar2.f16341c.length];
                int length = dVar2.f16341c.length;
                TdApi.PollOption[] pollOptionArr = new TdApi.PollOption[length];
                for (int i = 0; i < length; i++) {
                    TdApi.PollOption pollOption = dVar.f16339a.options[i];
                    TdApi.PollOption pollOption2 = dVar2.f16339a.options[i];
                    TdApi.PollOption pollOption3 = new TdApi.PollOption(pollOption2.text, C4792t5.m25294na(pollOption.voterCount, pollOption2.voterCount, f), C4792t5.m25294na(pollOption.votePercentage, pollOption2.votePercentage, f), pollOption2.isChosen, pollOption2.isBeingChosen);
                    pollOptionArr[i] = pollOption3;
                    this.f16341c[i] = new C4795c(pollOption3, C4792t5.m25295ma(dVar.f16341c[i].f16337b, dVar2.f16341c[i].f16337b, f), C4792t5.m25295ma(dVar.f16341c[i].f16338c, dVar2.f16341c[i].f16338c, f));
                }
                TdApi.Poll poll = dVar2.f16339a;
                this.f16339a = new TdApi.Poll(poll.f25416id, poll.question, pollOptionArr, poll.totalVoterCount, poll.recentVoterUserIds, poll.isAnonymous, poll.type, poll.openPeriod, poll.closeDate, poll.isClosed);
                return;
            }
            throw new AssertionError(dVar.f16341c.length + " != " + dVar2.f16341c.length);
        }
    }
}
