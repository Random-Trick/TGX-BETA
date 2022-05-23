package hd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.y;
import de.u9;
import de.yb;
import gd.w;
import hd.f0;
import ib.i;
import ie.g0;
import ie.h0;
import ie.l;
import ie.t;
import java.util.ArrayList;
import java.util.Iterator;
import ld.b;
import ld.h;
import ld.j;
import ld.p;
import ld.v;
import md.m;
import ne.d2;
import ob.e;
import oc.v0;
import od.j1;
import od.k1;
import od.l1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import qd.c;
import sc.a;
import ud.v4;
import ud.x2;
import zd.hj;
import zd.o6;

public class f1 extends a1 implements f0.a, a, k1 {
    public f0 W;
    public hj.q X;
    public boolean Y;
    public TdApi.PageBlockMap Z;
    public h f12985a0;
    public ArrayList<f0> f12986b0;
    public ArrayList<TdApi.PageBlockCaption> f12987c0;
    public TdApi.PageBlockCaption f12988d0;
    public String f12989e0;
    public Drawable f12990f0;
    public boolean f12991g0;
    public boolean f12992h0;
    public l f12993i0;
    public TdApi.PageBlockEmbedded f12994j0;
    public h f12995k0;
    public h f12996l0;
    public h f12997m0;
    public boolean f12998n0;
    public ArrayList<f1> f12999o0;
    public String f13000p0;
    public int f13001q0;

    public f1(v4<?> v4Var, TdApi.PageBlockPhoto pageBlockPhoto, i iVar, hj.q qVar) {
        super(v4Var, pageBlockPhoto);
        this.X = qVar;
        if (pageBlockPhoto.photo != null) {
            f0 f0Var = new f0(v4Var.t(), v4Var.c(), pageBlockPhoto.photo, 0L, 0L, null, false, false, iVar);
            this.W = f0Var;
            d0(f0Var);
            k0(pageBlockPhoto.caption);
            n0(pageBlockPhoto.url);
        }
    }

    public void f0(View view, Rect rect) {
        rect.set(this.W.y(), this.W.A(), this.W.z(), this.W.w());
    }

    public boolean g0(View view, f0 f0Var, View view2, int i10) {
        if (i10 == R.id.btn_copyLink) {
            j0.i(this.f12989e0, R.string.CopiedLink);
            return true;
        } else if (i10 == R.id.btn_open) {
            h0(f0Var);
            return true;
        } else if (i10 != R.id.btn_openLink) {
            return true;
        } else {
            hj.q qVar = new hj.q(this.X);
            if (qVar.f27707g == null) {
                qVar.f27707g = j0.r(view.getContext()).I3().h(view, this.f12694c).u(new x2.f() {
                    @Override
                    public final void d1(View view3, Rect rect) {
                        f1.this.f0(view3, rect);
                    }
                });
            }
            v4<?> v4Var = this.f12692a;
            if (v4Var instanceof u9) {
                ((u9) v4Var).d5(view, this.f12989e0, false, qVar);
                return true;
            }
            v4Var.c().hd().E7(this.f12692a, this.f12989e0, qVar);
            return true;
        }
    }

    @Override
    public boolean B(View view, MotionEvent motionEvent) {
        l lVar = this.f12993i0;
        if (lVar != null) {
            return lVar.i(view, motionEvent, 0, q());
        }
        f0 f0Var = this.W;
        return f0Var != null && f0Var.i0(view, motionEvent);
    }

    @Override
    public c J4(long j10, TdApi.SearchMessagesFilter searchMessagesFilter) {
        return null;
    }

    @Override
    public void O(b bVar, boolean z10) {
        l lVar = this.f12993i0;
        if (lVar != null) {
            lVar.k(bVar, z10);
        } else {
            bVar.d();
        }
    }

    @Override
    public void P(m mVar) {
        f0 f0Var = this.W;
        if (f0Var != null) {
            f0Var.l0(mVar);
        } else {
            mVar.clear();
        }
    }

