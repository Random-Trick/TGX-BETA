package p035c8;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p163l5.C6374q;

public class C2035c {
    public final int f7223a;
    @Nullable
    public final Executor f7224b;

    public static class C2036a {
        public int f7225a = 0;
        @Nullable
        public Executor f7226b;

        public C2035c m35787a() {
            return new C2035c(this.f7225a, this.f7226b, null);
        }

        public C2036a m35786b(int i, @RecentlyNonNull int... iArr) {
            this.f7225a = i;
            if (iArr != null) {
                for (int i2 : iArr) {
                    this.f7225a = i2 | this.f7225a;
                }
            }
            return this;
        }
    }

    public C2035c(int i, Executor executor, C2038e eVar) {
        this.f7223a = i;
        this.f7224b = executor;
    }

    public final int m35789a() {
        return this.f7223a;
    }

    @RecentlyNullable
    public final Executor m35788b() {
        return this.f7224b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2035c)) {
            return false;
        }
        C2035c cVar = (C2035c) obj;
        return this.f7223a == cVar.f7223a && C6374q.m20525a(this.f7224b, cVar.f7224b);
    }

    public int hashCode() {
        return C6374q.m20524b(Integer.valueOf(this.f7223a), this.f7224b);
    }
}
