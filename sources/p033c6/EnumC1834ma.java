package p033c6;

public enum EnumC1834ma implements AbstractC1662b2 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);
    
    public final int f6516a;

    EnumC1834ma(int i) {
        this.f6516a = i;
    }

    @Override
    public final int zza() {
        return this.f6516a;
    }
}
