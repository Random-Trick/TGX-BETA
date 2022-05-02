package p156kd;

import gd.C4779t2;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;

public class C6250i extends C6246h {
    public static int f19707b0 = -3000000;
    public final String f19708a0;

    public C6250i(String str) {
        super(null, m20884E0(str));
        this.f19708a0 = str;
    }

    public static TdApi.File m20884E0(String str) {
        int i = f19707b0;
        int i2 = i - 1;
        f19707b0 = i2;
        return C4779t2.m25685G4(i, Integer.toString(i2), str, 1);
    }

    @Override
    public byte mo20778C() {
        return (byte) 3;
    }

    public String m20885D0() {
        return this.f19708a0;
    }

    @Override
    public boolean mo20866J() {
        return true;
    }

    @Override
    public String mo20769d() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (m20941P()) {
            str = this.f19708a0 + "?square";
        } else {
            str = this.f19708a0;
        }
        sb2.append(str);
        sb2.append("_");
        sb2.append(m20887z());
        return sb2.toString();
    }

    @Override
    public int mo20826s() {
        return this.f19708a0.hashCode();
    }

    public C6250i(TdApi.Minithumbnail minithumbnail) {
        this(minithumbnail.data, false);
    }

    public C6250i(byte[] bArr, boolean z) {
        super(null, m20884E0(null), bArr);
        String q = C7389v0.m16594q(C7389v0.m16723I2(bArr));
        if (z) {
            q = q + "_noblur";
        }
        this.f19708a0 = q;
        if (z) {
            m20910k0();
        }
    }

    public C6250i(C6250i iVar) {
        super(null, iVar.f19704a, iVar.f19693P);
        this.f19708a0 = iVar.f19708a0;
    }
}
