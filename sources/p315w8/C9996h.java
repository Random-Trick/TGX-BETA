package p315w8;

import java.io.InputStream;
import p315w8.C9997i;
import p330x8.C10159b;

public class C9996h extends AbstractC9989b {
    public boolean f32532A;
    public int f32533B;
    public int f32534C;
    public int f32535D;
    public boolean f32536E;
    public boolean f32537F;
    public boolean f32538G;
    public int f32539H;
    public int f32540I;
    public int f32541J;
    public int f32542K;
    public int[] f32543L;
    public C9997i f32544M;
    public C9995g f32545N;
    public int f32546O;
    public int f32547a;
    public boolean f32548b;
    public boolean f32549c;
    public boolean f32550d;
    public int f32551e;
    public boolean f32552f;
    public boolean f32553g;
    public boolean f32554h;
    public C9990c f32555i;
    public int f32556j;
    public int f32557k;
    public int f32558l;
    public int f32559m;
    public int f32560n;
    public int f32561o;
    public boolean f32562p;
    public int f32563q;
    public long f32564r;
    public boolean f32565s;
    public boolean f32566t;
    public boolean f32567u;
    public boolean f32568v;
    public boolean f32569w;
    public boolean f32570x;
    public int f32571y;
    public int f32572z;

    public static C9997i m6302a(C10159b bVar) {
        C9997i iVar = new C9997i();
        boolean f = bVar.m5885f("VUI: aspect_ratio_info_present_flag");
        iVar.f32573a = f;
        if (f) {
            C9988a a = C9988a.m6306a((int) bVar.m5884g(8, "VUI: aspect_ratio"));
            iVar.f32597y = a;
            if (a == C9988a.f32482b) {
                iVar.f32574b = (int) bVar.m5884g(16, "VUI: sar_width");
                iVar.f32575c = (int) bVar.m5884g(16, "VUI: sar_height");
            }
        }
        boolean f2 = bVar.m5885f("VUI: overscan_info_present_flag");
        iVar.f32576d = f2;
        if (f2) {
            iVar.f32577e = bVar.m5885f("VUI: overscan_appropriate_flag");
        }
        boolean f3 = bVar.m5885f("VUI: video_signal_type_present_flag");
        iVar.f32578f = f3;
        if (f3) {
            iVar.f32579g = (int) bVar.m5884g(3, "VUI: video_format");
            iVar.f32580h = bVar.m5885f("VUI: video_full_range_flag");
            boolean f4 = bVar.m5885f("VUI: colour_description_present_flag");
            iVar.f32581i = f4;
            if (f4) {
                iVar.f32582j = (int) bVar.m5884g(8, "VUI: colour_primaries");
                iVar.f32583k = (int) bVar.m5884g(8, "VUI: transfer_characteristics");
                iVar.f32584l = (int) bVar.m5884g(8, "VUI: matrix_coefficients");
            }
        }
        boolean f5 = bVar.m5885f("VUI: chroma_loc_info_present_flag");
        iVar.f32585m = f5;
        if (f5) {
            iVar.f32586n = bVar.m5879l("VUI chroma_sample_loc_type_top_field");
            iVar.f32587o = bVar.m5879l("VUI chroma_sample_loc_type_bottom_field");
        }
        boolean f6 = bVar.m5885f("VUI: timing_info_present_flag");
        iVar.f32588p = f6;
        if (f6) {
            iVar.f32589q = (int) bVar.m5884g(32, "VUI: num_units_in_tick");
            iVar.f32590r = (int) bVar.m5884g(32, "VUI: time_scale");
            iVar.f32591s = bVar.m5885f("VUI: fixed_frame_rate_flag");
        }
        boolean f7 = bVar.m5885f("VUI: nal_hrd_parameters_present_flag");
        if (f7) {
            iVar.f32594v = m6300c(bVar);
        }
        boolean f8 = bVar.m5885f("VUI: vcl_hrd_parameters_present_flag");
        if (f8) {
            iVar.f32595w = m6300c(bVar);
        }
        if (f7 || f8) {
            iVar.f32592t = bVar.m5885f("VUI: low_delay_hrd_flag");
        }
        iVar.f32593u = bVar.m5885f("VUI: pic_struct_present_flag");
        if (bVar.m5885f("VUI: bitstream_restriction_flag")) {
            C9997i.C9998a aVar = new C9997i.C9998a();
            iVar.f32596x = aVar;
            aVar.f32598a = bVar.m5885f("VUI: motion_vectors_over_pic_boundaries_flag");
            iVar.f32596x.f32599b = bVar.m5879l("VUI max_bytes_per_pic_denom");
            iVar.f32596x.f32600c = bVar.m5879l("VUI max_bits_per_mb_denom");
            iVar.f32596x.f32601d = bVar.m5879l("VUI log2_max_mv_length_horizontal");
            iVar.f32596x.f32602e = bVar.m5879l("VUI log2_max_mv_length_vertical");
            iVar.f32596x.f32603f = bVar.m5879l("VUI num_reorder_frames");
            iVar.f32596x.f32604g = bVar.m5879l("VUI max_dec_frame_buffering");
        }
        return iVar;
    }

