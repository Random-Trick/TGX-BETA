package org.thunderdog.challegram.video.old;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;
import z8.g;

@TargetApi(16)
public class a {
    public g f20185a = g.f27034j;
    public ArrayList<e> f20186b = new ArrayList<>();
    public File f20187c;
    public int f20188d;
    public int f20189e;

    public void a(int i10, long j10, MediaCodec.BufferInfo bufferInfo) {
        if (i10 >= 0 && i10 < this.f20186b.size()) {
            this.f20186b.get(i10).b(j10, bufferInfo);
        }
    }

    public int b(MediaFormat mediaFormat, boolean z10) {
        this.f20186b.add(new e(this.f20186b.size(), mediaFormat, z10));
        return this.f20186b.size() - 1;
    }

    public File c() {
        return this.f20187c;
    }

    public g d() {
        return this.f20185a;
    }

    public ArrayList<e> e() {
        return this.f20186b;
    }

    public void f(File file) {
        this.f20187c = file;
    }

    public void g(int i10) {
        if (i10 == 0) {
            this.f20185a = g.f27034j;
        } else if (i10 == 90) {
            this.f20185a = g.f27035k;
        } else if (i10 == 180) {
            this.f20185a = g.f27036l;
        } else if (i10 == 270) {
            this.f20185a = g.f27037m;
        }
    }

    public void h(int i10, int i11) {
        this.f20188d = i10;
        this.f20189e = i11;
    }
}
