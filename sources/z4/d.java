package z4;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.thunderdog.challegram.Log;
import z6.b;

public final class d {
    public int f26892f;
    public int f26894h;
    public float f26901o;
    public String f26887a = "";
    public String f26888b = "";
    public Set<String> f26889c = Collections.emptySet();
    public String f26890d = "";
    public String f26891e = null;
    public boolean f26893g = false;
    public boolean f26895i = false;
    public int f26896j = -1;
    public int f26897k = -1;
    public int f26898l = -1;
    public int f26899m = -1;
    public int f26900n = -1;
    public int f26902p = -1;
    public boolean f26903q = false;

    public static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f26897k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f26895i) {
            return this.f26894h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f26903q;
    }

    public int c() {
        if (this.f26893g) {
            return this.f26892f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f26891e;
    }

    public float e() {
        return this.f26901o;
    }

    public int f() {
        return this.f26900n;
    }

    public int g() {
        return this.f26902p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f26887a.isEmpty() && this.f26888b.isEmpty() && this.f26889c.isEmpty() && this.f26890d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f26887a, str, Log.TAG_TDLIB_OPTIONS), this.f26888b, str2, 2), this.f26890d, str3, 4);
        if (B == -1 || !set.containsAll(this.f26889c)) {
            return 0;
        }
        return B + (this.f26889c.size() * 4);
    }

    public int i() {
        int i10 = this.f26898l;
        if (i10 == -1 && this.f26899m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f26899m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public boolean j() {
        return this.f26895i;
    }

    public boolean k() {
        return this.f26893g;
    }

    public boolean l() {
        return this.f26896j == 1;
    }

    public boolean m() {
        return this.f26897k == 1;
    }

    public d n(int i10) {
        this.f26894h = i10;
        this.f26895i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f26898l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f26903q = z10;
        return this;
    }

    public d q(int i10) {
        this.f26892f = i10;
        this.f26893g = true;
        return this;
    }

    public d r(String str) {
        this.f26891e = str == null ? null : b.c(str);
        return this;
    }

    public d s(float f10) {
        this.f26901o = f10;
        return this;
    }

    public d t(int i10) {
        this.f26900n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f26899m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f26902p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f26889c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f26887a = str;
    }

    public void y(String str) {
        this.f26888b = str;
    }

    public void z(String str) {
        this.f26890d = str;
    }
}
