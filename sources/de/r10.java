package de;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.GridLayoutManager;
import ce.a0;
import ce.j0;
import de.y00;
import gb.c;
import gd.w;
import he.i;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ne.m1;
import od.j1;
import od.k1;
import od.l1;
import od.o;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.MediaRecyclerView;
import org.thunderdog.challegram.v.RtlGridLayoutManager;
import qd.b;
import tc.e;
import ud.d1;
import ud.m;
import zd.fc;
import zd.hj;
import zd.o6;

public class r10 extends j10<b> implements sc.a, k1, c.a, m1.e {
    public e G0;
    public int H0;
    public TdApi.SearchMessagesFilter I0;
    public int K0;
    public int L0;
    public int J0 = -1;
    public l1 M0 = new l1();

    public class a extends GridLayoutManager.b {
        public final iq f9203e;

        public a(iq iqVar) {
            this.f9203e = iqVar;
        }

        @Override
        public int f(int i10) {
            int size = this.f9203e.D0().size();
            if (i10 < 0 || i10 >= size || this.f9203e.D0().get(i10).A() != 40) {
                return r10.this.H0;
            }
            return 1;
        }
    }

    public r10(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int Rg(int i10, int i11) {
        int min = Math.min(i10, i11) / 3;
        if (j0.Q() || min == 0) {
            return 3;
        }
        if (i10 > i11) {
            return Math.max(5, i10 / min);
        }
        return i10 / min;
    }

    public void Sg(MediaRecyclerView mediaRecyclerView, int i10, int i11) {
        int Rg = Rg(i10, i11);
        if (this.H0 != Rg) {
            this.H0 = Rg;
            this.G0.n(Rg);
            mediaRecyclerView.A0();
            ((GridLayoutManager) mediaRecyclerView.getLayoutManager()).d3(this.H0);
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return true;
    }

    @Override
    public void C(View view, float f10, float f11) {
        ra raVar = (ra) view.getTag();
        if (raVar != null && raVar.A() == 40) {
            if (this.f8367t0.W0()) {
                Mg(raVar);
                return;
            }
            b bVar = (b) raVar.d();
            if (bVar.n0()) {
                if (bVar.f0()) {
                    j1.ik(this, bVar);
                } else if (!bVar.u0(view, f10, f11)) {
                    j1.ik(this, bVar);
                }
            } else if (bVar.X() != 8) {
                j1.ik(this, bVar);
            } else if (bVar.f0()) {
                this.f24495b.F4().w2().H0(this.f24495b, bVar.getMessage(), null);
            } else {
                bVar.t0(view);
            }
        }
    }

    @Override
    public boolean E4() {
        return i.c2().p6();
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    @Override
    public int Hf() {
        return this.H0;
    }

    @Override
    public void Ia() {
        super.Ia();
        MediaRecyclerView mediaRecyclerView = this.f8366s0;
        if (mediaRecyclerView != null) {
            mediaRecyclerView.A0();
        }
    }

    @Override
    public qd.c J4(long j10, TdApi.SearchMessagesFilter searchMessagesFilter) {
        ArrayList<T> arrayList = this.A0;
        if (arrayList == 0 || arrayList.isEmpty()) {
            return null;
        }
        int i10 = 0;
        Iterator it = this.A0.iterator();
        ArrayList<b> arrayList2 = null;
        int i11 = -1;
        while (it.hasNext()) {
            b k10 = b.k((b) it.next());
            if (k10 != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                if (i11 == -1 && k10.d() == j10) {
                    i11 = i10;
                }
                arrayList2.add(k10);
                i10++;
            }
        }
        if (i11 == -1) {
            return null;
        }
        qd.c cVar = new qd.c(this.f24493a, this.f24495b);
        cVar.t(i11, arrayList2);
        return cVar;
    }

    @Override
    public boolean Kg() {
        return false;
    }

    @Override
    public boolean Lg() {
        return true;
    }

    public b rg(TdApi.Object object) {
        TdApi.Message message = (TdApi.Message) object;
        int i10 = message.ttl;
        if (i10 > 0 && i10 <= 60) {
            return null;
        }
        b V0 = b.V0(t(), this.f24495b, message);
        if (V0 != null) {
            if (V0.n0() && (this.I0.getConstructor() == 115538222 || this.I0.getConstructor() == 1352130963)) {
                V0.x().q0(true);
                V0.x().N0(true);
            }
            V0.I0(2);
            V0.L0(a0.j(124.0f, 3.0f));
            V0.D0(true);
        }
        return V0;
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    public r10 Ug(TdApi.SearchMessagesFilter searchMessagesFilter) {
        this.I0 = searchMessagesFilter;
        return this;
    }

    @Override
    public boolean X6(float f10, float f11) {
        return !this.f8367t0.W0();
    }

    @Override
    public CharSequence X9() {
        switch (wg().getConstructor()) {
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                return w.i1(R.string.TabGifs);
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                return w.i1(R.string.TabVideo);
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                return w.i1(i.c2().U2() ? R.string.TabVideoMessagesLong : R.string.TabVideoMessages);
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                return w.i1(R.string.TabPhoto);
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                return w.i1(R.string.TabMedia);
            default:
                return "";
        }
    }

    @Override
    public void Z1(int i10, b bVar, boolean z10) {
    }

    @Override
    public void a7(m1.f fVar, int i10, Object obj) {
    }

    @Override
    public long getLongPressDuration() {
        if (this.f8367t0.W0()) {
            return ViewConfiguration.getLongPressTimeout();
        }
        return 250L;
    }

    @Override
    public CharSequence mo1if(ArrayList<b> arrayList) {
        int i10;
        int i11;
        switch (wg().getConstructor()) {
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                return w.q2(R.string.xGIFs, arrayList.size());
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                return w.q2(R.string.xVideos, arrayList.size());
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                return w.q2(R.string.xVideoMessages, arrayList.size());
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                return w.q2(R.string.xPhotos, arrayList.size());
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                if (this.J0 != arrayList.size()) {
                    Iterator<b> it = arrayList.iterator();
                    i11 = 0;
                    i10 = 0;
                    while (it.hasNext()) {
                        if (it.next().n0()) {
                            i10++;
                        } else {
                            i11++;
                        }
                    }
                    this.K0 = i11;
                    this.L0 = i10;
                    this.J0 = arrayList.size();
                } else {
                    i11 = this.K0;
                    i10 = this.L0;
                }
                return w.y2(i11, i10);
            default:
                throw new IllegalStateException("unsupported filter " + wg());
        }
    }

    @Override
    public void j4(Object obj, j1.r rVar) {
        rVar.f19674c = this;
    }

    @Override
    public int jf() {
        return a0.b(a0.D() / Math.max(5, a0.D() / (a0.B() / 3)), 18);
    }

    @Override
    public boolean jg() {
        return true;
    }

    @Override
    public boolean lg() {
        return false;
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return true;
    }

    @Override
    public int mf(int i10) {
        int i11;
        int i12 = 0;
        if (i10 == 0 || this.f8366s0 == null) {
            return 0;
        }
        List<ra> D0 = this.f8367t0.D0();
        int size = D0.size();
        int i13 = 0;
        while (i12 < i10 && i12 < size) {
            ra raVar = D0.get(i12);
            int A = raVar.A();
            if (A == 3) {
                i11 = a0.i(3.0f) + ap.W(3);
            } else if (A == 40) {
                int measuredWidth = this.f8366s0.getMeasuredWidth() / this.H0;
                int i14 = a0.i(3.0f);
                int i15 = this.H0 - 1;
                while (true) {
                    if (i15 <= 0 || i12 >= i10 || i12 >= size) {
                        break;
                    }
                    int i16 = i12 + 1;
                    ra raVar2 = D0.get(i16);
                    if (raVar2.A() != 40) {
                        raVar = raVar2;
                        break;
                    }
                    i15--;
                    i12 = i16;
                    raVar = raVar2;
                }
                i13 += measuredWidth;
                if (raVar.A() == 40) {
                    i13 -= i14;
                }
                i12++;
            } else if (A == 43 || A == 44) {
                i11 = fg(raVar.A());
            } else {
                i11 = ap.W(raVar.A());
            }
            i13 += i11;
            i12++;
        }
        return i13;
    }

    @Override
    public boolean mg() {
        return false;
    }

    @Override
    public void ng(Context context, MediaRecyclerView mediaRecyclerView, iq iqVar) {
        mediaRecyclerView.setMeasureCallback(new MediaRecyclerView.b() {
            @Override
            public final void a(MediaRecyclerView mediaRecyclerView2, int i10, int i11) {
                r10.this.Sg(mediaRecyclerView2, i10, i11);
            }
        });
        iqVar.c2(this);
        t8(mediaRecyclerView);
        a aVar = new a(iqVar);
        aVar.i(true);
        int Rg = Rg(a0.g(), a0.f());
        this.H0 = Rg;
        e eVar = new e(Rg, a0.i(3.0f), false, true, true);
        this.G0 = eVar;
        eVar.m(true, 40);
        this.G0.l(R.id.theme_color_filling);
        this.G0.o(aVar);
        RtlGridLayoutManager rtlGridLayoutManager = new RtlGridLayoutManager(context, this.H0);
        rtlGridLayoutManager.e3(aVar);
        mediaRecyclerView.g(this.G0);
        mediaRecyclerView.setLayoutManager(rtlGridLayoutManager);
    }

    @Override
    public void o(View view, float f10, float f11) {
        Jf().requestDisallowInterceptTouchEvent(false);
        t().w0();
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void onClick(View view) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public l1 s1(int i10, b bVar) {
        View C;
        int P0 = this.f8367t0.P0(bVar.d());
        if (P0 == -1 || (C = this.f8366s0.getLayoutManager().C(P0)) == null) {
            return null;
        }
        int top = C.getTop();
        int bottom = C.getBottom();
        int top2 = this.f8366s0.getTop() + top + d1.a3(true);
        int measuredHeight = C.getMeasuredHeight() + top2;
        int left = C.getLeft();
        int right = C.getRight();
        int W = top - ap.W(39);
        int i11 = W < 0 ? -W : 0;
        int i12 = bottom < 0 ? -bottom : 0;
        this.M0.i(left, top2, right, measuredHeight);
        this.M0.l(0, i11, 0, i12);
        return this.M0;
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        if (this.f8367t0.W0()) {
            return super.onLongClick(view);
        }
        ra raVar = (ra) view.getTag();
        if (raVar != null && raVar.A() == 40) {
            b bVar = (b) raVar.d();
            TdApi.Message message = bVar.getMessage();
            if (message == null || message.content.getConstructor() == 963323014) {
                return super.onLongClick(view);
            }
            o oVar = new o(t());
            m1.f fVar = new m1.f(this.f24495b, view, oVar, null);
            oVar.setBoundForceTouchContext(fVar);
            b l10 = b.l(bVar, false);
            if (!l10.f0()) {
                l10.q(true);
            }
            oVar.setMedia(l10);
            jb.c cVar = new jb.c(3);
            jb.c cVar2 = new jb.c(3);
            u0 u0Var = new u0(3);
            if (message.canBeDeletedOnlyForSelf || message.canBeDeletedForAllUsers) {
                cVar.a(R.id.btn_messageDelete);
                cVar2.a(R.drawable.baseline_delete_24);
                u0Var.a(R.string.Delete);
            }
            rh rhVar = this.f8365r0;
            if (rhVar == null || !rhVar.Na()) {
                cVar.a(R.id.btn_messageSelect);
                cVar2.a(R.drawable.baseline_playlist_add_check_24);
                u0Var.a(R.string.Select);
            }
            if (message.canBeForwarded) {
                cVar.a(R.id.btn_messageShare);
                cVar2.a(R.drawable.baseline_forward_24);
                u0Var.a(R.string.Share);
            }
            cVar.a(R.id.btn_showInChat);
            cVar2.a(R.drawable.baseline_visibility_24);
            u0Var.a(R.string.ShowInChat);
            fVar.I(this, raVar, cVar.e(), cVar2.e(), u0Var.d());
            if (this.f24495b.b7(this.f8361n0)) {
                fc fcVar = new fc(this.f24495b, message.chatId, message.senderId);
                fVar.K(fcVar.o() ? w.i1(R.string.FromYou) : fcVar.e(), w.Z0(l10.f(), TimeUnit.SECONDS));
                fVar.L(fcVar.a(), new hd.b(m.getBaseAvatarRadiusDp(), fcVar.h(), null));
            }
            so soVar = this.f8364q0;
            if (soVar != null) {
                fVar.E(!soVar.Na());
            } else {
                rh rhVar2 = this.f8365r0;
                if (rhVar2 != null) {
                    fVar.E(!rhVar2.Na());
                }
            }
            if (this.f24493a.f2(fVar)) {
                Jf().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            oVar.Q2();
        }
        return false;
    }

    @Override
    public void t2(m1.f fVar, int i10, Object obj) {
        switch (i10) {
            case R.id.btn_messageDelete:
                this.f24495b.hd();
                hj.v8(this, ((b) ((ra) obj).d()).getMessage());
                return;
            case R.id.btn_messageSelect:
                Mg((ra) obj);
                return;
            case R.id.btn_messageShare:
                y00 y00Var = new y00(this.f24493a, this.f24495b);
                y00Var.Vi(new y00.m(((b) ((ra) obj).d()).getMessage()).A(true));
                y00Var.ej();
                return;
            case R.id.btn_showInChat:
                TdApi.Message message = ((b) ((ra) obj).d()).getMessage();
                this.f24495b.hd().h7(this, message.chatId, new hj.j().f(message).m());
                return;
            default:
                return;
        }
    }

    @Override
    public boolean tg() {
        return false;
    }

    @Override
    public TdApi.SearchMessagesFilter wg() {
        if (this.I0 == null) {
            this.I0 = new TdApi.SearchMessagesFilterPhotoAndVideo();
        }
        return this.I0;
    }

    @Override
    public int xg() {
        return 40;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        t().o2(f10, f11, f12, f13);
    }
}
