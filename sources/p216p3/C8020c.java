package p216p3;

import android.media.MediaCodec;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C8020c {
    public byte[] f26102a;
    public byte[] f26103b;
    public int f26104c;
    public int[] f26105d;
    public int[] f26106e;
    public int f26107f;
    public int f26108g;
    public int f26109h;
    public final MediaCodec.CryptoInfo f26110i;
    public final C8022b f26111j;

    public static final class C8022b {
        public final MediaCodec.CryptoInfo f26112a;
        public final MediaCodec.CryptoInfo.Pattern f26113b;

        public final void m13784b(int i, int i2) {
            this.f26113b.set(i, i2);
            this.f26112a.setPattern(this.f26113b);
        }

        public C8022b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f26112a = cryptoInfo;
            this.f26113b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C8020c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f26110i = cryptoInfo;
        this.f26111j = C1216l0.f4526a >= 24 ? new C8022b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo m13788a() {
        return this.f26110i;
    }

    public void m13787b(int i) {
        if (i != 0) {
            if (this.f26105d == null) {
                int[] iArr = new int[1];
                this.f26105d = iArr;
                this.f26110i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f26105d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    public void m13786c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f26107f = i;
        this.f26105d = iArr;
        this.f26106e = iArr2;
        this.f26103b = bArr;
        this.f26102a = bArr2;
        this.f26104c = i2;
        this.f26108g = i3;
        this.f26109h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f26110i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (C1216l0.f4526a >= 24) {
            ((C8022b) C1186a.m38185e(this.f26111j)).m13784b(i3, i4);
        }
    }
}
