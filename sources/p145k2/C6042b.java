package p145k2;

import org.thunderdog.challegram.Log;

public class C6042b {
    public boolean f19250a;
    public boolean f19251b;
    public boolean f19252c;
    public boolean f19253d;

    public C6042b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f19250a = z;
        this.f19251b = z2;
        this.f19252c = z3;
        this.f19253d = z4;
    }

    public boolean m21461a() {
        return this.f19250a;
    }

    public boolean m21460b() {
        return this.f19252c;
    }

    public boolean m21459c() {
        return this.f19253d;
    }

    public boolean m21458d() {
        return this.f19251b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6042b)) {
            return false;
        }
        C6042b bVar = (C6042b) obj;
        return this.f19250a == bVar.f19250a && this.f19251b == bVar.f19251b && this.f19252c == bVar.f19252c && this.f19253d == bVar.f19253d;
    }

    public int hashCode() {
        ?? r0 = this.f19250a;
        int i = r0;
        if (this.f19251b) {
            i = r0 + 16;
        }
        int i2 = i;
        if (this.f19252c) {
            i2 = i + Log.TAG_CRASH;
        }
        return this.f19253d ? i2 + Log.TAG_EMOJI : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f19250a), Boolean.valueOf(this.f19251b), Boolean.valueOf(this.f19252c), Boolean.valueOf(this.f19253d));
    }
}
