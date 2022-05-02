package gd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import ie.C5428t;
import ie.C5459x0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6257p;
import p193nb.C7321e;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public class C4642g1 extends AbstractC4576a1 {
    public final TdApi.PageBlockRelatedArticle f15465W;
    public C5459x0 f15466X;
    public C5459x0 f15467Y;
    public C5459x0 f15468Z;
    public C6246h f15469a0;
    public C6246h f15470b0;
    public C6246h f15471c0;
    public final HandlerC10770jj.C10788q f15472d0;

    public C4642g1(AbstractC9323v4<?> v4Var, TdApi.PageBlockRelatedArticles pageBlockRelatedArticles, TdApi.PageBlockRelatedArticle pageBlockRelatedArticle, HandlerC10770jj.C10788q qVar) {
        super(v4Var, pageBlockRelatedArticles);
        this.f15465W = pageBlockRelatedArticle;
        this.f15472d0 = qVar;
        String str = null;
        if (!C5070i.m24061i(pageBlockRelatedArticle.title)) {
            this.f15466X = new C5459x0(pageBlockRelatedArticle.title, C4699m1.m26443l0(), C5428t.AbstractC5435c.f17860q, null).m22639E(3).m22635a(36);
        }
        if (!C5070i.m24061i(pageBlockRelatedArticle.description)) {
            this.f15467Y = new C5459x0(pageBlockRelatedArticle.description, C4699m1.m26448g0(), C5428t.AbstractC5435c.f17860q, null).m22639E(3).m22635a(32);
        }
        if (pageBlockRelatedArticle.publishDate != 0 && !C5070i.m24060j(pageBlockRelatedArticle.author)) {
            str = C4403w.m27865j1(R.string.format_ivRelatedInfo, C4699m1.m26451d0(v4Var.mo4348c(), pageBlockRelatedArticle.publishDate), pageBlockRelatedArticle.author);
        } else if (pageBlockRelatedArticle.publishDate != 0) {
            str = C4699m1.m26451d0(v4Var.mo4348c(), pageBlockRelatedArticle.publishDate);
        } else if (!C5070i.m24060j(pageBlockRelatedArticle.author)) {
            str = pageBlockRelatedArticle.author;
        }
        String str2 = str;
        if (!C5070i.m24061i(str2)) {
            this.f15468Z = new C5459x0(null, str2, C4699m1.m26448g0(), C5428t.AbstractC5435c.f17864u, 0, qVar);
        }
        TdApi.Photo photo = pageBlockRelatedArticle.photo;
        if (photo != null) {
            if (photo.minithumbnail != null) {
                C6250i iVar = new C6250i(pageBlockRelatedArticle.photo.minithumbnail);
                this.f15469a0 = iVar;
                iVar.m20897s0(2);
                this.f15469a0.m20930Z(true);
            }
            TdApi.PhotoSize I0 = C7321e.m17002I0(pageBlockRelatedArticle.photo.sizes);
            if (I0 != null) {
                C6246h hVar = new C6246h(v4Var.mo4348c(), I0.photo);
                this.f15470b0 = hVar;
                hVar.m20897s0(2);
                this.f15470b0.m20930Z(true);
                this.f15470b0.mo20767t0(C1357a0.m37541i(50.0f));
                if (Math.max(I0.width, I0.height) <= 320) {
                    C6246h hVar2 = new C6246h(v4Var.mo4348c(), I0.photo);
                    this.f15471c0 = hVar2;
                    hVar2.m20897s0(2);
                    this.f15471c0.m20930Z(true);
                    this.f15471c0.mo20767t0(C1357a0.m37541i(50.0f));
                }
            }
        }
    }

    @Override
    public boolean mo26325C(View view, MotionEvent motionEvent) {
        C5459x0 x0Var;
        C5459x0 x0Var2;
        C5459x0 x0Var3 = this.f15466X;
        return (x0Var3 != null && x0Var3.m22614x(view, motionEvent)) || ((x0Var = this.f15467Y) != null && x0Var.m22614x(view, motionEvent)) || ((x0Var2 = this.f15468Z) != null && x0Var2.m22614x(view, motionEvent));
    }

    @Override
    public boolean mo26460H() {
        return true;
    }

    @Override
    public boolean mo26659L(View view, boolean z) {
        if (z) {
            this.f15036a.mo4348c().m2485dd().m3838G7(this.f15036a, this.f15465W.url, new HandlerC10770jj.C10788q(this.f15472d0).m3322i());
            return true;
        }
        this.f15036a.mo4348c().m2485dd().m3858E7(this.f15036a, this.f15465W.url, new HandlerC10770jj.C10788q(this.f15472d0).m3322i());
        return true;
    }

    @Override
    public void mo26458S(C6257p pVar) {
        pVar.m20819G(this.f15471c0);
    }

    @Override
    public void mo26457T(C6240c cVar) {
        cVar.m20977j(this.f15469a0, this.f15470b0);
    }

    @Override
    public int mo26323f(View view, int i) {
        int i2 = i - (C1357a0.m37541i(16.0f) * 2);
        if (this.f15465W.photo != null) {
            i2 -= C1357a0.m37541i(50.0f) + C1357a0.m37541i(12.0f);
        }
        C5459x0 x0Var = this.f15466X;
        int i3 = 3;
        if (x0Var != null) {
            x0Var.m22627k(i2);
            i3 = 3 - this.f15466X.m22620r();
        }
        C5459x0 x0Var2 = this.f15467Y;
        if (x0Var2 != null) {
            x0Var2.m22639E(i3);
            if (i3 > 0) {
                this.f15467Y.m22627k(i2);
            }
        }
        C5459x0 x0Var3 = this.f15468Z;
        if (x0Var3 != null) {
            x0Var3.m22627k(i2);
        }
        return Math.max(this.f15465W.photo != null ? (C1357a0.m37541i(12.0f) * 2) + C1357a0.m37541i(50.0f) : 0, mo26321p() + mo26320q());
    }

    @Override
    public <T extends View & AbstractC5143t> void mo26322i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
        int i = C1357a0.m37541i(16.0f);
        int i2 = C1357a0.m37541i(12.0f);
        C5459x0 x0Var = this.f15466X;
        if (x0Var != null) {
            x0Var.m22632e(canvas, i, i2);
            i2 += this.f15466X.getHeight() + C1357a0.m37541i(8.0f);
        }
        C5459x0 x0Var2 = this.f15467Y;
        if (x0Var2 != null && x0Var2.m22617u() > 0) {
            this.f15467Y.m22632e(canvas, i, i2);
            i2 += this.f15467Y.getHeight() + C1357a0.m37541i(8.0f);
        }
        C5459x0 x0Var3 = this.f15468Z;
        if (x0Var3 != null) {
            x0Var3.m22632e(canvas, i, i2);
        }
        if (vVar != null) {
            int measuredWidth = t.getMeasuredWidth();
            int i3 = (measuredWidth - C1357a0.m37541i(16.0f)) - C1357a0.m37541i(50.0f);
            int q = mo26320q();
            int i4 = measuredWidth - C1357a0.m37541i(16.0f);
            int q2 = mo26320q() + C1357a0.m37541i(50.0f);
            if (vVar2.mo20246c0()) {
                vVar.mo20256K0(i3, q, i4, q2);
                if (vVar.mo20246c0()) {
                    vVar.mo20228u0(canvas, mo26658t());
                }
                vVar.draw(canvas);
            }
            vVar2.mo20256K0(i3, q, i4, q2);
            vVar2.draw(canvas);
        }
    }

    @Override
    public int mo26321p() {
        C5459x0 x0Var = this.f15466X;
        int i = 0;
        if (x0Var != null) {
            i = 0 + x0Var.getHeight() + C1357a0.m37541i(8.0f);
        }
        C5459x0 x0Var2 = this.f15467Y;
        if (x0Var2 != null && x0Var2.m22617u() > 0) {
            i += this.f15467Y.getHeight() + C1357a0.m37541i(8.0f);
        }
        C5459x0 x0Var3 = this.f15468Z;
        if (x0Var3 != null) {
            i += x0Var3.getHeight() + C1357a0.m37541i(8.0f);
        }
        if (i > 0) {
            i -= C1357a0.m37541i(8.0f);
        }
        return i + C1357a0.m37541i(12.0f);
    }

    @Override
    public int mo26320q() {
        return C1357a0.m37541i(12.0f);
    }

    @Override
    public int mo26658t() {
        return C1357a0.m37541i(3.0f);
    }

    @Override
    public int mo26319z() {
        return this.f15465W.photo != null ? 49 : 48;
    }
}
