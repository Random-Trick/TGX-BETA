package z4;

import android.text.TextUtils;
import c5.b0;
import java.util.ArrayList;
import m3.k2;
import q4.e;
import q4.f;

public final class h extends e {
    public final b0 f26932o = new b0();
    public final c f26933p = new c();

    public h() {
        super("WebvttDecoder");
    }

    public static int D(b0 b0Var) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = b0Var.e();
            String p10 = b0Var.p();
            if (p10 == null) {
                i10 = 0;
            } else if ("STYLE".equals(p10)) {
                i10 = 2;
            } else {
                i10 = p10.startsWith("NOTE") ? 1 : 3;
            }
        }
        b0Var.P(i11);
        return i10;
    }

    public static void E(b0 b0Var) {
        do {
        } while (!TextUtils.isEmpty(b0Var.p()));
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        e m10;
        this.f26932o.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.d(this.f26932o);
            do {
            } while (!TextUtils.isEmpty(this.f26932o.p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int D = D(this.f26932o);
                if (D == 0) {
                    return new k(arrayList2);
                }
                if (D == 1) {
                    E(this.f26932o);
                } else if (D == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f26932o.p();
                        arrayList.addAll(this.f26933p.d(this.f26932o));
                    } else {
                        throw new q4.h("A style block was found after the first cue.");
                    }
                } else if (D == 3 && (m10 = f.m(this.f26932o, arrayList)) != null) {
                    arrayList2.add(m10);
                }
            }
        } catch (k2 e10) {
            throw new q4.h(e10);
        }
    }
}
