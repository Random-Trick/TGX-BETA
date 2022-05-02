package gd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1399s0;
import be.C1410y;
import ie.C5428t;
import ie.C5457w0;
import ie.RunnableC5390g;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import me.C6861d2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p080fb.AbstractC4345j;
import p080fb.C4341g;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p292ud.C9773p0;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9323v4;

public abstract class AbstractC4576a1 implements C4341g.AbstractC4342a {
    public boolean f15026M;
    public boolean f15027N;
    public AbstractC4576a1 f15028O;
    public String f15029P;
    public boolean f15030Q;
    public boolean f15031R;
    public C4578b[] f15032S;
    public AbstractC4576a1 f15033T;
    public int f15034U;
    public int f15035V;
    public final AbstractC9323v4<?> f15036a;
    public final TdApi.PageBlock f15037b;
    public C4341g f15038c;

    public static class C4577a {
        public final TdApi.PageBlockList f15039a;
        public float f15040b;

        public C4577a(TdApi.PageBlockList pageBlockList) {
            this.f15039a = pageBlockList;
        }
    }

    public static class C4578b {
        public final C4577a f15041a;
        public final int f15042b;
        public final RunnableC5390g f15043c;
        public AbstractC4576a1 f15044d;

        public C4578b(C4577a aVar, int i, String str, C5457w0 w0Var) {
            this.f15041a = aVar;
            this.f15042b = i;
            this.f15043c = new RunnableC5390g.C5392b(str, C1357a0.m37541i(100.0f), w0Var, C5428t.AbstractC5435c.f17860q).m22884f();
        }
    }

    public static class C4579c {
        public final String f15045a;
        public final boolean f15046b;
        public final C9773p0.AbstractC9776c f15047c;
        public AbstractC4576a1 f15048d;
        public String f15049e;
        public boolean f15050f;
        public boolean f15051g;
        public boolean f15052h;
        public AbstractC4576a1 f15053i;
        public final int f15054j;
        public C4578b[] f15055k;
        public AbstractC4576a1 f15056l;
        public boolean f15057m;

        public C4579c(String str, TdApi.WebPageInstantView webPageInstantView, C9773p0.AbstractC9776c cVar) {
            this.f15045a = str;
            this.f15046b = webPageInstantView.isRtl;
            this.f15054j = webPageInstantView.viewCount;
            this.f15047c = cVar;
        }

        public final void m27255r(AbstractC4576a1 a1Var, ArrayList<AbstractC4576a1> arrayList) {
            TdApi.PageBlock pageBlock;
            AbstractC4576a1 a1Var2;
            TdApi.PageBlock pageBlock2 = a1Var.f15037b;
            if (pageBlock2 != null) {
                boolean z = true;
                boolean z2 = !this.f15051g && this.f15055k == null && this.f15056l == null && pageBlock2.getConstructor() == 886429480;
                AbstractC9323v4<?> v4Var = a1Var.f15036a;
                if (pageBlock2.getConstructor() == -202091253) {
                    z = false;
                }
                m27251v(z2, v4Var, arrayList, z);
            }
            AbstractC4576a1 a1Var3 = this.f15048d;
            if (!(a1Var3 == null || a1Var3 == this.f15056l || (((pageBlock = a1Var3.f15037b) == null || pageBlock.getConstructor() != -1599869809) && ((a1Var2 = this.f15048d.f15033T) == null || a1Var2 == this.f15056l)))) {
                m27253t(new C4710n1(a1Var.f15036a, 36, R.id.theme_color_filling), arrayList);
            }
            m27253t(a1Var, arrayList);
        }

        public final void m27254s(AbstractC9323v4<?> v4Var, TdApi.PageBlock pageBlock, TdApi.PageBlockCaption pageBlockCaption, HandlerC10770jj.C10788q qVar, ArrayList<AbstractC4576a1> arrayList) {
            AbstractC4576a1 a1Var;
            AbstractC4576a1 a1Var2 = this.f15048d;
            boolean z = (a1Var2 != null && a1Var2.f15037b == pageBlock) || pageBlock.getConstructor() == 397600949;
            if (!C7321e.m16962b1(pageBlockCaption.text)) {
                a1Var = new C4699m1(v4Var, pageBlock, pageBlockCaption, false, this.f15050f, qVar);
                if (z) {
                    a1Var.mo26459K(this.f15048d);
                }
                m27255r(a1Var, arrayList);
            } else {
                a1Var = null;
            }
            if (!C7321e.m16962b1(pageBlockCaption.credit)) {
                C4699m1 m1Var = new C4699m1(v4Var, pageBlock, pageBlockCaption, true, this.f15050f, qVar);
                if (a1Var != null || z) {
                    if (a1Var == null) {
                        a1Var = this.f15048d;
                    }
                    m1Var.mo26459K(a1Var);
                }
                m27255r(m1Var, arrayList);
            }
        }

