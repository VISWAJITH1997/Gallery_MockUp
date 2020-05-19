package com.example.gallerymockup.adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.gallerymockup.R;
import com.example.gallerymockup.model.GalleryModel;

import java.io.File;
import java.util.List;

import static android.os.Environment.DIRECTORY_PICTURES;


public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {
    Context mContext;
    List<GalleryModel> galleryModelList;

    public GalleryAdapter(Context mContext, List<GalleryModel> galleryModelList) {
        this.mContext = mContext;
        this.galleryModelList = galleryModelList;
    }

    @NonNull
    @Override
    public GalleryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View iteamView = LayoutInflater.from(mContext)
                .inflate(R.layout.gallery_model, parent, false);

        return new ViewHolder(iteamView);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryAdapter.ViewHolder holder, int position) {
        File file = new File(Environment.getExternalStorageDirectory(DIRECTORY_PICTURES, "Profile-Picture.jpg"));
        int iResource = R.mipmap.ic_launcher_foreground;
        GalleryModel galleryModel = galleryModelList.get(position);

        holder.textViewTitle.setText(galleryModel.getGalleryTitle());

        Glide
                .with(mContext)
                .load(file)
                .into(holder.imageViewGallery);

    }

    @Override
    public int getItemCount() {
        return galleryModelList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewGallery;
        TextView textViewTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewGallery = itemView.findViewById(R.id.imageViewGallery);
            textViewTitle = itemView.findViewById(R.id.textImageTitle);

        }
    }
}
