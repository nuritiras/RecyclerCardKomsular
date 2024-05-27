package tr.com.nuritiras.recyclercard;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Kisi> kisiler = new ArrayList<>();
        kisiler.add(new Kisi("Ahmet", 25, "Mühendis", R.drawable.avatar1));
        kisiler.add(new Kisi("Mehmet", 30, "Doktor", R.drawable.avatar2));
        kisiler.add(new Kisi("Ayşe", 40, "Öğretmen", R.drawable.avatar3));
        kisiler.add(new Kisi("Betül", 35, "Avukat", R.drawable.avatar4));
        kisiler.add(new Kisi("Fatma", 28, "Grafik Tasarımcı", R.drawable.avatar5));

        KisiAdapter adapter = new KisiAdapter(kisiler);
        recyclerView.setAdapter(adapter);

    }
}