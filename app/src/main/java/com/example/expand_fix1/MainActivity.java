package com.example.expand_fix1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclervie);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Jurusan Sistem Informasi adalah salah satu jurusan di bidang ilmu komputer yang fokus pada " +
                "pengembangan dan penerapan teknologi informasi dalam konteks bisnis dan organisasi. Jurusan ini menggabungkan " +
                "aspek teknologi informasi, manajemen, dan analisis bisnis untuk menciptakan solusi informatika yang efektif dan " +
                "efisien.\n" + "Jurusan Sistem Informasi membekali mahasiswanya dengan pengetahuan dan " +
                "keterampilan dalam mengelola sistem informasi, pengembangan perangkat lunak, manajemen proyek TI, analisis bisnis, basis data, keamanan informasi, serta strategi dan inovasi teknologi. Melalui kombinasi ini, mahasiswa jurusan Sistem Informasi belajar untuk memahami kebutuhan bisnis, merancang sistem informasi yang tepat, mengimplementasikan solusi teknologi yang inovatif, dan mengoptimalkan penggunaan informasi untuk mendukung pengambilan keputusan yang baik.");

        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Program studi Manajemen Informatika adalah program studi yang dirancang untuk menghasilkan " +
                "lulusan yang memiliki spesialisasi dalam bidang teknologi informasi. Manajemen Informatika merupakan " +
                "program studi dengan jenjang D3, sehingga dalam perkuliahannya akan lebih singkat dan lebih banyak praktek " +
                "dibandingkan dengan jenjang S1. Bidang ilmu Manajeman Informatika memiliki cakupan yang cukup luas dari konsep " +
                "keilmuan sampai dengan pengembangan bidang pemrograman dan desain. Melalui kurikulum yang mengaplikasikan 60% " +
                "praktek dan 40% teori diharapkan dapat menciptakan lulusan-lulusan yang handal dan profesional dibidangnya.");

        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("SUKAMTO., S.SI., M.KOM");
        nestedList3.add("DR. ELFIZAR, S.SI., M.KOM");
        nestedList3.add("ZAIFUL BAHRI, S.SI., M.KOM");
        nestedList3.add("EVFI MAHDIYAH, MIT");
        nestedList3.add("AIDIL FITRIANSYAH, MIT");
        nestedList3.add("RONI SALAMBUE, S.KOM., M.SI");
        nestedList3.add("JOKO RISANTO, M.KOM");
        nestedList3.add("ASTRIED, M.KOM");

        mList.add(new DataModel(nestedList1 , "Sistem Informasi"));
        mList.add(new DataModel( nestedList2,"Manajemen Informatika"));
        mList.add(new DataModel( nestedList3,"Data Dosen"));
        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);
    }
}