package kd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.y;
import db.b;
import de.iq;
import de.ra;
import de.rh;
import de.yb;
import eb.f;
import eb.k;
import gb.c;
import gd.w;
import hd.t2;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import je.e;
import ne.i;
import ne.m1;
import ne.r3;
import ob.d;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.e2;
import ud.f2;
import ud.o0;
import ud.q1;
import ud.v4;
import zd.d1;
import zd.g1;
import zd.h1;
import zd.o6;
import zd.y8;
import zd.ya;

public class t0 implements d1.a, k.b, i.c, m1.e, h1, Handler.Callback, c.a {
    public final o6 M;
    public final long N;
    public final long O;
    public final View P;
    public final boolean Q;
    public ArrayList<TdApi.Message> R;
    public TdApi.Location S;
    public int T;
    public final Handler U;
    public final c V;
    public final Drawable W;
    public final a X;
    public boolean Y;
    public e Z;
    public final f f15857a;
    public String f15858a0;
    public final f f15859b;
    public String f15860b0;
    public final org.thunderdog.challegram.a f15861c;
    public String f15862c0;
    public float f15863d0;
    public float f15864e0;
    public float f15865f0;
    public e f15866g0;
    public String f15867h0;
    public String f15868i0;
    public String f15869j0;
    public float f15870k0;
    public float f15871l0;
    public long f15872m0;
    public e2 f15873n0;
    public boolean f15874o0;

    public interface a {
        boolean Z5(t0 t0Var, boolean z10, boolean z11);

        void m6(t0 t0Var, boolean z10, float f10, boolean z11);

        void y6(t0 t0Var, boolean z10, boolean z11);
    }

    public t0(org.thunderdog.challegram.a aVar, o6 o6Var, long j10, long j11, View view, boolean z10, a aVar2) {
        DecelerateInterpolator decelerateInterpolator = b.f7287b;
        this.f15857a = new f(1, this, decelerateInterpolator, 180L);
        this.f15859b = new f(0, this, decelerateInterpolator, 180L);
        this.f15861c = aVar;
        this.M = o6Var;
        this.N = j10;
        this.O = j11;
        this.P = view;
        this.Q = z10;
        this.X = aVar2;
        this.W = ce.c.g(aVar.getResources(), R.drawable.baseline_location_on_18);
        c cVar = null;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        this.U = i10 != 0 ? new Handler(this) : null;
        this.V = i10 != 0 ? new c(this) : cVar;
    }

    public boolean A(m1.g gVar, k kVar, float f10, Object obj) {
        e2 e2Var = this.f15873n0;
        if (e2Var != null) {
            e2Var.f24138e.s2(true);
            this.f15873n0 = null;
        }
        return gVar.a(kVar, f10, obj);
    }

    public void J(ra raVar, o0 o0Var, r3 r3Var, boolean z10) {
        TdApi.Message message = (TdApi.Message) raVar.d();
        TdApi.Chat W2 = this.M.W2(message.chatId);
        o0Var.b1(this.M.E3(message.chatId, W2, false), t2.D0(this.M, W2));
        o0Var.setText(this.M.W3(W2));
        o0Var.y0(null, message.chatId, null, new d(message.chatId, message.f19946id), null);
        o0Var.setPreviewActionListProvider(this);
        int i10 = ((TdApi.MessageLocation) message.content).livePeriod;
        long j10 = 0;
        long max = Math.max(((message.date + i10) * 1000) - System.currentTimeMillis(), 0L);
        if (max > 0) {
            j10 = SystemClock.uptimeMillis() + max;
        }
        r3Var.c(i10, j10);
    }

    public static void K(e2 e2Var) {
        e2Var.f24138e.s2(true);
    }

    public boolean L(final e2 e2Var, View view, boolean z10) {
        if (z10) {
            return false;
        }
        a0(0L, new Runnable() {
            @Override
            public final void run() {
                t0.K(e2.this);
            }
        });
        return true;
    }

    public void M(e2[] e2VarArr, View view, int i10, ra raVar, TextView textView, iq iqVar) {
        TdApi.Message message = (TdApi.Message) raVar.d();
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        this.M.hd().q7(new y8(this.f15861c, this.M), new yb.f(location.latitude, location.longitude, message).a(message.chatId, message.messageThreadId).c(true));
        e2VarArr[0].f24138e.s2(true);
    }

