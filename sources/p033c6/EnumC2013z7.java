package p033c6;

public enum EnumC2013z7 implements AbstractC1662b2 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);
    
    public final int f7171a;

    EnumC2013z7(int i) {
        this.f7171a = i;
    }

    @Override
    public final int zza() {
        return this.f7171a;
    }
}
