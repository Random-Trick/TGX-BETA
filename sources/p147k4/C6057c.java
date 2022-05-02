package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;

public final class C6057c extends AbstractC6069i {
    public static final Parcelable.Creator<C6057c> CREATOR = new C6058a();
    public final int f19265M;
    public final long f19266N;
    public final long f19267O;
    public final AbstractC6069i[] f19268P;
    public final String f19269b;
    public final int f19270c;

    public class C6058a implements Parcelable.Creator<C6057c> {
        public C6057c createFromParcel(Parcel parcel) {
            return new C6057c(parcel);
        }

        public C6057c[] newArray(int i) {
            return new C6057c[i];
        }
    }

    public C6057c(String str, int i, int i2, long j, long j2, AbstractC6069i[] iVarArr) {
        super("CHAP");
        this.f19269b = str;
        this.f19270c = i;
        this.f19265M = i2;
        this.f19266N = j;
        this.f19267O = j2;
        this.f19268P = iVarArr;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6057c.class != obj.getClass()) {
            return false;
        }
        C6057c cVar = (C6057c) obj;
        return this.f19270c == cVar.f19270c && this.f19265M == cVar.f19265M && this.f19266N == cVar.f19266N && this.f19267O == cVar.f19267O && C1216l0.m37985c(this.f19269b, cVar.f19269b) && Arrays.equals(this.f19268P, cVar.f19268P);
    }

    public int hashCode() {
        int i = (((((((527 + this.f19270c) * 31) + this.f19265M) * 31) + ((int) this.f19266N)) * 31) + ((int) this.f19267O)) * 31;
        String str = this.f19269b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19269b);
        parcel.writeInt(this.f19270c);
        parcel.writeInt(this.f19265M);
        parcel.writeLong(this.f19266N);
        parcel.writeLong(this.f19267O);
        parcel.writeInt(this.f19268P.length);
        for (AbstractC6069i iVar : this.f19268P) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public C6057c(Parcel parcel) {
        super("CHAP");
        this.f19269b = (String) C1216l0.m37971j(parcel.readString());
        this.f19270c = parcel.readInt();
        this.f19265M = parcel.readInt();
        this.f19266N = parcel.readLong();
        this.f19267O = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19268P = new AbstractC6069i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f19268P[i] = (AbstractC6069i) parcel.readParcelable(AbstractC6069i.class.getClassLoader());
        }
    }
}
