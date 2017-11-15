package com.example.martin.trialnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView RV_note;
    ImageButton IB_add;
    TextView text1;
    TextView text2;
    ArrayList<Note> listNote;
    NoteAdapter foodAdapter;
    public void AddNote(String a, String b){

        listNote.add(new Note(a,b));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNote = new ArrayList<>();
        RV_note = (RecyclerView)  findViewById(R.id.RV_note);
        IB_add = (ImageButton) findViewById(R.id.IB_add);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        listNote.add(new Note("hello","no"));
        AddNote("ONE","TWO");
         foodAdapter = new NoteAdapter(listNote);
        AddNote("ONE","TWO");
        RV_note.setAdapter(foodAdapter);
        RV_note.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        AddNote("ONE","TWO");
        IB_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,AddNote.class);
                Bundle extras = new Bundle();
                extras.putString("EXTRA_USERNAME","my_username");
                extras.putString("EXTRA_PASSWORD","my_password");
                intent.putExtras(extras);
                startActivityForResult(intent,2);
          //      startActivity(new Intent(this, AddNote.class));

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {

            Intent intent = getIntent();
            Bundle bundle2 = intent.getExtras();
            Bundle extras = data.getExtras();
            String username_string = extras.getString("EXTRA_USERNAME");
            String password_string = extras.getString("EXTRA_PASSWORD");

            listNote.add(new Note(username_string,password_string));

            String a = Integer.toString(listNote.size());

           foodAdapter = new NoteAdapter(listNote);
            RV_note.setAdapter(foodAdapter);
        }

    }
}