    @Override
    public void R(p pVar) {
        if (this.f12994j0 != null) {
            pVar.G(this.f12997m0);
        } else if (this.Z != null) {
            pVar.G(this.f12985a0);
        } else {
            f0 f0Var = this.W;
            if (f0Var != null) {
                f0Var.m0(pVar);
            } else {
                pVar.clear();
            }
        }
    }

    @Override
    public void S(ld.c cVar) {
        if (this.f12994j0 != null) {
            cVar.j(this.f12995k0, this.f12996l0);
            return;
        }
        f0 f0Var = this.W;
        if (f0Var != null) {
            f0Var.n0(cVar);
        } else {
            cVar.clear();
        }
    }

    public boolean Z(u9 u9Var, String str, ArrayList<f1> arrayList) {
        this.f13000p0 = str;
        f0 f0Var = this.W;
        if (f0Var == null || f0Var.W()) {
            return false;
        }
        this.f12999o0 = arrayList;
        return true;
    }

    @Override
    public void Z1(int i10, qd.b bVar, boolean z10) {
    }

    public int a0() {
        ArrayList<f0> arrayList = this.f12986b0;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public boolean b() {
        TdApi.PageBlockEmbedded pageBlockEmbedded = this.f12994j0;
        return pageBlockEmbedded != null && pageBlockEmbedded.allowScrolling;
    }

    public int b0() {
        return this.f13001q0;
    }

    @Override
    public void c(View view, FrameLayout.LayoutParams layoutParams, int i10, int i11) {
        layoutParams.topMargin = q();
        layoutParams.bottomMargin = (this.f12992h0 || this.f12998n0) ? 0 : q();
        layoutParams.leftMargin = w(true);
        layoutParams.rightMargin = w(false);
    }

    public f0 c0(int i10) {
        ArrayList<f0> arrayList = this.f12986b0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return this.f12986b0.get(i10);
    }

    public final void d0(f0 f0Var) {
        f0Var.s0();
        f0Var.C0(this.f12694c);
        f0Var.t0(this);
    }

    @Override
    public void e() {
        l lVar = this.f12993i0;
        if (lVar != null) {
            lVar.a();
            return;
        }
        f0 f0Var = this.W;
        if (f0Var != null) {
            f0Var.G().k();
        }
    }

    public boolean e0() {
        TdApi.PageBlockEmbedded pageBlockEmbedded = this.f12994j0;
        return pageBlockEmbedded != null && (pageBlockEmbedded.width == 0 || pageBlockEmbedded.height == 0);
    }

    @Override
    public boolean f(final View view, final f0 f0Var) {
        if (this.Z != null) {
            hj hd2 = this.f12692a.c().hd();
            v4<?> v4Var = this.f12692a;
            TdApi.Location location = this.Z.location;
            hd2.q7(v4Var, new yb.f(location.latitude, location.longitude));
            return true;
        } else if (i.i(this.f12989e0)) {
            return h0(f0Var);
        } else {
            this.f12692a.ee(w.j1(R.string.OpenThisLink, this.f12989e0), new int[]{R.id.btn_openLink, R.id.btn_copyLink, R.id.btn_open}, new String[]{w.i1(R.string.Open), w.i1(R.string.CopyLink), w.i1(R.string.ViewPhoto)}, null, new int[]{R.drawable.baseline_open_in_browser_24, R.drawable.baseline_content_copy_24, R.drawable.baseline_visibility_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean g02;
                    g02 = f1.this.g0(view, f0Var, view2, i10);
                    return g02;
                }
            });
            return true;
        }
    }

    @Override
    public int g(android.view.View r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: hd.f1.g(android.view.View, int):int");
    }