        public final void m27253t(AbstractC4576a1 a1Var, ArrayList<AbstractC4576a1> arrayList) {
            String str = this.f15049e;
            if (str != null) {
                a1Var.m27287U(str, false);
                this.f15049e = null;
            }
            if (this.f15050f && (a1Var instanceof C4632f1)) {
                ((C4632f1) a1Var).m26689m0();
            }
            if (this.f15051g) {
                a1Var.m27285W();
                AbstractC4576a1 a1Var2 = this.f15048d;
                if (a1Var2 != null && a1Var2.f15031R) {
                    a1Var.mo26459K(a1Var2);
                }
            }
            C4578b[] bVarArr = this.f15055k;
            if (bVarArr != null && !(a1Var instanceof C4710n1)) {
                if (bVarArr[bVarArr.length - 1].f15044d == null) {
                    bVarArr[bVarArr.length - 1].f15044d = a1Var;
                }
                a1Var.m27284X(bVarArr);
            }
            AbstractC4576a1 a1Var3 = this.f15056l;
            if (a1Var3 != null) {
                a1Var.m27286V(a1Var3);
            }
            this.f15048d = a1Var;
            arrayList.add(a1Var);
        }

        public final void m27252u(String str) {
            AbstractC4576a1 a1Var = this.f15048d;
            if (a1Var != null) {
                a1Var.m27287U(str, true);
            }
            this.f15049e = str;
        }

        public final void m27251v(boolean z, AbstractC9323v4<?> v4Var, ArrayList<AbstractC4576a1> arrayList, boolean z2) {
            AbstractC4576a1 a1Var;
            TdApi.PageBlock pageBlock;
            if (this.f15052h != z) {
                this.f15052h = z;
                if (z2 && z && ((a1Var = this.f15048d) == null || (pageBlock = a1Var.f15037b) == null || !(pageBlock.getConstructor() == -1599869809 || this.f15048d.f15037b.getConstructor() == -202091253))) {
                    m27253t(new C4710n1(v4Var, 36, R.id.theme_color_filling), arrayList);
                }
                m27253t(new C4710n1(v4Var, z ? 3 : 2, 0), arrayList);
                if (z2 && !z) {
                    m27253t(new C4710n1(v4Var, 36, R.id.theme_color_filling), arrayList);
                }
            }
        }
    }

    public AbstractC4576a1(AbstractC9323v4<?> v4Var, TdApi.PageBlock pageBlock) {
        this.f15036a = v4Var;
        this.f15037b = pageBlock;
        C4341g gVar = new C4341g();
        this.f15038c = gVar;
        gVar.m28233r(this);
    }

    public static ArrayList<AbstractC4576a1> m27289N(AbstractC9323v4<?> v4Var, String str, TdApi.WebPageInstantView webPageInstantView, AbstractC4576a1 a1Var, C9773p0.AbstractC9776c cVar, HandlerC10770jj.C10788q qVar) {
        C4579c cVar2 = new C4579c(str, webPageInstantView, cVar);
        cVar2.f15048d = a1Var;
        cVar2.f15056l = a1Var;
        TdApi.PageBlock[] pageBlockArr = a1Var != null ? ((TdApi.PageBlockDetails) a1Var.m27273y()).pageBlocks : webPageInstantView.pageBlocks;
        boolean z = a1Var != null && pageBlockArr.length > 0;
        ArrayList<AbstractC4576a1> arrayList = new ArrayList<>(pageBlockArr.length);
        if (z) {
            cVar2.m27255r(new C4710n1(v4Var, 36, R.id.theme_color_filling), arrayList);
        }
        for (TdApi.PageBlock pageBlock : pageBlockArr) {
            m27288O(v4Var, arrayList, cVar2, pageBlock, qVar);
        }
        if (z) {
            cVar2.m27255r(new C4710n1(v4Var, 36, R.id.theme_color_filling), arrayList);
        }
        if (a1Var == null) {
            cVar2.m27251v(true, v4Var, arrayList, true);
            v4Var.mo4348c().m2598W6(str, true);
            int i = webPageInstantView.viewCount;
        }
        return arrayList;
    }

