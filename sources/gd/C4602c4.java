package gd;

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
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import gd.C4602c4;
import gd.C4779t2;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import me.C7057w;
import me.RunnableC6969m2;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3950k;
import p080fb.AbstractC4345j;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5065e;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.AbstractC5143t;
import p111he.C5132o;
import p111he.C5141s;
import p111he.C5147v;
import p139jb.AbstractC5914f;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6038h;
import p193nb.C7321e;
import p291uc.C9552h1;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9188f2;
import td.C9357x2;

public class C4602c4 {
    public final AbstractC4761s4 f15224a;
    public final AbstractC4761s4 f15225b;
    public AbstractC4345j f15227d;
    public int f15228e;
    public TdApi.ReplyMarkupInlineKeyboard f15229f;
    public long f15230g;
    public boolean f15232i;
    public boolean f15233j;
    public int f15234k;
    public int f15235l;
    public int f15237n;
    public int f15238o;
    public int f15239p;
    public int f15236m = -1;
    public final ArrayList<C4603a> f15231h = new ArrayList<>();
    public final RectF f15226c = new RectF();

    public interface AbstractC4606b {
        void mo26567a(View view, C4602c4 c4Var, C4603a aVar);

        boolean mo26564c(View view, C4602c4 c4Var, C4603a aVar);
    }

    public C4602c4(AbstractC4761s4 s4Var, boolean z) {
        this.f15224a = s4Var;
        this.f15225b = s4Var;
    }

    public static String m27018g(String str) {
        int indexOf;
        int indexOf2 = str.indexOf(10);
        if (indexOf2 == -1 || (indexOf = str.indexOf(10, indexOf2 + 1)) == -1) {
            return str;
        }
        return str.substring(0, indexOf) + ' ' + str.substring(indexOf + 1).replace('\n', ' ');
    }

    public static int m27013l(TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr) {
        int i = -1;
        for (TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 : inlineKeyboardButtonArr) {
            if (inlineKeyboardButtonArr2.length > i) {
                i = inlineKeyboardButtonArr2.length;
            }
        }
        return i;
    }

    public static int m27010o() {
        return C1357a0.m37544i(39.0f);
    }

    public static int m27009p() {
        return C1357a0.m37544i(4.0f);
    }

    public static int m27008q() {
        return C1357a0.m37544i(4.0f);
    }

    public static int m27005t() {
        return Math.round(C1410y.m37068M().getStrokeWidth() * 0.5f);
    }

    public void m27027A(int i, String str, int i2, boolean z, AbstractC4606b bVar) {
        this.f15228e = i2;
        this.f15232i = true;
        this.f15233j = z;
        C4603a aVar = new C4603a(this, this.f15225b, str.toUpperCase(), i, i2 - (m27009p() * 2));
        aVar.m26985G0(bVar);
        aVar.m26981I0(this.f15227d);
        this.f15231h.clear();
        this.f15231h.add(aVar);
    }

    public void m27026B(AbstractC4345j jVar) {
        this.f15227d = jVar;
        Iterator<C4603a> it = this.f15231h.iterator();
        while (it.hasNext()) {
            it.next().m26981I0(jVar);
        }
    }

    public void m27025C(long j, long j2) {
        if (this.f15230g == j) {
            this.f15230g = j2;
        }
    }

