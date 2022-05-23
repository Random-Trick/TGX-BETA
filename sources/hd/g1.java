package hd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import gd.w;
import ib.i;
import je.t;
import je.x0;
import ld.b;
import ld.c;
import ld.h;
import ld.p;
import ld.v;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.hj;

public class g1 extends a1 {
    public final TdApi.PageBlockRelatedArticle W;
    public x0 X;
    public x0 Y;
    public x0 Z;
    public h f13020a0;
    public h f13021b0;
    public h f13022c0;
    public final hj.q f13023d0;

    public g1(v4<?> v4Var, TdApi.PageBlockRelatedArticles pageBlockRelatedArticles, TdApi.PageBlockRelatedArticle pageBlockRelatedArticle, hj.q qVar) {
        super(v4Var, pageBlockRelatedArticles);
        this.W = pageBlockRelatedArticle;
        this.f13023d0 = qVar;
        String str = null;
        if (!i.i(pageBlockRelatedArticle.title)) {
            this.X = new x0(pageBlockRelatedArticle.title, m1.k0(), t.c.f15478q, null).E(3).a(36);
        }
        if (!i.i(pageBlockRelatedArticle.description)) {
            this.Y = new x0(pageBlockRelatedArticle.description, m1.f0(), t.c.f15478q, null).E(3).a(32);
        }
        if (pageBlockRelatedArticle.publishDate != 0 && !i.j(pageBlockRelatedArticle.author)) {
            str = w.j1(R.string.format_ivRelatedInfo, m1.c0(v4Var.c(), pageBlockRelatedArticle.publishDate), pageBlockRelatedArticle.author);
        } else if (pageBlockRelatedArticle.publishDate != 0) {
            str = m1.c0(v4Var.c(), pageBlockRelatedArticle.publishDate);
        } else if (!i.j(pageBlockRelatedArticle.author)) {
            str = pageBlockRelatedArticle.author;
        }
        String str2 = str;
        if (!i.i(str2)) {
            this.Z = new x0(null, str2, m1.f0(), t.c.f15482u, 0, qVar);
        }
        TdApi.Photo photo = pageBlockRelatedArticle.photo;
        if (photo != null) {
            if (photo.minithumbnail != null) {
                ld.i iVar = new ld.i(pageBlockRelatedArticle.photo.minithumbnail);
                this.f13020a0 = iVar;
                iVar.s0(2);
                this.f13020a0.Z(true);
            }
            TdApi.PhotoSize K0 = e.K0(pageBlockRelatedArticle.photo.sizes);
            if (K0 != null) {
                h hVar = new h(v4Var.c(), K0.photo);
                this.f13021b0 = hVar;
                hVar.s0(2);
                this.f13021b0.Z(true);
                this.f13021b0.t0(a0.i(50.0f));
                if (Math.max(K0.width, K0.height) <= 320) {
                    h hVar2 = new h(v4Var.c(), K0.photo);
                    this.f13022c0 = hVar2;
                    hVar2.s0(2);
                    this.f13022c0.Z(true);
                    this.f13022c0.t0(a0.i(50.0f));
                }
            }
        }
    }

    @Override
    public boolean B(View view, MotionEvent motionEvent) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3 = this.X;
        return (x0Var3 != null && x0Var3.x(view, motionEvent)) || ((x0Var = this.Y) != null && x0Var.x(view, motionEvent)) || ((x0Var2 = this.Z) != null && x0Var2.x(view, motionEvent));
    }

    @Override
    public boolean G() {
        return true;
    }

    @Override
    public boolean K(View view, boolean z10) {
        if (z10) {
            this.f12692a.c().hd().G7(this.f12692a, this.W.url, new hj.q(this.f13023d0).i());
            return true;
        }
        this.f12692a.c().hd().E7(this.f12692a, this.W.url, new hj.q(this.f13023d0).i());
        return true;
    }

    @Override
    public void R(p pVar) {
        pVar.G(this.f13022c0);
    }

    @Override
    public void S(c cVar) {
        cVar.j(this.f13020a0, this.f13021b0);
    }

    @Override
    public int g(View view, int i10) {
        int i11 = i10 - (a0.i(16.0f) * 2);
        if (this.W.photo != null) {
            i11 -= a0.i(50.0f) + a0.i(12.0f);
        }
        x0 x0Var = this.X;
        int i12 = 3;
        if (x0Var != null) {
            x0Var.k(i11);
            i12 = 3 - this.X.r();
        }
        x0 x0Var2 = this.Y;
        if (x0Var2 != null) {
            x0Var2.E(i12);
            if (i12 > 0) {
                this.Y.k(i11);
            }
        }
        x0 x0Var3 = this.Z;
        if (x0Var3 != null) {
            x0Var3.k(i11);
        }
        return Math.max(this.W.photo != null ? (a0.i(12.0f) * 2) + a0.i(50.0f) : 0, p() + q());
    }

    @Override
    public <T extends View & ie.t> void j(T t10, Canvas canvas, v vVar, v vVar2, b bVar) {
        int i10 = a0.i(16.0f);
        int i11 = a0.i(12.0f);
        x0 x0Var = this.X;
        if (x0Var != null) {
            x0Var.e(canvas, i10, i11);
            i11 += this.X.getHeight() + a0.i(8.0f);
        }
        x0 x0Var2 = this.Y;
        if (x0Var2 != null && x0Var2.u() > 0) {
            this.Y.e(canvas, i10, i11);
            i11 += this.Y.getHeight() + a0.i(8.0f);
        }
        x0 x0Var3 = this.Z;
        if (x0Var3 != null) {
            x0Var3.e(canvas, i10, i11);
        }
        if (vVar != null) {
            int measuredWidth = t10.getMeasuredWidth();
            int i12 = (measuredWidth - a0.i(16.0f)) - a0.i(50.0f);
            int q10 = q();
            int i13 = measuredWidth - a0.i(16.0f);
            int q11 = q() + a0.i(50.0f);
            if (vVar2.e0()) {
                vVar.K0(i12, q10, i13, q11);
                if (vVar.e0()) {
                    vVar.u0(canvas, t());
                }
                vVar.draw(canvas);
            }
            vVar2.K0(i12, q10, i13, q11);
            vVar2.draw(canvas);
        }
    }

    @Override
    public int p() {
        x0 x0Var = this.X;
        int i10 = 0;
        if (x0Var != null) {
            i10 = 0 + x0Var.getHeight() + a0.i(8.0f);
        }
        x0 x0Var2 = this.Y;
        if (x0Var2 != null && x0Var2.u() > 0) {
            i10 += this.Y.getHeight() + a0.i(8.0f);
        }
        x0 x0Var3 = this.Z;
        if (x0Var3 != null) {
            i10 += x0Var3.getHeight() + a0.i(8.0f);
        }
        if (i10 > 0) {
            i10 -= a0.i(8.0f);
        }
        return i10 + a0.i(12.0f);
    }

    @Override
    public int q() {
        return a0.i(12.0f);
    }

    @Override
    public int t() {
        return a0.i(3.0f);
    }

    @Override
    public int y() {
        return this.W.photo != null ? 49 : 48;
    }
}
