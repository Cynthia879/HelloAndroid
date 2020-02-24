package mg.studio.android.survey;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Que11Activity extends AppCompatActivity {

    Button que11Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);

        que11Next=findViewById(R.id.btn_ques11_next);
        que11Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Que11Activity.this, Que12Activity.class);
                startActivity(intent);
            }
        });
    }
}