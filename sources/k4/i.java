package k4;

import f4.a;
import f4.b;
import m3.c2;
import m3.q1;

public abstract class i implements a.b {
    public final String f15647a;

    public i(String str) {
        this.f15647a = str;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return b.a(this);
    }

    @Override
    public q1 getWrappedMetadataFormat() {
        return b.b(this);
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        b.c(this, bVar);
    }

    public String toString() {
        return this.f15647a;
    }
}
