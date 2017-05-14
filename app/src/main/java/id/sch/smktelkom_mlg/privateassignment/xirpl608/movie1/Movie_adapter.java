package id.sch.smktelkom_mlg.privateassignment.xirpl608.movie1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by dani on 5/14/2017.
 */

public class Movie_adapter extends RecyclerView.Adapter<Movie_adapter.ViewHolder> {
    private List<Movie_list> movie_lists;
    private Context context;

    public Movie_adapter(List<Movie_list> movie_lists, Context context) {
        this.movie_lists = movie_lists;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie_list movie_list = movie_lists.get(position);
        holder.tvjudul.setText(movie_list.getJudul());
        holder.tvpopular.setText(movie_list.getPopular());


        Glide
                .with(context)
                .load(movie_list.getImage())
                .into(holder.ivimage);

    }

    @Override
    public int getItemCount() {
        if (movie_lists != null)
            return movie_lists.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivimage;
        TextView tvjudul;
        TextView tvpopular;

        public ViewHolder(View itemView) {
            super(itemView);
            ivimage = (ImageView) itemView.findViewById(R.id.imageView);
            tvjudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvpopular = (TextView) itemView.findViewById(R.id.textViewPopular);

        }
    }
}

