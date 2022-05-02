package p193nb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5070i;
import qa.C8298k;

public final class C7318c {
    public static final int m17036a(TdApi.JsonValue jsonValue) {
        if (jsonValue instanceof TdApi.JsonValueNumber) {
            return (int) ((TdApi.JsonValueNumber) jsonValue).value;
        }
        if (jsonValue instanceof TdApi.JsonValueString) {
            return C5070i.m24049u(((TdApi.JsonValueString) jsonValue).value, 0, 2, null);
        }
        return 0;
    }

    public static final Map<String, TdApi.JsonValue> m17035b(TdApi.JsonValue jsonValue) {
        if (!(jsonValue instanceof TdApi.JsonValueObject)) {
            return null;
        }
        TdApi.JsonValueObject jsonValueObject = (TdApi.JsonValueObject) jsonValue;
        HashMap hashMap = new HashMap(jsonValueObject.members.length);
        TdApi.JsonObjectMember[] jsonObjectMemberArr = jsonValueObject.members;
        C8298k.m12935d(jsonObjectMemberArr, "json.members");
        int i = 0;
        int length = jsonObjectMemberArr.length;
        while (i < length) {
            TdApi.JsonObjectMember jsonObjectMember = jsonObjectMemberArr[i];
            i++;
            String str = jsonObjectMember.key;
            C8298k.m12935d(str, "member.key");
            TdApi.JsonValue jsonValue2 = jsonObjectMember.value;
            C8298k.m12935d(jsonValue2, "member.value");
            hashMap.put(str, jsonValue2);
        }
        return hashMap;
    }

    public static final String m17034c(TdApi.JsonValue jsonValue) {
        if (jsonValue instanceof TdApi.JsonValueString) {
            return ((TdApi.JsonValueString) jsonValue).value;
        }
        return null;
    }

    public static final TdApi.JsonValue m17033d(String str) {
        if (C5070i.m24061i(str)) {
            return null;
        }
        TdApi.Object e = Client.m14793e(new TdApi.GetJsonValue(str));
        if (e instanceof TdApi.JsonValue) {
            return (TdApi.JsonValue) e;
        }
        return null;
    }

    public static final String m17032e(List<? extends TdApi.JsonObjectMember> list) {
        C8298k.m12934e(list, "members");
        return m17031f(m17030g(list));
    }

    public static final String m17031f(TdApi.JsonValue jsonValue) {
        C8298k.m12934e(jsonValue, "obj");
        TdApi.Object e = Client.m14793e(new TdApi.GetJsonString(jsonValue));
        if (e instanceof TdApi.Text) {
            return ((TdApi.Text) e).text;
        }
        return null;
    }

    public static final TdApi.JsonValueObject m17030g(List<? extends TdApi.JsonObjectMember> list) {
        C8298k.m12934e(list, "members");
        Object[] array = list.toArray(new TdApi.JsonObjectMember[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new TdApi.JsonValueObject((TdApi.JsonObjectMember[]) array);
    }
}
