package f2;

import android.app.Notification;

public final class e {
    public final int f11813a;
    public final int f11814b;
    public final Notification f11815c;

    public e(int i10, Notification notification, int i11) {
        this.f11813a = i10;
        this.f11815c = notification;
        this.f11814b = i11;
    }

    public int a() {
        return this.f11814b;
    }

    public Notification b() {
        return this.f11815c;
    }

    public int c() {
        return this.f11813a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f11813a == eVar.f11813a && this.f11814b == eVar.f11814b) {
            return this.f11815c.equals(eVar.f11815c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f11813a * 31) + this.f11814b) * 31) + this.f11815c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f11813a + ", mForegroundServiceType=" + this.f11814b + ", mNotification=" + this.f11815c + '}';
    }
}
