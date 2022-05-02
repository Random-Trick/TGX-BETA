package p341y4;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.thunderdog.challegram.Log;
import p343y6.C10422b;

public final class C10374d {
    public int f33376f;
    public int f33378h;
    public float f33385o;
    public String f33371a = "";
    public String f33372b = "";
    public Set<String> f33373c = Collections.emptySet();
    public String f33374d = "";
    public String f33375e = null;
    public boolean f33377g = false;
    public boolean f33379i = false;
    public int f33380j = -1;
    public int f33381k = -1;
    public int f33382l = -1;
    public int f33383m = -1;
    public int f33384n = -1;
    public int f33386p = -1;
    public boolean f33387q = false;

    public static int m5272B(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public C10374d m5273A(boolean z) {
        this.f33381k = z ? 1 : 0;
        return this;
    }

    public int m5271a() {
        if (this.f33379i) {
            return this.f33378h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean m5270b() {
        return this.f33387q;
    }

    public int m5269c() {
        if (this.f33377g) {
            return this.f33376f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String m5268d() {
        return this.f33375e;
    }

    public float m5267e() {
        return this.f33385o;
    }

    public int m5266f() {
        return this.f33384n;
    }

    public int m5265g() {
        return this.f33386p;
    }

    public int m5264h(String str, String str2, Set<String> set, String str3) {
        if (this.f33371a.isEmpty() && this.f33372b.isEmpty() && this.f33373c.isEmpty() && this.f33374d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = m5272B(m5272B(m5272B(0, this.f33371a, str, Log.TAG_TDLIB_OPTIONS), this.f33372b, str2, 2), this.f33374d, str3, 4);
        if (B == -1 || !set.containsAll(this.f33373c)) {
            return 0;
        }
        return B + (this.f33373c.size() * 4);
    }

    public int m5263i() {
        int i = this.f33382l;
        if (i == -1 && this.f33383m == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f33383m == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public boolean m5262j() {
        return this.f33379i;
    }

    public boolean m5261k() {
        return this.f33377g;
    }

    public boolean m5260l() {
        return this.f33380j == 1;
    }

    public boolean m5259m() {
        return this.f33381k == 1;
    }

    public C10374d m5258n(int i) {
        this.f33378h = i;
        this.f33379i = true;
        return this;
    }

    public C10374d m5257o(boolean z) {
        this.f33382l = z ? 1 : 0;
        return this;
    }

    public C10374d m5256p(boolean z) {
        this.f33387q = z;
        return this;
    }

    public C10374d m5255q(int i) {
        this.f33376f = i;
        this.f33377g = true;
        return this;
    }

    public C10374d m5254r(String str) {
        this.f33375e = str == null ? null : C10422b.m5149c(str);
        return this;
    }

    public C10374d m5253s(float f) {
        this.f33385o = f;
        return this;
    }

    public C10374d m5252t(int i) {
        this.f33384n = i;
        return this;
    }

    public C10374d m5251u(boolean z) {
        this.f33383m = z ? 1 : 0;
        return this;
    }

    public C10374d m5250v(int i) {
        this.f33386p = i;
        return this;
    }

    public void m5249w(String[] strArr) {
        this.f33373c = new HashSet(Arrays.asList(strArr));
    }

    public void m5248x(String str) {
        this.f33371a = str;
    }

    public void m5247y(String str) {
        this.f33372b = str;
    }

    public void m5246z(String str) {
        this.f33374d = str;
    }
}
