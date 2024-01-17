package com.example.milcuentos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.milcuentos.Class.BookFragment;
import com.example.milcuentos.Class.Story;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaCuentosAv extends AppCompatActivity {



    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;

    private ConstraintLayout recomLayout;
    private ConstraintLayout relativeLayout;
    private List<Story> storyList;
    private List<Story> storyList2;
    private List<Story> storyList3;
    private StoryAdapter storyAdapter;
    private StoryAdapter storyAdapter2;
    private StoryAdapter storyAdapter3;
    private LinearLayoutManager linearLayoutManager;

    FrameLayout frame;

    //recomendado
    private ImageView imageRecom;
    private TextView textRecom;

    private List<Story> listaRecom;
    private int currentIndex = 0;

    private Handler handler = new Handler();
    private Runnable runnable;
//



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cuentos);

        //recom
        imageRecom = findViewById(R.id.imageRecomendado);
        textRecom = findViewById(R.id.textRecomendado);
        recomLayout= findViewById(R.id.recomLayout);
        relativeLayout=  findViewById(R.id.constrLayout);

        // Inicializa la lista de objetos
        listaRecom = new ArrayList<>();



        // Inicia el cambio automático de objetos
        startAutoChange();
        //final recom

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView2= findViewById(R.id.recyclerView2);
        recyclerView3= findViewById(R.id.recyclerView3);
        frame= findViewById(R.id.fragmentContainer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));


        //lista1

        storyList = new ArrayList<>();
        storyList.add(new Story("Cuento 0"," En un vasto océano azul, vivía un simpático delfín llamado Damián. Damián era conocido por su energía y alegría desbordante, siempre saltando y jugando entre las olas. Un día, mientras exploraba las profundidades marinas, se encontró con una tortuga marina llamada Sofía.\n" +
                "Sofía era una tortuga sabia y tranquila. Siempre se tomaba su tiempo para observar y reflexionar sobre el mundo que la rodeaba. Al conocer a Damián, se dieron cuenta de que tenían personalidades muy diferentes. Damián buscaba constantemente la emoción y la diversión, mientras que Sofía prefería la calma y la serenidad.\n" +
                "Curiosos por conocer más sobre sus respectivas formas de vida, Damián y Sofía decidieron pasar tiempo juntos y aprender uno del otro. Damián mostró a Sofía cómo disfrutar de la diversión y la alegría en el océano, mientras que Sofía enseñó a Damián la importancia de la paciencia y la tranquilidad.\n" +
                "Un día, mientras nadaban juntos, se encontraron con un grupo de peces en problemas. Los peces estaban atrapados en una red de pesca abandonada y necesitaban ayuda. Damián, impulsado por su naturaleza valiente, quería actuar rápidamente y liberar a los peces lo antes posible. Pero Sofía, con su enfoque tranquilo, les aconsejó que se tomaran un momento para pensar en la mejor estrategia.\n" +
                "Después de un momento de reflexión, Damián y Sofía trabajaron juntos para liberar suavemente a los peces de la red. Sofía guiaba a Damián con su sabiduría y Damián aplicaba su energía para realizar las acciones necesarias. Juntos, lograron salvar a todos los peces y devolverlos a la libertad del océano.\n" +
                "Al finalizar la tarea, Damián miró a Sofía con admiración y agradecimiento. Le dijo: \"Sofía, gracias por mostrarme la importancia de la paciencia y la reflexión. Aprendí que, a veces, la calma y la serenidad son tan valiosas como la energía y la acción\". Sofía sonrió y respondió: \"Y yo, Damián, aprendí que también es necesario salir de nuestra zona de confort y disfrutar de la emoción y la alegría que traes al océano\".\n" +
                "Desde ese día, Damián y Sofía se convirtieron en amigos inseparables. Juntos, demostraron que las diferencias pueden ser una fuente de enriquecimiento y que, al combinar las fortalezas de cada uno, podemos lograr cosas asombrosas.\n",R.drawable.portada00));
        storyList.add(new Story("Cuento 1","dsadsadasdas",R.drawable.portada00));
        storyList.add(new Story("Cuento 2","dsadsadasdas",R.drawable.portada00));
        storyList.add(new Story("Cuento 3","dsadsadasdas",R.drawable.portada00));
        storyList.add(new Story("Cuento 4","dsadsadasdas",R.drawable.portada00));
        storyList.add(new Story("Cuento 5","dsadsadasdas",R.drawable.portada00));





        linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        storyAdapter = new StoryAdapter(storyList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(storyAdapter);

        //lista2

        storyList2 = new ArrayList<>();
        storyList2.add(new Story("Cuento 6"," En un vasto océano azul, vivía un simpático delfín llamado Damián. Damián era conocido por su energía y alegría desbordante, siempre saltando y jugando entre las olas. Un día, mientras exploraba las profundidades marinas, se encontró con una tortuga marina llamada Sofía.\n" +
                "Sofía era una tortuga sabia y tranquila. Siempre se tomaba su tiempo para observar y reflexionar sobre el mundo que la rodeaba. Al conocer a Damián, se dieron cuenta de que tenían personalidades muy diferentes. Damián buscaba constantemente la emoción y la diversión, mientras que Sofía prefería la calma y la serenidad.\n" +
                "Curiosos por conocer más sobre sus respectivas formas de vida, Damián y Sofía decidieron pasar tiempo juntos y aprender uno del otro. Damián mostró a Sofía cómo disfrutar de la diversión y la alegría en el océano, mientras que Sofía enseñó a Damián la importancia de la paciencia y la tranquilidad.\n" +
                "Un día, mientras nadaban juntos, se encontraron con un grupo de peces en problemas. Los peces estaban atrapados en una red de pesca abandonada y necesitaban ayuda. Damián, impulsado por su naturaleza valiente, quería actuar rápidamente y liberar a los peces lo antes posible. Pero Sofía, con su enfoque tranquilo, les aconsejó que se tomaran un momento para pensar en la mejor estrategia.\n" +
                "Después de un momento de reflexión, Damián y Sofía trabajaron juntos para liberar suavemente a los peces de la red. Sofía guiaba a Damián con su sabiduría y Damián aplicaba su energía para realizar las acciones necesarias. Juntos, lograron salvar a todos los peces y devolverlos a la libertad del océano.\n" +
                "Al finalizar la tarea, Damián miró a Sofía con admiración y agradecimiento. Le dijo: \"Sofía, gracias por mostrarme la importancia de la paciencia y la reflexión. Aprendí que, a veces, la calma y la serenidad son tan valiosas como la energía y la acción\". Sofía sonrió y respondió: \"Y yo, Damián, aprendí que también es necesario salir de nuestra zona de confort y disfrutar de la emoción y la alegría que traes al océano\".\n" +
                "Desde ese día, Damián y Sofía se convirtieron en amigos inseparables. Juntos, demostraron que las diferencias pueden ser una fuente de enriquecimiento y que, al combinar las fortalezas de cada uno, podemos lograr cosas asombrosas.\n",R.drawable.portadadragon));
        storyList2.add(new Story("Cuento 7","dsadsadasdas",R.drawable.portadadragon));
        storyList2.add(new Story("Cuento 8","dsadsadasdas",R.drawable.portadadragon));
        storyList2.add(new Story("Cuento 9","dsadsadasdas",R.drawable.portadadragon));
        storyList2.add(new Story("Cuento 10","dsadsadasdas",R.drawable.portadadragon));
        storyList2.add(new Story("Cuento 11","dsadsadasdas",R.drawable.portadadragon));





        linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        storyAdapter = new StoryAdapter(storyList2);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(storyAdapter);

        //lista3

        storyList3 = new ArrayList<>();
        storyList3.add(new Story("Cuento 12"," En un vasto océano azul, vivía un simpático delfín llamado Damián. Damián era conocido por su energía y alegría desbordante, siempre saltando y jugando entre las olas. Un día, mientras exploraba las profundidades marinas, se encontró con una tortuga marina llamada Sofía.\n" +
                "Sofía era una tortuga sabia y tranquila. Siempre se tomaba su tiempo para observar y reflexionar sobre el mundo que la rodeaba. Al conocer a Damián, se dieron cuenta de que tenían personalidades muy diferentes. Damián buscaba constantemente la emoción y la diversión, mientras que Sofía prefería la calma y la serenidad.\n" +
                "Curiosos por conocer más sobre sus respectivas formas de vida, Damián y Sofía decidieron pasar tiempo juntos y aprender uno del otro. Damián mostró a Sofía cómo disfrutar de la diversión y la alegría en el océano, mientras que Sofía enseñó a Damián la importancia de la paciencia y la tranquilidad.\n" +
                "Un día, mientras nadaban juntos, se encontraron con un grupo de peces en problemas. Los peces estaban atrapados en una red de pesca abandonada y necesitaban ayuda. Damián, impulsado por su naturaleza valiente, quería actuar rápidamente y liberar a los peces lo antes posible. Pero Sofía, con su enfoque tranquilo, les aconsejó que se tomaran un momento para pensar en la mejor estrategia.\n" +
                "Después de un momento de reflexión, Damián y Sofía trabajaron juntos para liberar suavemente a los peces de la red. Sofía guiaba a Damián con su sabiduría y Damián aplicaba su energía para realizar las acciones necesarias. Juntos, lograron salvar a todos los peces y devolverlos a la libertad del océano.\n" +
                "Al finalizar la tarea, Damián miró a Sofía con admiración y agradecimiento. Le dijo: \"Sofía, gracias por mostrarme la importancia de la paciencia y la reflexión. Aprendí que, a veces, la calma y la serenidad son tan valiosas como la energía y la acción\". Sofía sonrió y respondió: \"Y yo, Damián, aprendí que también es necesario salir de nuestra zona de confort y disfrutar de la emoción y la alegría que traes al océano\".\n" +
                "Desde ese día, Damián y Sofía se convirtieron en amigos inseparables. Juntos, demostraron que las diferencias pueden ser una fuente de enriquecimiento y que, al combinar las fortalezas de cada uno, podemos lograr cosas asombrosas.\n",R.drawable.portadaleon));
        storyList3.add(new Story("Cuento 13","dsadsadasdas",R.drawable.portadaleon));
        storyList3.add(new Story("Cuento 14","dsadsadasdas",R.drawable.portadaleon));
        storyList3.add(new Story("Cuento 15","dsadsadasdas",R.drawable.portadaleon));
        storyList3.add(new Story("Cuento 16","dsadsadasdas",R.drawable.portadaleon));
        storyList3.add(new Story("Cuento 17","dsadsadasdas",R.drawable.portadaleon));





        linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        storyAdapter = new StoryAdapter(storyList3);
        recyclerView3.setLayoutManager(linearLayoutManager);
        recyclerView3.setAdapter(storyAdapter);


       showRandomItem1();
       showRandomItem2();
       showRandomItem3();

    }

    private void showRandomItem1() {
        Random random = new Random();
        int randomIndex = random.nextInt(storyList.size());

        Story recommendedItem = storyList.get(randomIndex);
        listaRecom.add(recommendedItem);

    }

    private void showRandomItem2() {
        Random random = new Random();
        int randomIndex = random.nextInt(storyList2.size());

        Story recommendedItem = storyList2.get(randomIndex);
        listaRecom.add(recommendedItem);
    }

    private void showRandomItem3() {
        Random random = new Random();
        int randomIndex = random.nextInt(storyList3.size());

        Story recommendedItem = storyList3.get(randomIndex);
        listaRecom.add(recommendedItem);
    }

    //recom
    private void startAutoChange() {
        runnable = new Runnable() {
            @Override
            public void run() {
                // Cambia al siguiente objeto
                currentIndex = (currentIndex + 1) % listaRecom.size();

                // Actualiza la vista con el objeto actual
                Story obj1 = listaRecom.get(currentIndex);
                imageRecom.setImageResource(obj1.getPortada());
                textRecom.setText(obj1.getTitle());

                // Programa el siguiente cambio después de 5 segundos
                handler.postDelayed(this, 4000);
            }
        };

        // Inicia el primer cambio después de 5 segundos
        handler.postDelayed(runnable, 0000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Detiene el cambio automático de objetos al destruir la actividad
        handler.removeCallbacks(runnable);
    }

//final recom





    private class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

        private List<Story> stories;

        public StoryAdapter(List<Story> stories) {
            this.stories = stories;
        }

        @NonNull
        @Override
        public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_aventura_item, parent, false);
            return new StoryViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
            Story story = stories.get(position);
            holder.titleTextView.setText(story.getTitle());
            holder.portada.setImageResource(story.getPortada());

        }

        @Override
        public int getItemCount() {
            return stories.size();
        }

        public class StoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            private TextView titleTextView;
            private ImageView portada;

            public StoryViewHolder(@NonNull View itemView) {
                super(itemView);
                titleTextView = itemView.findViewById(R.id.titleTextView);
                portada = itemView.findViewById(R.id.portada);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                // Acción a realizar al hacer clic en un cuento
                int position = getAdapterPosition();
                String BOOK_CONTENT = null;
                if (position != RecyclerView.NO_POSITION) {
                    Story story = stories.get(position);
                    BOOK_CONTENT = story.getText();

                }


                BookFragment bookFragment = BookFragment.newInstance(BOOK_CONTENT);
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainer, bookFragment);
                transaction.commit();
                frame.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);
                recyclerView2.setVisibility(View.GONE);
                recyclerView3.setVisibility(View.GONE);
                recomLayout.setVisibility(View.GONE);






            }
        }
    }

    }