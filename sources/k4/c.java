package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;

public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final int M;
    public final long N;
    public final long O;
    public final i[] P;
    public final String f15633b;
    public final int f15634c;

    public class a implements Parcelable.Creator<c> {
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f15633b = str;
        this.f15634c = i10;
        this.M = i11;
        this.N = j10;
        this.O = j11;
        this.P = iVarArr;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15634c == cVar.f15634c && this.M == cVar.M && this.N == cVar.N && this.O == cVar.O && l0.c(this.f15633b, cVar.f15633b) && Arrays.equals(this.P, cVar.P);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f15634c) * 31) + this.M) * 31) + ((int) this.N)) * 31) + ((int) this.O)) * 31;
        String str = this.f15633b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15633b);
        parcel.writeInt(this.f15634c);
        parcel.writeInt(this.M);
        parcel.writeLong(this.N);
        parcel.writeLong(this.O);
        parcel.writeInt(this.P.length);
        for (i iVar : this.P) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        this.f15633b = (String) l0.j(parcel.readString());
        this.f15634c = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readLong();
        this.O = parcel.readLong();
        int readInt = parcel.readInt();
        this.P = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.P[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
