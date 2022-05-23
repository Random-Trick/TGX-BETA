package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f4.a;
import f4.b;
import m3.c2;
import m3.q1;

public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0110a();
    public final int f12100a;
    public final String f12101b;

    public class C0110a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) c5.a.e(parcel.readString()));
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f12100a = i10;
        this.f12101b = str;
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
        int i10 = this.f12100a;
        String str = this.f12101b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
        sb2.append("Ait(controlCode=");
        sb2.append(i10);
        sb2.append(",url=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12101b);
        parcel.writeInt(this.f12100a);
    }
}
