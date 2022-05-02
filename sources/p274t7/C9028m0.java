package p274t7;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p163l5.C6374q;

public final class C9028m0 {
    public static final Pattern f28968d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String f28969a;
    public final String f28970b;
    public final String f28971c;

    public C9028m0(String str, String str2) {
        this.f28969a = m10664d(str2, str);
        this.f28970b = str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("!");
        sb2.append(str2);
        this.f28971c = sb2.toString();
    }

    public static C9028m0 m10667a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C9028m0(split[0], split[1]);
    }

    public static String m10664d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f28968d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public String m10666b() {
        return this.f28970b;
    }

    public String m10665c() {
        return this.f28969a;
    }

    public String m10663e() {
        return this.f28971c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9028m0)) {
            return false;
        }
        C9028m0 m0Var = (C9028m0) obj;
        return this.f28969a.equals(m0Var.f28969a) && this.f28970b.equals(m0Var.f28970b);
    }

    public int hashCode() {
        return C6374q.m20524b(this.f28970b, this.f28969a);
    }
}
