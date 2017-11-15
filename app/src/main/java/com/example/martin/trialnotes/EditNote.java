package com.example.martin.trialnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.martin.trialnotes.R.id.EDIT_TITLE;

public class EditNote extends AppCompatActivity {
    Button IB_save;
    Button IB_cancel;
    Button IB_delete;
    EditText ET_NOTE;
    EditText ET_TITLE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
        IB_save = (Button) findViewById(R.id.IB_save);
        IB_cancel = (Button) findViewById(R.id.IB_cancel);
        IB_delete = (Button) findViewById(R.id.IB_delete);
        ET_NOTE = (EditText) findViewById(R.id.EDIT_NOTE);
        ET_TITLE = (EditText) findViewById(EDIT_TITLE);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String username_string = extras.getString("EXTRA_USERNAME");
        String password_string = extras.getString("EXTRA_PASSWORD");
        ET_TITLE.setText( username_string, TextView.BufferType.EDITABLE);
        ET_NOTE.setText(password_string, TextView.BufferType.EDITABLE);

        IB_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditNote.this,MainActivity.class);
                startActivity(intent);
                //      startActivity(new Intent(this, AddNote.class));

            }
        });
        IB_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditNote.this,MainActivity.class);
                startActivity(intent);
                //      startActivity(new Intent(this, AddNote.class));

            }
        });
        IB_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditNote.this,MainActivity.class);
                startActivity(intent);
                //      startActivity(new Intent(this, AddNote.class));

            }
        });

    }
}
