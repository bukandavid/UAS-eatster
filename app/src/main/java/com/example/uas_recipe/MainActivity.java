package com.example.uas_recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipe>recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipe("Sate ayam","- 1 kg daging ayam fillet\n" +
                "- 1 sdt garam\n" +
                "- 2 sdm kecap manis\n" +
                "- perasan air lemon/jeruk limau\n" +
                "- tusuk sate\n" +
                "- kacang tanah 300 gram, goreng/sangrai\n" +
                "- bawang putih 6 siung\n" +
                "- bawang merah 8 siung\n" +
                "- cabai merah 4 buah\n" +
                "- air 500 ml\n" +
                "- daun jeruk 3 lembar\n" +
                "- garam gula secukupnya\n" +
                "- kecap manis 100 ml\n" +
                "- lontong atau ketupat\n" +
                "- kecap manis\n" +
                "- bawang goreng\n" +
                "- jeruk limau\n" +
                "- sambal","Metode","- Potong daging ayam bentuk dadu, beri garam dan perasan jeruk lemon dan kecap manis, simpan dikulkas minimal 1 jam.\n" +
                "- Lalu tusuk-tusuk dengan tusuk sate dan lakukan hingga habis, sisihkan.\n" +
                "- Haluskan semua bahan bumbu kacang, kecuali kecap, daun jeruk.\n" +
                "- Lalu masukkan kecap, air, daun jeruk dan masak dengan api kecil hingga air surut dan mengeluarkan minyak. Koreksi rasa.\n" +
                "- Siapkan bakaran/ panggangan. Lumuri sate ayam dengan bumbu kacang dan sedikit kecap manis.\n" +
                "- Bakar sate hingga matang sambil dibolak-balik.\n" +
                "- Sajikan sate ayam dengan bumbu kacang, jeruk limau, kecap manis dan lontong dan pelengkap lainnya.\n",R.drawable.sate_ayam));

        recipes1.add(new Recipe("Opor Ayam","-1 ekor ayam kampung, potong-potong, cuci bersih \n" +
                "-3 sdm minyak, untuk menumis \n" +
                "-500 ml air\n" +
                "-1 lt santan sedang dari 1 butir kelapa\n" +
                "-3 lembar daun salam\n" +
                "-3 lembar daun jeruk\n" +
                "-2 batang serai, memarkan\n" +
                "-1 ruas jari lengkuas, memarkan\n" +
                "-1/2 sdt gula pasir\n" +
                "-1 sdt kaldu bubuk instan rasa ayam\n" +
                "-10 butir bawang merah\n" +
                "-8 siung bawang putih\n" +
                "-1 sdm merica\n" +
                "-1 sdm ketumbar\n" +
                "-2/4 sdt jintan\n" +
                "-2/4 biji pala\n" +
                "-1 ibu jari jahe\n" +
                "-1 ibu jari kunyit\n" +
                "-50 gram kemiri\n" +
                "-Garam secukupnya\n","metode","1. Tumis bumbu halus dengan daun salam, daun jeruk, serai, dan lengkuas hingga harum. Masukkan ayam, aduk hingga berubah warna.\n" +
                "2. Tuang air, masukkan asam jawa, gula pasir, dan kaldu bubuk, aduk kembali. Masak dengan api sedang hingga ayam lunak dan air menyusut.\n" +
                "3. Tambahkan santan, masak kembali hingga matang dan bumbu meresap. Angkat, taburi dengan bawang goreng. Sajikan.\n",R.drawable.opor_ayam));

        recipes1.add(new Recipe("Ketoprak","-150 gram taoge, seduh\n" +
                "-200 gram bihun, seduh sampai lunak\n" +
                "-5 buah lontong, potong\n" +
                "-1 buah tahu putih\n" +
                "-150 ml air\n" +
                "-2 siung bawang putih, haluskan\n" +
                "-1/2 sdt garam\n" +
                "-Minyak goreng secukupnya\n" +
                "-200 gram kacang tanah kulit, goreng\n" +
                "-200 ml air\n" +
                "-1 1/2 sdt asam jawa dan 2 sdm air\n" +
                "-2 siung bawang putih\n" +
                "-4 buah cabai rawit merah\n" +
                "-1 sdm gula merah, sisir halus\n" +
                "-100 gram kerupuk kanji, goreng\n" +
                "-3 sdm kecap manis\n" +
                "-4 sdt bawang merah goreng untuk taburan","Metode","1.Masukkan tahu ke mangkuk. Campur air, garam, dan bawang putih. Tuang ke mangkuk tahu. Diamkan sebentar. Angkat dan tiriskan. Goreng sampai kecoklatan. Potong dadu.\n" +
                "2.Sambal kacang: campur kacang tanah, cabai rawit merah, bawang putih, gula merah, dan garam. Haluskan pakai ulekan atau blender.\n" +
                "3.Campur asam jawa dan air, ambil 1/2 sendok makan air asam. Campur dengan bumbu kacang. Aduk rata.\n" +
                "4.Tata lontong, bihun, taoge, dan tahu di dalam mangkuk. Siram sambal kacang. Tambahkan kecap manis sesuai selera. Taburi dengan bawang merah goreng dan kerupuk kanji.\n",R.drawable.ketoprak));

        recipes1.add(new Recipe("Tumis Kangkung","-1 ikat kangkung (siangi)\n" +
                "-4 siung bawang putih (iris tipis)\n" +
                "-3 buah cabai rawit (iris serong)\n" +
                "-Garam, gula, kaldu bubuk dan lada bubuk secukupnya\n" +
                "-Minyak goreng secukupnya","Metode","1.Siangi sayur kangkung, cuci bersih, tiriskan.\n" +
                "2.Panaskan minyak, tumis bawang putih, bawang merah dan cabai hingga harum.\n" +
                "3.Masukkan sayur kangkung ke dalam wajan, aduk rata kemudian tutup wajan kira-kira selama 2 menit.\n" +
                "4.Tambahkan garam, lada bubuk, gula dan kaldu bubuk, aduk rata.\n" +
                "5.Masak dengan api besar kurang lebih selama 5 menit, koreksi rasa.\n" +
                "6.Jika tumis kangkung sudah matang dan rasanya pas, angkat kemudian sajikan.\n",R.drawable.tumis_kangkung));

        recipes1.add(new Recipe("Ayam Geprek","- 1 kg ayam, potong-potong\n" +
                "- 1 butir Telur utuh\n" +
                "- 500 gram terigu cakra (adonan kering)\n" +
                "- 250 gram terigu segitiga (adonan basah/pencelup)\n" +
                "- 5 sdm maizena\n" +
                "- 6 siung bawang putih cincang halus\n" +
                "- secukupnya jeruk nipis\n" +
                "- 1 sdt baking powder\n" +
                "- 1/4 sdt lada bubuk\n" +
                "- 1/2 sdt penyedap jamur\n" +
                "- 1 sdt garam\n" +
                "- 1 sdm saos tiram\n" +
                "- 1/2 sdt gula (optional)\n" +
                "- secukupnya air es\n" +
                "- 20 butir cabe rawit\n" +
                "- 10 butir cabe merah\n" +
                "- 2 siung bawang putih\n" +
                "- secukupnya minyak sayur\n" +
                "- secukupnya garam, gula, penyedap","Metode","- Beri potongan ayam dengan jeruk nipis dan garam.\n" +
                "- Lumuri ayam dengan setengah bagian bawang putih yang sudah dicincang halus tadi, tambahkan lada bubuk sedikit, saos tiram, garam, gula dan penyedap jamur. Lalu simpan semalam di kulkas supaya bumbu meresap dan ayam empuk.\n" +
                "- Bahan pencelup: terigu telur dan air es kocok sampai adonan kental jangan encer, beri sdikit garam lalu aduk sampai rata.\n" +
                "- Bahan kering: terigu cakra, maizena, bawang putih cincang, lada bubuk, baking piwder, garam dan penyedap jamur diaduk sampai rata.\n" +
                "- Siapkan ayam yang sudah dibumbui dan disimpan dalam kulkas lalu celup ke dalam adonan kering sampai rata seluruh permukaan ayam tertutup bahan kering.\n" +
                "- Setelah rata semua celupkan ke dalam adonan basah sampai rata, lalu celupkan lagi ke dalam adonan kering, lalu goreng di minyak panas hingga ayam terendam.\n" +
                "- Goreng dengan api kecil selama 15 menit sampai berwarna golden brown dan bunyi berisiknya hilang. Angkat dan sisihkan\n" +
                "- Untuk membuat sambal korek, haluskan semua bahan sambal jangan terlalu halus, sisihkan.\n" +
                "- Panaskan minyak bekas menggoreng ayam sampai benar-benar panas\n" +
                "- Setelah minyak panas siramkan ke atas sambal yang sudah di haluskan tadi sambil terus di aduk rata\n" +
                "- Siapkan ayam di piring, penyet /tekan ayam memakai ulekan kayu sampai remuk lalu siram sambal korek diatasnya\n" +
                "- Ayam goreng geprek crispy siap dihidangkan\n",R.drawable.ayam_geprek));

        myrecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this, recipes1);
        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myrecyclerView.setAdapter(myAdapter);

    }

}