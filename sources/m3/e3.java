package m3;

public final class e3 {
    public static final e3 f16640b = new e3(false);
    public final boolean f16641a;

    public e3(boolean z10) {
        this.f16641a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e3.class == obj.getClass() && this.f16641a == ((e3) obj).f16641a;
    }

    public int hashCode() {
        return !this.f16641a ? 1 : 0;
    }
}
