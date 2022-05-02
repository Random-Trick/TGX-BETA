package p033c6;

public enum EnumC1654a9 implements AbstractC1662b2 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);
    
    public final int f6095a;

    EnumC1654a9(int i) {
        this.f6095a = i;
    }

    @Override
    public final int zza() {
        return this.f6095a;
    }
}
