package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.p0;
import ce.y;
import de.nk;
import eb.f;
import eb.k;
import eb.n;
import eb.r;
import gb.c;
import gd.w;
import ib.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import je.g;
import je.l0;
import je.x0;
import ld.b;
import ld.h;
import ld.p;
import ld.v;
import ne.i3;
import ne.m2;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.x2;
import vc.g1;
import vc.v2;
import zd.o6;

public class t5 extends s4 implements c.a, b.a, x2.m {
    public d U2;
    public d V2;
    public b[] W2;
    public m2 X2;
    public m2 Y2;
    public int Z2;
    public g f13589a3;
    public String f13591c3;
    public int f13592d3;
    public final f f13593e3;
    public final r<a> f13594f3;
    public x0 f13595g3;
    public k f13596h3;
    public float f13597i3;
    public n<e> f13599k3;
    public Drawable f13600l3;
    public Drawable f13601m3;
    public float f13602n3;
    public String f13604p3;
    public float f13605q3;
    public x2.l f13607s3;
    public int f13590b3 = -1;
    public int f13603o3 = -1;
    public int f13606r3 = -1;
    public int f13608t3 = -1;
    public final gb.c f13598j3 = new gb.c(this);

    public static class a {
        public final int f13609a;
        public final g f13610b;
        public final boolean f13611c;

        public a(int i10, g gVar, boolean z10) {
            this.f13609a = i10;
            this.f13610b = gVar;
            this.f13611c = z10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.f13609a == this.f13609a && aVar.f13610b.a().equals(this.f13610b.a())) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class b implements kb.c {
        public float M;
        public i3 N;
        public x0 O;
        public m2 P;
        public f Q;
        public int f13612a = -1;
        public String f13613b;
        public int f13614c;

        @Override
        public void Q2() {
            m2 m2Var = this.P;
            if (m2Var != null) {
                m2Var.Q2();
                this.P = null;
            }
            i3 i3Var = this.N;
            if (i3Var != null) {
                i3Var.a();
                this.N = null;
            }
        }

        public float p() {
            if (this.Q != null) {
                return 1.0f - this.M;
            }
            return 0.0f;
        }

        public float q() {
            float f10 = this.M;
            f fVar = this.Q;
            return Math.max(f10, fVar != null ? fVar.g() : 0.0f);
        }

        public boolean r() {
            f fVar = this.Q;
            return fVar != null && fVar.h();
        }
    }

    public static class c {
        public TdApi.PollOption f13615a;
        public final float f13616b;
        public final float f13617c;

        public c(TdApi.PollOption pollOption, float f10, float f11) {
            this.f13615a = pollOption;
            this.f13616b = f10;
            this.f13617c = f11;
        }
    }

    public static class e {
        public final long f13627a;
        public final h f13628b;
        public final hd.b f13629c;

        public e(o6 o6Var, long j10) {
            this.f13627a = j10;
            h v22 = o6Var.e2().v2(j10);
            this.f13628b = v22;
            if (v22 != null) {
                v22.t0(a0.i(9.0f) * 2);
            }
            this.f13629c = o6Var.e2().L2(j10, false, 9.0f, null);
        }

