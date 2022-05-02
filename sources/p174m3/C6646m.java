package p174m3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.ext.ffmpeg.C3440b;
import com.google.android.exoplayer2.ext.flac.C3455j;
import java.util.ArrayList;
import p020b5.C1230s;
import p032c5.AbstractC1642z;
import p032c5.C1618j;
import p045d5.C3602b;
import p059e4.AbstractC4134l;
import p059e4.AbstractC4143q;
import p059e4.C4132j;
import p073f4.AbstractC4268f;
import p073f4.C4269g;
import p199o3.AbstractC7611g;
import p199o3.AbstractC7634s;
import p199o3.AbstractC7636t;
import p199o3.C7585b0;
import p199o3.C7606f;
import p199o3.C7608f0;
import p217p4.AbstractC8048l;
import p217p4.C8049m;
import p244r3.C8357a;
import p259s3.C8638a;

public class C6646m implements AbstractC6713w2 {
    public final Context f20765a;
    public boolean f20769e;
    public boolean f20771g;
    public boolean f20772h;
    public boolean f20773i;
    public final C4132j f20766b = new C4132j();
    public int f20767c = 0;
    public long f20768d = 5000;
    public AbstractC4143q f20770f = AbstractC4143q.f14040a;

    public C6646m(Context context) {
        this.f20765a = context;
    }

    @Override
    public AbstractC6696s2[] mo19396a(Handler handler, AbstractC1642z zVar, AbstractC7634s sVar, AbstractC8048l lVar, AbstractC4268f fVar) {
        ArrayList<AbstractC6696s2> arrayList = new ArrayList<>();
        m19678h(this.f20765a, this.f20767c, this.f20770f, this.f20769e, handler, zVar, this.f20768d, arrayList);
        AbstractC7636t c = m19683c(this.f20765a, this.f20771g, this.f20772h, this.f20773i);
        if (c != null) {
            m19684b(this.f20765a, this.f20767c, this.f20770f, this.f20769e, c, handler, sVar, arrayList);
        }
        m19679g(this.f20765a, lVar, handler.getLooper(), this.f20767c, arrayList);
        m19681e(this.f20765a, fVar, handler.getLooper(), this.f20767c, arrayList);
        m19682d(this.f20765a, this.f20767c, arrayList);
        m19680f(this.f20765a, handler, this.f20767c, arrayList);
        return (AbstractC6696s2[]) arrayList.toArray(new AbstractC6696s2[0]);
    }

    public void m19684b(Context context, int i, AbstractC4143q qVar, boolean z, AbstractC7636t tVar, Handler handler, AbstractC7634s sVar, ArrayList<AbstractC6696s2> arrayList) {
        int i2;
        int i3;
        arrayList.add(new C7608f0(context, m19677i(), qVar, z, handler, sVar, tVar));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    i2 = size + 1;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating Opus extension", e);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (AbstractC6696s2) C8357a.class.getConstructor(Handler.class, AbstractC7634s.class, AbstractC7636t.class).newInstance(handler, sVar, tVar));
                C1230s.m37887f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i2;
                i2 = size;
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (AbstractC6696s2) C3455j.class.getConstructor(Handler.class, AbstractC7634s.class, AbstractC7636t.class).newInstance(handler, sVar, tVar));
                        C1230s.m37887f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                        arrayList.add(i3, (AbstractC6696s2) C3440b.class.getConstructor(Handler.class, AbstractC7634s.class, AbstractC7636t.class).newInstance(handler, sVar, tVar));
                        C1230s.m37887f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    }
                } catch (ClassNotFoundException unused4) {
                }
                arrayList.add(i3, (AbstractC6696s2) C3440b.class.getConstructor(Handler.class, AbstractC7634s.class, AbstractC7636t.class).newInstance(handler, sVar, tVar));
                C1230s.m37887f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            }
            try {
                i3 = i2 + 1;
                arrayList.add(i2, (AbstractC6696s2) C3455j.class.getConstructor(Handler.class, AbstractC7634s.class, AbstractC7636t.class).newInstance(handler, sVar, tVar));
                C1230s.m37887f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                try {
                    arrayList.add(i3, (AbstractC6696s2) C3440b.class.getConstructor(Handler.class, AbstractC7634s.class, AbstractC7636t.class).newInstance(handler, sVar, tVar));
                    C1230s.m37887f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FLAC extension", e3);
            }
        }
    }

    public AbstractC7636t m19683c(Context context, boolean z, boolean z2, boolean z3) {
        return new C7585b0(C7606f.m15524c(context), new C7585b0.C7589d(new AbstractC7611g[0]), z, z2, z3 ? 1 : 0);
    }

    public void m19682d(Context context, int i, ArrayList<AbstractC6696s2> arrayList) {
        arrayList.add(new C3602b());
    }

    public void m19681e(Context context, AbstractC4268f fVar, Looper looper, int i, ArrayList<AbstractC6696s2> arrayList) {
        arrayList.add(new C4269g(fVar, looper));
    }

    public void m19680f(Context context, Handler handler, int i, ArrayList<AbstractC6696s2> arrayList) {
    }

    public void m19679g(Context context, AbstractC8048l lVar, Looper looper, int i, ArrayList<AbstractC6696s2> arrayList) {
        arrayList.add(new C8049m(lVar, looper));
    }

    public void m19678h(Context context, int i, AbstractC4143q qVar, boolean z, Handler handler, AbstractC1642z zVar, long j, ArrayList<AbstractC6696s2> arrayList) {
        int i2;
        arrayList.add(new C1618j(context, m19677i(), qVar, j, z, handler, zVar, 50));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    i2 = size + 1;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating VP9 extension", e);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (AbstractC6696s2) C8638a.class.getConstructor(Long.TYPE, Handler.class, AbstractC1642z.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, zVar, 50));
                C1230s.m37887f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i2;
                i2 = size;
                arrayList.add(i2, (AbstractC6696s2) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, AbstractC1642z.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, zVar, 50));
                C1230s.m37887f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            }
            try {
                arrayList.add(i2, (AbstractC6696s2) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, AbstractC1642z.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, zVar, 50));
                C1230s.m37887f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        }
    }

    public AbstractC4134l.AbstractC4136b m19677i() {
        return this.f20766b;
    }

    public C6646m m19676j(int i) {
        this.f20767c = i;
        return this;
    }
}