    public boolean N(long j10, Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_stopAllLiveLocations) {
            return true;
        }
        this.M.e2().W1(j10);
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public static int t() {
        return a0.i(36.0f);
    }

    public void x(ArrayList arrayList) {
        if (!this.f15874o0) {
            U(arrayList);
        }
    }

    public void y(TdApi.Object object) {
        if (!this.f15874o0) {
            final ArrayList arrayList = new ArrayList();
            if (object.getConstructor() == -16498159) {
                TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
                arrayList.ensureCapacity(messageArr.length);
                for (TdApi.Message message : messageArr) {
                    if (message.content.getConstructor() == 303973492 && ((TdApi.MessageLocation) message.content).expiresIn != 0) {
                        arrayList.add(message);
                    }
                }
            }
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    t0.this.x(arrayList);
                }
            });
        }
    }

    public void z() {
        e2 e2Var = this.f15873n0;
        if (e2Var != null) {
            e2Var.f24138e.s2(true);
            this.f15873n0 = null;
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        O(f10, f11);
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    @Override
    public void H(long j10, final long[] jArr) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                t0.this.F(jArr);
            }
        });
    }

    @Override
    public void H1(TdApi.Location location, int i10) {
        if (this.N != 0) {
            this.S = location;
            this.T = i10;
            if (this.Y) {
                c0(true);
            }
        }
    }

    @Override
    public void J3(long j10, long j11) {
        g1.i(this, j10, j11);
    }

    @Override
    public void M5(o6 o6Var, TdApi.Message message) {
        if (this.M.A6() == o6Var.A6()) {
            u(message.chatId, message.f19946id);
        }
    }

    public void O(float f10, float f11) {
        View view = this.P;
        if (view == null) {
            return;
        }
        if (f10 >= view.getMeasuredWidth() - a0.i(50.0f)) {
            a0(this.N, null);
        } else {
            Q(false);
        }
    }

    public boolean P(MotionEvent motionEvent) {
        c cVar = this.V;
        return cVar != null && cVar.e(this.P, motionEvent);
    }

    public t0 Q(boolean z10) {
        v4<?> F;
        ArrayList<TdApi.Message> arrayList = this.R;
        if (arrayList == null || arrayList.isEmpty() || this.f15861c.Q1() == null || (F = this.f15861c.Q1().F()) == null) {
            return this;
        }
        long j10 = this.N;
        int i10 = 1;
        if (j10 == 0) {
            j10 = this.R.size() == 1 ? this.R.get(0).chatId : 0L;
        }
        long j11 = (this.N == 0 && this.O == 0) ? this.R.size() == 1 ? this.R.get(0).messageThreadId : 0L : this.O;
        if (j10 == 0 || z10) {
            f2 f2Var = new f2(R.id.liveLocation);
            final e2[] e2VarArr = new e2[1];
            f2Var.r(R.string.StopAllLocationSharings);
            f2Var.q(R.id.theme_color_textNegative);
            f2Var.b(w.o2(R.string.SharingLiveLocationToChats, this.R.size()));
            int size = this.R.size() + 2;
            ra[] raVarArr = new ra[size];
            ra E = new ra(35).J(a0.i(12.0f)).E(true);
            raVarArr[size - 1] = E;
            raVarArr[0] = E;
            Iterator<TdApi.Message> it = this.R.iterator();
            while (it.hasNext()) {
                int i11 = i10 + 1;
                raVarArr[i10] = new ra(86, i11).G(it.next());
                i10 = i11;
            }
            f2Var.l(false);
            f2Var.p(raVarArr);
            f2Var.h(new f2.a() {
                @Override
                public final void a(ra raVar, o0 o0Var, r3 r3Var, boolean z11) {
                    t0.this.J(raVar, o0Var, r3Var, z11);
                }
            });
            f2Var.m(new e2.a() {
                @Override
                public final boolean a(e2 e2Var, View view, boolean z11) {
                    boolean L;
                    L = t0.this.L(e2Var, view, z11);
                    return L;
                }
            });
            f2Var.n(new v4.n() {
                @Override
                public final void a(View view, int i12, ra raVar, TextView textView, iq iqVar) {
                    t0.this.M(e2VarArr, view, i12, raVar, textView, iqVar);
                }
            });
            f2Var.y(new y8(this.f15861c, this.M));
            e2 me2 = F.me(f2Var);
            this.f15873n0 = me2;
            e2VarArr[0] = me2;
            return this;
        }
        y8 y8Var = new y8(this.f15861c, this.M);
        TdApi.Message message = this.R.get(0);
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        this.M.hd().q7(y8Var, new yb.f(location.latitude, location.longitude, message).a(j10, j11).c(true));
        return this;
    }

    @Override
    public void Q3(ArrayList<o6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        int indexOf = arrayList.indexOf(this.M);
        if (this.N != 0) {
            boolean z10 = true;
            boolean z11 = indexOf != -1;
            if (z11) {
                Iterator<TdApi.Message> it = arrayList2.get(indexOf).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().chatId == this.N) {
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = z11;
            }
            V(z10, false);
        } else if (indexOf != -1) {
            this.R = arrayList2.get(indexOf);
            c0(false);
        }
    }

    public final void R(TdApi.Message message) {
        ArrayList<TdApi.Message> arrayList;
        int indexOf;
        if (!this.f15874o0 && (arrayList = this.R) != null && !arrayList.isEmpty() && (indexOf = this.R.indexOf(message)) != -1) {
            this.R.remove(indexOf);
            c0(true);
        }
    }

    public final void F(long[] jArr) {
        ArrayList<TdApi.Message> arrayList;
        if (!this.f15874o0 && (arrayList = this.R) != null && !arrayList.isEmpty()) {
            int i10 = 0;
            for (int size = this.R.size() - 1; size >= 0; size--) {
                TdApi.Message message = this.R.get(size);
                if (ib.b.s(jArr, message.f19946id) != -1) {
                    this.R.remove(size);
                    T(message, false);
                    i10++;
                    if (i10 == jArr.length) {
                        break;
                    }
                }
            }
            if (i10 > 0) {
                c0(true);
            }
        }
    }

    @Override
    public void S1(long j10, long j11, boolean z10) {
        g1.h(this, j10, j11, z10);
    }

    public final void T(TdApi.Message message, boolean z10) {
        if (z10) {
            Handler handler = this.U;
            handler.sendMessageDelayed(Message.obtain(handler, 0, message), ((TdApi.MessageLocation) message.content).expiresIn * 1000);
            return;
        }
        this.U.removeMessages(0, message);
    }

    @Override
    public void T0(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        g1.d(this, j10, j11, messageInteractionInfo);
    }

    public final void U(ArrayList<TdApi.Message> arrayList) {
        if (!this.f15874o0) {
            this.R = arrayList;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    T(it.next(), true);
                }
            }
            c0(true);
            this.M.F4().W1().d(this);
            this.M.O9().g0(this.N, this);
        }
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    public final void V(boolean z10, boolean z11) {
        if (this.Y != z10) {
            this.Y = z10;
            c0(z11);
        }
    }

    @Override
    public void W(long j10, long j11) {
        g1.f(this, j10, j11);
    }

    public final void X(boolean z10, boolean z11) {
        a aVar;
        a aVar2;
        boolean h10 = this.f15857a.h();
        if (!(h10 == z10 || (aVar2 = this.X) == null || aVar2.Z5(this, z10, z11))) {
            z11 = false;
        }
        this.f15857a.p(z10, z11);
        if (h10 != z10 && (aVar = this.X) != null) {
            aVar.y6(this, z10, z11);
        }
    }

    @Override
    public void X1(final TdApi.Message message, long j10) {
        if (message.content.getConstructor() == 303973492 && message.schedulingState == null) {
            TdApi.MessageContent messageContent = message.content;
            if (((TdApi.MessageLocation) messageContent).livePeriod > 0 && ((TdApi.MessageLocation) messageContent).expiresIn > 0) {
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        t0.this.E(message);
                    }
                });
            }
        }
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    public final boolean Y(String str, String str2) {
        boolean z10;
        e eVar = this.f15866g0;
        if (!ib.i.c(eVar != null ? eVar.f15363a : null, str)) {
            this.f15866g0 = new e(str);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!ib.i.c(this.f15867h0, str2)) {
            this.f15867h0 = str2;
            z10 = true;
        }
        if (z10) {
            b0(true);
        }
        return z10;
    }

    public final boolean Z(String str, String str2) {
        boolean z10;
        e eVar = this.Z;
        boolean z11 = true;
        if (!ib.i.c(eVar != null ? eVar.f15363a : null, str)) {
            this.Z = new e(str);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!ib.i.c(this.f15858a0, str2)) {
            this.f15858a0 = str2;
        } else {
            z11 = z10;
        }
        if (z11) {
            b0(false);
        }
        return z11;
    }

    public void a0(final long j10, final Runnable runnable) {
        v4<?> F;
        q1 Q1 = this.f15861c.Q1();
        if (Q1 != null && !Q1.X() && (F = Q1.F()) != null) {
            jb.c cVar = new jb.c(2);
            u0 u0Var = new u0(2);
            jb.c cVar2 = new jb.c(2);
            cVar.a(R.id.btn_stopAllLiveLocations);
            u0Var.a(R.string.StopLiveLocation);
            cVar2.a(R.drawable.baseline_remove_circle_24);
            cVar.a(R.id.btn_cancel);
            u0Var.a(R.string.Cancel);
            cVar2.a(R.drawable.baseline_cancel_24);
            F.ee(j10 != 0 ? w.m1(R.string.StopLiveLocationInfoX, this.M.U3(j10)) : w.i1(R.string.StopLiveLocationInfo), cVar.e(), u0Var.d(), new int[]{2, 1}, cVar2.e(), new h0() {
                @Override
                public boolean P() {
                    return ie.g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return ie.g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean N;
                    N = t0.this.N(j10, runnable, view, i10);
                    return N;
                }
            });
        }
    }

    @Override
    public void a7(m1.f fVar, int i10, Object obj) {
        if (i10 == R.id.btn_messageLiveStop) {
            a0(((rh) obj).C9(), new Runnable() {
                @Override
                public final void run() {
                    t0.this.z();
                }
            });
        }
    }

    public final void b0(boolean z10) {
        String str;
        e eVar;
        float f10;
        String str2;
        View view = this.P;
        if (view != null) {
            float measuredWidth = view.getMeasuredWidth();
            this.f15865f0 = measuredWidth;
            float i10 = measuredWidth - a0.i(104.0f);
            if (z10) {
                eVar = this.f15866g0;
                str = this.f15867h0;
            } else {
                eVar = this.Z;
                str = this.f15858a0;
            }
            String str3 = null;
            float f11 = 0.0f;
            if (i10 <= 0.0f || eVar == null || str == null) {
                str2 = null;
                f10 = 0.0f;
            } else {
                TextPaint p02 = y.p0(eVar.f15364b);
                String charSequence = TextUtils.ellipsize(eVar.f15363a, p02, i10, TextUtils.TruncateAt.END).toString();
                float T1 = v0.T1(charSequence, p02);
                float f12 = i10 - T1;
                if (f12 > 0.0f) {
                    String charSequence2 = TextUtils.ellipsize(str, y.h0(), f12, TextUtils.TruncateAt.END).toString();
                    f11 = v0.T1(charSequence2, y.h0());
                    str3 = charSequence2;
                }
                str2 = str3;
                str3 = charSequence;
                f10 = f11;
                f11 = T1;
            }
            if (z10) {
                this.f15868i0 = str3;
                this.f15869j0 = str2;
                this.f15870k0 = f11;
                this.f15871l0 = f10;
                return;
            }
            this.f15860b0 = str3;
            this.f15862c0 = str2;
            this.f15863d0 = f11;
            this.f15864e0 = f10;
        }
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    public final void c0(boolean z10) {
        String str;
        String str2;
        String str3;
        if (this.P != null) {
            String h10 = ya.o1().W1().h(this.M, this.R, this.N, true, this.S);
            String str4 = null;
            if (!ib.i.i(h10)) {
                str = w.i1(R.string.AttachLiveLocation);
                h10 = " " + h10;
            } else {
                str = null;
            }
            boolean z11 = false;
            if (this.N != 0) {
                String h11 = ya.o1().W1().h(this.M, this.R, this.N, false, this.S);
                if (h11 != null) {
                    if (this.R.size() == 2) {
                        o6 o6Var = this.M;
                        ArrayList<TdApi.Message> arrayList = this.R;
                        str3 = o6Var.Cb(arrayList.get(o6Var.m7(arrayList.get(0)) ? 1 : 0).senderId);
                    } else {
                        str3 = w.i1(R.string.AttachLiveLocation);
                    }
                    str4 = str3;
                    str2 = " " + h11;
                } else {
                    str2 = h11;
                }
            } else {
                str2 = null;
            }
            boolean z12 = !ib.i.i(str) && Z(str, h10);
            if (!ib.i.i(str4) && Y(str4, str2)) {
                z12 = true;
            }
            this.f15859b.p(!ib.i.i(str4), z10 && this.f15857a.g() > 0.0f);
            if (!ib.i.i(str) || !ib.i.i(h10)) {
                z11 = true;
            }
            X(z11, z10);
            if (z12 && this.f15857a.h()) {
                this.P.invalidate();
            }
        }
    }

    @Override
    public void f2(o6 o6Var, ArrayList<TdApi.Message> arrayList) {
        if (this.M.A6() != o6Var.A6()) {
            return;
        }
        if (this.N == 0) {
            this.R = arrayList;
            c0(true);
            return;
        }
        boolean z10 = false;
        boolean z11 = arrayList != null && !arrayList.isEmpty();
        if (z11) {
            Iterator<TdApi.Message> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().chatId == this.N) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z10 = z11;
        }
        V(z10, true);
    }

    @Override
    public void g5(TdApi.Message message, long j10, int i10, String str) {
        g1.j(this, message, j10, i10, str);
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    @Override
    public boolean handleMessage(Message message) {
        R((TdApi.Message) message.obj);
        return true;
    }

    @Override
    public void j0(long j10, final long j11, final TdApi.MessageContent messageContent) {
        if (messageContent.getConstructor() == 303973492 && ((TdApi.MessageLocation) messageContent).livePeriod > 0) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    t0.this.D(j11, messageContent);
                }
            });
        }
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    @Override
    public void l5(long j10, long j11, int i10, TdApi.ReplyMarkup replyMarkup) {
        g1.c(this, j10, j11, i10, replyMarkup);
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return true;
    }

    public final void I(TdApi.Message message) {
        if (!this.f15874o0) {
            ArrayList<TdApi.Message> arrayList = this.R;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TdApi.Message next = it.next();
                    if (ob.e.Y(next.senderId, message.senderId)) {
                        this.R.remove(i10);
                        T(next, false);
                        break;
                    }
                    i10++;
                }
            } else {
                this.R = new ArrayList<>();
            }
            this.R.add(message);
            T(message, true);
            c0(true);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            View view = this.P;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 1) {
            a aVar = this.X;
            if (aVar != null) {
                aVar.m6(this, this.f15857a.h(), f10, false);
            }
            View view2 = this.P;
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    @Override
    public void o(View view, float f10, float f11) {
        gb.b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        a aVar;
        if (i10 == 1 && (aVar = this.X) != null) {
            aVar.m6(this, this.f15857a.h(), f10, true);
        }
    }

    public t0 p() {
        this.f15874o0 = true;
        this.M.F4().W1().r(this);
        if (this.N != 0) {
            this.M.O9().t0(this.N, this);
            this.U.removeCallbacksAndMessages(null);
            this.f15857a.p(false, false);
            a aVar = this.X;
            if (aVar != null) {
                aVar.m6(this, false, 0.0f, true);
            }
        }
        return this;
    }

    public void q(Canvas canvas, int i10) {
        int measuredWidth;
        Drawable drawable;
        int i11;
        int i12;
        float f10;
        e eVar;
        e eVar2;
        View view = this.P;
        if (view != null) {
            float measuredWidth2 = view.getMeasuredWidth();
            if (this.f15865f0 != measuredWidth2) {
                this.f15865f0 = measuredWidth2;
                b0(false);
                b0(true);
            }
            float g10 = this.f15857a.g();
            int i13 = (int) (255.0f * g10);
            if (i13 != 0) {
                int i14 = a0.i(56.0f) / 2;
                int t10 = i10 + (t() / 2);
                Paint i15 = this.Q ? y.i() : y.J();
                i15.setAlpha(i13);
                ce.c.b(canvas, this.W, i14 - (drawable.getMinimumWidth() / 2), t10 - (this.W.getMinimumHeight() / 2), i15);
                i15.setAlpha(255);
                int c10 = this.Q ? j.c() : j.o0();
                float f11 = t10;
                long B = ce.b.B(canvas, i14, f11, ib.d.b(i13, c10), false, this.f15872m0);
                if (B != -1) {
                    this.f15872m0 = SystemClock.uptimeMillis() + B;
                    int i16 = a0.i(15.0f);
                    int i17 = a0.i(24.0f);
                    this.P.postInvalidateDelayed(B, i14 - i16, t10 - i17, i14 + i16, t10 + i17);
                }
                ce.b.o(canvas, measuredWidth - (a0.i(50.0f) / 2), f11, 1.0f, a0.i(9.0f), y.Y(ib.d.a(g10, c10), a0.i(2.0f)));
                if (this.Q) {
                    i12 = j.R0();
                    i11 = j.Q0();
                } else {
                    i12 = j.P0();
                    i11 = j.R0();
                }
                int i18 = i12;
                int i19 = i11;
                float g11 = this.f15859b.g();
                if (g11 == 1.0f || (eVar2 = this.Z) == null) {
                    f10 = g11;
                } else {
                    f10 = g11;
                    r(canvas, i10, eVar2, this.f15860b0, this.f15863d0, this.f15862c0, this.f15864e0, i18, i19, g10, -g11);
                }
                if (f10 != 0.0f && (eVar = this.f15866g0) != null) {
                    r(canvas, i10, eVar, this.f15868i0, this.f15870k0, this.f15869j0, this.f15871l0, i18, i19, g10, 1.0f - f10);
                }
            }
        }
    }

    @Override
    public void q5(boolean z10) {
    }

    public final void r(Canvas canvas, int i10, e eVar, String str, float f10, String str2, float f11, int i11, int i12, float f12, float f13) {
        float abs = f12 * (1.0f - Math.abs(f13));
        boolean z10 = f13 != 0.0f;
        if (z10) {
            canvas.save();
            canvas.translate(0.0f, t() * f13);
        }
        int i13 = i10 + a0.i(23.0f);
        int measuredWidth = (this.P.getMeasuredWidth() / 2) - (((int) (f11 + f10)) / 2);
        if (str != null) {
            TextPaint p02 = y.p0(eVar.f15364b);
            int color = p02.getColor();
            p02.setColor(ib.d.a(abs, i11));
            canvas.drawText(str, measuredWidth, i13, p02);
            p02.setColor(color);
        }
        if (str2 != null) {
            canvas.drawText(str2, measuredWidth + f10, i13, y.i0(ib.d.a(abs, i12)));
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public m1.e r6(View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4<?> v4Var) {
        fVar.E(true);
        final m1.g y10 = fVar.y();
        fVar.N(new m1.g() {
            @Override
            public final boolean a(k kVar, float f10, Object obj) {
                boolean A;
                A = t0.this.A(y10, kVar, f10, obj);
                return A;
            }
        });
        cVar.a(R.id.btn_messageLiveStop);
        u0Var.a(R.string.StopLiveLocationShort);
        cVar2.a(R.drawable.baseline_remove_circle_24);
        return this;
    }

    public final void D(long j10, TdApi.MessageLocation messageLocation) {
        ArrayList<TdApi.Message> arrayList;
        if (this.f15874o0 || (arrayList = this.R) == null || arrayList.isEmpty()) {
            return;
        }
        if (messageLocation.expiresIn == 0) {
            F(new long[]{j10});
            return;
        }
        Iterator<TdApi.Message> it = this.R.iterator();
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (next.f19946id == j10) {
                next.content = messageLocation;
                T(next, false);
                T(next, true);
                if (ob.a.l(this.N) && this.R.size() == 2) {
                    c0(true);
                    return;
                }
                return;
            }
        }
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    @Override
    public void s5(long j10, long j11) {
        g1.g(this, j10, j11);
    }

    @Override
    public void t2(m1.f fVar, int i10, Object obj) {
    }

    public final int u(long j10, long j11) {
        ArrayList<TdApi.Message> arrayList = this.R;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            Iterator<TdApi.Message> it = this.R.iterator();
            while (it.hasNext()) {
                TdApi.Message next = it.next();
                if (next.chatId == j10 && next.f19946id == j11) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public t0 v() {
        if (this.N != 0) {
            this.M.v4().o(new TdApi.SearchChatRecentLocationMessages(this.N, 100), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    t0.this.y(object);
                }
            });
        } else {
            this.M.F4().W1().d(this);
        }
        return this;
    }

    public boolean w() {
        return this.f15857a.h();
    }

    @Override
    public void y2(final TdApi.Message message) {
        if (!message.isOutgoing && message.sendingState == null && message.schedulingState == null && message.content.getConstructor() == 303973492) {
            TdApi.MessageContent messageContent = message.content;
            if (((TdApi.MessageLocation) messageContent).livePeriod > 0 && ((TdApi.MessageLocation) messageContent).expiresIn > 0) {
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        t0.this.I(message);
                    }
                });
            }
        }
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
