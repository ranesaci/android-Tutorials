package tutorial.android.sachin4droid.androidtutorials.bean;

/**
 * Created by sachin on 17/10/17.
 */

public class Animal {

    private String animalName;
    private String animalImage;

    public Animal(){}

    public Animal(String animalName,String animalImage){
        this.animalName=animalName;
        this.animalImage=animalImage;

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalImage() {
        return animalImage;
    }

    public void setAnimalImage(String animalImage) {
        this.animalImage = animalImage;
    }
}
