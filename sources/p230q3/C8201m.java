package p230q3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6615i;

public final class C8201m implements Comparator<C8203b>, Parcelable {
    public static final Parcelable.Creator<C8201m> CREATOR = new C8202a();
    public final int f26557M;
    public final C8203b[] f26558a;
    public int f26559b;
    public final String f26560c;

    public class C8202a implements Parcelable.Creator<C8201m> {
        public C8201m createFromParcel(Parcel parcel) {
            return new C8201m(parcel);
        }

        public C8201m[] newArray(int i) {
            return new C8201m[i];
        }
    }

    public static final class C8203b implements Parcelable {
        public static final Parcelable.Creator<C8203b> CREATOR = new C8204a();
        public final String f26561M;
        public final byte[] f26562N;
        public int f26563a;
        public final UUID f26564b;
        public final String f26565c;

        public class C8204a implements Parcelable.Creator<C8203b> {
            public C8203b createFromParcel(Parcel parcel) {
                return new C8203b(parcel);
            }

            public C8203b[] newArray(int i) {
                return new C8203b[i];
            }
        }

        public C8203b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public C8203b m13214a(byte[] bArr) {
            return new C8203b(this.f26564b, this.f26565c, this.f26561M, bArr);
        }

        public boolean m13213b(UUID uuid) {
            return C6615i.f20675a.equals(this.f26564b) || uuid.equals(this.f26564b);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8203b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C8203b bVar = (C8203b) obj;
            return C1216l0.m37982c(this.f26565c, bVar.f26565c) && C1216l0.m37982c(this.f26561M, bVar.f26561M) && C1216l0.m37982c(this.f26564b, bVar.f26564b) && Arrays.equals(this.f26562N, bVar.f26562N);
        }

        public int hashCode() {
            if (this.f26563a == 0) {
                int hashCode = this.f26564b.hashCode() * 31;
                String str = this.f26565c;
                this.f26563a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26561M.hashCode()) * 31) + Arrays.hashCode(this.f26562N);
            }
            return this.f26563a;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f26564b.getMostSignificantBits());
            parcel.writeLong(this.f26564b.getLeastSignificantBits());
            parcel.writeString(this.f26565c);
            parcel.writeString(this.f26561M);
            parcel.writeByteArray(this.f26562N);
        }

        public C8203b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f26564b = (UUID) C1186a.m38185e(uuid);
            this.f26565c = str;
            this.f26561M = (String) C1186a.m38185e(str2);
            this.f26562N = bArr;
        }

        public C8203b(Parcel parcel) {
            this.f26564b = new UUID(parcel.readLong(), parcel.readLong());
            this.f26565c = parcel.readString();
            this.f26561M = (String) C1216l0.m37968j(parcel.readString());
            this.f26562N = parcel.createByteArray();
        }
    }

    public C8201m(List<C8203b> list) {
        this(null, false, (C8203b[]) list.toArray(new C8203b[0]));
    }

    public int compare(C8203b bVar, C8203b bVar2) {
        UUID uuid = C6615i.f20675a;
        if (uuid.equals(bVar.f26564b)) {
            return uuid.equals(bVar2.f26564b) ? 0 : 1;
        }
        return bVar.f26564b.compareTo(bVar2.f26564b);
    }

    public C8201m m13218b(String str) {
        return C1216l0.m37982c(this.f26560c, str) ? this : new C8201m(str, false, this.f26558a);
    }

    public C8203b m13217c(int i) {
        return this.f26558a[i];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8201m.class != obj.getClass()) {
            return false;
        }
        C8201m mVar = (C8201m) obj;
        return C1216l0.m37982c(this.f26560c, mVar.f26560c) && Arrays.equals(this.f26558a, mVar.f26558a);
    }

    public int hashCode() {
        if (this.f26559b == 0) {
            String str = this.f26560c;
            this.f26559b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f26558a);
        }
        return this.f26559b;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26560c);
        parcel.writeTypedArray(this.f26558a, 0);
    }

    public C8201m(C8203b... bVarArr) {
        this(null, bVarArr);
    }

    public C8201m(String str, C8203b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C8201m(String str, boolean z, C8203b... bVarArr) {
        this.f26560c = str;
        bVarArr = z ? (C8203b[]) bVarArr.clone() : bVarArr;
        this.f26558a = bVarArr;
        this.f26557M = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C8201m(Parcel parcel) {
        this.f26560c = parcel.readString();
        C8203b[] bVarArr = (C8203b[]) C1216l0.m37968j((C8203b[]) parcel.createTypedArray(C8203b.CREATOR));
        this.f26558a = bVarArr;
        this.f26557M = bVarArr.length;
    }
}