    public final boolean h0(f0 f0Var) {
        boolean z10;
        ArrayList<TdApi.PageBlockCaption> arrayList;
        ArrayList<f0> arrayList2;
        String str;
        c cVar = new c(this.f12692a.t(), this.f12692a.c());
        ArrayList<qd.b> arrayList3 = new ArrayList<>();
        TdApi.TextEntity[] textEntityArr = null;
        if (this.Y || this.f12993i0 != null) {
            arrayList2 = this.f12986b0;
            arrayList = this.f12987c0;
            z10 = true;
        } else {
            if (this.f12999o0 != null) {
                arrayList2 = new ArrayList<>(this.f12999o0.size());
                arrayList = new ArrayList<>(this.f12999o0.size());
                Iterator<f1> it = this.f12999o0.iterator();
                while (it.hasNext()) {
                    f1 next = it.next();
                    arrayList2.add(next.W);
                    arrayList.add(next.f12988d0);
                }
            } else {
                arrayList2 = null;
                arrayList = null;
            }
            z10 = false;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator<f0> it2 = arrayList2.iterator();
            int i10 = -1;
            int i11 = 0;
            while (it2.hasNext()) {
                f0 next2 = it2.next();
                TdApi.PageBlockCaption pageBlockCaption = arrayList.get(i11);
                if (pageBlockCaption == null) {
                    str = textEntityArr;
                } else if (!e.d1(pageBlockCaption.text) && !e.d1(pageBlockCaption.credit)) {
                    str = t2.h2(pageBlockCaption.text) + "\n" + t2.h2(pageBlockCaption.credit);
                } else if (!e.d1(pageBlockCaption.text)) {
                    str = t2.h2(pageBlockCaption.text);
                } else {
                    str = t2.h2(pageBlockCaption.credit);
                }
                TdApi.FormattedText formattedText = !i.i(str) ? new TdApi.FormattedText(str, textEntityArr) : textEntityArr;
                qd.b W0 = next2.J() != null ? qd.b.W0(this.f12692a.t(), this.f12692a.c(), next2.J(), formattedText) : next2.S() != null ? qd.b.X0(this.f12692a.t(), this.f12692a.c(), next2.S(), formattedText) : next2.v() != null ? qd.b.U0(this.f12692a.t(), this.f12692a.c(), next2.v(), formattedText) : null;
                if (W0 != null) {
                    if (next2 == f0Var) {
                        i10 = i11;
                    }
                    arrayList3.add(W0);
                }
                i11++;
                textEntityArr = null;
            }
            if (i10 != -1 && !arrayList3.isEmpty()) {
                cVar.t(i10, arrayList3);
                j1.rk(this.f12692a, cVar, this.f13000p0, this, z10);
                return true;
            }
        }
        return false;
    }

