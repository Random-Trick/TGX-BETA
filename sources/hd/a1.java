package hd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ce.a0;
import ce.p0;
import ce.y;
import gb.g;
import gb.j;
import java.util.ArrayList;
import java.util.Iterator;
import je.g;
import je.t;
import je.w0;
import ld.p;
import ld.v;
import md.m;
import ne.d2;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import vd.o0;
import zd.hj;

public abstract class a1 implements g.a {
    public boolean M;
    public boolean N;
    public a1 O;
    public String P;
    public boolean Q;
    public boolean R;
    public b[] S;
    public a1 T;
    public int U;
    public int V;
    public final v4<?> f12692a;
    public final TdApi.PageBlock f12693b;
    public g f12694c;

    public static class a {
        public final TdApi.PageBlockList f12695a;
        public float f12696b;

        public a(TdApi.PageBlockList pageBlockList) {
            this.f12695a = pageBlockList;
        }
    }

    public static class b {
        public final a f12697a;
        public final int f12698b;
        public final je.g f12699c;
        public a1 f12700d;

        public b(a aVar, int i10, String str, w0 w0Var) {
            this.f12697a = aVar;
            this.f12698b = i10;
            this.f12699c = new g.b(str, a0.i(100.0f), w0Var, t.c.f15478q).f();
        }
    }

    public static class c {
        public final String f12701a;
        public final boolean f12702b;
        public final o0.c f12703c;
        public a1 f12704d;
        public String f12705e;
        public boolean f12706f;
        public boolean f12707g;
        public boolean f12708h;
        public a1 f12709i;
        public final int f12710j;
        public b[] f12711k;
        public a1 f12712l;
        public boolean f12713m;

        public c(String str, TdApi.WebPageInstantView webPageInstantView, o0.c cVar) {
            this.f12701a = str;
            this.f12702b = webPageInstantView.isRtl;
            this.f12710j = webPageInstantView.viewCount;
            this.f12703c = cVar;
        }

        public final void r(a1 a1Var, ArrayList<a1> arrayList) {
            TdApi.PageBlock pageBlock;
            a1 a1Var2;
            TdApi.PageBlock pageBlock2 = a1Var.f12693b;
            if (pageBlock2 != null) {
                boolean z10 = true;
                boolean z11 = !this.f12707g && this.f12711k == null && this.f12712l == null && pageBlock2.getConstructor() == 886429480;
                v4<?> v4Var = a1Var.f12692a;
                if (pageBlock2.getConstructor() == -202091253) {
                    z10 = false;
                }
                v(z11, v4Var, arrayList, z10);
            }
            a1 a1Var3 = this.f12704d;
            if (!(a1Var3 == null || a1Var3 == this.f12712l || (((pageBlock = a1Var3.f12693b) == null || pageBlock.getConstructor() != -1599869809) && ((a1Var2 = this.f12704d.T) == null || a1Var2 == this.f12712l)))) {
                t(new n1(a1Var.f12692a, 36, R.id.theme_color_filling), arrayList);
            }
            t(a1Var, arrayList);
        }

        public final void s(v4<?> v4Var, TdApi.PageBlock pageBlock, TdApi.PageBlockCaption pageBlockCaption, hj.q qVar, ArrayList<a1> arrayList) {
            a1 a1Var;
            a1 a1Var2 = this.f12704d;
            boolean z10 = (a1Var2 != null && a1Var2.f12693b == pageBlock) || pageBlock.getConstructor() == 397600949;
            if (!e.d1(pageBlockCaption.text)) {
                a1Var = new m1(v4Var, pageBlock, pageBlockCaption, false, this.f12706f, qVar);
                if (z10) {
                    a1Var.J(this.f12704d);
                }
                r(a1Var, arrayList);
            } else {
                a1Var = null;
            }
            if (!e.d1(pageBlockCaption.credit)) {
                m1 m1Var = new m1(v4Var, pageBlock, pageBlockCaption, true, this.f12706f, qVar);
                if (a1Var != null || z10) {
                    if (a1Var == null) {
                        a1Var = this.f12704d;
                    }
                    m1Var.J(a1Var);
                }
                r(m1Var, arrayList);
            }
        }

