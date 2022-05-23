package hd;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.y;
import de.iq;
import de.ra;
import de.rh;
import eb.k;
import gb.j;
import gd.w;
import hd.c4;
import hd.t2;
import ib.e;
import ib.i;
import id.d;
import ie.o;
import ie.s;
import ie.t;
import ie.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import je.g;
import k0.h;
import kb.f;
import ne.m2;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import uc.c;
import ud.f2;
import ud.v4;
import ud.x2;
import vc.g1;
import zd.hj;

public class c4 {
    public final s4 f12850a;
    public final s4 f12851b;
    public j f12853d;
    public int f12854e;
    public TdApi.ReplyMarkupInlineKeyboard f12855f;
    public long f12856g;
    public boolean f12858i;
    public boolean f12859j;
    public int f12860k;
    public int f12861l;
    public int f12863n;
    public int f12864o;
    public int f12865p;
    public int f12862m = -1;
    public final ArrayList<a> f12857h = new ArrayList<>();
    public final RectF f12852c = new RectF();

    public interface b {
        boolean a(View view, c4 c4Var, a aVar);

        void b(View view, c4 c4Var, a aVar);
    }

    public c4(s4 s4Var, boolean z10) {
        this.f12850a = s4Var;
        this.f12851b = s4Var;
    }

    public static String g(String str) {
        int indexOf;
        int indexOf2 = str.indexOf(10);
        if (indexOf2 == -1 || (indexOf = str.indexOf(10, indexOf2 + 1)) == -1) {
            return str;
        }
        return str.substring(0, indexOf) + ' ' + str.substring(indexOf + 1).replace('\n', ' ');
    }

    public static int l(TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr) {
        int i10 = -1;
        for (TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 : inlineKeyboardButtonArr) {
            if (inlineKeyboardButtonArr2.length > i10) {
                i10 = inlineKeyboardButtonArr2.length;
            }
        }
        return i10;
    }

    public static int o() {
        return a0.i(39.0f);
    }

    public static int p() {
        return a0.i(4.0f);
    }

    public static int q() {
        return a0.i(4.0f);
    }

    public static int t() {
        return Math.round(y.M().getStrokeWidth() * 0.5f);
    }

    public void A(int i10, String str, int i11, boolean z10, b bVar) {
        this.f12854e = i11;
        this.f12858i = true;
        this.f12859j = z10;
        a aVar = new a(this, this.f12851b, str.toUpperCase(), i10, i11 - (p() * 2));
        aVar.G0(bVar);
        aVar.I0(this.f12853d);
        this.f12857h.clear();
        this.f12857h.add(aVar);
    }

    public void B(j jVar) {
        this.f12853d = jVar;
        Iterator<a> it = this.f12857h.iterator();
        while (it.hasNext()) {
            it.next().I0(jVar);
        }
    }

    public void C(long j10, long j11) {
        if (this.f12856g == j10) {
            this.f12856g = j11;
        }
    }

