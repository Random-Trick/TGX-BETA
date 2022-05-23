package n5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

public class b {

    public static class a extends RuntimeException {
        public a(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
            throw new UnsupportedOperationException("Method not decompiled: n5.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @RecentlyNonNull
    public static Bundle a(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + v10);
        return readBundle;
    }

    @RecentlyNonNull
    public static byte[] b(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + v10);
        return createByteArray;
    }

    @RecentlyNonNull
    public static int[] c(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + v10);
        return createIntArray;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T d(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + v10);
        return createFromParcel;
    }

    @RecentlyNonNull
    public static String e(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + v10);
        return readString;
    }

    @RecentlyNonNull
    public static String[] f(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + v10);
        return createStringArray;
    }

    @RecentlyNonNull
    public static ArrayList<String> g(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + v10);
        return createStringArrayList;
    }

    @RecentlyNonNull
    public static <T> T[] h(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + v10);
        return tArr;
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> i(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + v10);
        return createTypedArrayList;
    }

    public static void j(@RecentlyNonNull Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Overread allowed size end=");
            sb2.append(i10);
            throw new a(sb2.toString(), parcel);
        }
    }

    public static int k(int i10) {
        return (char) i10;
    }

    public static boolean l(@RecentlyNonNull Parcel parcel, int i10) {
        y(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static byte m(@RecentlyNonNull Parcel parcel, int i10) {
        y(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double n(@RecentlyNonNull Parcel parcel, int i10) {
        y(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float o(@RecentlyNonNull Parcel parcel, int i10) {
        y(parcel, i10, 4);
        return parcel.readFloat();
    }

    @RecentlyNonNull
    public static Float p(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        if (v10 == 0) {
            return null;
        }
        z(parcel, i10, v10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int q(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static IBinder r(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (v10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + v10);
        return readStrongBinder;
    }

    public static int s(@RecentlyNonNull Parcel parcel, int i10) {
        y(parcel, i10, 4);
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static Integer t(@RecentlyNonNull Parcel parcel, int i10) {
        int v10 = v(parcel, i10);
        if (v10 == 0) {
            return null;
        }
        z(parcel, i10, v10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long u(@RecentlyNonNull Parcel parcel, int i10) {
        y(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int v(@RecentlyNonNull Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void w(@RecentlyNonNull Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + v(parcel, i10));
    }

    public static int x(@RecentlyNonNull Parcel parcel) {
        int q10 = q(parcel);
        int v10 = v(parcel, q10);
        int dataPosition = parcel.dataPosition();
        if (k(q10) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(q10));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i10 = v10 + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    public static void y(Parcel parcel, int i10, int i11) {
        int v10 = v(parcel, i10);
        if (v10 != i11) {
            String hexString = Integer.toHexString(v10);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb2.append("Expected size ");
            sb2.append(i11);
            sb2.append(" got ");
            sb2.append(v10);
            sb2.append(" (0x");
            sb2.append(hexString);
            sb2.append(")");
            throw new a(sb2.toString(), parcel);
        }
    }

    public static void z(Parcel parcel, int i10, int i11, int i12) {
        if (i11 != i12) {
            String hexString = Integer.toHexString(i11);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb2.append("Expected size ");
            sb2.append(i12);
            sb2.append(" got ");
            sb2.append(i11);
            sb2.append(" (0x");
            sb2.append(hexString);
            sb2.append(")");
            throw new a(sb2.toString(), parcel);
        }
    }
}
