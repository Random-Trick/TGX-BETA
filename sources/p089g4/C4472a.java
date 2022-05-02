package p089g4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1186a;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C4472a implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C4472a> CREATOR = new C4473a();
    public final int f14817a;
    public final String f14818b;

    public class C4473a implements Parcelable.Creator<C4472a> {
        public C4472a createFromParcel(Parcel parcel) {
            return new C4472a(parcel.readInt(), (String) C1186a.m38188e(parcel.readString()));
        }

        public C4472a[] newArray(int i) {
            return new C4472a[i];
        }
    }

    public C4472a(int i, String str) {
        this.f14817a = i;
        this.f14818b = str;
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
        int i = this.f14817a;
        String str = this.f14818b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
        sb2.append("Ait(controlCode=");
        sb2.append(i);
        sb2.append(",url=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14818b);
        parcel.writeInt(this.f14817a);
    }
}
