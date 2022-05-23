package ub;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import ra.k;

public final class h {
    public final Map<String, String> f23812a;
    public final String f23813b;

    public h(String str, Map<String, String> map) {
        String str2;
        k.e(str, "scheme");
        k.e(map, "authParams");
        this.f23813b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                k.d(locale, "US");
                str2 = key.toLowerCase(locale);
                k.d(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f23812a = unmodifiableMap;
    }

    public final Charset a() {
        String str = this.f23812a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                k.d(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        k.d(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.f23812a.get("realm");
    }

    public final String c() {
        return this.f23813b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (k.b(hVar.f23813b, this.f23813b) && k.b(hVar.f23812a, this.f23812a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f23813b.hashCode()) * 31) + this.f23812a.hashCode();
    }

    public String toString() {
        return this.f23813b + " authParams=" + this.f23812a;
    }
}
