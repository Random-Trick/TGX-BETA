package l5;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import m5.r;

public final class i<L> {
    public final l1 f16109a;
    public volatile L f16110b;
    public volatile a<L> f16111c;

    public static final class a<L> {
        public final L f16112a;
        public final String f16113b;

        public a(L l10, String str) {
            this.f16112a = l10;
            this.f16113b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16112a == aVar.f16112a && this.f16113b.equals(aVar.f16113b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16112a) * 31) + this.f16113b.hashCode();
        }
    }

    public interface b<L> {
        void a(@RecentlyNonNull L l10);

        void b();
    }

    public i(Looper looper, L l10, String str) {
        this.f16109a = new l1(this, looper);
        this.f16110b = (L) r.l(l10, "Listener must not be null");
        this.f16111c = new a<>(l10, r.g(str));
    }

    public void a() {
        this.f16110b = null;
        this.f16111c = null;
    }

    @RecentlyNullable
    public a<L> b() {
        return this.f16111c;
    }

    public void c(@RecentlyNonNull b<? super L> bVar) {
        r.l(bVar, "Notifier must not be null");
        this.f16109a.sendMessage(this.f16109a.obtainMessage(1, bVar));
    }

    public void d(b<? super L> bVar) {
        Object obj = (L) this.f16110b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }
}
