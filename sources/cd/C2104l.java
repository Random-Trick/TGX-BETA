package cd;

import android.graphics.Path;
import android.text.TextUtils;
import be.C1357a0;
import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p156kd.C6246h;
import p168ld.C6503j;
import p193nb.C7321e;
import p350yd.C10930q6;

public class C2104l {
    public C10930q6 f7431a;
    public TdApi.Sticker f7432b;
    public TdApi.StickerType f7433c;
    public C6246h f7434d;
    public C6246h f7435e;
    public C6503j f7436f;
    public C6503j f7437g;
    public String f7438h;
    public int f7439i;
    public long f7440j;
    public AbstractC2105a f7441k;
    public String[] f7442l;

    public interface AbstractC2105a {
        void mo33695X6(C2104l lVar, long j);
    }

    public C2104l(C10930q6 q6Var, TdApi.Sticker sticker, String str, TdApi.StickerType stickerType) {
        m35563u(q6Var, sticker, stickerType, null);
        this.f7438h = str;
        C6246h hVar = this.f7434d;
        if (hVar != null) {
            hVar.m20917g0(true);
        }
    }

    public void m35585A() {
        this.f7439i |= 16;
    }

    public void m35584B(long j, String[] strArr) {
        this.f7440j = j;
        m35561w(strArr);
    }

    public String m35583a() {
        String[] strArr = this.f7442l;
        if (strArr != null && strArr.length > 0) {
            return TextUtils.join(" ", strArr);
        }
        TdApi.Sticker sticker = this.f7432b;
        return sticker != null ? sticker.emoji : "";
    }

    public Path m35582b(int i) {
        float f;
        TdApi.Sticker sticker = this.f7432b;
        if (sticker == null) {
            return null;
        }
        TdApi.ClosedVectorPath[] closedVectorPathArr = sticker.outline;
        if (i == -1) {
            f = 1.0f;
        } else {
            float f2 = i;
            f = Math.min(f2 / sticker.width, f2 / sticker.height);
        }
        return C7321e.m16964b(closedVectorPathArr, f);
    }

    public String m35581c() {
        return this.f7438h;
    }

    public C6503j m35580d() {
        TdApi.Sticker sticker;
        C10930q6 q6Var;
        if (this.f7437g == null && (sticker = this.f7432b) != null && C7321e.m16976V0(sticker.type) && (q6Var = this.f7431a) != null) {
            C6503j jVar = new C6503j(q6Var, this.f7432b);
            this.f7437g = jVar;
            jVar.m20297I(1);
            this.f7437g.m20294L(true);
        }
        return this.f7437g;
    }

    public C6246h m35579e() {
        TdApi.Sticker sticker;
        C10930q6 q6Var;
        if (this.f7435e == null && (sticker = this.f7432b) != null && !C7321e.m16976V0(sticker.type) && (q6Var = this.f7431a) != null) {
            C6246h hVar = new C6246h(q6Var, this.f7432b.sticker);
            this.f7435e = hVar;
            hVar.m20897s0(1);
            this.f7435e.mo20767t0(C1357a0.m37541i(190.0f));
            this.f7435e.m20889x0();
        }
        return this.f7435e;
    }

    public boolean equals(Object obj) {
        TdApi.Sticker sticker;
        if (!(obj instanceof C2104l)) {
            return false;
        }
        C2104l lVar = (C2104l) obj;
        TdApi.Sticker sticker2 = lVar.f7432b;
        return (sticker2 == null && this.f7432b == null && lVar.f7439i == this.f7439i) || (sticker2 != null && (sticker = this.f7432b) != null && lVar.f7439i == this.f7439i && sticker2.setId == sticker.setId && sticker2.sticker.f25373id == sticker.sticker.f25373id && C7321e.m16954e0(sticker2.type, sticker.type));
    }

    public int m35578f() {
        TdApi.Sticker sticker = this.f7432b;
        if (sticker != null) {
            return sticker.height;
        }
        return 0;
    }

