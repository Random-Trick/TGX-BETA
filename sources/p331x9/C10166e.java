package p331x9;

import android.media.MediaFormat;
import android.view.Surface;
import p107ha.AbstractC5044d;
import p107ha.C5045e;
import p107ha.C5049i;
import p107ha.C5052j;
import p250r9.AbstractC8400b;
import p250r9.C8401c;
import p289u9.AbstractC9461b;
import p289u9.AbstractC9475i;
import p289u9.AbstractC9480j;
import p316w9.C10007i;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public final class C10166e implements AbstractC9480j<C8401c, AbstractC8400b, Long, AbstractC9461b>, AbstractC8400b {
    public final C10007i f32886b;
    public final C10166e f32887c;
    public final AbstractC5044d f32888d;
    public AbstractC10162b f32889e;
    public final int f32890f;
    public final int f32891g;
    public final MediaFormat f32892h;

    public static final class C10167a extends AbstractC8299l implements AbstractC8077a<C10160a> {
        public final boolean f32893b;

        public C10167a(boolean z) {
            super(0);
            this.f32893b = z;
        }

        public final C10160a mo4925b() {
            C10160a aVar = new C10160a();
            aVar.m5868j(this.f32893b);
            return aVar;
        }
    }

    public C10166e(int i, int i2, MediaFormat mediaFormat, boolean z) {
        C8298k.m12934e(mediaFormat, "targetFormat");
        this.f32890f = i;
        this.f32891g = i2;
        this.f32892h = mediaFormat;
        C10007i iVar = new C10007i("VideoRenderer");
        this.f32886b = iVar;
        this.f32887c = this;
        this.f32888d = C5045e.m24197a(new C10167a(z));
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        boolean z2 = i2 % 180 != 0;
        iVar.m6269a("FrameDrawerEncoder: size=" + integer + '-' + integer2 + ", flipping=" + z2);
        mediaFormat.setInteger("width", z2 ? integer2 : integer);
        mediaFormat.setInteger("height", !z2 ? integer2 : integer);
    }

    @Override
    public void mo5861a() {
        m5854k().m5869i();
    }

    @Override
    public void mo5859f(MediaFormat mediaFormat) {
        C8298k.m12934e(mediaFormat, "rawFormat");
    }

    @Override
    public AbstractC9475i<Long> mo5858g(AbstractC9475i.C9477b<C8401c> bVar, boolean z) {
        C8298k.m12934e(bVar, "state");
        if (bVar instanceof AbstractC9475i.C9476a) {
            bVar.m8558a().m12572b().mo568a(Boolean.FALSE);
            return new AbstractC9475i.C9476a(0L);
        }
        AbstractC10162b bVar2 = this.f32889e;
        if (bVar2 == null) {
            C8298k.m12925n("frameDropper");
        }
        if (bVar2.mo5864a(bVar.m8558a().m12571c())) {
            bVar.m8558a().m12572b().mo568a(Boolean.TRUE);
            m5854k().m5872f();
            return new AbstractC9475i.C9477b(Long.valueOf(bVar.m8558a().m12571c()));
        }
        bVar.m8558a().m12572b().mo568a(Boolean.FALSE);
        return AbstractC9475i.C9479d.f30715a;
    }

    @Override
    public Surface mo5857h(MediaFormat mediaFormat) {
        int i;
        float f;
        C8298k.m12934e(mediaFormat, "sourceFormat");
        C10007i iVar = this.f32886b;
        iVar.m6267c("handleSourceFormat(" + mediaFormat + ')');
        try {
            C5049i.C5050a aVar = C5049i.f17059a;
            i = C5049i.m24192a(Integer.valueOf(mediaFormat.getInteger("rotation-degrees")));
        } catch (Throwable th) {
            C5049i.C5050a aVar2 = C5049i.f17059a;
            i = C5049i.m24192a(C5052j.m24190a(th));
        }
        boolean z = false;
        if (C5049i.m24191b(i) != null) {
            i = 0;
        }
        int intValue = ((Number) i).intValue();
        if (intValue == this.f32890f) {
            mediaFormat.setInteger("rotation-degrees", 0);
            int i2 = (intValue + this.f32891g) % 360;
            m5854k().m5867k(i2);
            if (i2 % 180 != 0) {
                z = true;
            }
            float integer = mediaFormat.getInteger("width") / mediaFormat.getInteger("height");
            MediaFormat mediaFormat2 = this.f32892h;
            float integer2 = (z ? mediaFormat2.getInteger("height") : mediaFormat2.getInteger("width")) / (z ? this.f32892h.getInteger("width") : this.f32892h.getInteger("height"));
            float f2 = 1.0f;
            if (integer > integer2) {
                f2 = integer / integer2;
            } else if (integer < integer2) {
                f = integer2 / integer;
                m5854k().m5866l(f2, f);
                this.f32889e = C10163c.m5865a(mediaFormat.getInteger("frame-rate"), this.f32892h.getInteger("frame-rate"));
                Surface h = m5854k().m5870h();
                C8298k.m12935d(h, "frameDrawer.surface");
                return h;
            }
            f = 1.0f;
            m5854k().m5866l(f2, f);
            this.f32889e = C10163c.m5865a(mediaFormat.getInteger("frame-rate"), this.f32892h.getInteger("frame-rate"));
            Surface h2 = m5854k().m5870h();
            C8298k.m12935d(h2, "frameDrawer.surface");
            return h2;
        }
        throw new IllegalStateException(("Unexpected difference in rotation. DataSource=" + this.f32890f + ", MediaFormat=" + intValue).toString());
    }

    @Override
    public void mo5856i(AbstractC9461b bVar) {
        C8298k.m12934e(bVar, "next");
        AbstractC9480j.C9481a.m8557a(this, bVar);
    }

    public C10166e mo5860e() {
        return this.f32887c;
    }

    public final C10160a m5854k() {
        return (C10160a) this.f32888d.getValue();
    }

    public C10166e(int i, int i2, MediaFormat mediaFormat, boolean z, int i3, C8294g gVar) {
        this(i, i2, mediaFormat, (i3 & 8) != 0 ? false : z);
    }
}
