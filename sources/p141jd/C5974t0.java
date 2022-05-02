package p141jd;

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
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1379j0;
import be.C1410y;
import gd.C4779t2;
import ie.C5386e;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6957m1;
import me.C7025s3;
import me.View$OnClickListenerC6902i;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.AbstractView$OnClickListenerC3344yb;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3940f;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p350yd.AbstractC10748j1;
import p350yd.C10534a9;
import p350yd.C10536ab;
import p350yd.C10651f1;
import p350yd.C10722i1;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9180e2;
import td.C9188f2;
import td.C9256o0;
import td.C9270q1;

public class C5974t0 implements C10651f1.AbstractC10652a, C3950k.AbstractC3952b, View$OnClickListenerC6902i.AbstractC6905c, C6957m1.AbstractC6962e, AbstractC10748j1, Handler.Callback, C4336c.AbstractC4337a {
    public final C10930q6 f18963M;
    public final long f18964N;
    public final long f18965O;
    public final View f18966P;
    public final boolean f18967Q;
    public ArrayList<TdApi.Message> f18968R;
    public TdApi.Location f18969S;
    public int f18970T;
    public final Handler f18971U;
    public final C4336c f18972V;
    public final Drawable f18973W;
    public final AbstractC5975a f18974X;
    public boolean f18975Y;
    public C5386e f18976Z;
    public final C3940f f18977a;
    public String f18978a0;
    public final C3940f f18979b;
    public String f18980b0;
    public final AbstractView$OnTouchListenerC7889a f18981c;
    public String f18982c0;
    public float f18983d0;
    public float f18984e0;
    public float f18985f0;
    public C5386e f18986g0;
    public String f18987h0;
    public String f18988i0;
    public String f18989j0;
    public float f18990k0;
    public float f18991l0;
    public long f18992m0;
    public C9180e2 f18993n0;
    public boolean f18994o0;

    public interface AbstractC5975a {
        boolean mo21729G(C5974t0 t0Var, boolean z, boolean z2);

        void mo21728L4(C5974t0 t0Var, boolean z, float f, boolean z2);

        void mo21727S1(C5974t0 t0Var, boolean z, boolean z2);
    }

