package gd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import gd.C4630f0;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6861d2;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.AbstractView$OnClickListenerC3344yb;
import p038ce.View$OnClickListenerC3147u9;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5143t;
import p111he.C5115g0;
import p111he.C5125l;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6251j;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p194nd.AbstractC7459k1;
import p194nd.C7462l1;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8112b;
import p225pd.C8113c;
import p253rc.AbstractC8424a;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;
import td.C9357x2;

public class C4632f1 extends AbstractC4576a1 implements C4630f0.AbstractC4631a, AbstractC8424a, AbstractC7459k1 {
    public C4630f0 f15414W;
    public HandlerC10770jj.C10788q f15415X;
    public boolean f15416Y;
    public TdApi.PageBlockMap f15417Z;
    public C6246h f15418a0;
    public ArrayList<C4630f0> f15419b0;
    public ArrayList<TdApi.PageBlockCaption> f15420c0;
    public TdApi.PageBlockCaption f15421d0;
    public String f15422e0;
    public Drawable f15423f0;
    public boolean f15424g0;
    public boolean f15425h0;
    public C5125l f15426i0;
    public TdApi.PageBlockEmbedded f15427j0;
    public C6246h f15428k0;
    public C6246h f15429l0;
    public C6246h f15430m0;
    public boolean f15431n0;
    public ArrayList<C4632f1> f15432o0;
    public String f15433p0;
    public int f15434q0;

