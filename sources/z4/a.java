package z4;

import c5.b0;
import c5.l0;
import java.util.ArrayList;
import java.util.Collections;
import q4.b;
import q4.e;
import q4.f;
import q4.h;

public final class a extends e {
    public final b0 f26881o = new b0();

    public a() {
        super("Mp4WebvttDecoder");
    }

    public static b D(b0 b0Var, int i10) {
        CharSequence charSequence = null;
        b.C0195b bVar = null;
        while (i10 > 0) {
            if (i10 >= 8) {
                int n10 = b0Var.n();
                int n11 = b0Var.n();
                int i11 = n10 - 8;
                String B = l0.B(b0Var.d(), b0Var.e(), i11);
                b0Var.Q(i11);
                i10 = (i10 - 8) - i11;
                if (n11 == 1937011815) {
                    bVar = f.o(B);
                } else if (n11 == 1885436268) {
                    charSequence = f.q(null, B.trim(), Collections.emptyList());
                }
            } else {
                throw new h("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.o(charSequence).a();
        }
        return f.l(charSequence);
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        this.f26881o.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f26881o.a() > 0) {
            if (this.f26881o.a() >= 8) {
                int n10 = this.f26881o.n();
                if (this.f26881o.n() == 1987343459) {
                    arrayList.add(D(this.f26881o, n10 - 8));
                } else {
                    this.f26881o.Q(n10 - 8);
                }
            } else {
                throw new h("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new b(arrayList);
    }
}
