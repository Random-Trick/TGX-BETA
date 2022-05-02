package p350yd;

import android.content.SharedPreferences;
import android.os.Build;
import ge.C4868i;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p067ed.C4183a;
import p108hb.C5070i;

public class C10677g1 {
    public final int f34165a;
    public final TdApi.NotificationSettingsScope f34166b;
    public Long f34167c;
    public Integer f34168d;
    public Boolean f34169e;
    public String f34170f;
    public String f34171g;
    public String f34172h;
    public boolean f34173i;
    public boolean f34174j;
    public boolean f34175k;
    public Boolean f34176l;
    public Integer f34177m;
    public Integer f34178n;

    public C10677g1(int i, TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f34165a = i;
        this.f34166b = notificationSettingsScope;
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
        if (this.f34167c == null) {
            long j = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                j = C4868i.m24727c2().m24712e1(m4321k("channels_version_"), 0L);
            }
            this.f34167c = Long.valueOf(j);
        }
        return this.f34167c.longValue();
    }

    public int m4329c() {
        if (this.f34177m == null) {
            this.f34177m = Integer.valueOf(C4868i.m24727c2().m24780V0(m4313s("_led"), C10827lb.f34671v0));
        }
        return this.f34177m.intValue();
    }

    public int m4328d() {
        if (this.f34178n == null) {
            this.f34178n = Integer.valueOf(C4868i.m24727c2().m24780V0(m4313s(C10827lb.f34664o0), C10827lb.f34665p0));
        }
        return this.f34178n.intValue();
    }

    public String m4327e() {
        if (!this.f34173i) {
            this.f34170f = C4868i.m24727c2().m24849L1(m4313s("_sounds"), null);
            this.f34173i = true;
        }
        return this.f34170f;
    }

    public String m4326f() {
        if (!this.f34174j) {
            String e = m4327e();
            if (!C5070i.m24062i(e)) {
                e = C4868i.m24727c2().m24849L1(m4313s("_sounds_name"), null);
            }
            this.f34171g = e;
            this.f34174j = true;
        }
        return this.f34171g;
    }

    public String m4325g() {
        if (!this.f34175k) {
            String e = m4327e();
            if (!C5070i.m24062i(e)) {
                e = C4868i.m24727c2().m24849L1(m4313s("_sounds_path"), null);
            }
            this.f34172h = e;
            this.f34175k = true;
        }
        return this.f34172h;
    }

    public int m4324h() {
        if (this.f34168d == null) {
            this.f34168d = Integer.valueOf(C4868i.m24727c2().m24780V0(m4313s("_vibrate"), 0));
        }
        return this.f34168d.intValue();
    }

    public boolean m4323i() {
        if (this.f34169e == null) {
            boolean z = false;
            if (C4183a.f14102t && C4868i.m24727c2().m24633o0(m4313s("_vibrate_onlysilent"), false)) {
                z = true;
            }
            this.f34169e = Boolean.valueOf(z);
        }
        return this.f34169e.booleanValue();
    }

    public boolean m4322j() {
        if (this.f34176l == null) {
            this.f34176l = Boolean.valueOf(C4868i.m24727c2().m24633o0(m4313s("_content_preview"), this.f34166b.getConstructor() != 1212142067));
        }
        return this.f34176l.booleanValue();
    }

    public String m4321k(String str) {
        return C10827lb.m3114k1(str + m4330b(this.f34166b), this.f34165a);
    }

    public void m4320l(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 26) {
            editor.remove(m4321k("channels_version_"));
        }
        editor.remove(m4313s("_sounds_name")).remove(m4313s("_sounds_name")).remove(m4313s("_vibrate_onlysilent")).remove(m4313s("_vibrate")).remove(m4313s(C10827lb.f34664o0)).remove(m4313s("_led"));
        this.f34167c = null;
        this.f34168d = null;
        this.f34169e = null;
        this.f34172h = null;
        this.f34171g = null;
        this.f34170f = null;
        this.f34175k = false;
        this.f34174j = false;
        this.f34173i = false;
        this.f34177m = null;
    }

    public void m4319m(long j) {
        this.f34167c = Long.valueOf(j);
    }

    public void m4318n(int i) {
        this.f34177m = Integer.valueOf(i);
    }

    public void m4317o(boolean z) {
        this.f34176l = Boolean.valueOf(z);
    }

    public void m4316p(int i) {
        this.f34178n = Integer.valueOf(i);
    }

    public void m4315q(String str, String str2, String str3) {
        this.f34170f = str;
        this.f34173i = true;
        this.f34171g = str2;
        this.f34174j = true;
        this.f34172h = str3;
        this.f34175k = true;
    }

    public void m4314r(int i, boolean z) {
        this.f34168d = Integer.valueOf(i);
        if (C4183a.f14102t) {
            this.f34169e = Boolean.valueOf(z);
        }
    }

    public String m4313s(String str) {
        return C10827lb.m3114k1(m4330b(this.f34166b) + str, this.f34165a);
    }
}