    public static void m27288O(AbstractC9323v4<?> v4Var, ArrayList<AbstractC4576a1> arrayList, C4579c cVar, TdApi.PageBlock pageBlock, HandlerC10770jj.C10788q qVar) {
        C4658i h;
        TdApi.PageBlockRelatedArticle[] pageBlockRelatedArticleArr;
        int z;
        C4632f1 f1Var = null;
        int i = 0;
        int i2 = 1;
        switch (pageBlock.getConstructor()) {
            case TdApi.PageBlockEmbedded.CONSTRUCTOR:
                TdApi.PageBlockEmbedded pageBlockEmbedded = (TdApi.PageBlockEmbedded) pageBlock;
                if (!(pageBlockEmbedded.posterPhoto == null || (h = C4658i.m26604h(pageBlockEmbedded)) == null)) {
                    f1Var = new C4632f1(v4Var, new TdApi.PageBlockPhoto(pageBlockEmbedded.posterPhoto, pageBlockEmbedded.caption, null), h, null);
                }
                if (f1Var == null) {
                    f1Var = new C4632f1(v4Var, pageBlockEmbedded);
                }
                cVar.m27255r(f1Var, arrayList);
                cVar.m27254s(v4Var, pageBlockEmbedded, pageBlockEmbedded.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockRelatedArticles.CONSTRUCTOR:
                TdApi.PageBlockRelatedArticles pageBlockRelatedArticles = (TdApi.PageBlockRelatedArticles) pageBlock;
                cVar.m27251v(true, v4Var, arrayList, true);
                if (!C7321e.m16962b1(pageBlockRelatedArticles.header)) {
                    cVar.m27251v(false, v4Var, arrayList, true);
                    cVar.m27255r(new C4699m1(v4Var, pageBlockRelatedArticles, qVar), arrayList);
                } else {
                    cVar.m27251v(false, v4Var, arrayList, false);
                }
                int i3 = 0;
                for (TdApi.PageBlockRelatedArticle pageBlockRelatedArticle : pageBlockRelatedArticles.articles) {
                    if (i3 > 0) {
                        cVar.m27255r(new C4710n1(v4Var, 11, R.id.theme_color_filling), arrayList);
                    }
                    cVar.m27255r(new C4642g1(v4Var, pageBlockRelatedArticles, pageBlockRelatedArticle, qVar), arrayList);
                    i3++;
                }
                cVar.m27251v(true, v4Var, arrayList, false);
                return;
            case TdApi.PageBlockDetails.CONSTRUCTOR:
                TdApi.PageBlockDetails pageBlockDetails = (TdApi.PageBlockDetails) pageBlock;
                C4699m1 m1Var = new C4699m1(v4Var, pageBlockDetails, qVar);
                if (pageBlockDetails.isOpen) {
                    cVar.m27255r(m1Var, arrayList);
                    AbstractC4576a1 a1Var = cVar.f15056l;
                    cVar.f15056l = m1Var;
                    for (TdApi.PageBlock pageBlock2 : pageBlockDetails.pageBlocks) {
                        m27288O(v4Var, arrayList, cVar, pageBlock2, qVar);
                    }
                    cVar.f15056l = a1Var;
                    return;
                }
                cVar.m27255r(m1Var, arrayList);
                return;
            case TdApi.PageBlockPreformatted.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockPreformatted) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockList.CONSTRUCTOR:
                TdApi.PageBlockList pageBlockList = (TdApi.PageBlockList) pageBlock;
                C4577a aVar = new C4577a(pageBlockList);
                TdApi.PageBlockListItem[] pageBlockListItemArr = pageBlockList.items;
                int length = pageBlockListItemArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    TdApi.PageBlockListItem pageBlockListItem = pageBlockListItemArr[i4];
                    C4578b bVar = new C4578b(aVar, i5, pageBlockListItem.label, C4699m1.m26444k0());
                    aVar.f15040b = Math.max(aVar.f15040b, bVar.f15043c.getWidth());
                    C4578b[] bVarArr = cVar.f15055k;
                    if (bVarArr == null) {
                        C4578b[] bVarArr2 = new C4578b[i2];
                        bVarArr2[i] = bVar;
                        cVar.f15055k = bVarArr2;
                    } else {
                        cVar.f15055k = new C4578b[bVarArr.length + i2];
                        System.arraycopy(bVarArr, i, cVar.f15055k, i, bVarArr.length);
                        cVar.f15055k[bVarArr.length] = bVar;
                    }
                    int size = arrayList.size();
                    for (TdApi.PageBlock pageBlock3 : pageBlockListItem.pageBlocks) {
                        m27288O(v4Var, arrayList, cVar, pageBlock3, qVar);
                    }
                    if (arrayList.size() - size == 0) {
                        cVar.m27255r(new C4699m1(v4Var, pageBlockList, qVar), arrayList);
                    }
                    cVar.f15055k = bVarArr;
                    i5++;
                    i4++;
                    i = 0;
                    i2 = 1;
                }
                return;
            case TdApi.PageBlockTable.CONSTRUCTOR:
                TdApi.PageBlockTable pageBlockTable = (TdApi.PageBlockTable) pageBlock;
                if (!C7321e.m16962b1(pageBlockTable.caption)) {
                    cVar.m27255r(new C4699m1(v4Var, pageBlockTable, qVar), arrayList);
                }
                cVar.m27255r(new C4721o1(v4Var, pageBlockTable, cVar.f15046b, qVar), arrayList);
                return;
            case TdApi.PageBlockAnchor.CONSTRUCTOR:
                cVar.m27252u(((TdApi.PageBlockAnchor) pageBlock).name);
                return;
            case TdApi.PageBlockDivider.CONSTRUCTOR:
                cVar.m27255r(new C4590b1(v4Var, pageBlock), arrayList);
                return;
            case TdApi.PageBlockChatLink.CONSTRUCTOR:
                if (cVar.f15053i != null && ((z = cVar.f15053i.mo26319z()) == 49 || z == 50)) {
                    C4699m1 m1Var2 = new C4699m1(v4Var, (TdApi.PageBlockChatLink) pageBlock, true, cVar.f15054j, qVar);
                    m1Var2.f15038c = cVar.f15053i.f15038c;
                    cVar.f15053i.f15028O = m1Var2;
                    i = 1;
                }
                if (i == 0) {
                    cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockChatLink) pageBlock, false, cVar.f15054j, qVar), arrayList);
                    return;
                }
                return;
            case TdApi.PageBlockAudio.CONSTRUCTOR:
                TdApi.PageBlockAudio pageBlockAudio = (TdApi.PageBlockAudio) pageBlock;
                if (pageBlockAudio.audio != null) {
                    cVar.m27255r(new C4599c1(v4Var, pageBlockAudio, cVar.f15045a, cVar.f15047c), arrayList);
                }
                cVar.m27254s(v4Var, pageBlockAudio, pageBlockAudio.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockSubtitle.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockSubtitle) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockEmbeddedPost.CONSTRUCTOR:
                TdApi.PageBlockEmbeddedPost pageBlockEmbeddedPost = (TdApi.PageBlockEmbeddedPost) pageBlock;
                cVar.f15051g = true;
                cVar.f15048d = null;
                cVar.m27255r(new C4699m1(v4Var, pageBlockEmbeddedPost, qVar), arrayList);
                for (TdApi.PageBlock pageBlock4 : pageBlockEmbeddedPost.pageBlocks) {
                    m27288O(v4Var, arrayList, cVar, pageBlock4, qVar);
                }
                cVar.m27254s(v4Var, pageBlockEmbeddedPost, pageBlockEmbeddedPost.caption, qVar, arrayList);
                cVar.f15051g = false;
                return;
            case TdApi.PageBlockPhoto.CONSTRUCTOR:
                TdApi.PageBlockPhoto pageBlockPhoto = (TdApi.PageBlockPhoto) pageBlock;
                cVar.m27255r(new C4632f1(v4Var, pageBlockPhoto, null, qVar), arrayList);
                cVar.m27254s(v4Var, pageBlockPhoto, pageBlockPhoto.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockPullQuote.CONSTRUCTOR:
                TdApi.PageBlockPullQuote pageBlockPullQuote = (TdApi.PageBlockPullQuote) pageBlock;
                C4699m1 m1Var3 = new C4699m1(v4Var, pageBlockPullQuote, false, qVar);
                cVar.m27255r(m1Var3, arrayList);
                if (!C7321e.m16962b1(pageBlockPullQuote.credit)) {
                    C4699m1 m1Var4 = new C4699m1(v4Var, pageBlockPullQuote, true, qVar);
                    m1Var4.mo26459K(m1Var3);
                    cVar.m27255r(m1Var4, arrayList);
                    return;
                }
                return;
            case TdApi.PageBlockVideo.CONSTRUCTOR:
                TdApi.PageBlockVideo pageBlockVideo = (TdApi.PageBlockVideo) pageBlock;
                cVar.m27255r(new C4632f1(v4Var, pageBlockVideo), arrayList);
                cVar.m27254s(v4Var, pageBlockVideo, pageBlockVideo.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockSlideshow.CONSTRUCTOR:
                TdApi.PageBlockSlideshow pageBlockSlideshow = (TdApi.PageBlockSlideshow) pageBlock;
                TdApi.PageBlock[] pageBlockArr = pageBlockSlideshow.pageBlocks;
                if (pageBlockArr.length != 0) {
                    int length2 = pageBlockArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            i = 1;
                        } else {
                            int constructor = pageBlockArr[i6].getConstructor();
                            if (constructor == 417601156 || constructor == 510041394 || constructor == 1355669513) {
                                i6++;
                            }
                        }
                    }
                    if (i != 0) {
                        cVar.m27255r(new C4632f1(v4Var, pageBlockSlideshow), arrayList);
                        cVar.m27254s(v4Var, pageBlockSlideshow, pageBlockSlideshow.caption, qVar, arrayList);
                        return;
                    }
                    return;
                }
                return;
            case TdApi.PageBlockFooter.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockFooter) pageBlock, cVar.f15051g, qVar), arrayList);
                return;
            case TdApi.PageBlockCover.CONSTRUCTOR:
                TdApi.PageBlockCover pageBlockCover = (TdApi.PageBlockCover) pageBlock;
                cVar.f15050f = true;
                m27288O(v4Var, arrayList, cVar, pageBlockCover.cover, qVar);
                cVar.f15050f = false;
                for (int size2 = arrayList.size(); size2 < arrayList.size(); size2++) {
                    if (arrayList.get(size2).f15037b == pageBlockCover.cover) {
                        cVar.f15053i = arrayList.get(size2);
                        return;
                    }
                }
                return;
            case TdApi.PageBlockCollage.CONSTRUCTOR:
                TdApi.PageBlockCollage pageBlockCollage = (TdApi.PageBlockCollage) pageBlock;
                TdApi.PageBlock[] pageBlockArr2 = pageBlockCollage.pageBlocks;
                if (pageBlockArr2.length != 0) {
                    int length3 = pageBlockArr2.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length3) {
                            i = 1;
                        } else {
                            int constructor2 = pageBlockArr2[i7].getConstructor();
                            if (constructor2 == 417601156 || constructor2 == 510041394 || constructor2 == 1355669513) {
                                i7++;
                            }
                        }
                    }
                    if (i != 0) {
                        cVar.m27255r(new C4632f1(v4Var, pageBlockCollage), arrayList);
                        cVar.m27254s(v4Var, pageBlockCollage, pageBlockCollage.caption, qVar, arrayList);
                        return;
                    }
                    return;
                }
                return;
            case TdApi.PageBlockParagraph.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockParagraph) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockSubheader.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockSubheader) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockAuthorDate.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockAuthorDate) pageBlock, cVar.f15054j, qVar), arrayList);
                return;
            case TdApi.PageBlockAnimation.CONSTRUCTOR:
                TdApi.PageBlockAnimation pageBlockAnimation = (TdApi.PageBlockAnimation) pageBlock;
                cVar.m27255r(new C4632f1(v4Var, pageBlockAnimation), arrayList);
                cVar.m27254s(v4Var, pageBlockAnimation, pageBlockAnimation.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockKicker.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockKicker) pageBlock, qVar), arrayList);
                cVar.f15057m = true;
                return;
            case TdApi.PageBlockHeader.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockHeader) pageBlock, qVar), arrayList);
                return;
            case TdApi.PageBlockMap.CONSTRUCTOR:
                TdApi.PageBlockMap pageBlockMap = (TdApi.PageBlockMap) pageBlock;
                cVar.m27255r(new C4632f1(v4Var, pageBlockMap), arrayList);
                cVar.m27254s(v4Var, pageBlockMap, pageBlockMap.caption, qVar, arrayList);
                return;
            case TdApi.PageBlockTitle.CONSTRUCTOR:
                cVar.m27255r(new C4699m1(v4Var, (TdApi.PageBlockTitle) pageBlock, arrayList.isEmpty(), cVar.f15057m, qVar), arrayList);
                return;
            case TdApi.PageBlockBlockQuote.CONSTRUCTOR:
                TdApi.PageBlockBlockQuote pageBlockBlockQuote = (TdApi.PageBlockBlockQuote) pageBlock;
                C4699m1 m1Var5 = new C4699m1(v4Var, pageBlockBlockQuote, false, qVar);
                cVar.m27255r(m1Var5, arrayList);
                if (!C7321e.m16962b1(pageBlockBlockQuote.credit)) {
                    C4699m1 m1Var6 = new C4699m1(v4Var, pageBlockBlockQuote, true, qVar);
                    m1Var6.mo26459K(m1Var5);
                    cVar.m27255r(m1Var6, arrayList);
                    return;
                }
                return;
            case TdApi.PageBlockVoiceNote.CONSTRUCTOR:
                TdApi.PageBlockVoiceNote pageBlockVoiceNote = (TdApi.PageBlockVoiceNote) pageBlock;
                if (pageBlockVoiceNote.voiceNote != null) {
                    cVar.m27255r(new C4599c1(v4Var, pageBlockVoiceNote, cVar.f15045a, cVar.f15047c), arrayList);
                }
                cVar.m27254s(v4Var, pageBlockVoiceNote, pageBlockVoiceNote.caption, qVar, arrayList);
                return;
            default:
                throw new UnsupportedOperationException(pageBlock.toString());
        }
    }

    public int m27297A() {
        return m27274x(true) - m27274x(false);
    }

    public final AbstractC4345j m27296B() {
        return this.f15038c;
    }

    public abstract boolean mo26325C(View view, MotionEvent motionEvent);

    public boolean mo26462D(String str) {
        return false;
    }

    public final void m27295E(View view) {
        int i = this.f15034U;
        if (i != 0) {
            this.f15034U = 0;
            int i2 = this.f15035V;
            this.f15035V = mo26323f(view, i);
            AbstractC4576a1 a1Var = this.f15028O;
            if (a1Var != null) {
                this.f15035V = Math.max(a1Var.m27277s(view, i), this.f15035V);
            }
            if (i2 != this.f15035V) {
                this.f15038c.requestLayout();
            }
        }
    }

    public boolean m27294F() {
        return this.f15030Q;
    }

    public boolean m27293G(AbstractC4576a1 a1Var) {
        for (AbstractC4576a1 a1Var2 = this.f15033T; a1Var2 != null; a1Var2 = a1Var2.f15033T) {
            if (a1Var2 == a1Var) {
                return true;
            }
        }
        return false;
    }

    public boolean mo26460H() {
        return false;
    }

    public boolean m27292I() {
        return this.f15032S == null && this.f15033T == null && !this.f15031R;
    }

    public boolean m27291J() {
        return true;
    }

    public void mo26459K(AbstractC4576a1 a1Var) {
        this.f15027N = true;
        a1Var.f15026M = true;
    }

    public boolean mo26659L(View view, boolean z) {
        return false;
    }

    public final boolean m27290M(View view, MotionEvent motionEvent) {
        if (this.f15028O != null) {
            int q = (mo26320q() + mo26321p()) - this.f15028O.m27278o();
            motionEvent.offsetLocation(0.0f, -q);
            if (this.f15028O.m27290M(view, motionEvent)) {
                return true;
            }
            motionEvent.offsetLocation(0.0f, q);
        }
        return mo26325C(view, motionEvent);
    }

    public void mo26708P(C6238b bVar, boolean z) {
    }

    public void mo26707Q(RunnableC6507m mVar) {
    }

    public void mo26324R(C6238b bVar) {
        AbstractC4576a1 a1Var = this.f15028O;
        if (a1Var != null) {
            a1Var.mo26324R(bVar);
        } else {
            bVar.m20999d();
        }
    }

    public void mo26458S(C6257p pVar) {
    }

    public void mo26457T(C6240c cVar) {
    }

    public final void m27287U(String str, boolean z) {
        this.f15029P = str;
        this.f15030Q = z;
    }

    public void m27286V(AbstractC4576a1 a1Var) {
        this.f15033T = a1Var;
    }

    public void m27285W() {
        this.f15031R = true;
    }

    public void m27284X(C4578b[] bVarArr) {
        this.f15032S = bVarArr;
    }

    @Override
    public void mo13519a() {
        List<Reference<View>> n = this.f15038c.m28237n();
        if (!(n == null || n.isEmpty())) {
            for (int size = n.size() - 1; size >= 0; size--) {
                View view = n.get(size).get();
                if (view == null) {
                    n.remove(size);
                } else if (view instanceof C6861d2) {
                    ((C6861d2) view).m18741C0(true);
                }
            }
        }
    }

    public boolean mo26703b() {
        return false;
    }

    public void mo26701c(View view, FrameLayout.LayoutParams layoutParams, int i, int i2) {
    }

    public final void m27283d(View view) {
        this.f15038c.m28241j(view);
    }

    public void mo26698e() {
    }

    public abstract int mo26323f(View view, int i);

    public final void m27282g(View view) {
        this.f15038c.m28239l(view);
    }

    public final <T extends View & AbstractC5143t> void m27281h(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
        if (this.f15031R) {
            int N = C11524j.m228N(R.id.theme_color_iv_blockQuoteLine);
            RectF a0 = C1410y.m37050a0();
            int i = C1357a0.m37541i(3.0f);
            int i2 = C1357a0.m37541i(8.0f) / 2;
            int i3 = C1357a0.m37541i(16.0f);
            int q = mo26320q();
            int p = mo26321p();
            a0.top = q - i2;
            a0.bottom = q + i2 + p + C1357a0.m37541i(!this.f15026M ? 1.5f : 0.0f);
            a0.left = i3;
            a0.right = i3 + i;
            float f = i / 2;
            canvas.drawRoundRect(a0, f, f, C1410y.m37039g(N));
            if (this.f15027N) {
                canvas.drawRect(a0.left, 0.0f, a0.right, i + a0.top, C1410y.m37039g(N));
            }
            if (this.f15026M) {
                canvas.drawRect(a0.left, a0.bottom - i, a0.right, t.getMeasuredHeight(), C1410y.m37039g(N));
            }
            mo26322i(t, canvas, vVar, vVar2, bVar);
        } else {
            mo26322i(t, canvas, vVar, vVar2, bVar);
        }
        if (this.f15028O != null) {
            int V = C1399s0.m37199V(canvas);
            canvas.translate(0.0f, (mo26320q() + mo26321p()) - this.f15028O.m27278o());
            this.f15028O.m27281h(t, canvas, null, null, bVar);
            C1399s0.m37201T(canvas, V);
        }
    }

    public abstract <T extends View & AbstractC5143t> void mo26322i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar);

    public String m27280j() {
        return this.f15029P;
    }

    public int mo26385l() {
        return R.id.theme_color_filling;
    }

    public int m27279m() {
        return mo26320q();
    }

    public int mo26441n(String str, int i) {
        return 0;
    }

    public final int m27278o() {
        return this.f15035V;
    }

    public abstract int mo26321p();

    public abstract int mo26320q();

    public int mo26686r(boolean z) {
        if (this.f15032S == null) {
            return 0;
        }
        return C1357a0.m37541i((this.f15031R || !z) ? 16.0f : 10.0f);
    }

    public final int m27277s(View view, int i) {
        if (!(i == this.f15034U || i == 0)) {
            this.f15035V = mo26323f(view, i);
            AbstractC4576a1 a1Var = this.f15028O;
            if (a1Var != null) {
                this.f15035V = Math.max(a1Var.m27277s(view, i), this.f15035V);
            }
            this.f15034U = i;
        }
        return this.f15035V;
    }

    public int mo26658t() {
        return 0;
    }

    public C4578b[] m27276u() {
        return this.f15032S;
    }

    public int m27275w() {
        return this.f15034U;
    }

    public final int m27274x(boolean z) {
        if (!this.f15031R) {
            return mo26686r(z);
        }
        return C1357a0.m37541i(16.0f) + (z ? C1357a0.m37541i(12.0f) : mo26686r(z));
    }

    public TdApi.PageBlock m27273y() {
        return this.f15037b;
    }

    public abstract int mo26319z();
}
