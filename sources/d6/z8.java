package d6;

import org.thunderdog.challegram.Log;

public enum z8 implements b2 {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(Log.TAG_YOUTUBE),
    FORMAT_QR_CODE(Log.TAG_CRASH),
    FORMAT_UPC_A(Log.TAG_GIF_LOADER),
    FORMAT_UPC_E(Log.TAG_CAMERA),
    FORMAT_PDF417(Log.TAG_VOICE),
    FORMAT_AZTEC(Log.TAG_EMOJI);
    
    public final int f7194a;

    z8(int i10) {
        this.f7194a = i10;
    }

    @Override
    public final int zza() {
        return this.f7194a;
    }
}
