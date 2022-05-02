package p337y0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class C10336h implements AbstractC10337i {
    public static final Locale[] f33194c = new Locale[0];
    public static final Locale f33195d = new Locale("en", "XA");
    public static final Locale f33196e = new Locale("ar", "XB");
    public static final Locale f33197f = C10335g.m5404b("en-Latn");
    public final Locale[] f33198a;
    public final String f33199b;

    public C10336h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f33198a = f33194c;
            this.f33199b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m5400b(sb2, locale2);
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f33198a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.f33199b = sb2.toString();
    }

    public static void m5400b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override
    public Object mo5399a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10336h)) {
            return false;
        }
        Locale[] localeArr = ((C10336h) obj).f33198a;
        if (this.f33198a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f33198a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f33198a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f33198a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    @Override
    public int size() {
        return this.f33198a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f33198a;
            if (i < localeArr.length) {
                sb2.append(localeArr[i]);
                if (i < this.f33198a.length - 1) {
                    sb2.append(',');
                }
                i++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
