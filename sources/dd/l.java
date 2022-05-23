package dd;

import android.graphics.Path;
import android.text.TextUtils;
import ce.a0;
import hd.t2;
import ld.h;
import md.j;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class l {
    public o6 f7396a;
    public TdApi.Sticker f7397b;
    public TdApi.StickerType f7398c;
    public h f7399d;
    public h f7400e;
    public j f7401f;
    public j f7402g;
    public String f7403h;
    public int f7404i;
    public long f7405j;
    public a f7406k;
    public String[] f7407l;

    public interface a {
        void n3(l lVar, long j10);
    }

    public l(o6 o6Var, TdApi.Sticker sticker, String str, TdApi.StickerType stickerType) {
        u(o6Var, sticker, stickerType, null);
        this.f7403h = str;
        h hVar = this.f7399d;
        if (hVar != null) {
            hVar.g0(true);
        }
    }

    public void A() {
        this.f7404i |= 16;
    }

    public void B(long j10, String[] strArr) {
        this.f7405j = j10;
        w(strArr);
    }

    public String a() {
        String[] strArr = this.f7407l;
        if (strArr != null && strArr.length > 0) {
            return TextUtils.join(" ", strArr);
        }
        TdApi.Sticker sticker = this.f7397b;
        return sticker != null ? sticker.emoji : "";
    }

    public Path b(int i10) {
        float f10;
        TdApi.Sticker sticker = this.f7397b;
        if (sticker == null) {
            return null;
        }
        TdApi.ClosedVectorPath[] closedVectorPathArr = sticker.outline;
        if (i10 == -1) {
            f10 = 1.0f;
        } else {
            float f11 = i10;
            f10 = Math.min(f11 / sticker.width, f11 / sticker.height);
        }
        return e.b(closedVectorPathArr, f10);
    }

    public String c() {
        return this.f7403h;
    }

    public j d() {
        TdApi.Sticker sticker;
        o6 o6Var;
        if (this.f7402g == null && (sticker = this.f7397b) != null && e.X0(sticker.type) && (o6Var = this.f7396a) != null) {
            j jVar = new j(o6Var, this.f7397b);
            this.f7402g = jVar;
            jVar.I(1);
            this.f7402g.L(true);
        }
        return this.f7402g;
    }

    public h e() {
        TdApi.Sticker sticker;
        o6 o6Var;
        if (this.f7400e == null && (sticker = this.f7397b) != null && !e.X0(sticker.type) && (o6Var = this.f7396a) != null) {
            h hVar = new h(o6Var, this.f7397b.sticker);
            this.f7400e = hVar;
            hVar.s0(1);
            this.f7400e.t0(a0.i(190.0f));
            this.f7400e.x0();
        }
        return this.f7400e;
    }

    public boolean equals(Object obj) {
        TdApi.Sticker sticker;
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        TdApi.Sticker sticker2 = lVar.f7397b;
        return (sticker2 == null && this.f7397b == null && lVar.f7404i == this.f7404i) || (sticker2 != null && (sticker = this.f7397b) != null && lVar.f7404i == this.f7404i && sticker2.setId == sticker.setId && sticker2.sticker.f19913id == sticker.sticker.f19913id && e.g0(sticker2.type, sticker.type));
    }

    public int f() {
        TdApi.Sticker sticker = this.f7397b;
        if (sticker != null) {
            return sticker.height;
        }
        return 0;
    }

    public int g() {
        TdApi.Sticker sticker = this.f7397b;
        if (sticker != null) {
            return sticker.sticker.f19913id;
        }
        return 0;
    }

    public h h() {
        return this.f7399d;
    }

    public j i() {
        TdApi.Sticker sticker;
        o6 o6Var;
        if (this.f7401f == null && (sticker = this.f7397b) != null && e.X0(sticker.type) && (o6Var = this.f7396a) != null) {
            j jVar = new j(o6Var, this.f7397b);
            this.f7401f = jVar;
            jVar.G();
            this.f7401f.I(1);
            this.f7401f.F(true);
        }
        return this.f7401f;
    }

    public TdApi.Sticker j() {
        return this.f7397b;
    }

    public long k() {
        long j10 = this.f7405j;
        if (j10 != 0) {
            return j10;
        }
        TdApi.Sticker sticker = this.f7397b;
        if (sticker != null) {
            return sticker.setId;
        }
        return 0L;
    }

    public int l() {
        TdApi.Sticker sticker = this.f7397b;
        if (sticker != null) {
            return sticker.width;
        }
        return 0;
    }

    public boolean m() {
        TdApi.Sticker sticker = this.f7397b;
        return sticker != null && e.X0(sticker.type);
    }

    public boolean n() {
        return this.f7397b == null;
    }

    public boolean o() {
        return (this.f7404i & 8) != 0;
    }

    public boolean p() {
        return this.f7398c.getConstructor() == -839756573;
    }

    public boolean q() {
        return (this.f7404i & 2) != 0;
    }

    public boolean r() {
        return (this.f7404i & 4) != 0;
    }

    public boolean s() {
        return k() != 0 && (this.f7404i & 16) == 0;
    }

    public void t() {
        if (this.f7406k != null && n()) {
            this.f7406k.n3(this, this.f7405j);
        }
    }

    public boolean u(o6 o6Var, TdApi.Sticker sticker, TdApi.StickerType stickerType, String[] strArr) {
        if (this.f7397b == null && sticker == null) {
            return false;
        }
        w(strArr);
        TdApi.Sticker sticker2 = this.f7397b;
        if (sticker2 != null && sticker != null && this.f7396a == o6Var && sticker2.sticker.f19913id == sticker.sticker.f19913id && e.g0(sticker2.type, sticker.type)) {
            return false;
        }
        this.f7396a = o6Var;
        this.f7397b = sticker;
        this.f7400e = null;
        this.f7401f = null;
        this.f7402g = null;
        this.f7398c = stickerType;
        if (sticker == null || (sticker.thumbnail == null && e.X0(sticker.type))) {
            this.f7399d = null;
        } else {
            h D5 = t2.D5(o6Var, sticker.thumbnail);
            this.f7399d = D5;
            if (D5 != null) {
                D5.t0(a0.i(82.0f));
                this.f7399d.x0();
                this.f7399d.s0(1);
            }
        }
        return true;
    }

    public void v(a aVar) {
        this.f7406k = aVar;
    }

    public final void w(String[] strArr) {
        if (strArr == null || strArr.length <= 5) {
            this.f7407l = strArr;
            return;
        }
        String[] strArr2 = new String[5];
        this.f7407l = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, 5);
    }

    public void x() {
        this.f7404i |= 8;
    }

    public void y() {
        this.f7404i |= 2;
    }

    public void z() {
        this.f7404i |= 4;
    }

    public l(o6 o6Var, TdApi.Sticker sticker, TdApi.StickerType stickerType, String[] strArr) {
        u(o6Var, sticker, stickerType, strArr);
    }
}
