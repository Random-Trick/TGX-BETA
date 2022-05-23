package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;

public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final boolean M;
    public final String[] N;
    public final i[] O;
    public final String f15635b;
    public final boolean f15636c;

    public class a implements Parcelable.Creator<d> {
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f15635b = str;
        this.f15636c = z10;
        this.M = z11;
        this.N = strArr;
        this.O = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15636c == dVar.f15636c && this.M == dVar.M && l0.c(this.f15635b, dVar.f15635b) && Arrays.equals(this.N, dVar.N) && Arrays.equals(this.O, dVar.O);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f15636c ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31;
        String str = this.f15635b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15635b);
        parcel.writeByte(this.f15636c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.N);
        parcel.writeInt(this.O.length);
        for (i iVar : this.O) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.f15635b = (String) l0.j(parcel.readString());
        boolean z10 = true;
        this.f15636c = parcel.readByte() != 0;
        this.M = parcel.readByte() == 0 ? false : z10;
        this.N = (String[]) l0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.O = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.O[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
