package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;

public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();
    public final int M;
    public final int[] N;
    public final int[] O;
    public final int f15650b;
    public final int f15651c;

    public class a implements Parcelable.Creator<k> {
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f15650b = i10;
        this.f15651c = i11;
        this.M = i12;
        this.N = iArr;
        this.O = iArr2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f15650b == kVar.f15650b && this.f15651c == kVar.f15651c && this.M == kVar.M && Arrays.equals(this.N, kVar.N) && Arrays.equals(this.O, kVar.O);
    }

    public int hashCode() {
        return ((((((((527 + this.f15650b) * 31) + this.f15651c) * 31) + this.M) * 31) + Arrays.hashCode(this.N)) * 31) + Arrays.hashCode(this.O);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15650b);
        parcel.writeInt(this.f15651c);
        parcel.writeInt(this.M);
        parcel.writeIntArray(this.N);
        parcel.writeIntArray(this.O);
    }

    public k(Parcel parcel) {
        super("MLLT");
        this.f15650b = parcel.readInt();
        this.f15651c = parcel.readInt();
        this.M = parcel.readInt();
        this.N = (int[]) l0.j(parcel.createIntArray());
        this.O = (int[]) l0.j(parcel.createIntArray());
    }
}
