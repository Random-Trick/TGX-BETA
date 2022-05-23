package hd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.o;
import ce.p0;
import ce.y;
import eb.f;
import eb.k;
import eb.l;
import gb.b;
import gb.c;
import gd.w;
import ib.d;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import je.g;
import je.l0;
import je.t;
import je.w0;
import je.x0;
import kb.j;
import ld.h;
import ld.i;
import ld.p;
import ld.v;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.hj;
import zd.o6;

public class m1 extends a1 {
    public static w0 A0;
    public static w0 B0;
    public static w0 f13236p0;
    public static w0 f13237q0;
    public static w0 f13238r0;
    public static w0 f13239s0;
    public static w0 f13240t0;
    public static w0 f13241u0;
    public static w0 f13242v0;
    public static w0 f13243w0;
    public static w0 f13244x0;
    public static w0 f13245y0;
    public static w0 f13246z0;
    public int W;
    public boolean X;
    public boolean Y;
    public float Z;
    public c f13247a0;
    public float f13248b0;
    public float f13249c0;
    public f f13250d0;
    public boolean f13251e0;
    public f f13252f0;
    public h f13253g0;
    public b f13254h0;
    public h f13255i0;
    public h f13256j0;
    public h f13257k0;
    public boolean f13258l0;
    public int f13259m0;
    public x0 f13260n0;
    public x0 f13261o0;

    public class a implements c.a {
        public final v4 f13262a;
        public final TdApi.PageBlockChatLink f13263b;
        public final hj.q f13264c;

        public a(v4 v4Var, TdApi.PageBlockChatLink pageBlockChatLink, hj.q qVar) {
            this.f13262a = v4Var;
            this.f13263b = pageBlockChatLink;
            this.f13264c = qVar;
        }

        @Override
        public boolean B(float f10, float f11) {
            return b.d(this, f10, f11);
        }

        @Override
        public void C(View view, float f10, float f11) {
            this.f13262a.c().hd().y7(this.f13262a, this.f13263b.username, this.f13264c);
        }

        @Override
        public boolean E4() {
            return b.a(this);
        }

        @Override
        public void G(View view, float f10, float f11) {
            b.h(this, view, f10, f11);
        }

        @Override
        public void U2(View view, float f10, float f11) {
            b.e(this, view, f10, f11);
        }

        @Override
        public void U4(View view, float f10, float f11) {
            b.f(this, view, f10, f11);
        }

        @Override
        public boolean X6(float f10, float f11) {
            return b.c(this, f10, f11);
        }

        @Override
        public long getLongPressDuration() {
            return b.b(this);
        }

        @Override
        public boolean m0(View view, float f10, float f11) {
            return f11 >= 0.0f && f11 < ((float) m1.this.o());
        }

        @Override
        public void o(View view, float f10, float f11) {
            b.i(this, view, f10, f11);
        }

        @Override
        public void o2(View view, float f10, float f11) {
            b.g(this, view, f10, f11);
        }

        @Override
        public boolean s4(View view, float f10, float f11) {
            return b.k(this, view, f10, f11);
        }

