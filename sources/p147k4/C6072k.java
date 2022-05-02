package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;

public final class C6072k extends AbstractC6069i {
    public static final Parcelable.Creator<C6072k> CREATOR = new C6073a();
    public final int f19293M;
    public final int[] f19294N;
    public final int[] f19295O;
    public final int f19296b;
    public final int f19297c;

    public class C6073a implements Parcelable.Creator<C6072k> {
        public C6072k createFromParcel(Parcel parcel) {
            return new C6072k(parcel);
        }

        public C6072k[] newArray(int i) {
            return new C6072k[i];
        }
    }

    public C6072k(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f19296b = i;
        this.f19297c = i2;
        this.f19293M = i3;
        this.f19294N = iArr;
        this.f19295O = iArr2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6072k.class != obj.getClass()) {
            return false;
        }
        C6072k kVar = (C6072k) obj;
        return this.f19296b == kVar.f19296b && this.f19297c == kVar.f19297c && this.f19293M == kVar.f19293M && Arrays.equals(this.f19294N, kVar.f19294N) && Arrays.equals(this.f19295O, kVar.f19295O);
    }

    public int hashCode() {
        return ((((((((527 + this.f19296b) * 31) + this.f19297c) * 31) + this.f19293M) * 31) + Arrays.hashCode(this.f19294N)) * 31) + Arrays.hashCode(this.f19295O);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19296b);
        parcel.writeInt(this.f19297c);
        parcel.writeInt(this.f19293M);
        parcel.writeIntArray(this.f19294N);
        parcel.writeIntArray(this.f19295O);
    }

    public C6072k(Parcel parcel) {
        super("MLLT");
        this.f19296b = parcel.readInt();
        this.f19297c = parcel.readInt();
        this.f19293M = parcel.readInt();
        this.f19294N = (int[]) C1216l0.m37971j(parcel.createIntArray());
        this.f19295O = (int[]) C1216l0.m37971j(parcel.createIntArray());
    }
}
