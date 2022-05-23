package hd;

import android.graphics.Path;
import dd.i;
import gd.w;
import java.util.ArrayList;
import ld.h;
import md.j;
import ne.z0;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class v6 {
    public final o6 f13672a;
    public final TdApi.StickerSetInfo f13673b;
    public final h f13674c;
    public final TdApi.ClosedVectorPath[] f13675d;
    public final int f13676e;
    public final int f13677f;
    public final j f13678g;
    public int f13679h;
    public int f13680i;
    public int f13681j;
    public TdApi.StickerSet f13682k;
    public ArrayList<v6> f13683l;
    public a f13684m;

    public interface a {
        void g2(v6 v6Var);
    }

    public v6(o6 o6Var, TdApi.Sticker[] stickerArr) {
        this.f13672a = o6Var;
        this.f13680i = stickerArr.length;
        this.f13673b = null;
        this.f13674c = null;
        this.f13678g = null;
        this.f13675d = null;
        this.f13677f = 0;
        this.f13676e = 0;
    }

    public void A() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isInstalled = false;
        }
    }

    public void B() {
        this.f13679h |= 1;
    }

    public void C() {
        this.f13679h |= 4;
    }

    public void D(int i10) {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            stickerSetInfo.size = i10;
        } else {
            this.f13680i = i10;
        }
    }

    public void E(int i10) {
        this.f13681j = i10;
    }

    public void F(TdApi.StickerSet stickerSet) {
        this.f13682k = stickerSet;
    }

    public void G(a aVar) {
        this.f13684m = aVar;
    }

    public void H(v4<?> v4Var) {
        i iVar;
        TdApi.StickerSet stickerSet = this.f13682k;
        if (stickerSet != null) {
            TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
            stickerSet.isInstalled = stickerSetInfo.isInstalled;
            stickerSet.isArchived = stickerSetInfo.isArchived;
            stickerSet.isViewed = stickerSetInfo.isViewed;
            stickerSet.stickerType = stickerSetInfo.stickerType;
            iVar = i.V1(v4Var, stickerSet);
        } else {
            TdApi.StickerSetInfo stickerSetInfo2 = this.f13673b;
            iVar = (stickerSetInfo2 == null || stickerSetInfo2.f19964id == 0) ? null : i.W1(v4Var, stickerSetInfo2);
        }
        if (iVar != null && s()) {
            iVar.T1();
        }
    }

    public void I(TdApi.StickerSetInfo stickerSetInfo) {
        TdApi.StickerSetInfo stickerSetInfo2 = this.f13673b;
        stickerSetInfo2.isViewed = stickerSetInfo.isViewed;
        stickerSetInfo2.isArchived = stickerSetInfo.isArchived;
        stickerSetInfo2.isInstalled = stickerSetInfo.isInstalled;
        stickerSetInfo2.covers = stickerSetInfo.covers;
    }

    public void J() {
        a aVar = this.f13684m;
        if (aVar != null) {
            aVar.g2(this);
        }
    }

    public int a() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.covers.length;
        }
        return 0;
    }

    public int b() {
        return this.f13681j + e();
    }

    public long c() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.f19964id;
        }
        return 0L;
    }

    public TdApi.StickerSetInfo d() {
        return this.f13673b;
    }

    public int e() {
        int i10;
        if (s()) {
            return 5;
        }
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            i10 = stickerSetInfo.size;
        } else if (n()) {
            return this.f13680i;
        } else {
            i10 = this.f13680i;
        }
        return i10 + 1;
    }

    public boolean equals(Object obj) {
        TdApi.StickerSetInfo stickerSetInfo;
        if (obj == null || !(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        if (v6Var.f13679h != this.f13679h) {
            return false;
        }
        TdApi.StickerSetInfo stickerSetInfo2 = v6Var.f13673b;
        return (stickerSetInfo2 == null && this.f13673b == null) || !(stickerSetInfo2 == null || (stickerSetInfo = this.f13673b) == null || stickerSetInfo2.f19964id != stickerSetInfo.f19964id);
    }

    public String f() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.name;
        }
        return null;
    }

    public j g() {
        return this.f13678g;
    }

    public Path h(int i10) {
        int i11;
        int i12 = this.f13676e;
        if (i12 == 0 || (i11 = this.f13677f) == 0) {
            return null;
        }
        float f10 = i10;
        return e.b(this.f13675d, Math.min(f10 / i12, f10 / i11));
    }

    public h i() {
        return this.f13674c;
    }

    public int j() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        return stickerSetInfo != null ? stickerSetInfo.size : this.f13680i;
    }

    public int k() {
        return this.f13681j;
    }

    public String l() {
        if (n()) {
            return "";
        }
        if (q()) {
            return w.i1(R.string.RecentStickers);
        }
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            return stickerSetInfo.title;
        }
        return null;
    }

    public boolean m() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        return stickerSetInfo != null && e.X0(stickerSetInfo.stickerType);
    }

    public boolean n() {
        return (this.f13679h & 8) != 0;
    }

    public boolean o() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        return stickerSetInfo != null && stickerSetInfo.isInstalled && !stickerSetInfo.isArchived;
    }

    public boolean p() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        return stickerSetInfo != null && stickerSetInfo.stickerType.getConstructor() == -839756573;
    }

    public boolean q() {
        return (this.f13679h & 1) != 0;
    }

    public boolean r() {
        return (this.f13679h & 9) != 0;
    }

    public boolean s() {
        return (this.f13679h & 4) != 0;
    }

    public boolean t() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        return stickerSetInfo != null && stickerSetInfo.isViewed;
    }

    public boolean u() {
        ArrayList<v6> arrayList = this.f13683l;
        return (arrayList == null || arrayList.isEmpty() || this.f13683l.get(0).c() == c()) ? false : true;
    }

    public void v(ArrayList<v6> arrayList) {
        this.f13683l = arrayList;
    }

    public void w() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isInstalled = false;
            stickerSetInfo.isArchived = true;
        }
    }

    public void x() {
        this.f13679h |= 8;
    }

    public void y() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isInstalled = true;
            stickerSetInfo.isArchived = false;
        }
    }

    public void z() {
        TdApi.StickerSetInfo stickerSetInfo = this.f13673b;
        if (stickerSetInfo != null) {
            stickerSetInfo.isArchived = false;
        }
    }

    public v6(o6 o6Var, TdApi.StickerSetInfo stickerSetInfo) {
        this.f13672a = o6Var;
        this.f13673b = stickerSetInfo;
        TdApi.Thumbnail thumbnail = stickerSetInfo.thumbnail;
        if (thumbnail != null) {
            this.f13675d = stickerSetInfo.thumbnailOutline;
            this.f13676e = thumbnail.width;
            this.f13677f = thumbnail.height;
            int i10 = 2;
            switch (thumbnail.format.getConstructor()) {
                case TdApi.ThumbnailFormatWebm.CONSTRUCTOR:
                case TdApi.ThumbnailFormatMpeg4.CONSTRUCTOR:
                    break;
                case TdApi.ThumbnailFormatGif.CONSTRUCTOR:
                    i10 = 1;
                    break;
                case TdApi.ThumbnailFormatTgs.CONSTRUCTOR:
                    i10 = 3;
                    break;
                default:
                    i10 = -1;
                    break;
            }
            if (i10 != -1) {
                this.f13678g = new j(o6Var, stickerSetInfo.thumbnail.file, i10);
                this.f13674c = null;
            } else {
                this.f13674c = t2.D5(o6Var, stickerSetInfo.thumbnail);
                this.f13678g = null;
            }
        } else {
            TdApi.Sticker[] stickerArr = stickerSetInfo.covers;
            if (stickerArr == null || stickerArr.length <= 0) {
                this.f13675d = null;
                this.f13674c = null;
                this.f13678g = null;
                this.f13677f = 0;
                this.f13676e = 0;
            } else {
                this.f13675d = stickerArr[0].outline;
                this.f13676e = stickerArr[0].width;
                this.f13677f = stickerArr[0].height;
                if (e.X0(stickerArr[0].type)) {
                    this.f13674c = null;
                    TdApi.Sticker[] stickerArr2 = stickerSetInfo.covers;
                    j jVar = new j(o6Var, stickerArr2[0].sticker, stickerArr2[0].type);
                    this.f13678g = jVar;
                    jVar.F(true);
                } else {
                    TdApi.Sticker[] stickerArr3 = stickerSetInfo.covers;
                    if (stickerArr3[0].thumbnail != null) {
                        this.f13674c = t2.D5(o6Var, stickerArr3[0].thumbnail);
                        this.f13678g = null;
                    } else {
                        this.f13674c = null;
                        this.f13678g = null;
                    }
                }
            }
        }
        h hVar = this.f13674c;
        if (hVar != null) {
            hVar.t0(z0.getHeaderSize());
            this.f13674c.s0(1);
            this.f13674c.x0();
        }
        j jVar2 = this.f13678g;
        if (jVar2 != null) {
            jVar2.F(true);
            this.f13678g.I(1);
        }
    }

    public v6(zd.o6 r16, org.drinkless.td.libcore.telegram.TdApi.StickerSet r17) {
        throw new UnsupportedOperationException("Method not decompiled: hd.v6.<init>(zd.o6, org.drinkless.td.libcore.telegram.TdApi$StickerSet):void");
    }
}