        public void c(Canvas canvas, s4 s4Var, ld.b bVar, float f10, float f11, float f12) {
            int i10;
            if (f12 != 0.0f) {
                p k10 = this.f13628b != null ? bVar.k(this.f13627a) : null;
                int i11 = a0.i(9.0f);
                int Z2 = s4Var.Z2();
                int i12 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                boolean z10 = i12 != 0;
                if (z10) {
                    float f13 = (f12 * 0.5f) + 0.5f;
                    i10 = p0.O(canvas);
                    canvas.scale(f13, f13, f10, f11);
                } else {
                    i10 = -1;
                }
                float f14 = i11;
                canvas.drawCircle(f10, f11, (a0.i(1.0f) * f12 * 0.5f) + f14, y.Y(Z2, a0.i(1.0f) * f12));
                if (k10 != null) {
                    if (i12 != 0) {
                        k10.V(k10.R0() * f12);
                    }
                    k10.K0((int) (f10 - f14), (int) (f11 - f14), (int) (f10 + f14), (int) (f11 + f14));
                    if (k10.e0()) {
                        k10.j1(canvas, i11, ib.d.a(f12, j.E0()));
                    }
                    k10.draw(canvas);
                    if (i12 != 0) {
                        k10.Q();
                    }
                } else {
                    hd.b bVar2 = this.f13629c;
                    if (bVar2 != null) {
                        bVar2.b(canvas, f10, f11, f12);
                    }
                }
                if (z10) {
                    p0.N(canvas, i10);
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && ((e) obj).f13627a == this.f13627a;
        }

        public int hashCode() {
            long j10 = this.f13627a;
            return (int) (j10 ^ (j10 >>> 32));
        }
    }

    public t5(v2 v2Var, TdApi.Message message, TdApi.Poll poll) {
        super(v2Var, message);
        this.U2 = new d(this.O0, poll);
        if (!poll.isAnonymous || Fa()) {
            this.f13593e3 = new f(2, this, db.b.f7287b, 120L);
            this.f13594f3 = new r<>(new r.a() {
                @Override
                public final void a(r rVar) {
                    t5.this.Ha(rVar);
                }
            });
            return;
        }
        this.f13593e3 = null;
        this.f13594f3 = null;
    }

    public void Ha(r rVar) {
        u5();
    }

    public void Ia(View view, Rect rect) {
        int height = this.f13595g3.getHeight() + a0.i(5.0f) + a0.i(18.0f);
        for (b bVar : this.W2) {
            height += Math.max(a0.i(46.0f), bVar.O.getHeight()) + a0.x();
        }
        rect.set(0, height, a3(), W2());
    }

    public void Ja(int i10, View view, Rect rect) {
        int height = this.f13595g3.getHeight() + a0.i(5.0f) + a0.i(18.0f);
        int i11 = 0;
        for (b bVar : this.W2) {
            int wa2 = wa(bVar.O);
            if (i10 == i11) {
                int i12 = a0.i(12.0f);
                int i13 = height + a0.i(22.0f);
                int i14 = a0.i(9.0f);
                rect.set(i12 - i14, i13 - i14, i12 + i14, i13 + i14);
                return;
            }
            height += wa2;
            i11++;
        }
        rect.set(0, 0, 0, 0);
    }

    public void Ka(int i10, View view, Rect rect) {
        b[] bVarArr;
        int height = this.f13595g3.getHeight() + a0.i(5.0f) + a0.i(18.0f);
        int i11 = 0;
        for (b bVar : this.W2) {
            int wa2 = wa(bVar.O);
            if (i10 == i11) {
                int i12 = height + a0.i(15.0f);
                rect.set(a0.i(34.0f), i12, a0.i(34.0f) + bVar.O.t(0), bVar.O.s() + i12);
                return;
            }
            height += wa2;
            i11++;
        }
        rect.set(0, 0, 0, 0);
    }

    public void La(View view, Rect rect) {
        rect.set(0, 0, this.f13595g3.getWidth(), this.f13595g3.getHeight());
    }

    public static String Ma(int i10) {
        return i10 + "%";
    }

    public static float ma(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public static int na(int i10, int i11, float f10) {
        return i10 + oa((i11 - i10) * f10);
    }

    public static int oa(float f10) {
        return (int) f10;
    }

    public final float Aa(int i10) {
        d dVar = this.V2;
        if (dVar != null) {
            float f10 = this.f13597i3;
            if (f10 != 0.0f) {
                if (f10 == 1.0f) {
                    return dVar.f13620c[i10].f13616b;
                }
                return ma(this.U2.f13620c[i10].f13616b, this.V2.f13620c[i10].f13616b, this.f13597i3);
            }
        }
        if (this.U2.f13624g) {
            return this.U2.f13620c[i10].f13616b;
        }
        return 0.0f;
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    public final float Ba() {
        d dVar = this.V2;
        if (dVar != null) {
            float f10 = this.f13597i3;
            if (f10 != 0.0f) {
                if (f10 == 1.0f) {
                    return dVar.f13621d;
                }
                return ma(this.U2.f13621d, this.V2.f13621d, this.f13597i3);
            }
        }
        return this.U2.f13621d;
    }

    @Override
    public void C(View view, float f10, float f11) {
        int i10 = this.f13606r3;
        if (i10 != -1) {
            if (i10 == -3) {
                eb(view);
            } else {
                if (i10 == -2) {
                    if (this.f13594f3.v() != null) {
                        if (k6()) {
                            B9(view, new x2.f() {
                                @Override
                                public final void d1(View view2, Rect rect) {
                                    t5.this.Ia(view2, rect);
                                }
                            }, R.string.ErrorScheduled);
                        } else {
                            int i11 = this.f13594f3.v().f11479a.f13609a;
                            if (i11 == R.id.btn_viewResults) {
                                nk nkVar = new nk(t(), c());
                                TdApi.Poll xa2 = xa();
                                TdApi.Message message = this.f13449a;
                                nkVar.Ad(new nk.b(xa2, message.chatId, message.f19946id));
                                c7(nkVar);
                            } else if (i11 == R.id.btn_vote) {
                                jb.c cVar = new jb.c(this.W2.length);
                                jb.c cVar2 = new jb.c(cVar.g());
                                int i12 = 0;
                                for (b bVar : this.W2) {
                                    if (bVar.r()) {
                                        cVar.a(i12);
                                    }
                                    if (xa().options[i12].isBeingChosen) {
                                        cVar2.a(i12);
                                    }
                                    i12++;
                                }
                                int[] e10 = cVar.e();
                                if (Arrays.equals(e10, cVar2.e())) {
                                    Client v42 = this.O0.v4();
                                    TdApi.Message message2 = this.f13449a;
                                    v42.o(new TdApi.SetPollAnswer(message2.chatId, message2.f19946id, null), this.O0.na());
                                } else {
                                    Client v43 = this.O0.v4();
                                    TdApi.Message message3 = this.f13449a;
                                    v43.o(new TdApi.SetPollAnswer(message3.chatId, message3.f19946id, e10), this.O0.na());
                                }
                            }
                        }
                    }
                } else if (k6()) {
                    final int i13 = this.f13606r3;
                    B9(view, new x2.f() {
                        @Override
                        public final void d1(View view2, Rect rect) {
                            t5.this.Ja(i13, view2, rect);
                        }
                    }, R.string.ErrorScheduled);
                } else if (!ka(true)) {
                    final int i14 = this.f13606r3;
                    C9(view, new x2.f() {
                        @Override
                        public final void d1(View view2, Rect rect) {
                            t5.this.Ka(i14, view2, rect);
                        }
                    }, t2.A5(ta(xa(), xa().options[i14].voterCount), false));
                } else if (Fa()) {
                    Ra(this.f13606r3);
                } else {
                    la(this.f13606r3);
                }
            }
            this.f13606r3 = -1;
        }
    }

    public final float Ca() {
        d dVar = this.V2;
        if (dVar != null) {
            float f10 = this.f13597i3;
            if (f10 != 0.0f) {
                if (f10 == 1.0f) {
                    return dVar.f13622e;
                }
                return ma(this.U2.f13622e, this.V2.f13622e, this.f13597i3);
            }
        }
        return this.U2.f13622e;
    }

    public final boolean Da() {
        return t2.v2(xa());
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    public boolean Ea() {
        return this.U2.f13618a.isAnonymous;
    }

    public final boolean Fa() {
        return t2.m3(xa());
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    public final boolean Ga() {
        return xa().type.getConstructor() == 657013913;
    }

    @Override
    public void H7(int i10, float f10, k kVar) {
        b[] bVarArr;
        if (i10 == 0 && f10 == 1.0f && this.V2 != null) {
            Ta(1.0f);
            if (Fa() && Da()) {
                for (b bVar : this.W2) {
                    if (bVar.Q != null) {
                        bVar.Q.p(false, false);
                        bVar.Q = null;
                    }
                }
            }
            this.U2 = this.V2;
            this.V2 = null;
            this.f13596h3.l(0.0f);
            this.f13597i3 = 0.0f;
        }
    }

    @Override
    public void I7(int i10, float f10, float f11) {
        if (i10 == 0) {
            Ta(f10);
        } else if (i10 == 1 || i10 == 2) {
            u5();
        }
    }

    @Override
    public void L8(ld.b bVar, boolean z10, int i10) {
        n<e> nVar = this.f13599k3;
        if (nVar != null) {
            Iterator<n.c<e>> it = nVar.iterator();
            while (it.hasNext()) {
                n.c<e> next = it.next();
                p k10 = bVar.k(next.f11479a.f13627a);
                k10.E0(a0.i(9.0f));
                k10.G(next.f11479a.f13628b);
            }
        }
        bVar.f(this);
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        ja(((TdApi.MessagePoll) messageContent).poll);
        return true;
    }

    public final m2 Na(boolean z10) {
        m2 m2Var = new m2(t(), a0.i(z10 ? 3.0f : 9.0f));
        m2Var.t(true);
        m2Var.E(this.P0);
        m2Var.d(0);
        return m2Var;
    }

    public final void Oa(TdApi.PollOption[] pollOptionArr) {
        int length = pollOptionArr.length;
        b[] bVarArr = this.W2;
        if (bVarArr == null) {
            this.W2 = new b[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.W2[i10] = new b();
                if (pollOptionArr[i10].isBeingChosen && Fa()) {
                    this.W2[i10].Q = new f(1, this, db.b.f7287b, 165L, true);
                }
            }
        } else if (length != bVarArr.length) {
            this.W2 = (b[]) ib.b.D(bVarArr, length);
            for (int length2 = bVarArr.length; length2 < length; length2++) {
                this.W2[length2] = new b();
                if (pollOptionArr[length2].isBeingChosen && Fa()) {
                    this.W2[length2].Q = new f(1, this, db.b.f7287b, 165L, true);
                }
            }
        }
    }

    public final void Pa(TdApi.PollOption[] pollOptionArr) {
        Oa(pollOptionArr);
        int i10 = 0;
        if (!Fa()) {
            int length = pollOptionArr.length;
            int i11 = 0;
            while (i10 < length) {
                if (pollOptionArr[i10].isBeingChosen && this.W2[i11].P == null) {
                    za(i11);
                }
                i11++;
                i10++;
            }
        } else if (this.X2 == null) {
            int length2 = pollOptionArr.length;
            while (i10 < length2) {
                if (pollOptionArr[i10].isBeingChosen) {
                    qa();
                    return;
                }
                i10++;
            }
        }
    }

    public final void Qa(boolean z10) {
        k kVar = this.f13596h3;
        if (kVar != null) {
            kVar.k();
            this.f13596h3.l(0.0f);
        }
        d dVar = this.V2;
        if (dVar != null) {
            if (z10) {
                this.U2 = new d(this.O0, this.U2, dVar, this.f13597i3);
            }
            this.V2 = null;
        }
        n<e> nVar = this.f13599k3;
        if (nVar != null) {
            nVar.D(z10);
        }
        r<a> rVar = this.f13594f3;
        if (rVar != null) {
            rVar.x(z10);
        }
        this.f13597i3 = 0.0f;
    }

    @Override
    public int R1() {
        return this.f13592d3;
    }

    public final void Ra(int i10) {
        if (this.W2[i10].Q == null) {
            this.W2[i10].Q = new f(1, this, db.b.f7287b, 165L);
        }
        this.W2[i10].Q.r(e7());
        fb(e7());
    }

    public final void Sa(boolean z10) {
        String str;
        int i10;
        if (this.f13594f3 != null) {
            boolean z11 = false;
            if (Fa() && !Da() && ka(false)) {
                i10 = R.id.btn_vote;
                str = w.i1(R.string.Vote);
            } else if (Ea() || (!Da() && ka(false))) {
                str = null;
                i10 = 0;
            } else {
                i10 = R.id.btn_viewResults;
                int i11 = xa().totalVoterCount;
                if (ka(false) && !t2.v2(xa())) {
                    i11++;
                }
                if (i11 == 0 && xa().isClosed) {
                    str = w.i1(Ga() ? R.string.NoAnswersResult : R.string.NoVotesResult);
                    z11 = true;
                } else if (i11 > 1) {
                    str = w.o2(Ga() ? R.string.ViewXQuizResults : R.string.ViewXPollResults, i11);
                } else {
                    str = w.i1(Ga() ? R.string.ViewQuizResults : R.string.ViewPollResults);
                }
            }
            if (str != null) {
                this.f13594f3.u(new a(i10, new g.b(str, Y2(), z11 ? y.A0(12.0f) : s4.e4(), z11 ? m3() : T3()).v().c(!z11).f(), z11), z10);
            } else {
                this.f13594f3.m(z10);
            }
            fb(z10);
        }
    }

    public final void Ta(float f10) {
        if (this.f13597i3 != f10) {
            this.f13597i3 = f10;
            n<e> nVar = this.f13599k3;
            if (nVar != null) {
                nVar.g(f10);
            }
            r<a> rVar = this.f13594f3;
            if (rVar != null) {
                rVar.g(f10);
            }
            cb();
            gb();
            m2 m2Var = this.Y2;
            if (m2Var != null) {
                m2Var.o(Ca());
            }
            u5();
        }
    }

    @Override
    public void U2(View view, float f10, float f11) {
        if (this.f13606r3 <= -1 || ka(true)) {
            Va(this.f13606r3, view, f10, f11);
        }
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    public final void Ua(float f10) {
        if (this.f13602n3 != f10) {
            this.f13602n3 = f10;
            if (va() > 0.0f) {
                u5();
            }
        }
    }

    @Override
    public void V7() {
        b[] bVarArr = this.W2;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.Q2();
            }
        }
    }

    public final void Va(int i10, View view, float f10, float f11) {
        if (this.f13608t3 != i10) {
            this.f13608t3 = i10;
            u5();
        }
    }

    @Override
    public int W2() {
        x0 x0Var = this.f13595g3;
        int height = (x0Var != null ? x0Var.getHeight() : 0) + a0.i(5.0f) + a0.i(18.0f);
        b[] bVarArr = this.W2;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                height += wa(bVar.O);
            }
        } else {
            height += (a0.i(46.0f) + a0.x()) * xa().options.length;
        }
        int i10 = height + a0.i(10.0f) + a0.i(14.0f) + a0.i(12.0f);
        return R9() ? i10 + a0.i(8.0f) : i10;
    }

    @Override
    public boolean W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z10) {
        if (messageContent2.getConstructor() != -662130099) {
            return false;
        }
        ja(((TdApi.MessagePoll) messageContent2).poll);
        return true;
    }

    public final void Wa(TdApi.PollOption[] pollOptionArr) {
        Oa(pollOptionArr);
        int i10 = 0;
        for (TdApi.PollOption pollOption : pollOptionArr) {
            if (this.W2[i10].O == null || !i.c(this.W2[i10].O.v(), pollOption.text)) {
                this.W2[i10].O = new x0(pollOption.text, s4.L4(), K4(), null).H(this.P0);
            }
            i10++;
        }
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    public final void Xa(int i10, int i11) {
        b[] bVarArr = this.W2;
        if (bVarArr != null && bVarArr[i10].f13612a != i11) {
            this.W2[i10].f13612a = i11;
            this.W2[i10].f13613b = Ma(i11);
            b[] bVarArr2 = this.W2;
            bVarArr2[i10].f13614c = (int) v0.T1(bVarArr2[i10].f13613b, y.P(13.0f, false));
        }
    }

    public final void Ya(boolean z10, TdApi.PollOption[] pollOptionArr) {
        Oa(pollOptionArr);
        for (int i10 = 0; i10 < pollOptionArr.length; i10++) {
            Xa(i10, z10 ? pollOptionArr[i10].votePercentage : 0);
        }
    }

    public final void Za(int i10) {
        int i11;
        if (this.Z2 != i10) {
            this.Z2 = i10;
            int constructor = xa().type.getConstructor();
            if (constructor != 641265698) {
                if (constructor != 657013913) {
                    throw new IllegalArgumentException(xa().type.toString());
                } else if (i10 == 2) {
                    i11 = R.string.QuizResults;
                } else {
                    i11 = xa().isAnonymous ? R.string.QuizAnonymous : R.string.QuizPublic;
                }
            } else if (i10 == 2) {
                i11 = R.string.PollResults;
            } else {
                i11 = xa().isAnonymous ? R.string.PollAnonymous : R.string.PollPublic;
            }
            this.f13589a3 = new g.b(w.i1(i11), Y2(), y.A0(12.0f), m3()).v().f();
        }
    }

    @Override
    public void a1(g1 g1Var, Canvas canvas, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        boolean z10;
        b bVar;
        float f10;
        int i16;
        b[] bVarArr;
        int i17;
        int i18;
        int max;
        float f11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f12;
        float f13;
        int i25;
        int i26;
        b bVar2;
        d dVar;
        int i27;
        float f14;
        int i28;
        float f15;
        int i29 = i10;
        int J4 = J4();
        int j32 = j3();
        int i30 = a0.i(12.0f);
        int i31 = i29 + i12;
        this.f13595g3.h(canvas, i10, i31, 0, i11, null, 1.0f);
        float f16 = 5.0f;
        int height = i11 + this.f13595g3.getHeight() + a0.i(5.0f);
        this.f13589a3.t(canvas, i29, height);
        float va2 = va();
        float f17 = 0.0f;
        if (va2 > 0.0f) {
            Drawable ua2 = ua(false);
            float minimumWidth = (i31 - (ua2.getMinimumWidth() / 2.0f)) - a0.i(2.0f);
            float height2 = height + (this.f13589a3.getHeight() / 2.0f);
            if (this.f13602n3 < 1.0f) {
                ce.c.b(canvas, ua2, minimumWidth - (ua2.getMinimumWidth() / 2.0f), height2 - (ua2.getMinimumHeight() / 2.0f), va2 == 1.0f ? p3() : y.W(ib.d.a(va2, j32)));
            }
            if (this.f13602n3 > 0.0f) {
                Drawable ua3 = ua(true);
                int p42 = p4();
                int i32 = a0.i(2.0f);
                ce.c.b(canvas, ua3, minimumWidth - (ua2.getMinimumWidth() / 2.0f), height2 - (ua2.getMinimumHeight() / 2.0f), y.W(ib.d.a(this.f13602n3 * va2, p42)));
                float i33 = height2 - a0.i(2.5f);
                int a10 = ib.d.a(va2 * this.f13602n3, p42);
                int i34 = a0.i(2.5f);
                float i35 = a0.i(6.0f) + a0.i(3.0f);
                float f18 = i34 * this.f13602n3;
                float f19 = 0.0f;
                while (f19 < 360.0f) {
                    if (f19 == 180.0f || f19 == 135.0f || f19 == 225.0f) {
                        f15 = f19;
                        f14 = i35;
                        i28 = i32;
                    } else {
                        double radians = Math.toRadians(f19);
                        f15 = f19;
                        float sin = (float) Math.sin(radians);
                        float cos = (float) Math.cos(radians);
                        float f20 = i35 + f18;
                        f14 = i35;
                        i28 = i32;
                        canvas.drawLine(minimumWidth - (i35 * sin), i33 - (i35 * cos), minimumWidth - (sin * f20), i33 - (f20 * cos), y.Y(a10, i32));
                    }
                    f19 = f15 + 45.0f;
                    i32 = i28;
                    i35 = f14;
                }
            }
        }
        float Ca = Ca();
        if (Ca > 0.0f || this.Y2 != null) {
            if (this.Y2 == null) {
                m2 m2Var = new m2(t(), a0.i(5.0f));
                this.Y2 = m2Var;
                m2Var.E(this.P0);
                m2 m2Var2 = this.Y2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                m2Var2.z(this.O0.ed(this.f13449a.date, timeUnit), this.O0.ed(xa().closeDate, timeUnit));
                this.Y2.C(a0.i(1.5f));
            }
            int i36 = (i31 - a0.i(12.0f)) - a0.i(1.0f);
            int height3 = (this.f13589a3.getHeight() / 2) + height;
            int i37 = a0.i(12.0f);
            long h10 = this.Y2.h();
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(h10);
            if (h10 >= 10000) {
                i27 = j3();
            } else {
                i27 = h10 <= 5000 ? f4() : ib.d.d(f4(), j3(), ((float) (h10 - 5000)) / 5000.0f);
            }
            this.Y2.d(i27);
            this.Y2.o(Ca);
            i13 = J4;
            this.Y2.p(i36 - i37, height3 - i37, i36 + i37, i37 + height3);
            this.Y2.c(canvas);
            TextPaint c02 = y.c0(12.0f, ib.d.a(Ca, i27));
            if (this.f13603o3 != seconds || this.f13604p3 == null) {
                String h11 = c0.h(seconds);
                this.f13604p3 = h11;
                this.f13603o3 = seconds;
                this.f13605q3 = v0.T1(h11, c02);
            }
            canvas.drawText(this.f13604p3, (int) (i36 - ((a0.i(5.0f) + a0.i(6.0f)) + this.f13605q3)), height3 + a0.i(4.0f), c02);
        } else {
            i13 = J4;
        }
        int i38 = height + a0.i(18.0f);
        boolean z11 = this.U2.f13618a.type.getConstructor() == 657013913;
        if (z11) {
            int i39 = ((TdApi.PollTypeQuiz) this.U2.f13618a.type).correctOptionId;
            if (i39 == -1 && (dVar = this.V2) != null && dVar.f13618a.type.getConstructor() == 657013913) {
                i39 = ((TdApi.PollTypeQuiz) this.V2.f13618a.type).correctOptionId;
            }
            i14 = i39;
        } else {
            i14 = -1;
        }
        float Ba = Ba();
        b[] bVarArr2 = this.W2;
        int length = bVarArr2.length;
        int i40 = 0;
        int i41 = 0;
        while (i41 < length) {
            b bVar3 = bVarArr2[i41];
            int wa2 = wa(bVar3.O);
            int j22 = (R9() ? j2() : 0) + i31;
            if (Ba < 1.0f) {
                float x10 = (i38 + wa2) - a0.x();
                i16 = i41;
                i17 = i40;
                bVar = bVar3;
                f10 = Ba;
                i18 = j22;
                z10 = z11;
                i15 = length;
                bVarArr = bVarArr2;
                canvas.drawLine(i29 + a0.i(34.0f), x10, j22, x10, y.Y(ib.d.a(1.0f - Ba, A4()), a0.x()));
            } else {
                bVar = bVar3;
                i16 = i41;
                i15 = length;
                bVarArr = bVarArr2;
                f10 = Ba;
                z10 = z11;
                i18 = j22;
                i17 = i40;
            }
            if (this.f13608t3 == i17) {
                canvas.drawRect(i29 - (R9() ? Y1() : 0), i38, i18, i38 + wa2, y.g(j.L(m4())));
            }
            int i42 = i38;
            bVarArr2 = bVarArr;
            float f21 = f10;
            bVar.O.h(canvas, i29 + a0.i(34.0f), i31, 0, i38 + Math.max(a0.i(8.0f), (a0.i(46.0f) / 2) - (bVar.O.s() / 2)), null, 1.0f);
            float ya2 = ya(i17);
            float f22 = f21 >= 0.5f ? 0.0f : 1.0f - (f21 / 0.5f);
            int i43 = a0.i(9.0f);
            int i44 = i29 + a0.i(12.0f);
            int i45 = i42 + a0.i(22.0f);
            if (f22 > 0.0f) {
                int a11 = ib.d.a((Fa() ? 1.0f - bVar.q() : 1.0f - ya2) * f22, j32);
                if (Fa()) {
                    RectF a02 = y.a0();
                    i43 -= a0.i(1.0f);
                    i20 = j32;
                    i19 = i31;
                    f11 = f21;
                    a02.set(i44 - i43, i45 - i43, i44 + i43, i45 + i43);
                    float i46 = a0.i(3.0f);
                    canvas.drawRoundRect(a02, i46, i46, y.Y(a11, a0.i(1.0f)));
                } else {
                    i19 = i31;
                    i20 = j32;
                    f11 = f21;
                    canvas.drawCircle(i44, i45, i43, y.Y(a11, a0.i(1.0f)));
                }
                if (ya2 > 0.0f && bVar.P != null && !Fa()) {
                    m2 za2 = za(i17);
                    za2.d(ib.d.a(f22 * ya2, j.L(q4())));
                    za2.p(i44 - i43, i45 - i43, i44 + i43, i43 + i45);
                    za2.c(canvas);
                }
            } else {
                i19 = i31;
                i20 = j32;
                f11 = f21;
            }
            int V4 = V4();
            int W4 = W4();
            float q10 = bVar.q();
            if (i14 != -1) {
                boolean z12 = xa().options[i14].isChosen;
                int d32 = i17 == i14 ? d3(z12) : f4();
                int e32 = i17 == i14 ? e3(z12) : g4();
                V4 = ib.d.d(V4, d32, q10);
                W4 = ib.d.d(W4, e32, q10);
            }
            int i47 = V4;
            int i48 = W4;
            int i49 = i42 + wa2;
            int x11 = (i49 - a0.x()) - a0.i(2.5f);
            int i50 = i10 + a0.i(34.0f);
            if (f11 > 0.0f) {
                float f23 = i50;
                float f24 = x11;
                float f25 = f11;
                i22 = i44;
                f12 = f25;
                i23 = i50;
                i21 = i45;
                canvas.drawLine(f23, f24, f23 + ((i19 - i50) * Aa(i17)), f24, y.Y(ib.d.a(f25, i47), a0.i(3.0f)));
                i24 = i13;
                canvas.drawText(bVar.f13613b, (i23 - bVar.f13614c) - a0.i(8.0f), max + i30, y.O(13.0f, ib.d.a(f12, i24), false));
            } else {
                i23 = i50;
                i22 = i44;
                i24 = i13;
                f12 = f11;
                i21 = i45;
            }
            if (q10 > 0.0f) {
                float p10 = bVar.p();
                float f26 = (this.U2.f13618a.type.getConstructor() != 641265698 || !((TdApi.PollTypeRegular) this.U2.f13618a.type).allowMultipleAnswers) ? 0.0f : 1.0f;
                if (bVar.N == null) {
                    bVar2 = bVar;
                    bVar2.N = i3.i(q10, null, i47, i48, z10 && i17 != i14, p10);
                } else {
                    bVar2 = bVar;
                }
                float f27 = 0.75f;
                int l10 = ((i23 - (((int) (i3.l() * 0.75f)) / 2)) - a0.i(8.0f)) + ((int) (a0.i(2.0f) * 0.75f));
                int i51 = x11 - ((int) (a0.i(2.0f) * 0.75f));
                if (p10 > 0.0f) {
                    l10 = (int) (l10 + ((i22 - l10) * p10));
                    i51 = (int) (i51 + ((i21 - i51) * p10));
                    f27 = 0.75f + (0.25f * p10);
                }
                int i52 = (f27 > 1.0f ? 1 : (f27 == 1.0f ? 0 : -1));
                if (i52 != 0) {
                    canvas.save();
                    canvas.scale(f27, f27, l10, x11);
                }
                f13 = f12;
                i26 = i14;
                i25 = i19;
                i3.d(canvas, l10, i51, q10, null, bVar2.N, i47, i48, z10 && i17 != i14, f26);
                if (i52 != 0) {
                    canvas.restore();
                }
            } else {
                f13 = f12;
                i26 = i14;
                i25 = i19;
            }
            i40 = i17 + 1;
            i41 = i16 + 1;
            i13 = i24;
            i14 = i26;
            i38 = i49;
            i31 = i25;
            j32 = i20;
            Ba = f13;
            z11 = z10;
            length = i15;
            i29 = i10;
        }
        int i53 = i38;
        int i54 = i31;
        int i55 = j32;
        int i56 = 0;
        if (this.f13608t3 == -2) {
            if (!O9() || T9()) {
                int j23 = i54 + (R9() ? j2() : 0);
                if (R9()) {
                    i56 = Y1();
                }
                canvas.drawRect(i10 - i56, i53, j23, i53 + a0.i(46.0f), y.g(j.L(m4())));
            } else {
                canvas.save();
                canvas.clipRect(D1(), i53, E1(), Q1());
                canvas.drawPath(l2(), y.g(j.L(m4())));
                canvas.restore();
            }
        }
        int i57 = i53 + a0.i(10.0f);
        r<a> rVar = this.f13594f3;
        if (rVar != null) {
            Iterator<n.c<a>> it = rVar.iterator();
            float f28 = 0.0f;
            while (it.hasNext()) {
                n.c<a> next = it.next();
                f28 = Math.max(next.s(), f28);
                int width = (i10 + (i12 / 2)) - (next.f11479a.f13610b.getWidth() / 2);
                int i58 = i57 + a0.i(R9() ? 6.0f : 4.0f);
                next.f11479a.f13610b.z(canvas, width, i58, null, (1.0f - ((1.0f - this.f13593e3.g()) * 0.4f)) * next.s());
                if (this.X2 != null && next.f11479a.f13609a == R.id.btn_vote) {
                    this.X2.d(ib.d.a((Ba() >= 0.5f ? 0.0f : 1.0f - (Ba() / 0.5f)) * pa() * next.s(), j.L(q4())));
                    int i59 = a0.i(3.0f);
                    int width2 = width + next.f11479a.f13610b.getWidth() + i59 + a0.i(7.0f);
                    int height4 = i58 + (next.f11479a.f13610b.getHeight() / 2);
                    this.X2.p(width2 - i59, height4 - i59, width2 + i59, height4 + i59);
                    this.X2.c(canvas);
                }
            }
            f17 = f28;
        }
        int i60 = i57 + a0.i(12.0f);
        int i61 = (i10 + (i12 / 2)) - (this.f13592d3 / 2);
        int i62 = i60 + i30;
        if (!R9()) {
            f16 = 7.0f;
        }
        int i63 = i62 - a0.i(f16);
        if (!Ea() || Fa()) {
            canvas.drawText(this.f13591c3, i61, i63, y.c0(12.0f, ib.d.a(1.0f - f17, i55)));
        } else {
            canvas.drawText(this.f13591c3, i61, i63, y.c0(12.0f, i55));
        }
    }

    public final void ab(String str) {
        x0 x0Var = this.f13595g3;
        if (x0Var == null || !i.c(x0Var.v(), str)) {
            this.f13595g3 = new x0(this.U2.f13618a.question, s4.O1(), K4(), new l0[]{l0.D(this.O0, this.U2.f13618a.question, new TdApi.TextEntity(0, this.U2.f13618a.question.length(), new TdApi.TextEntityTypeBold()), null)}).H(this.P0);
        }
    }

    @Override
    public void b(x2.l lVar, boolean z10) {
        if (this.f13607s3 == lVar && !z10) {
            this.f13607s3 = null;
        }
    }

    @Override
    public void b0(int i10) {
        if (this.f13595g3 == null) {
            bb(this.U2.f13618a.recentVoterUserIds, false);
            ab(this.U2.f13618a.question);
            Wa(this.U2.f13618a.options);
            Pa(this.U2.f13618a.options);
            cb();
            Sa(false);
        }
        this.f13595g3.B(i10);
        int i11 = i10 - a0.i(34.0f);
        for (b bVar : this.W2) {
            bVar.O.B(i11);
        }
    }

    @Override
    public void b1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, ld.b bVar) {
        a1(g1Var, canvas, i10, i11, i12);
        int height = ((i11 + (this.f13595g3.getHeight() + a0.i(5.0f))) + a0.i(18.0f)) - a0.i(10.0f);
        if (this.f13599k3 != null) {
            int width = i10 + this.f13589a3.getWidth() + a0.i(9.0f) + a0.i(6.0f);
            int i13 = (a0.i(9.0f) * 2) - a0.i(4.0f);
            for (int size = this.f13599k3.size() - 1; size >= 0; size--) {
                n.c<e> s10 = this.f13599k3.s(size);
                if ((s10.o() * i13) + width + a0.i(9.0f) + a0.i(2.0f) <= i10 + i12) {
                    s10.f11479a.c(canvas, this, bVar, width + (s10.p() * i13), height, s10.s());
                }
            }
        }
    }

    public final void bb(long[] jArr, boolean z10) {
        if (jArr == null || jArr.length <= 0) {
            n<e> nVar = this.f13599k3;
            if (nVar != null) {
                nVar.m(z10);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(new e(this.O0, j10));
        }
        if (this.f13599k3 == null) {
            this.f13599k3 = new n<>(this.P0);
        }
        this.f13599k3.B(arrayList, z10);
    }

    public final void cb() {
        d dVar = this.V2;
        int i10 = 2;
        int i11 = -1;
        int i12 = 0;
        if (dVar == null) {
            db(this.U2.f13618a);
            if (!this.U2.f13618a.isClosed) {
                i10 = 1;
            }
            Za(i10);
            Ya(t2.y4(this.U2.f13618a), this.U2.f13618a.options);
            if (this.U2.f13618a.type.getConstructor() == 657013913) {
                i11 = ((TdApi.PollTypeQuiz) this.U2.f13618a.type).correctOptionId;
            }
            while (i12 < this.U2.f13618a.options.length) {
                this.W2[i12].M = (i12 == i11 || this.U2.f13618a.options[i12].isChosen) ? 1.0f : 0.0f;
                i12++;
            }
            return;
        }
        db(dVar.f13618a);
        if (this.U2.f13618a.isClosed != this.V2.f13618a.isClosed) {
            if (!this.V2.f13618a.isClosed) {
                i10 = 1;
            }
            Za(i10);
        }
        int i13 = this.U2.f13618a.type.getConstructor() == 657013913 ? ((TdApi.PollTypeQuiz) this.U2.f13618a.type).correctOptionId : -1;
        if (this.V2.f13618a.type.getConstructor() == 657013913) {
            i11 = ((TdApi.PollTypeQuiz) this.V2.f13618a.type).correctOptionId;
        }
        int i14 = 0;
        while (i14 < this.U2.f13618a.options.length) {
            int g10 = this.U2.f13624g ? this.U2.g(i14) : 0;
            int g11 = this.V2.f13624g ? this.V2.g(i14) : 0;
            if (g10 != g11) {
                Xa(i14, na(g10, g11, this.f13597i3));
            }
            this.W2[i14].M = ma((i14 == i13 || this.U2.f13618a.options[i14].isChosen) ? 1.0f : 0.0f, (i14 == i11 || this.V2.f13618a.options[i14].isChosen) ? 1.0f : 0.0f, this.f13597i3);
            i14++;
        }
    }

    public final void db(TdApi.Poll poll) {
        int i10 = poll.totalVoterCount;
        if (!poll.isAnonymous) {
            if (t2.v2(poll)) {
                i10--;
            }
        } else if (Fa() && ka(false) && !t2.v2(poll)) {
            i10++;
        }
        if (this.f13590b3 != i10) {
            this.f13590b3 = i10;
            String charSequence = ta(poll, i10).toString();
            this.f13591c3 = charSequence;
            this.f13592d3 = (int) v0.T1(charSequence, y.b0(12.0f));
        }
    }

    public final void eb(View view) {
        TdApi.FormattedText h12 = t2.h1(xa());
        if (!ob.e.c1(h12)) {
            x2.l lVar = this.f13607s3;
            if (lVar != null) {
                lVar.T(this);
            }
            this.f13607s3 = c0(view, new x2.f() {
                @Override
                public final void d1(View view2, Rect rect) {
                    t5.this.La(view2, rect);
                }
            }).q(R.drawable.baseline_info_24).v(true).e(-2.0f).t(true).n(true).E(this.O0, h12).r(this);
        }
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        return (!X5() && this.f13598j3.e(g1Var, motionEvent)) || super.f8(g1Var, motionEvent);
    }

    public final void fb(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: hd.t5.fb(boolean):void");
    }

    public final void gb() {
        m2 za2;
        if (this.W2 != null) {
            float Ba = Ba();
            float f10 = Ba >= 0.5f ? 0.0f : 1.0f - (Ba / 0.5f);
            int L = j.L(q4());
            int i10 = 0;
            if (Fa()) {
                b[] bVarArr = this.W2;
                int length = bVarArr.length;
                int i11 = 0;
                float f11 = 0.0f;
                while (i10 < length) {
                    b bVar = bVarArr[i10];
                    f11 = Math.max(f11, ya(i11));
                    i11++;
                    i10++;
                }
                if (this.X2 != null || f11 > 0.0f) {
                    qa().d(ib.d.a(f10 * f11, L));
                    return;
                }
                return;
            }
            b[] bVarArr2 = this.W2;
            int length2 = bVarArr2.length;
            int i12 = 0;
            while (i10 < length2) {
                b bVar2 = bVarArr2[i10];
                float ya2 = ya(i12);
                if ((bVar2.P != null || (ya2 > 0.0f && f10 > 0.0f)) && (za2 = za(i12)) != null) {
                    za2.d(ib.d.a(ya2 * f10, L));
                }
                i12++;
                i10++;
            }
        }
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    @Override
    public boolean j(int i10, v vVar, long j10) {
        n<e> nVar = this.f13599k3;
        if (nVar == null) {
            return false;
        }
        Iterator<n.c<e>> it = nVar.iterator();
        while (it.hasNext()) {
            if (it.next().f11479a.f13627a == j10) {
                return true;
            }
        }
        return false;
    }

    public final void ja(TdApi.Poll poll) {
        b[] bVarArr;
        TdApi.Poll xa2 = xa();
        boolean z10 = !t2.Z(xa2, poll) || this.f13595g3 == null;
        if (!z10 && e7()) {
            Qa(true);
            this.V2 = new d(this.O0, poll);
            bb(poll.recentVoterUserIds, true);
            Sa(true);
            if (this.f13599k3 != null) {
                x5();
            }
            if (Ga()) {
                TdApi.PollOption[] pollOptionArr = xa2.options;
                int length = pollOptionArr.length;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 >= length) {
                        i11 = -1;
                        break;
                    } else if (pollOptionArr[i10].isBeingChosen) {
                        break;
                    } else {
                        i11++;
                        i10++;
                    }
                }
                TdApi.PollOption[] pollOptionArr2 = poll.options;
                int length2 = pollOptionArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i13 = -1;
                        break;
                    } else if (pollOptionArr2[i12].isChosen) {
                        break;
                    } else {
                        i13++;
                        i12++;
                    }
                }
                int i14 = poll.type.getConstructor() == 657013913 ? ((TdApi.PollTypeQuiz) poll.type).correctOptionId : 0;
                if (i14 == -1 || i11 == -1 || !poll.options[i11].isChosen) {
                    if (i14 != -1 && i13 != -1 && i14 != i13 && poll.type.getConstructor() == 657013913 && xa2.type.getConstructor() == 657013913 && ob.e.c1(((TdApi.PollTypeQuiz) xa2.type).explanation) && !ob.e.c1(((TdApi.PollTypeQuiz) poll.type).explanation)) {
                        eb(null);
                    } else if (i13 == -1 && !xa2.isClosed && poll.isClosed && xa2.openPeriod > 0 && xa2.closeDate != 0 && (this.O0.H4() / 1000) + 5 >= xa2.closeDate) {
                        n8(false);
                    }
                } else if (i11 == i14) {
                    l8(ra(i11), sa(i11));
                    n8(true);
                } else {
                    n8(false);
                    if (poll.type.getConstructor() == 657013913 && !ob.e.c1(((TdApi.PollTypeQuiz) poll.type).explanation)) {
                        eb(null);
                    }
                }
            }
            if (Fa() && t2.v2(poll)) {
                int i15 = 0;
                for (b bVar : this.W2) {
                    if (bVar.Q != null) {
                        TdApi.PollOption[] pollOptionArr3 = poll.options;
                        if (!pollOptionArr3[i15].isChosen && !pollOptionArr3[i15].isBeingChosen) {
                            bVar.Q.p(false, false);
                            bVar.Q = null;
                        }
                    }
                    i15++;
                }
            }
            if (this.f13596h3 == null) {
                this.f13596h3 = new k(0, this, db.b.f7287b, 280L);
            }
            this.f13596h3.i(1.0f);
            return;
        }
        Qa(false);
        this.U2 = new d(this.O0, poll);
        bb(poll.recentVoterUserIds, false);
        if (this.f13599k3 != null) {
            x5();
        }
        Sa(false);
        cb();
        if (z10) {
            ab(poll.question);
            Wa(poll.options);
            Pa(poll.options);
            y8();
            return;
        }
        u5();
    }