    public final void i0(org.drinkless.td.libcore.telegram.TdApi.PageBlock[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: hd.f1.i0(org.drinkless.td.libcore.telegram.TdApi$PageBlock[]):void");
    }

    @Override
    public <T extends View & t> void j(T t10, Canvas canvas, v vVar, v vVar2, b bVar) {
        int i10;
        int i11;
        int i12 = 0;
        if (this.f12994j0 != null || this.Z != null) {
            int w10 = w(true);
            int q10 = q();
            int measuredWidth = t10.getMeasuredWidth() - w(false);
            int o10 = o();
            if (!this.f12992h0 && !this.f12998n0) {
                i12 = q();
            }
            vVar.K0(w10, q10, measuredWidth, o10 - i12);
            vVar2.K0(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
            if (vVar2.e0()) {
                if (vVar.e0()) {
                    vVar.O(canvas);
                }
                vVar.draw(canvas);
            }
            vVar2.draw(canvas);
        } else if (this.f12993i0 != null && (t10 instanceof d2)) {
            int measuredWidth2 = (t10.getMeasuredWidth() - w(true)) - w(false);
            int h10 = this.f12993i0.h();
            if (!H()) {
                i11 = w(true);
            } else if (h10 < measuredWidth2) {
                i11 = (measuredWidth2 - h10) / 2;
            } else {
                i10 = 0;
                this.f12993i0.e(t10, canvas, i10, q(), ((d2) t10).getMultipleReceiver());
            }
            i10 = i11;
            this.f12993i0.e(t10, canvas, i10, q(), ((d2) t10).getMultipleReceiver());
        } else if (this.W != null) {
            this.W.s(t10, canvas, ((((t10.getMeasuredWidth() - w(true)) - w(false)) / 2) - (this.W.B() / 2)) + w(true), q(), vVar, vVar2, 1.0f);
            if (!i.i(this.f12989e0)) {
                ce.c.b(canvas, this.f12990f0, (vVar2.getRight() - this.f12990f0.getMinimumWidth()) - a0.i(9.0f), vVar2.getTop() + a0.i(9.0f), y.W(-1));
            }
        }
    }

    public void j0(WebView webView) {
        if (!i.i(this.f12994j0.html)) {
            webView.loadDataWithBaseURL("https://telegram.org/embed", this.f12994j0.html, "text/html", "UTF-8", null);
            return;
        }
        Log.v("embedded.url: %s", this.f12994j0.url);
        webView.loadUrl(this.f12994j0.url);
    }

    @Override
    public void j4(Object obj, j1.r rVar) {
        rVar.f19674c = this;
    }

    public final void k0(TdApi.PageBlockCaption pageBlockCaption) {
        if (!e.d1(pageBlockCaption.text) || !e.d1(pageBlockCaption.credit)) {
            this.f12988d0 = pageBlockCaption;
            this.f12998n0 = true;
        }
    }

    public void l0() {
        this.f12992h0 = true;
    }

    public void m0(int i10) {
        this.f13001q0 = i10;
    }

    public final void n0(String str) {
        if (!i.c(this.f12989e0, str)) {
            this.f12989e0 = str;
            if (this.f12990f0 == null) {
                this.f12990f0 = ce.c.f(R.drawable.baseline_launch_24);
            }
        }
    }

    @Override
    public int p() {
        l lVar = this.f12993i0;
        if (lVar != null) {
            return lVar.f();
        }
        f0 f0Var = this.W;
        if (f0Var != null) {
            return f0Var.x();
        }
        return 0;
    }

    @Override
    public int q() {
        if (this.f12992h0) {
            return 0;
        }
        return a0.i(H() ? 16.0f : 8.0f);
    }

    @Override
    public int r(boolean z10) {
        TdApi.PageBlockEmbedded pageBlockEmbedded = this.f12994j0;
        return (pageBlockEmbedded == null || pageBlockEmbedded.isFullWidth) ? super.r(z10) : a0.i(16.0f);
    }

    @Override
    public l1 s1(int i10, qd.b bVar) {
        f0 f0Var;
        View f10;
        ViewGroup viewGroup;
        if (this.Y || this.f12993i0 != null) {
            f0Var = c0(i10);
        } else {
            f0Var = this.W;
        }
        if (f0Var == null || (f10 = this.f12694c.f()) == null || (viewGroup = (ViewGroup) f10.getParent()) == null) {
            return null;
        }
        int i11 = p0.r(f10)[1];
        f10.getTop();
        int q10 = (this.f12994j0 != null || this.Y) ? q() : 0;
        l1 I = f0Var.I(f10, f10.getTop() + q10, (viewGroup.getBottom() - f10.getBottom()) - q10, i11 + q10);
        I.p(0);
        return I;
    }

    @Override
    public int y() {
        if (this.f12994j0 != null) {
            return 54;
        }
        if (this.Y) {
            return 53;
        }
        if (this.f12993i0 != null) {
            return 51;
        }
        return this.f12991g0 ? 50 : 49;
    }

    public f1(v4<?> v4Var, TdApi.PageBlockMap pageBlockMap) {
        super(v4Var, pageBlockMap);
        String str;
        this.Z = pageBlockMap;
        k0(pageBlockMap.caption);
        if (he.i.c2().g1(true) != 2) {
            int i10 = pageBlockMap.width;
            int i11 = pageBlockMap.height;
            if (i10 > 1024 || i11 > 1024) {
                float max = 1024.0f / Math.max(i10, i11);
                i10 = (int) (i10 * max);
                i11 = (int) (i11 * max);
            }
            int max2 = Math.max(14, i10);
            int max3 = Math.max(14, i11);
            int i12 = a0.h() >= 2.0f ? 2 : 1;
            int i13 = max2 / i12;
            int i14 = max3 / i12;
            int max4 = Math.max(13, Math.min(20, pageBlockMap.zoom));
            o6 c10 = v4Var.c();
            TdApi.GetMapThumbnailFile getMapThumbnailFile = new TdApi.GetMapThumbnailFile(pageBlockMap.location, max4, i13, i14, i12, 0L);
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
            this.f12985a0 = new j(c10, getMapThumbnailFile, sb2.toString());
        } else {
            o6 c11 = v4Var.c();
            TdApi.Location location = pageBlockMap.location;
            j jVar = new j(v4Var.c(), v0.I0(c11, location.latitude, location.longitude, pageBlockMap.zoom, false, pageBlockMap.width, pageBlockMap.height, null), new TdApi.FileTypeThumbnail());
            this.f12985a0 = jVar;
            jVar.s0(2);
        }
        this.f12985a0.s0(2);
    }

    public f1(v4<?> v4Var, TdApi.PageBlockAnimation pageBlockAnimation) {
        super(v4Var, pageBlockAnimation);
        this.f12991g0 = true;
        if (pageBlockAnimation.animation != null) {
            f0 f0Var = new f0(v4Var.t(), v4Var.c(), pageBlockAnimation.animation, 0L, 0L, null, false, true, !pageBlockAnimation.needAutoplay, null);
            this.W = f0Var;
            d0(f0Var);
            k0(pageBlockAnimation.caption);
        }
    }

    public f1(v4<?> v4Var, TdApi.PageBlockVideo pageBlockVideo) {
        super(v4Var, pageBlockVideo);
        if (pageBlockVideo.video != null) {
            f0 f0Var = new f0(v4Var.t(), v4Var.c(), pageBlockVideo.video, 0L, 0L, (s4) null, false);
            this.W = f0Var;
            d0(f0Var);
            k0(pageBlockVideo.caption);
        }
    }

    public f1(v4<?> v4Var, TdApi.PageBlockCollage pageBlockCollage) {
        super(v4Var, pageBlockCollage);
        k0(pageBlockCollage.caption);
        i0(pageBlockCollage.pageBlocks);
        ArrayList<f0> arrayList = this.f12986b0;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f12993i0 = new l(this.f12986b0, a0.i(2.0f));
        }
    }

    public f1(v4<?> v4Var, TdApi.PageBlockSlideshow pageBlockSlideshow) {
        super(v4Var, pageBlockSlideshow);
        this.Y = true;
        k0(pageBlockSlideshow.caption);
        i0(pageBlockSlideshow.pageBlocks);
    }

    public f1(v4<?> v4Var, TdApi.PageBlockEmbedded pageBlockEmbedded) {
        super(v4Var, pageBlockEmbedded);
        this.f12994j0 = pageBlockEmbedded;
        TdApi.Photo photo = pageBlockEmbedded.posterPhoto;
        if (photo != null) {
            if (photo.minithumbnail != null) {
                ld.i iVar = new ld.i(pageBlockEmbedded.posterPhoto.minithumbnail);
                this.f12995k0 = iVar;
                iVar.s0(2);
            }
            TdApi.PhotoSize l10 = f0.l(pageBlockEmbedded.posterPhoto);
            TdApi.PhotoSize o10 = f0.o(pageBlockEmbedded.posterPhoto, l10);
            if (l10 != null) {
                h hVar = new h(v4Var.c(), l10.photo);
                this.f12996l0 = hVar;
                hVar.s0(2);
            }
            if (o10 != null) {
                h hVar2 = new h(v4Var.c(), o10.photo);
                this.f12997m0 = hVar2;
                hVar2.s0(2);
                f0.i(this.f12997m0, o10);
            }
        }
        k0(pageBlockEmbedded.caption);
    }
}
