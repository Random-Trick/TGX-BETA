package p038ce;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.GridLayoutManager;
import be.C1357a0;
import be.C1379j0;
import gd.C4587b;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.C6957m1;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.MediaRecyclerView;
import org.thunderdog.challegram.p211v.RtlGridLayoutManager;
import p038ce.x00;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p111he.C5146u0;
import p124ib.C5320c;
import p194nd.AbstractC7459k1;
import p194nd.C7462l1;
import p194nd.RunnableC7470o;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8112b;
import p225pd.C8113c;
import p253rc.AbstractC8424a;
import p350yd.C10712hc;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import sc.C8743e;
import td.C9239m;
import td.View$OnClickListenerC9170d1;

public class q10 extends i10<C8112b> implements AbstractC8424a, AbstractC7459k1, C4336c.AbstractC4337a, C6957m1.AbstractC6962e {
    public C8743e f9694G0;
    public int f9695H0;
    public TdApi.SearchMessagesFilter f9696I0;
    public int f9698K0;
    public int f9699L0;
    public int f9697J0 = -1;
    public C7462l1 f9700M0 = new C7462l1();

    public class C2904a extends GridLayoutManager.AbstractC0873b {
        public final C2546iq f9701e;

        public C2904a(C2546iq iqVar) {
            this.f9701e = iqVar;
        }

        @Override
        public int mo7528f(int i) {
            int size = this.f9701e.m34240F0().size();
            if (i < 0 || i >= size || this.f9701e.m34240F0().get(i).m32876A() != 40) {
                return q10.this.f9695H0;
            }
            return 1;
        }
    }

    public q10(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m33055Rg(int i, int i2) {
        int min = Math.min(i, i2) / 3;
        if (C1379j0.m37351Q() || min == 0) {
            return 3;
        }
        if (i > i2) {
            return Math.max(5, i / min);
        }
        return i / min;
    }

    public void m33054Sg(MediaRecyclerView mediaRecyclerView, int i, int i2) {
        int Rg = m33055Rg(i, i2);
        if (this.f9695H0 != Rg) {
            this.f9695H0 = Rg;
            this.f9694G0.m11612n(Rg);
            mediaRecyclerView.m39504A0();
            ((GridLayoutManager) mediaRecyclerView.getLayoutManager()).m39586d3(this.f9695H0);
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return true;
    }

    @Override
    public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar != null && raVar.m32876A() == 40) {
            if (this.f8589t0.m34195Z0()) {
                m34392Mg(raVar);
                return;
            }
            C8112b bVar = (C8112b) raVar.m32844d();
            if (bVar.m13492n0()) {
                if (bVar.m13508f0()) {
                    View$OnClickListenerC7430j1.m16205ik(this, bVar);
                } else if (!bVar.m13478u0(view, f, f2)) {
                    View$OnClickListenerC7430j1.m16205ik(this, bVar);
                }
            } else if (bVar.m13524X() != 8) {
                View$OnClickListenerC7430j1.m16205ik(this, bVar);
            } else if (bVar.m13508f0()) {
                this.f30167b.m2930B4().m4636w2().m7105H0(this.f30167b, bVar.getMessage(), null);
            } else {
                bVar.m13480t0(view);
            }
        }
    }

