package com.tjnuman.meaw.firstAid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.tjnuman.meaw.R;

import java.util.ArrayList;

public class FirstaidActivity extends AppCompatActivity {
    private RecyclerView  recyclerView;
    private RecyclerAdapter tasksAdapter;
    private reAdapter adapter;
    private Toolbar toolbar;
    String[] titlearray, descriptionarray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid);

//        tasksRecyclerView = findViewById(R.id.itemsrecycler);
//        titlearray = getResources().getStringArray(R.array.titlearray);
//        descriptionarray = getResources().getStringArray(R.array.detailarray);
//        tasksAdapter = new RecyclerAdapter(this, titlearray, descriptionarray);
//        tasksRecyclerView.setAdapter(tasksAdapter);
//        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));



        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("search your cats injury here");
        ArrayList<FirstAidModel> arrayList = new ArrayList<>();


        arrayList.add(new FirstAidModel("Road Accident","Prevention is better than cure so keep your cat in at night, as this is when most road accidents occur. If you find a cat involved in a road accident, take them to the vet, even if the cat appears to be unhurt. There may be internal injuries that are not immediately obvious. Pick up the cat carefully as described above, keeping them warm, and place them in a box for transportation to the surgery."));
        arrayList.add(new FirstAidModel("Falls","Falls can cause severe injuries. If you live in a flat, open windows should be covered with screens. Do not let your cat out onto an unprotected balcony. If your cat falls from a height, take the animal to the vet for a check-up. "));
        arrayList.add(new FirstAidModel("Bleeding"," Keep the cat quiet and calm. Put on a tight bandage. Improvise with strips of towel or clothing if necessary. If blood is seeping through, apply another tight layer. Only use a tourniquet as a last resort. If you cannot put on a bandage, press a pad firmly onto the wound and hold it in place. Go to the vet straight away.\n" +
                " If you have bandaging materials, layer these as follows. Firstly, place a non-stick dressing on the wound and cover with swabs or a cotton bandage. Then place a layer of cotton wool over this and cover again with cotton bandage. Secure this top layer of bandage to the hair with surgical tape, and cover all of it with adhesive bandage or tape. Do not stick Elastoplast to the hair and never leave a bandage on for more than 24 hours. "));
        arrayList.add(new FirstAidModel(" Tail injuries","See your vet if your cat’s tail is limp, has been trapped in a door, or pulled hard. Such injuries can cause serious bladder problems."));
        arrayList.add(new FirstAidModel("Broken bones","Deal with any serious bleeding but do not apply a splint – it is painful, and can cause the bone to break through the skin. Confine the patient to a well padded carrier for transportation to the vet."));
        arrayList.add(new FirstAidModel("Burns and scalds","Run cold water over these for at least five minutes then contact your vet. Do not apply ointments or creams, although you can cover the wound with a saline-soaked gauze pad while awaiting treatment. Remember to keep the patient warm. "));
        arrayList.add(new FirstAidModel(" Poisoning","Try to find packaging from the substance swallowed and have it with you when you phone the vet. If chewing of plants is suspected, try to find out the name of the plant, and cut a sample. Call the vet immediately and do not make your cat vomit unless the vet says to do so. Take any packaging or plant cuttings with you to the vet. "));
        arrayList.add(new FirstAidModel("Coat contamination","If a substance such as paint or tar has got onto your cat’s coat or paws, prevent your cat licking it, as the substance may be toxic. Use an Elizabethan collar (obtainable from vets) if you have one. You may be able to clip off the small areas of affected hair, but never use turpentine or paint remover on your cat. Contact the vet, as bathing may be necessary. Sedatives may be required to do this thoroughly."));
        arrayList.add(new FirstAidModel("Fits","If your cat is having a fit, do not try to hold or comfort the animal, as this provides stimulation, which may prolong the fit. Darken the room and reduce noise. Remove items which may cause injury, especially anything electrical. Pad your furniture with cushions and call the vet. "));
        arrayList.add(new FirstAidModel(" Fights"," If your cat is wounded after a fight, but seems otherwise well, make a routine appointment with the vet as antibiotics are usually needed. Fight-wounds are often not detected immediately. The first indication may be an oozing smelly wound from a burst abscess. In this case contact your vet."));
        arrayList.add(new FirstAidModel("Eye injuries","Do not allow rubbing of a sore eye with the paws – use an Elizabethan collar. Contact the vet immediately if there has been trauma, if your cat has a closed or discharging eye, or for any sudden eye problem. If chemicals have entered the cat’s eye, flush out with water repeatedly (preferably from an eye bottle) and call the vet."));
        arrayList.add(new FirstAidModel("Drowning","Never put yourself at risk attempting to rescue a drowning cat. Wipe away material from the mouth and nose and hold the cat upside down by the hindlegs until any water has drained out. Give resuscitation if breathing has stopped. Even if your pet seems to recover, always see the vet, as complications afterwards are common."));
        arrayList.add(new FirstAidModel("Electric shock"," If a high voltage, non-domestic (for example, power lines) supply is involved, do not approach. Call the police.\n" +
                " In the home, turn off power first. If this is impossible, you may be able to use a dry non-metallic item, like a broom handle, to push a cat away from the power source. If breathing has stopped, give resuscitation. Call the vet immediately."));
        arrayList.add(new FirstAidModel("Heatstroke","Heatstroke is rare but can happen if a cat has been trapped somewhere such as a greenhouse on a hot day. Affected animals are weak, panting, dribbling and distressed. Put the cat somewhere cool, preferably in a draught. Wet their coat with tepid water (not cold water as this contracts the blood vessels in the skin and slows heat loss) and phone the vet. You may offer the cat a small amount of water."));
        arrayList.add(new FirstAidModel("Stings","Pull out the sting by pressing below the poison sac, then bathe the area in water or either a solution of bicarbonate of soda for a bee sting or diluted vinegar for that of a wasp. Soothe with ice. If the sting is in the mouth or throat, contact the vet as it may swell and interfere with breathing. "));

        recyclerView = findViewById(R.id.itemsrecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new reAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search_menu,menu);
        MenuItem menuItem=menu.findItem(R.id.search_id);
        android.widget.SearchView searchView=(android.widget.SearchView) MenuItemCompat.getActionView(menuItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        return true;
    }
}