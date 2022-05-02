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
    public boolean f21811M;
    public AbstractC6908f f21812N;
    public List<AbstractC6909g> f21813O;
    public View.OnClickListener f21814P;
    public View.OnLongClickListener f21815Q;
    public AbstractC6905c f21816R;
    public AbstractC6906d f21817S;
    public boolean f21818T;
    public AbstractC6907e f21819U;
    public ViewParent f21820V;
    public boolean f21821W;
    public float f21822a0;
    public final C10930q6 f21823b;
    public long f21824b0;
    public final C4336c f21825c;
    public TdApi.ChatList f21826c0;
    public TdApi.Message[] f21827d0;
    public TdApi.SearchMessagesFilter f21828e0;
    public int f21829f0;
    public C7319d f21830g0;
    public AbstractC9323v4<?> f21831h0;
    public AbstractRunnableC5910b f21832i0;
    public AbstractC9323v4<?> f21833j0;

    public class C6903a extends AbstractRunnableC5910b {
        public final AbstractC9323v4 f21834M;
        public final float f21835N;
        public final float f21836O;

        public C6903a(AbstractC9323v4 v4Var, float f, float f2) {
            this.f21834M = v4Var;
            this.f21835N = f;
            this.f21836O = f2;
        }

        @Override
        public void mo1364b() {
            if (View$OnClickListenerC6902i.this.f21831h0 == this.f21834M) {
                View$OnClickListenerC6902i.this.f21831h0 = null;
                View$OnClickListenerC6902i.this.f21832i0 = null;
                View$OnClickListenerC6902i.this.m18501g0(this.f21834M, this.f21835N, this.f21836O);
            }
        }
    }

    public class C6904b implements C6957m1.AbstractC6962e {
        public final AbstractC9323v4 f21838a;
        public final C7319d f21839b;

        public C6904b(AbstractC9323v4 v4Var, C7319d dVar) {
            this.f21838a = v4Var;
            this.f21839b = dVar;
        }

        public boolean m18488b(C7319d dVar, View view, int i) {
            if (i != R.id.btn_messageUnpin) {
                return true;
            }
            View$OnClickListenerC6902i.this.f21823b.m2270r4().m14783o(new TdApi.UnpinChatMessage(dVar.m17027c(), dVar.m17026d()), View$OnClickListenerC6902i.this.f21823b.m2392ja());
            return true;
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            if (i == R.id.btn_messageUnpin) {
                AbstractC9323v4 v4Var = this.f21838a;
                AbstractC9323v4.C9340p a = new AbstractC9323v4.C9340p.C9341a().m9091d(new AbstractC9323v4.C9338o(R.id.btn_messageUnpin, C4403w.m27871i1(R.string.UnpinMessage), 2, R.drawable.deproko_baseline_pin_undo_24)).m9093b().m9094a();
                final C7319d dVar = this.f21839b;
                v4Var.m9247ge(a, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i2) {
                        boolean b;
                        b = View$OnClickListenerC6902i.C6904b.this.m18488b(dVar, view, i2);
                        return b;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i2) {
                        return C5115g0.m23935b(this, i2);
                    }
                });
            }
        }
    }

    public interface AbstractC6905c {
        C6957m1.AbstractC6962e mo9610I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var);
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
        void mo10014a(View$OnClickListenerC6902i iVar, float f, float f2);
    }

    public View$OnClickListenerC6902i(Context context, C10930q6 q6Var) {
        super(context);
        this.f21823b = q6Var;
        C4336c cVar = new C4336c(this);
        this.f21825c = cVar;
        cVar.m28245h(true);
        setUseDefaultClickListener(true);
    }

    public void m18506T(TdApi.Chat chat, TdApi.MessageThreadInfo messageThreadInfo, float f, float f2) {
        if (this.f21832i0 == null && this.f21831h0 == null) {
            m18502f0(this.f21826c0, chat, new C4737p7(this.f21827d0, messageThreadInfo, false), this.f21828e0, f, f2);
        }
    }

    public void m18505b0(final TdApi.Chat chat, final float f, final float f2, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14719i("Message thread unavailable %d %d: %s", Long.valueOf(this.f21824b0), Long.valueOf(this.f21827d0[0].f25409id), C4779t2.m25379z5(object));
        } else if (constructor == -248536056) {
            final TdApi.MessageThreadInfo messageThreadInfo = (TdApi.MessageThreadInfo) object;
            this.f21823b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC6902i.this.m18506T(chat, messageThreadInfo, f, f2);
                }
            });
        }
    }

    public boolean m18504d0(C3950k kVar, float f, Object obj) {
        return View$OnClickListenerC2971rh.m32487Zn(this.f21823b, getContext(), kVar, f, obj);
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return isEnabled() && !(this.f21815Q == null && m18503e0(f, f2) == 0);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        View.OnClickListener onClickListener;
        if (isEnabled() && (onClickListener = this.f21814P) != null) {
            onClickListener.onClick(view);
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        m18512J();
        m18510L();
    }

    public void m18513G(AbstractC6909g gVar) {
        if (this.f21813O == null) {
            this.f21813O = new ArrayList();
        }
        if (!this.f21813O.contains(gVar)) {
            this.f21813O.add(gVar);
        }
    }

    public final void m18512J() {
        AbstractC9323v4<?> v4Var = this.f21831h0;
        if (v4Var != null) {
            v4Var.mo417Z8();
            this.f21831h0 = null;
        }
        AbstractRunnableC5910b bVar = this.f21832i0;
        if (bVar != null) {
            bVar.m21858c();
            this.f21832i0 = null;
        }
    }

    public final void m18511K() {
        m18494v0(null, 0L, null);
    }

    @Override
    public boolean mo7426K4() {
        return C4868i.m24727c2().m24619p6();
    }

    public final void m18510L() {
        if (this.f21833j0 != null) {
            C1379j0.m37310r(getContext()).m14439t0();
            this.f21833j0 = null;
        }
    }

    public final View$OnClickListenerC2971rh.C2977c0 m18509M(TdApi.ChatList chatList, TdApi.Chat chat, C4737p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter) {
        if (searchMessagesFilter != null) {
            return new View$OnClickListenerC2971rh.C2977c0(chatList, chat, null, null, searchMessagesFilter, this.f21830g0, this.f21829f0);
        }
        int i = this.f21829f0;
        if (i != 0) {
            return new View$OnClickListenerC2971rh.C2977c0(chatList, chat, p7Var, this.f21830g0, i, searchMessagesFilter);
        }
        return new View$OnClickListenerC2971rh.C2977c0(this.f21823b, chatList, chat, p7Var, searchMessagesFilter);
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
        C4335b.m28258f(this, view, f, f2);
    }

    public final int m18503e0(float f, float f2) {
        if (this.f21823b == null || this.f21824b0 == 0 || !C4868i.m24727c2().m24841M2()) {
            AbstractC6906d dVar = this.f21817S;
            return (dVar == null || !dVar.mo6635e2(this, f, f2)) ? 0 : 2;
        } else if (C7316a.m17051j(this.f21824b0)) {
            return 0;
        } else {
            if (this.f21823b.m2723O3(this.f21824b0, 100L) == null) {
                if (!C7316a.m17049l(this.f21824b0)) {
                    return 0;
                }
                this.f21823b.m2270r4().m14783o(new TdApi.CreatePrivateChat(C7316a.m17044q(this.f21824b0), true), this.f21823b.m2214uc());
            }
            return 1;
        }
    }

    public final void m18502f0(TdApi.ChatList chatList, TdApi.Chat chat, C4737p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter, float f, float f2) {
        if (this.f21833j0 == null) {
            m18512J();
            View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(getContext(), this.f21823b);
            rhVar.m32667Lp(m18509M(chatList, chat, p7Var, searchMessagesFilter));
            m18500j0(rhVar, f, f2);
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    public final void m18501g0(AbstractC9323v4<?> v4Var, float f, float f2) {
        C5320c cVar;
        C6957m1.C6963f fVar;
        C5146u0 u0Var;
        C5320c cVar2;
        C6957m1.C6963f fVar2;
        AbstractC9323v4<?> o9 = AbstractC9323v4.m9196o9(this);
        if (o9 == null || this.f21823b == null || o9.mo4348c() == null || o9.mo4348c().m2188w6() == this.f21823b.m2188w6()) {
            C6957m1.C6963f fVar3 = new C6957m1.C6963f(this.f21823b, this, v4Var.get(), v4Var);
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
            AbstractC6905c cVar5 = this.f21816R;
            boolean z2 = true;
            if (cVar5 != null) {
                eVar = cVar5.mo9610I4(this, fVar3, cVar3, cVar4, u0Var2, v4Var);
                u0Var = u0Var2;
                cVar2 = cVar4;
                fVar = fVar3;
                cVar = cVar3;
                z2 = true;
            } else {
                if (z && o9 != null) {
                    if ((getPreviewFilter() instanceof TdApi.SearchMessagesFilterPinned) && getPreviewHighlightMessageId() != null) {
                        C10930q6 q6Var = this.f21823b;
                        if (q6Var.m2916C2(q6Var.m2632U2(this.f21824b0))) {
                            cVar3.m23285a(R.id.btn_messageUnpin);
                            cVar4.m23285a(R.drawable.deproko_baseline_pin_undo_24);
                            u0Var2.m23817a(R.string.Unpin);
                            eVar = new C6904b(o9, getPreviewHighlightMessageId());
                        }
                    }
                    u0Var = u0Var2;
                    cVar2 = cVar4;
                    fVar = fVar3;
                    cVar = cVar3;
                    eVar = o9.mo4348c().m2485dd().m3773N2(o9, getPreviewChatList(), getPreviewChatId(), ((View$OnClickListenerC2971rh) v4Var).m32282pk(), cVar, cVar2, u0Var, (o9 instanceof C2760nb) || (o9 instanceof View$OnClickListenerC2805o4), false, false, null);
                }
                u0Var = u0Var2;
                cVar2 = cVar4;
                fVar = fVar3;
                cVar = cVar3;
            }
            if (eVar != null) {
                fVar2 = fVar;
                fVar.m18337I(eVar, v4Var, cVar.m23281e(), cVar2.m23281e(), u0Var.m23814d());
            } else {
                fVar2 = fVar;
            }
            if (C1379j0.m37310r(getContext()).m14500d2(fVar2)) {
                this.f21833j0 = v4Var;
                this.f21825c.m28249d(this, f, f2);
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
        return this.f21824b0;
    }

    public final TdApi.ChatList getPreviewChatList() {
        return this.f21826c0;
    }

    public final TdApi.SearchMessagesFilter getPreviewFilter() {
        return this.f21828e0;
    }

    public final C7319d getPreviewHighlightMessageId() {
        return this.f21830g0;
    }

    public final TdApi.Message[] getPreviewThreadMessages() {
        return this.f21827d0;
    }

    public final void m18500j0(AbstractC9323v4<?> v4Var, float f, float f2) {
        v4Var.m9453Dd(true);
        if (v4Var.mo9378Ne()) {
            C1379j0.m37310r(getContext()).m14465m1();
        }
        this.f21831h0 = v4Var;
        C6903a aVar = new C6903a(v4Var, f, f2);
        this.f21832i0 = aVar;
        aVar.m21856e(C1379j0.m37316o());
        v4Var.m9114zd(this.f21832i0, 600L);
        v4Var.get();
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return isEnabled() && this.f21814P != null;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            z = this.f21811M && super.onTouchEvent(motionEvent);
            this.f21818T = z;
        } else if (action == 1 || action == 3) {
            z = this.f21818T && super.onTouchEvent(motionEvent);
            this.f21818T = false;
        } else {
            z = this.f21818T && super.onTouchEvent(motionEvent);
        }
        if (isEnabled()) {
            return this.f21825c.m28248e(this, motionEvent) || z;
        }
        return false;
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        m18498s0(false, f, f2);
        m18510L();
    }

    public void m18499q0(AbstractC6909g gVar) {
        List<AbstractC6909g> list = this.f21813O;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public final void m18498s0(boolean z, float f, float f2) {
        if (z) {
            setPressed(false);
            this.f21818T = false;
            this.f21820V = getParent();
            this.f21821W = true;
            this.f21822a0 = f2;
        }
        ViewParent viewParent = this.f21820V;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setCustomControllerProvider(AbstractC6906d dVar) {
        this.f21817S = dVar;
    }

    public void setLongPressInterceptor(AbstractC6907e eVar) {
        this.f21819U = eVar;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21814P = onClickListener;
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21815Q = onLongClickListener;
        this.f21816R = onLongClickListener instanceof AbstractC6905c ? (AbstractC6905c) onLongClickListener : null;
    }

    public final void setPreviewActionListProvider(AbstractC6905c cVar) {
        this.f21816R = cVar;
    }

    public final void setSlideOffListener(AbstractC6908f fVar) {
        this.f21812N = fVar;
    }

    @Override
    public void setTranslationX(float f) {
        List<AbstractC6909g> list = this.f21813O;
        if (list == null || list.isEmpty()) {
            super.setTranslationX(f);
            return;
        }
        float translationX = getTranslationX();
        super.setTranslationX(f);
        if (translationX != f) {
            float translationY = getTranslationY();
            for (AbstractC6909g gVar : this.f21813O) {
                gVar.mo10014a(this, f, translationY);
            }
        }
    }

    @Override
    public void setTranslationY(float f) {
        List<AbstractC6909g> list = this.f21813O;
        if (list == null || list.isEmpty()) {
            super.setTranslationY(f);
            return;
        }
        float translationY = getTranslationY();
        super.setTranslationY(f);
        if (translationY != f) {
            float translationX = getTranslationX();
            for (AbstractC6909g gVar : this.f21813O) {
                gVar.mo10014a(this, translationX, f);
            }
        }
    }

    public final void setUseDefaultClickListener(boolean z) {
        this.f21811M = z;
        super.setOnClickListener(z ? this : null);
    }

    public final void m18494v0(TdApi.ChatList chatList, long j, TdApi.Message[] messageArr) {
        m18493w0(chatList, j, messageArr, null, null);
    }

    public final void m18493w0(TdApi.ChatList chatList, long j, TdApi.Message[] messageArr, C7319d dVar, TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f21826c0 = chatList;
        this.f21824b0 = j;
        this.f21827d0 = messageArr;
        this.f21830g0 = dVar;
        this.f21828e0 = searchMessagesFilter;
        if (dVar != null) {
            this.f21829f0 = 1;
        } else {
            this.f21829f0 = 0;
        }
    }

    public final boolean m18491x0() {
        return this.f21811M;
    }

    @Override
    public boolean mo7415z4(View view, final float f, final float f2) {
        AbstractC9323v4<?> Z3;
        AbstractC6907e eVar = this.f21819U;
        if (eVar != null && eVar.mo18487J1(this, f, f2)) {
            return true;
        }
        int e0 = m18503e0(f, f2);
        boolean z = false;
        if (e0 != 0) {
            if (e0 == 1) {
                final TdApi.Chat U2 = this.f21823b.m2632U2(this.f21824b0);
                if (U2 != null) {
                    if (this.f21827d0 != null) {
                        m18512J();
                        this.f21823b.m2270r4().m14783o(new TdApi.GetMessageThread(this.f21824b0, this.f21827d0[0].f25409id), new Client.AbstractC7865g() {
                            @Override
                            public final void mo255t2(TdApi.Object object) {
                                View$OnClickListenerC6902i.this.m18505b0(U2, f, f2, object);
                            }
                        });
                    } else {
                        m18502f0(this.f21826c0, U2, null, this.f21828e0, f, f2);
                    }
                    return false;
                }
            } else if (e0 == 2) {
                AbstractC6906d dVar = this.f21817S;
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
        View.OnLongClickListener onLongClickListener = this.f21815Q;
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
        if (this.f21821W) {
            AbstractC6906d dVar = this.f21817S;
            if (dVar != null) {
                z = dVar.mo6636d(this, f, f2, this.f21833j0);
            } else {
                AbstractC6908f fVar = this.f21812N;
                z = fVar != null ? fVar.m18486d(this, f, f2, this.f21833j0) : false;
            }
            if (z) {
                this.f21821W = false;
                m18510L();
            }
        }
        if (this.f21833j0 != null) {
            C1379j0.m37310r(getContext()).m14460n2(f, f2, f3, f4);
        }
    }
}
