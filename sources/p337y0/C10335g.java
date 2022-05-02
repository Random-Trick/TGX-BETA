package p337y0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class C10335g {
    public static final C10335g f33195b = m5405a(new Locale[0]);
    public AbstractC10337i f33196a;

    public C10335g(AbstractC10337i iVar) {
        this.f33196a = iVar;
    }

    public static C10335g m5405a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m5401e(new LocaleList(localeArr));
        }
        return new C10335g(new C10336h(localeArr));
    }

    public static Locale m5404b(String str) {
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

    public static C10335g m5401e(LocaleList localeList) {
        return new C10335g(new C10338j(localeList));
    }

    public Locale m5403c(int i) {
        return this.f33196a.get(i);
    }

    public int m5402d() {
        return this.f33196a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10335g) && this.f33196a.equals(((C10335g) obj).f33196a);
    }

    public int hashCode() {
        return this.f33196a.hashCode();
    }

    public String toString() {
        return this.f33196a.toString();
    }
}