    @Override
    public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
        switch (i) {
            case R.id.btn_messageDelete:
                this.f30167b.m2485dd();
                HandlerC10770jj.m3428v8(this, ((C8112b) ((C2964ra) obj).m32844d()).getMessage());
                return;
            case R.id.btn_messageSelect:
                m34392Mg((C2964ra) obj);
                return;
            case R.id.btn_messageShare:
                x00 x00Var = new x00(this.f30165a, this.f30167b);
                x00Var.m30994Vi(new x00.C3281m(((C8112b) ((C2964ra) obj).m32844d()).getMessage()).m30888A(true));
                x00Var.m30960ej();
                return;
            case R.id.btn_showInChat:
                TdApi.Message message = ((C8112b) ((C2964ra) obj).m32844d()).getMessage();
                this.f30167b.m2485dd().m3569h7(this, message.chatId, new HandlerC10770jj.C10780j().m3370f(message).m3363m());
                return;
            default:
                return;
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    @Override
    public void mo9808F2(int i, C8112b bVar, boolean z) {
    }

    @Override
    public int mo33060Hf() {
        return this.f9695H0;
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        MediaRecyclerView mediaRecyclerView = this.f8588s0;
        if (mediaRecyclerView != null) {
            mediaRecyclerView.m39504A0();
        }
    }

    @Override
    public boolean mo7426K4() {
        return C4868i.m24726c2().m24618p6();
    }

    @Override
    public boolean mo33059Kg() {
        return false;
    }

    @Override
    public boolean mo33058Lg() {
        return true;
    }

    @Override
    public C8113c mo9832R4(long j, TdApi.SearchMessagesFilter searchMessagesFilter) {
        ArrayList<T> arrayList = this.f8577A0;
        if (arrayList == 0 || arrayList.isEmpty()) {
            return null;
        }
        int i = 0;
        Iterator it = this.f8577A0.iterator();
        ArrayList<C8112b> arrayList2 = null;
        int i2 = -1;
        while (it.hasNext()) {
            C8112b k = C8112b.m13499k((C8112b) it.next());
            if (k != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                if (i2 == -1 && k.mo13513d() == j) {
                    i2 = i;
                }
                arrayList2.add(k);
                i++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        C8113c cVar = new C8113c(this.f30165a, this.f30167b);
        cVar.m13448t(i2, arrayList2);
        return cVar;
    }

    public C8112b mo33044rg(TdApi.Object object) {
        TdApi.Message message = (TdApi.Message) object;
        int i = message.ttl;
        if (i > 0 && i <= 60) {
            return null;
        }
        C8112b V0 = C8112b.m13527V0(mo4347s(), this.f30167b, message);
        if (V0 != null) {
            if (V0.m13492n0()) {
                V0.m13473x().m18612o0(true);
                V0.m13473x().m18665J0(true);
            }
            V0.m13553I0(2);
            V0.m13547L0(C1357a0.m37540j(124.0f, 3.0f));
            V0.m13563D0(true);
        }
        return V0;
    }

    public q10 m33052Ug(TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.f9696I0 = searchMessagesFilter;
        return this;
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return !this.f8589t0.m34195Z0();
    }

    @Override
    public CharSequence mo9313X9() {
        switch (mo33042wg().getConstructor()) {
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabGifs);
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabVideo);
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                return C4403w.m27869i1(C4868i.m24726c2().m24784U2() ? R.string.TabVideoMessagesLong : R.string.TabVideoMessages);
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabPhoto);
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                return C4403w.m27869i1(R.string.TabMedia);
            default:
                return "";
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    @Override
    public long getLongPressDuration() {
        if (this.f8589t0.m34195Z0()) {
            return ViewConfiguration.getLongPressTimeout();
        }
        return 250L;
    }

    @Override
    public CharSequence mo33051if(ArrayList<C8112b> arrayList) {
        int i;
        int i2;
        switch (mo33042wg().getConstructor()) {
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xGIFs, arrayList.size());
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xVideos, arrayList.size());
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xVideoMessages, arrayList.size());
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                return C4403w.m27836q2(R.string.xPhotos, arrayList.size());
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                if (this.f9697J0 != arrayList.size()) {
                    Iterator<C8112b> it = arrayList.iterator();
                    i2 = 0;
                    i = 0;
                    while (it.hasNext()) {
                        if (it.next().m13492n0()) {
                            i++;
                        } else {
                            i2++;
                        }
                    }
                    this.f9698K0 = i2;
                    this.f9699L0 = i;
                    this.f9697J0 = arrayList.size();
                } else {
                    i2 = this.f9698K0;
                    i = this.f9699L0;
                }
                return C4403w.m27804y2(i2, i);
            default:
                throw new IllegalStateException("unsupported filter " + mo33042wg());
        }
    }

    @Override
    public int mo33050jf() {
        return C1357a0.m37548b(C1357a0.m37551D() / Math.max(5, C1357a0.m37551D() / (C1357a0.m37553B() / 3)), 18);
    }

    @Override
    public boolean mo33049jg() {
        return true;
    }

    @Override
    public boolean mo33048lg() {
        return false;
    }

    @Override
    public int mo33047mf(int i) {
        int i2;
        int i3 = 0;
        if (i == 0 || this.f8588s0 == null) {
            return 0;
        }
        List<C2964ra> F0 = this.f8589t0.m34240F0();
        int size = F0.size();
        int i4 = 0;
        while (i3 < i && i3 < size) {
            C2964ra raVar = F0.get(i3);
            int A = raVar.m32876A();
            if (A == 3) {
                i2 = C1357a0.m37541i(3.0f) + C2139ap.m35479W(3);
            } else if (A == 40) {
                int measuredWidth = this.f8588s0.getMeasuredWidth() / this.f9695H0;
                int i5 = C1357a0.m37541i(3.0f);
                int i6 = this.f9695H0 - 1;
                while (true) {
                    if (i6 <= 0 || i3 >= i || i3 >= size) {
                        break;
                    }
                    int i7 = i3 + 1;
                    C2964ra raVar2 = F0.get(i7);
                    if (raVar2.m32876A() != 40) {
                        raVar = raVar2;
                        break;
                    }
                    i6--;
                    i3 = i7;
                    raVar = raVar2;
                }
                i4 += measuredWidth;
                if (raVar.m32876A() == 40) {
                    i4 -= i5;
                }
                i3++;
            } else if (A == 43 || A == 44) {
                i2 = m34353fg(raVar.m32876A());
            } else {
                i2 = C2139ap.m35479W(raVar.m32876A());
            }
            i4 += i2;
            i3++;
        }
        return i4;
    }

    @Override
    public boolean mo33046mg() {
        return false;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return true;
    }

    @Override
    public void mo33045ng(Context context, MediaRecyclerView mediaRecyclerView, C2546iq iqVar) {
        mediaRecyclerView.setMeasureCallback(new MediaRecyclerView.AbstractC7925b() {
            @Override
            public final void mo14148a(MediaRecyclerView mediaRecyclerView2, int i, int i2) {
                q10.this.m33054Sg(mediaRecyclerView2, i, i2);
            }
        });
        iqVar.m34168h2(this);
        m9163t8(mediaRecyclerView);
        C2904a aVar = new C2904a(iqVar);
        aVar.m39574i(true);
        int Rg = m33055Rg(C1357a0.m37543g(), C1357a0.m37544f());
        this.f9695H0 = Rg;
        C8743e eVar = new C8743e(Rg, C1357a0.m37541i(3.0f), false, true, true);
        this.f9694G0 = eVar;
        eVar.m11613m(true, 40);
        this.f9694G0.m11614l(R.id.theme_color_filling);
        this.f9694G0.m11611o(aVar);
        RtlGridLayoutManager rtlGridLayoutManager = new RtlGridLayoutManager(context, this.f9695H0);
        rtlGridLayoutManager.m39585e3(aVar);
        mediaRecyclerView.m39434g(this.f9694G0);
        mediaRecyclerView.setLayoutManager(rtlGridLayoutManager);
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void onClick(View view) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        m34397Jf().requestDisallowInterceptTouchEvent(false);
        mo4347s().m14440t0();
    }

    @Override
    public void mo9812t1(Object obj, View$OnClickListenerC7430j1.C7448r rVar) {
        rVar.f23722c = this;
    }

    @Override
    public boolean mo33043tg() {
        return false;
    }

    @Override
    public C7462l1 mo9807v(int i, C8112b bVar) {
        View C;
        int R0 = this.f8589t0.m34215R0(bVar.mo13513d());
        if (R0 == -1 || (C = this.f8588s0.getLayoutManager().mo39262C(R0)) == null) {
            return null;
        }
        int top = C.getTop();
        int bottom = C.getBottom();
        int top2 = this.f8588s0.getTop() + top + View$OnClickListenerC9170d1.m10066c3(true);
        int measuredHeight = C.getMeasuredHeight() + top2;
        int left = C.getLeft();
        int right = C.getRight();
        int W = top - C2139ap.m35479W(39);
        int i2 = W < 0 ? -W : 0;
        int i3 = bottom < 0 ? -bottom : 0;
        this.f9700M0.m15991i(left, top2, right, measuredHeight);
        this.f9700M0.m15988l(0, i2, 0, i3);
        return this.f9700M0;
    }

    @Override
    public TdApi.SearchMessagesFilter mo33042wg() {
        if (this.f9696I0 == null) {
            this.f9696I0 = new TdApi.SearchMessagesFilterPhotoAndVideo();
        }
        return this.f9696I0;
    }

    @Override
    public int mo33041xg() {
        return 40;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        if (this.f8589t0.m34195Z0()) {
            return super.onLongClick(view);
        }
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar != null && raVar.m32876A() == 40) {
            C8112b bVar = (C8112b) raVar.m32844d();
            TdApi.Message message = bVar.getMessage();
            if (message == null || message.content.getConstructor() == 963323014) {
                return super.onLongClick(view);
            }
            RunnableC7470o oVar = new RunnableC7470o(mo4347s());
            C6957m1.C6963f fVar = new C6957m1.C6963f(this.f30167b, view, oVar, null);
            oVar.setBoundForceTouchContext(fVar);
            C8112b l = C8112b.m13497l(bVar, false);
            if (!l.m13508f0()) {
                l.m13487q(true);
            }
            oVar.setMedia(l);
            C5320c cVar = new C5320c(3);
            C5320c cVar2 = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            if (message.canBeDeletedOnlyForSelf || message.canBeDeletedForAllUsers) {
                cVar.m23284a(R.id.btn_messageDelete);
                cVar2.m23284a(R.drawable.baseline_delete_24);
                u0Var.m23816a(R.string.Delete);
            }
            View$OnClickListenerC2971rh rhVar = this.f8587r0;
            if (rhVar == null || !rhVar.m9382Na()) {
                cVar.m23284a(R.id.btn_messageSelect);
                cVar2.m23284a(R.drawable.baseline_playlist_add_check_24);
                u0Var.m23816a(R.string.Select);
            }
            if (message.canBeForwarded) {
                cVar.m23284a(R.id.btn_messageShare);
                cVar2.m23284a(R.drawable.baseline_forward_24);
                u0Var.m23816a(R.string.Share);
            }
            cVar.m23284a(R.id.btn_showInChat);
            cVar2.m23284a(R.drawable.baseline_visibility_24);
            u0Var.m23816a(R.string.ShowInChat);
            fVar.m18337I(this, raVar, cVar.m23280e(), cVar2.m23280e(), u0Var.m23813d());
            if (this.f30167b.m2583X6(this.f8583n0)) {
                C10712hc hcVar = new C10712hc(this.f30167b, message.chatId, message.senderId);
                fVar.m18335K(hcVar.m4201o() ? C4403w.m27869i1(R.string.FromYou) : hcVar.m4211e(), C4403w.m27910Z0(l.mo13507g(), TimeUnit.SECONDS));
                fVar.m18334L(hcVar.m4215a(), new C4587b(C9239m.getBaseAvatarRadiusDp(), hcVar.m4208h(), null));
            }
            View$OnClickListenerC3062so soVar = this.f8586q0;
            if (soVar != null) {
                fVar.m18341E(!soVar.m9382Na());
            } else {
                View$OnClickListenerC2971rh rhVar2 = this.f8587r0;
                if (rhVar2 != null) {
                    fVar.m18341E(!rhVar2.m9382Na());
                }
            }
            if (this.f30165a.m14501d2(fVar)) {
                m34397Jf().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            oVar.mo4501a3();
        }
        return false;
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        mo4347s().m14461n2(f, f2, f3, f4);
    }
}