    @Override
    public boolean k7() {
        return !xa().isAnonymous;
    }

    public final boolean ka(boolean z10) {
        return t2.V(xa()) && (!z10 || !Fa() || Da() || !t2.C2(xa()));
    }

    @Override
    public void l(x2.l lVar, float f10) {
        if (this.f13607s3 == lVar) {
            Ua(ib.h.d(f10));
        }
    }

    public final void la(int i10) {
        if (xa().options[i10].isBeingChosen) {
            Client v42 = this.O0.v4();
            TdApi.Message message = this.f13449a;
            v42.o(new TdApi.SetPollAnswer(message.chatId, message.f19946id, null), this.O0.na());
            return;
        }
        Client v43 = this.O0.v4();
        TdApi.Message message2 = this.f13449a;
        v43.o(new TdApi.SetPollAnswer(message2.chatId, message2.f19946id, new int[]{i10}), this.O0.na());
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        float b32 = f10 - b3();
        float c32 = f11 - c3();
        int Y2 = Y2();
        if (b32 >= 0.0f && c32 >= 0.0f) {
            float f12 = Y2;
            if (b32 <= f12 && !d6()) {
                int height = this.f13595g3.getHeight() + a0.i(5.0f);
                if (this.f13600l3 != null && va() > 0.0f) {
                    float minimumWidth = (f12 - (this.f13600l3.getMinimumWidth() / 2.0f)) - a0.i(2.0f);
                    float height2 = height + (this.f13589a3.getHeight() / 2.0f);
                    float i10 = a0.i(6.0f);
                    float minimumWidth2 = (this.f13600l3.getMinimumWidth() / 2.0f) + i10;
                    float minimumHeight = (this.f13600l3.getMinimumHeight() / 2.0f) + i10;
                    if (b32 >= minimumWidth - minimumWidth2 && b32 <= minimumWidth + minimumWidth2 && c32 >= height2 - minimumHeight && c32 <= height2 + minimumHeight) {
                        this.f13606r3 = -3;
                        return true;
                    }
                }
                int i11 = height + a0.i(18.0f);
                int i12 = 0;
                for (b bVar : this.W2) {
                    int wa2 = wa(bVar.O);
                    if (c32 < i11 || c32 >= i11 + wa2) {
                        i11 += wa2;
                        i12++;
                    } else {
                        this.f13606r3 = i12;
                        return true;
                    }
                }
                f fVar = this.f13593e3;
                if (fVar != null && fVar.h() && this.f13594f3.v() != null && !this.f13594f3.v().f11479a.f13611c && c32 >= i11) {
                    if (c32 < W2() + (R9() ? Y1() : 0)) {
                        this.f13606r3 = -2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean m8(View view, float f10, float f11) {
        this.f13598j3.b(view, f10, f11);
        return super.m8(view, f10, f11);
    }

    @Override
    public void o(View view, float f10, float f11) {
        gb.b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        Va(-1, view, f10, f11);
    }

    public final float pa() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.U2.f13620c.length; i10++) {
            f10 = Math.max(f10, ya(i10));
        }
        return f10;
    }

    @Override
    public boolean q6(TdApi.Message message, TdApi.MessageContent messageContent) {
        if (!super.q6(message, messageContent)) {
            return false;
        }
        TdApi.Poll xa2 = xa();
        TdApi.Poll poll = ((TdApi.MessagePoll) messageContent).poll;
        return xa2.options.length == poll.options.length && xa2.type.getConstructor() == poll.type.getConstructor() && t2.m3(xa2) == t2.m3(poll);
    }

    public final m2 qa() {
        if (!Fa()) {
            return null;
        }
        if (this.X2 == null) {
            this.X2 = Na(true);
        }
        return this.X2;
    }

    public final int ra(int i10) {
        return b3() + a0.i(12.0f);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    public final int sa(int i10) {
        b[] bVarArr;
        int c32 = c3() + this.f13595g3.getHeight() + a0.i(5.0f) + a0.i(18.0f);
        int i11 = 0;
        for (b bVar : this.W2) {
            if (i11 == i10) {
                return c32 + a0.i(22.0f);
            }
            c32 += wa(bVar.O);
            i11++;
        }
        return c3() + (W2() / 2);
    }

    public final CharSequence ta(TdApi.Poll poll, int i10) {
        int constructor = xa().type.getConstructor();
        if (constructor != 641265698) {
            if (constructor != 657013913) {
                throw new IllegalArgumentException(xa().type.toString());
            } else if (i10 > 0) {
                return w.q2(R.string.xAnswers, i10);
            } else {
                return w.i1(poll.isClosed ? R.string.NoAnswersResult : R.string.NoAnswers);
            }
        } else if (i10 > 0) {
            return w.q2(R.string.xVotes, i10);
        } else {
            return w.i1(poll.isClosed ? R.string.NoVotesResult : R.string.NoVotes);
        }
    }

    public final Drawable ua(boolean z10) {
        if (z10) {
            if (this.f13601m3 == null) {
                this.f13601m3 = ce.c.f(R.drawable.deproko_baseline_lamp_filled_22);
            }
            return this.f13601m3;
        }
        if (this.f13600l3 == null) {
            this.f13600l3 = ce.c.f(R.drawable.deproko_baseline_lamp_22);
        }
        return this.f13600l3;
    }

    public final float va() {
        d dVar = this.V2;
        if (dVar != null) {
            float f10 = this.f13597i3;
            if (f10 != 0.0f) {
                if (f10 == 1.0f) {
                    return dVar.f13623f;
                }
                return ma(this.U2.f13623f, this.V2.f13623f, this.f13597i3);
            }
        }
        return this.U2.f13623f;
    }

    public final int wa(x0 x0Var) {
        return Math.max(a0.i(46.0f), Math.max(a0.i(8.0f), (a0.i(46.0f) / 2) - (x0Var.s() / 2)) + x0Var.getHeight() + a0.i(12.0f)) + a0.x();
    }

    public final TdApi.Poll xa() {
        d dVar = this.V2;
        if (dVar == null) {
            dVar = this.U2;
        }
        return dVar.f13618a;
    }

    public final float ya(int i10) {
        d dVar = this.V2;
        if (dVar != null) {
            float f10 = this.f13597i3;
            if (f10 != 0.0f) {
                if (f10 == 1.0f) {
                    return dVar.f13620c[i10].f13617c;
                }
                return ma(this.U2.f13620c[i10].f13617c, this.V2.f13620c[i10].f13617c, this.f13597i3);
            }
        }
        return this.U2.f13620c[i10].f13617c;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }

    public final m2 za(int i10) {
        if (Fa()) {
            return null;
        }
        m2 m2Var = this.W2[i10].P;
        if (m2Var != null) {
            return m2Var;
        }
        m2 Na = Na(false);
        this.W2[i10].P = Na;
        return Na;
    }

    public static class d {
        public final TdApi.Poll f13618a;
        public final int f13619b;
        public final c[] f13620c;
        public final float f13621d;
        public final float f13622e;
        public final float f13623f;
        public final boolean f13624g;
        public final boolean f13625h;
        public final boolean f13626i;

        public d(o6 o6Var, TdApi.Poll poll) {
            this.f13618a = poll;
            boolean y42 = t2.y4(poll);
            this.f13624g = y42;
            this.f13621d = y42 ? 1.0f : 0.0f;
            boolean z10 = true;
            int i10 = 0;
            boolean z11 = !poll.isClosed && poll.openPeriod != 0;
            this.f13625h = z11;
            this.f13622e = z11 ? 1.0f : 0.0f;
            z10 = (poll.type.getConstructor() != 657013913 || ob.e.c1(((TdApi.PollTypeQuiz) poll.type).explanation)) ? false : z10;
            this.f13626i = z10;
            this.f13623f = z10 ? 1.0f : 0.0f;
            this.f13619b = t2.I1(poll);
            this.f13620c = new c[poll.options.length];
            while (true) {
                TdApi.PollOption[] pollOptionArr = poll.options;
                if (i10 < pollOptionArr.length) {
                    this.f13620c[i10] = new c(pollOptionArr[i10], h(i10), poll.options[i10].isBeingChosen ? 1.0f : 0.0f);
                    i10++;
                } else {
                    return;
                }
            }
        }

        public int g(int i10) {
            return this.f13618a.options[i10].votePercentage;
        }

        public float h(int i10) {
            int i11 = this.f13619b;
            if (i11 != 0) {
                return this.f13618a.options[i10].voterCount / i11;
            }
            return 0.0f;
        }

        public d(o6 o6Var, d dVar, d dVar2, float f10) {
            if (dVar.f13620c.length == dVar2.f13620c.length) {
                float ma2 = t5.ma(dVar.f13621d, dVar2.f13621d, f10);
                this.f13621d = ma2;
                boolean z10 = true;
                this.f13624g = ma2 > 0.0f;
                float ma3 = t5.ma(dVar.f13622e, dVar2.f13622e, f10);
                this.f13622e = ma3;
                this.f13625h = ma3 > 0.0f;
                float ma4 = t5.ma(dVar.f13623f, dVar2.f13623f, f10);
                this.f13623f = ma4;
                this.f13626i = ma4 <= 0.0f ? false : z10;
                this.f13619b = t5.na(dVar.f13619b, dVar2.f13619b, f10);
                this.f13620c = new c[dVar2.f13620c.length];
                int length = dVar2.f13620c.length;
                TdApi.PollOption[] pollOptionArr = new TdApi.PollOption[length];
                for (int i10 = 0; i10 < length; i10++) {
                    TdApi.PollOption pollOption = dVar.f13618a.options[i10];
                    TdApi.PollOption pollOption2 = dVar2.f13618a.options[i10];
                    TdApi.PollOption pollOption3 = new TdApi.PollOption(pollOption2.text, t5.na(pollOption.voterCount, pollOption2.voterCount, f10), t5.na(pollOption.votePercentage, pollOption2.votePercentage, f10), pollOption2.isChosen, pollOption2.isBeingChosen);
                    pollOptionArr[i10] = pollOption3;
                    this.f13620c[i10] = new c(pollOption3, t5.ma(dVar.f13620c[i10].f13616b, dVar2.f13620c[i10].f13616b, f10), t5.ma(dVar.f13620c[i10].f13617c, dVar2.f13620c[i10].f13617c, f10));
                }
                TdApi.Poll poll = dVar2.f13618a;
                this.f13618a = new TdApi.Poll(poll.f19954id, poll.question, pollOptionArr, poll.totalVoterCount, poll.recentVoterUserIds, poll.isAnonymous, poll.type, poll.openPeriod, poll.closeDate, poll.isClosed);
                return;
            }
            throw new AssertionError(dVar.f13620c.length + " != " + dVar2.f13620c.length);
        }
    }
}
