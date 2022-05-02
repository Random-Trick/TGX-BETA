package p046d6;

public enum EnumC3738m4 implements AbstractC3683g8 {
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
    
    public final int f12687a;

    EnumC3738m4(int i) {
        this.f12687a = i;
    }

    @Override
    public final int zza() {
        return this.f12687a;
    }
}
