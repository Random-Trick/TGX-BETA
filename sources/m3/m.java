package m3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.ext.ffmpeg.b;
import d5.z;
import e4.j;
import e4.l;
import e4.q;
import f4.f;
import f4.g;
import java.util.ArrayList;
import o3.b0;
import o3.g0;
import o3.s;
import o3.t;
import q4.l;
import r3.a;

public class m implements f3 {
    public final Context f16773a;
    public boolean f16777e;
    public boolean f16779g;
    public boolean f16780h;
    public boolean f16781i;
    public final j f16774b = new j();
    public int f16775c = 0;
    public long f16776d = 5000;
    public q f16778f = q.f10567a;

    public m(Context context) {
        this.f16773a = context;
    }

    @Override
    public b3[] a(Handler handler, z zVar, s sVar, l lVar, f fVar) {
        ArrayList<b3> arrayList = new ArrayList<>();
        h(this.f16773a, this.f16775c, this.f16778f, this.f16777e, handler, zVar, this.f16776d, arrayList);
        t c10 = c(this.f16773a, this.f16779g, this.f16780h, this.f16781i);
        if (c10 != null) {
            b(this.f16773a, this.f16775c, this.f16778f, this.f16777e, c10, handler, sVar, arrayList);
        }
        g(this.f16773a, lVar, handler.getLooper(), this.f16775c, arrayList);
        e(this.f16773a, fVar, handler.getLooper(), this.f16775c, arrayList);
        d(this.f16773a, this.f16775c, arrayList);
        f(this.f16773a, handler, this.f16775c, arrayList);
        return (b3[]) arrayList.toArray(new b3[0]);
    }

    public void b(Context context, int i10, q qVar, boolean z10, t tVar, Handler handler, s sVar, ArrayList<b3> arrayList) {
        int i11;
        int i12;
        arrayList.add(new g0(context, i(), qVar, z10, handler, sVar, tVar));
        if (i10 != 0) {
            int size = arrayList.size();
            if (i10 == 2) {
                size--;
            }
            try {
                try {
                    i11 = size + 1;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating Opus extension", e10);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (b3) a.class.getConstructor(Handler.class, s.class, t.class).newInstance(handler, sVar, tVar));
                c5.s.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (b3) com.google.android.exoplayer2.ext.flac.j.class.getConstructor(Handler.class, s.class, t.class).newInstance(handler, sVar, tVar));
                        c5.s.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                        arrayList.add(i12, (b3) b.class.getConstructor(Handler.class, s.class, t.class).newInstance(handler, sVar, tVar));
                        c5.s.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    }
                } catch (ClassNotFoundException unused4) {
                }
                arrayList.add(i12, (b3) b.class.getConstructor(Handler.class, s.class, t.class).newInstance(handler, sVar, tVar));
                c5.s.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            }
            try {
                i12 = i11 + 1;
                arrayList.add(i11, (b3) com.google.android.exoplayer2.ext.flac.j.class.getConstructor(Handler.class, s.class, t.class).newInstance(handler, sVar, tVar));
                c5.s.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                try {
                    arrayList.add(i12, (b3) b.class.getConstructor(Handler.class, s.class, t.class).newInstance(handler, sVar, tVar));
                    c5.s.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e11);
                }
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating FLAC extension", e12);
            }
        }
    }

    public t c(Context context, boolean z10, boolean z11, boolean z12) {
        return new b0.e().g(o3.f.c(context)).k(z10).j(z11).l(z12 ? 1 : 0).f();
    }

    public void d(Context context, int i10, ArrayList<b3> arrayList) {
        arrayList.add(new e5.b());
    }

    public void e(Context context, f fVar, Looper looper, int i10, ArrayList<b3> arrayList) {
        arrayList.add(new g(fVar, looper));
    }

    public void f(Context context, Handler handler, int i10, ArrayList<b3> arrayList) {
    }

    public void g(Context context, l lVar, Looper looper, int i10, ArrayList<b3> arrayList) {
        arrayList.add(new q4.m(lVar, looper));
    }

    public void h(Context context, int i10, q qVar, boolean z10, Handler handler, z zVar, long j10, ArrayList<b3> arrayList) {
        int i11;
        arrayList.add(new d5.j(context, i(), qVar, j10, z10, handler, zVar, 50));
        if (i10 != 0) {
            int size = arrayList.size();
            if (i10 == 2) {
                size--;
            }
            try {
                try {
                    i11 = size + 1;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating VP9 extension", e10);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (b3) s3.a.class.getConstructor(Long.TYPE, Handler.class, z.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, zVar, 50));
                c5.s.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i11;
                i11 = size;
                arrayList.add(i11, (b3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, z.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, zVar, 50));
                c5.s.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            }
            try {
                arrayList.add(i11, (b3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, z.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, zVar, 50));
                c5.s.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating AV1 extension", e11);
            }
        }
    }

    public l.b i() {
        return this.f16774b;
    }

    public m j(int i10) {
        this.f16775c = i10;
        return this;
    }
}