    public static C9996h m6301b(InputStream inputStream) {
        C10159b bVar = new C10159b(inputStream);
        C9996h hVar = new C9996h();
        hVar.f32563q = (int) bVar.m5884g(8, "SPS: profile_idc");
        hVar.f32565s = bVar.m5885f("SPS: constraint_set_0_flag");
        hVar.f32566t = bVar.m5885f("SPS: constraint_set_1_flag");
        hVar.f32567u = bVar.m5885f("SPS: constraint_set_2_flag");
        hVar.f32568v = bVar.m5885f("SPS: constraint_set_3_flag");
        hVar.f32569w = bVar.m5885f("SPS: constraint_set_4_flag");
        hVar.f32570x = bVar.m5885f("SPS: constraint_set_5_flag");
        hVar.f32564r = bVar.m5884g(2, "SPS: reserved_zero_2bits");
        hVar.f32571y = (int) bVar.m5884g(8, "SPS: level_idc");
        hVar.f32572z = bVar.m5879l("SPS: seq_parameter_set_id");
        int i = hVar.f32563q;
        if (i == 100 || i == 110 || i == 122 || i == 144) {
            C9990c a = C9990c.m6305a(bVar.m5879l("SPS: chroma_format_idc"));
            hVar.f32555i = a;
            if (a == C9990c.f32487g) {
                hVar.f32532A = bVar.m5885f("SPS: residual_color_transform_flag");
            }
            hVar.f32560n = bVar.m5879l("SPS: bit_depth_luma_minus8");
            hVar.f32561o = bVar.m5879l("SPS: bit_depth_chroma_minus8");
            hVar.f32562p = bVar.m5885f("SPS: qpprime_y_zero_transform_bypass_flag");
            if (bVar.m5885f("SPS: seq_scaling_matrix_present_lag")) {
                m6299d(bVar, hVar);
            }
        } else {
            hVar.f32555i = C9990c.f32485e;
        }
        hVar.f32556j = bVar.m5879l("SPS: log2_max_frame_num_minus4");
        int l = bVar.m5879l("SPS: pic_order_cnt_type");
        hVar.f32547a = l;
        if (l == 0) {
            hVar.f32557k = bVar.m5879l("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (l == 1) {
            hVar.f32549c = bVar.m5885f("SPS: delta_pic_order_always_zero_flag");
            hVar.f32533B = bVar.m5883h("SPS: offset_for_non_ref_pic");
            hVar.f32534C = bVar.m5883h("SPS: offset_for_top_to_bottom_field");
            int l2 = bVar.m5879l("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            hVar.f32546O = l2;
            hVar.f32543L = new int[l2];
            for (int i2 = 0; i2 < hVar.f32546O; i2++) {
                int[] iArr = hVar.f32543L;
                iArr[i2] = bVar.m5883h("SPS: offsetForRefFrame [" + i2 + "]");
            }
        }
        hVar.f32535D = bVar.m5879l("SPS: num_ref_frames");
        hVar.f32536E = bVar.m5885f("SPS: gaps_in_frame_num_value_allowed_flag");
        hVar.f32559m = bVar.m5879l("SPS: pic_width_in_mbs_minus1");
        hVar.f32558l = bVar.m5879l("SPS: pic_height_in_map_units_minus1");
        boolean f = bVar.m5885f("SPS: frame_mbs_only_flag");
        hVar.f32537F = f;
        if (!f) {
            hVar.f32553g = bVar.m5885f("SPS: mb_adaptive_frame_field_flag");
        }
        hVar.f32554h = bVar.m5885f("SPS: direct_8x8_inference_flag");
        boolean f2 = bVar.m5885f("SPS: frame_cropping_flag");
        hVar.f32538G = f2;
        if (f2) {
            hVar.f32539H = bVar.m5879l("SPS: frame_crop_left_offset");
            hVar.f32540I = bVar.m5879l("SPS: frame_crop_right_offset");
            hVar.f32541J = bVar.m5879l("SPS: frame_crop_top_offset");
            hVar.f32542K = bVar.m5879l("SPS: frame_crop_bottom_offset");
        }
        if (bVar.m5885f("SPS: vui_parameters_present_flag")) {
            hVar.f32544M = m6302a(bVar);
        }
        bVar.m5882i();
        return hVar;
    }

    public static C9991d m6300c(C10159b bVar) {
        C9991d dVar = new C9991d();
        dVar.f32491a = bVar.m5879l("SPS: cpb_cnt_minus1");
        dVar.f32492b = (int) bVar.m5884g(4, "HRD: bit_rate_scale");
        dVar.f32493c = (int) bVar.m5884g(4, "HRD: cpb_size_scale");
        int i = dVar.f32491a;
        dVar.f32494d = new int[i + 1];
        dVar.f32495e = new int[i + 1];
        dVar.f32496f = new boolean[i + 1];
        for (int i2 = 0; i2 <= dVar.f32491a; i2++) {
            dVar.f32494d[i2] = bVar.m5879l("HRD: bit_rate_value_minus1");
            dVar.f32495e[i2] = bVar.m5879l("HRD: cpb_size_value_minus1");
            dVar.f32496f[i2] = bVar.m5885f("HRD: cbr_flag");
        }
        dVar.f32497g = (int) bVar.m5884g(5, "HRD: initial_cpb_removal_delay_length_minus1");
        dVar.f32498h = (int) bVar.m5884g(5, "HRD: cpb_removal_delay_length_minus1");
        dVar.f32499i = (int) bVar.m5884g(5, "HRD: dpb_output_delay_length_minus1");
        dVar.f32500j = (int) bVar.m5884g(5, "HRD: time_offset_length");
        return dVar;
    }

    public static void m6299d(C10159b bVar, C9996h hVar) {
        hVar.f32545N = new C9995g();
        for (int i = 0; i < 8; i++) {
            if (bVar.m5885f("SPS: seqScalingListPresentFlag")) {
                C9995g gVar = hVar.f32545N;
                C9994f[] fVarArr = new C9994f[8];
                gVar.f32530a = fVarArr;
                C9994f[] fVarArr2 = new C9994f[8];
                gVar.f32531b = fVarArr2;
                if (i < 6) {
                    fVarArr[i] = C9994f.m6303a(bVar, 16);
                } else {
                    fVarArr2[i - 6] = C9994f.m6303a(bVar, 64);
                }
            }
        }
    }

    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.f32547a + ", \n        field_pic_flag=" + this.f32548b + ", \n        delta_pic_order_always_zero_flag=" + this.f32549c + ", \n        weighted_pred_flag=" + this.f32550d + ", \n        weighted_bipred_idc=" + this.f32551e + ", \n        entropy_coding_mode_flag=" + this.f32552f + ", \n        mb_adaptive_frame_field_flag=" + this.f32553g + ", \n        direct_8x8_inference_flag=" + this.f32554h + ", \n        chroma_format_idc=" + this.f32555i + ", \n        log2_max_frame_num_minus4=" + this.f32556j + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.f32557k + ", \n        pic_height_in_map_units_minus1=" + this.f32558l + ", \n        pic_width_in_mbs_minus1=" + this.f32559m + ", \n        bit_depth_luma_minus8=" + this.f32560n + ", \n        bit_depth_chroma_minus8=" + this.f32561o + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.f32562p + ", \n        profile_idc=" + this.f32563q + ", \n        constraint_set_0_flag=" + this.f32565s + ", \n        constraint_set_1_flag=" + this.f32566t + ", \n        constraint_set_2_flag=" + this.f32567u + ", \n        constraint_set_3_flag=" + this.f32568v + ", \n        constraint_set_4_flag=" + this.f32569w + ", \n        constraint_set_5_flag=" + this.f32570x + ", \n        level_idc=" + this.f32571y + ", \n        seq_parameter_set_id=" + this.f32572z + ", \n        residual_color_transform_flag=" + this.f32532A + ", \n        offset_for_non_ref_pic=" + this.f32533B + ", \n        offset_for_top_to_bottom_field=" + this.f32534C + ", \n        num_ref_frames=" + this.f32535D + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.f32536E + ", \n        frame_mbs_only_flag=" + this.f32537F + ", \n        frame_cropping_flag=" + this.f32538G + ", \n        frame_crop_left_offset=" + this.f32539H + ", \n        frame_crop_right_offset=" + this.f32540I + ", \n        frame_crop_top_offset=" + this.f32541J + ", \n        frame_crop_bottom_offset=" + this.f32542K + ", \n        offsetForRefFrame=" + this.f32543L + ", \n        vuiParams=" + this.f32544M + ", \n        scalingMatrix=" + this.f32545N + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.f32546O + '}';
    }
}
