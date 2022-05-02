package p205o9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.util.Iterator;
import p107ha.AbstractC5044d;
import p107ha.C5045e;
import p107ha.C5046f;
import p107ha.C5048h;
import p107ha.C5054l;
import p123ia.C5304n;
import p192n9.EnumC7311c;
import p192n9.EnumC7313d;
import p316w9.AbstractC10012l;
import p316w9.C10007i;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8298k;

public final class C7795b {
    public final C10007i f24972a = new C10007i("Codecs");
    public final AbstractC10012l<C5048h<MediaCodec, Surface>> f24973b = new C7796a();
    public final AbstractC10012l<Boolean> f24974c = new C7799b();
    public final AbstractC10012l<Boolean> f24975d = new C7800c();
    public final C7802d f24976e;
    public final C7811i f24977f;
    public final AbstractC10012l<Integer> f24978g;

    public static final class C7796a implements AbstractC10012l<C5048h<? extends MediaCodec, ? extends Surface>> {
        public final AbstractC5044d f24979a = C5045e.m24197a(new C7797a());
        public final AbstractC5044d f24980b = C5045e.m24197a(new C7798b());

        public static final class C7797a extends AbstractC8299l implements AbstractC8077a<C5048h> {
            public C7797a() {
                super(0);
            }

            public final C5048h mo4925b() {
                MediaFormat a = C7795b.this.f24977f.m14988c().mo6241a();
                String string = a.getString("mime");
                C8298k.m12936c(string);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                C8298k.m12935d(createEncoderByType, "MediaCodec.createEncoder…(MediaFormat.KEY_MIME)!!)");
                createEncoderByType.configure(a, (Surface) null, (MediaCrypto) null, 1);
                return C5054l.m24188a(createEncoderByType, null);
            }
        }

        public static final class C7798b extends AbstractC8299l implements AbstractC8077a<C5048h<? extends MediaCodec, ? extends Surface>> {
            public C7798b() {
                super(0);
            }

            public final C5048h<MediaCodec, Surface> mo4925b() {
                MediaFormat b = C7795b.this.f24977f.m14988c().mo6240b();
                String string = b.getString("mime");
                C8298k.m12936c(string);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                C8298k.m12935d(createEncoderByType, "MediaCodec.createEncoder…(MediaFormat.KEY_MIME)!!)");
                createEncoderByType.configure(b, (Surface) null, (MediaCrypto) null, 1);
                return C5054l.m24188a(createEncoderByType, createEncoderByType.createInputSurface());
            }
        }

        public C7796a() {
        }

        @Override
        public boolean mo6237g(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return C7795b.this.f24977f.m14989b().mo6239d(dVar) == EnumC7311c.COMPRESSING;
        }

        @Override
        public int getSize() {
            return AbstractC10012l.C10013a.m6227f(this);
        }

        public C5048h<MediaCodec, Surface> mo6234n() {
            return (C5048h) AbstractC10012l.C10013a.m6232a(this);
        }

        public C5048h<MediaCodec, Surface> mo6239d(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            int i = C7794a.f24971a[dVar.ordinal()];
            if (i == 1) {
                return m15066r();
            }
            if (i == 2) {
                return m15065s();
            }
            throw new C5046f();
        }

        @Override
        public Iterator<C5048h<MediaCodec, Surface>> iterator() {
            return AbstractC10012l.C10013a.m6225h(this);
        }

        @Override
        public boolean mo6236k() {
            return AbstractC10012l.C10013a.m6230c(this);
        }

        public C5048h<MediaCodec, Surface> mo6241a() {
            return (C5048h) AbstractC10012l.C10013a.m6231b(this);
        }

        @Override
        public boolean mo6233o() {
            return AbstractC10012l.C10013a.m6229d(this);
        }

        public final C5048h m15066r() {
            return (C5048h) this.f24979a.getValue();
        }

        public final C5048h<MediaCodec, Surface> m15065s() {
            return (C5048h) this.f24980b.getValue();
        }

