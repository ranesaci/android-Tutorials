package tutorial.android.sachin4droid.androidtutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import tutorial.android.sachin4droid.androidtutorials.adapter.CustomListAdapter;
import tutorial.android.sachin4droid.androidtutorials.bean.Animal;

public class CustomListActivity extends AppCompatActivity {

    ListView customListActivityListView;
    List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        customListActivityListView = (ListView) findViewById(R.id.customListActivityListView);

        animals =  createAnimalList();
        CustomListAdapter customListAdapter = new CustomListAdapter(this, R.layout.custom_list_item,animals);
        customListActivityListView.setAdapter(customListAdapter);

    }

    private List<Animal> createAnimalList() {
        List<Animal> animalList = new ArrayList<>();

        Animal cat = new Animal("cat", "cat.jpg");
        Animal dog = new Animal("dog", "dog.jpg");
        Animal monkey = new Animal("monkey", "monkey.jpg");
        Animal tiger = new Animal("tiger", "tiger.jpg");

        animalList.add(cat);
        animalList.add(dog);
        animalList.add(monkey);
        animalList.add(tiger);

        return animalList;



    }
}
