package p030c3;

public abstract class AbstractC1541g {

    public enum EnumC1542a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static AbstractC1541g m36508a() {
        return new C1535b(EnumC1542a.FATAL_ERROR, -1L);
    }

    public static AbstractC1541g m36505d(long j) {
        return new C1535b(EnumC1542a.OK, j);
    }

    public static AbstractC1541g m36504e() {
        return new C1535b(EnumC1542a.TRANSIENT_ERROR, -1L);
    }

    public abstract long mo36507b();

    public abstract EnumC1542a mo36506c();
}
