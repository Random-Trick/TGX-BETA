package y0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class h implements i {
    public static final Locale[] f26457c = new Locale[0];
    public static final Locale f26458d = new Locale("en", "XA");
    public static final Locale f26459e = new Locale("ar", "XB");
    public static final Locale f26460f = g.b("en-Latn");
    public final Locale[] f26461a;
    public final String f26462b;

    public h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f26461a = f26457c;
            this.f26462b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f26461a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
        this.f26462b = sb2.toString();
    }

    public static void b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f26461a;
        if (this.f26461a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f26461a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f26461a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f26461a;
            if (i11 >= localeArr.length) {
                return i10;
            }
            i10 = (i10 * 31) + localeArr[i11].hashCode();
            i11++;
        }
    }

    @Override
    public int size() {
        return this.f26461a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f26461a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f26461a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
