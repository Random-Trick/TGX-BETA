package p071f2;

import android.app.Notification;

public final class C4228e {
    public final int f14271a;
    public final int f14272b;
    public final Notification f14273c;

    public C4228e(int i, Notification notification, int i2) {
        this.f14271a = i;
        this.f14273c = notification;
        this.f14272b = i2;
    }

    public int m28371a() {
        return this.f14272b;
    }

    public Notification m28370b() {
        return this.f14273c;
    }

    public int m28369c() {
        return this.f14271a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4228e.class != obj.getClass()) {
            return false;
        }
        C4228e eVar = (C4228e) obj;
        if (this.f14271a == eVar.f14271a && this.f14272b == eVar.f14272b) {
            return this.f14273c.equals(eVar.f14273c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14271a * 31) + this.f14272b) * 31) + this.f14273c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f14271a + ", mForegroundServiceType=" + this.f14272b + ", mNotification=" + this.f14273c + '}';
    }
}
