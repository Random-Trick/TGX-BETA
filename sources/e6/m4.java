package e6;

public enum m4 implements g8 {
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
    
    public final int f10939a;

    m4(int i10) {
        this.f10939a = i10;
    }

    @Override
    public final int zza() {
        return this.f10939a;
    }
}
