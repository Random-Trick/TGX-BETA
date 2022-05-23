package y0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class g {
    public static final g f26455b = a(new Locale[0]);
    public i f26456a;

    public g(i iVar) {
        this.f26456a = iVar;
    }

    public static g a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e(new LocaleList(localeArr));
        }
        return new g(new h(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static g e(LocaleList localeList) {
        return new g(new j(localeList));
    }

    public Locale c(int i10) {
        return this.f26456a.get(i10);
    }

    public int d() {
        return this.f26456a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f26456a.equals(((g) obj).f26456a);
    }

    public int hashCode() {
        return this.f26456a.hashCode();
    }

    public String toString() {
        return this.f26456a.toString();
    }
}
