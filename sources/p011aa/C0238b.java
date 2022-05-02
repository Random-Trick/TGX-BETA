package p011aa;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.thunderdog.challegram.Log;
import p192n9.EnumC7311c;
import p192n9.EnumC7313d;
import p316w9.AbstractC10008j;
import p316w9.C10007i;
import p316w9.C10014m;

public class C0238b implements AbstractC0237a {
    public static final C10007i f732i = new C10007i("DefaultDataSink");
    public boolean f733a;
    public final MediaMuxer f734b;
    public final List<C0240b> f735c;
    public ByteBuffer f736d;
    public final AbstractC10008j<EnumC7311c> f737e;
    public final AbstractC10008j<MediaFormat> f738f;
    public final AbstractC10008j<Integer> f739g;
    public final C0241c f740h;

    public static class C0240b {
        public final EnumC7313d f741a;
        public final int f742b;
        public final long f743c;
        public final int f744d;

        public C0240b(EnumC7313d dVar, MediaCodec.BufferInfo bufferInfo) {
            this.f741a = dVar;
            this.f742b = bufferInfo.size;
            this.f743c = bufferInfo.presentationTimeUs;
            this.f744d = bufferInfo.flags;
        }
    }

    public C0238b(String str) {
        this(str, 0);
    }

    @Override
    public void mo6278a() {
        try {
            this.f734b.release();
        } catch (Exception e) {
            f732i.m6259k("Failed to release the muxer.", e);
        }
    }

    @Override
    public void mo6277b(EnumC7313d dVar, MediaFormat mediaFormat) {
        C10007i iVar = f732i;
        iVar.m6267c("setTrackFormat(" + dVar + ") format=" + mediaFormat);
        if (this.f737e.mo6239d(dVar) == EnumC7311c.COMPRESSING) {
            this.f740h.m42027b(dVar, mediaFormat);
        }
        this.f738f.mo6256p(dVar, mediaFormat);
        m42033i();
    }

    @Override
    public void mo6276c(EnumC7313d dVar, EnumC7311c cVar) {
        this.f737e.mo6256p(dVar, cVar);
    }

    @Override
    public void mo6275d(int i) {
        this.f734b.setOrientationHint(i);
    }

    @Override
    public void mo6274e(EnumC7313d dVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f733a) {
            this.f734b.writeSampleData(this.f739g.mo6239d(dVar).intValue(), byteBuffer, bufferInfo);
        } else {
            m42034h(dVar, byteBuffer, bufferInfo);
        }
    }

    @Override
    public void mo6273f(double d, double d2) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f734b.setLocation((float) d, (float) d2);
        }
    }

    public final void m42035g() {
        if (!this.f735c.isEmpty()) {
            this.f736d.flip();
            C10007i iVar = f732i;
            iVar.m6267c("Output format determined, writing pending data into the muxer. samples:" + this.f735c.size() + " bytes:" + this.f736d.limit());
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int i = 0;
            for (C0240b bVar : this.f735c) {
                bufferInfo.set(i, bVar.f742b, bVar.f743c, bVar.f744d);
                mo6274e(bVar.f741a, this.f736d, bufferInfo);
                i += bVar.f742b;
            }
            this.f735c.clear();
            this.f736d = null;
        }
    }

    public final void m42034h(EnumC7313d dVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f736d == null) {
            this.f736d = ByteBuffer.allocateDirect(Log.TAG_PAINT).order(ByteOrder.nativeOrder());
        }
        C10007i iVar = f732i;
        iVar.m6262h("enqueue(" + dVar + "): offset=" + bufferInfo.offset + "\trealOffset=" + byteBuffer.position() + "\tsize=" + bufferInfo.size + "\trealSize=" + byteBuffer.remaining() + "\tavailable=" + this.f736d.remaining() + "\ttotal=" + Log.TAG_PAINT);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        this.f736d.put(byteBuffer);
        this.f735c.add(new C0240b(dVar, bufferInfo));
    }

    public final void m42033i() {
        if (!this.f733a) {
            AbstractC10008j<EnumC7311c> jVar = this.f737e;
            EnumC7313d dVar = EnumC7313d.VIDEO;
            boolean a = jVar.mo6239d(dVar).m17064a();
            AbstractC10008j<EnumC7311c> jVar2 = this.f737e;
            EnumC7313d dVar2 = EnumC7313d.AUDIO;
            boolean a2 = jVar2.mo6239d(dVar2).m17064a();
            MediaFormat f = this.f738f.mo6238f(dVar);
            MediaFormat f2 = this.f738f.mo6238f(dVar2);
            boolean z = false;
            boolean z2 = f != null || !a;
            if (f2 != null || !a2) {
                z = true;
            }
            if (z2 && z) {
                if (a) {
                    int addTrack = this.f734b.addTrack(f);
                    this.f739g.mo6255q(Integer.valueOf(addTrack));
                    C10007i iVar = f732i;
                    iVar.m6262h("Added track #" + addTrack + " with " + f.getString("mime") + " to muxer");
                }
                if (a2) {
                    int addTrack2 = this.f734b.addTrack(f2);
                    this.f739g.mo6257j(Integer.valueOf(addTrack2));
                    C10007i iVar2 = f732i;
                    iVar2.m6262h("Added track #" + addTrack2 + " with " + f2.getString("mime") + " to muxer");
                }
                this.f734b.start();
                this.f733a = true;
                m42035g();
            }
        }
    }

    @Override
    public void stop() {
        this.f734b.stop();
    }

    public C0238b(String str, int i) {
        this.f733a = false;
        this.f735c = new ArrayList();
        this.f737e = C10014m.m6223a(null);
        this.f738f = C10014m.m6223a(null);
        this.f739g = C10014m.m6223a(null);
        this.f740h = new C0241c();
        try {
            this.f734b = new MediaMuxer(str, i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
