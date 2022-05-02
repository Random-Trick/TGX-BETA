package p132j4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1186a;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C5848c implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C5848c> CREATOR = new C5849a();
    public final byte[] f18718a;
    public final String f18719b;
    public final String f18720c;

    public class C5849a implements Parcelable.Creator<C5848c> {
        public C5848c createFromParcel(Parcel parcel) {
            return new C5848c(parcel);
        }

        public C5848c[] newArray(int i) {
            return new C5848c[i];
        }
    }

    public C5848c(byte[] bArr, String str, String str2) {
        this.f18718a = bArr;
        this.f18719b = str;
        this.f18720c = str2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5848c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18718a, ((C5848c) obj).f18718a);
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return C4263b.m28326a(this);
    }

    @Override
    public C6600g1 getWrappedMetadataFormat() {
        return C4263b.m28325b(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f18718a);
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        String str = this.f18719b;
        if (str != null) {
            bVar.m19503k0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f18719b, this.f18720c, Integer.valueOf(this.f18718a.length));
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f18718a);
        parcel.writeString(this.f18719b);
        parcel.writeString(this.f18720c);
    }

    public C5848c(Parcel parcel) {
        this.f18718a = (byte[]) C1186a.m38188e(parcel.createByteArray());
        this.f18719b = parcel.readString();
        this.f18720c = parcel.readString();
    }
}