    public int m35577g() {
        TdApi.Sticker sticker = this.f7432b;
        if (sticker != null) {
            return sticker.sticker.f25373id;
        }
        return 0;
    }

    public C6246h m35576h() {
        return this.f7434d;
    }

    public C6503j m35575i() {
        TdApi.Sticker sticker;
        C10930q6 q6Var;
        if (this.f7436f == null && (sticker = this.f7432b) != null && C7321e.m16976V0(sticker.type) && (q6Var = this.f7431a) != null) {
            C6503j jVar = new C6503j(q6Var, this.f7432b);
            this.f7436f = jVar;
            jVar.m20299G();
            this.f7436f.m20297I(1);
            this.f7436f.m20300F(true);
        }
        return this.f7436f;
    }

    public TdApi.Sticker m35574j() {
        return this.f7432b;
    }

    public long m35573k() {
        long j = this.f7440j;
        if (j != 0) {
            return j;
        }
        TdApi.Sticker sticker = this.f7432b;
        if (sticker != null) {
            return sticker.setId;
        }
        return 0L;
    }

    public int m35572l() {
        TdApi.Sticker sticker = this.f7432b;
        if (sticker != null) {
            return sticker.width;
        }
        return 0;
    }

    public boolean m35571m() {
        TdApi.Sticker sticker = this.f7432b;
        return sticker != null && C7321e.m16976V0(sticker.type);
    }

    public boolean m35570n() {
        return this.f7432b == null;
    }

    public boolean m35569o() {
        return (this.f7439i & 8) != 0;
    }

    public boolean m35568p() {
        return this.f7433c.getConstructor() == -839756573;
    }

    public boolean m35567q() {
        return (this.f7439i & 2) != 0;
    }

    public boolean m35566r() {
        return (this.f7439i & 4) != 0;
    }

    public boolean m35565s() {
        return m35573k() != 0 && (this.f7439i & 16) == 0;
    }

    public void m35564t() {
        if (this.f7441k != null && m35570n()) {
            this.f7441k.mo33695X6(this, this.f7440j);
        }
    }

    public boolean m35563u(C10930q6 q6Var, TdApi.Sticker sticker, TdApi.StickerType stickerType, String[] strArr) {
        if (this.f7432b == null && sticker == null) {
            return false;
        }
        m35561w(strArr);
        TdApi.Sticker sticker2 = this.f7432b;
        if (sticker2 != null && sticker != null && this.f7431a == q6Var && sticker2.sticker.f25373id == sticker.sticker.f25373id && C7321e.m16954e0(sticker2.type, sticker.type)) {
            return false;
        }
        this.f7431a = q6Var;
        this.f7432b = sticker;
        this.f7435e = null;
        this.f7436f = null;
        this.f7437g = null;
        this.f7433c = stickerType;
        if (sticker == null || (sticker.thumbnail == null && C7321e.m16976V0(sticker.type))) {
            this.f7434d = null;
        } else {
            C6246h D5 = C4779t2.m25704D5(q6Var, sticker.thumbnail);
            this.f7434d = D5;
            if (D5 != null) {
                D5.mo20767t0(C1357a0.m37541i(82.0f));
                this.f7434d.m20889x0();
                this.f7434d.m20897s0(1);
            }
        }
        return true;
    }

    public void m35562v(AbstractC2105a aVar) {
        this.f7441k = aVar;
    }

    public final void m35561w(String[] strArr) {
        if (strArr == null || strArr.length <= 5) {
            this.f7442l = strArr;
            return;
        }
        String[] strArr2 = new String[5];
        this.f7442l = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, 5);
    }

    public void m35560x() {
        this.f7439i |= 8;
    }

    public void m35559y() {
        this.f7439i |= 2;
    }

    public void m35558z() {
        this.f7439i |= 4;
    }

    public C2104l(C10930q6 q6Var, TdApi.Sticker sticker, TdApi.StickerType stickerType, String[] strArr) {
        m35563u(q6Var, sticker, stickerType, strArr);
    }
}
