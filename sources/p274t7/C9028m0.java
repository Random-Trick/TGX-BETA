package p274t7;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p163l5.C6374q;

public final class C9028m0 {
    public static final Pattern f28965d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String f28966a;
    public final String f28967b;
    public final String f28968c;

    public C9028m0(String str, String str2) {
        this.f28966a = m10665d(str2, str);
        this.f28967b = str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("!");
        sb2.append(str2);
        this.f28968c = sb2.toString();
    }

    public static C9028m0 m10668a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C9028m0(split[0], split[1]);
    }

    public static String m10665d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f28965d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public String m10667b() {
        return this.f28967b;
    }

    public String m10666c() {
        return this.f28966a;
    }

    public String m10664e() {
        return this.f28968c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9028m0)) {
            return false;
        }
        C9028m0 m0Var = (C9028m0) obj;
        return this.f28966a.equals(m0Var.f28966a) && this.f28967b.equals(m0Var.f28967b);
    }

    public int hashCode() {
        return C6374q.m20523b(this.f28967b, this.f28966a);
    }
}
