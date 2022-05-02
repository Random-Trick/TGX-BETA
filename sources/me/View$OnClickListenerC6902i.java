package me;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import be.C1379j0;
import gd.C4737p7;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.List;
import me.C6957m1;
import me.View$OnClickListenerC6902i;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p038ce.C2760nb;
import p038ce.View$OnClickListenerC2805o4;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7316a;
import p193nb.C7319d;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class View$OnClickListenerC6902i extends SparseDrawableView implements C4336c.AbstractC4337a, View.OnClickListener {
    public boolean f21808M;
    public AbstractC6908f f21809N;
    public List<AbstractC6909g> f21810O;
    public View.OnClickListener f21811P;
    public View.OnLongClickListener f21812Q;
    public AbstractC6905c f21813R;
    public AbstractC6906d f21814S;
    public boolean f21815T;
    public AbstractC6907e f21816U;
    public ViewParent f21817V;
    public boolean f21818W;
    public float f21819a0;
    public final C10930q6 f21820b;
    public long f21821b0;
    public final C4336c f21822c;
    public TdApi.ChatList f21823c0;
    public TdApi.Message[] f21824d0;
    public TdApi.SearchMessagesFilter f21825e0;
    public int f21826f0;
    public C7319d f21827g0;
    public AbstractC9323v4<?> f21828h0;
    public AbstractRunnableC5910b f21829i0;
    public AbstractC9323v4<?> f21830j0;

    public class C6903a extends AbstractRunnableC5910b {
        public final AbstractC9323v4 f21831M;
        public final float f21832N;
        public final float f21833O;

        public C6903a(AbstractC9323v4 v4Var, float f, float f2) {
            this.f21831M = v4Var;
            this.f21832N = f;
            this.f21833O = f2;
        }

        @Override
        public void mo1364b() {
            if (View$OnClickListenerC6902i.this.f21828h0 == this.f21831M) {
                View$OnClickListenerC6902i.this.f21828h0 = null;
                View$OnClickListenerC6902i.this.f21829i0 = null;
                View$OnClickListenerC6902i.this.m18501g0(this.f21831M, this.f21832N, this.f21833O);
            }
        }
    }

    public class C6904b implements C6957m1.AbstractC6962e {
        public final AbstractC9323v4 f21835a;
        public final C7319d f21836b;

        public C6904b(AbstractC9323v4 v4Var, C7319d dVar) {
            this.f21835a = v4Var;
            this.f21836b = dVar;
        }

        public boolean m18488b(C7319d dVar, View view, int i) {
            if (i != R.id.btn_messageUnpin) {
                return true;
            }
            View$OnClickListenerC6902i.this.f21820b.m2270r4().m14783o(new TdApi.UnpinChatMessage(dVar.m17027c(), dVar.m17026d()), View$OnClickListenerC6902i.this.f21820b.m2392ja());
            return true;
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            if (i == R.id.btn_messageUnpin) {
                AbstractC9323v4 v4Var = this.f21835a;
                AbstractC9323v4.C9340p a = new AbstractC9323v4.C9340p.C9341a().m9091d(new AbstractC9323v4.C9338o(R.id.btn_messageUnpin, C4403w.m27869i1(R.string.UnpinMessage), 2, R.drawable.deproko_baseline_pin_undo_24)).m9093b().m9094a();
                final C7319d dVar = this.f21836b;
                v4Var.m9247ge(a, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i2) {
                        boolean b;
                        b = View$OnClickListenerC6902i.C6904b.this.m18488b(dVar, view, i2);
                        return b;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i2) {
                        return C5115g0.m23934b(this, i2);
                    }
                });
            }
        }
    }

    public interface AbstractC6905c {
        C6957m1.AbstractC6962e mo9611I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var);
    }

    public interface AbstractC6906d {
        AbstractC9323v4<?> mo6637Z3(View$OnClickListenerC6902i iVar, float f, float f2);

        boolean mo6636d(View$OnClickListenerC6902i iVar, float f, float f2, AbstractC9323v4<?> v4Var);

        boolean mo6635e2(View$OnClickListenerC6902i iVar, float f, float f2);
    }

    public interface AbstractC6907e {
        boolean mo18487J1(View$OnClickListenerC6902i iVar, float f, float f2);
    }

    public interface AbstractC6908f {
        boolean m18486d(View$OnClickListenerC6902i iVar, float f, float f2, AbstractC9323v4<?> v4Var);
    }

    public interface AbstractC6909g {
        void mo10015a(View$OnClickListenerC6902i iVar, float f, float f2);
    }

    public View$OnClickListenerC6902i(Context context, C10930q6 q6Var) {
        super(context);
        this.f21820b = q6Var;
        C4336c cVar = new C4336c(this);
        this.f21822c = cVar;
        cVar.m28243h(true);
        setUseDefaultClickListener(true);
    }

    public void m18506T(TdApi.Chat chat, TdApi.MessageThreadInfo messageThreadInfo, float f, float f2) {
        if (this.f21829i0 == null && this.f21828h0 == null) {
            m18502f0(this.f21823c0, chat, new C4737p7(this.f21824d0, messageThreadInfo, false), this.f21825e0, f, f2);
        }
    }

    public void m18505b0(final TdApi.Chat chat, final float f, final float f2, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14719i("Message thread unavailable %d %d: %s", Long.valueOf(this.f21821b0), Long.valueOf(this.f21824d0[0].f25406id), C4779t2.m25378z5(object));
        } else if (constructor == -248536056) {
            final TdApi.MessageThreadInfo messageThreadInfo = (TdApi.MessageThreadInfo) object;
            this.f21820b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC6902i.this.m18506T(chat, messageThreadInfo, f, f2);
                }
            });
        }
    }

    public boolean m18504d0(C3950k kVar, float f, Object obj) {
        return View$OnClickListenerC2971rh.m32484Zn(this.f21820b, getContext(), kVar, f, obj);
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return isEnabled() && !(this.f21812Q == null && m18503e0(f, f2) == 0);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        View.OnClickListener onClickListener;
        if (isEnabled() && (onClickListener = this.f21811P) != null) {
            onClickListener.onClick(view);
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        m18512J();
        m18510L();
    }

    public void m18513G(AbstractC6909g gVar) {
        if (this.f21810O == null) {
            this.f21810O = new ArrayList();
        }
        if (!this.f21810O.contains(gVar)) {
            this.f21810O.add(gVar);
        }
    }

    public final void m18512J() {
        AbstractC9323v4<?> v4Var = this.f21828h0;
        if (v4Var != null) {
            v4Var.mo417Z8();
            this.f21828h0 = null;
        }
        AbstractRunnableC5910b bVar = this.f21829i0;
        if (bVar != null) {
            bVar.m21857c();
            this.f21829i0 = null;
        }
    }

    public final void m18511K() {
        m18494v0(null, 0L, null);
    }

    @Override
    public boolean mo7426K4() {
        return C4868i.m24726c2().m24618p6();
    }

    public final void m18510L() {
        if (this.f21830j0 != null) {
            C1379j0.m37307r(getContext()).m14440t0();
            this.f21830j0 = null;
        }
    }

    public final View$OnClickListenerC2971rh.C2977c0 m18509M(TdApi.ChatList chatList, TdApi.Chat chat, C4737p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter) {
        if (searchMessagesFilter != null) {
            return new View$OnClickListenerC2971rh.C2977c0(chatList, chat, null, null, searchMessagesFilter, this.f21827g0, this.f21826f0);
        }
        int i = this.f21826f0;
        if (i != 0) {
            return new View$OnClickListenerC2971rh.C2977c0(chatList, chat, p7Var, this.f21827g0, i, searchMessagesFilter);
        }
        return new View$OnClickListenerC2971rh.C2977c0(this.f21820b, chatList, chat, p7Var, searchMessagesFilter);
    }

    public void m18508R(float f, float f2) {
        m18498s0(false, f, f2);
    }

    public final boolean m18507S() {
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
    public boolean mo7425W6(float f, float f2) {
        return m18503e0(f, f2) != 0;
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    public final int m18503e0(float f, float f2) {
        if (this.f21820b == null || this.f21821b0 == 0 || !C4868i.m24726c2().m24840M2()) {
            AbstractC6906d dVar = this.f21814S;
            return (dVar == null || !dVar.mo6635e2(this, f, f2)) ? 0 : 2;
        } else if (C7316a.m17051j(this.f21821b0)) {
            return 0;
        } else {
            if (this.f21820b.m2723O3(this.f21821b0, 100L) == null) {
                if (!C7316a.m17049l(this.f21821b0)) {
                    return 0;
                }
                this.f21820b.m2270r4().m14783o(new TdApi.CreatePrivateChat(C7316a.m17044q(this.f21821b0), true), this.f21820b.m2214uc());
            }
            return 1;
        }
    }

    public final void m18502f0(TdApi.ChatList chatList, TdApi.Chat chat, C4737p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter, float f, float f2) {
        if (this.f21830j0 == null) {
            m18512J();
            View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(getContext(), this.f21820b);
            rhVar.m32664Lp(m18509M(chatList, chat, p7Var, searchMessagesFilter));
            m18500j0(rhVar, f, f2);
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public final void m18501g0(AbstractC9323v4<?> v4Var, float f, float f2) {
        C5320c cVar;
        C6957m1.C6963f fVar;
        C5146u0 u0Var;
        C5320c cVar2;
        C6957m1.C6963f fVar2;
        AbstractC9323v4<?> o9 = AbstractC9323v4.m9196o9(this);
        if (o9 == null || this.f21820b == null || o9.mo4348c() == null || o9.mo4348c().m2188w6() == this.f21820b.m2188w6()) {
            C6957m1.C6963f fVar3 = new C6957m1.C6963f(this.f21820b, this, v4Var.get(), v4Var);
            fVar3.m18331O(v4Var);
            if (v4Var instanceof C6957m1.AbstractC6967j) {
                ((C6957m1.AbstractC6967j) v4Var).mo18296v2(fVar3);
            }
            boolean z = v4Var instanceof View$OnClickListenerC2971rh;
            if (z) {
                fVar3.m18332N(new C6957m1.AbstractC6964g() {
                    @Override
                    public final boolean mo18302a(C3950k kVar, float f3, Object obj) {
                        boolean d0;
                        d0 = View$OnClickListenerC6902i.this.m18504d0(kVar, f3, obj);
                        return d0;
                    }
                });
            }
            C5320c cVar3 = new C5320c(5);
            C5320c cVar4 = new C5320c(5);
            C5146u0 u0Var2 = new C5146u0(5);
            C6957m1.AbstractC6962e eVar = null;
            AbstractC6905c cVar5 = this.f21813R;
            boolean z2 = true;
            if (cVar5 != null) {
                eVar = cVar5.mo9611I4(this, fVar3, cVar3, cVar4, u0Var2, v4Var);
                u0Var = u0Var2;
                cVar2 = cVar4;
                fVar = fVar3;
                cVar = cVar3;
                z2 = true;
            } else {
                if (z && o9 != null) {
                    if ((getPreviewFilter() instanceof TdApi.SearchMessagesFilterPinned) && getPreviewHighlightMessageId() != null) {
                        C10930q6 q6Var = this.f21820b;
                        if (q6Var.m2916C2(q6Var.m2632U2(this.f21821b0))) {
                            cVar3.m23284a(R.id.btn_messageUnpin);
                            cVar4.m23284a(R.drawable.deproko_baseline_pin_undo_24);
                            u0Var2.m23816a(R.string.Unpin);
                            eVar = new C6904b(o9, getPreviewHighlightMessageId());
                        }
                    }
                    u0Var = u0Var2;
                    cVar2 = cVar4;
                    fVar = fVar3;
                    cVar = cVar3;
                    eVar = o9.mo4348c().m2485dd().m3773N2(o9, getPreviewChatList(), getPreviewChatId(), ((View$OnClickListenerC2971rh) v4Var).m32279pk(), cVar, cVar2, u0Var, (o9 instanceof C2760nb) || (o9 instanceof View$OnClickListenerC2805o4), false, false, null);
                }
                u0Var = u0Var2;
                cVar2 = cVar4;
                fVar = fVar3;
                cVar = cVar3;
            }
            if (eVar != null) {
                fVar2 = fVar;
                fVar.m18337I(eVar, v4Var, cVar.m23280e(), cVar2.m23280e(), u0Var.m23813d());
            } else {
                fVar2 = fVar;
            }
            if (C1379j0.m37307r(getContext()).m14501d2(fVar2)) {
                this.f21830j0 = v4Var;
                this.f21822c.m28247d(this, f, f2);
                m18498s0(z2, f, f2);
                return;
            }
            v4Var.mo417Z8();
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public final long getPreviewChatId() {
        return this.f21821b0;
    }

    public final TdApi.ChatList getPreviewChatList() {
        return this.f21823c0;
    }

    public final TdApi.SearchMessagesFilter getPreviewFilter() {
        return this.f21825e0;
    }

    public final C7319d getPreviewHighlightMessageId() {
        return this.f21827g0;
    }

    public final TdApi.Message[] getPreviewThreadMessages() {
        return this.f21824d0;
    }

    public final void m18500j0(AbstractC9323v4<?> v4Var, float f, float f2) {
        v4Var.m9453Dd(true);
        if (v4Var.mo9378Ne()) {
            C1379j0.m37307r(getContext()).m14466m1();
        }
        this.f21828h0 = v4Var;
        C6903a aVar = new C6903a(v4Var, f, f2);
        this.f21829i0 = aVar;
        aVar.m21855e(C1379j0.m37313o());
        v4Var.m9114zd(this.f21829i0, 600L);
        v4Var.get();
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return isEnabled() && this.f21811P != null;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            z = this.f21808M && super.onTouchEvent(motionEvent);
            this.f21815T = z;
        } else if (action == 1 || action == 3) {
            z = this.f21815T && super.onTouchEvent(motionEvent);
            this.f21815T = false;
        } else {
            z = this.f21815T && super.onTouchEvent(motionEvent);
        }
        if (isEnabled()) {
            return this.f21822c.m28246e(this, motionEvent) || z;
        }
        return false;
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        m18498s0(false, f, f2);
        m18510L();
    }

    public void m18499q0(AbstractC6909g gVar) {
        List<AbstractC6909g> list = this.f21810O;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public final void m18498s0(boolean z, float f, float f2) {
        if (z) {
            setPressed(false);
            this.f21815T = false;
            this.f21817V = getParent();
            this.f21818W = true;
            this.f21819a0 = f2;
        }
        ViewParent viewParent = this.f21817V;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setCustomControllerProvider(AbstractC6906d dVar) {
        this.f21814S = dVar;
    }

    public void setLongPressInterceptor(AbstractC6907e eVar) {
        this.f21816U = eVar;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21811P = onClickListener;
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21812Q = onLongClickListener;
        this.f21813R = onLongClickListener instanceof AbstractC6905c ? (AbstractC6905c) onLongClickListener : null;
    }

    public final void setPreviewActionListProvider(AbstractC6905c cVar) {
        this.f21813R = cVar;
    }

    public final void setSlideOffListener(AbstractC6908f fVar) {
        this.f21809N = fVar;
    }

    @Override
    public void setTranslationX(float f) {
        List<AbstractC6909g> list = this.f21810O;
        if (list == null || list.isEmpty()) {
            super.setTranslationX(f);
            return;
        }
        float translationX = getTranslationX();
        super.setTranslationX(f);
        if (translationX != f) {
            float translationY = getTranslationY();
            for (AbstractC6909g gVar : this.f21810O) {
                gVar.mo10015a(this, f, translationY);
            }
        }
    }

    @Override
    public void setTranslationY(float f) {
        List<AbstractC6909g> list = this.f21810O;
        if (list == null || list.isEmpty()) {
            super.setTranslationY(f);
            return;
        }
        float translationY = getTranslationY();
        super.setTranslationY(f);
        if (translationY != f) {
            float translationX = getTranslationX();
            for (AbstractC6909g gVar : this.f21810O) {
                gVar.mo10015a(this, translationX, f);
            }
        }
    }

    public final void setUseDefaultClickListener(boolean z) {
        this.f21808M = z;
        super.setOnClickListener(z ? this : null);
    }

    public final void m18494v0(TdApi.ChatList chatList, long j, TdApi.Message[] messageArr) {
        m18493w0(chatList, j, messageArr, null, null);
    }

    public final void m18493w0(TdApi.ChatList chatList, long j, TdApi.Message[] messageArr, C7319d dVar, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f21823c0 = chatList;
        this.f21821b0 = j;
        this.f21824d0 = messageArr;
        this.f21827g0 = dVar;
        this.f21825e0 = searchMessagesFilter;
        if (dVar != null) {
            this.f21826f0 = 1;
        } else {
            this.f21826f0 = 0;
        }
    }

    public final boolean m18491x0() {
        return this.f21808M;
    }

    @Override
    public boolean mo7415z4(View view, final float f, final float f2) {
        AbstractC9323v4<?> Z3;
        AbstractC6907e eVar = this.f21816U;
        if (eVar != null && eVar.mo18487J1(this, f, f2)) {
            return true;
        }
        int e0 = m18503e0(f, f2);
        boolean z = false;
        if (e0 != 0) {
            if (e0 == 1) {
                final TdApi.Chat U2 = this.f21820b.m2632U2(this.f21821b0);
                if (U2 != null) {
                    if (this.f21824d0 != null) {
                        m18512J();
                        this.f21820b.m2270r4().m14783o(new TdApi.GetMessageThread(this.f21821b0, this.f21824d0[0].f25406id), new Client.AbstractC7865g() {
                            @Override
                            public final void mo255t2(TdApi.Object object) {
                                View$OnClickListenerC6902i.this.m18505b0(U2, f, f2, object);
                            }
                        });
                    } else {
                        m18502f0(this.f21823c0, U2, null, this.f21825e0, f, f2);
                    }
                    return false;
                }
            } else if (e0 == 2) {
                AbstractC6906d dVar = this.f21814S;
                if (!(dVar == null || (Z3 = dVar.mo6637Z3(this, f, f2)) == null)) {
                    if (Z3.mo9270dc()) {
                        m18500j0(Z3, f, f2);
                    } else {
                        m18501g0(Z3, f, f2);
                    }
                }
                return false;
            }
        }
        View.OnLongClickListener onLongClickListener = this.f21812Q;
        if (onLongClickListener != null && onLongClickListener.onLongClick(view)) {
            z = true;
        }
        if (z) {
            m18498s0(true, f, f2);
        }
        return z;
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        boolean z;
        if (this.f21818W) {
            AbstractC6906d dVar = this.f21814S;
            if (dVar != null) {
                z = dVar.mo6636d(this, f, f2, this.f21830j0);
            } else {
                AbstractC6908f fVar = this.f21809N;
                z = fVar != null ? fVar.m18486d(this, f, f2, this.f21830j0) : false;
            }
            if (z) {
                this.f21818W = false;
                m18510L();
            }
        }
        if (this.f21830j0 != null) {
            C1379j0.m37307r(getContext()).m14461n2(f, f2, f3, f4);
        }
    }
}
