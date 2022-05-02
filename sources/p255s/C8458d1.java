package p255s;

import android.content.Context;
import p306w.C9932j;
import p336y.AbstractC10219e1;
import p336y.AbstractC10268n0;
import p336y.AbstractC10273n2;
import p336y.AbstractC10278o2;
import p336y.C10200b2;
import p336y.C10245j0;
import p336y.C10284p1;
import p336y.C10300t1;

public final class C8458d1 implements AbstractC10278o2 {
    public final C8581v1 f27447b;

    public static class C8459a {
        public static final int[] f27448a;

        static {
            int[] iArr = new int[AbstractC10278o2.EnumC10280b.values().length];
            f27448a = iArr;
            try {
                iArr[AbstractC10278o2.EnumC10280b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27448a[AbstractC10278o2.EnumC10280b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27448a[AbstractC10278o2.EnumC10280b.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27448a[AbstractC10278o2.EnumC10280b.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C8458d1(Context context) {
        this.f27447b = C8581v1.m12041b(context);
    }

    @Override
    public AbstractC10268n0 mo5572a(AbstractC10278o2.EnumC10280b bVar) {
        C10284p1 J = C10284p1.m5569J();
        C10200b2.C10202b bVar2 = new C10200b2.C10202b();
        int[] iArr = C8459a.f27448a;
        int i = iArr[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            bVar2.m5742r(1);
        } else if (i == 4) {
            bVar2.m5742r(3);
        }
        AbstractC10278o2.EnumC10280b bVar3 = AbstractC10278o2.EnumC10280b.PREVIEW;
        if (bVar == bVar3) {
            C9932j.m6467a(bVar2);
        }
        J.mo5566n(AbstractC10273n2.f33094q, bVar2.m5747m());
        J.mo5566n(AbstractC10273n2.f33096s, C8449c1.f27425a);
        C10245j0.C10246a aVar = new C10245j0.C10246a();
        int i2 = iArr[bVar.ordinal()];
        if (i2 == 1) {
            aVar.m5635o(2);
        } else if (i2 == 2 || i2 == 3) {
            aVar.m5635o(1);
        } else if (i2 == 4) {
            aVar.m5635o(3);
        }
        J.mo5566n(AbstractC10273n2.f33095r, aVar.m5642h());
        J.mo5566n(AbstractC10273n2.f33097t, bVar == AbstractC10278o2.EnumC10280b.IMAGE_CAPTURE ? C8440a2.f27406c : C8517l0.f27620a);
        if (bVar == bVar3) {
            J.mo5566n(AbstractC10219e1.f32991o, this.f27447b.m12039d());
        }
        J.mo5566n(AbstractC10219e1.f32988l, Integer.valueOf(this.f27447b.m12040c().getRotation()));
        return C10300t1.m5524H(J);
    }
}
