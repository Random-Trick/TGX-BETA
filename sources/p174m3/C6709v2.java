package p174m3;

public final class C6709v2 {
    public static final C6709v2 f21049b = new C6709v2(false);
    public final boolean f21050a;

    public C6709v2(boolean z) {
        this.f21050a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6709v2.class == obj.getClass() && this.f21050a == ((C6709v2) obj).f21050a;
    }

    public int hashCode() {
        return !this.f21050a ? 1 : 0;
    }
}
