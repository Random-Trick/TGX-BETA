package ld;

import hd.t2;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;

public class i extends h {
    public static int f16364b0 = -3000000;
    public final String f16365a0;

    public i(String str) {
        super(null, E0(str));
        this.f16365a0 = str;
    }

    public static TdApi.File E0(String str) {
        int i10 = f16364b0;
        int i11 = i10 - 1;
        f16364b0 = i11;
        return t2.G4(i10, Integer.toString(i11), str, 1);
    }

    @Override
    public byte C() {
        return (byte) 3;
    }

    public String D0() {
        return this.f16365a0;
    }

    @Override
    public boolean J() {
        return true;
    }

    @Override
    public String d() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (P()) {
            str = this.f16365a0 + "?square";
        } else {
            str = this.f16365a0;
        }
        sb2.append(str);
        sb2.append("_");
        sb2.append(z());
        return sb2.toString();
    }

    @Override
    public int s() {
        return this.f16365a0.hashCode();
    }

    public i(TdApi.Minithumbnail minithumbnail) {
        this(minithumbnail.data, false);
    }

    public i(byte[] bArr, boolean z10) {
        super(null, E0(null), bArr);
        String q10 = v0.q(v0.I2(bArr));
        if (z10) {
            q10 = q10 + "_noblur";
        }
        this.f16365a0 = q10;
        if (z10) {
            k0();
        }
    }

    public i(i iVar) {
        super(null, iVar.f16361a, iVar.P);
        this.f16365a0 = iVar.f16365a0;
    }
}
