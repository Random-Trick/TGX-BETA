package ne;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import ce.j0;
import de.nb;
import de.o4;
import de.rh;
import eb.k;
import gb.c;
import gd.w;
import hd.p7;
import hd.t2;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.List;
import ne.i;
import ne.m1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import ud.v4;
import zd.o6;

public class i extends SparseDrawableView implements c.a, View.OnClickListener {
    public boolean M;
    public f N;
    public List<g> O;
    public View.OnClickListener P;
    public View.OnLongClickListener Q;
    public c R;
    public d S;
    public boolean T;
    public e U;
    public ViewParent V;
    public boolean W;
    public float f18084a0;
    public final o6 f18085b;
    public long f18086b0;
    public final gb.c f18087c;
    public TdApi.ChatList f18088c0;
    public TdApi.Message[] f18089d0;
    public TdApi.SearchMessagesFilter f18090e0;
    public int f18091f0;
    public ob.d f18092g0;
    public v4<?> f18093h0;
    public kb.b f18094i0;
    public v4<?> f18095j0;

    public class a extends kb.b {
        public final v4 M;
        public final float N;
        public final float O;

        public a(v4 v4Var, float f10, float f11) {
            this.M = v4Var;
            this.N = f10;
            this.O = f11;
        }

        @Override
        public void b() {
            if (i.this.f18093h0 == this.M) {
                i.this.f18093h0 = null;
                i.this.f18094i0 = null;
                i.this.n0(this.M, this.N, this.O);
            }
        }
    }

    public class b implements m1.e {
        public final v4 f18096a;
        public final ob.d f18097b;

        public b(v4 v4Var, ob.d dVar) {
            this.f18096a = v4Var;
            this.f18097b = dVar;
        }

        public boolean b(ob.d dVar, View view, int i10) {
            if (i10 != R.id.btn_messageUnpin) {
                return true;
            }
            i.this.f18085b.v4().o(new TdApi.UnpinChatMessage(dVar.c(), dVar.d()), i.this.f18085b.na());
            return true;
        }

        @Override
        public void a7(m1.f fVar, int i10, Object obj) {
        }

