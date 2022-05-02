package p168ld;

import android.os.SystemClock;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5063c;
import p350yd.C10930q6;

public class C6503j {
    public final C10930q6 f20249a;
    public final TdApi.File f20250b;
    public int f20251c;
    public int f20252d;
    public int f20253e;
    public long f20254f;
    public long f20255g;
    public boolean f20256h;
    public int f20257i;
    public int f20258j;
    public final long f20259k;
    public long f20260l;
    public AbstractC6504a f20261m;
    public List<Runnable> f20262n;
    public String f20263o;

    public interface AbstractC6504a {
        void mo20265a(C6503j jVar, long j, long j2);
    }

    public C6503j(C10930q6 q6Var, TdApi.Animation animation) {
        this(q6Var, animation.animation, "video/mp4".equals(animation.mimeType) ? 2 : "image/gif".equals(animation.mimeType) ? 1 : C4779t2.m25665J2(animation.mimeType) ? 3 : 0);
    }

    public static int m20291O(TdApi.StickerType stickerType) {
        int constructor = stickerType.getConstructor();
        if (constructor == 522366836) {
            return 2;
        }
        if (constructor == 1763255981) {
            return 3;
        }
        throw new IllegalArgumentException(stickerType.toString());
    }

    public void m20272s() {
        List<Runnable> list = this.f20262n;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.f20262n = null;
        }
    }

    public void m20305A(int i) {
        this.f20258j = i;
    }

    public void m20304B(AbstractC6504a aVar) {
        this.f20261m = aVar;
    }

    public void m20303C(long j, long j2) {
        this.f20253e |= 1;
        this.f20254f = j;
        this.f20255g = j2;
    }

    public void m20302D(boolean z) {
        this.f20253e = C5063c.m24138h(this.f20253e, 2, z);
    }

    public boolean m20301E(boolean z) {
        if (this.f20256h == z) {
            return false;
        }
        this.f20256h = z;
        if (!z) {
            return true;
        }
        this.f20257i = 0;
        m20267y();
        return true;
    }

    public void m20300F(boolean z) {
        this.f20253e = C5063c.m24138h(this.f20253e, 4, z);
    }

    public void m20299G() {
        m20298H(C4868i.m24726c2().m24663k1(8L));
    }

    public void m20298H(boolean z) {
        this.f20253e = C5063c.m24138h(this.f20253e, 8, z);
    }

    public void m20297I(int i) {
        this.f20252d = i;
    }

    public void m20296J(int i) {
    }

    public void m20295K(long j) {
        this.f20260l = j;
    }

    public void m20294L(boolean z) {
        this.f20253e = C5063c.m24138h(this.f20253e, 16, z);
    }

    public boolean m20293M(int i) {
        if (this.f20257i == i) {
            return false;
        }
        this.f20257i = i;
        return true;
    }

    public C10930q6 m20292N() {
        return this.f20249a;
    }

    public void m20289b(Runnable runnable) {
        if (!m20278m() || !m20276o()) {
            if (this.f20262n == null) {
                this.f20262n = new ArrayList();
            }
            this.f20262n.add(runnable);
            return;
        }
        runnable.run();
    }

    public long m20288c() {
        return this.f20254f;
    }

    public TdApi.File m20287d() {
        return this.f20250b;
    }

    public int m20286e() {
        return this.f20250b.f25373id;
    }

    public String m20285f() {
        TdApi.LocalFile localFile = this.f20250b.local;
        if (localFile != null) {
            return localFile.path;
        }
        return null;
    }

    public int m20284g() {
        return this.f20258j;
    }

    public int m20283h() {
        return this.f20251c;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public long m20282i() {
        return this.f20255g;
    }

    public int m20281j() {
        return this.f20252d;
    }

    public int m20280k() {
        return this.f20257i;
    }

    public boolean m20279l(long j) {
        return j >= 0 && j < this.f20260l;
    }

    public boolean m20278m() {
        return this.f20256h;
    }

    public boolean m20277n() {
        return this.f20251c == 3;
    }

    public boolean m20276o() {
        return C5063c.m24144b(this.f20253e, 8);
    }

    public boolean m20275p() {
        return (this.f20253e & 1) != 0;
    }

    public boolean m20274q() {
        return (this.f20253e & 2) != 0;
    }

    public boolean m20273r() {
        return C5063c.m24144b(this.f20253e, 16);
    }

    public final StringBuilder m20271t(StringBuilder sb2) {
        C10930q6 q6Var = this.f20249a;
        sb2.append(q6Var != null ? q6Var.m2188w6() : -1);
        sb2.append('_');
        sb2.append(m20286e());
        if (this.f20253e != 0) {
            sb2.append(',');
            sb2.append(this.f20253e);
        }
        if (this.f20258j != 0) {
            sb2.append(",f");
            sb2.append(this.f20258j);
        }
        if (m20273r() || m20276o()) {
            sb2.append(',');
            sb2.append(this.f20259k);
        }
        return sb2;
    }

    public final String toString() {
        String str = this.f20263o;
        if (str != null) {
            return str;
        }
        String u = mo20264u();
        this.f20263o = u;
        return u;
    }

    public String mo20264u() {
        return m20271t(new StringBuilder()).toString();
    }

    public boolean m20270v() {
        return C5063c.m24144b(this.f20253e, 32);
    }

    public boolean m20269w() {
        return C5063c.m24144b(this.f20253e, 4);
    }

    public void m20268x(long j, long j2) {
        AbstractC6504a aVar = this.f20261m;
        if (aVar != null) {
            aVar.mo20265a(this, j, j2);
        }
    }

    public void m20267y() {
        if (this.f20262n != null) {
            this.f20249a.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C6503j.this.m20272s();
                }
            });
        }
    }

    public void m20266z(boolean z) {
        this.f20253e = C5063c.m24138h(this.f20253e, 32, z);
    }

    public C6503j(C10930q6 q6Var, TdApi.File file, int i) {
        this.f20257i = 0;
        this.f20249a = q6Var;
        this.f20250b = file;
        this.f20251c = i;
        this.f20259k = SystemClock.uptimeMillis();
    }

    public C6503j(C10930q6 q6Var, TdApi.Sticker sticker) {
        this(q6Var, sticker.sticker, sticker.type);
    }

    public C6503j(C10930q6 q6Var, TdApi.File file, TdApi.StickerType stickerType) {
        this(q6Var, file, m20291O(stickerType));
    }
}
