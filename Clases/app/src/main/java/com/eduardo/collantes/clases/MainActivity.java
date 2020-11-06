package com.eduardo.collantes.clases;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.eduardo.collantes.clases.adapters.MyStringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private MyStringAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mRecyclerView = findViewById(R.id.rv_string_list);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyStringAdapter(Animes(),MainActivity.this);
        mRecyclerView.setAdapter(mAdapter);

    }

    private List<String> dataSet(){
        List<String>data = new ArrayList<>();
        data.add("Texto1");
        data.add("Texto2");
        data.add("Texto3");
        data.add("Texto4");
        data.add("Texto5");


            return data;
    }
    public class Anime {
        public String nombre;

        public String imagen;
        public boolean favorito;
        public String descripcion;
        public Anime(String nombre, String imagen,boolean favorito,String descripcion) {
            this.nombre = nombre;
            this.descripcion=descripcion;
            this.imagen = imagen;
            this.favorito=favorito;
        }

    }
    public List<Anime> Animes(){
        List<Anime> info = new ArrayList<>();
        info.add(new Anime("Neiser Díaz","https://st-listas.20minutos.es/images/2008-06/25171/322433_640px.jpg?1526105534",false,"The application's minSdkVersion is newer than the device API level."));
        info.add(new Anime("Faraón Love Shade","https://st-listas.20minutos.es/images/2008-06/25171/322617_640px.jpg?1526105534",false," Depending on the kind of error you encounter, Android will display the error message either on the device you’re using to test your app or in Android Studio. "));
        info.add(new Anime("Goku","https://st-listas.20minutos.es/images/2008-06/25171/322438_640px.jpg?1526105534",false," The application's minSdkVersion is newer than the device API level. "));
        info.add(new Anime("Tarzán",  "https://st-listas.20minutos.es/images/2008-06/25171/322432_640px.jpg?1526105534",false," The application's minSdkVersion is newer than the device API level. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) "));
        info.add(new Anime("Picachu","https://st-listas.20minutos.es/images/2008-06/25171/2616748_640px.jpg?1526105534",false," The easiest way to make sure you don’t miss out any error messages is to open Logcat Monitor’s Verbose dropdown and set it to Error, which will filter out everything except error messages."));
        info.add(new Anime("Pokemon","https://st-listas.20minutos.es/images/2008-06/25171/322574_640px.jpg?1526105534",true," If a single clean/rebuild cycle doesn’t work, then try repeating this process a few times, as some developers have reported positive results after "));
        info.add(new Anime("Pokemon Fuego","https://st-listas.20minutos.es/images/2008-06/25171/322436_640px.jpg?1526105534",false,"If a single clean/rebuild cycle doesn’t work, then try repeating this process a few times, as some developers have reported positive results after"));
        info.add(new Anime("Pokemoncito",  "https://st-listas.20minutos.es/images/2008-06/25171/322437_640px.jpg?1526105534",false," The process of enabling multidex support will vary depending on the versions of Android your project supports. "));
        info.add(new Anime("Pokemon Agua","https://st-listas.20minutos.es/images/2008-06/25171/322434_640px.jpg?1526105534",false,"  1If you do identify and resolve an error, but Android Studio is still displaying the R.layout error, then you may need to complete a clean/rebuild cycle before Android Studio properly registers your changes."));
        info.add(new Anime("Pokemon Go","https://st-listas.20minutos.es/images/2008-06/25171/322577_640px.jpg?1526105534",false," The process of enabling multidex support will vary depending on the versions of Android your project supports. "));

        return info;
    }

}