    public C5974t0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, long j, long j2, View view, boolean z, AbstractC5975a aVar2) {
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f18977a = new C3940f(1, this, decelerateInterpolator, 180L);
        this.f18979b = new C3940f(0, this, decelerateInterpolator, 180L);
        this.f18981c = aVar;
        this.f18963M = q6Var;
        this.f18964N = j;
        this.f18965O = j2;
        this.f18966P = view;
        this.f18967Q = z;
        this.f18974X = aVar2;
        this.f18973W = C1362c.m37485g(aVar.getResources(), R.drawable.baseline_location_on_18);
        C4336c cVar = null;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        this.f18971U = i != 0 ? new Handler(this) : null;
        this.f18972V = i != 0 ? new C4336c(this) : cVar;
    }

    public boolean m21778A(C6957m1.AbstractC6964g gVar, C3950k kVar, float f, Object obj) {
        C9180e2 e2Var = this.f18993n0;
        if (e2Var != null) {
            e2Var.f29644e.m18408y2(true);
            this.f18993n0 = null;
        }
        return gVar.mo18302a(kVar, f, obj);
    }

    public void m21773J(C2964ra raVar, C9256o0 o0Var, C7025s3 s3Var, boolean z) {
        TdApi.Message message = (TdApi.Message) raVar.m32847d();
        TdApi.Chat U2 = this.f18963M.m2632U2(message.chatId);
        o0Var.m9787W0(this.f18963M.m2931B3(message.chatId, U2, false), C4779t2.m25710D0(this.f18963M, U2));
        o0Var.setText(this.f18963M.m2661S3(U2));
        o0Var.m18493w0(null, message.chatId, null, new C7319d(message.chatId, message.f25409id), null);
        o0Var.setPreviewActionListProvider(this);
        int i = ((TdApi.MessageLocation) message.content).livePeriod;
        long j = 0;
        long max = Math.max(((message.date + i) * 1000) - System.currentTimeMillis(), 0L);
        if (max > 0) {
            j = SystemClock.uptimeMillis() + max;
        }
        s3Var.m18071c(i, j);
    }

    public static void m21772K(C9180e2 e2Var) {
        e2Var.f29644e.m18408y2(true);
    }

    public boolean m21771L(final C9180e2 e2Var, View view, boolean z) {
        if (z) {
            return false;
        }
        m21756a0(0L, new Runnable() {
            @Override
            public final void run() {
                C5974t0.m21772K(C9180e2.this);
            }
        });
        return true;
    }

    public void m21770M(C9180e2[] e2VarArr, View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
        TdApi.Message message = (TdApi.Message) raVar.m32847d();
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        this.f18963M.m2485dd().m3479q7(new C10534a9(this.f18981c, this.f18963M), new AbstractView$OnClickListenerC3344yb.C3351f(location.latitude, location.longitude, message).m30704a(message.chatId, message.messageThreadId).m30702c(true));
        e2VarArr[0].f29644e.m18408y2(true);
    }

    public boolean m21769N(long j, Runnable runnable, View view, int i) {
        if (i != R.id.btn_stopAllLiveLocations) {
            return true;
        }
        this.f18963M.m2480e2().m1671Y1(j);
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public static int m21736t() {
        return C1357a0.m37544i(36.0f);
    }

    public void m21732x(ArrayList arrayList) {
        if (!this.f18994o0) {
            m21762U(arrayList);
        }
    }

    public void m21731y(TdApi.Object object) {
        if (!this.f18994o0) {
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
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C5974t0.this.m21732x(arrayList);
                }
            });
        }
    }

    public void m21730z() {
        C9180e2 e2Var = this.f18993n0;
        if (e2Var != null) {
            e2Var.f29644e.m18408y2(true);
            this.f18993n0 = null;
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    @Override
    public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        if (i == R.id.btn_messageLiveStop) {
            m21756a0(((View$OnClickListenerC2971rh) obj).mo9464C9(), new Runnable() {
                @Override
                public final void run() {
                    C5974t0.this.m21730z();
                }
            });
        }
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        m21768O(f, f2);
    }

    @Override
    public void mo4051E2(final TdApi.Message message) {
        if (!message.isOutgoing && message.sendingState == null && message.schedulingState == null && message.content.getConstructor() == 303973492) {
            TdApi.MessageContent messageContent = message.content;
            if (((TdApi.MessageLocation) messageContent).livePeriod > 0 && ((TdApi.MessageLocation) messageContent).expiresIn > 0) {
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        C5974t0.this.m21774I(message);
                    }
                });
            }
        }
    }

    @Override
    public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public void mo4050H(long j, final long[] jArr) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C5974t0.this.m21775G(jArr);
            }
        });
    }

    @Override
    public C6957m1.AbstractC6962e mo9610I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var) {
        fVar.m18341E(true);
        final C6957m1.AbstractC6964g y = fVar.m18304y();
        fVar.m18332N(new C6957m1.AbstractC6964g() {
            @Override
            public final boolean mo18302a(C3950k kVar, float f, Object obj) {
                boolean A;
                A = C5974t0.this.m21778A(y, kVar, f, obj);
                return A;
            }
        });
        cVar.m23285a(R.id.btn_messageLiveStop);
        u0Var.m23817a(R.string.StopLiveLocationShort);
        cVar2.m23285a(R.drawable.baseline_remove_circle_24);
        return this;
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    @Override
    public void mo1718L1(TdApi.Location location, int i) {
        if (this.f18964N != 0) {
            this.f18969S = location;
            this.f18970T = i;
            if (this.f18975Y) {
                m21752c0(true);
            }
        }
    }

    public void m21768O(float f, float f2) {
        View view = this.f18966P;
        if (view == null) {
            return;
        }
        if (f >= view.getMeasuredWidth() - C1357a0.m37544i(50.0f)) {
            m21756a0(this.f18964N, null);
        } else {
            m21766Q(false);
        }
    }

    public boolean m21767P(MotionEvent motionEvent) {
        C4336c cVar = this.f18972V;
        return cVar != null && cVar.m28248e(this.f18966P, motionEvent);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            View view = this.f18966P;
            if (view != null) {
                view.invalidate();
            }
        } else if (i == 1) {
            AbstractC5975a aVar = this.f18974X;
            if (aVar != null) {
                aVar.mo21728L4(this, this.f18977a.m29585h(), f, false);
            }
            View view2 = this.f18966P;
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    public C5974t0 m21766Q(boolean z) {
        AbstractC9323v4<?> F;
        ArrayList<TdApi.Message> arrayList = this.f18968R;
        if (arrayList == null || arrayList.isEmpty() || this.f18981c.m14551P1() == null || (F = this.f18981c.m14551P1().m9762F()) == null) {
            return this;
        }
        long j = this.f18964N;
        int i = 1;
        if (j == 0) {
            j = this.f18968R.size() == 1 ? this.f18968R.get(0).chatId : 0L;
        }
        long j2 = (this.f18964N == 0 && this.f18965O == 0) ? this.f18968R.size() == 1 ? this.f18968R.get(0).messageThreadId : 0L : this.f18965O;
        if (j == 0 || z) {
            C9188f2 f2Var = new C9188f2(R.id.liveLocation);
            final C9180e2[] e2VarArr = new C9180e2[1];
            f2Var.m9994r(R.string.StopAllLocationSharings);
            f2Var.m9995q(R.id.theme_color_textNegative);
            f2Var.m10010b(C4403w.m27846o2(R.string.SharingLiveLocationToChats, this.f18968R.size()));
            int size = this.f18968R.size() + 2;
            C2964ra[] raVarArr = new C2964ra[size];
            C2964ra E = new C2964ra(35).m32870J(C1357a0.m37544i(12.0f)).m32875E(true);
            raVarArr[size - 1] = E;
            raVarArr[0] = E;
            Iterator<TdApi.Message> it = this.f18968R.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                raVarArr[i] = new C2964ra(86, i2).m32873G(it.next());
                i = i2;
            }
            f2Var.m10000l(false);
            f2Var.m9996p(raVarArr);
            f2Var.m10004h(new C9188f2.AbstractC9189a() {
                @Override
                public final void mo9986a(C2964ra raVar, C9256o0 o0Var, C7025s3 s3Var, boolean z2) {
                    C5974t0.this.m21773J(raVar, o0Var, s3Var, z2);
                }
            });
            f2Var.m9999m(new C9180e2.AbstractC9181a() {
                @Override
                public final boolean mo10015a(C9180e2 e2Var, View view, boolean z2) {
                    boolean L;
                    L = C5974t0.this.m21771L(e2Var, view, z2);
                    return L;
                }
            });
            f2Var.m9998n(new AbstractC9323v4.AbstractC9337n() {
                @Override
                public final void mo3907a(View view, int i3, C2964ra raVar, TextView textView, C2546iq iqVar) {
                    C5974t0.this.m21770M(e2VarArr, view, i3, raVar, textView, iqVar);
                }
            });
            f2Var.m9987y(new C10534a9(this.f18981c, this.f18963M));
            C9180e2 me2 = F.m9206me(f2Var);
            this.f18993n0 = me2;
            e2VarArr[0] = me2;
            return this;
        }
        C10534a9 a9Var = new C10534a9(this.f18981c, this.f18963M);
        TdApi.Message message = this.f18968R.get(0);
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        this.f18963M.m2485dd().m3479q7(a9Var, new AbstractView$OnClickListenerC3344yb.C3351f(location.latitude, location.longitude, message).m30704a(j, j2).m30702c(true));
        return this;
    }

    @Override
    public void mo4352Q0(C10930q6 q6Var, ArrayList<TdApi.Message> arrayList) {
        if (this.f18963M.m2188w6() != q6Var.m2188w6()) {
            return;
        }
        if (this.f18964N == 0) {
            this.f18968R = arrayList;
            m21752c0(true);
            return;
        }
        boolean z = false;
        boolean z2 = arrayList != null && !arrayList.isEmpty();
        if (z2) {
            Iterator<TdApi.Message> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().chatId == this.f18964N) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z = z2;
        }
        m21761W(z, true);
    }

    public final void m21765R(TdApi.Message message) {
        ArrayList<TdApi.Message> arrayList;
        int indexOf;
        if (!this.f18994o0 && (arrayList = this.f18968R) != null && !arrayList.isEmpty() && (indexOf = this.f18968R.indexOf(message)) != -1) {
            this.f18968R.remove(indexOf);
            m21752c0(true);
        }
    }

    @Override
    public void mo4048R3(long j, long j2) {
        C10722i1.m4163i(this, j, j2);
    }

    public final void m21775G(long[] jArr) {
        ArrayList<TdApi.Message> arrayList;
        if (!this.f18994o0 && (arrayList = this.f18968R) != null && !arrayList.isEmpty()) {
            int i = 0;
            for (int size = this.f18968R.size() - 1; size >= 0; size--) {
                TdApi.Message message = this.f18968R.get(size);
                if (C5062b.m24154s(jArr, message.f25409id) != -1) {
                    this.f18968R.remove(size);
                    m21763T(message, false);
                    i++;
                    if (i == jArr.length) {
                        break;
                    }
                }
            }
            if (i > 0) {
                m21752c0(true);
            }
        }
    }

    public final void m21763T(TdApi.Message message, boolean z) {
        if (z) {
            Handler handler = this.f18971U;
            handler.sendMessageDelayed(Message.obtain(handler, 0, message), ((TdApi.MessageLocation) message.content).expiresIn * 1000);
            return;
        }
        this.f18971U.removeMessages(0, message);
    }

    @Override
    public void mo4047T0(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        C10722i1.m4168d(this, j, j2, messageInteractionInfo);
    }

    public final void m21762U(ArrayList<TdApi.Message> arrayList) {
        if (!this.f18994o0) {
            this.f18968R = arrayList;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    m21763T(it.next(), true);
                }
            }
            m21752c0(true);
            this.f18963M.m2930B4().m4735W1().m4372d(this);
            this.f18963M.m2781K9().m1858g0(this.f18964N, this);
        }
    }

    @Override
    public void mo4046V(long j, long j2) {
        C10722i1.m4166f(this, j, j2);
    }

    @Override
    public void mo4045V1(long j, long j2, boolean z) {
        C10722i1.m4164h(this, j, j2, z);
    }

    public final void m21761W(boolean z, boolean z2) {
        if (this.f18975Y != z) {
            this.f18975Y = z;
            m21752c0(z2);
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    public final void m21760X(boolean z, boolean z2) {
        AbstractC5975a aVar;
        AbstractC5975a aVar2;
        boolean h = this.f18977a.m29585h();
        if (!(h == z || (aVar2 = this.f18974X) == null || aVar2.mo21729G(this, z, z2))) {
            z2 = false;
        }
        this.f18977a.m29577p(z, z2);
        if (h != z && (aVar = this.f18974X) != null) {
            aVar.mo21727S1(this, z, z2);
        }
    }

    @Override
    public void mo4044X1(final TdApi.Message message, long j) {
        if (message.content.getConstructor() == 303973492 && message.schedulingState == null) {
            TdApi.MessageContent messageContent = message.content;
            if (((TdApi.MessageLocation) messageContent).livePeriod > 0 && ((TdApi.MessageLocation) messageContent).expiresIn > 0) {
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        C5974t0.this.m21776E(message);
                    }
                });
            }
        }
    }

    public final boolean m21759Y(String str, String str2) {
        boolean z;
        C5386e eVar = this.f18986g0;
        if (!C5070i.m24068c(eVar != null ? eVar.f17711a : null, str)) {
            this.f18986g0 = new C5386e(str);
            z = true;
        } else {
            z = false;
        }
        if (!C5070i.m24068c(this.f18987h0, str2)) {
            this.f18987h0 = str2;
            z = true;
        }
        if (z) {
            m21754b0(true);
        }
        return z;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        AbstractC5975a aVar;
        if (i == 1 && (aVar = this.f18974X) != null) {
            aVar.mo21728L4(this, this.f18977a.m29585h(), f, true);
        }
    }

    public final boolean m21758Z(String str, String str2) {
        boolean z;
        C5386e eVar = this.f18976Z;
        boolean z2 = true;
        if (!C5070i.m24068c(eVar != null ? eVar.f17711a : null, str)) {
            this.f18976Z = new C5386e(str);
            z = true;
        } else {
            z = false;
        }
        if (!C5070i.m24068c(this.f18978a0, str2)) {
            this.f18978a0 = str2;
        } else {
            z2 = z;
        }
        if (z2) {
            m21754b0(false);
        }
        return z2;
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    public void m21756a0(final long j, final Runnable runnable) {
        AbstractC9323v4<?> F;
        C9270q1 P1 = this.f18981c.m14551P1();
        if (P1 != null && !P1.m9736X() && (F = P1.m9762F()) != null) {
            C5320c cVar = new C5320c(2);
            C5146u0 u0Var = new C5146u0(2);
            C5320c cVar2 = new C5320c(2);
            cVar.m23285a(R.id.btn_stopAllLiveLocations);
            u0Var.m23817a(R.string.StopLiveLocation);
            cVar2.m23285a(R.drawable.baseline_remove_circle_24);
            cVar.m23285a(R.id.btn_cancel);
            u0Var.m23817a(R.string.Cancel);
            cVar2.m23285a(R.drawable.baseline_cancel_24);
            F.m9261ee(j != 0 ? C4403w.m27855m1(R.string.StopLiveLocationInfoX, this.f18963M.m2691Q3(j)) : C4403w.m27871i1(R.string.StopLiveLocationInfo), cVar.m23281e(), u0Var.m23814d(), new int[]{2, 1}, cVar2.m23281e(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean N;
                    N = C5974t0.this.m21769N(j, runnable, view, i);
                    return N;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23936a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23935b(this, i);
                }
            });
        }
    }

    public final void m21754b0(boolean z) {
        String str;
        C5386e eVar;
        float f;
        String str2;
        View view = this.f18966P;
        if (view != null) {
            float measuredWidth = view.getMeasuredWidth();
            this.f18985f0 = measuredWidth;
            float i = measuredWidth - C1357a0.m37544i(104.0f);
            if (z) {
                eVar = this.f18986g0;
                str = this.f18987h0;
            } else {
                eVar = this.f18976Z;
                str = this.f18978a0;
            }
            String str3 = null;
            float f2 = 0.0f;
            if (i <= 0.0f || eVar == null || str == null) {
                str2 = null;
                f = 0.0f;
            } else {
                TextPaint p0 = C1410y.m37023p0(eVar.f17712b);
                String charSequence = TextUtils.ellipsize(eVar.f17711a, p0, i, TextUtils.TruncateAt.END).toString();
                float T1 = C7389v0.m16680T1(charSequence, p0);
                float f3 = i - T1;
                if (f3 > 0.0f) {
                    String charSequence2 = TextUtils.ellipsize(str, C1410y.m37039h0(), f3, TextUtils.TruncateAt.END).toString();
                    f2 = C7389v0.m16680T1(charSequence2, C1410y.m37039h0());
                    str3 = charSequence2;
                }
                str2 = str3;
                str3 = charSequence;
                f = f2;
                f2 = T1;
            }
            if (z) {
                this.f18988i0 = str3;
                this.f18989j0 = str2;
                this.f18990k0 = f2;
                this.f18991l0 = f;
                return;
            }
            this.f18980b0 = str3;
            this.f18982c0 = str2;
            this.f18983d0 = f2;
            this.f18984e0 = f;
        }
    }

    @Override
    public void mo4351b4(ArrayList<C10930q6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        int indexOf = arrayList.indexOf(this.f18963M);
        if (this.f18964N != 0) {
            boolean z = true;
            boolean z2 = indexOf != -1;
            if (z2) {
                Iterator<TdApi.Message> it = arrayList2.get(indexOf).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().chatId == this.f18964N) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = z2;
            }
            m21761W(z, false);
        } else if (indexOf != -1) {
            this.f18968R = arrayList2.get(indexOf);
            m21752c0(false);
        }
    }

    public final void m21752c0(boolean z) {
        String str;
        String str2;
        String str3;
        if (this.f18966P != null) {
            String g = C10536ab.m4667o1().m4735W1().m4369g(this.f18963M, this.f18968R, this.f18964N, true, this.f18969S);
            String str4 = null;
            if (!C5070i.m24062i(g)) {
                str = C4403w.m27871i1(R.string.AttachLiveLocation);
                g = " " + g;
            } else {
                str = null;
            }
            boolean z2 = false;
            if (this.f18964N != 0) {
                String g2 = C10536ab.m4667o1().m4735W1().m4369g(this.f18963M, this.f18968R, this.f18964N, false, this.f18969S);
                if (g2 != null) {
                    if (this.f18968R.size() == 2) {
                        C10930q6 q6Var = this.f18963M;
                        ArrayList<TdApi.Message> arrayList = this.f18968R;
                        str3 = q6Var.m2151yb(arrayList.get(q6Var.m2411i7(arrayList.get(0)) ? 1 : 0).senderId);
                    } else {
                        str3 = C4403w.m27871i1(R.string.AttachLiveLocation);
                    }
                    str4 = str3;
                    str2 = " " + g2;
                } else {
                    str2 = g2;
                }
            } else {
                str2 = null;
            }
            boolean z3 = !C5070i.m24062i(str) && m21758Z(str, g);
            if (!C5070i.m24062i(str4) && m21759Y(str4, str2)) {
                z3 = true;
            }
            this.f18979b.m29577p(!C5070i.m24062i(str4), z && this.f18977a.m29586g() > 0.0f);
            if (!C5070i.m24062i(str) || !C5070i.m24062i(g)) {
                z2 = true;
            }
            m21760X(z2, z);
            if (z3 && this.f18977a.m29585h()) {
                this.f18966P.invalidate();
            }
        }
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    @Override
    public boolean handleMessage(Message message) {
        m21765R((TdApi.Message) message.obj);
        return true;
    }

    @Override
    public void mo4350k1(C10930q6 q6Var, TdApi.Message message) {
        if (this.f18963M.m2188w6() == q6Var.m2188w6()) {
            m21735u(message.chatId, message.f25409id);
        }
    }

    @Override
    public void mo4042k5(TdApi.Message message, long j, int i, String str) {
        C10722i1.m4162j(this, message, j, i, str);
    }

    @Override
    public void mo4041l0(long j, final long j2, final TdApi.MessageContent messageContent) {
        if (messageContent.getConstructor() == 303973492 && ((TdApi.MessageLocation) messageContent).livePeriod > 0) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C5974t0.this.m21777D(j2, messageContent);
                }
            });
        }
    }

    public final void m21774I(TdApi.Message message) {
        if (!this.f18994o0) {
            ArrayList<TdApi.Message> arrayList = this.f18968R;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TdApi.Message next = it.next();
                    if (C7321e.m16975W(next.senderId, message.senderId)) {
                        this.f18968R.remove(i);
                        m21763T(next, false);
                        break;
                    }
                    i++;
                }
            } else {
                this.f18968R = new ArrayList<>();
            }
            this.f18968R.add(message);
            m21763T(message, true);
            m21752c0(true);
        }
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return true;
    }

    public C5974t0 m21740o() {
        this.f18994o0 = true;
        this.f18963M.m2930B4().m4735W1().m4358r(this);
        if (this.f18964N != 0) {
            this.f18963M.m2781K9().m1806t0(this.f18964N, this);
            this.f18971U.removeCallbacksAndMessages(null);
            this.f18977a.m29577p(false, false);
            AbstractC5975a aVar = this.f18974X;
            if (aVar != null) {
                aVar.mo21728L4(this, false, 0.0f, true);
            }
        }
        return this;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    public void m21739q(Canvas canvas, int i) {
        int measuredWidth;
        Drawable drawable;
        int i2;
        int i3;
        float f;
        C5386e eVar;
        C5386e eVar2;
        View view = this.f18966P;
        if (view != null) {
            float measuredWidth2 = view.getMeasuredWidth();
            if (this.f18985f0 != measuredWidth2) {
                this.f18985f0 = measuredWidth2;
                m21754b0(false);
                m21754b0(true);
            }
            float g = this.f18977a.m29586g();
            int i4 = (int) (255.0f * g);
            if (i4 != 0) {
                int i5 = C1357a0.m37544i(56.0f) / 2;
                int t = i + (m21736t() / 2);
                Paint i6 = this.f18967Q ? C1410y.m37038i() : C1410y.m37071J();
                i6.setAlpha(i4);
                C1362c.m37490b(canvas, this.f18973W, i5 - (drawable.getMinimumWidth() / 2), t - (this.f18973W.getMinimumHeight() / 2), i6);
                i6.setAlpha(255);
                int c = this.f18967Q ? C11524j.m196c() : C11524j.m159q0();
                float f2 = t;
                long B = C1359b.m37525B(canvas, i5, f2, C5064d.m24131b(i4, c), false, this.f18992m0);
                if (B != -1) {
                    this.f18992m0 = SystemClock.uptimeMillis() + B;
                    int i7 = C1357a0.m37544i(15.0f);
                    int i8 = C1357a0.m37544i(24.0f);
                    this.f18966P.postInvalidateDelayed(B, i5 - i7, t - i8, i5 + i7, t + i8);
                }
                C1359b.m37507o(canvas, measuredWidth - (C1357a0.m37544i(50.0f) / 2), f2, 1.0f, C1357a0.m37544i(9.0f), C1410y.m37056Y(C5064d.m24132a(g, c), C1357a0.m37544i(2.0f)));
                if (this.f18967Q) {
                    i3 = C11524j.m213U0();
                    i2 = C11524j.m215T0();
                } else {
                    i3 = C11524j.m217S0();
                    i2 = C11524j.m213U0();
                }
                int i9 = i3;
                int i10 = i2;
                float g2 = this.f18979b.m29586g();
                if (g2 == 1.0f || (eVar2 = this.f18976Z) == null) {
                    f = g2;
                } else {
                    f = g2;
                    m21738r(canvas, i, eVar2, this.f18980b0, this.f18983d0, this.f18982c0, this.f18984e0, i9, i10, g, -g2);
                }
                if (f != 0.0f && (eVar = this.f18986g0) != null) {
                    m21738r(canvas, i, eVar, this.f18988i0, this.f18990k0, this.f18989j0, this.f18991l0, i9, i10, g, 1.0f - f);
                }
            }
        }
    }

    public final void m21738r(Canvas canvas, int i, C5386e eVar, String str, float f, String str2, float f2, int i2, int i3, float f3, float f4) {
        float abs = f3 * (1.0f - Math.abs(f4));
        boolean z = f4 != 0.0f;
        if (z) {
            canvas.save();
            canvas.translate(0.0f, m21736t() * f4);
        }
        int i4 = i + C1357a0.m37544i(23.0f);
        int measuredWidth = (this.f18966P.getMeasuredWidth() / 2) - (((int) (f2 + f)) / 2);
        if (str != null) {
            TextPaint p0 = C1410y.m37023p0(eVar.f17712b);
            int color = p0.getColor();
            p0.setColor(C5064d.m24132a(abs, i2));
            canvas.drawText(str, measuredWidth, i4, p0);
            p0.setColor(color);
        }
        if (str2 != null) {
            canvas.drawText(str2, measuredWidth + f, i4, C1410y.m37037i0(C5064d.m24132a(abs, i3)));
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public void mo4039r5(long j, long j2, int i, TdApi.ReplyMarkup replyMarkup) {
        C10722i1.m4169c(this, j, j2, i, replyMarkup);
    }

    public final void m21777D(long j, TdApi.MessageLocation messageLocation) {
        ArrayList<TdApi.Message> arrayList;
        if (this.f18994o0 || (arrayList = this.f18968R) == null || arrayList.isEmpty()) {
            return;
        }
        if (messageLocation.expiresIn == 0) {
            m21775G(new long[]{j});
            return;
        }
        Iterator<TdApi.Message> it = this.f18968R.iterator();
        while (it.hasNext()) {
            TdApi.Message next = it.next();
            if (next.f25409id == j) {
                next.content = messageLocation;
                m21763T(next, false);
                m21763T(next, true);
                if (C7316a.m17049l(this.f18964N) && this.f18968R.size() == 2) {
                    m21752c0(true);
                    return;
                }
                return;
            }
        }
    }

    public final int m21735u(long j, long j2) {
        ArrayList<TdApi.Message> arrayList = this.f18968R;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<TdApi.Message> it = this.f18968R.iterator();
            while (it.hasNext()) {
                TdApi.Message next = it.next();
                if (next.chatId == j && next.f25409id == j2) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public C5974t0 m21734v() {
        if (this.f18964N != 0) {
            this.f18963M.m2270r4().m14783o(new TdApi.SearchChatRecentLocationMessages(this.f18964N, 100), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C5974t0.this.m21731y(object);
                }
            });
        } else {
            this.f18963M.m2930B4().m4735W1().m4372d(this);
        }
        return this;
    }

    public boolean m21733w() {
        return this.f18977a.m29585h();
    }

    @Override
    public void mo4349w5(boolean z) {
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo4038z5(long j, long j2) {
        C10722i1.m4165g(this, j, j2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