        @Override
        public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
            b.j(this, view, motionEvent, f10, f11, f12, f13);
        }
    }

    public m1(v4<?> v4Var, TdApi.PageBlockTitle pageBlockTitle, boolean z10, boolean z11, hj.q qVar) {
        super(v4Var, pageBlockTitle);
        this.W = R.id.theme_color_filling;
        float f10 = 16.0f;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        A0(new TdApi.RichTextBold(pageBlockTitle.title), t0(), t.c.f15485x, qVar);
        if (z11) {
            f10 = 10.0f;
        } else if (z10) {
            f10 = 20.0f;
        }
        this.f13248b0 = f10;
    }

    public static String c0(o6 o6Var, int i10) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(i10);
        calendar.setTimeInMillis(millis);
        int i11 = calendar.get(11);
        int i12 = calendar.get(12);
        int i13 = calendar.get(13);
        if (i11 != 0 || i12 != 0 || i13 != 0) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            return w.a1(millis, timeUnit2, o6Var.H4(), timeUnit2, false, 0);
        } else if (ib.f.m(millis, timeUnit)) {
            return w.i1(R.string.Today);
        } else {
            if (ib.f.p(millis, timeUnit)) {
                return w.i1(R.string.Yesterday);
            }
            return w.o0(millis, TimeUnit.MILLISECONDS);
        }
    }

    public static w0 d0() {
        if (f13238r0 == null) {
            w0 w0Var = new w0(o.x());
            f13238r0 = w0Var;
            w0Var.m(14.0f);
        }
        return f13238r0;
    }

    public static w0 e0() {
        if (f13245y0 == null) {
            w0 w0Var = new w0(o.x());
            f13245y0 = w0Var;
            w0Var.m(16.0f);
        }
        return f13245y0;
    }

    public static w0 f0() {
        if (A0 == null) {
            w0 w0Var = new w0(o.x());
            A0 = w0Var;
            w0Var.m(14.0f);
        }
        return A0;
    }

    public static w0 g0() {
        if (B0 == null) {
            w0 w0Var = new w0(o.x());
            B0 = w0Var;
            w0Var.m(12.0f);
        }
        return B0;
    }

    public static w0 h0() {
        if (f13239s0 == null) {
            w0 w0Var = new w0(o.x());
            f13239s0 = w0Var;
            w0Var.m(14.0f);
        }
        return f13239s0;
    }

    public static w0 i0() {
        if (f13241u0 == null) {
            w0 w0Var = new w0(o.x());
            f13241u0 = w0Var;
            w0Var.m(21.0f);
        }
        return f13241u0;
    }

    public static w0 j0() {
        if (f13244x0 == null) {
            w0 w0Var = new w0(o.x());
            f13244x0 = w0Var;
            w0Var.m(16.0f);
        }
        return f13244x0;
    }

    public static w0 k0() {
        if (f13240t0 == null) {
            w0 w0Var = new w0(o.x());
            f13240t0 = w0Var;
            w0Var.m(16.0f);
        }
        return f13240t0;
    }

    public static w0 l0() {
        if (f13243w0 == null) {
            w0 w0Var = new w0(o.x());
            f13243w0 = w0Var;
            w0Var.m(14.0f);
        }
        return f13243w0;
    }

    public static w0 m0() {
        if (f13246z0 == null) {
            w0 w0Var = new w0(o.x());
            f13246z0 = w0Var;
            w0Var.m(19.0f);
        }
        return f13246z0;
    }

    public static w0 n0() {
        if (f13242v0 == null) {
            w0 w0Var = new w0(o.x());
            f13242v0 = w0Var;
            w0Var.m(19.0f);
        }
        return f13242v0;
    }

    public static w0 o0() {
        if (f13237q0 == null) {
            w0 w0Var = new w0(o.x());
            f13237q0 = w0Var;
            w0Var.m(21.0f);
        }
        return f13237q0;
    }

    public static w0 t0() {
        if (f13236p0 == null) {
            w0 w0Var = new w0(o.x());
            f13236p0 = w0Var;
            w0Var.m(24.0f);
        }
        return f13236p0;
    }

    public void u0(int i10, float f10, float f11, k kVar) {
        this.f12694c.invalidate();
    }

    public void v0(TdApi.Chat chat, long j10, hj.q qVar, TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (supergroupFullInfo.memberCount > 1) {
            B0(chat, j10, qVar);
        }
    }

    public void w0(v4 v4Var, final long j10, final hj.q qVar, TdApi.Object object) {
        if (object.getConstructor() == -1601123095) {
            final TdApi.Chat chat = (TdApi.Chat) object;
            if (!ob.a.l(chat.f19908id)) {
                if (v4Var.c().s3(chat.f19908id) > 1 || v4Var.c().M6(chat)) {
                    B0(chat, j10, qVar);
                } else if (chat.type.getConstructor() == -1472570774) {
                    v4Var.c().e2().j2(ob.a.p(chat.f19908id), new j() {
                        @Override
                        public final void a(Object obj) {
                            m1.this.v0(chat, j10, qVar, (TdApi.SupergroupFullInfo) obj);
                        }
                    });
                }
            }
        }
    }

    public void x0(int i10, float f10, float f11, k kVar) {
        this.f12694c.invalidate();
    }

    public void y0(TdApi.Chat chat, hj.q qVar, long j10) {
        int o10 = o() - (a0.i(8.0f) * 2);
        this.f13253g0 = this.f12692a.c().d3(chat.f19908id);
        int i10 = 0;
        this.f13254h0 = this.f12692a.c().D3(chat, false, a0.u(o10 / 2.0f), null);
        a();
        CharSequence n10 = this.f12692a.c().Bc().n(chat);
        x0 E = new x0(n10.toString(), g0(), this.f13260n0.w(), l0.E(this.f12692a.c(), n10.toString(), t2.x5(n10, false), qVar)).E(1);
        this.f13261o0 = E;
        int v10 = (v() - q0()) - r0();
        if (this.Y) {
            i10 = a0.i(12.0f);
        }
        E.B((v10 - i10) - o10);
        if (!this.f12694c.g() || !this.f12692a.Ra() || SystemClock.uptimeMillis() - j10 <= 50) {
            this.f12694c.invalidate();
            return;
        }
        f fVar = new f(0, new k.b() {
            @Override
            public final void n4(int i11, float f10, float f11, k kVar) {
                m1.this.x0(i11, f10, f11, kVar);
            }

            @Override
            public void o4(int i11, float f10, k kVar) {
                l.a(this, i11, f10, kVar);
            }
        }, db.b.f7287b, 180L);
        this.f13252f0 = fVar;
        fVar.p(true, true);
    }

    public final void A0(TdApi.RichText richText, w0 w0Var, je.k kVar, hj.q qVar) {
        z0(richText, w0Var, kVar, 0, qVar);
    }

    @Override
    public boolean B(View view, MotionEvent motionEvent) {
        x0 x0Var;
        c cVar = this.f13247a0;
        return (cVar != null && cVar.e(view, motionEvent)) || ((x0Var = this.f13260n0) != null && x0Var.x(view, motionEvent));
    }

    public final void B0(final TdApi.Chat chat, final long j10, final hj.q qVar) {
        TdApi.ChatMemberStatus O3 = this.f12692a.c().O3(chat.f19908id);
        if (O3 != null) {
            t2.h3(O3);
        }
        this.f12692a.wd(new Runnable() {
            @Override
            public final void run() {
                m1.this.y0(chat, qVar, j10);
            }
        });
    }

    @Override
    public boolean C(String str) {
        l0[] m10;
        x0 x0Var = this.f13260n0;
        if (!(x0Var == null || (m10 = x0Var.m()) == null)) {
            for (l0 l0Var : m10) {
                if (l0Var.m(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean C0() {
        return this.f13250d0.r(true);
    }

    @Override
    public boolean G() {
        return this.f13250d0 != null;
    }

    @Override
    public void J(a1 a1Var) {
        super.J(a1Var);
        if (a1Var instanceof m1) {
            this.Y = ((m1) a1Var).Y;
        }
    }

    @Override
    public void Q(ld.b bVar) {
        x0 x0Var = this.f13260n0;
        if (x0Var != null) {
            x0Var.C(bVar);
        } else {
            bVar.d();
        }
        if (this.f13253g0 != null) {
            bVar.k(2147483647L).G(this.f13253g0);
        }
    }

    @Override
    public void R(p pVar) {
        pVar.G(this.f13257k0);
    }

    @Override
    public void S(ld.c cVar) {
        h hVar = this.f13257k0;
        if (hVar == null || !t2.T2(hVar.k())) {
            cVar.j(this.f13255i0, this.f13256j0);
        } else {
            cVar.clear();
        }
    }

    @Override
    public int g(View view, int i10) {
        int i11 = 0;
        if (this.f13260n0 == null) {
            return 0;
        }
        int q02 = (i10 - q0()) - r0();
        if (this.Y) {
            i11 = a0.i(12.0f);
        }
        int i12 = q02 - i11;
        g B = this.f13260n0.B(i12);
        x0 x0Var = this.f13261o0;
        if (x0Var != null) {
            x0Var.B(i12);
        }
        this.X = B.z0();
        return this.f13260n0.getHeight() + q() + p0();
    }

    @Override
    public void j(View view, Canvas canvas, v vVar, v vVar2, ld.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f13260n0 != null) {
            int measuredWidth = view.getMeasuredWidth();
            int q02 = q0();
            int q10 = q();
            if (this.f13251e0 && this.W != 0) {
                canvas.drawRect(0.0f, 0.0f, measuredWidth, o(), y.g(ae.j.L(this.W)));
            }
            if (this.f13258l0) {
                int i14 = a0.i(40.0f);
                int i15 = (q02 - i14) - a0.i(14.0f);
                int i16 = q10 - a0.i(4.0f);
                if (this.f13256j0 != null) {
                    if (vVar2.e0()) {
                        if (vVar.e0()) {
                            canvas.drawCircle(i15 + i13, i16 + i13, i14 / 2, y.g(ae.j.E0()));
                        }
                        vVar.K0(i15, i16, i15 + i14, i16 + i14);
                        vVar.draw(canvas);
                    }
                    vVar2.K0(i15, i16, i15 + i14, i14 + i16);
                    vVar2.draw(canvas);
                } else {
                    canvas.drawCircle(i15 + i12, i16 + i12, i14 / 2, y.g(ae.j.L(this.f13259m0)));
                }
            }
            if (this.Y) {
                int L = ae.j.L(R.id.theme_color_iv_blockQuoteLine);
                RectF a02 = y.a0();
                int i17 = a0.i(3.0f);
                int i18 = a0.i(8.0f) / 2;
                a02.top = q10 - i18;
                a02.bottom = i18 + q10 + this.f13260n0.getHeight();
                if (this.X) {
                    a02.right = measuredWidth - q02;
                    a02.left = i11 - i17;
                } else {
                    a02.left = q02;
                    a02.right = q02 + i17;
                }
                float f10 = i17 / 2;
                canvas.drawRoundRect(a02, f10, f10, y.g(L));
                if (this.N) {
                    canvas.drawRect(a02.left, 0.0f, a02.right, i17 + a02.top, y.g(L));
                }
                if (this.M) {
                    canvas.drawRect(a02.left, a02.bottom - i17, a02.right, view.getMeasuredHeight(), y.g(L));
                }
            }
            if (!this.Y) {
                i10 = measuredWidth - q02;
            } else if (this.X) {
                i10 = (measuredWidth - q02) - a0.i(12.0f);
            } else {
                i10 = a0.i(12.0f) + q02 + this.f13260n0.getWidth();
            }
            int i19 = i10;
            if (this.Y) {
                q02 += a0.i(12.0f);
            }
            if (this.f13250d0 != null) {
                ce.b.g(canvas, q02 - a0.i(18.0f), this.f13260n0.q() + q10, ae.j.L(R.id.theme_color_iv_icon), this.f13250d0.g(), 0.0f);
                canvas.drawRect(0.0f, view.getMeasuredHeight() - a0.x(), measuredWidth, view.getMeasuredHeight(), y.g(ae.j.L(R.id.theme_color_iv_separator)));
            }
            if (this.f13261o0 != null) {
                f fVar = this.f13252f0;
                float g10 = fVar != null ? fVar.g() : 1.0f;
                q10 = (int) (q10 - ((this.f13261o0.getHeight() * g10) / 2.0f));
                int O = p0.O(canvas);
                int i20 = a0.i(8.0f);
                int o10 = o() - (i20 * 2);
                float f11 = q02;
                float f12 = o10 / 2.0f;
                int i21 = (int) (((f11 + f12) - (this.f13251e0 ? i20 / 2 : 0)) - ((o10 + i20) * (1.0f - g10)));
                int o11 = o() / 2;
                float f13 = i21;
                float f14 = o11;
                canvas.drawCircle(f13, f14, f12, y.g(d.a(g10, ae.j.E0())));
                if (this.f13253g0 == null || bVar == null) {
                    b bVar2 = this.f13254h0;
                    if (bVar2 != null) {
                        bVar2.b(canvas, f13, f14, g10);
                    }
                } else {
                    p k10 = bVar.k(2147483647L);
                    int i22 = o10 / 2;
                    k10.K0(i21 - i22, o11 - i22, i21 + i22, o11 + i22);
                    k10.E0(i22);
                    k10.V(k10.R0() * g10);
                    k10.draw(canvas);
                    k10.Q();
                }
                if (this.f13251e0) {
                    i20 /= 2;
                }
                q02 = (int) (f11 + ((o10 + i20) * g10));
                p0.N(canvas, O);
            }
            this.f13260n0.i(canvas, q02, i19, 0, q10, null, 1.0f, bVar);
            x0 x0Var = this.f13261o0;
            if (x0Var != null) {
                int height = q10 + this.f13260n0.getHeight();
                f fVar2 = this.f13252f0;
                x0Var.h(canvas, q02, i19, 0, height, null, fVar2 != null ? fVar2.g() * 0.8f : 0.8f);
            }
        }
    }

    @Override
    public int l() {
        return this.W;
    }

    @Override
    public int n(String str, int i10) {
        int F;
        x0 x0Var = this.f13260n0;
        g k10 = x0Var != null ? x0Var.k(i10) : null;
        if (k10 == null || (F = k10.F(str)) <= 0) {
            return 0;
        }
        return q() + (k10.Y() * F);
    }

    @Override
    public int p() {
        x0 x0Var = this.f13260n0;
        if (x0Var != null) {
            return x0Var.getHeight();
        }
        return 0;
    }

    public final int p0() {
        return a0.i(this.f13249c0);
    }

    @Override
    public int q() {
        return s0();
    }

    public final int q0() {
        int i10 = 0;
        int max = Math.max(w(true), (this.R || this.S == null) ? a0.i(this.Z) : 0) + (this.f13258l0 ? a0.i(40.0f) + a0.i(14.0f) : 0);
        if (this.f13250d0 != null) {
            i10 = a0.i(24.0f);
        }
        return max + i10;
    }

    public final int r0() {
        return Math.max(w(false), a0.i(this.Z));
    }

    public final int s0() {
        return a0.i(this.f13248b0);
    }

    @Override
    public int y() {
        return (!this.f13258l0 || this.f13256j0 == null) ? 48 : 52;
    }

    public final void z0(TdApi.RichText richText, w0 w0Var, je.k kVar, int i10, hj.q qVar) {
        v4<?> v4Var = this.f12692a;
        x0 z10 = x0.z(v4Var, v4Var instanceof g.c ? (g.c) v4Var : null, richText, w0Var, kVar, qVar);
        this.f13260n0 = z10;
        z10.H(this.f12694c);
        if (i10 != 0) {
            this.f13260n0.a(i10);
        }
    }

    public m1(v4<?> v4Var, TdApi.PageBlockSubtitle pageBlockSubtitle, hj.q qVar) {
        super(v4Var, pageBlockSubtitle);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13249c0 = 6.0f;
        this.f13248b0 = 0.0f;
        A0(pageBlockSubtitle.subtitle, o0(), t.c.f15486y, qVar);
    }

    public m1(v4<?> v4Var, TdApi.PageBlockHeader pageBlockHeader, hj.q qVar) {
        super(v4Var, pageBlockHeader);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        z0(new TdApi.RichTextBold(pageBlockHeader.header), i0(), t.c.f15487z, 32, qVar);
        this.f13248b0 = 14.0f;
        this.f13249c0 = 8.0f;
    }

    public m1(v4<?> v4Var, TdApi.PageBlockSubheader pageBlockSubheader, hj.q qVar) {
        super(v4Var, pageBlockSubheader);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        z0(new TdApi.RichTextBold(pageBlockSubheader.subheader), n0(), t.c.A, 32, qVar);
        this.f13248b0 = 8.0f;
    }

    public m1(v4<?> v4Var, TdApi.PageBlockKicker pageBlockKicker, hj.q qVar) {
        super(v4Var, pageBlockKicker);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 16.0f;
        this.f13249c0 = 3.0f;
        z0(new TdApi.RichTextBold(pageBlockKicker.kicker), f0(), t.c.f15482u, 32, qVar);
    }

    public m1(v4<?> v4Var, TdApi.PageBlockAuthorDate pageBlockAuthorDate, int i10, hj.q qVar) {
        super(v4Var, pageBlockAuthorDate);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        String trim = t2.h2(pageBlockAuthorDate.author).trim();
        this.f13249c0 = 8.0f;
        this.f13248b0 = 8.0f;
        if (!trim.isEmpty() || pageBlockAuthorDate.publishDate != 0) {
            ArrayList arrayList = new ArrayList();
            if (!trim.isEmpty()) {
                arrayList.add(pageBlockAuthorDate.author);
            }
            if (pageBlockAuthorDate.publishDate != 0) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new TdApi.RichTextPlain(w.i1(R.string.format_ivAuthorDateSeparator)));
                }
                arrayList.add(new TdApi.RichTextPlain(c0(v4Var.c(), pageBlockAuthorDate.publishDate)));
            }
            if (i10 != 0) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new TdApi.RichTextPlain(w.i1(R.string.format_ivAuthorDateSeparator)));
                }
                arrayList.add(new TdApi.RichTextPlain(w.o2(R.string.xViews, i10)));
            }
            A0(arrayList.size() == 1 ? (TdApi.RichText) arrayList.get(0) : new TdApi.RichTexts((TdApi.RichText[]) arrayList.toArray(new TdApi.RichText[0])), d0(), t.c.B, qVar);
        }
    }

    public m1(v4<?> v4Var, TdApi.PageBlockParagraph pageBlockParagraph, hj.q qVar) {
        super(v4Var, pageBlockParagraph);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        z0(pageBlockParagraph.text, k0(), t.c.f15478q, 32, qVar);
    }

    public m1(v4<?> v4Var, TdApi.PageBlockPreformatted pageBlockPreformatted, hj.q qVar) {
        super(v4Var, pageBlockPreformatted);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        z0(pageBlockPreformatted.text, l0(), t.c.f15478q, 32, qVar);
        this.W = R.id.theme_color_iv_preBlockBackground;
        this.Z = 14.0f;
    }

    public m1(v4<?> v4Var, TdApi.PageBlockRelatedArticles pageBlockRelatedArticles, hj.q qVar) {
        super(v4Var, pageBlockRelatedArticles);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        A0(new TdApi.RichTextBold(pageBlockRelatedArticles.header), k0(), t.c.f15482u, qVar);
    }

    public m1(v4<?> v4Var, TdApi.PageBlockTable pageBlockTable, hj.q qVar) {
        super(v4Var, pageBlockTable);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 15.0f;
        this.f13249c0 = 2.0f;
        z0(pageBlockTable.caption, f0(), t.c.f15482u, 34, qVar);
    }

    public m1(v4<?> v4Var, TdApi.PageBlockDetails pageBlockDetails, hj.q qVar) {
        super(v4Var, pageBlockDetails);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        this.f13250d0 = new f(0, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                m1.this.u0(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, db.b.f7287b, 180L, pageBlockDetails.isOpen);
        this.f13248b0 = 15.0f;
        this.f13249c0 = 12.0f;
        z0(pageBlockDetails.header, k0(), t.c.f15478q, 32, qVar);
    }

    public m1(v4<?> v4Var, TdApi.PageBlockList pageBlockList, hj.q qVar) {
        super(v4Var, pageBlockList);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        A0(new TdApi.RichTextPlain(""), k0(), t.c.f15478q, qVar);
    }

    public m1(final v4<?> v4Var, TdApi.PageBlockChatLink pageBlockChatLink, boolean z10, int i10, final hj.q qVar) {
        super(v4Var, pageBlockChatLink);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13249c0 = 16.0f;
        this.f13248b0 = 16.0f;
        A0(new TdApi.RichTextBold(new TdApi.RichTextPlain(pageBlockChatLink.title)), k0(), z10 ? t.c.f15479r : t.c.f15478q, qVar);
        this.f13251e0 = z10;
        this.W = z10 ? R.id.theme_color_iv_chatLinkOverlayBackground : R.id.theme_color_iv_chatLinkBackground;
        this.f13247a0 = new c(new a(v4Var, pageBlockChatLink, qVar));
        if (this.f12693b.getConstructor() == -202091253) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            v4Var.c().v4().o(new TdApi.SearchPublicChat(((TdApi.PageBlockChatLink) this.f12693b).username), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    m1.this.w0(v4Var, uptimeMillis, qVar, object);
                }
            });
        }
    }

    public m1(v4<?> v4Var, TdApi.PageBlockFooter pageBlockFooter, boolean z10, hj.q qVar) {
        super(v4Var, pageBlockFooter);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        A0(pageBlockFooter.footer, h0(), t.c.f15481t, qVar);
        if (!z10) {
            this.W = 0;
        } else {
            this.f13248b0 = 3.0f;
        }
    }

    public m1(v4<?> v4Var, TdApi.PageBlockBlockQuote pageBlockBlockQuote, boolean z10, hj.q qVar) {
        super(v4Var, pageBlockBlockQuote);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        if (z10) {
            z0(pageBlockBlockQuote.credit, f0(), t.c.f15482u, 32, qVar);
            if (!e.d1(pageBlockBlockQuote.text)) {
                this.f13248b0 = 3.0f;
            } else {
                this.f13248b0 = 12.0f;
            }
            this.f13249c0 = 12.0f;
        } else {
            z0(pageBlockBlockQuote.text, e0(), t.c.f15484w, 32, qVar);
            if (!e.d1(pageBlockBlockQuote.credit)) {
                this.f13249c0 = 3.0f;
            } else {
                this.f13249c0 = 12.0f;
            }
            this.f13248b0 = 12.0f;
        }
        this.Y = true;
    }

    public m1(v4<?> v4Var, TdApi.PageBlockPullQuote pageBlockPullQuote, boolean z10, hj.q qVar) {
        super(v4Var, pageBlockPullQuote);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        if (z10) {
            z0(pageBlockPullQuote.credit, f0(), t.c.f15482u, 34, qVar);
            this.f13248b0 = 3.0f;
        } else {
            z0(pageBlockPullQuote.text, m0(), t.c.f15483v, 34, qVar);
            if (!e.d1(pageBlockPullQuote.credit)) {
                this.f13249c0 = 3.0f;
            }
        }
        this.Z = 22.0f;
    }

    public m1(v4<?> v4Var, TdApi.PageBlock pageBlock, TdApi.PageBlockCaption pageBlockCaption, boolean z10, boolean z11, hj.q qVar) {
        super(v4Var, pageBlock);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        float f10 = 8.0f;
        if (z10) {
            if (!e.d1(pageBlockCaption.text)) {
                this.f13248b0 = 2.0f;
            } else {
                this.f13248b0 = 10.0f;
            }
            z0(pageBlockCaption.credit, g0(), t.c.f15482u, 32, qVar);
            this.f13249c0 = z11 ? 2.0f : f10;
            return;
        }
        if (!e.d1(pageBlockCaption.credit)) {
            this.f13249c0 = 2.0f;
        } else {
            this.f13249c0 = z11 ? 2.0f : f10;
        }
        this.f13248b0 = 10.0f;
        z0(pageBlockCaption.text, f0(), t.c.f15482u, 32, qVar);
    }

    public m1(v4<?> v4Var, TdApi.PageBlockEmbeddedPost pageBlockEmbeddedPost, hj.q qVar) {
        super(v4Var, pageBlockEmbeddedPost);
        this.W = R.id.theme_color_filling;
        this.Z = 16.0f;
        this.f13248b0 = 6.0f;
        this.f13249c0 = 6.0f;
        z0(new TdApi.RichTexts(new TdApi.RichText[]{new TdApi.RichTextPlain(pageBlockEmbeddedPost.author), new TdApi.RichTextPlain("\n"), new TdApi.RichTextPlain(c0(v4Var.c(), pageBlockEmbeddedPost.date))}), h0(), t.c.B, 32, qVar);
        this.f13258l0 = true;
        TdApi.PhotoSize J0 = e.J0(pageBlockEmbeddedPost.authorPhoto);
        if (J0 != null) {
            if (pageBlockEmbeddedPost.authorPhoto.minithumbnail != null) {
                this.f13255i0 = new i(pageBlockEmbeddedPost.authorPhoto.minithumbnail);
            } else {
                this.f13255i0 = null;
            }
            h hVar = new h(v4Var.c(), J0.photo);
            this.f13256j0 = hVar;
            hVar.t0(wc.a.getDefaultAvatarCacheSize());
            TdApi.PhotoSize s02 = t2.s0(pageBlockEmbeddedPost.authorPhoto, J0);
            if (s02 != null) {
                h hVar2 = new h(v4Var.c(), s02.photo);
                this.f13257k0 = hVar2;
                hVar2.t0(wc.a.getDefaultAvatarCacheSize());
                this.f13257k0.k0();
                return;
            }
            this.f13256j0.k0();
            return;
        }
        this.f13259m0 = t2.H0(pageBlockEmbeddedPost.author.hashCode(), 0L);
    }
}
