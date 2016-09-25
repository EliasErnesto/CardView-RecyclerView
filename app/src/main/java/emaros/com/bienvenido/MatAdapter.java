package emaros.com.bienvenido;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Elías Barrera on 25/09/2016 0:04.
 */
public class MatAdapter  extends RecyclerView.Adapter<MatAdapter.MateriaViewHolder>{


    public  static  class MateriaViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView txt_codigo;
        TextView txt_nombre;
        ImageView img_medalla;


        MateriaViewHolder(View itemView){
            super(itemView);
            card= (CardView)itemView.findViewById(R.id.card_view);
            txt_nombre=(TextView)itemView.findViewById(R.id.mat_nombre);
            txt_codigo=(TextView)itemView.findViewById(R.id.mat_codigo);

        }
    }

    List<Materia> materias;

    public MatAdapter(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public MateriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.materia_card_view,parent,false);
        MateriaViewHolder mvh = new MateriaViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MateriaViewHolder materiaViewHolder, int position) {

        materiaViewHolder.txt_nombre.setText(materias.get(position).getNombre());
        materiaViewHolder.txt_codigo.setText(materias.get(position).getCodigo());
        //materiaViewHolder.img_medalla.setImageBitmap(materias.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return materias.size();
    }


}
