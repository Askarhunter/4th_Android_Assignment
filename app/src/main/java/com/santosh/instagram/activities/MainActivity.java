package com.santosh.instagram.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.santosh.instagram.models.PostModel;
import com.santosh.instagram.R;
import com.santosh.instagram.models.StoryModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView btmNav;
//    Fragment selectedFragment = null;

    public static List<PostModel> listPosts = new ArrayList<>();
    public static List<StoryModel> listStories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btmNav = findViewById(R.id.nav_view);

        getSupportActionBar().hide();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_add, R.id.navigation_liked, R.id.navigation_profile
        ).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(btmNav, navController);


        listPosts.add(new PostModel("1","Sandeep Lamichhane", "Cricket bowler...!!", R.drawable.post5, R.drawable.post6));
        listPosts.add(new PostModel("2","Korean", "Handsome Actor...!!", R.drawable.post7, R.drawable.post8));
        listPosts.add(new PostModel("3","Askar", "Angryness...!!", R.drawable.post, R.drawable.profilepic));
        listPosts.add(new PostModel("4","Shristy Shrestha", "Nepali beautiful Actress...!!", R.drawable.profilepic2, R.drawable.profilepic2));


        listStories.add(new StoryModel("1","One Piece", R.drawable.post1, 0));
        listStories.add(new StoryModel("Gyanendra Malla", R.drawable.post3));
        listStories.add(new StoryModel("1","Beautiful", R.drawable.post2, 0));
        listStories.add(new StoryModel("Lee Min Ho", R.drawable.post7));
//        listStories.add(new StoryModel("2","Add", R.drawable.add, 0));
//        listStories.add(new StoryModel("3","Aryan Rajbhandari", R.drawable.home, 0));
//        setUpStories();
    }




}