        public final void t(a1 a1Var, ArrayList<a1> arrayList) {
            String str = this.f12705e;
            if (str != null) {
                a1Var.T(str, false);
                this.f12705e = null;
            }
            if (this.f12706f && (a1Var instanceof f1)) {
                ((f1) a1Var).l0();
            }
            if (this.f12707g) {
                a1Var.V();
                a1 a1Var2 = this.f12704d;
                if (a1Var2 != null && a1Var2.R) {
                    a1Var.J(a1Var2);
                }
            }
            b[] bVarArr = this.f12711k;
            if (bVarArr != null && !(a1Var instanceof n1)) {
                if (bVarArr[bVarArr.length - 1].f12700d == null) {
                    bVarArr[bVarArr.length - 1].f12700d = a1Var;
                }
                a1Var.W(bVarArr);
            }
            a1 a1Var3 = this.f12712l;
            if (a1Var3 != null) {
                a1Var.U(a1Var3);
            }
            this.f12704d = a1Var;
            arrayList.add(a1Var);
        }

        public final void u(String str) {
            a1 a1Var = this.f12704d;
            if (a1Var != null) {
                a1Var.T(str, true);
            }
            this.f12705e = str;
        }

        public final void v(boolean z10, v4<?> v4Var, ArrayList<a1> arrayList, boolean z11) {
            a1 a1Var;
            TdApi.PageBlock pageBlock;
            if (this.f12708h != z10) {
                this.f12708h = z10;
                if (z11 && z10 && ((a1Var = this.f12704d) == null || (pageBlock = a1Var.f12693b) == null || !(pageBlock.getConstructor() == -1599869809 || this.f12704d.f12693b.getConstructor() == -202091253))) {
                    t(new n1(v4Var, 36, R.id.theme_color_filling), arrayList);
                }
                t(new n1(v4Var, z10 ? 3 : 2, 0), arrayList);
                if (z11 && !z10) {
                    t(new n1(v4Var, 36, R.id.theme_color_filling), arrayList);
                }
            }
        }
    }

    public a1(v4<?> v4Var, TdApi.PageBlock pageBlock) {
        this.f12692a = v4Var;
        this.f12693b = pageBlock;
        gb.g gVar = new gb.g();
        this.f12694c = gVar;
        gVar.r(this);
    }

    public static ArrayList<a1> M(v4<?> v4Var, String str, TdApi.WebPageInstantView webPageInstantView, a1 a1Var, o0.c cVar, hj.q qVar) {
        c cVar2 = new c(str, webPageInstantView, cVar);
        cVar2.f12704d = a1Var;
        cVar2.f12712l = a1Var;
        TdApi.PageBlock[] pageBlockArr = a1Var != null ? ((TdApi.PageBlockDetails) a1Var.x()).pageBlocks : webPageInstantView.pageBlocks;
        boolean z10 = a1Var != null && pageBlockArr.length > 0;
        ArrayList<a1> arrayList = new ArrayList<>(pageBlockArr.length);
        if (z10) {
            cVar2.r(new n1(v4Var, 36, R.id.theme_color_filling), arrayList);
        }
        for (TdApi.PageBlock pageBlock : pageBlockArr) {
            N(v4Var, arrayList, cVar2, pageBlock, qVar);
        }
        if (z10) {
            cVar2.r(new n1(v4Var, 36, R.id.theme_color_filling), arrayList);
        }
        if (a1Var == null) {
            cVar2.v(true, v4Var, arrayList, true);
            v4Var.c().a7(str, true);
            int i10 = webPageInstantView.viewCount;
        }
        return arrayList;
    }

