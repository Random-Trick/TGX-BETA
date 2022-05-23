package m5;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import k5.a;

public class y implements a.d {
    @RecentlyNonNull
    public static final y f17278c = c().a();
    public final String f17279b;

    public static class a {
        public String f17280a;

        public a(b0 b0Var) {
        }

        @RecentlyNonNull
        public y a() {
            return new y(this.f17280a, null);
        }

        @RecentlyNonNull
        public a b(String str) {
            this.f17280a = str;
            return this;
        }
    }

    public y(String str, b0 b0Var) {
        this.f17279b = str;
    }

    @RecentlyNonNull
    public static a c() {
        return new a(null);
    }

    @RecentlyNonNull
    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f17279b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        return q.a(this.f17279b, ((y) obj).f17279b);
    }

    public final int hashCode() {
        return q.b(this.f17279b);
    }
}