    public C4632f1(AbstractC9323v4<?> v4Var, TdApi.PageBlockPhoto pageBlockPhoto, C4658i iVar, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockPhoto);
        this.f15415X = qVar;
        if (pageBlockPhoto.photo != null) {
            C4630f0 f0Var = new C4630f0(v4Var.mo4347s(), v4Var.mo4348c(), pageBlockPhoto.photo, 0L, 0L, null, false, false, iVar);
            this.f15414W = f0Var;
            m26698e0(f0Var);
            m26691l0(pageBlockPhoto.caption);
            m26688o0(pageBlockPhoto.url);
        }
    }

    public void m26696g0(View view, Rect rect) {
        rect.set(this.f15414W.m26713y(), this.f15414W.m26793A(), this.f15414W.m26711z(), this.f15414W.m26717w());
    }

    public boolean m26695h0(View view, C4630f0 f0Var, View view2, int i) {
        if (i == R.id.btn_copyLink) {
            C1379j0.m37328i(this.f15422e0, R.string.CopiedLink);
            return true;
        } else if (i == R.id.btn_open) {
            m26694i0(f0Var);
            return true;
        } else if (i != R.id.btn_openLink) {
            return true;
        } else {
            HandlerC10770jj.C10788q qVar = new HandlerC10770jj.C10788q(this.f15415X);
            if (qVar.f34544g == null) {
                qVar.f34544g = C1379j0.m37310r(view.getContext()).m14584H3().m8984h(view, this.f15038c).m8948u(new C9357x2.AbstractC9363f() {
                    @Override
                    public final void mo8098f1(View view3, Rect rect) {
                        C4632f1.this.m26696g0(view3, rect);
                    }
                });
            }
            AbstractC9323v4<?> v4Var = this.f15036a;
            if (v4Var instanceof View$OnClickListenerC3147u9) {
                ((View$OnClickListenerC3147u9) v4Var).mo18235g0(view, this.f15422e0, false, qVar);
                return true;
            }
            v4Var.mo4348c().m2485dd().m3858E7(this.f15036a, this.f15422e0, qVar);
            return true;
        }
    }

    @Override
    public boolean mo26326C(View view, MotionEvent motionEvent) {
        C5125l lVar = this.f15426i0;
        if (lVar != null) {
            return lVar.m23873i(view, motionEvent, 0, mo26321q());
        }
        C4630f0 f0Var = this.f15414W;
        return f0Var != null && f0Var.m26744i0(view, motionEvent);
    }

    @Override
    public void mo9807F2(int i, C8112b bVar, boolean z) {
    }

    @Override
    public void mo26709P(C6238b bVar, boolean z) {
        C5125l lVar = this.f15426i0;
        if (lVar != null) {
            lVar.m23871k(bVar, z);
        } else {
            bVar.m21000d();
        }
    }

    @Override
    public void mo26708Q(RunnableC6507m mVar) {
        C4630f0 f0Var = this.f15414W;
        if (f0Var != null) {
            f0Var.m26738l0(mVar);
        } else {
            mVar.clear();
        }
    }

    @Override
    public C8113c mo9831R4(long j, TdApi.SearchMessagesFilter searchMessagesFilter) {
        return null;
    }

    @Override
    public void mo26459S(C6257p pVar) {
        if (this.f15427j0 != null) {
            pVar.m20820G(this.f15430m0);
        } else if (this.f15417Z != null) {
            pVar.m20820G(this.f15418a0);
        } else {
            C4630f0 f0Var = this.f15414W;
            if (f0Var != null) {
                f0Var.m26736m0(pVar);
            } else {
                pVar.clear();
            }
        }
    }

    @Override
    public void mo26458T(C6240c cVar) {
        if (this.f15427j0 != null) {
            cVar.m20978j(this.f15428k0, this.f15429l0);
            return;
        }
        C4630f0 f0Var = this.f15414W;
        if (f0Var != null) {
            f0Var.m26734n0(cVar);
        } else {
            cVar.clear();
        }
    }

    public boolean m26705a0(View$OnClickListenerC3147u9 u9Var, String str, ArrayList<C4632f1> arrayList) {
        this.f15433p0 = str;
        C4630f0 f0Var = this.f15414W;
        if (f0Var == null || f0Var.m26761W()) {
            return false;
        }
        this.f15432o0 = arrayList;
        return true;
    }

    @Override
    public boolean mo26704b() {
        TdApi.PageBlockEmbedded pageBlockEmbedded = this.f15427j0;
        return pageBlockEmbedded != null && pageBlockEmbedded.allowScrolling;
    }

    public int m26703b0() {
        ArrayList<C4630f0> arrayList = this.f15419b0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public void mo26702c(View view, FrameLayout.LayoutParams layoutParams, int i, int i2) {
        layoutParams.topMargin = mo26321q();
        layoutParams.bottomMargin = (this.f15425h0 || this.f15431n0) ? 0 : mo26321q();
        layoutParams.leftMargin = m27276x(true);
        layoutParams.rightMargin = m27276x(false);
    }

    public int m26701c0() {
        return this.f15434q0;
    }

    public C4630f0 m26700d0(int i) {
        ArrayList<C4630f0> arrayList = this.f15419b0;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return this.f15419b0.get(i);
    }

    @Override
    public void mo26699e() {
        C5125l lVar = this.f15426i0;
        if (lVar != null) {
            lVar.m23881a();
            return;
        }
        C4630f0 f0Var = this.f15414W;
        if (f0Var != null) {
            f0Var.m26781G().m18623j();
        }
    }

    public final void m26698e0(C4630f0 f0Var) {
        f0Var.m26724s0();
        f0Var.m26790B0(this.f15038c);
        f0Var.m26722t0(this);
    }

    @Override
    public int mo26324f(android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4632f1.mo26324f(android.view.View, int):int");
    }

    public boolean m26697f0() {
        TdApi.PageBlockEmbedded pageBlockEmbedded = this.f15427j0;
        return pageBlockEmbedded != null && (pageBlockEmbedded.width == 0 || pageBlockEmbedded.height == 0);
    }

    @Override
    public <T extends View & AbstractC5143t> void mo26323i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
        int i;
        int i2;
        int i3 = 0;
        if (this.f15427j0 != null || this.f15417Z != null) {
            int x = m27276x(true);
            int q = mo26321q();
            int measuredWidth = t.getMeasuredWidth() - m27276x(false);
            int o = m27280o();
            if (!this.f15425h0 && !this.f15431n0) {
                i3 = mo26321q();
            }
            vVar.mo20257K0(x, q, measuredWidth, o - i3);
            vVar2.mo20257K0(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
            if (vVar2.mo20247c0()) {
                if (vVar.mo20247c0()) {
                    vVar.mo20256N(canvas);
                }
                vVar.draw(canvas);
            }
            vVar2.draw(canvas);
        } else if (this.f15426i0 != null && (t instanceof C6861d2)) {
            int measuredWidth2 = (t.getMeasuredWidth() - m27276x(true)) - m27276x(false);
            int h = this.f15426i0.m23874h();
            if (!m27294I()) {
                i2 = m27276x(true);
            } else if (h < measuredWidth2) {
                i2 = (measuredWidth2 - h) / 2;
            } else {
                i = 0;
                this.f15426i0.m23877e(t, canvas, i, mo26321q(), ((C6861d2) t).getMultipleReceiver());
            }
            i = i2;
            this.f15426i0.m23877e(t, canvas, i, mo26321q(), ((C6861d2) t).getMultipleReceiver());
        } else if (this.f15414W != null) {
            this.f15414W.m26725s(t, canvas, ((((t.getMeasuredWidth() - m27276x(true)) - m27276x(false)) / 2) - (this.f15414W.m26791B() / 2)) + m27276x(true), mo26321q(), vVar, vVar2, 1.0f);
            if (!C5070i.m24062i(this.f15422e0)) {
                C1362c.m37490b(canvas, this.f15423f0, (vVar2.getRight() - this.f15423f0.getMinimumWidth()) - C1357a0.m37544i(9.0f), vVar2.getTop() + C1357a0.m37544i(9.0f), C1410y.m37058W(-1));
            }
        }
    }

    public final boolean m26694i0(C4630f0 f0Var) {
        boolean z;
        ArrayList<TdApi.PageBlockCaption> arrayList;
        ArrayList<C4630f0> arrayList2;
        String str;
        C8113c cVar = new C8113c(this.f15036a.mo4347s(), this.f15036a.mo4348c());
        ArrayList<C8112b> arrayList3 = new ArrayList<>();
        TdApi.TextEntity[] textEntityArr = null;
        if (this.f15416Y || this.f15426i0 != null) {
            arrayList2 = this.f15419b0;
            arrayList = this.f15420c0;
            z = true;
        } else {
            if (this.f15432o0 != null) {
                arrayList2 = new ArrayList<>(this.f15432o0.size());
                arrayList = new ArrayList<>(this.f15432o0.size());
                Iterator<C4632f1> it = this.f15432o0.iterator();
                while (it.hasNext()) {
                    C4632f1 next = it.next();
                    arrayList2.add(next.f15414W);
                    arrayList.add(next.f15421d0);
                }
            } else {
                arrayList2 = null;
                arrayList = null;
            }
            z = false;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator<C4630f0> it2 = arrayList2.iterator();
            int i = -1;
            int i2 = 0;
            while (it2.hasNext()) {
                C4630f0 next2 = it2.next();
                TdApi.PageBlockCaption pageBlockCaption = arrayList.get(i2);
                if (pageBlockCaption == null) {
                    str = textEntityArr;
                } else if (!C7321e.m16962b1(pageBlockCaption.text) && !C7321e.m16962b1(pageBlockCaption.credit)) {
                    str = C4779t2.m25508h2(pageBlockCaption.text) + "\n" + C4779t2.m25508h2(pageBlockCaption.credit);
                } else if (!C7321e.m16962b1(pageBlockCaption.text)) {
                    str = C4779t2.m25508h2(pageBlockCaption.text);
                } else {
                    str = C4779t2.m25508h2(pageBlockCaption.credit);
                }
                TdApi.FormattedText formattedText = !C5070i.m24062i(str) ? new TdApi.FormattedText(str, textEntityArr) : textEntityArr;
                C8112b W0 = next2.m26775J() != null ? C8112b.m13524W0(this.f15036a.mo4347s(), this.f15036a.mo4348c(), next2.m26775J(), formattedText) : next2.m26765S() != null ? C8112b.m13522X0(this.f15036a.mo4347s(), this.f15036a.mo4348c(), next2.m26765S(), formattedText) : next2.m26719v() != null ? C8112b.m13528U0(this.f15036a.mo4347s(), this.f15036a.mo4348c(), next2.m26719v(), formattedText) : null;
                if (W0 != null) {
                    if (next2 == f0Var) {
                        i = i2;
                    }
                    arrayList3.add(W0);
                }
                i2++;
                textEntityArr = null;
            }
            if (i != -1 && !arrayList3.isEmpty()) {
                cVar.m13447t(i, arrayList3);
                View$OnClickListenerC7430j1.m16132rk(this.f15036a, cVar, this.f15433p0, this, z);
                return true;
            }
        }
        return false;
    }

    public final void m26693j0(org.drinkless.p210td.libcore.telegram.TdApi.PageBlock[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4632f1.m26693j0(org.drinkless.td.libcore.telegram.TdApi$PageBlock[]):void");
    }

    @Override
    public boolean mo26550k(final View view, final C4630f0 f0Var) {
        if (this.f15417Z != null) {
            HandlerC10770jj dd = this.f15036a.mo4348c().m2485dd();
            AbstractC9323v4<?> v4Var = this.f15036a;
            TdApi.Location location = this.f15417Z.location;
            dd.m3479q7(v4Var, new AbstractView$OnClickListenerC3344yb.C3351f(location.latitude, location.longitude));
            return true;
        } else if (C5070i.m24062i(this.f15422e0)) {
            return m26694i0(f0Var);
        } else {
            this.f15036a.m9261ee(C4403w.m27867j1(R.string.OpenThisLink, this.f15422e0), new int[]{R.id.btn_openLink, R.id.btn_copyLink, R.id.btn_open}, new String[]{C4403w.m27871i1(R.string.Open), C4403w.m27871i1(R.string.CopyLink), C4403w.m27871i1(R.string.ViewPhoto)}, null, new int[]{R.drawable.baseline_open_in_browser_24, R.drawable.baseline_content_copy_24, R.drawable.baseline_visibility_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean h0;
                    h0 = C4632f1.this.m26695h0(view, f0Var, view2, i);
                    return h0;
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
            return true;
        }
    }

    public void m26692k0(WebView webView) {
        if (!C5070i.m24062i(this.f15427j0.html)) {
            webView.loadDataWithBaseURL("https://telegram.org/embed", this.f15427j0.html, "text/html", "UTF-8", null);
            return;
        }
        Log.m14714v("embedded.url: %s", this.f15427j0.url);
        webView.loadUrl(this.f15427j0.url);
    }

    public final void m26691l0(TdApi.PageBlockCaption pageBlockCaption) {
        if (!C7321e.m16962b1(pageBlockCaption.text) || !C7321e.m16962b1(pageBlockCaption.credit)) {
            this.f15421d0 = pageBlockCaption;
            this.f15431n0 = true;
        }
    }

    public void m26690m0() {
        this.f15425h0 = true;
    }

    public void m26689n0(int i) {
        this.f15434q0 = i;
    }

    public final void m26688o0(String str) {
        if (!C5070i.m24068c(this.f15422e0, str)) {
            this.f15422e0 = str;
            if (this.f15423f0 == null) {
                this.f15423f0 = C1362c.m37486f(R.drawable.baseline_launch_24);
            }
        }
    }

    @Override
    public int mo26322p() {
        C5125l lVar = this.f15426i0;
        if (lVar != null) {
            return lVar.m23876f();
        }
        C4630f0 f0Var = this.f15414W;
        if (f0Var != null) {
            return f0Var.m26715x();
        }
        return 0;
    }

    @Override
    public int mo26321q() {
        if (this.f15425h0) {
            return 0;
        }
        return C1357a0.m37544i(m27294I() ? 16.0f : 8.0f);
    }

    @Override
    public int mo26687r(boolean z) {
        TdApi.PageBlockEmbedded pageBlockEmbedded = this.f15427j0;
        return (pageBlockEmbedded == null || pageBlockEmbedded.isFullWidth) ? super.mo26687r(z) : C1357a0.m37544i(16.0f);
    }

    @Override
    public void mo9811t1(Object obj, View$OnClickListenerC7430j1.C7448r rVar) {
        rVar.f23725c = this;
    }

    @Override
    public C7462l1 mo9806v(int i, C8112b bVar) {
        C4630f0 f0Var;
        View f;
        ViewGroup viewGroup;
        if (this.f15416Y || this.f15426i0 != null) {
            f0Var = m26700d0(i);
        } else {
            f0Var = this.f15414W;
        }
        if (f0Var == null || (f = this.f15038c.mo28228f()) == null || (viewGroup = (ViewGroup) f.getParent()) == null) {
            return null;
        }
        int i2 = C1399s0.m37157u(f)[1];
        f.getTop();
        int q = (this.f15427j0 != null || this.f15416Y) ? mo26321q() : 0;
        C7462l1 I = f0Var.m26777I(f, f.getTop() + q, (viewGroup.getBottom() - f.getBottom()) - q, i2 + q);
        I.m15984p(0);
        return I;
    }

    @Override
    public int mo26320z() {
        if (this.f15427j0 != null) {
            return 54;
        }
        if (this.f15416Y) {
            return 53;
        }
        if (this.f15426i0 != null) {
            return 51;
        }
        return this.f15424g0 ? 50 : 49;
    }

    public C4632f1(AbstractC9323v4<?> v4Var, TdApi.PageBlockMap pageBlockMap) {
        super(v4Var, pageBlockMap);
        String str;
        this.f15417Z = pageBlockMap;
        m26691l0(pageBlockMap.caption);
        if (C4868i.m24727c2().m24696g1(true) != 2) {
            int i = pageBlockMap.width;
            int i2 = pageBlockMap.height;
            if (i > 1024 || i2 > 1024) {
                float max = 1024.0f / Math.max(i, i2);
                i = (int) (i * max);
                i2 = (int) (i2 * max);
            }
            int max2 = Math.max(14, i);
            int max3 = Math.max(14, i2);
            int i3 = C1357a0.m37545h() >= 2.0f ? 2 : 1;
            int i4 = max2 / i3;
            int i5 = max3 / i3;
            int max4 = Math.max(13, Math.min(20, pageBlockMap.zoom));
            C10930q6 c = v4Var.mo4348c();
            TdApi.GetMapThumbnailFile getMapThumbnailFile = new TdApi.GetMapThumbnailFile(pageBlockMap.location, max4, i4, i5, i3, 0L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("telegram_map_");
            sb2.append(pageBlockMap.location.latitude);
            sb2.append(",");
            sb2.append(pageBlockMap.location.longitude);
            if (max4 != 16) {
                str = "," + max4;
            } else {
                str = "";
            }
            sb2.append(str);
            this.f15418a0 = new C6251j(c, getMapThumbnailFile, sb2.toString());
        } else {
            C10930q6 c2 = v4Var.mo4348c();
            TdApi.Location location = pageBlockMap.location;
            C6251j jVar = new C6251j(v4Var.mo4348c(), C7389v0.m16725I0(c2, location.latitude, location.longitude, pageBlockMap.zoom, false, pageBlockMap.width, pageBlockMap.height, null), new TdApi.FileTypeThumbnail());
            this.f15418a0 = jVar;
            jVar.m20898s0(2);
        }
        this.f15418a0.m20898s0(2);
    }

    public C4632f1(AbstractC9323v4<?> v4Var, TdApi.PageBlockAnimation pageBlockAnimation) {
        super(v4Var, pageBlockAnimation);
        this.f15424g0 = true;
        if (pageBlockAnimation.animation != null) {
            C4630f0 f0Var = new C4630f0(v4Var.mo4347s(), v4Var.mo4348c(), pageBlockAnimation.animation, 0L, 0L, null, false, true, !pageBlockAnimation.needAutoplay, null);
            this.f15414W = f0Var;
            m26698e0(f0Var);
            m26691l0(pageBlockAnimation.caption);
        }
    }

    public C4632f1(AbstractC9323v4<?> v4Var, TdApi.PageBlockVideo pageBlockVideo) {
        super(v4Var, pageBlockVideo);
        if (pageBlockVideo.video != null) {
            C4630f0 f0Var = new C4630f0(v4Var.mo4347s(), v4Var.mo4348c(), pageBlockVideo.video, 0L, 0L, (AbstractC4761s4) null, false);
            this.f15414W = f0Var;
            m26698e0(f0Var);
            m26691l0(pageBlockVideo.caption);
        }
    }

    public C4632f1(AbstractC9323v4<?> v4Var, TdApi.PageBlockCollage pageBlockCollage) {
        super(v4Var, pageBlockCollage);
        m26691l0(pageBlockCollage.caption);
        m26693j0(pageBlockCollage.pageBlocks);
        ArrayList<C4630f0> arrayList = this.f15419b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f15426i0 = new C5125l(this.f15419b0, C1357a0.m37544i(2.0f));
        }
    }

    public C4632f1(AbstractC9323v4<?> v4Var, TdApi.PageBlockSlideshow pageBlockSlideshow) {
        super(v4Var, pageBlockSlideshow);
        this.f15416Y = true;
        m26691l0(pageBlockSlideshow.caption);
        m26693j0(pageBlockSlideshow.pageBlocks);
    }

    public C4632f1(AbstractC9323v4<?> v4Var, TdApi.PageBlockEmbedded pageBlockEmbedded) {
        super(v4Var, pageBlockEmbedded);
        this.f15427j0 = pageBlockEmbedded;
        TdApi.Photo photo = pageBlockEmbedded.posterPhoto;
        if (photo != null) {
            if (photo.minithumbnail != null) {
                C6250i iVar = new C6250i(pageBlockEmbedded.posterPhoto.minithumbnail);
                this.f15428k0 = iVar;
                iVar.m20898s0(2);
            }
            TdApi.PhotoSize l = C4630f0.m26739l(pageBlockEmbedded.posterPhoto);
            TdApi.PhotoSize o = C4630f0.m26733o(pageBlockEmbedded.posterPhoto, l);
            if (l != null) {
                C6246h hVar = new C6246h(v4Var.mo4348c(), l.photo);
                this.f15429l0 = hVar;
                hVar.m20898s0(2);
            }
            if (o != null) {
                C6246h hVar2 = new C6246h(v4Var.mo4348c(), o.photo);
                this.f15430m0 = hVar2;
                hVar2.m20898s0(2);
                C4630f0.m26743j(this.f15430m0, o);
            }
        }
        m26691l0(pageBlockEmbedded.caption);
    }
}
