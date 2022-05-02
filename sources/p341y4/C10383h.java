package p341y4;

import android.text.TextUtils;
import java.util.ArrayList;
import p020b5.C1189b0;
import p174m3.C6556a2;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;
import p217p4.C8043h;

public final class C10383h extends AbstractC8039e {
    public final C1189b0 f33413o = new C1189b0();
    public final C10373c f33414p = new C10373c();

    public C10383h() {
        super("WebvttDecoder");
    }

    public static int m5206D(C1189b0 b0Var) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = b0Var.m38138e();
            String p = b0Var.m38127p();
            if (p == null) {
                i = 0;
            } else if ("STYLE".equals(p)) {
                i = 2;
            } else {
                i = p.startsWith("NOTE") ? 1 : 3;
            }
        }
        b0Var.m38144P(i2);
        return i;
    }

    public static void m5205E(C1189b0 b0Var) {
        do {
        } while (!TextUtils.isEmpty(b0Var.m38127p()));
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        C10375e m;
        this.f33413o.m38146N(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            C10384i.m5201d(this.f33413o);
            do {
            } while (!TextUtils.isEmpty(this.f33413o.m38127p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int D = m5206D(this.f33413o);
                if (D == 0) {
                    return new C10386k(arrayList2);
                }
                if (D == 1) {
                    m5205E(this.f33413o);
                } else if (D == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f33413o.m38127p();
                        arrayList.addAll(this.f33414p.m5284d(this.f33413o));
                    } else {
                        throw new C8043h("A style block was found after the first cue.");
                    }
                } else if (D == 3 && (m = C10376f.m5233m(this.f33413o, arrayList)) != null) {
                    arrayList2.add(m);
                }
            }
        } catch (C6556a2 e) {
            throw new C8043h(e);
        }
    }
}