    public final void f(int i10, int i11) {
        int i12;
        int i13;
        a aVar;
        if (this.f12855f != null) {
            this.f12854e = i10;
            int q10 = q();
            int p10 = p();
            int size = this.f12857h.size();
            int i14 = a0.i(12.0f);
            TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr = this.f12855f.rows;
            int length = inlineKeyboardButtonArr.length;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            float f10 = 0.0f;
            while (i16 < length) {
                TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 = inlineKeyboardButtonArr[i16];
                int length2 = (i10 - ((inlineKeyboardButtonArr2.length - 1) * q10)) / inlineKeyboardButtonArr2.length;
                int i18 = p10 * 2;
                p10 = p10;
                int max = Math.max(i15, length2 - i18);
                int length3 = inlineKeyboardButtonArr2.length;
                inlineKeyboardButtonArr = inlineKeyboardButtonArr;
                int i19 = 0;
                while (i19 < length3) {
                    length = length;
                    TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i19];
                    if (i17 >= size) {
                        i13 = size;
                        i12 = length3;
                        aVar = new a(this, this.f12851b, inlineKeyboardButton, max);
                        aVar.I0(this.f12853d);
                        this.f12857h.add(aVar);
                    } else {
                        i13 = size;
                        i12 = length3;
                        aVar = this.f12857h.get(i17);
                        aVar.F0(inlineKeyboardButton, max);
                    }
                    float S = aVar.S();
                    if (S != 0.0f) {
                        f10 = Math.max(f10, ((S + i18) * inlineKeyboardButtonArr2.length) + ((inlineKeyboardButtonArr2.length - 1) * q10));
                    }
                    int b10 = aVar.M.b() + (i14 * 2);
                    if (length2 < b10) {
                        f10 = Math.max(f10, (b10 * inlineKeyboardButtonArr2.length) + ((inlineKeyboardButtonArr2.length - 1) * q10));
                    }
                    i17++;
                    i19++;
                    size = i13;
                    length3 = i12;
                }
                i16++;
                i15 = 0;
            }
            if (i17 < this.f12857h.size() - 1) {
                while (i17 < this.f12857h.size()) {
                    this.f12857h.remove(i17);
                    i17++;
                }
            }
            if (i11 != 0 && i11 > i10 && f10 > i10) {
                f((int) Math.min(f10, i11), 0);
            }
        }
    }

    public void h() {
        this.f12855f = null;
        this.f12856g = 0L;
    }

    public boolean i(View view) {
        if (this.f12857h.size() <= 0) {
            return false;
        }
        this.f12857h.get(0).D0(view);
        return true;
    }

    public void j(g1 g1Var, Canvas canvas, int i10, int i11) {
        this.f12860k = i10;
        this.f12861l = i11;
        int o10 = o();
        int q10 = q();
        int t10 = t();
        if (this.f12858i) {
            this.f12857h.get(0).K(g1Var, canvas, i10, i11, this.f12854e, o10, this.f12859j ? 0 : t10, this.f12852c, 0, 0);
            return;
        }
        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard = this.f12855f;
        if (replyMarkupInlineKeyboard != null) {
            TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr = replyMarkupInlineKeyboard.rows;
            int length = inlineKeyboardButtonArr.length;
            int i12 = i11;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 = inlineKeyboardButtonArr[i14];
                int length2 = (this.f12854e - ((inlineKeyboardButtonArr2.length - 1) * q10)) / inlineKeyboardButtonArr2.length;
                int length3 = inlineKeyboardButtonArr2.length;
                int i16 = i10;
                int i17 = i13;
                int i18 = 0;
                for (int i19 = 0; i19 < length3; i19++) {
                    TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i19];
                    length3 = length3;
                    inlineKeyboardButtonArr2 = inlineKeyboardButtonArr2;
                    i14 = i14;
                    length = length;
                    this.f12857h.get(i17).K(g1Var, canvas, i16, i12, length2, o10, t10, this.f12852c, i15, i18);
                    i16 += length2 + q10;
                    i17++;
                    i18++;
                }
                i13 = i17;
                i12 += q10 + o10;
                i15++;
                i14++;
            }
        }
    }

    public final int k(int i10, int i11) {
        int q10 = q();
        int o10 = o();
        if (this.f12858i) {
            return (this.f12857h.isEmpty() || i10 < 0 || i10 > this.f12854e || i11 < 0 || i11 > o10) ? -1 : 0;
        }
        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard = this.f12855f;
        if (replyMarkupInlineKeyboard != null && i10 >= 0 && i11 >= 0) {
            TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr = replyMarkupInlineKeyboard.rows;
            int length = inlineKeyboardButtonArr.length;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 = inlineKeyboardButtonArr[i12];
                if (i11 < i13) {
                    return -1;
                }
                if (i11 > i13 + o10) {
                    i13 += o10 + q10;
                    i14 += inlineKeyboardButtonArr2.length;
                    i12++;
                } else {
                    int length2 = (this.f12854e - ((inlineKeyboardButtonArr2.length - 1) * q10)) / inlineKeyboardButtonArr2.length;
                    int i15 = 0;
                    for (TdApi.InlineKeyboardButton inlineKeyboardButton : inlineKeyboardButtonArr2) {
                        if (i10 < i15) {
                            return -1;
                        }
                        if (i10 > i15 + length2) {
                            i15 += length2 + q10;
                            i14++;
                        } else {
                            this.f12864o = i15;
                            this.f12865p = i13;
                            return i14;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public final void m(int i10) {
        TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr;
        if (this.f12855f != null && i10 >= 0 && i10 < this.f12857h.size()) {
            int q10 = q();
            int o10 = o();
            int i11 = 0;
            int i12 = 0;
            for (TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 : this.f12855f.rows) {
                int length = (this.f12854e - ((inlineKeyboardButtonArr2.length - 1) * q10)) / inlineKeyboardButtonArr2.length;
                int length2 = inlineKeyboardButtonArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 < length2) {
                        TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i13];
                        int i15 = i11 + 1;
                        if (i11 == i10) {
                            this.f12864o = i14;
                            this.f12865p = i12;
                            i11 = i15;
                            break;
                        }
                        i14 += length + q10;
                        i13++;
                        i11 = i15;
                    }
                }
                i12 += o10 + q10;
            }
            this.f12864o = -1;
            this.f12865p = -1;
        }
    }

    public a n() {
        return this.f12857h.get(0);
    }

    public int r() {
        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard = this.f12855f;
        if (replyMarkupInlineKeyboard != null) {
            return (replyMarkupInlineKeyboard.rows.length * o()) + ((this.f12855f.rows.length - 1) * q());
        }
        return 0;
    }

    public final int s() {
        return p() * 4;
    }

    public int u() {
        return this.f12854e;
    }

    public boolean v() {
        return this.f12855f == null;
    }

    public boolean w(View view, MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.f12857h.isEmpty()) {
            return false;
        }
        int round = Math.round(motionEvent.getX() - this.f12860k);
        int round2 = Math.round(motionEvent.getY() - this.f12861l);
        if (motionEvent.getAction() == 0) {
            this.f12862m = k(round, round2);
            this.f12863n = this.f12854e;
        }
        int i10 = this.f12862m;
        if (!(i10 == -1 || this.f12863n == this.f12854e)) {
            m(i10);
        }
        int i11 = this.f12862m;
        if (i11 != -1 && i11 >= 0 && i11 < this.f12857h.size() && this.f12857h.get(this.f12862m).y0(view, motionEvent, Math.round(round - this.f12864o), Math.round(round2 - this.f12865p))) {
            z10 = true;
        }
        if (this.f12862m != -1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            this.f12862m = -1;
        }
        return z10;
    }

    public void x(View view) {
        TdApi.InlineKeyboardButtonType inlineKeyboardButtonType;
        if (this.f12857h.size() > 0 && (inlineKeyboardButtonType = this.f12857h.get(0).N) != null && inlineKeyboardButtonType.getConstructor() == -383429528) {
            this.f12857h.get(0).D0(view);
        }
    }

    public boolean y(View view) {
        Iterator<a> it = this.f12857h.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (it.next().E0(view)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void z(long j10, TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard, int i10, int i11) {
        this.f12855f = replyMarkupInlineKeyboard;
        this.f12856g = j10;
        int min = Math.min(i11, Math.max(a0.i(this.f12850a.R9() ? 40.0f : 200.0f), Math.max(i10, l(replyMarkupInlineKeyboard.rows) * s())));
        this.f12854e = min;
        f(min, i11);
    }

    public static class a implements k.b, t {
        public v M;
        public TdApi.InlineKeyboardButtonType N;
        public c4 O;
        public boolean P;
        public int Q;
        public boolean R;
        public String S;
        public float T;
        public j W;
        public int X;
        public int Y;
        public int Z;
        public final s4 f12866a;
        public int f12867a0;
        public x2.l f12869b0;
        public float f12871c0;
        public k f12872d0;
        public float f12873e0;
        public k f12874f0;
        public float f12875g0;
        public k f12876h0;
        public float f12877i0;
        public m2 f12878j0;
        public k f12879k0;
        public kb.b f12880l0;
        public b f12881m0;
        public h<Drawable> f12882n0;
        public int U = -1;
        public int V = -1;
        public final Path f12868b = new Path();
        public final Rect f12870c = new Rect();

        public class C0118a extends kb.b {
            public C0118a() {
            }

            @Override
            public void b() {
                a.this.G(1.0f);
            }
        }

        public class b implements hj.n {
            public final int f12883a;
            public final byte[] f12884b;
            public final View f12885c;

            public b(int i10, byte[] bArr, View view) {
                this.f12883a = i10;
                this.f12884b = bArr;
                this.f12885c = view;
            }

            @Override
            public void a(TdApi.Object object) {
                if (this.f12883a == a.this.f12867a0) {
                    a.this.x0();
                }
            }

            @Override
            public void b(String str) {
                if (this.f12883a == a.this.f12867a0) {
                    a.this.w0();
                    a.this.I();
                    a.this.G(1.0f);
                }
                a.this.O.f12850a.O0.v4().o(new TdApi.GetCallbackQueryAnswer(a.this.f12866a.I2(), a.this.O.f12856g, new TdApi.CallbackQueryPayloadDataWithPassword(str, this.f12884b)), a.this.O(this.f12883a, this.f12885c, false));
            }
        }

        public a(c4 c4Var, s4 s4Var, TdApi.InlineKeyboardButton inlineKeyboardButton, int i10) {
            this.O = c4Var;
            this.f12866a = s4Var;
            String O0 = O0(c4.g(inlineKeyboardButton.text));
            boolean M0 = g.M0(O0);
            this.P = M0;
            this.M = new v(O0, i10, y.m(M0));
            TdApi.InlineKeyboardButtonType inlineKeyboardButtonType = inlineKeyboardButton.type;
            this.N = inlineKeyboardButtonType;
            if (inlineKeyboardButtonType.getConstructor() == 1360739440) {
                String d10 = e.d(((TdApi.MessageInvoice) s4Var.X3().content).currency);
                this.S = d10;
                this.T = v0.T1(d10, y.q(10.0f));
            }
        }

        public void Y(int i10, String str, boolean z10, View view, CharSequence charSequence, boolean z11) {
            if (i10 == this.f12867a0) {
                x0();
            }
            if (!this.f12866a.U5()) {
                v4<?> F = this.f12866a.t().Q1().F();
                boolean z12 = F instanceof rh;
                if (F != null && F.C9() == this.f12866a.I2()) {
                    if (!i.i(str)) {
                        if (!z10 || !z12) {
                            F.Qc(str, z0(i10, view));
                        } else {
                            TdApi.Message X3 = this.f12866a.X3();
                            rh rhVar = (rh) F;
                            long j10 = X3.viaBotUserId;
                            if (j10 == 0) {
                                j10 = ob.e.T0(X3);
                            }
                            rhVar.Do(j10, ((TdApi.MessageGame) X3.content).game, str, X3);
                        }
                    }
                    if (charSequence == null) {
                        return;
                    }
                    if (z11 || !z12) {
                        F.Xc(this.O.f12850a.c().ba(this.f12866a.X3()), charSequence);
                    } else {
                        ((rh) F).Pq(charSequence);
                    }
                }
            }
        }

        public void a0(int i10) {
            if (i10 == this.f12867a0) {
                x0();
            }
        }

        public void b0(int i10) {
            if (i10 == this.f12867a0) {
                x0();
            }
        }

        public void c0(final int i10, final boolean z10, final View view, TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor != -1679978726) {
                if (constructor != 360867933) {
                    Log.unexpectedTdlibResponse(object, TdApi.GetCallbackQueryAnswer.class, TdApi.CallbackQueryAnswer.class);
                    this.O.f12850a.c().hd().post(new Runnable() {
                        @Override
                        public final void run() {
                            c4.a.this.b0(i10);
                        }
                    });
                    return;
                }
                TdApi.CallbackQueryAnswer callbackQueryAnswer = (TdApi.CallbackQueryAnswer) object;
                final CharSequence I = callbackQueryAnswer.text.isEmpty() ? null : d.z().I(callbackQueryAnswer.text);
                final boolean z11 = callbackQueryAnswer.showAlert;
                final String str = callbackQueryAnswer.url;
                this.O.f12850a.c().hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        c4.a.this.Y(i10, str, z10, view, I, z11);
                    }
                });
            } else if (((TdApi.Error) object).code == 502) {
                j0.q0(this.O.f12850a.c().ba(this.f12866a.X3()));
            } else {
                j0.t0(object);
                this.O.f12850a.c().hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        c4.a.this.a0(i10);
                    }
                });
            }
        }

        public static Object d0(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            if (i12 == 1) {
                return new o(null, R.id.theme_color_textLink);
            }
            return w.d2(z10);
        }

        public static Object e0(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return new o(null, R.id.theme_color_textLink);
        }

        public void f0(List list, TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, int i10, View view, boolean z10, int i11, SparseIntArray sparseIntArray) {
            boolean D = ((ra) list.get(0)).D();
            boolean z11 = list.size() > 1 && ((ra) list.get(1)).D();
            if (D) {
                w0();
                J0();
                this.O.f12850a.c().v4().o(new TdApi.GetLoginUrl(this.f12866a.I2(), this.O.f12856g, inlineKeyboardButtonTypeLoginUrl.f19918id, z11), R(i10, view, inlineKeyboardButtonTypeLoginUrl, z10));
                return;
            }
            B0(i10, view, inlineKeyboardButtonTypeLoginUrl.url, false);
        }

        public static void g0(ra raVar, c cVar, boolean z10) {
            int A = raVar.A();
            if (A == 12 || A == 69 || A == 99) {
                ((ne.w) cVar.getChildAt(0)).e(raVar.D(), z10);
            }
        }

        public static void h0(List list, View view, int i10, ra raVar, TextView textView, iq iqVar) {
            int j10 = raVar.j();
            if (j10 == R.id.btn_allowWriteAccess) {
                if (iqVar.y0().get(R.id.btn_allowWriteAccess) == R.id.btn_allowWriteAccess) {
                    ((ra) list.get(0)).S(true);
                    iqVar.p3(R.id.btn_signIn);
                }
            } else if (j10 == R.id.btn_signIn) {
                if (!(iqVar.y0().get(R.id.btn_signIn) == R.id.btn_signIn)) {
                    ((ra) list.get(1)).S(false);
                    iqVar.p3(R.id.btn_allowWriteAccess);
                }
            }
        }

        public void i0(final int i10, TdApi.Object object, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z10) {
            if (i10 == this.f12867a0) {
                x0();
            }
            if (!this.f12866a.U5()) {
                v4<?> F = this.f12866a.t().Q1().F();
                if ((F instanceof rh) && F.C9() == this.f12866a.I2()) {
                    int constructor = object.getConstructor();
                    if (constructor == -1679978726) {
                        j0.t0(object);
                        B0(i10, view, inlineKeyboardButtonTypeLoginUrl.url, z10);
                    } else if (constructor == -1079045420) {
                        TdApi.LoginUrlInfoOpen loginUrlInfoOpen = (TdApi.LoginUrlInfoOpen) object;
                        this.O.f12850a.c().hd().E7(this.O.f12850a.Q0(), loginUrlInfoOpen.url, z0(i10, view).e().n(!loginUrlInfoOpen.skipConfirm));
                    } else if (constructor == 2128290863) {
                        TdApi.LoginUrlInfoRequestConfirmation loginUrlInfoRequestConfirmation = (TdApi.LoginUrlInfoRequestConfirmation) object;
                        final ArrayList arrayList = new ArrayList();
                        arrayList.add(new ra(99, (int) R.id.btn_signIn, 0, w.h1(R.string.LogInAsOn, u3.f13641a, this.O.f12850a.c().E1(), loginUrlInfoRequestConfirmation.domain), true));
                        if (loginUrlInfoRequestConfirmation.requestWriteAccess) {
                            arrayList.add(new ra(99, (int) R.id.btn_allowWriteAccess, 0, w.h1(R.string.AllowWriteAccess, w.p(), this.O.f12850a.c().e2().J2(loginUrlInfoRequestConfirmation.botUserId)), true));
                        }
                        this.O.f12850a.Q0().me(new f2(R.id.btn_open).b(w.h1(R.string.OpenLinkConfirm, q3.f13359a, loginUrlInfoRequestConfirmation.url)).o(arrayList).j(new v4.r() {
                            @Override
                            public final void l6(int i11, SparseIntArray sparseIntArray) {
                                c4.a.this.f0(arrayList, inlineKeyboardButtonTypeLoginUrl, i10, view, z10, i11, sparseIntArray);
                            }
                        }).t(o3.f13332a).n(loginUrlInfoRequestConfirmation.requestWriteAccess ? new v4.n() {
                            @Override
                            public final void a(View view2, int i11, ra raVar, TextView textView, iq iqVar) {
                                c4.a.h0(arrayList, view2, i11, raVar, textView, iqVar);
                            }
                        } : null).r(R.string.Open).o(arrayList));
                    }
                }
            }
        }

        public void j0(final int i10, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z10, final TdApi.Object object) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    c4.a.this.i0(i10, object, view, inlineKeyboardButtonTypeLoginUrl, z10);
                }
            });
        }

        public void k0(int i10, TdApi.Object object, View view, TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, boolean z10) {
            if (i10 == this.f12867a0) {
                x0();
            }
            if (!this.f12866a.U5()) {
                v4<?> F = this.f12866a.t().Q1().F();
                if ((F instanceof rh) && F.C9() == this.f12866a.I2()) {
                    int constructor = object.getConstructor();
                    if (constructor == -2018019930) {
                        this.O.f12850a.c().hd().E7(this.O.f12850a.Q0(), ((TdApi.HttpUrl) object).url, z0(i10, view).e());
                    } else if (constructor == -1679978726) {
                        j0.t0(object);
                        B0(i10, view, inlineKeyboardButtonTypeLoginUrl.url, z10);
                    }
                }
            }
        }

        public void l0(final int i10, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z10, final TdApi.Object object) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    c4.a.this.k0(i10, object, view, inlineKeyboardButtonTypeLoginUrl, z10);
                }
            });
        }

        public void m0(int i10, byte[] bArr, View view, CharSequence charSequence) {
            this.O.f12850a.O0.hd().W7(this.O.f12850a.a7(), charSequence, new b(i10, bArr, view));
        }

        public Object n0(t2.c cVar, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return w.h2(this.O.f12850a.Q0(), i12 == 0 ? cVar.f13565a : cVar.f13566b);
        }

        public void o0(int i10, TdApi.User user, TdApi.User user2, final t2.c cVar, kb.j jVar) {
            CharSequence charSequence;
            if (i10 == this.f12867a0) {
                if (user == null || user2 == null) {
                    charSequence = w.H0(this.O.f12850a.a7(), R.string.TransferOwnershipAlertBot, new Object[0]);
                } else {
                    charSequence = w.G0(this.O.f12850a.a7(), R.string.TransferOwnershipAlertBotName, new w.f() {
                        @Override
                        public final Object a(CharSequence charSequence2, int i11, int i12, int i13, boolean z10) {
                            Object n02;
                            n02 = c4.a.this.n0(cVar, charSequence2, i11, i12, i13, z10);
                            return n02;
                        }
                    }, this.O.f12850a.O0.e2().J2(cVar.f13565a), this.O.f12850a.O0.e2().J2(cVar.f13566b));
                }
                jVar.a(charSequence);
            }
        }

        public void p0(AtomicInteger atomicInteger, final t2.c cVar, final int i10, final kb.j jVar, TdApi.Object object) {
            if (atomicInteger.decrementAndGet() == 0) {
                final TdApi.User u22 = this.O.f12850a.O0.e2().u2(cVar.f13565a);
                final TdApi.User u23 = this.O.f12850a.O0.e2().u2(cVar.f13566b);
                this.O.f12850a.O0.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        c4.a.this.o0(i10, u22, u23, cVar, jVar);
                    }
                });
            }
        }

        public void q0(TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline) {
            this.X &= -5;
            v4<?> F = this.f12866a.t().Q1().F();
            if (F instanceof rh) {
                TdApi.Message X3 = this.f12866a.X3();
                rh rhVar = (rh) F;
                long j10 = X3.viaBotUserId;
                if (j10 == 0) {
                    j10 = ob.e.T0(X3);
                }
                rhVar.kr(j10, inlineKeyboardButtonTypeSwitchInline);
            }
        }

        public void r0(int i10, View view, String str, boolean z10) {
            this.X &= -5;
            B0(i10, view, str, z10);
        }

        public boolean s0(View view) {
            C0(view, false);
            return true;
        }

        public void t0(x2.l lVar) {
            this.f12869b0 = lVar;
        }

        public void u0(View view, Rect rect) {
            rect.set(this.f12870c);
        }

        public void v0(View view, Rect rect) {
            rect.set(this.f12870c);
        }

        public hj.q A0(View view) {
            return z0(this.f12867a0, view);
        }

        public final void B0(int i10, View view, String str, boolean z10) {
            this.O.f12850a.c().hd().E7(this.O.f12850a.Q0(), str, z0(i10, view).n(z10));
        }

        public final void C0(final View view, final boolean z10) {
            if (!V()) {
                if (this.R) {
                    b bVar = this.f12881m0;
                    if (bVar != null) {
                        bVar.b(view, this.O, this);
                    }
                } else if (this.N != null) {
                    if (!this.f12866a.k6() || this.N.getConstructor() == 1130741420) {
                        final int i10 = this.f12867a0;
                        boolean z11 = true;
                        switch (this.N.getConstructor()) {
                            case TdApi.InlineKeyboardButtonTypeSwitchInline.CONSTRUCTOR:
                                final TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline = (TdApi.InlineKeyboardButtonTypeSwitchInline) this.N;
                                this.X |= 4;
                                j0.e0(new Runnable() {
                                    @Override
                                    public final void run() {
                                        c4.a.this.q0(inlineKeyboardButtonTypeSwitchInline);
                                    }
                                }, 90L);
                                return;
                            case TdApi.InlineKeyboardButtonTypeLoginUrl.CONSTRUCTOR:
                                w0();
                                J0();
                                TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl = (TdApi.InlineKeyboardButtonTypeLoginUrl) this.N;
                                this.O.f12850a.c().v4().o(new TdApi.GetLoginUrlInfo(this.O.f12850a.I2(), this.O.f12856g, inlineKeyboardButtonTypeLoginUrl.f19918id), Q(i10, view, inlineKeyboardButtonTypeLoginUrl, z10));
                                return;
                            case TdApi.InlineKeyboardButtonTypeCallback.CONSTRUCTOR:
                                w0();
                                J0();
                                this.O.f12850a.c().v4().o(new TdApi.GetCallbackQueryAnswer(this.f12866a.I2(), this.O.f12856g, new TdApi.CallbackQueryPayloadData(((TdApi.InlineKeyboardButtonTypeCallback) this.N).data)), O(i10, view, false));
                                return;
                            case TdApi.InlineKeyboardButtonTypeCallbackGame.CONSTRUCTOR:
                                if (this.f12866a.X3().content.getConstructor() == -69441162) {
                                    w0();
                                    J0();
                                    this.O.f12850a.c().v4().o(new TdApi.GetCallbackQueryAnswer(this.f12866a.I2(), this.O.f12856g, new TdApi.CallbackQueryPayloadGame(((TdApi.MessageGame) this.f12866a.X3().content).game.shortName)), O(i10, view, true));
                                    return;
                                }
                                return;
                            case TdApi.InlineKeyboardButtonTypeCallbackWithPassword.CONSTRUCTOR:
                                TdApi.InlineKeyboardButtonTypeCallbackWithPassword inlineKeyboardButtonTypeCallbackWithPassword = (TdApi.InlineKeyboardButtonTypeCallbackWithPassword) this.N;
                                final byte[] bArr = inlineKeyboardButtonTypeCallbackWithPassword.data;
                                if (!ob.e.a1(inlineKeyboardButtonTypeCallbackWithPassword) || !this.O.f12850a.c().N6(this.f12866a.I2())) {
                                    z11 = false;
                                }
                                w0();
                                J0();
                                final kb.j j3Var = new kb.j() {
                                    @Override
                                    public final void a(Object obj) {
                                        c4.a.this.m0(i10, bArr, view, (CharSequence) obj);
                                    }
                                };
                                if (z11) {
                                    final t2.c N4 = t2.N4(inlineKeyboardButtonTypeCallbackWithPassword);
                                    if (N4 != null) {
                                        final AtomicInteger atomicInteger = new AtomicInteger(2);
                                        Client.g n3Var = new Client.g() {
                                            @Override
                                            public final void r2(TdApi.Object object) {
                                                c4.a.this.p0(atomicInteger, N4, i10, j3Var, object);
                                            }
                                        };
                                        this.O.f12850a.O0.v4().o(new TdApi.GetUser(N4.f13565a), n3Var);
                                        this.O.f12850a.O0.v4().o(new TdApi.GetUser(N4.f13566b), n3Var);
                                        return;
                                    }
                                    j3Var.a(w.H0(this.O.f12850a.a7(), R.string.TransferOwnershipAlertBot, new Object[0]));
                                    return;
                                }
                                j3Var.a(w.H0(this.O.f12850a.a7(), R.string.TransferOwnershipAlertUnknown, new Object[0]));
                                return;
                            case TdApi.InlineKeyboardButtonTypeUrl.CONSTRUCTOR:
                                final String str = ((TdApi.InlineKeyboardButtonTypeUrl) this.N).url;
                                this.X |= 4;
                                j0.e0(new Runnable() {
                                    @Override
                                    public final void run() {
                                        c4.a.this.r0(i10, view, str, z10);
                                    }
                                }, 90L);
                                return;
                            case TdApi.InlineKeyboardButtonTypeUser.CONSTRUCTOR:
                                this.O.f12850a.c().hd().v7(this.O.f12850a, ((TdApi.InlineKeyboardButtonTypeUser) this.N).userId, z0(i10, view));
                                return;
                            default:
                                return;
                        }
                    } else {
                        K0(view, R.string.ErrorScheduled);
                    }
                }
            }
        }

        public void D0(View view) {
            if (!W()) {
                C0(view, true);
                J();
            }
        }

        public boolean E0(final View view) {
            b bVar;
            v4<?> F;
            int i10 = this.X;
            if ((i10 & 2) == 0) {
                return false;
            }
            this.X = i10 & (-3);
            if (V()) {
                return false;
            }
            J();
            TdApi.InlineKeyboardButtonType inlineKeyboardButtonType = this.N;
            if (inlineKeyboardButtonType != null) {
                int constructor = inlineKeyboardButtonType.getConstructor();
                if (constructor == -1203413081) {
                    v4<?> F2 = this.f12866a.t().Q1().F();
                    if (F2 == null) {
                        return false;
                    }
                    F2.Wd(((TdApi.InlineKeyboardButtonTypeLoginUrl) this.N).url, z0(this.f12867a0, view), new f() {
                        @Override
                        public final boolean get() {
                            boolean s02;
                            s02 = c4.a.this.s0(view);
                            return s02;
                        }
                    });
                    return true;
                } else if (constructor != 1130741420 || (F = this.f12866a.t().Q1().F()) == null) {
                    return false;
                } else {
                    F.Wd(((TdApi.InlineKeyboardButtonTypeUrl) this.N).url, z0(this.f12867a0, view), null);
                    return true;
                }
            } else if (!this.R || (bVar = this.f12881m0) == null) {
                return false;
            } else {
                return bVar.a(view, this.O, this);
            }
        }

        public final void F(float f10) {
            if (f10 == 1.0f) {
                this.X &= -2;
            }
            if (this.f12876h0 == null) {
                k kVar = new k(2, this, db.b.f7287b, 180L);
                this.f12876h0 = kVar;
                j jVar = this.W;
                kVar.C(jVar == null || !jVar.g());
            }
            this.X |= 4;
            this.f12876h0.i(f10);
        }

        public void F0(TdApi.InlineKeyboardButton inlineKeyboardButton, int i10) {
            this.N = inlineKeyboardButton.type;
            String O0 = O0(c4.g(inlineKeyboardButton.text));
            boolean z10 = !this.M.e().equals(O0);
            if (z10 || this.M.c() != i10) {
                boolean M0 = g.M0(O0);
                this.P = M0;
                this.M = new v(O0(O0), i10, y.m(M0));
            }
            if (z10 || !ob.e.R(this.N, inlineKeyboardButton.type)) {
                int i11 = this.f12867a0;
                if (i11 == Integer.MAX_VALUE) {
                    this.f12867a0 = 0;
                } else {
                    this.f12867a0 = i11 + 1;
                }
                x2.l lVar = this.f12869b0;
                if (lVar != null) {
                    lVar.J();
                    this.f12869b0 = null;
                }
            }
            if (z10) {
                if (V()) {
                    N();
                }
                M();
            }
        }

        public final void G(float f10) {
            if (this.f12878j0 == null) {
                m2 m2Var = new m2(this.O.f12850a.t(), a0.i(3.5f));
                this.f12878j0 = m2Var;
                m2Var.E(this.W);
                H0();
            }
            if (this.f12879k0 == null) {
                k kVar = new k(3, this, db.b.f7287b, 180L);
                this.f12879k0 = kVar;
                j jVar = this.W;
                kVar.C(jVar == null || !jVar.g());
            }
            this.f12879k0.i(f10);
        }

        public void G0(b bVar) {
            this.f12881m0 = bVar;
        }

        public final void H(float f10) {
            if (this.f12874f0 == null) {
                k kVar = new k(0, this, db.b.f7287b, 180L);
                this.f12874f0 = kVar;
                j jVar = this.W;
                kVar.C(jVar == null || !jVar.g());
            }
            this.f12874f0.i(f10);
        }

        public final void H0() {
            m2 m2Var = this.f12878j0;
            if (m2Var != null) {
                int i10 = this.f12870c.right - a0.i(16.0f);
                Rect rect = this.f12870c;
                int i11 = rect.top;
                m2Var.p(i10, i11, rect.right, a0.i(16.0f) + i11);
            }
        }

        public final void I() {
            kb.b bVar = this.f12880l0;
            if (bVar != null) {
                bVar.c();
                this.f12880l0 = null;
            }
        }

        public void I0(j jVar) {
            this.W = jVar;
            boolean z10 = jVar == null;
            k kVar = this.f12876h0;
            if (kVar != null) {
                kVar.C(z10);
            }
            k kVar2 = this.f12872d0;
            if (kVar2 != null) {
                kVar2.C(z10);
            }
            k kVar3 = this.f12874f0;
            if (kVar3 != null) {
                kVar3.C(z10);
            }
            k kVar4 = this.f12879k0;
            if (kVar4 != null) {
                kVar4.C(z10);
            }
            m2 m2Var = this.f12878j0;
            if (m2Var != null) {
                m2Var.E(jVar);
            }
        }

        public final void J() {
            F(1.0f);
        }

        public void J0() {
            I();
            j jVar = this.W;
            if (jVar == null || !jVar.g()) {
                G(1.0f);
                return;
            }
            this.f12880l0 = new C0118a();
            j0.A().postDelayed(this.f12880l0, 250L);
        }

        public void K(vc.g1 r19, android.graphics.Canvas r20, int r21, int r22, int r23, int r24, int r25, android.graphics.RectF r26, int r27, int r28) {
            throw new UnsupportedOperationException("Method not decompiled: hd.c4.a.K(vc.g1, android.graphics.Canvas, int, int, int, int, int, android.graphics.RectF, int, int):void");
        }

        public void K0(View view, int i10) {
            L0(view, w.i1(i10));
        }

        public final void L(Canvas canvas, boolean z10, float f10) {
            int i10;
            if (this.f12878j0 != null) {
                if (z10) {
                    i10 = this.O.f12850a.W1();
                } else {
                    i10 = ib.d.d(ae.j.q0(this.O.f12850a != null && this.O.f12850a.g6()), ae.j.s0(), f10);
                }
                this.f12878j0.d(ib.d.b((int) (Color.alpha(i10) * this.f12877i0), i10));
                this.f12878j0.c(canvas);
            }
        }

        public void L0(View view, CharSequence charSequence) {
            N0(view).D(this.f12866a.c(), charSequence).F();
        }

        public final void M() {
            I();
            k kVar = this.f12879k0;
            if (kVar != null) {
                this.f12877i0 = 0.0f;
                kVar.l(0.0f);
            }
        }

        public final x2.h M0(View view) {
            return this.f12866a.t().I3().h(view, this.f12866a.P0).y(new kb.j() {
                @Override
                public final void a(Object obj) {
                    c4.a.this.t0((x2.l) obj);
                }
            }).u(new x2.f() {
                @Override
                public final void d1(View view2, Rect rect) {
                    c4.a.this.u0(view2, rect);
                }
            });
        }

        public final void N() {
            k kVar = this.f12876h0;
            if (kVar != null) {
                this.f12875g0 = 0.0f;
                kVar.l(0.0f);
                this.X &= -5;
            }
            k kVar2 = this.f12874f0;
            if (kVar2 != null) {
                this.f12873e0 = 0.0f;
                kVar2.l(0.0f);
            }
            k kVar3 = this.f12872d0;
            if (kVar3 != null) {
                this.f12871c0 = 0.0f;
                kVar3.l(0.0f);
                this.X &= -2;
            }
        }

        public x2.h N0(View view) {
            return this.f12866a.t().I3().h(view, this.W).i(this.f12866a.Q0()).u(new x2.f() {
                @Override
                public final void d1(View view2, Rect rect) {
                    c4.a.this.v0(view2, rect);
                }
            });
        }

        public final Client.g O(final int i10, final View view, final boolean z10) {
            return new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    c4.a.this.c0(i10, z10, view, object);
                }
            };
        }

        public final String O0(String str) {
            return P0() ? str : str.toUpperCase();
        }

        public int P() {
            return this.f12867a0;
        }

        public final boolean P0() {
            return this.O.f12850a.R9() && !this.R;
        }

        public final Client.g Q(final int i10, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z10) {
            return new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    c4.a.this.j0(i10, view, inlineKeyboardButtonTypeLoginUrl, z10, object);
                }
            };
        }

        public final Client.g R(final int i10, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z10) {
            return new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    c4.a.this.l0(i10, view, inlineKeyboardButtonTypeLoginUrl, z10, object);
                }
            };
        }

        public float S() {
            return this.M.d();
        }

        public void T() {
            I();
            G(0.0f);
        }

        public final void U() {
            j jVar = this.W;
            if (jVar != null) {
                jVar.b(this.f12870c);
            }
        }

        public final boolean V() {
            return (this.X & 1) != 0;
        }

        public final boolean W() {
            return (this.X & 4) != 0;
        }

        public final boolean X() {
            return (this.X & 2) != 0;
        }

        @Override
        public Drawable Z(int i10, int i11) {
            return s.a(this, i10, i11);
        }

        @Override
        public final h<Drawable> getSparseDrawableHolder() {
            h<Drawable> hVar = this.f12882n0;
            if (hVar != null) {
                return hVar;
            }
            h<Drawable> hVar2 = new h<>();
            this.f12882n0 = hVar2;
            return hVar2;
        }

        @Override
        public final Resources getSparseDrawableResources() {
            return j0.B();
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (i10 == 0) {
                this.f12873e0 = f10;
            } else if (i10 == 1) {
                this.f12871c0 = f10;
            } else if (i10 == 2) {
                this.f12875g0 = f10;
            } else if (i10 == 3) {
                this.f12877i0 = f10;
            }
            U();
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            if (i10 == 2 && f10 == 1.0f) {
                N();
            }
        }

        public void w0() {
            this.X |= 1;
        }

        public void x0() {
            J();
            T();
        }

        public boolean y0(View view, MotionEvent motionEvent, int i10, int i11) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.X |= 2;
                this.Y = i10;
                this.Z = i11;
                if (!V() && !W()) {
                    H(1.0f);
                }
                return true;
            } else if (action == 1) {
                this.Y = i10;
                this.Z = i11;
                if (!X()) {
                    return false;
                }
                this.X &= -3;
                db.g.c(view);
                D0(view);
                return true;
            } else if (action != 2) {
                if (action == 3 && X()) {
                    this.X &= -3;
                    if (!V() && !W()) {
                        J();
                    }
                }
                return true;
            } else {
                this.Y = i10;
                this.Z = i11;
                return true;
            }
        }

        public final hj.q z0(int i10, View view) {
            return this.f12866a.h8().s(this.f12867a0 == i10 ? M0(view) : null);
        }

        public a(c4 c4Var, s4 s4Var, String str, int i10, int i11) {
            this.O = c4Var;
            this.f12866a = s4Var;
            boolean M0 = g.M0(str);
            this.P = M0;
            this.M = new v(str, i11 - (i10 != 0 ? (a0.i(24.0f) / 2) + a0.i(2.0f) : 0), y.m(M0));
            this.Q = i10;
            this.R = true;
        }
    }
}
