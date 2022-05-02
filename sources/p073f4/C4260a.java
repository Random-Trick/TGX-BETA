package p073f4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p020b5.C1216l0;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C4260a implements Parcelable {
    public static final Parcelable.Creator<C4260a> CREATOR = new C4261a();
    public final AbstractC4262b[] f14313a;

    public class C4261a implements Parcelable.Creator<C4260a> {
        public C4260a createFromParcel(Parcel parcel) {
            return new C4260a(parcel);
        }

        public C4260a[] newArray(int i) {
            return new C4260a[i];
        }
    }

    public interface AbstractC4262b extends Parcelable {
        byte[] getWrappedMetadataBytes();

        C6600g1 getWrappedMetadataFormat();

        void populateMediaMetadata(C6693s1.C6695b bVar);
    }

    public C4260a(AbstractC4262b... bVarArr) {
        this.f14313a = bVarArr;
    }

    public C4260a m28330a(AbstractC4262b... bVarArr) {
        return bVarArr.length == 0 ? this : new C4260a((AbstractC4262b[]) C1216l0.m37947t0(this.f14313a, bVarArr));
    }

    public C4260a m28329b(C4260a aVar) {
        return aVar == null ? this : m28330a(aVar.f14313a);
    }

    public AbstractC4262b m28328c(int i) {
        return this.f14313a[i];
    }

    public int m28327d() {
        return this.f14313a.length;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4260a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14313a, ((C4260a) obj).f14313a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14313a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f14313a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14313a.length);
        for (AbstractC4262b bVar : this.f14313a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public C4260a(List<? extends AbstractC4262b> list) {
        this.f14313a = (AbstractC4262b[]) list.toArray(new AbstractC4262b[0]);
    }

    public C4260a(Parcel parcel) {
        this.f14313a = new AbstractC4262b[parcel.readInt()];
        int i = 0;
        while (true) {
            AbstractC4262b[] bVarArr = this.f14313a;
            if (i < bVarArr.length) {
                bVarArr[i] = (AbstractC4262b) parcel.readParcelable(AbstractC4262b.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
