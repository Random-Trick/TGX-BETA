package e6;

public enum s4 implements g8 {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    public final int f11088a;

    s4(int i10) {
        this.f11088a = i10;
    }

    @Override
    public final int zza() {
        return this.f11088a;
    }
}
