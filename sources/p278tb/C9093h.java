package p278tb;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import qa.C8298k;

public final class C9093h {
    public final Map<String, String> f29156a;
    public final String f29157b;

    public C9093h(String str, Map<String, String> map) {
        String str2;
        C8298k.m12934e(str, "scheme");
        C8298k.m12934e(map, "authParams");
        this.f29157b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                C8298k.m12935d(locale, "US");
                str2 = key.toLowerCase(locale);
                C8298k.m12935d(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C8298k.m12935d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f29156a = unmodifiableMap;
    }

    public final Charset m10466a() {
        String str = this.f29156a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C8298k.m12935d(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C8298k.m12935d(charset, "ISO_8859_1");
        return charset;
    }

    public final String m10465b() {
        return this.f29156a.get("realm");
    }

    public final String m10464c() {
        return this.f29157b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9093h) {
            C9093h hVar = (C9093h) obj;
            if (C8298k.m12937b(hVar.f29157b, this.f29157b) && C8298k.m12937b(hVar.f29156a, this.f29156a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f29157b.hashCode()) * 31) + this.f29156a.hashCode();
    }

    public String toString() {
        return this.f29157b + " authParams=" + this.f29156a;
    }
}
