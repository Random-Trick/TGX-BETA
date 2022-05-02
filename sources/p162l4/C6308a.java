package p162l4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C6308a implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C6308a> CREATOR = new C6309a();
    public final int f19844M;
    public final String f19845a;
    public final byte[] f19846b;
    public final int f19847c;

    public class C6309a implements Parcelable.Creator<C6308a> {
        public C6308a createFromParcel(Parcel parcel) {
            return new C6308a(parcel, null);
        }

        public C6308a[] newArray(int i) {
            return new C6308a[i];
        }
    }

    public C6308a(Parcel parcel, C6309a aVar) {
        this(parcel);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6308a.class != obj.getClass()) {
            return false;
        }
        C6308a aVar = (C6308a) obj;
        return this.f19845a.equals(aVar.f19845a) && Arrays.equals(this.f19846b, aVar.f19846b) && this.f19847c == aVar.f19847c && this.f19844M == aVar.f19844M;
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return C4263b.m28324a(this);
    }

    @Override
    public C6600g1 getWrappedMetadataFormat() {
        return C4263b.m28323b(this);
    }

    public int hashCode() {
        return ((((((527 + this.f19845a.hashCode()) * 31) + Arrays.hashCode(this.f19846b)) * 31) + this.f19847c) * 31) + this.f19844M;
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        C4263b.m28322c(this, bVar);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f19845a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19845a);
        parcel.writeByteArray(this.f19846b);
        parcel.writeInt(this.f19847c);
        parcel.writeInt(this.f19844M);
    }

    public C6308a(String str, byte[] bArr, int i, int i2) {
        this.f19845a = str;
        this.f19846b = bArr;
        this.f19847c = i;
        this.f19844M = i2;
    }

    public C6308a(Parcel parcel) {
        this.f19845a = (String) C1216l0.m37968j(parcel.readString());
        this.f19846b = (byte[]) C1216l0.m37968j(parcel.createByteArray());
        this.f19847c = parcel.readInt();
        this.f19844M = parcel.readInt();
    }
}
