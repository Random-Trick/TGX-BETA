package gd;

import android.graphics.Path;
import cd.View$OnClickListenerC2096i;
import java.util.ArrayList;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p156kd.C6246h;
import p168ld.C6503j;
import p193nb.C7321e;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class C4817v6 {
    public final C10930q6 f16414a;
    public final TdApi.StickerSetInfo f16415b;
    public final C6246h f16416c;
    public final TdApi.ClosedVectorPath[] f16417d;
    public final int f16418e;
    public final int f16419f;
    public final C6503j f16420g;
    public int f16421h;
    public int f16422i;
    public int f16423j;
    public TdApi.StickerSet f16424k;
    public ArrayList<C4817v6> f16425l;
    public AbstractC4818a f16426m;

    public interface AbstractC4818a {
        void mo25159B2(C4817v6 v6Var);
    }

    public C4817v6(C10930q6 q6Var, TdApi.Sticker[] stickerArr) {
        this.f16414a = q6Var;
        this.f16422i = stickerArr.length;
        this.f16415b = null;
        this.f16416c = null;
        this.f16420g = null;
        this.f16417d = null;
        this.f16419f = 0;
        this.f16418e = 0;
    }

    public void m25195A() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isInstalled = false;
        }
    }

    public void m25194B() {
        this.f16421h |= 1;
    }

    public void m25193C() {
        this.f16421h |= 4;
    }

    public void m25192D(int i) {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            stickerSetInfo.size = i;
        } else {
            this.f16422i = i;
        }
    }

    public void m25191E(int i) {
        this.f16423j = i;
    }

    public void m25190F(TdApi.StickerSet stickerSet) {
        this.f16424k = stickerSet;
    }

    public void m25189G(AbstractC4818a aVar) {
        this.f16426m = aVar;
    }

    public void m25188H(AbstractC9323v4<?> v4Var) {
        View$OnClickListenerC2096i iVar;
        TdApi.StickerSet stickerSet = this.f16424k;
        if (stickerSet != null) {
            TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
            stickerSet.isInstalled = stickerSetInfo.isInstalled;
            stickerSet.isArchived = stickerSetInfo.isArchived;
            stickerSet.isViewed = stickerSetInfo.isViewed;
            stickerSet.stickerType = stickerSetInfo.stickerType;
            iVar = View$OnClickListenerC2096i.m35622W1(v4Var, stickerSet);
        } else {
            TdApi.StickerSetInfo stickerSetInfo2 = this.f16415b;
            iVar = (stickerSetInfo2 == null || stickerSetInfo2.f25427id == 0) ? null : View$OnClickListenerC2096i.m35621X1(v4Var, stickerSetInfo2);
        }
        if (iVar != null && m25167s()) {
            iVar.m35623V1();
        }
    }

    public void m25187I(TdApi.StickerSetInfo stickerSetInfo) {
        TdApi.StickerSetInfo stickerSetInfo2 = this.f16415b;
        stickerSetInfo2.isViewed = stickerSetInfo.isViewed;
        stickerSetInfo2.isArchived = stickerSetInfo.isArchived;
        stickerSetInfo2.isInstalled = stickerSetInfo.isInstalled;
        stickerSetInfo2.covers = stickerSetInfo.covers;
    }

    public void m25186J() {
        AbstractC4818a aVar = this.f16426m;
        if (aVar != null) {
            aVar.mo25159B2(this);
        }
    }

    public int m25185a() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.covers.length;
        }
        return 0;
    }

    public int m25184b() {
        return this.f16423j + m25181e();
    }

    public long m25183c() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.f25427id;
        }
        return 0L;
    }

    public TdApi.StickerSetInfo m25182d() {
        return this.f16415b;
    }

    public int m25181e() {
        int i;
        if (m25167s()) {
            return 5;
        }
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            i = stickerSetInfo.size;
        } else if (m25172n()) {
            return this.f16422i;
        } else {
            i = this.f16422i;
        }
        return i + 1;
    }

    public boolean equals(Object obj) {
        TdApi.StickerSetInfo stickerSetInfo;
        if (obj == null || !(obj instanceof C4817v6)) {
            return false;
        }
        C4817v6 v6Var = (C4817v6) obj;
        if (v6Var.f16421h != this.f16421h) {
            return false;
        }
        TdApi.StickerSetInfo stickerSetInfo2 = v6Var.f16415b;
        return (stickerSetInfo2 == null && this.f16415b == null) || !(stickerSetInfo2 == null || (stickerSetInfo = this.f16415b) == null || stickerSetInfo2.f25427id != stickerSetInfo.f25427id);
    }

    public String m25180f() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.name;
        }
        return null;
    }

    public C6503j m25179g() {
        return this.f16420g;
    }

    public Path m25178h(int i) {
        int i2;
        int i3 = this.f16418e;
        if (i3 == 0 || (i2 = this.f16419f) == 0) {
            return null;
        }
        float f = i;
        return C7321e.m16964b(this.f16417d, Math.min(f / i3, f / i2));
    }

    public C6246h m25177i() {
        return this.f16416c;
    }

    public int m25176j() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        return stickerSetInfo != null ? stickerSetInfo.size : this.f16422i;
    }

    public int m25175k() {
        return this.f16423j;
    }

    public String m25174l() {
        if (m25172n()) {
            return "";
        }
        if (m25169q()) {
            return C4403w.m27871i1(R.string.RecentStickers);
        }
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.title;
        }
        return null;
    }

    public boolean m25173m() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        return stickerSetInfo != null && C7321e.m16976V0(stickerSetInfo.stickerType);
    }

    public boolean m25172n() {
        return (this.f16421h & 8) != 0;
    }

    public boolean m25171o() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        return stickerSetInfo != null && stickerSetInfo.isInstalled && !stickerSetInfo.isArchived;
    }

    public boolean m25170p() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        return stickerSetInfo != null && stickerSetInfo.stickerType.getConstructor() == -839756573;
    }

    public boolean m25169q() {
        return (this.f16421h & 1) != 0;
    }

    public boolean m25168r() {
        return (this.f16421h & 9) != 0;
    }

    public boolean m25167s() {
        return (this.f16421h & 4) != 0;
    }

    public boolean m25166t() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        return stickerSetInfo != null && stickerSetInfo.isViewed;
    }

    public boolean m25165u() {
        ArrayList<C4817v6> arrayList = this.f16425l;
        return (arrayList == null || arrayList.isEmpty() || this.f16425l.get(0).m25183c() == m25183c()) ? false : true;
    }

    public void m25164v(ArrayList<C4817v6> arrayList) {
        this.f16425l = arrayList;
    }

    public void m25163w() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isInstalled = false;
            stickerSetInfo.isArchived = true;
        }
    }

    public void m25162x() {
        this.f16421h |= 8;
    }

    public void m25161y() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isInstalled = true;
            stickerSetInfo.isArchived = false;
        }
    }

    public void m25160z() {
        TdApi.StickerSetInfo stickerSetInfo = this.f16415b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isArchived = false;
        }
    }

    public C4817v6(C10930q6 q6Var, TdApi.StickerSetInfo stickerSetInfo) {
        this.f16414a = q6Var;
        this.f16415b = stickerSetInfo;
        TdApi.Thumbnail thumbnail = stickerSetInfo.thumbnail;
        if (thumbnail != null) {
            this.f16417d = stickerSetInfo.thumbnailOutline;
            this.f16418e = thumbnail.width;
            this.f16419f = thumbnail.height;
            int i = 2;
            switch (thumbnail.format.getConstructor()) {
                case TdApi.ThumbnailFormatWebm.CONSTRUCTOR:
                case TdApi.ThumbnailFormatMpeg4.CONSTRUCTOR:
                    break;
                case TdApi.ThumbnailFormatGif.CONSTRUCTOR:
                    i = 1;
                    break;
                case TdApi.ThumbnailFormatTgs.CONSTRUCTOR:
                    i = 3;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
                this.f16420g = new C6503j(q6Var, stickerSetInfo.thumbnail.file, i);
                this.f16416c = null;
            } else {
                this.f16416c = C4779t2.m25705D5(q6Var, stickerSetInfo.thumbnail);
                this.f16420g = null;
            }
        } else {
            TdApi.Sticker[] stickerArr = stickerSetInfo.covers;
            if (stickerArr == null || stickerArr.length <= 0) {
                this.f16417d = null;
                this.f16416c = null;
                this.f16420g = null;
                this.f16419f = 0;
                this.f16418e = 0;
            } else {
                this.f16417d = stickerArr[0].outline;
                this.f16418e = stickerArr[0].width;
                this.f16419f = stickerArr[0].height;
                if (C7321e.m16976V0(stickerArr[0].type)) {
                    this.f16416c = null;
                    TdApi.Sticker[] stickerArr2 = stickerSetInfo.covers;
                    C6503j jVar = new C6503j(q6Var, stickerArr2[0].sticker, stickerArr2[0].type);
                    this.f16420g = jVar;
                    jVar.m20301F(true);
                } else {
                    TdApi.Sticker[] stickerArr3 = stickerSetInfo.covers;
                    if (stickerArr3[0].thumbnail != null) {
                        this.f16416c = C4779t2.m25705D5(q6Var, stickerArr3[0].thumbnail);
                        this.f16420g = null;
                    } else {
                        this.f16416c = null;
                        this.f16420g = null;
                    }
                }
            }
        }
        C6246h hVar = this.f16416c;
        if (hVar != null) {
            hVar.mo20768t0(ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize());
            this.f16416c.m20898s0(1);
            this.f16416c.m20890x0();
        }
        C6503j jVar2 = this.f16420g;
        if (jVar2 != null) {
            jVar2.m20301F(true);
            this.f16420g.m20298I(1);
        }
    }

    public C4817v6(p350yd.C10930q6 r16, org.drinkless.p210td.libcore.telegram.TdApi.StickerSet r17) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4817v6.<init>(yd.q6, org.drinkless.td.libcore.telegram.TdApi$StickerSet):void");
    }
}
