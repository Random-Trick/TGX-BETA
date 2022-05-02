package p205o9;

import android.media.MediaFormat;
import ba.AbstractC1296b;
import ca.AbstractC2055f;
import java.util.ArrayList;
import java.util.List;
import p107ha.C5048h;
import p107ha.C5054l;
import p192n9.EnumC7311c;
import p192n9.EnumC7313d;
import p276t9.C9058b;
import p316w9.AbstractC10012l;
import p316w9.C10007i;
import p316w9.C10014m;
import qa.C8298k;
import qa.C8307t;

public final class C7811i {
    public final C10007i f25022a;
    public final AbstractC10012l<EnumC7311c> f25023b;
    public final AbstractC10012l<MediaFormat> f25024c;
    public final AbstractC10012l<EnumC7311c> f25025d;

    public C7811i(AbstractC10012l<AbstractC2055f> lVar, C7802d dVar, int i, boolean z) {
        C8298k.m12934e(lVar, "strategies");
        C8298k.m12934e(dVar, "sources");
        C10007i iVar = new C10007i("Tracks");
        this.f25022a = iVar;
        C5048h<MediaFormat, EnumC7311c> e = m14986e(EnumC7313d.AUDIO, lVar.mo6241a(), dVar.mo6234n());
        MediaFormat a = e.m24196a();
        EnumC7311c b = e.m24195b();
        C5048h<MediaFormat, EnumC7311c> e2 = m14986e(EnumC7313d.VIDEO, lVar.mo6240b(), dVar.mo6235l());
        MediaFormat a2 = e2.m24196a();
        EnumC7311c b2 = e2.m24195b();
        AbstractC10012l<EnumC7311c> c = C10014m.m6221c(m14985f(b2, z, i), m14987d(b, z));
        this.f25023b = c;
        this.f25024c = C10014m.m6221c(a2, a);
        iVar.m6267c("init: videoStatus=" + b2 + ", resolvedVideoStatus=" + c.mo6240b() + ", videoFormat=" + a2);
        iVar.m6267c("init: audioStatus=" + b + ", resolvedAudioStatus=" + c.mo6241a() + ", audioFormat=" + a);
        EnumC7311c b3 = c.mo6240b();
        EnumC7311c cVar = null;
        b3 = !b3.m17064a() ? null : b3;
        EnumC7311c a3 = c.mo6241a();
        this.f25025d = C10014m.m6221c(b3, a3.m17064a() ? a3 : cVar);
    }

    public final AbstractC10012l<EnumC7311c> m14990a() {
        return this.f25025d;
    }

    public final AbstractC10012l<EnumC7311c> m14989b() {
        return this.f25023b;
    }

    public final AbstractC10012l<MediaFormat> m14988c() {
        return this.f25024c;
    }

    public final EnumC7311c m14987d(EnumC7311c cVar, boolean z) {
        return (!(cVar == EnumC7311c.PASS_THROUGH) || !z) ? cVar : EnumC7311c.COMPRESSING;
    }

    public final C5048h<MediaFormat, EnumC7311c> m14986e(EnumC7313d dVar, AbstractC2055f fVar, List<? extends AbstractC1296b> list) {
        MediaFormat mediaFormat;
        C10007i iVar = this.f25022a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resolveTrack(");
        sb2.append(dVar);
        sb2.append("), sources=");
        sb2.append(list != null ? Integer.valueOf(list.size()) : null);
        sb2.append(", strategy=");
        sb2.append(C8307t.m12920b(fVar.getClass()).mo5851a());
        iVar.m6267c(sb2.toString());
        if (list == null) {
            return C5054l.m24188a(new MediaFormat(), EnumC7311c.ABSENT);
        }
        C9058b bVar = new C9058b();
        ArrayList arrayList = new ArrayList();
        for (AbstractC1296b bVar2 : list) {
            MediaFormat n = bVar2.mo6281n(dVar);
            if (n != null) {
                C8298k.m12935d(n, "it.getTrackFormat(type) ?: return@mapNotNull null");
                mediaFormat = bVar.m10586h(bVar2, dVar, n);
            } else {
                mediaFormat = null;
            }
            if (mediaFormat != null) {
                arrayList.add(mediaFormat);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return C5054l.m24188a(new MediaFormat(), EnumC7311c.ABSENT);
        }
        if (size == list.size()) {
            MediaFormat mediaFormat2 = new MediaFormat();
            EnumC7311c a = fVar.mo35736a(arrayList, mediaFormat2);
            C8298k.m12935d(a, "strategy.createOutputFormat(inputs, output)");
            return C5054l.m24188a(mediaFormat2, a);
        }
        throw new IllegalStateException(("Of all " + dVar + " sources, some have a " + dVar + " track, some don't.").toString());
    }

    public final EnumC7311c m14985f(EnumC7311c cVar, boolean z, int i) {
        boolean z2 = false;
        boolean z3 = z || i != 0;
        if (cVar == EnumC7311c.PASS_THROUGH) {
            z2 = true;
        }
        return (!z2 || !z3) ? cVar : EnumC7311c.COMPRESSING;
    }
}
