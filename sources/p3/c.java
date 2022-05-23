package p3;

import android.media.MediaCodec;
import c5.l0;

public final class c {
    public byte[] f20462a;
    public byte[] f20463b;
    public int f20464c;
    public int[] f20465d;
    public int[] f20466e;
    public int f20467f;
    public int f20468g;
    public int f20469h;
    public final MediaCodec.CryptoInfo f20470i;
    public final b f20471j;

    public static final class b {
        public final MediaCodec.CryptoInfo f20472a;
        public final MediaCodec.CryptoInfo.Pattern f20473b;

        public final void b(int i10, int i11) {
            this.f20473b.set(i10, i11);
            this.f20472a.setPattern(this.f20473b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f20472a = cryptoInfo;
            this.f20473b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f20470i = cryptoInfo;
        this.f20471j = l0.f4841a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f20470i;
    }

    public void b(int i10) {
        if (i10 != 0) {
            if (this.f20465d == null) {
                int[] iArr = new int[1];
                this.f20465d = iArr;
                this.f20470i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f20465d;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f20467f = i10;
        this.f20465d = iArr;
        this.f20466e = iArr2;
        this.f20463b = bArr;
        this.f20462a = bArr2;
        this.f20464c = i11;
        this.f20468g = i12;
        this.f20469h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f20470i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (l0.f4841a >= 24) {
            ((b) c5.a.e(this.f20471j)).b(i12, i13);
        }
    }
}
