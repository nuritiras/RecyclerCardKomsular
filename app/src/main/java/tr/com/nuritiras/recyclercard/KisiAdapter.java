package tr.com.nuritiras.recyclercard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KisiAdapter extends RecyclerView.Adapter<KisiAdapter.KisiViewHolder> {

    public static class KisiViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView kisiAd;
        TextView kisiYas;
        TextView kisiMeslek;
        ImageView kisiResim;

        KisiViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            kisiAd = (TextView)itemView.findViewById(R.id.kisi_ad);
            kisiYas = (TextView)itemView.findViewById(R.id.kisi_yas);
            kisiMeslek = (TextView)itemView.findViewById(R.id.kisi_meslek);
            kisiResim = (ImageView)itemView.findViewById(R.id.avatar);
        }
    }

    List<Kisi> kisiler;

    KisiAdapter(List<Kisi> kisiler){
        this.kisiler = kisiler;
    }

    @Override
    public int getItemCount() {
        return kisiler.size();
    }

    @Override
    public KisiViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.person_row, viewGroup, false);
        KisiViewHolder holder = new KisiViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(KisiViewHolder personViewHolder, int i) {
        personViewHolder.kisiAd.setText(kisiler.get(i).getAd());
        personViewHolder.kisiYas.setText(String.valueOf(kisiler.get(i).getYas()));
        personViewHolder.kisiMeslek.setText(kisiler.get(i).getMeslek());
        personViewHolder.kisiResim.setImageResource(kisiler.get(i).getResimId());
    }
}