        public C5048h<MediaCodec, Surface> mo6238f(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return (C5048h) AbstractC10012l.C10013a.m6228e(this, dVar);
        }

        public C5048h<MediaCodec, Surface> mo6240b() {
            return (C5048h) AbstractC10012l.C10013a.m6226g(this);
        }

        public C5048h<MediaCodec, Surface> mo6235l() {
            return (C5048h) AbstractC10012l.C10013a.m6224i(this);
        }
    }

    public static final class C7799b implements AbstractC10012l<Boolean> {
        public C7799b() {
        }

        @Override
        public boolean mo6237g(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return true;
        }

        @Override
        public int getSize() {
            return AbstractC10012l.C10013a.m6227f(this);
        }

        public Boolean mo6234n() {
            return (Boolean) AbstractC10012l.C10013a.m6232a(this);
        }

        public Boolean mo6239d(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return Boolean.valueOf(((Number) C7795b.this.f24978g.mo6239d(dVar)).intValue() == 0);
        }

        @Override
        public Iterator<Boolean> iterator() {
            return AbstractC10012l.C10013a.m6225h(this);
        }

        @Override
        public boolean mo6236k() {
            return AbstractC10012l.C10013a.m6230c(this);
        }

        public Boolean mo6241a() {
            return (Boolean) AbstractC10012l.C10013a.m6231b(this);
        }

        @Override
        public boolean mo6233o() {
            return AbstractC10012l.C10013a.m6229d(this);
        }

        public Boolean mo6238f(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return (Boolean) AbstractC10012l.C10013a.m6228e(this, dVar);
        }

        public Boolean mo6240b() {
            return (Boolean) AbstractC10012l.C10013a.m6226g(this);
        }

        public Boolean mo6235l() {
            return (Boolean) AbstractC10012l.C10013a.m6224i(this);
        }
    }

    public static final class C7800c implements AbstractC10012l<Boolean> {
        public C7800c() {
        }

        @Override
        public boolean mo6237g(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return true;
        }

        @Override
        public int getSize() {
            return AbstractC10012l.C10013a.m6227f(this);
        }

        public Boolean mo6234n() {
            return (Boolean) AbstractC10012l.C10013a.m6232a(this);
        }

        public Boolean mo6239d(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return Boolean.valueOf(((Number) C7795b.this.f24978g.mo6239d(dVar)).intValue() == C5304n.m23365g(C7795b.this.f24976e.mo6239d(dVar)));
        }

        @Override
        public Iterator<Boolean> iterator() {
            return AbstractC10012l.C10013a.m6225h(this);
        }

        @Override
        public boolean mo6236k() {
            return AbstractC10012l.C10013a.m6230c(this);
        }

        public Boolean mo6241a() {
            return (Boolean) AbstractC10012l.C10013a.m6231b(this);
        }

        @Override
        public boolean mo6233o() {
            return AbstractC10012l.C10013a.m6229d(this);
        }

        public Boolean mo6238f(EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            return (Boolean) AbstractC10012l.C10013a.m6228e(this, dVar);
        }

        public Boolean mo6240b() {
            return (Boolean) AbstractC10012l.C10013a.m6226g(this);
        }

        public Boolean mo6235l() {
            return (Boolean) AbstractC10012l.C10013a.m6224i(this);
        }
    }

    public C7795b(C7802d dVar, C7811i iVar, AbstractC10012l<Integer> lVar) {
        C8298k.m12934e(dVar, "sources");
        C8298k.m12934e(iVar, "tracks");
        C8298k.m12934e(lVar, "current");
        this.f24976e = dVar;
        this.f24977f = iVar;
        this.f24978g = lVar;
    }

    public final AbstractC10012l<C5048h<MediaCodec, Surface>> m15073d() {
        return this.f24973b;
    }

    public final AbstractC10012l<Boolean> m15072e() {
        return this.f24974c;
    }

    public final AbstractC10012l<Boolean> m15071f() {
        return this.f24975d;
    }

    public final void m15070g() {
        for (C5048h<MediaCodec, Surface> hVar : this.f24973b) {
            hVar.m24194c().release();
        }
    }
}
