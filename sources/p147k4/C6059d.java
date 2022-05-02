package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;

public final class C6059d extends AbstractC6069i {
    public static final Parcelable.Creator<C6059d> CREATOR = new C6060a();
    public final boolean f19271M;
    public final String[] f19272N;
    public final AbstractC6069i[] f19273O;
    public final String f19274b;
    public final boolean f19275c;

    public class C6060a implements Parcelable.Creator<C6059d> {
        public C6059d createFromParcel(Parcel parcel) {
            return new C6059d(parcel);
        }

        public C6059d[] newArray(int i) {
            return new C6059d[i];
        }
    }

    public C6059d(String str, boolean z, boolean z2, String[] strArr, AbstractC6069i[] iVarArr) {
        super("CTOC");
        this.f19274b = str;
        this.f19275c = z;
        this.f19271M = z2;
        this.f19272N = strArr;
        this.f19273O = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6059d.class != obj.getClass()) {
            return false;
        }
        C6059d dVar = (C6059d) obj;
        return this.f19275c == dVar.f19275c && this.f19271M == dVar.f19271M && C1216l0.m37985c(this.f19274b, dVar.f19274b) && Arrays.equals(this.f19272N, dVar.f19272N) && Arrays.equals(this.f19273O, dVar.f19273O);
    }

    public int hashCode() {
        int i = (((527 + (this.f19275c ? 1 : 0)) * 31) + (this.f19271M ? 1 : 0)) * 31;
        String str = this.f19274b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19274b);
        parcel.writeByte(this.f19275c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19271M ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f19272N);
        parcel.writeInt(this.f19273O.length);
        for (AbstractC6069i iVar : this.f19273O) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public C6059d(Parcel parcel) {
        super("CTOC");
        this.f19274b = (String) C1216l0.m37971j(parcel.readString());
        boolean z = true;
        this.f19275c = parcel.readByte() != 0;
        this.f19271M = parcel.readByte() == 0 ? false : z;
        this.f19272N = (String[]) C1216l0.m37971j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f19273O = new AbstractC6069i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f19273O[i] = (AbstractC6069i) parcel.readParcelable(AbstractC6069i.class.getClassLoader());
        }
    }
}
