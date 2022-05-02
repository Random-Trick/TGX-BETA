package p350yd;

import android.content.SharedPreferences;
import android.os.Build;
import ge.C4868i;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p067ed.C4183a;
import p108hb.C5070i;

public class C10677g1 {
    public final int f34162a;
    public final TdApi.NotificationSettingsScope f34163b;
    public Long f34164c;
    public Integer f34165d;
    public Boolean f34166e;
    public String f34167f;
    public String f34168g;
    public String f34169h;
    public boolean f34170i;
    public boolean f34171j;
    public boolean f34172k;
    public Boolean f34173l;
    public Integer f34174m;
    public Integer f34175n;

    public C10677g1(int i, TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f34162a = i;
        this.f34163b = notificationSettingsScope;
    }

    public static String m4330b(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            return "channels";
        }
        if (constructor == 937446759) {
            return "private";
        }
        if (constructor == 1212142067) {
            return "groups";
        }
        throw new RuntimeException();
    }

    public long m4331a() {
        if (this.f34164c == null) {
            long j = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                j = C4868i.m24726c2().m24711e1(m4321k("channels_version_"), 0L);
            }
            this.f34164c = Long.valueOf(j);
        }
        return this.f34164c.longValue();
    }

    public int m4329c() {
        if (this.f34174m == null) {
            this.f34174m = Integer.valueOf(C4868i.m24726c2().m24779V0(m4313s("_led"), C10827lb.f34668v0));
        }
        return this.f34174m.intValue();
    }

    public int m4328d() {
        if (this.f34175n == null) {
            this.f34175n = Integer.valueOf(C4868i.m24726c2().m24779V0(m4313s(C10827lb.f34661o0), C10827lb.f34662p0));
        }
        return this.f34175n.intValue();
    }

    public String m4327e() {
        if (!this.f34170i) {
            this.f34167f = C4868i.m24726c2().m24848L1(m4313s("_sounds"), null);
            this.f34170i = true;
        }
        return this.f34167f;
    }

    public String m4326f() {
        if (!this.f34171j) {
            String e = m4327e();
            if (!C5070i.m24061i(e)) {
                e = C4868i.m24726c2().m24848L1(m4313s("_sounds_name"), null);
            }
            this.f34168g = e;
            this.f34171j = true;
        }
        return this.f34168g;
    }

    public String m4325g() {
        if (!this.f34172k) {
            String e = m4327e();
            if (!C5070i.m24061i(e)) {
                e = C4868i.m24726c2().m24848L1(m4313s("_sounds_path"), null);
            }
            this.f34169h = e;
            this.f34172k = true;
        }
        return this.f34169h;
    }

    public int m4324h() {
        if (this.f34165d == null) {
            this.f34165d = Integer.valueOf(C4868i.m24726c2().m24779V0(m4313s("_vibrate"), 0));
        }
        return this.f34165d.intValue();
    }

    public boolean m4323i() {
        if (this.f34166e == null) {
            boolean z = false;
            if (C4183a.f14102t && C4868i.m24726c2().m24632o0(m4313s("_vibrate_onlysilent"), false)) {
                z = true;
            }
            this.f34166e = Boolean.valueOf(z);
        }
        return this.f34166e.booleanValue();
    }

    public boolean m4322j() {
        if (this.f34173l == null) {
            this.f34173l = Boolean.valueOf(C4868i.m24726c2().m24632o0(m4313s("_content_preview"), this.f34163b.getConstructor() != 1212142067));
        }
        return this.f34173l.booleanValue();
    }

    public String m4321k(String str) {
        return C10827lb.m3114k1(str + m4330b(this.f34163b), this.f34162a);
    }

    public void m4320l(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 26) {
            editor.remove(m4321k("channels_version_"));
        }
        editor.remove(m4313s("_sounds_name")).remove(m4313s("_sounds_name")).remove(m4313s("_vibrate_onlysilent")).remove(m4313s("_vibrate")).remove(m4313s(C10827lb.f34661o0)).remove(m4313s("_led"));
        this.f34164c = null;
        this.f34165d = null;
        this.f34166e = null;
        this.f34169h = null;
        this.f34168g = null;
        this.f34167f = null;
        this.f34172k = false;
        this.f34171j = false;
        this.f34170i = false;
        this.f34174m = null;
    }

    public void m4319m(long j) {
        this.f34164c = Long.valueOf(j);
    }

    public void m4318n(int i) {
        this.f34174m = Integer.valueOf(i);
    }

    public void m4317o(boolean z) {
        this.f34173l = Boolean.valueOf(z);
    }

    public void m4316p(int i) {
        this.f34175n = Integer.valueOf(i);
    }

    public void m4315q(String str, String str2, String str3) {
        this.f34167f = str;
        this.f34170i = true;
        this.f34168g = str2;
        this.f34171j = true;
        this.f34169h = str3;
        this.f34172k = true;
    }

    public void m4314r(int i, boolean z) {
        this.f34165d = Integer.valueOf(i);
        if (C4183a.f14102t) {
            this.f34166e = Boolean.valueOf(z);
        }
    }

    public String m4313s(String str) {
        return C10827lb.m3114k1(m4330b(this.f34163b) + str, this.f34162a);
    }
}
