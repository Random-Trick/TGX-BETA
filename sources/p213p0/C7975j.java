package p213p0;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p213p0.C7956h;

public class C7975j {
    public static Field f25973b;
    public static boolean f25974c;
    public static final Object f25972a = new Object();
    public static final Object f25975d = new Object();

    public static SparseArray<Bundle> m13887a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle m13886b(C7956h.C7957a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e = aVar.m13995e();
        bundle2.putInt("icon", e != null ? e.m40318f() : 0);
        bundle2.putCharSequence("title", aVar.m13991i());
        bundle2.putParcelable("actionIntent", aVar.m13999a());
        if (aVar.m13996d() != null) {
            bundle = new Bundle(aVar.m13996d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m13998b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m13883e(aVar.m13994f()));
        bundle2.putBoolean("showsUserInterface", aVar.m13992h());
        bundle2.putInt("semanticAction", aVar.m13993g());
        return bundle2;
    }

    public static Bundle m13885c(Notification notification) {
        synchronized (f25972a) {
            if (f25974c) {
                return null;
            }
            try {
                if (f25973b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f25974c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f25973b = declaredField;
                }
                Bundle bundle = (Bundle) f25973b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f25973b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f25974c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f25974c = true;
                return null;
            }
        }
    }

    public static Bundle m13884d(C7985m mVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", mVar.m13837i());
        bundle.putCharSequence("label", mVar.m13838h());
        bundle.putCharSequenceArray("choices", mVar.m13841e());
        bundle.putBoolean("allowFreeFormInput", mVar.m13843c());
        bundle.putBundle("extras", mVar.m13839g());
        Set<String> d = mVar.m13842d();
        if (d != null && !d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d.size());
            for (String str : d) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] m13883e(C7985m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            bundleArr[i] = m13884d(mVarArr[i]);
        }
        return bundleArr;
    }

    public static Bundle m13882f(Notification.Builder builder, C7956h.C7957a aVar) {
        IconCompat e = aVar.m13995e();
        builder.addAction(e != null ? e.m40318f() : 0, aVar.m13991i(), aVar.m13999a());
        Bundle bundle = new Bundle(aVar.m13996d());
        if (aVar.m13994f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m13883e(aVar.m13994f()));
        }
        if (aVar.m13997c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m13883e(aVar.m13997c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m13998b());
        return bundle;
    }
}
