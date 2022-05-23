package p9;

import android.media.MediaFormat;
import ca.b;
import da.f;
import ia.h;
import java.util.ArrayList;
import java.util.List;
import o9.c;
import o9.d;
import ra.k;
import ra.t;
import x9.l;
import x9.m;

public final class i {
    public final x9.i f20972a;
    public final l<c> f20973b;
    public final l<MediaFormat> f20974c;
    public final l<c> f20975d;

    public i(l<f> lVar, d dVar, int i10, boolean z10) {
        k.e(lVar, "strategies");
        k.e(dVar, "sources");
        x9.i iVar = new x9.i("Tracks");
        this.f20972a = iVar;
        h<MediaFormat, c> e10 = e(d.AUDIO, lVar.a(), dVar.k());
        MediaFormat a10 = e10.a();
        c b10 = e10.b();
        h<MediaFormat, c> e11 = e(d.VIDEO, lVar.b(), dVar.j());
        MediaFormat a11 = e11.a();
        c b11 = e11.b();
        l<c> c10 = m.c(f(b11, z10, i10), d(b10, z10));
        this.f20973b = c10;
        this.f20974c = m.c(a11, a10);
        iVar.c("init: videoStatus=" + b11 + ", resolvedVideoStatus=" + c10.b() + ", videoFormat=" + a11);
        iVar.c("init: audioStatus=" + b10 + ", resolvedAudioStatus=" + c10.a() + ", audioFormat=" + a10);
        c b12 = c10.b();
        c cVar = null;
        b12 = !b12.a() ? null : b12;
        c a12 = c10.a();
        this.f20975d = m.c(b12, a12.a() ? a12 : cVar);
    }

    public final l<c> a() {
        return this.f20975d;
    }

    public final l<c> b() {
        return this.f20973b;
    }

    public final l<MediaFormat> c() {
        return this.f20974c;
    }

    public final c d(c cVar, boolean z10) {
        return (!(cVar == c.PASS_THROUGH) || !z10) ? cVar : c.COMPRESSING;
    }

    public final h<MediaFormat, c> e(d dVar, f fVar, List<? extends b> list) {
        MediaFormat mediaFormat;
        x9.i iVar = this.f20972a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resolveTrack(");
        sb2.append(dVar);
        sb2.append("), sources=");
        sb2.append(list != null ? Integer.valueOf(list.size()) : null);
        sb2.append(", strategy=");
        sb2.append(t.b(fVar.getClass()).a());
        iVar.c(sb2.toString());
        if (list == null) {
            return ia.l.a(new MediaFormat(), c.ABSENT);
        }
        u9.b bVar = new u9.b();
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : list) {
            MediaFormat k10 = bVar2.k(dVar);
            if (k10 != null) {
                k.d(k10, "it.getTrackFormat(type) ?: return@mapNotNull null");
                mediaFormat = bVar.h(bVar2, dVar, k10);
            } else {
                mediaFormat = null;
            }
            if (mediaFormat != null) {
                arrayList.add(mediaFormat);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return ia.l.a(new MediaFormat(), c.ABSENT);
        }
        if (size == list.size()) {
            MediaFormat mediaFormat2 = new MediaFormat();
            c a10 = fVar.a(arrayList, mediaFormat2);
            k.d(a10, "strategy.createOutputFormat(inputs, output)");
            return ia.l.a(mediaFormat2, a10);
        }
        throw new IllegalStateException(("Of all " + dVar + " sources, some have a " + dVar + " track, some don't.").toString());
    }

    public final c f(c cVar, boolean z10, int i10) {
        boolean z11 = false;
        boolean z12 = z10 || i10 != 0;
        if (cVar == c.PASS_THROUGH) {
            z11 = true;
        }
        return (!z11 || !z12) ? cVar : c.COMPRESSING;
    }
}
