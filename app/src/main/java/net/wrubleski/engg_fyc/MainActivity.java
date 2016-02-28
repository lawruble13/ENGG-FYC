package net.wrubleski.engg_fyc;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] course_names = new String[] {"CHEM 209", "ENGG 200", "ENGG 201", "ENGG 202",
                "ENGG 225", "ENGG 233", "MATH 211", "MATH 275", "MATH 277", "PHYS 259"};
        ListAdapter adapter = new CourseAdapter(this,course_names);
        ListView listView = (ListView) findViewById(R.id.courseList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (parent.getItemAtPosition(position).toString()) {
                    case "CHEM 209":
                        Intent intent = new Intent(getApplicationContext(), Chem209.class);
                        startActivity(intent);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "This feature is under development. Sorry!", Toast.LENGTH_LONG).show();
                        break;
                }

            }
        });
    }

    class CourseAdapter extends ArrayAdapter<String>{
        public CourseAdapter(Context context, String[] values){
            super(context, R.layout.course_list_item,values);
        }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View view = inflater.inflate(R.layout.course_list_item, parent, false);

            String text = getItem(position);
            TextView textView = (TextView) view.findViewById(R.id.course_list_item);
            textView.setText(text);

            switch(text){
                case "CHEM 209":
                    break;
                case "ENGG 200":
                case "ENGG 201":
                case "ENGG 202":
                case "ENGG 225":
                case "ENGG 233":
                case "MATH 211":
                case "MATH 275":
                case "MATH 277":
                case "PHYS 259": textView.setTypeface(Typeface.DEFAULT,Typeface.BOLD_ITALIC);
                    break;
            }

            return view;
        };
    }
}