package k2;

import org.thunderdog.challegram.Log;

public class b {
    public boolean f15620a;
    public boolean f15621b;
    public boolean f15622c;
    public boolean f15623d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15620a = z10;
        this.f15621b = z11;
        this.f15622c = z12;
        this.f15623d = z13;
    }

    public boolean a() {
        return this.f15620a;
    }

    public boolean b() {
        return this.f15622c;
    }

    public boolean c() {
        return this.f15623d;
    }

    public boolean d() {
        return this.f15621b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15620a == bVar.f15620a && this.f15621b == bVar.f15621b && this.f15622c == bVar.f15622c && this.f15623d == bVar.f15623d;
    }

    public int hashCode() {
        ?? r02 = this.f15620a;
        int i10 = r02;
        if (this.f15621b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f15622c) {
            i11 = i10 + Log.TAG_CRASH;
        }
        return this.f15623d ? i11 + Log.TAG_EMOJI : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f15620a), Boolean.valueOf(this.f15621b), Boolean.valueOf(this.f15622c), Boolean.valueOf(this.f15623d));
    }
}