        @Override
        public void t2(m1.f fVar, int i10, Object obj) {
            if (i10 == R.id.btn_messageUnpin) {
                v4 v4Var = this.f18096a;
                v4.p a10 = new v4.p.a().d(new v4.o(R.id.btn_messageUnpin, w.i1(R.string.UnpinMessage), 2, R.drawable.deproko_baseline_pin_undo_24)).b().a();
                final ob.d dVar = this.f18097b;
                v4Var.ge(a10, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i11) {
                        return g0.b(this, i11);
                    }

                    @Override
                    public final boolean r3(View view, int i11) {
                        boolean b10;
                        b10 = i.b.this.b(dVar, view, i11);
                        return b10;
                    }
                });
            }
        }
    }

    public interface c {
        m1.e r6(View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4<?> v4Var);
    }

    public interface d {
        v4<?> c7(i iVar, float f10, float f11);

        boolean f(i iVar, float f10, float f11, v4<?> v4Var);

        boolean i0(i iVar, float f10, float f11);
    }

    public interface e {
        boolean L4(i iVar, float f10, float f11);
    }

    public interface f {
        boolean f(i iVar, float f10, float f11, v4<?> v4Var);
    }

    public interface g {
        void a(i iVar, float f10, float f11);
    }

    public i(Context context, o6 o6Var) {
        super(context);
        this.f18085b = o6Var;
        gb.c cVar = new gb.c(this);
        this.f18087c = cVar;
        cVar.h(true);
        setUseDefaultClickListener(true);
    }

    public void U(TdApi.Chat chat, TdApi.MessageThreadInfo messageThreadInfo, float f10, float f11) {
        if (this.f18094i0 == null && this.f18093h0 == null) {
            h0(this.f18088c0, chat, new p7(this.f18089d0, messageThreadInfo, false), this.f18090e0, f10, f11);
        }
    }

    public void c0(final TdApi.Chat chat, final float f10, final float f11, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.i("Message thread unavailable %d %d: %s", Long.valueOf(this.f18086b0), Long.valueOf(this.f18089d0[0].f19946id), t2.z5(object));
        } else if (constructor == -248536056) {
            final TdApi.MessageThreadInfo messageThreadInfo = (TdApi.MessageThreadInfo) object;
            this.f18085b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    i.this.U(chat, messageThreadInfo, f10, f11);
                }
            });
        }
    }

    public boolean d0(k kVar, float f10, Object obj) {
        return rh.Zn(this.f18085b, getContext(), kVar, f10, obj);
    }

    @Override
    public boolean B(float f10, float f11) {
        return isEnabled() && !(this.Q == null && g0(f10, f11) == 0);
    }

    public final boolean B0() {
        return this.M;
    }

    @Override
    public void C(View view, float f10, float f11) {
        View.OnClickListener onClickListener;
        if (isEnabled() && (onClickListener = this.P) != null) {
            onClickListener.onClick(view);
        }
    }

    @Override
    public boolean E4() {
        return he.i.c2().p6();
    }

    @Override
    public void G(View view, float f10, float f11) {
        K();
        M();
    }

    public void J(g gVar) {
        if (this.O == null) {
            this.O = new ArrayList();
        }
        if (!this.O.contains(gVar)) {
            this.O.add(gVar);
        }
    }

    public final void K() {
        v4<?> v4Var = this.f18093h0;
        if (v4Var != null) {
            v4Var.Z8();
            this.f18093h0 = null;
        }
        kb.b bVar = this.f18094i0;
        if (bVar != null) {
            bVar.c();
            this.f18094i0 = null;
        }
    }

    public final void L() {
        w0(null, 0L, null);
    }

    public final void M() {
        if (this.f18095j0 != null) {
            j0.r(getContext()).w0();
            this.f18095j0 = null;
        }
    }

    public final rh.c0 N(TdApi.ChatList chatList, TdApi.Chat chat, p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter) {
        if (searchMessagesFilter != null) {
            return new rh.c0(chatList, chat, null, null, searchMessagesFilter, this.f18092g0, this.f18091f0);
        }
        int i10 = this.f18091f0;
        if (i10 != 0) {
            return new rh.c0(chatList, chat, p7Var, this.f18092g0, i10, searchMessagesFilter);
        }
        return new rh.c0(this.f18085b, chatList, chat, p7Var, searchMessagesFilter);
    }

    public void S(float f10, float f11) {
        v0(false, f10, f11);
    }

    public final boolean T() {
        ViewParent parent = getParent();
        if (parent == null) {
            return false;
        }
        View view = (View) parent;
        ViewParent parent2 = (view.getAlpha() <= 0.0f || view.getVisibility() != 0) ? null : parent.getParent();
        if (parent2 == null) {
            return false;
        }
        View view2 = (View) parent2;
        return view2.getAlpha() > 0.0f && view2.getVisibility() == 0;
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return g0(f10, f11) != 0;
    }

    public final int g0(float f10, float f11) {
        if (this.f18085b == null || this.f18086b0 == 0 || !he.i.c2().M2()) {
            d dVar = this.S;
            return (dVar == null || !dVar.i0(this, f10, f11)) ? 0 : 2;
        } else if (ob.a.j(this.f18086b0)) {
            return 0;
        } else {
            if (this.f18085b.S3(this.f18086b0, 100L) == null) {
                if (!ob.a.l(this.f18086b0)) {
                    return 0;
                }
                this.f18085b.v4().o(new TdApi.CreatePrivateChat(ob.a.q(this.f18086b0), true), this.f18085b.yc());
            }
            return 1;
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public final long getPreviewChatId() {
        return this.f18086b0;
    }

    public final TdApi.ChatList getPreviewChatList() {
        return this.f18088c0;
    }

    public final TdApi.SearchMessagesFilter getPreviewFilter() {
        return this.f18090e0;
    }

    public final ob.d getPreviewHighlightMessageId() {
        return this.f18092g0;
    }

    public final TdApi.Message[] getPreviewThreadMessages() {
        return this.f18089d0;
    }

    public final void h0(TdApi.ChatList chatList, TdApi.Chat chat, p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter, float f10, float f11) {
        if (this.f18095j0 == null) {
            K();
            rh rhVar = new rh(getContext(), this.f18085b);
            rhVar.Lp(N(chatList, chat, p7Var, searchMessagesFilter));
            p0(rhVar, f10, f11);
        }
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return isEnabled() && this.P != null;
    }

    public final void n0(v4<?> v4Var, float f10, float f11) {
        jb.c cVar;
        m1.f fVar;
        u0 u0Var;
        jb.c cVar2;
        m1.f fVar2;
        v4<?> o92 = v4.o9(this);
        if (o92 == null || this.f18085b == null || o92.c() == null || o92.c().A6() == this.f18085b.A6()) {
            m1.f fVar3 = new m1.f(this.f18085b, this, v4Var.get(), v4Var);
            fVar3.O(v4Var);
            if (v4Var instanceof m1.j) {
                ((m1.j) v4Var).W4(fVar3);
            }
            boolean z10 = v4Var instanceof rh;
            if (z10) {
                fVar3.N(new m1.g() {
                    @Override
                    public final boolean a(k kVar, float f12, Object obj) {
                        boolean d02;
                        d02 = i.this.d0(kVar, f12, obj);
                        return d02;
                    }
                });
            }
            jb.c cVar3 = new jb.c(5);
            jb.c cVar4 = new jb.c(5);
            u0 u0Var2 = new u0(5);
            m1.e eVar = null;
            c cVar5 = this.R;
            boolean z11 = true;
            if (cVar5 != null) {
                eVar = cVar5.r6(this, fVar3, cVar3, cVar4, u0Var2, v4Var);
                u0Var = u0Var2;
                cVar2 = cVar4;
                fVar = fVar3;
                cVar = cVar3;
                z11 = true;
            } else {
                if (z10 && o92 != null) {
                    if ((getPreviewFilter() instanceof TdApi.SearchMessagesFilterPinned) && getPreviewHighlightMessageId() != null) {
                        o6 o6Var = this.f18085b;
                        if (o6Var.E2(o6Var.W2(this.f18086b0))) {
                            cVar3.a(R.id.btn_messageUnpin);
                            cVar4.a(R.drawable.deproko_baseline_pin_undo_24);
                            u0Var2.a(R.string.Unpin);
                            eVar = new b(o92, getPreviewHighlightMessageId());
                        }
                    }
                    u0Var = u0Var2;
                    cVar2 = cVar4;
                    fVar = fVar3;
                    cVar = cVar3;
                    eVar = o92.c().hd().N2(o92, getPreviewChatList(), getPreviewChatId(), ((rh) v4Var).pk(), cVar, cVar2, u0Var, (o92 instanceof nb) || (o92 instanceof o4), false, false, null);
                }
                u0Var = u0Var2;
                cVar2 = cVar4;
                fVar = fVar3;
                cVar = cVar3;
            }
            if (eVar != null) {
                fVar2 = fVar;
                fVar.I(eVar, v4Var, cVar.e(), cVar2.e(), u0Var.d());
            } else {
                fVar2 = fVar;
            }
            if (j0.r(getContext()).f2(fVar2)) {
                this.f18095j0 = v4Var;
                this.f18087c.d(this, f10, f11);
                v0(z11, f10, f11);
                return;
            }
            v4Var.Z8();
        }
    }

    @Override
    public void o(View view, float f10, float f11) {
        v0(false, f10, f11);
        M();
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 0) {
            z10 = this.M && super.onTouchEvent(motionEvent);
            this.T = z10;
        } else if (action == 1 || action == 3) {
            z10 = this.T && super.onTouchEvent(motionEvent);
            this.T = false;
        } else {
            z10 = this.T && super.onTouchEvent(motionEvent);
        }
        if (isEnabled()) {
            return this.f18087c.e(this, motionEvent) || z10;
        }
        return false;
    }

    public final void p0(v4<?> v4Var, float f10, float f11) {
        v4Var.Dd(true);
        if (v4Var.Ne()) {
            j0.r(getContext()).n1();
        }
        this.f18093h0 = v4Var;
        a aVar = new a(v4Var, f10, f11);
        this.f18094i0 = aVar;
        aVar.e(j0.o());
        v4Var.zd(this.f18094i0, 600L);
        v4Var.get();
    }

    public void q0(g gVar) {
        List<g> list = this.O;
        if (list != null) {
            list.remove(gVar);
        }
    }

    @Override
    public boolean s4(View view, final float f10, final float f11) {
        v4<?> c72;
        e eVar = this.U;
        if (eVar != null && eVar.L4(this, f10, f11)) {
            return true;
        }
        int g02 = g0(f10, f11);
        boolean z10 = false;
        if (g02 != 0) {
            if (g02 == 1) {
                final TdApi.Chat W2 = this.f18085b.W2(this.f18086b0);
                if (W2 != null) {
                    if (this.f18089d0 != null) {
                        K();
                        this.f18085b.v4().o(new TdApi.GetMessageThread(this.f18086b0, this.f18089d0[0].f19946id), new Client.g() {
                            @Override
                            public final void r2(TdApi.Object object) {
                                i.this.c0(W2, f10, f11, object);
                            }
                        });
                    } else {
                        h0(this.f18088c0, W2, null, this.f18090e0, f10, f11);
                    }
                    return false;
                }
            } else if (g02 == 2) {
                d dVar = this.S;
                if (!(dVar == null || (c72 = dVar.c7(this, f10, f11)) == null)) {
                    if (c72.dc()) {
                        p0(c72, f10, f11);
                    } else {
                        n0(c72, f10, f11);
                    }
                }
                return false;
            }
        }
        View.OnLongClickListener onLongClickListener = this.Q;
        if (onLongClickListener != null && onLongClickListener.onLongClick(view)) {
            z10 = true;
        }
        if (z10) {
            v0(true, f10, f11);
        }
        return z10;
    }

    public void setCustomControllerProvider(d dVar) {
        this.S = dVar;
    }

    public void setLongPressInterceptor(e eVar) {
        this.U = eVar;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.Q = onLongClickListener;
        this.R = onLongClickListener instanceof c ? (c) onLongClickListener : null;
    }

    public final void setPreviewActionListProvider(c cVar) {
        this.R = cVar;
    }

    public final void setSlideOffListener(f fVar) {
        this.N = fVar;
    }

    @Override
    public void setTranslationX(float f10) {
        List<g> list = this.O;
        if (list == null || list.isEmpty()) {
            super.setTranslationX(f10);
            return;
        }
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        if (translationX != f10) {
            float translationY = getTranslationY();
            for (g gVar : this.O) {
                gVar.a(this, f10, translationY);
            }
        }
    }

    @Override
    public void setTranslationY(float f10) {
        List<g> list = this.O;
        if (list == null || list.isEmpty()) {
            super.setTranslationY(f10);
            return;
        }
        float translationY = getTranslationY();
        super.setTranslationY(f10);
        if (translationY != f10) {
            float translationX = getTranslationX();
            for (g gVar : this.O) {
                gVar.a(this, translationX, f10);
            }
        }
    }

    public final void setUseDefaultClickListener(boolean z10) {
        this.M = z10;
        super.setOnClickListener(z10 ? this : null);
    }

    public final void v0(boolean z10, float f10, float f11) {
        if (z10) {
            setPressed(false);
            this.T = false;
            this.V = getParent();
            this.W = true;
            this.f18084a0 = f11;
        }
        ViewParent viewParent = this.V;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void w0(TdApi.ChatList chatList, long j10, TdApi.Message[] messageArr) {
        y0(chatList, j10, messageArr, null, null);
    }

    public final void y0(TdApi.ChatList chatList, long j10, TdApi.Message[] messageArr, ob.d dVar, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f18088c0 = chatList;
        this.f18086b0 = j10;
        this.f18089d0 = messageArr;
        this.f18092g0 = dVar;
        this.f18090e0 = searchMessagesFilter;
        if (dVar != null) {
            this.f18091f0 = 1;
        } else {
            this.f18091f0 = 0;
        }
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        boolean z10;
        if (this.W) {
            d dVar = this.S;
            if (dVar != null) {
                z10 = dVar.f(this, f10, f11, this.f18095j0);
            } else {
                f fVar = this.N;
                z10 = fVar != null ? fVar.f(this, f10, f11, this.f18095j0) : false;
            }
            if (z10) {
                this.W = false;
                M();
            }
        }
        if (this.f18095j0 != null) {
            j0.r(getContext()).o2(f10, f11, f12, f13);
        }
    }
}
