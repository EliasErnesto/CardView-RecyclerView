package emaros.com.bienvenido;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {

    private RecyclerView matRecyclerView;
    private RecyclerView.Adapter matAdapter;
    private RecyclerView.LayoutManager matLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        matRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);//Obtiene el recicler del xml creado

        matLayoutManager= new LinearLayoutManager(this);
        matRecyclerView.setLayoutManager(matLayoutManager);

        //Cargar los elementos al adapatador
        initializeAdapter(initializeData());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    //Inicializar el adaptador
    private void initializeAdapter(List<Materia> materias){
        matAdapter = new MatAdapter(materias);
        matRecyclerView.setAdapter(matAdapter);
    }


    //Llenar datos que se cargaran
    private List<Materia> initializeData(){
        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia("IAI115","Introduccion a la informatica", BitmapFactory.decodeResource(getResources(), R.drawable.ball)));
        materias.add(new Materia("HDP115","Herramientas de productividad", BitmapFactory.decodeResource(getResources(), R.drawable.ball)));
        materias.add(new Materia("SIO115","Sistemas Operativos", BitmapFactory.decodeResource(getResources(), R.drawable.ball)));
        return  materias;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
