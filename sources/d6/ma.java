package d6;

public enum ma implements b2 {
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
    
    public final int f6695a;

    ma(int i10) {
        this.f6695a = i10;
    }

    @Override
    public final int zza() {
        return this.f6695a;
    }
}
