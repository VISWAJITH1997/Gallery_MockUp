package com.example.gallerymockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.os.Bundle;

import com.example.gallerymockup.adapters.GalleryAdapter;
import com.example.gallerymockup.model.GalleryModel;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<GalleryModel> galleryModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Dexter.withContext(this)
                .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @Override public void onPermissionGranted(PermissionGrantedResponse response) {/* ... */}
                    @Override public void onPermissionDenied(PermissionDeniedResponse response) {/* ... */}
                    @Override public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {/* ... */}
                }).check();



        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.galleryRecyclerView);
        galleryModelList.add(new GalleryModel("Visu",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Rushi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Vidyali",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Reyanshi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Visu",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Rushi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Vidyali",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Reyanshi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Visu",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Rushi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Vidyali",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Reyanshi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Visu",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Rushi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Vidyali",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Reyanshi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Visu",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Rushi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Vidyali",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Reyanshi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Visu",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Rushi",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Vidyali",R.mipmap.ic_launcher));
        galleryModelList.add(new GalleryModel("Reyanshi",R.mipmap.ic_launcher));



        GalleryAdapter galleryAdapter = new GalleryAdapter(this, galleryModelList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(galleryAdapter);

    }
}
