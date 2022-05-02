package p341y4;

import java.util.ArrayList;
import java.util.Collections;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;
import p217p4.C8032b;
import p217p4.C8043h;

public final class C10371a extends AbstractC8039e {
    public final C1189b0 f33365o = new C1189b0();

    public C10371a() {
        super("Mp4WebvttDecoder");
    }

    public static C8032b m5288D(C1189b0 b0Var, int i) {
        CharSequence charSequence = null;
        C8032b.C8034b bVar = null;
        while (i > 0) {
            if (i >= 8) {
                int n = b0Var.m38132n();
                int n2 = b0Var.m38132n();
                int i2 = n - 8;
                String B = C1216l0.m38022B(b0Var.m38142d(), b0Var.m38141e(), i2);
                b0Var.m38146Q(i2);
                i = (i - 8) - i2;
                if (n2 == 1937011815) {
                    bVar = C10376f.m5231o(B);
                } else if (n2 == 1885436268) {
                    charSequence = C10376f.m5229q(null, B.trim(), Collections.emptyList());
                }
            } else {
                throw new C8043h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.m13742o(charSequence).m13756a();
        }
        return C10376f.m5234l(charSequence);
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        this.f33365o.m38149N(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f33365o.m38145a() > 0) {
            if (this.f33365o.m38145a() >= 8) {
                int n = this.f33365o.m38132n();
                if (this.f33365o.m38132n() == 1987343459) {
                    arrayList.add(m5288D(this.f33365o, n - 8));
                } else {
                    this.f33365o.m38146Q(n - 8);
                }
            } else {
                throw new C8043h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C10372b(arrayList);
    }
}
