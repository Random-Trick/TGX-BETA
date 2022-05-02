package p315w8;

import java.io.InputStream;
import java.util.Arrays;
import p330x8.C10159b;

public class C9992e extends AbstractC9989b {
    public boolean f32501a;
    public int f32502b;
    public int f32503c;
    public int f32504d;
    public int f32505e;
    public int f32506f;
    public boolean f32507g;
    public int f32508h;
    public int f32509i;
    public boolean f32510j;
    public int f32511k;
    public int f32512l;
    public int f32513m;
    public int f32514n;
    public boolean f32515o;
    public boolean f32516p;
    public boolean f32517q;
    public int[] f32518r;
    public int[] f32519s;
    public int[] f32520t;
    public boolean f32521u;
    public int[] f32522v;
    public C9993a f32523w;

    public static class C9993a {
        public boolean f32524a;
        public C9995g f32525b = new C9995g();
        public int f32526c;
        public boolean[] f32527d;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.f32524a + ", scalindMatrix=" + this.f32525b + ", second_chroma_qp_index_offset=" + this.f32526c + ", pic_scaling_list_present_flag=" + this.f32527d + '}';
        }
    }

    public static C9992e m6304a(InputStream inputStream) {
        C10159b bVar = new C10159b(inputStream);
        C9992e eVar = new C9992e();
        eVar.f32505e = bVar.m5879l("PPS: pic_parameter_set_id");
        eVar.f32506f = bVar.m5879l("PPS: seq_parameter_set_id");
        eVar.f32501a = bVar.m5885f("PPS: entropy_coding_mode_flag");
        eVar.f32507g = bVar.m5885f("PPS: pic_order_present_flag");
        int l = bVar.m5879l("PPS: num_slice_groups_minus1");
        eVar.f32508h = l;
        if (l > 0) {
            int l2 = bVar.m5879l("PPS: slice_group_map_type");
            eVar.f32509i = l2;
            int i = eVar.f32508h;
            eVar.f32518r = new int[i + 1];
            eVar.f32519s = new int[i + 1];
            eVar.f32520t = new int[i + 1];
            if (l2 == 0) {
                for (int i2 = 0; i2 <= eVar.f32508h; i2++) {
                    eVar.f32520t[i2] = bVar.m5879l("PPS: run_length_minus1");
                }
            } else if (l2 == 2) {
                for (int i3 = 0; i3 < eVar.f32508h; i3++) {
                    eVar.f32518r[i3] = bVar.m5879l("PPS: top_left");
                    eVar.f32519s[i3] = bVar.m5879l("PPS: bottom_right");
                }
            } else {
                int i4 = 3;
                if (l2 == 3 || l2 == 4 || l2 == 5) {
                    eVar.f32521u = bVar.m5885f("PPS: slice_group_change_direction_flag");
                    eVar.f32504d = bVar.m5879l("PPS: slice_group_change_rate_minus1");
                } else if (l2 == 6) {
                    if (i + 1 <= 4) {
                        i4 = i + 1 > 2 ? 2 : 1;
                    }
                    int l3 = bVar.m5879l("PPS: pic_size_in_map_units_minus1");
                    eVar.f32522v = new int[l3 + 1];
                    for (int i5 = 0; i5 <= l3; i5++) {
                        int[] iArr = eVar.f32522v;
                        iArr[i5] = bVar.m5881j(i4, "PPS: slice_group_id [" + i5 + "]f");
                    }
                }
            }
        }
        eVar.f32502b = bVar.m5879l("PPS: num_ref_idx_l0_active_minus1");
        eVar.f32503c = bVar.m5879l("PPS: num_ref_idx_l1_active_minus1");
        eVar.f32510j = bVar.m5885f("PPS: weighted_pred_flag");
        eVar.f32511k = (int) bVar.m5884g(2, "PPS: weighted_bipred_idc");
        eVar.f32512l = bVar.m5883h("PPS: pic_init_qp_minus26");
        eVar.f32513m = bVar.m5883h("PPS: pic_init_qs_minus26");
        eVar.f32514n = bVar.m5883h("PPS: chroma_qp_index_offset");
        eVar.f32515o = bVar.m5885f("PPS: deblocking_filter_control_present_flag");
        eVar.f32516p = bVar.m5885f("PPS: constrained_intra_pred_flag");
        eVar.f32517q = bVar.m5885f("PPS: redundant_pic_cnt_present_flag");
        if (bVar.m5889b()) {
            C9993a aVar = new C9993a();
            eVar.f32523w = aVar;
            aVar.f32524a = bVar.m5885f("PPS: transform_8x8_mode_flag");
            if (bVar.m5885f("PPS: pic_scaling_matrix_present_flag")) {
                for (int i6 = 0; i6 < ((eVar.f32523w.f32524a ? 1 : 0) * 2) + 6; i6++) {
                    if (bVar.m5885f("PPS: pic_scaling_list_present_flag")) {
                        C9995g gVar = eVar.f32523w.f32525b;
                        C9994f[] fVarArr = new C9994f[8];
                        gVar.f32530a = fVarArr;
                        C9994f[] fVarArr2 = new C9994f[8];
                        gVar.f32531b = fVarArr2;
                        if (i6 < 6) {
                            fVarArr[i6] = C9994f.m6303a(bVar, 16);
                        } else {
                            fVarArr2[i6 - 6] = C9994f.m6303a(bVar, 64);
                        }
                    }
                }
            }
            eVar.f32523w.f32526c = bVar.m5883h("PPS: second_chroma_qp_index_offset");
        }
        bVar.m5882i();
        return eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9992e eVar = (C9992e) obj;
        if (!Arrays.equals(this.f32519s, eVar.f32519s) || this.f32514n != eVar.f32514n || this.f32516p != eVar.f32516p || this.f32515o != eVar.f32515o || this.f32501a != eVar.f32501a) {
            return false;
        }
        C9993a aVar = this.f32523w;
        if (aVar == null) {
            if (eVar.f32523w != null) {
                return false;
            }
        } else if (!aVar.equals(eVar.f32523w)) {
            return false;
        }
        return this.f32502b == eVar.f32502b && this.f32503c == eVar.f32503c && this.f32508h == eVar.f32508h && this.f32512l == eVar.f32512l && this.f32513m == eVar.f32513m && this.f32507g == eVar.f32507g && this.f32505e == eVar.f32505e && this.f32517q == eVar.f32517q && Arrays.equals(this.f32520t, eVar.f32520t) && this.f32506f == eVar.f32506f && this.f32521u == eVar.f32521u && this.f32504d == eVar.f32504d && Arrays.equals(this.f32522v, eVar.f32522v) && this.f32509i == eVar.f32509i && Arrays.equals(this.f32518r, eVar.f32518r) && this.f32511k == eVar.f32511k && this.f32510j == eVar.f32510j;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((Arrays.hashCode(this.f32519s) + 31) * 31) + this.f32514n) * 31) + (this.f32516p ? 1231 : 1237)) * 31) + (this.f32515o ? 1231 : 1237)) * 31) + (this.f32501a ? 1231 : 1237)) * 31;
        C9993a aVar = this.f32523w;
        int hashCode2 = (((((((((((((((((((((((((((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f32502b) * 31) + this.f32503c) * 31) + this.f32508h) * 31) + this.f32512l) * 31) + this.f32513m) * 31) + (this.f32507g ? 1231 : 1237)) * 31) + this.f32505e) * 31) + (this.f32517q ? 1231 : 1237)) * 31) + Arrays.hashCode(this.f32520t)) * 31) + this.f32506f) * 31) + (this.f32521u ? 1231 : 1237)) * 31) + this.f32504d) * 31) + Arrays.hashCode(this.f32522v)) * 31) + this.f32509i) * 31) + Arrays.hashCode(this.f32518r)) * 31) + this.f32511k) * 31;
        if (!this.f32510j) {
            i = 1237;
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.f32501a + ",\n       num_ref_idx_l0_active_minus1=" + this.f32502b + ",\n       num_ref_idx_l1_active_minus1=" + this.f32503c + ",\n       slice_group_change_rate_minus1=" + this.f32504d + ",\n       pic_parameter_set_id=" + this.f32505e + ",\n       seq_parameter_set_id=" + this.f32506f + ",\n       pic_order_present_flag=" + this.f32507g + ",\n       num_slice_groups_minus1=" + this.f32508h + ",\n       slice_group_map_type=" + this.f32509i + ",\n       weighted_pred_flag=" + this.f32510j + ",\n       weighted_bipred_idc=" + this.f32511k + ",\n       pic_init_qp_minus26=" + this.f32512l + ",\n       pic_init_qs_minus26=" + this.f32513m + ",\n       chroma_qp_index_offset=" + this.f32514n + ",\n       deblocking_filter_control_present_flag=" + this.f32515o + ",\n       constrained_intra_pred_flag=" + this.f32516p + ",\n       redundant_pic_cnt_present_flag=" + this.f32517q + ",\n       top_left=" + this.f32518r + ",\n       bottom_right=" + this.f32519s + ",\n       run_length_minus1=" + this.f32520t + ",\n       slice_group_change_direction_flag=" + this.f32521u + ",\n       slice_group_id=" + this.f32522v + ",\n       extended=" + this.f32523w + '}';
    }
}
