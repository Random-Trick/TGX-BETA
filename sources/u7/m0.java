package u7;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import m5.q;

public final class m0 {
    public static final Pattern f23653d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String f23654a;
    public final String f23655b;
    public final String f23656c;

    public m0(String str, String str2) {
        this.f23654a = d(str2, str);
        this.f23655b = str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("!");
        sb2.append(str2);
        this.f23656c = sb2.toString();
    }

    public static m0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new m0(split[0], split[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f23653d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public String b() {
        return this.f23655b;
    }

    public String c() {
        return this.f23654a;
    }

    public String e() {
        return this.f23656c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f23654a.equals(m0Var.f23654a) && this.f23655b.equals(m0Var.f23655b);
    }

    public int hashCode() {
        return q.b(this.f23655b, this.f23654a);
    }
}
