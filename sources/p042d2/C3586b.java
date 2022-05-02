package p042d2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p143k0.C6024a;

public class C3586b extends AbstractC3585a {
    public final SparseIntArray f12220d;
    public final Parcel f12221e;
    public final int f12222f;
    public final int f12223g;
    public final String f12224h;
    public int f12225i;
    public int f12226j;
    public int f12227k;

    public C3586b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C6024a(), new C6024a(), new C6024a());
    }

    @Override
    public void mo29938A(byte[] bArr) {
        if (bArr != null) {
            this.f12221e.writeInt(bArr.length);
            this.f12221e.writeByteArray(bArr);
            return;
        }
        this.f12221e.writeInt(-1);
    }

    @Override
    public void mo29937C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f12221e, 0);
    }

    @Override
    public void mo29936E(int i) {
        this.f12221e.writeInt(i);
    }

    @Override
    public void mo29935G(Parcelable parcelable) {
        this.f12221e.writeParcelable(parcelable, 0);
    }

    @Override
    public void mo29934I(String str) {
        this.f12221e.writeString(str);
    }

    @Override
    public void mo29933a() {
        int i = this.f12225i;
        if (i >= 0) {
            int i2 = this.f12220d.get(i);
            int dataPosition = this.f12221e.dataPosition();
            this.f12221e.setDataPosition(i2);
            this.f12221e.writeInt(dataPosition - i2);
            this.f12221e.setDataPosition(dataPosition);
        }
    }

    @Override
    public AbstractC3585a mo29932b() {
        Parcel parcel = this.f12221e;
        int dataPosition = parcel.dataPosition();
        int i = this.f12226j;
        if (i == this.f12222f) {
            i = this.f12223g;
        }
        int i2 = i;
        return new C3586b(parcel, dataPosition, i2, this.f12224h + "  ", this.f12217a, this.f12218b, this.f12219c);
    }

    @Override
    public boolean mo29931g() {
        return this.f12221e.readInt() != 0;
    }

    @Override
    public byte[] mo29930i() {
        int readInt = this.f12221e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f12221e.readByteArray(bArr);
        return bArr;
    }

    @Override
    public CharSequence mo29929k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f12221e);
    }

    @Override
    public boolean mo29928m(int i) {
        while (this.f12226j < this.f12223g) {
            int i2 = this.f12227k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f12221e.setDataPosition(this.f12226j);
            int readInt = this.f12221e.readInt();
            this.f12227k = this.f12221e.readInt();
            this.f12226j += readInt;
        }
        return this.f12227k == i;
    }

    @Override
    public int mo29927o() {
        return this.f12221e.readInt();
    }

    @Override
    public <T extends Parcelable> T mo29926q() {
        return (T) this.f12221e.readParcelable(getClass().getClassLoader());
    }

    @Override
    public String mo29925s() {
        return this.f12221e.readString();
    }

    @Override
    public void mo29924w(int i) {
        mo29933a();
        this.f12225i = i;
        this.f12220d.put(i, this.f12221e.dataPosition());
        mo29936E(0);
        mo29936E(i);
    }

    @Override
    public void mo29923y(boolean z) {
        this.f12221e.writeInt(z ? 1 : 0);
    }

    public C3586b(Parcel parcel, int i, int i2, String str, C6024a<String, Method> aVar, C6024a<String, Method> aVar2, C6024a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f12220d = new SparseIntArray();
        this.f12225i = -1;
        this.f12226j = 0;
        this.f12227k = -1;
        this.f12221e = parcel;
        this.f12222f = i;
        this.f12223g = i2;
        this.f12226j = i;
        this.f12224h = str;
    }
}
