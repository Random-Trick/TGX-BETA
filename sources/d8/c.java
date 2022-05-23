package d8;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import m5.q;

public class c {
    public final int f7230a;
    @Nullable
    public final Executor f7231b;

    public static class a {
        public int f7232a = 0;
        @Nullable
        public Executor f7233b;

        public c a() {
            return new c(this.f7232a, this.f7233b, null);
        }

        public a b(int i10, @RecentlyNonNull int... iArr) {
            this.f7232a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f7232a = i11 | this.f7232a;
                }
            }
            return this;
        }
    }

    public c(int i10, Executor executor, e eVar) {
        this.f7230a = i10;
        this.f7231b = executor;
    }

    public final int a() {
        return this.f7230a;
    }

    @RecentlyNullable
    public final Executor b() {
        return this.f7231b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7230a == cVar.f7230a && q.a(this.f7231b, cVar.f7231b);
    }

    public int hashCode() {
        return q.b(Integer.valueOf(this.f7230a), this.f7231b);
    }
}
