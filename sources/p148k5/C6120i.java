package p148k5;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p163l5.C6378r;

public final class C6120i<L> {
    public final HandlerC6136l1 f19413a;
    public volatile L f19414b;
    public volatile C6121a<L> f19415c;

    public static final class C6121a<L> {
        public final L f19416a;
        public final String f19417b;

        public C6121a(L l, String str) {
            this.f19416a = l;
            this.f19417b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6121a)) {
                return false;
            }
            C6121a aVar = (C6121a) obj;
            return this.f19416a == aVar.f19416a && this.f19417b.equals(aVar.f19417b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19416a) * 31) + this.f19417b.hashCode();
        }
    }

    public interface AbstractC6122b<L> {
        void mo920a(@RecentlyNonNull L l);

        void mo919b();
    }

    public C6120i(Looper looper, L l, String str) {
        this.f19413a = new HandlerC6136l1(this, looper);
        this.f19414b = (L) C6378r.m20506l(l, "Listener must not be null");
        this.f19415c = new C6121a<>(l, C6378r.m20511g(str));
    }

    public void m21262a() {
        this.f19414b = null;
        this.f19415c = null;
    }

    @RecentlyNullable
    public C6121a<L> m21261b() {
        return this.f19415c;
    }

    public void m21260c(@RecentlyNonNull AbstractC6122b<? super L> bVar) {
        C6378r.m20506l(bVar, "Notifier must not be null");
        this.f19413a.sendMessage(this.f19413a.obtainMessage(1, bVar));
    }

    public void m21259d(AbstractC6122b<? super L> bVar) {
        Object obj = (L) this.f19414b;
        if (obj == null) {
            bVar.mo919b();
            return;
        }
        try {
            bVar.mo920a(obj);
        } catch (RuntimeException e) {
            bVar.mo919b();
            throw e;
        }
    }
}
