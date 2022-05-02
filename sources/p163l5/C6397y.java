package p163l5;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p133j5.C5850a;

public class C6397y implements C5850a.AbstractC5854d {
    @RecentlyNonNull
    public static final C6397y f20043c = m20472c().m20470a();
    public final String f20044b;

    public static class C6398a {
        public String f20045a;

        public C6398a(C6323b0 b0Var) {
        }

        @RecentlyNonNull
        public C6397y m20470a() {
            return new C6397y(this.f20045a, null);
        }

        @RecentlyNonNull
        public C6398a m20469b(String str) {
            this.f20045a = str;
            return this;
        }
    }

    public C6397y(String str, C6323b0 b0Var) {
        this.f20044b = str;
    }

    @RecentlyNonNull
    public static C6398a m20472c() {
        return new C6398a(null);
    }

    @RecentlyNonNull
    public final Bundle m20471d() {
        Bundle bundle = new Bundle();
        String str = this.f20044b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6397y)) {
            return false;
        }
        return C6374q.m20524a(this.f20044b, ((C6397y) obj).f20044b);
    }

    public final int hashCode() {
        return C6374q.m20523b(this.f20044b);
    }
}