    public final void m27019f(int i, int i2) {
        int i3;
        int i4;
        C4603a aVar;
        if (this.f15229f != null) {
            this.f15228e = i;
            int q = m27008q();
            int p = m27009p();
            int size = this.f15231h.size();
            int i5 = C1357a0.m37544i(12.0f);
            TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr = this.f15229f.rows;
            int length = inlineKeyboardButtonArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            float f = 0.0f;
            while (i7 < length) {
                TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 = inlineKeyboardButtonArr[i7];
                int length2 = (i - ((inlineKeyboardButtonArr2.length - 1) * q)) / inlineKeyboardButtonArr2.length;
                int i9 = p * 2;
                p = p;
                int max = Math.max(i6, length2 - i9);
                int length3 = inlineKeyboardButtonArr2.length;
                inlineKeyboardButtonArr = inlineKeyboardButtonArr;
                int i10 = 0;
                while (i10 < length3) {
                    length = length;
                    TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i10];
                    if (i8 >= size) {
                        i4 = size;
                        i3 = length3;
                        aVar = new C4603a(this, this.f15225b, inlineKeyboardButton, max);
                        aVar.m26981I0(this.f15227d);
                        this.f15231h.add(aVar);
                    } else {
                        i4 = size;
                        i3 = length3;
                        aVar = this.f15231h.get(i8);
                        aVar.m26987F0(inlineKeyboardButton, max);
                    }
                    float S = aVar.m26964S();
                    if (S != 0.0f) {
                        f = Math.max(f, ((S + i9) * inlineKeyboardButtonArr2.length) + ((inlineKeyboardButtonArr2.length - 1) * q));
                    }
                    int b = aVar.f15240M.m23809b() + (i5 * 2);
                    if (length2 < b) {
                        f = Math.max(f, (b * inlineKeyboardButtonArr2.length) + ((inlineKeyboardButtonArr2.length - 1) * q));
                    }
                    i8++;
                    i10++;
                    size = i4;
                    length3 = i3;
                }
                i7++;
                i6 = 0;
            }
            if (i8 < this.f15231h.size() - 1) {
                while (i8 < this.f15231h.size()) {
                    this.f15231h.remove(i8);
                    i8++;
                }
            }
            if (i2 != 0 && i2 > i && f > i) {
                m27019f((int) Math.min(f, i2), 0);
            }
        }
    }

    public void m27017h() {
        this.f15229f = null;
        this.f15230g = 0L;
    }

    public boolean m27016i(View view) {
        if (this.f15231h.size() <= 0) {
            return false;
        }
        this.f15231h.get(0).m26991D0(view);
        return true;
    }

    public void m27015j(C9552h1 h1Var, Canvas canvas, int i, int i2) {
        this.f15234k = i;
        this.f15235l = i2;
        int o = m27010o();
        int q = m27008q();
        int t = m27005t();
        if (this.f15232i) {
            this.f15231h.get(0).m26978K(h1Var, canvas, i, i2, this.f15228e, o, this.f15233j ? 0 : t, this.f15226c, 0, 0);
            return;
        }
        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard = this.f15229f;
        if (replyMarkupInlineKeyboard != null) {
            TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr = replyMarkupInlineKeyboard.rows;
            int length = inlineKeyboardButtonArr.length;
            int i3 = i2;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 = inlineKeyboardButtonArr[i5];
                int length2 = (this.f15228e - ((inlineKeyboardButtonArr2.length - 1) * q)) / inlineKeyboardButtonArr2.length;
                int length3 = inlineKeyboardButtonArr2.length;
                int i7 = i;
                int i8 = i4;
                int i9 = 0;
                for (int i10 = 0; i10 < length3; i10++) {
                    TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i10];
                    length3 = length3;
                    inlineKeyboardButtonArr2 = inlineKeyboardButtonArr2;
                    i5 = i5;
                    length = length;
                    this.f15231h.get(i8).m26978K(h1Var, canvas, i7, i3, length2, o, t, this.f15226c, i6, i9);
                    i7 += length2 + q;
                    i8++;
                    i9++;
                }
                i4 = i8;
                i3 += q + o;
                i6++;
                i5++;
            }
        }
    }

    public final int m27014k(int i, int i2) {
        int q = m27008q();
        int o = m27010o();
        if (this.f15232i) {
            return (this.f15231h.isEmpty() || i < 0 || i > this.f15228e || i2 < 0 || i2 > o) ? -1 : 0;
        }
        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard = this.f15229f;
        if (replyMarkupInlineKeyboard != null && i >= 0 && i2 >= 0) {
            TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr = replyMarkupInlineKeyboard.rows;
            int length = inlineKeyboardButtonArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 = inlineKeyboardButtonArr[i3];
                if (i2 < i4) {
                    return -1;
                }
                if (i2 > i4 + o) {
                    i4 += o + q;
                    i5 += inlineKeyboardButtonArr2.length;
                    i3++;
                } else {
                    int length2 = (this.f15228e - ((inlineKeyboardButtonArr2.length - 1) * q)) / inlineKeyboardButtonArr2.length;
                    int i6 = 0;
                    for (TdApi.InlineKeyboardButton inlineKeyboardButton : inlineKeyboardButtonArr2) {
                        if (i < i6) {
                            return -1;
                        }
                        if (i > i6 + length2) {
                            i6 += length2 + q;
                            i5++;
                        } else {
                            this.f15238o = i6;
                            this.f15239p = i4;
                            return i5;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public final void m27012m(int i) {
        TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr;
        if (this.f15229f != null && i >= 0 && i < this.f15231h.size()) {
            int q = m27008q();
            int o = m27010o();
            int i2 = 0;
            int i3 = 0;
            for (TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 : this.f15229f.rows) {
                int length = (this.f15228e - ((inlineKeyboardButtonArr2.length - 1) * q)) / inlineKeyboardButtonArr2.length;
                int length2 = inlineKeyboardButtonArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 < length2) {
                        TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i4];
                        int i6 = i2 + 1;
                        if (i2 == i) {
                            this.f15238o = i5;
                            this.f15239p = i3;
                            i2 = i6;
                            break;
                        }
                        i5 += length + q;
                        i4++;
                        i2 = i6;
                    }
                }
                i3 += o + q;
            }
            this.f15238o = -1;
            this.f15239p = -1;
        }
    }

    public C4603a m27011n() {
        return this.f15231h.get(0);
    }

    public int m27007r() {
        TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard = this.f15229f;
        if (replyMarkupInlineKeyboard != null) {
            return (replyMarkupInlineKeyboard.rows.length * m27010o()) + ((this.f15229f.rows.length - 1) * m27008q());
        }
        return 0;
    }

    public final int m27006s() {
        return m27009p() * 4;
    }

    public int m27004u() {
        return this.f15228e;
    }

    public boolean m27003v() {
        return this.f15229f == null;
    }

    public boolean m27002w(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (this.f15231h.isEmpty()) {
            return false;
        }
        int round = Math.round(motionEvent.getX() - this.f15234k);
        int round2 = Math.round(motionEvent.getY() - this.f15235l);
        if (motionEvent.getAction() == 0) {
            this.f15236m = m27014k(round, round2);
            this.f15237n = this.f15228e;
        }
        int i = this.f15236m;
        if (!(i == -1 || this.f15237n == this.f15228e)) {
            m27012m(i);
        }
        int i2 = this.f15236m;
        if (i2 != -1 && i2 >= 0 && i2 < this.f15231h.size() && this.f15231h.get(this.f15236m).m26908y0(view, motionEvent, Math.round(round - this.f15238o), Math.round(round2 - this.f15239p))) {
            z = true;
        }
        if (this.f15236m != -1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            this.f15236m = -1;
        }
        return z;
    }

    public void m27001x(View view) {
        TdApi.InlineKeyboardButtonType inlineKeyboardButtonType;
        if (this.f15231h.size() > 0 && (inlineKeyboardButtonType = this.f15231h.get(0).f15241N) != null && inlineKeyboardButtonType.getConstructor() == -383429528) {
            this.f15231h.get(0).m26991D0(view);
        }
    }

    public boolean m27000y(View view) {
        Iterator<C4603a> it = this.f15231h.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().m26989E0(view)) {
                z = true;
            }
        }
        return z;
    }

    public void m26999z(long j, TdApi.ReplyMarkupInlineKeyboard replyMarkupInlineKeyboard, int i, int i2) {
        this.f15229f = replyMarkupInlineKeyboard;
        this.f15230g = j;
        int min = Math.min(i2, Math.max(C1357a0.m37544i(this.f15224a.m26069R9() ? 40.0f : 200.0f), Math.max(i, m27013l(replyMarkupInlineKeyboard.rows) * m27006s())));
        this.f15228e = min;
        m27019f(min, i2);
    }

    public static class C4603a implements C3950k.AbstractC3952b, AbstractC5143t {
        public C5147v f15240M;
        public TdApi.InlineKeyboardButtonType f15241N;
        public C4602c4 f15242O;
        public boolean f15243P;
        public int f15244Q;
        public boolean f15245R;
        public String f15246S;
        public float f15247T;
        public AbstractC4345j f15250W;
        public int f15251X;
        public int f15252Y;
        public int f15253Z;
        public final AbstractC4761s4 f15254a;
        public int f15255a0;
        public C9357x2.C9370l f15257b0;
        public float f15259c0;
        public C3950k f15260d0;
        public float f15261e0;
        public C3950k f15262f0;
        public float f15263g0;
        public C3950k f15264h0;
        public float f15265i0;
        public RunnableC6969m2 f15266j0;
        public C3950k f15267k0;
        public AbstractRunnableC5910b f15268l0;
        public AbstractC4606b f15269m0;
        public C6038h<Drawable> f15270n0;
        public int f15248U = -1;
        public int f15249V = -1;
        public final Path f15256b = new Path();
        public final Rect f15258c = new Rect();

        public class C4604a extends AbstractRunnableC5910b {
            public C4604a() {
            }

            @Override
            public void mo1364b() {
                C4603a.this.m26986G(1.0f);
            }
        }

        public class C4605b implements HandlerC10770jj.AbstractC10785n {
            public final int f15272a;
            public final byte[] f15273b;
            public final View f15274c;

            public C4605b(int i, byte[] bArr, View view) {
                this.f15272a = i;
                this.f15273b = bArr;
                this.f15274c = view;
            }

            @Override
            public void mo3335a(TdApi.Object object) {
                if (this.f15272a == C4603a.this.f15255a0) {
                    C4603a.this.m26910x0();
                }
            }

            @Override
            public void mo3334b(String str) {
                if (this.f15272a == C4603a.this.f15255a0) {
                    C4603a.this.m26912w0();
                    C4603a.this.m26982I();
                    C4603a.this.m26986G(1.0f);
                }
                C4603a.this.f15242O.f15224a.f16099O0.m2270r4().m14783o(new TdApi.GetCallbackQueryAnswer(C4603a.this.f15254a.m26146K2(), C4603a.this.f15242O.f15230g, new TdApi.CallbackQueryPayloadDataWithPassword(str, this.f15273b)), C4603a.this.m26970O(this.f15272a, this.f15274c, false));
            }
        }

        public C4603a(C4602c4 c4Var, AbstractC4761s4 s4Var, TdApi.InlineKeyboardButton inlineKeyboardButton, int i) {
            this.f15242O = c4Var;
            this.f15254a = s4Var;
            String O0 = m26969O0(C4602c4.m27018g(inlineKeyboardButton.text));
            boolean M0 = RunnableC5390g.m22984M0(O0);
            this.f15243P = M0;
            this.f15240M = new C5147v(O0, i, C1410y.m37030m(M0));
            TdApi.InlineKeyboardButtonType inlineKeyboardButtonType = inlineKeyboardButton.type;
            this.f15241N = inlineKeyboardButtonType;
            if (inlineKeyboardButtonType.getConstructor() == 1360739440) {
                String d = C5065e.m24121d(((TdApi.MessageInvoice) s4Var.m25994Z3().content).currency);
                this.f15246S = d;
                this.f15247T = C7389v0.m16680T1(d, C1410y.m37022q(10.0f));
            }
        }

        public void m26958Z(int i, String str, boolean z, View view, CharSequence charSequence, boolean z2) {
            if (i == this.f15255a0) {
                m26910x0();
            }
            if (!this.f15254a.m26031V5()) {
                AbstractC9323v4<?> F = this.f15254a.mo4347s().m14551P1().m9762F();
                boolean z3 = F instanceof View$OnClickListenerC2971rh;
                if (F != null && F.mo9464C9() == this.f15254a.m26146K2()) {
                    if (!C5070i.m24062i(str)) {
                        if (!z || !z3) {
                            F.m9357Qc(str, m26906z0(i, view));
                        } else {
                            TdApi.Message Z3 = this.f15254a.m25994Z3();
                            View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) F;
                            long j = Z3.viaBotUserId;
                            if (j == 0) {
                                j = C7321e.m16984R0(Z3);
                            }
                            rhVar.m32773Do(j, ((TdApi.MessageGame) Z3.content).game, str, Z3);
                        }
                    }
                    if (charSequence == null) {
                        return;
                    }
                    if (z2 || !z3) {
                        F.m9310Xc(this.f15242O.f15224a.mo4348c().m2580X9(this.f15254a.m25994Z3()), charSequence);
                    } else {
                        ((View$OnClickListenerC2971rh) F).m32616Pq(charSequence);
                    }
                }
            }
        }

        public void m26956a0(int i) {
            if (i == this.f15255a0) {
                m26910x0();
            }
        }

        public void m26954b0(int i) {
            if (i == this.f15255a0) {
                m26910x0();
            }
        }

        public void m26952c0(final int i, final boolean z, final View view, TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor != -1679978726) {
                if (constructor != 360867933) {
                    Log.unexpectedTdlibResponse(object, TdApi.GetCallbackQueryAnswer.class, TdApi.CallbackQueryAnswer.class);
                    this.f15242O.f15224a.mo4348c().m2485dd().post(new Runnable() {
                        @Override
                        public final void run() {
                            C4602c4.C4603a.this.m26954b0(i);
                        }
                    });
                    return;
                }
                TdApi.CallbackQueryAnswer callbackQueryAnswer = (TdApi.CallbackQueryAnswer) object;
                final CharSequence I = callbackQueryAnswer.text.isEmpty() ? null : C5078d.m23987z().m24025I(callbackQueryAnswer.text);
                final boolean z2 = callbackQueryAnswer.showAlert;
                final String str = callbackQueryAnswer.url;
                this.f15242O.f15224a.mo4348c().m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C4602c4.C4603a.this.m26958Z(i, str, z, view, I, z2);
                    }
                });
            } else if (((TdApi.Error) object).code == 502) {
                C1379j0.m37311q0(this.f15242O.f15224a.mo4348c().m2580X9(this.f15254a.m25994Z3()));
            } else {
                C1379j0.m37305t0(object);
                this.f15242O.f15224a.mo4348c().m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C4602c4.C4603a.this.m26956a0(i);
                    }
                });
            }
        }

        public static Object m26950d0(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            if (i3 == 1) {
                return new C5132o(null, R.id.theme_color_textLink);
            }
            return C4403w.m27891d2(z);
        }

        public static Object m26948e0(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return new C5132o(null, R.id.theme_color_textLink);
        }

        public void m26946f0(List list, TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, int i, View view, boolean z, int i2, SparseIntArray sparseIntArray) {
            boolean D = ((C2964ra) list.get(0)).m32876D();
            boolean z2 = list.size() > 1 && ((C2964ra) list.get(1)).m32876D();
            if (D) {
                m26912w0();
                m26979J0();
                this.f15242O.f15224a.mo4348c().m2270r4().m14783o(new TdApi.GetLoginUrl(this.f15254a.m26146K2(), this.f15242O.f15230g, inlineKeyboardButtonTypeLoginUrl.f25381id, z2), m26965R(i, view, inlineKeyboardButtonTypeLoginUrl, z));
                return;
            }
            m26995B0(i, view, inlineKeyboardButtonTypeLoginUrl.url, false);
        }

        public static void m26944g0(C2964ra raVar, C9137c cVar, boolean z) {
            int A = raVar.m32879A();
            if (A == 12 || A == 69 || A == 99) {
                ((C7057w) cVar.getChildAt(0)).m17933e(raVar.m32876D(), z);
            }
        }

        public static void m26942h0(List list, View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar) {
            int j = raVar.m32838j();
            if (j == R.id.btn_allowWriteAccess) {
                if (iqVar.m34255A0().get(R.id.btn_allowWriteAccess) == R.id.btn_allowWriteAccess) {
                    ((C2964ra) list.get(0)).m32861S(true);
                    iqVar.m34133s3(R.id.btn_signIn);
                }
            } else if (j == R.id.btn_signIn) {
                if (!(iqVar.m34255A0().get(R.id.btn_signIn) == R.id.btn_signIn)) {
                    ((C2964ra) list.get(1)).m32861S(false);
                    iqVar.m34133s3(R.id.btn_allowWriteAccess);
                }
            }
        }

        public void m26940i0(final int i, TdApi.Object object, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z) {
            if (i == this.f15255a0) {
                m26910x0();
            }
            if (!this.f15254a.m26031V5()) {
                AbstractC9323v4<?> F = this.f15254a.mo4347s().m14551P1().m9762F();
                if ((F instanceof View$OnClickListenerC2971rh) && F.mo9464C9() == this.f15254a.m26146K2()) {
                    int constructor = object.getConstructor();
                    if (constructor == -1679978726) {
                        C1379j0.m37305t0(object);
                        m26995B0(i, view, inlineKeyboardButtonTypeLoginUrl.url, z);
                    } else if (constructor == -1079045420) {
                        TdApi.LoginUrlInfoOpen loginUrlInfoOpen = (TdApi.LoginUrlInfoOpen) object;
                        this.f15242O.f15224a.mo4348c().m2485dd().m3858E7(this.f15242O.f15224a.m26097P0(), loginUrlInfoOpen.url, m26906z0(i, view).m3326e().m3317n(!loginUrlInfoOpen.skipConfirm));
                    } else if (constructor == 2128290863) {
                        TdApi.LoginUrlInfoRequestConfirmation loginUrlInfoRequestConfirmation = (TdApi.LoginUrlInfoRequestConfirmation) object;
                        final ArrayList arrayList = new ArrayList();
                        arrayList.add(new C2964ra(99, (int) R.id.btn_signIn, 0, C4403w.m27875h1(R.string.LogInAsOn, C4805u3.f16376a, this.f15242O.f15224a.mo4348c().m2885E1(), loginUrlInfoRequestConfirmation.domain), true));
                        if (loginUrlInfoRequestConfirmation.requestWriteAccess) {
                            arrayList.add(new C2964ra(99, (int) R.id.btn_allowWriteAccess, 0, C4403w.m27875h1(R.string.AllowWriteAccess, C4403w.m27845p(), this.f15242O.f15224a.mo4348c().m2480e2().m1721K2(loginUrlInfoRequestConfirmation.botUserId)), true));
                        }
                        this.f15242O.f15224a.m26097P0().m9206me(new C9188f2(R.id.btn_open).m10010b(C4403w.m27875h1(R.string.OpenLinkConfirm, C4742q3.f15946a, loginUrlInfoRequestConfirmation.url)).m9997o(arrayList).m10002j(new AbstractC9323v4.AbstractC9343r() {
                            @Override
                            public final void mo1773l6(int i2, SparseIntArray sparseIntArray) {
                                C4602c4.C4603a.this.m26946f0(arrayList, inlineKeyboardButtonTypeLoginUrl, i, view, z, i2, sparseIntArray);
                            }
                        }).m9992t(C4724o3.f15914a).m9998n(loginUrlInfoRequestConfirmation.requestWriteAccess ? new AbstractC9323v4.AbstractC9337n() {
                            @Override
                            public final void mo3907a(View view2, int i2, C2964ra raVar, TextView textView, C2546iq iqVar) {
                                C4602c4.C4603a.m26942h0(arrayList, view2, i2, raVar, textView, iqVar);
                            }
                        } : null).m9994r(R.string.Open).m9997o(arrayList));
                    }
                }
            }
        }

        public void m26938j0(final int i, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z, final TdApi.Object object) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C4602c4.C4603a.this.m26940i0(i, object, view, inlineKeyboardButtonTypeLoginUrl, z);
                }
            });
        }

        public void m26936k0(int i, TdApi.Object object, View view, TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, boolean z) {
            if (i == this.f15255a0) {
                m26910x0();
            }
            if (!this.f15254a.m26031V5()) {
                AbstractC9323v4<?> F = this.f15254a.mo4347s().m14551P1().m9762F();
                if ((F instanceof View$OnClickListenerC2971rh) && F.mo9464C9() == this.f15254a.m26146K2()) {
                    int constructor = object.getConstructor();
                    if (constructor == -2018019930) {
                        this.f15242O.f15224a.mo4348c().m2485dd().m3858E7(this.f15242O.f15224a.m26097P0(), ((TdApi.HttpUrl) object).url, m26906z0(i, view).m3326e());
                    } else if (constructor == -1679978726) {
                        C1379j0.m37305t0(object);
                        m26995B0(i, view, inlineKeyboardButtonTypeLoginUrl.url, z);
                    }
                }
            }
        }

        public void m26934l0(final int i, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z, final TdApi.Object object) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C4602c4.C4603a.this.m26936k0(i, object, view, inlineKeyboardButtonTypeLoginUrl, z);
                }
            });
        }

        public void m26932m0(int i, byte[] bArr, View view, CharSequence charSequence) {
            this.f15242O.f15224a.f16099O0.m2485dd().m3678W7(this.f15242O.f15224a.m25982a7(), charSequence, new C4605b(i, bArr, view));
        }

        public Object m26930n0(C4779t2.C4782c cVar, CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return C4403w.m27874h2(this.f15242O.f15224a.m26097P0(), i3 == 0 ? cVar.f16267a : cVar.f16268b);
        }

        public void m26928o0(int i, TdApi.User user, TdApi.User user2, final C4779t2.C4782c cVar, AbstractC5918j jVar) {
            CharSequence charSequence;
            if (i == this.f15255a0) {
                if (user == null || user2 == null) {
                    charSequence = C4403w.m27984H0(this.f15242O.f15224a.m25982a7(), R.string.TransferOwnershipAlertBot, new Object[0]);
                } else {
                    charSequence = C4403w.m27988G0(this.f15242O.f15224a.m25982a7(), R.string.TransferOwnershipAlertBotName, new C4403w.AbstractC4409f() {
                        @Override
                        public final Object mo379a(CharSequence charSequence2, int i2, int i3, int i4, boolean z) {
                            Object n0;
                            n0 = C4602c4.C4603a.this.m26930n0(cVar, charSequence2, i2, i3, i4, z);
                            return n0;
                        }
                    }, this.f15242O.f15224a.f16099O0.m2480e2().m1721K2(cVar.f16267a), this.f15242O.f15224a.f16099O0.m2480e2().m1721K2(cVar.f16268b));
                }
                jVar.mo1330a(charSequence);
            }
        }

        public void m26926p0(AtomicInteger atomicInteger, final C4779t2.C4782c cVar, final int i, final AbstractC5918j jVar, TdApi.Object object) {
            if (atomicInteger.decrementAndGet() == 0) {
                final TdApi.User v2 = this.f15242O.f15224a.f16099O0.m2480e2().m1583v2(cVar.f16267a);
                final TdApi.User v22 = this.f15242O.f15224a.f16099O0.m2480e2().m1583v2(cVar.f16268b);
                this.f15242O.f15224a.f16099O0.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C4602c4.C4603a.this.m26928o0(i, v2, v22, cVar, jVar);
                    }
                });
            }
        }

        public void m26924q0(TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline) {
            this.f15251X &= -5;
            AbstractC9323v4<?> F = this.f15254a.mo4347s().m14551P1().m9762F();
            if (F instanceof View$OnClickListenerC2971rh) {
                TdApi.Message Z3 = this.f15254a.m25994Z3();
                View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) F;
                long j = Z3.viaBotUserId;
                if (j == 0) {
                    j = C7321e.m16984R0(Z3);
                }
                rhVar.m32341kr(j, inlineKeyboardButtonTypeSwitchInline);
            }
        }

        public void m26922r0(int i, View view, String str, boolean z) {
            this.f15251X &= -5;
            m26995B0(i, view, str, z);
        }

        public boolean m26920s0(View view) {
            m26993C0(view, false);
            return true;
        }

        public void m26918t0(C9357x2.C9370l lVar) {
            this.f15257b0 = lVar;
        }

        public void m26916u0(View view, Rect rect) {
            rect.set(this.f15258c);
        }

        public void m26914v0(View view, Rect rect) {
            rect.set(this.f15258c);
        }

        public HandlerC10770jj.C10788q m26997A0(View view) {
            return m26906z0(this.f15255a0, view);
        }

        public final void m26995B0(int i, View view, String str, boolean z) {
            this.f15242O.f15224a.mo4348c().m2485dd().m3858E7(this.f15242O.f15224a.m26097P0(), str, m26906z0(i, view).m3317n(z));
        }

        public final void m26993C0(final View view, final boolean z) {
            if (!m26961V()) {
                if (this.f15245R) {
                    AbstractC4606b bVar = this.f15269m0;
                    if (bVar != null) {
                        bVar.mo26567a(view, this.f15242O, this);
                    }
                } else if (this.f15241N != null) {
                    if (!this.f15254a.m25882l6() || this.f15241N.getConstructor() == 1130741420) {
                        final int i = this.f15255a0;
                        boolean z2 = true;
                        switch (this.f15241N.getConstructor()) {
                            case TdApi.InlineKeyboardButtonTypeSwitchInline.CONSTRUCTOR:
                                final TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline = (TdApi.InlineKeyboardButtonTypeSwitchInline) this.f15241N;
                                this.f15251X |= 4;
                                C1379j0.m37335e0(new Runnable() {
                                    @Override
                                    public final void run() {
                                        C4602c4.C4603a.this.m26924q0(inlineKeyboardButtonTypeSwitchInline);
                                    }
                                }, 90L);
                                return;
                            case TdApi.InlineKeyboardButtonTypeLoginUrl.CONSTRUCTOR:
                                m26912w0();
                                m26979J0();
                                TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl = (TdApi.InlineKeyboardButtonTypeLoginUrl) this.f15241N;
                                this.f15242O.f15224a.mo4348c().m2270r4().m14783o(new TdApi.GetLoginUrlInfo(this.f15242O.f15224a.m26146K2(), this.f15242O.f15230g, inlineKeyboardButtonTypeLoginUrl.f25381id), m26966Q(i, view, inlineKeyboardButtonTypeLoginUrl, z));
                                return;
                            case TdApi.InlineKeyboardButtonTypeCallback.CONSTRUCTOR:
                                m26912w0();
                                m26979J0();
                                this.f15242O.f15224a.mo4348c().m2270r4().m14783o(new TdApi.GetCallbackQueryAnswer(this.f15254a.m26146K2(), this.f15242O.f15230g, new TdApi.CallbackQueryPayloadData(((TdApi.InlineKeyboardButtonTypeCallback) this.f15241N).data)), m26970O(i, view, false));
                                return;
                            case TdApi.InlineKeyboardButtonTypeCallbackGame.CONSTRUCTOR:
                                if (this.f15254a.m25994Z3().content.getConstructor() == -69441162) {
                                    m26912w0();
                                    m26979J0();
                                    this.f15242O.f15224a.mo4348c().m2270r4().m14783o(new TdApi.GetCallbackQueryAnswer(this.f15254a.m26146K2(), this.f15242O.f15230g, new TdApi.CallbackQueryPayloadGame(((TdApi.MessageGame) this.f15254a.m25994Z3().content).game.shortName)), m26970O(i, view, true));
                                    return;
                                }
                                return;
                            case TdApi.InlineKeyboardButtonTypeCallbackWithPassword.CONSTRUCTOR:
                                TdApi.InlineKeyboardButtonTypeCallbackWithPassword inlineKeyboardButtonTypeCallbackWithPassword = (TdApi.InlineKeyboardButtonTypeCallbackWithPassword) this.f15241N;
                                final byte[] bArr = inlineKeyboardButtonTypeCallbackWithPassword.data;
                                if (!C7321e.m16970Y0(inlineKeyboardButtonTypeCallbackWithPassword) || !this.f15242O.f15224a.mo4348c().m2800J6(this.f15254a.m26146K2())) {
                                    z2 = false;
                                }
                                m26912w0();
                                m26979J0();
                                final AbstractC5918j j3Var = new AbstractC5918j() {
                                    @Override
                                    public final void mo1330a(Object obj) {
                                        C4602c4.C4603a.this.m26932m0(i, bArr, view, (CharSequence) obj);
                                    }
                                };
                                if (z2) {
                                    final C4779t2.C4782c N4 = C4779t2.m25636N4(inlineKeyboardButtonTypeCallbackWithPassword);
                                    if (N4 != null) {
                                        final AtomicInteger atomicInteger = new AtomicInteger(2);
                                        Client.AbstractC7865g n3Var = new Client.AbstractC7865g() {
                                            @Override
                                            public final void mo255t2(TdApi.Object object) {
                                                C4602c4.C4603a.this.m26926p0(atomicInteger, N4, i, j3Var, object);
                                            }
                                        };
                                        this.f15242O.f15224a.f16099O0.m2270r4().m14783o(new TdApi.GetUser(N4.f16267a), n3Var);
                                        this.f15242O.f15224a.f16099O0.m2270r4().m14783o(new TdApi.GetUser(N4.f16268b), n3Var);
                                        return;
                                    }
                                    j3Var.mo1330a(C4403w.m27984H0(this.f15242O.f15224a.m25982a7(), R.string.TransferOwnershipAlertBot, new Object[0]));
                                    return;
                                }
                                j3Var.mo1330a(C4403w.m27984H0(this.f15242O.f15224a.m25982a7(), R.string.TransferOwnershipAlertUnknown, new Object[0]));
                                return;
                            case TdApi.InlineKeyboardButtonTypeUrl.CONSTRUCTOR:
                                final String str = ((TdApi.InlineKeyboardButtonTypeUrl) this.f15241N).url;
                                this.f15251X |= 4;
                                C1379j0.m37335e0(new Runnable() {
                                    @Override
                                    public final void run() {
                                        C4602c4.C4603a.this.m26922r0(i, view, str, z);
                                    }
                                }, 90L);
                                return;
                            case TdApi.InlineKeyboardButtonTypeUser.CONSTRUCTOR:
                                this.f15242O.f15224a.mo4348c().m2485dd().m3429v7(this.f15242O.f15224a, ((TdApi.InlineKeyboardButtonTypeUser) this.f15241N).userId, m26906z0(i, view));
                                return;
                            default:
                                return;
                        }
                    } else {
                        m26977K0(view, R.string.ErrorScheduled);
                    }
                }
            }
        }

        public void m26991D0(View view) {
            if (!m26960W()) {
                m26993C0(view, true);
                m26980J();
            }
        }

        public boolean m26989E0(final View view) {
            AbstractC4606b bVar;
            AbstractC9323v4<?> F;
            int i = this.f15251X;
            if ((i & 2) == 0) {
                return false;
            }
            this.f15251X = i & (-3);
            if (m26961V()) {
                return false;
            }
            m26980J();
            TdApi.InlineKeyboardButtonType inlineKeyboardButtonType = this.f15241N;
            if (inlineKeyboardButtonType != null) {
                int constructor = inlineKeyboardButtonType.getConstructor();
                if (constructor == -1203413081) {
                    AbstractC9323v4<?> F2 = this.f15254a.mo4347s().m14551P1().m9762F();
                    if (F2 == null) {
                        return false;
                    }
                    F2.m9316Wd(((TdApi.InlineKeyboardButtonTypeLoginUrl) this.f15241N).url, m26906z0(this.f15255a0, view), new AbstractC5914f() {
                        @Override
                        public final boolean get() {
                            boolean s0;
                            s0 = C4602c4.C4603a.this.m26920s0(view);
                            return s0;
                        }
                    });
                    return true;
                } else if (constructor != 1130741420 || (F = this.f15254a.mo4347s().m14551P1().m9762F()) == null) {
                    return false;
                } else {
                    F.m9316Wd(((TdApi.InlineKeyboardButtonTypeUrl) this.f15241N).url, m26906z0(this.f15255a0, view), null);
                    return true;
                }
            } else if (!this.f15245R || (bVar = this.f15269m0) == null) {
                return false;
            } else {
                return bVar.mo26564c(view, this.f15242O, this);
            }
        }

        public final void m26988F(float f) {
            if (f == 1.0f) {
                this.f15251X &= -2;
            }
            if (this.f15264h0 == null) {
                C3950k kVar = new C3950k(2, this, C2057b.f7280b, 180L);
                this.f15264h0 = kVar;
                AbstractC4345j jVar = this.f15250W;
                kVar.m29558C(jVar == null || !jVar.mo28227g());
            }
            this.f15251X |= 4;
            this.f15264h0.m29546i(f);
        }

        public void m26987F0(TdApi.InlineKeyboardButton inlineKeyboardButton, int i) {
            this.f15241N = inlineKeyboardButton.type;
            String O0 = m26969O0(C4602c4.m27018g(inlineKeyboardButton.text));
            boolean z = !this.f15240M.m23806e().equals(O0);
            if (z || this.f15240M.m23808c() != i) {
                boolean M0 = RunnableC5390g.m22984M0(O0);
                this.f15243P = M0;
                this.f15240M = new C5147v(m26969O0(O0), i, C1410y.m37030m(M0));
            }
            if (z || !C7321e.m16989P(this.f15241N, inlineKeyboardButton.type)) {
                int i2 = this.f15255a0;
                if (i2 == Integer.MAX_VALUE) {
                    this.f15255a0 = 0;
                } else {
                    this.f15255a0 = i2 + 1;
                }
                C9357x2.C9370l lVar = this.f15257b0;
                if (lVar != null) {
                    lVar.m8915J();
                    this.f15257b0 = null;
                }
            }
            if (z) {
                if (m26961V()) {
                    m26972N();
                }
                m26974M();
            }
        }

        public final void m26986G(float f) {
            if (this.f15266j0 == null) {
                RunnableC6969m2 m2Var = new RunnableC6969m2(this.f15242O.f15224a.mo4347s(), C1357a0.m37544i(3.5f));
                this.f15266j0 = m2Var;
                m2Var.m18291E(this.f15250W);
                m26983H0();
            }
            if (this.f15267k0 == null) {
                C3950k kVar = new C3950k(3, this, C2057b.f7280b, 180L);
                this.f15267k0 = kVar;
                AbstractC4345j jVar = this.f15250W;
                kVar.m29558C(jVar == null || !jVar.mo28227g());
            }
            this.f15267k0.m29546i(f);
        }

        public void m26985G0(AbstractC4606b bVar) {
            this.f15269m0 = bVar;
        }

        public final void m26984H(float f) {
            if (this.f15262f0 == null) {
                C3950k kVar = new C3950k(0, this, C2057b.f7280b, 180L);
                this.f15262f0 = kVar;
                AbstractC4345j jVar = this.f15250W;
                kVar.m29558C(jVar == null || !jVar.mo28227g());
            }
            this.f15262f0.m29546i(f);
        }

        public final void m26983H0() {
            RunnableC6969m2 m2Var = this.f15266j0;
            if (m2Var != null) {
                int i = this.f15258c.right - C1357a0.m37544i(16.0f);
                Rect rect = this.f15258c;
                int i2 = rect.top;
                m2Var.m18274p(i, i2, rect.right, C1357a0.m37544i(16.0f) + i2);
            }
        }

        public final void m26982I() {
            AbstractRunnableC5910b bVar = this.f15268l0;
            if (bVar != null) {
                bVar.m21858c();
                this.f15268l0 = null;
            }
        }

        public void m26981I0(AbstractC4345j jVar) {
            this.f15250W = jVar;
            boolean z = jVar == null;
            C3950k kVar = this.f15264h0;
            if (kVar != null) {
                kVar.m29558C(z);
            }
            C3950k kVar2 = this.f15260d0;
            if (kVar2 != null) {
                kVar2.m29558C(z);
            }
            C3950k kVar3 = this.f15262f0;
            if (kVar3 != null) {
                kVar3.m29558C(z);
            }
            C3950k kVar4 = this.f15267k0;
            if (kVar4 != null) {
                kVar4.m29558C(z);
            }
            RunnableC6969m2 m2Var = this.f15266j0;
            if (m2Var != null) {
                m2Var.m18291E(jVar);
            }
        }

        public final void m26980J() {
            m26988F(1.0f);
        }

        public void m26979J0() {
            m26982I();
            AbstractC4345j jVar = this.f15250W;
            if (jVar == null || !jVar.mo28227g()) {
                m26986G(1.0f);
                return;
            }
            this.f15268l0 = new C4604a();
            C1379j0.m37377A().postDelayed(this.f15268l0, 250L);
        }

        public void m26978K(p291uc.C9552h1 r19, android.graphics.Canvas r20, int r21, int r22, int r23, int r24, int r25, android.graphics.RectF r26, int r27, int r28) {
            throw new UnsupportedOperationException("Method not decompiled: gd.C4602c4.C4603a.m26978K(uc.h1, android.graphics.Canvas, int, int, int, int, int, android.graphics.RectF, int, int):void");
        }

        public void m26977K0(View view, int i) {
            m26975L0(view, C4403w.m27871i1(i));
        }

        public final void m26976L(Canvas canvas, boolean z, float f) {
            int i;
            if (this.f15266j0 != null) {
                if (z) {
                    i = this.f15242O.f15224a.m25996Z1();
                } else {
                    i = C5064d.m24129d(C11524j.m155s0(this.f15242O.f15224a != null && this.f15242O.f15224a.m25919h6()), C11524j.m151u0(), f);
                }
                this.f15266j0.m18286d(C5064d.m24131b((int) (Color.alpha(i) * this.f15265i0), i));
                this.f15266j0.m18287c(canvas);
            }
        }

        public void m26975L0(View view, CharSequence charSequence) {
            m26971N0(view).m8971D(this.f15254a.mo4348c(), charSequence).m8919F();
        }

        public final void m26974M() {
            m26982I();
            C3950k kVar = this.f15267k0;
            if (kVar != null) {
                this.f15265i0 = 0.0f;
                kVar.m29543l(0.0f);
            }
        }

        public final C9357x2.C9365h m26973M0(View view) {
            return this.f15254a.mo4347s().m14584H3().m8984h(view, this.f15254a.f16101P0).m8944y(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C4602c4.C4603a.this.m26918t0((C9357x2.C9370l) obj);
                }
            }).m8948u(new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view2, Rect rect) {
                    C4602c4.C4603a.this.m26916u0(view2, rect);
                }
            });
        }

        public final void m26972N() {
            C3950k kVar = this.f15264h0;
            if (kVar != null) {
                this.f15263g0 = 0.0f;
                kVar.m29543l(0.0f);
                this.f15251X &= -5;
            }
            C3950k kVar2 = this.f15262f0;
            if (kVar2 != null) {
                this.f15261e0 = 0.0f;
                kVar2.m29543l(0.0f);
            }
            C3950k kVar3 = this.f15260d0;
            if (kVar3 != null) {
                this.f15259c0 = 0.0f;
                kVar3.m29543l(0.0f);
                this.f15251X &= -2;
            }
        }

        public C9357x2.C9365h m26971N0(View view) {
            return this.f15254a.mo4347s().m14584H3().m8984h(view, this.f15250W).m8958i(this.f15254a.m26097P0()).m8948u(new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view2, Rect rect) {
                    C4602c4.C4603a.this.m26914v0(view2, rect);
                }
            });
        }

        public final Client.AbstractC7865g m26970O(final int i, final View view, final boolean z) {
            return new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C4602c4.C4603a.this.m26952c0(i, z, view, object);
                }
            };
        }

        public final String m26969O0(String str) {
            return m26967P0() ? str : str.toUpperCase();
        }

        public int m26968P() {
            return this.f15255a0;
        }

        public final boolean m26967P0() {
            return this.f15242O.f15224a.m26069R9() && !this.f15245R;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (i == 0) {
                this.f15261e0 = f;
            } else if (i == 1) {
                this.f15259c0 = f;
            } else if (i == 2) {
                this.f15263g0 = f;
            } else if (i == 3) {
                this.f15265i0 = f;
            }
            m26962U();
        }

        public final Client.AbstractC7865g m26966Q(final int i, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z) {
            return new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C4602c4.C4603a.this.m26938j0(i, view, inlineKeyboardButtonTypeLoginUrl, z, object);
                }
            };
        }

        public final Client.AbstractC7865g m26965R(final int i, final View view, final TdApi.InlineKeyboardButtonTypeLoginUrl inlineKeyboardButtonTypeLoginUrl, final boolean z) {
            return new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C4602c4.C4603a.this.m26934l0(i, view, inlineKeyboardButtonTypeLoginUrl, z, object);
                }
            };
        }

        public float m26964S() {
            return this.f15240M.m23807d();
        }

        public void m26963T() {
            m26982I();
            m26986G(0.0f);
        }

        public final void m26962U() {
            AbstractC4345j jVar = this.f15250W;
            if (jVar != null) {
                jVar.mo28232b(this.f15258c);
            }
        }

        public final boolean m26961V() {
            return (this.f15251X & 1) != 0;
        }

        public final boolean m26960W() {
            return (this.f15251X & 4) != 0;
        }

        @Override
        public Drawable mo14041X(int i, int i2) {
            return C5141s.m23834a(this, i, i2);
        }

        public final boolean m26959Y() {
            return (this.f15251X & 2) != 0;
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            if (i == 2 && f == 1.0f) {
                m26972N();
            }
        }

        @Override
        public final C6038h<Drawable> getSparseDrawableHolder() {
            C6038h<Drawable> hVar = this.f15270n0;
            if (hVar != null) {
                return hVar;
            }
            C6038h<Drawable> hVar2 = new C6038h<>();
            this.f15270n0 = hVar2;
            return hVar2;
        }

        @Override
        public final Resources getSparseDrawableResources() {
            return C1379j0.m37375B();
        }

        public void m26912w0() {
            this.f15251X |= 1;
        }

        public void m26910x0() {
            m26980J();
            m26963T();
        }

        public boolean m26908y0(View view, MotionEvent motionEvent, int i, int i2) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f15251X |= 2;
                this.f15252Y = i;
                this.f15253Z = i2;
                if (!m26961V() && !m26960W()) {
                    m26984H(1.0f);
                }
                return true;
            } else if (action == 1) {
                this.f15252Y = i;
                this.f15253Z = i2;
                if (!m26959Y()) {
                    return false;
                }
                this.f15251X &= -3;
                C2065g.m35722c(view);
                m26991D0(view);
                return true;
            } else if (action != 2) {
                if (action == 3 && m26959Y()) {
                    this.f15251X &= -3;
                    if (!m26961V() && !m26960W()) {
                        m26980J();
                    }
                }
                return true;
            } else {
                this.f15252Y = i;
                this.f15253Z = i2;
                return true;
            }
        }

        public final HandlerC10770jj.C10788q m26906z0(int i, View view) {
            return this.f15254a.m25917h8().m3312s(this.f15255a0 == i ? m26973M0(view) : null);
        }

        public C4603a(C4602c4 c4Var, AbstractC4761s4 s4Var, String str, int i, int i2) {
            this.f15242O = c4Var;
            this.f15254a = s4Var;
            boolean M0 = RunnableC5390g.m22984M0(str);
            this.f15243P = M0;
            this.f15240M = new C5147v(str, i2 - (i != 0 ? (C1357a0.m37544i(24.0f) / 2) + C1357a0.m37544i(2.0f) : 0), C1410y.m37030m(M0));
            this.f15244Q = i;
            this.f15245R = true;
        }
    }
}
