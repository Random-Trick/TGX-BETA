package md;

import android.os.SystemClock;
import hd.t2;
import he.i;
import ib.c;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class j {
    public final o6 f17423a;
    public final TdApi.File f17424b;
    public int f17425c;
    public int f17426d;
    public int f17427e;
    public long f17428f;
    public long f17429g;
    public boolean f17430h;
    public int f17431i;
    public int f17432j;
    public final long f17433k;
    public long f17434l;
    public a f17435m;
    public List<Runnable> f17436n;
    public String f17437o;

    public interface a {
        void a(j jVar, long j10, long j11);
    }

    public j(o6 o6Var, TdApi.Animation animation) {
        this(o6Var, animation.animation, "video/mp4".equals(animation.mimeType) ? 2 : "image/gif".equals(animation.mimeType) ? 1 : t2.J2(animation.mimeType) ? 3 : 0);
    }

    public static int O(TdApi.StickerType stickerType) {
        int constructor = stickerType.getConstructor();
        if (constructor == 522366836) {
            return 2;
        }
        if (constructor == 1763255981) {
            return 3;
        }
        throw new IllegalArgumentException(stickerType.toString());
    }

    public void s() {
        List<Runnable> list = this.f17436n;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.f17436n = null;
        }
    }

    public void A(int i10) {
        this.f17432j = i10;
    }

    public void B(a aVar) {
        this.f17435m = aVar;
    }

    public void C(long j10, long j11) {
        this.f17427e |= 1;
        this.f17428f = j10;
        this.f17429g = j11;
    }

    public void D(boolean z10) {
        this.f17427e = c.h(this.f17427e, 2, z10);
    }

    public boolean E(boolean z10) {
        if (this.f17430h == z10) {
            return false;
        }
        this.f17430h = z10;
        if (!z10) {
            return true;
        }
        this.f17431i = 0;
        y();
        return true;
    }

    public void F(boolean z10) {
        this.f17427e = c.h(this.f17427e, 4, z10);
    }

    public void G() {
        H(i.c2().k1(8L));
    }

    public void H(boolean z10) {
        this.f17427e = c.h(this.f17427e, 8, z10);
    }

    public void I(int i10) {
        this.f17426d = i10;
    }

    public void J(int i10) {
    }

    public void K(long j10) {
        this.f17434l = j10;
    }

    public void L(boolean z10) {
        this.f17427e = c.h(this.f17427e, 16, z10);
    }

    public boolean M(int i10) {
        if (this.f17431i == i10) {
            return false;
        }
        this.f17431i = i10;
        return true;
    }

    public o6 N() {
        return this.f17423a;
    }

    public void b(Runnable runnable) {
        if (!m() || !o()) {
            if (this.f17436n == null) {
                this.f17436n = new ArrayList();
            }
            this.f17436n.add(runnable);
            return;
        }
        runnable.run();
    }

    public long c() {
        return this.f17428f;
    }

    public TdApi.File d() {
        return this.f17424b;
    }

    public int e() {
        return this.f17424b.f19913id;
    }

    public String f() {
        TdApi.LocalFile localFile = this.f17424b.local;
        if (localFile != null) {
            return localFile.path;
        }
        return null;
    }

    public int g() {
        return this.f17432j;
    }

    public int h() {
        return this.f17425c;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public long i() {
        return this.f17429g;
    }

    public int j() {
        return this.f17426d;
    }

    public int k() {
        return this.f17431i;
    }

    public boolean l(long j10) {
        return j10 >= 0 && j10 < this.f17434l;
    }

    public boolean m() {
        return this.f17430h;
    }

    public boolean n() {
        return this.f17425c == 3;
    }

    public boolean o() {
        return c.b(this.f17427e, 8);
    }

    public boolean p() {
        return (this.f17427e & 1) != 0;
    }

    public boolean q() {
        return (this.f17427e & 2) != 0;
    }

    public boolean r() {
        return c.b(this.f17427e, 16);
    }

    public final StringBuilder t(StringBuilder sb2) {
        o6 o6Var = this.f17423a;
        sb2.append(o6Var != null ? o6Var.A6() : -1);
        sb2.append('_');
        sb2.append(e());
        if (this.f17427e != 0) {
            sb2.append(',');
            sb2.append(this.f17427e);
        }
        if (this.f17432j != 0) {
            sb2.append(",f");
            sb2.append(this.f17432j);
        }
        if (r() || o()) {
            sb2.append(',');
            sb2.append(this.f17433k);
        }
        return sb2;
    }

    public final String toString() {
        String str = this.f17437o;
        if (str != null) {
            return str;
        }
        String u10 = u();
        this.f17437o = u10;
        return u10;
    }

    public String u() {
        return t(new StringBuilder()).toString();
    }

    public boolean v() {
        return c.b(this.f17427e, 32);
    }

    public boolean w() {
        return c.b(this.f17427e, 4);
    }

    public void x(long j10, long j11) {
        a aVar = this.f17435m;
        if (aVar != null) {
            aVar.a(this, j10, j11);
        }
    }

    public void y() {
        if (this.f17436n != null) {
            this.f17423a.hd().post(new Runnable() {
                @Override
                public final void run() {
                    j.this.s();
                }
            });
        }
    }

    public void z(boolean z10) {
        this.f17427e = c.h(this.f17427e, 32, z10);
    }

    public j(o6 o6Var, TdApi.File file, int i10) {
        this.f17431i = 0;
        this.f17423a = o6Var;
        this.f17424b = file;
        this.f17425c = i10;
        this.f17433k = SystemClock.uptimeMillis();
    }

    public j(o6 o6Var, TdApi.Sticker sticker) {
        this(o6Var, sticker.sticker, sticker.type);
    }

    public j(o6 o6Var, TdApi.File file, TdApi.StickerType stickerType) {
        this(o6Var, file, O(stickerType));
    }
}