    public static void N(v4<?> v4Var, ArrayList<a1> arrayList, c cVar, TdApi.PageBlock pageBlock, hj.q qVar) {
        i h10;
        TdApi.PageBlockRelatedArticle[] pageBlockRelatedArticleArr;
        int y10;
        f1 f1Var = null;
        int i10 = 0;
        int i11 = 1;
        switch (pageBlock.getConstructor()) {
            case TdApi.PageBlockEmbedded.CONSTRUCTOR:
                TdApi.PageBlockEmbedded pageBlockEmbedded = (TdApi.PageBlockEmbedded) pageBlock;
                if (!(pageBlockEmbedded.posterPhoto == null || (h10 = i.h(pageBlockEmbedded)) == null)) {
                    f1Var = new f1(v4Var, new TdApi.PageBlockPhoto(pageBlockEmbedded.posterPhoto, pageBlockEmbedded.caption, null), h10, null);
                }
                if (f1Var == null) {
                    f1Var = new f1(v4Var, pageBlockEmbedded);
                }
                cVar.r(f1Var, arrayList);
                cVar.s(v4Var, pageBlockEmbedded, pageBlockEmbedded.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockRelatedArticles.CONSTRUCTOR:
                TdApi.PageBlockRelatedArticles pageBlockRelatedArticles = (TdApi.PageBlockRelatedArticles) pageBlock;
                cVar.v(true, v4Var, arrayList, true);
                if (!e.d1(pageBlockRelatedArticles.header)) {
                    cVar.v(false, v4Var, arrayList, true);
                    cVar.r(new m1(v4Var, pageBlockRelatedArticles, qVar), arrayList);
                } else {
                    cVar.v(false, v4Var, arrayList, false);
                }
                int i12 = 0;
                for (TdApi.PageBlockRelatedArticle pageBlockRelatedArticle : pageBlockRelatedArticles.articles) {
                    if (i12 > 0) {
                        cVar.r(new n1(v4Var, 11, R.id.theme_color_filling), arrayList);
                    }
                    cVar.r(new g1(v4Var, pageBlockRelatedArticles, pageBlockRelatedArticle, qVar), arrayList);
                    i12++;
                }
                cVar.v(true, v4Var, arrayList, false);
                return;
            case TdApi.PageBlockDetails.CONSTRUCTOR:
                TdApi.PageBlockDetails pageBlockDetails = (TdApi.PageBlockDetails) pageBlock;
                m1 m1Var = new m1(v4Var, pageBlockDetails, qVar);
                if (pageBlockDetails.isOpen) {
                    cVar.r(m1Var, arrayList);
                    a1 a1Var = cVar.f12712l;
                    cVar.f12712l = m1Var;
                    for (TdApi.PageBlock pageBlock2 : pageBlockDetails.pageBlocks) {
                        N(v4Var, arrayList, cVar, pageBlock2, qVar);
                    }
                    cVar.f12712l = a1Var;
                    return;
                }
                cVar.r(m1Var, arrayList);
                return;
            case TdApi.PageBlockPreformatted.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockPreformatted) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockList.CONSTRUCTOR:
                TdApi.PageBlockList pageBlockList = (TdApi.PageBlockList) pageBlock;
                a aVar = new a(pageBlockList);
                TdApi.PageBlockListItem[] pageBlockListItemArr = pageBlockList.items;
                int length = pageBlockListItemArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length) {
                    TdApi.PageBlockListItem pageBlockListItem = pageBlockListItemArr[i13];
                    b bVar = new b(aVar, i14, pageBlockListItem.label, m1.j0());
                    aVar.f12696b = Math.max(aVar.f12696b, bVar.f12699c.getWidth());
                    b[] bVarArr = cVar.f12711k;
                    if (bVarArr == null) {
                        b[] bVarArr2 = new b[i11];
                        bVarArr2[i10] = bVar;
                        cVar.f12711k = bVarArr2;
                    } else {
                        cVar.f12711k = new b[bVarArr.length + i11];
                        System.arraycopy(bVarArr, i10, cVar.f12711k, i10, bVarArr.length);
                        cVar.f12711k[bVarArr.length] = bVar;
                    }
                    int size = arrayList.size();
                    for (TdApi.PageBlock pageBlock3 : pageBlockListItem.pageBlocks) {
                        N(v4Var, arrayList, cVar, pageBlock3, qVar);
                    }
                    if (arrayList.size() - size == 0) {
                        cVar.r(new m1(v4Var, pageBlockList, qVar), arrayList);
                    }
                    cVar.f12711k = bVarArr;
                    i14++;
                    i13++;
                    i10 = 0;
                    i11 = 1;
                }
                return;
            case TdApi.PageBlockTable.CONSTRUCTOR:
                TdApi.PageBlockTable pageBlockTable = (TdApi.PageBlockTable) pageBlock;
                if (!e.d1(pageBlockTable.caption)) {
                    cVar.r(new m1(v4Var, pageBlockTable, qVar), arrayList);
                }
                cVar.r(new o1(v4Var, pageBlockTable, cVar.f12702b, qVar), arrayList);
                return;
            case TdApi.PageBlockAnchor.CONSTRUCTOR:
                cVar.u(((TdApi.PageBlockAnchor) pageBlock).name);
                return;
            case TdApi.PageBlockDivider.CONSTRUCTOR:
                cVar.r(new b1(v4Var, pageBlock), arrayList);
                return;
            case TdApi.PageBlockChatLink.CONSTRUCTOR:
                if (cVar.f12709i != null && ((y10 = cVar.f12709i.y()) == 49 || y10 == 50)) {
                    m1 m1Var2 = new m1(v4Var, (TdApi.PageBlockChatLink) pageBlock, true, cVar.f12710j, qVar);
                    m1Var2.f12694c = cVar.f12709i.f12694c;
                    cVar.f12709i.O = m1Var2;
                    i10 = 1;
                }
                if (i10 == 0) {
                    cVar.r(new m1(v4Var, (TdApi.PageBlockChatLink) pageBlock, false, cVar.f12710j, qVar), arrayList);
                    return;
                }
                return;
            case TdApi.PageBlockAudio.CONSTRUCTOR:
                TdApi.PageBlockAudio pageBlockAudio = (TdApi.PageBlockAudio) pageBlock;
                if (pageBlockAudio.audio != null) {
                    cVar.r(new c1(v4Var, pageBlockAudio, cVar.f12701a, cVar.f12703c), arrayList);
                }
                cVar.s(v4Var, pageBlockAudio, pageBlockAudio.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockSubtitle.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockSubtitle) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockEmbeddedPost.CONSTRUCTOR:
                TdApi.PageBlockEmbeddedPost pageBlockEmbeddedPost = (TdApi.PageBlockEmbeddedPost) pageBlock;
                cVar.f12707g = true;
                cVar.f12704d = null;
                cVar.r(new m1(v4Var, pageBlockEmbeddedPost, qVar), arrayList);
                for (TdApi.PageBlock pageBlock4 : pageBlockEmbeddedPost.pageBlocks) {
                    N(v4Var, arrayList, cVar, pageBlock4, qVar);
                }
                cVar.s(v4Var, pageBlockEmbeddedPost, pageBlockEmbeddedPost.caption, qVar, arrayList);
                cVar.f12707g = false;
                return;
            case TdApi.PageBlockPhoto.CONSTRUCTOR:
                TdApi.PageBlockPhoto pageBlockPhoto = (TdApi.PageBlockPhoto) pageBlock;
                cVar.r(new f1(v4Var, pageBlockPhoto, null, qVar), arrayList);
                cVar.s(v4Var, pageBlockPhoto, pageBlockPhoto.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockPullQuote.CONSTRUCTOR:
                TdApi.PageBlockPullQuote pageBlockPullQuote = (TdApi.PageBlockPullQuote) pageBlock;
                m1 m1Var3 = new m1(v4Var, pageBlockPullQuote, false, qVar);
                cVar.r(m1Var3, arrayList);
                if (!e.d1(pageBlockPullQuote.credit)) {
                    m1 m1Var4 = new m1(v4Var, pageBlockPullQuote, true, qVar);
                    m1Var4.J(m1Var3);
                    cVar.r(m1Var4, arrayList);
                    return;
                }
                return;
            case TdApi.PageBlockVideo.CONSTRUCTOR:
                TdApi.PageBlockVideo pageBlockVideo = (TdApi.PageBlockVideo) pageBlock;
                cVar.r(new f1(v4Var, pageBlockVideo), arrayList);
                cVar.s(v4Var, pageBlockVideo, pageBlockVideo.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockSlideshow.CONSTRUCTOR:
                TdApi.PageBlockSlideshow pageBlockSlideshow = (TdApi.PageBlockSlideshow) pageBlock;
                TdApi.PageBlock[] pageBlockArr = pageBlockSlideshow.pageBlocks;
                if (pageBlockArr.length != 0) {
                    int length2 = pageBlockArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length2) {
                            i10 = 1;
                        } else {
                            int constructor = pageBlockArr[i15].getConstructor();
                            if (constructor == 417601156 || constructor == 510041394 || constructor == 1355669513) {
                                i15++;
                            }
                        }
                    }
                    if (i10 != 0) {
                        cVar.r(new f1(v4Var, pageBlockSlideshow), arrayList);
                        cVar.s(v4Var, pageBlockSlideshow, pageBlockSlideshow.caption, qVar, arrayList);
                        return;
                    }
                    return;
                }
                return;
            case TdApi.PageBlockFooter.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockFooter) pageBlock, cVar.f12707g, qVar), arrayList);
                return;
            case TdApi.PageBlockCover.CONSTRUCTOR:
                TdApi.PageBlockCover pageBlockCover = (TdApi.PageBlockCover) pageBlock;
                cVar.f12706f = true;
                N(v4Var, arrayList, cVar, pageBlockCover.cover, qVar);
                cVar.f12706f = false;
                for (int size2 = arrayList.size(); size2 < arrayList.size(); size2++) {
                    if (arrayList.get(size2).f12693b == pageBlockCover.cover) {
                        cVar.f12709i = arrayList.get(size2);
                        return;
                    }
                }
                return;
            case TdApi.PageBlockCollage.CONSTRUCTOR:
                TdApi.PageBlockCollage pageBlockCollage = (TdApi.PageBlockCollage) pageBlock;
                TdApi.PageBlock[] pageBlockArr2 = pageBlockCollage.pageBlocks;
                if (pageBlockArr2.length != 0) {
                    int length3 = pageBlockArr2.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length3) {
                            i10 = 1;
                        } else {
                            int constructor2 = pageBlockArr2[i16].getConstructor();
                            if (constructor2 == 417601156 || constructor2 == 510041394 || constructor2 == 1355669513) {
                                i16++;
                            }
                        }
                    }
                    if (i10 != 0) {
                        cVar.r(new f1(v4Var, pageBlockCollage), arrayList);
                        cVar.s(v4Var, pageBlockCollage, pageBlockCollage.caption, qVar, arrayList);
                        return;
                    }
                    return;
                }
                return;
            case TdApi.PageBlockParagraph.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockParagraph) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockSubheader.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockSubheader) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockAuthorDate.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockAuthorDate) pageBlock, cVar.f12710j, qVar), arrayList);
                return;
            case TdApi.PageBlockAnimation.CONSTRUCTOR:
                TdApi.PageBlockAnimation pageBlockAnimation = (TdApi.PageBlockAnimation) pageBlock;
                cVar.r(new f1(v4Var, pageBlockAnimation), arrayList);
                cVar.s(v4Var, pageBlockAnimation, pageBlockAnimation.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockKicker.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockKicker) pageBlock, qVar), arrayList);
                cVar.f12713m = true;
                return;
            case TdApi.PageBlockHeader.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockHeader) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockMap.CONSTRUCTOR:
                TdApi.PageBlockMap pageBlockMap = (TdApi.PageBlockMap) pageBlock;
                cVar.r(new f1(v4Var, pageBlockMap), arrayList);
                cVar.s(v4Var, pageBlockMap, pageBlockMap.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockTitle.CONSTRUCTOR:
                cVar.r(new m1(v4Var, (TdApi.PageBlockTitle) pageBlock, arrayList.isEmpty(), cVar.f12713m, qVar), arrayList);
                return;
            case TdApi.PageBlockBlockQuote.CONSTRUCTOR:
                TdApi.PageBlockBlockQuote pageBlockBlockQuote = (TdApi.PageBlockBlockQuote) pageBlock;
                m1 m1Var5 = new m1(v4Var, pageBlockBlockQuote, false, qVar);
                cVar.r(m1Var5, arrayList);
                if (!e.d1(pageBlockBlockQuote.credit)) {
                    m1 m1Var6 = new m1(v4Var, pageBlockBlockQuote, true, qVar);
                    m1Var6.J(m1Var5);
                    cVar.r(m1Var6, arrayList);
                    return;
                }
                return;
            case TdApi.PageBlockVoiceNote.CONSTRUCTOR:
                TdApi.PageBlockVoiceNote pageBlockVoiceNote = (TdApi.PageBlockVoiceNote) pageBlock;
                if (pageBlockVoiceNote.voiceNote != null) {
                    cVar.r(new c1(v4Var, pageBlockVoiceNote, cVar.f12701a, cVar.f12703c), arrayList);
                }
                cVar.s(v4Var, pageBlockVoiceNote, pageBlockVoiceNote.caption, qVar, arrayList);
                return;
            default:
                throw new UnsupportedOperationException(pageBlock.toString());
        }
    }

    public final j A() {
        return this.f12694c;
    }

    public abstract boolean B(View view, MotionEvent motionEvent);

    public boolean C(String str) {
        return false;
    }

    public final void D(View view) {
        int i10 = this.U;
        if (i10 != 0) {
            this.U = 0;
            int i11 = this.V;
            this.V = g(view, i10);
            a1 a1Var = this.O;
            if (a1Var != null) {
                this.V = Math.max(a1Var.s(view, i10), this.V);
            }
            if (i11 != this.V) {
                this.f12694c.requestLayout();
            }
        }
    }

    public boolean E() {
        return this.Q;
    }

    public boolean F(a1 a1Var) {
        for (a1 a1Var2 = this.T; a1Var2 != null; a1Var2 = a1Var2.T) {
            if (a1Var2 == a1Var) {
                return true;
            }
        }
        return false;
    }

    public boolean G() {
        return false;
    }

    public boolean H() {
        return this.S == null && this.T == null && !this.R;
    }

    public boolean I() {
        return true;
    }

    public void J(a1 a1Var) {
        this.N = true;
        a1Var.M = true;
    }

    public boolean K(View view, boolean z10) {
        return false;
    }

    public final boolean L(View view, MotionEvent motionEvent) {
        if (this.O != null) {
            int q10 = (q() + p()) - this.O.o();
            motionEvent.offsetLocation(0.0f, -q10);
            if (this.O.L(view, motionEvent)) {
                return true;
            }
            motionEvent.offsetLocation(0.0f, q10);
        }
        return B(view, motionEvent);
    }

    public void O(ld.b bVar, boolean z10) {
    }

    public void P(m mVar) {
    }

    public void Q(ld.b bVar) {
        a1 a1Var = this.O;
        if (a1Var != null) {
            a1Var.Q(bVar);
        } else {
            bVar.d();
        }
    }

    public void R(p pVar) {
    }

    public void S(ld.c cVar) {
    }

    public final void T(String str, boolean z10) {
        this.P = str;
        this.Q = z10;
    }

    public void U(a1 a1Var) {
        this.T = a1Var;
    }

    public void V() {
        this.R = true;
    }

    public void W(b[] bVarArr) {
        this.S = bVarArr;
    }

    @Override
    public void a() {
        Iterator<View> it = this.f12694c.n().iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof d2) {
                ((d2) next).D0(true);
            }
        }
    }

    public boolean b() {
        return false;
    }

    public void c(View view, FrameLayout.LayoutParams layoutParams, int i10, int i11) {
    }

    public final void d(View view) {
        this.f12694c.j(view);
    }

    public void e() {
    }

    public abstract int g(View view, int i10);

    public final void h(View view) {
        this.f12694c.l(view);
    }

    public final <T extends View & ie.t> void i(T t10, Canvas canvas, v vVar, v vVar2, ld.b bVar) {
        if (this.R) {
            int L = ae.j.L(R.id.theme_color_iv_blockQuoteLine);
            RectF a02 = y.a0();
            int i10 = a0.i(3.0f);
            int i11 = a0.i(8.0f) / 2;
            int i12 = a0.i(16.0f);
            int q10 = q();
            int p10 = p();
            a02.top = q10 - i11;
            a02.bottom = q10 + i11 + p10 + a0.i(!this.M ? 1.5f : 0.0f);
            a02.left = i12;
            a02.right = i12 + i10;
            float f10 = i10 / 2;
            canvas.drawRoundRect(a02, f10, f10, y.g(L));
            if (this.N) {
                canvas.drawRect(a02.left, 0.0f, a02.right, i10 + a02.top, y.g(L));
            }
            if (this.M) {
                canvas.drawRect(a02.left, a02.bottom - i10, a02.right, t10.getMeasuredHeight(), y.g(L));
            }
            j(t10, canvas, vVar, vVar2, bVar);
        } else {
            j(t10, canvas, vVar, vVar2, bVar);
        }
        if (this.O != null) {
            int O = p0.O(canvas);
            canvas.translate(0.0f, (q() + p()) - this.O.o());
            this.O.i(t10, canvas, null, null, bVar);
            p0.N(canvas, O);
        }
    }

    public abstract <T extends View & ie.t> void j(T t10, Canvas canvas, v vVar, v vVar2, ld.b bVar);

    public String k() {
        return this.P;
    }

    public int l() {
        return R.id.theme_color_filling;
    }

    public int m() {
        return q();
    }

    public int n(String str, int i10) {
        return 0;
    }

    public final int o() {
        return this.V;
    }

    public abstract int p();

    public abstract int q();

    public int r(boolean z10) {
        if (this.S == null) {
            return 0;
        }
        return a0.i((this.R || !z10) ? 16.0f : 10.0f);
    }

    public final int s(View view, int i10) {
        if (!(i10 == this.U || i10 == 0)) {
            this.V = g(view, i10);
            a1 a1Var = this.O;
            if (a1Var != null) {
                this.V = Math.max(a1Var.s(view, i10), this.V);
            }
            this.U = i10;
        }
        return this.V;
    }

    public int t() {
        return 0;
    }

    public b[] u() {
        return this.S;
    }

    public int v() {
        return this.U;
    }

    public final int w(boolean z10) {
        if (!this.R) {
            return r(z10);
        }
        return a0.i(16.0f) + (z10 ? a0.i(12.0f) : r(z10));
    }

    public TdApi.PageBlock x() {
        return this.f12693b;
    }

    public abstract int y();

    public int z() {
        return w(true) - w(false);
    }
}
