package p216p3;

import android.media.MediaCodec;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C8020c {
    public byte[] f26105a;
    public byte[] f26106b;
    public int f26107c;
    public int[] f26108d;
    public int[] f26109e;
    public int f26110f;
    public int f26111g;
    public int f26112h;
    public final MediaCodec.CryptoInfo f26113i;
    public final C8022b f26114j;

    public static final class C8022b {
        public final MediaCodec.CryptoInfo f26115a;
        public final MediaCodec.CryptoInfo.Pattern f26116b;

        public final void m13783b(int i, int i2) {
            this.f26116b.set(i, i2);
            this.f26115a.setPattern(this.f26116b);
        }

        public C8022b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f26115a = cryptoInfo;
            this.f26116b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C8020c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f26113i = cryptoInfo;
        this.f26114j = C1216l0.f4526a >= 24 ? new C8022b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo m13787a() {
        return this.f26113i;
    }

    public void m13786b(int i) {
        if (i != 0) {
            if (this.f26108d == null) {
                int[] iArr = new int[1];
                this.f26108d = iArr;
                this.f26113i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f26108d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    public void m13785c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f26110f = i;
        this.f26108d = iArr;
        this.f26109e = iArr2;
        this.f26106b = bArr;
        this.f26105a = bArr2;
        this.f26107c = i2;
        this.f26111g = i3;
        this.f26112h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f26113i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (C1216l0.f4526a >= 24) {
            ((C8022b) C1186a.m38188e(this.f26114j)).m13783b(i3, i4);
        }
    }
}
