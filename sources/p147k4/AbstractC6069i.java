package p147k4;

import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public abstract class AbstractC6069i implements C4260a.AbstractC4262b {
    public final String f19289a;

    public AbstractC6069i(String str) {
        this.f19289a = str;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return C4263b.m28326a(this);
    }

    @Override
    public C6600g1 getWrappedMetadataFormat() {
        return C4263b.m28325b(this);
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        C4263b.m28324c(this, bVar);
    }

    public String toString() {
        return this.f19289a;
    }
}
