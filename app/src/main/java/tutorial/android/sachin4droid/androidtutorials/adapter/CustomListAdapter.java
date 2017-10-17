package tutorial.android.sachin4droid.androidtutorials.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import tutorial.android.sachin4droid.androidtutorials.R;
import tutorial.android.sachin4droid.androidtutorials.bean.Animal;

/**
 * Created by sachin on 17/10/17.
 */

public class CustomListAdapter extends ArrayAdapter<Animal>{
    Context context;
    int resource;
    List<Animal> animals;

    public CustomListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Animal> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.animals=objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(resource, null);
        ImageView image = v.findViewById(R.id.animalmageView);
        TextView animalname = v.findViewById(R.id.animalNameTextView);

        Animal animal = animals.get(position);

        try {
            InputStream is = context.getAssets().open(animal.getAnimalImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            image.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        animalname.setText(animal.getAnimalName());




        return v;

    }
}
